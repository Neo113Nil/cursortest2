package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.pe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4591pe extends IllegalArgumentException {

    /* renamed from: a, reason: collision with root package name */
    private final IronSourceError f8480a;
    private final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4591pe(IronSourceError error) {
        super(error.getErrorMessage());
        Intrinsics.checkNotNullParameter(error, "error");
        this.f8480a = error;
        this.b = error.getErrorCode();
    }

    public final IronSourceError a() {
        return this.f8480a;
    }

    public final int b() {
        return this.b;
    }
}
