package com.ironsource;

import com.ironsource.InterfaceC4530m7;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Wc implements InterfaceC4530m7, InterfaceC4530m7.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4527m4 f7996a;
    private final G7 b;
    private final Map<String, Vc> c;

    public Wc(InterfaceC4527m4 currentTimeProvider, G7 repository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f7996a = currentTimeProvider;
        this.b = repository;
        this.c = new LinkedHashMap();
    }

    public final Map<String, Vc> a() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC4530m7.a
    public void b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        if (this.c.get(identifier) == null) {
            return;
        }
        this.b.a(this.f7996a.a(), identifier);
    }

    private final boolean a(Vc vc, String str) {
        Long a2 = this.b.a(str);
        return a2 != null && this.f7996a.a() - a2.longValue() < vc.a();
    }

    @Override // com.ironsource.InterfaceC4530m7
    public D3 a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Vc vc = this.c.get(identifier);
        if (vc == null) {
            return new D3(false, null, 2, null);
        }
        if (a(vc, identifier)) {
            return new D3(true, F3.Pacing);
        }
        return new D3(false, null, 2, null);
    }

    @Override // com.ironsource.InterfaceC4530m7.a
    public Object a(String identifier, F3 cappingType, InterfaceC4494k7 cappingConfig) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object b = cappingConfig.b();
        if (Result.m8086isSuccessimpl(b)) {
            Vc vc = (Vc) b;
            if (vc != null) {
                this.c.put(identifier, vc);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m8079constructorimpl(Unit.INSTANCE);
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(b);
        if (m8082exceptionOrNullimpl != null) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(m8082exceptionOrNullimpl));
        }
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m8079constructorimpl(Unit.INSTANCE);
    }
}
