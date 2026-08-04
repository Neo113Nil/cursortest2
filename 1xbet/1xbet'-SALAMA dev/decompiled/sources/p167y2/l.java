package p167y2;

import F2.C0252s;
import F2.C0254t;
import F2.F0;
import F2.InterfaceC0217a;
import F2.M;
import F2.N0;
import F2.O0;
import F2.g1;
import J2.b;
import J2.d;
import J2.j;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbdw;
import p083l4.x;
import p172z2.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O0 f18180a;

    public l(Context context) {
        super(context);
        this.f18180a = new O0(this, null, false, 0);
    }

    public final void a() {
        zzbby.zza(getContext());
        if (((Boolean) zzbdw.zze.zze()).booleanValue()) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzle)).booleanValue()) {
                b.f3804b.execute(new C(this, 1));
                return;
            }
        }
        O0 o7 = this.f18180a;
        o7.getClass();
        try {
            M m7 = o7.f2624i;
            if (m7 != null) {
                m7.zzx();
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void b(i iVar) {
        D.d("#008 Must be called on the main UI thread.");
        zzbby.zza(getContext());
        if (((Boolean) zzbdw.zzf.zze()).booleanValue()) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlh)).booleanValue()) {
                b.f3804b.execute(new x(12, this, iVar, false));
                return;
            }
        }
        this.f18180a.b(iVar.f18160a);
    }

    public d getAdListener() {
        return this.f18180a.f2621f;
    }

    public j getAdSize() {
        zzr zzrVarZzg;
        O0 o7 = this.f18180a;
        o7.getClass();
        try {
            M m7 = o7.f2624i;
            if (m7 != null && (zzrVarZzg = m7.zzg()) != null) {
                return new j(zzrVarZzg.f10775e, zzrVarZzg.f10772b, zzrVarZzg.f10771a);
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
        j[] jVarArr = o7.f2622g;
        if (jVarArr != null) {
            return jVarArr[0];
        }
        return null;
    }

    public String getAdUnitId() {
        M m7;
        O0 o7 = this.f18180a;
        if (o7.f2625k == null && (m7 = o7.f2624i) != null) {
            try {
                o7.f2625k = m7.zzr();
            } catch (RemoteException e7) {
                j.i("#007 Could not call remote method.", e7);
            }
        }
        return o7.f2625k;
    }

    public r getOnPaidEventListener() {
        return this.f18180a.f2628n;
    }

    public v getResponseInfo() {
        F0 f0Zzk;
        O0 o7 = this.f18180a;
        o7.getClass();
        try {
            M m7 = o7.f2624i;
            f0Zzk = m7 != null ? m7.zzk() : null;
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
        if (f0Zzk != null) {
            return new v(f0Zzk);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i11 = ((i9 - i7) - measuredWidth) / 2;
        int i12 = ((i10 - i8) - measuredHeight) / 2;
        childAt.layout(i11, i12, measuredWidth + i11, measuredHeight + i12);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        j adSize;
        int measuredHeight;
        int iP;
        int iP2;
        int i9;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e7) {
                j.e("Unable to retrieve ad size.", e7);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int i10 = adSize.f18170a;
                if (i10 == -3) {
                    iP = -1;
                } else if (i10 != -1) {
                    d dVar = C0252s.f2717f.f2718a;
                    iP = d.p(i10, context);
                } else {
                    iP = context.getResources().getDisplayMetrics().widthPixels;
                }
                int i11 = adSize.f18171b;
                if (i11 == -4 || i11 == -3) {
                    iP2 = -1;
                } else if (i11 != -2) {
                    d dVar2 = C0252s.f2717f.f2718a;
                    iP2 = d.p(i11, context);
                } else {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f7 = displayMetrics.heightPixels;
                    float f8 = displayMetrics.density;
                    int i12 = (int) (f7 / f8);
                    if (i12 <= 400) {
                        i9 = 32;
                    } else {
                        i9 = i12 <= 720 ? 50 : 90;
                    }
                    iP2 = (int) (i9 * f8);
                }
                measuredHeight = iP2;
                measuredWidth = iP;
            } else {
                measuredHeight = 0;
            }
        } else {
            measureChild(childAt, i7, i8);
            measuredWidth = childAt.getMeasuredWidth();
            measuredHeight = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i7), View.resolveSize(Math.max(measuredHeight, getSuggestedMinimumHeight()), i8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(d dVar) {
        O0 o7 = this.f18180a;
        o7.f2621f = dVar;
        N0 n2 = o7.f2619d;
        synchronized (n2.f2613a) {
            n2.f2614b = dVar;
        }
        if (dVar == 0) {
            this.f18180a.c(null);
            return;
        }
        if (dVar instanceof InterfaceC0217a) {
            this.f18180a.c((InterfaceC0217a) dVar);
        }
        if (dVar instanceof e) {
            this.f18180a.e((e) dVar);
        }
    }

    public void setAdSize(j jVar) {
        j[] jVarArr = {jVar};
        O0 o7 = this.f18180a;
        if (o7.f2622g != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        o7.d(jVarArr);
    }

    public void setAdUnitId(String str) {
        O0 o7 = this.f18180a;
        if (o7.f2625k != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        o7.f2625k = str;
    }

    public void setOnPaidEventListener(r rVar) {
        O0 o7 = this.f18180a;
        o7.getClass();
        try {
            o7.f2628n = rVar;
            M m7 = o7.f2624i;
            if (m7 != null) {
                m7.zzP(new g1(rVar));
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public l(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f18180a = new O0(this, attributeSet, false, 0);
    }

    public l(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7);
        this.f18180a = new O0(this, attributeSet, true, 0);
    }
}
