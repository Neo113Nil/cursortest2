package com.google.android.gms.internal.ads;

import Q2.C0379q;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ta, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1605ta implements InterfaceC0933ea, InterfaceC1560sa {

    /* renamed from: k, reason: collision with root package name */
    public final C1068ha f15684k;

    /* renamed from: l, reason: collision with root package name */
    public final HashSet f15685l = new HashSet();

    public C1605ta(C1068ha c1068ha) {
        this.f15684k = c1068ha;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0889da
    public final void a(String str, Map map) {
        try {
            k("openIntentAsync", C0379q.f.f5048a.g((HashMap) map));
        } catch (JSONException unused) {
            U2.j.i("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1560sa
    public final void b(String str, InterfaceC1821y9 interfaceC1821y9) {
        this.f15684k.b(str, interfaceC1821y9);
        this.f15685l.add(new AbstractMap.SimpleEntry(str, interfaceC1821y9));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0933ea, com.google.android.gms.internal.ads.InterfaceC1113ia
    public final void d(String str) {
        this.f15684k.d(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1560sa
    public final void i(String str, InterfaceC1821y9 interfaceC1821y9) {
        this.f15684k.i(str, interfaceC1821y9);
        this.f15685l.remove(new AbstractMap.SimpleEntry(str, interfaceC1821y9));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1113ia
    public final void j(String str, String str2) {
        d(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0889da
    public final /* synthetic */ void k(String str, JSONObject jSONObject) {
        AbstractC1803xs.y(this, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1113ia
    public final void o(String str, JSONObject jSONObject) {
        j(str, jSONObject.toString());
    }
}
