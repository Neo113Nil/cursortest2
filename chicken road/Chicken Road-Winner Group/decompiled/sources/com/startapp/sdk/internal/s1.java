package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants$AdApiType;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class s1 extends com.startapp.sdk.adsbase.c {

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f4313k;

    /* renamed from: l, reason: collision with root package name */
    public final HashSet f4314l;

    /* renamed from: m, reason: collision with root package name */
    public com.startapp.sdk.adsbase.model.a f4315m;

    /* renamed from: n, reason: collision with root package name */
    public int f4316n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f4317o;

    /* renamed from: p, reason: collision with root package name */
    public final ib f4318p;

    public s1(Context context, m8 m8Var, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, boolean z3) {
        super(context, m8Var, adPreferences, adEventListener, placement, ibVar, ibVar2, ibVar3, ibVar4);
        this.f4313k = new HashSet();
        this.f4314l = new HashSet();
        this.f4316n = 0;
        this.f4318p = ibVar5;
        this.f4317o = z3;
    }

    public final /* synthetic */ Void a(Throwable th) {
        this.f = th != null ? th.getMessage() : null;
        return null;
    }

    public boolean b(com.startapp.sdk.adsbase.model.a aVar) {
        return aVar != null;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final Object e() {
        com.startapp.sdk.adsbase.model.a c3 = c();
        this.f4315m = c3;
        if (!b(c3)) {
            return null;
        }
        if (this.f4313k.size() == 0) {
            this.f4313k.add(this.f3185a.getPackageName());
        }
        com.startapp.sdk.adsbase.model.a aVar = this.f4315m;
        aVar.f3259H0 = this.f4313k;
        aVar.J0 = this.f4314l;
        if (this.f4316n > 0) {
            aVar.f3262L0 = false;
            if (MetaData.E().W().a(this.f3185a)) {
                com.startapp.sdk.adsbase.g.e(this.f3185a);
            }
        }
        n8 n8Var = new n8((o8) this.f3190g.a(), this.f4315m.a(h0.a(AdsConstants$AdApiType.HTML, this.f3189e)));
        n8Var.f4098e = new F1.b(20, this);
        a(n8Var);
        o8 o8Var = (o8) this.f3190g.a();
        n8Var.f4097d = ((HttpClientConfig) o8Var.f.a()).a(this.f4315m.f4676Z);
        return n8Var.a();
    }

    public final Void a(n8 n8Var) {
        x6 x6Var = (x6) this.f3192i.a();
        WeakHashMap weakHashMap = si.f4343a;
        n8Var.getClass();
        ((y6) x6Var).a(this, n8Var);
        return null;
    }

    @Override // com.startapp.sdk.adsbase.c
    public boolean a(Object obj) {
        Ad.AdType adType;
        if (obj == null) {
            if (this.f == null) {
                this.f = "No response";
            }
            return false;
        }
        if (!(obj instanceof r8)) {
            if (this.f == null) {
                this.f = "Unknown error";
            }
            return false;
        }
        r8 r8Var = (r8) obj;
        String str = r8Var.f4290b;
        try {
            ArrayList arrayList = new ArrayList();
            if (TextUtils.isEmpty(str)) {
                if (this.f == null) {
                    com.startapp.sdk.adsbase.model.a aVar = this.f4315m;
                    if (aVar == null || ((adType = aVar.f3270U0) != Ad.AdType.VIDEO && adType != Ad.AdType.REWARDED_VIDEO)) {
                        this.f = "Empty Ad";
                    }
                    this.f = "Video isn't available";
                }
                return false;
            }
            boolean z3 = AdsCommonMetaData.k().G() && t0.a(this.f3185a, t0.a(str, this.f4316n), this.f4316n, this.f4313k, arrayList).booleanValue();
            if (z3) {
                Context context = this.f3185a;
                ((Executor) com.startapp.sdk.components.a.a(context).f3335A.a()).execute(new s0(context, arrayList).f4312c);
            } else {
                m8 m8Var = (m8) this.f3186b;
                m8Var.getClass();
                m8Var.setRequestUrl(r8Var.f4289a);
                m8Var.d(str);
            }
            if (!z3) {
                return true;
            }
            this.f4316n++;
            return b();
        } catch (Throwable th) {
            d9.a(th);
            return false;
        }
    }

    public final void e(boolean z3) {
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.f3186b.hashCode());
        intent.putExtra("adResult", z3);
        wb.a(this.f3185a).a(intent);
        if (z3) {
            if (this.f4317o) {
                ((y6) ((x6) this.f3192i.a())).c(this, fi.f3725u);
                ((pk) this.f4318p.a()).a(((m8) this.f3186b).f4031b, new r1(this, this));
                return;
            }
            Context context = this.f3185a;
            AdEventListener adEventListener = this.f3188d;
            this.f3188d = null;
            a0.b(context, adEventListener, this.f3186b, false);
            return;
        }
        Context context2 = this.f3185a;
        AdEventListener adEventListener2 = this.f3188d;
        this.f3188d = null;
        a0.a(context2, adEventListener2, this.f3186b, false);
    }
}
