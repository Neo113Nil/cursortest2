package com.paypal.oslo.core.telemetry.util;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u0003R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/telemetry/util/TelemetryLogBuffer;", "", "<init>", "()V", "", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PATH_ENTRY, "", "add$telemetry_release", "(Ljava/lang/String;)V", "tag", "Lkotlin/Function2;", "logger", "flush$telemetry_release", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "clear$telemetry_release", "Lkotlin/collections/ArrayDeque;", "getHighSpeedVideoSizes", "Lkotlin/collections/ArrayDeque;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TelemetryLogBuffer {
    public static final com.paypal.oslo.core.telemetry.util.TelemetryLogBuffer INSTANCE = new com.paypal.oslo.core.telemetry.util.TelemetryLogBuffer();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final kotlin.collections.ArrayDeque<java.lang.String> Camera2StreamConfigurationMap = new kotlin.collections.ArrayDeque<>();
    public static final int $stable = 8;

    private TelemetryLogBuffer() {
    }

    public final void add$telemetry_release(java.lang.String entry) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
            kotlin.collections.ArrayDeque<java.lang.String> arrayDeque = Camera2StreamConfigurationMap;
            if (arrayDeque.size() >= 50) {
                arrayDeque.removeFirst();
            }
            arrayDeque.addLast(entry);
        }
    }

    public static /* synthetic */ void flush$telemetry_release$default(com.paypal.oslo.core.telemetry.util.TelemetryLogBuffer telemetryLogBuffer, java.lang.String str, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "Event";
        }
        telemetryLogBuffer.flush$telemetry_release(str, function2);
    }

    public final void flush$telemetry_release(java.lang.String tag, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> logger) {
        java.util.List list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        synchronized (this) {
            kotlin.collections.ArrayDeque<java.lang.String> arrayDeque = Camera2StreamConfigurationMap;
            if (arrayDeque.isEmpty()) {
                list = kotlin.collections.CollectionsKt.emptyList();
            } else {
                java.util.List list2 = kotlin.collections.CollectionsKt.toList(arrayDeque);
                arrayDeque.clear();
                list = list2;
            }
        }
        if (list.isEmpty()) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            logger.invoke(tag, (java.lang.String) it.next());
        }
    }

    public final void clear$telemetry_release() {
        synchronized (this) {
            Camera2StreamConfigurationMap.clear();
        }
    }
}
