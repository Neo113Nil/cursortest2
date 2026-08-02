package org.betup.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import io.sentry.Session;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.databinding.GameCardViewBinding;
import org.betup.utils.DimensionsUtil;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: GameCardView.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lorg/betup/ui/views/GameCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "_cardSuite", "Lorg/betup/ui/views/CardSuite;", "_cardValue", "Lorg/betup/ui/views/CardValue;", "_binding", "Lorg/betup/databinding/GameCardViewBinding;", "binding", "getBinding", "()Lorg/betup/databinding/GameCardViewBinding;", "value", "cardSuite", "getCardSuite", "()Lorg/betup/ui/views/CardSuite;", "setCardSuite", "(Lorg/betup/ui/views/CardSuite;)V", "cardValue", "getCardValue", "()Lorg/betup/ui/views/CardValue;", "setCardValue", "(Lorg/betup/ui/views/CardValue;)V", "initLayout", "", "notifyCardDataChanged", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GameCardView extends ConstraintLayout {
    public static final int $stable = 8;
    private GameCardViewBinding _binding;
    private CardSuite _cardSuite;
    private CardValue _cardValue;

    private final GameCardViewBinding getBinding() {
        GameCardViewBinding gameCardViewBinding = this._binding;
        Intrinsics.checkNotNull(gameCardViewBinding);
        return gameCardViewBinding;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameCardView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this._cardSuite = CardSuite.DIAMONDS;
        this._cardValue = CardValue.EIGHT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this._cardSuite = CardSuite.DIAMONDS;
        this._cardValue = CardValue.EIGHT;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.GameCardView);
        this._cardSuite = CardTypesKt.getSuiteTypeByNumber(obtainStyledAttributes != null ? obtainStyledAttributes.getString(0) : null);
        this._cardValue = CardTypesKt.getCardValueTypeByNumber(obtainStyledAttributes != null ? obtainStyledAttributes.getString(1) : null);
        initLayout();
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this._cardSuite = CardSuite.DIAMONDS;
        this._cardValue = CardValue.EIGHT;
    }

    /* renamed from: getCardSuite, reason: from getter */
    public final CardSuite get_cardSuite() {
        return this._cardSuite;
    }

    public final void setCardSuite(CardSuite value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._cardSuite = value;
        notifyCardDataChanged();
    }

    /* renamed from: getCardValue, reason: from getter */
    public final CardValue get_cardValue() {
        return this._cardValue;
    }

    public final void setCardValue(CardValue value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._cardValue = value;
        notifyCardDataChanged();
    }

    private final void initLayout() {
        setLayoutParams(new ConstraintLayout.LayoutParams(DimensionsUtil.getPixelsFromDp(getContext(), 128), DimensionsUtil.getPixelsFromDp(getContext(), Opcodes.GETSTATIC)));
        setBackground(ContextCompat.getDrawable(getContext(), R.drawable.card_view_background));
        LayoutInflater from = LayoutInflater.from(getContext());
        Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        this._binding = GameCardViewBinding.inflate(from, this);
        int value = get_cardSuite().getValue();
        getBinding().cardTopSuite.setBackground(ContextCompat.getDrawable(getContext(), value));
        getBinding().cardMiddleSuite.setBackground(ContextCompat.getDrawable(getContext(), value));
        if (get_cardSuite() == CardSuite.DIAMONDS || get_cardSuite() == CardSuite.HEARTS) {
            getBinding().gameCardValue.setTextColor(-65536);
        } else {
            getBinding().gameCardValue.setTextColor(-16777216);
        }
        getBinding().gameCardValue.setText(get_cardValue().getValue());
    }

    private final void notifyCardDataChanged() {
        int value = get_cardSuite().getValue();
        findViewById(R.id.cardTopSuite).setBackground(ContextCompat.getDrawable(getContext(), value));
        findViewById(R.id.cardMiddleSuite).setBackground(ContextCompat.getDrawable(getContext(), value));
        ((TextView) findViewById(R.id.gameCardValue)).setText(get_cardValue().getValue());
        if (get_cardSuite() == CardSuite.DIAMONDS || get_cardSuite() == CardSuite.HEARTS) {
            getBinding().gameCardValue.setTextColor(-65536);
        } else {
            getBinding().gameCardValue.setTextColor(-16777216);
        }
    }
}
