package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\"$\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\" \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"$\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\n8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\f\"&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00018\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u000f\"$\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00108AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0012\" \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\b\"$\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00148AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0016\" \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b\" \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\b"}, d2 = {"Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "", "getSaver", "(Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Saver", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/saveable/Saver;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/text/EmojiSupportMatch$Companion;", "Landroidx/compose/ui/text/EmojiSupportMatch;", "(Landroidx/compose/ui/text/EmojiSupportMatch$Companion;)Landroidx/compose/runtime/saveable/Saver;", "emojiSupportMatchSaver", "getEmojiSupportMatchSaver", "()Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/LineBreak$Companion;", "Landroidx/compose/ui/text/style/LineBreak;", "(Landroidx/compose/ui/text/style/LineBreak$Companion;)Landroidx/compose/runtime/saveable/Saver;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/text/style/TextMotion$Companion;", "Landroidx/compose/ui/text/style/TextMotion;", "(Landroidx/compose/ui/text/style/TextMotion$Companion;)Landroidx/compose/runtime/saveable/Saver;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Savers_androidKt {
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.ui.text.PlatformParagraphStyle, java.lang.Object> getHighSpeedVideoSizes = androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            java.lang.Object arrayListOf;
            arrayListOf = kotlin.collections.CollectionsKt.arrayListOf(androidx.compose.ui.text.SaversKt.save(java.lang.Boolean.valueOf(r2.getIncludeFontPadding())), androidx.compose.ui.text.SaversKt.save(androidx.compose.ui.text.EmojiSupportMatch.m7864boximpl(((androidx.compose.ui.text.PlatformParagraphStyle) obj2).getEmojiSupportMatch()), androidx.compose.ui.text.Savers_androidKt.getSaver(androidx.compose.ui.text.EmojiSupportMatch.INSTANCE), (androidx.compose.runtime.saveable.SaverScope) obj));
            return arrayListOf;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.compose.ui.text.Savers_androidKt.$r8$lambda$QsNujTwn7QIro1CV8S_kWMdKpa4(obj);
        }
    });
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.ui.text.EmojiSupportMatch, java.lang.Object> emojiSupportMatchSaver = androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            java.lang.Object valueOf;
            valueOf = java.lang.Integer.valueOf(((androidx.compose.ui.text.EmojiSupportMatch) obj2).getGetHighSpeedVideoFpsRangesFor());
            return valueOf;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.compose.ui.text.Savers_androidKt.$r8$lambda$G9A6QGvIEjVI1lyj11PLCxf2JSU(obj);
        }
    });
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.ui.text.style.LineBreak, java.lang.Object> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            java.lang.Object valueOf;
            valueOf = java.lang.Integer.valueOf(((androidx.compose.ui.text.style.LineBreak) obj2).getGetHighResolutionOutputSizeshNQ4ISI());
            return valueOf;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.compose.ui.text.Savers_androidKt.$r8$lambda$t1peidAd9PyU23jWJ4Oj0nfx3d4(obj);
        }
    });
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.ui.text.style.TextMotion, java.lang.Object> Camera2StreamConfigurationMap = androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return androidx.compose.ui.text.Savers_androidKt.$r8$lambda$PabvzeZJPOXN9KgGoFGOJE5Boas((androidx.compose.runtime.saveable.SaverScope) obj, (androidx.compose.ui.text.style.TextMotion) obj2);
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.compose.ui.text.Savers_androidKt.$r8$lambda$FpHV3_UOali9TbXf7Yf11IzQDIk(obj);
        }
    });
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.ui.text.style.TextMotion.Linearity, java.lang.Object> getHighSpeedVideoFpsRanges = androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            java.lang.Object valueOf;
            valueOf = java.lang.Integer.valueOf(((androidx.compose.ui.text.style.TextMotion.Linearity) obj2).getCamera2StreamConfigurationMap());
            return valueOf;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.compose.ui.text.Savers_androidKt.m7970$r8$lambda$jRJFbIqkkFSo0J2N8n3tH4yM(obj);
        }
    });

    public static final androidx.compose.runtime.saveable.Saver<androidx.compose.ui.text.PlatformParagraphStyle, java.lang.Object> getSaver(androidx.compose.ui.text.PlatformParagraphStyle.Companion companion) {
        return getHighSpeedVideoSizes;
    }

    public static final androidx.compose.runtime.saveable.Saver<androidx.compose.ui.text.EmojiSupportMatch, java.lang.Object> getSaver(androidx.compose.ui.text.EmojiSupportMatch.Companion companion) {
        return emojiSupportMatchSaver;
    }

    public static final androidx.compose.runtime.saveable.Saver<androidx.compose.ui.text.EmojiSupportMatch, java.lang.Object> getEmojiSupportMatchSaver() {
        return emojiSupportMatchSaver;
    }

    public static final androidx.compose.runtime.saveable.Saver<androidx.compose.ui.text.style.LineBreak, java.lang.Object> getSaver(androidx.compose.ui.text.style.LineBreak.Companion companion) {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static final androidx.compose.runtime.saveable.Saver<androidx.compose.ui.text.style.TextMotion, java.lang.Object> getSaver(androidx.compose.ui.text.style.TextMotion.Companion companion) {
        return Camera2StreamConfigurationMap;
    }

    public static /* synthetic */ androidx.compose.ui.text.style.TextMotion $r8$lambda$FpHV3_UOali9TbXf7Yf11IzQDIk(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.util.List list = (java.util.List) obj;
        java.lang.Object obj2 = list.get(0);
        androidx.compose.ui.text.style.TextMotion.Linearity.Companion companion = androidx.compose.ui.text.style.TextMotion.Linearity.INSTANCE;
        androidx.compose.runtime.saveable.Saver<androidx.compose.ui.text.style.TextMotion.Linearity, java.lang.Object> saver = getHighSpeedVideoFpsRanges;
        androidx.compose.ui.text.style.TextMotion.Linearity restore = ((!kotlin.jvm.internal.Intrinsics.areEqual(obj2, java.lang.Boolean.FALSE) || (saver instanceof androidx.compose.ui.text.NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(restore);
        int camera2StreamConfigurationMap = restore.getCamera2StreamConfigurationMap();
        java.lang.Object obj3 = list.get(1);
        java.lang.Boolean bool = obj3 != null ? (java.lang.Boolean) obj3 : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
        return new androidx.compose.ui.text.style.TextMotion(camera2StreamConfigurationMap, bool.booleanValue(), null);
    }

    public static /* synthetic */ androidx.compose.ui.text.EmojiSupportMatch $r8$lambda$G9A6QGvIEjVI1lyj11PLCxf2JSU(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return androidx.compose.ui.text.EmojiSupportMatch.m7864boximpl(androidx.compose.ui.text.EmojiSupportMatch.m7865constructorimpl(((java.lang.Integer) obj).intValue()));
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$PabvzeZJPOXN9KgGoFGOJE5Boas(androidx.compose.runtime.saveable.SaverScope saverScope, androidx.compose.ui.text.style.TextMotion textMotion) {
        androidx.compose.ui.text.style.TextMotion.Linearity m8478boximpl = androidx.compose.ui.text.style.TextMotion.Linearity.m8478boximpl(textMotion.getLinearity());
        androidx.compose.ui.text.style.TextMotion.Linearity.Companion companion = androidx.compose.ui.text.style.TextMotion.Linearity.INSTANCE;
        return kotlin.collections.CollectionsKt.arrayListOf(androidx.compose.ui.text.SaversKt.save(m8478boximpl, getHighSpeedVideoFpsRanges, saverScope), androidx.compose.ui.text.SaversKt.save(java.lang.Boolean.valueOf(textMotion.getSubpixelTextPositioning())));
    }

    public static /* synthetic */ androidx.compose.ui.text.PlatformParagraphStyle $r8$lambda$QsNujTwn7QIro1CV8S_kWMdKpa4(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.util.List list = (java.util.List) obj;
        java.lang.Object obj2 = list.get(0);
        java.lang.Boolean bool = obj2 != null ? (java.lang.Boolean) obj2 : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
        boolean booleanValue = bool.booleanValue();
        java.lang.Object obj3 = list.get(1);
        androidx.compose.runtime.saveable.Saver<androidx.compose.ui.text.EmojiSupportMatch, java.lang.Object> saver = getSaver(androidx.compose.ui.text.EmojiSupportMatch.INSTANCE);
        androidx.compose.ui.text.EmojiSupportMatch restore = ((!kotlin.jvm.internal.Intrinsics.areEqual(obj3, java.lang.Boolean.FALSE) || (saver instanceof androidx.compose.ui.text.NonNullValueClassSaver)) && obj3 != null) ? saver.restore(obj3) : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(restore);
        return new androidx.compose.ui.text.PlatformParagraphStyle(restore.getGetHighSpeedVideoFpsRangesFor(), booleanValue, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: $r8$lambda$jRJ-F-bIqkkFSo0J2N8-n3tH4yM, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.style.TextMotion.Linearity m7970$r8$lambda$jRJFbIqkkFSo0J2N8n3tH4yM(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return androidx.compose.ui.text.style.TextMotion.Linearity.m8478boximpl(androidx.compose.ui.text.style.TextMotion.Linearity.m8479constructorimpl(((java.lang.Integer) obj).intValue()));
    }

    public static /* synthetic */ androidx.compose.ui.text.style.LineBreak $r8$lambda$t1peidAd9PyU23jWJ4Oj0nfx3d4(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return androidx.compose.ui.text.style.LineBreak.m8341boximpl(androidx.compose.ui.text.style.LineBreak.m8342constructorimpl(((java.lang.Integer) obj).intValue()));
    }
}
