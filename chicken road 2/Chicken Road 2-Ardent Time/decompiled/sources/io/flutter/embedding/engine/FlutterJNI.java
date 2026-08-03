package io.flutter.embedding.engine;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public class FlutterJNI {
    private static final java.lang.String TAG = "FlutterJNI";
    private static Q0.k asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static java.lang.String vmServiceUri;
    private Q0.j accessibilityDelegate;
    private S0.a deferredComponentManager;
    private b1.C0094a localizationPlugin;
    private java.lang.Long nativeShellHolderId;
    private R0.j platformMessageHandler;
    private io.flutter.plugin.platform.k platformViewsController;
    private io.flutter.plugin.platform.j platformViewsController2;
    private Z0.m settingsChannel;
    private java.util.concurrent.locks.ReentrantReadWriteLock shellHolderLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
    private final java.util.Set<Q0.b> engineLifecycleListeners = new java.util.concurrent.CopyOnWriteArraySet();
    private final java.util.Set<io.flutter.embedding.engine.renderer.i> flutterUiDisplayListeners = new java.util.concurrent.CopyOnWriteArraySet();
    private final java.util.Set<io.flutter.embedding.engine.renderer.j> flutterUiResizeListeners = new java.util.concurrent.CopyOnWriteArraySet();
    private final android.os.Looper mainLooper = android.os.Looper.getMainLooper();

    private static void asyncWaitForVsync(long j2) {
        Q0.k kVar = asyncWaitForVsyncDelegate;
        if (kVar == null) {
            throw new java.lang.IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        io.flutter.view.b bVar = (io.flutter.view.b) kVar;
        bVar.getClass();
        android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
        M1.l lVar = (M1.l) bVar.f7796a;
        io.flutter.view.r rVar = (io.flutter.view.r) lVar.f1089c;
        if (rVar != null) {
            rVar.f7920a = j2;
            lVar.f1089c = null;
        } else {
            rVar = new io.flutter.view.r(lVar, j2);
        }
        choreographer.postFrameCallback(rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static android.graphics.Bitmap decodeImage(java.nio.ByteBuffer byteBuffer, long j2) {
        T0.b bVar;
        C.j jVar = 0;
        jVar = 0;
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return null;
        }
        Q0.i iVar = new Q0.i(j2);
        T0.d dVar = new T0.d();
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        byteBuffer.rewind();
        int i2 = 1;
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            android.graphics.BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
            dVar.f1713d = options.outMimeType;
            dVar.f1715f = options.outHeight;
            dVar.f1716g = options.outWidth;
        } catch (java.lang.Exception e2) {
            android.util.Log.e("BitmapMetadataReader", "Failed to decode image for mime type", e2);
        }
        if ("image/heif".equals(dVar.f1713d)) {
            try {
                T0.c cVar = new T0.c(bArr);
                android.media.MediaExtractor mediaExtractor = new android.media.MediaExtractor();
                mediaExtractor.setDataSource(cVar);
                u0.AbstractC0995a.w(dVar, mediaExtractor);
            } catch (java.lang.Exception e3) {
                android.util.Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e3);
            }
            nativeImageHeaderCallback(iVar.f1612a, dVar.f1710a, dVar.f1711b);
            try {
                java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
                try {
                    J.g gVar = new J.g(byteArrayInputStream);
                    J.c c2 = gVar.c("Orientation");
                    if (c2 != null) {
                        try {
                            i2 = c2.e(gVar.f922f);
                        } catch (java.lang.NumberFormatException unused) {
                        }
                    }
                    dVar.f1714e = i2;
                    byteArrayInputStream.close();
                } finally {
                }
            } catch (java.io.IOException e4) {
                android.util.Log.e("ExifMetadataReader", "Failed to read EXIF metadata", e4);
            }
        }
        if ("image/heif".equals(dVar.f1713d)) {
            int i3 = android.os.Build.VERSION.SDK_INT;
            if (i3 == 36) {
                bVar = new T0.b(jVar, 0);
            } else if (i3 < 36) {
                bVar = new T0.b(jVar, 1);
            }
            jVar = bVar;
        }
        if (jVar == 0) {
            jVar = new C.j(22, iVar);
        }
        return jVar.k(byteBuffer, dVar);
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new java.lang.RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new java.lang.RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (android.os.Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new java.lang.RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + java.lang.Thread.currentThread().getName());
    }

    public static java.lang.String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i2, java.nio.ByteBuffer byteBuffer) {
        a1.e eVar;
        R0.j jVar = this.platformMessageHandler;
        if (jVar == null || (eVar = (a1.e) ((R0.i) jVar).f1682f.remove(java.lang.Integer.valueOf(i2))) == null) {
            return;
        }
        try {
            eVar.a(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (java.lang.Error e2) {
            java.lang.Thread currentThread = java.lang.Thread.currentThread();
            if (currentThread.getUncaughtExceptionHandler() == null) {
                throw e2;
            }
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e2);
        } catch (java.lang.Exception e3) {
            android.util.Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadLibrary$0(java.lang.String str) {
    }

    private native long nativeAttach(io.flutter.embedding.engine.FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j2);

    private native void nativeDeferredComponentInstallFailure(int i2, java.lang.String str, boolean z2);

    private native void nativeDestroy(long j2);

    private native void nativeDispatchEmptyPlatformMessage(long j2, java.lang.String str, int i2);

    private native void nativeDispatchPlatformMessage(long j2, java.lang.String str, java.nio.ByteBuffer byteBuffer, int i2, int i3);

    private native void nativeDispatchPointerDataPacket(long j2, java.nio.ByteBuffer byteBuffer, int i2);

    private native void nativeDispatchSemanticsAction(long j2, int i2, int i3, java.nio.ByteBuffer byteBuffer, int i4);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i2);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i2);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i2);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i2);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i2);

    private native android.graphics.Bitmap nativeGetBitmap(long j2);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j2, int i2, int i3);

    private static native void nativeInit(android.content.Context context, java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.lang.String str3, long j2, int i2);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j2, int i2);

    private native void nativeInvokePlatformMessageResponseCallback(long j2, int i2, java.nio.ByteBuffer byteBuffer, int i3);

    private native boolean nativeIsSurfaceControlEnabled(long j2);

    private native void nativeLoadDartDeferredLibrary(long j2, int i2, java.lang.String[] strArr);

    @java.lang.Deprecated
    public static native io.flutter.view.FlutterCallbackInformation nativeLookupCallbackInformation(long j2);

    private native void nativeMarkTextureFrameAvailable(long j2, long j3);

    private native void nativeNotifyLowMemoryWarning(long j2);

    private native void nativeOnVsync(long j2, long j3, long j4);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j2, long j3, java.lang.ref.WeakReference<io.flutter.view.TextureRegistry$ImageConsumer> weakReference, boolean z2);

    private native void nativeRegisterTexture(long j2, long j3, java.lang.ref.WeakReference<io.flutter.embedding.engine.renderer.SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j2, java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.res.AssetManager assetManager, java.util.List<java.lang.String> list, long j3);

    private native void nativeScheduleFrame(long j2);

    private native void nativeSetAccessibilityFeatures(long j2, int i2);

    private native void nativeSetSemanticsEnabled(long j2, boolean z2);

    private native void nativeSetViewportMetrics(long j2, float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24);

    private native io.flutter.embedding.engine.FlutterJNI nativeSpawn(long j2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> list, long j3);

    private native void nativeSurfaceChanged(long j2, int i2, int i3);

    private native void nativeSurfaceCreated(long j2, android.view.Surface surface);

    private native void nativeSurfaceDestroyed(long j2);

    private native void nativeSurfaceWindowChanged(long j2, android.view.Surface surface);

    private native void nativeUnregisterTexture(long j2, long j3);

    private native void nativeUpdateDisplayMetrics(long j2);

    private native void nativeUpdateJavaAssetManager(long j2, android.content.res.AssetManager assetManager, java.lang.String str);

    private native void nativeUpdateRefreshRate(float f2);

    private void onPreEngineRestart() {
        java.util.Iterator<Q0.b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private void setApplicationLocale(java.lang.String str) {
        ensureRunningOnMainThread();
        Q0.j jVar = this.accessibilityDelegate;
        if (jVar != null) {
            ((io.flutter.view.h) ((io.flutter.view.b) jVar).f7796a).f7895l = str;
        }
    }

    private void updateCustomAccessibilityActions(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr) {
        ensureRunningOnMainThread();
        Q0.j jVar = this.accessibilityDelegate;
        if (jVar != null) {
            byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            io.flutter.view.h hVar = (io.flutter.view.h) ((io.flutter.view.b) jVar).f7796a;
            hVar.getClass();
            while (byteBuffer.hasRemaining()) {
                io.flutter.view.f a2 = hVar.a(byteBuffer.getInt());
                a2.f7827c = byteBuffer.getInt();
                a2.f7828d = io.flutter.view.h.c(byteBuffer, strArr);
                a2.f7829e = io.flutter.view.h.c(byteBuffer, strArr);
            }
        }
    }

    private void updateSemantics(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr, java.nio.ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        Q0.j jVar = this.accessibilityDelegate;
        if (jVar != null) {
            ((io.flutter.view.b) jVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(Q0.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.i iVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(iVar);
    }

    public void addResizingFlutterUiListener(io.flutter.embedding.engine.renderer.j jVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.add(jVar);
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void applyTransactions() {
        io.flutter.plugin.platform.j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new java.lang.RuntimeException("");
        }
        jVar.getClass();
        android.view.SurfaceControl.Transaction d2 = io.flutter.plugin.platform.i.d();
        int i2 = 0;
        while (true) {
            java.util.ArrayList arrayList = jVar.f7760i;
            if (i2 >= arrayList.size()) {
                d2.apply();
                arrayList.clear();
                return;
            } else {
                d2 = d2.merge(P0.AbstractC0051i.g(arrayList.get(i2)));
                i2++;
            }
        }
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = java.lang.Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j2) {
        nativeCleanupMessageData(j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f9, code lost:
    
        if (r10 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012c, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0134, code lost:
    
        if (r4.hasNext() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0136, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0148, code lost:
    
        if (r3.getLanguage().equals(r5.toLanguageTag()) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014b, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0153, code lost:
    
        if (r4.hasNext() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0155, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0167, code lost:
    
        if (r3.getLanguage().equals(r5.getLanguage()) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016a, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String[] computePlatformResolvedLocale(java.lang.String[] strArr) {
        java.util.Locale locale;
        java.util.Locale locale2;
        if (this.localizationPlugin == null) {
            return new java.lang.String[0];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2 += 3) {
            java.lang.String str = strArr[i2];
            java.lang.String str2 = strArr[i2 + 1];
            java.lang.String str3 = strArr[i2 + 2];
            java.util.Locale.Builder builder = new java.util.Locale.Builder();
            if (!str.isEmpty()) {
                builder.setLanguage(str);
            }
            if (!str2.isEmpty()) {
                builder.setRegion(str2);
            }
            if (!str3.isEmpty()) {
                builder.setScript(str3);
            }
            arrayList.add(builder.build());
        }
        b1.C0094a c0094a = this.localizationPlugin;
        c0094a.getClass();
        if (arrayList.isEmpty()) {
            locale2 = null;
        } else {
            int i3 = android.os.Build.VERSION.SDK_INT;
            P0.AbstractActivityC0047e abstractActivityC0047e = c0094a.f2531b;
            if (i3 >= 26) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                android.os.LocaleList locales = abstractActivityC0047e.getResources().getConfiguration().getLocales();
                int size = locales.size();
                for (int i4 = 0; i4 < size; i4++) {
                    java.util.Locale locale3 = locales.get(i4);
                    java.lang.String language = locale3.getLanguage();
                    if (!locale3.getScript().isEmpty()) {
                        language = language + "-" + locale3.getScript();
                    }
                    if (!locale3.getCountry().isEmpty()) {
                        language = language + "-" + locale3.getCountry();
                    }
                    arrayList2.add(P0.AbstractC0043a.l(language));
                    P0.AbstractC0043a.n();
                    arrayList2.add(P0.AbstractC0043a.l(locale3.getLanguage()));
                    P0.AbstractC0043a.n();
                    arrayList2.add(P0.AbstractC0043a.l(locale3.getLanguage() + "-*"));
                }
                locale2 = java.util.Locale.lookup(arrayList2, arrayList);
            } else {
                android.os.LocaleList locales2 = abstractActivityC0047e.getResources().getConfiguration().getLocales();
                int i5 = 0;
                loop2: while (i5 < locales2.size()) {
                    java.util.Locale locale4 = locales2.get(i5);
                    java.util.Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        locale = (java.util.Locale) it.next();
                        if (locale4.equals(locale)) {
                            break loop2;
                        }
                    }
                    locale2 = locale;
                }
                locale2 = (java.util.Locale) arrayList.get(0);
            }
        }
        return locale2 == null ? new java.lang.String[0] : new java.lang.String[]{locale2.getLanguage(), locale2.getCountry(), locale2.getScript()};
    }

    public io.flutter.embedding.engine.FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        io.flutter.plugin.platform.b bVar = new io.flutter.plugin.platform.b(kVar.f7768c.getContext(), kVar.f7768c.getWidth(), kVar.f7768c.getHeight(), 2);
        bVar.f7741h = kVar.f7773h;
        int i2 = kVar.f7780o;
        kVar.f7780o = i2 + 1;
        kVar.f7778m.put(i2, bVar);
        return new io.flutter.embedding.engine.FlutterOverlaySurface(i2, bVar.getSurface());
    }

    @android.annotation.SuppressLint({"NewApi"})
    public io.flutter.embedding.engine.FlutterOverlaySurface createOverlaySurface2() {
        android.view.SurfaceControl build;
        android.view.AttachedSurfaceControl rootSurfaceControl;
        android.view.SurfaceControl.Transaction buildReparentTransaction;
        io.flutter.plugin.platform.j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (jVar.f7762k == null) {
            android.view.SurfaceControl.Builder c2 = io.flutter.plugin.platform.i.c();
            c2.setBufferSize(jVar.f7754c.getWidth(), jVar.f7754c.getHeight());
            c2.setFormat(1);
            c2.setName("Flutter Overlay Surface");
            c2.setOpaque(false);
            c2.setHidden(false);
            build = c2.build();
            rootSurfaceControl = jVar.f7754c.getRootSurfaceControl();
            buildReparentTransaction = rootSurfaceControl.buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
            buildReparentTransaction.apply();
            jVar.f7762k = io.flutter.plugin.platform.i.b(build);
            jVar.f7763l = build;
        }
        return new io.flutter.embedding.engine.FlutterOverlaySurface(0, jVar.f7762k);
    }

    @android.annotation.SuppressLint({"NewApi"})
    public android.view.SurfaceControl.Transaction createTransaction() {
        io.flutter.plugin.platform.j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new java.lang.RuntimeException("");
        }
        android.view.SurfaceControl.Transaction d2 = io.flutter.plugin.platform.i.d();
        jVar.f7760i.add(d2);
        return d2;
    }

    public void deferredComponentInstallFailure(int i2, java.lang.String str, boolean z2) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i2, str, z2);
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        android.view.Surface surface = jVar.f7762k;
        if (surface != null) {
            surface.release();
            jVar.f7762k = null;
            jVar.f7763l = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        kVar.e();
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(java.lang.String str, int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i2);
            return;
        }
        android.util.Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i2);
    }

    public void dispatchPlatformMessage(java.lang.String str, java.nio.ByteBuffer byteBuffer, int i2, int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i2, i3);
            return;
        }
        android.util.Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i3);
    }

    public void dispatchPointerDataPacket(java.nio.ByteBuffer byteBuffer, int i2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i2);
    }

    public void dispatchSemanticsAction(int i2, io.flutter.view.e eVar) {
        dispatchSemanticsAction(i2, eVar, null);
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void endFrame2() {
        android.view.AttachedSurfaceControl rootSurfaceControl;
        io.flutter.plugin.platform.j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new java.lang.RuntimeException("");
        }
        android.view.SurfaceControl.Transaction d2 = io.flutter.plugin.platform.i.d();
        int i2 = 0;
        while (true) {
            java.util.ArrayList arrayList = jVar.f7761j;
            if (i2 >= arrayList.size()) {
                arrayList.clear();
                jVar.f7754c.invalidate();
                rootSurfaceControl = jVar.f7754c.getRootSurfaceControl();
                rootSurfaceControl.applyTransactionOnDraw(d2);
                return;
            }
            d2 = d2.merge(P0.AbstractC0051i.g(arrayList.get(i2)));
            i2++;
        }
    }

    public android.graphics.Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float getScaledFontSize(float f2, int i2) {
        Z0.l lVar;
        Z0.m mVar = this.settingsChannel;
        android.util.DisplayMetrics displayMetrics = null;
        if (mVar != null) {
            I0.b bVar = mVar.f1919a;
            Z0.l lVar2 = (Z0.l) bVar.f658c;
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) bVar.f657b;
            if (lVar2 == null) {
                bVar.f658c = (Z0.l) concurrentLinkedQueue.poll();
            }
            while (true) {
                lVar = (Z0.l) bVar.f658c;
                if (lVar == null || lVar.f1917a >= i2) {
                    break;
                }
                bVar.f658c = (Z0.l) concurrentLinkedQueue.poll();
            }
            if (lVar == null) {
                android.util.Log.e("SettingsChannel", "Cannot find config with generation: " + i2 + ", after exhausting the queue.");
            } else {
                if (lVar.f1917a != i2) {
                    android.util.Log.e("SettingsChannel", "Cannot find config with generation: " + i2 + ", the oldest config is now: " + ((Z0.l) bVar.f658c).f1917a);
                }
                if (lVar != null) {
                    displayMetrics = lVar.f1918b;
                }
            }
            lVar = null;
            if (lVar != null) {
            }
        }
        if (displayMetrics != null) {
            return android.util.TypedValue.applyDimension(2, f2, displayMetrics) / displayMetrics.density;
        }
        android.util.Log.e(TAG, "getScaledFontSize called with configurationId " + i2 + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(java.lang.String str, java.nio.ByteBuffer byteBuffer, int i2, long j2) {
        R0.f fVar;
        boolean z2;
        R0.j jVar = this.platformMessageHandler;
        if (jVar == null) {
            nativeCleanupMessageData(j2);
            return;
        }
        R0.i iVar = (R0.i) jVar;
        synchronized (iVar.f1680d) {
            try {
                fVar = (R0.f) iVar.f1678b.get(str);
                z2 = iVar.f1681e.get() && fVar == null;
                if (z2) {
                    if (!iVar.f1679c.containsKey(str)) {
                        iVar.f1679c.put(str, new java.util.LinkedList());
                    }
                    ((java.util.List) iVar.f1679c.get(str)).add(new R0.d(j2, byteBuffer, i2));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (z2) {
            return;
        }
        iVar.a(str, fVar, byteBuffer, i2, j2);
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void hideOverlaySurface2() {
        io.flutter.plugin.platform.j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (jVar.f7763l == null) {
            return;
        }
        android.view.SurfaceControl.Transaction d2 = io.flutter.plugin.platform.i.d();
        jVar.f7760i.add(d2);
        d2.setVisibility(jVar.f7763l, false);
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void hidePlatformView2(int i2) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to hide a platform view");
        }
        B1.a.m(jVar.f7758g.get(i2));
    }

    public void init(android.content.Context context, java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.lang.String str3, long j2, int i2) {
        if (initCalled) {
            android.util.Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j2, i2);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i2) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i2);
            } else {
                android.util.Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i2);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (java.lang.Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    public void invokePlatformMessageResponseCallback(int i2, java.nio.ByteBuffer byteBuffer, int i3) {
        if (!byteBuffer.isDirect()) {
            throw new java.lang.IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i2, byteBuffer, i3);
            } else {
                android.util.Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i2);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (java.lang.Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i2) {
        return nativeFlutterTextUtilsIsEmoji(i2);
    }

    public boolean isCodePointEmojiModifier(int i2) {
        return nativeFlutterTextUtilsIsEmojiModifier(i2);
    }

    public boolean isCodePointEmojiModifierBase(int i2) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i2);
    }

    public boolean isCodePointRegionalIndicator(int i2) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i2);
    }

    public boolean isCodePointVariantSelector(int i2) {
        return nativeFlutterTextUtilsIsVariationSelector(i2);
    }

    public void loadDartDeferredLibrary(int i2, java.lang.String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i2, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x018d, code lost:
    
        if (r12 != null) goto L118;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadLibrary(android.content.Context context) {
        x0.e eVar;
        java.lang.String[] strArr;
        java.util.zip.ZipFile zipFile;
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2;
        java.io.FileOutputStream fileOutputStream;
        java.io.FileOutputStream fileOutputStream2;
        if (loadLibraryCalled) {
            android.util.Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        H0.b bVar = new H0.b(22);
        F.C0014n c0014n = new F.C0014n(5);
        c0014n.f501d = bVar;
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Given context is null");
        }
        c0014n.e("Beginning load of %s...", io.appmetrica.analytics.plugins.PluginErrorDetails.Platform.FLUTTER);
        f1.L l2 = (f1.L) c0014n.f499b;
        java.util.HashSet hashSet = (java.util.HashSet) c0014n.f498a;
        if (hashSet.contains(io.appmetrica.analytics.plugins.PluginErrorDetails.Platform.FLUTTER)) {
            c0014n.e("%s already loaded previously!", io.appmetrica.analytics.plugins.PluginErrorDetails.Platform.FLUTTER);
        } else {
            try {
                l2.getClass();
                java.lang.System.loadLibrary(io.appmetrica.analytics.plugins.PluginErrorDetails.Platform.FLUTTER);
                hashSet.add(io.appmetrica.analytics.plugins.PluginErrorDetails.Platform.FLUTTER);
                c0014n.e("%s (%s) was loaded normally!", io.appmetrica.analytics.plugins.PluginErrorDetails.Platform.FLUTTER, null);
            } catch (java.lang.UnsatisfiedLinkError e2) {
                c0014n.e("Loading the library normally failed: %s", android.util.Log.getStackTraceString(e2));
                c0014n.e("%s (%s) was not loaded normally, re-linking...", io.appmetrica.analytics.plugins.PluginErrorDetails.Platform.FLUTTER, null);
                java.io.File d2 = c0014n.d(context);
                if (!d2.exists()) {
                    java.io.File dir = context.getDir("lib", 0);
                    java.io.File d3 = c0014n.d(context);
                    l2.getClass();
                    java.io.File[] listFiles = dir.listFiles(new g0.C0129a(java.lang.System.mapLibraryName(io.appmetrica.analytics.plugins.PluginErrorDetails.Platform.FLUTTER)));
                    if (listFiles != null) {
                        for (java.io.File file : listFiles) {
                            if (!file.getAbsolutePath().equals(d3.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    java.lang.String[] strArr2 = android.os.Build.SUPPORTED_ABIS;
                    if (strArr2.length <= 0) {
                        java.lang.String str = android.os.Build.CPU_ABI2;
                        strArr2 = (str == null || str.length() == 0) ? new java.lang.String[]{android.os.Build.CPU_ABI} : new java.lang.String[]{android.os.Build.CPU_ABI, str};
                    }
                    java.lang.String mapLibraryName = java.lang.System.mapLibraryName(io.appmetrica.analytics.plugins.PluginErrorDetails.Platform.FLUTTER);
                    ((f1.L) c0014n.f500c).getClass();
                    try {
                        x0.e d4 = f1.L.d(context, strArr2, mapLibraryName, c0014n);
                        try {
                            if (d4 == null) {
                                try {
                                    strArr = f1.L.f(context, mapLibraryName);
                                } catch (java.lang.Exception e3) {
                                    strArr = new java.lang.String[]{e3.toString()};
                                }
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not find '");
                                sb.append(mapLibraryName);
                                sb.append("'. Looked for: ");
                                sb.append(java.util.Arrays.toString(strArr2));
                                sb.append(", but only found: ");
                                throw new E1.A(B1.a.j(sb, java.util.Arrays.toString(strArr), "."));
                            }
                            int i2 = 0;
                            while (true) {
                                int i3 = i2 + 1;
                                zipFile = (java.util.zip.ZipFile) d4.f8409b;
                                if (i2 < 5) {
                                    c0014n.e("Found %s! Extracting...", mapLibraryName);
                                    try {
                                        if (d2.exists() || d2.createNewFile()) {
                                            try {
                                                inputStream2 = zipFile.getInputStream((java.util.zip.ZipEntry) d4.f8410c);
                                            } catch (java.io.FileNotFoundException unused) {
                                                inputStream2 = null;
                                            } catch (java.io.IOException unused2) {
                                                inputStream2 = null;
                                            } catch (java.lang.Throwable th) {
                                                th = th;
                                                inputStream = null;
                                            }
                                            try {
                                                fileOutputStream2 = new java.io.FileOutputStream(d2);
                                                try {
                                                    byte[] bArr = new byte[io.appmetrica.analytics.coreutils.internal.io.Base64Utils.IO_BUFFER_SIZE];
                                                    long j2 = 0;
                                                    while (true) {
                                                        int read = inputStream2.read(bArr);
                                                        if (read == -1) {
                                                            break;
                                                        }
                                                        fileOutputStream2.write(bArr, 0, read);
                                                        j2 += read;
                                                    }
                                                    fileOutputStream2.flush();
                                                    fileOutputStream2.getFD().sync();
                                                    if (j2 == d2.length()) {
                                                        f1.L.b(inputStream2);
                                                        f1.L.b(fileOutputStream2);
                                                        d2.setReadable(true, false);
                                                        d2.setExecutable(true, false);
                                                        d2.setWritable(true);
                                                        break;
                                                    }
                                                    f1.L.b(inputStream2);
                                                    f1.L.b(fileOutputStream2);
                                                } catch (java.io.FileNotFoundException unused3) {
                                                    f1.L.b(inputStream2);
                                                    f1.L.b(fileOutputStream2);
                                                    i2 = i3;
                                                } catch (java.io.IOException unused4) {
                                                    f1.L.b(inputStream2);
                                                    f1.L.b(fileOutputStream2);
                                                    i2 = i3;
                                                } catch (java.lang.Throwable th2) {
                                                    th = th2;
                                                    inputStream = inputStream2;
                                                    fileOutputStream = fileOutputStream2;
                                                    f1.L.b(inputStream);
                                                    f1.L.b(fileOutputStream);
                                                    throw th;
                                                }
                                            } catch (java.io.FileNotFoundException unused5) {
                                                fileOutputStream2 = null;
                                                f1.L.b(inputStream2);
                                                f1.L.b(fileOutputStream2);
                                                i2 = i3;
                                            } catch (java.io.IOException unused6) {
                                                fileOutputStream2 = null;
                                                f1.L.b(inputStream2);
                                                f1.L.b(fileOutputStream2);
                                                i2 = i3;
                                            } catch (java.lang.Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                f1.L.b(inputStream);
                                                f1.L.b(fileOutputStream);
                                                throw th;
                                            }
                                        }
                                    } catch (java.io.IOException unused7) {
                                    }
                                    i2 = i3;
                                } else if (((H0.b) c0014n.f501d) != null) {
                                    lambda$loadLibrary$0("FATAL! Couldn't extract the library from the APK!");
                                }
                            }
                            try {
                                zipFile.close();
                            } catch (java.io.IOException unused8) {
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            eVar = d4;
                            if (eVar != null) {
                                try {
                                    java.util.zip.ZipFile zipFile2 = (java.util.zip.ZipFile) eVar.f8409b;
                                    if (zipFile2 != null) {
                                        zipFile2.close();
                                    }
                                } catch (java.io.IOException unused9) {
                                }
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        eVar = null;
                    }
                }
                java.lang.String absolutePath = d2.getAbsolutePath();
                l2.getClass();
                java.lang.System.load(absolutePath);
                hashSet.add(io.appmetrica.analytics.plugins.PluginErrorDetails.Platform.FLUTTER);
                c0014n.e("%s (%s) was re-linked!", io.appmetrica.analytics.plugins.PluginErrorDetails.Platform.FLUTTER, null);
            }
        }
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j2);
    }

    public void maybeResizeSurfaceView(int i2, int i3) {
        boolean z2;
        java.util.Iterator<io.flutter.embedding.engine.renderer.j> it = this.flutterUiResizeListeners.iterator();
        while (it.hasNext()) {
            android.view.View view = ((P0.r) it.next()).f1380a.f1390e;
            if (view != null) {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                boolean z3 = true;
                if (view.getHeight() != i3) {
                    layoutParams.height = i3;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (view.getWidth() != i2) {
                    layoutParams.width = i2;
                } else {
                    z3 = z2;
                }
                if (z3) {
                    view.setLayoutParams(layoutParams);
                }
            } else {
                android.util.Log.e("FlutterView", "Flutter engine view not set.");
            }
        }
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        kVar.f7783r.clear();
        kVar.f7784s.clear();
    }

    public void onDisplayOverlaySurface(int i2, int i3, int i4, int i5, int i6) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        android.util.SparseArray sparseArray = kVar.f7778m;
        if (sparseArray.get(i2) == null) {
            throw new java.lang.IllegalStateException(B1.a.g(i2, "The overlay surface (id:", ") doesn't exist"));
        }
        kVar.h();
        android.view.View view = (io.flutter.plugin.platform.b) sparseArray.get(i2);
        if (view.getParent() == null) {
            kVar.f7768c.addView(view);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i5, i6);
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = i4;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        kVar.f7783r.add(java.lang.Integer.valueOf(i2));
    }

    public void onDisplayPlatformView(int i2, int i3, int i4, int i5, int i6, int i7, int i8, io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        kVar.h();
        B1.a.m(kVar.f7776k.get(i2));
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void onDisplayPlatformView2(int i2, int i3, int i4, int i5, int i6, int i7, int i8, io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        B1.a.m(jVar.f7758g.get(i2));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public void onEndFrame() {
        ?? r3;
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z2 = false;
        if (!kVar.f7781p || !kVar.f7784s.isEmpty()) {
            if (kVar.f7781p) {
                P0.C0052j c0052j = kVar.f7768c.f1389d;
                if (c0052j != null ? c0052j.e() : false) {
                    z2 = true;
                }
            }
            kVar.f(z2);
            return;
        }
        kVar.f7781p = false;
        P0.t tVar = kVar.f7768c;
        F0.a aVar = new F0.a(10, kVar);
        P0.C0052j c0052j2 = tVar.f1389d;
        if (c0052j2 == null || (r3 = tVar.f1391f) == 0) {
            return;
        }
        tVar.f1390e = r3;
        tVar.f1391f = null;
        io.flutter.embedding.engine.renderer.h hVar = tVar.f1394i.f7616b;
        if (hVar != null) {
            r3.d();
            hVar.a(new P0.s(tVar, hVar, aVar));
            return;
        }
        c0052j2.c();
        P0.C0052j c0052j3 = tVar.f1389d;
        if (c0052j3 != null) {
            c0052j3.f1359a.close();
            tVar.removeView(tVar.f1389d);
            tVar.f1389d = null;
        }
        aVar.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        java.util.Iterator<io.flutter.embedding.engine.renderer.i> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        java.util.Iterator<io.flutter.embedding.engine.renderer.i> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void onSurfaceChanged(int i2, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i2, i3);
    }

    public void onSurfaceCreated(android.view.Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(android.view.Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j2, long j3, long j4) {
        nativeOnVsync(j2, j3, j4);
    }

    public long performNativeAttach(io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            android.util.Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j2, io.flutter.view.TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j2, new java.lang.ref.WeakReference<>(textureRegistry$ImageConsumer), z2);
    }

    public void registerTexture(long j2, io.flutter.embedding.engine.renderer.SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j2, new java.lang.ref.WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(Q0.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.i iVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(iVar);
    }

    public void removeResizingFlutterUiListener(io.flutter.embedding.engine.renderer.j jVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.remove(jVar);
    }

    public void requestDartDeferredLibrary(int i2) {
        android.util.Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.res.AssetManager assetManager, java.util.List<java.lang.String> list, long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j2);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(Q0.j jVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = jVar;
    }

    public void setAccessibilityFeatures(int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i2);
        }
    }

    public void setAccessibilityFeaturesInNative(int i2) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i2);
    }

    public void setAsyncWaitForVsyncDelegate(Q0.k kVar) {
        asyncWaitForVsyncDelegate = kVar;
    }

    public void setDeferredComponentManager(S0.a aVar) {
        ensureRunningOnMainThread();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setLocalizationPlugin(b1.C0094a c0094a) {
        ensureRunningOnMainThread();
        this.localizationPlugin = c0094a;
    }

    public void setPlatformMessageHandler(R0.j jVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = jVar;
    }

    public void setPlatformViewsController(io.flutter.plugin.platform.k kVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = kVar;
    }

    public void setPlatformViewsController2(io.flutter.plugin.platform.j jVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = jVar;
    }

    public void setRefreshRateFPS(float f2) {
        refreshRateFPS = f2;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z2);
        }
    }

    public void setSemanticsEnabledInNative(boolean z2) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z2);
    }

    public void setSemanticsTreeEnabled(boolean z2) {
        ensureRunningOnMainThread();
        Q0.j jVar = this.accessibilityDelegate;
        if (jVar == null || z2) {
            return;
        }
        io.flutter.view.h hVar = (io.flutter.view.h) ((io.flutter.view.b) jVar).f7796a;
        hVar.f7890g.clear();
        io.flutter.view.g gVar = hVar.f7892i;
        if (gVar != null) {
            hVar.g(gVar.f7856b, 65536);
        }
        hVar.f7892i = null;
        hVar.f7898o = null;
        android.view.accessibility.AccessibilityEvent d2 = hVar.d(0, 2048);
        d2.setContentChangeTypes(1);
        hVar.h(d2);
    }

    public void setSettingsChannel(Z0.m mVar) {
        ensureRunningOnMainThread();
        this.settingsChannel = mVar;
    }

    public void setViewportMetrics(float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f2, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, iArr, iArr2, iArr3, i17, i18, i19, i20, i21, i22, i23, i24);
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void showOverlaySurface2() {
        io.flutter.plugin.platform.j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (jVar.f7763l == null) {
            return;
        }
        android.view.SurfaceControl.Transaction d2 = io.flutter.plugin.platform.i.d();
        jVar.f7760i.add(d2);
        d2.setVisibility(jVar.f7763l, true);
    }

    public io.flutter.embedding.engine.FlutterJNI spawn(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> list, long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        io.flutter.embedding.engine.FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j2);
        java.lang.Long l2 = nativeSpawn.nativeShellHolderId;
        if ((l2 == null || l2.longValue() == 0) ? false : true) {
            return nativeSpawn;
        }
        throw new java.lang.IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void swapTransactions() {
        io.flutter.plugin.platform.j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new java.lang.RuntimeException("");
        }
        synchronized (jVar) {
            jVar.f7761j.clear();
            jVar.f7761j.addAll(jVar.f7760i);
            jVar.f7760i.clear();
        }
    }

    public void unregisterTexture(long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j2);
    }

    public void updateDisplayMetrics(int i2, float f2, float f3, float f4) {
        displayWidth = f2;
        displayHeight = f3;
        displayDensity = f4;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(android.content.res.AssetManager assetManager, java.lang.String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i2, io.flutter.view.e eVar, java.lang.Object obj) {
        java.nio.ByteBuffer byteBuffer;
        int i3;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = a1.n.INSTANCE.encodeMessage(obj);
            i3 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i3 = 0;
        }
        dispatchSemanticsAction(i2, eVar.f7824a, byteBuffer, i3);
    }

    public void dispatchSemanticsAction(int i2, int i3, java.nio.ByteBuffer byteBuffer, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i2, i3, byteBuffer, i4);
    }
}
