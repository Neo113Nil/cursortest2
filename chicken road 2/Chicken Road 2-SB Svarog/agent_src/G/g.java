package G;

import F.J;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final f f190a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f191b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f192c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f193d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f194e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f195f;

    /* renamed from: g, reason: collision with root package name */
    public static final f f196g;

    /* renamed from: h, reason: collision with root package name */
    public static final f f197h;

    /* renamed from: i, reason: collision with root package name */
    public static final f f198i;

    /* renamed from: j, reason: collision with root package name */
    public static final f f199j;

    /* renamed from: k, reason: collision with root package name */
    public static final List f200k;

    /* renamed from: l, reason: collision with root package name */
    public static final List f201l;

    /* renamed from: m, reason: collision with root package name */
    public static final J f202m;

    /* renamed from: n, reason: collision with root package name */
    public static final Map f203n;

    static {
        f fVar = new f("--aot-shared-library-name=", "AOTSharedLibraryName");
        f190a = fVar;
        f fVar2 = new f("--aot-shared-library-name=", "aot-shared-library-name", "io.flutter.embedding.engine.loader.FlutterLoader.", true);
        f191b = fVar2;
        f fVar3 = new f("--flutter-assets-dir=", "FlutterAssetsDir");
        f192c = fVar3;
        f fVar4 = new f("--flutter-assets-dir=", "flutter-assets-dir", "io.flutter.embedding.engine.loader.FlutterLoader.", true);
        f193d = fVar4;
        f fVar5 = new f("--old-gen-heap-size=", "OldGenHeapSize");
        f194e = fVar5;
        f fVar6 = new f("--enable-impeller=", "EnableImpeller");
        f fVar7 = new f("--impeller-backend=", "ImpellerBackend");
        f fVar8 = new f("--enable-dart-profiling", "EnableDartProfiling");
        f fVar9 = new f("--profile-startup", "ProfileStartup");
        f fVar10 = new f("--trace-startup", "TraceStartup");
        f fVar11 = new f("--merged-platform-ui-thread", "MergedPlatformUIThread");
        f fVar12 = new f("--vm-snapshot-data=", "VmSnapshotData");
        f195f = fVar12;
        f fVar13 = new f("--isolate-snapshot-data=", "IsolateSnapshotData");
        f196g = fVar13;
        f fVar14 = new f("--enable-hcpp-and-surface-control", "EnableHcpp");
        f fVar15 = new f("--enable-flutter-gpu", "EnableFlutterGPU");
        f fVar16 = new f("--impeller-lazy-shader-mode", "ImpellerLazyShaderInitialization");
        f fVar17 = new f("--impeller-antialias-lines", "ImpellerAntialiasLines");
        f fVar18 = new f(0, "--enable-opengl-gpu-tracing", "EnableOpenGLGPUTracing");
        f fVar19 = new f(0, "--enable-vulkan-gpu-tracing", "EnableVulkanGPUTracing");
        f fVar20 = new f(0, "--skia-deterministic-rendering", "SkiaDeterministicRendering");
        f fVar21 = new f(0, "--enable-software-rendering", "EnableSoftwareRendering");
        f197h = fVar21;
        f fVar22 = new f(0, "--use-test-fonts", "UseTestFonts");
        f fVar23 = new f(0, "--vm-service-port=", "VMServicePort");
        f fVar24 = new f(0, "--enable-vulkan-validation", "EnableVulkanValidation");
        f fVar25 = new f(0, "--test-flag", "TestFlag");
        f198i = fVar25;
        f fVar26 = new f(0, "--leak-vm=", "LeakVM");
        f199j = fVar26;
        f fVar27 = new f(0, "--start-paused", "StartPaused");
        f fVar28 = new f(0, "--disable-service-auth-codes", "DisableServiceAuthCodes");
        f fVar29 = new f(0, "--endless-trace-buffer", "EndlessTraceBuffer");
        f fVar30 = new f(0, "--trace-skia", "TraceSkia");
        f fVar31 = new f(0, "--trace-skia-allowlist=", "TraceSkiaAllowList");
        f fVar32 = new f(0, "--trace-systrace", "TraceSystrace");
        f fVar33 = new f(0, "--trace-to-file=", "TraceToFile");
        f fVar34 = new f(0, "--profile-microtasks", "ProfileMicrotasks");
        f fVar35 = new f(0, "--dump-skp-on-shader-compilation", "DumpSkpOnShaderCompilation");
        f fVar36 = new f(0, "--purge-persistent-cache", "PurgePersistentCache");
        f fVar37 = new f(0, "--verbose-logging", "VerboseLogging");
        f fVar38 = new f(0, "--dart-flags=", "DartFlags");
        f fVar39 = new f(0, "--no-enable-merged-platform-ui-thread", "DisableMergedPlatformUIThread");
        List<f> unmodifiableList = Collections.unmodifiableList(Arrays.asList(fVar23, fVar22, fVar21, fVar20, fVar, fVar3, fVar6, fVar7, fVar24, fVar27, fVar28, fVar29, fVar8, fVar9, fVar30, fVar31, fVar32, fVar33, fVar34, fVar35, fVar37, fVar38, fVar11, fVar39, fVar2, fVar4, fVar5, fVar12, fVar13, fVar36, fVar10, fVar26, fVar25, fVar15, fVar16, fVar17, fVar18, fVar19, fVar14));
        f200k = unmodifiableList;
        f201l = Collections.unmodifiableList(Arrays.asList(fVar39));
        J j2 = new J();
        j2.put(fVar2, fVar);
        j2.put(fVar4, fVar3);
        f202m = j2;
        HashMap hashMap = new HashMap(unmodifiableList.size());
        HashMap hashMap2 = new HashMap(unmodifiableList.size());
        for (f fVar40 : unmodifiableList) {
            hashMap.put(fVar40.f187a, fVar40);
            hashMap2.put(fVar40.f188b, fVar40);
        }
        f203n = Collections.unmodifiableMap(hashMap);
        Collections.unmodifiableMap(hashMap2);
    }

    public static f a(String str) {
        int indexOf = str.indexOf(61);
        if (indexOf != -1) {
            str = str.substring(0, indexOf + 1);
        }
        f fVar = (f) f203n.get(str);
        f fVar2 = (f) f202m.get(fVar);
        return fVar2 != null ? fVar2 : fVar;
    }
}
