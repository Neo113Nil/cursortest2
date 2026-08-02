package com.payair.logic.storage;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000b\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\rH¦@¢\u0006\u0004\b\u000b\u0010\u000fJ\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00102\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u0011R(\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\r0\u00108'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/payair/logic/storage/TokenizationTimestampStorage;", "", "", "clearAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "ntu", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "timestamp", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "timestampMap", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "getTimestampMap", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TokenizationTimestampStorage {
    java.lang.Object clearAll(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object delete(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    kotlinx.coroutines.flow.Flow<java.util.Map<java.lang.Long, java.lang.Long>> getTimestampMap();

    java.lang.Object store(java.lang.String str, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object store(java.util.Map<java.lang.Long, java.lang.Long> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    kotlinx.coroutines.flow.Flow<java.lang.Long> timestamp(java.lang.String ntu);
}
