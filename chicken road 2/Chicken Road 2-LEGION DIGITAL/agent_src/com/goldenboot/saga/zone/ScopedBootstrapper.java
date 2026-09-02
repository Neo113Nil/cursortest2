package com.goldenboot.saga.zone;

import android.content.Context;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "context", "Lcom/goldenboot/saga/zone/BackgroundCollection;", "evictLayout", "(Landroid/content/Context;)Lcom/goldenboot/saga/zone/BackgroundCollection;", "ui-unit"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScopedBootstrapper {
    public static final BackgroundCollection evictLayout(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        RailProvider growPayload = TextAllocator.evictLayout.growPayload(f);
        if (growPayload == null) {
            growPayload = new LinearFontScaleConverter(f);
        }
        return new DensityWithConverter(f2, f, growPayload);
    }
}
