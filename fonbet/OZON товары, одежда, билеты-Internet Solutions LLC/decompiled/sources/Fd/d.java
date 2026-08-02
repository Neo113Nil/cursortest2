package Fd;

import Bd.b;
import Cd.C2739A;
import Cd.C2742c;
import Cd.InterfaceC2757s;
import Cd.t;
import Dd.j;
import Dd.p;
import Fd.e;
import Kd.e0;
import Ld.E;
import Ld.q;
import Ld.w;
import ae.C4999a;
import ae.InterfaceC5004f;
import be.C5655a;
import fe.InterfaceC6543w;
import ie.C7056e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.r;
import td.InterfaceC9815F;
import td.g0;
import wd.L;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7056e f9362a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final yd.d f9363b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final yd.g f9364c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final q f9365d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final p f9366e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final yd.i f9367f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Dd.k f9368g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final j.a f9369h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C5655a f9370i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final yd.k f9371j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final n f9372k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final E f9373l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final g0.a f9374m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final b.a f9375n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final L f9376o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final r f9377p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final C2742c f9378q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final e0 f9379r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final t.a f9380s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final e.a f9381t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final ke.r f9382u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final C2739A f9383v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final Ld.o f9384w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final C4999a f9385x;

    public d(C7056e storageManager, yd.d finder, yd.g kotlinClassFinder, q deserializedDescriptorResolver, p signaturePropagator, yd.i errorReporter, j.a javaPropertyInitializerEvaluator, C5655a samConversionResolver, yd.k sourceElementFactory, n moduleClassResolver, E packagePartProvider, g0.a supertypeLoopChecker, b.a lookupTracker, L module, r reflectionTypes, C2742c annotationTypeQualifierResolver, e0 signatureEnhancement, t.a javaClassesTracker, e.a settings, ke.r kotlinTypeChecker, C2739A javaTypeEnhancementState, Ld.o javaModuleResolver) {
        Dd.k javaResolverCache = Dd.k.f6583a;
        InterfaceC5004f.f36619a.getClass();
        C4999a syntheticPartsProvider = InterfaceC5004f.a.a();
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        Intrinsics.checkNotNullParameter(signaturePropagator, "signaturePropagator");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        Intrinsics.checkNotNullParameter(javaPropertyInitializerEvaluator, "javaPropertyInitializerEvaluator");
        Intrinsics.checkNotNullParameter(samConversionResolver, "samConversionResolver");
        Intrinsics.checkNotNullParameter(sourceElementFactory, "sourceElementFactory");
        Intrinsics.checkNotNullParameter(moduleClassResolver, "moduleClassResolver");
        Intrinsics.checkNotNullParameter(packagePartProvider, "packagePartProvider");
        Intrinsics.checkNotNullParameter(supertypeLoopChecker, "supertypeLoopChecker");
        Intrinsics.checkNotNullParameter(lookupTracker, "lookupTracker");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(reflectionTypes, "reflectionTypes");
        Intrinsics.checkNotNullParameter(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        Intrinsics.checkNotNullParameter(signatureEnhancement, "signatureEnhancement");
        Intrinsics.checkNotNullParameter(javaClassesTracker, "javaClassesTracker");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        Intrinsics.checkNotNullParameter(javaModuleResolver, "javaModuleResolver");
        Intrinsics.checkNotNullParameter(syntheticPartsProvider, "syntheticPartsProvider");
        this.f9362a = storageManager;
        this.f9363b = finder;
        this.f9364c = kotlinClassFinder;
        this.f9365d = deserializedDescriptorResolver;
        this.f9366e = signaturePropagator;
        this.f9367f = errorReporter;
        this.f9368g = javaResolverCache;
        this.f9369h = javaPropertyInitializerEvaluator;
        this.f9370i = samConversionResolver;
        this.f9371j = sourceElementFactory;
        this.f9372k = moduleClassResolver;
        this.f9373l = packagePartProvider;
        this.f9374m = supertypeLoopChecker;
        this.f9375n = lookupTracker;
        this.f9376o = module;
        this.f9377p = reflectionTypes;
        this.f9378q = annotationTypeQualifierResolver;
        this.f9379r = signatureEnhancement;
        this.f9380s = javaClassesTracker;
        this.f9381t = settings;
        this.f9382u = kotlinTypeChecker;
        this.f9383v = javaTypeEnhancementState;
        this.f9384w = javaModuleResolver;
        this.f9385x = syntheticPartsProvider;
    }

    @NotNull
    public final C2742c a() {
        return this.f9378q;
    }

    @NotNull
    public final q b() {
        return this.f9365d;
    }

    @NotNull
    public final InterfaceC6543w c() {
        return this.f9367f;
    }

    @NotNull
    public final InterfaceC2757s d() {
        return this.f9363b;
    }

    @NotNull
    public final t e() {
        return this.f9380s;
    }

    @NotNull
    public final Ld.o f() {
        return this.f9384w;
    }

    @NotNull
    public final Dd.j g() {
        return this.f9369h;
    }

    @NotNull
    public final Dd.k h() {
        return this.f9368g;
    }

    @NotNull
    public final C2739A i() {
        return this.f9383v;
    }

    @NotNull
    public final w j() {
        return this.f9364c;
    }

    @NotNull
    public final ke.q k() {
        return this.f9382u;
    }

    @NotNull
    public final Bd.b l() {
        return this.f9375n;
    }

    @NotNull
    public final InterfaceC9815F m() {
        return this.f9376o;
    }

    @NotNull
    public final n n() {
        return this.f9372k;
    }

    @NotNull
    public final E o() {
        return this.f9373l;
    }

    @NotNull
    public final r p() {
        return this.f9377p;
    }

    @NotNull
    public final e q() {
        return this.f9381t;
    }

    @NotNull
    public final e0 r() {
        return this.f9379r;
    }

    @NotNull
    public final p s() {
        return this.f9366e;
    }

    @NotNull
    public final Id.b t() {
        return this.f9371j;
    }

    @NotNull
    public final ie.o u() {
        return this.f9362a;
    }

    @NotNull
    public final g0 v() {
        return this.f9374m;
    }

    @NotNull
    public final InterfaceC5004f w() {
        return this.f9385x;
    }

    @NotNull
    public final d x() {
        Dd.k javaResolverCache = Dd.k.f6583a;
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        return new d(this.f9362a, this.f9363b, this.f9364c, this.f9365d, this.f9366e, this.f9367f, this.f9369h, this.f9370i, this.f9371j, this.f9372k, this.f9373l, this.f9374m, this.f9375n, this.f9376o, this.f9377p, this.f9378q, this.f9379r, this.f9380s, this.f9381t, this.f9382u, this.f9383v, this.f9384w);
    }
}
