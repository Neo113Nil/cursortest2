package com.goldenboot.saga.zone;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class TapRegulator {
    public ToastSaver detachStream;
    public Interpolator injectMetric;
    public boolean releaseHeader;
    public long growPayload = -1;
    public final CanvasConstructor clipOrigin = new ActivityMutator();
    public final ArrayList evictLayout = new ArrayList();

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class ActivityMutator extends CanvasConstructor {
        public boolean evictLayout = false;
        public int growPayload = 0;

        public ActivityMutator() {
        }

        public void detachStream() {
            this.growPayload = 0;
            this.evictLayout = false;
            TapRegulator.this.growPayload();
        }

        @Override // com.goldenboot.saga.zone.ToastSaver
        public void growPayload(View view) {
            int i = this.growPayload + 1;
            this.growPayload = i;
            if (i == TapRegulator.this.evictLayout.size()) {
                ToastSaver toastSaver = TapRegulator.this.detachStream;
                if (toastSaver != null) {
                    toastSaver.growPayload(null);
                }
                detachStream();
            }
        }

        @Override // com.goldenboot.saga.zone.CanvasConstructor, com.goldenboot.saga.zone.ToastSaver
        public void injectMetric(View view) {
            if (this.evictLayout) {
                return;
            }
            this.evictLayout = true;
            ToastSaver toastSaver = TapRegulator.this.detachStream;
            if (toastSaver != null) {
                toastSaver.injectMetric(null);
            }
        }
    }

    public TapRegulator clipOrigin(Interpolator interpolator) {
        if (!this.releaseHeader) {
            this.injectMetric = interpolator;
        }
        return this;
    }

    public TapRegulator detachStream(PulseStack pulseStack, PulseStack pulseStack2) {
        this.evictLayout.add(pulseStack);
        pulseStack2.applyTask(pulseStack.detachStream());
        this.evictLayout.add(pulseStack2);
        return this;
    }

    public void evictLayout() {
        if (this.releaseHeader) {
            ArrayList arrayList = this.evictLayout;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((PulseStack) obj).injectMetric();
            }
            this.releaseHeader = false;
        }
    }

    public TapRegulator flushSample(ToastSaver toastSaver) {
        if (!this.releaseHeader) {
            this.detachStream = toastSaver;
        }
        return this;
    }

    public void growPayload() {
        this.releaseHeader = false;
    }

    public TapRegulator injectMetric(PulseStack pulseStack) {
        if (!this.releaseHeader) {
            this.evictLayout.add(pulseStack);
        }
        return this;
    }

    public TapRegulator releaseHeader(long j) {
        if (!this.releaseHeader) {
            this.growPayload = j;
        }
        return this;
    }

    public void updateTimer() {
        if (this.releaseHeader) {
            return;
        }
        ArrayList arrayList = this.evictLayout;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            PulseStack pulseStack = (PulseStack) obj;
            long j = this.growPayload;
            if (j >= 0) {
                pulseStack.releaseHeader(j);
            }
            Interpolator interpolator = this.injectMetric;
            if (interpolator != null) {
                pulseStack.clipOrigin(interpolator);
            }
            if (this.detachStream != null) {
                pulseStack.flushSample(this.clipOrigin);
            }
            pulseStack.drawField();
        }
        this.releaseHeader = true;
    }
}
