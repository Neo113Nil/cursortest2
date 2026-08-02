package org.betup.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import org.betup.R;
import org.betup.ui.common.BetSelectionState;

/* loaded from: classes4.dex */
public class CompetitionBetView extends ConstraintLayout {
    private static final float BET_AVAILABLE_ALPHA = 1.0f;
    private static final float BET_NOT_AVAILABLE_ALPHA = 0.4f;
    protected String _betCoef;
    protected String _betName;
    private int availableBetNameShapeId;
    private int availableBetShapeId;
    protected TextView betCoefView;
    protected TextView betNameView;
    protected View container;
    private BetSelectionState currentState;

    public CompetitionBetView(Context context) {
        super(context);
        init(context, null);
    }

    public CompetitionBetView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public CompetitionBetView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null ? context.obtainStyledAttributes(attributeSet, R.styleable.CompetitionBetView).getBoolean(0, false) : false) {
            this.availableBetShapeId = R.drawable.competition_bet_available_shape_dark;
            this.availableBetNameShapeId = R.drawable.competition_available_bet_name_shape_dark;
        } else {
            this.availableBetShapeId = R.drawable.competition_bet_available_shape;
            this.availableBetNameShapeId = R.drawable.competition_available_bet_name_shape;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.competition_bet_view, (ViewGroup) this, false);
        this.container = inflate;
        inflate.setId(View.generateViewId());
        this.betCoefView = (TextView) this.container.findViewById(R.id.bet_coef);
        this.betNameView = (TextView) this.container.findViewById(R.id.bet_name);
        addView(this.container);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(this.container.getId(), 3, getId(), 3);
        constraintSet.connect(this.container.getId(), 6, getId(), 6);
        constraintSet.connect(this.container.getId(), 4, getId(), 4);
        constraintSet.connect(this.container.getId(), 7, getId(), 7);
        constraintSet.applyTo(this);
    }

    public String getbetName() {
        return this._betName;
    }

    public void setBetName(String _betName) {
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

    /* renamed from: org.betup.ui.views.CompetitionBetView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
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
        int i = AnonymousClass1.$SwitchMap$org$betup$ui$common$BetSelectionState[state.ordinal()];
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
        this.container.setBackground(ContextCompat.getDrawable(getContext(), this.availableBetShapeId));
        this.container.setAlpha(0.4f);
        this._betCoef = "-";
        this._betName = "-";
        this.betCoefView.setText("-");
        this.betCoefView.setTextColor(-1);
        this.betCoefView.setTypeface(null, 1);
        this.betNameView.setText(this._betName);
        this.betNameView.setTextColor(-16777216);
        this.betNameView.setBackground(null);
        this.betNameView.setTypeface(null, 1);
    }

    protected void setPutBetState() {
        this.container.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.competition_bet_selected_shape));
        this.container.setAlpha(1.0f);
        this.betCoefView.setText(String.valueOf(this._betCoef));
        this.betCoefView.setTextColor(-16777216);
        this.betCoefView.setTypeface(null, 1);
        this.betNameView.setBackground(null);
        this.betNameView.setText(this._betName);
        this.betNameView.setTextColor(-16777216);
        this.betNameView.setTypeface(null, 0);
    }

    protected void setBetAvailableState() {
        this.container.setBackground(ContextCompat.getDrawable(getContext(), this.availableBetShapeId));
        this.container.setAlpha(1.0f);
        this.betCoefView.setText(String.valueOf(this._betCoef));
        this.betCoefView.setTextColor(ContextCompat.getColor(getContext(), R.color.white));
        this.betCoefView.setTypeface(null, 1);
        this.betNameView.setBackground(ContextCompat.getDrawable(getContext(), this.availableBetNameShapeId));
        this.betNameView.setText(this._betName);
        this.betNameView.setTextColor(-1);
        this.betNameView.setTypeface(null, 1);
    }

    protected void setBetLockedState() {
        this.container.setBackground(ContextCompat.getDrawable(getContext(), this.availableBetShapeId));
        this.container.setAlpha(0.4f);
        this.betCoefView.setText(String.valueOf(this._betCoef));
        this.betCoefView.setTextColor(ContextCompat.getColor(getContext(), R.color.gray));
        this.betCoefView.setTypeface(null, 1);
        this.betNameView.setText(this._betName);
        this.betNameView.setTextColor(-1);
        this.betNameView.setTypeface(null, 1);
        this.betNameView.setBackground(null);
    }
}
