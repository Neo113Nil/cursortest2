package com.moloco.sdk.internal.services.usertracker;

/* loaded from: classes5.dex */
public final class a implements com.moloco.sdk.internal.services.usertracker.e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7313a = 0;

    @Override // com.moloco.sdk.internal.services.usertracker.e
    public java.lang.String a() {
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        return uuid;
    }
}
