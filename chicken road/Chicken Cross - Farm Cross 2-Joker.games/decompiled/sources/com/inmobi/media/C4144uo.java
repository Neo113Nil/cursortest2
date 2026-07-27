package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: com.inmobi.media.uo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4144uo implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f7421a;

    public C4144uo(FlowCollector flowCollector) {
        this.f7421a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        C4115to c4115to;
        int i;
        if (continuation instanceof C4115to) {
            c4115to = (C4115to) continuation;
            int i2 = c4115to.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4115to.b = i2 - Integer.MIN_VALUE;
                Object obj2 = c4115to.f7401a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4115to.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.f7421a;
                    AbstractC3691eo abstractC3691eo = (AbstractC3691eo) obj;
                    if (Intrinsics.areEqual(abstractC3691eo, C4199wp.f7467a) || (abstractC3691eo instanceof C3607bo)) {
                        c4115to.b = 1;
                        if (flowCollector.emit(obj, c4115to) == coroutine_suspended) {
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
        c4115to = new C4115to(this, continuation);
        Object obj22 = c4115to.f7401a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4115to.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
