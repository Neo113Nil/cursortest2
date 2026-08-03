package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class y1 extends java.util.LinkedHashMap {
    public static final com.fyber.inneractive.sdk.protobuf.y1 b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f4231a;

    static {
        com.fyber.inneractive.sdk.protobuf.y1 y1Var = new com.fyber.inneractive.sdk.protobuf.y1();
        b = y1Var;
        y1Var.f4231a = false;
    }

    public y1() {
        this.f4231a = true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (!this.f4231a) {
            throw new java.lang.UnsupportedOperationException();
        }
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return isEmpty() ? java.util.Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (java.util.Map.Entry entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            java.lang.Object value = entry.getValue();
                            java.lang.Object obj2 = map.get(entry.getKey());
                            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? java.util.Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int hashCode;
        int i = 0;
        for (java.util.Map.Entry entry : entrySet()) {
            java.lang.Object key = entry.getKey();
            int i2 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                java.nio.charset.Charset charset = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
                hashCode = bArr.length;
                for (byte b2 : bArr) {
                    hashCode = (hashCode * 31) + b2;
                }
                if (hashCode == 0) {
                    hashCode = 1;
                }
            } else {
                if (key instanceof com.fyber.inneractive.sdk.protobuf.d1) {
                    throw new java.lang.UnsupportedOperationException();
                }
                hashCode = key.hashCode();
            }
            java.lang.Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                java.nio.charset.Charset charset2 = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
                int length = bArr2.length;
                for (byte b3 : bArr2) {
                    length = (length * 31) + b3;
                }
                if (length != 0) {
                    i2 = length;
                }
            } else {
                if (value instanceof com.fyber.inneractive.sdk.protobuf.d1) {
                    throw new java.lang.UnsupportedOperationException();
                }
                i2 = value.hashCode();
            }
            i += hashCode ^ i2;
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        if (!this.f4231a) {
            throw new java.lang.UnsupportedOperationException();
        }
        java.nio.charset.Charset charset = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        if (!this.f4231a) {
            throw new java.lang.UnsupportedOperationException();
        }
        for (java.lang.Object obj : map.keySet()) {
            java.nio.charset.Charset charset = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        if (this.f4231a) {
            return super.remove(obj);
        }
        throw new java.lang.UnsupportedOperationException();
    }

    public y1(java.util.Map map) {
        super(map);
        this.f4231a = true;
    }
}
