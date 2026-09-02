package com.goldenboot.saga.zone;

import androidx.compose.ui.RemoteCallback;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/goldenboot/saga/zone/CachedDeserializer;", "Landroidx/compose/ui/RemoteCallback$LayerUseCase;", "growPayload", "(Lcom/goldenboot/saga/zone/CachedDeserializer;)Landroidx/compose/ui/RemoteCallback$LayerUseCase;", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShadowShaper {
    /* JADX INFO: Access modifiers changed from: private */
    public static final RemoteCallback.LayerUseCase growPayload(CachedDeserializer cachedDeserializer) {
        int growPayload = AlphaScheduler.growPayload(4);
        int growPayload2 = AlphaScheduler.growPayload(2);
        RemoteCallback.LayerUseCase child = cachedDeserializer.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & growPayload) == 0) {
            return null;
        }
        while (child != null && (child.getKindSet() & growPayload2) == 0) {
            if ((child.getKindSet() & growPayload) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}
