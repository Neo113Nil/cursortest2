package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public interface RemoteEmitter {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public static ClickLauncher evictLayout(RemoteEmitter remoteEmitter, ScaleMutator descriptor, int i) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return remoteEmitter.serializeOffset(descriptor);
        }

        public static void growPayload(RemoteEmitter remoteEmitter, InterpolatorBeacon serializer, Object obj) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            serializer.injectMetric(remoteEmitter, obj);
        }
    }

    void applyTask(float f);

    void attachConfig(int i);

    void connectJob(ScaleMutator scaleMutator, int i);

    void decodePath(String str);

    void detachStream(byte b);

    void drawField(char c);

    void drawRequest(long j);

    ClickLauncher gatherAdapter(ScaleMutator scaleMutator, int i);

    void growPayload(double d);

    void injectMetric(short s);

    MotionSequence popBlueprint();

    void releaseHeader(boolean z);

    ClickLauncher serializeOffset(ScaleMutator scaleMutator);
}
