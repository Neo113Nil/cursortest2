package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Li {
    public static final java.util.List a(com.inmobi.media.ads.network.common.model.Ad ad, java.lang.String type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        java.util.List<com.inmobi.media.ads.network.common.model.Trackers> trackers$media_release = ad.getTrackers$media_release();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : trackers$media_release) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.inmobi.media.ads.network.common.model.Trackers) obj).getType(), type)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList2, ((com.inmobi.media.ads.network.common.model.Trackers) it.next()).getUrl());
        }
        java.util.List<com.inmobi.media.ads.network.common.model.TrackingInfo> trackingInfo$media_release = ad.getTrackingInfo$media_release();
        java.util.Collection arrayList3 = new java.util.ArrayList();
        for (com.inmobi.media.ads.network.common.model.TrackingInfo trackingInfo : trackingInfo$media_release) {
            java.util.List<com.inmobi.media.ads.network.common.model.TrackersV2> trackers = trackingInfo.getTrackers();
            java.util.ArrayList<com.inmobi.media.ads.network.common.model.TrackersV2> arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj2 : trackers) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.inmobi.media.ads.network.common.model.TrackersV2) obj2).getType(), type)) {
                    arrayList4.add(obj2);
                }
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (com.inmobi.media.ads.network.common.model.TrackersV2 trackersV2 : arrayList4) {
                java.util.List<java.lang.String> url = trackersV2.getUrl();
                java.util.List<java.lang.String> imExts = trackersV2.getImExts();
                java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(imExts, 10));
                for (java.lang.String str : imExts) {
                    arrayList6.add(trackingInfo.getImBaseUrl() + str);
                }
                kotlin.collections.CollectionsKt.addAll(arrayList5, kotlin.collections.CollectionsKt.plus((java.util.Collection) url, (java.lang.Iterable) arrayList6));
            }
            kotlin.collections.CollectionsKt.addAll(arrayList3, arrayList5);
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = kotlin.collections.CollectionsKt.emptyList();
        }
        return kotlin.collections.CollectionsKt.plus(arrayList3, (java.lang.Iterable) arrayList2);
    }
}
