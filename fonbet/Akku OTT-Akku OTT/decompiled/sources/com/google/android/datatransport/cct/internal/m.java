package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.w;

/* loaded from: classes.dex */
public final class m extends w {
    public final w.b a;
    public final w.a b;

    public m(w.b bVar, w.a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    @Override // com.google.android.datatransport.cct.internal.w
    @Nullable
    public final w.a a() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.internal.w
    @Nullable
    public final w.b b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        w.b bVar = this.a;
        if (bVar == null) {
            if (wVar.b() != null) {
                return false;
            }
        } else if (!bVar.equals(wVar.b())) {
            return false;
        }
        w.a aVar = this.b;
        return aVar == null ? wVar.a() == null : aVar.equals(wVar.a());
    }

    public final int hashCode() {
        w.b bVar = this.a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        w.a aVar = this.b;
        return (aVar != null ? aVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
