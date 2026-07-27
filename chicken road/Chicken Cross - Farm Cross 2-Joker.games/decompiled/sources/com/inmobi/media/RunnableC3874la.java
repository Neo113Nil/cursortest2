package com.inmobi.media;

import org.json.JSONObject;

/* renamed from: com.inmobi.media.la, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC3874la implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f7221a;

    public RunnableC3874la(JSONObject jSONObject) {
        this.f7221a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC3606bn.c()) {
            return;
        }
        AbstractC4045ra.a(this.f7221a);
    }
}
