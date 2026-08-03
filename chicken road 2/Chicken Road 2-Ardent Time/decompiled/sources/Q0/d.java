package Q0;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Q0.c f1586a;

    /* renamed from: b, reason: collision with root package name */
    public static final Q0.c f1587b;

    /* renamed from: c, reason: collision with root package name */
    public static final Q0.c f1588c;

    /* renamed from: d, reason: collision with root package name */
    public static final Q0.c f1589d;

    /* renamed from: e, reason: collision with root package name */
    public static final Q0.c f1590e;

    /* renamed from: f, reason: collision with root package name */
    public static final Q0.c f1591f;

    /* renamed from: g, reason: collision with root package name */
    public static final Q0.c f1592g;

    /* renamed from: h, reason: collision with root package name */
    public static final Q0.c f1593h;

    /* renamed from: i, reason: collision with root package name */
    public static final Q0.c f1594i;

    /* renamed from: j, reason: collision with root package name */
    public static final Q0.c f1595j;

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.List f1596k;

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.List f1597l;

    /* renamed from: m, reason: collision with root package name */
    public static final P0.C f1598m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.Map f1599n;

    static {
        Q0.c cVar = new Q0.c("--aot-shared-library-name=", "AOTSharedLibraryName");
        f1586a = cVar;
        Q0.c cVar2 = new Q0.c("--aot-shared-library-name=", "aot-shared-library-name", "io.flutter.embedding.engine.loader.FlutterLoader.", true);
        f1587b = cVar2;
        Q0.c cVar3 = new Q0.c("--flutter-assets-dir=", "FlutterAssetsDir");
        f1588c = cVar3;
        Q0.c cVar4 = new Q0.c("--flutter-assets-dir=", "flutter-assets-dir", "io.flutter.embedding.engine.loader.FlutterLoader.", true);
        f1589d = cVar4;
        Q0.c cVar5 = new Q0.c("--old-gen-heap-size=", "OldGenHeapSize");
        f1590e = cVar5;
        Q0.c cVar6 = new Q0.c("--enable-impeller=", "EnableImpeller");
        Q0.c cVar7 = new Q0.c("--impeller-backend=", "ImpellerBackend");
        Q0.c cVar8 = new Q0.c("--enable-dart-profiling", "EnableDartProfiling");
        Q0.c cVar9 = new Q0.c("--profile-startup", "ProfileStartup");
        Q0.c cVar10 = new Q0.c("--trace-startup", "TraceStartup");
        Q0.c cVar11 = new Q0.c("--merged-platform-ui-thread", "MergedPlatformUIThread");
        Q0.c cVar12 = new Q0.c("--vm-snapshot-data=", "VmSnapshotData");
        f1591f = cVar12;
        Q0.c cVar13 = new Q0.c("--isolate-snapshot-data=", "IsolateSnapshotData");
        f1592g = cVar13;
        Q0.c cVar14 = new Q0.c("--enable-hcpp-and-surface-control", "EnableHcpp");
        Q0.c cVar15 = new Q0.c("--enable-flutter-gpu", "EnableFlutterGPU");
        Q0.c cVar16 = new Q0.c("--impeller-lazy-shader-mode", "ImpellerLazyShaderInitialization");
        Q0.c cVar17 = new Q0.c("--impeller-antialias-lines", "ImpellerAntialiasLines");
        Q0.c cVar18 = new Q0.c("--enable-opengl-gpu-tracing", "EnableOpenGLGPUTracing", 0);
        Q0.c cVar19 = new Q0.c("--enable-vulkan-gpu-tracing", "EnableVulkanGPUTracing", 0);
        Q0.c cVar20 = new Q0.c("--skia-deterministic-rendering", "SkiaDeterministicRendering", 0);
        Q0.c cVar21 = new Q0.c("--enable-software-rendering", "EnableSoftwareRendering", 0);
        f1593h = cVar21;
        Q0.c cVar22 = new Q0.c("--use-test-fonts", "UseTestFonts", 0);
        Q0.c cVar23 = new Q0.c("--vm-service-port=", "VMServicePort", 0);
        Q0.c cVar24 = new Q0.c("--enable-vulkan-validation", "EnableVulkanValidation", 0);
        Q0.c cVar25 = new Q0.c("--test-flag", "TestFlag", 0);
        f1594i = cVar25;
        Q0.c cVar26 = new Q0.c("--leak-vm=", "LeakVM", 0);
        f1595j = cVar26;
        Q0.c cVar27 = new Q0.c("--start-paused", "StartPaused", 0);
        Q0.c cVar28 = new Q0.c("--disable-service-auth-codes", "DisableServiceAuthCodes", 0);
        Q0.c cVar29 = new Q0.c("--endless-trace-buffer", "EndlessTraceBuffer", 0);
        Q0.c cVar30 = new Q0.c("--trace-skia", "TraceSkia", 0);
        Q0.c cVar31 = new Q0.c("--trace-skia-allowlist=", "TraceSkiaAllowList", 0);
        Q0.c cVar32 = new Q0.c("--trace-systrace", "TraceSystrace", 0);
        Q0.c cVar33 = new Q0.c("--trace-to-file=", "TraceToFile", 0);
        Q0.c cVar34 = new Q0.c("--profile-microtasks", "ProfileMicrotasks", 0);
        Q0.c cVar35 = new Q0.c("--dump-skp-on-shader-compilation", "DumpSkpOnShaderCompilation", 0);
        Q0.c cVar36 = new Q0.c("--purge-persistent-cache", "PurgePersistentCache", 0);
        Q0.c cVar37 = new Q0.c("--verbose-logging", "VerboseLogging", 0);
        Q0.c cVar38 = new Q0.c("--dart-flags=", "DartFlags", 0);
        Q0.c cVar39 = new Q0.c("--no-enable-merged-platform-ui-thread", "DisableMergedPlatformUIThread", 0);
        java.util.List<Q0.c> unmodifiableList = java.util.Collections.unmodifiableList(java.util.Arrays.asList(cVar23, cVar22, cVar21, cVar20, cVar, cVar3, cVar6, cVar7, cVar24, cVar27, cVar28, cVar29, cVar8, cVar9, cVar30, cVar31, cVar32, cVar33, cVar34, cVar35, cVar37, cVar38, cVar11, cVar39, cVar2, cVar4, cVar5, cVar12, cVar13, cVar36, cVar10, cVar26, cVar25, cVar15, cVar16, cVar17, cVar18, cVar19, cVar14));
        f1596k = unmodifiableList;
        f1597l = java.util.Collections.unmodifiableList(java.util.Arrays.asList(cVar39));
        P0.C c2 = new P0.C();
        c2.put(cVar2, cVar);
        c2.put(cVar4, cVar3);
        f1598m = c2;
        java.util.HashMap hashMap = new java.util.HashMap(unmodifiableList.size());
        java.util.HashMap hashMap2 = new java.util.HashMap(unmodifiableList.size());
        for (Q0.c cVar40 : unmodifiableList) {
            hashMap.put(cVar40.f1583a, cVar40);
            hashMap2.put(cVar40.f1584b, cVar40);
        }
        f1599n = java.util.Collections.unmodifiableMap(hashMap);
        java.util.Collections.unmodifiableMap(hashMap2);
    }

    public static Q0.c a(java.lang.String str) {
        int indexOf = str.indexOf(61);
        if (indexOf != -1) {
            str = str.substring(0, indexOf + 1);
        }
        Q0.c cVar = (Q0.c) f1599n.get(str);
        Q0.c cVar2 = (Q0.c) f1598m.get(cVar);
        return cVar2 != null ? cVar2 : cVar;
    }
}
