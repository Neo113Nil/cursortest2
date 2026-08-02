package com.google.android.gms.internal.ads;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class Wt {

    /* renamed from: a, reason: collision with root package name */
    public final String f12122a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12123b;

    public Wt(String str, String str2) {
        this.f12122a = str;
        this.f12123b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Wt) {
            Wt wt = (Wt) obj;
            String str = this.f12122a;
            if (str != null ? str.equals(wt.f12122a) : wt.f12122a == null) {
                String str2 = this.f12123b;
                if (str2 != null ? str2.equals(wt.f12123b) : wt.f12123b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12122a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f12123b;
        return (str2 != null ? str2.hashCode() : 0) ^ ((hashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayDismissRequest{sessionToken=");
        sb.append(this.f12122a);
        sb.append(", appId=");
        return AbstractC2107A.u(sb, this.f12123b, "}");
    }
}
