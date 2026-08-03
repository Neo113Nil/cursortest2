package com.moloco.sdk.acm.eventprocessing;

/* loaded from: classes5.dex */
public final class b implements com.moloco.sdk.acm.eventprocessing.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.eventprocessing.f f6890a;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6891a;

        static {
            int[] iArr = new int[com.moloco.sdk.acm.db.c.values().length];
            try {
                iArr[com.moloco.sdk.acm.db.c.b.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.acm.db.c.f6877a.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f6891a = iArr;
        }
    }

    public b(com.moloco.sdk.acm.eventprocessing.f dataAgeChecker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataAgeChecker, "dataAgeChecker");
        this.f6890a = dataAgeChecker;
    }

    @Override // com.moloco.sdk.acm.eventprocessing.a
    public com.moloco.sdk.acm.http.d a(java.util.List<com.moloco.sdk.acm.db.b> events) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(events, "events");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.moloco.sdk.acm.db.b bVar : events) {
            if (!this.f6890a.a(bVar)) {
                int i = com.moloco.sdk.acm.eventprocessing.b.a.f6891a[bVar.h().ordinal()];
                if (i == 1) {
                    com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.Builder addAllTags = com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent.newBuilder().setName(bVar.j()).addAllTags(bVar.k());
                    java.lang.Long g = bVar.g();
                    if (g != null) {
                        addAllTags.setCount((int) g.longValue());
                    }
                    com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent build = addAllTags.build();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                    arrayList2.add(build);
                } else {
                    if (i != 2) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.Builder addAllTags2 = com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent.newBuilder().setName(bVar.j()).addAllTags(bVar.k());
                    java.lang.Long g2 = bVar.g();
                    if (g2 != null) {
                        addAllTags2.setElapsedTimeMillis(g2.longValue());
                    }
                    com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent build2 = addAllTags2.build();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
                    arrayList.add(build2);
                }
            }
        }
        return new com.moloco.sdk.acm.http.d(arrayList2, arrayList);
    }
}
