package com.datadog.android.sessionreplay.internal.recorder.mapper;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000 !*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001!B=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/mapper/CheckableCompoundButtonMapper;", "Landroid/widget/CompoundButton;", "T", "Lcom/datadog/android/sessionreplay/internal/recorder/mapper/CheckableTextViewMapper;", "Lcom/datadog/android/sessionreplay/recorder/mapper/TextViewMapper;", "textWireframeMapper", "Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "viewIdentifierResolver", "Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;", "colorStringFormatter", "Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;", "viewBoundsResolver", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "drawableToColorMapper", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/sessionreplay/recorder/mapper/TextViewMapper;Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;Lcom/datadog/android/api/InternalLogger;)V", "view", "Landroid/graphics/drawable/Drawable;", "drawable", "cloneCheckableDrawable", "(Landroid/widget/CompoundButton;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "getCheckableDrawable", "(Landroid/widget/CompoundButton;)Landroid/graphics/drawable/Drawable;", "", "pixelsDensity", "Lcom/datadog/android/sessionreplay/utils/GlobalBounds;", "resolveCheckableBounds", "(Landroid/widget/CompoundButton;F)Lcom/datadog/android/sessionreplay/utils/GlobalBounds;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/api/InternalLogger;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class CheckableCompoundButtonMapper<T extends android.widget.CompoundButton> extends com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableTextViewMapper<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableCompoundButtonMapper.Companion INSTANCE = new com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableCompoundButtonMapper.Companion(0 == true ? 1 : 0);
    public static final long DEFAULT_CHECKABLE_HEIGHT_IN_DP = 32;
    public static final java.lang.String GET_DRAWABLE_FAIL_MESSAGE = "Failed to get buttonDrawable from the checkable compound button.";
    public static final java.lang.String NULL_BUTTON_DRAWABLE_MSG = "ButtonDrawable of the compound button is null";
    private static final java.lang.reflect.Field mButtonDrawableField;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckableCompoundButtonMapper(com.datadog.android.sessionreplay.recorder.mapper.TextViewMapper<? super T> textViewMapper, com.datadog.android.sessionreplay.utils.ViewIdentifierResolver viewIdentifierResolver, com.datadog.android.sessionreplay.utils.ColorStringFormatter colorStringFormatter, com.datadog.android.sessionreplay.utils.ViewBoundsResolver viewBoundsResolver, com.datadog.android.sessionreplay.utils.DrawableToColorMapper drawableToColorMapper, com.datadog.android.api.InternalLogger internalLogger) {
        super(textViewMapper, viewIdentifierResolver, colorStringFormatter, viewBoundsResolver, drawableToColorMapper);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textViewMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewIdentifierResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colorStringFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBoundsResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawableToColorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighResolutionOutputSizeshNQ4ISI = internalLogger;
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableTextViewMapper
    public com.datadog.android.sessionreplay.utils.GlobalBounds resolveCheckableBounds(T view, float pixelsDensity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        com.datadog.android.sessionreplay.utils.GlobalBounds resolveViewGlobalBounds = getViewBoundsResolver().resolveViewGlobalBounds(view, pixelsDensity);
        long densityNormalized = view.getButtonDrawable() != null ? com.datadog.android.internal.utils.LongExtKt.densityNormalized(r12.getIntrinsicHeight(), pixelsDensity) : 32L;
        return new com.datadog.android.sessionreplay.utils.GlobalBounds(resolveViewGlobalBounds.getX(), ((resolveViewGlobalBounds.getHeight() - densityNormalized) / 2) + resolveViewGlobalBounds.getY(), densityNormalized, densityNormalized);
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableTextViewMapper
    public android.graphics.drawable.Drawable getCheckableDrawable(T view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        boolean isChecked = view.isChecked();
        android.graphics.drawable.Drawable buttonDrawable = view.getButtonDrawable();
        if (buttonDrawable != null) {
            android.graphics.drawable.Drawable.ConstantState constantState = buttonDrawable.getConstantState();
            android.graphics.drawable.DrawableContainer.DrawableContainerState drawableContainerState = constantState instanceof android.graphics.drawable.DrawableContainer.DrawableContainerState ? (android.graphics.drawable.DrawableContainer.DrawableContainerState) constantState : null;
            android.graphics.drawable.Drawable child = drawableContainerState != null ? drawableContainerState.getChild(!isChecked ? 1 : 0) : null;
            if (child != null) {
                return child;
            }
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableCompoundButtonMapper$getCheckableDrawable$originCheckableDrawable$2$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableCompoundButtonMapper.NULL_BUTTON_DRAWABLE_MSG;
            }
        }, (java.lang.Throwable) null, false, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("replay.compound.view", view.getClass().getCanonicalName())), 24, (java.lang.Object) null);
        return null;
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableTextViewMapper
    public android.graphics.drawable.Drawable cloneCheckableDrawable(T view, android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable newDrawable;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null || (newDrawable = constantState.newDrawable(view.getResources())) == null) {
            return null;
        }
        newDrawable.setState(view.getDrawableState());
        android.content.res.ColorStateList buttonTintList = view.getButtonTintList();
        if (buttonTintList != null) {
            newDrawable.setTintList(buttonTintList);
        }
        return newDrawable;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\tR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/mapper/CheckableCompoundButtonMapper$Companion;", "", "<init>", "()V", "", "DEFAULT_CHECKABLE_HEIGHT_IN_DP", "J", "", "GET_DRAWABLE_FAIL_MESSAGE", "Ljava/lang/String;", "NULL_BUTTON_DRAWABLE_MSG", "Ljava/lang/reflect/Field;", "mButtonDrawableField", "Ljava/lang/reflect/Field;", "getMButtonDrawableField$dd_sdk_android_session_replay_release", "()Ljava/lang/reflect/Field;", "getMButtonDrawableField$dd_sdk_android_session_replay_release$annotations"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getMButtonDrawableField$dd_sdk_android_session_replay_release$annotations() {
        }

        private Companion() {
        }

        public final java.lang.reflect.Field getMButtonDrawableField$dd_sdk_android_session_replay_release() {
            return com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableCompoundButtonMapper.mButtonDrawableField;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        java.lang.reflect.Field field = null;
        try {
            java.lang.reflect.Field declaredField = android.widget.CompoundButton.class.getDeclaredField("mButtonDrawable");
            declaredField.setAccessible(true);
            field = declaredField;
        } catch (java.lang.NoSuchFieldException | java.lang.NullPointerException | java.lang.SecurityException unused) {
        }
        mButtonDrawableField = field;
    }
}
