package io.appmetrica.analytics.billingv8.impl;

import java.util.LinkedHashSet;
import m0.AbstractC1115c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1115c f5299a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f5300b = new LinkedHashSet();

    public d(AbstractC1115c abstractC1115c) {
        this.f5299a = abstractC1115c;
    }

    public final void a(Object obj) {
        this.f5300b.remove(obj);
        if (this.f5300b.size() == 0) {
            this.f5299a.a();
        }
    }
}
