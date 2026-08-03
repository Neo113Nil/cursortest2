package com.inmobi.media;

/* renamed from: com.inmobi.media.v8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2824v8 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f5505a;
    public final java.util.Map b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final boolean e;

    public C2824v8(java.util.ArrayList omidTrackers, java.util.Map macros, java.lang.String customReferenceData, java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omidTrackers, "omidTrackers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customReferenceData, "customReferenceData");
        this.f5505a = omidTrackers;
        this.b = macros;
        this.c = customReferenceData;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2824v8)) {
            return false;
        }
        com.inmobi.media.C2824v8 c2824v8 = (com.inmobi.media.C2824v8) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5505a, c2824v8.f5505a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c2824v8.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c2824v8.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, c2824v8.d) && this.e == c2824v8.e;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f5505a.hashCode() * 31)) * 31)) * 31;
        java.lang.String str = this.d;
        return kotlin.UByte$$ExternalSyntheticBackport0.m(this.e) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final java.lang.String toString() {
        return "HybridOmidInfo(omidTrackers=" + this.f5505a + ", macros=" + this.b + ", customReferenceData=" + this.c + ", contentUrl=" + this.d + ", isolateVerificationScripts=" + this.e + ")";
    }
}
