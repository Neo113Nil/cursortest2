package com.inmobi.media;

/* renamed from: com.inmobi.media.jl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2518jl {
    public static void a(boolean z) {
        com.inmobi.media.Xi.d.set(z);
        if (z) {
            ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).b(new com.inmobi.media.J2(101, 6, (java.lang.String) null));
        } else {
            ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).b(new com.inmobi.media.J2(102, 6, (java.lang.String) null));
        }
        com.inmobi.media.C2492il runnable = new com.inmobi.media.C2492il(z, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.Xi.h, null, null, new com.inmobi.media.Wi(runnable, null), 3, null);
    }
}
