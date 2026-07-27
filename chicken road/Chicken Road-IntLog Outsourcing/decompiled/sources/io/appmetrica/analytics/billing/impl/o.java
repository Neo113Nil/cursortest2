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
        zVar.f6024a = productInfo.quantity;
        zVar.f6029f = productInfo.priceMicros;
        try {
            str = Currency.getInstance(productInfo.priceCurrency).getCurrencyCode();
        } catch (Throwable unused) {
            str = "";
        }
        Charset charset = B4.a.f287a;
        zVar.f6025b = str.getBytes(charset);
        zVar.f6026c = productInfo.sku.getBytes(charset);
        u uVar = new u();
        uVar.f5990a = productInfo.purchaseOriginalJson.getBytes(charset);
        uVar.f5991b = productInfo.signature.getBytes(charset);
        zVar.f6028e = uVar;
        zVar.f6030g = true;
        zVar.f6031h = 1;
        int i2 = n.f5977a[productInfo.type.ordinal()];
        zVar.f6032i = (i2 == 1 || i2 != 2) ? 1 : 2;
        y yVar = new y();
        yVar.f6013a = productInfo.purchaseToken.getBytes(charset);
        yVar.f6014b = TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        zVar.f6033j = yVar;
        if (productInfo.type == ProductType.SUBS) {
            x xVar = new x();
            xVar.f6006a = productInfo.autoRenewing;
            Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                w wVar = new w();
                wVar.f6003a = period.number;
                int i3 = n.f5978b[period.timeUnit.ordinal()];
                wVar.f6004b = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? 0 : 4 : 3 : 2 : 1;
                xVar.f6007b = wVar;
            }
            v vVar = new v();
            vVar.f5993a = productInfo.introductoryPriceMicros;
            Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                w wVar2 = new w();
                wVar2.f6003a = period2.number;
                int i6 = n.f5978b[period2.timeUnit.ordinal()];
                wVar2.f6004b = i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? 0 : 4 : 3 : 2 : 1;
                vVar.f5994b = wVar2;
            }
            vVar.f5995c = productInfo.introductoryPriceCycles;
            xVar.f6008c = vVar;
            zVar.f6034k = xVar;
        }
        return MessageNano.toByteArray(zVar);
    }
}
