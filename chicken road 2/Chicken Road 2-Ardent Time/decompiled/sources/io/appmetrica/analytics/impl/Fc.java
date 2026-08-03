package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Fc extends java.util.HashMap {

    /* renamed from: a, reason: collision with root package name */
    public int f4290a;

    public Fc() {
        this.f4290a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.lang.String put(java.lang.String str, java.lang.String str2) {
        if (!containsKey(str)) {
            if (str2 == null) {
                return null;
            }
            this.f4290a = str2.length() + str.length() + this.f4290a;
            return (java.lang.String) super.put(str, str2);
        }
        if (str2 != null) {
            java.lang.String str3 = (java.lang.String) get(str);
            this.f4290a = (str2.length() - (str3 != null ? str3.length() : 0)) + this.f4290a;
            return (java.lang.String) super.put(str, str2);
        }
        if (containsKey(str)) {
            java.lang.String str4 = (java.lang.String) get(str);
            this.f4290a -= str.length() + (str4 != null ? str4.length() : 0);
        }
        return (java.lang.String) super.remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        if (containsKey(obj)) {
            java.lang.String str = (java.lang.String) get(obj);
            this.f4290a -= ((java.lang.String) obj).length() + (str == null ? 0 : str.length());
        }
        return (java.lang.String) super.remove(obj);
    }

    public Fc(java.lang.String str) {
        super(io.appmetrica.analytics.impl.AbstractC0380gb.d(str));
        this.f4290a = 0;
        for (java.lang.String str2 : keySet()) {
            java.lang.String str3 = (java.lang.String) get(str2);
            this.f4290a = str2.length() + (str3 == null ? 0 : str3.length()) + this.f4290a;
        }
    }
}
