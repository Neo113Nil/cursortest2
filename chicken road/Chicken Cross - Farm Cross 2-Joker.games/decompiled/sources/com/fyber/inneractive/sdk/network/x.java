package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f5515a = new JSONObject();

    public final x a(Object obj, String str) {
        try {
            this.f5515a.put(str, obj);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", str, obj);
        }
        return this;
    }
}
