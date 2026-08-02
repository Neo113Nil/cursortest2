package J2;

import Q2.B0;
import Q2.C0;
import Q2.C0379q;
import Q2.InterfaceC0347a;
import Q2.InterfaceC0383s0;
import Q2.K;
import Q2.Q0;
import Q2.a1;
import android.content.Context;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.AbstractC0968f8;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.P5;
import m3.v;

/* loaded from: classes.dex */
public abstract class l extends ViewGroup {

    /* renamed from: k, reason: collision with root package name */
    public final C0 f2723k;

    public l(Context context) {
        super(context);
        this.f2723k = new C0(this);
    }

    public final void a(h hVar) {
        v.c("#008 Must be called on the main UI thread.");
        F7.a(getContext());
        if (((Boolean) AbstractC0968f8.f.s()).booleanValue()) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.La)).booleanValue()) {
                U2.c.f5860b.execute(new D3.h(7, this, hVar, false));
                return;
            }
        }
        this.f2723k.j(hVar.f2711a);
    }

    public d getAdListener() {
        return (d) this.f2723k.f;
    }

    public i getAdSize() {
        a1 f;
        C0 c02 = this.f2723k;
        c02.getClass();
        try {
            K k5 = (K) c02.i;
            if (k5 != null && (f = k5.f()) != null) {
                return new i(f.f4978o, f.f4975l, f.f4974k);
            }
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
        i[] iVarArr = (i[]) c02.f4907g;
        if (iVarArr != null) {
            return iVarArr[0];
        }
        return null;
    }

    public String getAdUnitId() {
        K k5;
        C0 c02 = this.f2723k;
        if (((String) c02.f4909j) == null && (k5 = (K) c02.i) != null) {
            try {
                c02.f4909j = k5.t();
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
            }
        }
        return (String) c02.f4909j;
    }

    public o getOnPaidEventListener() {
        this.f2723k.getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q getResponseInfo() {
        InterfaceC0383s0 interfaceC0383s0;
        K k5;
        C0 c02 = this.f2723k;
        c02.getClass();
        try {
            k5 = (K) c02.i;
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
        if (k5 != null) {
            interfaceC0383s0 = k5.k();
            if (interfaceC0383s0 == null) {
                return new q(interfaceC0383s0);
            }
            return null;
        }
        interfaceC0383s0 = null;
        if (interfaceC0383s0 == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i5, int i6, int i7) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i8 = ((i6 - i) - measuredWidth) / 2;
        int i9 = ((i7 - i5) - measuredHeight) / 2;
        childAt.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        i iVar;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                iVar = getAdSize();
            } catch (NullPointerException e3) {
                U2.j.g("Unable to retrieve ad size.", e3);
                iVar = null;
            }
            if (iVar != null) {
                Context context = getContext();
                int i10 = iVar.f2714a;
                if (i10 == -3) {
                    i7 = -1;
                } else if (i10 != -1) {
                    U2.e eVar = C0379q.f.f5048a;
                    i7 = U2.e.l(context, i10);
                } else {
                    i7 = context.getResources().getDisplayMetrics().widthPixels;
                }
                int i11 = iVar.f2715b;
                if (i11 == -4 || i11 == -3) {
                    i8 = -1;
                } else if (i11 != -2) {
                    U2.e eVar2 = C0379q.f.f5048a;
                    i8 = U2.e.l(context, i11);
                } else {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f = displayMetrics.heightPixels;
                    float f5 = displayMetrics.density;
                    int i12 = (int) (f / f5);
                    i8 = (int) ((i12 <= 400 ? 32 : i12 <= 720 ? 50 : 90) * f5);
                }
                i6 = i8;
                i9 = i7;
            } else {
                i6 = 0;
            }
        } else {
            measureChild(childAt, i, i5);
            i9 = childAt.getMeasuredWidth();
            i6 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i9, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i6, getSuggestedMinimumHeight()), i5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(d dVar) {
        C0 c02 = this.f2723k;
        c02.f = dVar;
        B0 b02 = (B0) c02.f4905d;
        synchronized (b02.f4899k) {
            b02.f4900l = dVar;
        }
        if (dVar == 0) {
            this.f2723k.k(null);
            return;
        }
        if (dVar instanceof InterfaceC0347a) {
            this.f2723k.k((InterfaceC0347a) dVar);
        }
        if (dVar instanceof K2.d) {
            C0 c03 = this.f2723k;
            K2.d dVar2 = (K2.d) dVar;
            c03.getClass();
            try {
                c03.f4908h = dVar2;
                K k5 = (K) c03.i;
                if (k5 != null) {
                    k5.h3(new P5(dVar2));
                }
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
            }
        }
    }

    public void setAdSize(i iVar) {
        i[] iVarArr = {iVar};
        C0 c02 = this.f2723k;
        if (((i[]) c02.f4907g) != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        l lVar = (l) c02.f4910k;
        c02.f4907g = iVarArr;
        try {
            K k5 = (K) c02.i;
            if (k5 != null) {
                k5.w0(C0.f(lVar.getContext(), (i[]) c02.f4907g));
            }
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
        lVar.requestLayout();
    }

    public void setAdUnitId(String str) {
        C0 c02 = this.f2723k;
        if (((String) c02.f4909j) != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        c02.f4909j = str;
    }

    public void setOnPaidEventListener(o oVar) {
        C0 c02 = this.f2723k;
        c02.getClass();
        try {
            K k5 = (K) c02.i;
            if (k5 != null) {
                k5.G1(new Q0());
            }
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }
}
