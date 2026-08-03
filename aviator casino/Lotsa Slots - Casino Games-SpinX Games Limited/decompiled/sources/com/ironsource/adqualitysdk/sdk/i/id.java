package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class id {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static com.ironsource.adqualitysdk.sdk.i.id f2486;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.hw f2488 = new com.ironsource.adqualitysdk.sdk.i.hw();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.ih f2487 = new com.ironsource.adqualitysdk.sdk.i.ih();

    private id() {
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized com.ironsource.adqualitysdk.sdk.i.id m7934() {
        com.ironsource.adqualitysdk.sdk.i.id idVar;
        synchronized (com.ironsource.adqualitysdk.sdk.i.id.class) {
            if (f2486 == null) {
                f2486 = new com.ironsource.adqualitysdk.sdk.i.id();
            }
            idVar = f2486;
        }
        return idVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.hw m7937() {
        return this.f2488;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.ih m7936() {
        return this.f2487;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static synchronized void m7935() {
        synchronized (com.ironsource.adqualitysdk.sdk.i.id.class) {
            f2486 = null;
        }
    }
}
