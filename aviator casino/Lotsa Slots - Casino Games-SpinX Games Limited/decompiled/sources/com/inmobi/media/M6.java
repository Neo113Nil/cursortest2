package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class M6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.E2 f4830a;

    public M6(java.lang.String b64feature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b64feature, "b64feature");
        com.inmobi.media.E2 e2 = new com.inmobi.media.E2();
        this.f4830a = e2;
        e2.a(b64feature);
    }

    public final boolean a(boolean z) {
        java.util.BitSet bitSet = this.f4830a.f4674a;
        return bitSet != null ? bitSet.get(0) : z;
    }
}
