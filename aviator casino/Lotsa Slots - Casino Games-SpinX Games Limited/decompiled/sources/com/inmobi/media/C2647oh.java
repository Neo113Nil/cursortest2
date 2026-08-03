package com.inmobi.media;

/* renamed from: com.inmobi.media.oh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2647oh implements com.android.billingclient.api.BillingClientStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2752sh f5376a;
    public final /* synthetic */ kotlin.jvm.functions.Function1 b;

    public C2647oh(kotlin.jvm.functions.Function1 function1, com.inmobi.media.C2752sh c2752sh) {
        this.f5376a = c2752sh;
        this.b = function1;
    }

    public static final void a(kotlin.jvm.functions.Function1 function1, com.inmobi.media.AbstractC2621nh abstractC2621nh) {
        function1.invoke(abstractC2621nh);
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
        this.f5376a.getClass();
        final kotlin.jvm.functions.Function1 function1 = this.b;
        final com.inmobi.media.C2752sh c2752sh = this.f5376a;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.oh$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.C2647oh.a(kotlin.jvm.functions.Function1.this, c2752sh);
            }
        };
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.inmobi.media.Xi.g.submit(runnable);
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(com.android.billingclient.api.BillingResult billingResult) {
        final com.inmobi.media.AbstractC2621nh c2567lh;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f5376a.getClass();
        java.util.Objects.toString(billingResult);
        if (billingResult.getResponseCode() == 0) {
            c2567lh = com.inmobi.media.C2593mh.f5338a;
        } else {
            int responseCode = billingResult.getResponseCode();
            java.lang.String debugMessage = billingResult.getDebugMessage();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(debugMessage, "getDebugMessage(...)");
            c2567lh = new com.inmobi.media.C2567lh(debugMessage, responseCode);
        }
        final kotlin.jvm.functions.Function1 function1 = this.b;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.oh$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.C2647oh.a(kotlin.jvm.functions.Function1.this, c2567lh);
            }
        };
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.inmobi.media.Xi.g.submit(runnable);
    }

    public static final void a(kotlin.jvm.functions.Function1 function1, com.inmobi.media.C2752sh c2752sh) {
        c2752sh.getClass();
        function1.invoke(new com.inmobi.media.C2567lh("Billing Service Disconnected", -1));
    }
}
