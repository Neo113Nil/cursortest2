package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class D4 {
    public static final java.util.ArrayList a(com.inmobi.media.G g, java.lang.String type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        java.util.List list = g.f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.inmobi.media.ads.network.common.model.Trackers) obj).getType(), type)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList2, ((com.inmobi.media.ads.network.common.model.Trackers) it.next()).getUrl());
        }
        return arrayList2.isEmpty() ? a(type, g.g) : arrayList2;
    }

    public static final java.util.ArrayList a(java.lang.String type, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.inmobi.media.ads.network.common.model.TrackingInfo trackingInfo = (com.inmobi.media.ads.network.common.model.TrackingInfo) it.next();
            java.util.List<com.inmobi.media.ads.network.common.model.TrackersV2> trackers = trackingInfo.getTrackers();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : trackers) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.inmobi.media.ads.network.common.model.TrackersV2) obj).getType(), type)) {
                    arrayList2.add(obj);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                com.inmobi.media.ads.network.common.model.TrackersV2 trackersV2 = (com.inmobi.media.ads.network.common.model.TrackersV2) it2.next();
                java.util.List<java.lang.String> url = trackersV2.getUrl();
                java.util.List<java.lang.String> imExts = trackersV2.getImExts();
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(imExts, 10));
                for (java.lang.String str : imExts) {
                    arrayList4.add(trackingInfo.getImBaseUrl() + str);
                }
                kotlin.collections.CollectionsKt.addAll(arrayList3, kotlin.collections.CollectionsKt.plus((java.util.Collection) url, (java.lang.Iterable) arrayList4));
            }
            kotlin.collections.CollectionsKt.addAll(arrayList, arrayList3);
        }
        return arrayList;
    }
}
