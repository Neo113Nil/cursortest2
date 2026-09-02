package com.goldenboot.saga.zone;

import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public interface ScrollAggregator extends FrameHub {
    TimelineMaker applyTask(TimelineMaker timelineMaker);

    boolean attachConfig();

    void connectJob();

    void connectPatch();

    void drawRequest(List list);

    void drawScope();

    void expandArgs();

    void findTask(GroupBatch groupBatch);

    void gatherAdapter(Object obj);

    void growPayload(Object obj);

    boolean mergeLocale();

    Object notifyMessage(ScrollAggregator scrollAggregator, int i, ElevationNode elevationNode);

    void popBlueprint(ElevationNode elevationNode);

    void purgeNode(IconExporter iconExporter);

    void reduceScope(Set set);

    void syncScope();

    boolean updateTimer(Set set);
}
