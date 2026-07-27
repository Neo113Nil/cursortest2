package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.an, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0523an extends U2 {
    public C0523an(int i2, String str) {
        this(i2, str, PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.f7575a;
    }

    public C0523an(int i2, String str, PublicLogger publicLogger) {
        super(i2, str, publicLogger);
    }

    @Override // io.appmetrica.analytics.impl.Nn
    public final String a(String str) {
        if (str != null) {
            int length = str.length();
            int i2 = this.f7575a;
            if (length > i2) {
                String substring = str.substring(0, i2);
                this.f7577c.warning("\"%s\" %s size exceeded limit of %d characters", this.f7576b, str, Integer.valueOf(this.f7575a));
                return substring;
            }
        }
        return str;
    }

    public final String a() {
        return this.f7576b;
    }
}
