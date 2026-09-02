package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/DialogRepository;", "", "Lcom/goldenboot/saga/zone/ConnectionMemento;", "anchorBounds", "Lcom/goldenboot/saga/zone/ScaleSaver;", "windowSize", "Lcom/goldenboot/saga/zone/LabelCache;", "layoutDirection", "popupContentSize", "Lcom/goldenboot/saga/zone/FontReporter;", "evictLayout", "(Lcom/goldenboot/saga/zone/ConnectionMemento;JLcom/goldenboot/saga/zone/LabelCache;J)J", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DialogRepository {
    long evictLayout(ConnectionMemento anchorBounds, long windowSize, LabelCache layoutDirection, long popupContentSize);
}
