package com.datadog.android.api.feature;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/api/feature/StorageBackedFeature;", "Lcom/datadog/android/api/feature/Feature;", "Lcom/datadog/android/api/net/RequestFactory;", "getRequestFactory", "()Lcom/datadog/android/api/net/RequestFactory;", "requestFactory", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "getStorageConfiguration", "()Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "storageConfiguration"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface StorageBackedFeature extends com.datadog.android.api.feature.Feature {
    com.datadog.android.api.net.RequestFactory getRequestFactory();

    com.datadog.android.api.storage.FeatureStorageConfiguration getStorageConfiguration();
}
