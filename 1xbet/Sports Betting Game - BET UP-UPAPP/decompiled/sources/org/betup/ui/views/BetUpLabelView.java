package org.betup.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import io.sentry.Session;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.games.common.ui.animation.LabelAnimationController;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BetUpLabelView.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\u0006\u0010\u0018\u001a\u00020\u0015J\u0010\u0010\u0019\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0013J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0013J\u000e\u0010!\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0011R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lorg/betup/ui/views/BetUpLabelView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "labelAnimationController", "Lorg/betup/games/common/ui/animation/LabelAnimationController;", "isAnimated", "", "labelData", "Lorg/betup/ui/views/LabelBackground;", "starsData", "Lorg/betup/ui/views/StarBackground;", "onDetachedFromWindow", "", "init", "initGameAnimationController", "restoreViewsStates", "animationWon", "delay", "", "animationLost", "setNewBackground", "labelBackground", "starsBackground", "setStarBackground", "setLabelBackground", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetUpLabelView extends LinearLayout {
    public static final int $stable = 8;
    private boolean isAnimated;
    private LabelAnimationController labelAnimationController;
    private LabelBackground labelData;
    private StarBackground starsData;

    public BetUpLabelView(Context context) {
        super(context);
        this.isAnimated = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BetUpLabelView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.isAnimated = true;
        TypedArray obtainStyledAttributes = context != null ? context.obtainStyledAttributes(attrs, R.styleable.BetUpLabelView) : null;
        LabelBackground labelBackgroundByNumber = LabelBackground.INSTANCE.getLabelBackgroundByNumber(obtainStyledAttributes != null ? obtainStyledAttributes.getString(1) : null);
        StarBackground starBackgroundByNumber = StarBackground.INSTANCE.getStarBackgroundByNumber(obtainStyledAttributes != null ? obtainStyledAttributes.getString(2) : null);
        this.isAnimated = obtainStyledAttributes != null ? obtainStyledAttributes.getBoolean(0, true) : true;
        this.labelData = labelBackgroundByNumber;
        this.starsData = starBackgroundByNumber;
        init(labelBackgroundByNumber, starBackgroundByNumber);
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BetUpLabelView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.isAnimated = true;
        TypedArray obtainStyledAttributes = context != null ? context.obtainStyledAttributes(attrs, R.styleable.BetUpLabelView) : null;
        LabelBackground labelBackgroundByNumber = LabelBackground.INSTANCE.getLabelBackgroundByNumber(obtainStyledAttributes != null ? obtainStyledAttributes.getString(1) : null);
        StarBackground starBackgroundByNumber = StarBackground.INSTANCE.getStarBackgroundByNumber(obtainStyledAttributes != null ? obtainStyledAttributes.getString(2) : null);
        this.isAnimated = obtainStyledAttributes != null ? obtainStyledAttributes.getBoolean(0, true) : true;
        this.labelData = labelBackgroundByNumber;
        this.starsData = starBackgroundByNumber;
        init(labelBackgroundByNumber, starBackgroundByNumber);
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.labelAnimationController != null) {
            this.labelAnimationController = null;
        }
    }

    private final void init(LabelBackground labelData, StarBackground starsData) {
        LayoutInflater from = LayoutInflater.from(getContext());
        Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        from.inflate(R.layout.betup_label_components, (ViewGroup) this, true);
        setNewBackground(labelData, starsData);
        if (this.isAnimated) {
            initGameAnimationController();
        }
    }

    private final void initGameAnimationController() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View findViewById = findViewById(R.id.betupTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(R.id.starsLayout);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.labelAnimationController = new LabelAnimationController(context, (ImageView) findViewById, (LinearLayout) findViewById2);
    }

    public final void restoreViewsStates() {
        LabelAnimationController labelAnimationController;
        if (!this.isAnimated || (labelAnimationController = this.labelAnimationController) == null || labelAnimationController == null) {
            return;
        }
        LabelBackground labelBackground = this.labelData;
        Integer valueOf = labelBackground != null ? Integer.valueOf(labelBackground.getValue()) : null;
        StarBackground starBackground = this.starsData;
        labelAnimationController.restoreViewsStates(valueOf, starBackground != null ? Integer.valueOf(starBackground.getValue()) : null);
    }

    public static /* synthetic */ void animationWon$default(BetUpLabelView betUpLabelView, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        betUpLabelView.animationWon(j);
    }

    public final void animationWon(long delay) {
        LabelAnimationController labelAnimationController;
        if (!this.isAnimated || (labelAnimationController = this.labelAnimationController) == null || labelAnimationController == null) {
            return;
        }
        labelAnimationController.animationWon(delay);
    }

    public static /* synthetic */ void animationLost$default(BetUpLabelView betUpLabelView, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        betUpLabelView.animationLost(j);
    }

    public final void animationLost(long delay) {
        LabelAnimationController labelAnimationController;
        if (!this.isAnimated || (labelAnimationController = this.labelAnimationController) == null || labelAnimationController == null) {
            return;
        }
        labelAnimationController.animationLost(delay);
    }

    public final void setNewBackground(LabelBackground labelBackground, StarBackground starsBackground) {
        Intrinsics.checkNotNullParameter(labelBackground, "labelBackground");
        Intrinsics.checkNotNullParameter(starsBackground, "starsBackground");
        setStarBackground(starsBackground);
        setLabelBackground(labelBackground);
    }

    public final void setStarBackground(StarBackground starsBackground) {
        Intrinsics.checkNotNullParameter(starsBackground, "starsBackground");
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.starsLayout);
        if (linearLayout == null) {
            linearLayout = null;
        }
        if (linearLayout != null) {
            LinearLayout linearLayout2 = linearLayout;
            int childCount = linearLayout2.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = linearLayout2.getChildAt(i);
                if (!(childAt instanceof View)) {
                    childAt = null;
                }
                if (childAt != null) {
                    ((ImageView) childAt).setColorFilter(ContextCompat.getColor(getContext(), starsBackground.getValue()));
                }
            }
        }
    }

    public final void setLabelBackground(LabelBackground labelBackground) {
        Intrinsics.checkNotNullParameter(labelBackground, "labelBackground");
        ImageView imageView = (ImageView) findViewById(R.id.betupTitle);
        if (labelBackground == LabelBackground.GOLD_DRAWABLE_ID) {
            imageView.setBackground(ContextCompat.getDrawable(getContext(), labelBackground.getValue()));
        } else {
            imageView.setColorFilter(ContextCompat.getColor(getContext(), labelBackground.getValue()));
        }
    }
}
