package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/goldenboot/saga/zone/ColumnWriter;", "start", "stop", "", "fraction", "evictLayout", "(Lcom/goldenboot/saga/zone/ColumnWriter;Lcom/goldenboot/saga/zone/ColumnWriter;F)Lcom/goldenboot/saga/zone/ColumnWriter;", "ui-graphics_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClickSteward {
    public static final Shadow evictLayout(Shadow shadow, Shadow shadow2, float f) {
        return new Shadow(BoxSaver.connectPatch(shadow.getColor(), shadow2.getColor(), f), FadeDispatcher.updateTimer(shadow.getOffset(), shadow2.getOffset(), f), PlatformController.attachConfig(shadow.getBlurRadius(), shadow2.getBlurRadius(), f), null);
    }
}
