package com.adobe.marketing.mobile.services.ui.message.mapping;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/mapping/MessageOffsetMapper;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$MessageAlignment;", "horizontalAlignment", "", "offsetPercent", "Landroidx/compose/ui/unit/Dp;", "screenWidthDp", "getHorizontalOffset-sI9pFWI$core_phoneRelease", "(Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$MessageAlignment;IF)F", "getHorizontalOffset", "verticalAlignment", "screenHeightDp", "getVerticalOffset-sI9pFWI$core_phoneRelease", "getVerticalOffset"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class MessageOffsetMapper {
    public static final com.adobe.marketing.mobile.services.ui.message.mapping.MessageOffsetMapper INSTANCE = new com.adobe.marketing.mobile.services.ui.message.mapping.MessageOffsetMapper();

    private MessageOffsetMapper() {
    }

    /* renamed from: getHorizontalOffset-sI9pFWI$core_phoneRelease, reason: not valid java name */
    public final float m9886getHorizontalOffsetsI9pFWI$core_phoneRelease(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment horizontalAlignment, int offsetPercent, float screenWidthDp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(horizontalAlignment, "");
        float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl((offsetPercent * screenWidthDp) / 100.0f);
        int i = com.adobe.marketing.mobile.services.ui.message.mapping.MessageOffsetMapper.WhenMappings.$EnumSwitchMapping$0[horizontalAlignment.ordinal()];
        if (i == 1) {
            return m8601constructorimpl;
        }
        if (i == 2) {
            return androidx.compose.ui.unit.Dp.m8601constructorimpl(-m8601constructorimpl);
        }
        if (i == 3) {
            return androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
    }

    /* renamed from: getVerticalOffset-sI9pFWI$core_phoneRelease, reason: not valid java name */
    public final float m9887getVerticalOffsetsI9pFWI$core_phoneRelease(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment verticalAlignment, int offsetPercent, float screenHeightDp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verticalAlignment, "");
        float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl((offsetPercent * screenHeightDp) / 100.0f);
        int i = com.adobe.marketing.mobile.services.ui.message.mapping.MessageOffsetMapper.WhenMappings.$EnumSwitchMapping$0[verticalAlignment.ordinal()];
        if (i == 3) {
            return androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        if (i == 4) {
            return m8601constructorimpl;
        }
        if (i == 5) {
            return androidx.compose.ui.unit.Dp.m8601constructorimpl(-m8601constructorimpl);
        }
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
    }

    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment.values().length];
            try {
                iArr[com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment.RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment.CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment.TOP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment.BOTTOM.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
