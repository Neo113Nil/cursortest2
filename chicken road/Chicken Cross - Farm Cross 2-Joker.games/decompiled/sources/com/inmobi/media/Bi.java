package com.inmobi.media;

import android.content.Context;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Bi implements BillingClientStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fi f6477a;
    public final /* synthetic */ Function1 b;

    public Bi(Function1 function1, Fi fi) {
        this.f6477a = fi;
        this.b = function1;
    }

    public static final void a(Function1 function1, Ai ai) {
        function1.invoke(ai);
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
        this.f6477a.getClass();
        final Function1 function1 = this.b;
        final Fi fi = this.f6477a;
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Bi$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Bi.a(Function1.this, fi);
            }
        };
        Context context = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(BillingResult billingResult) {
        final Ai c4246yi;
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f6477a.getClass();
        String str = "onBillingSetupFinished - " + billingResult;
        if (billingResult.getResponseCode() == 0) {
            c4246yi = C4274zi.f7527a;
        } else {
            int responseCode = billingResult.getResponseCode();
            String debugMessage = billingResult.getDebugMessage();
            Intrinsics.checkNotNullExpressionValue(debugMessage, "getDebugMessage(...)");
            c4246yi = new C4246yi(debugMessage, responseCode);
        }
        final Function1 function1 = this.b;
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Bi$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Bi.a(Function1.this, c4246yi);
            }
        };
        Context context = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
    }

    public static final void a(Function1 function1, Fi fi) {
        fi.getClass();
        function1.invoke(new C4246yi("Billing Service Disconnected", -1));
    }
}
