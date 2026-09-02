package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.LongPressGateway;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class PanelAdministrator {
    public static final DrawableSynthesizer detachStream(DrawableSynthesizer drawableSynthesizer, DrawableSynthesizer drawableSynthesizer2) {
        while (drawableSynthesizer != null) {
            if (drawableSynthesizer == drawableSynthesizer2 || !(drawableSynthesizer instanceof BoxFetcher)) {
                return drawableSynthesizer;
            }
            drawableSynthesizer = ((BoxFetcher) drawableSynthesizer).removeCount();
        }
        return null;
    }

    public static final void growPayload(final TypographyDelegate typographyDelegate, LongPressGateway longPressGateway) {
        if (((Number) longPressGateway.injectMetric(0, new IconExporter() { // from class: com.goldenboot.saga.zone.ClientBenchmark
            @Override // com.goldenboot.saga.zone.IconExporter
            public final Object invoke(Object obj, Object obj2) {
                int injectMetric;
                injectMetric = PanelAdministrator.injectMetric(TypographyDelegate.this, ((Integer) obj).intValue(), (LongPressGateway.BounceHandler) obj2);
                return Integer.valueOf(injectMetric);
            }
        })).intValue() == typographyDelegate.connectPatch) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + typographyDelegate.notifyMessage + ",\n\t\tbut emission happened in " + longPressGateway + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final int injectMetric(TypographyDelegate typographyDelegate, int i, LongPressGateway.BounceHandler bounceHandler) {
        LongPressGateway.FeedbackFlow key = bounceHandler.getKey();
        LongPressGateway.BounceHandler evictLayout = typographyDelegate.notifyMessage.evictLayout(key);
        if (key != DrawableSynthesizer.popBlueprint) {
            if (bounceHandler != evictLayout) {
                return Integer.MIN_VALUE;
            }
            return i + 1;
        }
        DrawableSynthesizer drawableSynthesizer = (DrawableSynthesizer) evictLayout;
        Intrinsics.checkNotNull(bounceHandler, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        DrawableSynthesizer detachStream = detachStream((DrawableSynthesizer) bounceHandler, drawableSynthesizer);
        if (detachStream == drawableSynthesizer) {
            return drawableSynthesizer == null ? i : i + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + detachStream + ", expected child of " + drawableSynthesizer + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
