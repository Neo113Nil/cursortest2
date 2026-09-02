package com.goldenboot.saga.zone;

import androidx.compose.ui.RemoteCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0012\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/goldenboot/saga/zone/CachedDeserializer;", "Lkotlin/Function0;", "Lcom/goldenboot/saga/zone/ChipSnapshot;", "bounds", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/CachedDeserializer;Lcom/goldenboot/saga/zone/ElevationNode;Lcom/goldenboot/saga/zone/ServiceRegulator;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClientWorkflow {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/goldenboot/saga/zone/ChipSnapshot;", "evictLayout", "()Lcom/goldenboot/saga/zone/ChipSnapshot;"}, k = 3, mv = {2, 0, 0})
    public static final class ActivityMutator extends Lambda implements ElevationNode {
        final /* synthetic */ PagerReducer notifyMessage;
        final /* synthetic */ ElevationNode reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(ElevationNode elevationNode, PagerReducer pagerReducer) {
            super(0);
            this.reduceScope = elevationNode;
            this.notifyMessage = pagerReducer;
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final ChipSnapshot invoke() {
            ChipSnapshot chipSnapshot;
            ElevationNode elevationNode = this.reduceScope;
            if (elevationNode != null && (chipSnapshot = (ChipSnapshot) elevationNode.invoke()) != null) {
                return chipSnapshot;
            }
            PagerReducer pagerReducer = this.notifyMessage;
            if (!pagerReducer.popBlueprint()) {
                pagerReducer = null;
            }
            if (pagerReducer != null) {
                return FocusCounter.peekRevision(ProgressPatch.updateTimer(pagerReducer.applyTask()));
            }
            return null;
        }
    }

    public static final Object evictLayout(CachedDeserializer cachedDeserializer, ElevationNode elevationNode, ServiceRegulator serviceRegulator) {
        Object obj;
        MenuPage nodes;
        if (!cachedDeserializer.getNode().getIsAttached()) {
            return DpadBuilder.evictLayout;
        }
        int growPayload = AlphaScheduler.growPayload(ContentOperation.BlendMode);
        if (!cachedDeserializer.getNode().getIsAttached()) {
            PagerBridge.applyTask("visitAncestors called on an unattached node");
        }
        RemoteCallback.LayerUseCase parent = cachedDeserializer.getNode().getParent();
        ContentRepository purgeNode = LayoutConstructor.purgeNode(cachedDeserializer);
        loop0: while (true) {
            obj = null;
            if (purgeNode == null) {
                break;
            }
            if ((purgeNode.getNodes().getHead().getAggregateChildKindSet() & growPayload) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & growPayload) != 0) {
                        RemoteCallback.LayerUseCase layerUseCase = parent;
                        PluginScheduler pluginScheduler = null;
                        while (layerUseCase != null) {
                            if (layerUseCase instanceof ListRecovery) {
                                obj = layerUseCase;
                                break loop0;
                            }
                            if ((layerUseCase.getKindSet() & growPayload) != 0 && (layerUseCase instanceof ItemMapper)) {
                                int i = 0;
                                for (RemoteCallback.LayerUseCase delegate = ((ItemMapper) layerUseCase).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & growPayload) != 0) {
                                        i++;
                                        if (i == 1) {
                                            layerUseCase = delegate;
                                        } else {
                                            if (pluginScheduler == null) {
                                                pluginScheduler = new PluginScheduler(new RemoteCallback.LayerUseCase[16], 0);
                                            }
                                            if (layerUseCase != null) {
                                                WindowRevision.evictLayout(pluginScheduler.growPayload(layerUseCase));
                                                layerUseCase = null;
                                            }
                                            WindowRevision.evictLayout(pluginScheduler.growPayload(delegate));
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            layerUseCase = LayoutConstructor.serializeOffset(pluginScheduler);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            purgeNode = purgeNode.acquireAsset();
            parent = (purgeNode == null || (nodes = purgeNode.getNodes()) == null) ? null : nodes.getTail();
        }
        ListRecovery listRecovery = (ListRecovery) obj;
        if (listRecovery == null) {
            return DpadBuilder.evictLayout;
        }
        PagerReducer resetDelta = LayoutConstructor.resetDelta(cachedDeserializer);
        Object resolveParams = listRecovery.resolveParams(resetDelta, new ActivityMutator(elevationNode, resetDelta), serviceRegulator);
        return resolveParams == RotateReceiver.releaseHeader() ? resolveParams : DpadBuilder.evictLayout;
    }

    public static /* synthetic */ Object growPayload(CachedDeserializer cachedDeserializer, ElevationNode elevationNode, ServiceRegulator serviceRegulator, int i, Object obj) {
        if ((i & 1) != 0) {
            elevationNode = null;
        }
        return evictLayout(cachedDeserializer, elevationNode, serviceRegulator);
    }
}
