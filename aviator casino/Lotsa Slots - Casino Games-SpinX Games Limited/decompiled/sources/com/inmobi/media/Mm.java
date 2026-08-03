package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Mm extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4842a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.util.ArrayList c;
    public final /* synthetic */ double d;
    public final /* synthetic */ com.inmobi.media.core.config.models.AdConfig.VastVideoConfig e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mm(java.util.ArrayList arrayList, double d, com.inmobi.media.core.config.models.AdConfig.VastVideoConfig vastVideoConfig, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.c = arrayList;
        this.d = d;
        this.e = vastVideoConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Mm mm = new com.inmobi.media.Mm(this.c, this.d, this.e, continuation);
        mm.b = obj;
        return mm;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.Mm) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object awaitAll;
        kotlinx.coroutines.Deferred async$default;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4842a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
            if (this.c.isEmpty()) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            int a2 = com.inmobi.media.C5.a();
            com.inmobi.media.Xe a3 = com.inmobi.media.C4.a();
            java.util.ArrayList arrayList = this.c;
            double d = this.d;
            com.inmobi.media.core.config.models.AdConfig.VastVideoConfig vastVideoConfig = this.e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.util.ArrayList arrayList3 = arrayList2;
                async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.inmobi.media.Km((com.inmobi.media.Gl) it.next(), d, a3, a2, vastVideoConfig, null), 3, null);
                arrayList3.add(async$default);
                arrayList2 = arrayList3;
                d = d;
            }
            this.f4842a = 1;
            awaitAll = kotlinx.coroutines.AwaitKt.awaitAll(arrayList2, this);
            if (awaitAll == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            awaitAll = obj;
        }
        java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith((java.lang.Iterable) awaitAll, new com.inmobi.media.Lm());
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(sortedWith, 10));
        java.util.Iterator it2 = sortedWith.iterator();
        while (it2.hasNext()) {
            arrayList4.add((com.inmobi.media.Gl) ((kotlin.Pair) it2.next()).getFirst());
        }
        return arrayList4;
    }
}
