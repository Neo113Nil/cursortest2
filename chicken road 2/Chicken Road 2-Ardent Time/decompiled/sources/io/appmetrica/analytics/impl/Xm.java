package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Xm extends io.appmetrica.analytics.impl.M2 {
    public Xm(int i2, java.lang.String str) {
        this(i2, str, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.f4635a;
    }

    public Xm(int i2, java.lang.String str, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger) {
        super(i2, str, publicLogger);
    }

    @Override // io.appmetrica.analytics.impl.Ln
    public final java.lang.String a(java.lang.String str) {
        if (str != null) {
            int length = str.length();
            int i2 = this.f4635a;
            if (length > i2) {
                java.lang.String substring = str.substring(0, i2);
                this.f4637c.warning("\"%s\" %s size exceeded limit of %d characters", this.f4636b, str, java.lang.Integer.valueOf(this.f4635a));
                return substring;
            }
        }
        return str;
    }

    public final java.lang.String a() {
        return this.f4636b;
    }
}
