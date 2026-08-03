package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

/* loaded from: classes5.dex */
public final class j implements com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.j.a c = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.j.a(null);
    public static final java.lang.String d = "PersistentHttpRequest";
    public static final java.lang.String e = "contentEncoding";
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public j(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l worker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(worker, "worker");
        this.b = worker;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d
    public void a(java.lang.String url) {
        androidx.work.Data a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        if (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.a(url) && (a2 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k.a(url)) != null) {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, d, "Enqueuing request to " + url, null, false, 12, null);
            this.b.a(new androidx.work.OneTimeWorkRequest.Builder(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlGetRequestWorker.class).setConstraints(new androidx.work.Constraints.Builder().setRequiredNetworkType(androidx.work.NetworkType.CONNECTED).build()).setBackoffCriteria(androidx.work.BackoffPolicy.LINEAR, 10000L, java.util.concurrent.TimeUnit.MILLISECONDS).setInputData(a2).build());
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d
    public void a(java.lang.String url, byte[] body, io.ktor.http.ContentType contentType, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
        if (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.a(url)) {
            try {
                kotlin.Pair[] pairArr = {kotlin.TuplesKt.to("url", url), kotlin.TuplesKt.to("body", body), kotlin.TuplesKt.to(com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, contentType.toString()), kotlin.TuplesKt.to(e, str)};
                androidx.work.Data.Builder builder = new androidx.work.Data.Builder();
                for (int i = 0; i < 4; i++) {
                    kotlin.Pair pair = pairArr[i];
                    builder.put((java.lang.String) pair.getFirst(), pair.getSecond());
                }
                androidx.work.Data build = builder.build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "dataBuilder.build()");
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, d, "Enqueuing request to " + url, null, false, 12, null);
                this.b.a(new androidx.work.OneTimeWorkRequest.Builder(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlPostRequestWorker.class).setConstraints(new androidx.work.Constraints.Builder().setRequiredNetworkType(androidx.work.NetworkType.CONNECTED).build()).setBackoffCriteria(androidx.work.BackoffPolicy.LINEAR, 10000L, java.util.concurrent.TimeUnit.MILLISECONDS).setInputData(build).build());
            } catch (java.lang.Exception e2) {
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, d, "Failed to enqueue persistent request for url: " + url, e2, false, 8, null);
            }
        }
    }

    public final /* synthetic */ <W extends androidx.work.ListenableWorker> androidx.work.OneTimeWorkRequest a(androidx.work.Data data) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST);
        return new androidx.work.OneTimeWorkRequest.Builder(androidx.work.ListenableWorker.class).setConstraints(new androidx.work.Constraints.Builder().setRequiredNetworkType(androidx.work.NetworkType.CONNECTED).build()).setBackoffCriteria(androidx.work.BackoffPolicy.LINEAR, 10000L, java.util.concurrent.TimeUnit.MILLISECONDS).setInputData(data).build();
    }
}
