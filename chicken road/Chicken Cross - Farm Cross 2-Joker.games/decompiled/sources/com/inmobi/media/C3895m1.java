package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.m1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3895m1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3923n1 f7236a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3895m1(AbstractC3923n1 abstractC3923n1, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f7236a = abstractC3923n1;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3895m1(this.f7236a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3895m1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        com.inmobi.media.ads.network.common.model.Ad b = this.f7236a.b(0);
        if (b == null || !Intrinsics.areEqual(b.getImpressionId(), this.b)) {
            Z9 z9 = this.f7236a.i;
            if (z9 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                z9.b("n1", "Impression ID is null for saveBlob");
            }
        } else {
            this.f7236a.a(b, this.c);
            Z9 z92 = this.f7236a.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                z92.c("n1", "Updated blob " + this.c);
            }
        }
        return Unit.INSTANCE;
    }
}
