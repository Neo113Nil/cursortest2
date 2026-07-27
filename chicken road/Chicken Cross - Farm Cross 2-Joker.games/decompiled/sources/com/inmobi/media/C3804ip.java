package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: com.inmobi.media.ip, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3804ip implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f7169a;

    public C3804ip(FlowCollector flowCollector) {
        this.f7169a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        C3777hp c3777hp;
        int i;
        if (continuation instanceof C3777hp) {
            c3777hp = (C3777hp) continuation;
            int i2 = c3777hp.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3777hp.b = i2 - Integer.MIN_VALUE;
                Object obj2 = c3777hp.f7153a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3777hp.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.f7169a;
                    Boolean boxBoolean = Boxing.boxBoolean(((EnumC3580aq) obj) == EnumC3580aq.b);
                    c3777hp.b = 1;
                    if (flowCollector.emit(boxBoolean, c3777hp) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }
        c3777hp = new C3777hp(this, continuation);
        Object obj22 = c3777hp.f7153a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3777hp.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
