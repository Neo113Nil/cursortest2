package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004\u0082\u0001\u0002\t\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/TimelineSensor;", "Lcom/goldenboot/saga/zone/ProducerRecovery;", "Lcom/goldenboot/saga/zone/PagerPlanner;", "formatMetadata", "()J", "lookaheadConstraints", "Lcom/goldenboot/saga/zone/ScaleSaver;", "transformCurrency", "lookaheadSize", "Landroidx/compose/ui/layout/ActivityMutator;", "Lcom/goldenboot/saga/zone/SnackbarProvider;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TimelineSensor extends ProducerRecovery {
    long formatMetadata();

    long transformCurrency();
}
