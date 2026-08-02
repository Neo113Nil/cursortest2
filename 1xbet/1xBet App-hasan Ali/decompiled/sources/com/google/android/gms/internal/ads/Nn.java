package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Nn implements InterfaceC1349nn {

    /* renamed from: a, reason: collision with root package name */
    public final C0900dl f10814a;

    public Nn(C0900dl c0900dl) {
        this.f10814a = c0900dl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1349nn
    public final C1394on a(String str, JSONObject jSONObject) {
        return new C1394on(this.f10814a.b(str, jSONObject), new Hn(), str);
    }
}
