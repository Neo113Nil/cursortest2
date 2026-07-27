package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class Mc extends HashMap {

    /* renamed from: a, reason: collision with root package name */
    public int f7140a;

    public Mc() {
        this.f7140a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String put(String str, String str2) {
        if (!containsKey(str)) {
            if (str2 == null) {
                return null;
            }
            this.f7140a = str2.length() + str.length() + this.f7140a;
            return (String) super.put(str, str2);
        }
        if (str2 != null) {
            String str3 = (String) get(str);
            this.f7140a = (str2.length() - (str3 != null ? str3.length() : 0)) + this.f7140a;
            return (String) super.put(str, str2);
        }
        if (containsKey(str)) {
            String str4 = (String) get(str);
            this.f7140a -= str.length() + (str4 != null ? str4.length() : 0);
        }
        return (String) super.remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (containsKey(obj)) {
            String str = (String) get(obj);
            this.f7140a -= ((String) obj).length() + (str == null ? 0 : str.length());
        }
        return (String) super.remove(obj);
    }

    public Mc(String str) {
        super(AbstractC0847nb.d(str));
        this.f7140a = 0;
        for (String str2 : keySet()) {
            String str3 = (String) get(str2);
            this.f7140a = str2.length() + (str3 == null ? 0 : str3.length()) + this.f7140a;
        }
    }
}
