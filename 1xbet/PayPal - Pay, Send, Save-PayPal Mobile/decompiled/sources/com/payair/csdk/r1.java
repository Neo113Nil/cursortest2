package com.payair.csdk;

/* loaded from: classes10.dex */
public final class r1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4306a;
    public final /* synthetic */ com.payair.model.StartTokenizeAllCardsData b;
    public final /* synthetic */ com.payair.logic.remote.repositories.HceRemoteRepositoryImpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.payair.model.StartTokenizeAllCardsData startTokenizeAllCardsData, com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = startTokenizeAllCardsData;
        this.c = hceRemoteRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.payair.csdk.r1(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.payair.csdk.r1(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.payair.logic.storage.TokenizationTimestampStorage tokenizationTimestampStorage;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4306a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.List<com.payair.model.TokenizationSession> tokenizationSessions = this.b.getTokenizationSessions();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(tokenizationSessions, 10)), 16));
            for (com.payair.model.TokenizationSession tokenizationSession : tokenizationSessions) {
                kotlin.Pair pair = kotlin.TuplesKt.to(kotlin.coroutines.jvm.internal.Boxing.boxLong(tokenizationSession.getTokenizationSessionId()), kotlin.coroutines.jvm.internal.Boxing.boxLong(tokenizationSession.getExpirationTimestamp()));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            tokenizationTimestampStorage = this.c.d;
            this.f4306a = 1;
            if (tokenizationTimestampStorage.store(linkedHashMap, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
