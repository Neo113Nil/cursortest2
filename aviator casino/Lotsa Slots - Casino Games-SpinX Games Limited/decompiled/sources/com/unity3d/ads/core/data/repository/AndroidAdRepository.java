package com.unity3d.ads.core.data.repository;

/* compiled from: AndroidAdRepository.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidAdRepository;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "()V", "loadedAds", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/google/protobuf/ByteString;", "Lcom/unity3d/ads/core/data/model/AdObject;", "placementsLoadedAds", "", "", "addAd", "", "opportunityId", "adObject", "enqueueOpportunityForPlacement", "placementId", "getAd", "getAllAds", "", "hasOpportunityId", "", "pollOpportunityIdForPlacement", "removeAd", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidAdRepository implements com.unity3d.ads.core.data.repository.AdRepository {
    private final java.util.concurrent.ConcurrentHashMap<com.google.protobuf.ByteString, com.unity3d.ads.core.data.model.AdObject> loadedAds = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.google.protobuf.ByteString>> placementsLoadedAds = new java.util.concurrent.ConcurrentHashMap<>();

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void addAd(com.google.protobuf.ByteString opportunityId, com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.loadedAds.put(opportunityId, adObject);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public com.unity3d.ads.core.data.model.AdObject getAd(com.google.protobuf.ByteString opportunityId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        return this.loadedAds.get(opportunityId);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public com.google.protobuf.ByteString pollOpportunityIdForPlacement(java.lang.String placementId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        java.util.List<com.google.protobuf.ByteString> list = this.placementsLoadedAds.get(placementId);
        if (list != null) {
            return (com.google.protobuf.ByteString) kotlin.collections.CollectionsKt.removeFirstOrNull(list);
        }
        return null;
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void enqueueOpportunityForPlacement(java.lang.String placementId, com.google.protobuf.ByteString opportunityId) {
        java.util.List<com.google.protobuf.ByteString> putIfAbsent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.google.protobuf.ByteString>> concurrentHashMap = this.placementsLoadedAds;
        java.util.ArrayList arrayList = concurrentHashMap.get(placementId);
        if (arrayList == null && (putIfAbsent = concurrentHashMap.putIfAbsent(placementId, (arrayList = new java.util.ArrayList()))) != null) {
            arrayList = putIfAbsent;
        }
        arrayList.add(opportunityId);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void removeAd(com.google.protobuf.ByteString opportunityId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        this.loadedAds.remove(opportunityId);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public boolean hasOpportunityId(com.google.protobuf.ByteString opportunityId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        return this.loadedAds.containsKey(opportunityId);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public java.util.Map<com.google.protobuf.ByteString, com.unity3d.ads.core.data.model.AdObject> getAllAds() {
        return kotlin.collections.MapsKt.toMap(this.loadedAds);
    }
}
