package com.unity3d.services.core.network.domain;

/* compiled from: CleanupDirectory.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class CleanupDirectory$invoke$cachedFiles$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean> {
    public static final com.unity3d.services.core.network.domain.CleanupDirectory$invoke$cachedFiles$1 INSTANCE = new com.unity3d.services.core.network.domain.CleanupDirectory$invoke$cachedFiles$1();

    CleanupDirectory$invoke$cachedFiles$1() {
        super(1, java.io.File.class, "isFile", "isFile()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Boolean invoke(java.io.File p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
        return java.lang.Boolean.valueOf(p0.isFile());
    }
}
