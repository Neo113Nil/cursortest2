package com.onesignal.internal;

import com.onesignal.debug.LogLevel;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class OtelLifecycleManager$startOtelLogging$shouldSend$1 extends j implements InterfaceC1441l {
    final /* synthetic */ LogLevel $logLevel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtelLifecycleManager$startOtelLogging$shouldSend$1(LogLevel logLevel) {
        super(1);
        this.$logLevel = logLevel;
    }

    @Override // t4.InterfaceC1441l
    public final Boolean invoke(LogLevel level) {
        i.e(level, "level");
        LogLevel logLevel = this.$logLevel;
        return Boolean.valueOf(logLevel != LogLevel.NONE && level.compareTo(logLevel) <= 0);
    }
}
