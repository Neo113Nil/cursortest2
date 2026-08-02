package com.datadog.android.sessionreplay.internal.recorder.mapper;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/mapper/NumberPickerMapper;", "Lcom/datadog/android/sessionreplay/internal/recorder/mapper/BasePickerMapper;", "Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "viewIdentifierResolver", "Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;", "colorStringFormatter", "Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;", "viewBoundsResolver", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "drawableToColorMapper", "<init>", "(Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;)V", "Landroid/widget/NumberPicker;", "view", "Lcom/datadog/android/sessionreplay/recorder/MappingContext;", "mappingContext", "Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;", "asyncJobStatusCallback", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "map", "(Landroid/widget/NumberPicker;Lcom/datadog/android/sessionreplay/recorder/MappingContext;Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;Lcom/datadog/android/api/InternalLogger;)Ljava/util/List;", "p0", "", "p1", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/widget/NumberPicker;I)Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class NumberPickerMapper extends com.datadog.android.sessionreplay.internal.recorder.mapper.BasePickerMapper {
    public static final java.lang.String DEFAULT_MASKED_TEXT_VALUE = "xxx";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberPickerMapper(com.datadog.android.sessionreplay.utils.ViewIdentifierResolver viewIdentifierResolver, com.datadog.android.sessionreplay.utils.ColorStringFormatter colorStringFormatter, com.datadog.android.sessionreplay.utils.ViewBoundsResolver viewBoundsResolver, com.datadog.android.sessionreplay.utils.DrawableToColorMapper drawableToColorMapper) {
        super(viewIdentifierResolver, colorStringFormatter, viewBoundsResolver, drawableToColorMapper);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewIdentifierResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colorStringFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBoundsResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawableToColorMapper, "");
    }

    @Override // com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper
    public java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> map(android.widget.NumberPicker view, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext, com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback, com.datadog.android.api.InternalLogger internalLogger) {
        int maxValue;
        int minValue;
        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappingContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncJobStatusCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        android.widget.NumberPicker numberPicker = view;
        java.lang.Long resolveChildUniqueIdentifier = getViewIdentifierResolver().resolveChildUniqueIdentifier(numberPicker, com.datadog.android.sessionreplay.internal.recorder.mapper.BasePickerMapper.PREV_INDEX_KEY_NAME);
        java.lang.Long resolveChildUniqueIdentifier2 = getViewIdentifierResolver().resolveChildUniqueIdentifier(numberPicker, com.datadog.android.sessionreplay.internal.recorder.mapper.BasePickerMapper.SELECTED_INDEX_KEY_NAME);
        java.lang.Long resolveChildUniqueIdentifier3 = getViewIdentifierResolver().resolveChildUniqueIdentifier(numberPicker, com.datadog.android.sessionreplay.internal.recorder.mapper.BasePickerMapper.DIVIDER_TOP_KEY_NAME);
        java.lang.Long resolveChildUniqueIdentifier4 = getViewIdentifierResolver().resolveChildUniqueIdentifier(numberPicker, com.datadog.android.sessionreplay.internal.recorder.mapper.BasePickerMapper.DIVIDER_BOTTOM_KEY_NAME);
        java.lang.Long resolveChildUniqueIdentifier5 = getViewIdentifierResolver().resolveChildUniqueIdentifier(numberPicker, com.datadog.android.sessionreplay.internal.recorder.mapper.BasePickerMapper.NEXT_INDEX_KEY_NAME);
        if (resolveChildUniqueIdentifier2 != null && resolveChildUniqueIdentifier3 != null && resolveChildUniqueIdentifier4 != null && resolveChildUniqueIdentifier != null && resolveChildUniqueIdentifier5 != null) {
            com.datadog.android.sessionreplay.recorder.SystemInformation systemInformation = mappingContext.getSystemInformation();
            com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy = mappingContext.getTextAndInputPrivacy();
            long longValue = resolveChildUniqueIdentifier.longValue();
            long longValue2 = resolveChildUniqueIdentifier3.longValue();
            long longValue3 = resolveChildUniqueIdentifier2.longValue();
            long longValue4 = resolveChildUniqueIdentifier4.longValue();
            long longValue5 = resolveChildUniqueIdentifier5.longValue();
            float screenDensity = systemInformation.getScreenDensity();
            com.datadog.android.sessionreplay.utils.GlobalBounds resolveViewGlobalBounds = getViewBoundsResolver().resolveViewGlobalBounds(numberPicker, screenDensity);
            long resolveTextSize = resolveTextSize(view, screenDensity);
            long j = resolveTextSize * 2;
            long resolveDividerPaddingStart = resolveDividerPaddingStart(view, screenDensity);
            long resolveDividerPaddingEnd = resolveDividerPaddingEnd(view, screenDensity);
            java.lang.String resolveSelectedTextColor = resolveSelectedTextColor(view);
            java.lang.String formatColorAndAlphaAsHexString = getColorStringFormatter().formatColorAndAlphaAsHexString(view.getTextColor(), 64);
            long resolvePadding = resolvePadding(screenDensity);
            long resolveSelectedLabelYPos = resolveSelectedLabelYPos(resolveViewGlobalBounds, j);
            long resolveDividerHeight = resolveDividerHeight(screenDensity);
            long j2 = (resolveSelectedLabelYPos - resolveDividerHeight) - resolvePadding;
            long j3 = resolveSelectedLabelYPos + j + resolvePadding;
            long width = (resolveViewGlobalBounds.getWidth() - resolveDividerPaddingEnd) - resolveDividerPaddingStart;
            long x = resolveViewGlobalBounds.getX() + resolveDividerPaddingStart;
            long x2 = resolveViewGlobalBounds.getX();
            long width2 = resolveViewGlobalBounds.getWidth();
            if (view.getValue() > view.getMinValue()) {
                maxValue = view.getValue() - 1;
            } else {
                maxValue = view.getMaxValue();
            }
            com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe provideLabelWireframe = provideLabelWireframe(longValue, x2, (j2 - j) - resolvePadding, j, width2, getHighResolutionOutputSizeshNQ4ISI(view, maxValue), resolveTextSize, formatColorAndAlphaAsHexString);
            com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe provideDividerWireframe = provideDividerWireframe(longValue2, x, j2, width, resolveDividerHeight, resolveSelectedTextColor);
            com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe provideLabelWireframe2 = provideLabelWireframe(longValue3, resolveViewGlobalBounds.getX(), resolveSelectedLabelYPos, j, resolveViewGlobalBounds.getWidth(), getHighResolutionOutputSizeshNQ4ISI(view, view.getValue()), resolveTextSize, resolveSelectedTextColor);
            com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe provideDividerWireframe2 = provideDividerWireframe(longValue4, x, j3, width, resolveDividerHeight, resolveSelectedTextColor);
            long x3 = resolveViewGlobalBounds.getX();
            long width3 = resolveViewGlobalBounds.getWidth();
            if (view.getValue() < view.getMaxValue()) {
                minValue = view.getValue() + 1;
            } else {
                minValue = view.getMinValue();
            }
            com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe provideLabelWireframe3 = provideLabelWireframe(longValue5, x3, j3 + resolvePadding, j, width3, getHighResolutionOutputSizeshNQ4ISI(view, minValue), resolveTextSize, formatColorAndAlphaAsHexString);
            if (textAndInputPrivacy == com.datadog.android.sessionreplay.TextAndInputPrivacy.MASK_SENSITIVE_INPUTS) {
                return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe[]{provideLabelWireframe, provideDividerWireframe, provideLabelWireframe2, provideDividerWireframe2, provideLabelWireframe3});
            }
            copy = provideLabelWireframe2.copy((r33 & 1) != 0 ? provideLabelWireframe2.id : 0L, (r33 & 2) != 0 ? provideLabelWireframe2.x : 0L, (r33 & 4) != 0 ? provideLabelWireframe2.y : 0L, (r33 & 8) != 0 ? provideLabelWireframe2.width : 0L, (r33 & 16) != 0 ? provideLabelWireframe2.height : 0L, (r33 & 32) != 0 ? provideLabelWireframe2.clip : null, (r33 & 64) != 0 ? provideLabelWireframe2.shapeStyle : null, (r33 & 128) != 0 ? provideLabelWireframe2.border : null, (r33 & 256) != 0 ? provideLabelWireframe2.text : DEFAULT_MASKED_TEXT_VALUE, (r33 & 512) != 0 ? provideLabelWireframe2.textStyle : null, (r33 & 1024) != 0 ? provideLabelWireframe2.textPosition : null);
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe[]{provideDividerWireframe, copy, provideDividerWireframe2});
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(android.widget.NumberPicker p0, int p1) {
        int minValue = p1 - p0.getMinValue();
        if (p0.getDisplayedValues() != null && p0.getDisplayedValues().length > minValue) {
            java.lang.String str = p0.getDisplayedValues()[minValue];
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            return str;
        }
        return java.lang.String.valueOf(p1);
    }
}
