package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes6.dex */
public final class I4 implements InterfaceC4512l7 {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f7674a;

    public I4(Boolean bool) {
        this.f7674a = bool;
    }

    @Override // com.ironsource.InterfaceC4512l7
    public Object a() {
        Boolean bool = this.f7674a;
        if (bool == null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(new Exception("enabled flag is not provided or invalid")));
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m8079constructorimpl(bool);
    }
}
