package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.sg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4079sg extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4136ug f7375a;
    public final /* synthetic */ AdConfig.OmidConfig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4079sg(C4136ug c4136ug, AdConfig.OmidConfig omidConfig, Continuation continuation) {
        super(2, continuation);
        this.f7375a = c4136ug;
        this.b = omidConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4079sg(this.f7375a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4079sg(this.f7375a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Db db = this.f7375a.f7416a.f6829a;
        db.getClass();
        Intrinsics.checkNotNullParameter("last_ts", "key");
        return Boxing.boxBoolean((System.currentTimeMillis() / ((long) 1000)) - db.f6510a.getLong("last_ts", 0L) > this.b.getExpiry());
    }
}
