package com.paypal.oslo.feature.onboarding.signup.welcome.ui.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId;", "", "Lkotlin/ranges/IntRange;", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;ILkotlin/ranges/IntRange;II)V", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "messageResId", com.visa.cbp.getEncExpo.warmup, "getMessageResId", "()I", "subtitleResId", "getSubtitleResId", "Companion", "SHOP", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.PAY, "EARN", "TRANSFER", "LAST"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WelcomePageId {
    private static final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.Companion INSTANCE;
    public static final com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId EARN;
    public static final com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId LAST;
    public static final com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId PAY;
    public static final com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId SHOP;
    private static final int TOTAL_FRAME;
    public static final com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId TRANSFER;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final int messageResId;
    private final kotlin.ranges.IntRange range;
    private final int subtitleResId;

    private WelcomePageId(java.lang.String str, int i, kotlin.ranges.IntRange intRange, int i2, int i3) {
        this.range = intRange;
        this.messageResId = i2;
        this.subtitleResId = i3;
    }

    /* synthetic */ WelcomePageId(java.lang.String str, int i, kotlin.ranges.IntRange intRange, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, intRange, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }

    public final kotlin.ranges.IntRange getRange() {
        return this.range;
    }

    public final int getMessageResId() {
        return this.messageResId;
    }

    public final int getSubtitleResId() {
        return this.subtitleResId;
    }

    static {
        com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId = new com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId("SHOP", 0, new kotlin.ranges.IntRange(30, 269), com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_welcome_animation_shop, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_welcome_subtitle_shop);
        SHOP = welcomePageId;
        com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId2 = new com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.PAY, 1, new kotlin.ranges.IntRange(270, 509), com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_welcome_animation_pay, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_welcome_subtitle_pay);
        PAY = welcomePageId2;
        com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId3 = new com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId("EARN", 2, new kotlin.ranges.IntRange(510, com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.EarnFrameEnd), com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_welcome_animation_earn, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_welcome_subtitle_earn);
        EARN = welcomePageId3;
        com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId4 = new com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId("TRANSFER", 3, new kotlin.ranges.IntRange(com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameStart, com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd), com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_welcome_animation_transfer, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_welcome_subtitle_transfer);
        TRANSFER = welcomePageId4;
        com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId5 = new com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId("LAST", 4, new kotlin.ranges.IntRange(com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.LastFrameStart, com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.LastFrameEnd), 0, 0, 6, null);
        LAST = welcomePageId5;
        com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId[] welcomePageIdArr = {welcomePageId, welcomePageId2, welcomePageId3, welcomePageId4, welcomePageId5};
        Camera2StreamConfigurationMap = welcomePageIdArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(welcomePageIdArr);
        INSTANCE = new com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.Companion(null);
        TOTAL_FRAME = welcomePageId5.range.getLast();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId$Companion;", "", "<init>", "()V", "", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId;", "from", "(I)Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId;", io.ktor.http.LinkHeader.Rel.Next, "previous", "TOTAL_FRAME", com.visa.cbp.getEncExpo.warmup, "getTOTAL_FRAME", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId from(int frame) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                kotlin.ranges.IntRange range = ((com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId) obj).getRange();
                int first = range.getFirst();
                if (frame <= range.getLast() && first <= frame) {
                    break;
                }
            }
            com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId = (com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId) obj;
            return welcomePageId == null ? com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.SHOP : welcomePageId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId next(int frame) {
            com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId from = from(frame);
            int ordinal = from.ordinal() + 1;
            kotlin.enums.EnumEntries<com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId> entries = com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.getEntries();
            com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId = from;
            if (ordinal >= 0) {
                welcomePageId = from;
                if (ordinal < entries.size()) {
                    welcomePageId = entries.get(ordinal);
                }
            }
            return welcomePageId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId previous(int frame) {
            com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId from = from(frame);
            int ordinal = from.ordinal() - 1;
            kotlin.enums.EnumEntries<com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId> entries = com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.getEntries();
            com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId = from;
            if (ordinal >= 0) {
                welcomePageId = from;
                if (ordinal < entries.size()) {
                    welcomePageId = entries.get(ordinal);
                }
            }
            return welcomePageId;
        }

        public final int getTOTAL_FRAME() {
            return com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.TOTAL_FRAME;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId[] values() {
        return (com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId) java.lang.Enum.valueOf(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
