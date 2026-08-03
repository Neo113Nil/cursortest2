package com.ironsource;

/* renamed from: com.ironsource.re, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3261re extends java.lang.IllegalArgumentException {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.mediationsdk.logger.IronSourceError f6583a;
    private final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3261re(com.ironsource.mediationsdk.logger.IronSourceError error) {
        super(error.getErrorMessage());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.f6583a = error;
        this.b = error.getErrorCode();
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError a() {
        return this.f6583a;
    }

    public final int b() {
        return this.b;
    }
}
