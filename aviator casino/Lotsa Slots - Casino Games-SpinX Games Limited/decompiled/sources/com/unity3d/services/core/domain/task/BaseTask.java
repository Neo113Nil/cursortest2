package com.unity3d.services.core.domain.task;

/* compiled from: BaseTask.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004J*\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0007\u001a\u00028\u0000H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0096Bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\t\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/services/core/domain/task/BaseTask;", "P", "Lcom/unity3d/services/core/domain/task/BaseParams;", "R", "Lcom/unity3d/services/core/di/IServiceComponent;", "doWork", "Lkotlin/Result;", "params", "doWork-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/BaseParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "invoke-gIAlu-s", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BaseTask<P extends com.unity3d.services.core.domain.task.BaseParams, R> extends com.unity3d.services.core.di.IServiceComponent {
    /* renamed from: doWork-gIAlu-s, reason: not valid java name */
    java.lang.Object mo10358doWorkgIAlus(P p, kotlin.coroutines.Continuation<? super kotlin.Result<? extends R>> continuation);

    /* renamed from: invoke-gIAlu-s, reason: not valid java name */
    java.lang.Object mo10359invokegIAlus(P p, kotlin.coroutines.Continuation<? super kotlin.Result<? extends R>> continuation);

    /* compiled from: BaseTask.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <P extends com.unity3d.services.core.domain.task.BaseParams, R> com.unity3d.services.core.di.IServiceProvider getServiceProvider(com.unity3d.services.core.domain.task.BaseTask<? super P, R> baseTask) {
            return com.unity3d.services.core.di.IServiceComponent.DefaultImpls.getServiceProvider(baseTask);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* renamed from: invoke-gIAlu-s, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <P extends com.unity3d.services.core.domain.task.BaseParams, R> java.lang.Object m10360invokegIAlus(com.unity3d.services.core.domain.task.BaseTask<? super P, R> baseTask, P p, kotlin.coroutines.Continuation<? super kotlin.Result<? extends R>> continuation) {
            com.unity3d.services.core.domain.task.BaseTask$invoke$1 baseTask$invoke$1;
            int i;
            if (continuation instanceof com.unity3d.services.core.domain.task.BaseTask$invoke$1) {
                baseTask$invoke$1 = (com.unity3d.services.core.domain.task.BaseTask$invoke$1) continuation;
                if ((baseTask$invoke$1.label & Integer.MIN_VALUE) != 0) {
                    baseTask$invoke$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = baseTask$invoke$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = baseTask$invoke$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return ((kotlin.Result) obj).getValue();
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    baseTask$invoke$1.label = 1;
                    java.lang.Object mo10358doWorkgIAlus = baseTask.mo10358doWorkgIAlus(p, baseTask$invoke$1);
                    return mo10358doWorkgIAlus == coroutine_suspended ? coroutine_suspended : mo10358doWorkgIAlus;
                }
            }
            baseTask$invoke$1 = new com.unity3d.services.core.domain.task.BaseTask$invoke$1(continuation);
            java.lang.Object obj2 = baseTask$invoke$1.result;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = baseTask$invoke$1.label;
            if (i == 0) {
            }
        }
    }
}
