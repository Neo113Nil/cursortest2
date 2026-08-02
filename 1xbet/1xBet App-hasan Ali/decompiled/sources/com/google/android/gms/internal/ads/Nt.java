package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.content.Context;
import android.content.SharedPreferences;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class Nt {

    /* renamed from: h, reason: collision with root package name */
    public static final String f10856h = new UUID(0, 0).toString();

    /* renamed from: a, reason: collision with root package name */
    public final String f10857a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10858b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10859c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10860d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10861e;
    public final C1667ur f;

    /* renamed from: g, reason: collision with root package name */
    public final Mt f10862g;

    public Nt(Context context, String str, String str2, String str3) {
        if (C1667ur.f15912n == null) {
            C1667ur.f15912n = new C1667ur(context, 4);
        }
        this.f = C1667ur.f15912n;
        this.f10862g = Mt.b(context);
        this.f10857a = str;
        this.f10858b = str.concat("_3p");
        this.f10859c = str2;
        this.f10860d = str2.concat("_3p");
        this.f10861e = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final E4.a a(String str, String str2, long j5, boolean z3) {
        long currentTimeMillis;
        String str3 = this.f10858b;
        C1667ur c1667ur = this.f;
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(f10856h)) {
                    String string = ((SharedPreferences) c1667ur.f15915m).getString(str3, null);
                    String string2 = ((SharedPreferences) c1667ur.f15915m).getString("paid_3p_hash_key", null);
                    if (string != null && string2 != null) {
                        if (!string.equals(e(str, str2, string2))) {
                            return b(str, str2);
                        }
                        boolean z5 = str == null;
                        currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis >= 0) {
                            throw new IllegalStateException(this.f10861e.concat(": Invalid negative current timestamp. Updating PAID failed"));
                        }
                        String str4 = this.f10859c;
                        String str5 = this.f10860d;
                        long j6 = ((SharedPreferences) c1667ur.f15915m).getLong(z5 ? str5 : str4, -1L);
                        if (j6 != -1) {
                            if (currentTimeMillis < j6) {
                                c1667ur.g(z5 ? str5 : str4, Long.valueOf(currentTimeMillis));
                            } else if (currentTimeMillis >= j6 + j5) {
                                return b(str, str2);
                            }
                        }
                        if (!z5) {
                            str3 = this.f10857a;
                        }
                        String string3 = ((SharedPreferences) c1667ur.f15915m).getString(str3, null);
                        if (string3 == null && !z3) {
                            return b(str, str2);
                        }
                        if (z5) {
                            str4 = str5;
                        }
                        return new E4.a(string3, ((SharedPreferences) c1667ur.f15915m).getLong(str4, -1L));
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new E4.a(7);
        }
        if (str == null) {
        }
        currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
        }
    }

    public final E4.a b(String str, String str2) {
        if (str == null) {
            return c(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.f.g("paid_3p_hash_key", uuid);
        return c(e(str, str2, uuid), true);
    }

    public final E4.a c(String str, boolean z3) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.f10861e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        String str2 = z3 ? this.f10860d : this.f10859c;
        Long valueOf = Long.valueOf(currentTimeMillis);
        C1667ur c1667ur = this.f;
        c1667ur.g(str2, valueOf);
        c1667ur.g(z3 ? this.f10858b : this.f10857a, str);
        return new E4.a(str, currentTimeMillis);
    }

    public final void d(boolean z3) {
        String str = z3 ? this.f10860d : this.f10859c;
        C1667ur c1667ur = this.f;
        c1667ur.h(str);
        c1667ur.h(z3 ? this.f10858b : this.f10857a);
    }

    public final String e(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(AbstractC0467k.v(str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10861e);
        sb.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb.append(str2 == null ? "null" : "not null");
        sb.append(", hashKey is ");
        sb.append(str3 == null ? "null" : "not null");
        throw new IllegalArgumentException(sb.toString());
    }
}
