package com.inmobi.media;

import com.inmobi.media.core.config.models.CrashConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Da {

    /* renamed from: a, reason: collision with root package name */
    public final C3827jk f6509a;
    public final C3827jk b;
    public final C3827jk c;
    public final C3827jk d;

    public Da(CrashConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f6509a = new C3827jk(config.getCrashConfig().getSamplingPercent());
        this.b = new C3827jk(config.getCatchConfig().getSamplingPercent());
        this.c = new C3827jk(config.getAnr().getWatchdog().getSamplingPercent());
        this.d = new C3827jk(config.getAnr().getAppExitReason().getSamplingPercent());
    }
}
