package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import com.startapp.json.JsonParser;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsConstants$AdApiType;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdResponse;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class t1 extends com.startapp.sdk.adsbase.c {

    /* renamed from: k, reason: collision with root package name */
    public int f4354k;

    /* renamed from: l, reason: collision with root package name */
    public final HashSet f4355l;

    public t1(Context context, db dbVar, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4) {
        super(context, dbVar, adPreferences, adEventListener, placement, ibVar, ibVar2, ibVar3, ibVar4);
        this.f4354k = 0;
        this.f4355l = new HashSet();
    }

    public final /* synthetic */ Void a(Throwable th) {
        this.f = th != null ? th.getMessage() : null;
        return null;
    }

    public abstract void a(Ad ad);

    @Override // com.startapp.sdk.adsbase.c
    /* renamed from: c */
    public final void b(boolean z3) {
        super.b(z3);
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.f3186b.hashCode());
        intent.putExtra("adResult", z3);
        wb.a(this.f3185a).a(intent);
        if (z3) {
            a(this.f3186b);
            Context context = this.f3185a;
            AdEventListener adEventListener = this.f3188d;
            this.f3188d = null;
            a0.b(context, adEventListener, this.f3186b, false);
        }
    }

    @Override // com.startapp.sdk.adsbase.c
    public final Object e() {
        com.startapp.sdk.adsbase.model.a c3 = c();
        if (c3 == null) {
            return null;
        }
        if (this.f4355l.size() == 0) {
            this.f4355l.add(this.f3185a.getPackageName());
        }
        int i3 = this.f4354k;
        if (i3 > 0) {
            c3.f3262L0 = false;
        }
        c3.f3259H0 = this.f4355l;
        c3.f3262L0 = i3 == 0;
        n8 n8Var = new n8((o8) this.f3190g.a(), c3.a(h0.a(AdsConstants$AdApiType.JSON, this.f3189e)));
        n8Var.f4098e = new F1.b(21, this);
        a(n8Var);
        n8Var.f4097d = ((HttpClientConfig) ((o8) this.f3190g.a()).f.a()).a(c3.f4676Z);
        r8 a3 = n8Var.a();
        if (a3 == null) {
            return null;
        }
        try {
            return JsonParser.fromJson(a3.f4290b, GetAdResponse.class);
        } catch (Throwable th) {
            d9.a(th);
            return null;
        }
    }

    public final Void a(n8 n8Var) {
        x6 x6Var = (x6) this.f3192i.a();
        WeakHashMap weakHashMap = si.f4343a;
        n8Var.getClass();
        ((y6) x6Var).a(this, n8Var);
        return null;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final boolean a(Object obj) {
        int i3;
        GetAdResponse getAdResponse = (GetAdResponse) obj;
        boolean z3 = false;
        if (obj == null) {
            this.f = "Empty Response";
            return false;
        }
        if (!getAdResponse.b()) {
            this.f = getAdResponse.a();
            return false;
        }
        db dbVar = (db) this.f3186b;
        ArrayList a3 = t0.a(this.f3185a, getAdResponse.d(), this.f4354k, this.f4355l, true);
        dbVar.a(a3);
        dbVar.setAdInfoOverride(getAdResponse.c());
        if (getAdResponse.d() != null && getAdResponse.d().size() > 0) {
            z3 = true;
        }
        if (!z3) {
            this.f = "Empty Response";
            return z3;
        }
        if (a3.size() != 0 || (i3 = this.f4354k) != 0) {
            return z3;
        }
        this.f4354k = i3 + 1;
        return b();
    }
}
