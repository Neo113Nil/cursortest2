package com.plaid.internal;

/* renamed from: com.plaid.internal.l7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC0580l7 {
    PRE_CHECK(16),
    DEVICE_DESCRIPTOR(32),
    START(48),
    AUTHENTICATION(64),
    FINISH(80);


    /* renamed from: a, reason: collision with root package name */
    public final int f6479a;

    EnumC0580l7(int i) {
        this.f6479a = i;
    }

    public final int getCode() {
        return this.f6479a;
    }
}
