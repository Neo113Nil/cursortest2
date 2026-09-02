package com.goldenboot.saga.zone;

import android.content.res.Resources;
import com.goldenboot.saga.zone.FlexFormatter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class FlexFormatter {
    public static final ActivityMutator releaseHeader = new ActivityMutator(null);
    public final TouchRecord detachStream;
    public final int evictLayout;
    public final int growPayload;
    public final int injectMetric;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public /* synthetic */ ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final boolean detachStream(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            return (resources.getConfiguration().uiMode & 48) == 32;
        }

        public static /* synthetic */ FlexFormatter injectMetric(ActivityMutator activityMutator, int i, int i2, TouchRecord touchRecord, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                touchRecord = new TouchRecord() { // from class: com.goldenboot.saga.zone.LongPressStack
                    @Override // com.goldenboot.saga.zone.TouchRecord
                    public final Object invoke(Object obj2) {
                        boolean detachStream;
                        detachStream = FlexFormatter.ActivityMutator.detachStream((Resources) obj2);
                        return Boolean.valueOf(detachStream);
                    }
                };
            }
            return activityMutator.growPayload(i, i2, touchRecord);
        }

        public final FlexFormatter growPayload(int i, int i2, TouchRecord detectDarkMode) {
            Intrinsics.checkNotNullParameter(detectDarkMode, "detectDarkMode");
            return new FlexFormatter(i, i2, 0, detectDarkMode, null);
        }

        public ActivityMutator() {
        }
    }

    public /* synthetic */ FlexFormatter(int i, int i2, int i3, TouchRecord touchRecord, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, touchRecord);
    }

    public final int detachStream(boolean z) {
        if (this.injectMetric == 0) {
            return 0;
        }
        return z ? this.growPayload : this.evictLayout;
    }

    public final TouchRecord evictLayout() {
        return this.detachStream;
    }

    public final int growPayload() {
        return this.injectMetric;
    }

    public final int injectMetric(boolean z) {
        return z ? this.growPayload : this.evictLayout;
    }

    public FlexFormatter(int i, int i2, int i3, TouchRecord touchRecord) {
        this.evictLayout = i;
        this.growPayload = i2;
        this.injectMetric = i3;
        this.detachStream = touchRecord;
    }
}
