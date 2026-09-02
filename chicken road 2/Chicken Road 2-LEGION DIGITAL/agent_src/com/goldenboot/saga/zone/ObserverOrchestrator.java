package com.goldenboot.saga.zone;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class ObserverOrchestrator {
    public static int flushSample;
    public int detachStream;
    public int growPayload;
    public ArrayList evictLayout = new ArrayList();
    public boolean injectMetric = false;
    public ArrayList releaseHeader = null;
    public int clipOrigin = -1;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class ActivityMutator {
        public int clipOrigin;
        public int detachStream;
        public WeakReference evictLayout;
        public int flushSample;
        public int growPayload;
        public int injectMetric;
        public int releaseHeader;

        public ActivityMutator(ObserverHerald observerHerald, ClipboardMutex clipboardMutex, int i) {
            this.evictLayout = new WeakReference(observerHerald);
            this.growPayload = clipboardMutex.drawScope(observerHerald.mapJob);
            this.injectMetric = clipboardMutex.drawScope(observerHerald.attachCallback);
            this.detachStream = clipboardMutex.drawScope(observerHerald.prepareTask);
            this.releaseHeader = clipboardMutex.drawScope(observerHerald.updateAction);
            this.clipOrigin = clipboardMutex.drawScope(observerHerald.connectComponent);
            this.flushSample = i;
        }
    }

    public ObserverOrchestrator(int i) {
        int i2 = flushSample;
        flushSample = i2 + 1;
        this.growPayload = i2;
        this.detachStream = i;
    }

    public void applyTask(int i) {
        this.detachStream = i;
    }

    public int clipOrigin(ClipboardMutex clipboardMutex, int i) {
        if (this.evictLayout.size() == 0) {
            return 0;
        }
        return popBlueprint(clipboardMutex, this.evictLayout, i);
    }

    public int detachStream() {
        return this.detachStream;
    }

    public boolean evictLayout(ObserverHerald observerHerald) {
        if (this.evictLayout.contains(observerHerald)) {
            return false;
        }
        this.evictLayout.add(observerHerald);
        return true;
    }

    public void flushSample(int i, ObserverOrchestrator observerOrchestrator) {
        ArrayList arrayList = this.evictLayout;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ObserverHerald observerHerald = (ObserverHerald) obj;
            observerOrchestrator.evictLayout(observerHerald);
            if (i == 0) {
                observerHerald.syncPool = observerOrchestrator.injectMetric();
            } else {
                observerHerald.acquireAsset = observerOrchestrator.injectMetric();
            }
        }
        this.clipOrigin = observerOrchestrator.growPayload;
    }

    public void growPayload(ArrayList arrayList) {
        int size = this.evictLayout.size();
        if (this.clipOrigin != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                ObserverOrchestrator observerOrchestrator = (ObserverOrchestrator) arrayList.get(i);
                if (this.clipOrigin == observerOrchestrator.growPayload) {
                    flushSample(this.detachStream, observerOrchestrator);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int injectMetric() {
        return this.growPayload;
    }

    public final int popBlueprint(ClipboardMutex clipboardMutex, ArrayList arrayList, int i) {
        int drawScope;
        int drawScope2;
        AnchorLauncher anchorLauncher = (AnchorLauncher) ((ObserverHerald) arrayList.get(0)).unlockMessage();
        clipboardMutex.injectConstraint();
        anchorLauncher.flushSample(clipboardMutex, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((ObserverHerald) arrayList.get(i2)).flushSample(clipboardMutex, false);
        }
        if (i == 0 && anchorLauncher.trimState > 0) {
            FlexState.growPayload(anchorLauncher, clipboardMutex, arrayList, 0);
        }
        if (i == 1 && anchorLauncher.escapeBounds > 0) {
            FlexState.growPayload(anchorLauncher, clipboardMutex, arrayList, 1);
        }
        try {
            clipboardMutex.findTask();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.releaseHeader = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.releaseHeader.add(new ActivityMutator((ObserverHerald) arrayList.get(i3), clipboardMutex, i));
        }
        if (i == 0) {
            drawScope = clipboardMutex.drawScope(anchorLauncher.mapJob);
            drawScope2 = clipboardMutex.drawScope(anchorLauncher.prepareTask);
            clipboardMutex.injectConstraint();
        } else {
            drawScope = clipboardMutex.drawScope(anchorLauncher.attachCallback);
            drawScope2 = clipboardMutex.drawScope(anchorLauncher.updateAction);
            clipboardMutex.injectConstraint();
        }
        return drawScope2 - drawScope;
    }

    public final String releaseHeader() {
        int i = this.detachStream;
        return i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown";
    }

    public String toString() {
        String str = releaseHeader() + " [" + this.growPayload + "] <";
        ArrayList arrayList = this.evictLayout;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            str = str + " " + ((ObserverHerald) obj).inflateAdapter();
        }
        return str + " >";
    }

    public void updateTimer(boolean z) {
        this.injectMetric = z;
    }
}
