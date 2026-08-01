package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes6.dex */
public final class Wi extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6935a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Zi d;
    public final /* synthetic */ String e;
    public final /* synthetic */ RootConfig f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wi(List list, Zi zi, String str, RootConfig rootConfig, Continuation continuation) {
        super(2, continuation);
        this.c = list;
        this.d = zi;
        this.e = str;
        this.f = rootConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Wi wi = new Wi(this.c, this.d, this.e, this.f, continuation);
        wi.b = obj;
        return wi;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Wi) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6935a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Vi vi = new Vi(this.c, this.d, this.e, this.f, (ProducerScope) this.b, null);
            this.f6935a = 1;
            if (SupervisorKt.supervisorScope(vi, this) == coroutine_suspended) {
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
