package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes6.dex */
public final class Si extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public String f6853a;
    public Ref.ObjectRef b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Ti e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Si(Ti ti, Continuation continuation) {
        super(2, continuation);
        this.e = ti;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Si si = new Si(this.e, continuation);
        si.d = obj;
        return si;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Si si = new Si(this.e, (Continuation) obj2);
        si.d = (FlowCollector) obj;
        return si.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        String str;
        Ref.ObjectRef objectRef;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.d;
            str = AbstractC3914mk.c;
            if (str == null) {
                return Unit.INSTANCE;
            }
            objectRef = new Ref.ObjectRef();
            objectRef.element = Ti.a(this.e);
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = this.b;
            str = this.f6853a;
            flowCollector = (FlowCollector) this.d;
            ResultKt.throwOnFailure(obj);
        }
        String accountId = str;
        FlowCollector flowCollector2 = flowCollector;
        while (!((Collection) objectRef.element).isEmpty()) {
            List configRequestContexts = (List) objectRef.element;
            objectRef.element = CollectionsKt.emptyList();
            Zi zi = (Zi) this.e.b.getValue();
            J4 j4 = AbstractC4260z4.f7518a;
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig = (RootConfig) AbstractC4260z4.f7518a.a(RootConfig.class);
            zi.getClass();
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(rootConfig, "rootConfig");
            Intrinsics.checkNotNullParameter(configRequestContexts, "configRequestContexts");
            Flow channelFlow = FlowKt.channelFlow(new Wi(configRequestContexts, zi, accountId, rootConfig, null));
            Ri ri = new Ri(this.e, flowCollector2, objectRef);
            this.d = flowCollector2;
            this.f6853a = accountId;
            this.b = objectRef;
            this.c = 1;
            if (channelFlow.collect(ri, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
