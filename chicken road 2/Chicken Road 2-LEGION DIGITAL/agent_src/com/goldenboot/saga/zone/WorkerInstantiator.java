package com.goldenboot.saga.zone;

import android.view.KeyEvent;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\u000b\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\"\u0015\u0010\u000f\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0015\u0010\u0011\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\"\u0015\u0010\u0013\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e\"\u0015\u0010\u0015\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e*\n\u0010\u0017\"\u00020\u00162\u00020\u0016¨\u0006\u0018"}, d2 = {"Lcom/goldenboot/saga/zone/FeedbackHeap;", "Lcom/goldenboot/saga/zone/RuntimeCreator;", "evictLayout", "(Landroid/view/KeyEvent;)J", "key", "", "injectMetric", "(Landroid/view/KeyEvent;)I", "utf16CodePoint", "Lcom/goldenboot/saga/zone/SingletonImpl;", "growPayload", "type", "", "detachStream", "(Landroid/view/KeyEvent;)Z", "isAltPressed", "releaseHeader", "isCtrlPressed", "clipOrigin", "isMetaPressed", "flushSample", "isShiftPressed", "Landroid/view/KeyEvent;", "NativeKeyEvent", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WorkerInstantiator {
    public static final boolean clipOrigin(KeyEvent keyEvent) {
        return keyEvent.isMetaPressed();
    }

    public static final boolean detachStream(KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    public static final long evictLayout(KeyEvent keyEvent) {
        return ObserverMaintainer.evictLayout(keyEvent.getKeyCode());
    }

    public static final boolean flushSample(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }

    public static final int growPayload(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        return action != 0 ? action != 1 ? SingletonImpl.INSTANCE.injectMetric() : SingletonImpl.INSTANCE.growPayload() : SingletonImpl.INSTANCE.evictLayout();
    }

    public static final int injectMetric(KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    public static final boolean releaseHeader(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }
}
