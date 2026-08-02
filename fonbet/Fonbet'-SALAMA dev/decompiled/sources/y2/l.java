package y2;

import F2.C0252s;
import F2.C0254t;
import F2.F0;
import F2.InterfaceC0217a;
import F2.M;
import F2.N0;
import F2.O0;
import F2.g1;
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

/* loaded from: classes.dex */
public abstract class l extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final O0 f18174a;

    public l(Context context) {
        super(context);
        this.f18174a = new O0(this, null, false, 0);
    }

    public final void a() {
        zzbby.zza(getContext());
        if (((Boolean) zzbdw.zze.zze()).booleanValue()) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzle)).booleanValue()) {
                J2.b.f3804b.execute(new C(this, 1));
                return;
            }
        }
        O0 o02 = this.f18174a;
        o02.getClass();
        try {
            M m7 = o02.f2624i;
            if (m7 != null) {
                m7.zzx();
            }
        } catch (RemoteException e7) {
            J2.j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void b(i iVar) {
        D.d("#008 Must be called on the main UI thread.");
        zzbby.zza(getContext());
        if (((Boolean) zzbdw.zzf.zze()).booleanValue()) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlh)).booleanValue()) {
                J2.b.f3804b.execute(new l4.x(12, this, iVar, false));
                return;
            }
        }
        this.f18174a.b(iVar.f18154a);
    }

    public d getAdListener() {
        return this.f18174a.f2621f;
    }

    public j getAdSize() {
        zzr zzg;
        O0 o02 = this.f18174a;
        o02.getClass();
        try {
            M m7 = o02.f2624i;
            if (m7 != null && (zzg = m7.zzg()) != null) {
                return new j(zzg.f10775e, zzg.f10772b, zzg.f10771a);
            }
        } catch (RemoteException e7) {
            J2.j.i("#007 Could not call remote method.", e7);
        }
        j[] jVarArr = o02.f2622g;
        if (jVarArr != null) {
            return jVarArr[0];
        }
        return null;
    }

    public String getAdUnitId() {
        M m7;
        O0 o02 = this.f18174a;
        if (o02.f2625k == null && (m7 = o02.f2624i) != null) {
            try {
                o02.f2625k = m7.zzr();
            } catch (RemoteException e7) {
                J2.j.i("#007 Could not call remote method.", e7);
            }
        }
        return o02.f2625k;
    }

    public r getOnPaidEventListener() {
        return this.f18174a.f2628n;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v getResponseInfo() {
        F0 f02;
        M m7;
        O0 o02 = this.f18174a;
        o02.getClass();
        try {
            m7 = o02.f2624i;
        } catch (RemoteException e7) {
            J2.j.i("#007 Could not call remote method.", e7);
        }
        if (m7 != null) {
            f02 = m7.zzk();
            if (f02 == null) {
                return new v(f02);
            }
            return null;
        }
        f02 = null;
        if (f02 == null) {
        }
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
        j jVar;
        int i9;
        int i10;
        int i11;
        int i12 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                jVar = getAdSize();
            } catch (NullPointerException e7) {
                J2.j.e("Unable to retrieve ad size.", e7);
                jVar = null;
            }
            if (jVar != null) {
                Context context = getContext();
                int i13 = jVar.f18164a;
                if (i13 == -3) {
                    i10 = -1;
                } else if (i13 != -1) {
                    J2.d dVar = C0252s.f2717f.f2718a;
                    i10 = J2.d.p(i13, context);
                } else {
                    i10 = context.getResources().getDisplayMetrics().widthPixels;
                }
                int i14 = jVar.f18165b;
                if (i14 == -4 || i14 == -3) {
                    i11 = -1;
                } else if (i14 != -2) {
                    J2.d dVar2 = C0252s.f2717f.f2718a;
                    i11 = J2.d.p(i14, context);
                } else {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f7 = displayMetrics.heightPixels;
                    float f8 = displayMetrics.density;
                    int i15 = (int) (f7 / f8);
                    i11 = (int) ((i15 <= 400 ? 32 : i15 <= 720 ? 50 : 90) * f8);
                }
                i9 = i11;
                i12 = i10;
            } else {
                i9 = 0;
            }
        } else {
            measureChild(childAt, i7, i8);
            i12 = childAt.getMeasuredWidth();
            i9 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i12, getSuggestedMinimumWidth()), i7), View.resolveSize(Math.max(i9, getSuggestedMinimumHeight()), i8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(d dVar) {
        O0 o02 = this.f18174a;
        o02.f2621f = dVar;
        N0 n02 = o02.f2619d;
        synchronized (n02.f2613a) {
            n02.f2614b = dVar;
        }
        if (dVar == 0) {
            this.f18174a.c(null);
            return;
        }
        if (dVar instanceof InterfaceC0217a) {
            this.f18174a.c((InterfaceC0217a) dVar);
        }
        if (dVar instanceof z2.e) {
            this.f18174a.e((z2.e) dVar);
        }
    }

    public void setAdSize(j jVar) {
        j[] jVarArr = {jVar};
        O0 o02 = this.f18174a;
        if (o02.f2622g != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        o02.d(jVarArr);
    }

    public void setAdUnitId(String str) {
        O0 o02 = this.f18174a;
        if (o02.f2625k != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        o02.f2625k = str;
    }

    public void setOnPaidEventListener(r rVar) {
        O0 o02 = this.f18174a;
        o02.getClass();
        try {
            o02.f2628n = rVar;
            M m7 = o02.f2624i;
            if (m7 != null) {
                m7.zzP(new g1(rVar));
            }
        } catch (RemoteException e7) {
            J2.j.i("#007 Could not call remote method.", e7);
        }
    }

    public l(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f18174a = new O0(this, attributeSet, false, 0);
    }

    public l(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7);
        this.f18174a = new O0(this, attributeSet, true, 0);
    }
}
