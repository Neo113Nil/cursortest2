package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/goldenboot/saga/zone/GridPatch;", "", "maxChars", "Lcom/goldenboot/saga/zone/WatcherDelta;", "injectMetric", "(Lcom/goldenboot/saga/zone/GridPatch;I)Lcom/goldenboot/saga/zone/WatcherDelta;", "growPayload", "evictLayout", "(Lcom/goldenboot/saga/zone/GridPatch;)Lcom/goldenboot/saga/zone/WatcherDelta;", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultBucket {
    public static final WatcherDelta evictLayout(TextFieldValue textFieldValue) {
        return textFieldValue.getText().drawRequest(textFieldValue.getSelection());
    }

    public static final WatcherDelta growPayload(TextFieldValue textFieldValue, int i) {
        return textFieldValue.getText().subSequence(StylusEvent.drawField(textFieldValue.getSelection()), Math.min(StylusEvent.drawField(textFieldValue.getSelection()) + i, textFieldValue.peekRevision().length()));
    }

    public static final WatcherDelta injectMetric(TextFieldValue textFieldValue, int i) {
        return textFieldValue.getText().subSequence(Math.max(0, StylusEvent.connectJob(textFieldValue.getSelection()) - i), StylusEvent.connectJob(textFieldValue.getSelection()));
    }
}
