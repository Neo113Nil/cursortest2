package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ironsource.d5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4367d5<T> extends Nc {
    void b(C4710w8 c4710w8);

    String c();

    V5 d();

    Function1<Result<? extends T>, Unit> i();

    default boolean j() {
        return k().exists();
    }

    C4710w8 k();

    InterfaceC4691v7 l();

    default void m() {
        l().a(this);
        if (k().exists()) {
            IronSourceStorageUtils.deleteFile(k());
        }
        try {
            l().a(k(), d().value(), 5, 5);
        } catch (Exception e) {
            C4491k4.d().a(e);
            Function1<Result<? extends T>, Unit> i = i();
            Result.Companion companion = Result.INSTANCE;
            i.invoke(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(e))));
        }
    }
}
