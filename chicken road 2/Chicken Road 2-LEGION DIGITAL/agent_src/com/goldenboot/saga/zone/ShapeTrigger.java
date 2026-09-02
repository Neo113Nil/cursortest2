package com.goldenboot.saga.zone;

import androidx.compose.ui.RemoteCallback;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u00012\u00020\u0002J+\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR$\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/ShapeTrigger;", "Lcom/goldenboot/saga/zone/RuntimeFetcher;", "Lcom/goldenboot/saga/zone/CachedDeserializer;", "T", "Lcom/goldenboot/saga/zone/VibrationParser;", "key", "value", "Lcom/goldenboot/saga/zone/DpadBuilder;", "filterSignature", "(Lcom/goldenboot/saga/zone/VibrationParser;Ljava/lang/Object;)V", "Lcom/goldenboot/saga/zone/ServerCallback;", "stopLocale", "()Lcom/goldenboot/saga/zone/ServerCallback;", "providedValues", "updateAction", "(Lcom/goldenboot/saga/zone/VibrationParser;)Ljava/lang/Object;", "current", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ShapeTrigger extends RuntimeFetcher, CachedDeserializer {
    default <T> void filterSignature(VibrationParser<T> key, T value) {
        if (!(stopLocale() != SystemTable.growPayload)) {
            PagerBridge.flushSample("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!stopLocale().evictLayout(key)) {
            PagerBridge.flushSample("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + key + " was not found.");
        }
        stopLocale().injectMetric(key, value);
    }

    default ServerCallback stopLocale() {
        return SystemTable.growPayload;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.RemoteCallback$LayerUseCase] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.RemoteCallback$LayerUseCase] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.goldenboot.saga.zone.PluginScheduler] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.goldenboot.saga.zone.PluginScheduler] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // com.goldenboot.saga.zone.RuntimeFetcher
    default <T> T updateAction(VibrationParser<T> vibrationParser) {
        MenuPage nodes;
        if (!getNode().getIsAttached()) {
            PagerBridge.flushSample("ModifierLocal accessed from an unattached node");
        }
        int growPayload = AlphaScheduler.growPayload(32);
        if (!getNode().getIsAttached()) {
            PagerBridge.applyTask("visitAncestors called on an unattached node");
        }
        RemoteCallback.LayerUseCase parent = getNode().getParent();
        ContentRepository purgeNode = LayoutConstructor.purgeNode(this);
        while (purgeNode != null) {
            if ((purgeNode.getNodes().getHead().getAggregateChildKindSet() & growPayload) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & growPayload) != 0) {
                        ItemMapper itemMapper = parent;
                        ?? r4 = 0;
                        while (itemMapper != 0) {
                            if (itemMapper instanceof ShapeTrigger) {
                                ShapeTrigger shapeTrigger = (ShapeTrigger) itemMapper;
                                if (shapeTrigger.stopLocale().evictLayout(vibrationParser)) {
                                    return (T) shapeTrigger.stopLocale().growPayload(vibrationParser);
                                }
                            } else if ((itemMapper.getKindSet() & growPayload) != 0 && (itemMapper instanceof ItemMapper)) {
                                RemoteCallback.LayerUseCase delegate = itemMapper.getDelegate();
                                int i = 0;
                                itemMapper = itemMapper;
                                r4 = r4;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & growPayload) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            itemMapper = delegate;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new PluginScheduler(new RemoteCallback.LayerUseCase[16], 0);
                                            }
                                            if (itemMapper != 0) {
                                                r4.growPayload(itemMapper);
                                                itemMapper = 0;
                                            }
                                            r4.growPayload(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    itemMapper = itemMapper;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            itemMapper = LayoutConstructor.serializeOffset(r4);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            purgeNode = purgeNode.acquireAsset();
            parent = (purgeNode == null || (nodes = purgeNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return (T) vibrationParser.getDefaultFactory().invoke();
    }
}
