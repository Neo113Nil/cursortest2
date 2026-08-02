package com.datadog.android.api.storage.datastore;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H&¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/datadog/android/api/storage/datastore/DataStoreReadCallback;", "", "T", "", "onFailure", "()V", "Lcom/datadog/android/core/persistence/datastore/DataStoreContent;", "dataStoreContent", "onSuccess", "(Lcom/datadog/android/core/persistence/datastore/DataStoreContent;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataStoreReadCallback<T> {
    void onFailure();

    void onSuccess(com.datadog.android.core.persistence.datastore.DataStoreContent<T> dataStoreContent);
}
