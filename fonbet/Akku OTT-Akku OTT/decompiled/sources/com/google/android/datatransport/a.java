package com.google.android.datatransport;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class a<T> extends d<T> {
    public final T a;
    public final e b;
    public final f c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Object obj, e eVar, @Nullable b bVar) {
        if (obj == 0) {
            throw new NullPointerException("Null payload");
        }
        this.a = obj;
        this.b = eVar;
        this.c = bVar;
    }

    @Override // com.google.android.datatransport.d
    @Nullable
    public final Integer a() {
        return null;
    }

    @Override // com.google.android.datatransport.d
    public final T b() {
        return this.a;
    }

    @Override // com.google.android.datatransport.d
    public final e c() {
        return this.b;
    }

    @Override // com.google.android.datatransport.d
    @Nullable
    public final f d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.a() != null || !this.a.equals(dVar.b()) || !this.b.equals(dVar.c())) {
            return false;
        }
        f fVar = this.c;
        return fVar == null ? dVar.d() == null : fVar.equals(dVar.d());
    }

    public final int hashCode() {
        int hashCode = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        f fVar = this.c;
        return (hashCode ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + ", productData=" + this.c + ", eventContext=null}";
    }
}
