package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1042v implements InterfaceC1068w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9423a;

    public C1042v(Context context) {
        this.f9423a = context;
    }

    public final String a() {
        C0736j4 l2 = C0736j4.l();
        Context context = this.f9423a;
        T9 t9 = l2.f8501t;
        if (t9 == null) {
            synchronized (l2) {
                try {
                    t9 = l2.f8501t;
                    if (t9 == null) {
                        t9 = new T9(context);
                        l2.f8501t = t9;
                    }
                } finally {
                }
            }
        }
        Bundle applicationMetaData = t9.f7526d.getApplicationMetaData(t9.f7523a);
        if (applicationMetaData != null) {
            return applicationMetaData.getString("io.appmetrica.analytics.plugin_supported_ad_revenue_sources");
        }
        return null;
    }
}
