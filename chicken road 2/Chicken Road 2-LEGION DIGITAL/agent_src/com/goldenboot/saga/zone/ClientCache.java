package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/ClientCache;", "", "Landroidx/compose/ui/focus/LayerUseCase;", "focusDirection", "Lcom/goldenboot/saga/zone/ChipSnapshot;", "previouslyFocusedRect", "", "growPayload", "(Landroidx/compose/ui/focus/LayerUseCase;Lcom/goldenboot/saga/zone/ChipSnapshot;)Z", "Lcom/goldenboot/saga/zone/DpadBuilder;", "injectMetric", "()V", "detachStream", "(I)Z", "getEmbeddedViewFocusRect", "()Lcom/goldenboot/saga/zone/ChipSnapshot;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ClientCache {
    boolean detachStream(int focusDirection);

    ChipSnapshot getEmbeddedViewFocusRect();

    boolean growPayload(androidx.compose.ui.focus.LayerUseCase focusDirection, ChipSnapshot previouslyFocusedRect);

    void injectMetric();
}
