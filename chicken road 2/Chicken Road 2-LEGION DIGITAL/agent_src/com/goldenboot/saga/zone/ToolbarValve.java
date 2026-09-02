package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.SetupTrigger;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public interface ToolbarValve extends SetupTrigger, IconExporter {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public interface ActivityMutator extends SetupTrigger.ActivityMutator, IconExporter {
    }

    Object getDelegate(Object obj, Object obj2);

    ActivityMutator getGetter();
}
