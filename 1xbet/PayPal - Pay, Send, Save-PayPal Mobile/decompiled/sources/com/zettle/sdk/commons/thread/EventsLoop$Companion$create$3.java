package com.zettle.sdk.commons.thread;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getHighSpeedVideoFpsRanges", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class EventsLoop$Companion$create$3 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.lang.Long> {
    public static final com.zettle.sdk.commons.thread.EventsLoop$Companion$create$3 Camera2StreamConfigurationMap = new com.zettle.sdk.commons.thread.EventsLoop$Companion$create$3();

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public final java.lang.Long invoke() {
        return java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis());
    }

    EventsLoop$Companion$create$3() {
        super(0);
    }
}
