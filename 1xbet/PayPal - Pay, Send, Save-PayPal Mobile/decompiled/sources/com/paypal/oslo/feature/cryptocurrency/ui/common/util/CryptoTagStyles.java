package com.paypal.oslo.feature.cryptocurrency.ui.common.util;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/util/CryptoTagStyles;", "", "<init>", "()V", "", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/util/TagStyle;", "DEFAULT", "Ljava/util/Map;", "getDEFAULT", "()Ljava/util/Map;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoTagStyles {
    public static final com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoTagStyles INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoTagStyles();
    private static final java.util.Map<java.lang.String, com.paypal.oslo.feature.cryptocurrency.ui.common.util.TagStyle> DEFAULT = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("rate", new com.paypal.oslo.feature.cryptocurrency.ui.common.util.TagStyle(com.paypal.pds.core.Color.ContentRoleBaseInfo.INSTANCE, false)), kotlin.TuplesKt.to("amount", new com.paypal.oslo.feature.cryptocurrency.ui.common.util.TagStyle(com.paypal.pds.core.Color.ContentRoleBaseInfo.INSTANCE, false)));
    public static final int $stable = 8;

    private CryptoTagStyles() {
    }

    public final java.util.Map<java.lang.String, com.paypal.oslo.feature.cryptocurrency.ui.common.util.TagStyle> getDEFAULT() {
        return DEFAULT;
    }
}
