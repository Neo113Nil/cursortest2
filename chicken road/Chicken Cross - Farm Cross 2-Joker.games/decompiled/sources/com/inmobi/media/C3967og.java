package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* renamed from: com.inmobi.media.og, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3967og extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7289a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AdConfig.OmidConfig c;
    public final /* synthetic */ Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3967og(AdConfig.OmidConfig omidConfig, Context context, Continuation continuation) {
        super(2, continuation);
        this.c = omidConfig;
        this.d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C3967og c3967og = new C3967og(this.c, this.d, continuation);
        c3967og.b = obj;
        return c3967og;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3967og) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        if (r15 == r0) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m8079constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7289a;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AdConfig.OmidConfig omidConfig = this.c;
            Result.Companion companion2 = Result.INSTANCE;
            this.f7289a = 1;
            String url = omidConfig.getUrl();
            int maxRetries = omidConfig.getMaxRetries();
            int retryInterval = omidConfig.getRetryInterval();
            IntRange intRange = Tf.f6872a;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new C4163vg(new Kf(url, null, null, null, new C3631ck(maxRetries, retryInterval * 1000, 0), false, 46), null), this);
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
        m8079constructorimpl = Result.m8079constructorimpl((String) obj);
        if (Result.m8082exceptionOrNullimpl(m8079constructorimpl) != null) {
            C4051rg.b.set(0);
        }
        Context context = this.d;
        if (Result.m8086isSuccessimpl(m8079constructorimpl)) {
            String str = (String) m8079constructorimpl;
            C4051rg.b.set(1);
            C4051rg c4051rg = C4051rg.f7353a;
            C4136ug c4136ug = C4051rg.c;
            if (c4136ug == null) {
                c4136ug = new C4136ug(context);
                C4051rg.c = c4136ug;
            }
            this.b = m8079constructorimpl;
            this.f7289a = 2;
            Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new C4107tg(c4136ug, str, null), this);
            if (withContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                withContext = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
