package com.google.android.gms.internal.ads;

import android.app.Activity;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class Wm {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f12078a;

    /* renamed from: b, reason: collision with root package name */
    public final S2.d f12079b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12080c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12081d;

    public Wm(Activity activity, S2.d dVar, String str, String str2) {
        this.f12078a = activity;
        this.f12079b = dVar;
        this.f12080c = str;
        this.f12081d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Wm) {
            Wm wm = (Wm) obj;
            if (this.f12078a.equals(wm.f12078a)) {
                S2.d dVar = wm.f12079b;
                S2.d dVar2 = this.f12079b;
                if (dVar2 != null ? dVar2.equals(dVar) : dVar == null) {
                    String str = wm.f12080c;
                    String str2 = this.f12080c;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        String str3 = wm.f12081d;
                        String str4 = this.f12081d;
                        if (str4 != null ? str4.equals(str3) : str3 == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f12078a.hashCode() ^ 1000003;
        S2.d dVar = this.f12079b;
        int hashCode2 = ((hashCode * 1000003) ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        String str = this.f12080c;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f12081d;
        return hashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String obj = this.f12078a.toString();
        String valueOf = String.valueOf(this.f12079b);
        StringBuilder sb = new StringBuilder("OfflineUtilsParams{activity=");
        sb.append(obj);
        sb.append(", adOverlay=");
        sb.append(valueOf);
        sb.append(", gwsQueryId=");
        sb.append(this.f12080c);
        sb.append(", uri=");
        return AbstractC2107A.u(sb, this.f12081d, "}");
    }
}
