package com.goldenboot.saga.zone;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class SaveRepository extends PanelBarrier {
    public int applyTask;
    public Object connectJob;
    public AccentSequence drawField;
    public final List peekRevision;
    public String popBlueprint;
    public final ConsumerSupervisor updateTimer;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements TouchRecord {
        public static final ActivityMutator reduceScope = new ActivityMutator();

        public ActivityMutator() {
            super(1);
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final String invoke(ListSwitch it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String flattenPackage = it.flattenPackage();
            Intrinsics.checkNotNull(flattenPackage);
            return flattenPackage;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveRepository(ConsumerSupervisor provider, String startDestination, String str) {
        super(provider.detachStream(ClientPatch.class), str);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        this.peekRevision = new ArrayList();
        this.updateTimer = provider;
        this.popBlueprint = startDestination;
    }

    @Override // com.goldenboot.saga.zone.PanelBarrier
    /* renamed from: clipOrigin, reason: merged with bridge method [inline-methods] */
    public BackgroundArranger growPayload() {
        BackgroundArranger backgroundArranger = (BackgroundArranger) super.growPayload();
        backgroundArranger.attachCallback(this.peekRevision);
        int i = this.applyTask;
        if (i == 0 && this.popBlueprint == null && this.drawField == null && this.connectJob == null) {
            if (detachStream() != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        String str = this.popBlueprint;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            backgroundArranger.computeTarget(str);
            return backgroundArranger;
        }
        AccentSequence accentSequence = this.drawField;
        if (accentSequence != null) {
            Intrinsics.checkNotNull(accentSequence);
            backgroundArranger.injectField(EmitterInitializer.evictLayout(accentSequence), ActivityMutator.reduceScope);
            return backgroundArranger;
        }
        Object obj = this.connectJob;
        if (obj == null) {
            backgroundArranger.serializeTask(i);
            return backgroundArranger;
        }
        Intrinsics.checkNotNull(obj);
        backgroundArranger.appendKey(obj);
        return backgroundArranger;
    }

    public final void flushSample(PanelBarrier navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "navDestination");
        this.peekRevision.add(navDestination.growPayload());
    }

    public final ConsumerSupervisor updateTimer() {
        return this.updateTimer;
    }
}
