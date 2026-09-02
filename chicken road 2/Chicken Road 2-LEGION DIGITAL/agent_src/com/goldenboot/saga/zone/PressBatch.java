package com.goldenboot.saga.zone;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\t\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\".\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \"\u0014\u0010%\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/goldenboot/saga/zone/ViewStreamer;", "other", "Lcom/goldenboot/saga/zone/DpadBuilder;", "applyTask", "([F[F)V", "", "x", "y", "tmpMatrix", "popBlueprint", "([FFF[F)V", "m1", "", "row", "m2", "column", "clipOrigin", "([FI[FI)F", "Landroid/view/View;", "", "releaseHeader", "(Landroid/view/View;Landroid/view/View;)Z", "Lcom/goldenboot/saga/zone/InterpolatorProbe;", "flushSample", "(Landroid/view/View;)Lcom/goldenboot/saga/zone/InterpolatorProbe;", "Lkotlin/Function1;", "Lcom/goldenboot/saga/zone/GroupReporter;", "evictLayout", "Lcom/goldenboot/saga/zone/TouchRecord;", "updateTimer", "()Lcom/goldenboot/saga/zone/TouchRecord;", "drawField", "(Lcom/goldenboot/saga/zone/TouchRecord;)V", "platformTextInputServiceInterceptor", "", "growPayload", "J", "ONE_FRAME_120_HERTZ_IN_MILLISECONDS", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PressBatch {
    private static TouchRecord evictLayout = ActivityMutator.reduceScope;
    private static final long growPayload = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyTask(float[] fArr, float[] fArr2) {
        float clipOrigin = clipOrigin(fArr2, 0, fArr, 0);
        float clipOrigin2 = clipOrigin(fArr2, 0, fArr, 1);
        float clipOrigin3 = clipOrigin(fArr2, 0, fArr, 2);
        float clipOrigin4 = clipOrigin(fArr2, 0, fArr, 3);
        float clipOrigin5 = clipOrigin(fArr2, 1, fArr, 0);
        float clipOrigin6 = clipOrigin(fArr2, 1, fArr, 1);
        float clipOrigin7 = clipOrigin(fArr2, 1, fArr, 2);
        float clipOrigin8 = clipOrigin(fArr2, 1, fArr, 3);
        float clipOrigin9 = clipOrigin(fArr2, 2, fArr, 0);
        float clipOrigin10 = clipOrigin(fArr2, 2, fArr, 1);
        float clipOrigin11 = clipOrigin(fArr2, 2, fArr, 2);
        float clipOrigin12 = clipOrigin(fArr2, 2, fArr, 3);
        float clipOrigin13 = clipOrigin(fArr2, 3, fArr, 0);
        float clipOrigin14 = clipOrigin(fArr2, 3, fArr, 1);
        float clipOrigin15 = clipOrigin(fArr2, 3, fArr, 2);
        float clipOrigin16 = clipOrigin(fArr2, 3, fArr, 3);
        fArr[0] = clipOrigin;
        fArr[1] = clipOrigin2;
        fArr[2] = clipOrigin3;
        fArr[3] = clipOrigin4;
        fArr[4] = clipOrigin5;
        fArr[5] = clipOrigin6;
        fArr[6] = clipOrigin7;
        fArr[7] = clipOrigin8;
        fArr[8] = clipOrigin9;
        fArr[9] = clipOrigin10;
        fArr[10] = clipOrigin11;
        fArr[11] = clipOrigin12;
        fArr[12] = clipOrigin13;
        fArr[13] = clipOrigin14;
        fArr[14] = clipOrigin15;
        fArr[15] = clipOrigin16;
    }

    private static final float clipOrigin(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3] * fArr2[i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 3] * fArr2[12 + i2]);
    }

    public static final void drawField(TouchRecord touchRecord) {
        evictLayout = touchRecord;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterpolatorProbe flushSample(View view) {
        ClickBeacon.injectMetric(view, 1);
        return ClickBeacon.growPayload(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void popBlueprint(float[] fArr, float f, float f2, float[] fArr2) {
        ViewStreamer.peekRevision(fArr2);
        ViewStreamer.expandArgs(fArr2, f, f2, 0.0f, 4, null);
        applyTask(fArr, fArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean releaseHeader(View view, View view2) {
        if (Intrinsics.areEqual(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final TouchRecord updateTimer() {
        return evictLayout;
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/goldenboot/saga/zone/GroupReporter;", "it", "evictLayout", "(Lcom/goldenboot/saga/zone/GroupReporter;)Lcom/goldenboot/saga/zone/GroupReporter;"}, k = 3, mv = {2, 0, 0})
    public static final class ActivityMutator extends Lambda implements TouchRecord {
        public static final ActivityMutator reduceScope = new ActivityMutator();

        public ActivityMutator() {
            super(1);
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final GroupReporter invoke(GroupReporter groupReporter) {
            return groupReporter;
        }
    }
}
