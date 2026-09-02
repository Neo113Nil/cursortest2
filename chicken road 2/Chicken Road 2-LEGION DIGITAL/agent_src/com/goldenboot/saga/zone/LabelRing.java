package com.goldenboot.saga.zone;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class LabelRing extends ProgressPipe {
    public boolean clipOrigin;
    public final int detachStream;
    public final OnBackInvokedDispatcher injectMetric;
    public final OnBackInvokedCallback releaseHeader;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator implements OnBackAnimationCallback {
        public ActivityMutator() {
        }

        public void onBackCancelled() {
            LabelRing.this.evictLayout();
        }

        public void onBackInvoked() {
            LabelRing.this.growPayload();
        }

        public void onBackProgressed(BackEvent backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            LabelRing.this.injectMetric(FeedbackFacilitator.evictLayout(backEvent));
        }

        public void onBackStarted(BackEvent backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            LabelRing.this.detachStream(FeedbackFacilitator.evictLayout(backEvent));
        }
    }

    public /* synthetic */ LabelRing(OnBackInvokedDispatcher onBackInvokedDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(onBackInvokedDispatcher, i);
    }

    public static final void reduceScope(LabelRing labelRing) {
        labelRing.growPayload();
    }

    public final void notifyMessage(boolean z) {
        if (z && !this.clipOrigin) {
            this.injectMetric.registerOnBackInvokedCallback(this.detachStream, this.releaseHeader);
            this.clipOrigin = true;
        } else {
            if (z || !this.clipOrigin) {
                return;
            }
            this.injectMetric.unregisterOnBackInvokedCallback(this.releaseHeader);
            this.clipOrigin = false;
        }
    }

    @Override // com.goldenboot.saga.zone.ProgressPipe
    public void popBlueprint(boolean z) {
        notifyMessage(z);
    }

    public final OnBackInvokedCallback serializeOffset() {
        return PlatformMeter.evictLayout(new ActivityMutator());
    }

    public LabelRing(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.injectMetric = onBackInvokedDispatcher;
        this.detachStream = i;
        this.releaseHeader = Build.VERSION.SDK_INT == 33 ? new OnBackInvokedCallback() { // from class: com.goldenboot.saga.zone.ViewBackup
            public final void onBackInvoked() {
                LabelRing.reduceScope(LabelRing.this);
            }
        } : serializeOffset();
    }
}
