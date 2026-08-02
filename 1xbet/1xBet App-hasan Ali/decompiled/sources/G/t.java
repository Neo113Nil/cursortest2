package G;

import A0.AbstractC0065w0;
import A0.q1;
import E.F0;
import E.Z;
import I.O;
import K0.C0203h;
import K0.J;
import K0.K;
import K0.L;
import K0.N;
import P0.C0331a;
import P0.C0335e;
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
import h0.C1988b;
import h0.C1989c;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.AbstractC2036a;
import x0.InterfaceC2637x;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f1746a = new t();

    private final void C(Z z3, SelectGesture selectGesture, O o5) {
        RectF selectionArea;
        int granularity;
        if (o5 != null) {
            selectionArea = selectGesture.getSelectionArea();
            C1989c x5 = i0.F.x(selectionArea);
            granularity = selectGesture.getGranularity();
            long E5 = AbstractC2036a.E(z3, x5, G(granularity));
            Z z5 = o5.f2426d;
            if (z5 != null) {
                z5.f(E5);
            }
            Z z6 = o5.f2426d;
            if (z6 != null) {
                z6.e(N.f2801b);
            }
            if (N.b(E5)) {
                return;
            }
            o5.p(false);
            o5.n(E.O.f1064k);
        }
    }

    private final void D(F f, SelectGesture selectGesture, E e3) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        i0.F.x(selectionArea);
        granularity = selectGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final void E(Z z3, SelectRangeGesture selectRangeGesture, O o5) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        if (o5 != null) {
            selectionStartArea = selectRangeGesture.getSelectionStartArea();
            C1989c x5 = i0.F.x(selectionStartArea);
            selectionEndArea = selectRangeGesture.getSelectionEndArea();
            C1989c x6 = i0.F.x(selectionEndArea);
            granularity = selectRangeGesture.getGranularity();
            long e3 = AbstractC2036a.e(z3, x5, x6, G(granularity));
            Z z5 = o5.f2426d;
            if (z5 != null) {
                z5.f(e3);
            }
            Z z6 = o5.f2426d;
            if (z6 != null) {
                z6.e(N.f2801b);
            }
            if (N.b(e3)) {
                return;
            }
            o5.p(false);
            o5.n(E.O.f1064k);
        }
    }

    private final void F(F f, SelectRangeGesture selectRangeGesture, E e3) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        i0.F.x(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        i0.F.x(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final int G(int i) {
        return i != 1 ? 0 : 1;
    }

    private final int a(F f, HandwritingGesture handwritingGesture) {
        throw null;
    }

    private final int b(HandwritingGesture handwritingGesture, i4.c cVar) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        cVar.c(new C0331a(fallbackText, 1));
        return 5;
    }

    private final int c(Z z3, DeleteGesture deleteGesture, C0203h c0203h, i4.c cVar) {
        int granularity;
        RectF deletionArea;
        granularity = deleteGesture.getGranularity();
        int G5 = G(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        long E5 = AbstractC2036a.E(z3, i0.F.x(deletionArea), G5);
        if (N.b(E5)) {
            return f1746a.b(q.l(deleteGesture), cVar);
        }
        h(E5, c0203h, G5 == 1, cVar);
        return 1;
    }

    private final int d(F f, DeleteGesture deleteGesture, E e3) {
        int granularity;
        RectF deletionArea;
        granularity = deleteGesture.getGranularity();
        G(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        i0.F.x(deletionArea);
        throw null;
    }

    private final int e(Z z3, DeleteRangeGesture deleteRangeGesture, C0203h c0203h, i4.c cVar) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        granularity = deleteRangeGesture.getGranularity();
        int G5 = G(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        C1989c x5 = i0.F.x(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        long e3 = AbstractC2036a.e(z3, x5, i0.F.x(deletionEndArea), G5);
        if (N.b(e3)) {
            return f1746a.b(q.l(deleteRangeGesture), cVar);
        }
        h(e3, c0203h, G5 == 1, cVar);
        return 1;
    }

    private final int f(F f, DeleteRangeGesture deleteRangeGesture, E e3) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        granularity = deleteRangeGesture.getGranularity();
        G(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        i0.F.x(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        i0.F.x(deletionEndArea);
        throw null;
    }

    private final void g(F f, long j5, boolean z3) {
        if (!z3) {
            throw null;
        }
        throw null;
    }

    private final void h(long j5, C0203h c0203h, boolean z3, i4.c cVar) {
        if (z3) {
            int i = N.f2802c;
            int i5 = (int) (j5 >> 32);
            int i6 = (int) (j5 & 4294967295L);
            int codePointBefore = i5 > 0 ? Character.codePointBefore(c0203h, i5) : 10;
            int codePointAt = i6 < c0203h.f2829l.length() ? Character.codePointAt(c0203h, i6) : 10;
            if (AbstractC2036a.K(codePointBefore) && (AbstractC2036a.J(codePointAt) || AbstractC2036a.I(codePointAt))) {
                do {
                    i5 -= Character.charCount(codePointBefore);
                    if (i5 == 0) {
                        break;
                    } else {
                        codePointBefore = Character.codePointBefore(c0203h, i5);
                    }
                } while (AbstractC2036a.K(codePointBefore));
                j5 = K0.F.b(i5, i6);
            } else if (AbstractC2036a.K(codePointAt) && (AbstractC2036a.J(codePointBefore) || AbstractC2036a.I(codePointBefore))) {
                do {
                    i6 += Character.charCount(codePointAt);
                    if (i6 == c0203h.f2829l.length()) {
                        break;
                    } else {
                        codePointAt = Character.codePointAt(c0203h, i6);
                    }
                } while (AbstractC2036a.K(codePointAt));
                j5 = K0.F.b(i5, i6);
            }
        }
        int i7 = (int) (4294967295L & j5);
        cVar.c(new u(new P0.g[]{new P0.v(i7, i7), new C0335e(N.c(j5), 0)}));
    }

    private final int k(Z z3, InsertGesture insertGesture, q1 q1Var, i4.c cVar) {
        PointF insertionPoint;
        int i;
        F0 d5;
        String textToInsert;
        long E5;
        int B5;
        if (q1Var == null) {
            return b(q.l(insertGesture), cVar);
        }
        insertionPoint = insertGesture.getInsertionPoint();
        long d6 = G4.d.d(insertionPoint.x, insertionPoint.y);
        F0 d7 = z3.d();
        if (d7 != null) {
            K0.r rVar = d7.f1029a.f2793b;
            InterfaceC2637x c5 = z3.c();
            if (c5 != null && (B5 = AbstractC2036a.B(rVar, (E5 = c5.E(d6)), q1Var)) != -1) {
                i = rVar.e(C1988b.a(E5, (rVar.b(B5) + rVar.d(B5)) / 2.0f, 1));
                if (i != -1 || ((d5 = z3.d()) != null && AbstractC2036a.h(d5.f1029a, i))) {
                    return b(q.l(insertGesture), cVar);
                }
                textToInsert = insertGesture.getTextToInsert();
                m(i, textToInsert, cVar);
                return 1;
            }
        }
        i = -1;
        if (i != -1) {
        }
        return b(q.l(insertGesture), cVar);
    }

    private final int l(F f, InsertGesture insertGesture, E e3, q1 q1Var) {
        PointF insertionPoint;
        insertionPoint = insertGesture.getInsertionPoint();
        G4.d.d(insertionPoint.x, insertionPoint.y);
        throw null;
    }

    private final void m(int i, String str, i4.c cVar) {
        cVar.c(new u(new P0.g[]{new P0.v(i, i), new C0331a(str, 1)}));
    }

    private final int n(Z z3, JoinOrSplitGesture joinOrSplitGesture, C0203h c0203h, q1 q1Var, i4.c cVar) {
        PointF joinOrSplitPoint;
        int i;
        F0 d5;
        long E5;
        int B5;
        if (q1Var == null) {
            return b(q.l(joinOrSplitGesture), cVar);
        }
        joinOrSplitPoint = joinOrSplitGesture.getJoinOrSplitPoint();
        long d6 = G4.d.d(joinOrSplitPoint.x, joinOrSplitPoint.y);
        F0 d7 = z3.d();
        if (d7 != null) {
            K0.r rVar = d7.f1029a.f2793b;
            InterfaceC2637x c5 = z3.c();
            if (c5 != null && (B5 = AbstractC2036a.B(rVar, (E5 = c5.E(d6)), q1Var)) != -1) {
                i = rVar.e(C1988b.a(E5, (rVar.b(B5) + rVar.d(B5)) / 2.0f, 1));
                if (i != -1 || ((d5 = z3.d()) != null && AbstractC2036a.h(d5.f1029a, i))) {
                    return b(q.l(joinOrSplitGesture), cVar);
                }
                int i5 = i;
                while (i5 > 0) {
                    int codePointBefore = Character.codePointBefore(c0203h, i5);
                    if (!AbstractC2036a.J(codePointBefore)) {
                        break;
                    }
                    i5 -= Character.charCount(codePointBefore);
                }
                while (i < c0203h.f2829l.length()) {
                    int codePointAt = Character.codePointAt(c0203h, i);
                    if (!AbstractC2036a.J(codePointAt)) {
                        break;
                    }
                    i += Character.charCount(codePointAt);
                }
                long b3 = K0.F.b(i5, i);
                if (N.b(b3)) {
                    m((int) (b3 >> 32), " ", cVar);
                    return 1;
                }
                h(b3, c0203h, false, cVar);
                return 1;
            }
        }
        i = -1;
        if (i != -1) {
        }
        return b(q.l(joinOrSplitGesture), cVar);
    }

    private final int o(F f, JoinOrSplitGesture joinOrSplitGesture, E e3, q1 q1Var) {
        throw null;
    }

    private final int p(Z z3, RemoveSpaceGesture removeSpaceGesture, C0203h c0203h, q1 q1Var, i4.c cVar) {
        PointF startPoint;
        PointF endPoint;
        long j5;
        int i;
        int i5;
        int i6;
        int i7;
        String sb;
        int i8 = 0;
        F0 d5 = z3.d();
        L l5 = d5 != null ? d5.f1029a : null;
        startPoint = removeSpaceGesture.getStartPoint();
        long d6 = G4.d.d(startPoint.x, startPoint.y);
        endPoint = removeSpaceGesture.getEndPoint();
        long d7 = G4.d.d(endPoint.x, endPoint.y);
        InterfaceC2637x c5 = z3.c();
        if (l5 == null || c5 == null) {
            j5 = N.f2801b;
        } else {
            long E5 = c5.E(d6);
            long E6 = c5.E(d7);
            K0.r rVar = l5.f2793b;
            int B5 = AbstractC2036a.B(rVar, E5, q1Var);
            int B6 = AbstractC2036a.B(rVar, E6, q1Var);
            if (B5 != -1) {
                if (B6 != -1) {
                    B5 = Math.min(B5, B6);
                }
                B6 = B5;
            } else if (B6 == -1) {
                j5 = N.f2801b;
            }
            float b3 = (rVar.b(B6) + rVar.d(B6)) / 2;
            j5 = rVar.f(new C1989c(Math.min(C1988b.d(E5), C1988b.d(E6)), b3 - 0.1f, Math.max(C1988b.d(E5), C1988b.d(E6)), b3 + 0.1f), 0, J.f2782a);
        }
        if (N.b(j5)) {
            return f1746a.b(q.l(removeSpaceGesture), cVar);
        }
        C0203h subSequence = c0203h.subSequence(N.e(j5), N.d(j5));
        Pattern compile = Pattern.compile("\\s+");
        kotlin.jvm.internal.l.e("compile(...)", compile);
        String str = subSequence.f2829l;
        kotlin.jvm.internal.l.f("input", str);
        Matcher matcher = compile.matcher(str);
        kotlin.jvm.internal.l.e("matcher(...)", matcher);
        v3.g gVar = !matcher.find(0) ? null : new v3.g(matcher, str);
        if (gVar == null) {
            sb = str.toString();
            i7 = 0;
            i5 = -1;
            i = -1;
        } else {
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(length);
            int i9 = 0;
            i = -1;
            while (true) {
                sb2.append((CharSequence) str, i9, gVar.z().f17851k);
                if (i == -1) {
                    i = gVar.z().f17851k;
                }
                i5 = gVar.z().f17852l + 1;
                sb2.append((CharSequence) "");
                i6 = gVar.z().f17852l + 1;
                i7 = i8;
                Matcher matcher2 = (Matcher) gVar.f20439l;
                int end = matcher2.end() + (matcher2.end() == matcher2.start() ? 1 : i7);
                String str2 = (String) gVar.f20440m;
                if (end <= str2.length()) {
                    Matcher matcher3 = matcher2.pattern().matcher(str2);
                    kotlin.jvm.internal.l.e("matcher(...)", matcher3);
                    gVar = !matcher3.find(end) ? null : new v3.g(matcher3, str2);
                } else {
                    gVar = null;
                }
                if (i6 >= length || gVar == null) {
                    break;
                }
                i9 = i6;
                i8 = i7;
            }
            if (i6 < length) {
                sb2.append((CharSequence) str, i6, length);
            }
            sb = sb2.toString();
            kotlin.jvm.internal.l.e("toString(...)", sb);
        }
        if (i == -1 || i5 == -1) {
            return b(q.l(removeSpaceGesture), cVar);
        }
        int i10 = (int) (j5 >> 32);
        String substring = sb.substring(i, sb.length() - (N.c(j5) - i5));
        kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", substring);
        P0.v vVar = new P0.v(i10 + i, i10 + i5);
        C0331a c0331a = new C0331a(substring, 1);
        P0.g[] gVarArr = new P0.g[2];
        gVarArr[i7] = vVar;
        gVarArr[1] = c0331a;
        cVar.c(new u(gVarArr));
        return 1;
    }

    private final int q(F f, RemoveSpaceGesture removeSpaceGesture, E e3, q1 q1Var) {
        throw null;
    }

    private final int r(Z z3, SelectGesture selectGesture, O o5, i4.c cVar) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        C1989c x5 = i0.F.x(selectionArea);
        granularity = selectGesture.getGranularity();
        long E5 = AbstractC2036a.E(z3, x5, G(granularity));
        if (N.b(E5)) {
            return f1746a.b(q.l(selectGesture), cVar);
        }
        v(E5, o5, cVar);
        return 1;
    }

    private final int s(F f, SelectGesture selectGesture, E e3) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        i0.F.x(selectionArea);
        granularity = selectGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final int t(Z z3, SelectRangeGesture selectRangeGesture, O o5, i4.c cVar) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        C1989c x5 = i0.F.x(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        C1989c x6 = i0.F.x(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        long e3 = AbstractC2036a.e(z3, x5, x6, G(granularity));
        if (N.b(e3)) {
            return f1746a.b(q.l(selectRangeGesture), cVar);
        }
        v(e3, o5, cVar);
        return 1;
    }

    private final int u(F f, SelectRangeGesture selectRangeGesture, E e3) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        i0.F.x(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        i0.F.x(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final void v(long j5, O o5, i4.c cVar) {
        int i = N.f2802c;
        cVar.c(new P0.v((int) (j5 >> 32), (int) (j5 & 4294967295L)));
        if (o5 != null) {
            o5.f(true);
        }
    }

    private final void w(Z z3, DeleteGesture deleteGesture, O o5) {
        RectF deletionArea;
        int granularity;
        if (o5 != null) {
            deletionArea = deleteGesture.getDeletionArea();
            C1989c x5 = i0.F.x(deletionArea);
            granularity = deleteGesture.getGranularity();
            long E5 = AbstractC2036a.E(z3, x5, G(granularity));
            Z z5 = o5.f2426d;
            if (z5 != null) {
                z5.e(E5);
            }
            Z z6 = o5.f2426d;
            if (z6 != null) {
                z6.f(N.f2801b);
            }
            if (N.b(E5)) {
                return;
            }
            o5.p(false);
            o5.n(E.O.f1064k);
        }
    }

    private final void x(F f, DeleteGesture deleteGesture, E e3) {
        RectF deletionArea;
        int granularity;
        deletionArea = deleteGesture.getDeletionArea();
        i0.F.x(deletionArea);
        granularity = deleteGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final void y(Z z3, DeleteRangeGesture deleteRangeGesture, O o5) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        if (o5 != null) {
            deletionStartArea = deleteRangeGesture.getDeletionStartArea();
            C1989c x5 = i0.F.x(deletionStartArea);
            deletionEndArea = deleteRangeGesture.getDeletionEndArea();
            C1989c x6 = i0.F.x(deletionEndArea);
            granularity = deleteRangeGesture.getGranularity();
            long e3 = AbstractC2036a.e(z3, x5, x6, G(granularity));
            Z z5 = o5.f2426d;
            if (z5 != null) {
                z5.e(e3);
            }
            Z z6 = o5.f2426d;
            if (z6 != null) {
                z6.f(N.f2801b);
            }
            if (N.b(e3)) {
                return;
            }
            o5.p(false);
            o5.n(E.O.f1064k);
        }
    }

    private final void z(F f, DeleteRangeGesture deleteRangeGesture, E e3) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        i0.F.x(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        i0.F.x(deletionEndArea);
        granularity = deleteRangeGesture.getGranularity();
        G(granularity);
        throw null;
    }

    public final boolean A(Z z3, PreviewableHandwritingGesture previewableHandwritingGesture, O o5, CancellationSignal cancellationSignal) {
        K k5;
        C0203h c0203h = z3.f1095j;
        if (c0203h == null) {
            return false;
        }
        F0 d5 = z3.d();
        if (!c0203h.equals((d5 == null || (k5 = d5.f1029a.f2792a) == null) ? null : k5.f2784a)) {
            return false;
        }
        if (q.u(previewableHandwritingGesture)) {
            C(z3, q.m(previewableHandwritingGesture), o5);
        } else if (AbstractC0065w0.q(previewableHandwritingGesture)) {
            w(z3, AbstractC0065w0.g(previewableHandwritingGesture), o5);
        } else if (AbstractC0065w0.u(previewableHandwritingGesture)) {
            E(z3, AbstractC0065w0.l(previewableHandwritingGesture), o5);
        } else {
            if (!AbstractC0065w0.w(previewableHandwritingGesture)) {
                return false;
            }
            y(z3, AbstractC0065w0.h(previewableHandwritingGesture), o5);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new r(0, o5));
        return true;
    }

    public final boolean B(F f, PreviewableHandwritingGesture previewableHandwritingGesture, E e3, CancellationSignal cancellationSignal) {
        if (q.u(previewableHandwritingGesture)) {
            D(f, q.m(previewableHandwritingGesture), e3);
        } else if (AbstractC0065w0.q(previewableHandwritingGesture)) {
            x(f, AbstractC0065w0.g(previewableHandwritingGesture), e3);
        } else if (AbstractC0065w0.u(previewableHandwritingGesture)) {
            F(f, AbstractC0065w0.l(previewableHandwritingGesture), e3);
        } else {
            if (!AbstractC0065w0.w(previewableHandwritingGesture)) {
                return false;
            }
            z(f, AbstractC0065w0.h(previewableHandwritingGesture), e3);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new s());
        return true;
    }

    public final int i(Z z3, HandwritingGesture handwritingGesture, O o5, q1 q1Var, i4.c cVar) {
        K k5;
        C0203h c0203h = z3.f1095j;
        if (c0203h == null) {
            return 3;
        }
        F0 d5 = z3.d();
        if (!c0203h.equals((d5 == null || (k5 = d5.f1029a.f2792a) == null) ? null : k5.f2784a)) {
            return 3;
        }
        if (q.u(handwritingGesture)) {
            return r(z3, q.m(handwritingGesture), o5, cVar);
        }
        if (AbstractC0065w0.q(handwritingGesture)) {
            return c(z3, AbstractC0065w0.g(handwritingGesture), c0203h, cVar);
        }
        if (AbstractC0065w0.u(handwritingGesture)) {
            return t(z3, AbstractC0065w0.l(handwritingGesture), o5, cVar);
        }
        if (AbstractC0065w0.w(handwritingGesture)) {
            return e(z3, AbstractC0065w0.h(handwritingGesture), c0203h, cVar);
        }
        if (AbstractC0065w0.C(handwritingGesture)) {
            return n(z3, AbstractC0065w0.j(handwritingGesture), c0203h, q1Var, cVar);
        }
        if (AbstractC0065w0.y(handwritingGesture)) {
            return k(z3, AbstractC0065w0.i(handwritingGesture), q1Var, cVar);
        }
        if (AbstractC0065w0.A(handwritingGesture)) {
            return p(z3, AbstractC0065w0.k(handwritingGesture), c0203h, q1Var, cVar);
        }
        return 2;
    }

    public final int j(F f, HandwritingGesture handwritingGesture, E e3, q1 q1Var) {
        if (q.u(handwritingGesture)) {
            return s(f, q.m(handwritingGesture), e3);
        }
        if (AbstractC0065w0.q(handwritingGesture)) {
            return d(f, AbstractC0065w0.g(handwritingGesture), e3);
        }
        if (AbstractC0065w0.u(handwritingGesture)) {
            return u(f, AbstractC0065w0.l(handwritingGesture), e3);
        }
        if (AbstractC0065w0.w(handwritingGesture)) {
            return f(f, AbstractC0065w0.h(handwritingGesture), e3);
        }
        if (AbstractC0065w0.C(handwritingGesture)) {
            return o(f, AbstractC0065w0.j(handwritingGesture), e3, q1Var);
        }
        if (AbstractC0065w0.y(handwritingGesture)) {
            return l(f, AbstractC0065w0.i(handwritingGesture), e3, q1Var);
        }
        if (AbstractC0065w0.A(handwritingGesture)) {
            return q(f, AbstractC0065w0.k(handwritingGesture), e3, q1Var);
        }
        return 2;
    }
}
