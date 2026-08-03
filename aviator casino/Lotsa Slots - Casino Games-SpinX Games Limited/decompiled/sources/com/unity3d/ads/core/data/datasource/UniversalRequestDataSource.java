package com.unity3d.ads.core.data.datasource;

/* compiled from: UniversalRequestDataSource.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ!\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "", "universalRequestStoreProvider", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataStoreProvider;", "(Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataStoreProvider;)V", "get", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "", com.ironsource.X3.i.W, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "set", "data", "Lcom/google/protobuf/ByteString;", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UniversalRequestDataSource {
    private final com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider universalRequestStoreProvider;

    public UniversalRequestDataSource(com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider universalRequestStoreProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalRequestStoreProvider, "universalRequestStoreProvider");
        this.universalRequestStoreProvider = universalRequestStoreProvider;
    }

    public final java.lang.Object get(kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore> continuation) {
        return kotlinx.coroutines.flow.FlowKt.first(kotlinx.coroutines.flow.FlowKt.m12340catch(this.universalRequestStoreProvider.invoke().getData(), new com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2(null)), continuation);
    }

    public final java.lang.Object set(java.lang.String str, com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object updateData = this.universalRequestStoreProvider.invoke().updateData(new com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$set$2(str, byteString, null), continuation);
        return updateData == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateData : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object remove(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object updateData = this.universalRequestStoreProvider.invoke().updateData(new com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2(str, null), continuation);
        return updateData == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateData : kotlin.Unit.INSTANCE;
    }
}
