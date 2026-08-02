package com.datadog.android.sessionreplay.internal.recorder.mapper;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/mapper/CheckedTextViewMapper;", "Lcom/datadog/android/sessionreplay/internal/recorder/mapper/CheckableTextViewMapper;", "Landroid/widget/CheckedTextView;", "Lcom/datadog/android/sessionreplay/recorder/mapper/TextViewMapper;", "textWireframeMapper", "Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "viewIdentifierResolver", "Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;", "colorStringFormatter", "Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;", "viewBoundsResolver", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "drawableToColorMapper", "<init>", "(Lcom/datadog/android/sessionreplay/recorder/mapper/TextViewMapper;Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;)V", "view", "Landroid/graphics/drawable/Drawable;", "drawable", "cloneCheckableDrawable", "(Landroid/widget/CheckedTextView;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "getCheckableDrawable", "(Landroid/widget/CheckedTextView;)Landroid/graphics/drawable/Drawable;", "", "pixelsDensity", "Lcom/datadog/android/sessionreplay/utils/GlobalBounds;", "resolveCheckableBounds", "(Landroid/widget/CheckedTextView;F)Lcom/datadog/android/sessionreplay/utils/GlobalBounds;", "", "resolveCheckableColor", "(Landroid/widget/CheckedTextView;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class CheckedTextViewMapper extends com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableTextViewMapper<android.widget.CheckedTextView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckedTextViewMapper(com.datadog.android.sessionreplay.recorder.mapper.TextViewMapper<? super android.widget.CheckedTextView> textViewMapper, com.datadog.android.sessionreplay.utils.ViewIdentifierResolver viewIdentifierResolver, com.datadog.android.sessionreplay.utils.ColorStringFormatter colorStringFormatter, com.datadog.android.sessionreplay.utils.ViewBoundsResolver viewBoundsResolver, com.datadog.android.sessionreplay.utils.DrawableToColorMapper drawableToColorMapper) {
        super(textViewMapper, viewIdentifierResolver, colorStringFormatter, viewBoundsResolver, drawableToColorMapper);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textViewMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewIdentifierResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colorStringFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBoundsResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawableToColorMapper, "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableTextViewMapper
    public java.lang.String resolveCheckableColor(android.widget.CheckedTextView view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        android.content.res.ColorStateList checkMarkTintList = view.getCheckMarkTintList();
        return getColorStringFormatter().formatColorAndAlphaAsHexString(checkMarkTintList != null ? checkMarkTintList.getDefaultColor() : view.getCurrentTextColor(), 255);
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableTextViewMapper
    public com.datadog.android.sessionreplay.utils.GlobalBounds resolveCheckableBounds(android.widget.CheckedTextView view, float pixelsDensity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        com.datadog.android.sessionreplay.utils.GlobalBounds resolveViewGlobalBounds = getViewBoundsResolver().resolveViewGlobalBounds(view, pixelsDensity);
        long densityNormalized = com.datadog.android.internal.utils.LongExtKt.densityNormalized(view.getTotalPaddingRight(), pixelsDensity);
        android.graphics.drawable.Drawable checkMarkDrawable = view.getCheckMarkDrawable();
        long densityNormalized2 = (checkMarkDrawable == null || checkMarkDrawable.getIntrinsicHeight() <= 0) ? 0L : com.datadog.android.internal.utils.LongExtKt.densityNormalized((checkMarkDrawable.getIntrinsicHeight() - view.getTotalPaddingTop()) - view.getTotalPaddingBottom(), pixelsDensity);
        return new com.datadog.android.sessionreplay.utils.GlobalBounds((resolveViewGlobalBounds.getX() + resolveViewGlobalBounds.getWidth()) - densityNormalized, resolveViewGlobalBounds.getY(), densityNormalized2, densityNormalized2);
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableTextViewMapper
    public android.graphics.drawable.Drawable getCheckableDrawable(android.widget.CheckedTextView view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        boolean isChecked = view.isChecked();
        android.graphics.drawable.Drawable checkMarkDrawable = view.getCheckMarkDrawable();
        android.graphics.drawable.Drawable.ConstantState constantState = checkMarkDrawable != null ? checkMarkDrawable.getConstantState() : null;
        android.graphics.drawable.DrawableContainer.DrawableContainerState drawableContainerState = constantState instanceof android.graphics.drawable.DrawableContainer.DrawableContainerState ? (android.graphics.drawable.DrawableContainer.DrawableContainerState) constantState : null;
        if (drawableContainerState != null) {
            return drawableContainerState.getChild(!isChecked ? 1 : 0);
        }
        return null;
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableTextViewMapper
    public android.graphics.drawable.Drawable cloneCheckableDrawable(android.widget.CheckedTextView view, android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable newDrawable;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null || (newDrawable = constantState.newDrawable(view.getResources())) == null) {
            return null;
        }
        newDrawable.setState(view.getDrawableState());
        if (view.getCheckMarkTintList() != null) {
            newDrawable.setTintList(view.getCheckMarkTintList());
        }
        return newDrawable;
    }
}
