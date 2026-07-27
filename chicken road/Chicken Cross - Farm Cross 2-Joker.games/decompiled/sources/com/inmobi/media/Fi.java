package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryPurchasesParams;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class Fi {

    /* renamed from: a, reason: collision with root package name */
    public Function1 f6561a;
    public BillingClient b;
    public final AtomicInteger c = new AtomicInteger(0);
    public final C4025qi d = new C4025qi();
    public final int e = 2;

    public static final void a(BillingResult billingResult, List list) {
        Intrinsics.checkNotNullParameter(billingResult, "<unused var>");
    }

    public static final void b(BillingResult billingResult, List list) {
        Intrinsics.checkNotNullParameter(billingResult, "<unused var>");
    }

    public static BillingClient b(Context context) {
        try {
            return BillingClient.newBuilder(context).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).setListener(new PurchasesUpdatedListener() { // from class: com.inmobi.media.Fi$$ExternalSyntheticLambda0
                @Override // com.android.billingclient.api.PurchasesUpdatedListener
                public final void onPurchasesUpdated(BillingResult billingResult, List list) {
                    Fi.b(billingResult, list);
                }
            }).build();
        } catch (Exception e) {
            Lazy lazy = Ba.f6473a;
            Ba.a(new C3810j3(e));
            String str = "Caught an unhandled exception: " + e.getMessage();
            return null;
        } catch (NoClassDefFoundError e2) {
            Lazy lazy2 = Ba.f6473a;
            Ba.a(new C3810j3(e2));
            String str2 = "Class Not Found at run time : " + e2.getMessage();
            return null;
        }
    }

    public final void a(Context context, Function1 onComplete) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        try {
            this.f6561a = onComplete;
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            if (string == null) {
                a(new C4109ti((short) 2236), (C4025qi) null);
                return;
            }
            BillingClient billingClient = (BillingClient) a(string).invoke(context);
            if (billingClient == null) {
                a(new C4109ti((short) 2233), (C4025qi) null);
                return;
            }
            this.b = billingClient;
            Function1 onComplete2 = new Function1() { // from class: com.inmobi.media.Fi$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Fi.a(Fi.this, (Ai) obj);
                }
            };
            Intrinsics.checkNotNullParameter(onComplete2, "onComplete");
            BillingClient billingClient2 = this.b;
            if (billingClient2 != null) {
                billingClient2.startConnection(new Bi(onComplete2, this));
            }
        } catch (Exception e) {
            Lazy lazy = Ba.f6473a;
            Ba.a(new C3810j3(e));
            String str = "Caught an unhandled exception: " + e.getMessage();
            a(new C4109ti((short) 2237), (C4025qi) null);
        }
    }

    public static final void b(final Fi fi, final Function1 function1, BillingResult billingResult, List purchasesResult) {
        Intrinsics.checkNotNullParameter(billingResult, "<unused var>");
        Intrinsics.checkNotNullParameter(purchasesResult, "purchasesResult");
        C4025qi c4025qi = fi.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : purchasesResult) {
            Purchase purchase = (Purchase) obj;
            if (purchase.getPurchaseState() == 1 && purchase.isAcknowledged()) {
                arrayList.add(obj);
            }
        }
        c4025qi.f7330a = arrayList.size();
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Fi$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Fi.b(Function1.this, fi);
            }
        };
        Context context = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
    }

    public static final Unit a(final Fi fi, Ai result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof C4246yi) {
            fi.a(new C4081si(String.valueOf(((C4246yi) result).f7505a)), (C4025qi) null);
            return Unit.INSTANCE;
        }
        fi.a(new Function1() { // from class: com.inmobi.media.Fi$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Fi.a(Fi.this, (C4025qi) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void b(Function1 function1, Fi fi) {
        function1.invoke(fi.d);
    }

    public static final Unit a(Fi fi, C4025qi data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (fi.c.incrementAndGet() != fi.e) {
            return Unit.INSTANCE;
        }
        int i = data.f7330a;
        if (i == 0 && data.b == 0) {
            fi.a(new C4109ti((short) 2234), (C4025qi) null);
            return Unit.INSTANCE;
        }
        StringsKt.trimMargin$default("No of In-App Purchases: " + i + "\n                                    | and No of Subscriptions: " + data.b + "\n                                ", null, 1, null);
        fi.a(C4138ui.f7417a, data);
        return Unit.INSTANCE;
    }

    public final Function1 a(String str) {
        if (StringsKt.startsWith$default(str, "6", false, 2, (Object) null)) {
            return new Ci(this);
        }
        if (StringsKt.startsWith$default(str, com.ironsource.Fc.e, false, 2, (Object) null)) {
            return new Di(this);
        }
        String str2 = "Forward compatible Billing Client Version detected: " + str;
        return new Ei(this);
    }

    public final void a(AbstractC4192wi abstractC4192wi, C4025qi c4025qi) {
        AbstractC4219xi.a(abstractC4192wi);
        Function1 function1 = this.f6561a;
        if (function1 != null) {
            function1.invoke(c4025qi);
        }
    }

    public static BillingClient a(Context context) {
        try {
            return BillingClient.newBuilder(context).enablePendingPurchases().setListener(new PurchasesUpdatedListener() { // from class: com.inmobi.media.Fi$$ExternalSyntheticLambda3
                @Override // com.android.billingclient.api.PurchasesUpdatedListener
                public final void onPurchasesUpdated(BillingResult billingResult, List list) {
                    Fi.a(billingResult, list);
                }
            }).build();
        } catch (Exception e) {
            Lazy lazy = Ba.f6473a;
            Ba.a(new C3810j3(e));
            String str = "Caught an unhandled exception: " + e.getMessage();
            return null;
        } catch (NoClassDefFoundError e2) {
            Lazy lazy2 = Ba.f6473a;
            Ba.a(new C3810j3(e2));
            String str2 = "Class Not Found at run time : " + e2.getMessage();
            return null;
        }
    }

    public final void a(final Function1 onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        QueryPurchasesParams.Builder newBuilder = QueryPurchasesParams.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        newBuilder.setProductType("inapp");
        QueryPurchasesParams.Builder newBuilder2 = QueryPurchasesParams.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder(...)");
        newBuilder2.setProductType("subs");
        BillingClient billingClient = this.b;
        if (billingClient != null) {
            billingClient.queryPurchasesAsync(newBuilder.build(), new PurchasesResponseListener() { // from class: com.inmobi.media.Fi$$ExternalSyntheticLambda4
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    Fi.b(Fi.this, onComplete, billingResult, list);
                }
            });
        }
        BillingClient billingClient2 = this.b;
        if (billingClient2 != null) {
            billingClient2.queryPurchasesAsync(newBuilder2.build(), new PurchasesResponseListener() { // from class: com.inmobi.media.Fi$$ExternalSyntheticLambda5
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    Fi.a(Fi.this, onComplete, billingResult, list);
                }
            });
        }
    }

    public static final void a(final Fi fi, final Function1 function1, BillingResult billingResult, List purchasesResult) {
        Intrinsics.checkNotNullParameter(billingResult, "<unused var>");
        Intrinsics.checkNotNullParameter(purchasesResult, "purchasesResult");
        C4025qi c4025qi = fi.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : purchasesResult) {
            Purchase purchase = (Purchase) obj;
            if (purchase.getPurchaseState() == 1 && purchase.isAcknowledged()) {
                arrayList.add(obj);
            }
        }
        c4025qi.b = arrayList.size();
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Fi$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                Fi.a(Function1.this, fi);
            }
        };
        Context context = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
    }

    public static final void a(Function1 function1, Fi fi) {
        function1.invoke(fi.d);
    }
}
