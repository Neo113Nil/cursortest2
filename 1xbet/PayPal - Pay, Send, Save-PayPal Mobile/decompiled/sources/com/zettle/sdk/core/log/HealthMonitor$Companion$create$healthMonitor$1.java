package com.zettle.sdk.core.log;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final /* synthetic */ class HealthMonitor$Companion$create$healthMonitor$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.io.File, com.zettle.sdk.io.FileWriter> {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public final com.zettle.sdk.io.FileWriter invoke(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        return ((com.zettle.sdk.io.FileWriter.Companion) this.receiver).create(file);
    }

    HealthMonitor$Companion$create$healthMonitor$1(java.lang.Object obj) {
        super(1, obj, com.zettle.sdk.io.FileWriter.Companion.class, "create", "create(Ljava/io/File;)Lcom/zettle/sdk/io/FileWriter;", 0);
    }
}
