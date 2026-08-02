package org.betup.ui.fragment.home.compose.sections;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomePromoSection.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u0013\u0010\u000f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0010\u0010\u0007R\u000e\u0010\u0011\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u0013\u0010\u0014\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0015\u0010\u0007R\u0013\u0010\u0016\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0017\u0010\u0007R\u000e\u0010\u0018\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lorg/betup/ui/fragment/home/compose/sections/PromoCardArt;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "CARD_HEIGHT", "Landroidx/compose/ui/unit/Dp;", "getCARD_HEIGHT-D9Ej5fM", "()F", "F", "PREVIEW_CARD_WIDTH", "getPREVIEW_CARD_WIDTH-D9Ej5fM", "EXPANDED_VIDEO_ROW_HORIZONTAL_PADDING", "getEXPANDED_VIDEO_ROW_HORIZONTAL_PADDING-D9Ej5fM", "SPECIAL_OFFER_ART_OFFSET_X", "getSPECIAL_OFFER_ART_OFFSET_X-D9Ej5fM", "SPECIAL_OFFER_ART_OFFSET_Y", "getSPECIAL_OFFER_ART_OFFSET_Y-D9Ej5fM", "SPECIAL_OFFER_ART_ALPHA", "", "SPECIAL_OFFER_ART_ROTATION_DEGREES", "VIDEO_REWARD_ART_OFFSET_X", "getVIDEO_REWARD_ART_OFFSET_X-D9Ej5fM", "VIDEO_REWARD_ART_OFFSET_Y", "getVIDEO_REWARD_ART_OFFSET_Y-D9Ej5fM", "VIDEO_REWARD_ART_ALPHA", "VIDEO_REWARD_ART_ROTATION_DEGREES", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PromoCardArt {
    public static final int $stable = 0;
    public static final float SPECIAL_OFFER_ART_ALPHA = 0.9f;
    public static final float SPECIAL_OFFER_ART_ROTATION_DEGREES = -10.0f;
    public static final float VIDEO_REWARD_ART_ALPHA = 0.95f;
    public static final float VIDEO_REWARD_ART_ROTATION_DEGREES = -0.0f;
    public static final PromoCardArt INSTANCE = new PromoCardArt();
    private static final float CARD_HEIGHT = Dp.m7774constructorimpl(108);
    private static final float PREVIEW_CARD_WIDTH = Dp.m7774constructorimpl(Opcodes.JSR);
    private static final float EXPANDED_VIDEO_ROW_HORIZONTAL_PADDING = Dp.m7774constructorimpl(24);
    private static final float SPECIAL_OFFER_ART_OFFSET_X = Dp.m7774constructorimpl(0);
    private static final float SPECIAL_OFFER_ART_OFFSET_Y = Dp.m7774constructorimpl(14);
    private static final float VIDEO_REWARD_ART_OFFSET_X = Dp.m7774constructorimpl(4);
    private static final float VIDEO_REWARD_ART_OFFSET_Y = Dp.m7774constructorimpl(6);

    private PromoCardArt() {
    }

    /* renamed from: getCARD_HEIGHT-D9Ej5fM, reason: not valid java name */
    public final float m13838getCARD_HEIGHTD9Ej5fM() {
        return CARD_HEIGHT;
    }

    /* renamed from: getPREVIEW_CARD_WIDTH-D9Ej5fM, reason: not valid java name */
    public final float m13840getPREVIEW_CARD_WIDTHD9Ej5fM() {
        return PREVIEW_CARD_WIDTH;
    }

    /* renamed from: getEXPANDED_VIDEO_ROW_HORIZONTAL_PADDING-D9Ej5fM, reason: not valid java name */
    public final float m13839getEXPANDED_VIDEO_ROW_HORIZONTAL_PADDINGD9Ej5fM() {
        return EXPANDED_VIDEO_ROW_HORIZONTAL_PADDING;
    }

    /* renamed from: getSPECIAL_OFFER_ART_OFFSET_X-D9Ej5fM, reason: not valid java name */
    public final float m13841getSPECIAL_OFFER_ART_OFFSET_XD9Ej5fM() {
        return SPECIAL_OFFER_ART_OFFSET_X;
    }

    /* renamed from: getSPECIAL_OFFER_ART_OFFSET_Y-D9Ej5fM, reason: not valid java name */
    public final float m13842getSPECIAL_OFFER_ART_OFFSET_YD9Ej5fM() {
        return SPECIAL_OFFER_ART_OFFSET_Y;
    }

    /* renamed from: getVIDEO_REWARD_ART_OFFSET_X-D9Ej5fM, reason: not valid java name */
    public final float m13843getVIDEO_REWARD_ART_OFFSET_XD9Ej5fM() {
        return VIDEO_REWARD_ART_OFFSET_X;
    }

    /* renamed from: getVIDEO_REWARD_ART_OFFSET_Y-D9Ej5fM, reason: not valid java name */
    public final float m13844getVIDEO_REWARD_ART_OFFSET_YD9Ej5fM() {
        return VIDEO_REWARD_ART_OFFSET_Y;
    }
}
