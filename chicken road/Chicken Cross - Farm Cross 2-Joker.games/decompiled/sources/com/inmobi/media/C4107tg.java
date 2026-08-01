package com.inmobi.media;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.tg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4107tg extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4136ug f7395a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4107tg(C4136ug c4136ug, String str, Continuation continuation) {
        super(2, continuation);
        this.f7395a = c4136ug;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4107tg(this.f7395a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4107tg(this.f7395a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Rh rh = this.f7395a.f7416a;
        String value = this.b;
        rh.getClass();
        Intrinsics.checkNotNullParameter("omid_js_string", "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Db db = rh.f6829a;
        ConcurrentHashMap concurrentHashMap = Db.b;
        db.a("omid_js_string", value, false);
        rh.f6829a.a("last_ts", System.currentTimeMillis() / 1000, false);
        return Unit.INSTANCE;
    }
}
