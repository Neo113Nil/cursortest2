package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000b\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000b\u0010\tJ\"\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H¦@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000f\u0010\u000eJ(\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\nH¦@¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/statsig/androidsdk/KeyValueStorage;", "T", "", "", "clearAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "storeName", "clearStore", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "readAll", "key", "readValue", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeValue", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "writeValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "entries", "writeValues", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface KeyValueStorage<T> {
    java.lang.Object clearAll(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object clearStore(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object readAll(java.lang.String str, kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends T>> continuation);

    java.lang.Object readValue(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super T> continuation);

    java.lang.Object removeValue(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object writeValue(java.lang.String str, java.lang.String str2, T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object writeValues(java.lang.String str, java.util.Map<java.lang.String, ? extends T> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
