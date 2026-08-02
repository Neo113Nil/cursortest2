package com.zettle.sdk.common.ui.components.totalamount;

@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0016\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0018\u0010\u000eJ\u0017\u0010\u0019\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0019\u0010\u000eJ\u0017\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b(\u0010\u000eJ\u0015\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b.\u0010\u000eJ\u0017\u00100\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b0\u0010\u000eJ\u0017\u00102\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b2\u0010\u000eJ\u0015\u00104\u001a\u00020\f2\u0006\u00103\u001a\u00020\u0006¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b7\u0010\u000eJ\u0015\u00108\u001a\u00020\f2\u0006\u00103\u001a\u00020\u0006¢\u0006\u0004\b8\u00105J\u0015\u00109\u001a\u00020\f2\u0006\u00103\u001a\u00020\u0006¢\u0006\u0004\b9\u00105J\u0015\u0010<\u001a\u00020\f2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\f2\b\u0010>\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b?\u0010\u000eR\u0011\u0010C\u001a\u00020@8G¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010E\u001a\u00020@8G¢\u0006\u0006\u001a\u0004\bD\u0010BR\u0011\u0010H\u001a\u00020\u00018G¢\u0006\u0006\u001a\u0004\bF\u0010GR$\u0010J\u001a\u0004\u0018\u00010I8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010P\u001a\u0004\u0018\u00010I8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR\u0011\u0010V\u001a\u00020S8G¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0011\u0010X\u001a\u00020S8G¢\u0006\u0006\u001a\u0004\bW\u0010UR\u0011\u0010Z\u001a\u00020@8G¢\u0006\u0006\u001a\u0004\bY\u0010BR\u0011\u0010\\\u001a\u00020@8G¢\u0006\u0006\u001a\u0004\b[\u0010BR\u0011\u0010`\u001a\u00020]8G¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0011\u0010b\u001a\u00020]8G¢\u0006\u0006\u001a\u0004\ba\u0010_R\u0011\u0010d\u001a\u00020@8G¢\u0006\u0006\u001a\u0004\bc\u0010BR\u0011\u0010h\u001a\u00020e8G¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0016\u0010j\u001a\u00020i8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\bj\u0010k"}, d2 = {"Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "contentDescription", "", "setAmountCurrencyContentDescription", "(Ljava/lang/String;)V", "Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountCurrencyPosition;", "amountCurrencyPosition", "setAmountCurrencyPosition", "(Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountCurrencyPosition;)V", "amountCurrency", "setAmountCurrencySymbol", "setAmountGroupContentDescription", "setAmountSecondaryButtonTextBottomContentDescription", "setAmountSecondaryButtonTextTopContentDescription", "setAmountSecondaryTextBottomContentDescription", "setAmountSecondaryTextTopContentDescription", "customLayoutBottom", "setAmountSecondaryViewBottom", "(Ljava/lang/Integer;)V", "customLayoutTop", "setAmountSecondaryViewTop", "setAmountValueContentDescription", "Landroid/view/View$OnClickListener;", "clickListener", "setBackBtnClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/view/View$OnLongClickListener;", "longClickListener", "setBackBtnLongClickListener", "(Landroid/view/View$OnLongClickListener;)V", "setBackButtonContentDescription", "Lcom/zettle/sdk/common/ui/text/OttoAmount;", "ottoAmount", "setOttoAmount", "(Lcom/zettle/sdk/common/ui/text/OttoAmount;)V", "amountSecondaryButtonTextBottom", "setSecondaryButtonTextBottom", "amountSecondaryButtonTextTop", "setSecondaryButtonTextTop", "amountSecondaryTextBottom", "setSecondaryTextBottom", "textColor", "setSecondaryTextBottomColor", "(I)V", "amountSecondaryTextTop", "setSecondaryTextTop", "setSecondaryTextTopColor", "setTotalAmountTextColor", "Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_AMOUNT_TYPE, "setTotalAmountType", "(Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountType;)V", "amountValue", "setTotalAmountValue", "Landroidx/appcompat/widget/AppCompatTextView;", "getAmountCurrencyTextViewLeft", "()Landroidx/appcompat/widget/AppCompatTextView;", "amountCurrencyTextViewLeft", "getAmountCurrencyTextViewRight", "amountCurrencyTextViewRight", "getAmountCurrencyViewGroup", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "amountCurrencyViewGroup", "Landroid/view/View;", "amountCustomViewBottom", "Landroid/view/View;", "getAmountCustomViewBottom", "()Landroid/view/View;", "setAmountCustomViewBottom", "(Landroid/view/View;)V", "amountCustomViewTop", "getAmountCustomViewTop", "setAmountCustomViewTop", "Landroidx/appcompat/widget/AppCompatButton;", "getAmountSecondaryButtonViewBottom", "()Landroidx/appcompat/widget/AppCompatButton;", "amountSecondaryButtonViewBottom", "getAmountSecondaryButtonViewTop", "amountSecondaryButtonViewTop", "getAmountSecondaryTextViewBottom", "amountSecondaryTextViewBottom", "getAmountSecondaryTextViewTop", "amountSecondaryTextViewTop", "Landroidx/appcompat/widget/LinearLayoutCompat;", "getAmountSecondaryViewBottom", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "amountSecondaryViewBottom", "getAmountSecondaryViewTop", "amountSecondaryViewTop", "getAmountValueTextView", "amountValueTextView", "Landroidx/appcompat/widget/AppCompatImageView;", "getBackButton", "()Landroidx/appcompat/widget/AppCompatImageView;", "backButton", "Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountAttributes;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountAttributes;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class OttoTotalAmountComponent extends androidx.constraintlayout.widget.ConstraintLayout {
    private android.view.View amountCustomViewBottom;
    private android.view.View amountCustomViewTop;
    private com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountAttributes getHighResolutionOutputSizeshNQ4ISI;

    public /* synthetic */ OttoTotalAmountComponent(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OttoTotalAmountComponent(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.zettle.sdk.common.ui.R.styleable.OttoTotalAmountComponent);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "");
        this.getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountAttributes(obtainStyledAttributes);
        androidx.constraintlayout.widget.ConstraintLayout.inflate(context, com.zettle.sdk.common.ui.R.layout.sdk_component_total_amount, this);
        com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountAttributes ottoTotalAmountAttributes = this.getHighResolutionOutputSizeshNQ4ISI;
        if (ottoTotalAmountAttributes == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            ottoTotalAmountAttributes = null;
        }
        setTotalAmountValue(ottoTotalAmountAttributes.getAmountValue());
        setTotalAmountType(ottoTotalAmountAttributes.getAmountType());
        setAmountCurrencySymbol(ottoTotalAmountAttributes.getAmountCurrencySymbol());
        setAmountCurrencyPosition(ottoTotalAmountAttributes.getAmountCurrencyPosition());
        setTotalAmountTextColor(ottoTotalAmountAttributes.getAmountTextColor());
        setAmountSecondaryViewTop(java.lang.Integer.valueOf(ottoTotalAmountAttributes.getAmountSecondaryViewTop()));
        setSecondaryTextTop(ottoTotalAmountAttributes.getAmountSecondaryTextTop());
        setSecondaryTextTopColor(ottoTotalAmountAttributes.getAmountSecondaryTextTopColor());
        setSecondaryButtonTextTop(ottoTotalAmountAttributes.getAmountSecondaryButtonTextTop());
        setAmountSecondaryViewBottom(java.lang.Integer.valueOf(ottoTotalAmountAttributes.getAmountSecondaryViewBottom()));
        setSecondaryTextBottom(ottoTotalAmountAttributes.getAmountSecondaryTextBottom());
        setSecondaryTextBottomColor(ottoTotalAmountAttributes.getAmountSecondaryTextBottomColor());
        setSecondaryButtonTextBottom(ottoTotalAmountAttributes.getAmountSecondaryButtonTextBottom());
        setAmountValueContentDescription(ottoTotalAmountAttributes.getAmountValueContentDescription());
        setAmountCurrencyContentDescription(ottoTotalAmountAttributes.getAmountCurrencySymbolContentDescription());
        setAmountSecondaryTextTopContentDescription(ottoTotalAmountAttributes.getAmountSecondaryTextTopContentDescription());
        setAmountSecondaryButtonTextTopContentDescription(ottoTotalAmountAttributes.getAmountSecondaryButtonTextTopContentDescription());
        setAmountSecondaryTextBottomContentDescription(ottoTotalAmountAttributes.getAmountSecondaryTextBottomContentDescription());
        setAmountSecondaryButtonTextBottomContentDescription(ottoTotalAmountAttributes.getAmountSecondaryButtonTextBottomContentDescription());
        setBackButtonContentDescription(ottoTotalAmountAttributes.getBackButtonContentDescription());
        setAmountGroupContentDescription(ottoTotalAmountAttributes.getAmountGroupContentDescription());
        if (getAmountSecondaryTextViewTop().getVisibility() == 0 && getAmountSecondaryButtonViewTop().getVisibility() == 0) {
            getAmountSecondaryTextViewTop().setPadding(0, 0, 0, getResources().getDimensionPixelSize(com.zettle.sdk.common.ui.R.dimen.grid_3x));
        }
        if (getAmountSecondaryTextViewBottom().getVisibility() == 0 && getAmountSecondaryButtonViewBottom().getVisibility() == 0) {
            getAmountSecondaryTextViewBottom().setPadding(0, 0, 0, getResources().getDimensionPixelSize(com.zettle.sdk.common.ui.R.dimen.grid_3x));
        }
        int i2 = getResources().getDisplayMetrics().densityDpi;
        if (i2 == 120 || i2 == 160 || i2 == 240) {
            androidx.core.widget.TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(getAmountValueTextView(), getResources().getDimensionPixelSize(com.zettle.sdk.common.ui.R.dimen.amount_number_small_min), getResources().getDimensionPixelSize(com.zettle.sdk.common.ui.R.dimen.amount_number_small_max), 1, 0);
            float dimension = getResources().getDimension(com.zettle.sdk.common.ui.R.dimen.currency_symbol_small);
            getAmountCurrencyTextViewLeft().setTextSize(0, dimension);
            getAmountCurrencyTextViewRight().setTextSize(0, dimension);
            android.view.View findViewById = findViewById(com.zettle.sdk.common.ui.R.id.amount_currency_text_view_left_space);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
            ((androidx.appcompat.widget.AppCompatTextView) findViewById).setTextSize(0, dimension);
            android.view.View findViewById2 = findViewById(com.zettle.sdk.common.ui.R.id.amount_currency_text_view_right_space);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
            ((androidx.appcompat.widget.AppCompatTextView) findViewById2).setTextSize(0, dimension);
        }
    }

    public final androidx.appcompat.widget.AppCompatTextView getAmountValueTextView() {
        android.view.View findViewById = findViewById(com.zettle.sdk.common.ui.R.id.amount_value_text_view);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        return (androidx.appcompat.widget.AppCompatTextView) findViewById;
    }

    public final androidx.appcompat.widget.AppCompatTextView getAmountCurrencyTextViewLeft() {
        android.view.View findViewById = findViewById(com.zettle.sdk.common.ui.R.id.amount_currency_text_view_left);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        return (androidx.appcompat.widget.AppCompatTextView) findViewById;
    }

    public final androidx.appcompat.widget.AppCompatTextView getAmountCurrencyTextViewRight() {
        android.view.View findViewById = findViewById(com.zettle.sdk.common.ui.R.id.amount_currency_text_view_right);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        return (androidx.appcompat.widget.AppCompatTextView) findViewById;
    }

    public final android.view.View getAmountCustomViewTop() {
        return this.amountCustomViewTop;
    }

    public final void setAmountCustomViewTop(android.view.View view) {
        this.amountCustomViewTop = view;
    }

    public final androidx.appcompat.widget.AppCompatTextView getAmountSecondaryTextViewTop() {
        android.view.View findViewById = findViewById(com.zettle.sdk.common.ui.R.id.amount_secondary_text_view_top);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        return (androidx.appcompat.widget.AppCompatTextView) findViewById;
    }

    public final androidx.appcompat.widget.AppCompatButton getAmountSecondaryButtonViewTop() {
        android.view.View findViewById = findViewById(com.zettle.sdk.common.ui.R.id.amount_secondary_button_view_top);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        return (androidx.appcompat.widget.AppCompatButton) findViewById;
    }

    public final android.view.View getAmountCustomViewBottom() {
        return this.amountCustomViewBottom;
    }

    public final void setAmountCustomViewBottom(android.view.View view) {
        this.amountCustomViewBottom = view;
    }

    public final androidx.appcompat.widget.AppCompatTextView getAmountSecondaryTextViewBottom() {
        android.view.View findViewById = findViewById(com.zettle.sdk.common.ui.R.id.amount_secondary_text_view_bottom);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        return (androidx.appcompat.widget.AppCompatTextView) findViewById;
    }

    public final androidx.appcompat.widget.AppCompatButton getAmountSecondaryButtonViewBottom() {
        android.view.View findViewById = findViewById(com.zettle.sdk.common.ui.R.id.amount_secondary_button_view_bottom);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        return (androidx.appcompat.widget.AppCompatButton) findViewById;
    }

    public final androidx.appcompat.widget.LinearLayoutCompat getAmountSecondaryViewTop() {
        android.view.View findViewById = findViewById(com.zettle.sdk.common.ui.R.id.amount_secondary_view_top);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        return (androidx.appcompat.widget.LinearLayoutCompat) findViewById;
    }

    public final androidx.appcompat.widget.LinearLayoutCompat getAmountSecondaryViewBottom() {
        android.view.View findViewById = findViewById(com.zettle.sdk.common.ui.R.id.amount_secondary_view_bottom);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        return (androidx.appcompat.widget.LinearLayoutCompat) findViewById;
    }

    public final androidx.appcompat.widget.AppCompatImageView getBackButton() {
        android.view.View findViewById = findViewById(com.zettle.sdk.common.ui.R.id.back_button);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        return (androidx.appcompat.widget.AppCompatImageView) findViewById;
    }

    public final androidx.constraintlayout.widget.ConstraintLayout getAmountCurrencyViewGroup() {
        android.view.View findViewById = findViewById(com.zettle.sdk.common.ui.R.id.amount_currency_view_group);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        return (androidx.constraintlayout.widget.ConstraintLayout) findViewById;
    }

    public final void setTotalAmountTextColor(int textColor) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(textColor);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            getAmountValueTextView().setTextColor(intValue);
            getAmountCurrencyTextViewLeft().setTextColor(intValue);
            getAmountCurrencyTextViewRight().setTextColor(intValue);
        }
    }

    public final void setSecondaryTextTopColor(int textColor) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(textColor);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            getAmountSecondaryTextViewTop().setTextColor(valueOf.intValue());
        }
    }

    public final void setSecondaryTextBottomColor(int textColor) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(textColor);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            getAmountSecondaryTextViewBottom().setTextColor(valueOf.intValue());
        }
    }

    public final void setTotalAmountValue(java.lang.String amountValue) {
        final androidx.appcompat.widget.AppCompatTextView amountValueTextView = getAmountValueTextView();
        amountValueTextView.setText(amountValue);
        amountValueTextView.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent$setTotalAmountValue$1$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                androidx.appcompat.widget.AppCompatTextView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                androidx.appcompat.widget.AppCompatTextView.this.invalidate();
                androidx.appcompat.widget.AppCompatTextView.this.requestLayout();
                android.graphics.Rect rect = new android.graphics.Rect();
                androidx.appcompat.widget.AppCompatTextView.this.getPaint().getTextBounds(androidx.appcompat.widget.AppCompatTextView.this.getText().toString(), 0, androidx.appcompat.widget.AppCompatTextView.this.getText().toString().length(), rect);
                com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent.access$getAmountValueSpace(this).getLayoutParams().width = rect.width();
            }
        });
    }

    public final void setAmountCurrencySymbol(java.lang.String amountCurrency) {
        java.lang.String str = amountCurrency;
        getAmountCurrencyTextViewLeft().setText(str);
        getAmountCurrencyTextViewRight().setText(str);
        android.view.View findViewById = findViewById(com.zettle.sdk.common.ui.R.id.amount_currency_text_view_left_space);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        ((androidx.appcompat.widget.AppCompatTextView) findViewById).setText(str);
        android.view.View findViewById2 = findViewById(com.zettle.sdk.common.ui.R.id.amount_currency_text_view_right_space);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        ((androidx.appcompat.widget.AppCompatTextView) findViewById2).setText(str);
    }

    public final void setAmountCurrencyPosition(com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition amountCurrencyPosition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountCurrencyPosition, "");
        com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountAttributes ottoTotalAmountAttributes = this.getHighResolutionOutputSizeshNQ4ISI;
        if (ottoTotalAmountAttributes == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            ottoTotalAmountAttributes = null;
        }
        ottoTotalAmountAttributes.setAmountCurrencyPosition(amountCurrencyPosition);
        int i = com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent.WhenMappings.$EnumSwitchMapping$0[amountCurrencyPosition.ordinal()];
        if (i == 1) {
            getAmountCurrencyTextViewLeft().setVisibility(0);
            getAmountCurrencyTextViewRight().setVisibility(8);
            android.view.View findViewById = findViewById(com.zettle.sdk.common.ui.R.id.amount_currency_text_view_right_space);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
            ((androidx.appcompat.widget.AppCompatTextView) findViewById).setVisibility(8);
            android.view.View findViewById2 = findViewById(com.zettle.sdk.common.ui.R.id.amount_currency_text_view_left_space);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
            ((androidx.appcompat.widget.AppCompatTextView) findViewById2).setVisibility(4);
            return;
        }
        if (i != 2) {
            return;
        }
        getAmountCurrencyTextViewLeft().setVisibility(8);
        getAmountCurrencyTextViewRight().setVisibility(0);
        android.view.View findViewById3 = findViewById(com.zettle.sdk.common.ui.R.id.amount_currency_text_view_right_space);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        ((androidx.appcompat.widget.AppCompatTextView) findViewById3).setVisibility(4);
        android.view.View findViewById4 = findViewById(com.zettle.sdk.common.ui.R.id.amount_currency_text_view_left_space);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        ((androidx.appcompat.widget.AppCompatTextView) findViewById4).setVisibility(8);
    }

    public final void setAmountSecondaryViewTop(java.lang.Integer customLayoutTop) {
        if (customLayoutTop != null && customLayoutTop.intValue() == 0) {
            customLayoutTop = null;
        }
        if (customLayoutTop != null) {
            this.amountCustomViewTop = android.view.LayoutInflater.from(getContext()).inflate(customLayoutTop.intValue(), getAmountSecondaryViewTop());
            com.zettle.sdk.common.ui.extensions.ViewExtKt.setVisibilityVisibleOrGone(getAmountSecondaryViewTop(), true);
        }
    }

    public final void setAmountSecondaryViewBottom(java.lang.Integer customLayoutBottom) {
        if (customLayoutBottom != null && customLayoutBottom.intValue() == 0) {
            customLayoutBottom = null;
        }
        if (customLayoutBottom != null) {
            this.amountCustomViewBottom = android.view.LayoutInflater.from(getContext()).inflate(customLayoutBottom.intValue(), getAmountSecondaryViewBottom());
            com.zettle.sdk.common.ui.extensions.ViewExtKt.setVisibilityVisibleOrGone(getAmountSecondaryViewBottom(), true);
        }
    }

    public final void setSecondaryTextTop(java.lang.String amountSecondaryTextTop) {
        java.lang.String str = amountSecondaryTextTop;
        getAmountSecondaryTextViewTop().setText(str);
        com.zettle.sdk.common.ui.extensions.ViewExtKt.setVisibilityVisibleOrGone(getAmountSecondaryTextViewTop(), !(str == null || str.length() == 0));
    }

    public final void setSecondaryButtonTextTop(java.lang.String amountSecondaryButtonTextTop) {
        java.lang.String str = amountSecondaryButtonTextTop;
        getAmountSecondaryButtonViewTop().setText(str);
        com.zettle.sdk.common.ui.extensions.ViewExtKt.setVisibilityVisibleOrGone(getAmountSecondaryButtonViewTop(), !(str == null || str.length() == 0));
        com.zettle.sdk.common.ui.extensions.ViewExtKt.setAccessibleTouchTarget(getAmountSecondaryButtonViewTop());
    }

    public final void setSecondaryTextBottom(java.lang.String amountSecondaryTextBottom) {
        java.lang.String str = amountSecondaryTextBottom;
        getAmountSecondaryTextViewBottom().setText(str);
        com.zettle.sdk.common.ui.extensions.ViewExtKt.setVisibilityVisibleOrGone(getAmountSecondaryTextViewBottom(), !(str == null || str.length() == 0));
    }

    public final void setSecondaryButtonTextBottom(java.lang.String amountSecondaryButtonTextBottom) {
        java.lang.String str = amountSecondaryButtonTextBottom;
        getAmountSecondaryButtonViewBottom().setText(str);
        com.zettle.sdk.common.ui.extensions.ViewExtKt.setVisibilityVisibleOrGone(getAmountSecondaryButtonViewBottom(), !(str == null || str.length() == 0));
        com.zettle.sdk.common.ui.extensions.ViewExtKt.setAccessibleTouchTarget(getAmountSecondaryButtonViewBottom());
    }

    public final void setTotalAmountType(com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountType amountType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountType, "");
        com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountAttributes ottoTotalAmountAttributes = this.getHighResolutionOutputSizeshNQ4ISI;
        if (ottoTotalAmountAttributes == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            ottoTotalAmountAttributes = null;
        }
        ottoTotalAmountAttributes.setAmountType(amountType);
        int i = com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent.WhenMappings.$EnumSwitchMapping$1[amountType.ordinal()];
        if (i == 1) {
            getBackButton().setVisibility(8);
            android.view.View findViewById = findViewById(com.zettle.sdk.common.ui.R.id.counter_weight);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
            ((android.widget.Space) findViewById).setVisibility(8);
            return;
        }
        if (i != 2) {
            return;
        }
        getBackButton().setVisibility(0);
        android.view.View findViewById2 = findViewById(com.zettle.sdk.common.ui.R.id.counter_weight);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        ((android.widget.Space) findViewById2).setVisibility(0);
    }

    public final void setOttoAmount(com.zettle.sdk.common.ui.text.OttoAmount ottoAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ottoAmount, "");
        com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition currencyPosition = ottoAmount.getCurrencyPosition();
        java.lang.String currencySymbol = ottoAmount.getCurrencySymbol();
        java.lang.String amountString = ottoAmount.getAmountString();
        if (ottoAmount.isNegative()) {
            int i = com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent.WhenMappings.$EnumSwitchMapping$0[ottoAmount.getCurrencyPosition().ordinal()];
            if (i == 1) {
                currencySymbol = "-".concat(java.lang.String.valueOf(ottoAmount.getCurrencySymbol()));
                amountString = ottoAmount.getAmountString();
            } else if (i == 2) {
                currencySymbol = ottoAmount.getCurrencySymbol();
                amountString = "-".concat(java.lang.String.valueOf(ottoAmount.getAmountString()));
            }
        }
        setAmountCurrencyPosition(currencyPosition);
        setAmountCurrencySymbol(currencySymbol);
        setTotalAmountValue(amountString);
    }

    public final void setBackBtnClickListener(android.view.View.OnClickListener clickListener) {
        getBackButton().setOnClickListener(clickListener);
    }

    public final void setBackBtnLongClickListener(android.view.View.OnLongClickListener longClickListener) {
        getBackButton().setOnLongClickListener(longClickListener);
    }

    public final void setAmountValueContentDescription(java.lang.String contentDescription) {
        getAmountValueTextView().setContentDescription(contentDescription);
    }

    public final void setAmountCurrencyContentDescription(java.lang.String contentDescription) {
        java.lang.String str = contentDescription;
        getAmountCurrencyTextViewLeft().setContentDescription(str);
        getAmountCurrencyTextViewRight().setContentDescription(str);
    }

    public final void setAmountSecondaryTextTopContentDescription(java.lang.String contentDescription) {
        getAmountSecondaryTextViewTop().setContentDescription(contentDescription);
    }

    public final void setAmountSecondaryButtonTextTopContentDescription(java.lang.String contentDescription) {
        getAmountSecondaryButtonViewTop().setContentDescription(contentDescription);
    }

    public final void setAmountSecondaryTextBottomContentDescription(java.lang.String contentDescription) {
        getAmountSecondaryTextViewBottom().setContentDescription(contentDescription);
    }

    public final void setAmountSecondaryButtonTextBottomContentDescription(java.lang.String contentDescription) {
        getAmountSecondaryButtonViewBottom().setContentDescription(contentDescription);
    }

    public final void setBackButtonContentDescription(java.lang.String contentDescription) {
        getBackButton().setContentDescription(contentDescription);
    }

    public final void setAmountGroupContentDescription(java.lang.String contentDescription) {
        getAmountCurrencyViewGroup().setContentDescription(contentDescription);
    }

    public static final /* synthetic */ android.widget.Space access$getAmountValueSpace(com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent ottoTotalAmountComponent) {
        android.view.View findViewById = ottoTotalAmountComponent.findViewById(com.zettle.sdk.common.ui.R.id.amount_value_space);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        return (android.widget.Space) findViewById;
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition.values().length];
            try {
                iArr[com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition.START.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition.END.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountType.values().length];
            try {
                iArr2[com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountType.STATIC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountType.INTERACTIVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OttoTotalAmountComponent(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OttoTotalAmountComponent(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }
}
