package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.os.IBinder;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class Yt {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f12370a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12371b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12372c;

    /* renamed from: d, reason: collision with root package name */
    public final float f12373d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12374e;
    public final String f;

    public Yt(IBinder iBinder, String str, int i, float f, int i5, String str2) {
        this.f12370a = iBinder;
        this.f12371b = str;
        this.f12372c = i;
        this.f12373d = f;
        this.f12374e = i5;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Yt) {
            Yt yt = (Yt) obj;
            if (this.f12370a.equals(yt.f12370a)) {
                String str = yt.f12371b;
                String str2 = this.f12371b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f12372c == yt.f12372c && Float.floatToIntBits(this.f12373d) == Float.floatToIntBits(yt.f12373d) && this.f12374e == yt.f12374e) {
                        String str3 = yt.f;
                        String str4 = this.f;
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
        int hashCode = this.f12370a.hashCode() ^ 1000003;
        String str = this.f12371b;
        int hashCode2 = (((((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f12372c) * 1000003) ^ Float.floatToIntBits(this.f12373d);
        String str2 = this.f;
        return ((((hashCode2 * 1525764945) ^ this.f12374e) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        StringBuilder w5 = AbstractC0467k.w("OverlayDisplayShowRequest{windowToken=", this.f12370a.toString(), ", appId=");
        w5.append(this.f12371b);
        w5.append(", layoutGravity=");
        w5.append(this.f12372c);
        w5.append(", layoutVerticalMargin=");
        w5.append(this.f12373d);
        w5.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        w5.append(this.f12374e);
        w5.append(", deeplinkUrl=null, adFieldEnifd=");
        return AbstractC2107A.u(w5, this.f, ", thirdPartyAuthCallerId=null}");
    }
}
