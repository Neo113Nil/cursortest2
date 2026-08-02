package org.betup.ui.tour;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.databinding.TourOverlayBinding;
import org.betup.utils.ConstraintLayoutExtensionsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BrandedTourOverlay.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 @2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001@B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010'\u001a\u00020$H\u0016J\b\u0010(\u001a\u00020$H\u0014J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+H\u0016J\u0018\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020/H\u0007J\u0018\u00100\u001a\u00020$2\u0006\u0010.\u001a\u00020/2\u0006\u0010-\u001a\u00020\u0017H\u0002J\b\u00101\u001a\u00020$H\u0002J\u0016\u00102\u001a\u00020$2\f\u00103\u001a\b\u0012\u0004\u0012\u00020$04H\u0002J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\u0010\u00109\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010:\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010;\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010<\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010=\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010>\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010?\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006A"}, d2 = {"Lorg/betup/ui/tour/BrandedTourOverlay;", "Landroid/app/Dialog;", "Landroid/content/DialogInterface$OnDismissListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "context", "Landroid/content/Context;", "data", "Lorg/betup/ui/tour/TourStep;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lorg/betup/ui/tour/TourOverlayListener;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;Lorg/betup/ui/tour/TourStep;Lorg/betup/ui/tour/TourOverlayListener;)V", "getData", "()Lorg/betup/ui/tour/TourStep;", "getListener", "()Lorg/betup/ui/tour/TourOverlayListener;", "_binding", "Lorg/betup/databinding/TourOverlayBinding;", "binding", "getBinding", "()Lorg/betup/databinding/TourOverlayBinding;", "leftImages", "", "Lorg/betup/ui/tour/TourHelperSign;", "", "getLeftImages", "()Ljava/util/Map;", "rightImages", "getRightImages", "dismissing", "", "getDismissing", "()Z", "setDismissing", "(Z)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onGlobalLayout", "onStart", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "getImageOfHelper", "sign", "position", "Lorg/betup/ui/tour/TourHelperPosition;", "setupViewPositions", "playIntroAnimation", "playOutAnimation", "onFinished", "Lkotlin/Function0;", "getFadeIn", "Landroid/animation/Animator;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "getFadeOut", "getSlideInFromLeft", "getSlideInFromRight", "getSlideInFromBottom", "getSlideOutFromLeft", "getSlideOutFromRight", "getSlideOutFromBottom", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BrandedTourOverlay extends Dialog implements DialogInterface.OnDismissListener, ViewTreeObserver.OnGlobalLayoutListener {
    public static final long ANIMATION_DURATION = 500;
    private TourOverlayBinding _binding;
    private final TourStep data;
    private boolean dismissing;
    private final Map<TourHelperSign, Integer> leftImages;
    private final TourOverlayListener listener;
    private final Map<TourHelperSign, Integer> rightImages;
    public static final int $stable = 8;

    /* compiled from: BrandedTourOverlay.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TourHelperPosition.values().length];
            try {
                iArr[TourHelperPosition.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TourHelperPosition.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TourHelperPosition.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandedTourOverlay(Context context, TourStep data, TourOverlayListener tourOverlayListener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.listener = tourOverlayListener;
        this.leftImages = MapsKt.mapOf(TuplesKt.to(TourHelperSign.Finger, Integer.valueOf(R.drawable.helper_left_finger)), TuplesKt.to(TourHelperSign.Side, Integer.valueOf(R.drawable.helper_left_right)), TuplesKt.to(TourHelperSign.Nr1, Integer.valueOf(R.drawable.helper_left_nr1)), TuplesKt.to(TourHelperSign.Ok, Integer.valueOf(R.drawable.helper_left_ok)));
        this.rightImages = MapsKt.mapOf(TuplesKt.to(TourHelperSign.Side, Integer.valueOf(R.drawable.helper_right_left)));
        setOnDismissListener(this);
    }

    public /* synthetic */ BrandedTourOverlay(Context context, TourStep tourStep, TourOverlayListener tourOverlayListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, tourStep, (i & 4) != 0 ? null : tourOverlayListener);
    }

    public final TourStep getData() {
        return this.data;
    }

    public final TourOverlayListener getListener() {
        return this.listener;
    }

    private final TourOverlayBinding getBinding() {
        TourOverlayBinding tourOverlayBinding = this._binding;
        Intrinsics.checkNotNull(tourOverlayBinding);
        return tourOverlayBinding;
    }

    public final Map<TourHelperSign, Integer> getLeftImages() {
        return this.leftImages;
    }

    public final Map<TourHelperSign, Integer> getRightImages() {
        return this.rightImages;
    }

    public final boolean getDismissing() {
        return this.dismissing;
    }

    public final void setDismissing(boolean z) {
        this.dismissing = z;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        this._binding = TourOverlayBinding.inflate(getLayoutInflater());
        setContentView(getBinding().getRoot());
        ButterKnife.bind(this);
        getBinding().title.setText(this.data.getTourTooltipData().getTitle());
        getBinding().text.setText(this.data.getTourTooltipData().getText());
        getBinding().helperImage.setImageResource(getImageOfHelper(this.data.getSign(), this.data.getPosition()));
        setupViewPositions(this.data.getPosition(), this.data.getSign());
        getBinding().container.getViewTreeObserver().addOnGlobalLayoutListener(this);
        getBinding().container.setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.tour.BrandedTourOverlay$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BrandedTourOverlay.onCreate$lambda$1(BrandedTourOverlay.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(final BrandedTourOverlay brandedTourOverlay, View view) {
        brandedTourOverlay.playOutAnimation(new Function0() { // from class: org.betup.ui.tour.BrandedTourOverlay$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onCreate$lambda$1$lambda$0;
                onCreate$lambda$1$lambda$0 = BrandedTourOverlay.onCreate$lambda$1$lambda$0(BrandedTourOverlay.this);
                return onCreate$lambda$1$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$lambda$0(BrandedTourOverlay brandedTourOverlay) {
        brandedTourOverlay.dismiss();
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        getBinding().container.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        LinearLayout popupContainer = getBinding().popupContainer;
        Intrinsics.checkNotNullExpressionValue(popupContainer, "popupContainer");
        ConstraintLayoutExtensionsKt.setVerticalBias(popupContainer, 1.0f - ((getBinding().helperImage.getHeight() + (getBinding().popupContainer.getHeight() / 2)) / getBinding().container.getHeight()));
        getBinding().animatedGroup.setVisibility(8);
        playIntroAnimation();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(null);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        TourOverlayListener tourOverlayListener = this.listener;
        if (tourOverlayListener != null) {
            tourOverlayListener.onClosed();
        }
    }

    public final int getImageOfHelper(TourHelperSign sign, TourHelperPosition position) {
        Integer num;
        Intrinsics.checkNotNullParameter(sign, "sign");
        Intrinsics.checkNotNullParameter(position, "position");
        if (position != TourHelperPosition.Right || (num = this.rightImages.get(sign)) == null) {
            num = this.leftImages.get(sign);
        }
        return num != null ? num.intValue() : R.drawable.helper_left_ok;
    }

    private final void setupViewPositions(TourHelperPosition position, TourHelperSign sign) {
        float f;
        ImageView helperImage = getBinding().helperImage;
        Intrinsics.checkNotNullExpressionValue(helperImage, "helperImage");
        ImageView imageView = helperImage;
        int i = WhenMappings.$EnumSwitchMapping$0[position.ordinal()];
        if (i == 1) {
            f = sign == TourHelperSign.Finger ? 0.0f : 0.1f;
        } else if (i == 2) {
            f = 0.5f;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            getBinding().tip.setScaleX(-1.0f);
            f = sign == TourHelperSign.Finger ? 1.0f : 0.9f;
        }
        ConstraintLayoutExtensionsKt.setHorizontalBias(imageView, f);
        ImageView helperImage2 = getBinding().helperImage;
        Intrinsics.checkNotNullExpressionValue(helperImage2, "helperImage");
        float f2 = 0.65f;
        ConstraintLayoutExtensionsKt.setWidthInPercent(helperImage2, position == TourHelperPosition.Center ? (sign == TourHelperSign.Finger || sign == TourHelperSign.Nr1) ? 0.75f : 0.65f : 0.5f);
        LinearLayout popupContainer = getBinding().popupContainer;
        Intrinsics.checkNotNullExpressionValue(popupContainer, "popupContainer");
        LinearLayout linearLayout = popupContainer;
        int i2 = WhenMappings.$EnumSwitchMapping$0[position.ordinal()];
        if (i2 == 1) {
            f2 = 0.4f;
        } else if (i2 != 2) {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f2 = 0.2f;
        }
        ConstraintLayoutExtensionsKt.setHorizontalBias(linearLayout, f2);
    }

    private final void playIntroAnimation() {
        Animator slideInFromLeft;
        getBinding().animatedGroup.setVisibility(0);
        getBinding().popupContainer.setAlpha(0.0f);
        getBinding().tip.setAlpha(0.0f);
        int i = WhenMappings.$EnumSwitchMapping$0[this.data.getPosition().ordinal()];
        if (i == 1) {
            ImageView helperImage = getBinding().helperImage;
            Intrinsics.checkNotNullExpressionValue(helperImage, "helperImage");
            slideInFromLeft = getSlideInFromLeft(helperImage);
        } else if (i == 2) {
            ImageView helperImage2 = getBinding().helperImage;
            Intrinsics.checkNotNullExpressionValue(helperImage2, "helperImage");
            slideInFromLeft = getSlideInFromBottom(helperImage2);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ImageView helperImage3 = getBinding().helperImage;
            Intrinsics.checkNotNullExpressionValue(helperImage3, "helperImage");
            slideInFromLeft = getSlideInFromRight(helperImage3);
        }
        slideInFromLeft.setDuration(500L);
        LinearLayout popupContainer = getBinding().popupContainer;
        Intrinsics.checkNotNullExpressionValue(popupContainer, "popupContainer");
        Animator fadeIn = getFadeIn(popupContainer);
        fadeIn.setDuration(500L);
        View tip = getBinding().tip;
        Intrinsics.checkNotNullExpressionValue(tip, "tip");
        Animator fadeIn2 = getFadeIn(tip);
        fadeIn2.setDuration(500L);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(fadeIn, fadeIn2);
        Unit unit = Unit.INSTANCE;
        animatorSet.playSequentially(slideInFromLeft, animatorSet2);
        animatorSet.start();
    }

    private final void playOutAnimation(final Function0<Unit> onFinished) {
        Animator slideOutFromLeft;
        if (this.dismissing) {
            return;
        }
        this.dismissing = true;
        int i = WhenMappings.$EnumSwitchMapping$0[this.data.getPosition().ordinal()];
        if (i == 1) {
            ImageView helperImage = getBinding().helperImage;
            Intrinsics.checkNotNullExpressionValue(helperImage, "helperImage");
            slideOutFromLeft = getSlideOutFromLeft(helperImage);
        } else if (i == 2) {
            ImageView helperImage2 = getBinding().helperImage;
            Intrinsics.checkNotNullExpressionValue(helperImage2, "helperImage");
            slideOutFromLeft = getSlideOutFromBottom(helperImage2);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ImageView helperImage3 = getBinding().helperImage;
            Intrinsics.checkNotNullExpressionValue(helperImage3, "helperImage");
            slideOutFromLeft = getSlideOutFromRight(helperImage3);
        }
        slideOutFromLeft.setDuration(500L);
        LinearLayout popupContainer = getBinding().popupContainer;
        Intrinsics.checkNotNullExpressionValue(popupContainer, "popupContainer");
        Animator fadeOut = getFadeOut(popupContainer);
        fadeOut.setDuration(500L);
        View tip = getBinding().tip;
        Intrinsics.checkNotNullExpressionValue(tip, "tip");
        Animator fadeOut2 = getFadeOut(tip);
        fadeOut2.setDuration(500L);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(fadeOut, fadeOut2);
        Unit unit = Unit.INSTANCE;
        animatorSet.playSequentially(animatorSet2, slideOutFromLeft);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: org.betup.ui.tour.BrandedTourOverlay$playOutAnimation$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                onFinished.invoke();
            }
        });
        animatorSet.start();
    }

    private final Animator getFadeIn(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(...)");
        return ofFloat;
    }

    private final Animator getFadeOut(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(...)");
        return ofFloat;
    }

    private final Animator getSlideInFromLeft(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", -(ConstraintLayoutExtensionsKt.getWidthInPercent(view) * getBinding().container.getWidth()), 0.0f);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(...)");
        return ofFloat;
    }

    private final Animator getSlideInFromRight(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", getBinding().container.getWidth() + view.getWidth(), 0.0f);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(...)");
        return ofFloat;
    }

    private final Animator getSlideInFromBottom(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", getBinding().container.getWidth() + view.getHeight(), 0.0f);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(...)");
        return ofFloat;
    }

    private final Animator getSlideOutFromLeft(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", 0.0f, -(ConstraintLayoutExtensionsKt.getWidthInPercent(view) * getBinding().container.getWidth()));
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(...)");
        return ofFloat;
    }

    private final Animator getSlideOutFromRight(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", 0.0f, getBinding().container.getWidth() + view.getWidth());
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(...)");
        return ofFloat;
    }

    private final Animator getSlideOutFromBottom(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, getBinding().container.getWidth() + view.getHeight());
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(...)");
        return ofFloat;
    }
}
