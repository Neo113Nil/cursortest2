package io.appmetrica.analytics.adrevenue.ironsource.v7.impl;

/* loaded from: classes.dex */
public final class a extends java.util.HashMap {
    public a(java.lang.String str) {
        put(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-ironsource-v7");
        put(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, str == null ? "null" : str);
        put(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.SOURCE_KEY, "ironsource");
    }
}
