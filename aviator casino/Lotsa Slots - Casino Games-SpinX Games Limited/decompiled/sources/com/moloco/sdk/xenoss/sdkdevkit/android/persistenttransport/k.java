package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

/* loaded from: classes5.dex */
public final class k {
    public static final androidx.work.Data a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            kotlin.Pair[] pairArr = {kotlin.TuplesKt.to("url", str)};
            androidx.work.Data.Builder builder = new androidx.work.Data.Builder();
            kotlin.Pair pair = pairArr[0];
            builder.put((java.lang.String) pair.getFirst(), pair.getSecond());
            androidx.work.Data build = builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "dataBuilder.build()");
            return build;
        } catch (java.lang.Exception e) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.j.d, e.getMessage() + ". Url: " + str, null, false, 12, null);
            return null;
        }
    }
}
