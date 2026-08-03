package com.google.firebase.sessions;

/* compiled from: SessionLifecycleClient.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", f = "SessionLifecycleClient.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SessionLifecycleClient$sendLifecycleEvents$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<android.os.Message> $messages;
    int label;
    final /* synthetic */ com.google.firebase.sessions.SessionLifecycleClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionLifecycleClient$sendLifecycleEvents$1(com.google.firebase.sessions.SessionLifecycleClient sessionLifecycleClient, java.util.List<android.os.Message> list, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1> continuation) {
        super(2, continuation);
        this.this$0 = sessionLifecycleClient;
        this.$messages = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1(this.this$0, this.$messages, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.os.Message latestByCode;
        android.os.Message latestByCode2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.Map map = (java.util.Map) obj;
        if (map.isEmpty()) {
            android.util.Log.d(com.google.firebase.sessions.SessionLifecycleClient.TAG, "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
        } else {
            java.util.Collection values = map.values();
            if (!(values instanceof java.util.Collection) || !values.isEmpty()) {
                java.util.Iterator it = values.iterator();
                while (it.hasNext()) {
                    if (((com.google.firebase.sessions.api.SessionSubscriber) it.next()).isDataCollectionEnabled()) {
                        latestByCode = this.this$0.getLatestByCode(this.$messages, 2);
                        latestByCode2 = this.this$0.getLatestByCode(this.$messages, 1);
                        java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(kotlin.collections.CollectionsKt.filterNotNull(kotlin.collections.CollectionsKt.mutableListOf(latestByCode, latestByCode2)), new java.util.Comparator() { // from class: com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1$invokeSuspend$$inlined$sortedBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Long.valueOf(((android.os.Message) t).getWhen()), java.lang.Long.valueOf(((android.os.Message) t2).getWhen()));
                            }
                        });
                        com.google.firebase.sessions.SessionLifecycleClient sessionLifecycleClient = this.this$0;
                        java.util.Iterator it2 = sortedWith.iterator();
                        while (it2.hasNext()) {
                            sessionLifecycleClient.sendMessageToServer((android.os.Message) it2.next());
                        }
                    }
                }
            }
            android.util.Log.d(com.google.firebase.sessions.SessionLifecycleClient.TAG, "Data Collection is disabled for all subscribers. Skipping this Event");
        }
        return kotlin.Unit.INSTANCE;
    }
}
