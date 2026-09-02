package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/goldenboot/saga/zone/ComponentTranslator;", "Lcom/goldenboot/saga/zone/DoubleTapChannel;", "<init>", "()V", "Landroidx/compose/ui/layout/DimenSensor;", "detachStream", "()Landroidx/compose/ui/layout/DimenSensor;", "source", "growPayload", "target", "", "isVisible", "()Z", "releaseHeader", "isAnimating", "", "clipOrigin", "()F", "fraction", "", "injectMetric", "()J", "durationMillis", "evictLayout", "alpha", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComponentTranslator implements DoubleTapChannel {
    public static final ComponentTranslator evictLayout = new ComponentTranslator();
    public static final int growPayload = 0;

    private ComponentTranslator() {
    }

    @Override // com.goldenboot.saga.zone.DoubleTapChannel
    public float clipOrigin() {
        return 0.0f;
    }

    @Override // com.goldenboot.saga.zone.DoubleTapChannel
    public androidx.compose.ui.layout.DimenSensor detachStream() {
        return androidx.compose.ui.layout.NavBarOrchestrator.growPayload();
    }

    @Override // com.goldenboot.saga.zone.DoubleTapChannel
    public float evictLayout() {
        return 1.0f;
    }

    @Override // com.goldenboot.saga.zone.DoubleTapChannel
    public androidx.compose.ui.layout.DimenSensor growPayload() {
        return androidx.compose.ui.layout.NavBarOrchestrator.growPayload();
    }

    @Override // com.goldenboot.saga.zone.DoubleTapChannel
    public long injectMetric() {
        return 0L;
    }

    @Override // com.goldenboot.saga.zone.DoubleTapChannel
    public boolean isVisible() {
        return true;
    }

    @Override // com.goldenboot.saga.zone.DoubleTapChannel
    public boolean releaseHeader() {
        return false;
    }
}
