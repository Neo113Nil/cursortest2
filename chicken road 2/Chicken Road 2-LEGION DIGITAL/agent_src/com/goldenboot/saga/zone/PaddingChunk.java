package com.goldenboot.saga.zone;

import android.os.Looper;
import java.util.List;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class PaddingChunk implements ListUploader {
    @Override // com.goldenboot.saga.zone.ListUploader
    public String evictLayout() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // com.goldenboot.saga.zone.ListUploader
    public SnackbarCache growPayload(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new RegionStreamer(ServiceAggregator.evictLayout(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // com.goldenboot.saga.zone.ListUploader
    public int injectMetric() {
        return 1073741823;
    }
}
