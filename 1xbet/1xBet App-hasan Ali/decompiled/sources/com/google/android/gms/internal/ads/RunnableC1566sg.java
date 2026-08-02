package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1566sg implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15564k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0677Re f15565l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ JSONObject f15566m;

    public /* synthetic */ RunnableC1566sg(InterfaceC0677Re interfaceC0677Re, JSONObject jSONObject, int i) {
        this.f15564k = i;
        this.f15565l = interfaceC0677Re;
        this.f15566m = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0677Re interfaceC0677Re = this.f15565l;
        JSONObject jSONObject = this.f15566m;
        switch (this.f15564k) {
            case 0:
                interfaceC0677Re.o("AFMA_updateActiveView", jSONObject);
                break;
            default:
                int i = Cj.f8051G;
                interfaceC0677Re.k("onVideoEvent", jSONObject);
                break;
        }
    }
}
