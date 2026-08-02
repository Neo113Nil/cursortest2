package com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\t\u001a\u0004\b\f\u0010\rR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/components/nbacarousel/stackedcarousel/StackConfiguration;", "", "<init>", "()V", "", "MAX_VISIBLE_CARDS", com.visa.cbp.getEncExpo.warmup, "", "SCALE_DECREMENT", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Landroidx/compose/ui/unit/Dp;", "VERTICAL_OFFSET", "getVERTICAL_OFFSET-D9Ej5fM", "()F", "Landroidx/compose/animation/core/AnimationSpec;", "SWIPE_ANIMATION", "Landroidx/compose/animation/core/AnimationSpec;", "getSWIPE_ANIMATION", "()Landroidx/compose/animation/core/AnimationSpec;", "DEEP_CARD_ALPHA", "CREDIT_DEBIT_CARD_ASPECT_RATIO", "CREDIT_DEBIT_CARD_HEIGHT", "getCREDIT_DEBIT_CARD_HEIGHT-D9Ej5fM"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StackConfiguration {
    public static final float CREDIT_DEBIT_CARD_ASPECT_RATIO = 1.586f;
    public static final float DEEP_CARD_ALPHA = 0.7f;
    public static final int MAX_VISIBLE_CARDS = 3;
    public static final float SCALE_DECREMENT = 0.05f;
    public static final com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackConfiguration INSTANCE = new com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackConfiguration();
    private static final float VERTICAL_OFFSET = androidx.compose.ui.unit.Dp.m8601constructorimpl(-com.paypal.pds.core.ConstantsKt.getSize16());
    private static final androidx.compose.animation.core.AnimationSpec<java.lang.Float> SWIPE_ANIMATION = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.75f, 1500.0f, null, 4, null);
    private static final float CREDIT_DEBIT_CARD_HEIGHT = androidx.compose.ui.unit.Dp.m8601constructorimpl(134.0f);
    public static final int $stable = 8;

    private StackConfiguration() {
    }

    /* renamed from: getVERTICAL_OFFSET-D9Ej5fM, reason: not valid java name */
    public final float m14978getVERTICAL_OFFSETD9Ej5fM() {
        return VERTICAL_OFFSET;
    }

    public final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getSWIPE_ANIMATION() {
        return SWIPE_ANIMATION;
    }

    /* renamed from: getCREDIT_DEBIT_CARD_HEIGHT-D9Ej5fM, reason: not valid java name */
    public final float m14977getCREDIT_DEBIT_CARD_HEIGHTD9Ej5fM() {
        return CREDIT_DEBIT_CARD_HEIGHT;
    }
}
