package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.p;

/* loaded from: classes.dex */
public final class f extends p {
    public final i a;
    public final p.a b;

    public f(i iVar) {
        p.a aVar = p.a.a;
        this.a = iVar;
        this.b = aVar;
    }

    @Override // com.google.android.datatransport.cct.internal.p
    @Nullable
    public final s a() {
        return this.a;
    }

    @Override // com.google.android.datatransport.cct.internal.p
    @Nullable
    public final p.a b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        i iVar = this.a;
        if (iVar == null) {
            if (pVar.a() != null) {
                return false;
            }
        } else if (!iVar.equals(pVar.a())) {
            return false;
        }
        p.a aVar = this.b;
        return aVar == null ? pVar.b() == null : aVar.equals(pVar.b());
    }

    public final int hashCode() {
        i iVar = this.a;
        int hashCode = ((iVar == null ? 0 : iVar.hashCode()) ^ 1000003) * 1000003;
        p.a aVar = this.b;
        return (aVar != null ? aVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + this.b + "}";
    }
}
