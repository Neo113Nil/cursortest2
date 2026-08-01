package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class Ne implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f6743a;

    public Ne(FlowCollector flowCollector) {
        this.f6743a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        Me me;
        int i;
        if (continuation instanceof Me) {
            me = (Me) continuation;
            int i2 = me.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                me.b = i2 - Integer.MIN_VALUE;
                Object obj2 = me.f6717a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = me.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.f6743a;
                    if (((AbstractC3691eo) obj) instanceof C3607bo) {
                        me.b = 1;
                        if (flowCollector.emit(obj, me) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
        me = new Me(this, continuation);
        Object obj22 = me.f6717a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = me.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
