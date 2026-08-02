package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class Um {

    /* renamed from: a, reason: collision with root package name */
    public final String f11809a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11810b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f11811c;

    public Um(String str, String str2, Drawable drawable) {
        this.f11809a = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.f11810b = str2;
        this.f11811c = drawable;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Um) {
            Um um = (Um) obj;
            String str = this.f11809a;
            if (str != null ? str.equals(um.f11809a) : um.f11809a == null) {
                if (this.f11810b.equals(um.f11810b)) {
                    Drawable drawable = um.f11811c;
                    Drawable drawable2 = this.f11811c;
                    if (drawable2 != null ? drawable2.equals(drawable) : drawable == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11809a;
        int hashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f11810b.hashCode();
        Drawable drawable = this.f11811c;
        return (drawable != null ? drawable.hashCode() : 0) ^ (hashCode * 1000003);
    }

    public final String toString() {
        return "OfflineAdAssets{advertiserName=" + this.f11809a + ", imageUrl=" + this.f11810b + ", icon=" + String.valueOf(this.f11811c) + "}";
    }
}
