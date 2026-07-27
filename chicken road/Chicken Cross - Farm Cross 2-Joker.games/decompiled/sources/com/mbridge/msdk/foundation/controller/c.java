package com.mbridge.msdk.foundation.controller;

import com.mbridge.msdk.foundation.controller.a;

/* compiled from: MBSDKContext.java */
/* loaded from: classes6.dex */
public class c extends a {
    private static volatile c t;

    private c() {
    }

    public static c n() {
        if (t == null) {
            synchronized (c.class) {
                if (t == null) {
                    t = new c();
                }
            }
        }
        return t;
    }

    @Override // com.mbridge.msdk.foundation.controller.a
    protected void a(a.e eVar) {
    }
}
