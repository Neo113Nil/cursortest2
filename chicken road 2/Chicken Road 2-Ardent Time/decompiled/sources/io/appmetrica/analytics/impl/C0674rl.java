package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.rl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0674rl {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Cc f6754a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Bc f6755b;

    public C0674rl(io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger, java.lang.String str) {
        this(new io.appmetrica.analytics.impl.Cc(str, publicLogger), new io.appmetrica.analytics.impl.Bc(str, publicLogger));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized boolean a(io.appmetrica.analytics.impl.Fc fc, java.lang.String str, java.lang.String str2) {
        try {
            int size = fc.size();
            int i2 = this.f6754a.f4168c.f6388a;
            if (size >= i2 && (i2 != fc.size() || !fc.containsKey(str))) {
                io.appmetrica.analytics.impl.Cc cc = this.f6754a;
                cc.f4169d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", cc.f4170e, java.lang.Integer.valueOf(cc.f4168c.f6388a), str);
                return false;
            }
            this.f6755b.getClass();
            int i3 = fc.f4290a;
            if (str2 != null) {
                i3 += str2.length();
            }
            if (fc.containsKey(str)) {
                java.lang.String str3 = (java.lang.String) fc.get(str);
                if (str3 != null) {
                    i3 -= str3.length();
                }
            } else {
                i3 += str.length();
            }
            if (i3 <= 4500) {
                fc.put(str, str2);
                return true;
            }
            io.appmetrica.analytics.impl.Bc bc = this.f6755b;
            bc.f4114b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", bc.f4113a, 4500, str);
            return false;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final boolean b(io.appmetrica.analytics.impl.Fc fc, java.lang.String str, java.lang.String str2) {
        if (fc == null) {
            return false;
        }
        java.lang.String a2 = this.f6754a.f4166a.a(str);
        java.lang.String a3 = this.f6754a.f4167b.a(str2);
        if (!fc.containsKey(a2)) {
            if (a3 != null) {
                return a(fc, a2, a3);
            }
            return false;
        }
        java.lang.String str3 = (java.lang.String) fc.get(a2);
        if (a3 == null || !a3.equals(str3)) {
            return a(fc, a2, a3);
        }
        return false;
    }

    public C0674rl(io.appmetrica.analytics.impl.Cc cc, io.appmetrica.analytics.impl.Bc bc) {
        this.f6754a = cc;
        this.f6755b = bc;
    }
}
