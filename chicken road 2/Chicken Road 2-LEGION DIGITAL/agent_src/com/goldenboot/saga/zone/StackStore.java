package com.goldenboot.saga.zone;

import androidx.compose.ui.draw.BlockDropShadowElement;
import androidx.compose.ui.draw.BlockInnerShadowElement;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.ui.draw.SimpleDropShadowElement;
import androidx.compose.ui.draw.SimpleInnerShadowElement;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aC\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a/\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0018\u0010\u0011\u001a/\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00140\u0012H\u0007¢\u0006\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/RemoteCallback;", "Lcom/goldenboot/saga/zone/InsetsEdge;", "elevation", "Lcom/goldenboot/saga/zone/ChannelCollector;", "shape", "", "clip", "flushSample", "(Landroidx/compose/ui/RemoteCallback;FLcom/goldenboot/saga/zone/ChannelCollector;Z)Landroidx/compose/ui/RemoteCallback;", "Lcom/goldenboot/saga/zone/ContainerSource;", "ambientColor", "spotColor", "releaseHeader", "(Landroidx/compose/ui/RemoteCallback;FLcom/goldenboot/saga/zone/ChannelCollector;ZJJ)Landroidx/compose/ui/RemoteCallback;", "Lcom/goldenboot/saga/zone/EmbeddedUploader;", "shadow", "growPayload", "(Landroidx/compose/ui/RemoteCallback;Lcom/goldenboot/saga/zone/ChannelCollector;Lcom/goldenboot/saga/zone/EmbeddedUploader;)Landroidx/compose/ui/RemoteCallback;", "Lkotlin/Function1;", "Lcom/goldenboot/saga/zone/AlphaBlock;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "block", "evictLayout", "(Landroidx/compose/ui/RemoteCallback;Lcom/goldenboot/saga/zone/ChannelCollector;Lcom/goldenboot/saga/zone/TouchRecord;)Landroidx/compose/ui/RemoteCallback;", "detachStream", "Lcom/goldenboot/saga/zone/CoreNegotiator;", "injectMetric", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StackStore {
    public static /* synthetic */ androidx.compose.ui.RemoteCallback clipOrigin(androidx.compose.ui.RemoteCallback remoteCallback, float f, ChannelCollector channelCollector, boolean z, long j, long j2, int i, Object obj) {
        boolean z2;
        ChannelCollector evictLayout = (i & 2) != 0 ? ClientTunnel.evictLayout() : channelCollector;
        if ((i & 4) != 0) {
            z2 = false;
            if (InsetsEdge.popBlueprint(f, InsetsEdge.drawField(0)) > 0) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        return releaseHeader(remoteCallback, f, evictLayout, z2, (i & 8) != 0 ? WrapperSignal.growPayload() : j, (i & 16) != 0 ? WrapperSignal.growPayload() : j2);
    }

    public static final androidx.compose.ui.RemoteCallback detachStream(androidx.compose.ui.RemoteCallback remoteCallback, ChannelCollector channelCollector, ShadowParams shadowParams) {
        return remoteCallback.serializeOffset(new SimpleInnerShadowElement(channelCollector, shadowParams));
    }

    public static final androidx.compose.ui.RemoteCallback evictLayout(androidx.compose.ui.RemoteCallback remoteCallback, ChannelCollector channelCollector, TouchRecord touchRecord) {
        return remoteCallback.serializeOffset(new BlockDropShadowElement(channelCollector, touchRecord));
    }

    @ReceiverAdministrator
    public static final /* synthetic */ androidx.compose.ui.RemoteCallback flushSample(androidx.compose.ui.RemoteCallback remoteCallback, float f, ChannelCollector channelCollector, boolean z) {
        return releaseHeader(remoteCallback, f, channelCollector, z, WrapperSignal.growPayload(), WrapperSignal.growPayload());
    }

    public static final androidx.compose.ui.RemoteCallback growPayload(androidx.compose.ui.RemoteCallback remoteCallback, ChannelCollector channelCollector, ShadowParams shadowParams) {
        return remoteCallback.serializeOffset(new SimpleDropShadowElement(channelCollector, shadowParams));
    }

    public static final androidx.compose.ui.RemoteCallback injectMetric(androidx.compose.ui.RemoteCallback remoteCallback, ChannelCollector channelCollector, TouchRecord touchRecord) {
        return remoteCallback.serializeOffset(new BlockInnerShadowElement(channelCollector, touchRecord));
    }

    public static final androidx.compose.ui.RemoteCallback releaseHeader(androidx.compose.ui.RemoteCallback remoteCallback, float f, ChannelCollector channelCollector, boolean z, long j, long j2) {
        return (InsetsEdge.popBlueprint(f, InsetsEdge.drawField((float) 0)) > 0 || z) ? remoteCallback.serializeOffset(new ShadowGraphicsLayerElement(f, channelCollector, z, j, j2, null)) : remoteCallback;
    }

    public static /* synthetic */ androidx.compose.ui.RemoteCallback updateTimer(androidx.compose.ui.RemoteCallback remoteCallback, float f, ChannelCollector channelCollector, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            channelCollector = ClientTunnel.evictLayout();
        }
        if ((i & 4) != 0) {
            z = false;
            if (InsetsEdge.popBlueprint(f, InsetsEdge.drawField(0)) > 0) {
                z = true;
            }
        }
        return flushSample(remoteCallback, f, channelCollector, z);
    }
}
