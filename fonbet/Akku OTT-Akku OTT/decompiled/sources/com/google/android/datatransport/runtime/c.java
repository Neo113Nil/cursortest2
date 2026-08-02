package com.google.android.datatransport.runtime;

/* loaded from: classes.dex */
public final class c extends m {
    public final d a;
    public final String b;
    public final com.google.android.datatransport.a c;
    public final com.google.android.datatransport.g<?, byte[]> d;
    public final com.google.android.datatransport.c e;

    public c(d dVar, String str, com.google.android.datatransport.a aVar, com.google.android.datatransport.g gVar, com.google.android.datatransport.c cVar) {
        this.a = dVar;
        this.b = str;
        this.c = aVar;
        this.d = gVar;
        this.e = cVar;
    }

    @Override // com.google.android.datatransport.runtime.m
    public final com.google.android.datatransport.c a() {
        return this.e;
    }

    @Override // com.google.android.datatransport.runtime.m
    public final com.google.android.datatransport.d<?> b() {
        return this.c;
    }

    @Override // com.google.android.datatransport.runtime.m
    public final com.google.android.datatransport.g<?, byte[]> c() {
        return this.d;
    }

    @Override // com.google.android.datatransport.runtime.m
    public final n d() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.m
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a.equals(mVar.d()) && this.b.equals(mVar.e()) && this.c.equals(mVar.b()) && this.d.equals(mVar.c()) && this.e.equals(mVar.a());
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }
}
