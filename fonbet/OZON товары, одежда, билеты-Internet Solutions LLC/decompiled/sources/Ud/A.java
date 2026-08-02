package Ud;

import Ud.InterfaceC4059b;
import Ud.n;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.M;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import td.p0;
import ud.InterfaceC10025c;

/* loaded from: classes.dex */
public final class A implements w {

    /* renamed from: Y, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f27535Y = {N.f(new kotlin.jvm.internal.y("classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", N.b(A.class))), N.f(new kotlin.jvm.internal.y("withDefinedIn", "getWithDefinedIn()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("modifiers", "getModifiers()Ljava/util/Set;", N.b(A.class))), N.f(new kotlin.jvm.internal.y("startFromName", "getStartFromName()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("debugMode", "getDebugMode()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("verbose", "getVerbose()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("unitReturnType", "getUnitReturnType()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("withoutReturnType", "getWithoutReturnType()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("enhancedTypes", "getEnhancedTypes()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("normalizedVisibilities", "getNormalizedVisibilities()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("renderDefaultVisibility", "getRenderDefaultVisibility()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("renderDefaultModality", "getRenderDefaultModality()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("renderConstructorDelegation", "getRenderConstructorDelegation()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("includePropertyConstant", "getIncludePropertyConstant()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", N.b(A.class))), N.f(new kotlin.jvm.internal.y("withoutTypeParameters", "getWithoutTypeParameters()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("withoutSuperTypes", "getWithoutSuperTypes()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", N.b(A.class))), N.f(new kotlin.jvm.internal.y("defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", N.b(A.class))), N.f(new kotlin.jvm.internal.y("secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", N.b(A.class))), N.f(new kotlin.jvm.internal.y("valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", N.b(A.class))), N.f(new kotlin.jvm.internal.y("textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", N.b(A.class))), N.f(new kotlin.jvm.internal.y("parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", N.b(A.class))), N.f(new kotlin.jvm.internal.y("receiverAfterName", "getReceiverAfterName()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("renderCompanionObjectName", "getRenderCompanionObjectName()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", N.b(A.class))), N.f(new kotlin.jvm.internal.y("renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", N.b(A.class))), N.f(new kotlin.jvm.internal.y("excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", N.b(A.class))), N.f(new kotlin.jvm.internal.y("annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", N.b(A.class))), N.f(new kotlin.jvm.internal.y("annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", N.b(A.class))), N.f(new kotlin.jvm.internal.y("alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("renderConstructorKeyword", "getRenderConstructorKeyword()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("renderTypeExpansions", "getRenderTypeExpansions()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("renderFunctionContracts", "getRenderFunctionContracts()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", N.b(A.class))), N.f(new kotlin.jvm.internal.y("informativeErrorType", "getInformativeErrorType()Z", N.b(A.class)))};

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final z f27536A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final z f27537B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final z f27538C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final z f27539D;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final z f27540E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private final z f27541F;

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private final z f27542G;

    /* renamed from: H, reason: collision with root package name */
    @NotNull
    private final z f27543H;

    /* renamed from: I, reason: collision with root package name */
    @NotNull
    private final z f27544I;

    /* renamed from: J, reason: collision with root package name */
    @NotNull
    private final z f27545J;

    /* renamed from: K, reason: collision with root package name */
    @NotNull
    private final z f27546K;

    /* renamed from: L, reason: collision with root package name */
    @NotNull
    private final z f27547L;

    /* renamed from: M, reason: collision with root package name */
    @NotNull
    private final z f27548M;

    /* renamed from: N, reason: collision with root package name */
    @NotNull
    private final z f27549N;

    /* renamed from: O, reason: collision with root package name */
    @NotNull
    private final z f27550O;

    /* renamed from: P, reason: collision with root package name */
    @NotNull
    private final z f27551P;

    /* renamed from: Q, reason: collision with root package name */
    @NotNull
    private final z f27552Q;

    /* renamed from: R, reason: collision with root package name */
    @NotNull
    private final z f27553R;

