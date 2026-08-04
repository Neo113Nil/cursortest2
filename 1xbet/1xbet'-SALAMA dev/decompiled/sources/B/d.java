package B;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Placeholder;
import androidx.constraintlayout.widget.VirtualLayout;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
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

    public final void b(p149v.e eVar, p154w.b bVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int i7;
        int iMakeMeasureSpec3;
        boolean z4;
        int measuredWidth;
        int baseline;
        int i8;
        if (eVar == null) {
            return;
        }
        if (eVar.f16965i0 == 8 && !eVar.f16928F) {
            bVar.f17224e = 0;
            bVar.f17225f = 0;
            bVar.f17226g = 0;
            return;
        }
        if (eVar.f16944V == null) {
            return;
        }
        p149v.d dVar = bVar.f17220a;
        p149v.d dVar2 = bVar.f17221b;
        int i9 = bVar.f17222c;
        int i10 = bVar.f17223d;
        int i11 = this.f769b + this.f770c;
        int i12 = this.f771d;
        View view = eVar.f16963h0;
        int iOrdinal = dVar.ordinal();
        p149v.c cVar = eVar.f16934L;
        p149v.c cVar2 = eVar.f16932J;
        if (iOrdinal == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        } else if (iOrdinal == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f773f, i12, -2);
        } else if (iOrdinal == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f773f, i12, -2);
            boolean z7 = eVar.f16981r == 1;
            int i13 = bVar.j;
            if (i13 == 1 || i13 == 2) {
                boolean z8 = view.getMeasuredHeight() == eVar.l();
                if (bVar.j == 2 || !z7 || ((z7 && z8) || (view instanceof Placeholder) || eVar.B())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.r(), 1073741824);
                }
            }
        } else if (iOrdinal != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i14 = this.f773f;
            int i15 = cVar2 != null ? cVar2.f16915g : 0;
            if (cVar != null) {
                i15 += cVar.f16915g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i14, i12 + i15, -1);
        }
        int iOrdinal2 = dVar2.ordinal();
        if (iOrdinal2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        } else if (iOrdinal2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f774g, i11, -2);
        } else if (iOrdinal2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f774g, i11, -2);
            boolean z9 = eVar.f16983s == 1;
            int i16 = bVar.j;
            if (i16 == 1 || i16 == 2) {
                boolean z10 = view.getMeasuredWidth() == eVar.r();
                if (bVar.j == 2 || !z9 || ((z9 && z10) || (view instanceof Placeholder) || eVar.C())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.l(), 1073741824);
                }
            }
        } else if (iOrdinal2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i17 = this.f774g;
            int i18 = cVar2 != null ? eVar.f16933K.f16915g : 0;
            if (cVar != null) {
                i18 += eVar.f16935M.f16915g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i17, i11 + i18, -1);
        }
        p149v.f fVar = (p149v.f) eVar.f16944V;
        ConstraintLayout constraintLayout = this.f775h;
        if (fVar != null && p149v.k.c(constraintLayout.f9015z, 256) && view.getMeasuredWidth() == eVar.r() && view.getMeasuredWidth() < fVar.r() && view.getMeasuredHeight() == eVar.l() && view.getMeasuredHeight() < fVar.l() && view.getBaseline() == eVar.c0 && !eVar.A() && a(eVar.f16930H, iMakeMeasureSpec, eVar.r()) && a(eVar.f16931I, iMakeMeasureSpec2, eVar.l())) {
            bVar.f17224e = eVar.r();
            bVar.f17225f = eVar.l();
            bVar.f17226g = eVar.c0;
            return;
        }
        p149v.d dVar3 = p149v.d.f16920c;
        boolean z11 = dVar == dVar3;
        boolean z12 = dVar2 == dVar3;
        p149v.d dVar4 = p149v.d.f16921d;
        p149v.d dVar5 = p149v.d.f16918a;
        boolean z13 = dVar2 == dVar4 || dVar2 == dVar5;
        boolean z14 = dVar == dVar4 || dVar == dVar5;
        boolean z15 = z11 && eVar.f16947Y > 0.0f;
        boolean z16 = z12 && eVar.f16947Y > 0.0f;
        if (view == null) {
            return;
        }
        c cVar3 = (c) view.getLayoutParams();
        int i19 = bVar.j;
        if (i19 != 1 && i19 != 2 && z11 && eVar.f16981r == 0 && z12 && eVar.f16983s == 0) {
            z4 = false;
            measuredWidth = 0;
            i8 = -1;
            baseline = 0;
            iMax = 0;
        } else {
            if ((view instanceof VirtualLayout) && (eVar instanceof p149v.m)) {
                ((VirtualLayout) view).r((p149v.m) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            eVar.f16930H = iMakeMeasureSpec;
            eVar.f16931I = iMakeMeasureSpec2;
            eVar.f16960g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i20 = eVar.f16987u;
            int iMax2 = i20 > 0 ? Math.max(i20, measuredWidth2) : measuredWidth2;
            int i21 = eVar.f16988v;
            if (i21 > 0) {
                iMax2 = Math.min(i21, iMax2);
            }
            int i22 = eVar.f16990x;
            iMax = i22 > 0 ? Math.max(i22, measuredHeight) : measuredHeight;
            int i23 = iMakeMeasureSpec;
            int i24 = eVar.f16991y;
            if (i24 > 0) {
                iMax = Math.min(i24, iMax);
            }
            if (!p149v.k.c(constraintLayout.f9015z, 1)) {
                if (z15 && z13) {
                    iMax2 = (int) ((iMax * eVar.f16947Y) + 0.5f);
                } else if (z16 && z14) {
                    iMax = (int) ((iMax2 / eVar.f16947Y) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z4 = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    i7 = 1073741824;
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                } else {
                    i7 = 1073741824;
                    iMakeMeasureSpec3 = i23;
                }
                if (measuredHeight != iMax) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax, i7);
                }
                view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                eVar.f16930H = iMakeMeasureSpec3;
                eVar.f16931I = iMakeMeasureSpec2;
                z4 = false;
                eVar.f16960g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i8 = -1;
        }
        boolean z17 = baseline != i8 ? true : z4;
        if (measuredWidth != bVar.f17222c || iMax != bVar.f17223d) {
            z4 = true;
        }
        bVar.f17228i = z4;
        boolean z18 = cVar3.c0 ? true : z17;
        if (z18 && baseline != -1 && eVar.c0 != baseline) {
            bVar.f17228i = true;
        }
        bVar.f17224e = measuredWidth;
        bVar.f17225f = iMax;
        bVar.f17227h = z18;
        bVar.f17226g = baseline;
    }
}
