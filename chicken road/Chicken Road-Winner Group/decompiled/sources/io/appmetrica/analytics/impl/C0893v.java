package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0893v implements InterfaceC0919w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8470a;

    public C0893v(Context context) {
        this.f8470a = context;
    }

    public final String a() {
        C0587j4 l3 = C0587j4.l();
        Context context = this.f8470a;
        T9 t9 = l3.f7588t;
        if (t9 == null) {
            synchronized (l3) {
                try {
                    t9 = l3.f7588t;
                    if (t9 == null) {
                        t9 = new T9(context);
                        l3.f7588t = t9;
                    }
                } finally {
                }
            }
        }
        Bundle applicationMetaData = t9.f6655d.getApplicationMetaData(t9.f6652a);
        if (applicationMetaData != null) {
            return applicationMetaData.getString("io.appmetrica.analytics.plugin_supported_ad_revenue_sources");
        }
        return null;
    }
}
