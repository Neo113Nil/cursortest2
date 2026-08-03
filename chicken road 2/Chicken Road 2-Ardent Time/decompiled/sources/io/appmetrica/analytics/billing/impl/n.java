package io.appmetrica.analytics.billing.impl;

/* loaded from: classes.dex */
public abstract /* synthetic */ class n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3474a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f3475b;

    static {
        int[] iArr = new int[io.appmetrica.analytics.billinginterface.internal.ProductType.values().length];
        iArr[io.appmetrica.analytics.billinginterface.internal.ProductType.INAPP.ordinal()] = 1;
        iArr[io.appmetrica.analytics.billinginterface.internal.ProductType.SUBS.ordinal()] = 2;
        f3474a = iArr;
        int[] iArr2 = new int[io.appmetrica.analytics.billinginterface.internal.Period.TimeUnit.values().length];
        iArr2[io.appmetrica.analytics.billinginterface.internal.Period.TimeUnit.DAY.ordinal()] = 1;
        iArr2[io.appmetrica.analytics.billinginterface.internal.Period.TimeUnit.WEEK.ordinal()] = 2;
        iArr2[io.appmetrica.analytics.billinginterface.internal.Period.TimeUnit.MONTH.ordinal()] = 3;
        iArr2[io.appmetrica.analytics.billinginterface.internal.Period.TimeUnit.YEAR.ordinal()] = 4;
        f3475b = iArr2;
    }
}
