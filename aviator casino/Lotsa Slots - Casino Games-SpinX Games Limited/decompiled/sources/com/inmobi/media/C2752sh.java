package com.inmobi.media;

/* renamed from: com.inmobi.media.sh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2752sh {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.functions.Function1 f5449a;
    public com.android.billingclient.api.BillingClient b;
    public final java.util.concurrent.atomic.AtomicInteger c = new java.util.concurrent.atomic.AtomicInteger(0);
    public final com.inmobi.media.C2410fh d = new com.inmobi.media.C2410fh();
    public final int e = 2;

    public static final void a(com.android.billingclient.api.BillingResult billingResult, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingResult, "<unused var>");
    }

    public static final void b(com.android.billingclient.api.BillingResult billingResult, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingResult, "<unused var>");
    }

    public static com.android.billingclient.api.BillingClient b(android.content.Context context) {
        try {
            return com.android.billingclient.api.BillingClient.newBuilder(context).enablePendingPurchases(com.android.billingclient.api.PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).setListener(new com.android.billingclient.api.PurchasesUpdatedListener() { // from class: com.inmobi.media.sh$$ExternalSyntheticLambda0
                @Override // com.android.billingclient.api.PurchasesUpdatedListener
                public final void onPurchasesUpdated(com.android.billingclient.api.BillingResult billingResult, java.util.List list) {
                    com.inmobi.media.C2752sh.b(billingResult, list);
                }
            }).build();
        } catch (java.lang.Exception e) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.W9.a(new com.inmobi.media.M2(e));
            e.getMessage();
            return null;
        } catch (java.lang.NoClassDefFoundError e2) {
            kotlin.Lazy lazy2 = com.inmobi.media.W9.f5027a;
            com.inmobi.media.W9.a(new com.inmobi.media.M2(e2));
            e2.getMessage();
            return null;
        }
    }

    public final void a(android.content.Context context, kotlin.jvm.functions.Function1 onComplete) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        try {
            this.f5449a = onComplete;
            android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            android.os.Bundle bundle = applicationInfo.metaData;
            java.lang.String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            if (string == null) {
                a(new com.inmobi.media.C2463hh((short) 2236), (com.inmobi.media.C2410fh) null);
                return;
            }
            com.android.billingclient.api.BillingClient billingClient = (com.android.billingclient.api.BillingClient) a(string).invoke(context);
            if (billingClient == null) {
                a(new com.inmobi.media.C2463hh((short) 2233), (com.inmobi.media.C2410fh) null);
                return;
            }
            this.b = billingClient;
            kotlin.jvm.functions.Function1 onComplete2 = new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.sh$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.inmobi.media.C2752sh.a(com.inmobi.media.C2752sh.this, (com.inmobi.media.AbstractC2621nh) obj);
                }
            };
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onComplete2, "onComplete");
            com.android.billingclient.api.BillingClient billingClient2 = this.b;
            if (billingClient2 != null) {
                billingClient2.startConnection(new com.inmobi.media.C2647oh(onComplete2, this));
            }
        } catch (java.lang.Exception e) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.W9.a(new com.inmobi.media.M2(e));
            e.getMessage();
            a(new com.inmobi.media.C2463hh((short) 2237), (com.inmobi.media.C2410fh) null);
        }
    }

    public static final void b(final com.inmobi.media.C2752sh c2752sh, final kotlin.jvm.functions.Function1 function1, com.android.billingclient.api.BillingResult billingResult, java.util.List purchasesResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingResult, "<unused var>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purchasesResult, "purchasesResult");
        com.inmobi.media.C2410fh c2410fh = c2752sh.d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : purchasesResult) {
            com.android.billingclient.api.Purchase purchase = (com.android.billingclient.api.Purchase) obj;
            if (purchase.getPurchaseState() == 1 && purchase.isAcknowledged()) {
                arrayList.add(obj);
            }
        }
        c2410fh.f5202a = arrayList.size();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.sh$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.C2752sh.b(kotlin.jvm.functions.Function1.this, c2752sh);
            }
        };
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.inmobi.media.Xi.g.submit(runnable);
    }

    public static final kotlin.Unit a(final com.inmobi.media.C2752sh c2752sh, com.inmobi.media.AbstractC2621nh result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof com.inmobi.media.C2567lh) {
            c2752sh.a(new com.inmobi.media.C2437gh(java.lang.String.valueOf(((com.inmobi.media.C2567lh) result).f5318a)), (com.inmobi.media.C2410fh) null);
            return kotlin.Unit.INSTANCE;
        }
        c2752sh.a(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.sh$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.C2752sh.a(com.inmobi.media.C2752sh.this, (com.inmobi.media.C2410fh) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static final void b(kotlin.jvm.functions.Function1 function1, com.inmobi.media.C2752sh c2752sh) {
        function1.invoke(c2752sh.d);
    }

    public static final kotlin.Unit a(com.inmobi.media.C2752sh c2752sh, com.inmobi.media.C2410fh data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        if (c2752sh.c.incrementAndGet() != c2752sh.e) {
            return kotlin.Unit.INSTANCE;
        }
        int i = data.f5202a;
        if (i == 0 && data.b == 0) {
            c2752sh.a(new com.inmobi.media.C2463hh((short) 2234), (com.inmobi.media.C2410fh) null);
            return kotlin.Unit.INSTANCE;
        }
        kotlin.text.StringsKt.trimMargin$default("No of In-App Purchases: " + i + "\n                                    | and No of Subscriptions: " + data.b + "\n                                ", null, 1, null);
        c2752sh.a(com.inmobi.media.C2488ih.f5261a, data);
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function1 a(java.lang.String str) {
        if (kotlin.text.StringsKt.startsWith$default(str, "6", false, 2, (java.lang.Object) null)) {
            return new com.inmobi.media.C2674ph(this);
        }
        if (kotlin.text.StringsKt.startsWith$default(str, com.ironsource.Fc.e, false, 2, (java.lang.Object) null)) {
            return new com.inmobi.media.C2700qh(this);
        }
        return new com.inmobi.media.C2725rh(this);
    }

    public final void a(com.inmobi.media.AbstractC2514jh abstractC2514jh, com.inmobi.media.C2410fh c2410fh) {
        com.inmobi.media.AbstractC2540kh.a(abstractC2514jh);
        kotlin.jvm.functions.Function1 function1 = this.f5449a;
        if (function1 != null) {
            function1.invoke(c2410fh);
        }
    }

    public static com.android.billingclient.api.BillingClient a(android.content.Context context) {
        try {
            return com.android.billingclient.api.BillingClient.newBuilder(context).enablePendingPurchases().setListener(new com.android.billingclient.api.PurchasesUpdatedListener() { // from class: com.inmobi.media.sh$$ExternalSyntheticLambda5
                @Override // com.android.billingclient.api.PurchasesUpdatedListener
                public final void onPurchasesUpdated(com.android.billingclient.api.BillingResult billingResult, java.util.List list) {
                    com.inmobi.media.C2752sh.a(billingResult, list);
                }
            }).build();
        } catch (java.lang.Exception e) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.W9.a(new com.inmobi.media.M2(e));
            e.getMessage();
            return null;
        } catch (java.lang.NoClassDefFoundError e2) {
            kotlin.Lazy lazy2 = com.inmobi.media.W9.f5027a;
            com.inmobi.media.W9.a(new com.inmobi.media.M2(e2));
            e2.getMessage();
            return null;
        }
    }

    public final void a(final kotlin.jvm.functions.Function1 onComplete) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        com.android.billingclient.api.QueryPurchasesParams.Builder newBuilder = com.android.billingclient.api.QueryPurchasesParams.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        newBuilder.setProductType("inapp");
        com.android.billingclient.api.QueryPurchasesParams.Builder newBuilder2 = com.android.billingclient.api.QueryPurchasesParams.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder(...)");
        newBuilder2.setProductType("subs");
        com.android.billingclient.api.BillingClient billingClient = this.b;
        if (billingClient != null) {
            billingClient.queryPurchasesAsync(newBuilder.build(), new com.android.billingclient.api.PurchasesResponseListener() { // from class: com.inmobi.media.sh$$ExternalSyntheticLambda3
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(com.android.billingclient.api.BillingResult billingResult, java.util.List list) {
                    com.inmobi.media.C2752sh.b(com.inmobi.media.C2752sh.this, onComplete, billingResult, list);
                }
            });
        }
        com.android.billingclient.api.BillingClient billingClient2 = this.b;
        if (billingClient2 != null) {
            billingClient2.queryPurchasesAsync(newBuilder2.build(), new com.android.billingclient.api.PurchasesResponseListener() { // from class: com.inmobi.media.sh$$ExternalSyntheticLambda4
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(com.android.billingclient.api.BillingResult billingResult, java.util.List list) {
                    com.inmobi.media.C2752sh.a(com.inmobi.media.C2752sh.this, onComplete, billingResult, list);
                }
            });
        }
    }

    public static final void a(final com.inmobi.media.C2752sh c2752sh, final kotlin.jvm.functions.Function1 function1, com.android.billingclient.api.BillingResult billingResult, java.util.List purchasesResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingResult, "<unused var>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purchasesResult, "purchasesResult");
        com.inmobi.media.C2410fh c2410fh = c2752sh.d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : purchasesResult) {
            com.android.billingclient.api.Purchase purchase = (com.android.billingclient.api.Purchase) obj;
            if (purchase.getPurchaseState() == 1 && purchase.isAcknowledged()) {
                arrayList.add(obj);
            }
        }
        c2410fh.b = arrayList.size();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.sh$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.C2752sh.a(kotlin.jvm.functions.Function1.this, c2752sh);
            }
        };
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.inmobi.media.Xi.g.submit(runnable);
    }

    public static final void a(kotlin.jvm.functions.Function1 function1, com.inmobi.media.C2752sh c2752sh) {
        function1.invoke(c2752sh.d);
    }
}
