package com.goldenboot.saga.zone;

import android.content.Context;
import android.graphics.fonts.FontVariationAxis;
import android.os.Build;
import com.goldenboot.saga.zone.SharedMonitor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/goldenboot/saga/zone/SharedMonitor$EndpointList;", "Lcom/goldenboot/saga/zone/BackgroundCollection;", "density", "", "weightAdjustment", "", "clipOrigin", "(Lcom/goldenboot/saga/zone/SharedMonitor$EndpointList;Lcom/goldenboot/saga/zone/BackgroundCollection;I)Ljava/lang/String;", "", "Landroid/graphics/fonts/FontVariationAxis;", "detachStream", "(Lcom/goldenboot/saga/zone/SharedMonitor$EndpointList;Lcom/goldenboot/saga/zone/BackgroundCollection;I)[Landroid/graphics/fonts/FontVariationAxis;", "Landroid/content/Context;", "context", "injectMetric", "(Landroid/content/Context;)I", "releaseHeader", "(Lcom/goldenboot/saga/zone/SharedMonitor$EndpointList;Landroid/content/Context;)Ljava/lang/String;", "", "growPayload", "(F)F", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RegionTask {
    public static final String clipOrigin(SharedMonitor.EndpointList endpointList, final BackgroundCollection backgroundCollection, int i) {
        boolean z;
        float injectMetric;
        if (i == 0) {
            return WatcherRevision.attachConfig(endpointList.growPayload(), null, null, null, 0, null, new TouchRecord() { // from class: com.goldenboot.saga.zone.PaddingAction
                @Override // com.goldenboot.saga.zone.TouchRecord
                public final Object invoke(Object obj) {
                    CharSequence flushSample;
                    flushSample = RegionTask.flushSample(BackgroundCollection.this, (SharedMonitor.ActivityMutator) obj);
                    return flushSample;
                }
            }, 31, null);
        }
        List<SharedMonitor.ActivityMutator> growPayload = endpointList.growPayload();
        int size = growPayload.size();
        int i2 = 0;
        String str = "";
        boolean z2 = false;
        while (i2 < size) {
            SharedMonitor.ActivityMutator activityMutator = growPayload.get(i2);
            if (Intrinsics.areEqual(activityMutator.getAxisName(), "wght")) {
                injectMetric = growPayload(activityMutator.injectMetric(backgroundCollection) + i);
                z = true;
            } else {
                z = z2;
                injectMetric = activityMutator.injectMetric(backgroundCollection);
            }
            if (i2 != 0) {
                str = str + ',';
            }
            str = str + '\'' + activityMutator.getAxisName() + "' " + injectMetric;
            i2++;
            z2 = z;
        }
        if (z2) {
            return str;
        }
        float growPayload2 = growPayload(i + 400.0f);
        if (!endpointList.growPayload().isEmpty()) {
            str = str + ',';
        }
        return str + "'wght' " + growPayload2;
    }

    public static final FontVariationAxis[] detachStream(SharedMonitor.EndpointList endpointList, BackgroundCollection backgroundCollection, int i) {
        int size;
        int i2 = 0;
        if (i == 0) {
            int size2 = endpointList.growPayload().size();
            FontVariationAxis[] fontVariationAxisArr = new FontVariationAxis[size2];
            while (i2 < size2) {
                fontVariationAxisArr[i2] = new FontVariationAxis(endpointList.growPayload().get(i2).getAxisName(), endpointList.growPayload().get(i2).injectMetric(backgroundCollection));
                i2++;
            }
            return fontVariationAxisArr;
        }
        int size3 = endpointList.growPayload().size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                size = endpointList.growPayload().size() + 1;
                break;
            }
            if (Intrinsics.areEqual(endpointList.growPayload().get(i3).getAxisName(), "wght")) {
                size = endpointList.growPayload().size();
                break;
            }
            i3++;
        }
        FontVariationAxis[] fontVariationAxisArr2 = new FontVariationAxis[size];
        while (i2 < size) {
            fontVariationAxisArr2[i2] = i2 == endpointList.growPayload().size() ? new FontVariationAxis("wght", growPayload(i + 400.0f)) : Intrinsics.areEqual(endpointList.growPayload().get(i2).getAxisName(), "wght") ? new FontVariationAxis("wght", growPayload(endpointList.growPayload().get(i2).injectMetric(backgroundCollection) + i)) : new FontVariationAxis(endpointList.growPayload().get(i2).getAxisName(), endpointList.growPayload().get(i2).injectMetric(backgroundCollection));
            i2++;
        }
        return fontVariationAxisArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence flushSample(BackgroundCollection backgroundCollection, SharedMonitor.ActivityMutator activityMutator) {
        return '\'' + activityMutator.getAxisName() + "' " + activityMutator.injectMetric(backgroundCollection);
    }

    private static final float growPayload(float f) {
        return CellEntry.connectJob(f, 1.0f, 1000.0f);
    }

    public static final int injectMetric(Context context) {
        int i;
        int i2;
        if (context == null || Build.VERSION.SDK_INT < 31) {
            return 0;
        }
        i = context.getResources().getConfiguration().fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        i2 = context.getResources().getConfiguration().fontWeightAdjustment;
        return i2;
    }

    public static final String releaseHeader(SharedMonitor.EndpointList endpointList, Context context) {
        return clipOrigin(endpointList, ScopedBootstrapper.evictLayout(context), injectMetric(context));
    }
}
