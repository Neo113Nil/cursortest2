package com.goldenboot.saga.zone;

import android.view.inputmethod.CursorAnchorInfo;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/goldenboot/saga/zone/GestureSynthesizer;", "", "<init>", "()V", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "Lcom/goldenboot/saga/zone/OverlayThread;", "textLayoutResult", "Lcom/goldenboot/saga/zone/ChipSnapshot;", "innerTextFieldBounds", "evictLayout", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lcom/goldenboot/saga/zone/OverlayThread;Lcom/goldenboot/saga/zone/ChipSnapshot;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class GestureSynthesizer {
    public static final GestureSynthesizer evictLayout = new GestureSynthesizer();

    private GestureSynthesizer() {
    }

    public static final CursorAnchorInfo.Builder evictLayout(CursorAnchorInfo.Builder builder, TextLayoutResult textLayoutResult, ChipSnapshot innerTextFieldBounds) {
        int resetDelta;
        int resetDelta2;
        if (!innerTextFieldBounds.bindBody() && (resetDelta = textLayoutResult.resetDelta(innerTextFieldBounds.mergeLocale())) <= (resetDelta2 = textLayoutResult.resetDelta(innerTextFieldBounds.getBottom()))) {
            while (true) {
                builder.addVisibleLineBounds(textLayoutResult.inflateAdapter(resetDelta), textLayoutResult.gatherAdapter(resetDelta), textLayoutResult.purgeNode(resetDelta), textLayoutResult.serializeOffset(resetDelta));
                if (resetDelta == resetDelta2) {
                    break;
                }
                resetDelta++;
            }
        }
        return builder;
    }
}
