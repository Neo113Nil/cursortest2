package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Y9 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.Ui f5062a;
    public final com.inmobi.media.Ui b;
    public final com.inmobi.media.Ui c;
    public final com.inmobi.media.Ui d;

    public Y9(com.inmobi.media.core.config.models.CrashConfig config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        this.f5062a = new com.inmobi.media.Ui(config.getCrashConfig().getSamplingPercent());
        this.b = new com.inmobi.media.Ui(config.getCatchConfig().getSamplingPercent());
        this.c = new com.inmobi.media.Ui(config.getAnr().getWatchdog().getSamplingPercent());
        this.d = new com.inmobi.media.Ui(config.getAnr().getAppExitReason().getSamplingPercent());
    }
}
