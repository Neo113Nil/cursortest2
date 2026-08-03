package com.inmobi.media;

/* renamed from: com.inmobi.media.zk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2938zk {
    public static final java.util.Map a(com.inmobi.media.G g) {
        java.lang.String creativeType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g, "<this>");
        java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("plId", java.lang.Long.valueOf(g.f4714a.f5382a.f4958a)), kotlin.TuplesKt.to("plType", g.f4714a.f5382a.g), kotlin.TuplesKt.to("adType", "native"), kotlin.TuplesKt.to("markupType", g.c), kotlin.TuplesKt.to("creativeId", "\"" + g.e + "\""), kotlin.TuplesKt.to("impressionId", "\"" + g.m.b + "\""), kotlin.TuplesKt.to("isRewarded", java.lang.Boolean.valueOf(g.b.f4651a)));
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo = g.d;
        if (metaInfo != null && (creativeType = metaInfo.getCreativeType()) != null) {
            mutableMapOf.put("creativeType", creativeType);
        }
        java.lang.String str = g.i;
        if (str != null) {
            mutableMapOf.put("metadataBlob", str);
        }
        return mutableMapOf;
    }

    public static final java.util.Map a(com.inmobi.media.C2657p1 c2657p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c2657p1, "<this>");
        return kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("plId", java.lang.Long.valueOf(c2657p1.f5382a.f4958a)), kotlin.TuplesKt.to("plType", c2657p1.f5382a.g), kotlin.TuplesKt.to("adType", "native"));
    }
}
