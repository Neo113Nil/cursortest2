package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class Vu extends AbstractC1716vv implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final C1589t2 f11964k;

    public Vu(C1589t2 c1589t2) {
        this.f11964k = c1589t2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f11964k.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Vu) {
            return this.f11964k.equals(((Vu) obj).f11964k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11964k.hashCode();
    }

    public final String toString() {
        return this.f11964k.toString();
    }
}
