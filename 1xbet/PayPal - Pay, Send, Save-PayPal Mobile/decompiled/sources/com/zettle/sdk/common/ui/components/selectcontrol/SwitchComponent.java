package com.zettle.sdk.common.ui.components.selectcontrol;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d"}, d2 = {"Lcom/zettle/sdk/common/ui/components/selectcontrol/SwitchComponent;", "Lcom/zettle/sdk/common/ui/components/selectcontrol/SelectControlComponent;", "Landroid/widget/Checkable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/vectordrawable/graphics/drawable/AnimatedVectorDrawableCompat;", "p0", "p1", "", "getHighSpeedVideoSizes", "(Landroidx/vectordrawable/graphics/drawable/AnimatedVectorDrawableCompat;Landroidx/vectordrawable/graphics/drawable/AnimatedVectorDrawableCompat;)V", "", "enabled", "setSwitchEnabled", "(Z)V", "withAnim", "toggleIndicatorVisibility", "getHighSpeedVideoFpsRanges", "Landroidx/vectordrawable/graphics/drawable/AnimatedVectorDrawableCompat;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Landroidx/vectordrawable/graphics/drawable/VectorDrawableCompat;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/vectordrawable/graphics/drawable/VectorDrawableCompat;", "getOutputFormats", "getInputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public class SwitchComponent extends com.zettle.sdk.common.ui.components.selectcontrol.SelectControlComponent implements android.widget.Checkable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.vectordrawable.graphics.drawable.VectorDrawableCompat getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.vectordrawable.graphics.drawable.VectorDrawableCompat getInputSizeshNQ4ISI;

    public /* synthetic */ SwitchComponent(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchComponent(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.create(context, com.zettle.sdk.common.ui.R.drawable.anim_switch_indicator_off);
        this.getHighSpeedVideoFpsRanges = androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.create(context, com.zettle.sdk.common.ui.R.drawable.anim_switch_indicator_on);
        androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat create = androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.create(context, com.zettle.sdk.common.ui.R.drawable.switch_indicator_off);
        this.Camera2StreamConfigurationMap = create;
        androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat create2 = androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.create(context, com.zettle.sdk.common.ui.R.drawable.switch_indicator_on);
        this.getHighResolutionOutputSizeshNQ4ISI = create2;
        this.getHighSpeedVideoSizes = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.create(context.getResources(), com.zettle.sdk.common.ui.R.drawable.switch_indicator_off_disabled, null);
        this.getInputSizeshNQ4ISI = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.create(context.getResources(), com.zettle.sdk.common.ui.R.drawable.switch_indicator_on_disabled, null);
        getSelectControlBackground().getLayoutParams().width = (int) getResources().getDimension(com.zettle.sdk.common.ui.R.dimen.grid_7x);
        getSelectControlBackground().getLayoutParams().height = (int) getResources().getDimension(com.zettle.sdk.common.ui.R.dimen.grid_4x);
        getSelectControlIndicator().getLayoutParams().width = -2;
        getSelectControlIndicator().getLayoutParams().height = -2;
        getSelectControlBackground().setBackground(androidx.core.content.ContextCompat.getDrawable(context, com.zettle.sdk.common.ui.R.drawable.selectcontrol_switch_background_selector));
        getHighSpeedVideoSizes(create, create2);
        final com.zettle.sdk.common.ui.components.selectcontrol.CheckableImageView selectControlIndicator = getSelectControlIndicator();
        selectControlIndicator.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.zettle.sdk.common.ui.components.selectcontrol.SwitchComponent$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return com.zettle.sdk.common.ui.components.selectcontrol.SwitchComponent.$r8$lambda$vFxHlWoCyXHInoyClyB4rB2RMf0(com.zettle.sdk.common.ui.components.selectcontrol.CheckableImageView.this, this, view, motionEvent);
            }
        });
    }

    @Override // com.zettle.sdk.common.ui.components.selectcontrol.SelectControlComponent
    public final void toggleIndicatorVisibility(boolean withAnim) {
        if (withAnim) {
            getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
        } else {
            getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    public final void setSwitchEnabled(boolean enabled) {
        setEnabled(enabled);
        toggleIndicatorVisibility(false);
    }

    private final void getHighSpeedVideoSizes(androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat p0, androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat p1) {
        androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat animatedVectorDrawableCompat;
        if (!getCamera2StreamConfigurationMap()) {
            if (!isEnabled()) {
                getSelectControlIndicator().setImageDrawable(this.getHighSpeedVideoSizes);
            } else {
                getSelectControlIndicator().setImageDrawable(p0);
            }
        } else if (!isEnabled()) {
            getSelectControlIndicator().setImageDrawable(this.getInputSizeshNQ4ISI);
        } else {
            getSelectControlIndicator().setImageDrawable(p1);
        }
        if (!isEnabled() || (animatedVectorDrawableCompat = (androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat) getSelectControlIndicator().getDrawable()) == null) {
            return;
        }
        animatedVectorDrawableCompat.start();
    }

    public static /* synthetic */ boolean $r8$lambda$vFxHlWoCyXHInoyClyB4rB2RMf0(com.zettle.sdk.common.ui.components.selectcontrol.CheckableImageView checkableImageView, com.zettle.sdk.common.ui.components.selectcontrol.SwitchComponent switchComponent, android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkableImageView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(switchComponent, "");
        checkableImageView.getParent().requestDisallowInterceptTouchEvent(true);
        if (motionEvent.getAction() != 1 || !switchComponent.isEnabled() || !switchComponent.isClickable()) {
            return super.onTouchEvent(motionEvent);
        }
        switchComponent.performClick();
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwitchComponent(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwitchComponent(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }
}
