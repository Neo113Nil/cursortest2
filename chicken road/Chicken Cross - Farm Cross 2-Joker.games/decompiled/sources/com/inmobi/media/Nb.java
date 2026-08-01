package com.inmobi.media;

import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class Nb extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f6740a;
    public final /* synthetic */ Mb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nb(LinkedHashMap linkedHashMap, Mb mb, Continuation continuation) {
        super(2, continuation);
        this.f6740a = linkedHashMap;
        this.b = mb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Nb(this.f6740a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Nb(this.f6740a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f6740a.put("networkType", Y5.o());
        String str = this.b.f6714a;
        LinkedHashMap linkedHashMap = this.f6740a;
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b(str, linkedHashMap, EnumC3944nm.f7271a);
        return Unit.INSTANCE;
    }
}
