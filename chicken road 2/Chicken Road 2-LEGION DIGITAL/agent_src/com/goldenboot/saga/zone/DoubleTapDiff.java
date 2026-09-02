package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.SystemThrottle;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class DoubleTapDiff extends SystemThrottle {
    public final HashMap resetDelta = new HashMap();

    @Override // com.goldenboot.saga.zone.SystemThrottle
    public Object applyTask(Object obj) {
        Object applyTask = super.applyTask(obj);
        this.resetDelta.remove(obj);
        return applyTask;
    }

    public Map.Entry connectJob(Object obj) {
        if (contains(obj)) {
            return ((SystemThrottle.FeedbackFlow) this.resetDelta.get(obj)).attachConfig;
        }
        return null;
    }

    public boolean contains(Object obj) {
        return this.resetDelta.containsKey(obj);
    }

    @Override // com.goldenboot.saga.zone.SystemThrottle
    public SystemThrottle.FeedbackFlow growPayload(Object obj) {
        return (SystemThrottle.FeedbackFlow) this.resetDelta.get(obj);
    }

    @Override // com.goldenboot.saga.zone.SystemThrottle
    public Object updateTimer(Object obj, Object obj2) {
        SystemThrottle.FeedbackFlow growPayload = growPayload(obj);
        if (growPayload != null) {
            return growPayload.notifyMessage;
        }
        this.resetDelta.put(obj, flushSample(obj, obj2));
        return null;
    }
}
