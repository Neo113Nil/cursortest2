package org.betup.ui.views;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import org.betup.R;
import org.betup.ui.common.BetSelectionState;
import org.betup.ui.common.compose.HapticFeedbackEffect;

/* loaded from: classes4.dex */
public class BetView extends ConstraintLayout {
    private static final float BASE_NAME_TEXT_SIZE_SP = 14.0f;
    private static final float BET_AVAILABLE_ALPHA = 1.0f;
    private static final float BET_NOT_AVAILABLE_ALPHA = 0.4f;
    private static final float[] NAME_SIZE_STEP_FACTORS = {1.0f, 0.9f, 0.8f, 0.7f, 0.6f, 0.5f, 0.4f, 0.35f, 0.3f, 0.25f, 0.2f};
    private static final long PRESS_DURATION_MS = 50;
    private static final float PRESS_SCALE = 0.76f;
    private static final long RELEASE_DURATION_MS = 120;
    protected String _betCoef;
    protected String _betName;
    protected TextView betCoefView;
    protected TextView betNameView;
    protected View container;
    private BetSelectionState currentState;
    protected View divider;
    private float lastAppliedNameSizeSp;
    private AnimatorSet lastScaleAnimator;
    private float lastSyncedNameTextSizePx;
    protected ProgressBar loadingIndicator;
    protected View loadingOverlay;
    protected ImageView lockIcon;

    public BetView(Context context) {
        super(context);
        this.lastSyncedNameTextSizePx = -1.0f;
        this.lastAppliedNameSizeSp = -1.0f;
        init(context);
    }

