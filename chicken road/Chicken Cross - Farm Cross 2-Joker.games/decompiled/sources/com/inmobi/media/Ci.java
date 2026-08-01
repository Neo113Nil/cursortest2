package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class Ci extends FunctionReferenceImpl implements Function1 {
    public Ci(Fi fi) {
        super(1, fi, Fi.class, "instantiateBillingClientV6", "instantiateBillingClientV6(Landroid/content/Context;)Lcom/android/billingclient/api/BillingClient;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context p0 = (Context) obj;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((Fi) this.receiver).getClass();
        return Fi.a(p0);
    }
}