    /* renamed from: S, reason: collision with root package name */
    @NotNull
    private final z f27554S;

    /* renamed from: T, reason: collision with root package name */
    @NotNull
    private final z f27555T;

    /* renamed from: U, reason: collision with root package name */
    @NotNull
    private final z f27556U;

    /* renamed from: V, reason: collision with root package name */
    @NotNull
    private final z f27557V;

    /* renamed from: W, reason: collision with root package name */
    @NotNull
    private final z f27558W;

    /* renamed from: X, reason: collision with root package name */
    @NotNull
    private final z f27559X;

    /* renamed from: a, reason: collision with root package name */
    private boolean f27560a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final z f27561b = new z(InterfaceC4059b.c.f27590a, this);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final z f27562c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final z f27563d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final z f27564e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final z f27565f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final z f27566g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final z f27567h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final z f27568i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final z f27569j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final z f27570k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final z f27571l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final z f27572m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final z f27573n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final z f27574o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final z f27575p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final z f27576q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final z f27577r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final z f27578s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final z f27579t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final z f27580u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final z f27581v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final z f27582w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final z f27583x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final z f27584y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final z f27585z;

    public A() {
        Boolean bool = Boolean.TRUE;
        this.f27562c = new z(bool, this);
        this.f27563d = new z(bool, this);
        this.f27564e = new z(v.ALL_EXCEPT_ANNOTATIONS, this);
        Boolean bool2 = Boolean.FALSE;
        this.f27565f = new z(bool2, this);
        this.f27566g = new z(bool2, this);
        this.f27567h = new z(bool2, this);
        this.f27568i = new z(bool2, this);
        this.f27569j = new z(bool2, this);
        this.f27570k = new z(bool, this);
        this.f27571l = new z(bool2, this);
        this.f27572m = new z(bool2, this);
        this.f27573n = new z(bool2, this);
        this.f27574o = new z(bool, this);
        this.f27575p = new z(bool, this);
        this.f27576q = new z(bool2, this);
        this.f27577r = new z(bool2, this);
        this.f27578s = new z(bool2, this);
        this.f27579t = new z(bool2, this);
        this.f27580u = new z(bool2, this);
        this.f27581v = new z(null, this);
        this.f27582w = new z(bool2, this);
        this.f27583x = new z(bool2, this);
        this.f27584y = new z(x.f27620a, this);
        this.f27585z = new z(y.f27621a, this);
        this.f27536A = new z(bool, this);
        this.f27537B = new z(D.RENDER_OPEN, this);
        this.f27538C = new z(n.b.a.f27606a, this);
        this.f27539D = new z(G.PLAIN, this);
        this.f27540E = new z(E.ALL, this);
        this.f27541F = new z(bool2, this);
        this.f27542G = new z(bool2, this);
        this.f27543H = new z(F.DEBUG, this);
        this.f27544I = new z(bool2, this);
        this.f27545J = new z(bool2, this);
        this.f27546K = new z(M.f71699a, this);
        this.f27547L = new z(B.a(), this);
        this.f27548M = new z(null, this);
        this.f27549N = new z(EnumC4058a.NO_ARGUMENTS, this);
        this.f27550O = new z(bool2, this);
        this.f27551P = new z(bool, this);
        this.f27552Q = new z(bool, this);
        this.f27553R = new z(bool2, this);
        this.f27554S = new z(bool2, this);
        this.f27555T = new z(bool, this);
        this.f27556U = new z(bool, this);
        new z(bool2, this);
        this.f27557V = new z(bool2, this);
        this.f27558W = new z(bool2, this);
        this.f27559X = new z(bool, this);
    }

    public final boolean A() {
        return ((Boolean) this.f27580u.getValue(this, f27535Y[19])).booleanValue();
    }

    public final boolean B() {
        return ((Boolean) this.f27559X.getValue(this, f27535Y[49])).booleanValue();
    }

    @NotNull
    public final Set<v> C() {
        return (Set) this.f27564e.getValue(this, f27535Y[3]);
    }

    public final boolean D() {
        return ((Boolean) this.f27573n.getValue(this, f27535Y[12])).booleanValue();
    }

