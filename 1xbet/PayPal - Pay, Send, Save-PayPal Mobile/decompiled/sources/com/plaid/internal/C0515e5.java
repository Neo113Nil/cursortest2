package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.core.storage.PlaidDirectoryStorage$listFileNames$2", f = "PlaidDirectoryStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.e5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0515e5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends java.lang.String>>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.C0551i5 f6402a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0515e5(com.plaid.internal.C0551i5 c0551i5, kotlin.coroutines.Continuation<? super com.plaid.internal.C0515e5> continuation) {
        super(2, continuation);
        this.f6402a = c0551i5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.C0515e5(this.f6402a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends java.lang.String>> continuation) {
        return new com.plaid.internal.C0515e5(this.f6402a, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        java.io.File[] listFiles = this.f6402a.f6442a.listFiles();
        if (listFiles == null || (list = kotlin.collections.ArraysKt.toList(listFiles)) == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((java.io.File) it.next()).getName());
        }
        return arrayList;
    }
}
