package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.o;

/* loaded from: classes.dex */
public final class e extends o {
    public final o.a a = o.a.a;
    public final c b;

    public e(c cVar) {
        this.b = cVar;
    }

    @Override // com.google.android.datatransport.cct.internal.o
    @Nullable
    public final a a() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.internal.o
    @Nullable
    public final o.a b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.a aVar = this.a;
        if (aVar == null) {
            if (oVar.b() != null) {
                return false;
            }
        } else if (!aVar.equals(oVar.b())) {
            return false;
        }
        c cVar = this.b;
        return cVar == null ? oVar.a() == null : cVar.equals(oVar.a());
    }

    public final int hashCode() {
        o.a aVar = this.a;
        int hashCode = ((aVar == null ? 0 : aVar.hashCode()) ^ 1000003) * 1000003;
        c cVar = this.b;
        return (cVar != null ? cVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}