    @NotNull
    public final D E() {
        return (D) this.f27537B.getValue(this, f27535Y[26]);
    }

    @NotNull
    public final E F() {
        return (E) this.f27540E.getValue(this, f27535Y[29]);
    }

    public final boolean G() {
        return ((Boolean) this.f27556U.getValue(this, f27535Y[45])).booleanValue();
    }

    public final boolean H() {
        return ((Boolean) this.f27557V.getValue(this, f27535Y[47])).booleanValue();
    }

    @NotNull
    public final F I() {
        return (F) this.f27543H.getValue(this, f27535Y[32]);
    }

    public final Function1<Xd.g<?>, String> J() {
        return (Function1) this.f27581v.getValue(this, f27535Y[20]);
    }

    public final boolean K() {
        return ((Boolean) this.f27541F.getValue(this, f27535Y[30])).booleanValue();
    }

    public final boolean L() {
        return ((Boolean) this.f27554S.getValue(this, f27535Y[43])).booleanValue();
    }

    public final boolean M() {
        return ((Boolean) this.f27542G.getValue(this, f27535Y[31])).booleanValue();
    }

    public final boolean N() {
        return ((Boolean) this.f27576q.getValue(this, f27535Y[15])).booleanValue();
    }

    public final boolean O() {
        return ((Boolean) this.f27551P.getValue(this, f27535Y[40])).booleanValue();
    }

    public final boolean P() {
        return ((Boolean) this.f27544I.getValue(this, f27535Y[33])).booleanValue();
    }

    public final boolean Q() {
        return ((Boolean) this.f27575p.getValue(this, f27535Y[14])).booleanValue();
    }

    public final boolean R() {
        return ((Boolean) this.f27574o.getValue(this, f27535Y[13])).booleanValue();
    }

    public final boolean S() {
        return ((Boolean) this.f27577r.getValue(this, f27535Y[16])).booleanValue();
    }

    public final boolean T() {
        return ((Boolean) this.f27553R.getValue(this, f27535Y[42])).booleanValue();
    }

    public final boolean U() {
        return ((Boolean) this.f27552Q.getValue(this, f27535Y[41])).booleanValue();
    }

    public final boolean V() {
        return ((Boolean) this.f27536A.getValue(this, f27535Y[25])).booleanValue();
    }

    public final boolean W() {
        return ((Boolean) this.f27566g.getValue(this, f27535Y[5])).booleanValue();
    }

    public final boolean X() {
        return ((Boolean) this.f27565f.getValue(this, f27535Y[4])).booleanValue();
    }

    @NotNull
    public final G Y() {
        return (G) this.f27539D.getValue(this, f27535Y[28]);
    }

    @NotNull
    public final Function1<je.N, je.N> Z() {
        return (Function1) this.f27584y.getValue(this, f27535Y[23]);
    }

    @Override // Ud.w
    @NotNull
    public final Set<Sd.c> a() {
        return (Set) this.f27547L.getValue(this, f27535Y[36]);
    }

    public final boolean a0() {
        return ((Boolean) this.f27579t.getValue(this, f27535Y[18])).booleanValue();
    }

    @Override // Ud.w
    public final void b() {
        this.f27567h.setValue(this, f27535Y[6], Boolean.TRUE);
    }

    public final boolean b0() {
        return ((Boolean) this.f27570k.getValue(this, f27535Y[9])).booleanValue();
    }

    @Override // Ud.w
    public final void c(@NotNull Set<? extends v> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f27564e.setValue(this, f27535Y[3], set);
    }

    @NotNull
    public final n.b c0() {
        return (n.b) this.f27538C.getValue(this, f27535Y[27]);
    }

    @Override // Ud.w
    public final void d(@NotNull E e11) {
        Intrinsics.checkNotNullParameter(e11, "<set-?>");
        this.f27540E.setValue(this, f27535Y[29], e11);
    }

    public final boolean d0() {
        return ((Boolean) this.f27569j.getValue(this, f27535Y[8])).booleanValue();
    }

