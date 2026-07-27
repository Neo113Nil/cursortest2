package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.m2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4525m2 implements InterfaceC4543n2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f8351a;
    private final Dd b;

    public C4525m2(String encryptedAuctionResponse, Dd providerName) {
        Intrinsics.checkNotNullParameter(encryptedAuctionResponse, "encryptedAuctionResponse");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        this.f8351a = encryptedAuctionResponse;
        this.b = providerName;
    }

    @Override // com.ironsource.InterfaceC4543n2
    public Object a() {
        Object m8079constructorimpl;
        String c = C4457i5.b().c();
        Intrinsics.checkNotNullExpressionValue(c, "getInstance().mediationKey");
        C4587pa c4587pa = new C4587pa(new C4(this.f8351a, c));
        try {
            Result.Companion companion = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(c4587pa.a());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl == null) {
            return C4489k2.h.a((JSONObject) m8079constructorimpl, this.b.value());
        }
        C4491k4.d().a(m8082exceptionOrNullimpl);
        if (m8082exceptionOrNullimpl instanceof IllegalArgumentException) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(new Y7(C4635s5.f8523a.d())));
        }
        Result.Companion companion4 = Result.INSTANCE;
        return Result.m8079constructorimpl(ResultKt.createFailure(new Y7(C4635s5.f8523a.h())));
    }
}
