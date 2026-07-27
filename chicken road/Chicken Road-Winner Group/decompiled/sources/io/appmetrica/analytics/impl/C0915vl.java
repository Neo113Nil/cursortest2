package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.vl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0915vl {

    /* renamed from: a, reason: collision with root package name */
    public final Jc f8525a;

    /* renamed from: b, reason: collision with root package name */
    public final Ic f8526b;

    public C0915vl(PublicLogger publicLogger, String str) {
        this(new Jc(str, publicLogger), new Ic(str, publicLogger));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized boolean a(Mc mc, String str, String str2) {
        try {
            int size = mc.size();
            int i3 = this.f8525a.f6153c.f8328a;
            if (size >= i3 && (i3 != mc.size() || !mc.containsKey(str))) {
                Jc jc = this.f8525a;
                jc.f6154d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", jc.f6155e, Integer.valueOf(jc.f6153c.f8328a), str);
                return false;
            }
            this.f8526b.getClass();
            int i4 = mc.f6284a;
            if (str2 != null) {
                i4 += str2.length();
            }
            if (mc.containsKey(str)) {
                String str3 = (String) mc.get(str);
                if (str3 != null) {
                    i4 -= str3.length();
                }
            } else {
                i4 += str.length();
            }
            if (i4 <= 4500) {
                mc.put(str, str2);
                return true;
            }
            Ic ic = this.f8526b;
            ic.f6100b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", ic.f6099a, 4500, str);
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean b(Mc mc, String str, String str2) {
        if (mc == null) {
            return false;
        }
        String a3 = this.f8525a.f6151a.a(str);
        String a4 = this.f8525a.f6152b.a(str2);
        if (!mc.containsKey(a3)) {
            if (a4 != null) {
                return a(mc, a3, a4);
            }
            return false;
        }
        String str3 = (String) mc.get(a3);
        if (a4 == null || !a4.equals(str3)) {
            return a(mc, a3, a4);
        }
        return false;
    }

    public C0915vl(Jc jc, Ic ic) {
        this.f8525a = jc;
        this.f8526b = ic;
    }
}
