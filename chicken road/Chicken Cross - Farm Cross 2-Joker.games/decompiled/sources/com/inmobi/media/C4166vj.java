package com.inmobi.media;

import io.ktor.sse.ServerSentEventKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* renamed from: com.inmobi.media.vj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4166vj extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7441a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Ej d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4166vj(String str, Ej ej, long j, Continuation continuation) {
        super(2, continuation);
        this.c = str;
        this.d = ej;
        this.e = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4166vj c4166vj = new C4166vj(this.c, this.d, this.e, continuation);
        c4166vj.b = obj;
        return c4166vj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4166vj) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fe, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r14, r1, r13) == r0) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m8079constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7441a;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.c;
            Result.Companion companion2 = Result.INSTANCE;
            C3733ga c3733ga = (C3733ga) If.c.getValue();
            Kf kf = new Kf(str, null, null, null, null, false, 62);
            this.f7441a = 1;
            obj = c3733ga.f7119a.a(kf, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        Of of = (Of) obj;
        m8079constructorimpl = Result.m8079constructorimpl(of.c() == 200 ? TuplesKt.to(of.d().string(Charsets.UTF_8), Boxing.boxInt(200)) : TuplesKt.to(null, Boxing.boxInt(of.c())));
        Ej ej = this.d;
        String str2 = this.c;
        long j = this.e;
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl != null) {
            Y9 y9 = ej.i;
            if (y9 != null) {
                String str3 = Ej.j1;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$cp(...)");
                ((Z9) y9).b(str3, "Error prefetching HTML content from URL: " + str2 + ServerSentEventKt.SPACE + m8082exceptionOrNullimpl.getMessage());
            }
            Oj renderViewTelemetry = ej.getRenderViewTelemetry();
            if (renderViewTelemetry != null) {
                renderViewTelemetry.a(j, Boxing.boxShort((short) 3101));
            }
            m8079constructorimpl = TuplesKt.to(null, Boxing.boxInt(3101));
        }
        Pair pair = (Pair) m8079constructorimpl;
        String str4 = (String) pair.component1();
        int intValue = ((Number) pair.component2()).intValue();
        MainCoroutineDispatcher main = Dispatchers.getMain();
        C4139uj c4139uj = new C4139uj(this.d, str4, this.e, intValue, null);
        this.f7441a = 2;
    }
}
