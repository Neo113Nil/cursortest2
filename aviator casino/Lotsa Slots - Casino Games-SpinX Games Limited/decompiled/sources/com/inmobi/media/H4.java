package com.inmobi.media;

/* loaded from: classes5.dex */
public final class H4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.ads.network.common.model.ContextData f4738a;
    public final long b;
    public final java.lang.String c = "H4";
    public final com.inmobi.media.P4 d = new com.inmobi.media.P4();
    public long e = -1;
    public final java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.atomic.AtomicBoolean g = new java.util.concurrent.atomic.AtomicBoolean();

    public H4(com.inmobi.media.ads.network.common.model.ContextData contextData, long j) {
        this.f4738a = contextData;
        this.b = j;
    }

    public final void a() {
        java.lang.String TAG = this.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        toString();
        com.inmobi.media.ads.network.common.model.ContextData contextData = this.f4738a;
        if (contextData != null) {
            com.inmobi.media.O4.f4868a.a(contextData.getEnabled());
        }
        com.inmobi.media.O4 o4 = com.inmobi.media.O4.f4868a;
        if (com.inmobi.media.O4.e() && !this.f.getAndSet(true)) {
            this.e = java.lang.System.currentTimeMillis();
            c();
            d();
            i();
            e();
            a(this.e / 1000);
        }
    }

    public final void b() {
        com.inmobi.media.O4 o4 = com.inmobi.media.O4.f4868a;
        if (!com.inmobi.media.O4.e()) {
            java.lang.String TAG = this.c;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            toString();
            return;
        }
        if (!this.f.get()) {
            java.lang.String TAG2 = this.c;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            toString();
            return;
        }
        a((int) (java.lang.System.currentTimeMillis() - this.e));
        if (this.g.getAndSet(true)) {
            java.lang.String TAG3 = this.c;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            toString();
        } else {
            java.lang.String TAG4 = this.c;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            toString();
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.H4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.H4.a(com.inmobi.media.H4.this);
                }
            };
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
            com.inmobi.media.Xi.g.submit(runnable);
        }
    }

    public final void c() {
        com.inmobi.media.ads.network.common.model.ContextData contextData;
        java.lang.String advertisedContent;
        if (this.g.get() || (contextData = this.f4738a) == null || (advertisedContent = contextData.getAdvertisedContent()) == null) {
            return;
        }
        com.inmobi.media.P4 p4 = this.d;
        p4.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertisedContent, "<set-?>");
        p4.f4887a = advertisedContent;
        java.lang.String TAG = this.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        toString();
    }

    public final void d() {
        com.inmobi.media.ads.network.common.model.ContextData contextData;
        java.lang.Long bidderId;
        if (this.g.get() || (contextData = this.f4738a) == null || (bidderId = contextData.getBidderId()) == null) {
            return;
        }
        this.d.b = bidderId.longValue();
        java.lang.String TAG = this.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        toString();
    }

    public final void e() {
        com.inmobi.media.ads.network.common.model.ContextData contextData;
        if (this.g.get() || (contextData = this.f4738a) == null) {
            return;
        }
        this.d.f = contextData.getCasAdTypeId();
        java.lang.String TAG = this.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        toString();
    }

    public final void f() {
        if (this.g.get()) {
            return;
        }
        this.d.g = 1;
        java.lang.String TAG = this.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        toString();
    }

    public final void g() {
        if (this.g.get()) {
            return;
        }
        this.d.i = 1;
        java.lang.String TAG = this.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        toString();
    }

    public final void h() {
        if (this.g.get()) {
            return;
        }
        this.d.h = 1;
        java.lang.String TAG = this.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        toString();
    }

    public final void i() {
        if (this.g.get()) {
            return;
        }
        this.d.e = this.b;
        java.lang.String TAG = this.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        toString();
    }

    public final void a(long j) {
        if (this.g.get()) {
            return;
        }
        this.d.c = j;
        java.lang.String TAG = this.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        toString();
    }

    public final void a(int i) {
        if (this.g.get()) {
            return;
        }
        this.d.d = i;
        java.lang.String TAG = this.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        toString();
    }

    public static final void a(com.inmobi.media.H4 h4) {
        com.inmobi.media.O4 o4 = com.inmobi.media.O4.f4868a;
        com.inmobi.media.P4 contextualDataModel = h4.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextualDataModel, "contextualDataModel");
        synchronized (o4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("O4", "TAG");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long expiryTime = currentTimeMillis - (com.inmobi.media.O4.c().getContextualData().getExpiryTime() * 1000);
            com.inmobi.media.O4.a(expiryTime, com.inmobi.media.O4.c().getContextualData().getMaxAdRecords() - 1);
            java.lang.String jSONArray = com.inmobi.media.Q4.a(contextualDataModel, com.inmobi.media.O4.c().getContextualData().getSkipFields()).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
            com.inmobi.media.C2267a6 c2267a6 = new com.inmobi.media.C2267a6(com.inmobi.media.AbstractC2293b6.a(jSONArray, com.inmobi.media.O4.e), currentTimeMillis);
            com.inmobi.media.O4.c.add(c2267a6);
            java.lang.Object clone = com.inmobi.media.O4.c.clone();
            kotlin.jvm.internal.Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
            com.inmobi.media.O4.d = (java.util.LinkedList) clone;
            kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.M4(c2267a6, expiryTime, null), 1, null);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
