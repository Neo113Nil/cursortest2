package com.ironsource;

import com.ironsource.InterfaceC4530m7;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class K4 implements InterfaceC4530m7, InterfaceC4530m7.a {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, H4> f7720a = new ConcurrentHashMap<>();

    @Override // com.ironsource.InterfaceC4530m7
    public D3 a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        H4 h4 = this.f7720a.get(identifier);
        return (h4 == null || h4.a()) ? new D3(false, null, 2, null) : new D3(true, F3.Delivery);
    }

    @Override // com.ironsource.InterfaceC4530m7.a
    public void b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
    }

    @Override // com.ironsource.InterfaceC4530m7.a
    public Object a(String identifier, F3 cappingType, InterfaceC4494k7 cappingConfig) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object a2 = cappingConfig.a();
        if (Result.m8086isSuccessimpl(a2)) {
            H4 h4 = (H4) a2;
            if (h4 != null) {
                this.f7720a.put(identifier, h4);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m8079constructorimpl(Unit.INSTANCE);
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(a2);
        if (m8082exceptionOrNullimpl != null) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(m8082exceptionOrNullimpl));
        }
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m8079constructorimpl(Unit.INSTANCE);
    }
}
