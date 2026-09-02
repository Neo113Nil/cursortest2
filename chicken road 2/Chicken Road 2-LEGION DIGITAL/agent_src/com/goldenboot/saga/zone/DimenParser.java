package com.goldenboot.saga.zone;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class DimenParser {
    public static final ActivityMutator reduceScope = new ActivityMutator(null);
    public static final DimenParser notifyMessage = SnackbarTrigger.evictLayout.growPayload();

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends DimenParser implements Serializable {
        public /* synthetic */ ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.goldenboot.saga.zone.DimenParser
        public int clipOrigin(int i, int i2) {
            return DimenParser.notifyMessage.clipOrigin(i, i2);
        }

        @Override // com.goldenboot.saga.zone.DimenParser
        public int detachStream() {
            return DimenParser.notifyMessage.detachStream();
        }

        @Override // com.goldenboot.saga.zone.DimenParser
        public int growPayload(int i) {
            return DimenParser.notifyMessage.growPayload(i);
        }

        @Override // com.goldenboot.saga.zone.DimenParser
        public float injectMetric() {
            return DimenParser.notifyMessage.injectMetric();
        }

        @Override // com.goldenboot.saga.zone.DimenParser
        public int releaseHeader(int i) {
            return DimenParser.notifyMessage.releaseHeader(i);
        }

        public ActivityMutator() {
        }
    }

    public int clipOrigin(int i, int i2) {
        int detachStream;
        int i3;
        int i4;
        JoystickForger.injectMetric(i, i2);
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i4 = growPayload(JoystickForger.detachStream(i5));
            } else {
                do {
                    detachStream = detachStream() >>> 1;
                    i3 = detachStream % i5;
                } while ((detachStream - i3) + (i5 - 1) < 0);
                i4 = i3;
            }
            return i + i4;
        }
        while (true) {
            int detachStream2 = detachStream();
            if (i <= detachStream2 && detachStream2 < i2) {
                return detachStream2;
            }
        }
    }

    public abstract int detachStream();

    public abstract int growPayload(int i);

    public float injectMetric() {
        return growPayload(24) / 1.6777216E7f;
    }

    public int releaseHeader(int i) {
        return clipOrigin(0, i);
    }
}
