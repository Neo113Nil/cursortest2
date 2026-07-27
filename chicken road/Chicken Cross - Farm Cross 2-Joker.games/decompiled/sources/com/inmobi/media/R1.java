package com.inmobi.media;

import android.app.ApplicationExitInfo;
import java.io.InputStream;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okio.Okio;
import okio.Source;

/* loaded from: classes6.dex */
public final class R1 extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S1 f6815a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(S1 s1, Continuation continuation) {
        super(1, continuation);
        this.f6815a = s1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new R1(this.f6815a, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new R1(this.f6815a, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        T1 t1;
        Source source;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            S1 s1 = this.f6815a;
            List<ApplicationExitInfo> historicalProcessExitReasons = s1.f.getHistoricalProcessExitReasons(s1.b.getPackageName(), 0, 10);
            Intrinsics.checkNotNullExpressionValue(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
            Db db = this.f6815a.g;
            db.getClass();
            Intrinsics.checkNotNullParameter("exitReasonTimestamp", "key");
            long j = db.f6510a.getLong("exitReasonTimestamp", 0L);
            S1 s12 = this.f6815a;
            long j2 = j;
            for (ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
                if (applicationExitInfo.getTimestamp() > j) {
                    try {
                        int reason = applicationExitInfo.getReason();
                        String description = applicationExitInfo.getDescription();
                        InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                        t1 = new T1(description, reason, AbstractC3727g4.a((traceInputStream == null || (source = Okio.source(traceInputStream)) == null) ? null : Okio.buffer(source), s12.d));
                    } catch (Exception e) {
                        Intrinsics.checkNotNullExpressionValue(s12.e, "access$getTAG$p(...)");
                        String str = "Unexpected error processing exit info: " + e.getMessage();
                        t1 = new T1(applicationExitInfo.getDescription(), applicationExitInfo.getReason(), ExceptionsKt.stackTraceToString(e));
                    }
                    long j3 = s12.c;
                    Q1 runnable = new Q1(s12, t1, null);
                    CoroutineScope coroutineScope = AbstractC4143un.f7420a;
                    Intrinsics.checkNotNullParameter(runnable, "runnable");
                    BuildersKt__Builders_commonKt.launch$default(AbstractC4143un.f7420a, null, null, new C4058rn(j3, null, runnable), 3, null);
                    if (applicationExitInfo.getTimestamp() > j2) {
                        j2 = applicationExitInfo.getTimestamp();
                    }
                }
            }
            this.f6815a.g.a("exitReasonTimestamp", j2, false);
        } catch (Exception e2) {
            Intrinsics.checkNotNullExpressionValue(this.f6815a.e, "access$getTAG$p(...)");
            String str2 = "Error fetching historical exit reasons: " + e2.getMessage();
        }
        return Unit.INSTANCE;
    }
}
