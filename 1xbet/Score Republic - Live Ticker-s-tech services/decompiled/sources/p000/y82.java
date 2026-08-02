package p000;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class y82 {

    /* JADX INFO: renamed from: a */
    public final Uri f9217a;

    /* JADX INFO: renamed from: b */
    public final i52 f9218b;

    /* JADX INFO: renamed from: c */
    public final cx0 f9219c;

    /* JADX INFO: renamed from: d */
    public final qc0 f9220d;

    public y82(Uri uri, i52 i52Var, cx0 cx0Var, qc0 qc0Var) {
        this.f9217a = uri;
        this.f9218b = i52Var;
        this.f9219c = cx0Var;
        this.f9220d = qc0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y82)) {
            return false;
        }
        y82 y82Var = (y82) obj;
        return this.f9217a.equals(y82Var.f9217a) && this.f9218b.equals(y82Var.f9218b) && this.f9219c.equals(y82Var.f9219c) && this.f9220d.equals(y82Var.f9220d);
    }

    public final int hashCode() {
        return ((((((this.f9220d.hashCode() ^ ((((((this.f9217a.hashCode() ^ 1000003) * 1000003) ^ this.f9218b.hashCode()) * 1000003) ^ this.f9219c.hashCode()) * 1000003)) * 1000003) ^ o31.f5612t.hashCode()) * 1000003) ^ 1231) * 1000003) ^ 1237;
    }

    public final String toString() {
        String string = this.f9217a.toString();
        int length = string.length();
        String string2 = this.f9218b.toString();
        int length2 = string2.length();
        o31 o31Var = o31.f5612t;
        String strValueOf = String.valueOf(this.f9219c);
        String strValueOf2 = String.valueOf(this.f9220d);
        String string3 = o31Var.toString();
        int length3 = strValueOf.length();
        int length4 = strValueOf2.length();
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 10 + length3 + 13 + length4 + 16 + string3.length() + 32 + String.valueOf(true).length() + 22);
        sb.append("ProtoDataStoreConfig{uri=");
        sb.append(string);
        sb.append(", schema=");
        sb.append(string2);
        sb.append(", handler=");
        sb.append(strValueOf);
        sb.append(", migrations=");
        sb.append(strValueOf2);
        return AbstractC0024an.m286i(sb, ", variantConfig=", string3, ", useGeneratedExtensionRegistry=true, enableTracing=false}");
    }
}
