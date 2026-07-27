package J1;

import I1.B;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f706a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f707b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f708c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f709d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f710e;
    public static final d f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f711g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f712h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f713i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f714j;

    /* renamed from: k, reason: collision with root package name */
    public static final List f715k;

    /* renamed from: l, reason: collision with root package name */
    public static final List f716l;

    /* renamed from: m, reason: collision with root package name */
    public static final B f717m;

    /* renamed from: n, reason: collision with root package name */
    public static final Map f718n;

    static {
        d dVar = new d("--aot-shared-library-name=", "AOTSharedLibraryName");
        f706a = dVar;
        d dVar2 = new d("--aot-shared-library-name=", true, "aot-shared-library-name", "io.flutter.embedding.engine.loader.FlutterLoader.");
        f707b = dVar2;
        d dVar3 = new d("--flutter-assets-dir=", "FlutterAssetsDir");
        f708c = dVar3;
        d dVar4 = new d("--flutter-assets-dir=", true, "flutter-assets-dir", "io.flutter.embedding.engine.loader.FlutterLoader.");
        f709d = dVar4;
        d dVar5 = new d("--old-gen-heap-size=", "OldGenHeapSize");
        f710e = dVar5;
        d dVar6 = new d("--enable-impeller=", "EnableImpeller");
        d dVar7 = new d("--impeller-backend=", "ImpellerBackend");
        d dVar8 = new d("--enable-dart-profiling", "EnableDartProfiling");
        d dVar9 = new d("--profile-startup", "ProfileStartup");
        d dVar10 = new d("--trace-startup", "TraceStartup");
        d dVar11 = new d("--merged-platform-ui-thread", "MergedPlatformUIThread");
        d dVar12 = new d("--vm-snapshot-data=", "VmSnapshotData");
        f = dVar12;
        d dVar13 = new d("--isolate-snapshot-data=", "IsolateSnapshotData");
        f711g = dVar13;
        d dVar14 = new d("--enable-hcpp-and-surface-control", "EnableHcpp");
        d dVar15 = new d("--enable-flutter-gpu", "EnableFlutterGPU");
        d dVar16 = new d("--impeller-lazy-shader-mode", "ImpellerLazyShaderInitialization");
        d dVar17 = new d("--impeller-antialias-lines", "ImpellerAntialiasLines");
        d dVar18 = new d("--enable-opengl-gpu-tracing", "EnableOpenGLGPUTracing", 0);
        d dVar19 = new d("--enable-vulkan-gpu-tracing", "EnableVulkanGPUTracing", 0);
        d dVar20 = new d("--skia-deterministic-rendering", "SkiaDeterministicRendering", 0);
        d dVar21 = new d("--enable-software-rendering", "EnableSoftwareRendering", 0);
        f712h = dVar21;
        d dVar22 = new d("--use-test-fonts", "UseTestFonts", 0);
        d dVar23 = new d("--vm-service-port=", "VMServicePort", 0);
        d dVar24 = new d("--enable-vulkan-validation", "EnableVulkanValidation", 0);
        d dVar25 = new d("--test-flag", "TestFlag", 0);
        f713i = dVar25;
        d dVar26 = new d("--leak-vm=", "LeakVM", 0);
        f714j = dVar26;
        d dVar27 = new d("--start-paused", "StartPaused", 0);
        d dVar28 = new d("--disable-service-auth-codes", "DisableServiceAuthCodes", 0);
        d dVar29 = new d("--endless-trace-buffer", "EndlessTraceBuffer", 0);
        d dVar30 = new d("--trace-skia", "TraceSkia", 0);
        d dVar31 = new d("--trace-skia-allowlist=", "TraceSkiaAllowList", 0);
        d dVar32 = new d("--trace-systrace", "TraceSystrace", 0);
        d dVar33 = new d("--trace-to-file=", "TraceToFile", 0);
        d dVar34 = new d("--profile-microtasks", "ProfileMicrotasks", 0);
        d dVar35 = new d("--dump-skp-on-shader-compilation", "DumpSkpOnShaderCompilation", 0);
        d dVar36 = new d("--purge-persistent-cache", "PurgePersistentCache", 0);
        d dVar37 = new d("--verbose-logging", "VerboseLogging", 0);
        d dVar38 = new d("--dart-flags=", "DartFlags", 0);
        d dVar39 = new d("--no-enable-merged-platform-ui-thread", "DisableMergedPlatformUIThread", 0);
        List<d> unmodifiableList = Collections.unmodifiableList(Arrays.asList(dVar23, dVar22, dVar21, dVar20, dVar, dVar3, dVar6, dVar7, dVar24, dVar27, dVar28, dVar29, dVar8, dVar9, dVar30, dVar31, dVar32, dVar33, dVar34, dVar35, dVar37, dVar38, dVar11, dVar39, dVar2, dVar4, dVar5, dVar12, dVar13, dVar36, dVar10, dVar26, dVar25, dVar15, dVar16, dVar17, dVar18, dVar19, dVar14));
        f715k = unmodifiableList;
        f716l = Collections.unmodifiableList(Arrays.asList(dVar39));
        B b3 = new B();
        b3.put(dVar2, dVar);
        b3.put(dVar4, dVar3);
        f717m = b3;
        HashMap hashMap = new HashMap(unmodifiableList.size());
        HashMap hashMap2 = new HashMap(unmodifiableList.size());
        for (d dVar40 : unmodifiableList) {
            hashMap.put(dVar40.f703a, dVar40);
            hashMap2.put(dVar40.f704b, dVar40);
        }
        f718n = Collections.unmodifiableMap(hashMap);
        Collections.unmodifiableMap(hashMap2);
    }

    public static d a(String str) {
        int indexOf = str.indexOf(61);
        if (indexOf != -1) {
            str = str.substring(0, indexOf + 1);
        }
        d dVar = (d) f718n.get(str);
        d dVar2 = (d) f717m.get(dVar);
        return dVar2 != null ? dVar2 : dVar;
    }
}
