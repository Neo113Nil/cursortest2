package com.inmobi.media;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.k1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3836k1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3923n1 f7191a;
    public final /* synthetic */ String b;
    public final /* synthetic */ InterfaceC3614c3 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3836k1(AbstractC3923n1 abstractC3923n1, String str, InterfaceC3614c3 interfaceC3614c3, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.f7191a = abstractC3923n1;
        this.b = str;
        this.c = interfaceC3614c3;
        this.d = str2;
        this.e = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3836k1(this.f7191a, this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3836k1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            com.inmobi.media.ads.network.common.model.Ad b = this.f7191a.b(0);
            if (b == null || !Intrinsics.areEqual(b.getImpressionId(), this.b)) {
                Z9 z9 = this.f7191a.i;
                if (z9 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                    z9.c("n1", "Returning blob as empty string");
                }
                ((Ej) this.c).c(this.d, this.e, "");
            } else {
                String webVast = b.getWebVast();
                ((Ej) this.c).c(this.d, this.e, webVast);
                Z9 z92 = this.f7191a.i;
                if (z92 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                    z92.c("n1", "Returning blob " + webVast);
                }
            }
        } catch (Exception e) {
            Z9 z93 = this.f7191a.i;
            if (z93 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                z93.a("n1", "Exception while getBlob", e);
            }
            Lazy lazy = Ba.f6473a;
            U9.a(e);
        }
        return Unit.INSTANCE;
    }
}
