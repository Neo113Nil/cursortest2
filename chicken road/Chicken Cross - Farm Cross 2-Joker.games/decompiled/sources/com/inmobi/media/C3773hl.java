package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.Link;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* renamed from: com.inmobi.media.hl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3773hl extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7149a;
    public final /* synthetic */ Image b;
    public final /* synthetic */ C3800il c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3773hl(Image image, C3800il c3800il, Continuation continuation) {
        super(2, continuation);
        this.b = image;
        this.c = c3800il;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3773hl(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3773hl(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7149a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList a2 = AbstractC3559a5.a("click", this.b.getTrackers());
            MutableSharedFlow mutableSharedFlow = this.c.d;
            Link link = this.b.getLink();
            Uk uk = new Uk(link != null ? link.getUrl() : null, a2);
            this.f7149a = 1;
            if (mutableSharedFlow.emit(uk, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
