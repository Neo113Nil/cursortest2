package androidx.transition;

/* loaded from: classes3.dex */
public class AutoTransition extends androidx.transition.TransitionSet {
    public AutoTransition() {
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public AutoTransition(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        getHighResolutionOutputSizeshNQ4ISI();
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        setOrdering(1);
        addTransition(new androidx.transition.Fade(2)).addTransition(new androidx.transition.ChangeBounds()).addTransition(new androidx.transition.Fade(1));
    }
}
