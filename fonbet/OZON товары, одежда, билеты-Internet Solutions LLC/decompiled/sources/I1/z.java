package I1;

import K1.C3422b;
import K1.Q;
import Q1.C3848q;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f11792a = {w.c(z.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), w.c(z.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), w.c(z.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), w.c(z.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), w.c(z.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), w.c(z.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), w.c(z.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), w.c(z.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1), w.c(z.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), w.c(z.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), w.c(z.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), w.c(z.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), w.c(z.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), w.c(z.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), w.c(z.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), w.c(z.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), w.c(z.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), w.c(z.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), w.c(z.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), w.c(z.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), w.c(z.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), w.c(z.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), w.c(z.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), w.c(z.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), w.c(z.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), w.c(z.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11793b = 0;

    static {
        int i11 = u.f11751H;
        int i12 = k.f11697B;
    }

    @NotNull
    public static final <T> C<T> a(@NotNull String str) {
        return new C<>(str, 0);
    }

    @NotNull
    public static final <T> C<T> b(@NotNull String str, @NotNull Function2<? super T, ? super T, ? extends T> function2) {
        return new C<>(function2, str, true);
    }

    public static void c(D d11, Function0 function0) {
        d11.b(k.h(), new C3222a(null, new y(function0)));
    }

    public static void d(D d11, Function1 function1) {
        d11.b(k.i(), new C3222a(null, function1));
    }

    public static void e(D d11, Function0 function0) {
        d11.b(k.k(), new C3222a(null, function0));
    }

    public static void f(D d11, int i11, Function0 function0) {
        int i12 = u.f11751H;
        d11.b(u.j(), C3848q.a(i11));
        d11.b(k.l(), new C3222a(null, function0));
    }

    public static final void g(@NotNull D d11, @NotNull C3223b c3223b) {
        int i11 = u.f11751H;
        C a11 = u.a();
        kotlin.reflect.m<Object> mVar = f11792a[20];
        a11.getClass();
        d11.b(a11, c3223b);
    }

    public static final void h(@NotNull D d11) {
        int i11 = u.f11751H;
        C q11 = u.q();
        kotlin.reflect.m<Object> mVar = f11792a[5];
        Boolean bool = Boolean.TRUE;
        q11.getClass();
        d11.b(q11, bool);
    }

    public static final void i(@NotNull D d11, @NotNull String str) {
        int i11 = u.f11751H;
        d11.b(u.c(), C7714v.a0(str));
    }

    public static final void j(@NotNull D d11, boolean z11) {
        int i11 = u.f11751H;
        C n11 = u.n();
        kotlin.reflect.m<Object> mVar = f11792a[23];
        Boolean valueOf = Boolean.valueOf(z11);
        n11.getClass();
        d11.b(n11, valueOf);
    }

    public static final void k(@NotNull D d11, @NotNull C3422b c3422b) {
        int i11 = u.f11751H;
        C e11 = u.e();
        kotlin.reflect.m<Object> mVar = f11792a[16];
        e11.getClass();
        d11.b(e11, c3422b);
    }

    public static final void l(@NotNull D d11, boolean z11) {
        int i11 = u.f11751H;
        C g10 = u.g();
        kotlin.reflect.m<Object> mVar = f11792a[4];
        Boolean valueOf = Boolean.valueOf(z11);
        g10.getClass();
        d11.b(g10, valueOf);
    }

    public static final void m(@NotNull D d11, @NotNull j jVar) {
        int i11 = u.f11751H;
        C i12 = u.i();
        kotlin.reflect.m<Object> mVar = f11792a[10];
        i12.getClass();
        d11.b(i12, jVar);
    }

    public static final void n(@NotNull D d11) {
        int i11 = u.f11751H;
        C r11 = u.r();
        kotlin.reflect.m<Object> mVar = f11792a[3];
        g gVar = new g();
        r11.getClass();
        d11.b(r11, gVar);
    }

    public static final void o(@NotNull D d11, @NotNull String str) {
        int i11 = u.f11751H;
        C t2 = u.t();
        kotlin.reflect.m<Object> mVar = f11792a[2];
        t2.getClass();
        d11.b(t2, str);
    }

    public static final void p(@NotNull D d11, @NotNull h hVar) {
        int i11 = u.f11751H;
        C v11 = u.v();
        kotlin.reflect.m<Object> mVar = f11792a[1];
        v11.getClass();
        d11.b(v11, hVar);
    }

    public static final void q(@NotNull D d11, int i11) {
        int i12 = u.f11751H;
        C w11 = u.w();
        kotlin.reflect.m<Object> mVar = f11792a[12];
        i a11 = i.a(i11);
        w11.getClass();
        d11.b(w11, a11);
    }

    public static final void r(@NotNull D d11, boolean z11) {
        int i11 = u.f11751H;
        C y11 = u.y();
        kotlin.reflect.m<Object> mVar = f11792a[19];
        Boolean valueOf = Boolean.valueOf(z11);
        y11.getClass();
        d11.b(y11, valueOf);
    }

    public static final void s(@NotNull D d11, boolean z11) {
        int i11 = u.f11751H;
        C p11 = u.p();
        kotlin.reflect.m<Object> mVar = f11792a[15];
        Boolean valueOf = Boolean.valueOf(z11);
        p11.getClass();
        d11.b(p11, valueOf);
    }

    public static final void t(@NotNull D d11, @NotNull String str) {
        int i11 = u.f11751H;
        C A11 = u.A();
        kotlin.reflect.m<Object> mVar = f11792a[13];
        A11.getClass();
        d11.b(A11, str);
    }

    public static final void u(@NotNull D d11, long j11) {
        int i11 = u.f11751H;
        C C11 = u.C();
        kotlin.reflect.m<Object> mVar = f11792a[17];
        Q b11 = Q.b(j11);
        C11.getClass();
        d11.b(C11, b11);
    }

    public static final void v(@NotNull D d11, @NotNull C3422b c3422b) {
        int i11 = u.f11751H;
        C D11 = u.D();
        kotlin.reflect.m<Object> mVar = f11792a[14];
        D11.getClass();
        d11.b(D11, c3422b);
    }

    public static final void w(@NotNull D d11, @NotNull J1.a aVar) {
        int i11 = u.f11751H;
        C E11 = u.E();
        kotlin.reflect.m<Object> mVar = f11792a[22];
        E11.getClass();
        d11.b(E11, aVar);
    }

    public static final void x(@NotNull D d11) {
        int i11 = u.f11751H;
        C q11 = u.q();
        kotlin.reflect.m<Object> mVar = f11792a[6];
        Boolean bool = Boolean.TRUE;
        q11.getClass();
        d11.b(q11, bool);
    }

    public static final void y(@NotNull D d11, float f7) {
        int i11 = u.f11751H;
        C F11 = u.F();
        kotlin.reflect.m<Object> mVar = f11792a[9];
        Float valueOf = Float.valueOf(f7);
        F11.getClass();
        d11.b(F11, valueOf);
    }

    public static final void z(@NotNull D d11, @NotNull j jVar) {
        int i11 = u.f11751H;
        C G11 = u.G();
        kotlin.reflect.m<Object> mVar = f11792a[11];
        G11.getClass();
        d11.b(G11, jVar);
    }
}
