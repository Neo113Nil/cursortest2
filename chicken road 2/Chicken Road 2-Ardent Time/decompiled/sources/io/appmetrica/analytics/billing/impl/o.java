package io.appmetrica.analytics.billing.impl;

/* loaded from: classes.dex */
public final class o {
    public static byte[] a(io.appmetrica.analytics.billinginterface.internal.ProductInfo productInfo) {
        java.lang.String str;
        io.appmetrica.analytics.billing.impl.z zVar = new io.appmetrica.analytics.billing.impl.z();
        zVar.f3521a = productInfo.quantity;
        zVar.f3526f = productInfo.priceMicros;
        try {
            str = java.util.Currency.getInstance(productInfo.priceCurrency).getCurrencyCode();
        } catch (java.lang.Throwable unused) {
            str = "";
        }
        java.nio.charset.Charset charset = y1.a.f8486a;
        zVar.f3522b = str.getBytes(charset);
        zVar.f3523c = productInfo.sku.getBytes(charset);
        io.appmetrica.analytics.billing.impl.u uVar = new io.appmetrica.analytics.billing.impl.u();
        uVar.f3487a = productInfo.purchaseOriginalJson.getBytes(charset);
        uVar.f3488b = productInfo.signature.getBytes(charset);
        zVar.f3525e = uVar;
        zVar.f3527g = true;
        zVar.f3528h = 1;
        int i2 = io.appmetrica.analytics.billing.impl.n.f3474a[productInfo.type.ordinal()];
        zVar.f3529i = (i2 == 1 || i2 != 2) ? 1 : 2;
        io.appmetrica.analytics.billing.impl.y yVar = new io.appmetrica.analytics.billing.impl.y();
        yVar.f3510a = productInfo.purchaseToken.getBytes(charset);
        yVar.f3511b = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        zVar.f3530j = yVar;
        if (productInfo.type == io.appmetrica.analytics.billinginterface.internal.ProductType.SUBS) {
            io.appmetrica.analytics.billing.impl.x xVar = new io.appmetrica.analytics.billing.impl.x();
            xVar.f3503a = productInfo.autoRenewing;
            io.appmetrica.analytics.billinginterface.internal.Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                io.appmetrica.analytics.billing.impl.w wVar = new io.appmetrica.analytics.billing.impl.w();
                wVar.f3500a = period.number;
                int i3 = io.appmetrica.analytics.billing.impl.n.f3475b[period.timeUnit.ordinal()];
                wVar.f3501b = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? 0 : 4 : 3 : 2 : 1;
                xVar.f3504b = wVar;
            }
            io.appmetrica.analytics.billing.impl.v vVar = new io.appmetrica.analytics.billing.impl.v();
            vVar.f3490a = productInfo.introductoryPriceMicros;
            io.appmetrica.analytics.billinginterface.internal.Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                io.appmetrica.analytics.billing.impl.w wVar2 = new io.appmetrica.analytics.billing.impl.w();
                wVar2.f3500a = period2.number;
                int i4 = io.appmetrica.analytics.billing.impl.n.f3475b[period2.timeUnit.ordinal()];
                wVar2.f3501b = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? 0 : 4 : 3 : 2 : 1;
                vVar.f3491b = wVar2;
            }
            vVar.f3492c = productInfo.introductoryPriceCycles;
            xVar.f3505c = vVar;
            zVar.f3531k = xVar;
        }
        return io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(zVar);
    }
}
