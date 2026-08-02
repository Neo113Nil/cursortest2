package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.tl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1616tl {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15714a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f15715b;

    /* renamed from: c, reason: collision with root package name */
    public final Qw f15716c;

    /* renamed from: d, reason: collision with root package name */
    public final U2.m f15717d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15718e;
    public final H3.e f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15719g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15720h;
    public final AtomicBoolean i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f15721j;

    public C1616tl(Qw qw, U2.m mVar, v3.e eVar, H3.e eVar2, Context context) {
        HashMap hashMap = new HashMap();
        this.f15714a = hashMap;
        this.i = new AtomicBoolean();
        this.f15721j = new AtomicReference(new Bundle());
        this.f15716c = qw;
        this.f15717d = mVar;
        A7 a7 = F7.f8778W1;
        Q2.r rVar = Q2.r.f5053d;
        this.f15718e = ((Boolean) rVar.f5056c.a(a7)).booleanValue();
        this.f = eVar2;
        A7 a72 = F7.f8793Z1;
        D7 d7 = rVar.f5056c;
        this.f15719g = ((Boolean) d7.a(a72)).booleanValue();
        this.f15720h = ((Boolean) d7.a(F7.B6)).booleanValue();
        this.f15715b = context;
        hashMap.put("s", "gmob_sdk");
        hashMap.put("v", "3");
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("api_v", Build.VERSION.SDK);
        P2.o oVar = P2.o.f4767B;
        T2.L l5 = oVar.f4771c;
        hashMap.put("device", T2.L.H());
        hashMap.put("app", (String) eVar.f20433m);
        Context context2 = (Context) eVar.f20432l;
        hashMap.put("is_lite_sdk", true != T2.L.e(context2) ? "0" : "1");
        ArrayList y5 = rVar.f5054a.y();
        boolean booleanValue = ((Boolean) d7.a(F7.w6)).booleanValue();
        C0568Cd c0568Cd = oVar.f4774g;
        if (booleanValue) {
            y5.addAll(c0568Cd.d().t().i);
        }
        hashMap.put("e", TextUtils.join(",", y5));
        hashMap.put("sdkVersion", (String) eVar.f20434n);
        if (((Boolean) d7.a(F7.Ta)).booleanValue()) {
            hashMap.put("is_bstar", true != T2.L.c(context2) ? "0" : "1");
        }
        if (((Boolean) d7.a(F7.Z8)).booleanValue() && ((Boolean) d7.a(F7.f8850k2)).booleanValue()) {
            String str = c0568Cd.f8014g;
            hashMap.put("plugin", str == null ? "" : str);
        }
    }

    public final void a(Map map) {
        Bundle Q5;
        if (map == null || map.isEmpty()) {
            U2.j.d("Empty or null paramMap.");
            return;
        }
        boolean andSet = this.i.getAndSet(true);
        AtomicReference atomicReference = this.f15721j;
        if (!andSet) {
            String str = (String) Q2.r.f5053d.f5056c.a(F7.da);
            SharedPreferencesOnSharedPreferenceChangeListenerC1294md sharedPreferencesOnSharedPreferenceChangeListenerC1294md = new SharedPreferencesOnSharedPreferenceChangeListenerC1294md(1, this, str);
            if (TextUtils.isEmpty(str)) {
                Q5 = Bundle.EMPTY;
            } else {
                Context context = this.f15715b;
                PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC1294md);
                Q5 = G4.l.Q(context, str);
            }
            atomicReference.set(Q5);
        }
        Bundle bundle = (Bundle) atomicReference.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    public final void b(Map map, boolean z3) {
        if (map.isEmpty()) {
            U2.j.d("Empty paramMap.");
            return;
        }
        a(map);
        String a5 = this.f.a(map);
        T2.G.m(a5);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f15718e) {
            if (!z3 || this.f15719g) {
                if (!parseBoolean || this.f15720h) {
                    this.f15716c.execute(new RunnableC1661ul(this, a5, 0));
                }
            }
        }
    }
}
