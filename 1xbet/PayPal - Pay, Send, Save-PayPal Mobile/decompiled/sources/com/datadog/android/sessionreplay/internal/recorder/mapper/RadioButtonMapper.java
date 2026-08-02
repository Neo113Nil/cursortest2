package com.datadog.android.sessionreplay.internal.recorder.mapper;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/mapper/RadioButtonMapper;", "Lcom/datadog/android/sessionreplay/internal/recorder/mapper/CheckableCompoundButtonMapper;", "Landroid/widget/RadioButton;", "Lcom/datadog/android/sessionreplay/recorder/mapper/TextViewMapper;", "textWireframeMapper", "Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "viewIdentifierResolver", "Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;", "colorStringFormatter", "Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;", "viewBoundsResolver", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "drawableToColorMapper", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/sessionreplay/recorder/mapper/TextViewMapper;Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;Lcom/datadog/android/api/InternalLogger;)V", "view", "", "checkBoxColor", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "resolveNotCheckedShapeStyle", "(Landroid/widget/RadioButton;Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class RadioButtonMapper extends com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableCompoundButtonMapper<android.widget.RadioButton> {
    public static final int CORNER_RADIUS = 10;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioButtonMapper(com.datadog.android.sessionreplay.recorder.mapper.TextViewMapper<? super android.widget.RadioButton> textViewMapper, com.datadog.android.sessionreplay.utils.ViewIdentifierResolver viewIdentifierResolver, com.datadog.android.sessionreplay.utils.ColorStringFormatter colorStringFormatter, com.datadog.android.sessionreplay.utils.ViewBoundsResolver viewBoundsResolver, com.datadog.android.sessionreplay.utils.DrawableToColorMapper drawableToColorMapper, com.datadog.android.api.InternalLogger internalLogger) {
        super(textViewMapper, viewIdentifierResolver, colorStringFormatter, viewBoundsResolver, drawableToColorMapper, internalLogger);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textViewMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewIdentifierResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colorStringFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBoundsResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawableToColorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableTextViewMapper
    public com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle resolveNotCheckedShapeStyle(android.widget.RadioButton view, java.lang.String checkBoxColor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkBoxColor, "");
        return new com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle(null, java.lang.Float.valueOf(view.getAlpha()), (java.lang.Number) 10);
    }
}
