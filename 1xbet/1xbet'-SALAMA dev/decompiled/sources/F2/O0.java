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

/* JADX INFO: loaded from: classes.dex */
public final class O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzbok f2616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f2617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p167y2.y f2618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N0 f2619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC0217a f2620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p167y2.d f2621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p167y2.j[] f2622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p172z2.e f2623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public M f2624i;
    public p167y2.A j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f2625k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p167y2.l f2626l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2627m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p167y2.r f2628n;

    public O0(p167y2.l lVar, AttributeSet attributeSet, boolean z4, int i7) {
        p167y2.j[] jVarArrG0;
        zzr zzrVar;
        k1 k1Var = k1.f2692a;
        this.f2616a = new zzbok();
        this.f2618c = new p167y2.y();
        this.f2619d = new N0(this);
        this.f2626l = lVar;
        this.f2617b = k1Var;
        this.f2624i = null;
        new AtomicBoolean(false);
        if (attributeSet != null) {
            Context context = lVar.getContext();
            try {
                TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, p167y2.t.f18182a);
                String string = typedArrayObtainAttributes.getString(0);
                String string2 = typedArrayObtainAttributes.getString(1);
                boolean zIsEmpty = TextUtils.isEmpty(string);
                boolean zIsEmpty2 = TextUtils.isEmpty(string2);
                if (!zIsEmpty && zIsEmpty2) {
                    jVarArrG0 = p097n3.a.g0(string);
                } else {
                    if (!zIsEmpty || zIsEmpty2) {
                        if (zIsEmpty) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                        }
                        typedArrayObtainAttributes.recycle();
                        throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
                    }
                    jVarArrG0 = p097n3.a.g0(string2);
                }
                String string3 = typedArrayObtainAttributes.getString(2);
                typedArrayObtainAttributes.recycle();
                if (TextUtils.isEmpty(string3)) {
                    throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
                }
                if (!z4 && jVarArrG0.length != 1) {
                    throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
                }
                this.f2622g = jVarArrG0;
                this.f2625k = string3;
                if (lVar.isInEditMode()) {
                    J2.d dVar = C0252s.f2717f.f2718a;
                    p167y2.j jVar = this.f2622g[0];
                    if (jVar.equals(p167y2.j.f18168q)) {
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
                zzr zzrVar3 = new zzr(context, p167y2.j.f18161i);
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

    public static zzr a(Context context, p167y2.j[] jVarArr) {
        for (p167y2.j jVar : jVarArr) {
            if (jVar.equals(p167y2.j.f18168q)) {
                return new zzr("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        zzr zzrVar = new zzr(context, jVarArr);
        zzrVar.f10765A = false;
        return zzrVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d5 A[Catch: RemoteException -> 0x00d3, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00d3, blocks: (B:28:0x00a1, B:30:0x00a7, B:32:0x00b5, B:34:0x00c7, B:37:0x00d5), top: B:51:0x00a1, outer: #1 }] */
    public final void b(M0 m7) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            M m8 = this.f2624i;
            p167y2.l lVar = this.f2626l;
            if (m8 == null) {
                if (this.f2622g == null || this.f2625k == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = lVar.getContext();
                zzr zzrVarA = a(context, this.f2622g);
                M m9 = "search_v2".equals(zzrVarA.f10771a) ? (M) new C0235j(C0252s.f2717f.f2719b, context, zzrVarA, this.f2625k).d(context, false) : (M) new C0231h(C0252s.f2717f.f2719b, context, zzrVarA, this.f2625k, this.f2616a).d(context, false);
                this.f2624i = m9;
                m9.zzD(new h1(this.f2619d));
                InterfaceC0217a interfaceC0217a = this.f2620e;
                if (interfaceC0217a != null) {
                    this.f2624i.zzC(new BinderC0249q(interfaceC0217a));
                }
                p172z2.e eVar = this.f2623h;
                if (eVar != null) {
                    this.f2624i.zzG(new zzayl(eVar));
                }
                p167y2.A a2 = this.j;
                if (a2 != null) {
                    this.f2624i.zzU(new zzfx(a2));
                }
                this.f2624i.zzP(new g1(this.f2628n));
                this.f2624i.zzN(this.f2627m);
                M m10 = this.f2624i;
                if (m10 != null) {
                    try {
                        p105o3.a aVarZzn = m10.zzn();
                        if (aVarZzn != null) {
                            if (((Boolean) zzbdw.zzf.zze()).booleanValue()) {
                                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlh)).booleanValue()) {
                                    J2.d.f3805b.post(new D6.y0(6, this, aVarZzn));
                                } else {
                                    lVar.addView((View) p105o3.b.t0(aVarZzn));
                                }
                            } else {
                                lVar.addView((View) p105o3.b.t0(aVarZzn));
                            }
                        }
                    } catch (RemoteException e7) {
                        J2.j.i("#007 Could not call remote method.", e7);
                    }
                }
            }
            m7.f2612m = jCurrentTimeMillis;
            M m11 = this.f2624i;
            if (m11 == null) {
                throw null;
            }
            k1 k1Var = this.f2617b;
            Context context2 = lVar.getContext();
            k1Var.getClass();
            m11.zzab(k1.a(context2, m7));
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

    public final void d(p167y2.j... jVarArr) {
        p167y2.l lVar = this.f2626l;
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

    public final void e(p172z2.e eVar) {
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
