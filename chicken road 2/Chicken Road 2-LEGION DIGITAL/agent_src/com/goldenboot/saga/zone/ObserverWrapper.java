package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.AttrSemaphore;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class ObserverWrapper {
    public static final RowMutex evictLayout = new RowMutex("UNDEFINED");
    public static final RowMutex growPayload = new RowMutex("REUSABLE_CLAIMED");

    public static final void growPayload(ServiceRegulator serviceRegulator, Object obj) {
        if (!(serviceRegulator instanceof TriggerConstructor)) {
            serviceRegulator.resumeWith(obj);
            return;
        }
        TriggerConstructor triggerConstructor = (TriggerConstructor) serviceRegulator;
        Object growPayload2 = LayerFetcher.growPayload(obj);
        if (triggerConstructor.attachConfig.connectComponent(triggerConstructor.getContext())) {
            triggerConstructor.inflateAdapter = growPayload2;
            triggerConstructor.connectPatch = 1;
            triggerConstructor.attachConfig.unlockMessage(triggerConstructor.getContext(), triggerConstructor);
            return;
        }
        ConnectionDeserializer growPayload3 = PaletteLink.evictLayout.growPayload();
        if (growPayload3.locateSignal()) {
            triggerConstructor.inflateAdapter = growPayload2;
            triggerConstructor.connectPatch = 1;
            growPayload3.serializeTask(triggerConstructor);
            return;
        }
        growPayload3.appendKey(true);
        try {
            DrawableSynthesizer drawableSynthesizer = (DrawableSynthesizer) triggerConstructor.getContext().evictLayout(DrawableSynthesizer.popBlueprint);
            if (drawableSynthesizer == null || drawableSynthesizer.popBlueprint()) {
                ServiceRegulator serviceRegulator2 = triggerConstructor.resetDelta;
                Object obj2 = triggerConstructor.purgeNode;
                LongPressGateway context = serviceRegulator2.getContext();
                Object applyTask = ContainerImpl.applyTask(context, obj2);
                ToolbarRecord peekRevision = applyTask != ContainerImpl.evictLayout ? ListenerCustodian.peekRevision(serviceRegulator2, context, applyTask) : null;
                try {
                    triggerConstructor.resetDelta.resumeWith(obj);
                    DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
                } finally {
                    if (peekRevision == null || peekRevision.escapeBounds()) {
                        ContainerImpl.clipOrigin(context, applyTask);
                    }
                }
            } else {
                CancellationException connectPatch = drawableSynthesizer.connectPatch();
                triggerConstructor.growPayload(growPayload2, connectPatch);
                AttrSemaphore.ActivityMutator activityMutator = AttrSemaphore.notifyMessage;
                triggerConstructor.resumeWith(AttrSemaphore.growPayload(ColumnForger.evictLayout(connectPatch)));
            }
            while (growPayload3.purgeMetric()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final boolean injectMetric(TriggerConstructor triggerConstructor) {
        DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
        ConnectionDeserializer growPayload2 = PaletteLink.evictLayout.growPayload();
        if (growPayload2.emitStrategy()) {
            return false;
        }
        if (growPayload2.locateSignal()) {
            triggerConstructor.inflateAdapter = dpadBuilder;
            triggerConstructor.connectPatch = 1;
            growPayload2.serializeTask(triggerConstructor);
            return true;
        }
        growPayload2.appendKey(true);
        try {
            triggerConstructor.run();
            do {
            } while (growPayload2.purgeMetric());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
