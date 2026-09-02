package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@ReceiverAdministrator
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u001a2\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u00142\u0006\u0010\"\u001a\u00020\u0014¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000b¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u000b¢\u0006\u0004\b'\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R\u0011\u0010+\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010&¨\u0006,"}, d2 = {"Lcom/goldenboot/saga/zone/LayerCache;", "", "Lcom/goldenboot/saga/zone/SlotChunk;", "textInputService", "Lcom/goldenboot/saga/zone/GroupReporter;", "platformTextInputService", "<init>", "(Lcom/goldenboot/saga/zone/SlotChunk;Lcom/goldenboot/saga/zone/GroupReporter;)V", "Lkotlin/Function0;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "block", "", "growPayload", "(Lcom/goldenboot/saga/zone/ElevationNode;)Z", "evictLayout", "()V", "Lcom/goldenboot/saga/zone/ChipSnapshot;", "rect", "releaseHeader", "(Lcom/goldenboot/saga/zone/ChipSnapshot;)Z", "Lcom/goldenboot/saga/zone/GridPatch;", "textFieldValue", "Lcom/goldenboot/saga/zone/ConsumerAction;", "offsetMapping", "Lcom/goldenboot/saga/zone/OverlayThread;", "textLayoutResult", "Lkotlin/Function1;", "Lcom/goldenboot/saga/zone/ViewStreamer;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "updateTimer", "(Lcom/goldenboot/saga/zone/GridPatch;Lcom/goldenboot/saga/zone/ConsumerAction;Lcom/goldenboot/saga/zone/OverlayThread;Lcom/goldenboot/saga/zone/TouchRecord;Lcom/goldenboot/saga/zone/ChipSnapshot;Lcom/goldenboot/saga/zone/ChipSnapshot;)Z", "oldValue", "newValue", "flushSample", "(Lcom/goldenboot/saga/zone/GridPatch;Lcom/goldenboot/saga/zone/GridPatch;)Z", "clipOrigin", "()Z", "injectMetric", "Lcom/goldenboot/saga/zone/SlotChunk;", "Lcom/goldenboot/saga/zone/GroupReporter;", "detachStream", "isOpen", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayerCache {
    public static final int injectMetric = 8;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final SlotChunk textInputService;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final GroupReporter platformTextInputService;

    public LayerCache(SlotChunk slotChunk, GroupReporter groupReporter) {
        this.textInputService = slotChunk;
        this.platformTextInputService = groupReporter;
    }

    private final boolean growPayload(ElevationNode block) {
        boolean detachStream = detachStream();
        if (detachStream) {
            block.invoke();
        }
        return detachStream;
    }

    public final boolean clipOrigin() {
        boolean detachStream = detachStream();
        if (detachStream) {
            this.platformTextInputService.detachStream();
        }
        return detachStream;
    }

    public final boolean detachStream() {
        return Intrinsics.areEqual(this.textInputService.evictLayout(), this);
    }

    public final void evictLayout() {
        this.textInputService.flushSample(this);
    }

    public final boolean flushSample(TextFieldValue oldValue, TextFieldValue newValue) {
        boolean detachStream = detachStream();
        if (detachStream) {
            this.platformTextInputService.clipOrigin(oldValue, newValue);
        }
        return detachStream;
    }

    public final boolean injectMetric() {
        boolean detachStream = detachStream();
        if (detachStream) {
            this.platformTextInputService.flushSample();
        }
        return detachStream;
    }

    public final boolean releaseHeader(ChipSnapshot rect) {
        boolean detachStream = detachStream();
        if (detachStream) {
            this.platformTextInputService.updateTimer(rect);
        }
        return detachStream;
    }

    public final boolean updateTimer(TextFieldValue textFieldValue, ConsumerAction offsetMapping, TextLayoutResult textLayoutResult, TouchRecord textFieldToRootTransform, ChipSnapshot innerTextFieldBounds, ChipSnapshot decorationBoxBounds) {
        boolean detachStream = detachStream();
        if (detachStream) {
            this.platformTextInputService.injectMetric(textFieldValue, offsetMapping, textLayoutResult, textFieldToRootTransform, innerTextFieldBounds, decorationBoxBounds);
        }
        return detachStream;
    }
}
