package I1;

import K1.C3422b;
import K1.Q;
import Q1.C3848q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f11751H = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C<List<String>> f11752a = z.b("ContentDescription", a.f11778b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C<String> f11753b = z.a("StateDescription");

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final C<I1.h> f11754c = z.a("ProgressBarRangeInfo");

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final C<String> f11755d = z.b("PaneTitle", e.f11782b);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final C<Unit> f11756e = z.a("SelectableGroup");

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final C<C3223b> f11757f = z.a("CollectionInfo");

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final C<C3224c> f11758g = z.a("CollectionItemInfo");

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final C<Unit> f11759h = z.a("Heading");

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final C<Unit> f11760i = z.a("Disabled");

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final C<I1.g> f11761j = z.a("LiveRegion");

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final C<Boolean> f11762k = z.a("Focused");

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final C<Boolean> f11763l = z.a("IsTraversalGroup");

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private static final C<Unit> f11764m = new C<>("InvisibleToUser", b.f11779b);

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private static final C<Float> f11765n = z.b("TraversalIndex", i.f11786b);

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private static final C<j> f11766o = z.a("HorizontalScrollAxisRange");

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private static final C<j> f11767p = z.a("VerticalScrollAxisRange");

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private static final C<Unit> f11768q = z.b("IsPopup", d.f11781b);

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private static final C<Unit> f11769r = z.b("IsDialog", c.f11780b);

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private static final C<I1.i> f11770s = z.b("Role", f.f11783b);

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private static final C<String> f11771t = new C<>(g.f11784b, "TestTag", false);

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private static final C<List<C3422b>> f11772u = z.b("Text", h.f11785b);

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private static final C<C3422b> f11773v = new C<>("TextSubstitution");

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private static final C<Boolean> f11774w = new C<>("IsShowingTextSubstitution");

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private static final C<C3422b> f11775x = z.a("EditableText");

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private static final C<Q> f11776y = z.a("TextSelectionRange");

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private static final C<C3848q> f11777z = z.a("ImeAction");

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private static final C<Boolean> f11744A = z.a("Selected");

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private static final C<J1.a> f11745B = z.a("ToggleableState");

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private static final C<Unit> f11746C = z.a("Password");

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private static final C<String> f11747D = z.a("Error");

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private static final C<Function1<Object, Integer>> f11748E = new C<>("IndexForKey");

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private static final C<Boolean> f11749F = new C<>("IsEditable");

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private static final C<Integer> f11750G = new C<>("MaxTextLength");

    static final class a extends AbstractC7737t implements Function2<List<? extends String>, List<? extends String>, List<? extends String>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f11778b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends String> invoke(List<? extends String> list, List<? extends String> list2) {
            List<? extends String> list3 = list;
            List<? extends String> list4 = list2;
            if (list3 == null) {
                return list4;
            }
            ArrayList W02 = C7714v.W0(list3);
            W02.addAll(list4);
            return W02;
        }
    }

    static final class b extends AbstractC7737t implements Function2<Unit, Unit, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f11779b = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Unit unit, Unit unit2) {
            return unit;
        }
    }

    static final class c extends AbstractC7737t implements Function2<Unit, Unit, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f11780b = new c(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Unit unit, Unit unit2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    static final class d extends AbstractC7737t implements Function2<Unit, Unit, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f11781b = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Unit unit, Unit unit2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    static final class e extends AbstractC7737t implements Function2<String, String, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f11782b = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    static final class f extends AbstractC7737t implements Function2<I1.i, I1.i, I1.i> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f11783b = new f(2);

        @Override // kotlin.jvm.functions.Function2
        public final I1.i invoke(I1.i iVar, I1.i iVar2) {
            I1.i iVar3 = iVar;
            iVar2.b();
            return iVar3;
        }
    }

    static final class g extends AbstractC7737t implements Function2<String, String, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f11784b = new g(2);

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    static final class h extends AbstractC7737t implements Function2<List<? extends C3422b>, List<? extends C3422b>, List<? extends C3422b>> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f11785b = new h(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends C3422b> invoke(List<? extends C3422b> list, List<? extends C3422b> list2) {
            List<? extends C3422b> list3 = list;
            List<? extends C3422b> list4 = list2;
            if (list3 == null) {
                return list4;
            }
            ArrayList W02 = C7714v.W0(list3);
            W02.addAll(list4);
            return W02;
        }
    }

    static final class i extends AbstractC7737t implements Function2<Float, Float, Float> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f11786b = new i(2);

        @Override // kotlin.jvm.functions.Function2
        public final Float invoke(Float f7, Float f11) {
            Float f12 = f7;
            f11.floatValue();
            return f12;
        }
    }

    @NotNull
    public static C A() {
        return f11771t;
    }

    @NotNull
    public static C B() {
        return f11772u;
    }

    @NotNull
    public static C C() {
        return f11776y;
    }

    @NotNull
    public static C D() {
        return f11773v;
    }

    @NotNull
    public static C E() {
        return f11745B;
    }

    @NotNull
    public static C F() {
        return f11765n;
    }

    @NotNull
    public static C G() {
        return f11767p;
    }

    @NotNull
    public static C a() {
        return f11757f;
    }

    @NotNull
    public static C b() {
        return f11758g;
    }

    @NotNull
    public static C c() {
        return f11752a;
    }

    @NotNull
    public static C d() {
        return f11760i;
    }

    @NotNull
    public static C e() {
        return f11775x;
    }

    @NotNull
    public static C f() {
        return f11747D;
    }

    @NotNull
    public static C g() {
        return f11762k;
    }

    @NotNull
    public static C h() {
        return f11759h;
    }

    @NotNull
    public static C i() {
        return f11766o;
    }

    @NotNull
    public static C j() {
        return f11777z;
    }

    @NotNull
    public static C k() {
        return f11748E;
    }

    @NotNull
    public static C l() {
        return f11764m;
    }

    @NotNull
    public static C m() {
        return f11769r;
    }

    @NotNull
    public static C n() {
        return f11749F;
    }

    @NotNull
    public static C o() {
        return f11768q;
    }

    @NotNull
    public static C p() {
        return f11774w;
    }

    @NotNull
    public static C q() {
        return f11763l;
    }

    @NotNull
    public static C r() {
        return f11761j;
    }

    @NotNull
    public static C s() {
        return f11750G;
    }

    @NotNull
    public static C t() {
        return f11755d;
    }

    @NotNull
    public static C u() {
        return f11746C;
    }

    @NotNull
    public static C v() {
        return f11754c;
    }

    @NotNull
    public static C w() {
        return f11770s;
    }

    @NotNull
    public static C x() {
        return f11756e;
    }

    @NotNull
    public static C y() {
        return f11744A;
    }

    @NotNull
    public static C z() {
        return f11753b;
    }
}