    public BetView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.lastSyncedNameTextSizePx = -1.0f;
        this.lastAppliedNameSizeSp = -1.0f;
        init(context);
    }

    public BetView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.lastSyncedNameTextSizePx = -1.0f;
        this.lastAppliedNameSizeSp = -1.0f;
        init(context);
    }

    private void init(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.bet_view, (ViewGroup) this, false);
        this.container = inflate;
        inflate.setId(View.generateViewId());
        this.divider = this.container.findViewById(R.id.divider);
        this.betCoefView = (TextView) this.container.findViewById(R.id.bet_coef);
        this.betNameView = (TextView) this.container.findViewById(R.id.bet_name);
        this.loadingIndicator = (ProgressBar) this.container.findViewById(R.id.loading_indicator);
        this.loadingOverlay = this.container.findViewById(R.id.loading_overlay);
        this.lockIcon = (ImageView) this.container.findViewById(R.id.lock_icon);
        addView(this.container);
        setBackground(null);
        setForeground(null);
        setStateListAnimator(null);
        if (Build.VERSION.SDK_INT >= 28) {
            setDefaultFocusHighlightEnabled(false);
        }
        setTouchListenerForPressFeedback();
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(this.container.getId(), 3, getId(), 3);
        constraintSet.connect(this.container.getId(), 6, getId(), 6);
        constraintSet.connect(this.container.getId(), 4, getId(), 4);
        constraintSet.connect(this.container.getId(), 7, getId(), 7);
        constraintSet.applyTo(this);
    }

    private void setTouchListenerForPressFeedback() {
        setOnTouchListener(new View.OnTouchListener() { // from class: org.betup.ui.views.BetView.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                if (action == 0) {
                    BetView.this.animateScale(BetView.PRESS_SCALE, BetView.PRESS_DURATION_MS);
                    return false;
                }
                if (action != 1) {
                    if (action != 3) {
                        return false;
                    }
                    BetView.this.animateScale(1.0f, BetView.RELEASE_DURATION_MS);
                    return false;
                }
                BetView.this.animateScale(1.0f, BetView.RELEASE_DURATION_MS);
                if (!BetView.this.shouldPlayBetSelectHaptic(event)) {
                    return false;
                }
                HapticFeedbackEffect.performBetSelect(BetView.this);
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldPlayBetSelectHaptic(MotionEvent event) {
        if (!isClickable() || !isEnabled() || this.currentState == BetSelectionState.BET_LOCKED || this.currentState == BetSelectionState.BET_NOT_AVAILABLE) {
            return false;
        }
        float x = event.getX();
        float y = event.getY();
        return x >= 0.0f && x < ((float) getWidth()) && y >= 0.0f && y < ((float) getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animateScale(float targetScale, long durationMs) {
        AnimatorSet animatorSet = this.lastScaleAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.lastScaleAnimator = null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "scaleX", targetScale);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "scaleY", targetScale);
        ofFloat.setDuration(durationMs);
        ofFloat2.setDuration(durationMs);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat, ofFloat2);
        this.lastScaleAnimator = animatorSet2;
        animatorSet2.start();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        applyStepBasedNameSize();
        syncCoefFontSizeWithName();
    }

    private void applyStepBasedNameSize() {
        int width;
        CharSequence text;
        float[] fArr;
        TextView textView = this.betNameView;
        if (textView == null || (width = textView.getWidth()) <= 0 || (text = this.betNameView.getText()) == null || text.length() == 0) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Paint paint = new Paint(this.betNameView.getPaint());
        int i = 0;
        while (true) {
            fArr = NAME_SIZE_STEP_FACTORS;
            if (i >= fArr.length) {
                break;
            }
            paint.setTextSize(TypedValue.applyDimension(2, fArr[i] * BASE_NAME_TEXT_SIZE_SP, displayMetrics));
            if (paint.measureText(text.toString()) <= width) {
                break;
            } else {
                i++;
            }
        }
        if (i >= fArr.length) {
            i = fArr.length - 1;
        }
        float f = fArr[i] * BASE_NAME_TEXT_SIZE_SP;
        if (f != this.lastAppliedNameSizeSp) {
            this.lastAppliedNameSizeSp = f;
            this.betNameView.setTextSize(2, f);
            invalidate();
        }
    }

    private void syncCoefFontSizeWithName() {
        TextView textView = this.betNameView;
        if (textView == null || this.betCoefView == null) {
            return;
        }
        float min = Math.min(textView.getTextSize(), TypedValue.applyDimension(2, 12.0f, getResources().getDisplayMetrics()));
        if (min != this.lastSyncedNameTextSizePx) {
            this.lastSyncedNameTextSizePx = min;
            this.betCoefView.setTextSize(0, min);
        }
    }

    public String getbetName() {
        return this._betName;
    }

    public void setBetName(String _betName) {
        if (this._betName != _betName) {
            this.lastAppliedNameSizeSp = -1.0f;
        }
        this._betName = _betName;
    }

    public void setBetCoef(String _betCoef) {
        this._betCoef = _betCoef;
    }

    public BetSelectionState getBetState() {
        return this.currentState;
    }

    public TextView getBetNameView() {
        return this.betNameView;
    }

    public void setBetNameView(TextView betNameView) {
        this.betNameView = betNameView;
    }

    public TextView getBetCoefView() {
        return this.betCoefView;
    }

    public void setBetCoefView(TextView betCoefView) {
        this.betCoefView = betCoefView;
    }

    /* renamed from: org.betup.ui.views.BetView$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$ui$common$BetSelectionState;

        static {
            int[] iArr = new int[BetSelectionState.values().length];
            $SwitchMap$org$betup$ui$common$BetSelectionState = iArr;
            try {
                iArr[BetSelectionState.BET_NOT_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$ui$common$BetSelectionState[BetSelectionState.BET_PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$betup$ui$common$BetSelectionState[BetSelectionState.BET_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$betup$ui$common$BetSelectionState[BetSelectionState.BET_LOCKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public void setBetState(BetSelectionState state) {
        this.currentState = state;
        int i = AnonymousClass2.$SwitchMap$org$betup$ui$common$BetSelectionState[state.ordinal()];
        if (i == 1) {
            setBetNotAvailableState();
            return;
        }
        if (i == 2) {
            setPutBetState();
        } else if (i == 3) {
            setBetAvailableState();
        } else {
            if (i == 4) {
                setBetLockedState();
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    protected void setBetNotAvailableState() {
        ImageView imageView = this.lockIcon;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        this.container.setAlpha(1.0f);
        this.container.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.bet_item_default_background));
        this._betCoef = "-";
        this._betName = "-";
        this.betCoefView.setText("-");
        this.betCoefView.setTextColor(ContextCompat.getColor(getContext(), R.color.secondary_text));
        this.betNameView.setText(this._betName);
        this.betNameView.setTextColor(ContextCompat.getColor(getContext(), R.color.primary_text));
        this.divider.setBackground(ContextCompat.getDrawable(getContext(), R.color.secondary_text));
    }

    protected void setPutBetState() {
        ImageView imageView = this.lockIcon;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        this.container.setAlpha(1.0f);
        this.container.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.bet_item_put_state));
        this.betCoefView.setText(String.valueOf(this._betCoef));
        this.betCoefView.setTextColor(ContextCompat.getColor(getContext(), R.color.accent_text));
        this.betNameView.setText(this._betName);
        this.betNameView.setTextColor(ContextCompat.getColor(getContext(), R.color.accent_text));
        this.divider.setBackground(ContextCompat.getDrawable(getContext(), R.color.accent_text));
    }

    protected void setBetAvailableState() {
        ImageView imageView = this.lockIcon;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        this.container.setAlpha(1.0f);
        this.container.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.bet_item_default_background));
        this.betCoefView.setText(String.valueOf(this._betCoef));
        this.betCoefView.setTextColor(ContextCompat.getColor(getContext(), R.color.secondary_text));
        this.betNameView.setText(this._betName);
        this.betNameView.setTextColor(ContextCompat.getColor(getContext(), R.color.primary_text));
        this.divider.setBackground(ContextCompat.getDrawable(getContext(), R.color.secondary_text));
    }

    protected void setBetLockedState() {
        this.container.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.bet_item_locked_background));
        this.container.setAlpha(1.0f);
        TextView textView = this.betCoefView;
        String str = this._betCoef;
        if (str == null) {
            str = "-";
        }
        textView.setText(String.valueOf(str));
        this.betCoefView.setTextColor(ContextCompat.getColor(getContext(), R.color.secondary_text));
        TextView textView2 = this.betNameView;
        String str2 = this._betName;
        textView2.setText(str2 != null ? str2 : "-");
        this.betNameView.setTextColor(ContextCompat.getColor(getContext(), R.color.primary_text));
        this.divider.setBackground(ContextCompat.getDrawable(getContext(), R.color.secondary_text));
        ImageView imageView = this.lockIcon;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    public void showLoadingIndicator(boolean show) {
        ProgressBar progressBar = this.loadingIndicator;
        if (progressBar != null) {
            progressBar.setVisibility(show ? 0 : 8);
        }
        View view = this.loadingOverlay;
        if (view != null) {
            view.setVisibility(show ? 0 : 8);
        }
        setEnabled(!show);
    }
}
