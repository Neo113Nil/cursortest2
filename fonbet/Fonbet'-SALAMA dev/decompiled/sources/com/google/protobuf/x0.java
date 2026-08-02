package com.google.protobuf;

import java.util.Map;

/* loaded from: classes2.dex */
public final class x0 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f12293a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12294b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0929t0 f12295c;

    public x0(C0929t0 c0929t0, Comparable comparable, Object obj) {
        this.f12295c = c0929t0;
        this.f12293a = comparable;
        this.f12294b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f12293a.compareTo(((x0) obj).f12293a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f12293a;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f12294b;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12293a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12294b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f12293a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f12294b;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f12295c.b();
        Object obj2 = this.f12294b;
        this.f12294b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f12293a + "=" + this.f12294b;
    }
}
