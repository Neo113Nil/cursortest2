package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.MetaInfo;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.vm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4169vm {
    public static final Map a(H h) {
        String creativeType;
        Intrinsics.checkNotNullParameter(h, "<this>");
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("plId", Long.valueOf(h.f6590a.f7340a.f7031a)), TuplesKt.to("plType", h.f6590a.f7340a.h), TuplesKt.to("adType", "native"), TuplesKt.to("markupType", h.c), TuplesKt.to("creativeId", "\"" + h.e + "\""), TuplesKt.to("impressionId", "\"" + h.m.b + "\""), TuplesKt.to("isRewarded", Boolean.valueOf(h.b.f6522a)));
        MetaInfo metaInfo = h.d;
        if (metaInfo != null && (creativeType = metaInfo.getCreativeType()) != null) {
            mutableMapOf.put("creativeType", creativeType);
        }
        String str = h.i;
        if (str != null) {
            mutableMapOf.put("metadataBlob", str);
        }
        return mutableMapOf;
    }

    public static final Map a(C4036r1 c4036r1) {
        Intrinsics.checkNotNullParameter(c4036r1, "<this>");
        return MapsKt.mutableMapOf(TuplesKt.to("plId", Long.valueOf(c4036r1.f7340a.f7031a)), TuplesKt.to("plType", c4036r1.f7340a.h), TuplesKt.to("adType", "native"));
    }
}
