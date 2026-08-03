package io.appmetrica.analytics.identifiers.impl;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus f3861a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.identifiers.impl.a f3862b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f3863c;

    public c(io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus identifierStatus, io.appmetrica.analytics.identifiers.impl.a aVar, java.lang.String str) {
        this.f3861a = identifierStatus;
        this.f3862b = aVar;
        this.f3863c = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.identifiers.impl.c)) {
            return false;
        }
        io.appmetrica.analytics.identifiers.impl.c cVar = (io.appmetrica.analytics.identifiers.impl.c) obj;
        return this.f3861a == cVar.f3861a && kotlin.jvm.internal.i.a(this.f3862b, cVar.f3862b) && kotlin.jvm.internal.i.a(this.f3863c, cVar.f3863c);
    }

    public final int hashCode() {
        int hashCode = this.f3861a.hashCode() * 31;
        io.appmetrica.analytics.identifiers.impl.a aVar = this.f3862b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        java.lang.String str = this.f3863c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "AdvIdResult(status=" + this.f3861a + ", advIdInfo=" + this.f3862b + ", errorExplanation=" + this.f3863c + ')';
    }

    public /* synthetic */ c(io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus identifierStatus, io.appmetrica.analytics.identifiers.impl.a aVar, java.lang.String str, int i2) {
        this(identifierStatus, (i2 & 2) != 0 ? null : aVar, (i2 & 4) != 0 ? null : str);
    }
}
