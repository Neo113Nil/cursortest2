package com.google.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f12293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0885t0 f12295c;

    public x0(C0885t0 c0885t0, Comparable comparable, Object obj) {
        this.f12295c = c0885t0;
        this.f12293a = comparable;
        this.f12294b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f12293a.compareTo(((x0) obj).f12293a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f12293a;
        if (comparable == null) {
            zEquals = key == null;
        } else {
            zEquals = comparable.equals(key);
        }
        if (zEquals) {
            Object obj2 = this.f12294b;
            Object value = entry.getValue();
            if (obj2 == null) {
                zEquals2 = value == null;
            } else {
                zEquals2 = obj2.equals(value);
            }
            if (zEquals2) {
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
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f12294b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
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
