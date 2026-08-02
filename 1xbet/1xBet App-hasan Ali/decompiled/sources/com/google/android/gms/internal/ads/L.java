package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final String f10289a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10290b;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public L(String str, String str2) {
        this.f10289a = AbstractC1260lo.a(str);
        this.f10290b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && L.class == obj.getClass()) {
            L l5 = (L) obj;
            if (Objects.equals(this.f10289a, l5.f10289a) && Objects.equals(this.f10290b, l5.f10290b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f10290b.hashCode() * 31;
        String str = this.f10289a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
