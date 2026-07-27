package com.fyber.inneractive.sdk.config;

import java.util.HashMap;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5272a = new HashMap();

    public final boolean a() {
        try {
            if (this.f5272a.containsKey("dsos")) {
                return Boolean.parseBoolean((String) this.f5272a.get("dsos"));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
