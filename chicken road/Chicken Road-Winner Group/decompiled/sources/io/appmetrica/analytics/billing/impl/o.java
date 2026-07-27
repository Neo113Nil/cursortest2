package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o {
    public static byte[] a(ProductInfo productInfo) {
        String str;
        z zVar = new z();
        zVar.f5215a = productInfo.quantity;
        zVar.f = productInfo.priceMicros;
        try {
            str = Currency.getInstance(productInfo.priceCurrency).getCurrencyCode();
        } catch (Throwable unused) {
            str = "";
        }
        Charset charset = v2.a.f10417a;
        zVar.f5216b = str.getBytes(charset);
        zVar.f5217c = productInfo.sku.getBytes(charset);
        u uVar = new u();
        uVar.f5183a = productInfo.purchaseOriginalJson.getBytes(charset);
        uVar.f5184b = productInfo.signature.getBytes(charset);
        zVar.f5219e = uVar;
        zVar.f5220g = true;
        zVar.f5221h = 1;
        int i3 = n.f5170a[productInfo.type.ordinal()];
        zVar.f5222i = (i3 == 1 || i3 != 2) ? 1 : 2;
        y yVar = new y();
        yVar.f5204a = productInfo.purchaseToken.getBytes(charset);
        yVar.f5205b = TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        zVar.f5223j = yVar;
        if (productInfo.type == ProductType.SUBS) {
            x xVar = new x();
            xVar.f5198a = productInfo.autoRenewing;
            Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                w wVar = new w();
                wVar.f5195a = period.number;
                int i4 = n.f5171b[period.timeUnit.ordinal()];
                wVar.f5196b = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? 0 : 4 : 3 : 2 : 1;
                xVar.f5199b = wVar;
            }
            v vVar = new v();
            vVar.f5186a = productInfo.introductoryPriceMicros;
            Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                w wVar2 = new w();
                wVar2.f5195a = period2.number;
                int i5 = n.f5171b[period2.timeUnit.ordinal()];
                wVar2.f5196b = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? 0 : 4 : 3 : 2 : 1;
                vVar.f5187b = wVar2;
            }
            vVar.f5188c = productInfo.introductoryPriceCycles;
            xVar.f5200c = vVar;
            zVar.f5224k = xVar;
        }
        return MessageNano.toByteArray(zVar);
    }
}
