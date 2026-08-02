package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class M extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    public static final M f11723b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f11724a = true;

    static {
        M m7 = new M();
        f11723b = m7;
        m7.f11724a = false;
    }

    public static int a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC0888y) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = A.f11702a;
        int length = bArr.length;
        for (byte b7 : bArr) {
            length = (length * 31) + b7;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    public final void b() {
        if (!this.f11724a) {
            throw new UnsupportedOperationException();
        }
    }

    public final M c() {
        if (isEmpty()) {
            return new M();
        }
        M m7 = new M(this);
        m7.f11724a = true;
        return m7;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005d  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z4;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this != map) {
            if (size() == map.size()) {
                for (Map.Entry entry : entrySet()) {
                    if (map.containsKey(entry.getKey())) {
                        Object value = entry.getValue();
                        Object obj2 = map.get(entry.getKey());
                        if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                        }
                    }
                }
            }
            z4 = false;
            return !z4;
        }
        z4 = true;
        if (!z4) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i7 = 0;
        for (Map.Entry entry : entrySet()) {
            i7 += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i7;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        Charset charset = A.f11702a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        b();
        for (Object obj : map.keySet()) {
            Charset charset = A.f11702a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        return super.remove(obj);
    }
}
