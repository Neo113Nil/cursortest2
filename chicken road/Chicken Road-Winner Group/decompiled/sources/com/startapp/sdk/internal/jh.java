package com.startapp.sdk.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jh {

    /* renamed from: b, reason: collision with root package name */
    public static final jh f3931b = new jh();

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f3932a;

    public jh() {
        this.f3932a = new JSONObject();
    }

    public final void a(int i3, Object obj) {
        try {
            this.f3932a.put(String.valueOf(i3), obj);
        } catch (JSONException unused) {
        }
    }

    public final String a(int i3) {
        Object opt = this.f3932a.opt(String.valueOf(i3));
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public jh(JSONObject jSONObject) {
        this.f3932a = jSONObject;
    }
}
