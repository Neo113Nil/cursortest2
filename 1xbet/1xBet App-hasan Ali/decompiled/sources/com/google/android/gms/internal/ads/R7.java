package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import q.AbstractC2286a;

/* loaded from: classes.dex */
public final class R7 extends AbstractC2286a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f11337a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final List f11338b = Arrays.asList(((String) Q2.r.f5053d.f5056c.a(F7.x9)).split(","));

    /* renamed from: c, reason: collision with root package name */
    public final S7 f11339c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2286a f11340d;

    /* renamed from: e, reason: collision with root package name */
    public final C1616tl f11341e;

    public R7(S7 s7, AbstractC2286a abstractC2286a, C1616tl c1616tl) {
        this.f11340d = abstractC2286a;
        this.f11339c = s7;
        this.f11341e = c1616tl;
    }

    @Override // q.AbstractC2286a
    public final void a(String str, Bundle bundle) {
        AbstractC2286a abstractC2286a = this.f11340d;
        if (abstractC2286a != null) {
            abstractC2286a.a(str, bundle);
        }
    }

    @Override // q.AbstractC2286a
    public final Bundle b(String str, Bundle bundle) {
        AbstractC2286a abstractC2286a = this.f11340d;
        if (abstractC2286a != null) {
            return abstractC2286a.b(str, bundle);
        }
        return null;
    }

    @Override // q.AbstractC2286a
    public final void c(int i, int i5, Bundle bundle) {
        AbstractC2286a abstractC2286a = this.f11340d;
        if (abstractC2286a != null) {
            abstractC2286a.c(i, i5, bundle);
        }
    }

    @Override // q.AbstractC2286a
    public final void d(Bundle bundle) {
        this.f11337a.set(false);
        AbstractC2286a abstractC2286a = this.f11340d;
        if (abstractC2286a != null) {
            abstractC2286a.d(bundle);
        }
    }

    @Override // q.AbstractC2286a
    public final void e(int i, Bundle bundle) {
        this.f11337a.set(false);
        AbstractC2286a abstractC2286a = this.f11340d;
        if (abstractC2286a != null) {
            abstractC2286a.e(i, bundle);
        }
        P2.o oVar = P2.o.f4767B;
        oVar.f4776j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        S7 s7 = this.f11339c;
        s7.f11508j = currentTimeMillis;
        List list = this.f11338b;
        if (list == null || !list.contains(String.valueOf(i))) {
            return;
        }
        oVar.f4776j.getClass();
        s7.i = SystemClock.elapsedRealtime() + ((Integer) Q2.r.f5053d.f5056c.a(F7.u9)).intValue();
        if (s7.f11505e == null) {
            s7.f11505e = new K4(10, s7);
        }
        s7.d();
        G4.d.R(this.f11341e, "pact_action", new Pair("pe", "pact_reqpmc"));
    }

    @Override // q.AbstractC2286a
    public final void f(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.f11337a.set(true);
                G4.d.R(this.f11341e, "pact_action", new Pair("pe", "pact_con"));
                this.f11339c.c(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e3) {
            T2.G.n("Message is not in JSON format: ", e3);
        }
        AbstractC2286a abstractC2286a = this.f11340d;
        if (abstractC2286a != null) {
            abstractC2286a.f(str, bundle);
        }
    }

    @Override // q.AbstractC2286a
    public final void g(int i, Uri uri, boolean z3, Bundle bundle) {
        AbstractC2286a abstractC2286a = this.f11340d;
        if (abstractC2286a != null) {
            abstractC2286a.g(i, uri, z3, bundle);
        }
    }
}
