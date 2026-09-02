package com.goldenboot.saga.zone;

import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/goldenboot/saga/zone/ScopedMeter;", "Landroid/text/style/ClickableSpan;", "Lcom/goldenboot/saga/zone/SpanSequence;", "link", "<init>", "(Lcom/goldenboot/saga/zone/SpanSequence;)V", "Landroid/view/View;", "widget", "Lcom/goldenboot/saga/zone/DpadBuilder;", "onClick", "(Landroid/view/View;)V", "reduceScope", "Lcom/goldenboot/saga/zone/SpanSequence;", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScopedMeter extends ClickableSpan {

    /* renamed from: reduceScope, reason: from kotlin metadata */
    private final SpanSequence link;

    public ScopedMeter(SpanSequence spanSequence) {
        this.link = spanSequence;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View widget) {
        ToastSnapshot linkInteractionListener = this.link.getLinkInteractionListener();
        if (linkInteractionListener != null) {
            linkInteractionListener.evictLayout(this.link);
        }
    }
}
