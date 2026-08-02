package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class i extends s {
    public final h a;

    public i(h hVar) {
        this.a = hVar;
    }

    @Override // com.google.android.datatransport.cct.internal.s
    @Nullable
    public final r a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        h hVar = this.a;
        r a = ((s) obj).a();
        return hVar == null ? a == null : hVar.equals(a);
    }

    public final int hashCode() {
        h hVar = this.a;
        return (hVar == null ? 0 : hVar.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.a + "}";
    }
}
