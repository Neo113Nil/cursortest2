package io.flutter.embedding.engine;

import G0.m;
import H0.f;
import I1.AbstractActivityC0027d;
import I1.C0031h;
import I1.o;
import J1.b;
import J1.i;
import J1.j;
import J1.k;
import L1.a;
import M1.d;
import O.g;
import S1.l;
import T1.e;
import Y1.C0077a;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
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
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.plugin.platform.C1047c;
import io.flutter.plugin.platform.p;
import io.flutter.plugin.platform.q;
import io.flutter.plugin.platform.r;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.c;
import io.flutter.view.h;
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
import q0.C1170a;

/* loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static k asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private j accessibilityDelegate;
    private a deferredComponentManager;
    private U1.a localizationPlugin;
    private Long nativeShellHolderId;
    private K1.j platformMessageHandler;
    private r platformViewsController;
    private q platformViewsController2;
    private l settingsChannel;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<io.flutter.embedding.engine.renderer.k> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Set<io.flutter.embedding.engine.renderer.l> flutterUiResizeListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j3) {
        k kVar = asyncWaitForVsyncDelegate;
        if (kVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        c cVar = (c) kVar;
        cVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        t tVar = (t) cVar.f9340a;
        s sVar = tVar.f9468c;
        if (sVar != null) {
            sVar.f9463a = j3;
            tVar.f9468c = null;
        } else {
            sVar = new s(tVar, j3);
        }
        choreographer.postFrameCallback(sVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, long j3) {
        M1.b bVar;
        i iVar = 0;
        iVar = 0;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        f fVar = new f(j3);
        d dVar = new d();
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        byteBuffer.rewind();
        int i3 = 1;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
            dVar.f975d = options.outMimeType;
            dVar.f = options.outHeight;
            dVar.f977g = options.outWidth;
        } catch (Exception e3) {
            Log.e("BitmapMetadataReader", "Failed to decode image for mime type", e3);
        }
        if ("image/heif".equals(dVar.f975d)) {
            try {
                M1.c cVar = new M1.c(bArr);
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(cVar);
                F2.b.D(dVar, mediaExtractor);
            } catch (Exception e4) {
                Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e4);
            }
            nativeImageHeaderCallback(fVar.f495a, dVar.f972a, dVar.f973b);
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    g gVar = new g(byteArrayInputStream);
                    O.c c3 = gVar.c("Orientation");
                    if (c3 != null) {
                        try {
                            i3 = c3.e(gVar.f);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    dVar.f976e = i3;
                    byteArrayInputStream.close();
                } finally {
                }
            } catch (IOException e5) {
                Log.e("ExifMetadataReader", "Failed to read EXIF metadata", e5);
            }
        }
        if ("image/heif".equals(dVar.f975d)) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 == 36) {
                bVar = new M1.b(iVar, 0);
            } else if (i4 < 36) {
                bVar = new M1.b(iVar, 1);
            }
            iVar = bVar;
        }
        if (iVar == 0) {
            iVar = new i(9, fVar);
        }
        return iVar.t(byteBuffer, dVar);
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

    private void handlePlatformMessageResponse(int i3, ByteBuffer byteBuffer) {
        e eVar;
        K1.j jVar = this.platformMessageHandler;
        if (jVar == null || (eVar = (e) ((K1.i) jVar).f.remove(Integer.valueOf(i3))) == null) {
            return;
        }
        try {
            eVar.a(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (Error e3) {
            Thread currentThread = Thread.currentThread();
            if (currentThread.getUncaughtExceptionHandler() == null) {
                throw e3;
            }
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e3);
        } catch (Exception e4) {
            Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadLibrary$0(String str) {
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j3);

    private native void nativeDeferredComponentInstallFailure(int i3, String str, boolean z3);

    private native void nativeDestroy(long j3);

    private native void nativeDispatchEmptyPlatformMessage(long j3, String str, int i3);

    private native void nativeDispatchPlatformMessage(long j3, String str, ByteBuffer byteBuffer, int i3, int i4);

    private native void nativeDispatchPointerDataPacket(long j3, ByteBuffer byteBuffer, int i3);

    private native void nativeDispatchSemanticsAction(long j3, int i3, int i4, ByteBuffer byteBuffer, int i5);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i3);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i3);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i3);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i3);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i3);

    private native Bitmap nativeGetBitmap(long j3);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j3, int i3, int i4);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j3, int i3);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j3, int i3);

    private native void nativeInvokePlatformMessageResponseCallback(long j3, int i3, ByteBuffer byteBuffer, int i4);

    private native boolean nativeIsSurfaceControlEnabled(long j3);

    private native void nativeLoadDartDeferredLibrary(long j3, int i3, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j3);

    private native void nativeMarkTextureFrameAvailable(long j3, long j4);

    private native void nativeNotifyLowMemoryWarning(long j3);

    private native void nativeOnVsync(long j3, long j4, long j5);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j3, long j4, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z3);

    private native void nativeRegisterTexture(long j3, long j4, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j3, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j4);

    private native void nativeScheduleFrame(long j3);

    private native void nativeSetAccessibilityFeatures(long j3, int i3);

    private native void nativeSetSemanticsEnabled(long j3, boolean z3);

    private native void nativeSetViewportMetrics(long j3, float f, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, int[] iArr3, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25);

    private native FlutterJNI nativeSpawn(long j3, String str, String str2, String str3, List<String> list, long j4);

    private native void nativeSurfaceChanged(long j3, int i3, int i4);

    private native void nativeSurfaceCreated(long j3, Surface surface);

    private native void nativeSurfaceDestroyed(long j3);

    private native void nativeSurfaceWindowChanged(long j3, Surface surface);

    private native void nativeUnregisterTexture(long j3, long j4);

    private native void nativeUpdateDisplayMetrics(long j3);

    private native void nativeUpdateJavaAssetManager(long j3, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f);

    private void onPreEngineRestart() {
        Iterator<b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private void setApplicationLocale(String str) {
        ensureRunningOnMainThread();
        j jVar = this.accessibilityDelegate;
        if (jVar != null) {
            ((io.flutter.view.i) ((c) jVar).f9340a).f9438m = str;
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        j jVar = this.accessibilityDelegate;
        if (jVar != null) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            io.flutter.view.i iVar = (io.flutter.view.i) ((c) jVar).f9340a;
            iVar.getClass();
            while (byteBuffer.hasRemaining()) {
                io.flutter.view.g b3 = iVar.b(byteBuffer.getInt());
                b3.f9370c = byteBuffer.getInt();
                b3.f9371d = io.flutter.view.i.d(byteBuffer, strArr);
                b3.f9372e = io.flutter.view.i.d(byteBuffer, strArr);
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        j jVar = this.accessibilityDelegate;
        if (jVar != null) {
            ((c) jVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.k kVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(kVar);
    }

    public void addResizingFlutterUiListener(io.flutter.embedding.engine.renderer.l lVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.add(lVar);
    }

    public void applyTransactions() {
        q qVar = this.platformViewsController2;
        if (qVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction g3 = io.flutter.plugin.editing.b.g();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = qVar.f9294l;
            if (i3 >= arrayList.size()) {
                g3.apply();
                arrayList.clear();
                return;
            } else {
                g3 = g3.merge(io.flutter.plugin.editing.b.j(arrayList.get(i3)));
                i3++;
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

    public void cleanupMessageData(long j3) {
        nativeCleanupMessageData(j3);
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
    public String[] computePlatformResolvedLocale(String[] strArr) {
        Locale locale;
        Locale locale2;
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < strArr.length; i3 += 3) {
            String str = strArr[i3];
            String str2 = strArr[i3 + 1];
            String str3 = strArr[i3 + 2];
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
        U1.a aVar = this.localizationPlugin;
        aVar.getClass();
        if (arrayList.isEmpty()) {
            locale2 = null;
        } else {
            int i4 = Build.VERSION.SDK_INT;
            AbstractActivityC0027d abstractActivityC0027d = aVar.f1598b;
            if (i4 >= 26) {
                ArrayList arrayList2 = new ArrayList();
                LocaleList locales = abstractActivityC0027d.getResources().getConfiguration().getLocales();
                int size = locales.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Locale locale3 = locales.get(i5);
                    String language = locale3.getLanguage();
                    if (!locale3.getScript().isEmpty()) {
                        language = language + TokenBuilder.TOKEN_DELIMITER + locale3.getScript();
                    }
                    if (!locale3.getCountry().isEmpty()) {
                        language = language + TokenBuilder.TOKEN_DELIMITER + locale3.getCountry();
                    }
                    arrayList2.add(A1.a.s(language));
                    A1.a.D();
                    arrayList2.add(A1.a.s(locale3.getLanguage()));
                    A1.a.D();
                    arrayList2.add(A1.a.s(locale3.getLanguage() + "-*"));
                }
                locale2 = Locale.lookup(arrayList2, arrayList);
            } else {
                LocaleList locales2 = abstractActivityC0027d.getResources().getConfiguration().getLocales();
                int i6 = 0;
                loop2: while (i6 < locales2.size()) {
                    Locale locale4 = locales2.get(i6);
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        locale = (Locale) it.next();
                        if (locale4.equals(locale)) {
                            break loop2;
                        }
                    }
                    locale2 = locale;
                }
                locale2 = (Locale) arrayList.get(0);
            }
        }
        return locale2 == null ? new String[0] : new String[]{locale2.getLanguage(), locale2.getCountry(), locale2.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        r rVar = this.platformViewsController;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        C1047c c1047c = new C1047c(rVar.f9304d.getContext(), rVar.f9304d.getWidth(), rVar.f9304d.getHeight(), 2);
        c1047c.f9251h = rVar.f9308i;
        int i3 = rVar.f9315p;
        rVar.f9315p = i3 + 1;
        rVar.f9313n.put(i3, c1047c);
        return new FlutterOverlaySurface(i3, c1047c.getSurface());
    }

    public FlutterOverlaySurface createOverlaySurface2() {
        SurfaceControl build;
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction buildReparentTransaction;
        q qVar = this.platformViewsController2;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (qVar.f9296n == null) {
            SurfaceControl.Builder f = io.flutter.plugin.editing.b.f();
            f.setBufferSize(qVar.f9287d.getWidth(), qVar.f9287d.getHeight());
            f.setFormat(1);
            f.setName("Flutter Overlay Surface");
            f.setOpaque(false);
            f.setHidden(false);
            build = f.build();
            rootSurfaceControl = qVar.f9287d.getRootSurfaceControl();
            buildReparentTransaction = rootSurfaceControl.buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
            buildReparentTransaction.apply();
            qVar.f9296n = io.flutter.plugin.editing.b.e(build);
            qVar.f9297o = build;
        }
        return new FlutterOverlaySurface(0, qVar.f9296n);
    }

    public SurfaceControl.Transaction createTransaction() {
        q qVar = this.platformViewsController2;
        if (qVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction g3 = io.flutter.plugin.editing.b.g();
        qVar.f9294l.add(g3);
        return g3;
    }

    public void deferredComponentInstallFailure(int i3, String str, boolean z3) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i3, str, z3);
    }

    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        q qVar = this.platformViewsController2;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        Surface surface = qVar.f9296n;
        if (surface != null) {
            surface.release();
            qVar.f9296n = null;
            qVar.f9297o = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        r rVar = this.platformViewsController;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        rVar.d();
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

    public void dispatchEmptyPlatformMessage(String str, int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i3);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i3);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i3, int i4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i3, i4);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i4);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i3);
    }

    public void dispatchSemanticsAction(int i3, io.flutter.view.f fVar) {
        dispatchSemanticsAction(i3, fVar, null);
    }

    public void endFrame2() {
        AttachedSurfaceControl rootSurfaceControl;
        q qVar = this.platformViewsController2;
        if (qVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction g3 = io.flutter.plugin.editing.b.g();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = qVar.f9295m;
            if (i3 >= arrayList.size()) {
                arrayList.clear();
                qVar.f9287d.invalidate();
                rootSurfaceControl = qVar.f9287d.getRootSurfaceControl();
                rootSurfaceControl.applyTransactionOnDraw(g3);
                return;
            }
            g3 = g3.merge(io.flutter.plugin.editing.b.j(arrayList.get(i3)));
            i3++;
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float getScaledFontSize(float f, int i3) {
        S1.k kVar;
        l lVar = this.settingsChannel;
        DisplayMetrics displayMetrics = null;
        if (lVar != null) {
            A0.j jVar = lVar.f1436a;
            S1.k kVar2 = (S1.k) jVar.f67c;
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) jVar.f66b;
            if (kVar2 == null) {
                jVar.f67c = (S1.k) concurrentLinkedQueue.poll();
            }
            while (true) {
                kVar = (S1.k) jVar.f67c;
                if (kVar == null || kVar.f1434a >= i3) {
                    break;
                }
                jVar.f67c = (S1.k) concurrentLinkedQueue.poll();
            }
            if (kVar == null) {
                Log.e("SettingsChannel", "Cannot find config with generation: " + i3 + ", after exhausting the queue.");
            } else {
                if (kVar.f1434a != i3) {
                    Log.e("SettingsChannel", "Cannot find config with generation: " + i3 + ", the oldest config is now: " + ((S1.k) jVar.f67c).f1434a);
                }
                if (kVar != null) {
                    displayMetrics = kVar.f1435b;
                }
            }
            kVar = null;
            if (kVar != null) {
            }
        }
        if (displayMetrics != null) {
            return TypedValue.applyDimension(2, f, displayMetrics) / displayMetrics.density;
        }
        Log.e(TAG, "getScaledFontSize called with configurationId " + i3 + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i3, long j3) {
        K1.f fVar;
        boolean z3;
        K1.j jVar = this.platformMessageHandler;
        if (jVar == null) {
            nativeCleanupMessageData(j3);
            return;
        }
        K1.i iVar = (K1.i) jVar;
        synchronized (iVar.f945d) {
            try {
                fVar = (K1.f) iVar.f943b.get(str);
                z3 = iVar.f946e.get() && fVar == null;
                if (z3) {
                    if (!iVar.f944c.containsKey(str)) {
                        iVar.f944c.put(str, new LinkedList());
                    }
                    ((List) iVar.f944c.get(str)).add(new K1.d(j3, byteBuffer, i3));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            return;
        }
        iVar.a(str, fVar, byteBuffer, i3, j3);
    }

    public void hideOverlaySurface2() {
        q qVar = this.platformViewsController2;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (qVar.f9297o == null) {
            return;
        }
        SurfaceControl.Transaction g3 = io.flutter.plugin.editing.b.g();
        qVar.f9294l.add(g3);
        g3.setVisibility(qVar.f9297o, false);
    }

    public void hidePlatformView2(int i3) {
        ensureRunningOnMainThread();
        q qVar = this.platformViewsController2;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to hide a platform view");
        }
        if (qVar.a(i3)) {
            ((O1.b) qVar.f9292j.get(i3)).setVisibility(8);
        }
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j3, int i3) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j3, i3);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i3) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i3);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i3);
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
    public void invokePlatformMessageResponseCallback(int i3, ByteBuffer byteBuffer, int i4) {
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
                    flutterJNI2.nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i3, byteBuffer, i4);
                    flutterJNI = flutterJNI2;
                } else {
                    flutterJNI = this;
                    Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i3);
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

    public boolean isCodePointEmoji(int i3) {
        return nativeFlutterTextUtilsIsEmoji(i3);
    }

    public boolean isCodePointEmojiModifier(int i3) {
        return nativeFlutterTextUtilsIsEmojiModifier(i3);
    }

    public boolean isCodePointEmojiModifierBase(int i3) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i3);
    }

    public boolean isCodePointRegionalIndicator(int i3) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i3);
    }

    public boolean isCodePointVariantSelector(int i3) {
        return nativeFlutterTextUtilsIsVariationSelector(i3);
    }

    public void loadDartDeferredLibrary(int i3, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i3, strArr);
    }

    public void loadLibrary(Context context) {
        V1.b bVar;
        V1.b i3;
        String[] strArr;
        ZipFile zipFile;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        A0.r rVar = new A0.r(4);
        C0077a c0077a = new C0077a(17);
        C0077a c0077a2 = new C0077a(16);
        D0.a aVar = new D0.a();
        aVar.f261a = new HashSet();
        aVar.f262b = c0077a;
        aVar.f263c = c0077a2;
        aVar.f264d = rVar;
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        aVar.d("Beginning load of %s...", PluginErrorDetails.Platform.FLUTTER);
        C0077a c0077a3 = (C0077a) aVar.f262b;
        HashSet hashSet = (HashSet) aVar.f261a;
        if (hashSet.contains(PluginErrorDetails.Platform.FLUTTER)) {
            aVar.d("%s already loaded previously!", PluginErrorDetails.Platform.FLUTTER);
        } else {
            try {
                c0077a3.getClass();
                System.loadLibrary(PluginErrorDetails.Platform.FLUTTER);
                hashSet.add(PluginErrorDetails.Platform.FLUTTER);
                aVar.d("%s (%s) was loaded normally!", PluginErrorDetails.Platform.FLUTTER, null);
            } catch (UnsatisfiedLinkError e3) {
                aVar.d("Loading the library normally failed: %s", Log.getStackTraceString(e3));
                aVar.d("%s (%s) was not loaded normally, re-linking...", PluginErrorDetails.Platform.FLUTTER, null);
                File c3 = aVar.c(context);
                if (!c3.exists()) {
                    File dir = context.getDir("lib", 0);
                    File c4 = aVar.c(context);
                    c0077a3.getClass();
                    File[] listFiles = dir.listFiles(new C1170a(System.mapLibraryName(PluginErrorDetails.Platform.FLUTTER)));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(c4.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    String[] strArr2 = Build.SUPPORTED_ABIS;
                    if (strArr2.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr2 = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String mapLibraryName = System.mapLibraryName(PluginErrorDetails.Platform.FLUTTER);
                    ((C0077a) aVar.f263c).getClass();
                    try {
                        i3 = C0077a.i(context, strArr2, mapLibraryName, aVar);
                    } catch (Throwable th) {
                        th = th;
                        bVar = null;
                    }
                    try {
                        if (i3 == null) {
                            try {
                                strArr = C0077a.j(context, mapLibraryName);
                            } catch (Exception e4) {
                                strArr = new String[]{e4.toString()};
                            }
                            StringBuilder sb = new StringBuilder("Could not find '");
                            sb.append(mapLibraryName);
                            sb.append("'. Looked for: ");
                            sb.append(Arrays.toString(strArr2));
                            sb.append(", but only found: ");
                            throw new T0.b(B0.c.l(sb, Arrays.toString(strArr), "."));
                        }
                        int i4 = 0;
                        while (true) {
                            int i5 = i4 + 1;
                            zipFile = (ZipFile) i3.f1614b;
                            if (i4 < 5) {
                                aVar.d("Found %s! Extracting...", mapLibraryName);
                                try {
                                    if (c3.exists() || c3.createNewFile()) {
                                        try {
                                            inputStream2 = zipFile.getInputStream((ZipEntry) i3.f1615c);
                                            try {
                                                fileOutputStream2 = new FileOutputStream(c3);
                                                try {
                                                    byte[] bArr = new byte[4096];
                                                    long j3 = 0;
                                                    while (true) {
                                                        int read = inputStream2.read(bArr);
                                                        if (read == -1) {
                                                            break;
                                                        }
                                                        fileOutputStream2.write(bArr, 0, read);
                                                        j3 += read;
                                                    }
                                                    fileOutputStream2.flush();
                                                    fileOutputStream2.getFD().sync();
                                                    if (j3 == c3.length()) {
                                                        C0077a.d(inputStream2);
                                                        C0077a.d(fileOutputStream2);
                                                        c3.setReadable(true, false);
                                                        c3.setExecutable(true, false);
                                                        c3.setWritable(true);
                                                        break;
                                                    }
                                                    C0077a.d(inputStream2);
                                                    C0077a.d(fileOutputStream2);
                                                } catch (FileNotFoundException unused) {
                                                    C0077a.d(inputStream2);
                                                    C0077a.d(fileOutputStream2);
                                                    i4 = i5;
                                                } catch (IOException unused2) {
                                                    C0077a.d(inputStream2);
                                                    C0077a.d(fileOutputStream2);
                                                    i4 = i5;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    inputStream = inputStream2;
                                                    fileOutputStream = fileOutputStream2;
                                                    C0077a.d(inputStream);
                                                    C0077a.d(fileOutputStream);
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException unused3) {
                                                fileOutputStream2 = null;
                                                C0077a.d(inputStream2);
                                                C0077a.d(fileOutputStream2);
                                                i4 = i5;
                                            } catch (IOException unused4) {
                                                fileOutputStream2 = null;
                                                C0077a.d(inputStream2);
                                                C0077a.d(fileOutputStream2);
                                                i4 = i5;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                C0077a.d(inputStream);
                                                C0077a.d(fileOutputStream);
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
                                    }
                                } catch (IOException unused7) {
                                }
                                i4 = i5;
                            } else if (((A0.r) aVar.f264d) != null) {
                                lambda$loadLibrary$0("FATAL! Couldn't extract the library from the APK!");
                            }
                        }
                        try {
                            zipFile.close();
                        } catch (IOException unused8) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        bVar = i3;
                        if (bVar != null) {
                            try {
                                ((ZipFile) bVar.f1614b).close();
                            } catch (IOException unused9) {
                            }
                        }
                        throw th;
                    }
                }
                String absolutePath = c3.getAbsolutePath();
                c0077a3.getClass();
                System.load(absolutePath);
                hashSet.add(PluginErrorDetails.Platform.FLUTTER);
                aVar.d("%s (%s) was re-linked!", PluginErrorDetails.Platform.FLUTTER, null);
            }
        }
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j3);
    }

    public void maybeResizeSurfaceView(int i3, int i4) {
        boolean z3;
        Iterator<io.flutter.embedding.engine.renderer.l> it = this.flutterUiResizeListeners.iterator();
        while (it.hasNext()) {
            View view = ((o) it.next()).f636a.f646e;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                boolean z4 = true;
                if (view.getHeight() != i4) {
                    layoutParams.height = i4;
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (view.getWidth() != i3) {
                    layoutParams.width = i3;
                } else {
                    z4 = z3;
                }
                if (z4) {
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
        r rVar = this.platformViewsController;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        rVar.f9318s.clear();
        rVar.f9319t.clear();
    }

    public void onDisplayOverlaySurface(int i3, int i4, int i5, int i6, int i7) {
        ensureRunningOnMainThread();
        r rVar = this.platformViewsController;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = rVar.f9313n;
        if (sparseArray.get(i3) == null) {
            throw new IllegalStateException(B0.c.i(i3, "The overlay surface (id:", ") doesn't exist"));
        }
        rVar.i();
        View view = (C1047c) sparseArray.get(i3);
        if (view.getParent() == null) {
            rVar.f9304d.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
        layoutParams.leftMargin = i4;
        layoutParams.topMargin = i5;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        rVar.f9318s.add(Integer.valueOf(i3));
    }

    public void onDisplayPlatformView(int i3, int i4, int i5, int i6, int i7, int i8, int i9, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        r rVar = this.platformViewsController;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        rVar.i();
        SparseArray sparseArray = rVar.f9311l;
        io.flutter.plugin.platform.g gVar = (io.flutter.plugin.platform.g) sparseArray.get(i3);
        if (gVar == null) {
            return;
        }
        SparseArray sparseArray2 = rVar.f9312m;
        if (sparseArray2.get(i3) == null) {
            View view = gVar.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            Activity activity = rVar.f9303c;
            O1.b bVar = new O1.b(activity, activity.getResources().getDisplayMetrics().density, rVar.f9302b);
            bVar.setOnDescendantFocusChangeListener(new io.flutter.plugin.platform.l(rVar, i3, 0));
            sparseArray2.put(i3, bVar);
            view.setImportantForAccessibility(4);
            bVar.addView(view);
            rVar.f9304d.addView(bVar);
        }
        O1.b bVar2 = (O1.b) sparseArray2.get(i3);
        bVar2.f1067a = flutterMutatorsStack;
        bVar2.f1069c = i4;
        bVar2.f1070d = i5;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7, 51);
        layoutParams.leftMargin = i4;
        layoutParams.topMargin = i5;
        bVar2.setLayoutParams(layoutParams);
        bVar2.setWillNotDraw(false);
        bVar2.setVisibility(0);
        bVar2.bringToFront();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i8, i9);
        View view2 = ((io.flutter.plugin.platform.g) sparseArray.get(i3)).getView();
        if (view2 != null) {
            view2.setLayoutParams(layoutParams2);
            view2.bringToFront();
        }
        rVar.f9319t.add(Integer.valueOf(i3));
    }

    public void onDisplayPlatformView2(int i3, int i4, int i5, int i6, int i7, int i8, int i9, FlutterMutatorsStack flutterMutatorsStack) {
        SurfaceControl surfaceControl;
        boolean isValid;
        SurfaceControl.Transaction alpha;
        ensureRunningOnMainThread();
        q qVar = this.platformViewsController2;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        if (qVar.a(i3)) {
            O1.b bVar = (O1.b) qVar.f9292j.get(i3);
            bVar.f1067a = flutterMutatorsStack;
            bVar.f1069c = i4;
            bVar.f1070d = i5;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7, 51);
            layoutParams.leftMargin = i4;
            layoutParams.topMargin = i5;
            bVar.setLayoutParams(layoutParams);
            bVar.setWillNotDraw(false);
            bVar.setVisibility(0);
            bVar.bringToFront();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i8, i9, 51);
            View view = ((io.flutter.plugin.platform.g) qVar.f9291i.get(i3)).getView();
            if (view != null) {
                view.setLayoutParams(layoutParams2);
                view.bringToFront();
                if (view instanceof SurfaceView) {
                    SurfaceView surfaceView = (SurfaceView) view;
                    RectF rectF = new RectF(i4, i5, i6 + i4, i7 + i5);
                    Rect rect = new Rect();
                    rectF.roundOut(rect);
                    List<Path> finalClippingPaths = flutterMutatorsStack.getFinalClippingPaths();
                    if (finalClippingPaths != null && !finalClippingPaths.isEmpty()) {
                        RectF rectF2 = new RectF();
                        Iterator<Path> it = finalClippingPaths.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            it.next().computeBounds(rectF2, true);
                            Rect rect2 = new Rect();
                            rectF2.roundOut(rect2);
                            if (!rect.intersect(rect2)) {
                                rect.setEmpty();
                                break;
                            }
                        }
                    }
                    rect.offset(-i4, -i5);
                    if (rect.width() < 0 || rect.height() < 0) {
                        rect.setEmpty();
                    }
                    float finalOpacity = flutterMutatorsStack.getFinalOpacity();
                    surfaceControl = surfaceView.getSurfaceControl();
                    if (surfaceControl == null) {
                        HashSet hashSet = qVar.f9298p;
                        if (hashSet.contains(Integer.valueOf(i3))) {
                            return;
                        }
                        hashSet.add(Integer.valueOf(i3));
                        surfaceView.getHolder().addCallback(new p(qVar, surfaceView, finalOpacity, rect, i3));
                        return;
                    }
                    isValid = surfaceControl.isValid();
                    if (!isValid) {
                        surfaceView.getId();
                        return;
                    }
                    SurfaceControl.Transaction g3 = io.flutter.plugin.editing.b.g();
                    qVar.f9294l.add(g3);
                    alpha = g3.setAlpha(surfaceControl, finalOpacity);
                    alpha.setCrop(surfaceControl, rect);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public void onEndFrame() {
        ?? r3;
        ensureRunningOnMainThread();
        r rVar = this.platformViewsController;
        if (rVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z3 = false;
        if (!rVar.f9316q || !rVar.f9319t.isEmpty()) {
            if (rVar.f9316q) {
                C0031h c0031h = rVar.f9304d.f645d;
                if (c0031h != null ? c0031h.e() : false) {
                    z3 = true;
                }
            }
            rVar.e(z3);
            return;
        }
        rVar.f9316q = false;
        I1.q qVar = rVar.f9304d;
        m mVar = new m(23, rVar);
        C0031h c0031h2 = qVar.f645d;
        if (c0031h2 == null || (r3 = qVar.f) == 0) {
            return;
        }
        qVar.f646e = r3;
        qVar.f = null;
        io.flutter.embedding.engine.renderer.j jVar = qVar.f649i.f9099b;
        if (jVar != null) {
            r3.c();
            jVar.a(new I1.p(qVar, jVar, mVar));
            return;
        }
        c0031h2.b();
        C0031h c0031h3 = qVar.f645d;
        if (c0031h3 != null) {
            c0031h3.f616a.close();
            qVar.removeView(qVar.f645d);
            qVar.f645d = null;
        }
        mVar.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<io.flutter.embedding.engine.renderer.k> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<io.flutter.embedding.engine.renderer.k> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void onSurfaceChanged(int i3, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i3, i4);
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

    public void onVsync(long j3, long j4, long j5) {
        nativeOnVsync(j3, j4, j5);
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

    public void registerImageTexture(long j3, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j3, new WeakReference<>(textureRegistry$ImageConsumer), z3);
    }

    public void registerTexture(long j3, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j3, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.k kVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(kVar);
    }

    public void removeResizingFlutterUiListener(io.flutter.embedding.engine.renderer.l lVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.remove(lVar);
    }

    public void requestDartDeferredLibrary(int i3) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j3);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(j jVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = jVar;
    }

    public void setAccessibilityFeatures(int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i3);
        }
    }

    public void setAccessibilityFeaturesInNative(int i3) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i3);
    }

    public void setAsyncWaitForVsyncDelegate(k kVar) {
        asyncWaitForVsyncDelegate = kVar;
    }

    public void setDeferredComponentManager(a aVar) {
        ensureRunningOnMainThread();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setLocalizationPlugin(U1.a aVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = aVar;
    }

    public void setPlatformMessageHandler(K1.j jVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = jVar;
    }

    public void setPlatformViewsController(r rVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = rVar;
    }

    public void setPlatformViewsController2(q qVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = qVar;
    }

    public void setRefreshRateFPS(float f) {
        refreshRateFPS = f;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z3);
        }
    }

    public void setSemanticsEnabledInNative(boolean z3) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z3);
    }

    public void setSemanticsTreeEnabled(boolean z3) {
        ensureRunningOnMainThread();
        j jVar = this.accessibilityDelegate;
        if (jVar == null || z3) {
            return;
        }
        io.flutter.view.i iVar = (io.flutter.view.i) ((c) jVar).f9340a;
        iVar.f9432g.clear();
        h hVar = iVar.f9434i;
        if (hVar != null) {
            iVar.h(hVar.f9400b, 65536);
        }
        iVar.f9434i = null;
        iVar.f9441p = null;
        AccessibilityEvent e3 = iVar.e(0, 2048);
        e3.setContentChangeTypes(1);
        iVar.i(e3);
    }

    public void setSettingsChannel(l lVar) {
        ensureRunningOnMainThread();
        this.settingsChannel = lVar;
    }

    public void setViewportMetrics(float f, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, int[] iArr3, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, iArr, iArr2, iArr3, i18, i19, i20, i21, i22, i23, i24, i25);
    }

    public void showOverlaySurface2() {
        q qVar = this.platformViewsController2;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (qVar.f9297o == null) {
            return;
        }
        SurfaceControl.Transaction g3 = io.flutter.plugin.editing.b.g();
        qVar.f9294l.add(g3);
        g3.setVisibility(qVar.f9297o, true);
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j3);
        Long l3 = nativeSpawn.nativeShellHolderId;
        if ((l3 == null || l3.longValue() == 0) ? false : true) {
            return nativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    public void swapTransactions() {
        q qVar = this.platformViewsController2;
        if (qVar == null) {
            throw new RuntimeException("");
        }
        synchronized (qVar) {
            qVar.f9295m.clear();
            qVar.f9295m.addAll(qVar.f9294l);
            qVar.f9294l.clear();
        }
    }

    public void unregisterTexture(long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j3);
    }

    public void updateDisplayMetrics(int i3, float f, float f3, float f4) {
        displayWidth = f;
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

    public void dispatchSemanticsAction(int i3, io.flutter.view.f fVar, Object obj) {
        ByteBuffer byteBuffer;
        int i4;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = T1.r.INSTANCE.encodeMessage(obj);
            i4 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i4 = 0;
        }
        dispatchSemanticsAction(i3, fVar.f9367a, byteBuffer, i4);
    }

    public void dispatchSemanticsAction(int i3, int i4, ByteBuffer byteBuffer, int i5) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i3, i4, byteBuffer, i5);
    }
}
