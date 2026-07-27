package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.an, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0374an extends U2 {
    public C0374an(int i3, String str) {
        this(i3, str, PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.f6702a;
    }

    public C0374an(int i3, String str, PublicLogger publicLogger) {
        super(i3, str, publicLogger);
    }

    @Override // io.appmetrica.analytics.impl.Nn
    public final String a(String str) {
        if (str != null) {
            int length = str.length();
            int i3 = this.f6702a;
            if (length > i3) {
                String substring = str.substring(0, i3);
                this.f6704c.warning("\"%s\" %s size exceeded limit of %d characters", this.f6703b, str, Integer.valueOf(this.f6702a));
                return substring;
            }
        }
        return str;
    }

    public final String a() {
        return this.f6703b;
    }
}
