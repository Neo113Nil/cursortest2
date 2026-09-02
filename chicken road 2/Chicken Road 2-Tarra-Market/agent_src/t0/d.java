package t0;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f6667a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f6668b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f6669c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f6670d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f6671e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f6672f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f6673g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f6674h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f6675i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f6676j;

    /* renamed from: k, reason: collision with root package name */
    public static final List f6677k;

    /* renamed from: l, reason: collision with root package name */
    public static final List f6678l;

    /* renamed from: m, reason: collision with root package name */
    public static final F0.a f6679m;

    /* renamed from: n, reason: collision with root package name */
    public static final Map f6680n;

    static {
        c cVar = new c("--aot-shared-library-name=", "AOTSharedLibraryName");
        f6667a = cVar;
        c cVar2 = new c("--aot-shared-library-name=", "aot-shared-library-name", "io.flutter.embedding.engine.loader.FlutterLoader.", true);
        f6668b = cVar2;
        c cVar3 = new c("--flutter-assets-dir=", "FlutterAssetsDir");
        f6669c = cVar3;
        c cVar4 = new c("--flutter-assets-dir=", "flutter-assets-dir", "io.flutter.embedding.engine.loader.FlutterLoader.", true);
        f6670d = cVar4;
        c cVar5 = new c("--old-gen-heap-size=", "OldGenHeapSize");
        f6671e = cVar5;
        c cVar6 = new c("--enable-impeller=", "EnableImpeller");
        c cVar7 = new c("--impeller-backend=", "ImpellerBackend");
        c cVar8 = new c("--enable-dart-profiling", "EnableDartProfiling");
        c cVar9 = new c("--profile-startup", "ProfileStartup");
        c cVar10 = new c("--trace-startup", "TraceStartup");
        c cVar11 = new c("--merged-platform-ui-thread", "MergedPlatformUIThread");
        c cVar12 = new c("--vm-snapshot-data=", "VmSnapshotData");
        f6672f = cVar12;
        c cVar13 = new c("--isolate-snapshot-data=", "IsolateSnapshotData");
        f6673g = cVar13;
        c cVar14 = new c("--enable-hcpp-and-surface-control", "EnableHcpp");
        c cVar15 = new c("--enable-flutter-gpu", "EnableFlutterGPU");
        c cVar16 = new c("--impeller-lazy-shader-mode", "ImpellerLazyShaderInitialization");
        c cVar17 = new c("--impeller-antialias-lines", "ImpellerAntialiasLines");
        c cVar18 = new c("--enable-opengl-gpu-tracing", "EnableOpenGLGPUTracing", 0);
        c cVar19 = new c("--enable-vulkan-gpu-tracing", "EnableVulkanGPUTracing", 0);
        c cVar20 = new c("--skia-deterministic-rendering", "SkiaDeterministicRendering", 0);
        c cVar21 = new c("--enable-software-rendering", "EnableSoftwareRendering", 0);
        f6674h = cVar21;
        c cVar22 = new c("--use-test-fonts", "UseTestFonts", 0);
        c cVar23 = new c("--vm-service-port=", "VMServicePort", 0);
        c cVar24 = new c("--enable-vulkan-validation", "EnableVulkanValidation", 0);
        c cVar25 = new c("--test-flag", "TestFlag", 0);
        f6675i = cVar25;
        c cVar26 = new c("--leak-vm=", "LeakVM", 0);
        f6676j = cVar26;
        c cVar27 = new c("--start-paused", "StartPaused", 0);
        c cVar28 = new c("--disable-service-auth-codes", "DisableServiceAuthCodes", 0);
        c cVar29 = new c("--endless-trace-buffer", "EndlessTraceBuffer", 0);
        c cVar30 = new c("--trace-skia", "TraceSkia", 0);
        c cVar31 = new c("--trace-skia-allowlist=", "TraceSkiaAllowList", 0);
        c cVar32 = new c("--trace-systrace", "TraceSystrace", 0);
        c cVar33 = new c("--trace-to-file=", "TraceToFile", 0);
        c cVar34 = new c("--profile-microtasks", "ProfileMicrotasks", 0);
        c cVar35 = new c("--dump-skp-on-shader-compilation", "DumpSkpOnShaderCompilation", 0);
        c cVar36 = new c("--purge-persistent-cache", "PurgePersistentCache", 0);
        c cVar37 = new c("--verbose-logging", "VerboseLogging", 0);
        c cVar38 = new c("--dart-flags=", "DartFlags", 0);
        c cVar39 = new c("--no-enable-merged-platform-ui-thread", "DisableMergedPlatformUIThread", 0);
        List<c> unmodifiableList = Collections.unmodifiableList(Arrays.asList(cVar23, cVar22, cVar21, cVar20, cVar, cVar3, cVar6, cVar7, cVar24, cVar27, cVar28, cVar29, cVar8, cVar9, cVar30, cVar31, cVar32, cVar33, cVar34, cVar35, cVar37, cVar38, cVar11, cVar39, cVar2, cVar4, cVar5, cVar12, cVar13, cVar36, cVar10, cVar26, cVar25, cVar15, cVar16, cVar17, cVar18, cVar19, cVar14));
        f6677k = unmodifiableList;
        f6678l = Collections.unmodifiableList(Arrays.asList(cVar39));
        F0.a aVar = new F0.a();
        aVar.put(cVar2, cVar);
        aVar.put(cVar4, cVar3);
        f6679m = aVar;
        HashMap hashMap = new HashMap(unmodifiableList.size());
        HashMap hashMap2 = new HashMap(unmodifiableList.size());
        for (c cVar40 : unmodifiableList) {
            hashMap.put(cVar40.f6664a, cVar40);
            hashMap2.put(cVar40.f6665b, cVar40);
        }
        f6680n = Collections.unmodifiableMap(hashMap);
        Collections.unmodifiableMap(hashMap2);
    }

    public static c a(String str) {
        int indexOf = str.indexOf(61);
        if (indexOf != -1) {
            str = str.substring(0, indexOf + 1);
        }
        c cVar = (c) f6680n.get(str);
        c cVar2 = (c) f6679m.get(cVar);
        return cVar2 != null ? cVar2 : cVar;
    }
}
