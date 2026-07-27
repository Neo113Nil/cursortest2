package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class dc {

    /* renamed from: a, reason: collision with root package name */
    public final String f4729a;
    public final String b;
    public final String c;
    public final String d;

    public dc(String mediationName, String libraryVersion, String adapterVersion, String mediationType) {
        Intrinsics.checkNotNullParameter(mediationName, "mediationName");
        Intrinsics.checkNotNullParameter(libraryVersion, "libraryVersion");
        Intrinsics.checkNotNullParameter(adapterVersion, "adapterVersion");
        Intrinsics.checkNotNullParameter(mediationType, "mediationType");
        this.f4729a = mediationName;
        this.b = libraryVersion;
        this.c = adapterVersion;
        this.d = mediationType;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.f4729a;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc)) {
            return false;
        }
        dc dcVar = (dc) obj;
        return Intrinsics.areEqual(this.f4729a, dcVar.f4729a) && Intrinsics.areEqual(this.b, dcVar.b) && Intrinsics.areEqual(this.c, dcVar.c) && Intrinsics.areEqual(this.d, dcVar.d);
    }

    public int hashCode() {
        return (((((this.f4729a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "MediationBodyFields(mediationName=" + this.f4729a + ", libraryVersion=" + this.b + ", adapterVersion=" + this.c + ", mediationType=" + this.d + ")";
    }
}
