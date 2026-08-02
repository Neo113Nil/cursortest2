package org.betup.utils;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import org.betup.R;
import org.betup.model.remote.entity.bets.BetState;

/* loaded from: classes4.dex */
public final class BetBackgroundColorSelector {
    public static void applyColorToShape(View view, BetState betState) {
        Context context = view.getContext();
        GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
        if (gradientDrawable == null) {
        }
        switch (AnonymousClass1.$SwitchMap$org$betup$model$remote$entity$bets$BetState[betState.ordinal()]) {
            case 1:
                gradientDrawable.setColor(getColor(context, R.color.bet_shape_amount_lost));
                break;
            case 2:
                gradientDrawable.setColor(getColor(context, R.color.bet_shape_amount_returned));
                break;
            case 3:
            case 4:
            case 5:
                gradientDrawable.setColor(getColor(context, R.color.blue));
                break;
            case 6:
                gradientDrawable.setColor(getColor(context, R.color.bet_shape_amount_won));
                break;
        }
    }

    /* renamed from: org.betup.utils.BetBackgroundColorSelector$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$model$remote$entity$bets$BetState;

        static {
            int[] iArr = new int[BetState.values().length];
            $SwitchMap$org$betup$model$remote$entity$bets$BetState = iArr;
            try {
                iArr[BetState.LOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$model$remote$entity$bets$BetState[BetState.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$betup$model$remote$entity$bets$BetState[BetState.CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$betup$model$remote$entity$bets$BetState[BetState.SOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$betup$model$remote$entity$bets$BetState[BetState.RETURNED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$betup$model$remote$entity$bets$BetState[BetState.WON.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static int getBackgroundColorForState(Context context, BetState betState) {
        int i = AnonymousClass1.$SwitchMap$org$betup$model$remote$entity$bets$BetState[betState.ordinal()];
        if (i == 1) {
            return getColor(context, R.color.bet_shape_amount_lost);
        }
        if (i == 2) {
            return getColor(context, R.color.bet_shape_amount_returned);
        }
        if (i != 6) {
            return getColor(context, R.color.blue);
        }
        return getColor(context, R.color.bet_shape_amount_won);
    }

    public static int getTextColorForState(Context context, BetState betState) {
        int i = AnonymousClass1.$SwitchMap$org$betup$model$remote$entity$bets$BetState[betState.ordinal()];
        if (i == 1) {
            return getColor(context, R.color.bet_shape_amount_lost);
        }
        if (i == 2) {
            return getColor(context, R.color.colorAccent);
        }
        if (i != 6) {
            return getColor(context, R.color.DarkBlue);
        }
        return getColor(context, R.color.bet_shape_amount_won);
    }

    private static int getColor(Context context, int resource) {
        return context.getResources().getColor(resource);
    }
}
