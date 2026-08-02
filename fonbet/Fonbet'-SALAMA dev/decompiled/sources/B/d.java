package B;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Placeholder;
import androidx.constraintlayout.widget.VirtualLayout;
import v.AbstractC1660k;
import v.AbstractC1662m;
import v.C1652c;
import v.C1654e;
import v.C1655f;
import v.EnumC1653d;
import w.C1669b;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f768a;

    /* renamed from: b, reason: collision with root package name */
    public int f769b;

    /* renamed from: c, reason: collision with root package name */
    public int f770c;

    /* renamed from: d, reason: collision with root package name */
    public int f771d;

    /* renamed from: e, reason: collision with root package name */
    public int f772e;

    /* renamed from: f, reason: collision with root package name */
    public int f773f;

    /* renamed from: g, reason: collision with root package name */
    public int f774g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f775h;

    public d(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f775h = constraintLayout;
        this.f768a = constraintLayout2;
    }

    public static boolean a(int i7, int i8, int i9) {
        if (i7 == i8) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i7);
        View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i9 == size;
        }
        return false;
    }

    public final void b(C1654e c1654e, C1669b c1669b) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int i7;
        int i8;
        boolean z4;
        int measuredWidth;
        int baseline;
        int i9;
        if (c1654e == null) {
            return;
        }
        if (c1654e.f16959i0 == 8 && !c1654e.f16922F) {
            c1669b.f17218e = 0;
            c1669b.f17219f = 0;
            c1669b.f17220g = 0;
            return;
        }
        if (c1654e.f16938V == null) {
            return;
        }
        EnumC1653d enumC1653d = c1669b.f17214a;
        EnumC1653d enumC1653d2 = c1669b.f17215b;
        int i10 = c1669b.f17216c;
        int i11 = c1669b.f17217d;
        int i12 = this.f769b + this.f770c;
        int i13 = this.f771d;
        View view = c1654e.f16957h0;
        int ordinal = enumC1653d.ordinal();
        C1652c c1652c = c1654e.f16928L;
        C1652c c1652c2 = c1654e.f16926J;
        if (ordinal == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        } else if (ordinal == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f773f, i13, -2);
        } else if (ordinal == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f773f, i13, -2);
            boolean z7 = c1654e.f16975r == 1;
            int i14 = c1669b.j;
            if (i14 == 1 || i14 == 2) {
                boolean z8 = view.getMeasuredHeight() == c1654e.l();
                if (c1669b.j == 2 || !z7 || ((z7 && z8) || (view instanceof Placeholder) || c1654e.B())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c1654e.r(), 1073741824);
                }
            }
        } else if (ordinal != 3) {
            makeMeasureSpec = 0;
        } else {
            int i15 = this.f773f;
            int i16 = c1652c2 != null ? c1652c2.f16909g : 0;
            if (c1652c != null) {
                i16 += c1652c.f16909g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i15, i13 + i16, -1);
        }
        int ordinal2 = enumC1653d2.ordinal();
        if (ordinal2 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        } else if (ordinal2 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f774g, i12, -2);
        } else if (ordinal2 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f774g, i12, -2);
            boolean z9 = c1654e.f16977s == 1;
            int i17 = c1669b.j;
            if (i17 == 1 || i17 == 2) {
                boolean z10 = view.getMeasuredWidth() == c1654e.r();
                if (c1669b.j == 2 || !z9 || ((z9 && z10) || (view instanceof Placeholder) || c1654e.C())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c1654e.l(), 1073741824);
                }
            }
        } else if (ordinal2 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i18 = this.f774g;
            int i19 = c1652c2 != null ? c1654e.f16927K.f16909g : 0;
            if (c1652c != null) {
                i19 += c1654e.f16929M.f16909g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i18, i12 + i19, -1);
        }
        C1655f c1655f = (C1655f) c1654e.f16938V;
        ConstraintLayout constraintLayout = this.f775h;
        if (c1655f != null && AbstractC1660k.c(constraintLayout.f9015z, 256) && view.getMeasuredWidth() == c1654e.r() && view.getMeasuredWidth() < c1655f.r() && view.getMeasuredHeight() == c1654e.l() && view.getMeasuredHeight() < c1655f.l() && view.getBaseline() == c1654e.c0 && !c1654e.A() && a(c1654e.f16924H, makeMeasureSpec, c1654e.r()) && a(c1654e.f16925I, makeMeasureSpec2, c1654e.l())) {
            c1669b.f17218e = c1654e.r();
            c1669b.f17219f = c1654e.l();
            c1669b.f17220g = c1654e.c0;
            return;
        }
        EnumC1653d enumC1653d3 = EnumC1653d.f16914c;
        boolean z11 = enumC1653d == enumC1653d3;
        boolean z12 = enumC1653d2 == enumC1653d3;
        EnumC1653d enumC1653d4 = EnumC1653d.f16915d;
        EnumC1653d enumC1653d5 = EnumC1653d.f16912a;
        boolean z13 = enumC1653d2 == enumC1653d4 || enumC1653d2 == enumC1653d5;
        boolean z14 = enumC1653d == enumC1653d4 || enumC1653d == enumC1653d5;
        boolean z15 = z11 && c1654e.f16941Y > 0.0f;
        boolean z16 = z12 && c1654e.f16941Y > 0.0f;
        if (view == null) {
            return;
        }
        c cVar = (c) view.getLayoutParams();
        int i20 = c1669b.j;
        if (i20 != 1 && i20 != 2 && z11 && c1654e.f16975r == 0 && z12 && c1654e.f16977s == 0) {
            z4 = false;
            measuredWidth = 0;
            i9 = -1;
            baseline = 0;
            max = 0;
        } else {
            if ((view instanceof VirtualLayout) && (c1654e instanceof AbstractC1662m)) {
                ((VirtualLayout) view).r((AbstractC1662m) c1654e, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            c1654e.f16924H = makeMeasureSpec;
            c1654e.f16925I = makeMeasureSpec2;
            c1654e.f16954g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i21 = c1654e.f16981u;
            int max2 = i21 > 0 ? Math.max(i21, measuredWidth2) : measuredWidth2;
            int i22 = c1654e.f16982v;
            if (i22 > 0) {
                max2 = Math.min(i22, max2);
            }
            int i23 = c1654e.f16984x;
            max = i23 > 0 ? Math.max(i23, measuredHeight) : measuredHeight;
            int i24 = makeMeasureSpec;
            int i25 = c1654e.f16985y;
            if (i25 > 0) {
                max = Math.min(i25, max);
            }
            if (!AbstractC1660k.c(constraintLayout.f9015z, 1)) {
                if (z15 && z13) {
                    max2 = (int) ((max * c1654e.f16941Y) + 0.5f);
                } else if (z16 && z14) {
                    max = (int) ((max2 / c1654e.f16941Y) + 0.5f);
                }
            }
            if (measuredWidth2 == max2 && measuredHeight == max) {
                baseline = baseline2;
                measuredWidth = max2;
                z4 = false;
            } else {
                if (measuredWidth2 != max2) {
                    i7 = 1073741824;
                    i8 = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                } else {
                    i7 = 1073741824;
                    i8 = i24;
                }
                if (measuredHeight != max) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max, i7);
                }
                view.measure(i8, makeMeasureSpec2);
                c1654e.f16924H = i8;
                c1654e.f16925I = makeMeasureSpec2;
                z4 = false;
                c1654e.f16954g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i9 = -1;
        }
        boolean z17 = baseline != i9 ? true : z4;
        if (measuredWidth != c1669b.f17216c || max != c1669b.f17217d) {
            z4 = true;
        }
        c1669b.f17222i = z4;
        boolean z18 = cVar.c0 ? true : z17;
        if (z18 && baseline != -1 && c1654e.c0 != baseline) {
            c1669b.f17222i = true;
        }
        c1669b.f17218e = measuredWidth;
        c1669b.f17219f = max;
        c1669b.f17221h = z18;
        c1669b.f17220g = baseline;
    }
}
