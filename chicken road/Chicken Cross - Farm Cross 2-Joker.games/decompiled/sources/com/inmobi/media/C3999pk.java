package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.pk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3999pk {

    /* renamed from: a, reason: collision with root package name */
    public final String f7309a;
    public final boolean b;
    public final boolean c;
    public final Short d;

    public C3999pk(String str, boolean z, boolean z2, Short sh) {
        this.f7309a = str;
        this.b = z;
        this.c = z2;
        this.d = sh;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3999pk)) {
            return false;
        }
        C3999pk c3999pk = (C3999pk) obj;
        return Intrinsics.areEqual(this.f7309a, c3999pk.f7309a) && this.b == c3999pk.b && this.c == c3999pk.c && Intrinsics.areEqual(this.d, c3999pk.d);
    }

    public final int hashCode() {
        String str = this.f7309a;
        int hashCode = (Boolean.hashCode(this.c) + ((Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        Short sh = this.d;
        return hashCode + (sh != null ? sh.hashCode() : 0);
    }

    public final String toString() {
        return "ProviderInitSettings(persistedAccountId=" + this.f7309a + ", accountIdResetEnabled=" + this.b + ", appLaunchTimeEnabled=" + this.c + ", errorCode=" + this.d + ")";
    }
}
