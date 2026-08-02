package com.datadog.android.sessionreplay.recorder.mapper;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u0000 &*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001&B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010$\u001a\u00020#2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b$\u0010%"}, d2 = {"Lcom/datadog/android/sessionreplay/recorder/mapper/TextViewMapper;", "Landroid/widget/TextView;", "T", "Lcom/datadog/android/sessionreplay/recorder/mapper/BaseAsyncBackgroundWireframeMapper;", "Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "viewIdentifierResolver", "Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;", "colorStringFormatter", "Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;", "viewBoundsResolver", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "drawableToColorMapper", "<init>", "(Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;)V", "textView", "Lcom/datadog/android/sessionreplay/recorder/MappingContext;", "mappingContext", "Lcom/datadog/android/sessionreplay/utils/GlobalBounds;", "viewGlobalBounds", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$TextWireframe;", "createTextWireframe", "(Landroid/widget/TextView;Lcom/datadog/android/sessionreplay/recorder/MappingContext;Lcom/datadog/android/sessionreplay/utils/GlobalBounds;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$TextWireframe;", "view", "Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;", "asyncJobStatusCallback", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "map", "(Landroid/widget/TextView;Lcom/datadog/android/sessionreplay/recorder/MappingContext;Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;Lcom/datadog/android/api/InternalLogger;)Ljava/util/List;", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "textAndInputPrivacy", "", "isOption", "", "resolveCapturedText", "(Landroid/widget/TextView;Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;Z)Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class TextViewMapper<T extends android.widget.TextView> extends com.datadog.android.sessionreplay.recorder.mapper.BaseAsyncBackgroundWireframeMapper<T> {
    public static final java.lang.String FIXED_INPUT_MASK = "***";
    public static final java.lang.String MONOSPACE_FAMILY_NAME = "monospace";
    public static final java.lang.String SANS_SERIF_FAMILY_NAME = "roboto, sans-serif";
    public static final java.lang.String SERIF_FAMILY_NAME = "serif";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextViewMapper(com.datadog.android.sessionreplay.utils.ViewIdentifierResolver viewIdentifierResolver, com.datadog.android.sessionreplay.utils.ColorStringFormatter colorStringFormatter, com.datadog.android.sessionreplay.utils.ViewBoundsResolver viewBoundsResolver, com.datadog.android.sessionreplay.utils.DrawableToColorMapper drawableToColorMapper) {
        super(viewIdentifierResolver, colorStringFormatter, viewBoundsResolver, drawableToColorMapper);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewIdentifierResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colorStringFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBoundsResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawableToColorMapper, "");
    }

    @Override // com.datadog.android.sessionreplay.recorder.mapper.BaseAsyncBackgroundWireframeMapper, com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper
    public java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> map(T view, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext, com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappingContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncJobStatusCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        T t = view;
        arrayList.addAll(super.map((com.datadog.android.sessionreplay.recorder.mapper.TextViewMapper<T>) t, mappingContext, asyncJobStatusCallback, internalLogger));
        arrayList.add(createTextWireframe(view, mappingContext, getViewBoundsResolver().resolveViewGlobalBounds(t, mappingContext.getSystemInformation().getScreenDensity())));
        arrayList.addAll(mappingContext.getImageWireframeHelper().createCompoundDrawableWireframes(view, mappingContext, arrayList.size(), null, asyncJobStatusCallback));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe createTextWireframe(T textView, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext, com.datadog.android.sessionreplay.utils.GlobalBounds viewGlobalBounds) {
        java.lang.String str;
        java.lang.CharSequence text;
        android.content.res.ColorStateList hintTextColors;
        java.lang.String formatColorAndAlphaAsHexString;
        android.text.TextUtils.TruncateAt ellipsize;
        com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode truncationMode;
        com.datadog.android.sessionreplay.model.MobileSegment.TextStyle textStyle;
        long j;
        com.datadog.android.sessionreplay.model.MobileSegment.Padding padding;
        com.datadog.android.sessionreplay.model.MobileSegment.Horizontal horizontal;
        com.datadog.android.sessionreplay.model.MobileSegment.Vertical vertical;
        com.datadog.android.sessionreplay.model.MobileSegment.Alignment alignment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappingContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGlobalBounds, "");
        java.lang.String resolveCapturedText = resolveCapturedText(textView, mappingContext.getTextAndInputPrivacy(), mappingContext.getHasOptionSelectorParent());
        long resolveViewId = resolveViewId(textView);
        long x = viewGlobalBounds.getX();
        long y = viewGlobalBounds.getY();
        long width = viewGlobalBounds.getWidth();
        long height = viewGlobalBounds.getHeight();
        float screenDensity = mappingContext.getSystemInformation().getScreenDensity();
        android.graphics.Typeface typeface = textView.getTypeface();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(typeface, android.graphics.Typeface.SANS_SERIF)) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(typeface, android.graphics.Typeface.MONOSPACE)) {
                str = MONOSPACE_FAMILY_NAME;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(typeface, android.graphics.Typeface.SERIF)) {
                str = "serif";
            }
            java.lang.String str2 = str;
            long densityNormalized = com.datadog.android.internal.utils.LongExtKt.densityNormalized((long) textView.getTextSize(), screenDensity);
            text = textView.getText();
            if (text == null && text.length() != 0) {
                formatColorAndAlphaAsHexString = getColorStringFormatter().formatColorAndAlphaAsHexString(textView.getCurrentTextColor(), 255);
            } else {
                hintTextColors = textView.getHintTextColors();
                if (hintTextColors == null) {
                    formatColorAndAlphaAsHexString = getColorStringFormatter().formatColorAndAlphaAsHexString(hintTextColors.getDefaultColor(), 255);
                } else {
                    formatColorAndAlphaAsHexString = getColorStringFormatter().formatColorAndAlphaAsHexString(textView.getCurrentTextColor(), 255);
                }
            }
            java.lang.String str3 = formatColorAndAlphaAsHexString;
            ellipsize = textView.getEllipsize();
            if (ellipsize == null) {
                int i = com.datadog.android.sessionreplay.recorder.mapper.TextViewMapper.WhenMappings.$EnumSwitchMapping$1[ellipsize.ordinal()];
                if (i == 1) {
                    truncationMode = com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode.HEAD;
                } else if (i == 2) {
                    truncationMode = com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode.TAIL;
                } else if (i == 3) {
                    truncationMode = com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode.MIDDLE;
                } else {
                    if (i != 4) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    truncationMode = com.datadog.android.sessionreplay.model.MobileSegment.TruncationMode.CLIP;
                }
            } else {
                truncationMode = null;
            }
            com.datadog.android.sessionreplay.model.MobileSegment.TextStyle textStyle2 = new com.datadog.android.sessionreplay.model.MobileSegment.TextStyle(str2, densityNormalized, str3, truncationMode);
            float screenDensity2 = mappingContext.getSystemInformation().getScreenDensity();
            if (textView.getLayout() == null) {
                j = width;
                textStyle = textStyle2;
                padding = new com.datadog.android.sessionreplay.model.MobileSegment.Padding(java.lang.Long.valueOf(com.datadog.android.internal.utils.IntExtKt.densityNormalized(textView.getTotalPaddingTop(), screenDensity2)), java.lang.Long.valueOf(com.datadog.android.internal.utils.IntExtKt.densityNormalized(textView.getTotalPaddingBottom(), screenDensity2)), java.lang.Long.valueOf(com.datadog.android.internal.utils.IntExtKt.densityNormalized(textView.getTotalPaddingStart(), screenDensity2)), java.lang.Long.valueOf(com.datadog.android.internal.utils.IntExtKt.densityNormalized(textView.getTotalPaddingEnd(), screenDensity2)));
            } else {
                textStyle = textStyle2;
                j = width;
                padding = new com.datadog.android.sessionreplay.model.MobileSegment.Padding(java.lang.Long.valueOf(com.datadog.android.internal.utils.IntExtKt.densityNormalized(textView.getPaddingTop(), screenDensity2)), java.lang.Long.valueOf(com.datadog.android.internal.utils.IntExtKt.densityNormalized(textView.getPaddingBottom(), screenDensity2)), java.lang.Long.valueOf(com.datadog.android.internal.utils.IntExtKt.densityNormalized(textView.getPaddingStart(), screenDensity2)), java.lang.Long.valueOf(com.datadog.android.internal.utils.IntExtKt.densityNormalized(textView.getPaddingEnd(), screenDensity2)));
            }
            switch (textView.getTextAlignment()) {
                case 1:
                    int gravity = textView.getGravity() & 7;
                    if (gravity != 1) {
                        if (gravity != 3) {
                            if (gravity != 5) {
                                if (gravity == 17) {
                                    horizontal = com.datadog.android.sessionreplay.model.MobileSegment.Horizontal.CENTER;
                                } else if (gravity != 8388611) {
                                    if (gravity != 8388613) {
                                        horizontal = com.datadog.android.sessionreplay.model.MobileSegment.Horizontal.LEFT;
                                    }
                                }
                            }
                            horizontal = com.datadog.android.sessionreplay.model.MobileSegment.Horizontal.RIGHT;
                        }
                        horizontal = com.datadog.android.sessionreplay.model.MobileSegment.Horizontal.LEFT;
                    } else {
                        horizontal = com.datadog.android.sessionreplay.model.MobileSegment.Horizontal.CENTER;
                    }
                    int gravity2 = textView.getGravity() & 112;
                    if (gravity2 != 16) {
                        if (gravity2 == 17) {
                            vertical = com.datadog.android.sessionreplay.model.MobileSegment.Vertical.CENTER;
                        } else if (gravity2 == 48) {
                            vertical = com.datadog.android.sessionreplay.model.MobileSegment.Vertical.TOP;
                        } else if (gravity2 == 80) {
                            vertical = com.datadog.android.sessionreplay.model.MobileSegment.Vertical.BOTTOM;
                        }
                        alignment = new com.datadog.android.sessionreplay.model.MobileSegment.Alignment(horizontal, vertical);
                        break;
                    }
                    vertical = com.datadog.android.sessionreplay.model.MobileSegment.Vertical.CENTER;
                    alignment = new com.datadog.android.sessionreplay.model.MobileSegment.Alignment(horizontal, vertical);
                case 2:
                case 5:
                    alignment = new com.datadog.android.sessionreplay.model.MobileSegment.Alignment(com.datadog.android.sessionreplay.model.MobileSegment.Horizontal.LEFT, com.datadog.android.sessionreplay.model.MobileSegment.Vertical.CENTER);
                    break;
                case 3:
                case 6:
                    alignment = new com.datadog.android.sessionreplay.model.MobileSegment.Alignment(com.datadog.android.sessionreplay.model.MobileSegment.Horizontal.RIGHT, com.datadog.android.sessionreplay.model.MobileSegment.Vertical.CENTER);
                    break;
                case 4:
                    alignment = new com.datadog.android.sessionreplay.model.MobileSegment.Alignment(com.datadog.android.sessionreplay.model.MobileSegment.Horizontal.CENTER, com.datadog.android.sessionreplay.model.MobileSegment.Vertical.CENTER);
                    break;
                default:
                    alignment = new com.datadog.android.sessionreplay.model.MobileSegment.Alignment(com.datadog.android.sessionreplay.model.MobileSegment.Horizontal.LEFT, com.datadog.android.sessionreplay.model.MobileSegment.Vertical.CENTER);
                    break;
            }
            return new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe(resolveViewId, x, y, j, height, null, null, null, resolveCapturedText, textStyle, new com.datadog.android.sessionreplay.model.MobileSegment.TextPosition(padding, alignment), 32, null);
        }
        str = SANS_SERIF_FAMILY_NAME;
        java.lang.String str22 = str;
        long densityNormalized2 = com.datadog.android.internal.utils.LongExtKt.densityNormalized((long) textView.getTextSize(), screenDensity);
        text = textView.getText();
        if (text == null) {
        }
        hintTextColors = textView.getHintTextColors();
        if (hintTextColors == null) {
        }
        java.lang.String str32 = formatColorAndAlphaAsHexString;
        ellipsize = textView.getEllipsize();
        if (ellipsize == null) {
        }
        com.datadog.android.sessionreplay.model.MobileSegment.TextStyle textStyle22 = new com.datadog.android.sessionreplay.model.MobileSegment.TextStyle(str22, densityNormalized2, str32, truncationMode);
        float screenDensity22 = mappingContext.getSystemInformation().getScreenDensity();
        if (textView.getLayout() == null) {
        }
        switch (textView.getTextAlignment()) {
        }
        return new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe(resolveViewId, x, y, j, height, null, null, null, resolveCapturedText, textStyle, new com.datadog.android.sessionreplay.model.MobileSegment.TextPosition(padding, alignment), 32, null);
    }

    protected java.lang.String resolveCapturedText(T textView, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, boolean isOption) {
        java.lang.CharSequence text;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textAndInputPrivacy, "");
        android.text.Layout layout = textView.getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            text = textView.getText();
        }
        java.lang.String obj = text != null ? text.toString() : null;
        java.lang.String str = obj != null ? obj : "";
        int i = com.datadog.android.sessionreplay.recorder.mapper.TextViewMapper.WhenMappings.$EnumSwitchMapping$0[textAndInputPrivacy.ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            return isOption ? FIXED_INPUT_MASK : com.datadog.android.sessionreplay.internal.recorder.obfuscator.StringObfuscator.INSTANCE.getStringObfuscator().obfuscate(str);
        }
        if (i == 3) {
            return isOption ? FIXED_INPUT_MASK : str;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.datadog.android.sessionreplay.TextAndInputPrivacy.values().length];
            try {
                iArr[com.datadog.android.sessionreplay.TextAndInputPrivacy.MASK_SENSITIVE_INPUTS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.datadog.android.sessionreplay.TextAndInputPrivacy.MASK_ALL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.datadog.android.sessionreplay.TextAndInputPrivacy.MASK_ALL_INPUTS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[android.text.TextUtils.TruncateAt.values().length];
            try {
                iArr2[android.text.TextUtils.TruncateAt.START.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[android.text.TextUtils.TruncateAt.END.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[android.text.TextUtils.TruncateAt.MIDDLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[android.text.TextUtils.TruncateAt.MARQUEE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
