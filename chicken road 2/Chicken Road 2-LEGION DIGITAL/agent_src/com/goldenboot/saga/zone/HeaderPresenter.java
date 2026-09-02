package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.SetupArchive;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class HeaderPresenter {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List evictLayout(List f1, List f2) {
        Intrinsics.checkNotNullParameter(f1, "f1");
        Intrinsics.checkNotNullParameter(f2, "f2");
        Iterator it = CursorBuilder.serializeOffset(f2).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        SubscriberChunk subscriberChunk = (SubscriberChunk) it;
        int nextInt = subscriberChunk.nextInt();
        if (it.hasNext()) {
            float growPayload = growPayload(((WidgetBridge) f1.get(0)).evictLayout(), ((WidgetBridge) f2.get(nextInt)).evictLayout());
            do {
                int nextInt2 = subscriberChunk.nextInt();
                float growPayload2 = growPayload(((WidgetBridge) f1.get(0)).evictLayout(), ((WidgetBridge) f2.get(nextInt2)).evictLayout());
                if (Float.compare(growPayload, growPayload2) > 0) {
                    nextInt = nextInt2;
                    growPayload = growPayload2;
                }
            } while (it.hasNext());
        }
        int size = f1.size();
        int size2 = f2.size();
        List attachConfig = CursorBuilder.attachConfig(f2.get(nextInt));
        int i = nextInt;
        for (int i2 = 1; i2 < size; i2++) {
            int i3 = nextInt - (size - i2);
            if (i3 <= i) {
                i3 += size2;
            }
            Iterator it2 = new WatcherLogger(i + 1, i3).iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            SubscriberChunk subscriberChunk2 = (SubscriberChunk) it2;
            int nextInt3 = subscriberChunk2.nextInt();
            if (it2.hasNext()) {
                float growPayload3 = growPayload(((WidgetBridge) f1.get(i2)).evictLayout(), ((WidgetBridge) f2.get(nextInt3 % size2)).evictLayout());
                do {
                    int nextInt4 = subscriberChunk2.nextInt();
                    float growPayload4 = growPayload(((WidgetBridge) f1.get(i2)).evictLayout(), ((WidgetBridge) f2.get(nextInt4 % size2)).evictLayout());
                    if (Float.compare(growPayload3, growPayload4) > 0) {
                        nextInt3 = nextInt4;
                        growPayload3 = growPayload4;
                    }
                } while (it2.hasNext());
            }
            i = nextInt3;
            attachConfig.add(f2.get(i % size2));
        }
        return attachConfig;
    }

    public static final float growPayload(SetupArchive f1, SetupArchive f2) {
        Intrinsics.checkNotNullParameter(f1, "f1");
        Intrinsics.checkNotNullParameter(f2, "f2");
        if ((f1 instanceof SetupArchive.ActivityMutator) && (f2 instanceof SetupArchive.ActivityMutator) && ((SetupArchive.ActivityMutator) f1).injectMetric() != ((SetupArchive.ActivityMutator) f2).injectMetric()) {
            return Float.MAX_VALUE;
        }
        float growPayload = (((ListenerCollector) CursorCollector.formatPosition(f1.evictLayout())).growPayload() + ((ListenerCollector) CursorCollector.emitStrategy(f1.evictLayout())).detachStream()) / 2.0f;
        float injectMetric = (((ListenerCollector) CursorCollector.formatPosition(f1.evictLayout())).injectMetric() + ((ListenerCollector) CursorCollector.emitStrategy(f1.evictLayout())).releaseHeader()) / 2.0f;
        float growPayload2 = growPayload - ((((ListenerCollector) CursorCollector.formatPosition(f2.evictLayout())).growPayload() + ((ListenerCollector) CursorCollector.emitStrategy(f2.evictLayout())).detachStream()) / 2.0f);
        float injectMetric2 = injectMetric - ((((ListenerCollector) CursorCollector.formatPosition(f2.evictLayout())).injectMetric() + ((ListenerCollector) CursorCollector.emitStrategy(f2.evictLayout())).releaseHeader()) / 2.0f);
        return (growPayload2 * growPayload2) + (injectMetric2 * injectMetric2);
    }

    public static final VibrationCache injectMetric(List features1, List features2) {
        Intrinsics.checkNotNullParameter(features1, "features1");
        Intrinsics.checkNotNullParameter(features2, "features2");
        List injectMetric = DefaultBenchmark.injectMetric();
        int size = features1.size();
        for (int i = 0; i < size; i++) {
            if (((WidgetBridge) features1.get(i)).evictLayout() instanceof SetupArchive.ActivityMutator) {
                injectMetric.add(features1.get(i));
            }
        }
        List evictLayout = DefaultBenchmark.evictLayout(injectMetric);
        List injectMetric2 = DefaultBenchmark.injectMetric();
        int size2 = features2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((WidgetBridge) features2.get(i2)).evictLayout() instanceof SetupArchive.ActivityMutator) {
                injectMetric2.add(features2.get(i2));
            }
        }
        List evictLayout2 = DefaultBenchmark.evictLayout(injectMetric2);
        AlarmFacilitator evictLayout3 = evictLayout.size() > evictLayout2.size() ? PagerValidator.evictLayout(evictLayout(evictLayout2, evictLayout), evictLayout2) : PagerValidator.evictLayout(evictLayout, evictLayout(evictLayout, evictLayout2));
        List list = (List) evictLayout3.evictLayout();
        List list2 = (List) evictLayout3.growPayload();
        List injectMetric3 = DefaultBenchmark.injectMetric();
        int size3 = list.size();
        for (int i3 = 0; i3 < size3 && i3 != list2.size(); i3++) {
            injectMetric3.add(PagerValidator.evictLayout(Float.valueOf(((WidgetBridge) list.get(i3)).growPayload()), Float.valueOf(((WidgetBridge) list2.get(i3)).growPayload())));
        }
        AlarmFacilitator[] alarmFacilitatorArr = (AlarmFacilitator[]) DefaultBenchmark.evictLayout(injectMetric3).toArray(new AlarmFacilitator[0]);
        return new VibrationCache((AlarmFacilitator[]) Arrays.copyOf(alarmFacilitatorArr, alarmFacilitatorArr.length));
    }
}
