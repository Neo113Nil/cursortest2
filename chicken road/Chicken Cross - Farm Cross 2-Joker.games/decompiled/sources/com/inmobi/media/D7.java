package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import io.ktor.sse.ServerSentEventKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes6.dex */
public final class D7 {

    /* renamed from: a, reason: collision with root package name */
    public static final D7 f6507a = new D7();
    public static InMobiUserDataModel b;
    public static final Mutex c;

    static {
        Intrinsics.checkNotNullExpressionValue("D7", "getSimpleName(...)");
        c = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(InMobiUserDataModel inMobiUserDataModel, ContinuationImpl continuationImpl) {
        C7 c7;
        int i;
        Mutex mutex;
        try {
            if (continuationImpl instanceof C7) {
                c7 = (C7) continuationImpl;
                int i2 = c7.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c7.d = i2 - Integer.MIN_VALUE;
                    Object obj = c7.c;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c7.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = c;
                        c7.f6490a = inMobiUserDataModel;
                        c7.b = mutex;
                        c7.d = 1;
                        if (mutex.lock(null, c7) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex2 = c7.b;
                        InMobiUserDataModel inMobiUserDataModel2 = c7.f6490a;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        inMobiUserDataModel = inMobiUserDataModel2;
                    }
                    String str = "setHashedPII " + b + ServerSentEventKt.SPACE + inMobiUserDataModel;
                    b = inMobiUserDataModel;
                    return Unit.INSTANCE;
                }
            }
            String str2 = "setHashedPII " + b + ServerSentEventKt.SPACE + inMobiUserDataModel;
            b = inMobiUserDataModel;
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        c7 = new C7(continuationImpl);
        Object obj2 = c7.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c7.d;
        if (i != 0) {
        }
    }

    public final String toString() {
        return String.valueOf(b);
    }
}
