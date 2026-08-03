package com.unity3d.ads.core.domain;

/* compiled from: AndroidGetIsAdActivity.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\u0002R)\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetIsAdActivity;", "", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "activities", "", "Lokio/ByteString;", "kotlin.jvm.PlatformType", "getActivities", "()Ljava/util/List;", "activities$delegate", "Lkotlin/Lazy;", "invoke", "", "activityName", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidGetIsAdActivity {

    /* renamed from: activities$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy activities;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public AndroidGetIsAdActivity(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
        this.activities = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.List<? extends okio.ByteString>>() { // from class: com.unity3d.ads.core.domain.AndroidGetIsAdActivity$activities$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends okio.ByteString> invoke() {
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository2;
                sessionRepository2 = com.unity3d.ads.core.domain.AndroidGetIsAdActivity.this.sessionRepository;
                java.util.List<com.google.protobuf.ByteString> observableAndroidActivitiesList = sessionRepository2.getNativeConfiguration().getObservableAndroidActivitiesList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableAndroidActivitiesList, "sessionRepository.native…ableAndroidActivitiesList");
                java.util.List<com.google.protobuf.ByteString> list = observableAndroidActivitiesList;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    byte[] byteArray = ((com.google.protobuf.ByteString) it.next()).toByteArray();
                    arrayList.add(okio.ByteString.of(java.util.Arrays.copyOf(byteArray, byteArray.length)));
                }
                return arrayList;
            }
        });
    }

    private final java.util.List<okio.ByteString> getActivities() {
        return (java.util.List) this.activities.getValue();
    }

    public final boolean invoke(java.lang.String activityName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityName, "activityName");
        return getActivities().contains(okio.ByteString.decodeHex(com.unity3d.ads.core.extensions.StringExtensionsKt.getSHA256Hash(activityName)));
    }
}
