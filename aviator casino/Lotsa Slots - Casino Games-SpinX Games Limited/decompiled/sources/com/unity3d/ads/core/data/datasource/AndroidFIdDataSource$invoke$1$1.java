package com.unity3d.ads.core.data.datasource;

/* compiled from: AndroidFIdDataSource.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1", f = "AndroidFIdDataSource.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidFIdDataSource$invoke$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> {
    final /* synthetic */ com.google.android.gms.tasks.Task<java.lang.String> $task;
    java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidFIdDataSource$invoke$1$1(com.google.android.gms.tasks.Task<java.lang.String> task, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1> continuation) {
        super(2, continuation);
        this.$task = task;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1(this.$task, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return ((com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.google.android.gms.tasks.Task<java.lang.String> task = this.$task;
            this.L$0 = task;
            this.label = 1;
            com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1 androidFIdDataSource$invoke$1$1 = this;
            kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(androidFIdDataSource$invoke$1$1));
            final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
            final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
                    invoke2(str);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(java.lang.String str) {
                    kotlin.coroutines.Continuation<java.lang.String> continuation = safeContinuation2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m10798constructorimpl(str));
                }
            };
            task.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener(function1) { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$sam$com_google_android_gms_tasks_OnSuccessListener$0
                private final /* synthetic */ kotlin.jvm.functions.Function1 function;

                {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "function");
                    this.function = function1;
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(java.lang.Object obj2) {
                    this.function.invoke(obj2);
                }
            });
            task.addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1$1$2
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(java.lang.Exception it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    kotlin.coroutines.Continuation<java.lang.String> continuation = safeContinuation2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(it)));
                }
            });
            obj = safeContinuation.getOrThrow();
            if (obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(androidFIdDataSource$invoke$1$1);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
