package E0;

import B0.R1;
import K1.C3422b;
import K1.H;
import Q1.C3832a;
import Q1.C3839h;
import Q1.InterfaceC3841j;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.ui.platform.c2;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final X f7124a = new X();

    static final class a extends AbstractC7737t implements Function1<MatchResult, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.K f7125b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.K f7126c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.K k11, kotlin.jvm.internal.K k12) {
            super(1);
            this.f7125b = k11;
            this.f7126c = k12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(MatchResult matchResult) {
            MatchResult matchResult2 = matchResult;
            kotlin.jvm.internal.K k11 = this.f7125b;
            if (k11.f71785a == -1) {
                k11.f71785a = matchResult2.d().getF71842a();
            }
            this.f7126c.f71785a = matchResult2.d().getF71843b() + 1;
            return "";
        }
    }

    static final class b extends AbstractC7737t implements Function1<MatchResult, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.K f7127b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.K f7128c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.K k11, kotlin.jvm.internal.K k12) {
            super(1);
            this.f7127b = k11;
            this.f7128c = k12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(MatchResult matchResult) {
            MatchResult matchResult2 = matchResult;
            kotlin.jvm.internal.K k11 = this.f7127b;
            if (k11.f71785a == -1) {
                k11.f71785a = matchResult2.d().getF71842a();
            }
            this.f7128c.f71785a = matchResult2.d().getF71843b() + 1;
            return "";
        }
    }

    private final void A(c1 c1Var, DeleteRangeGesture deleteRangeGesture, Z0 z02) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        C7460f e11 = l1.x0.e(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        C7460f e12 = l1.x0.e(deletionEndArea);
        granularity = deleteRangeGesture.getGranularity();
        c(c1Var, Z.h(z02, e11, e12, H(granularity), H.a.b()), 1);
    }

    private final void D(B0.O0 o02, SelectGesture selectGesture, I0.W0 w02) {
        RectF selectionArea;
        int granularity;
        long n11;
        if (w02 != null) {
            selectionArea = selectGesture.getSelectionArea();
            C7460f e11 = l1.x0.e(selectionArea);
            granularity = selectGesture.getGranularity();
            n11 = Z.n(o02, e11, H(granularity), H.a.b());
            w02.Y(n11);
        }
    }

    private final void E(c1 c1Var, SelectGesture selectGesture, Z0 z02) {
        RectF selectionArea;
        int granularity;
        long o11;
        selectionArea = selectGesture.getSelectionArea();
        C7460f e11 = l1.x0.e(selectionArea);
        granularity = selectGesture.getGranularity();
        o11 = Z.o(z02, e11, H(granularity), H.a.b());
        c(c1Var, o11, 0);
    }

    private final void F(B0.O0 o02, SelectRangeGesture selectRangeGesture, I0.W0 w02) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        if (w02 != null) {
            selectionStartArea = selectRangeGesture.getSelectionStartArea();
            C7460f e11 = l1.x0.e(selectionStartArea);
            selectionEndArea = selectRangeGesture.getSelectionEndArea();
            C7460f e12 = l1.x0.e(selectionEndArea);
            granularity = selectRangeGesture.getGranularity();
            w02.Y(Z.g(o02, e11, e12, H(granularity), H.a.b()));
        }
    }

    private final void G(c1 c1Var, SelectRangeGesture selectRangeGesture, Z0 z02) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        C7460f e11 = l1.x0.e(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        C7460f e12 = l1.x0.e(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        c(c1Var, Z.h(z02, e11, e12, H(granularity), H.a.b()), 0);
    }

    private final int H(int i11) {
        return i11 != 1 ? 0 : 1;
    }

    private final int a(c1 c1Var, HandwritingGesture handwritingGesture) {
        D0.e eVar;
        String fallbackText;
        eVar = c1Var.f7171a;
        G0.c cVar = G0.c.MergeIfPossible;
        eVar.d().f().b();
        eVar.d().b();
        D0.e.a(eVar, true, cVar);
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        c1.q(c1Var, fallbackText, null, 4);
        return 5;
    }

    private final int b(HandwritingGesture handwritingGesture, Function1<? super InterfaceC3841j, Unit> function1) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        function1.invoke(new C3832a(fallbackText, 1));
        return 5;
    }

    private static void c(c1 c1Var, long j11, int i11) {
        D0.e eVar;
        if (!K1.Q.e(j11)) {
            c1Var.k(i11, j11);
            return;
        }
        eVar = c1Var.f7171a;
        G0.c cVar = G0.c.MergeIfPossible;
        eVar.d().f().b();
        eVar.d().b();
        D0.e.a(eVar, true, cVar);
    }

    private final int d(B0.O0 o02, DeleteGesture deleteGesture, C3422b c3422b, Function1<? super InterfaceC3841j, Unit> function1) {
        int granularity;
        RectF deletionArea;
        long n11;
        granularity = deleteGesture.getGranularity();
        int H11 = H(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        n11 = Z.n(o02, l1.x0.e(deletionArea), H11, H.a.b());
        if (K1.Q.e(n11)) {
            return f7124a.b(S.a(deleteGesture), function1);
        }
        i(n11, c3422b, H11 == 1, function1);
        return 1;
    }

    private final int e(c1 c1Var, DeleteGesture deleteGesture, Z0 z02) {
        int granularity;
        RectF deletionArea;
        long o11;
        granularity = deleteGesture.getGranularity();
        int H11 = H(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        o11 = Z.o(z02, l1.x0.e(deletionArea), H11, H.a.b());
        if (K1.Q.e(o11)) {
            return f7124a.a(c1Var, S.a(deleteGesture));
        }
        h(c1Var, o11, H11 == 1);
        return 1;
    }

    private final int f(B0.O0 o02, DeleteRangeGesture deleteRangeGesture, C3422b c3422b, Function1<? super InterfaceC3841j, Unit> function1) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        granularity = deleteRangeGesture.getGranularity();
        int H11 = H(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        C7460f e11 = l1.x0.e(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        long g10 = Z.g(o02, e11, l1.x0.e(deletionEndArea), H11, H.a.b());
        if (K1.Q.e(g10)) {
            return f7124a.b(S.a(deleteRangeGesture), function1);
        }
        i(g10, c3422b, H11 == 1, function1);
        return 1;
    }

    private final int g(c1 c1Var, DeleteRangeGesture deleteRangeGesture, Z0 z02) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        granularity = deleteRangeGesture.getGranularity();
        int H11 = H(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        C7460f e11 = l1.x0.e(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        long h11 = Z.h(z02, e11, l1.x0.e(deletionEndArea), H11, H.a.b());
        if (K1.Q.e(h11)) {
            return f7124a.a(c1Var, S.a(deleteRangeGesture));
        }
        h(c1Var, h11, H11 == 1);
        return 1;
    }

    private final void h(c1 c1Var, long j11, boolean z11) {
        if (z11) {
            j11 = Z.a(j11, c1Var.j());
        }
        c1.r(c1Var, "", j11, false, 12);
    }

    private final void i(long j11, C3422b c3422b, boolean z11, Function1<? super InterfaceC3841j, Unit> function1) {
        if (z11) {
            j11 = Z.a(j11, c3422b);
        }
        int i11 = (int) (4294967295L & j11);
        function1.invoke(new Y(new InterfaceC3841j[]{new Q1.J(i11, i11), new C3839h(K1.Q.f(j11), 0)}));
    }

    private final int l(B0.O0 o02, InsertGesture insertGesture, c2 c2Var, Function1<? super InterfaceC3841j, Unit> function1) {
        PointF insertionPoint;
        R1 j11;
        String textToInsert;
        K1.K e11;
        if (c2Var == null) {
            return b(S.a(insertGesture), function1);
        }
        insertionPoint = insertGesture.getInsertionPoint();
        int b11 = Z.b(o02, Z.k(insertionPoint), c2Var);
        if (b11 == -1 || !((j11 = o02.j()) == null || (e11 = j11.e()) == null || !Z.i(e11, b11))) {
            return b(S.a(insertGesture), function1);
        }
        textToInsert = insertGesture.getTextToInsert();
        n(b11, textToInsert, function1);
        return 1;
    }

    private final int m(c1 c1Var, InsertGesture insertGesture, Z0 z02, c2 c2Var) {
        PointF insertionPoint;
        String textToInsert;
        insertionPoint = insertGesture.getInsertionPoint();
        int c11 = Z.c(z02, Z.k(insertionPoint), c2Var);
        if (c11 == -1) {
            return a(c1Var, S.a(insertGesture));
        }
        textToInsert = insertGesture.getTextToInsert();
        c1.r(c1Var, textToInsert, K1.S.a(c11, c11), false, 12);
        return 1;
    }

    private final void n(int i11, String str, Function1<? super InterfaceC3841j, Unit> function1) {
        function1.invoke(new Y(new InterfaceC3841j[]{new Q1.J(i11, i11), new C3832a(str, 1)}));
    }

    private final int o(B0.O0 o02, JoinOrSplitGesture joinOrSplitGesture, C3422b c3422b, c2 c2Var, Function1<? super InterfaceC3841j, Unit> function1) {
        PointF joinOrSplitPoint;
        R1 j11;
        K1.K e11;
        if (c2Var == null) {
            return b(S.a(joinOrSplitGesture), function1);
        }
        joinOrSplitPoint = joinOrSplitGesture.getJoinOrSplitPoint();
        int b11 = Z.b(o02, Z.k(joinOrSplitPoint), c2Var);
        if (b11 == -1 || !((j11 = o02.j()) == null || (e11 = j11.e()) == null || !Z.i(e11, b11))) {
            return b(S.a(joinOrSplitGesture), function1);
        }
        long j12 = Z.j(b11, c3422b);
        if (K1.Q.e(j12)) {
            n((int) (j12 >> 32), " ", function1);
            return 1;
        }
        i(j12, c3422b, false, function1);
        return 1;
    }

    private final int p(c1 c1Var, JoinOrSplitGesture joinOrSplitGesture, Z0 z02, c2 c2Var) {
        PointF joinOrSplitPoint;
        K1.K f7;
        if (c1Var.g() != c1Var.i()) {
            return 3;
        }
        joinOrSplitPoint = joinOrSplitGesture.getJoinOrSplitPoint();
        int c11 = Z.c(z02, Z.k(joinOrSplitPoint), c2Var);
        if (c11 == -1 || ((f7 = z02.f()) != null && Z.i(f7, c11))) {
            return a(c1Var, S.a(joinOrSplitGesture));
        }
        long j11 = Z.j(c11, c1Var.j());
        if (K1.Q.e(j11)) {
            c1.r(c1Var, " ", j11, false, 12);
            return 1;
        }
        h(c1Var, j11, false);
        return 1;
    }

    private final int q(B0.O0 o02, RemoveSpaceGesture removeSpaceGesture, C3422b c3422b, c2 c2Var, Function1<? super InterfaceC3841j, Unit> function1) {
        PointF startPoint;
        PointF endPoint;
        int i11;
        R1 j11 = o02.j();
        K1.K e11 = j11 != null ? j11.e() : null;
        startPoint = removeSpaceGesture.getStartPoint();
        long k11 = Z.k(startPoint);
        endPoint = removeSpaceGesture.getEndPoint();
        long d11 = Z.d(e11, k11, Z.k(endPoint), o02.i(), c2Var);
        if (K1.Q.e(d11)) {
            return f7124a.b(S.a(removeSpaceGesture), function1);
        }
        kotlin.jvm.internal.K k12 = new kotlin.jvm.internal.K();
        k12.f71785a = -1;
        kotlin.jvm.internal.K k13 = new kotlin.jvm.internal.K();
        k13.f71785a = -1;
        String g10 = new Regex("\\s+").g(K1.S.c(d11, c3422b), new b(k12, k13));
        int i12 = k12.f71785a;
        if (i12 == -1 || (i11 = k13.f71785a) == -1) {
            return b(S.a(removeSpaceGesture), function1);
        }
        int i13 = (int) (d11 >> 32);
        String substring = g10.substring(i12, g10.length() - (K1.Q.f(d11) - k13.f71785a));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        function1.invoke(new Y(new InterfaceC3841j[]{new Q1.J(i13 + i12, i13 + i11), new C3832a(substring, 1)}));
        return 1;
    }

    private final int r(c1 c1Var, RemoveSpaceGesture removeSpaceGesture, Z0 z02, c2 c2Var) {
        PointF startPoint;
        PointF endPoint;
        int i11;
        K1.K f7 = z02.f();
        startPoint = removeSpaceGesture.getStartPoint();
        long k11 = Z.k(startPoint);
        endPoint = removeSpaceGesture.getEndPoint();
        long d11 = Z.d(f7, k11, Z.k(endPoint), z02.i(), c2Var);
        if (K1.Q.e(d11)) {
            return f7124a.a(c1Var, S.a(removeSpaceGesture));
        }
        kotlin.jvm.internal.K k12 = new kotlin.jvm.internal.K();
        k12.f71785a = -1;
        kotlin.jvm.internal.K k13 = new kotlin.jvm.internal.K();
        k13.f71785a = -1;
        String g10 = new Regex("\\s+").g(K1.S.c(d11, c1Var.j()), new a(k12, k13));
        int i12 = k12.f71785a;
        if (i12 == -1 || (i11 = k13.f71785a) == -1) {
            return a(c1Var, S.a(removeSpaceGesture));
        }
        int i13 = (int) (d11 >> 32);
        long a11 = K1.S.a(i12 + i13, i13 + i11);
        String substring = g10.substring(k12.f71785a, g10.length() - (K1.Q.f(d11) - k13.f71785a));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        c1.r(c1Var, substring, a11, false, 12);
        return 1;
    }

    private final int s(B0.O0 o02, SelectGesture selectGesture, I0.W0 w02, Function1<? super InterfaceC3841j, Unit> function1) {
        RectF selectionArea;
        int granularity;
        long n11;
        selectionArea = selectGesture.getSelectionArea();
        C7460f e11 = l1.x0.e(selectionArea);
        granularity = selectGesture.getGranularity();
        n11 = Z.n(o02, e11, H(granularity), H.a.b());
        if (K1.Q.e(n11)) {
            return f7124a.b(S.a(selectGesture), function1);
        }
        w(n11, w02, function1);
        return 1;
    }

    private final int t(c1 c1Var, SelectGesture selectGesture, Z0 z02) {
        RectF selectionArea;
        int granularity;
        long o11;
        selectionArea = selectGesture.getSelectionArea();
        C7460f e11 = l1.x0.e(selectionArea);
        granularity = selectGesture.getGranularity();
        o11 = Z.o(z02, e11, H(granularity), H.a.b());
        if (K1.Q.e(o11)) {
            return f7124a.a(c1Var, S.a(selectGesture));
        }
        c1Var.t(o11);
        return 1;
    }

    private final int u(B0.O0 o02, SelectRangeGesture selectRangeGesture, I0.W0 w02, Function1<? super InterfaceC3841j, Unit> function1) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        C7460f e11 = l1.x0.e(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        C7460f e12 = l1.x0.e(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        long g10 = Z.g(o02, e11, e12, H(granularity), H.a.b());
        if (K1.Q.e(g10)) {
            return f7124a.b(S.a(selectRangeGesture), function1);
        }
        w(g10, w02, function1);
        return 1;
    }

    private final int v(c1 c1Var, SelectRangeGesture selectRangeGesture, Z0 z02) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        C7460f e11 = l1.x0.e(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        C7460f e12 = l1.x0.e(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        long h11 = Z.h(z02, e11, e12, H(granularity), H.a.b());
        if (K1.Q.e(h11)) {
            return f7124a.a(c1Var, S.a(selectRangeGesture));
        }
        c1Var.t(h11);
        return 1;
    }

    private final void w(long j11, I0.W0 w02, Function1<? super InterfaceC3841j, Unit> function1) {
        int i11 = K1.Q.f15010c;
        function1.invoke(new Q1.J((int) (j11 >> 32), (int) (j11 & 4294967295L)));
        if (w02 != null) {
            w02.t(true);
        }
    }

    private final void x(B0.O0 o02, DeleteGesture deleteGesture, I0.W0 w02) {
        RectF deletionArea;
        int granularity;
        long n11;
        if (w02 != null) {
            deletionArea = deleteGesture.getDeletionArea();
            C7460f e11 = l1.x0.e(deletionArea);
            granularity = deleteGesture.getGranularity();
            n11 = Z.n(o02, e11, H(granularity), H.a.b());
            w02.Q(n11);
        }
    }

    private final void y(c1 c1Var, DeleteGesture deleteGesture, Z0 z02) {
        RectF deletionArea;
        int granularity;
        long o11;
        deletionArea = deleteGesture.getDeletionArea();
        C7460f e11 = l1.x0.e(deletionArea);
        granularity = deleteGesture.getGranularity();
        o11 = Z.o(z02, e11, H(granularity), H.a.b());
        c(c1Var, o11, 1);
    }

    private final void z(B0.O0 o02, DeleteRangeGesture deleteRangeGesture, I0.W0 w02) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        if (w02 != null) {
            deletionStartArea = deleteRangeGesture.getDeletionStartArea();
            C7460f e11 = l1.x0.e(deletionStartArea);
            deletionEndArea = deleteRangeGesture.getDeletionEndArea();
            C7460f e12 = l1.x0.e(deletionEndArea);
            granularity = deleteRangeGesture.getGranularity();
            w02.Q(Z.g(o02, e11, e12, H(granularity), H.a.b()));
        }
    }

    public final boolean B(@NotNull B0.O0 o02, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture, final I0.W0 w02, CancellationSignal cancellationSignal) {
        K1.K e11;
        K1.J k11;
        C3422b w11 = o02.w();
        if (w11 == null) {
            return false;
        }
        R1 j11 = o02.j();
        if (!w11.equals((j11 == null || (e11 = j11.e()) == null || (k11 = e11.k()) == null) ? null : k11.j())) {
            return false;
        }
        if (T.c(previewableHandwritingGesture)) {
            D(o02, U.c(previewableHandwritingGesture), w02);
        } else if (C2.G.c(previewableHandwritingGesture)) {
            x(o02, C2.H.a(previewableHandwritingGesture), w02);
        } else if (C2.I.c(previewableHandwritingGesture)) {
            F(o02, C2.J.b(previewableHandwritingGesture), w02);
        } else {
            if (!C2.K.c(previewableHandwritingGesture)) {
                return false;
            }
            z(o02, C2.L.b(previewableHandwritingGesture), w02);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: E0.V
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                I0.W0 w03 = I0.W0.this;
                if (w03 != null) {
                    w03.n();
                }
            }
        });
        return true;
    }

    public final boolean C(@NotNull final c1 c1Var, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture, @NotNull Z0 z02, CancellationSignal cancellationSignal) {
        if (T.c(previewableHandwritingGesture)) {
            E(c1Var, U.c(previewableHandwritingGesture), z02);
        } else if (C2.G.c(previewableHandwritingGesture)) {
            y(c1Var, C2.H.a(previewableHandwritingGesture), z02);
        } else if (C2.I.c(previewableHandwritingGesture)) {
            G(c1Var, C2.J.b(previewableHandwritingGesture), z02);
        } else {
            if (!C2.K.c(previewableHandwritingGesture)) {
                return false;
            }
            A(c1Var, C2.L.b(previewableHandwritingGesture), z02);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: E0.W
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                D0.e eVar;
                eVar = c1.this.f7171a;
                G0.c cVar = G0.c.MergeIfPossible;
                eVar.d().f().b();
                eVar.d().b();
                D0.e.a(eVar, true, cVar);
            }
        });
        return true;
    }

    public final int j(@NotNull B0.O0 o02, @NotNull HandwritingGesture handwritingGesture, I0.W0 w02, c2 c2Var, @NotNull Function1<? super InterfaceC3841j, Unit> function1) {
        K1.K e11;
        K1.J k11;
        C3422b w11 = o02.w();
        if (w11 == null) {
            return 3;
        }
        R1 j11 = o02.j();
        if (!w11.equals((j11 == null || (e11 = j11.e()) == null || (k11 = e11.k()) == null) ? null : k11.j())) {
            return 3;
        }
        if (T.c(handwritingGesture)) {
            return s(o02, U.c(handwritingGesture), w02, function1);
        }
        if (C2.G.c(handwritingGesture)) {
            return d(o02, C2.H.a(handwritingGesture), w11, function1);
        }
        if (C2.I.c(handwritingGesture)) {
            return u(o02, C2.J.b(handwritingGesture), w02, function1);
        }
        if (C2.K.c(handwritingGesture)) {
            return f(o02, C2.L.b(handwritingGesture), w11, function1);
        }
        if (C2.U.b(handwritingGesture)) {
            return o(o02, C2.V.b(handwritingGesture), w11, c2Var, function1);
        }
        if (C2.O.c(handwritingGesture)) {
            return l(o02, C2.P.c(handwritingGesture), c2Var, function1);
        }
        if (C2.S.e(handwritingGesture)) {
            return q(o02, C2.T.b(handwritingGesture), w11, c2Var, function1);
        }
        return 2;
    }

    public final int k(@NotNull c1 c1Var, @NotNull HandwritingGesture handwritingGesture, @NotNull Z0 z02, c2 c2Var) {
        if (T.c(handwritingGesture)) {
            return t(c1Var, U.c(handwritingGesture), z02);
        }
        if (C2.G.c(handwritingGesture)) {
            return e(c1Var, C2.H.a(handwritingGesture), z02);
        }
        if (C2.I.c(handwritingGesture)) {
            return v(c1Var, C2.J.b(handwritingGesture), z02);
        }
        if (C2.K.c(handwritingGesture)) {
            return g(c1Var, C2.L.b(handwritingGesture), z02);
        }
        if (C2.U.b(handwritingGesture)) {
            return p(c1Var, C2.V.b(handwritingGesture), z02, c2Var);
        }
        if (C2.O.c(handwritingGesture)) {
            return m(c1Var, C2.P.c(handwritingGesture), z02, c2Var);
        }
        if (C2.S.e(handwritingGesture)) {
            return r(c1Var, C2.T.b(handwritingGesture), z02, c2Var);
        }
        return 2;
    }
}
