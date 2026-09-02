package com.goldenboot.saga.zone;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class EmitterSpawner {
    public static final /* synthetic */ ItemProcessor inflateAdapter;
    public static final /* synthetic */ EmitterSpawner[] resetDelta;
    public static final EmitterSpawner reduceScope = new EmitterSpawner("DEFAULT", 0);
    public static final EmitterSpawner notifyMessage = new EmitterSpawner("LAZY", 1);
    public static final EmitterSpawner connectPatch = new EmitterSpawner("ATOMIC", 2);
    public static final EmitterSpawner attachConfig = new EmitterSpawner("UNDISPATCHED", 3);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public /* synthetic */ class ActivityMutator {
        public static final /* synthetic */ int[] evictLayout;

        static {
            int[] iArr = new int[EmitterSpawner.values().length];
            try {
                iArr[EmitterSpawner.reduceScope.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmitterSpawner.connectPatch.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EmitterSpawner.attachConfig.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EmitterSpawner.notifyMessage.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            evictLayout = iArr;
        }
    }

    static {
        EmitterSpawner[] evictLayout = evictLayout();
        resetDelta = evictLayout;
        inflateAdapter = TranslateConductor.evictLayout(evictLayout);
    }

    public EmitterSpawner(String str, int i) {
    }

    public static final /* synthetic */ EmitterSpawner[] evictLayout() {
        return new EmitterSpawner[]{reduceScope, notifyMessage, connectPatch, attachConfig};
    }

    public static EmitterSpawner valueOf(String str) {
        return (EmitterSpawner) Enum.valueOf(EmitterSpawner.class, str);
    }

    public static EmitterSpawner[] values() {
        return (EmitterSpawner[]) resetDelta.clone();
    }

    public final boolean clipOrigin() {
        return this == notifyMessage;
    }

    public final void releaseHeader(IconExporter iconExporter, Object obj, ServiceRegulator serviceRegulator) {
        int i = ActivityMutator.evictLayout[ordinal()];
        if (i == 1) {
            TileAnalyzer.injectMetric(iconExporter, obj, serviceRegulator);
            return;
        }
        if (i == 2) {
            ServerStep.growPayload(iconExporter, obj, serviceRegulator);
        } else if (i == 3) {
            RegionSteward.evictLayout(iconExporter, obj, serviceRegulator);
        } else if (i != 4) {
            throw new EndpointArchive();
        }
    }
}
