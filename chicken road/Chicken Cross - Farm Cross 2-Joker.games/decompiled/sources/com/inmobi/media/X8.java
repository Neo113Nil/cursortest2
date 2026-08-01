package com.inmobi.media;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class X8 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6945a;
    public final Map b;
    public final String c;
    public final String d;
    public final boolean e;

    public X8(ArrayList omidTrackers, Map macros, String customReferenceData, String str, boolean z) {
        Intrinsics.checkNotNullParameter(omidTrackers, "omidTrackers");
        Intrinsics.checkNotNullParameter(macros, "macros");
        Intrinsics.checkNotNullParameter(customReferenceData, "customReferenceData");
        this.f6945a = omidTrackers;
        this.b = macros;
        this.c = customReferenceData;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X8)) {
            return false;
        }
        X8 x8 = (X8) obj;
        return Intrinsics.areEqual(this.f6945a, x8.f6945a) && Intrinsics.areEqual(this.b, x8.b) && Intrinsics.areEqual(this.c, x8.c) && Intrinsics.areEqual(this.d, x8.d) && this.e == x8.e;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f6945a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        return Boolean.hashCode(this.e) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "HybridOmidInfo(omidTrackers=" + this.f6945a + ", macros=" + this.b + ", customReferenceData=" + this.c + ", contentUrl=" + this.d + ", isolateVerificationScripts=" + this.e + ")";
    }
}
