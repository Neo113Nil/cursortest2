package com.startapp.sdk.internal;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f4524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xf f4525c;

    public vf(xf xfVar, String str, JSONObject jSONObject) {
        this.f4525c = xfVar;
        this.f4523a = str;
        this.f4524b = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4525c.c(this.f4523a, this.f4524b);
    }
}
