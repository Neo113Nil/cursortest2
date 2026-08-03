package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Q4 {
    public static org.json.JSONArray a(com.inmobi.media.P4 it, java.util.List skipList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skipList, "skipList");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.List list = com.inmobi.media.P4.j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ac", com.ironsource.X3.i.W);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("ac")) {
            jSONArray.put(it.f4887a);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.ironsource.M6.f, com.ironsource.X3.i.W);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains(com.ironsource.M6.f)) {
            jSONArray.put(it.b);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("its", com.ironsource.X3.i.W);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("its")) {
            jSONArray.put(it.c);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("vtm", com.ironsource.X3.i.W);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("vtm")) {
            jSONArray.put(it.d);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("plid", com.ironsource.X3.i.W);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("plid")) {
            jSONArray.put(it.e);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("catid", com.ironsource.X3.i.W);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("catid")) {
            jSONArray.put(it.f);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("hcd", com.ironsource.X3.i.W);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("hcd")) {
            jSONArray.put(it.g);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("hsv", com.ironsource.X3.i.W);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("hsv")) {
            jSONArray.put(it.h);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("hcv", com.ironsource.X3.i.W);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("hcv")) {
            jSONArray.put(it.i);
        }
        return jSONArray;
    }
}
