package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.ld;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jj {

    /* renamed from: a, reason: collision with root package name */
    public final ld f4831a;

    public static final class a extends ContinuationImpl {
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object a2 = jj.this.a(null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public jj(ld networkClient) {
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        this.f4831a = networkClient;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(2:10|11)(2:47|48))(3:49|50|(1:52))|12|(4:14|(3:16|(1:18)(1:42)|(3:20|21|(1:41)(6:23|24|(1:26)|(1:37)(1:30)|31|(1:33)(2:35|36))))|43|44)(2:45|46)))|55|6|7|(0)(0)|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009b, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009c, code lost:
    
        r2 = kotlin.Result.INSTANCE;
        r14 = kotlin.Result.m8079constructorimpl(kotlin.ResultKt.createFailure(r14));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d A[Catch: all -> 0x009b, TryCatch #1 {all -> 0x009b, blocks: (B:11:0x0033, B:12:0x0055, B:14:0x005d, B:16:0x0063, B:20:0x006d, B:43:0x0072, B:44:0x007f, B:45:0x0080, B:46:0x009a, B:50:0x0042), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080 A[Catch: all -> 0x009b, TryCatch #1 {all -> 0x009b, blocks: (B:11:0x0033, B:12:0x0055, B:14:0x005d, B:16:0x0063, B:20:0x006d, B:43:0x0072, B:44:0x007f, B:45:0x0080, B:46:0x009a, B:50:0x0042), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Continuation continuation) {
        a aVar;
        int i;
        Integer a2;
        pd pdVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.e = i2 - Integer.MIN_VALUE;
                a aVar2 = aVar;
                Object obj = aVar2.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar2.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    ld ldVar = this.f4831a;
                    aVar2.b = str;
                    aVar2.e = 1;
                    obj = ld.a.a(ldVar, str, null, aVar2, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) aVar2.b;
                    ResultKt.throwOnFailure(obj);
                }
                pdVar = (pd) obj;
                if (pdVar.e()) {
                    throw new ij("Failed to fetch VAST. HTTP response code: " + pdVar.d(), Boxing.boxInt(Sdk.SDKError.Reason.MRAID_ERROR_VALUE));
                }
                String a3 = pdVar.a();
                if (a3 != null) {
                    if (a3.length() <= 0) {
                        a3 = null;
                    }
                    if (a3 != null) {
                        Object m8079constructorimpl = Result.m8079constructorimpl(a3);
                        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
                        if (m8082exceptionOrNullimpl == null) {
                            return m8079constructorimpl;
                        }
                        try {
                            Result.Companion companion2 = Result.INSTANCE;
                            ij ijVar = m8082exceptionOrNullimpl instanceof ij ? (ij) m8082exceptionOrNullimpl : null;
                            mb.b("VAST fetch failed: url=" + str + ", vastErrorCode=" + ((ijVar == null || (a2 = ijVar.a()) == null) ? 301 : a2.intValue()) + ", errorType=" + m8082exceptionOrNullimpl.getClass().getSimpleName() + ", message=" + m8082exceptionOrNullimpl.getMessage(), m8082exceptionOrNullimpl);
                            if (m8082exceptionOrNullimpl instanceof ij) {
                                throw m8082exceptionOrNullimpl;
                            }
                            throw new ij("Error fetching VAST from URL: " + str + ". " + m8082exceptionOrNullimpl.getMessage(), Boxing.boxInt(Sdk.SDKError.Reason.MRAID_ERROR_VALUE));
                        } catch (Throwable th) {
                            Result.Companion companion3 = Result.INSTANCE;
                            return Result.m8079constructorimpl(ResultKt.createFailure(th));
                        }
                    }
                }
                throw new ij("Received empty VAST response.", Boxing.boxInt(303));
            }
        }
        aVar = new a(continuation);
        a aVar22 = aVar;
        Object obj2 = aVar22.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar22.e;
        if (i != 0) {
        }
        pdVar = (pd) obj2;
        if (pdVar.e()) {
        }
    }
}
