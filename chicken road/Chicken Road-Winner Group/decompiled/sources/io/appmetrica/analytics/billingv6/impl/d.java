package io.appmetrica.analytics.billingv6.impl;

import java.util.LinkedHashSet;
import m0.AbstractC1115c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1115c f5250a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f5251b = new LinkedHashSet();

    public d(AbstractC1115c abstractC1115c) {
        this.f5250a = abstractC1115c;
    }

    public final void a(Object obj) {
        this.f5251b.remove(obj);
        if (this.f5251b.size() == 0) {
            this.f5250a.a();
        }
    }
}
