package com.chartboost.sdk.impl;

import java.util.function.Supplier;

/* loaded from: classes4.dex */
public class zg implements l7 {

    /* renamed from: a, reason: collision with root package name */
    public final Supplier f5103a;
    public volatile h7 b;
    public volatile boolean c;
    public final Object d = new Object();

    public zg(Supplier supplier) {
        if (supplier == null) {
            throw new NullPointerException("Supplier must not be null");
        }
        this.f5103a = supplier;
    }

    @Override // com.chartboost.sdk.impl.l7
    public h7 a() {
        if (!this.c) {
            synchronized (this.d) {
                if (!this.c) {
                    try {
                        this.b = (h7) this.f5103a.get();
                        if (this.b == null) {
                            mb.b("EventTracker supplier returned null", null);
                        }
                        this.c = true;
                    } catch (Exception e) {
                        mb.b("Failed to obtain EventTracker from supplier", e);
                        return null;
                    }
                }
            }
        }
        return this.b;
    }
}
