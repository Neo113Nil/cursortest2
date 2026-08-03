package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Um extends io.appmetrica.analytics.impl.M2 {
    public Um(int i2, java.lang.String str) {
        this(i2, str, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.f4635a;
    }

    public Um(int i2, java.lang.String str, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger) {
        super(i2, str, publicLogger);
    }

    public final java.lang.String a() {
        return this.f4636b;
    }

    @Override // io.appmetrica.analytics.impl.Ln
    public final java.lang.String a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            int i2 = this.f4635a;
            if (length <= i2) {
                return str;
            }
            java.lang.String str2 = new java.lang.String(bytes, 0, i2, "UTF-8");
            try {
                this.f4637c.warning("\"%s\" %s exceeded limit of %d bytes", this.f4636b, str, java.lang.Integer.valueOf(this.f4635a));
            } catch (java.io.UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (java.io.UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
