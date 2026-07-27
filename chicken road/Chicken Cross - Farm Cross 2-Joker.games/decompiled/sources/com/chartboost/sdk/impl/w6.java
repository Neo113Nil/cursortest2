package com.chartboost.sdk.impl;

import java.net.URL;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public interface w6 {

    public static final class a {

        /* renamed from: com.chartboost.sdk.impl.w6$a$a, reason: collision with other inner class name */
        public static final class C0222a extends ContinuationImpl {
            public /* synthetic */ Object b;
            public int c;

            public C0222a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.c |= Integer.MIN_VALUE;
                Object a2 = a.a(null, null, this);
                return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object a(w6 w6Var, URL url, Continuation continuation) {
            C0222a c0222a;
            int i;
            if (continuation instanceof C0222a) {
                c0222a = (C0222a) continuation;
                int i2 = c0222a.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0222a.c = i2 - Integer.MIN_VALUE;
                    Object obj = c0222a.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c0222a.c;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).getValue();
                    }
                    ResultKt.throwOnFailure(obj);
                    c0222a.c = 1;
                    Object a2 = w6Var.a(url, -1L, c0222a);
                    return a2 == coroutine_suspended ? coroutine_suspended : a2;
                }
            }
            c0222a = new C0222a(continuation);
            Object obj2 = c0222a.b;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c0222a.c;
            if (i == 0) {
            }
        }
    }

    Object a(URL url, long j, Continuation continuation);

    Object a(URL url, Continuation continuation);

    Flow a(URL url);
}
