package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: com.inmobi.media.we, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4188we implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f7459a;

    public C4188we(FlowCollector flowCollector) {
        this.f7459a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        C4161ve c4161ve;
        int i;
        if (continuation instanceof C4161ve) {
            c4161ve = (C4161ve) continuation;
            int i2 = c4161ve.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4161ve.b = i2 - Integer.MIN_VALUE;
                Object obj2 = c4161ve.f7437a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4161ve.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.f7459a;
                    if (((AbstractC3595bd) obj) instanceof AbstractC3691eo) {
                        c4161ve.b = 1;
                        if (flowCollector.emit(obj, c4161ve) == coroutine_suspended) {
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
        c4161ve = new C4161ve(this, continuation);
        Object obj22 = c4161ve.f7437a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4161ve.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
