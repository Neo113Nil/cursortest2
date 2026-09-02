package com.goldenboot.saga.zone;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class MarginDownloader {
    public static final void evictLayout(SaveRepository saveRepository, String str, List list, List list2, TouchRecord touchRecord, TouchRecord touchRecord2, TouchRecord touchRecord3, TouchRecord touchRecord4, TouchRecord touchRecord5, BoxSteward boxSteward) {
        SingletonCounter singletonCounter = new SingletonCounter((StreamListener) saveRepository.updateTimer().detachStream(StreamListener.class), str, boxSteward);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ScrollHandler scrollHandler = (ScrollHandler) it.next();
            singletonCounter.evictLayout(scrollHandler.evictLayout(), scrollHandler.growPayload());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            singletonCounter.injectMetric((GridEvent) it2.next());
        }
        singletonCounter.updateTimer(touchRecord);
        singletonCounter.applyTask(touchRecord2);
        singletonCounter.popBlueprint(touchRecord3);
        singletonCounter.drawField(touchRecord4);
        singletonCounter.connectJob(touchRecord5);
        saveRepository.flushSample(singletonCounter);
    }

    public static /* synthetic */ void growPayload(SaveRepository saveRepository, String str, List list, List list2, TouchRecord touchRecord, TouchRecord touchRecord2, TouchRecord touchRecord3, TouchRecord touchRecord4, TouchRecord touchRecord5, BoxSteward boxSteward, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CursorBuilder.peekRevision();
        }
        List list3 = list;
        if ((i & 4) != 0) {
            list2 = CursorBuilder.peekRevision();
        }
        List list4 = list2;
        TouchRecord touchRecord6 = (i & 8) != 0 ? null : touchRecord;
        TouchRecord touchRecord7 = (i & 16) != 0 ? null : touchRecord2;
        evictLayout(saveRepository, str, list3, list4, touchRecord6, touchRecord7, (i & 32) != 0 ? touchRecord6 : touchRecord3, (i & 64) != 0 ? touchRecord7 : touchRecord4, (i & ContentOperation.SpotShadowColor) != 0 ? null : touchRecord5, boxSteward);
    }
}
