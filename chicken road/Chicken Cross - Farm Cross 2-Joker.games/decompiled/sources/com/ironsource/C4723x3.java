package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;

/* renamed from: com.ironsource.x3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4723x3 implements InterfaceC4512l7 {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f8754a;
    private final Integer b;
    private final E3 c;

    public C4723x3(Boolean bool, Integer num, E3 e3) {
        this.f8754a = bool;
        this.b = num;
        this.c = e3;
    }

    @Override // com.ironsource.InterfaceC4512l7
    public Object a() {
        Boolean bool = this.f8754a;
        if (bool == null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(new Exception("enabled flag is not provided or invalid")));
        }
        if (!bool.booleanValue()) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8079constructorimpl(Boolean.FALSE);
        }
        Integer num = this.b;
        if (num == null || num.intValue() <= 0) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(new Exception("limit flag is not provided or invalid")));
        }
        if (this.c == null) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(new Exception("unit flag is not provided or invalid")));
        }
        Result.Companion companion5 = Result.INSTANCE;
        return Result.m8079constructorimpl(Boolean.TRUE);
    }
}
