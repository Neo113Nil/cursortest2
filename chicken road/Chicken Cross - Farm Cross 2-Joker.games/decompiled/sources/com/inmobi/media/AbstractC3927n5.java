package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* renamed from: com.inmobi.media.n5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3927n5 {
    public static JSONArray a(C3899m5 it, List skipList) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(skipList, "skipList");
        JSONArray jSONArray = new JSONArray();
        List list = C3899m5.j;
        Intrinsics.checkNotNullParameter(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, "key");
        Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME)) {
            jSONArray.put(it.f7239a);
        }
        Intrinsics.checkNotNullParameter("bid", "key");
        Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("bid")) {
            jSONArray.put(it.b);
        }
        Intrinsics.checkNotNullParameter("its", "key");
        Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("its")) {
            jSONArray.put(it.c);
        }
        Intrinsics.checkNotNullParameter("vtm", "key");
        Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("vtm")) {
            jSONArray.put(it.d);
        }
        Intrinsics.checkNotNullParameter("plid", "key");
        Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("plid")) {
            jSONArray.put(it.e);
        }
        Intrinsics.checkNotNullParameter("catid", "key");
        Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("catid")) {
            jSONArray.put(it.f);
        }
        Intrinsics.checkNotNullParameter("hcd", "key");
        Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("hcd")) {
            jSONArray.put(it.g);
        }
        Intrinsics.checkNotNullParameter("hsv", "key");
        Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("hsv")) {
            jSONArray.put(it.h);
        }
        Intrinsics.checkNotNullParameter("hcv", "key");
        Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("hcv")) {
            jSONArray.put(it.i);
        }
        return jSONArray;
    }
}
