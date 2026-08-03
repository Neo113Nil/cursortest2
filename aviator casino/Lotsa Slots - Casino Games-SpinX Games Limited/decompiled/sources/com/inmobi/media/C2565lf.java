package com.inmobi.media;

/* renamed from: com.inmobi.media.lf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2565lf {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f5316a;

    public C2565lf(java.util.Map requestParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        this.f5316a = requestParams;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.inmobi.media.C2565lf) && kotlin.jvm.internal.Intrinsics.areEqual(this.f5316a, ((com.inmobi.media.C2565lf) obj).f5316a);
    }

    public final int hashCode() {
        return this.f5316a.hashCode();
    }

    public final java.lang.String toString() {
        return "NovatiqAdData(requestParams=" + this.f5316a + ")";
    }
}
