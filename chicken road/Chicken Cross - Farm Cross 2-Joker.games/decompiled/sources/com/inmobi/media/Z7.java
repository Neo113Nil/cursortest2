package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class Z7 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f6986a;

    public Z7(FlowCollector flowCollector) {
        this.f6986a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        Y7 y7;
        int i;
        if (continuation instanceof Y7) {
            y7 = (Y7) continuation;
            int i2 = y7.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y7.b = i2 - Integer.MIN_VALUE;
                Object obj2 = y7.f6967a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = y7.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.f6986a;
                    if (((AbstractC3691eo) obj) instanceof C3607bo) {
                        y7.b = 1;
                        if (flowCollector.emit(obj, y7) == coroutine_suspended) {
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
        y7 = new Y7(this, continuation);
        Object obj22 = y7.f6967a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = y7.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
