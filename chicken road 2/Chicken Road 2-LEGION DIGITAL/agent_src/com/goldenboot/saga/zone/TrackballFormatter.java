package com.goldenboot.saga.zone;

import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import com.goldenboot.saga.zone.ConsumerVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a/\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0016H\u0000¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/goldenboot/saga/zone/ListenerStage;", "Landroid/graphics/PathEffect;", "releaseHeader", "(Lcom/goldenboot/saga/zone/ListenerStage;)Landroid/graphics/PathEffect;", "flushSample", "(Landroid/graphics/PathEffect;)Lcom/goldenboot/saga/zone/ListenerStage;", "", "radius", "growPayload", "(F)Lcom/goldenboot/saga/zone/ListenerStage;", "", "intervals", "phase", "injectMetric", "([FF)Lcom/goldenboot/saga/zone/ListenerStage;", "outer", "inner", "evictLayout", "(Lcom/goldenboot/saga/zone/ListenerStage;Lcom/goldenboot/saga/zone/ListenerStage;)Lcom/goldenboot/saga/zone/ListenerStage;", "Lcom/goldenboot/saga/zone/ServiceFetcher;", "shape", "advance", "Lcom/goldenboot/saga/zone/ConsumerVersion;", "style", "detachStream", "(Lcom/goldenboot/saga/zone/ServiceFetcher;FFI)Lcom/goldenboot/saga/zone/ListenerStage;", "Landroid/graphics/PathDashPathEffect$Style;", "clipOrigin", "(I)Landroid/graphics/PathDashPathEffect$Style;", "ui-graphics_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TrackballFormatter {
    public static final PathDashPathEffect.Style clipOrigin(int i) {
        ConsumerVersion.Companion companion = ConsumerVersion.INSTANCE;
        return ConsumerVersion.flushSample(i, companion.evictLayout()) ? PathDashPathEffect.Style.MORPH : ConsumerVersion.flushSample(i, companion.growPayload()) ? PathDashPathEffect.Style.ROTATE : ConsumerVersion.flushSample(i, companion.injectMetric()) ? PathDashPathEffect.Style.TRANSLATE : PathDashPathEffect.Style.TRANSLATE;
    }

    public static final ListenerStage detachStream(ServiceFetcher serviceFetcher, float f, float f2, int i) {
        if (serviceFetcher instanceof DimenHandler) {
            return new SpanBlock(new PathDashPathEffect(((DimenHandler) serviceFetcher).getInternalPath(), f, f2, clipOrigin(i)));
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public static final ListenerStage evictLayout(ListenerStage listenerStage, ListenerStage listenerStage2) {
        Intrinsics.checkNotNull(listenerStage, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        PathEffect nativePathEffect = ((SpanBlock) listenerStage).getNativePathEffect();
        Intrinsics.checkNotNull(listenerStage2, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return new SpanBlock(new ComposePathEffect(nativePathEffect, ((SpanBlock) listenerStage2).getNativePathEffect()));
    }

    public static final ListenerStage flushSample(PathEffect pathEffect) {
        return new SpanBlock(pathEffect);
    }

    public static final ListenerStage growPayload(float f) {
        return new SpanBlock(new CornerPathEffect(f));
    }

    public static final ListenerStage injectMetric(float[] fArr, float f) {
        return new SpanBlock(new DashPathEffect(fArr, f));
    }

    public static final PathEffect releaseHeader(ListenerStage listenerStage) {
        Intrinsics.checkNotNull(listenerStage, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return ((SpanBlock) listenerStage).getNativePathEffect();
    }
}
