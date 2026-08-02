package com.paypal.oslo.feature.onboarding.signup.welcome.ui.state;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0010R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00028G@CX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u000eR\u0011\u0010'\u001a\u00020$8G¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020(8G¢\u0006\u0006\u001a\u0004\b)\u0010*"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/state/WelcomeTextCarouselStateHolder;", "", "Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId;", "currentPageId", "", "", "wordWidths", "", "isSubtitle", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId;Ljava/util/Map;Z)V", "pageId", "", "updateCurrentPage", "(Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId;)V", "getTextWidth", "(Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId;)F", "width", "updateWordWidth", "(Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId;F)V", "screenWidthDp", "calculateRowOffset", "(F)F", "targetPage", "calculateSpacingTo", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Z", "<set-?>", "currentPageId$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentPageId", "()Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId;", "setCurrentPageId", "Landroidx/compose/ui/unit/Dp;", "getWordPadding-D9Ej5fM", "()F", "wordPadding", "", "getPagesWithMessages", "()Ljava/util/List;", "pagesWithMessages"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WelcomeTextCarouselStateHolder {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId, java.lang.Float> getHighSpeedVideoFpsRanges;

    /* renamed from: currentPageId$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState currentPageId;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;

    public WelcomeTextCarouselStateHolder(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId, java.util.Map<com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId, java.lang.Float> map, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(welcomePageId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighSpeedVideoFpsRanges = map;
        this.Camera2StreamConfigurationMap = z;
        this.currentPageId = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(welcomePageId, null, 2, null);
    }

    public /* synthetic */ WelcomeTextCarouselStateHolder(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId, java.util.Map map, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(welcomePageId, map, (i & 4) != 0 ? false : z);
    }

    private final void setCurrentPageId(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId) {
        this.currentPageId.setValue(welcomePageId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId getCurrentPageId() {
        return (com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId) this.currentPageId.getValue();
    }

    /* renamed from: getWordPadding-D9Ej5fM, reason: not valid java name */
    public final float m16509getWordPaddingD9Ej5fM() {
        return this.Camera2StreamConfigurationMap ? com.paypal.pds.core.ConstantsKt.getSpacing128() : com.paypal.pds.core.ConstantsKt.getSpacing12();
    }

    public final java.util.List<com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId> getPagesWithMessages() {
        if (this.Camera2StreamConfigurationMap) {
            kotlin.enums.EnumEntries<com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId> entries = com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.getEntries();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : entries) {
                if (((com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId) obj).getSubtitleResId() != 0) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        kotlin.enums.EnumEntries<com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId> entries2 = com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.getEntries();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : entries2) {
            if (((com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId) obj2).getMessageResId() != 0) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public final void updateCurrentPage(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId pageId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageId, "");
        setCurrentPageId(pageId);
    }

    public final float getTextWidth(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId pageId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageId, "");
        java.lang.Float f = this.getHighSpeedVideoFpsRanges.get(pageId);
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final void updateWordWidth(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId pageId, float width) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageId, "");
        this.getHighSpeedVideoFpsRanges.put(pageId, java.lang.Float.valueOf(width));
    }

    public final float calculateRowOffset(float screenWidthDp) {
        float f = screenWidthDp / 2.0f;
        float textWidth = getTextWidth(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.SHOP);
        float f2 = textWidth == 0.0f ? screenWidthDp : f - (textWidth / 2.0f);
        int i = com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeTextCarouselStateHolder.WhenMappings.$EnumSwitchMapping$0[getCurrentPageId().ordinal()];
        if (i == 1) {
            return f2;
        }
        if (i == 2) {
            screenWidthDp = calculateSpacingTo(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.PAY);
        } else if (i == 3) {
            screenWidthDp = calculateSpacingTo(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.EARN);
        } else if (i == 4) {
            screenWidthDp = calculateSpacingTo(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.TRANSFER);
        } else {
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            f2 -= calculateSpacingTo(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.TRANSFER);
        }
        return f2 - screenWidthDp;
    }

    public final float calculateSpacingTo(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId targetPage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetPage, "");
        float spacing128 = this.Camera2StreamConfigurationMap ? com.paypal.pds.core.ConstantsKt.getSpacing128() : com.paypal.pds.core.ConstantsKt.getSpacing12();
        float textWidth = (getTextWidth(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.SHOP) / 2.0f) + spacing128;
        if (targetPage != com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.SHOP && getPagesWithMessages().contains(targetPage)) {
            java.util.List drop = kotlin.collections.CollectionsKt.drop(getPagesWithMessages(), 1);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : drop) {
                if (((com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId) obj) == targetPage) {
                    break;
                }
                arrayList.add(obj);
            }
            for (com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId : kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId>) arrayList, targetPage)) {
                float textWidth2 = getTextWidth(welcomePageId);
                textWidth = welcomePageId == targetPage ? textWidth + (textWidth2 / 2.0f) : textWidth + textWidth2 + spacing128;
            }
        }
        return textWidth;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.values().length];
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.SHOP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.PAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.EARN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.TRANSFER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.LAST.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
