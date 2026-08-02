package com.zettle.sdk.common.ui.components.selectcontrol;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\fR\u0016\u0010!\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/zettle/sdk/common/ui/components/selectcontrol/CheckableImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/widget/Checkable;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "drawableStateChanged", "()V", "", "isChecked", "()Z", "", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Landroid/view/accessibility/AccessibilityEvent;", "event", "onInitializeAccessibilityEvent", "(Landroid/view/accessibility/AccessibilityEvent;)V", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "onInitializeAccessibilityNodeInfo", "(Landroid/view/accessibility/AccessibilityNodeInfo;)V", util.h.xy.cb.b.f1091, "setChecked", "(Z)V", "toggle", "getHighResolutionOutputSizeshNQ4ISI", "Z", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CheckableImageView extends androidx.appcompat.widget.AppCompatImageView implements android.widget.Checkable {
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private static final int[] Camera2StreamConfigurationMap = {android.R.attr.state_checked};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckableImageView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckableImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributeSet, "");
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean b) {
        if (b != this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighResolutionOutputSizeshNQ4ISI = b;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int extraSpace) {
        int[] onCreateDrawableState = super.onCreateDrawableState(extraSpace + 1);
        if (isChecked()) {
            androidx.appcompat.widget.AppCompatImageView.mergeDrawableStates(onCreateDrawableState, Camera2StreamConfigurationMap);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(onCreateDrawableState, "");
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        super.onInitializeAccessibilityEvent(event);
        event.setChecked(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setCheckable(true);
        info.setChecked(this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
