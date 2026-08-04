package io.flutter.embedding.engine;

import A1.AbstractC0013d;
import A1.K0;
import A1.W;
import A5.e;
import A5.x;
import W5.AbstractC0486a1;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.LocaleList;
import android.os.Looper;
import android.support.v4.media.session.t;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import com.google.android.gms.internal.ads.zzbbd;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.l;
import io.flutter.plugin.platform.C0916d;
import io.flutter.plugin.platform.m;
import io.flutter.plugin.platform.r;
import io.flutter.plugin.platform.s;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.d;
import io.flutter.view.k;
import io.flutter.view.q;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
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
import p128r5.f;
import p128r5.g;
import p135s5.c;
import p135s5.i;
import p135s5.j;
import p142t5.a;
import p155w1.C0970b1;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static g asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private f accessibilityDelegate;
    private a deferredComponentManager;
    private B5.a localizationPlugin;
    private Long nativeShellHolderId;
    private j platformMessageHandler;
    private s platformViewsController;
    private r platformViewsController2;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<p128r5.a> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<l> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j) {
        g gVar = asyncWaitForVsyncDelegate;
        if (gVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        io.flutter.view.a aVar = (io.flutter.view.a) gVar;
        aVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        io.flutter.view.r rVar = (io.flutter.view.r) aVar.f14230a;
        q qVar = (q) rVar.f14358c;
        if (qVar != null) {
            qVar.f14352a = j;
            rVar.f14358c = null;
        } else {
            qVar = new q(rVar, j);
        }
        choreographer.postFrameCallback(qVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [r5.e] */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, final long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new ImageDecoder.OnHeaderDecodedListener() { // from class: r5.e
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        FlutterJNI.lambda$decodeImage$0(j, imageDecoder, imageInfo, source);
                    }
                });
            } catch (IOException e7) {
                Log.e(TAG, "Failed to decode image", e7);
            }
        }
        return null;
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

    @Deprecated
    public static String getObservatoryUri() {
        return vmServiceUri;
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i7, ByteBuffer byteBuffer) {
        e eVar;
        j jVar = this.platformMessageHandler;
        if (jVar == null || (eVar = (e) ((i) jVar).f16215f.remove(Integer.valueOf(i7))) == null) {
            return;
        }
        try {
            eVar.a(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (Error e7) {
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
                throw e7;
            }
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, e7);
        } catch (Exception e8) {
            Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$0(long j, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        Size size = imageInfo.getSize();
        nativeImageHeaderCallback(j, size.getWidth(), size.getHeight());
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j);

    private native void nativeDeferredComponentInstallFailure(int i7, String str, boolean z4);

    private native void nativeDestroy(long j);

    private native void nativeDispatchEmptyPlatformMessage(long j, String str, int i7);

    private native void nativeDispatchPlatformMessage(long j, String str, ByteBuffer byteBuffer, int i7, int i8);

    private native void nativeDispatchPointerDataPacket(long j, ByteBuffer byteBuffer, int i7);

    private native void nativeDispatchSemanticsAction(long j, int i7, int i8, ByteBuffer byteBuffer, int i9);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i7);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i7);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i7);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i7);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i7);

    private native Bitmap nativeGetBitmap(long j);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j, int i7, int i8);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j, int i7);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j, int i7);

    private native void nativeInvokePlatformMessageResponseCallback(long j, int i7, ByteBuffer byteBuffer, int i8);

    private native boolean nativeIsSurfaceControlEnabled(long j);

    private native void nativeLoadDartDeferredLibrary(long j, int i7, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j);

    private native void nativeMarkTextureFrameAvailable(long j, long j3);

    private native void nativeNotifyLowMemoryWarning(long j);

    private native void nativeOnVsync(long j, long j3, long j7);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j, long j3, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z4);

    private native void nativeRegisterTexture(long j, long j3, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j3);

    private native void nativeScheduleFrame(long j);

    private native void nativeSetAccessibilityFeatures(long j, int i7);

    private native void nativeSetSemanticsEnabled(long j, boolean z4);

    private native void nativeSetViewportMetrics(long j, float f7, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j, String str, String str2, String str3, List<String> list, long j3);

    private native void nativeSurfaceChanged(long j, int i7, int i8);

    private native void nativeSurfaceCreated(long j, Surface surface);

    private native void nativeSurfaceDestroyed(long j);

    private native void nativeSurfaceWindowChanged(long j, Surface surface);

    private native void nativeUnregisterTexture(long j, long j3);

    private native void nativeUpdateDisplayMetrics(long j);

    private native void nativeUpdateJavaAssetManager(long j, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f7);

    private void onPreEngineRestart() {
        Iterator<p128r5.a> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        f fVar = this.accessibilityDelegate;
        if (fVar != null) {
            io.flutter.view.a aVar = (io.flutter.view.a) fVar;
            aVar.getClass();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            k kVar = (k) aVar.f14230a;
            kVar.getClass();
            while (byteBuffer.hasRemaining()) {
                io.flutter.view.e eVarB = kVar.b(byteBuffer.getInt());
                eVarB.f14260c = byteBuffer.getInt();
                int i7 = byteBuffer.getInt();
                String str = null;
                eVarB.f14261d = i7 == -1 ? null : strArr[i7];
                int i8 = byteBuffer.getInt();
                if (i8 != -1) {
                    str = strArr[i8];
                }
                eVarB.f14262e = str;
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        f fVar = this.accessibilityDelegate;
        if (fVar != null) {
            ((io.flutter.view.a) fVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(p128r5.a aVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(aVar);
    }

    public void addIsDisplayingFlutterUiListener(l lVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(lVar);
    }

    public void applyTransactions() {
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction transactionJ = p043f5.a.j();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = rVar.f14186l;
            if (i7 >= arrayList.size()) {
                transactionJ.apply();
                arrayList.clear();
                return;
            } else {
                transactionJ = transactionJ.merge(p043f5.a.l(arrayList.get(i7)));
                i7++;
            }
        }
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

    public void cleanupMessageData(long j) {
        nativeCleanupMessageData(j);
    }

    public String[] computePlatformResolvedLocale(String[] strArr) {
        Locale localeLookup;
        Locale locale;
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < strArr.length; i7 += 3) {
            String str = strArr[i7];
            String str2 = strArr[i7 + 1];
            String str3 = strArr[i7 + 2];
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
        B5.a aVar = this.localizationPlugin;
        aVar.getClass();
        if (!arrayList.isEmpty()) {
            int i8 = Build.VERSION.SDK_INT;
            Context context = aVar.f1201b;
            if (i8 < 26) {
                LocaleList locales = context.getResources().getConfiguration().getLocales();
                int i9 = 0;
                loop2: while (true) {
                    if (i9 >= locales.size()) {
                        localeLookup = (Locale) arrayList.get(0);
                        break;
                    }
                    Locale locale2 = locales.get(i9);
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            locale = (Locale) it.next();
                            if (locale2.equals(locale)) {
                            }
                        } else {
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    locale = (Locale) it2.next();
                                    if (locale2.getLanguage().equals(locale.toLanguageTag())) {
                                    }
                                } else {
                                    Iterator it3 = arrayList.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            locale = (Locale) it3.next();
                                            if (locale2.getLanguage().equals(locale.getLanguage())) {
                                            }
                                        } else {
                                            i9++;
                                        }
                                    }
                                }
                            }
                        }
                        localeLookup = locale;
                        break loop2;
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            LocaleList locales2 = context.getResources().getConfiguration().getLocales();
            int size = locales2.size();
            for (int i10 = 0; i10 < size; i10++) {
                Locale locale3 = locales2.get(i10);
                String language = locale3.getLanguage();
                if (!locale3.getScript().isEmpty()) {
                    StringBuilder sbD = p136t.e.d(language, "-");
                    sbD.append(locale3.getScript());
                    language = sbD.toString();
                }
                if (!locale3.getCountry().isEmpty()) {
                    StringBuilder sbD2 = p136t.e.d(language, "-");
                    sbD2.append(locale3.getCountry());
                    language = sbD2.toString();
                }
                arrayList2.add(AbstractC0013d.r(language));
                AbstractC0013d.B();
                arrayList2.add(AbstractC0013d.r(locale3.getLanguage()));
                AbstractC0013d.B();
                arrayList2.add(AbstractC0013d.r(locale3.getLanguage() + "-*"));
            }
            localeLookup = Locale.lookup(arrayList2, arrayList);
            if (localeLookup == null) {
                localeLookup = (Locale) arrayList.get(0);
            }
        } else {
            localeLookup = null;
        }
        return localeLookup == null ? new String[0] : new String[]{localeLookup.getLanguage(), localeLookup.getCountry(), localeLookup.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        s sVar = this.platformViewsController;
        if (sVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        C0916d c0916d = new C0916d(sVar.f14195d.getContext(), sVar.f14195d.getWidth(), sVar.f14195d.getHeight(), 2);
        c0916d.f14151x = sVar.f14199h;
        int i7 = sVar.f14205o;
        sVar.f14205o = i7 + 1;
        sVar.f14203m.put(i7, c0916d);
        return new FlutterOverlaySurface(i7, c0916d.getSurface());
    }

    public FlutterOverlaySurface createOverlaySurface2() {
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (rVar.f14188n == null) {
            SurfaceControl.Builder builderI = p043f5.a.i();
            builderI.setBufferSize(rVar.f14179d.getWidth(), rVar.f14179d.getHeight());
            builderI.setFormat(1);
            builderI.setName("Flutter Overlay Surface");
            builderI.setOpaque(false);
            builderI.setHidden(false);
            SurfaceControl surfaceControlBuild = builderI.build();
            SurfaceControl.Transaction transactionBuildReparentTransaction = rVar.f14179d.getRootSurfaceControl().buildReparentTransaction(surfaceControlBuild);
            transactionBuildReparentTransaction.setLayer(surfaceControlBuild, zzbbd.zzq.zzf);
            transactionBuildReparentTransaction.apply();
            rVar.f14188n = p043f5.a.h(surfaceControlBuild);
            rVar.f14189o = surfaceControlBuild;
        }
        return new FlutterOverlaySurface(0, rVar.f14188n);
    }

    public SurfaceControl.Transaction createTransaction() {
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction transactionJ = p043f5.a.j();
        rVar.f14186l.add(transactionJ);
        return transactionJ;
    }

    public void deferredComponentInstallFailure(int i7, String str, boolean z4) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i7, str, z4);
    }

    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        Surface surface = rVar.f14188n;
        if (surface != null) {
            surface.release();
            rVar.f14188n = null;
            rVar.f14189o = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        s sVar = this.platformViewsController;
        if (sVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        sVar.g();
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

    public void dispatchEmptyPlatformMessage(String str, int i7) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i7);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i7);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i7, int i8) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i7, i8);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i8);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i7) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i7);
    }

    public void dispatchSemanticsAction(int i7, d dVar) {
        dispatchSemanticsAction(i7, dVar, null);
    }

    public void endFrame2() {
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction transactionJ = p043f5.a.j();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = rVar.f14187m;
            if (i7 >= arrayList.size()) {
                arrayList.clear();
                rVar.f14179d.invalidate();
                rVar.f14179d.getRootSurfaceControl().applyTransactionOnDraw(transactionJ);
                return;
            }
            transactionJ = transactionJ.merge(p043f5.a.l(arrayList.get(i7)));
            i7++;
        }
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0075  */
    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    /* JADX WARN: Code duplicated, block: B:23:0x0098  */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x0079, please report this as an issue */
    public float getScaledFontSize(float f7, int i7) {
        p174z5.k kVar;
        DisplayMetrics displayMetrics;
        C1050x1 c1050x1 = p174z5.l.f18504b;
        p174z5.k kVar2 = (p174z5.k) c1050x1.f17932c;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c1050x1.f17931b;
        if (kVar2 == null) {
            c1050x1.f17932c = (p174z5.k) concurrentLinkedQueue.poll();
        }
        while (true) {
            kVar = (p174z5.k) c1050x1.f17932c;
            if (kVar == null || kVar.f18502a >= i7) {
                break;
            }
            c1050x1.f17932c = (p174z5.k) concurrentLinkedQueue.poll();
        }
        if (kVar != null) {
            if (kVar.f18502a != i7) {
                Log.e("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i7) + ", the oldest config is now: " + String.valueOf(((p174z5.k) c1050x1.f17932c).f18502a));
            }
            displayMetrics = kVar != null ? kVar.f18503b : null;
            if (displayMetrics == null) {
                return TypedValue.applyDimension(2, f7, displayMetrics) / displayMetrics.density;
            }
            Log.e(TAG, "getScaledFontSize called with configurationId " + String.valueOf(i7) + ", which can't be found.");
            return -1.0f;
        }
        Log.e("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i7) + ", after exhausting the queue.");
        kVar = null;
        if (kVar != null) {
        }
        if (displayMetrics == null) {
            return TypedValue.applyDimension(2, f7, displayMetrics) / displayMetrics.density;
        }
        Log.e(TAG, "getScaledFontSize called with configurationId " + String.valueOf(i7) + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i7, long j) {
        p135s5.e eVar;
        boolean z4;
        j jVar = this.platformMessageHandler;
        if (jVar == null) {
            nativeCleanupMessageData(j);
            return;
        }
        i iVar = (i) jVar;
        synchronized (iVar.f16213d) {
            try {
                eVar = (p135s5.e) iVar.f16211b.get(str);
                z4 = iVar.f16214e.get() && eVar == null;
                if (z4) {
                    if (!iVar.f16212c.containsKey(str)) {
                        iVar.f16212c.put(str, new LinkedList());
                    }
                    ((List) iVar.f16212c.get(str)).add(new c(j, byteBuffer, i7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            return;
        }
        iVar.a(str, eVar, byteBuffer, i7, j);
    }

    public void hideOverlaySurface2() {
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (rVar.f14189o == null) {
            return;
        }
        SurfaceControl.Transaction transactionJ = p043f5.a.j();
        transactionJ.setVisibility(rVar.f14189o, false);
        transactionJ.apply();
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j, int i7) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j, i7);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i7) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i7);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i7);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    public void invokePlatformMessageResponseCallback(int i7, ByteBuffer byteBuffer, int i8) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i7, byteBuffer, i8);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i7);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i7) {
        return nativeFlutterTextUtilsIsEmoji(i7);
    }

    public boolean isCodePointEmojiModifier(int i7) {
        return nativeFlutterTextUtilsIsEmojiModifier(i7);
    }

    public boolean isCodePointEmojiModifierBase(int i7) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i7);
    }

    public boolean isCodePointRegionalIndicator(int i7) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i7);
    }

    public boolean isCodePointVariantSelector(int i7) {
        return nativeFlutterTextUtilsIsVariationSelector(i7);
    }

    public void loadDartDeferredLibrary(int i7, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i7, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.io.Closeable, java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public void loadLibrary(Context context) throws Throwable {
        p028d6.k kVar;
        String[] strArrC;
        ZipFile zipFile;
        InputStream inputStream;
        InputStream inputStream2;
        ?? r16;
        ?? r11;
        ?? r12;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        t tVar = new t(25);
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        t.q0("Beginning load of %s...", "flutter");
        p036e6.c cVar = (p036e6.c) tVar.f8077c;
        HashSet hashSet = (HashSet) tVar.f8076b;
        if (hashSet.contains("flutter")) {
            t.q0("%s already loaded previously!", "flutter");
        } else {
            try {
                cVar.getClass();
                System.loadLibrary("flutter");
                hashSet.add("flutter");
                t.q0("%s (%s) was loaded normally!", "flutter", null);
            } catch (UnsatisfiedLinkError e7) {
                t.q0("Loading the library normally failed: %s", Log.getStackTraceString(e7));
                t.q0("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                ?? I7 = tVar.i0(context);
                if (!I7.exists()) {
                    boolean z4 = false;
                    File dir = context.getDir("lib", 0);
                    File fileI0 = tVar.i0(context);
                    cVar.getClass();
                    File[] fileArrListFiles = dir.listFiles(new C0970b1(2, System.mapLibraryName("flutter")));
                    if (fileArrListFiles != null) {
                        for (File file : fileArrListFiles) {
                            if (!file.getAbsolutePath().equals(fileI0.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    String[] strArr = Build.SUPPORTED_ABIS;
                    if (strArr.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String strMapLibraryName = System.mapLibraryName("flutter");
                    ((p174z5.d) tVar.f8078d).getClass();
                    try {
                        p028d6.k kVarB = p174z5.d.b(context, strArr, strMapLibraryName, tVar);
                        try {
                            if (kVarB == null) {
                                try {
                                    strArrC = p174z5.d.c(context, strMapLibraryName);
                                } catch (Exception e8) {
                                    strArrC = new String[]{e8.toString()};
                                }
                                StringBuilder sbK = p031e1.k.k("Could not find '", strMapLibraryName, "'. Looked for: ");
                                sbK.append(Arrays.toString(strArr));
                                sbK.append(", but only found: ");
                                throw new W(p031e1.k.i(sbK, Arrays.toString(strArrC), "."));
                            }
                            int i7 = 0;
                            while (true) {
                                int i8 = i7 + 1;
                                zipFile = (ZipFile) kVarB.f12447b;
                                if (i7 >= 5) {
                                    break;
                                }
                                t.q0("Found %s! Extracting...", strMapLibraryName);
                                try {
                                    if (I7.exists() || I7.createNewFile()) {
                                        try {
                                            inputStream2 = zipFile.getInputStream((ZipEntry) kVarB.f12448c);
                                            try {
                                                ?? fileOutputStream = new FileOutputStream((File) I7);
                                                try {
                                                    byte[] bArr = new byte[4096];
                                                    long j = 0;
                                                    ?? r8 = z4;
                                                    while (true) {
                                                        int i9 = inputStream2.read(bArr);
                                                        if (i9 == -1) {
                                                            break;
                                                        }
                                                        fileOutputStream.write(bArr, r8, i9);
                                                        j += (long) i9;
                                                        strMapLibraryName = strMapLibraryName;
                                                        r8 = 0;
                                                    }
                                                    fileOutputStream.flush();
                                                    fileOutputStream.getFD().sync();
                                                    if (j == I7.length()) {
                                                        p174z5.d.a(inputStream2);
                                                        p174z5.d.a(fileOutputStream);
                                                        I7.setReadable(true, r8);
                                                        I7.setExecutable(true, r8);
                                                        I7.setWritable(true);
                                                        break;
                                                    }
                                                    p174z5.d.a(inputStream2);
                                                    p174z5.d.a(fileOutputStream);
                                                } catch (FileNotFoundException unused) {
                                                    strMapLibraryName = strMapLibraryName;
                                                    r12 = fileOutputStream;
                                                    p174z5.d.a(inputStream2);
                                                    p174z5.d.a(r12);
                                                    i7 = i8;
                                                    strMapLibraryName = strMapLibraryName;
                                                    z4 = false;
                                                } catch (IOException unused2) {
                                                    strMapLibraryName = strMapLibraryName;
                                                    r11 = fileOutputStream;
                                                    p174z5.d.a(inputStream2);
                                                    p174z5.d.a(r11);
                                                    i7 = i8;
                                                    strMapLibraryName = strMapLibraryName;
                                                    z4 = false;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    inputStream = inputStream2;
                                                    r16 = fileOutputStream;
                                                    p174z5.d.a(inputStream);
                                                    p174z5.d.a(r16);
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException unused3) {
                                                r12 = 0;
                                                p174z5.d.a(inputStream2);
                                                p174z5.d.a(r12);
                                                i7 = i8;
                                                strMapLibraryName = strMapLibraryName;
                                                z4 = false;
                                            } catch (IOException unused4) {
                                                r11 = 0;
                                                p174z5.d.a(inputStream2);
                                                p174z5.d.a(r11);
                                                i7 = i8;
                                                strMapLibraryName = strMapLibraryName;
                                                z4 = false;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                inputStream = inputStream2;
                                                r16 = 0;
                                                p174z5.d.a(inputStream);
                                                p174z5.d.a(r16);
                                                throw th;
                                            }
                                        } catch (FileNotFoundException unused5) {
                                            inputStream2 = null;
                                        } catch (IOException unused6) {
                                            inputStream2 = null;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            inputStream = null;
                                        }
                                    }
                                } catch (IOException unused7) {
                                }
                                strMapLibraryName = strMapLibraryName;
                                i7 = i8;
                                strMapLibraryName = strMapLibraryName;
                                z4 = false;
                            }
                            try {
                                zipFile.close();
                            } catch (IOException unused8) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            kVar = kVarB;
                            if (kVar != null) {
                                try {
                                    ((ZipFile) kVar.f12447b).close();
                                } catch (IOException unused9) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        kVar = null;
                    }
                }
                String absolutePath = I7.getAbsolutePath();
                cVar.getClass();
                System.load(absolutePath);
                hashSet.add("flutter");
                t.q0("%s (%s) was re-linked!", "flutter", null);
            }
        }
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        s sVar = this.platformViewsController;
        if (sVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        sVar.f14208r.clear();
        sVar.f14209s.clear();
    }

    public void onDisplayOverlaySurface(int i7, int i8, int i9, int i10, int i11) {
        ensureRunningOnMainThread();
        s sVar = this.platformViewsController;
        if (sVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = sVar.f14203m;
        if (sparseArray.get(i7) == null) {
            throw new IllegalStateException(AbstractC0486a1.f(i7, "The overlay surface (id:", ") doesn't exist"));
        }
        sVar.k();
        View view = (C0916d) sparseArray.get(i7);
        if (view.getParent() == null) {
            sVar.f14195d.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
        layoutParams.leftMargin = i8;
        layoutParams.topMargin = i9;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        sVar.f14208r.add(Integer.valueOf(i7));
    }

    public void onDisplayPlatformView(int i7, int i8, int i9, int i10, int i11, int i12, int i13, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        s sVar = this.platformViewsController;
        if (sVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        sVar.k();
        SparseArray sparseArray = sVar.f14201k;
        io.flutter.plugin.platform.f fVar = (io.flutter.plugin.platform.f) sparseArray.get(i7);
        if (fVar == null) {
            return;
        }
        SparseArray sparseArray2 = sVar.f14202l;
        if (sparseArray2.get(i7) == null) {
            View view = fVar.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            Activity activity = sVar.f14194c;
            p153v5.a aVar = new p153v5.a(activity, activity.getResources().getDisplayMetrics().density, sVar.f14193b);
            aVar.setOnDescendantFocusChangeListener(new m(sVar, i7, 0));
            sparseArray2.put(i7, aVar);
            view.setImportantForAccessibility(4);
            aVar.addView(view);
            sVar.f14195d.addView(aVar);
        }
        p153v5.a aVar2 = (p153v5.a) sparseArray2.get(i7);
        aVar2.f17211a = flutterMutatorsStack;
        aVar2.f17213c = i8;
        aVar2.f17214d = i9;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
        layoutParams.leftMargin = i8;
        layoutParams.topMargin = i9;
        aVar2.setLayoutParams(layoutParams);
        aVar2.setWillNotDraw(false);
        aVar2.setVisibility(0);
        aVar2.bringToFront();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i12, i13);
        View view2 = ((io.flutter.plugin.platform.f) sparseArray.get(i7)).getView();
        if (view2 != null) {
            view2.setLayoutParams(layoutParams2);
            view2.bringToFront();
        }
        sVar.f14209s.add(Integer.valueOf(i7));
    }

    public void onDisplayPlatformView2(int i7, int i8, int i9, int i10, int i11, int i12, int i13, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        SparseArray sparseArray = rVar.f14184i;
        io.flutter.plugin.platform.f fVar = (io.flutter.plugin.platform.f) sparseArray.get(i7);
        if (fVar == null) {
            return;
        }
        SparseArray sparseArray2 = rVar.j;
        if (sparseArray2.get(i7) == null) {
            View view = fVar.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            Activity activity = rVar.f14178c;
            p153v5.a aVar = new p153v5.a(activity, activity.getResources().getDisplayMetrics().density, rVar.f14177b);
            aVar.setOnDescendantFocusChangeListener(new m(rVar, i7, 1));
            sparseArray2.put(i7, aVar);
            view.setImportantForAccessibility(4);
            aVar.addView(view);
            rVar.f14179d.addView(aVar);
        }
        p153v5.a aVar2 = (p153v5.a) sparseArray2.get(i7);
        aVar2.f17211a = flutterMutatorsStack;
        aVar2.f17213c = i8;
        aVar2.f17214d = i9;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
        layoutParams.leftMargin = i8;
        layoutParams.topMargin = i9;
        aVar2.setLayoutParams(layoutParams);
        aVar2.setWillNotDraw(false);
        aVar2.setVisibility(0);
        aVar2.bringToFront();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i12, i13);
        View view2 = ((io.flutter.plugin.platform.f) sparseArray.get(i7)).getView();
        if (view2 != null) {
            view2.setLayoutParams(layoutParams2);
            view2.bringToFront();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public void onEndFrame() {
        ?? r7;
        ensureRunningOnMainThread();
        s sVar = this.platformViewsController;
        if (sVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z4 = false;
        if (!sVar.f14206p || !sVar.f14209s.isEmpty()) {
            if (sVar.f14206p) {
                p121q5.g gVar = sVar.f14195d.f15936c;
                if (gVar != null ? gVar.c() : false) {
                    z4 = true;
                }
            }
            sVar.i(z4);
            return;
        }
        sVar.f14206p = false;
        p121q5.m mVar = sVar.f14195d;
        K0 k7 = new K0(sVar, 29);
        p121q5.g gVar2 = mVar.f15936c;
        if (gVar2 == null || (r7 = mVar.f15938e) == 0) {
            return;
        }
        mVar.f15937d = r7;
        mVar.f15938e = null;
        io.flutter.embedding.engine.renderer.k kVar = mVar.f15941y.f16038b;
        if (kVar != null) {
            r7.resume();
            p121q5.l lVar = new p121q5.l(mVar, kVar, k7);
            kVar.f14112a.addIsDisplayingFlutterUiListener(lVar);
            if (kVar.f14115d) {
                lVar.b();
                return;
            }
            return;
        }
        gVar2.b();
        p121q5.g gVar3 = mVar.f15936c;
        if (gVar3 != null) {
            gVar3.f15900a.close();
            mVar.removeView(mVar.f15936c);
            mVar.f15936c = null;
        }
        k7.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<l> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<l> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void onSurfaceChanged(int i7, int i8) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i7, i8);
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

    public void onVsync(long j, long j3, long j7) {
        nativeOnVsync(j, j3, j7);
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

    public void registerImageTexture(long j, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j, new WeakReference<>(textureRegistry$ImageConsumer), z4);
    }

    public void registerTexture(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(p128r5.a aVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(aVar);
    }

    public void removeIsDisplayingFlutterUiListener(l lVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(lVar);
    }

    public void requestDartDeferredLibrary(int i7) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(f fVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = fVar;
    }

    public void setAccessibilityFeatures(int i7) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i7);
        }
    }

    public void setAccessibilityFeaturesInNative(int i7) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i7);
    }

    public void setAsyncWaitForVsyncDelegate(g gVar) {
        asyncWaitForVsyncDelegate = gVar;
    }

    public void setDeferredComponentManager(a aVar) {
        ensureRunningOnMainThread();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setLocalizationPlugin(B5.a aVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = aVar;
    }

    public void setPlatformMessageHandler(j jVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = jVar;
    }

    public void setPlatformViewsController(s sVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = sVar;
    }

    public void setPlatformViewsController2(r rVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = rVar;
    }

    public void setRefreshRateFPS(float f7) {
        refreshRateFPS = f7;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z4);
        }
    }

    public void setSemanticsEnabledInNative(boolean z4) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z4);
    }

    public void setViewportMetrics(float f7, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f7, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, iArr, iArr2, iArr3);
    }

    public void showOverlaySurface2() {
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (rVar.f14189o == null) {
            return;
        }
        SurfaceControl.Transaction transactionJ = p043f5.a.j();
        transactionJ.setVisibility(rVar.f14189o, true);
        transactionJ.apply();
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI flutterJNINativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j);
        Long l7 = flutterJNINativeSpawn.nativeShellHolderId;
        if ((l7 == null || l7.longValue() == 0) ? false : true) {
            return flutterJNINativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    public void swapTransactions() {
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException("");
        }
        synchronized (rVar) {
            try {
                rVar.f14187m.clear();
                for (int i7 = 0; i7 < rVar.f14186l.size(); i7++) {
                    rVar.f14187m.add(p043f5.a.l(rVar.f14186l.get(i7)));
                }
                rVar.f14186l.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unregisterTexture(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j);
    }

    public void updateDisplayMetrics(int i7, float f7, float f8, float f9) {
        displayWidth = f7;
        displayHeight = f8;
        displayDensity = f9;
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

    public void dispatchSemanticsAction(int i7, d dVar, Object obj) {
        ByteBuffer byteBufferA;
        int iPosition;
        ensureAttachedToNative();
        if (obj != null) {
            byteBufferA = x.f685a.a(obj);
            iPosition = byteBufferA.position();
        } else {
            byteBufferA = null;
            iPosition = 0;
        }
        dispatchSemanticsAction(i7, dVar.f14257a, byteBufferA, iPosition);
    }

    public void dispatchSemanticsAction(int i7, int i8, ByteBuffer byteBuffer, int i9) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i7, i8, byteBuffer, i9);
    }
}
