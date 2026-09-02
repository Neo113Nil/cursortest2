package com.goldenboot.saga.zone;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\u001ak\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a;\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001f\u001a\u00020\f*\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "Lcom/goldenboot/saga/zone/GridPatch;", "textFieldValue", "Lcom/goldenboot/saga/zone/ConsumerAction;", "offsetMapping", "Lcom/goldenboot/saga/zone/OverlayThread;", "textLayoutResult", "Landroid/graphics/Matrix;", "matrix", "Lcom/goldenboot/saga/zone/ChipSnapshot;", "innerTextFieldBounds", "decorationBoxBounds", "", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "Landroid/view/inputmethod/CursorAnchorInfo;", "growPayload", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lcom/goldenboot/saga/zone/GridPatch;Lcom/goldenboot/saga/zone/ConsumerAction;Lcom/goldenboot/saga/zone/OverlayThread;Landroid/graphics/Matrix;Lcom/goldenboot/saga/zone/ChipSnapshot;Lcom/goldenboot/saga/zone/ChipSnapshot;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;", "", "selectionStart", "releaseHeader", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;ILcom/goldenboot/saga/zone/ConsumerAction;Lcom/goldenboot/saga/zone/OverlayThread;Lcom/goldenboot/saga/zone/ChipSnapshot;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "startOffset", "endOffset", "evictLayout", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;IILcom/goldenboot/saga/zone/ConsumerAction;Lcom/goldenboot/saga/zone/OverlayThread;Lcom/goldenboot/saga/zone/ChipSnapshot;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "", "x", "y", "detachStream", "(Lcom/goldenboot/saga/zone/ChipSnapshot;FF)Z", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SocketRegistry {
    private static final boolean detachStream(ChipSnapshot chipSnapshot, float f, float f2) {
        float inflateAdapter = chipSnapshot.inflateAdapter();
        if (f > chipSnapshot.getRight() || inflateAdapter > f) {
            return false;
        }
        return f2 <= chipSnapshot.getBottom() && chipSnapshot.mergeLocale() <= f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x005e, code lost:
    
        if (detachStream(r22, r7.getRight(), r7.getBottom()) == false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final CursorAnchorInfo.Builder evictLayout(CursorAnchorInfo.Builder builder, int i, int i2, ConsumerAction consumerAction, TextLayoutResult textLayoutResult, ChipSnapshot chipSnapshot) {
        int i3;
        int growPayload = consumerAction.growPayload(i);
        int growPayload2 = consumerAction.growPayload(i2);
        float[] fArr = new float[(growPayload2 - growPayload) * 4];
        textLayoutResult.getMultiParagraph().injectMetric(ContextDelta.growPayload(growPayload, growPayload2), fArr, 0);
        for (int i4 = i; i4 < i2; i4++) {
            int growPayload3 = consumerAction.growPayload(i4);
            int i5 = (growPayload3 - growPayload) * 4;
            ChipSnapshot chipSnapshot2 = new ChipSnapshot(fArr[i5], fArr[i5 + 1], fArr[i5 + 2], fArr[i5 + 3]);
            boolean updateAction = chipSnapshot.updateAction(chipSnapshot2);
            if (detachStream(chipSnapshot, chipSnapshot2.inflateAdapter(), chipSnapshot2.mergeLocale())) {
                i3 = updateAction;
            }
            i3 = (updateAction ? 1 : 0) | 2;
            if (textLayoutResult.injectMetric(growPayload3) == ScaleDispatcher.notifyMessage) {
                i3 = (i3 == true ? 1 : 0) | 4;
            }
            builder.addCharacterBounds(i4, chipSnapshot2.inflateAdapter(), chipSnapshot2.mergeLocale(), chipSnapshot2.getRight(), chipSnapshot2.getBottom(), i3);
        }
        return builder;
    }

    @ReceiverAdministrator
    public static final CursorAnchorInfo growPayload(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, ConsumerAction consumerAction, TextLayoutResult textLayoutResult, Matrix matrix, ChipSnapshot chipSnapshot, ChipSnapshot chipSnapshot2, boolean z, boolean z2, boolean z3, boolean z4) {
        builder.reset();
        builder.setMatrix(matrix);
        int connectJob = StylusEvent.connectJob(textFieldValue.getSelection());
        builder.setSelectionRange(connectJob, StylusEvent.drawField(textFieldValue.getSelection()));
        if (z) {
            releaseHeader(builder, connectJob, consumerAction, textLayoutResult, chipSnapshot);
        }
        if (z2) {
            StylusEvent composition = textFieldValue.getComposition();
            int connectJob2 = composition != null ? StylusEvent.connectJob(composition.getPackedValue()) : -1;
            StylusEvent composition2 = textFieldValue.getComposition();
            int drawField = composition2 != null ? StylusEvent.drawField(composition2.getPackedValue()) : -1;
            if (connectJob2 >= 0 && connectJob2 < drawField) {
                builder.setComposingText(connectJob2, textFieldValue.peekRevision().subSequence(connectJob2, drawField));
                evictLayout(builder, connectJob2, drawField, consumerAction, textLayoutResult, chipSnapshot);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && z3) {
            MarginBarrier.evictLayout(builder, chipSnapshot2);
        }
        if (i >= 34 && z4) {
            GestureSynthesizer.evictLayout(builder, textLayoutResult, chipSnapshot);
        }
        return builder.build();
    }

    public static /* synthetic */ CursorAnchorInfo injectMetric(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, ConsumerAction consumerAction, TextLayoutResult textLayoutResult, Matrix matrix, ChipSnapshot chipSnapshot, ChipSnapshot chipSnapshot2, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 64) != 0) {
            z = true;
        }
        if ((i & ContentOperation.SpotShadowColor) != 0) {
            z2 = true;
        }
        if ((i & ContentOperation.RotationX) != 0) {
            z3 = true;
        }
        if ((i & ContentOperation.RotationY) != 0) {
            z4 = true;
        }
        return growPayload(builder, textFieldValue, consumerAction, textLayoutResult, matrix, chipSnapshot, chipSnapshot2, z, z2, z3, z4);
    }

    private static final CursorAnchorInfo.Builder releaseHeader(CursorAnchorInfo.Builder builder, int i, ConsumerAction consumerAction, TextLayoutResult textLayoutResult, ChipSnapshot chipSnapshot) {
        if (i < 0) {
            return builder;
        }
        int growPayload = consumerAction.growPayload(i);
        ChipSnapshot releaseHeader = textLayoutResult.releaseHeader(growPayload);
        float connectJob = CellEntry.connectJob(releaseHeader.inflateAdapter(), 0.0f, (int) (textLayoutResult.getSize() >> 32));
        boolean detachStream = detachStream(chipSnapshot, connectJob, releaseHeader.mergeLocale());
        boolean detachStream2 = detachStream(chipSnapshot, connectJob, releaseHeader.getBottom());
        boolean z = textLayoutResult.injectMetric(growPayload) == ScaleDispatcher.notifyMessage;
        int i2 = (detachStream || detachStream2) ? 1 : 0;
        if (!detachStream || !detachStream2) {
            i2 |= 2;
        }
        if (z) {
            i2 |= 4;
        }
        builder.setInsertionMarkerLocation(connectJob, releaseHeader.mergeLocale(), releaseHeader.getBottom(), releaseHeader.getBottom(), i2);
        return builder;
    }
}
