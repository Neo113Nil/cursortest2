package androidx.compose.ui.text.platform;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/text/platform/ComposeClickableSpan;", "Landroid/text/style/ClickableSpan;", "Landroidx/compose/ui/text/LinkAnnotation;", "p0", "<init>", "(Landroidx/compose/ui/text/LinkAnnotation;)V", "Landroid/view/View;", "", "onClick", "(Landroid/view/View;)V", "getHighSpeedVideoSizes", "Landroidx/compose/ui/text/LinkAnnotation;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ComposeClickableSpan extends android.text.style.ClickableSpan {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.text.LinkAnnotation getHighResolutionOutputSizeshNQ4ISI;

    public ComposeClickableSpan(androidx.compose.ui.text.LinkAnnotation linkAnnotation) {
        this.getHighResolutionOutputSizeshNQ4ISI = linkAnnotation;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View p0) {
        androidx.compose.ui.text.LinkInteractionListener linkInteractionListener = this.getHighResolutionOutputSizeshNQ4ISI.getLinkInteractionListener();
        if (linkInteractionListener != null) {
            linkInteractionListener.onClick(this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }
}
