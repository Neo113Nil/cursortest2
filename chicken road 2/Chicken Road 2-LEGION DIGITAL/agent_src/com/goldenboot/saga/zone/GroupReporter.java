package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@ReceiverAdministrator
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001JM\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\tH&¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\tH&¢\u0006\u0004\b\u0013\u0010\u0010J!\u0010\u0016\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJK\u0010%\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006'À\u0006\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/GroupReporter;", "", "Lcom/goldenboot/saga/zone/GridPatch;", "value", "Lcom/goldenboot/saga/zone/ReceiverSyncer;", "imeOptions", "Lkotlin/Function1;", "", "Lcom/goldenboot/saga/zone/DimenCommand;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "onEditCommand", "Lcom/goldenboot/saga/zone/PaletteHolder;", "onImeActionPerformed", "growPayload", "(Lcom/goldenboot/saga/zone/GridPatch;Lcom/goldenboot/saga/zone/ReceiverSyncer;Lcom/goldenboot/saga/zone/TouchRecord;Lcom/goldenboot/saga/zone/TouchRecord;)V", "evictLayout", "()V", "releaseHeader", "detachStream", "flushSample", "oldValue", "newValue", "clipOrigin", "(Lcom/goldenboot/saga/zone/GridPatch;Lcom/goldenboot/saga/zone/GridPatch;)V", "Lcom/goldenboot/saga/zone/ChipSnapshot;", "rect", "updateTimer", "(Lcom/goldenboot/saga/zone/ChipSnapshot;)V", "textFieldValue", "Lcom/goldenboot/saga/zone/ConsumerAction;", "offsetMapping", "Lcom/goldenboot/saga/zone/OverlayThread;", "textLayoutResult", "Lcom/goldenboot/saga/zone/ViewStreamer;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "injectMetric", "(Lcom/goldenboot/saga/zone/GridPatch;Lcom/goldenboot/saga/zone/ConsumerAction;Lcom/goldenboot/saga/zone/OverlayThread;Lcom/goldenboot/saga/zone/TouchRecord;Lcom/goldenboot/saga/zone/ChipSnapshot;Lcom/goldenboot/saga/zone/ChipSnapshot;)V", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface GroupReporter {
    void clipOrigin(TextFieldValue oldValue, TextFieldValue newValue);

    void detachStream();

    void flushSample();

    void growPayload(TextFieldValue value, ImeOptions imeOptions, TouchRecord onEditCommand, TouchRecord onImeActionPerformed);

    void releaseHeader();

    default void evictLayout() {
    }

    default void updateTimer(ChipSnapshot rect) {
    }

    default void injectMetric(TextFieldValue textFieldValue, ConsumerAction offsetMapping, TextLayoutResult textLayoutResult, TouchRecord textFieldToRootTransform, ChipSnapshot innerTextFieldBounds, ChipSnapshot decorationBoxBounds) {
    }
}
