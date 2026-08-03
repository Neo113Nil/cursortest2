package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0756v implements io.appmetrica.analytics.impl.InterfaceC0782w {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f6940a;

    public C0756v(android.content.Context context) {
        this.f6940a = context;
    }

    public final java.lang.String a() {
        io.appmetrica.analytics.impl.C0244b4 l2 = io.appmetrica.analytics.impl.C0244b4.l();
        android.content.Context context = this.f6940a;
        io.appmetrica.analytics.impl.M9 m9 = l2.t;
        if (m9 == null) {
            synchronized (l2) {
                try {
                    m9 = l2.t;
                    if (m9 == null) {
                        m9 = new io.appmetrica.analytics.impl.M9(context);
                        l2.t = m9;
                    }
                } finally {
                }
            }
        }
        android.os.Bundle applicationMetaData = m9.f4656d.getApplicationMetaData(m9.f4653a);
        if (applicationMetaData != null) {
            return applicationMetaData.getString("io.appmetrica.analytics.plugin_supported_ad_revenue_sources");
        }
        return null;
    }
}
