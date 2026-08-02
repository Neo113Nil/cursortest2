package com.payair.csdk;

/* loaded from: classes4.dex */
public final class m3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Iterator f4285a;
    public java.util.Collection b;
    public int c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.util.List e;
    public final /* synthetic */ com.payair.logic.managers.TokenListManagerSuspendImpl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(java.util.List list, com.payair.logic.managers.TokenListManagerSuspendImpl tokenListManagerSuspendImpl, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.e = list;
        this.f = tokenListManagerSuspendImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.m3 m3Var = new com.payair.csdk.m3(this.e, this.f, continuation);
        m3Var.d = obj;
        return m3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.payair.csdk.m3) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0082 -> B:5:0x0083). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Iterator it;
        java.util.Collection collection;
        kotlinx.coroutines.Deferred async$default;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.d;
            java.util.List list = this.e;
            com.payair.logic.managers.TokenListManagerSuspendImpl tokenListManagerSuspendImpl = this.f;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.payair.csdk.l3(tokenListManagerSuspendImpl, (com.payair.db.token.TokenDetailsEntry) it2.next(), null), 3, null);
                arrayList.add(async$default);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            it = arrayList.iterator();
            collection = arrayList2;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = this.b;
            it = this.f4285a;
            java.util.Collection collection2 = (java.util.Collection) this.d;
            kotlin.ResultKt.throwOnFailure(obj);
            collection.add((com.payair.db.token.TokenDetailsEntry) obj);
            collection = collection2;
            if (it.hasNext()) {
                kotlinx.coroutines.Deferred deferred = (kotlinx.coroutines.Deferred) it.next();
                this.d = collection;
                this.f4285a = it;
                this.b = collection;
                this.c = 1;
                obj = deferred.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                collection2 = collection;
                collection.add((com.payair.db.token.TokenDetailsEntry) obj);
                collection = collection2;
                if (it.hasNext()) {
                    return (java.util.List) collection;
                }
            }
        }
    }
}
