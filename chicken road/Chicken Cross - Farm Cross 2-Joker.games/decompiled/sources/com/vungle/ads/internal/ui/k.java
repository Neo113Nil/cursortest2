package com.vungle.ads.internal.ui;

import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class k implements com.vungle.ads.internal.presenter.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f12153a;

    public k(l lVar) {
        this.f12153a = lVar;
    }

    public final Pair a(Intent intent) {
        Object m8079constructorimpl;
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        Intrinsics.checkNotNullParameter(intent, "intent");
        l lVar = this.f12153a;
        try {
            Result.Companion companion = Result.INSTANCE;
            atomicBoolean2 = lVar.g;
            atomicBoolean2.set(true);
            lVar.startActivityForResult(intent, 10001);
            m8079constructorimpl = Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        l lVar2 = this.f12153a;
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl == null) {
            return new Pair(Boolean.TRUE, null);
        }
        atomicBoolean = lVar2.g;
        atomicBoolean.set(false);
        return new Pair(Boolean.FALSE, m8082exceptionOrNullimpl.getLocalizedMessage());
    }
}
