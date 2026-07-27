package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObjectState;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* compiled from: AndroidAdRefresh.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Result;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$1$2", f = "AndroidAdRefresh.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class AndroidAdRefresh$invoke$3$1$1$2 extends SuspendLambda implements Function2<Result<? extends Unit>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Deferred<AdObjectState> $showing;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AndroidAdRefresh$invoke$3$1$1$2(Deferred<? extends AdObjectState> deferred, Continuation<? super AndroidAdRefresh$invoke$3$1$1$2> continuation) {
        super(2, continuation);
        this.$showing = deferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AndroidAdRefresh$invoke$3$1$1$2(this.$showing, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Result<? extends Unit> result, Continuation<? super Unit> continuation) {
        return invoke(result.getValue(), continuation);
    }

    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return ((AndroidAdRefresh$invoke$3$1$1$2) create(Result.m8078boximpl(obj), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Job.DefaultImpls.cancel$default((Job) this.$showing, (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE;
    }
}
