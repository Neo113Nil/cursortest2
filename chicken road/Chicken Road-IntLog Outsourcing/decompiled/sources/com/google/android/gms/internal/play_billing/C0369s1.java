package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.play_billing.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0369s1 extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    public static final C0369s1 f5251b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f5252a = true;

    static {
        C0369s1 c0369s1 = new C0369s1();
        f5251b = c0369s1;
        c0369s1.f5252a = false;
    }

    public static C0369s1 a() {
        return f5251b;
    }

    public static int f(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof X1) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = AbstractC0349l1.f5205a;
        int length = bArr.length;
        for (byte b6 : bArr) {
            length = (length * 31) + b6;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    public final C0369s1 c() {
        if (isEmpty()) {
            return new C0369s1();
        }
        C0369s1 c0369s1 = new C0369s1(this);
        c0369s1.f5252a = true;
        return c0369s1;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        super.clear();
    }

    public final void d() {
        this.f5252a = false;
    }

    public final boolean e() {
        return this.f5252a;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final void g() {
        if (!this.f5252a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i2 = 0;
        for (Map.Entry entry : entrySet()) {
            i2 += f(entry.getValue()) ^ f(entry.getKey());
        }
        return i2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        g();
        Charset charset = AbstractC0349l1.f5205a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        g();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC0349l1.f5205a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        return super.remove(obj);
    }
}
