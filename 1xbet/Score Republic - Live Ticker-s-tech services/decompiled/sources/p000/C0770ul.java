package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: ul */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0770ul {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f7842a;

    /* JADX INFO: renamed from: b */
    public int f7843b;

    /* JADX INFO: renamed from: c */
    public int f7844c;

    /* JADX INFO: renamed from: d */
    public int f7845d;

    /* JADX INFO: renamed from: e */
    public int f7846e;

    /* JADX INFO: renamed from: f */
    public int f7847f;

    /* JADX INFO: renamed from: g */
    public int f7848g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ConstraintLayout f7849h;

    public C0770ul(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f7849h = constraintLayout;
        this.f7842a = constraintLayout2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4933a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m4934b(C0143dm c0143dm, C0834wb c0834wb) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int iMax2;
        boolean z;
        int baseline;
        int i;
        C0585pl c0585pl = c0143dm.f1690J;
        C0585pl c0585pl2 = c0143dm.f1688H;
        if (c0143dm.f1718f0 == 8) {
            c0834wb.f8498e = 0;
            c0834wb.f8499f = 0;
            c0834wb.f8500g = 0;
            return;
        }
        if (c0143dm.f1699S == null) {
            return;
        }
        s71 s71Var = ConstraintLayout.f465y;
        int i2 = c0834wb.f8494a;
        int i3 = c0834wb.f8495b;
        int i4 = c0834wb.f8496c;
        int i5 = c0834wb.f8497d;
        int i6 = this.f7843b + this.f7844c;
        int i7 = this.f7845d;
        View view = c0143dm.f1716e0;
        int iM292o = AbstractC0024an.m292o(i2);
        if (iM292o == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else if (iM292o == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f7847f, i7, -2);
        } else if (iM292o == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f7847f, i7, -2);
            boolean z2 = c0143dm.f1739r == 1;
            int i8 = c0834wb.f8503j;
            if (i8 == 1 || i8 == 2) {
                boolean z3 = view.getMeasuredHeight() == c0143dm.m1256i();
                if (c0834wb.f8503j == 2 || !z2 || ((z2 && z3) || c0143dm.mo1270y())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0143dm.m1260o(), 1073741824);
                }
            }
        } else if (iM292o != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i9 = this.f7847f;
            int i10 = c0585pl2 != null ? c0585pl2.f6198g : 0;
            if (c0585pl != null) {
                i10 += c0585pl.f6198g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i7 + i10, -1);
        }
        int iM292o2 = AbstractC0024an.m292o(i3);
        if (iM292o2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (iM292o2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f7848g, i6, -2);
        } else if (iM292o2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f7848g, i6, -2);
            boolean z4 = c0143dm.f1740s == 1;
            int i11 = c0834wb.f8503j;
            if (i11 == 1 || i11 == 2) {
                boolean z5 = view.getMeasuredWidth() == c0143dm.m1260o();
                if (c0834wb.f8503j == 2 || !z4 || ((z4 && z5) || c0143dm.mo1271z())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0143dm.m1256i(), 1073741824);
                }
            }
        } else if (iM292o2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i12 = this.f7848g;
            int i13 = c0585pl2 != null ? c0143dm.f1689I.f6198g : 0;
            if (c0585pl != null) {
                i13 += c0143dm.f1691K.f6198g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i6 + i13, -1);
        }
        C0179em c0179em = (C0179em) c0143dm.f1699S;
        ConstraintLayout constraintLayout = this.f7849h;
        if (c0179em != null && a90.m134r(constraintLayout.f474r, 256) && view.getMeasuredWidth() == c0143dm.m1260o() && view.getMeasuredWidth() < c0179em.m1260o() && view.getMeasuredHeight() == c0143dm.m1256i() && view.getMeasuredHeight() < c0179em.m1256i() && view.getBaseline() == c0143dm.f1706Z && !c0143dm.m1269x() && m4933a(c0143dm.f1686F, iMakeMeasureSpec, c0143dm.m1260o()) && m4933a(c0143dm.f1687G, iMakeMeasureSpec2, c0143dm.m1256i())) {
            c0834wb.f8498e = c0143dm.m1260o();
            c0834wb.f8499f = c0143dm.m1256i();
            c0834wb.f8500g = c0143dm.f1706Z;
            return;
        }
        boolean z6 = i2 == 3;
        boolean z7 = i3 == 3;
        boolean z8 = i3 == 4 || i3 == 1;
        boolean z9 = i2 == 4 || i2 == 1;
        boolean z10 = z6 && c0143dm.f1702V > 0.0f;
        boolean z11 = z7 && c0143dm.f1702V > 0.0f;
        if (view == null) {
            return;
        }
        C0733tl c0733tl = (C0733tl) view.getLayoutParams();
        int i14 = c0834wb.f8503j;
        if (i14 != 1 && i14 != 2 && z6 && c0143dm.f1739r == 0 && z7 && c0143dm.f1740s == 0) {
            i = -1;
            z = false;
            baseline = 0;
            iMax2 = 0;
            iMax = 0;
        } else {
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            c0143dm.f1686F = iMakeMeasureSpec;
            c0143dm.f1687G = iMakeMeasureSpec2;
            c0143dm.f1719g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i15 = c0143dm.f1742u;
            iMax = i15 > 0 ? Math.max(i15, measuredWidth) : measuredWidth;
            int i16 = c0143dm.f1743v;
            if (i16 > 0) {
                iMax = Math.min(i16, iMax);
            }
            int i17 = c0143dm.f1745x;
            iMax2 = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = iMakeMeasureSpec2;
            int i19 = c0143dm.f1746y;
            if (i19 > 0) {
                iMax2 = Math.min(i19, iMax2);
            }
            if (!a90.m134r(constraintLayout.f474r, 1)) {
                if (z10 && z8) {
                    iMax = (int) ((iMax2 * c0143dm.f1702V) + 0.5f);
                } else if (z11 && z9) {
                    iMax2 = (int) ((iMax / c0143dm.f1702V) + 0.5f);
                }
            }
            if (measuredWidth == iMax && measuredHeight == iMax2) {
                baseline = baseline2;
                i = -1;
                z = false;
            } else {
                if (measuredWidth != iMax) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i18;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                c0143dm.f1686F = iMakeMeasureSpec;
                c0143dm.f1687G = iMakeMeasureSpec3;
                z = false;
                c0143dm.f1719g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredWidth2;
                iMax2 = measuredHeight2;
                i = -1;
            }
        }
        boolean z12 = baseline != i ? true : z;
        c0834wb.f8502i = (iMax == c0834wb.f8496c && iMax2 == c0834wb.f8497d) ? z : true;
        boolean z13 = c0733tl.f7492c0 ? true : z12;
        if (z13 && baseline != -1 && c0143dm.f1706Z != baseline) {
            c0834wb.f8502i = true;
        }
        c0834wb.f8498e = iMax;
        c0834wb.f8499f = iMax2;
        c0834wb.f8501h = z13;
        c0834wb.f8500g = baseline;
    }
}
