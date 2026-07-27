package io.appmetrica.analytics.billingv6.impl;

import G0.AbstractC0053c;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0053c f6061a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f6062b = new LinkedHashSet();

    public d(AbstractC0053c abstractC0053c) {
        this.f6061a = abstractC0053c;
    }

    public final void a(Object obj) {
        this.f6062b.remove(obj);
        if (this.f6062b.size() == 0) {
            this.f6061a.a();
        }
    }
}