    @Override // Ud.w
    public final void e(@NotNull LinkedHashSet linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<set-?>");
        this.f27547L.setValue(this, f27535Y[36], linkedHashSet);
    }

    public final boolean e0() {
        return ((Boolean) this.f27562c.getValue(this, f27535Y[1])).booleanValue();
    }

    @Override // Ud.w
    public final void f(@NotNull G g10) {
        Intrinsics.checkNotNullParameter(g10, "<set-?>");
        this.f27539D.setValue(this, f27535Y[28], g10);
    }

    public final boolean f0() {
        return ((Boolean) this.f27563d.getValue(this, f27535Y[2])).booleanValue();
    }

    @Override // Ud.w
    public final void g(@NotNull InterfaceC4059b interfaceC4059b) {
        Intrinsics.checkNotNullParameter(interfaceC4059b, "<set-?>");
        this.f27561b.setValue(this, f27535Y[0], interfaceC4059b);
    }

    public final boolean g0() {
        return ((Boolean) this.f27571l.getValue(this, f27535Y[10])).booleanValue();
    }

    @Override // Ud.w
    public final void h() {
        this.f27562c.setValue(this, f27535Y[1], Boolean.FALSE);
    }

    public final boolean h0() {
        return ((Boolean) this.f27583x.getValue(this, f27535Y[22])).booleanValue();
    }

    @Override // Ud.w
    public final void i() {
        this.f27541F.setValue(this, f27535Y[30], Boolean.TRUE);
    }

    public final boolean i0() {
        return ((Boolean) this.f27582w.getValue(this, f27535Y[21])).booleanValue();
    }

    @Override // Ud.w
    public final void j() {
        this.f27542G.setValue(this, f27535Y[31], Boolean.TRUE);
    }

    public final boolean j0() {
        return this.f27560a;
    }

    @Override // Ud.w
    public final void k() {
        this.f27582w.setValue(this, f27535Y[21], Boolean.TRUE);
    }

    public final void k0() {
        this.f27560a = true;
    }

    @Override // Ud.w
    public final void l() {
        this.f27565f.setValue(this, f27535Y[4], Boolean.TRUE);
    }

    @Override // Ud.w
    public final void m() {
        this.f27583x.setValue(this, f27535Y[22], Boolean.TRUE);
    }

    public final boolean n() {
        return ((Boolean) this.f27578s.getValue(this, f27535Y[17])).booleanValue();
    }

    public final boolean o() {
        return ((Boolean) this.f27550O.getValue(this, f27535Y[39])).booleanValue();
    }

    @NotNull
    public final EnumC4058a p() {
        return (EnumC4058a) this.f27549N.getValue(this, f27535Y[38]);
    }

    public final Function1<InterfaceC10025c, Boolean> q() {
        return (Function1) this.f27548M.getValue(this, f27535Y[37]);
    }

    public final boolean r() {
        return ((Boolean) this.f27558W.getValue(this, f27535Y[48])).booleanValue();
    }

    public final boolean s() {
        return ((Boolean) this.f27568i.getValue(this, f27535Y[7])).booleanValue();
    }

    @NotNull
    public final InterfaceC4059b t() {
        return (InterfaceC4059b) this.f27561b.getValue(this, f27535Y[0]);
    }

    public final boolean u() {
        return ((Boolean) this.f27567h.getValue(this, f27535Y[6])).booleanValue();
    }

    public final Function1<p0, String> v() {
        return (Function1) this.f27585z.getValue(this, f27535Y[24]);
    }

    public final boolean w() {
        return ((Boolean) this.f27545J.getValue(this, f27535Y[34])).booleanValue();
    }

    public final boolean x() {
        return ((Boolean) this.f27572m.getValue(this, f27535Y[11])).booleanValue();
    }

    @NotNull
    public final Set<Sd.c> y() {
        return (Set) this.f27546K.getValue(this, f27535Y[35]);
    }

    public final boolean z() {
        return ((Boolean) this.f27555T.getValue(this, f27535Y[44])).booleanValue();
    }
}
