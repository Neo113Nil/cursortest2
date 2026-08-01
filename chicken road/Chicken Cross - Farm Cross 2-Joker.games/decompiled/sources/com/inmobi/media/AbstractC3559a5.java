package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.Trackers;
import com.inmobi.media.ads.network.common.model.TrackersV2;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.a5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3559a5 {
    public static final ArrayList a(H h, String type) {
        Intrinsics.checkNotNullParameter(h, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        List list = h.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((Trackers) obj).getType(), type)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((Trackers) it.next()).getUrl());
        }
        return arrayList2.isEmpty() ? a(type, h.g) : arrayList2;
    }

    public static final ArrayList a(String type, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TrackingInfo trackingInfo = (TrackingInfo) it.next();
            List<TrackersV2> trackers = trackingInfo.getTrackers();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : trackers) {
                if (Intrinsics.areEqual(((TrackersV2) obj).getType(), type)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                TrackersV2 trackersV2 = (TrackersV2) it2.next();
                List<String> url = trackersV2.getUrl();
                List<String> imExts = trackersV2.getImExts();
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(imExts, 10));
                Iterator<T> it3 = imExts.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(trackingInfo.getImBaseUrl() + ((String) it3.next()));
                }
                CollectionsKt.addAll(arrayList3, CollectionsKt.plus((Collection) url, (Iterable) arrayList4));
            }
            CollectionsKt.addAll(arrayList, arrayList3);
        }
        return arrayList;
    }
}
