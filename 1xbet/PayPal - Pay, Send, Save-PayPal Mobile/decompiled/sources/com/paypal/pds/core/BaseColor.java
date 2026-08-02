package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\u00020\u00028WX\u0096\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/pds/core/BaseColor;", "", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getColor-0d7_KjU$pds_release", "()J", "getValue", "(Landroidx/compose/runtime/Composer;I)J", "getValue$annotations", "(Landroidx/compose/runtime/Composer;I)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public class BaseColor {
    public static final int $stable = 0;
    private final long color;

    public static /* synthetic */ void getValue$annotations(androidx.compose.runtime.Composer composer, int i) {
    }

    private BaseColor(long j) {
        this.color = j;
    }

    /* renamed from: getColor-0d7_KjU$pds_release, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    public long getValue(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(1179354496);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1179354496, i, -1, "com.paypal.pds.core.BaseColor.<get-value> (BaseColor.kt:22)");
        }
        long j = this.color;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return j;
    }

    public /* synthetic */ BaseColor(long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }
}
