package com.inmobi.media;

import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class N6 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6735a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Mf c;
    public final /* synthetic */ int d;
    public final /* synthetic */ F6 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ int g;
    public final /* synthetic */ long h;
    public final /* synthetic */ Nm i;
    public final /* synthetic */ M6 j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N6(long j, Mf mf, int i, F6 f6, String str, int i2, long j2, Nm nm, M6 m6, boolean z, Continuation continuation) {
        super(2, continuation);
        this.b = j;
        this.c = mf;
        this.d = i;
        this.e = f6;
        this.f = str;
        this.g = i2;
        this.h = j2;
        this.i = nm;
        this.j = m6;
        this.k = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new N6(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((N6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0042, code lost:
    
        if (r14 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0044, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x002d, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4, r13) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6735a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.b * 1000;
            this.f6735a = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Of of = (Of) obj;
                Lazy lazy = O6.f6757a;
                if (AbstractC4086sn.a(of)) {
                    M6 m6 = this.j;
                    F6 eventPayload = this.e;
                    m6.getClass();
                    Intrinsics.checkNotNullParameter(eventPayload, "eventPayload");
                    String TAG = m6.e;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    BuildersKt__BuildersKt.runBlocking$default(null, new J6(m6, eventPayload, null), 1, null);
                    m6.a(System.currentTimeMillis());
                    if (m6.d != null) {
                        ArrayList eventIds = eventPayload.f6550a;
                        Intrinsics.checkNotNullParameter(eventIds, "eventIds");
                        Integer num = AbstractC3973om.c;
                        if (num != null && eventIds.contains(Integer.valueOf(num.intValue()))) {
                            AbstractC3973om.b = 0;
                            Db db = AbstractC3973om.f7292a;
                            if (db != null) {
                                ConcurrentHashMap concurrentHashMap = Db.b;
                                db.a("count", 0, false);
                            }
                            AbstractC3973om.c = null;
                        }
                    }
                    m6.f.set(false);
                } else if (this.d > 1) {
                    Intrinsics.checkNotNullExpressionValue("O6", "access$getTAG$p(...)");
                    String str = "Unable to send events to server: " + of.c() + ServerSentEventKt.SPACE + of.e() + ". Will retry";
                    O6.a(this.e, this.f, this.g, this.d - 1, this.h, this.i, this.j, this.k);
                } else {
                    M6 m62 = this.j;
                    F6 eventPayload2 = this.e;
                    m62.getClass();
                    Intrinsics.checkNotNullParameter(eventPayload2, "eventPayload");
                    String TAG2 = m62.e;
                    Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    BuildersKt__BuildersKt.runBlocking$default(null, new I6(eventPayload2, true, m62, null), 1, null);
                    m62.a(System.currentTimeMillis());
                    if (m62.d != null) {
                        ArrayList eventIds2 = eventPayload2.f6550a;
                        Intrinsics.checkNotNullParameter(eventIds2, "eventIds");
                        Integer num2 = AbstractC3973om.c;
                        if (num2 != null && eventIds2.contains(Integer.valueOf(num2.intValue()))) {
                            AbstractC3973om.c = null;
                        }
                    }
                    m62.f.set(false);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        C3733ga c3733ga = (C3733ga) If.g.getValue();
        Mf mf = this.c;
        this.f6735a = 2;
        obj = c3733ga.f7119a.a(mf, this);
    }
}
