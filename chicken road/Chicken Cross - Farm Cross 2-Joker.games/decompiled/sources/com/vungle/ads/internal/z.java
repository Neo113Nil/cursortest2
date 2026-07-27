package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class z extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sdk.SDKError.Reason f12202a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Sdk.SDKError.Builder c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Sdk.SDKError.Reason reason, String str, Sdk.SDKError.Builder builder) {
        super(0);
        this.f12202a = reason;
        this.b = str;
        this.c = builder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return com.iab.omid.library.vungle.internal.l.a("Logging error: ").append(this.f12202a).append(" with message: ").append(this.b).append(", mediation: ").append(this.c.getMediationName()).toString();
    }
}
