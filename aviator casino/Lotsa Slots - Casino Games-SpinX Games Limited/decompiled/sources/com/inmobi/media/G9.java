package com.inmobi.media;

/* loaded from: classes5.dex */
public final class G9 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f4722a;

    public G9(org.json.JSONObject jSONObject) {
        this.f4722a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.inmobi.media.AbstractC2415fl.c()) {
            return;
        }
        com.inmobi.media.M9.a(this.f4722a);
    }
}
