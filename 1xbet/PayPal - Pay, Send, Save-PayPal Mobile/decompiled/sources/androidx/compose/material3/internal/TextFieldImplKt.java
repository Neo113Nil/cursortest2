package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000®\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b&\u001a\u0099\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\b2\u0006\u0010\t\u001a\u00020\n2\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\b¢\u0006\u0002\b\u000e2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010 \u001a2\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0011\u0010/\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\b0\u00101\u001a*\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020,2\u0011\u0010/\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\b2\u00103\u001a\u001c\u00104\u001a\u000205*\u0002052\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u00106\u001a\u000207H\u0000\u001a\u001c\u00108\u001a\u000205*\u0002052\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0000\u001a\u001a\u0010=\u001a\u000205*\u0002052\f\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u0007H\u0000\u001aÔ\u0001\u0010@\u001a\u00020\u00012\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020,2\u0006\u0010D\u001a\u00020,2\u0006\u0010E\u001a\u00020,2\u0006\u0010!\u001a\u00020\u00162\u0099\u0001\u0010/\u001a\u0094\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020H0G¢\u0006\f\bI\u0012\b\bJ\u0012\u0004\b\b(K\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020,0G¢\u0006\f\bI\u0012\b\bJ\u0012\u0004\b\b(L\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020,0G¢\u0006\f\bI\u0012\b\bJ\u0012\u0004\b\b(M\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020H0G¢\u0006\f\bI\u0012\b\bJ\u0012\u0004\b\b(N\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020H0G¢\u0006\f\bI\u0012\b\bJ\u0012\u0004\b\b(O\u0012\u0004\u0012\u00020\u00010F¢\u0006\u0002\b\bH\u0083\b¢\u0006\u0004\bP\u0010Q\u001aE\u0010R\u001a\b\u0012\u0004\u0012\u00020S0G2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010T\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010U\u001a\u00020?2\u0006\u0010V\u001a\u00020?H\u0001¢\u0006\u0004\bW\u0010X\u001a\r\u0010b\u001a\u00020?H\u0001¢\u0006\u0002\u0010c\u001a\r\u0010d\u001a\u00020?H\u0001¢\u0006\u0002\u0010c\"\u0018\u0010!\u001a\u00020\u0016*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0018\u0010$\u001a\u00020%*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'\"\u0018\u0010(\u001a\u00020%*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'\"\u000e\u0010Y\u001a\u000207X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010Z\u001a\u000207X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010[\u001a\u000207X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\\\u001a\u000207X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010]\u001a\u000207X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010^\u001a\u000207X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010_\u001a\u000207X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010`\u001a\u000207X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010a\u001a\u000207X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010e\u001a\u00020?X\u0080\u0004¢\u0006\n\n\u0002\u0010h\u001a\u0004\bf\u0010g\"\u0016\u0010i\u001a\u00020?X\u0080\u0004¢\u0006\n\n\u0002\u0010h\u001a\u0004\bj\u0010g\"\u0016\u0010k\u001a\u00020?X\u0080\u0004¢\u0006\n\n\u0002\u0010h\u001a\u0004\bl\u0010g\"\u0016\u0010m\u001a\u00020?X\u0080\u0004¢\u0006\n\n\u0002\u0010h\u001a\u0004\bn\u0010g\"\u0016\u0010o\u001a\u00020?X\u0080\u0004¢\u0006\n\n\u0002\u0010h\u001a\u0004\bp\u0010g\"\u0016\u0010q\u001a\u00020?X\u0080\u0004¢\u0006\n\n\u0002\u0010h\u001a\u0004\br\u0010g\"\u0016\u0010s\u001a\u00020?X\u0080\u0004¢\u0006\n\n\u0002\u0010h\u001a\u0004\bt\u0010g\"\u0016\u0010u\u001a\u00020?X\u0080\u0004¢\u0006\n\n\u0002\u0010h\u001a\u0004\bv\u0010g¨\u0006w²\u0006\n\u0010x\u001a\u00020\u0016X\u008a\u0084\u0002²\u0006\n\u0010y\u001a\u00020\u0016X\u008a\u0084\u0002"}, d2 = {"CommonDecorationBox", "", "type", "Landroidx/compose/material3/internal/TextFieldType;", "visualText", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "labelPosition", "Landroidx/compose/material3/TextFieldLabelPosition;", "label", "Lkotlin/Function1;", "Landroidx/compose/material3/TextFieldLabelScope;", "Lkotlin/ExtensionFunctionType;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_PLACEHOLDER, "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "singleLine", "", "enabled", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material3/TextFieldColors;", "container", "(Landroidx/compose/material3/internal/TextFieldType;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldLabelPosition;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "showExpandedLabel", "getShowExpandedLabel", "(Landroidx/compose/material3/TextFieldLabelPosition;)Z", "minimizedAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "getMinimizedAlignment", "(Landroidx/compose/material3/TextFieldLabelPosition;)Landroidx/compose/ui/Alignment$Horizontal;", "expandedAlignment", "getExpandedAlignment", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "content", "Decoration-3J-VO9M", "(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Decoration-Iv8Zu3U", "(JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "defaultErrorSemantics", "Landroidx/compose/ui/Modifier;", "defaultErrorMessage", "", "textFieldBackground", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/ColorProducer;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Shape;", "textFieldLabelMinHeight", "minHeight", "Landroidx/compose/ui/unit/Dp;", "TextFieldTransitionScope", "inputState", "Landroidx/compose/material3/internal/InputPhase;", "focusedLabelTextStyleColor", "unfocusedLabelTextStyleColor", "labelColor", "Lkotlin/Function5;", "Landroidx/compose/runtime/State;", "", "Lkotlin/ParameterName;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "prefixSuffixOpacity", "TextFieldTransitionScope-Jy8F4Js", "(Landroidx/compose/material3/internal/InputPhase;JJJZLkotlin/jvm/functions/Function7;Landroidx/compose/runtime/Composer;I)V", "animateBorderStrokeAsState", "Landroidx/compose/foundation/BorderStroke;", "focused", "focusedBorderThickness", "unfocusedBorderThickness", "animateBorderStrokeAsState-NuRrP5Q", "(ZZZLandroidx/compose/material3/TextFieldColors;FFLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "TextFieldId", "PlaceholderId", "LabelId", "LeadingId", "TrailingId", "PrefixId", "SuffixId", "SupportingId", "ContainerId", "textFieldHorizontalIconPadding", "(Landroidx/compose/runtime/Composer;I)F", "minimizedLabelHalfHeight", "TextFieldPadding", "getTextFieldPadding", "()F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "AboveLabelHorizontalPadding", "getAboveLabelHorizontalPadding", "AboveLabelBottomPadding", "getAboveLabelBottomPadding", "SupportingTopPadding", "getSupportingTopPadding", "PrefixSuffixTextPadding", "getPrefixSuffixTextPadding", "MinTextLineHeight", "getMinTextLineHeight", "MinFocusedLabelLineHeight", "getMinFocusedLabelLineHeight", "MinSupportingTextLineHeight", "getMinSupportingTextLineHeight", "material3", "showPlaceholder", "showPrefixSuffix"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldImplKt {
    public static final java.lang.String ContainerId = "Container";
    public static final java.lang.String LabelId = "Label";
    public static final java.lang.String LeadingId = "Leading";
    public static final java.lang.String PlaceholderId = "Hint";
    public static final java.lang.String PrefixId = "Prefix";
    public static final java.lang.String SuffixId = "Suffix";
    public static final java.lang.String SupportingId = "Supporting";
    public static final java.lang.String TextFieldId = "TextField";
    public static final java.lang.String TrailingId = "Trailing";
    private static final float getInputSizeshNQ4ISI = androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f);
    private static final float getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f);
    private static final float getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f);
    private static final float getOutputMinFrameDuration = androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f);
    private static final float getOutputFormats = androidx.compose.ui.unit.Dp.m8601constructorimpl(2.0f);
    private static final float getHighSpeedVideoSizes = androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f);
    private static final float Camera2StreamConfigurationMap = androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f);
    private static final float getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f);

    /* JADX WARN: Code restructure failed: missing block: B:386:0x03b8, code lost:
    
        if (r13 == false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0378, code lost:
    
        if (r13 == false) goto L230;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0470  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CommonDecorationBox(final androidx.compose.material3.internal.TextFieldType textFieldType, final java.lang.CharSequence charSequence, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, final androidx.compose.material3.TextFieldLabelPosition textFieldLabelPosition, final kotlin.jvm.functions.Function3<? super androidx.compose.material3.TextFieldLabelScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27, final boolean z, final boolean z2, final boolean z3, final androidx.compose.foundation.interaction.InteractionSource interactionSource, final androidx.compose.foundation.layout.PaddingValues paddingValues, final androidx.compose.material3.TextFieldColors textFieldColors, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.foundation.interaction.InteractionSource interactionSource2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.material3.internal.InputPhase inputPhase;
        long j;
        boolean z4;
        float f;
        int i5;
        float f2;
        int i6;
        float f3;
        int i7;
        float f4;
        int i8;
        float f5;
        int i9;
        float f6;
        boolean changed;
        java.lang.Object rememberedValue;
        androidx.compose.material3.internal.InputPhase inputPhase2;
        boolean changed2;
        java.lang.Object rememberedValue2;
        int i10;
        java.lang.Object rememberedValue3;
        boolean z5;
        int i11;
        androidx.compose.runtime.Composer composer3;
        androidx.compose.ui.text.TextStyle textStyle;
        androidx.compose.material3.TextFieldColors textFieldColors2;
        int i12;
        boolean z6;
        androidx.compose.runtime.State state;
        androidx.compose.runtime.State state2;
        boolean z7;
        int i13;
        androidx.compose.runtime.State state3;
        androidx.compose.runtime.internal.ComposableLambda composableLambda;
        java.lang.Object rememberedValue4;
        final androidx.compose.runtime.State state4;
        androidx.compose.runtime.internal.ComposableLambda composableLambda2;
        java.lang.Object rememberedValue5;
        final androidx.compose.runtime.State state5;
        androidx.compose.runtime.internal.ComposableLambda composableLambda3;
        androidx.compose.runtime.internal.ComposableLambda composableLambda4;
        androidx.compose.runtime.internal.ComposableLambda composableLambda5;
        androidx.compose.runtime.internal.ComposableLambda composableLambda6;
        androidx.compose.runtime.internal.ComposableLambda composableLambda7;
        int i14;
        androidx.compose.runtime.internal.ComposableLambda composableLambda8;
        int i15;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(546805032);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(textFieldType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(charSequence) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(textFieldLabelPosition) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function23) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function25) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function26) ? 536870912 : 268435456;
        }
        int i16 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changedInstance(function27) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            interactionSource2 = interactionSource;
            i4 |= startRestartGroup.changed(interactionSource2) ? 16384 : 8192;
        } else {
            interactionSource2 = interactionSource;
        }
        if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changed(paddingValues) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= startRestartGroup.changed(textFieldColors) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= startRestartGroup.changedInstance(function28) ? 8388608 : 4194304;
        }
        if (!startRestartGroup.shouldExecute(((i16 & 306783379) == 306783378 && (4793491 & i4) == 4793490) ? false : true, i16 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(546805032, i16, i4, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:98)");
            }
            boolean booleanValue = androidx.compose.foundation.interaction.FocusInteractionKt.collectIsFocusedAsState(interactionSource2, startRestartGroup, (i4 >> 12) & 14).getValue().booleanValue();
            if (booleanValue) {
                inputPhase = androidx.compose.material3.internal.InputPhase.getHighSpeedVideoFpsRangesFor;
            } else {
                inputPhase = charSequence.length() == 0 ? androidx.compose.material3.internal.InputPhase.getHighResolutionOutputSizeshNQ4ISI : androidx.compose.material3.internal.InputPhase.getHighSpeedVideoFpsRanges;
            }
            long m3940labelColorXeAY9LY$material3 = textFieldColors.m3940labelColorXeAY9LY$material3(z2, z3, booleanValue);
            androidx.compose.material3.Typography typography = androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
            final androidx.compose.ui.text.TextStyle bodyLarge = typography.getBodyLarge();
            final androidx.compose.ui.text.TextStyle bodySmall = typography.getBodySmall();
            int i17 = i4;
            boolean z8 = (androidx.compose.ui.graphics.Color.m5997equalsimpl0(bodyLarge.m8069getColor0d7_KjU(), androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU()) && !androidx.compose.ui.graphics.Color.m5997equalsimpl0(bodySmall.m8069getColor0d7_KjU(), androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU())) || (!androidx.compose.ui.graphics.Color.m5997equalsimpl0(bodyLarge.m8069getColor0d7_KjU(), androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU()) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(bodySmall.m8069getColor0d7_KjU(), androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU()));
            long m8069getColor0d7_KjU = bodySmall.m8069getColor0d7_KjU();
            if (z8 && m8069getColor0d7_KjU == 16) {
                m8069getColor0d7_KjU = m3940labelColorXeAY9LY$material3;
            }
            long m8069getColor0d7_KjU2 = bodyLarge.m8069getColor0d7_KjU();
            long j2 = (z8 && m8069getColor0d7_KjU2 == 16) ? m3940labelColorXeAY9LY$material3 : m8069getColor0d7_KjU2;
            if (function3 == null || !(textFieldLabelPosition instanceof androidx.compose.material3.TextFieldLabelPosition.Attached) || ((androidx.compose.material3.TextFieldLabelPosition.Attached) textFieldLabelPosition).getAlwaysMinimize()) {
                j = m8069getColor0d7_KjU;
                z4 = false;
            } else {
                j = m8069getColor0d7_KjU;
                z4 = true;
            }
            androidx.compose.animation.core.Transition updateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(inputPhase, "TextFieldInputState", startRestartGroup, 48, 0);
            final androidx.compose.animation.core.FiniteAnimationSpec value = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6);
            kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>> function32 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelProgress$1
                public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer4, int i18) {
                    composer4.startReplaceGroup(-709912974);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-709912974, i18, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:390)");
                    }
                    androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec = value;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer4.endReplaceGroup();
                    return finiteAnimationSpec;
                }

                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                    return invoke(segment, composer4, num.intValue());
                }
            };
            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
            androidx.compose.material3.internal.InputPhase inputPhase3 = (androidx.compose.material3.internal.InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceGroup(-1436405362);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1436405362, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:391)");
            }
            int i18 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase3.ordinal()];
            if (i18 != 1) {
                if (i18 != 2) {
                    if (i18 != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                } else if (z4) {
                    f = 0.0f;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    startRestartGroup.endReplaceGroup();
                    androidx.compose.material3.internal.InputPhase inputPhase4 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceGroup(-1436405362);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1436405362, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:391)");
                    }
                    i5 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase4.ordinal()];
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                        } else if (z4) {
                            f2 = 0.0f;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceGroup();
                            final androidx.compose.runtime.State createTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2), function32.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter, "LabelProgress", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            final androidx.compose.animation.core.FiniteAnimationSpec value2 = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                            final androidx.compose.animation.core.FiniteAnimationSpec value3 = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.SlowEffects, startRestartGroup, 6);
                            kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>> function33 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1
                                @Override // kotlin.jvm.functions.Function3
                                public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                    return invoke(segment, composer4, num.intValue());
                                }

                                public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer4, int i19) {
                                    androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec;
                                    composer4.startReplaceGroup(-984009111);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(-984009111, i19, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:404)");
                                    }
                                    if (segment.isTransitioningTo(androidx.compose.material3.internal.InputPhase.getHighSpeedVideoFpsRangesFor, androidx.compose.material3.internal.InputPhase.getHighResolutionOutputSizeshNQ4ISI)) {
                                        finiteAnimationSpec = value2;
                                    } else if (segment.isTransitioningTo(androidx.compose.material3.internal.InputPhase.getHighResolutionOutputSizeshNQ4ISI, androidx.compose.material3.internal.InputPhase.getHighSpeedVideoFpsRangesFor) || segment.isTransitioningTo(androidx.compose.material3.internal.InputPhase.getHighSpeedVideoFpsRanges, androidx.compose.material3.internal.InputPhase.getHighResolutionOutputSizeshNQ4ISI)) {
                                        finiteAnimationSpec = value3;
                                    } else {
                                        finiteAnimationSpec = value2;
                                    }
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    composer4.endReplaceGroup();
                                    return finiteAnimationSpec;
                                }
                            };
                            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter2 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
                            androidx.compose.material3.internal.InputPhase inputPhase5 = (androidx.compose.material3.internal.InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceGroup(-1093194547);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1093194547, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:416)");
                            }
                            i6 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase5.ordinal()];
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    if (i6 != 3) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                }
                                f3 = 0.0f;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                startRestartGroup.endReplaceGroup();
                                androidx.compose.material3.internal.InputPhase inputPhase6 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceGroup(-1093194547);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1093194547, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:416)");
                                }
                                i7 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase6.ordinal()];
                                if (i7 != 1) {
                                    if (i7 != 2) {
                                        if (i7 != 3) {
                                            throw new kotlin.NoWhenBranchMatchedException();
                                        }
                                    }
                                    f4 = 0.0f;
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    androidx.compose.runtime.State createTransitionAnimation2 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(f3), java.lang.Float.valueOf(f4), function33.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>> function34 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                            return invoke(segment, composer4, num.intValue());
                                        }

                                        public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer4, int i19) {
                                            composer4.startReplaceGroup(2126293195);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventStart(2126293195, i19, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:426)");
                                            }
                                            androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec = value2;
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            }
                                            composer4.endReplaceGroup();
                                            return finiteAnimationSpec;
                                        }
                                    };
                                    androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter3 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
                                    androidx.compose.material3.internal.InputPhase inputPhase7 = (androidx.compose.material3.internal.InputPhase) updateTransition.getCurrentState();
                                    startRestartGroup.startReplaceGroup(-1258455321);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(-1258455321, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:428)");
                                    }
                                    i8 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase7.ordinal()];
                                    if (i8 != 1) {
                                        if (i8 != 2) {
                                            if (i8 != 3) {
                                                throw new kotlin.NoWhenBranchMatchedException();
                                            }
                                        } else if (z4) {
                                            f5 = 0.0f;
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            androidx.compose.material3.internal.InputPhase inputPhase8 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
                                            startRestartGroup.startReplaceGroup(-1258455321);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventStart(-1258455321, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:428)");
                                            }
                                            i9 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase8.ordinal()];
                                            if (i9 != 1) {
                                                if (i9 != 2) {
                                                    if (i9 != 3) {
                                                        throw new kotlin.NoWhenBranchMatchedException();
                                                    }
                                                } else if (z4) {
                                                    f6 = 0.0f;
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                    }
                                                    startRestartGroup.endReplaceGroup();
                                                    androidx.compose.runtime.State createTransitionAnimation3 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(f5), java.lang.Float.valueOf(f6), function34.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter3, "PrefixSuffixOpacity", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                    final androidx.compose.animation.core.FiniteAnimationSpec value4 = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                                                    kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>> function35 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1
                                                        @Override // kotlin.jvm.functions.Function3
                                                        public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                                            return invoke(segment, composer4, num.intValue());
                                                        }

                                                        public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer4, int i19) {
                                                            composer4.startReplaceGroup(1954111929);
                                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                androidx.compose.runtime.ComposerKt.traceEventStart(1954111929, i19, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:438)");
                                                            }
                                                            androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> finiteAnimationSpec = value4;
                                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                            }
                                                            composer4.endReplaceGroup();
                                                            return finiteAnimationSpec;
                                                        }
                                                    };
                                                    androidx.compose.material3.internal.InputPhase inputPhase9 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
                                                    startRestartGroup.startReplaceGroup(-12973394);
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventStart(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
                                                    }
                                                    long j3 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase9.ordinal()] == 1 ? j : j2;
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                    }
                                                    startRestartGroup.endReplaceGroup();
                                                    androidx.compose.ui.graphics.colorspace.ColorSpace m6000getColorSpaceimpl = androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(j3);
                                                    changed = startRestartGroup.changed(m6000getColorSpaceimpl);
                                                    rememberedValue = startRestartGroup.rememberedValue();
                                                    if (!changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m6000getColorSpaceimpl);
                                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                                    }
                                                    androidx.compose.animation.core.TwoWayConverter twoWayConverter = (androidx.compose.animation.core.TwoWayConverter) rememberedValue;
                                                    androidx.compose.material3.internal.InputPhase inputPhase10 = (androidx.compose.material3.internal.InputPhase) updateTransition.getCurrentState();
                                                    startRestartGroup.startReplaceGroup(-12973394);
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventStart(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
                                                    }
                                                    long j4 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase10.ordinal()] == 1 ? j : j2;
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                    }
                                                    startRestartGroup.endReplaceGroup();
                                                    androidx.compose.ui.graphics.Color m5986boximpl = androidx.compose.ui.graphics.Color.m5986boximpl(j4);
                                                    inputPhase2 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
                                                    startRestartGroup.startReplaceGroup(-12973394);
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventStart(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
                                                    }
                                                    if (androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase2.ordinal()] == 1) {
                                                        j2 = j;
                                                    }
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                    }
                                                    startRestartGroup.endReplaceGroup();
                                                    final androidx.compose.runtime.State createTransitionAnimation4 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, m5986boximpl, androidx.compose.ui.graphics.Color.m5986boximpl(j2), function35.invoke(updateTransition.getSegment(), startRestartGroup, 0), twoWayConverter, "LabelTextStyleColor", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                    kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>> function36 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1
                                                        @Override // kotlin.jvm.functions.Function3
                                                        public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                                            return invoke(segment, composer4, num.intValue());
                                                        }

                                                        public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer4, int i19) {
                                                            composer4.startReplaceGroup(1190923886);
                                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                androidx.compose.runtime.ComposerKt.traceEventStart(1190923886, i19, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:450)");
                                                            }
                                                            androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> finiteAnimationSpec = value4;
                                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                            }
                                                            composer4.endReplaceGroup();
                                                            return finiteAnimationSpec;
                                                        }
                                                    };
                                                    startRestartGroup.startReplaceGroup(-464752477);
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventStart(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
                                                    }
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                    }
                                                    startRestartGroup.endReplaceGroup();
                                                    androidx.compose.ui.graphics.colorspace.ColorSpace m6000getColorSpaceimpl2 = androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(m3940labelColorXeAY9LY$material3);
                                                    changed2 = startRestartGroup.changed(m6000getColorSpaceimpl2);
                                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                                    if (!changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue2 = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m6000getColorSpaceimpl2);
                                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                                    }
                                                    androidx.compose.animation.core.TwoWayConverter twoWayConverter2 = (androidx.compose.animation.core.TwoWayConverter) rememberedValue2;
                                                    startRestartGroup.startReplaceGroup(-464752477);
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventStart(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
                                                    }
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                    }
                                                    startRestartGroup.endReplaceGroup();
                                                    androidx.compose.ui.graphics.Color m5986boximpl2 = androidx.compose.ui.graphics.Color.m5986boximpl(m3940labelColorXeAY9LY$material3);
                                                    startRestartGroup.startReplaceGroup(-464752477);
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        i10 = 0;
                                                        androidx.compose.runtime.ComposerKt.traceEventStart(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
                                                    } else {
                                                        i10 = 0;
                                                    }
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                    }
                                                    startRestartGroup.endReplaceGroup();
                                                    final androidx.compose.runtime.State createTransitionAnimation5 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, m5986boximpl2, androidx.compose.ui.graphics.Color.m5986boximpl(m3940labelColorXeAY9LY$material3), function36.invoke(updateTransition.getSegment(), startRestartGroup, java.lang.Integer.valueOf(i10)), twoWayConverter2, "LabelContentColor", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue3 = new androidx.compose.material3.TextFieldLabelScope() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1
                                                            @Override // androidx.compose.material3.TextFieldLabelScope
                                                            public final float getLabelMinimizedProgress() {
                                                                return createTransitionAnimation.getValue().floatValue();
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                                    }
                                                    final androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$1 = (androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) rememberedValue3;
                                                    if (function3 == null) {
                                                        startRestartGroup.startReplaceGroup(-1891724857);
                                                        startRestartGroup.endReplaceGroup();
                                                        z6 = z3;
                                                        composer3 = startRestartGroup;
                                                        composableLambda = null;
                                                        state3 = createTransitionAnimation;
                                                        textStyle = bodySmall;
                                                        state = createTransitionAnimation2;
                                                        state2 = createTransitionAnimation3;
                                                        i11 = i17;
                                                        z5 = booleanValue;
                                                        i12 = i16;
                                                        z7 = z2;
                                                        textFieldColors2 = textFieldColors;
                                                        i13 = 54;
                                                    } else {
                                                        startRestartGroup.startReplaceGroup(-1891724856);
                                                        z5 = booleanValue;
                                                        i11 = i17;
                                                        composer3 = startRestartGroup;
                                                        textStyle = bodySmall;
                                                        textFieldColors2 = textFieldColors;
                                                        i12 = i16;
                                                        final boolean z9 = z8;
                                                        z6 = z3;
                                                        state = createTransitionAnimation2;
                                                        state2 = createTransitionAnimation3;
                                                        z7 = z2;
                                                        i13 = 54;
                                                        state3 = createTransitionAnimation;
                                                        androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1076580032, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                                                androidx.compose.ui.text.TextStyle textStyle2;
                                                                androidx.compose.ui.text.TextStyle m8065copyp1EtxEg;
                                                                androidx.compose.runtime.Composer composer5 = composer4;
                                                                int intValue = num.intValue();
                                                                if (!composer5.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                                                                    composer5.skipToGroupEnd();
                                                                } else {
                                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                        androidx.compose.runtime.ComposerKt.traceEventStart(-1076580032, intValue, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:139)");
                                                                    }
                                                                    androidx.compose.ui.text.TextStyle lerp = androidx.compose.ui.text.TextStyleKt.lerp(androidx.compose.ui.text.TextStyle.this, bodySmall, createTransitionAnimation.getValue().floatValue());
                                                                    boolean z10 = z9;
                                                                    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state6 = createTransitionAnimation4;
                                                                    if (z10) {
                                                                        m8065copyp1EtxEg = lerp.m8065copyp1EtxEg((r48 & 1) != 0 ? lerp.spanStyle.m7982getColor0d7_KjU() : state6.getValue().m6006unboximpl(), (r48 & 2) != 0 ? lerp.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? lerp.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? lerp.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? lerp.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? lerp.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? lerp.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? lerp.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? lerp.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? lerp.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? lerp.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? lerp.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? lerp.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? lerp.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? lerp.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? lerp.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? lerp.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? lerp.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? lerp.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? lerp.platformStyle : null, (r48 & 1048576) != 0 ? lerp.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? lerp.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? lerp.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? lerp.paragraphStyle.getTextMotion() : null);
                                                                        textStyle2 = m8065copyp1EtxEg;
                                                                    } else {
                                                                        textStyle2 = lerp;
                                                                    }
                                                                    long m6006unboximpl = createTransitionAnimation5.getValue().m6006unboximpl();
                                                                    final kotlin.jvm.functions.Function3<androidx.compose.material3.TextFieldLabelScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function37 = function3;
                                                                    final androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$12 = textFieldImplKt$CommonDecorationBox$3$labelScope$1$1;
                                                                    androidx.compose.material3.internal.TextFieldImplKt.getHighResolutionOutputSizeshNQ4ISI(m6006unboximpl, textStyle2, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1157484991, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1.1
                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer6, java.lang.Integer num2) {
                                                                            androidx.compose.runtime.Composer composer7 = composer6;
                                                                            int intValue2 = num2.intValue();
                                                                            if (composer7.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                                                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                                    androidx.compose.runtime.ComposerKt.traceEventStart(1157484991, intValue2, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:147)");
                                                                                }
                                                                                function37.invoke(textFieldImplKt$CommonDecorationBox$3$labelScope$1$12, composer7, 6);
                                                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                                                }
                                                                            } else {
                                                                                composer7.skipToGroupEnd();
                                                                            }
                                                                            return kotlin.Unit.INSTANCE;
                                                                        }
                                                                    }, composer5, 54), composer5, 384);
                                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                                    }
                                                                }
                                                                return kotlin.Unit.INSTANCE;
                                                            }
                                                        }, composer3, 54);
                                                        composer3.endReplaceGroup();
                                                        composableLambda = rememberComposableLambda;
                                                    }
                                                    long m3942placeholderColorXeAY9LY$material3 = textFieldColors2.m3942placeholderColorXeAY9LY$material3(z7, z6, z5);
                                                    rememberedValue4 = composer3.rememberedValue();
                                                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                        state4 = state;
                                                        rememberedValue4 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy(), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda2
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final java.lang.Object invoke() {
                                                                return java.lang.Boolean.valueOf(androidx.compose.material3.internal.TextFieldImplKt.m4385$r8$lambda$vqLrue76vHClr9YqteauRxoGEY(androidx.compose.runtime.State.this));
                                                            }
                                                        });
                                                        composer3.updateRememberedValue(rememberedValue4);
                                                    } else {
                                                        state4 = state;
                                                    }
                                                    androidx.compose.runtime.State state6 = (androidx.compose.runtime.State) rememberedValue4;
                                                    if (function22 == null && charSequence.length() == 0 && ((java.lang.Boolean) state6.getValue()).booleanValue()) {
                                                        composer3.startReplaceGroup(-1890614312);
                                                        androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1405547205, true, new androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1(state4, m3942placeholderColorXeAY9LY$material3, bodyLarge, function22), composer3, i13);
                                                        composer3.endReplaceGroup();
                                                        composableLambda2 = rememberComposableLambda2;
                                                    } else {
                                                        composer3.startReplaceGroup(-1890217110);
                                                        composer3.endReplaceGroup();
                                                        composableLambda2 = null;
                                                    }
                                                    long m3943prefixColorXeAY9LY$material3 = textFieldColors2.m3943prefixColorXeAY9LY$material3(z7, z6, z5);
                                                    rememberedValue5 = composer3.rememberedValue();
                                                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                        state5 = state2;
                                                        rememberedValue5 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy(), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda3
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final java.lang.Object invoke() {
                                                                return java.lang.Boolean.valueOf(androidx.compose.material3.internal.TextFieldImplKt.$r8$lambda$UoJC6qlLtITtgsZeZCucBcOGI9U(androidx.compose.runtime.State.this));
                                                            }
                                                        });
                                                        composer3.updateRememberedValue(rememberedValue5);
                                                    } else {
                                                        state5 = state2;
                                                    }
                                                    androidx.compose.runtime.State state7 = (androidx.compose.runtime.State) rememberedValue5;
                                                    if (function25 == null && ((java.lang.Boolean) state7.getValue()).booleanValue()) {
                                                        composer3.startReplaceGroup(-1889877907);
                                                        composableLambda3 = composableLambda;
                                                        androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(606594655, true, new androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1(state5, m3943prefixColorXeAY9LY$material3, bodyLarge, function25), composer3, i13);
                                                        composer3.endReplaceGroup();
                                                        composableLambda4 = rememberComposableLambda3;
                                                    } else {
                                                        composableLambda3 = composableLambda;
                                                        composer3.startReplaceGroup(-1889500886);
                                                        composer3.endReplaceGroup();
                                                        composableLambda4 = null;
                                                    }
                                                    long m3944suffixColorXeAY9LY$material3 = textFieldColors2.m3944suffixColorXeAY9LY$material3(z7, z6, z5);
                                                    if (function26 == null && ((java.lang.Boolean) state7.getValue()).booleanValue()) {
                                                        composer3.startReplaceGroup(-1889301555);
                                                        androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda4 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-45078754, true, new androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1(state5, m3944suffixColorXeAY9LY$material3, bodyLarge, function26), composer3, i13);
                                                        composer3.endReplaceGroup();
                                                        composableLambda5 = rememberComposableLambda4;
                                                    } else {
                                                        composer3.startReplaceGroup(-1888924534);
                                                        composer3.endReplaceGroup();
                                                        composableLambda5 = null;
                                                    }
                                                    final long m3941leadingIconColorXeAY9LY$material3 = textFieldColors2.m3941leadingIconColorXeAY9LY$material3(z7, z6, z5);
                                                    if (function23 == null) {
                                                        composer3.startReplaceGroup(-1888749663);
                                                        composer3.endReplaceGroup();
                                                        composableLambda6 = null;
                                                    } else {
                                                        composer3.startReplaceGroup(-1888749662);
                                                        androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda5 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1736293487, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                                                androidx.compose.runtime.Composer composer5 = composer4;
                                                                int intValue = num.intValue();
                                                                if (composer5.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                        androidx.compose.runtime.ComposerKt.traceEventStart(-1736293487, intValue, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:205)");
                                                                    }
                                                                    androidx.compose.material3.internal.TextFieldImplKt.getHighSpeedVideoFpsRanges(m3941leadingIconColorXeAY9LY$material3, function23, composer5, 0);
                                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                                    }
                                                                } else {
                                                                    composer5.skipToGroupEnd();
                                                                }
                                                                return kotlin.Unit.INSTANCE;
                                                            }
                                                        }, composer3, i13);
                                                        composer3.endReplaceGroup();
                                                        composableLambda6 = rememberComposableLambda5;
                                                    }
                                                    final long m3947trailingIconColorXeAY9LY$material3 = textFieldColors2.m3947trailingIconColorXeAY9LY$material3(z7, z6, z5);
                                                    if (function24 == null) {
                                                        composer3.startReplaceGroup(-1888469888);
                                                        composer3.endReplaceGroup();
                                                        composableLambda7 = null;
                                                    } else {
                                                        composer3.startReplaceGroup(-1888469887);
                                                        androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda6 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1334518521, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                                                androidx.compose.runtime.Composer composer5 = composer4;
                                                                int intValue = num.intValue();
                                                                if (composer5.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                        androidx.compose.runtime.ComposerKt.traceEventStart(1334518521, intValue, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:211)");
                                                                    }
                                                                    androidx.compose.material3.internal.TextFieldImplKt.getHighSpeedVideoFpsRanges(m3947trailingIconColorXeAY9LY$material3, function24, composer5, 0);
                                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                                    }
                                                                } else {
                                                                    composer5.skipToGroupEnd();
                                                                }
                                                                return kotlin.Unit.INSTANCE;
                                                            }
                                                        }, composer3, i13);
                                                        composer3.endReplaceGroup();
                                                        composableLambda7 = rememberComposableLambda6;
                                                    }
                                                    final long m3945supportingTextColorXeAY9LY$material3 = textFieldColors2.m3945supportingTextColorXeAY9LY$material3(z7, z6, z5);
                                                    if (function27 == null) {
                                                        composer3.startReplaceGroup(-1888176380);
                                                        composer3.endReplaceGroup();
                                                        i14 = 1;
                                                        composableLambda8 = null;
                                                    } else {
                                                        composer3.startReplaceGroup(-1888176379);
                                                        final androidx.compose.ui.text.TextStyle textStyle2 = textStyle;
                                                        i14 = 1;
                                                        androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda7 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(837168720, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                                                androidx.compose.runtime.Composer composer5 = composer4;
                                                                int intValue = num.intValue();
                                                                if (composer5.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                        androidx.compose.runtime.ComposerKt.traceEventStart(837168720, intValue, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:218)");
                                                                    }
                                                                    androidx.compose.material3.internal.TextFieldImplKt.getHighResolutionOutputSizeshNQ4ISI(m3945supportingTextColorXeAY9LY$material3, textStyle2, function27, composer5, 0);
                                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                                    }
                                                                } else {
                                                                    composer5.skipToGroupEnd();
                                                                }
                                                                return kotlin.Unit.INSTANCE;
                                                            }
                                                        }, composer3, i13);
                                                        composer3.endReplaceGroup();
                                                        composableLambda8 = rememberComposableLambda7;
                                                    }
                                                    i15 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                                    if (i15 == i14) {
                                                        androidx.compose.runtime.Composer composer4 = composer3;
                                                        int i19 = i12;
                                                        final androidx.compose.runtime.State state8 = state3;
                                                        composer4.startReplaceGroup(-1887830698);
                                                        int i20 = ((i19 >> 3) & 112) | 6 | ((i11 << 21) & 234881024) | ((i19 << 18) & 1879048192);
                                                        int i21 = ((i11 >> 6) & 7168) | 48;
                                                        composer2 = composer4;
                                                        androidx.compose.material3.TextFieldKt.TextFieldLayout(androidx.compose.ui.Modifier.INSTANCE, function2, composableLambda3, composableLambda2, composableLambda6, composableLambda7, composableLambda4, composableLambda5, z, textFieldLabelPosition, new androidx.compose.material3.internal.TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(new kotlin.jvm.internal.PropertyReference0Impl(state8) { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$1
                                                            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                                                            public final java.lang.Object get() {
                                                                return ((androidx.compose.runtime.State) this.receiver).getValue();
                                                            }
                                                        }), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1729858187, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                                                androidx.compose.runtime.Composer composer6 = composer5;
                                                                int intValue = num.intValue();
                                                                if (!composer6.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                                                                    composer6.skipToGroupEnd();
                                                                } else {
                                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                        androidx.compose.runtime.ComposerKt.traceEventStart(-1729858187, intValue, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:229)");
                                                                    }
                                                                    androidx.compose.ui.Modifier layoutId = androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.material3.internal.TextFieldImplKt.ContainerId);
                                                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function29 = function28;
                                                                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true);
                                                                    int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                                                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer6, layoutId);
                                                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                                    if (!(composer6.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer6.startReusableNode();
                                                                    if (composer6.getInserting()) {
                                                                        composer6.createNode(constructor);
                                                                    } else {
                                                                        composer6.useNode();
                                                                    }
                                                                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer6);
                                                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                    if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                                                        m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                                                        m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                    }
                                                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                                                    function29.invoke(composer6, 0);
                                                                    composer6.endNode();
                                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                                    }
                                                                }
                                                                return kotlin.Unit.INSTANCE;
                                                            }
                                                        }, composer4, 54), composableLambda8, paddingValues, composer4, i20, i21);
                                                        composer2.endReplaceGroup();
                                                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                                    } else {
                                                        if (i15 != 2) {
                                                            androidx.compose.runtime.Composer composer5 = composer3;
                                                            composer5.startReplaceGroup(493292232);
                                                            composer5.endReplaceGroup();
                                                            throw new kotlin.NoWhenBranchMatchedException();
                                                        }
                                                        composer3.startReplaceGroup(-1886778186);
                                                        java.lang.Object rememberedValue6 = composer3.rememberedValue();
                                                        if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue6 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Size.m5809boximpl(androidx.compose.ui.geometry.Size.INSTANCE.m5830getZeroNHjbRc()), null, 2, null);
                                                            composer3.updateRememberedValue(rememberedValue6);
                                                        }
                                                        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue6;
                                                        androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda8 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(528115858, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer6, java.lang.Integer num) {
                                                                androidx.compose.runtime.Composer composer7 = composer6;
                                                                int intValue = num.intValue();
                                                                if (!composer7.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                                                                    composer7.skipToGroupEnd();
                                                                } else {
                                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                        androidx.compose.runtime.ComposerKt.traceEventStart(528115858, intValue, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:255)");
                                                                    }
                                                                    androidx.compose.ui.Modifier outlineCutout = androidx.compose.material3.OutlinedTextFieldKt.outlineCutout(androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.material3.internal.TextFieldImplKt.ContainerId), new kotlin.jvm.internal.MutablePropertyReference0Impl(mutableState) { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1.1
                                                                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                                                        public final java.lang.Object get() {
                                                                            return ((androidx.compose.runtime.MutableState) this.receiver).getValue();
                                                                        }

                                                                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                                                        public final void set(java.lang.Object obj) {
                                                                            ((androidx.compose.runtime.MutableState) this.receiver).setValue(obj);
                                                                        }
                                                                    }, androidx.compose.material3.internal.TextFieldImplKt.getMinimizedAlignment(textFieldLabelPosition), paddingValues);
                                                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function29 = function28;
                                                                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true);
                                                                    int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
                                                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer7.getCurrentCompositionLocalMap();
                                                                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer7, outlineCutout);
                                                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                                    if (!(composer7.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer7.startReusableNode();
                                                                    if (composer7.getInserting()) {
                                                                        composer7.createNode(constructor);
                                                                    } else {
                                                                        composer7.useNode();
                                                                    }
                                                                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer7);
                                                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                    if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                                                        m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                                                        m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                    }
                                                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                                                    function29.invoke(composer7, 0);
                                                                    composer7.endNode();
                                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                                    }
                                                                }
                                                                return kotlin.Unit.INSTANCE;
                                                            }
                                                        }, composer3, 54);
                                                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                                                        final androidx.compose.runtime.State state9 = state3;
                                                        androidx.compose.material3.internal.TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 = new androidx.compose.material3.internal.TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(new kotlin.jvm.internal.PropertyReference0Impl(state9) { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$2
                                                            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                                                            public final java.lang.Object get() {
                                                                return ((androidx.compose.runtime.State) this.receiver).getValue();
                                                            }
                                                        });
                                                        androidx.compose.ui.Modifier.Companion companion2 = companion;
                                                        int i22 = i12;
                                                        boolean z10 = (i22 & 7168) == 2048;
                                                        boolean changed3 = composer3.changed(state9);
                                                        java.lang.Object rememberedValue7 = composer3.rememberedValue();
                                                        if ((z10 | changed3) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda4
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final java.lang.Object invoke(java.lang.Object obj) {
                                                                    return androidx.compose.material3.internal.TextFieldImplKt.$r8$lambda$gDbs4mvXXlfBUYU93kpp3hT7F2A(androidx.compose.material3.TextFieldLabelPosition.this, state9, mutableState, (androidx.compose.ui.geometry.Size) obj);
                                                                }
                                                            };
                                                            composer3.updateRememberedValue(rememberedValue7);
                                                        }
                                                        androidx.compose.runtime.Composer composer6 = composer3;
                                                        androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextFieldLayout(companion2, function2, composableLambda2, composableLambda3, composableLambda6, composableLambda7, composableLambda4, composableLambda5, z, textFieldLabelPosition, textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0, (kotlin.jvm.functions.Function1) rememberedValue7, rememberComposableLambda8, composableLambda8, paddingValues, composer6, ((i22 >> 3) & 112) | 6 | ((i11 << 21) & 234881024) | ((i22 << 18) & 1879048192), (57344 & (i11 >> 3)) | 384);
                                                        composer6.endReplaceGroup();
                                                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                                        composer2 = composer6;
                                                    }
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }
                                            f6 = 1.0f;
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            androidx.compose.runtime.State createTransitionAnimation32 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(f5), java.lang.Float.valueOf(f6), function34.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter3, "PrefixSuffixOpacity", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                            final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> value42 = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                                            kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>> function352 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1
                                                @Override // kotlin.jvm.functions.Function3
                                                public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, java.lang.Integer num) {
                                                    return invoke(segment, composer42, num.intValue());
                                                }

                                                public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, int i192) {
                                                    composer42.startReplaceGroup(1954111929);
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventStart(1954111929, i192, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:438)");
                                                    }
                                                    androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> finiteAnimationSpec = value42;
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                    }
                                                    composer42.endReplaceGroup();
                                                    return finiteAnimationSpec;
                                                }
                                            };
                                            androidx.compose.material3.internal.InputPhase inputPhase92 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
                                            startRestartGroup.startReplaceGroup(-12973394);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            }
                                            if (androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase92.ordinal()] == 1) {
                                            }
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            androidx.compose.ui.graphics.colorspace.ColorSpace m6000getColorSpaceimpl3 = androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(j3);
                                            changed = startRestartGroup.changed(m6000getColorSpaceimpl3);
                                            rememberedValue = startRestartGroup.rememberedValue();
                                            if (!changed) {
                                            }
                                            rememberedValue = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m6000getColorSpaceimpl3);
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                            androidx.compose.animation.core.TwoWayConverter twoWayConverter3 = (androidx.compose.animation.core.TwoWayConverter) rememberedValue;
                                            androidx.compose.material3.internal.InputPhase inputPhase102 = (androidx.compose.material3.internal.InputPhase) updateTransition.getCurrentState();
                                            startRestartGroup.startReplaceGroup(-12973394);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            }
                                            if (androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase102.ordinal()] == 1) {
                                            }
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            androidx.compose.ui.graphics.Color m5986boximpl3 = androidx.compose.ui.graphics.Color.m5986boximpl(j4);
                                            inputPhase2 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
                                            startRestartGroup.startReplaceGroup(-12973394);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            }
                                            if (androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase2.ordinal()] == 1) {
                                            }
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> createTransitionAnimation42 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, m5986boximpl3, androidx.compose.ui.graphics.Color.m5986boximpl(j2), function352.invoke(updateTransition.getSegment(), startRestartGroup, 0), twoWayConverter3, "LabelTextStyleColor", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                            kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>> function362 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1
                                                @Override // kotlin.jvm.functions.Function3
                                                public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, java.lang.Integer num) {
                                                    return invoke(segment, composer42, num.intValue());
                                                }

                                                public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, int i192) {
                                                    composer42.startReplaceGroup(1190923886);
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventStart(1190923886, i192, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:450)");
                                                    }
                                                    androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> finiteAnimationSpec = value42;
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                    }
                                                    composer42.endReplaceGroup();
                                                    return finiteAnimationSpec;
                                                }
                                            };
                                            startRestartGroup.startReplaceGroup(-464752477);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            }
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            androidx.compose.ui.graphics.colorspace.ColorSpace m6000getColorSpaceimpl22 = androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(m3940labelColorXeAY9LY$material3);
                                            changed2 = startRestartGroup.changed(m6000getColorSpaceimpl22);
                                            rememberedValue2 = startRestartGroup.rememberedValue();
                                            if (!changed2) {
                                            }
                                            rememberedValue2 = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m6000getColorSpaceimpl22);
                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                            androidx.compose.animation.core.TwoWayConverter twoWayConverter22 = (androidx.compose.animation.core.TwoWayConverter) rememberedValue2;
                                            startRestartGroup.startReplaceGroup(-464752477);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            }
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            androidx.compose.ui.graphics.Color m5986boximpl22 = androidx.compose.ui.graphics.Color.m5986boximpl(m3940labelColorXeAY9LY$material3);
                                            startRestartGroup.startReplaceGroup(-464752477);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            }
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> createTransitionAnimation52 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, m5986boximpl22, androidx.compose.ui.graphics.Color.m5986boximpl(m3940labelColorXeAY9LY$material3), function362.invoke(updateTransition.getSegment(), startRestartGroup, java.lang.Integer.valueOf(i10)), twoWayConverter22, "LabelContentColor", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                            rememberedValue3 = startRestartGroup.rememberedValue();
                                            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            }
                                            final androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$12 = (androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) rememberedValue3;
                                            if (function3 == null) {
                                            }
                                            long m3942placeholderColorXeAY9LY$material32 = textFieldColors2.m3942placeholderColorXeAY9LY$material3(z7, z6, z5);
                                            rememberedValue4 = composer3.rememberedValue();
                                            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            }
                                            androidx.compose.runtime.State state62 = (androidx.compose.runtime.State) rememberedValue4;
                                            if (function22 == null) {
                                            }
                                            composer3.startReplaceGroup(-1890217110);
                                            composer3.endReplaceGroup();
                                            composableLambda2 = null;
                                            long m3943prefixColorXeAY9LY$material32 = textFieldColors2.m3943prefixColorXeAY9LY$material3(z7, z6, z5);
                                            rememberedValue5 = composer3.rememberedValue();
                                            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            }
                                            androidx.compose.runtime.State state72 = (androidx.compose.runtime.State) rememberedValue5;
                                            if (function25 == null) {
                                            }
                                            composableLambda3 = composableLambda;
                                            composer3.startReplaceGroup(-1889500886);
                                            composer3.endReplaceGroup();
                                            composableLambda4 = null;
                                            long m3944suffixColorXeAY9LY$material32 = textFieldColors2.m3944suffixColorXeAY9LY$material3(z7, z6, z5);
                                            if (function26 == null) {
                                            }
                                            composer3.startReplaceGroup(-1888924534);
                                            composer3.endReplaceGroup();
                                            composableLambda5 = null;
                                            final long m3941leadingIconColorXeAY9LY$material32 = textFieldColors2.m3941leadingIconColorXeAY9LY$material3(z7, z6, z5);
                                            if (function23 == null) {
                                            }
                                            final long m3947trailingIconColorXeAY9LY$material32 = textFieldColors2.m3947trailingIconColorXeAY9LY$material3(z7, z6, z5);
                                            if (function24 == null) {
                                            }
                                            final long m3945supportingTextColorXeAY9LY$material32 = textFieldColors2.m3945supportingTextColorXeAY9LY$material3(z7, z6, z5);
                                            if (function27 == null) {
                                            }
                                            i15 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                            if (i15 == i14) {
                                            }
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            }
                                        }
                                    }
                                    f5 = 1.0f;
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    androidx.compose.material3.internal.InputPhase inputPhase82 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
                                    startRestartGroup.startReplaceGroup(-1258455321);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                    i9 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase82.ordinal()];
                                    if (i9 != 1) {
                                    }
                                    f6 = 1.0f;
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    androidx.compose.runtime.State createTransitionAnimation322 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(f5), java.lang.Float.valueOf(f6), function34.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter3, "PrefixSuffixOpacity", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> value422 = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                                    kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>> function3522 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, java.lang.Integer num) {
                                            return invoke(segment, composer42, num.intValue());
                                        }

                                        public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, int i192) {
                                            composer42.startReplaceGroup(1954111929);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventStart(1954111929, i192, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:438)");
                                            }
                                            androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> finiteAnimationSpec = value422;
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            }
                                            composer42.endReplaceGroup();
                                            return finiteAnimationSpec;
                                        }
                                    };
                                    androidx.compose.material3.internal.InputPhase inputPhase922 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
                                    startRestartGroup.startReplaceGroup(-12973394);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                    if (androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase922.ordinal()] == 1) {
                                    }
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    androidx.compose.ui.graphics.colorspace.ColorSpace m6000getColorSpaceimpl32 = androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(j3);
                                    changed = startRestartGroup.changed(m6000getColorSpaceimpl32);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed) {
                                    }
                                    rememberedValue = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m6000getColorSpaceimpl32);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                    androidx.compose.animation.core.TwoWayConverter twoWayConverter32 = (androidx.compose.animation.core.TwoWayConverter) rememberedValue;
                                    androidx.compose.material3.internal.InputPhase inputPhase1022 = (androidx.compose.material3.internal.InputPhase) updateTransition.getCurrentState();
                                    startRestartGroup.startReplaceGroup(-12973394);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                    if (androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase1022.ordinal()] == 1) {
                                    }
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    androidx.compose.ui.graphics.Color m5986boximpl32 = androidx.compose.ui.graphics.Color.m5986boximpl(j4);
                                    inputPhase2 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
                                    startRestartGroup.startReplaceGroup(-12973394);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                    if (androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase2.ordinal()] == 1) {
                                    }
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> createTransitionAnimation422 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, m5986boximpl32, androidx.compose.ui.graphics.Color.m5986boximpl(j2), function3522.invoke(updateTransition.getSegment(), startRestartGroup, 0), twoWayConverter32, "LabelTextStyleColor", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>> function3622 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, java.lang.Integer num) {
                                            return invoke(segment, composer42, num.intValue());
                                        }

                                        public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, int i192) {
                                            composer42.startReplaceGroup(1190923886);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventStart(1190923886, i192, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:450)");
                                            }
                                            androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> finiteAnimationSpec = value422;
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            }
                                            composer42.endReplaceGroup();
                                            return finiteAnimationSpec;
                                        }
                                    };
                                    startRestartGroup.startReplaceGroup(-464752477);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    androidx.compose.ui.graphics.colorspace.ColorSpace m6000getColorSpaceimpl222 = androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(m3940labelColorXeAY9LY$material3);
                                    changed2 = startRestartGroup.changed(m6000getColorSpaceimpl222);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (!changed2) {
                                    }
                                    rememberedValue2 = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m6000getColorSpaceimpl222);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                    androidx.compose.animation.core.TwoWayConverter twoWayConverter222 = (androidx.compose.animation.core.TwoWayConverter) rememberedValue2;
                                    startRestartGroup.startReplaceGroup(-464752477);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    androidx.compose.ui.graphics.Color m5986boximpl222 = androidx.compose.ui.graphics.Color.m5986boximpl(m3940labelColorXeAY9LY$material3);
                                    startRestartGroup.startReplaceGroup(-464752477);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> createTransitionAnimation522 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, m5986boximpl222, androidx.compose.ui.graphics.Color.m5986boximpl(m3940labelColorXeAY9LY$material3), function3622.invoke(updateTransition.getSegment(), startRestartGroup, java.lang.Integer.valueOf(i10)), twoWayConverter222, "LabelContentColor", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    }
                                    final androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$122 = (androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) rememberedValue3;
                                    if (function3 == null) {
                                    }
                                    long m3942placeholderColorXeAY9LY$material322 = textFieldColors2.m3942placeholderColorXeAY9LY$material3(z7, z6, z5);
                                    rememberedValue4 = composer3.rememberedValue();
                                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    }
                                    androidx.compose.runtime.State state622 = (androidx.compose.runtime.State) rememberedValue4;
                                    if (function22 == null) {
                                    }
                                    composer3.startReplaceGroup(-1890217110);
                                    composer3.endReplaceGroup();
                                    composableLambda2 = null;
                                    long m3943prefixColorXeAY9LY$material322 = textFieldColors2.m3943prefixColorXeAY9LY$material3(z7, z6, z5);
                                    rememberedValue5 = composer3.rememberedValue();
                                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    }
                                    androidx.compose.runtime.State state722 = (androidx.compose.runtime.State) rememberedValue5;
                                    if (function25 == null) {
                                    }
                                    composableLambda3 = composableLambda;
                                    composer3.startReplaceGroup(-1889500886);
                                    composer3.endReplaceGroup();
                                    composableLambda4 = null;
                                    long m3944suffixColorXeAY9LY$material322 = textFieldColors2.m3944suffixColorXeAY9LY$material3(z7, z6, z5);
                                    if (function26 == null) {
                                    }
                                    composer3.startReplaceGroup(-1888924534);
                                    composer3.endReplaceGroup();
                                    composableLambda5 = null;
                                    final long m3941leadingIconColorXeAY9LY$material322 = textFieldColors2.m3941leadingIconColorXeAY9LY$material3(z7, z6, z5);
                                    if (function23 == null) {
                                    }
                                    final long m3947trailingIconColorXeAY9LY$material322 = textFieldColors2.m3947trailingIconColorXeAY9LY$material3(z7, z6, z5);
                                    if (function24 == null) {
                                    }
                                    final long m3945supportingTextColorXeAY9LY$material322 = textFieldColors2.m3945supportingTextColorXeAY9LY$material3(z7, z6, z5);
                                    if (function27 == null) {
                                    }
                                    i15 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                    if (i15 == i14) {
                                    }
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                }
                                f4 = 1.0f;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                androidx.compose.runtime.State createTransitionAnimation22 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(f3), java.lang.Float.valueOf(f4), function33.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>> function342 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, java.lang.Integer num) {
                                        return invoke(segment, composer42, num.intValue());
                                    }

                                    public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, int i192) {
                                        composer42.startReplaceGroup(2126293195);
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventStart(2126293195, i192, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:426)");
                                        }
                                        androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec = value2;
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                        }
                                        composer42.endReplaceGroup();
                                        return finiteAnimationSpec;
                                    }
                                };
                                androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter32 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
                                androidx.compose.material3.internal.InputPhase inputPhase72 = (androidx.compose.material3.internal.InputPhase) updateTransition.getCurrentState();
                                startRestartGroup.startReplaceGroup(-1258455321);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                i8 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase72.ordinal()];
                                if (i8 != 1) {
                                }
                                f5 = 1.0f;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                androidx.compose.material3.internal.InputPhase inputPhase822 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceGroup(-1258455321);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                i9 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase822.ordinal()];
                                if (i9 != 1) {
                                }
                                f6 = 1.0f;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                androidx.compose.runtime.State createTransitionAnimation3222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(f5), java.lang.Float.valueOf(f6), function342.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter32, "PrefixSuffixOpacity", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> value4222 = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                                kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>> function35222 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, java.lang.Integer num) {
                                        return invoke(segment, composer42, num.intValue());
                                    }

                                    public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, int i192) {
                                        composer42.startReplaceGroup(1954111929);
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventStart(1954111929, i192, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:438)");
                                        }
                                        androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> finiteAnimationSpec = value4222;
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                        }
                                        composer42.endReplaceGroup();
                                        return finiteAnimationSpec;
                                    }
                                };
                                androidx.compose.material3.internal.InputPhase inputPhase9222 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceGroup(-12973394);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                if (androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase9222.ordinal()] == 1) {
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                androidx.compose.ui.graphics.colorspace.ColorSpace m6000getColorSpaceimpl322 = androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(j3);
                                changed = startRestartGroup.changed(m6000getColorSpaceimpl322);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m6000getColorSpaceimpl322);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                androidx.compose.animation.core.TwoWayConverter twoWayConverter322 = (androidx.compose.animation.core.TwoWayConverter) rememberedValue;
                                androidx.compose.material3.internal.InputPhase inputPhase10222 = (androidx.compose.material3.internal.InputPhase) updateTransition.getCurrentState();
                                startRestartGroup.startReplaceGroup(-12973394);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                if (androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase10222.ordinal()] == 1) {
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                androidx.compose.ui.graphics.Color m5986boximpl322 = androidx.compose.ui.graphics.Color.m5986boximpl(j4);
                                inputPhase2 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceGroup(-12973394);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                if (androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase2.ordinal()] == 1) {
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> createTransitionAnimation4222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, m5986boximpl322, androidx.compose.ui.graphics.Color.m5986boximpl(j2), function35222.invoke(updateTransition.getSegment(), startRestartGroup, 0), twoWayConverter322, "LabelTextStyleColor", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>> function36222 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, java.lang.Integer num) {
                                        return invoke(segment, composer42, num.intValue());
                                    }

                                    public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, int i192) {
                                        composer42.startReplaceGroup(1190923886);
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventStart(1190923886, i192, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:450)");
                                        }
                                        androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> finiteAnimationSpec = value4222;
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                        }
                                        composer42.endReplaceGroup();
                                        return finiteAnimationSpec;
                                    }
                                };
                                startRestartGroup.startReplaceGroup(-464752477);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                androidx.compose.ui.graphics.colorspace.ColorSpace m6000getColorSpaceimpl2222 = androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(m3940labelColorXeAY9LY$material3);
                                changed2 = startRestartGroup.changed(m6000getColorSpaceimpl2222);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed2) {
                                }
                                rememberedValue2 = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m6000getColorSpaceimpl2222);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                androidx.compose.animation.core.TwoWayConverter twoWayConverter2222 = (androidx.compose.animation.core.TwoWayConverter) rememberedValue2;
                                startRestartGroup.startReplaceGroup(-464752477);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                androidx.compose.ui.graphics.Color m5986boximpl2222 = androidx.compose.ui.graphics.Color.m5986boximpl(m3940labelColorXeAY9LY$material3);
                                startRestartGroup.startReplaceGroup(-464752477);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> createTransitionAnimation5222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, m5986boximpl2222, androidx.compose.ui.graphics.Color.m5986boximpl(m3940labelColorXeAY9LY$material3), function36222.invoke(updateTransition.getSegment(), startRestartGroup, java.lang.Integer.valueOf(i10)), twoWayConverter2222, "LabelContentColor", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                }
                                final androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$1222 = (androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) rememberedValue3;
                                if (function3 == null) {
                                }
                                long m3942placeholderColorXeAY9LY$material3222 = textFieldColors2.m3942placeholderColorXeAY9LY$material3(z7, z6, z5);
                                rememberedValue4 = composer3.rememberedValue();
                                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                }
                                androidx.compose.runtime.State state6222 = (androidx.compose.runtime.State) rememberedValue4;
                                if (function22 == null) {
                                }
                                composer3.startReplaceGroup(-1890217110);
                                composer3.endReplaceGroup();
                                composableLambda2 = null;
                                long m3943prefixColorXeAY9LY$material3222 = textFieldColors2.m3943prefixColorXeAY9LY$material3(z7, z6, z5);
                                rememberedValue5 = composer3.rememberedValue();
                                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                }
                                androidx.compose.runtime.State state7222 = (androidx.compose.runtime.State) rememberedValue5;
                                if (function25 == null) {
                                }
                                composableLambda3 = composableLambda;
                                composer3.startReplaceGroup(-1889500886);
                                composer3.endReplaceGroup();
                                composableLambda4 = null;
                                long m3944suffixColorXeAY9LY$material3222 = textFieldColors2.m3944suffixColorXeAY9LY$material3(z7, z6, z5);
                                if (function26 == null) {
                                }
                                composer3.startReplaceGroup(-1888924534);
                                composer3.endReplaceGroup();
                                composableLambda5 = null;
                                final long m3941leadingIconColorXeAY9LY$material3222 = textFieldColors2.m3941leadingIconColorXeAY9LY$material3(z7, z6, z5);
                                if (function23 == null) {
                                }
                                final long m3947trailingIconColorXeAY9LY$material3222 = textFieldColors2.m3947trailingIconColorXeAY9LY$material3(z7, z6, z5);
                                if (function24 == null) {
                                }
                                final long m3945supportingTextColorXeAY9LY$material3222 = textFieldColors2.m3945supportingTextColorXeAY9LY$material3(z7, z6, z5);
                                if (function27 == null) {
                                }
                                i15 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                if (i15 == i14) {
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                            }
                            f3 = 1.0f;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            androidx.compose.material3.internal.InputPhase inputPhase62 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceGroup(-1093194547);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            i7 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase62.ordinal()];
                            if (i7 != 1) {
                            }
                            f4 = 1.0f;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            androidx.compose.runtime.State createTransitionAnimation222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(f3), java.lang.Float.valueOf(f4), function33.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>> function3422 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1
                                @Override // kotlin.jvm.functions.Function3
                                public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, java.lang.Integer num) {
                                    return invoke(segment, composer42, num.intValue());
                                }

                                public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, int i192) {
                                    composer42.startReplaceGroup(2126293195);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(2126293195, i192, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:426)");
                                    }
                                    androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec = value2;
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    composer42.endReplaceGroup();
                                    return finiteAnimationSpec;
                                }
                            };
                            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter322 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
                            androidx.compose.material3.internal.InputPhase inputPhase722 = (androidx.compose.material3.internal.InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceGroup(-1258455321);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            i8 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase722.ordinal()];
                            if (i8 != 1) {
                            }
                            f5 = 1.0f;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            androidx.compose.material3.internal.InputPhase inputPhase8222 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceGroup(-1258455321);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            i9 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase8222.ordinal()];
                            if (i9 != 1) {
                            }
                            f6 = 1.0f;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            androidx.compose.runtime.State createTransitionAnimation32222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(f5), java.lang.Float.valueOf(f6), function3422.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter322, "PrefixSuffixOpacity", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> value42222 = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                            kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>> function352222 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1
                                @Override // kotlin.jvm.functions.Function3
                                public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, java.lang.Integer num) {
                                    return invoke(segment, composer42, num.intValue());
                                }

                                public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, int i192) {
                                    composer42.startReplaceGroup(1954111929);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(1954111929, i192, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:438)");
                                    }
                                    androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> finiteAnimationSpec = value42222;
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    composer42.endReplaceGroup();
                                    return finiteAnimationSpec;
                                }
                            };
                            androidx.compose.material3.internal.InputPhase inputPhase92222 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceGroup(-12973394);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            if (androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase92222.ordinal()] == 1) {
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            androidx.compose.ui.graphics.colorspace.ColorSpace m6000getColorSpaceimpl3222 = androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(j3);
                            changed = startRestartGroup.changed(m6000getColorSpaceimpl3222);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m6000getColorSpaceimpl3222);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            androidx.compose.animation.core.TwoWayConverter twoWayConverter3222 = (androidx.compose.animation.core.TwoWayConverter) rememberedValue;
                            androidx.compose.material3.internal.InputPhase inputPhase102222 = (androidx.compose.material3.internal.InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceGroup(-12973394);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            if (androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase102222.ordinal()] == 1) {
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            androidx.compose.ui.graphics.Color m5986boximpl3222 = androidx.compose.ui.graphics.Color.m5986boximpl(j4);
                            inputPhase2 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceGroup(-12973394);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            if (androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase2.ordinal()] == 1) {
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> createTransitionAnimation42222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, m5986boximpl3222, androidx.compose.ui.graphics.Color.m5986boximpl(j2), function352222.invoke(updateTransition.getSegment(), startRestartGroup, 0), twoWayConverter3222, "LabelTextStyleColor", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>> function362222 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1
                                @Override // kotlin.jvm.functions.Function3
                                public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, java.lang.Integer num) {
                                    return invoke(segment, composer42, num.intValue());
                                }

                                public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, int i192) {
                                    composer42.startReplaceGroup(1190923886);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(1190923886, i192, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:450)");
                                    }
                                    androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> finiteAnimationSpec = value42222;
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    composer42.endReplaceGroup();
                                    return finiteAnimationSpec;
                                }
                            };
                            startRestartGroup.startReplaceGroup(-464752477);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            androidx.compose.ui.graphics.colorspace.ColorSpace m6000getColorSpaceimpl22222 = androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(m3940labelColorXeAY9LY$material3);
                            changed2 = startRestartGroup.changed(m6000getColorSpaceimpl22222);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed2) {
                            }
                            rememberedValue2 = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m6000getColorSpaceimpl22222);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            androidx.compose.animation.core.TwoWayConverter twoWayConverter22222 = (androidx.compose.animation.core.TwoWayConverter) rememberedValue2;
                            startRestartGroup.startReplaceGroup(-464752477);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            androidx.compose.ui.graphics.Color m5986boximpl22222 = androidx.compose.ui.graphics.Color.m5986boximpl(m3940labelColorXeAY9LY$material3);
                            startRestartGroup.startReplaceGroup(-464752477);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> createTransitionAnimation52222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, m5986boximpl22222, androidx.compose.ui.graphics.Color.m5986boximpl(m3940labelColorXeAY9LY$material3), function362222.invoke(updateTransition.getSegment(), startRestartGroup, java.lang.Integer.valueOf(i10)), twoWayConverter22222, "LabelContentColor", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            }
                            final androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$12222 = (androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) rememberedValue3;
                            if (function3 == null) {
                            }
                            long m3942placeholderColorXeAY9LY$material32222 = textFieldColors2.m3942placeholderColorXeAY9LY$material3(z7, z6, z5);
                            rememberedValue4 = composer3.rememberedValue();
                            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            }
                            androidx.compose.runtime.State state62222 = (androidx.compose.runtime.State) rememberedValue4;
                            if (function22 == null) {
                            }
                            composer3.startReplaceGroup(-1890217110);
                            composer3.endReplaceGroup();
                            composableLambda2 = null;
                            long m3943prefixColorXeAY9LY$material32222 = textFieldColors2.m3943prefixColorXeAY9LY$material3(z7, z6, z5);
                            rememberedValue5 = composer3.rememberedValue();
                            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            }
                            androidx.compose.runtime.State state72222 = (androidx.compose.runtime.State) rememberedValue5;
                            if (function25 == null) {
                            }
                            composableLambda3 = composableLambda;
                            composer3.startReplaceGroup(-1889500886);
                            composer3.endReplaceGroup();
                            composableLambda4 = null;
                            long m3944suffixColorXeAY9LY$material32222 = textFieldColors2.m3944suffixColorXeAY9LY$material3(z7, z6, z5);
                            if (function26 == null) {
                            }
                            composer3.startReplaceGroup(-1888924534);
                            composer3.endReplaceGroup();
                            composableLambda5 = null;
                            final long m3941leadingIconColorXeAY9LY$material32222 = textFieldColors2.m3941leadingIconColorXeAY9LY$material3(z7, z6, z5);
                            if (function23 == null) {
                            }
                            final long m3947trailingIconColorXeAY9LY$material32222 = textFieldColors2.m3947trailingIconColorXeAY9LY$material3(z7, z6, z5);
                            if (function24 == null) {
                            }
                            final long m3945supportingTextColorXeAY9LY$material32222 = textFieldColors2.m3945supportingTextColorXeAY9LY$material3(z7, z6, z5);
                            if (function27 == null) {
                            }
                            i15 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                            if (i15 == i14) {
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                    f2 = 1.0f;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    final androidx.compose.runtime.State<java.lang.Float> createTransitionAnimation6 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2), function32.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter, "LabelProgress", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> value22 = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                    final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> value32 = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.SlowEffects, startRestartGroup, 6);
                    kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>> function332 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1
                        @Override // kotlin.jvm.functions.Function3
                        public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, java.lang.Integer num) {
                            return invoke(segment, composer42, num.intValue());
                        }

                        public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, int i192) {
                            androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec;
                            composer42.startReplaceGroup(-984009111);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-984009111, i192, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:404)");
                            }
                            if (segment.isTransitioningTo(androidx.compose.material3.internal.InputPhase.getHighSpeedVideoFpsRangesFor, androidx.compose.material3.internal.InputPhase.getHighResolutionOutputSizeshNQ4ISI)) {
                                finiteAnimationSpec = value22;
                            } else if (segment.isTransitioningTo(androidx.compose.material3.internal.InputPhase.getHighResolutionOutputSizeshNQ4ISI, androidx.compose.material3.internal.InputPhase.getHighSpeedVideoFpsRangesFor) || segment.isTransitioningTo(androidx.compose.material3.internal.InputPhase.getHighSpeedVideoFpsRanges, androidx.compose.material3.internal.InputPhase.getHighResolutionOutputSizeshNQ4ISI)) {
                                finiteAnimationSpec = value32;
                            } else {
                                finiteAnimationSpec = value22;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            composer42.endReplaceGroup();
                            return finiteAnimationSpec;
                        }
                    };
                    androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter22 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
                    androidx.compose.material3.internal.InputPhase inputPhase52 = (androidx.compose.material3.internal.InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceGroup(-1093194547);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    i6 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase52.ordinal()];
                    if (i6 != 1) {
                    }
                    f3 = 1.0f;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    androidx.compose.material3.internal.InputPhase inputPhase622 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceGroup(-1093194547);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    i7 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase622.ordinal()];
                    if (i7 != 1) {
                    }
                    f4 = 1.0f;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    androidx.compose.runtime.State createTransitionAnimation2222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(f3), java.lang.Float.valueOf(f4), function332.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter22, "PlaceholderOpacity", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>> function34222 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1
                        @Override // kotlin.jvm.functions.Function3
                        public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, java.lang.Integer num) {
                            return invoke(segment, composer42, num.intValue());
                        }

                        public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, int i192) {
                            composer42.startReplaceGroup(2126293195);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(2126293195, i192, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:426)");
                            }
                            androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec = value22;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            composer42.endReplaceGroup();
                            return finiteAnimationSpec;
                        }
                    };
                    androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter3222 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
                    androidx.compose.material3.internal.InputPhase inputPhase7222 = (androidx.compose.material3.internal.InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceGroup(-1258455321);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    i8 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase7222.ordinal()];
                    if (i8 != 1) {
                    }
                    f5 = 1.0f;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    androidx.compose.material3.internal.InputPhase inputPhase82222 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceGroup(-1258455321);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    i9 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase82222.ordinal()];
                    if (i9 != 1) {
                    }
                    f6 = 1.0f;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    androidx.compose.runtime.State createTransitionAnimation322222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(f5), java.lang.Float.valueOf(f6), function34222.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter3222, "PrefixSuffixOpacity", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> value422222 = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                    kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>> function3522222 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1
                        @Override // kotlin.jvm.functions.Function3
                        public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, java.lang.Integer num) {
                            return invoke(segment, composer42, num.intValue());
                        }

                        public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, int i192) {
                            composer42.startReplaceGroup(1954111929);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1954111929, i192, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:438)");
                            }
                            androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> finiteAnimationSpec = value422222;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            composer42.endReplaceGroup();
                            return finiteAnimationSpec;
                        }
                    };
                    androidx.compose.material3.internal.InputPhase inputPhase922222 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceGroup(-12973394);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    if (androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase922222.ordinal()] == 1) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    androidx.compose.ui.graphics.colorspace.ColorSpace m6000getColorSpaceimpl32222 = androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(j3);
                    changed = startRestartGroup.changed(m6000getColorSpaceimpl32222);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m6000getColorSpaceimpl32222);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    androidx.compose.animation.core.TwoWayConverter twoWayConverter32222 = (androidx.compose.animation.core.TwoWayConverter) rememberedValue;
                    androidx.compose.material3.internal.InputPhase inputPhase1022222 = (androidx.compose.material3.internal.InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceGroup(-12973394);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    if (androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase1022222.ordinal()] == 1) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    androidx.compose.ui.graphics.Color m5986boximpl32222 = androidx.compose.ui.graphics.Color.m5986boximpl(j4);
                    inputPhase2 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceGroup(-12973394);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    if (androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase2.ordinal()] == 1) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> createTransitionAnimation422222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, m5986boximpl32222, androidx.compose.ui.graphics.Color.m5986boximpl(j2), function3522222.invoke(updateTransition.getSegment(), startRestartGroup, 0), twoWayConverter32222, "LabelTextStyleColor", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>> function3622222 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1
                        @Override // kotlin.jvm.functions.Function3
                        public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, java.lang.Integer num) {
                            return invoke(segment, composer42, num.intValue());
                        }

                        public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, int i192) {
                            composer42.startReplaceGroup(1190923886);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1190923886, i192, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:450)");
                            }
                            androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> finiteAnimationSpec = value422222;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            composer42.endReplaceGroup();
                            return finiteAnimationSpec;
                        }
                    };
                    startRestartGroup.startReplaceGroup(-464752477);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    androidx.compose.ui.graphics.colorspace.ColorSpace m6000getColorSpaceimpl222222 = androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(m3940labelColorXeAY9LY$material3);
                    changed2 = startRestartGroup.changed(m6000getColorSpaceimpl222222);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue2 = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m6000getColorSpaceimpl222222);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    androidx.compose.animation.core.TwoWayConverter twoWayConverter222222 = (androidx.compose.animation.core.TwoWayConverter) rememberedValue2;
                    startRestartGroup.startReplaceGroup(-464752477);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    androidx.compose.ui.graphics.Color m5986boximpl222222 = androidx.compose.ui.graphics.Color.m5986boximpl(m3940labelColorXeAY9LY$material3);
                    startRestartGroup.startReplaceGroup(-464752477);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> createTransitionAnimation522222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, m5986boximpl222222, androidx.compose.ui.graphics.Color.m5986boximpl(m3940labelColorXeAY9LY$material3), function3622222.invoke(updateTransition.getSegment(), startRestartGroup, java.lang.Integer.valueOf(i10)), twoWayConverter222222, "LabelContentColor", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    final androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$122222 = (androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) rememberedValue3;
                    if (function3 == null) {
                    }
                    long m3942placeholderColorXeAY9LY$material322222 = textFieldColors2.m3942placeholderColorXeAY9LY$material3(z7, z6, z5);
                    rememberedValue4 = composer3.rememberedValue();
                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    androidx.compose.runtime.State state622222 = (androidx.compose.runtime.State) rememberedValue4;
                    if (function22 == null) {
                    }
                    composer3.startReplaceGroup(-1890217110);
                    composer3.endReplaceGroup();
                    composableLambda2 = null;
                    long m3943prefixColorXeAY9LY$material322222 = textFieldColors2.m3943prefixColorXeAY9LY$material3(z7, z6, z5);
                    rememberedValue5 = composer3.rememberedValue();
                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    androidx.compose.runtime.State state722222 = (androidx.compose.runtime.State) rememberedValue5;
                    if (function25 == null) {
                    }
                    composableLambda3 = composableLambda;
                    composer3.startReplaceGroup(-1889500886);
                    composer3.endReplaceGroup();
                    composableLambda4 = null;
                    long m3944suffixColorXeAY9LY$material322222 = textFieldColors2.m3944suffixColorXeAY9LY$material3(z7, z6, z5);
                    if (function26 == null) {
                    }
                    composer3.startReplaceGroup(-1888924534);
                    composer3.endReplaceGroup();
                    composableLambda5 = null;
                    final long m3941leadingIconColorXeAY9LY$material322222 = textFieldColors2.m3941leadingIconColorXeAY9LY$material3(z7, z6, z5);
                    if (function23 == null) {
                    }
                    final long m3947trailingIconColorXeAY9LY$material322222 = textFieldColors2.m3947trailingIconColorXeAY9LY$material3(z7, z6, z5);
                    if (function24 == null) {
                    }
                    final long m3945supportingTextColorXeAY9LY$material322222 = textFieldColors2.m3945supportingTextColorXeAY9LY$material3(z7, z6, z5);
                    if (function27 == null) {
                    }
                    i15 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                    if (i15 == i14) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            f = 1.0f;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            androidx.compose.material3.internal.InputPhase inputPhase42 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(-1436405362);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            i5 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase42.ordinal()];
            if (i5 != 1) {
            }
            f2 = 1.0f;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            final androidx.compose.runtime.State<java.lang.Float> createTransitionAnimation62 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2), function32.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter, "LabelProgress", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> value222 = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
            final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> value322 = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.SlowEffects, startRestartGroup, 6);
            kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>> function3322 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, java.lang.Integer num) {
                    return invoke(segment, composer42, num.intValue());
                }

                public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, int i192) {
                    androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec;
                    composer42.startReplaceGroup(-984009111);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-984009111, i192, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:404)");
                    }
                    if (segment.isTransitioningTo(androidx.compose.material3.internal.InputPhase.getHighSpeedVideoFpsRangesFor, androidx.compose.material3.internal.InputPhase.getHighResolutionOutputSizeshNQ4ISI)) {
                        finiteAnimationSpec = value222;
                    } else if (segment.isTransitioningTo(androidx.compose.material3.internal.InputPhase.getHighResolutionOutputSizeshNQ4ISI, androidx.compose.material3.internal.InputPhase.getHighSpeedVideoFpsRangesFor) || segment.isTransitioningTo(androidx.compose.material3.internal.InputPhase.getHighSpeedVideoFpsRanges, androidx.compose.material3.internal.InputPhase.getHighResolutionOutputSizeshNQ4ISI)) {
                        finiteAnimationSpec = value322;
                    } else {
                        finiteAnimationSpec = value222;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer42.endReplaceGroup();
                    return finiteAnimationSpec;
                }
            };
            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter222 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
            androidx.compose.material3.internal.InputPhase inputPhase522 = (androidx.compose.material3.internal.InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceGroup(-1093194547);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            i6 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase522.ordinal()];
            if (i6 != 1) {
            }
            f3 = 1.0f;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            androidx.compose.material3.internal.InputPhase inputPhase6222 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(-1093194547);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            i7 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase6222.ordinal()];
            if (i7 != 1) {
            }
            f4 = 1.0f;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            androidx.compose.runtime.State createTransitionAnimation22222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(f3), java.lang.Float.valueOf(f4), function3322.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter222, "PlaceholderOpacity", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>> function342222 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, java.lang.Integer num) {
                    return invoke(segment, composer42, num.intValue());
                }

                public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, int i192) {
                    composer42.startReplaceGroup(2126293195);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(2126293195, i192, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:426)");
                    }
                    androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec = value222;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer42.endReplaceGroup();
                    return finiteAnimationSpec;
                }
            };
            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter32222 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
            androidx.compose.material3.internal.InputPhase inputPhase72222 = (androidx.compose.material3.internal.InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceGroup(-1258455321);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            i8 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase72222.ordinal()];
            if (i8 != 1) {
            }
            f5 = 1.0f;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            androidx.compose.material3.internal.InputPhase inputPhase822222 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(-1258455321);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            i9 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase822222.ordinal()];
            if (i9 != 1) {
            }
            f6 = 1.0f;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            androidx.compose.runtime.State createTransitionAnimation3222222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(f5), java.lang.Float.valueOf(f6), function342222.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter32222, "PrefixSuffixOpacity", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> value4222222 = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
            kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>> function35222222 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, java.lang.Integer num) {
                    return invoke(segment, composer42, num.intValue());
                }

                public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, int i192) {
                    composer42.startReplaceGroup(1954111929);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1954111929, i192, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:438)");
                    }
                    androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> finiteAnimationSpec = value4222222;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer42.endReplaceGroup();
                    return finiteAnimationSpec;
                }
            };
            androidx.compose.material3.internal.InputPhase inputPhase9222222 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(-12973394);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            if (androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase9222222.ordinal()] == 1) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            androidx.compose.ui.graphics.colorspace.ColorSpace m6000getColorSpaceimpl322222 = androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(j3);
            changed = startRestartGroup.changed(m6000getColorSpaceimpl322222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m6000getColorSpaceimpl322222);
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.compose.animation.core.TwoWayConverter twoWayConverter322222 = (androidx.compose.animation.core.TwoWayConverter) rememberedValue;
            androidx.compose.material3.internal.InputPhase inputPhase10222222 = (androidx.compose.material3.internal.InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceGroup(-12973394);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            if (androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase10222222.ordinal()] == 1) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            androidx.compose.ui.graphics.Color m5986boximpl322222 = androidx.compose.ui.graphics.Color.m5986boximpl(j4);
            inputPhase2 = (androidx.compose.material3.internal.InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(-12973394);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            if (androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$1[inputPhase2.ordinal()] == 1) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> createTransitionAnimation4222222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, m5986boximpl322222, androidx.compose.ui.graphics.Color.m5986boximpl(j2), function35222222.invoke(updateTransition.getSegment(), startRestartGroup, 0), twoWayConverter322222, "LabelTextStyleColor", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>> function36222222 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, java.lang.Integer num) {
                    return invoke(segment, composer42, num.intValue());
                }

                public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.material3.internal.InputPhase> segment, androidx.compose.runtime.Composer composer42, int i192) {
                    composer42.startReplaceGroup(1190923886);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1190923886, i192, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:450)");
                    }
                    androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> finiteAnimationSpec = value4222222;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer42.endReplaceGroup();
                    return finiteAnimationSpec;
                }
            };
            startRestartGroup.startReplaceGroup(-464752477);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            androidx.compose.ui.graphics.colorspace.ColorSpace m6000getColorSpaceimpl2222222 = androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(m3940labelColorXeAY9LY$material3);
            changed2 = startRestartGroup.changed(m6000getColorSpaceimpl2222222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m6000getColorSpaceimpl2222222);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            androidx.compose.animation.core.TwoWayConverter twoWayConverter2222222 = (androidx.compose.animation.core.TwoWayConverter) rememberedValue2;
            startRestartGroup.startReplaceGroup(-464752477);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            androidx.compose.ui.graphics.Color m5986boximpl2222222 = androidx.compose.ui.graphics.Color.m5986boximpl(m3940labelColorXeAY9LY$material3);
            startRestartGroup.startReplaceGroup(-464752477);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> createTransitionAnimation5222222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, m5986boximpl2222222, androidx.compose.ui.graphics.Color.m5986boximpl(m3940labelColorXeAY9LY$material3), function36222222.invoke(updateTransition.getSegment(), startRestartGroup, java.lang.Integer.valueOf(i10)), twoWayConverter2222222, "LabelContentColor", startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            final androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$1222222 = (androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) rememberedValue3;
            if (function3 == null) {
            }
            long m3942placeholderColorXeAY9LY$material3222222 = textFieldColors2.m3942placeholderColorXeAY9LY$material3(z7, z6, z5);
            rememberedValue4 = composer3.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            androidx.compose.runtime.State state6222222 = (androidx.compose.runtime.State) rememberedValue4;
            if (function22 == null) {
            }
            composer3.startReplaceGroup(-1890217110);
            composer3.endReplaceGroup();
            composableLambda2 = null;
            long m3943prefixColorXeAY9LY$material3222222 = textFieldColors2.m3943prefixColorXeAY9LY$material3(z7, z6, z5);
            rememberedValue5 = composer3.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            androidx.compose.runtime.State state7222222 = (androidx.compose.runtime.State) rememberedValue5;
            if (function25 == null) {
            }
            composableLambda3 = composableLambda;
            composer3.startReplaceGroup(-1889500886);
            composer3.endReplaceGroup();
            composableLambda4 = null;
            long m3944suffixColorXeAY9LY$material3222222 = textFieldColors2.m3944suffixColorXeAY9LY$material3(z7, z6, z5);
            if (function26 == null) {
            }
            composer3.startReplaceGroup(-1888924534);
            composer3.endReplaceGroup();
            composableLambda5 = null;
            final long m3941leadingIconColorXeAY9LY$material3222222 = textFieldColors2.m3941leadingIconColorXeAY9LY$material3(z7, z6, z5);
            if (function23 == null) {
            }
            final long m3947trailingIconColorXeAY9LY$material3222222 = textFieldColors2.m3947trailingIconColorXeAY9LY$material3(z7, z6, z5);
            if (function24 == null) {
            }
            final long m3945supportingTextColorXeAY9LY$material3222222 = textFieldColors2.m3945supportingTextColorXeAY9LY$material3(z7, z6, z5);
            if (function27 == null) {
            }
            i15 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
            if (i15 == i14) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.internal.TextFieldImplKt.$r8$lambda$6ByhlgVUICAQnomyVSQ_IqBte3g(androidx.compose.material3.internal.TextFieldType.this, charSequence, function2, textFieldLabelPosition, function3, function22, function23, function24, function25, function26, function27, z, z2, z3, interactionSource, paddingValues, textFieldColors, function28, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final androidx.compose.ui.Alignment.Horizontal getMinimizedAlignment(androidx.compose.material3.TextFieldLabelPosition textFieldLabelPosition) {
        if (textFieldLabelPosition instanceof androidx.compose.material3.TextFieldLabelPosition.Above) {
            return ((androidx.compose.material3.TextFieldLabelPosition.Above) textFieldLabelPosition).getAlignment();
        }
        if (textFieldLabelPosition instanceof androidx.compose.material3.TextFieldLabelPosition.Attached) {
            return ((androidx.compose.material3.TextFieldLabelPosition.Attached) textFieldLabelPosition).getMinimizedAlignment();
        }
        throw new java.lang.IllegalArgumentException("Unknown position: ".concat(java.lang.String.valueOf(textFieldLabelPosition)));
    }

    public static final androidx.compose.ui.Alignment.Horizontal getExpandedAlignment(androidx.compose.material3.TextFieldLabelPosition textFieldLabelPosition) {
        if (textFieldLabelPosition instanceof androidx.compose.material3.TextFieldLabelPosition.Above) {
            return ((androidx.compose.material3.TextFieldLabelPosition.Above) textFieldLabelPosition).getAlignment();
        }
        if (textFieldLabelPosition instanceof androidx.compose.material3.TextFieldLabelPosition.Attached) {
            return ((androidx.compose.material3.TextFieldLabelPosition.Attached) textFieldLabelPosition).getExpandedAlignment();
        }
        throw new java.lang.IllegalArgumentException("Unknown position: ".concat(java.lang.String.valueOf(textFieldLabelPosition)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighResolutionOutputSizeshNQ4ISI(final long j, final androidx.compose.ui.text.TextStyle textStyle, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(396611577);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(396611577, i2, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:325)");
            }
            androidx.compose.material3.internal.ProvideContentColorTextStyleKt.m4302ProvideContentColorTextStyle3JVO9M(j, textStyle, function2, startRestartGroup, i2 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.internal.TextFieldImplKt.$r8$lambda$QftMxscYCmGgltKsDZYmi0indJc(j, textStyle, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRanges(final long j, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(590397809);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(590397809, i2, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:330)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(androidx.compose.material3.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m5986boximpl(j)), function2, startRestartGroup, (i2 & 112) | androidx.compose.runtime.ProvidedValue.$stable);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.internal.TextFieldImplKt.$r8$lambda$Q73XLtG_5V5Ejcu3wU5wM3n1UHs(j, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final androidx.compose.ui.Modifier defaultErrorSemantics(androidx.compose.ui.Modifier modifier, boolean z, final java.lang.String str) {
        return z ? androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifier, false, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.internal.TextFieldImplKt.$r8$lambda$c9Asi6Yg5R_J9W0LOov29x61mk8(str, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
            }
        }, 1, null) : modifier;
    }

    public static final androidx.compose.ui.Modifier textFieldBackground(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.graphics.ColorProducer colorProducer, final androidx.compose.ui.graphics.Shape shape) {
        return androidx.compose.ui.draw.DrawModifierKt.drawWithCache(modifier, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.internal.TextFieldImplKt.$r8$lambda$dgv57yyGatdK7Tf3s6C8DjZvlts(androidx.compose.ui.graphics.Shape.this, colorProducer, (androidx.compose.ui.draw.CacheDrawScope) obj);
            }
        });
    }

    public static final androidx.compose.ui.Modifier textFieldLabelMinHeight(androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function0<androidx.compose.ui.unit.Dp> function0) {
        return androidx.compose.ui.layout.LayoutModifierKt.layout(modifier, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.compose.material3.internal.TextFieldImplKt.$r8$lambda$iaRuF79rrjAL5DQkBCegJUO7Xq0(kotlin.jvm.functions.Function0.this, (androidx.compose.ui.layout.MeasureScope) obj, (androidx.compose.ui.layout.Measurable) obj2, (androidx.compose.ui.unit.Constraints) obj3);
            }
        });
    }

    /* renamed from: animateBorderStrokeAsState-NuRrP5Q, reason: not valid java name */
    public static final androidx.compose.runtime.State<androidx.compose.foundation.BorderStroke> m4388animateBorderStrokeAsStateNuRrP5Q(boolean z, boolean z2, boolean z3, androidx.compose.material3.TextFieldColors textFieldColors, float f, float f2, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> rememberUpdatedState;
        androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> rememberUpdatedState2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2047013045, i, -1, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:472)");
        }
        long m3939indicatorColorXeAY9LY$material3 = textFieldColors.m3939indicatorColorXeAY9LY$material3(z, z2, z3);
        androidx.compose.animation.core.FiniteAnimationSpec value = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects, composer, 6);
        if (z) {
            composer.startReplaceGroup(-1674507999);
            rememberUpdatedState = androidx.compose.animation.SingleValueAnimationKt.m1150animateColorAsStateeuL9pac(m3939indicatorColorXeAY9LY$material3, value, null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1674427244);
            rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.graphics.Color.m5986boximpl(m3939indicatorColorXeAY9LY$material3), composer, 0);
            composer.endReplaceGroup();
        }
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state = rememberUpdatedState;
        androidx.compose.animation.core.FiniteAnimationSpec value2 = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastSpatial, composer, 6);
        if (z) {
            composer.startReplaceGroup(-1674245832);
            rememberUpdatedState2 = androidx.compose.animation.core.AnimateAsStateKt.m1173animateDpAsStateAjpBEmI(!z3 ? f2 : f, value2, null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1674063769);
            rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.unit.Dp.m8599boximpl(f2), composer, (i >> 15) & 14);
            composer.endReplaceGroup();
        }
        androidx.compose.runtime.State<androidx.compose.foundation.BorderStroke> rememberUpdatedState3 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.foundation.BorderStrokeKt.m1312BorderStrokecXLIe8U(rememberUpdatedState2.getValue().m8615unboximpl(), state.getValue().m6006unboximpl()), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberUpdatedState3;
    }

    public static final float textFieldHorizontalIconPadding(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1986450462, i, -1, "androidx.compose.material3.internal.textFieldHorizontalIconPadding (TextFieldImpl.kt:520)");
        }
        float m8615unboximpl = ((androidx.compose.ui.unit.Dp) composer.consume(androidx.compose.material3.InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m8615unboximpl();
        if (java.lang.Float.isNaN(m8615unboximpl)) {
            m8615unboximpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(kotlin.ranges.RangesKt.coerceAtLeast(androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(m8615unboximpl - androidx.compose.material3.tokens.SmallIconButtonTokens.INSTANCE.m5030getIconSizeD9Ej5fM()) / 2.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m8601constructorimpl;
    }

    public static final float minimizedLabelHalfHeight(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1251545215, i, -1, "androidx.compose.material3.internal.minimizedLabelHalfHeight (TextFieldImpl.kt:527)");
        }
        long m8078getLineHeightXSAIIZE = androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer, 6).getBodySmall().m8078getLineHeightXSAIIZE();
        long m5139getBodySmallLineHeightXSAIIZE = androidx.compose.material3.tokens.TypeScaleTokens.INSTANCE.m5139getBodySmallLineHeightXSAIIZE();
        if (!androidx.compose.ui.unit.TextUnit.m8798isSpimpl(m8078getLineHeightXSAIIZE)) {
            m8078getLineHeightXSAIIZE = m5139getBodySmallLineHeightXSAIIZE;
        }
        float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(((androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo1413toDpGaN1DYA(m8078getLineHeightXSAIIZE) / 2.0f);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m8601constructorimpl;
    }

    public static final float getTextFieldPadding() {
        return getInputSizeshNQ4ISI;
    }

    public static final float getAboveLabelHorizontalPadding() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static final float getAboveLabelBottomPadding() {
        return getHighSpeedVideoFpsRanges;
    }

    public static final float getSupportingTopPadding() {
        return getOutputMinFrameDuration;
    }

    public static final float getPrefixSuffixTextPadding() {
        return getOutputFormats;
    }

    public static final float getMinTextLineHeight() {
        return getHighSpeedVideoSizes;
    }

    public static final float getMinFocusedLabelLineHeight() {
        return Camera2StreamConfigurationMap;
    }

    public static final float getMinSupportingTextLineHeight() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6ByhlgVUICAQnomyVSQ_IqBte3g(androidx.compose.material3.internal.TextFieldType textFieldType, java.lang.CharSequence charSequence, kotlin.jvm.functions.Function2 function2, androidx.compose.material3.TextFieldLabelPosition textFieldLabelPosition, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function2 function23, kotlin.jvm.functions.Function2 function24, kotlin.jvm.functions.Function2 function25, kotlin.jvm.functions.Function2 function26, kotlin.jvm.functions.Function2 function27, boolean z, boolean z2, boolean z3, androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.material3.TextFieldColors textFieldColors, kotlin.jvm.functions.Function2 function28, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CommonDecorationBox(textFieldType, charSequence, function2, textFieldLabelPosition, function3, function22, function23, function24, function25, function26, function27, z, z2, z3, interactionSource, paddingValues, textFieldColors, function28, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EYyrSmDMhQfLpAvKRUqQJJH8MOs(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$McGiMZ3Cy6hcC9SLfOwbbe7rDhU(androidx.compose.ui.graphics.Outline outline, androidx.compose.ui.graphics.ColorProducer colorProducer, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        androidx.compose.ui.graphics.OutlineKt.m6250drawOutlinewDX37Ww(drawScope, outline, colorProducer.getGetHighSpeedVideoFpsRanges(), (r17 & 4) != 0 ? 1.0f : 0.0f, (r17 & 8) != 0 ? androidx.compose.ui.graphics.drawscope.Fill.INSTANCE : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m6533getDefaultBlendMode0nO6VwU() : 0);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Q73XLtG_5V5Ejcu3wU5wM3n1UHs(long j, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(j, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QftMxscYCmGgltKsDZYmi0indJc(long j, androidx.compose.ui.text.TextStyle textStyle, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(j, textStyle, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$UoJC6qlLtITtgsZeZCucBcOGI9U(androidx.compose.runtime.State state) {
        return ((java.lang.Number) state.getValue()).floatValue() > 0.0f;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$c9Asi6Yg5R_J9W0LOov29x61mk8(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.error(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.draw.DrawResult $r8$lambda$dgv57yyGatdK7Tf3s6C8DjZvlts(androidx.compose.ui.graphics.Shape shape, final androidx.compose.ui.graphics.ColorProducer colorProducer, androidx.compose.ui.draw.CacheDrawScope cacheDrawScope) {
        final androidx.compose.ui.graphics.Outline mo1334createOutlinePq9zytI = shape.mo1334createOutlinePq9zytI(cacheDrawScope.m5554getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
        return cacheDrawScope.onDrawBehind(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.internal.TextFieldImplKt.$r8$lambda$McGiMZ3Cy6hcC9SLfOwbbe7rDhU(androidx.compose.ui.graphics.Outline.this, colorProducer, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gDbs4mvXXlfBUYU93kpp3hT7F2A(androidx.compose.material3.TextFieldLabelPosition textFieldLabelPosition, androidx.compose.runtime.State state, androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.geometry.Size size) {
        if (!(textFieldLabelPosition instanceof androidx.compose.material3.TextFieldLabelPosition.Above)) {
            float floatValue = ((java.lang.Number) state.getValue()).floatValue();
            float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (size.m5826unboximpl() >> 32)) * floatValue;
            float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (size.m5826unboximpl() & 4294967295L)) * floatValue;
            if (java.lang.Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.Size) mutableState.getValue()).m5826unboximpl() >> 32)) != intBitsToFloat || java.lang.Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.Size) mutableState.getValue()).m5826unboximpl() & 4294967295L)) != intBitsToFloat2) {
                mutableState.setValue(androidx.compose.ui.geometry.Size.m5809boximpl(androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L))));
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.layout.MeasureResult $r8$lambda$iaRuF79rrjAL5DQkBCegJUO7Xq0(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
        float m8615unboximpl = ((androidx.compose.ui.unit.Dp) function0.invoke()).m8615unboximpl();
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(constraints.getGetHighSpeedVideoFpsRangesFor(), 0, 0, androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(constraints.getGetHighSpeedVideoFpsRangesFor(), !androidx.compose.ui.unit.Dp.m8606equalsimpl0(m8615unboximpl, androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM()) ? measureScope.mo1412roundToPx0680j_4(m8615unboximpl) : 0), 0, 11, null));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.internal.TextFieldImplKt.$r8$lambda$EYyrSmDMhQfLpAvKRUqQJJH8MOs(androidx.compose.ui.layout.Placeable.this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* renamed from: $r8$lambda$vqLr-ue76vHClr9YqteauRxoGEY, reason: not valid java name */
    public static /* synthetic */ boolean m4385$r8$lambda$vqLrue76vHClr9YqteauRxoGEY(androidx.compose.runtime.State state) {
        return ((java.lang.Number) state.getValue()).floatValue() > 0.0f;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[androidx.compose.material3.internal.TextFieldType.values().length];
            try {
                iArr[androidx.compose.material3.internal.TextFieldType.Filled.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.material3.internal.TextFieldType.Outlined.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[androidx.compose.material3.internal.InputPhase.values().length];
            try {
                iArr2[androidx.compose.material3.internal.InputPhase.getHighSpeedVideoFpsRangesFor.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[androidx.compose.material3.internal.InputPhase.getHighResolutionOutputSizeshNQ4ISI.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[androidx.compose.material3.internal.InputPhase.getHighSpeedVideoFpsRanges.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
