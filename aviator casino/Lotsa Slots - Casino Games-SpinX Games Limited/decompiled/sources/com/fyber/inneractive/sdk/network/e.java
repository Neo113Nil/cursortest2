package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class e implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3837a;
    public final /* synthetic */ org.json.JSONArray b;
    public final /* synthetic */ long c;

    public e(java.lang.String str, org.json.JSONArray jSONArray, long j) {
        this.f3837a = str;
        this.b = jSONArray;
        this.c = j;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        java.lang.String str = (java.lang.String) obj;
        com.fyber.inneractive.sdk.util.IAlog.a("Event Request: Hitting URL finished: %s, body: %s", this.f3837a, this.b);
        if (exc == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("Event Request: Hitting URL response code: %s", str);
        } else {
            com.fyber.inneractive.sdk.util.IAlog.a("Event Request: Hitting URL failed: %s", exc);
        }
        com.fyber.inneractive.sdk.util.IAlog.a("Event Request: Url hit took %s millis", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.c));
    }
}
