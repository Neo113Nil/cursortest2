package com.goldenboot.saga.zone;

import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lcom/goldenboot/saga/zone/DefaultTranslator;", "Lcom/goldenboot/saga/zone/MarginModerator;", "Lcom/goldenboot/saga/zone/RuntimeHeap;", "center", "", "Lcom/goldenboot/saga/zone/ContainerSource;", "colors", "", "stops", "<init>", "(JLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/goldenboot/saga/zone/ShapeSender;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "injectMetric", "(J)Landroid/graphics/Shader;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "clipOrigin", "J", "flushSample", "Ljava/util/List;", "updateTimer", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultTranslator extends MarginModerator {

    /* renamed from: clipOrigin, reason: from kotlin metadata */
    private final long center;

    /* renamed from: flushSample, reason: from kotlin metadata */
    private final List<ContainerSource> colors;

    /* renamed from: updateTimer, reason: from kotlin metadata */
    private final List<Float> stops;

    public /* synthetic */ DefaultTranslator(long j, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, list2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultTranslator)) {
            return false;
        }
        DefaultTranslator defaultTranslator = (DefaultTranslator) other;
        return RuntimeHeap.connectJob(this.center, defaultTranslator.center) && Intrinsics.areEqual(this.colors, defaultTranslator.colors) && Intrinsics.areEqual(this.stops, defaultTranslator.stops);
    }

    public int hashCode() {
        int inflateAdapter = ((RuntimeHeap.inflateAdapter(this.center) * 31) + this.colors.hashCode()) * 31;
        List<Float> list = this.stops;
        return inflateAdapter + (list != null ? list.hashCode() : 0);
    }

    @Override // com.goldenboot.saga.zone.MarginModerator
    public Shader injectMetric(long size) {
        long flushSample;
        long j = this.center;
        if ((StreamSyncer.evictLayout & j) == StreamSyncer.detachStream) {
            flushSample = FocusCounter.growPayload(size);
        } else {
            float intBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j >> 32)) == Float.POSITIVE_INFINITY ? size >> 32 : this.center >> 32));
            if (Float.intBitsToFloat((int) (this.center & 4294967295L)) != Float.POSITIVE_INFINITY) {
                size = this.center;
            }
            float intBitsToFloat2 = Float.intBitsToFloat((int) (size & 4294967295L));
            flushSample = RuntimeHeap.flushSample((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        }
        return TapReducer.updateTimer(flushSample, this.colors, this.stops);
    }

    public String toString() {
        String str;
        if ((this.center & StreamSyncer.evictLayout) != StreamSyncer.detachStream) {
            str = "center=" + ((Object) RuntimeHeap.expandArgs(this.center)) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.colors + ", stops=" + this.stops + ')';
    }

    public /* synthetic */ DefaultTranslator(long j, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, (i & 4) != 0 ? null : list2, null);
    }

    private DefaultTranslator(long j, List<ContainerSource> list, List<Float> list2) {
        this.center = j;
        this.colors = list;
        this.stops = list2;
    }
}
