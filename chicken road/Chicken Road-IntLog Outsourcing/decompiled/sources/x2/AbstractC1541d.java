package x2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: x2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1541d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1540c f12274a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1540c f12275b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1540c f12276c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1540c f12277d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1540c f12278e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1540c f12279f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1540c f12280g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1540c f12281h;

    /* renamed from: i, reason: collision with root package name */
    public static final C1540c f12282i;

    /* renamed from: j, reason: collision with root package name */
    public static final C1540c f12283j;

    /* renamed from: k, reason: collision with root package name */
    public static final List f12284k;

    /* renamed from: l, reason: collision with root package name */
    public static final List f12285l;

    /* renamed from: m, reason: collision with root package name */
    public static final J2.a f12286m;

    /* renamed from: n, reason: collision with root package name */
    public static final Map f12287n;

    static {
        C1540c c1540c = new C1540c("--aot-shared-library-name=", "AOTSharedLibraryName");
        f12274a = c1540c;
        C1540c c1540c2 = new C1540c("--aot-shared-library-name=", "aot-shared-library-name", "io.flutter.embedding.engine.loader.FlutterLoader.", true);
        f12275b = c1540c2;
        C1540c c1540c3 = new C1540c("--flutter-assets-dir=", "FlutterAssetsDir");
        f12276c = c1540c3;
        C1540c c1540c4 = new C1540c("--flutter-assets-dir=", "flutter-assets-dir", "io.flutter.embedding.engine.loader.FlutterLoader.", true);
        f12277d = c1540c4;
        C1540c c1540c5 = new C1540c("--old-gen-heap-size=", "OldGenHeapSize");
        f12278e = c1540c5;
        C1540c c1540c6 = new C1540c("--enable-impeller=", "EnableImpeller");
        C1540c c1540c7 = new C1540c("--impeller-backend=", "ImpellerBackend");
        C1540c c1540c8 = new C1540c("--enable-dart-profiling", "EnableDartProfiling");
        C1540c c1540c9 = new C1540c("--profile-startup", "ProfileStartup");
        C1540c c1540c10 = new C1540c("--trace-startup", "TraceStartup");
        C1540c c1540c11 = new C1540c("--merged-platform-ui-thread", "MergedPlatformUIThread");
        C1540c c1540c12 = new C1540c("--vm-snapshot-data=", "VmSnapshotData");
        f12279f = c1540c12;
        C1540c c1540c13 = new C1540c("--isolate-snapshot-data=", "IsolateSnapshotData");
        f12280g = c1540c13;
        C1540c c1540c14 = new C1540c("--enable-hcpp-and-surface-control", "EnableHcpp");
        C1540c c1540c15 = new C1540c("--enable-flutter-gpu", "EnableFlutterGPU");
        C1540c c1540c16 = new C1540c("--impeller-lazy-shader-mode", "ImpellerLazyShaderInitialization");
        C1540c c1540c17 = new C1540c("--impeller-antialias-lines", "ImpellerAntialiasLines");
        C1540c c1540c18 = new C1540c("--enable-opengl-gpu-tracing", "EnableOpenGLGPUTracing", 0);
        C1540c c1540c19 = new C1540c("--enable-vulkan-gpu-tracing", "EnableVulkanGPUTracing", 0);
        C1540c c1540c20 = new C1540c("--skia-deterministic-rendering", "SkiaDeterministicRendering", 0);
        C1540c c1540c21 = new C1540c("--enable-software-rendering", "EnableSoftwareRendering", 0);
        f12281h = c1540c21;
        C1540c c1540c22 = new C1540c("--use-test-fonts", "UseTestFonts", 0);
        C1540c c1540c23 = new C1540c("--vm-service-port=", "VMServicePort", 0);
        C1540c c1540c24 = new C1540c("--enable-vulkan-validation", "EnableVulkanValidation", 0);
        C1540c c1540c25 = new C1540c("--test-flag", "TestFlag", 0);
        f12282i = c1540c25;
        C1540c c1540c26 = new C1540c("--leak-vm=", "LeakVM", 0);
        f12283j = c1540c26;
        C1540c c1540c27 = new C1540c("--start-paused", "StartPaused", 0);
        C1540c c1540c28 = new C1540c("--disable-service-auth-codes", "DisableServiceAuthCodes", 0);
        C1540c c1540c29 = new C1540c("--endless-trace-buffer", "EndlessTraceBuffer", 0);
        C1540c c1540c30 = new C1540c("--trace-skia", "TraceSkia", 0);
        C1540c c1540c31 = new C1540c("--trace-skia-allowlist=", "TraceSkiaAllowList", 0);
        C1540c c1540c32 = new C1540c("--trace-systrace", "TraceSystrace", 0);
        C1540c c1540c33 = new C1540c("--trace-to-file=", "TraceToFile", 0);
        C1540c c1540c34 = new C1540c("--profile-microtasks", "ProfileMicrotasks", 0);
        C1540c c1540c35 = new C1540c("--dump-skp-on-shader-compilation", "DumpSkpOnShaderCompilation", 0);
        C1540c c1540c36 = new C1540c("--purge-persistent-cache", "PurgePersistentCache", 0);
        C1540c c1540c37 = new C1540c("--verbose-logging", "VerboseLogging", 0);
        C1540c c1540c38 = new C1540c("--dart-flags=", "DartFlags", 0);
        C1540c c1540c39 = new C1540c("--no-enable-merged-platform-ui-thread", "DisableMergedPlatformUIThread", 0);
        List<C1540c> unmodifiableList = Collections.unmodifiableList(Arrays.asList(c1540c23, c1540c22, c1540c21, c1540c20, c1540c, c1540c3, c1540c6, c1540c7, c1540c24, c1540c27, c1540c28, c1540c29, c1540c8, c1540c9, c1540c30, c1540c31, c1540c32, c1540c33, c1540c34, c1540c35, c1540c37, c1540c38, c1540c11, c1540c39, c1540c2, c1540c4, c1540c5, c1540c12, c1540c13, c1540c36, c1540c10, c1540c26, c1540c25, c1540c15, c1540c16, c1540c17, c1540c18, c1540c19, c1540c14));
        f12284k = unmodifiableList;
        f12285l = Collections.unmodifiableList(Arrays.asList(c1540c39));
        J2.a aVar = new J2.a();
        aVar.put(c1540c2, c1540c);
        aVar.put(c1540c4, c1540c3);
        f12286m = aVar;
        HashMap hashMap = new HashMap(unmodifiableList.size());
        HashMap hashMap2 = new HashMap(unmodifiableList.size());
        for (C1540c c1540c40 : unmodifiableList) {
            hashMap.put(c1540c40.f12271a, c1540c40);
            hashMap2.put(c1540c40.f12272b, c1540c40);
        }
        f12287n = Collections.unmodifiableMap(hashMap);
        Collections.unmodifiableMap(hashMap2);
    }

    public static C1540c a(String str) {
        int indexOf = str.indexOf(61);
        if (indexOf != -1) {
            str = str.substring(0, indexOf + 1);
        }
        C1540c c1540c = (C1540c) f12287n.get(str);
        C1540c c1540c2 = (C1540c) f12286m.get(c1540c);
        return c1540c2 != null ? c1540c2 : c1540c;
    }
}
