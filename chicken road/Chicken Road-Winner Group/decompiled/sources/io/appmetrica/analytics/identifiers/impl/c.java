package io.appmetrica.analytics.identifiers.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final IdentifierStatus f5540a;

    /* renamed from: b, reason: collision with root package name */
    public final a f5541b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5542c;

    public c(IdentifierStatus identifierStatus, a aVar, String str) {
        this.f5540a = identifierStatus;
        this.f5541b = aVar;
        this.f5542c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f5540a == cVar.f5540a && kotlin.jvm.internal.j.a(this.f5541b, cVar.f5541b) && kotlin.jvm.internal.j.a(this.f5542c, cVar.f5542c);
    }

    public final int hashCode() {
        int hashCode = this.f5540a.hashCode() * 31;
        a aVar = this.f5541b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f5542c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdResult(status=" + this.f5540a + ", advIdInfo=" + this.f5541b + ", errorExplanation=" + this.f5542c + ')';
    }

    public /* synthetic */ c(IdentifierStatus identifierStatus, a aVar, String str, int i3) {
        this(identifierStatus, (i3 & 2) != 0 ? null : aVar, (i3 & 4) != 0 ? null : str);
    }
}
