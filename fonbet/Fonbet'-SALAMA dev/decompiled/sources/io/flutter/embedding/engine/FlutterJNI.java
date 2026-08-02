package io.flutter.embedding.engine;

import A1.AbstractC0013d;
import A1.K0;
import A1.W;
import A5.e;
import A5.x;
import B5.a;
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
import android.view.AttachedSurfaceControl;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import com.google.android.gms.internal.ads.zzbbd;
import d6.C0977k;
import e6.C1054c;
import f5.AbstractC1101a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.l;
import io.flutter.plugin.platform.C1297d;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.m;
import io.flutter.plugin.platform.r;
import io.flutter.plugin.platform.s;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.d;
import io.flutter.view.k;
import io.flutter.view.q;
import java.io.Closeable;
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
import q5.C1563g;
import r5.InterfaceC1576a;
import r5.InterfaceC1581f;
import r5.InterfaceC1582g;
import s5.C1601c;
import s5.i;
import s5.j;
import t5.InterfaceC1611a;
import v5.C1667a;
import w1.C1679b1;
import w1.C1759x1;
import z5.C1822d;

@Keep
/* loaded from: classes2.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static InterfaceC1582g asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private InterfaceC1581f accessibilityDelegate;
    private InterfaceC1611a deferredComponentManager;
    private a localizationPlugin;
    private Long nativeShellHolderId;
    private j platformMessageHandler;
    private s platformViewsController;
    private r platformViewsController2;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<InterfaceC1576a> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<l> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j) {
        InterfaceC1582g interfaceC1582g = asyncWaitForVsyncDelegate;
        if (interfaceC1582g == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        io.flutter.view.a aVar = (io.flutter.view.a) interfaceC1582g;
        aVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        io.flutter.view.r rVar = (io.flutter.view.r) aVar.f14224a;
        q qVar = (q) rVar.f14352c;
        if (qVar != null) {
            qVar.f14346a = j;
            rVar.f14352c = null;
        } else {
            qVar = new q(rVar, j);
        }
        choreographer.postFrameCallback(qVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [r5.e] */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, final long j) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        if (Build.VERSION.SDK_INT >= 28) {
            createSource = ImageDecoder.createSource(byteBuffer);
            try {
                decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: r5.e
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        FlutterJNI.lambda$decodeImage$0(j, imageDecoder, imageInfo, source);
                    }
                });
                return decodeBitmap;
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
        if (jVar == null || (eVar = (e) ((i) jVar).f16209f.remove(Integer.valueOf(i7))) == null) {
            return;
        }
        try {
            eVar.a(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (Error e7) {
            Thread currentThread = Thread.currentThread();
            if (currentThread.getUncaughtExceptionHandler() == null) {
                throw e7;
            }
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e7);
        } catch (Exception e8) {
            Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$0(long j, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Size size;
        named = ColorSpace.Named.SRGB;
        colorSpace = ColorSpace.get(named);
        imageDecoder.setTargetColorSpace(colorSpace);
        imageDecoder.setAllocator(1);
        size = imageInfo.getSize();
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
        Iterator<InterfaceC1576a> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        InterfaceC1581f interfaceC1581f = this.accessibilityDelegate;
        if (interfaceC1581f != null) {
            io.flutter.view.a aVar = (io.flutter.view.a) interfaceC1581f;
            aVar.getClass();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            k kVar = (k) aVar.f14224a;
            kVar.getClass();
            while (byteBuffer.hasRemaining()) {
                io.flutter.view.e b7 = kVar.b(byteBuffer.getInt());
                b7.f14254c = byteBuffer.getInt();
                int i7 = byteBuffer.getInt();
                String str = null;
                b7.f14255d = i7 == -1 ? null : strArr[i7];
                int i8 = byteBuffer.getInt();
                if (i8 != -1) {
                    str = strArr[i8];
                }
                b7.f14256e = str;
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        InterfaceC1581f interfaceC1581f = this.accessibilityDelegate;
        if (interfaceC1581f != null) {
            ((io.flutter.view.a) interfaceC1581f).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(InterfaceC1576a interfaceC1576a) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(interfaceC1576a);
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
        SurfaceControl.Transaction j = AbstractC1101a.j();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = rVar.f14180l;
            if (i7 >= arrayList.size()) {
                j.apply();
                arrayList.clear();
                return;
            } else {
                j = j.merge(AbstractC1101a.l(arrayList.get(i7)));
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

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0125, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012d, code lost:
    
        if (r4.hasNext() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012f, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0141, code lost:
    
        if (r3.getLanguage().equals(r5.toLanguageTag()) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0144, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014c, code lost:
    
        if (r4.hasNext() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014e, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0160, code lost:
    
        if (r3.getLanguage().equals(r5.getLanguage()) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0163, code lost:
    
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
        a aVar = this.localizationPlugin;
        aVar.getClass();
        if (arrayList.isEmpty()) {
            locale = null;
        } else {
            int i8 = Build.VERSION.SDK_INT;
            Context context = aVar.f1201b;
            if (i8 >= 26) {
                ArrayList arrayList2 = new ArrayList();
                LocaleList locales = context.getResources().getConfiguration().getLocales();
                int size = locales.size();
                for (int i9 = 0; i9 < size; i9++) {
                    Locale locale3 = locales.get(i9);
                    String language = locale3.getLanguage();
                    if (!locale3.getScript().isEmpty()) {
                        StringBuilder d7 = t.e.d(language, "-");
                        d7.append(locale3.getScript());
                        language = d7.toString();
                    }
                    if (!locale3.getCountry().isEmpty()) {
                        StringBuilder d8 = t.e.d(language, "-");
                        d8.append(locale3.getCountry());
                        language = d8.toString();
                    }
                    arrayList2.add(AbstractC0013d.r(language));
                    AbstractC0013d.B();
                    arrayList2.add(AbstractC0013d.r(locale3.getLanguage()));
                    AbstractC0013d.B();
                    arrayList2.add(AbstractC0013d.r(locale3.getLanguage() + "-*"));
                }
                locale = Locale.lookup(arrayList2, arrayList);
                if (locale == null) {
                    locale = (Locale) arrayList.get(0);
                }
            } else {
                LocaleList locales2 = context.getResources().getConfiguration().getLocales();
                int i10 = 0;
                loop2: while (i10 < locales2.size()) {
                    Locale locale4 = locales2.get(i10);
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        locale2 = (Locale) it.next();
                        if (locale4.equals(locale2)) {
                            break loop2;
                        }
                    }
                    locale = locale2;
                }
                locale = (Locale) arrayList.get(0);
            }
        }
        return locale == null ? new String[0] : new String[]{locale.getLanguage(), locale.getCountry(), locale.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        s sVar = this.platformViewsController;
        if (sVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        C1297d c1297d = new C1297d(sVar.f14189d.getContext(), sVar.f14189d.getWidth(), sVar.f14189d.getHeight(), 2);
        c1297d.f14145x = sVar.f14193h;
        int i7 = sVar.f14199o;
        sVar.f14199o = i7 + 1;
        sVar.f14197m.put(i7, c1297d);
        return new FlutterOverlaySurface(i7, c1297d.getSurface());
    }

    public FlutterOverlaySurface createOverlaySurface2() {
        SurfaceControl build;
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction buildReparentTransaction;
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (rVar.f14182n == null) {
            SurfaceControl.Builder i7 = AbstractC1101a.i();
            i7.setBufferSize(rVar.f14173d.getWidth(), rVar.f14173d.getHeight());
            i7.setFormat(1);
            i7.setName("Flutter Overlay Surface");
            i7.setOpaque(false);
            i7.setHidden(false);
            build = i7.build();
            rootSurfaceControl = rVar.f14173d.getRootSurfaceControl();
            buildReparentTransaction = rootSurfaceControl.buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, zzbbd.zzq.zzf);
            buildReparentTransaction.apply();
            rVar.f14182n = AbstractC1101a.h(build);
            rVar.f14183o = build;
        }
        return new FlutterOverlaySurface(0, rVar.f14182n);
    }

    public SurfaceControl.Transaction createTransaction() {
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction j = AbstractC1101a.j();
        rVar.f14180l.add(j);
        return j;
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
        Surface surface = rVar.f14182n;
        if (surface != null) {
            surface.release();
            rVar.f14182n = null;
            rVar.f14183o = null;
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
        AttachedSurfaceControl rootSurfaceControl;
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction j = AbstractC1101a.j();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = rVar.f14181m;
            if (i7 >= arrayList.size()) {
                arrayList.clear();
                rVar.f14173d.invalidate();
                rootSurfaceControl = rVar.f14173d.getRootSurfaceControl();
                rootSurfaceControl.applyTransactionOnDraw(j);
                return;
            }
            j = j.merge(AbstractC1101a.l(arrayList.get(i7)));
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float getScaledFontSize(float f7, int i7) {
        z5.k kVar;
        DisplayMetrics displayMetrics;
        C1759x1 c1759x1 = z5.l.f18498b;
        z5.k kVar2 = (z5.k) c1759x1.f17926c;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c1759x1.f17925b;
        if (kVar2 == null) {
            c1759x1.f17926c = (z5.k) concurrentLinkedQueue.poll();
        }
        while (true) {
            kVar = (z5.k) c1759x1.f17926c;
            if (kVar == null || kVar.f18496a >= i7) {
                break;
            }
            c1759x1.f17926c = (z5.k) concurrentLinkedQueue.poll();
        }
        if (kVar != null) {
            if (kVar.f18496a != i7) {
                Log.e("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i7) + ", the oldest config is now: " + String.valueOf(((z5.k) c1759x1.f17926c).f18496a));
            }
            displayMetrics = kVar != null ? kVar.f18497b : null;
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
        }
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i7, long j) {
        s5.e eVar;
        boolean z4;
        j jVar = this.platformMessageHandler;
        if (jVar == null) {
            nativeCleanupMessageData(j);
            return;
        }
        i iVar = (i) jVar;
        synchronized (iVar.f16207d) {
            try {
                eVar = (s5.e) iVar.f16205b.get(str);
                z4 = iVar.f16208e.get() && eVar == null;
                if (z4) {
                    if (!iVar.f16206c.containsKey(str)) {
                        iVar.f16206c.put(str, new LinkedList());
                    }
                    ((List) iVar.f16206c.get(str)).add(new C1601c(j, byteBuffer, i7));
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
        if (rVar.f14183o == null) {
            return;
        }
        SurfaceControl.Transaction j = AbstractC1101a.j();
        j.setVisibility(rVar.f14183o, false);
        j.apply();
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
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
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
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
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
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public void loadLibrary(Context context) {
        C0977k c0977k;
        String[] strArr;
        ZipFile zipFile;
        String str;
        InputStream inputStream;
        InputStream inputStream2;
        Closeable closeable;
        Closeable closeable2;
        Closeable closeable3;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        t tVar = new t(25);
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        t.q0("Beginning load of %s...", "flutter");
        C1054c c1054c = (C1054c) tVar.f8077c;
        HashSet hashSet = (HashSet) tVar.f8076b;
        if (hashSet.contains("flutter")) {
            t.q0("%s already loaded previously!", "flutter");
        } else {
            try {
                c1054c.getClass();
                System.loadLibrary("flutter");
                hashSet.add("flutter");
                t.q0("%s (%s) was loaded normally!", "flutter", null);
            } catch (UnsatisfiedLinkError e7) {
                t.q0("Loading the library normally failed: %s", Log.getStackTraceString(e7));
                t.q0("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                File i02 = tVar.i0(context);
                if (!i02.exists()) {
                    boolean z4 = false;
                    File dir = context.getDir("lib", 0);
                    File i03 = tVar.i0(context);
                    c1054c.getClass();
                    File[] listFiles = dir.listFiles(new C1679b1(2, System.mapLibraryName("flutter")));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(i03.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    String[] strArr2 = Build.SUPPORTED_ABIS;
                    if (strArr2.length <= 0) {
                        String str2 = Build.CPU_ABI2;
                        strArr2 = (str2 == null || str2.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str2};
                    }
                    String mapLibraryName = System.mapLibraryName("flutter");
                    ((C1822d) tVar.f8078d).getClass();
                    try {
                        C0977k b7 = C1822d.b(context, strArr2, mapLibraryName, tVar);
                        try {
                            if (b7 == null) {
                                try {
                                    strArr = C1822d.c(context, mapLibraryName);
                                } catch (Exception e8) {
                                    strArr = new String[]{e8.toString()};
                                }
                                StringBuilder k7 = e1.k.k("Could not find '", mapLibraryName, "'. Looked for: ");
                                k7.append(Arrays.toString(strArr2));
                                k7.append(", but only found: ");
                                throw new W(e1.k.i(k7, Arrays.toString(strArr), "."));
                            }
                            int i7 = 0;
                            while (true) {
                                int i8 = i7 + 1;
                                zipFile = (ZipFile) b7.f12441b;
                                if (i7 < 5) {
                                    t.q0("Found %s! Extracting...", mapLibraryName);
                                    try {
                                        if (i02.exists() || i02.createNewFile()) {
                                            try {
                                                inputStream2 = zipFile.getInputStream((ZipEntry) b7.f12442c);
                                            } catch (FileNotFoundException unused) {
                                                str = mapLibraryName;
                                                inputStream2 = null;
                                            } catch (IOException unused2) {
                                                str = mapLibraryName;
                                                inputStream2 = null;
                                            } catch (Throwable th) {
                                                th = th;
                                                inputStream = null;
                                            }
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(i02);
                                                try {
                                                    byte[] bArr = new byte[4096];
                                                    long j = 0;
                                                    ?? r8 = z4;
                                                    while (true) {
                                                        int read = inputStream2.read(bArr);
                                                        if (read == -1) {
                                                            break;
                                                        }
                                                        fileOutputStream.write(bArr, r8, read);
                                                        j += read;
                                                        mapLibraryName = mapLibraryName;
                                                        r8 = 0;
                                                    }
                                                    fileOutputStream.flush();
                                                    fileOutputStream.getFD().sync();
                                                    if (j == i02.length()) {
                                                        C1822d.a(inputStream2);
                                                        C1822d.a(fileOutputStream);
                                                        i02.setReadable(true, r8);
                                                        i02.setExecutable(true, r8);
                                                        i02.setWritable(true);
                                                        break;
                                                    }
                                                    C1822d.a(inputStream2);
                                                    C1822d.a(fileOutputStream);
                                                } catch (FileNotFoundException unused3) {
                                                    str = mapLibraryName;
                                                    closeable3 = fileOutputStream;
                                                    C1822d.a(inputStream2);
                                                    C1822d.a(closeable3);
                                                    i7 = i8;
                                                    mapLibraryName = str;
                                                    z4 = false;
                                                } catch (IOException unused4) {
                                                    str = mapLibraryName;
                                                    closeable2 = fileOutputStream;
                                                    C1822d.a(inputStream2);
                                                    C1822d.a(closeable2);
                                                    i7 = i8;
                                                    mapLibraryName = str;
                                                    z4 = false;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    inputStream = inputStream2;
                                                    closeable = fileOutputStream;
                                                    C1822d.a(inputStream);
                                                    C1822d.a(closeable);
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException unused5) {
                                                str = mapLibraryName;
                                                closeable3 = null;
                                                C1822d.a(inputStream2);
                                                C1822d.a(closeable3);
                                                i7 = i8;
                                                mapLibraryName = str;
                                                z4 = false;
                                            } catch (IOException unused6) {
                                                str = mapLibraryName;
                                                closeable2 = null;
                                                C1822d.a(inputStream2);
                                                C1822d.a(closeable2);
                                                i7 = i8;
                                                mapLibraryName = str;
                                                z4 = false;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                                closeable = null;
                                                C1822d.a(inputStream);
                                                C1822d.a(closeable);
                                                throw th;
                                            }
                                        }
                                    } catch (IOException unused7) {
                                    }
                                    str = mapLibraryName;
                                    i7 = i8;
                                    mapLibraryName = str;
                                    z4 = false;
                                }
                            }
                            try {
                                zipFile.close();
                                break;
                            } catch (IOException unused8) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            c0977k = b7;
                            if (c0977k != null) {
                                try {
                                    ((ZipFile) c0977k.f12441b).close();
                                } catch (IOException unused9) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        c0977k = null;
                    }
                }
                String absolutePath = i02.getAbsolutePath();
                c1054c.getClass();
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
        sVar.f14202r.clear();
        sVar.f14203s.clear();
    }

    public void onDisplayOverlaySurface(int i7, int i8, int i9, int i10, int i11) {
        ensureRunningOnMainThread();
        s sVar = this.platformViewsController;
        if (sVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = sVar.f14197m;
        if (sparseArray.get(i7) == null) {
            throw new IllegalStateException(AbstractC0486a1.f(i7, "The overlay surface (id:", ") doesn't exist"));
        }
        sVar.k();
        View view = (C1297d) sparseArray.get(i7);
        if (view.getParent() == null) {
            sVar.f14189d.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
        layoutParams.leftMargin = i8;
        layoutParams.topMargin = i9;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        sVar.f14202r.add(Integer.valueOf(i7));
    }

    public void onDisplayPlatformView(int i7, int i8, int i9, int i10, int i11, int i12, int i13, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        s sVar = this.platformViewsController;
        if (sVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        sVar.k();
        SparseArray sparseArray = sVar.f14195k;
        f fVar = (f) sparseArray.get(i7);
        if (fVar == null) {
            return;
        }
        SparseArray sparseArray2 = sVar.f14196l;
        if (sparseArray2.get(i7) == null) {
            View view = fVar.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            Activity activity = sVar.f14188c;
            C1667a c1667a = new C1667a(activity, activity.getResources().getDisplayMetrics().density, sVar.f14187b);
            c1667a.setOnDescendantFocusChangeListener(new m(sVar, i7, 0));
            sparseArray2.put(i7, c1667a);
            view.setImportantForAccessibility(4);
            c1667a.addView(view);
            sVar.f14189d.addView(c1667a);
        }
        C1667a c1667a2 = (C1667a) sparseArray2.get(i7);
        c1667a2.f17205a = flutterMutatorsStack;
        c1667a2.f17207c = i8;
        c1667a2.f17208d = i9;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
        layoutParams.leftMargin = i8;
        layoutParams.topMargin = i9;
        c1667a2.setLayoutParams(layoutParams);
        c1667a2.setWillNotDraw(false);
        c1667a2.setVisibility(0);
        c1667a2.bringToFront();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i12, i13);
        View view2 = ((f) sparseArray.get(i7)).getView();
        if (view2 != null) {
            view2.setLayoutParams(layoutParams2);
            view2.bringToFront();
        }
        sVar.f14203s.add(Integer.valueOf(i7));
    }

    public void onDisplayPlatformView2(int i7, int i8, int i9, int i10, int i11, int i12, int i13, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        r rVar = this.platformViewsController2;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        SparseArray sparseArray = rVar.f14178i;
        f fVar = (f) sparseArray.get(i7);
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
            Activity activity = rVar.f14172c;
            C1667a c1667a = new C1667a(activity, activity.getResources().getDisplayMetrics().density, rVar.f14171b);
            c1667a.setOnDescendantFocusChangeListener(new m(rVar, i7, 1));
            sparseArray2.put(i7, c1667a);
            view.setImportantForAccessibility(4);
            c1667a.addView(view);
            rVar.f14173d.addView(c1667a);
        }
        C1667a c1667a2 = (C1667a) sparseArray2.get(i7);
        c1667a2.f17205a = flutterMutatorsStack;
        c1667a2.f17207c = i8;
        c1667a2.f17208d = i9;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
        layoutParams.leftMargin = i8;
        layoutParams.topMargin = i9;
        c1667a2.setLayoutParams(layoutParams);
        c1667a2.setWillNotDraw(false);
        c1667a2.setVisibility(0);
        c1667a2.bringToFront();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i12, i13);
        View view2 = ((f) sparseArray.get(i7)).getView();
        if (view2 != null) {
            view2.setLayoutParams(layoutParams2);
            view2.bringToFront();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public void onEndFrame() {
        ?? r32;
        ensureRunningOnMainThread();
        s sVar = this.platformViewsController;
        if (sVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z4 = false;
        if (!sVar.f14200p || !sVar.f14203s.isEmpty()) {
            if (sVar.f14200p) {
                C1563g c1563g = sVar.f14189d.f15930c;
                if (c1563g != null ? c1563g.c() : false) {
                    z4 = true;
                }
            }
            sVar.i(z4);
            return;
        }
        sVar.f14200p = false;
        q5.m mVar = sVar.f14189d;
        K0 k02 = new K0(sVar, 29);
        C1563g c1563g2 = mVar.f15930c;
        if (c1563g2 == null || (r32 = mVar.f15932e) == 0) {
            return;
        }
        mVar.f15931d = r32;
        mVar.f15932e = null;
        io.flutter.embedding.engine.renderer.k kVar = mVar.f15935y.f16032b;
        if (kVar != null) {
            r32.resume();
            q5.l lVar = new q5.l(mVar, kVar, k02);
            kVar.f14106a.addIsDisplayingFlutterUiListener(lVar);
            if (kVar.f14109d) {
                lVar.b();
                return;
            }
            return;
        }
        c1563g2.b();
        C1563g c1563g3 = mVar.f15930c;
        if (c1563g3 != null) {
            c1563g3.f15894a.close();
            mVar.removeView(mVar.f15930c);
            mVar.f15930c = null;
        }
        k02.run();
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

    public void removeEngineLifecycleListener(InterfaceC1576a interfaceC1576a) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(interfaceC1576a);
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

    public void setAccessibilityDelegate(InterfaceC1581f interfaceC1581f) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = interfaceC1581f;
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

    public void setAsyncWaitForVsyncDelegate(InterfaceC1582g interfaceC1582g) {
        asyncWaitForVsyncDelegate = interfaceC1582g;
    }

    public void setDeferredComponentManager(InterfaceC1611a interfaceC1611a) {
        ensureRunningOnMainThread();
        if (interfaceC1611a != null) {
            interfaceC1611a.a();
        }
    }

    public void setLocalizationPlugin(a aVar) {
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
        if (rVar.f14183o == null) {
            return;
        }
        SurfaceControl.Transaction j = AbstractC1101a.j();
        j.setVisibility(rVar.f14183o, true);
        j.apply();
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j);
        Long l7 = nativeSpawn.nativeShellHolderId;
        if ((l7 == null || l7.longValue() == 0) ? false : true) {
            return nativeSpawn;
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
                rVar.f14181m.clear();
                for (int i7 = 0; i7 < rVar.f14180l.size(); i7++) {
                    rVar.f14181m.add(AbstractC1101a.l(rVar.f14180l.get(i7)));
                }
                rVar.f14180l.clear();
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
        ByteBuffer byteBuffer;
        int i8;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = x.f685a.a(obj);
            i8 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i8 = 0;
        }
        dispatchSemanticsAction(i7, dVar.f14251a, byteBuffer, i8);
    }

    public void dispatchSemanticsAction(int i7, int i8, ByteBuffer byteBuffer, int i9) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i7, i8, byteBuffer, i9);
    }
}
