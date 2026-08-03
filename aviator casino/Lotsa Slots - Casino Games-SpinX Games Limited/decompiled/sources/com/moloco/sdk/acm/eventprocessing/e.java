package com.moloco.sdk.acm.eventprocessing;

/* loaded from: classes5.dex */
public final class e {
    public static final androidx.work.Data a(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<this>");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
                arrayList.add(kotlin.TuplesKt.to(entry.getKey(), entry.getValue()));
            }
            kotlin.Pair[] pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
            kotlin.Pair[] pairArr2 = (kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length);
            androidx.work.Data.Builder builder = new androidx.work.Data.Builder();
            for (kotlin.Pair pair : pairArr2) {
                builder.put((java.lang.String) pair.getFirst(), pair.getSecond());
            }
            androidx.work.Data build = builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "dataBuilder.build()");
            return build;
        } catch (java.lang.Exception e) {
            android.util.Log.e("DBPeriodicRequest", e.getMessage() + ". Data: " + map);
            return null;
        }
    }
}
