package F2;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzfx;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbdw;
import com.google.android.gms.internal.ads.zzbok;
import java.util.concurrent.atomic.AtomicBoolean;
import n3.AbstractC1464a;
import o3.BinderC1507b;
import o3.InterfaceC1506a;
import y2.C1796A;

/* loaded from: classes.dex */
public final class O0 {

    /* renamed from: a, reason: collision with root package name */
    public final zzbok f2616a;

    /* renamed from: b, reason: collision with root package name */
    public final k1 f2617b;

    /* renamed from: c, reason: collision with root package name */
    public final y2.y f2618c;

    /* renamed from: d, reason: collision with root package name */
    public final N0 f2619d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0217a f2620e;

    /* renamed from: f, reason: collision with root package name */
    public y2.d f2621f;

    /* renamed from: g, reason: collision with root package name */
    public y2.j[] f2622g;

    /* renamed from: h, reason: collision with root package name */
    public z2.e f2623h;

    /* renamed from: i, reason: collision with root package name */
    public M f2624i;
    public C1796A j;

    /* renamed from: k, reason: collision with root package name */
    public String f2625k;

    /* renamed from: l, reason: collision with root package name */
    public final y2.l f2626l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2627m;

    /* renamed from: n, reason: collision with root package name */
    public y2.r f2628n;

    public O0(y2.l lVar, AttributeSet attributeSet, boolean z4, int i7) {
        y2.j[] g02;
        zzr zzrVar;
        k1 k1Var = k1.f2692a;
        this.f2616a = new zzbok();
        this.f2618c = new y2.y();
        this.f2619d = new N0(this);
        this.f2626l = lVar;
        this.f2617b = k1Var;
        this.f2624i = null;
        new AtomicBoolean(false);
        if (attributeSet != null) {
            Context context = lVar.getContext();
            try {
                TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, y2.t.f18176a);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(1);
                boolean isEmpty = TextUtils.isEmpty(string);
                boolean isEmpty2 = TextUtils.isEmpty(string2);
                if (!isEmpty && isEmpty2) {
                    g02 = AbstractC1464a.g0(string);
                } else {
                    if (!isEmpty || isEmpty2) {
                        if (isEmpty) {
                            obtainAttributes.recycle();
                            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                        }
                        obtainAttributes.recycle();
                        throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
                    }
                    g02 = AbstractC1464a.g0(string2);
                }
                String string3 = obtainAttributes.getString(2);
                obtainAttributes.recycle();
                if (TextUtils.isEmpty(string3)) {
                    throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
                }
                if (!z4 && g02.length != 1) {
                    throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
                }
                this.f2622g = g02;
                this.f2625k = string3;
                if (lVar.isInEditMode()) {
                    J2.d dVar = C0252s.f2717f.f2718a;
                    y2.j jVar = this.f2622g[0];
                    if (jVar.equals(y2.j.f18162q)) {
                        zzrVar = new zzr("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        zzr zzrVar2 = new zzr(context, jVar);
                        zzrVar2.f10765A = false;
                        zzrVar = zzrVar2;
                    }
                    dVar.getClass();
                    J2.d.e(lVar, zzrVar, "Ads by Google", -16777216, -1);
                }
            } catch (IllegalArgumentException e7) {
                J2.d dVar2 = C0252s.f2717f.f2718a;
                zzr zzrVar3 = new zzr(context, y2.j.f18155i);
                String message = e7.getMessage();
                String message2 = e7.getMessage();
                dVar2.getClass();
                if (message2 != null) {
                    J2.j.g(message2);
                }
                J2.d.e(lVar, zzrVar3, message, -65536, -16777216);
            }
        }
    }

    public static zzr a(Context context, y2.j[] jVarArr) {
        for (y2.j jVar : jVarArr) {
            if (jVar.equals(y2.j.f18162q)) {
                return new zzr("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        zzr zzrVar = new zzr(context, jVarArr);
        zzrVar.f10765A = false;
        return zzrVar;
    }

    public final void b(M0 m02) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            M m7 = this.f2624i;
            y2.l lVar = this.f2626l;
            if (m7 == null) {
                if (this.f2622g == null || this.f2625k == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = lVar.getContext();
                zzr a2 = a(context, this.f2622g);
                M m8 = "search_v2".equals(a2.f10771a) ? (M) new C0235j(C0252s.f2717f.f2719b, context, a2, this.f2625k).d(context, false) : (M) new C0231h(C0252s.f2717f.f2719b, context, a2, this.f2625k, this.f2616a).d(context, false);
                this.f2624i = m8;
                m8.zzD(new h1(this.f2619d));
                InterfaceC0217a interfaceC0217a = this.f2620e;
                if (interfaceC0217a != null) {
                    this.f2624i.zzC(new BinderC0249q(interfaceC0217a));
                }
                z2.e eVar = this.f2623h;
                if (eVar != null) {
                    this.f2624i.zzG(new zzayl(eVar));
                }
                C1796A c1796a = this.j;
                if (c1796a != null) {
                    this.f2624i.zzU(new zzfx(c1796a));
                }
                this.f2624i.zzP(new g1(this.f2628n));
                this.f2624i.zzN(this.f2627m);
                M m9 = this.f2624i;
                if (m9 != null) {
                    try {
                        InterfaceC1506a zzn = m9.zzn();
                        if (zzn != null) {
                            if (((Boolean) zzbdw.zzf.zze()).booleanValue()) {
                                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlh)).booleanValue()) {
                                    J2.d.f3805b.post(new D6.y0(6, this, zzn));
                                }
                            }
                            lVar.addView((View) BinderC1507b.t0(zzn));
                        }
                    } catch (RemoteException e7) {
                        J2.j.i("#007 Could not call remote method.", e7);
                    }
                }
            }
            m02.f2612m = currentTimeMillis;
            M m10 = this.f2624i;
            if (m10 == null) {
                throw null;
            }
            k1 k1Var = this.f2617b;
            Context context2 = lVar.getContext();
            k1Var.getClass();
            m10.zzab(k1.a(context2, m02));
        } catch (RemoteException e8) {
            J2.j.i("#007 Could not call remote method.", e8);
        }
    }

    public final void c(InterfaceC0217a interfaceC0217a) {
        try {
            this.f2620e = interfaceC0217a;
            M m7 = this.f2624i;
            if (m7 != null) {
                m7.zzC(interfaceC0217a != null ? new BinderC0249q(interfaceC0217a) : null);
            }
        } catch (RemoteException e7) {
            J2.j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void d(y2.j... jVarArr) {
        y2.l lVar = this.f2626l;
        this.f2622g = jVarArr;
        try {
            M m7 = this.f2624i;
            if (m7 != null) {
                m7.zzF(a(lVar.getContext(), this.f2622g));
            }
        } catch (RemoteException e7) {
            J2.j.i("#007 Could not call remote method.", e7);
        }
        lVar.requestLayout();
    }

    public final void e(z2.e eVar) {
        try {
            this.f2623h = eVar;
            M m7 = this.f2624i;
            if (m7 != null) {
                m7.zzG(eVar != null ? new zzayl(eVar) : null);
            }
        } catch (RemoteException e7) {
            J2.j.i("#007 Could not call remote method.", e7);
        }
    }
}
