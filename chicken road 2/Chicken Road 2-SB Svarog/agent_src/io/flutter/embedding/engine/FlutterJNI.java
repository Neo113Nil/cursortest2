package io.flutter.embedding.engine;

import F.AbstractC0000a;
import F.AbstractC0011l;
import F.C0012m;
import F.v;
import F.w;
import F.x;
import G.b;
import G.l;
import G.m;
import G.n;
import G.o;
import H.h;
import H.k;
import I.a;
import J.d;
import P.e;
import a.AbstractC0018a;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaExtractor;
import android.os.Build;
import android.os.LocaleList;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.AttachedSurfaceControl;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.i;
import io.flutter.plugin.platform.j;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.c;
import io.flutter.view.f;
import io.flutter.view.s;
import io.flutter.view.t;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import n.g;

/* loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static o asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private n accessibilityDelegate;
    private a deferredComponentManager;
    private Q.a localizationPlugin;
    private Long nativeShellHolderId;
    private k platformMessageHandler;
    private io.flutter.plugin.platform.k platformViewsController;
    private j platformViewsController2;
    private O.o settingsChannel;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<i> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Set<io.flutter.embedding.engine.renderer.j> flutterUiResizeListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j2) {
        o oVar = asyncWaitForVsyncDelegate;
        if (oVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        c cVar = (c) oVar;
        cVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        t tVar = (t) cVar.f720a;
        s sVar = tVar.f850c;
        if (sVar != null) {
            sVar.f844a = j2;
            tVar.f850c = null;
        } else {
            sVar = new s(tVar, j2);
        }
        choreographer.postFrameCallback(sVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, long j2) {
        J.b bVar;
        F.t tVar = 0;
        tVar = 0;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        m mVar = new m(j2);
        d dVar = new d();
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        byteBuffer.rewind();
        int i2 = 1;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
            dVar.f262d = options.outMimeType;
            dVar.f264f = options.outHeight;
            dVar.f265g = options.outWidth;
        } catch (Exception e2) {
            Log.e("BitmapMetadataReader", "Failed to decode image for mime type", e2);
        }
        if ("image/heif".equals(dVar.f262d)) {
            try {
                J.c cVar = new J.c(bArr);
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(cVar);
                AbstractC0018a.w(dVar, mediaExtractor);
            } catch (Exception e3) {
                Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e3);
            }
            nativeImageHeaderCallback(mVar.f216a, dVar.f259a, dVar.f260b);
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    g gVar = new g(byteArrayInputStream);
                    n.c c2 = gVar.c("Orientation");
                    if (c2 != null) {
                        try {
                            i2 = c2.e(gVar.f1005e);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    dVar.f263e = i2;
                    byteArrayInputStream.close();
                } finally {
                }
            } catch (IOException e4) {
                Log.e("ExifMetadataReader", "Failed to read EXIF metadata", e4);
            }
        }
        if ("image/heif".equals(dVar.f262d)) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 == 36) {
                bVar = new J.b(tVar, 0);
            } else if (i3 < 36) {
                bVar = new J.b(tVar, 1);
            }
            tVar = bVar;
        }
        if (tVar == 0) {
            tVar = new F.t(4, mVar);
        }
        return tVar.t(byteBuffer, dVar);
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i2, ByteBuffer byteBuffer) {
        e eVar;
        k kVar = this.platformMessageHandler;
        if (kVar == null || (eVar = (e) ((H.j) kVar).f250g.remove(Integer.valueOf(i2))) == null) {
            return;
        }
        try {
            eVar.a(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (Error e2) {
            Thread currentThread = Thread.currentThread();
            if (currentThread.getUncaughtExceptionHandler() == null) {
                throw e2;
            }
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e2);
        } catch (Exception e3) {
            Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadLibrary$0(String str) {
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j2);

    private native void nativeDeferredComponentInstallFailure(int i2, String str, boolean z2);

    private native void nativeDestroy(long j2);

    private native void nativeDispatchEmptyPlatformMessage(long j2, String str, int i2);

    private native void nativeDispatchPlatformMessage(long j2, String str, ByteBuffer byteBuffer, int i2, int i3);

    private native void nativeDispatchPointerDataPacket(long j2, ByteBuffer byteBuffer, int i2);

    private native void nativeDispatchSemanticsAction(long j2, int i2, int i3, ByteBuffer byteBuffer, int i4);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i2);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i2);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i2);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i2);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i2);

    private native Bitmap nativeGetBitmap(long j2);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j2, int i2, int i3);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j2, int i2);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j2, int i2);

    private native void nativeInvokePlatformMessageResponseCallback(long j2, int i2, ByteBuffer byteBuffer, int i3);

    private native boolean nativeIsSurfaceControlEnabled(long j2);

    private native void nativeLoadDartDeferredLibrary(long j2, int i2, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j2);

    private native void nativeMarkTextureFrameAvailable(long j2, long j3);

    private native void nativeNotifyLowMemoryWarning(long j2);

    private native void nativeOnVsync(long j2, long j3, long j4);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j2, long j3, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z2);

    private native void nativeRegisterTexture(long j2, long j3, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j2, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j3);

    private native void nativeScheduleFrame(long j2);

    private native void nativeSetAccessibilityFeatures(long j2, int i2);

    private native void nativeSetSemanticsEnabled(long j2, boolean z2);

    private native void nativeSetViewportMetrics(long j2, float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24);

    private native FlutterJNI nativeSpawn(long j2, String str, String str2, String str3, List<String> list, long j3);

    private native void nativeSurfaceChanged(long j2, int i2, int i3);

    private native void nativeSurfaceCreated(long j2, Surface surface);

    private native void nativeSurfaceDestroyed(long j2);

    private native void nativeSurfaceWindowChanged(long j2, Surface surface);

    private native void nativeUnregisterTexture(long j2, long j3);

    private native void nativeUpdateDisplayMetrics(long j2);

    private native void nativeUpdateJavaAssetManager(long j2, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f2);

    private void onPreEngineRestart() {
        Iterator<b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private void setApplicationLocale(String str) {
        ensureRunningOnMainThread();
        n nVar = this.accessibilityDelegate;
        if (nVar != null) {
            ((io.flutter.view.i) ((c) nVar).f720a).f819l = str;
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        n nVar = this.accessibilityDelegate;
        if (nVar != null) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            io.flutter.view.i iVar = (io.flutter.view.i) ((c) nVar).f720a;
            while (byteBuffer.hasRemaining()) {
                io.flutter.view.g a2 = iVar.a(byteBuffer.getInt());
                a2.f751c = byteBuffer.getInt();
                a2.f752d = io.flutter.view.i.c(byteBuffer, strArr);
                a2.f753e = io.flutter.view.i.c(byteBuffer, strArr);
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        n nVar = this.accessibilityDelegate;
        if (nVar != null) {
            ((c) nVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(i iVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(iVar);
    }

    public void addResizingFlutterUiListener(io.flutter.embedding.engine.renderer.j jVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.add(jVar);
    }

    public void applyTransactions() {
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("");
        }
        ArrayList arrayList = jVar.f684j;
        SurfaceControl.Transaction h2 = AbstractC0011l.h();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            h2 = h2.merge(AbstractC0011l.j(arrayList.get(i2)));
        }
        h2.apply();
        arrayList.clear();
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j2) {
        nativeCleanupMessageData(j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f6, code lost:
    
        if (r10 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0128, code lost:
    
        r4 = r0.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012d, code lost:
    
        if (r5 >= r4) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012f, code lost:
    
        r6 = r0.get(r5);
        r5 = r5 + 1;
        r6 = (java.util.Locale) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0143, code lost:
    
        if (r3.getLanguage().equals(r6.toLanguageTag()) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0146, code lost:
    
        r4 = r0.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014b, code lost:
    
        if (r5 >= r4) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014d, code lost:
    
        r6 = r0.get(r5);
        r5 = r5 + 1;
        r6 = (java.util.Locale) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0161, code lost:
    
        if (r3.getLanguage().equals(r6.getLanguage()) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0164, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String[] computePlatformResolvedLocale(String[] strArr) {
        Locale locale;
        Locale locale2;
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2 += 3) {
            String str = strArr[i2];
            String str2 = strArr[i2 + 1];
            String str3 = strArr[i2 + 2];
            Locale.Builder builder = new Locale.Builder();
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
        Context context = this.localizationPlugin.f373b;
        if (arrayList.isEmpty()) {
            locale2 = null;
        } else if (Build.VERSION.SDK_INT >= 26) {
            ArrayList arrayList2 = new ArrayList();
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i3 = 0; i3 < size; i3++) {
                Locale locale3 = locales.get(i3);
                String language = locale3.getLanguage();
                if (!locale3.getScript().isEmpty()) {
                    language = language + "-" + locale3.getScript();
                }
                if (!locale3.getCountry().isEmpty()) {
                    language = language + "-" + locale3.getCountry();
                }
                arrayList2.add(AbstractC0000a.l(language));
                AbstractC0000a.n();
                arrayList2.add(AbstractC0000a.l(locale3.getLanguage()));
                AbstractC0000a.n();
                arrayList2.add(AbstractC0000a.l(locale3.getLanguage() + "-*"));
            }
            locale2 = Locale.lookup(arrayList2, arrayList);
        } else {
            LocaleList locales2 = context.getResources().getConfiguration().getLocales();
            int i4 = 0;
            loop2: while (i4 < locales2.size()) {
                Locale locale4 = locales2.get(i4);
                int size2 = arrayList.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        break;
                    }
                    Object obj = arrayList.get(i5);
                    i5++;
                    locale = (Locale) obj;
                    if (locale4.equals(locale)) {
                        break loop2;
                    }
                }
                locale2 = locale;
            }
            locale2 = (Locale) arrayList.get(0);
        }
        return locale2 == null ? new String[0] : new String[]{locale2.getLanguage(), locale2.getCountry(), locale2.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        Context context = kVar.f692d.getContext();
        int width = kVar.f692d.getWidth();
        int height = kVar.f692d.getHeight();
        io.flutter.plugin.platform.a aVar = kVar.f697i;
        io.flutter.plugin.platform.b bVar = new io.flutter.plugin.platform.b(context, width, height, 2);
        bVar.f663h = aVar;
        int i2 = kVar.f704p;
        kVar.f704p = i2 + 1;
        kVar.f702n.put(i2, bVar);
        return new FlutterOverlaySurface(i2, bVar.getSurface());
    }

    public FlutterOverlaySurface createOverlaySurface2() {
        SurfaceControl build;
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction buildReparentTransaction;
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (jVar.f686l == null) {
            SurfaceControl.Builder g2 = AbstractC0011l.g();
            g2.setBufferSize(jVar.f678d.getWidth(), jVar.f678d.getHeight());
            g2.setFormat(1);
            g2.setName("Flutter Overlay Surface");
            g2.setOpaque(false);
            g2.setHidden(false);
            build = g2.build();
            rootSurfaceControl = jVar.f678d.getRootSurfaceControl();
            buildReparentTransaction = rootSurfaceControl.buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, 1000);
            buildReparentTransaction.apply();
            jVar.f686l = AbstractC0011l.f(build);
            jVar.f687m = build;
        }
        return new FlutterOverlaySurface(0, jVar.f686l);
    }

    public SurfaceControl.Transaction createTransaction() {
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction h2 = AbstractC0011l.h();
        jVar.f684j.add(h2);
        return h2;
    }

    public void deferredComponentInstallFailure(int i2, String str, boolean z2) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i2, str, z2);
    }

    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        Surface surface = jVar.f686l;
        if (surface != null) {
            surface.release();
            jVar.f686l = null;
            jVar.f687m = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        kVar.b();
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

    public void dispatchEmptyPlatformMessage(String str, int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i2);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i2);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i2, int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i2, i3);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i3);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i2);
    }

    public void dispatchSemanticsAction(int i2, f fVar) {
        dispatchSemanticsAction(i2, fVar, null);
    }

    public void endFrame2() {
        AttachedSurfaceControl rootSurfaceControl;
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("");
        }
        ArrayList arrayList = jVar.f685k;
        SurfaceControl.Transaction h2 = AbstractC0011l.h();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            h2 = h2.merge(AbstractC0011l.j(arrayList.get(i2)));
        }
        arrayList.clear();
        jVar.f678d.invalidate();
        rootSurfaceControl = jVar.f678d.getRootSurfaceControl();
        rootSurfaceControl.applyTransactionOnDraw(h2);
    }

    public Bitmap getBitmap() {
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
        O.n nVar;
        O.o oVar = this.settingsChannel;
        DisplayMetrics displayMetrics = null;
        if (oVar != null) {
            E.b bVar = oVar.f336a;
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) bVar.f18a;
            if (((O.n) bVar.f19b) == null) {
                bVar.f19b = (O.n) concurrentLinkedQueue.poll();
            }
            while (true) {
                nVar = (O.n) bVar.f19b;
                if (nVar == null || nVar.f334a >= i2) {
                    break;
                }
                bVar.f19b = (O.n) concurrentLinkedQueue.poll();
            }
            if (nVar == null) {
                Log.e("SettingsChannel", "Cannot find config with generation: " + i2 + ", after exhausting the queue.");
            } else {
                if (nVar.f334a != i2) {
                    Log.e("SettingsChannel", "Cannot find config with generation: " + i2 + ", the oldest config is now: " + ((O.n) bVar.f19b).f334a);
                }
                if (nVar != null) {
                    displayMetrics = nVar.f335b;
                }
            }
            nVar = null;
            if (nVar != null) {
            }
        }
        if (displayMetrics != null) {
            return TypedValue.applyDimension(2, f2, displayMetrics) / displayMetrics.density;
        }
        Log.e(TAG, "getScaledFontSize called with configurationId " + i2 + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i2, long j2) {
        H.f fVar;
        boolean z2;
        k kVar = this.platformMessageHandler;
        if (kVar == null) {
            nativeCleanupMessageData(j2);
            return;
        }
        H.j jVar = (H.j) kVar;
        synchronized (jVar.f248e) {
            try {
                fVar = (H.f) jVar.f246c.get(str);
                z2 = jVar.f249f.get() && fVar == null;
                if (z2) {
                    if (!jVar.f247d.containsKey(str)) {
                        jVar.f247d.put(str, new LinkedList());
                    }
                    ((List) jVar.f247d.get(str)).add(new H.d(j2, byteBuffer, i2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            return;
        }
        jVar.a(str, fVar, byteBuffer, i2, j2);
    }

    public void hideOverlaySurface2() {
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (jVar.f687m == null) {
            return;
        }
        SurfaceControl.Transaction h2 = AbstractC0011l.h();
        jVar.f684j.add(h2);
        h2.setVisibility(jVar.f687m, false);
    }

    public void hidePlatformView2(int i2) {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to hide a platform view");
        }
        if (jVar.f682h.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j2, int i2) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
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
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i2);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [io.flutter.embedding.engine.FlutterJNI] */
    public void invokePlatformMessageResponseCallback(int i2, ByteBuffer byteBuffer, int i3) {
        FlutterJNI flutterJNI;
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            flutterJNI = isAttached();
            try {
                if (flutterJNI != 0) {
                    FlutterJNI flutterJNI2 = this;
                    flutterJNI2.nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i2, byteBuffer, i3);
                    flutterJNI = flutterJNI2;
                } else {
                    flutterJNI = this;
                    Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i2);
                }
                flutterJNI.shellHolderLock.readLock().unlock();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                flutterJNI.shellHolderLock.readLock().unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            flutterJNI = this;
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

    public void loadDartDeferredLibrary(int i2, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i2, strArr);
    }

    public void loadLibrary(Context context) {
        C.a d2;
        String[] strArr;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        long j2;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        l lVar = new l();
        C.b bVar = new C.b(1);
        C.b bVar2 = new C.b(0);
        C.e eVar = new C.e();
        eVar.f8a = new HashSet();
        eVar.f9b = bVar;
        eVar.f10c = bVar2;
        eVar.f11d = lVar;
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        eVar.f("Beginning load of %s...", "flutter");
        C.b bVar3 = (C.b) eVar.f9b;
        HashSet hashSet = (HashSet) eVar.f8a;
        if (hashSet.contains("flutter")) {
            eVar.f("%s already loaded previously!", "flutter");
        } else {
            C.a aVar = null;
            try {
                bVar3.getClass();
                System.loadLibrary("flutter");
                hashSet.add("flutter");
                eVar.f("%s (%s) was loaded normally!", "flutter", null);
            } catch (UnsatisfiedLinkError e2) {
                eVar.f("Loading the library normally failed: %s", Log.getStackTraceString(e2));
                eVar.f("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                File e3 = eVar.e(context);
                if (!e3.exists()) {
                    File dir = context.getDir("lib", 0);
                    File e4 = eVar.e(context);
                    bVar3.getClass();
                    File[] listFiles = dir.listFiles(new C.d(System.mapLibraryName("flutter")));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(e4.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    C.b bVar4 = (C.b) eVar.f10c;
                    String[] strArr2 = Build.SUPPORTED_ABIS;
                    if (strArr2.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr2 = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String mapLibraryName = System.mapLibraryName("flutter");
                    bVar4.getClass();
                    try {
                        d2 = C.b.d(context, strArr2, mapLibraryName, eVar);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        if (d2 == null) {
                            try {
                                strArr = C.b.e(context, mapLibraryName);
                            } catch (Exception e5) {
                                strArr = new String[]{e5.toString()};
                            }
                            throw new C.c(mapLibraryName, strArr2, strArr);
                        }
                        ZipFile zipFile = (ZipFile) d2.f4c;
                        int i2 = 0;
                        while (true) {
                            int i3 = i2 + 1;
                            if (i2 < 5) {
                                eVar.f("Found %s! Extracting...", mapLibraryName);
                                try {
                                    if (e3.exists() || e3.createNewFile()) {
                                        try {
                                            inputStream2 = zipFile.getInputStream((ZipEntry) d2.f5d);
                                            try {
                                                fileOutputStream2 = new FileOutputStream(e3);
                                            } catch (FileNotFoundException unused) {
                                                fileOutputStream2 = null;
                                                C.b.a(inputStream2);
                                                C.b.a(fileOutputStream2);
                                                i2 = i3;
                                            } catch (IOException unused2) {
                                                fileOutputStream2 = null;
                                                C.b.a(inputStream2);
                                                C.b.a(fileOutputStream2);
                                                i2 = i3;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                C.b.a(inputStream);
                                                C.b.a(fileOutputStream);
                                                throw th;
                                            }
                                            try {
                                                byte[] bArr = new byte[4096];
                                                j2 = 0;
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
                                            } catch (FileNotFoundException unused3) {
                                                C.b.a(inputStream2);
                                                C.b.a(fileOutputStream2);
                                                i2 = i3;
                                            } catch (IOException unused4) {
                                                C.b.a(inputStream2);
                                                C.b.a(fileOutputStream2);
                                                i2 = i3;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                                fileOutputStream = fileOutputStream2;
                                                C.b.a(inputStream);
                                                C.b.a(fileOutputStream);
                                                throw th;
                                            }
                                        } catch (FileNotFoundException unused5) {
                                            inputStream2 = null;
                                        } catch (IOException unused6) {
                                            inputStream2 = null;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            inputStream = null;
                                        }
                                        if (j2 == e3.length()) {
                                            C.b.a(inputStream2);
                                            C.b.a(fileOutputStream2);
                                            e3.setReadable(true, false);
                                            e3.setExecutable(true, false);
                                            e3.setWritable(true);
                                            break;
                                        }
                                        C.b.a(inputStream2);
                                        C.b.a(fileOutputStream2);
                                    }
                                } catch (IOException unused7) {
                                }
                                i2 = i3;
                            } else if (((l) eVar.f11d) != null) {
                                lambda$loadLibrary$0("FATAL! Couldn't extract the library from the APK!");
                            }
                        }
                        try {
                            zipFile.close();
                        } catch (IOException unused8) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        aVar = d2;
                        if (aVar != null) {
                            try {
                                ((ZipFile) aVar.f4c).close();
                            } catch (IOException unused9) {
                            }
                        }
                        throw th;
                    }
                }
                String absolutePath = e3.getAbsolutePath();
                bVar3.getClass();
                System.load(absolutePath);
                hashSet.add("flutter");
                eVar.f("%s (%s) was re-linked!", "flutter", null);
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
        Iterator<io.flutter.embedding.engine.renderer.j> it = this.flutterUiResizeListeners.iterator();
        while (it.hasNext()) {
            View view = ((v) it.next()).f117a.f126e;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
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
                Log.e("FlutterView", "Flutter engine view not set.");
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
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        kVar.f707s.clear();
        kVar.f708t.clear();
    }

    public void onDisplayOverlaySurface(int i2, int i3, int i4, int i5, int i6) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = kVar.f702n;
        if (sparseArray.get(i2) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i2 + ") doesn't exist");
        }
        kVar.f();
        View view = (io.flutter.plugin.platform.b) sparseArray.get(i2);
        if (view.getParent() == null) {
            kVar.f692d.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i6);
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = i4;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        kVar.f707s.add(Integer.valueOf(i2));
    }

    public void onDisplayPlatformView(int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        kVar.f();
        if (kVar.f700l.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    public void onDisplayPlatformView2(int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        if (jVar.f682h.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public void onEndFrame() {
        ?? r3;
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z2 = false;
        if (!kVar.f705q || !kVar.f708t.isEmpty()) {
            if (kVar.f705q) {
                C0012m c0012m = kVar.f692d.f125d;
                if (c0012m != null ? c0012m.e() : false) {
                    z2 = true;
                }
            }
            kVar.d(z2);
            return;
        }
        kVar.f705q = false;
        x xVar = kVar.f692d;
        h hVar = new h(3, kVar);
        C0012m c0012m2 = xVar.f125d;
        if (c0012m2 == null || (r3 = xVar.f127f) == 0) {
            return;
        }
        xVar.f126e = r3;
        xVar.f127f = null;
        io.flutter.embedding.engine.renderer.h hVar2 = xVar.f130i.f151b;
        if (hVar2 != null) {
            r3.d();
            hVar2.a(new w(xVar, hVar2, hVar));
            return;
        }
        c0012m2.c();
        C0012m c0012m3 = xVar.f125d;
        if (c0012m3 != null) {
            c0012m3.f92a.close();
            xVar.removeView(xVar.f125d);
            xVar.f125d = null;
        }
        hVar.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<i> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<i> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void onSurfaceChanged(int i2, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i2, i3);
    }

    public void onSurfaceCreated(Surface surface) {
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

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j2, long j3, long j4) {
        nativeOnVsync(j2, j3, j4);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j2, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j2, new WeakReference<>(textureRegistry$ImageConsumer), z2);
    }

    public void registerTexture(long j2, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j2, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(i iVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(iVar);
    }

    public void removeResizingFlutterUiListener(io.flutter.embedding.engine.renderer.j jVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.remove(jVar);
    }

    public void requestDartDeferredLibrary(int i2) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j2);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(n nVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = nVar;
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

    public void setAsyncWaitForVsyncDelegate(o oVar) {
        asyncWaitForVsyncDelegate = oVar;
    }

    public void setDeferredComponentManager(a aVar) {
        ensureRunningOnMainThread();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setLocalizationPlugin(Q.a aVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = aVar;
    }

    public void setPlatformMessageHandler(k kVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = kVar;
    }

    public void setPlatformViewsController(io.flutter.plugin.platform.k kVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = kVar;
    }

    public void setPlatformViewsController2(j jVar) {
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
        n nVar = this.accessibilityDelegate;
        if (nVar == null || z2) {
            return;
        }
        io.flutter.view.i iVar = (io.flutter.view.i) ((c) nVar).f720a;
        iVar.f814g.clear();
        io.flutter.view.h hVar = iVar.f816i;
        if (hVar != null) {
            iVar.g(hVar.f779b, 65536);
        }
        iVar.f816i = null;
        iVar.f822o = null;
        AccessibilityEvent d2 = iVar.d(0, 2048);
        d2.setContentChangeTypes(1);
        iVar.h(d2);
    }

    public void setSettingsChannel(O.o oVar) {
        ensureRunningOnMainThread();
        this.settingsChannel = oVar;
    }

    public void setViewportMetrics(float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f2, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, iArr, iArr2, iArr3, i17, i18, i19, i20, i21, i22, i23, i24);
    }

    public void showOverlaySurface2() {
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (jVar.f687m == null) {
            return;
        }
        SurfaceControl.Transaction h2 = AbstractC0011l.h();
        jVar.f684j.add(h2);
        h2.setVisibility(jVar.f687m, true);
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j2);
        Long l2 = nativeSpawn.nativeShellHolderId;
        if ((l2 == null || l2.longValue() == 0) ? false : true) {
            return nativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    public void swapTransactions() {
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("");
        }
        synchronized (jVar) {
            jVar.f685k.clear();
            jVar.f685k.addAll(jVar.f684j);
            jVar.f684j.clear();
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

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i2, f fVar, Object obj) {
        ByteBuffer byteBuffer;
        int i3;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = P.m.f366a.b(obj);
            i3 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i3 = 0;
        }
        dispatchSemanticsAction(i2, fVar.f748b, byteBuffer, i3);
    }

    public void dispatchSemanticsAction(int i2, int i3, ByteBuffer byteBuffer, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i2, i3, byteBuffer, i4);
    }
}
