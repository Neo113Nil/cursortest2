package com.zettle.sdk.common.ui.components.illustration;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustration;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationImages;", "image", "Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationStyles;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "", "setImageAndStyle", "(Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationImages;Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationStyles;)V", "Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationAttr;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationAttr;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class OttoIllustration extends androidx.appcompat.widget.AppCompatImageView {
    private com.zettle.sdk.common.ui.components.illustration.OttoIllustrationAttr getHighResolutionOutputSizeshNQ4ISI;

    public /* synthetic */ OttoIllustration(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OttoIllustration(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.zettle.sdk.common.ui.R.styleable.OttoIllustration);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "");
        com.zettle.sdk.common.ui.components.illustration.OttoIllustrationAttr ottoIllustrationAttr = new com.zettle.sdk.common.ui.components.illustration.OttoIllustrationAttr(obtainStyledAttributes);
        this.getHighResolutionOutputSizeshNQ4ISI = ottoIllustrationAttr;
        com.zettle.sdk.common.ui.components.illustration.OttoIllustrationImages image = ottoIllustrationAttr.getImage();
        if (image != null) {
            setImageAndStyle(image, ottoIllustrationAttr.getStyle());
        }
    }

    public final void setImageAndStyle(com.zettle.sdk.common.ui.components.illustration.OttoIllustrationImages image, com.zettle.sdk.common.ui.components.illustration.OttoIllustrationStyles style) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(image, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
        setImageDrawable(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.create(getContext().getResources(), image.getDrawableRes(), new androidx.appcompat.view.ContextThemeWrapper(getContext(), style.getStyleRes()).getTheme()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OttoIllustration(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OttoIllustration(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }
}
