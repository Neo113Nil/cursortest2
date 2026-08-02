package com.datadog.android.sessionreplay.recorder.mapper;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/sessionreplay/recorder/mapper/EditTextMapper;", "Lcom/datadog/android/sessionreplay/recorder/mapper/TextViewMapper;", "Landroid/widget/EditText;", "Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "viewIdentifierResolver", "Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;", "colorStringFormatter", "Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;", "viewBoundsResolver", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "drawableToColorMapper", "<init>", "(Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;)V", "textView", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "textAndInputPrivacy", "", "isOption", "", "resolveCapturedText", "(Landroid/widget/EditText;Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;Z)Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EditTextMapper extends com.datadog.android.sessionreplay.recorder.mapper.TextViewMapper<android.widget.EditText> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.sessionreplay.recorder.mapper.EditTextMapper.Companion INSTANCE = new com.datadog.android.sessionreplay.recorder.mapper.EditTextMapper.Companion(null);
    private static final java.lang.Integer[] SENSITIVE_TEXT_VARIATIONS = {32, 112, 128, 144, java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE), 224};
    private static final java.lang.Integer[] SENSITIVE_NUMBER_VARIATIONS = {16};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditTextMapper(com.datadog.android.sessionreplay.utils.ViewIdentifierResolver viewIdentifierResolver, com.datadog.android.sessionreplay.utils.ColorStringFormatter colorStringFormatter, com.datadog.android.sessionreplay.utils.ViewBoundsResolver viewBoundsResolver, com.datadog.android.sessionreplay.utils.DrawableToColorMapper drawableToColorMapper) {
        super(viewIdentifierResolver, colorStringFormatter, viewBoundsResolver, drawableToColorMapper);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewIdentifierResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colorStringFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBoundsResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawableToColorMapper, "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.datadog.android.sessionreplay.recorder.mapper.TextViewMapper
    public final java.lang.String resolveCapturedText(android.widget.EditText textView, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, boolean isOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textAndInputPrivacy, "");
        android.text.Editable text = textView.getText();
        java.lang.String obj = text != null ? text.toString() : null;
        if (obj == null) {
            obj = "";
        }
        java.lang.CharSequence hint = textView.getHint();
        java.lang.String obj2 = hint != null ? hint.toString() : null;
        java.lang.String str = obj2 != null ? obj2 : "";
        if (obj.length() <= 0) {
            return textAndInputPrivacy == com.datadog.android.sessionreplay.TextAndInputPrivacy.MASK_ALL ? com.datadog.android.sessionreplay.internal.recorder.obfuscator.StringObfuscator.INSTANCE.getStringObfuscator().obfuscate(str) : str;
        }
        android.widget.EditText editText = textView;
        int inputType = editText.getInputType() & 4080;
        int inputType2 = editText.getInputType() & 15;
        boolean z = (inputType2 == 1 && kotlin.collections.ArraysKt.contains(SENSITIVE_TEXT_VARIATIONS, java.lang.Integer.valueOf(inputType))) || (inputType2 == 2 && kotlin.collections.ArraysKt.contains(SENSITIVE_NUMBER_VARIATIONS, java.lang.Integer.valueOf(inputType))) || inputType2 == 3;
        int i = com.datadog.android.sessionreplay.recorder.mapper.EditTextMapper.WhenMappings.$EnumSwitchMapping$0[textAndInputPrivacy.ordinal()];
        if (i == 1) {
            return z ? com.datadog.android.sessionreplay.recorder.mapper.TextViewMapper.FIXED_INPUT_MASK : obj;
        }
        if (i == 2 || i == 3) {
            return com.datadog.android.sessionreplay.recorder.mapper.TextViewMapper.FIXED_INPUT_MASK;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t"}, d2 = {"Lcom/datadog/android/sessionreplay/recorder/mapper/EditTextMapper$Companion;", "", "<init>", "()V", "", "", "SENSITIVE_NUMBER_VARIATIONS", "[Ljava/lang/Integer;", "getSENSITIVE_NUMBER_VARIATIONS$dd_sdk_android_session_replay_release", "()[Ljava/lang/Integer;", "SENSITIVE_TEXT_VARIATIONS", "getSENSITIVE_TEXT_VARIATIONS$dd_sdk_android_session_replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.Integer[] getSENSITIVE_TEXT_VARIATIONS$dd_sdk_android_session_replay_release() {
            return com.datadog.android.sessionreplay.recorder.mapper.EditTextMapper.SENSITIVE_TEXT_VARIATIONS;
        }

        public final java.lang.Integer[] getSENSITIVE_NUMBER_VARIATIONS$dd_sdk_android_session_replay_release() {
            return com.datadog.android.sessionreplay.recorder.mapper.EditTextMapper.SENSITIVE_NUMBER_VARIATIONS;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }
}
