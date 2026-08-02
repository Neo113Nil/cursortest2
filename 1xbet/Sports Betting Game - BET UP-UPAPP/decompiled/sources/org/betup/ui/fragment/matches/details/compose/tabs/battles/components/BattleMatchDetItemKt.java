package org.betup.ui.fragment.matches.details.compose.tabs.battles.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import coil3.compose.SingletonAsyncImageKt;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.model.remote.entity.challenges.ChallengeState;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.HapticFeedbackType;
import org.betup.ui.fragment.matches.details.compose.tabs.battles.items.BattleCreator;
import org.betup.ui.fragment.matches.details.compose.tabs.battles.items.BattleUiItem;
import org.betup.ui.fragment.user.compose.UserBattleListDimens;
import org.betup.ui.views.ComposeUtils;

/* compiled from: BattleMatchDetItem.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001ac\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0013"}, d2 = {"BattleMatchDetItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "item", "Lorg/betup/ui/fragment/matches/details/compose/tabs/battles/items/BattleUiItem;", "onAcceptClick", "Lkotlin/Function1;", "", "onPreviewClick", "showAcceptButton", "", "compactList", "(Landroidx/compose/ui/Modifier;Lorg/betup/ui/fragment/matches/details/compose/tabs/battles/items/BattleUiItem;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/runtime/Composer;II)V", "BattleMatchDetItemPreview", "(Landroidx/compose/runtime/Composer;I)V", "BattleMatchDetItemWithFeePreview", "BattleMatchDetItemLongNamePreview", "BattleMatchDetItemOwnBattlePreview", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BattleMatchDetItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleMatchDetItem$lambda$11(Modifier modifier, BattleUiItem battleUiItem, Function1 function1, Function1 function12, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        BattleMatchDetItem(modifier, battleUiItem, function1, function12, z, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleMatchDetItemLongNamePreview$lambda$29(int i, Composer composer, int i2) {
        BattleMatchDetItemLongNamePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleMatchDetItemOwnBattlePreview$lambda$35(int i, Composer composer, int i2) {
        BattleMatchDetItemOwnBattlePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleMatchDetItemPreview$lambda$17(int i, Composer composer, int i2) {
        BattleMatchDetItemPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleMatchDetItemWithFeePreview$lambda$23(int i, Composer composer, int i2) {
        BattleMatchDetItemWithFeePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0a78  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0a88  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BattleMatchDetItem(Modifier modifier, final BattleUiItem item, Function1<? super Long, Unit> function1, Function1<? super Long, Unit> function12, boolean z, boolean z2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function1<? super Long, Unit> function13;
        int i4;
        Function1<? super Long, Unit> function14;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        final Function1<? super Long, Unit> function15;
        boolean z5;
        float m7774constructorimpl;
        float m7774constructorimpl2;
        float m7774constructorimpl3;
        float m7774constructorimpl4;
        long sp;
        long sp2;
        long sp3;
        float m7774constructorimpl5;
        float m7774constructorimpl6;
        float m7774constructorimpl7;
        float m7774constructorimpl8;
        RoundedCornerShape rectangleShape;
        Modifier modifier3;
        boolean z6;
        float f;
        float f2;
        float f3;
        Modifier m1025backgroundbw27NRU$default;
        boolean z7;
        Object rememberedValue;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        char c;
        int i7;
        float m7774constructorimpl9;
        int currentCompositeKeyHash4;
        Composer m4610constructorimpl4;
        final Function1<? super Long, Unit> function16;
        final boolean z8;
        final Function1<? super Long, Unit> function17;
        final boolean z9;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(item, "item");
        Composer startRestartGroup = composer.startRestartGroup(-55996930);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(item) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function13 = function1;
            i3 |= startRestartGroup.changedInstance(function13) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function14 = function12;
                i3 |= startRestartGroup.changedInstance(function14) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    z3 = z;
                    i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        z4 = z2;
                    } else {
                        z4 = z2;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                        }
                    }
                    if ((i3 & 74899) == 74898 || !startRestartGroup.getSkipping()) {
                        Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                        final Function1<? super Long, Unit> function18 = i9 == 0 ? null : function13;
                        function15 = i4 == 0 ? null : function14;
                        z5 = i5 == 0 ? true : z3;
                        if (i6 != 0) {
                            z4 = false;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-55996930, i3, -1, "org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItem (BattleMatchDetItem.kt:50)");
                        }
                        if (!z4) {
                            m7774constructorimpl = UserBattleListDimens.INSTANCE.m14232getDetPaddingVD9Ej5fM();
                        } else {
                            m7774constructorimpl = Dp.m7774constructorimpl(12);
                        }
                        if (!z4) {
                            m7774constructorimpl2 = UserBattleListDimens.INSTANCE.m14231getDetPaddingHD9Ej5fM();
                        } else {
                            m7774constructorimpl2 = Dp.m7774constructorimpl(8);
                        }
                        if (!z4) {
                            m7774constructorimpl3 = UserBattleListDimens.INSTANCE.m14226getDetAvatarSizeD9Ej5fM();
                        } else {
                            m7774constructorimpl3 = Dp.m7774constructorimpl(22);
                        }
                        if (!z4) {
                            m7774constructorimpl4 = UserBattleListDimens.INSTANCE.m14225getDetAvatarNameSpacingD9Ej5fM();
                        } else {
                            m7774constructorimpl4 = Dp.m7774constructorimpl(4);
                        }
                        float f4 = m7774constructorimpl4;
                        if (!z4) {
                            sp = UserBattleListDimens.INSTANCE.m14230getDetLabelFontXSAIIZE();
                        } else {
                            sp = TextUnitKt.getSp(12);
                        }
                        long j = sp;
                        if (!z4) {
                            sp2 = UserBattleListDimens.INSTANCE.m14224getDetAmountFontXSAIIZE();
                        } else {
                            sp2 = TextUnitKt.getSp(14);
                        }
                        long j2 = sp2;
                        if (!z4) {
                            sp3 = UserBattleListDimens.INSTANCE.m14233getDetStatusFontXSAIIZE();
                        } else {
                            sp3 = TextUnitKt.getSp(14);
                        }
                        long j3 = sp3;
                        if (!z4) {
                            m7774constructorimpl5 = UserBattleListDimens.INSTANCE.m14227getDetCoinSizeD9Ej5fM();
                        } else {
                            m7774constructorimpl5 = Dp.m7774constructorimpl(12);
                        }
                        if (!z4) {
                            m7774constructorimpl6 = UserBattleListDimens.INSTANCE.m14221getDetAcceptButtonMinWidthD9Ej5fM();
                        } else {
                            m7774constructorimpl6 = Dp.m7774constructorimpl(80);
                        }
                        float f5 = m7774constructorimpl6;
                        if (!z4) {
                            m7774constructorimpl7 = UserBattleListDimens.INSTANCE.m14220getDetAcceptButtonMaxWidthD9Ej5fM();
                        } else {
                            m7774constructorimpl7 = Dp.m7774constructorimpl(100);
                        }
                        float f6 = m7774constructorimpl7;
                        if (!z4) {
                            m7774constructorimpl8 = UserBattleListDimens.INSTANCE.m14229getDetCreatorSpacerWidthD9Ej5fM();
                        } else {
                            m7774constructorimpl8 = Dp.m7774constructorimpl(80);
                        }
                        float f7 = m7774constructorimpl8;
                        if (!z4) {
                            rectangleShape = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(UserBattleListDimens.INSTANCE.m14228getDetCornerRadiusD9Ej5fM());
                        } else {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        Shape shape = rectangleShape;
                        Modifier clip = ClipKt.clip(companion, shape);
                        if (z5) {
                            m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(Modifier.INSTANCE, ColorKt.Color(0), null, 2, null);
                            modifier3 = companion;
                            z6 = z4;
                            f = f4;
                            f2 = m7774constructorimpl5;
                            f3 = f7;
                        } else if (z4) {
                            modifier3 = companion;
                            f2 = m7774constructorimpl5;
                            f3 = f7;
                            z6 = z4;
                            f = f4;
                            m1025backgroundbw27NRU$default = BackgroundKt.m1024backgroundbw27NRU(BorderKt.m1036borderxT4_qwU(Modifier.INSTANCE, Dp.m7774constructorimpl(1), ComposeUtils.AppColorPalette.ScreenBorder.INSTANCE.getColor(), shape), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), shape);
                        } else {
                            modifier3 = companion;
                            z6 = z4;
                            f = f4;
                            f2 = m7774constructorimpl5;
                            f3 = f7;
                            m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(Modifier.INSTANCE, ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), null, 2, null);
                        }
                        Modifier then = clip.then(m1025backgroundbw27NRU$default);
                        startRestartGroup.startReplaceGroup(-1633490746);
                        int i10 = i3 & 112;
                        z7 = ((i3 & 7168) != 2048) | (i10 != 32);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z7 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit BattleMatchDetItem$lambda$1$lambda$0;
                                    BattleMatchDetItem$lambda$1$lambda$0 = BattleMatchDetItemKt.BattleMatchDetItem$lambda$1$lambda$0(Function1.this, item);
                                    return BattleMatchDetItem$lambda$1$lambda$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(then, false, null, null, (Function0) rememberedValue, 7, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function1<? super Long, Unit> function19 = function15;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), m7774constructorimpl2, m7774constructorimpl);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor2);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        Modifier weight = rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, weight);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor3);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        String photoUrl = item.getCreatedBy().getPhotoUrl();
                        float f8 = f2;
                        float f9 = f3;
                        int i11 = i3;
                        SingletonAsyncImageKt.m8175AsyncImagex1rPTaM(StringsKt.isBlank(photoUrl) ? photoUrl : null, null, ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, m7774constructorimpl3), RoundedCornerShapeKt.getCircleShape()), PainterResources_androidKt.painterResource(R.drawable.default_push, startRestartGroup, 6), PainterResources_androidKt.painterResource(R.drawable.default_push, startRestartGroup, 6), null, null, null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, startRestartGroup, 48, 6, 31712);
                        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, f), startRestartGroup, 0);
                        TextKt.m2642Text4IGK_g(item.getCreatedBy().getName(), rowScopeInstance2.weight(Modifier.INSTANCE, 1.0f, false), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), j, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 3120, 55292);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        if (z6) {
                            c = '\b';
                            i7 = 6;
                            m7774constructorimpl9 = Dp.m7774constructorimpl(8);
                        } else {
                            i7 = 6;
                            m7774constructorimpl9 = Dp.m7774constructorimpl(6);
                            c = '\b';
                        }
                        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(companion2, m7774constructorimpl9), startRestartGroup, 0);
                        Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, companion3);
                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor4);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                        int i12 = i7;
                        TextKt.m2642Text4IGK_g(String.valueOf(item.getMoneyAccept()), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), j2, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, i7), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7662getRighte0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 3 : 4)), startRestartGroup, 0);
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_betcoin, startRestartGroup, i12), StringResources_androidKt.stringResource(R.string.cd_betcoin, startRestartGroup, i12), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f8), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 8 : 12)), startRestartGroup, 0);
                        if (!item.isUserCreator()) {
                            startRestartGroup.startReplaceGroup(528667032);
                            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, f9), startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(528910599);
                            if (z5) {
                                startRestartGroup.startReplaceGroup(528946497);
                                if (Intrinsics.areEqual(item.getParticipantState(), ChallengeState.PENDING.INSTANCE) || Intrinsics.areEqual(item.getParticipantState(), ChallengeState.NONE.INSTANCE)) {
                                    startRestartGroup.startReplaceGroup(528974118);
                                    String stringResource = StringResources_androidKt.stringResource(R.string.accept, startRestartGroup, i12);
                                    Dp m7772boximpl = z6 ? Dp.m7772boximpl(UserBattleListDimens.INSTANCE.m14223getDetAcceptButtonVerticalPaddingD9Ej5fM()) : null;
                                    TextUnit m7958boximpl = z6 ? TextUnit.m7958boximpl(UserBattleListDimens.INSTANCE.m14218getDetAcceptButtonFontXSAIIZE()) : null;
                                    Dp m7772boximpl2 = z6 ? Dp.m7772boximpl(UserBattleListDimens.INSTANCE.m14219getDetAcceptButtonHorizontalPaddingD9Ej5fM()) : null;
                                    Dp m7772boximpl3 = z6 ? Dp.m7772boximpl(UserBattleListDimens.INSTANCE.m14222getDetAcceptButtonTextPaddingD9Ej5fM()) : null;
                                    HapticFeedbackType hapticFeedbackType = HapticFeedbackType.Confirm;
                                    Modifier m1569widthInVpY3zN4 = SizeKt.m1569widthInVpY3zN4(Modifier.INSTANCE, f5, f6);
                                    startRestartGroup.startReplaceGroup(-1633490746);
                                    boolean z10 = ((i11 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | (i10 == 32);
                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (z10 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt$$ExternalSyntheticLambda10
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit BattleMatchDetItem$lambda$10$lambda$9$lambda$6$lambda$5;
                                                BattleMatchDetItem$lambda$10$lambda$9$lambda$6$lambda$5 = BattleMatchDetItemKt.BattleMatchDetItem$lambda$10$lambda$9$lambda$6$lambda$5(Function1.this, item);
                                                return BattleMatchDetItem$lambda$10$lambda$9$lambda$6$lambda$5;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    CommonButtonKt.m12915CommonButtonUPEs2M4(m1569widthInVpY3zN4, true, stringResource, false, z6, false, (Function0) rememberedValue2, false, false, false, false, false, null, null, false, false, m7772boximpl, m7958boximpl, m7772boximpl2, m7772boximpl3, hapticFeedbackType, startRestartGroup, (57344 & (i11 >> 3)) | 48, 0, 6, 65448);
                                    startRestartGroup.endReplaceGroup();
                                } else if (item.getParticipantCount() >= 2) {
                                    startRestartGroup.startReplaceGroup(530697563);
                                    TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.full, startRestartGroup, i12), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), j3, new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, i12), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                    startRestartGroup.endReplaceGroup();
                                } else if (!Intrinsics.areEqual(item.getParticipantState(), ChallengeState.ACCEPTED.INSTANCE)) {
                                    startRestartGroup.startReplaceGroup(531315579);
                                    TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.accepted, startRestartGroup, i12), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), j3, new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, i12), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    startRestartGroup.startReplaceGroup(531916390);
                                    String stringResource2 = StringResources_androidKt.stringResource(R.string.accept, startRestartGroup, i12);
                                    Dp m7772boximpl4 = z6 ? Dp.m7772boximpl(UserBattleListDimens.INSTANCE.m14223getDetAcceptButtonVerticalPaddingD9Ej5fM()) : null;
                                    TextUnit m7958boximpl2 = z6 ? TextUnit.m7958boximpl(UserBattleListDimens.INSTANCE.m14218getDetAcceptButtonFontXSAIIZE()) : null;
                                    Dp m7772boximpl5 = z6 ? Dp.m7772boximpl(UserBattleListDimens.INSTANCE.m14219getDetAcceptButtonHorizontalPaddingD9Ej5fM()) : null;
                                    Dp m7772boximpl6 = z6 ? Dp.m7772boximpl(UserBattleListDimens.INSTANCE.m14222getDetAcceptButtonTextPaddingD9Ej5fM()) : null;
                                    HapticFeedbackType hapticFeedbackType2 = HapticFeedbackType.Confirm;
                                    Modifier m1569widthInVpY3zN42 = SizeKt.m1569widthInVpY3zN4(Modifier.INSTANCE, f5, f6);
                                    startRestartGroup.startReplaceGroup(-1633490746);
                                    boolean z11 = ((i11 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | (i10 == 32);
                                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (z11 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt$$ExternalSyntheticLambda11
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit BattleMatchDetItem$lambda$10$lambda$9$lambda$8$lambda$7;
                                                BattleMatchDetItem$lambda$10$lambda$9$lambda$8$lambda$7 = BattleMatchDetItemKt.BattleMatchDetItem$lambda$10$lambda$9$lambda$8$lambda$7(Function1.this, item);
                                                return BattleMatchDetItem$lambda$10$lambda$9$lambda$8$lambda$7;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    CommonButtonKt.m12915CommonButtonUPEs2M4(m1569widthInVpY3zN42, true, stringResource2, false, z6, false, (Function0) rememberedValue3, false, false, false, false, false, null, null, false, false, m7772boximpl4, m7958boximpl2, m7772boximpl5, m7772boximpl6, hapticFeedbackType2, startRestartGroup, (57344 & (i11 >> 3)) | 48, 0, 6, 65448);
                                    startRestartGroup.endReplaceGroup();
                                }
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(533611377);
                                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, f9), startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.endReplaceGroup();
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function16 = function18;
                        z8 = z5;
                        function17 = function19;
                        z9 = z6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        function16 = function13;
                        z8 = z3;
                        z9 = z4;
                        function17 = function14;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier4 = modifier3;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit BattleMatchDetItem$lambda$11;
                                BattleMatchDetItem$lambda$11 = BattleMatchDetItemKt.BattleMatchDetItem$lambda$11(Modifier.this, item, function16, function17, z8, z9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return BattleMatchDetItem$lambda$11;
                            }
                        });
                        return;
                    }
                    return;
                }
                z3 = z;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                if ((i3 & 74899) == 74898) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!z4) {
                }
                if (!z4) {
                }
                if (!z4) {
                }
                if (!z4) {
                }
                float f42 = m7774constructorimpl4;
                if (!z4) {
                }
                long j4 = sp;
                if (!z4) {
                }
                long j22 = sp2;
                if (!z4) {
                }
                long j32 = sp3;
                if (!z4) {
                }
                if (!z4) {
                }
                float f52 = m7774constructorimpl6;
                if (!z4) {
                }
                float f62 = m7774constructorimpl7;
                if (!z4) {
                }
                float f72 = m7774constructorimpl8;
                if (!z4) {
                }
                Shape shape2 = rectangleShape;
                Modifier clip2 = ClipKt.clip(companion, shape2);
                if (z5) {
                }
                Modifier then2 = clip2.then(m1025backgroundbw27NRU$default);
                startRestartGroup.startReplaceGroup(-1633490746);
                int i102 = i3 & 112;
                z7 = ((i3 & 7168) != 2048) | (i102 != 32);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z7) {
                }
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BattleMatchDetItem$lambda$1$lambda$0;
                        BattleMatchDetItem$lambda$1$lambda$0 = BattleMatchDetItemKt.BattleMatchDetItem$lambda$1$lambda$0(Function1.this, item);
                        return BattleMatchDetItem$lambda$1$lambda$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                Modifier m1059clickableXHw0xAI$default2 = ClickableKt.m1059clickableXHw0xAI$default(then2, false, null, null, (Function0) rememberedValue, 7, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default2);
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                Function1<? super Long, Unit> function192 = function15;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash5);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), m7774constructorimpl2, m7774constructorimpl);
                Alignment.Vertical centerVertically4 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically4, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                Modifier weight2 = rowScopeInstance4.weight(Modifier.INSTANCE, 1.0f, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, weight2);
                Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting()) {
                }
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                String photoUrl2 = item.getCreatedBy().getPhotoUrl();
                float f82 = f2;
                float f92 = f3;
                int i112 = i3;
                SingletonAsyncImageKt.m8175AsyncImagex1rPTaM(StringsKt.isBlank(photoUrl2) ? photoUrl2 : null, null, ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, m7774constructorimpl3), RoundedCornerShapeKt.getCircleShape()), PainterResources_androidKt.painterResource(R.drawable.default_push, startRestartGroup, 6), PainterResources_androidKt.painterResource(R.drawable.default_push, startRestartGroup, 6), null, null, null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, startRestartGroup, 48, 6, 31712);
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, f), startRestartGroup, 0);
                TextKt.m2642Text4IGK_g(item.getCreatedBy().getName(), rowScopeInstance22.weight(Modifier.INSTANCE, 1.0f, false), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), j4, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 3120, 55292);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier.Companion companion22 = Modifier.INSTANCE;
                if (z6) {
                }
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(companion22, m7774constructorimpl9), startRestartGroup, 0);
                Alignment.Vertical centerVertically32 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier.Companion companion32 = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy32 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically32, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, companion32);
                Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl4.getInserting()) {
                }
                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42);
                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance32 = RowScopeInstance.INSTANCE;
                int i122 = i7;
                TextKt.m2642Text4IGK_g(String.valueOf(item.getMoneyAccept()), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), j22, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, i7), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7662getRighte0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 3 : 4)), startRestartGroup, 0);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_betcoin, startRestartGroup, i122), StringResources_androidKt.stringResource(R.string.cd_betcoin, startRestartGroup, i122), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f82), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 8 : 12)), startRestartGroup, 0);
                if (!item.isUserCreator()) {
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                function16 = function18;
                z8 = z5;
                function17 = function192;
                z9 = z6;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function14 = function12;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z3 = z;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            if ((i3 & 74899) == 74898) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!z4) {
            }
            if (!z4) {
            }
            if (!z4) {
            }
            if (!z4) {
            }
            float f422 = m7774constructorimpl4;
            if (!z4) {
            }
            long j42 = sp;
            if (!z4) {
            }
            long j222 = sp2;
            if (!z4) {
            }
            long j322 = sp3;
            if (!z4) {
            }
            if (!z4) {
            }
            float f522 = m7774constructorimpl6;
            if (!z4) {
            }
            float f622 = m7774constructorimpl7;
            if (!z4) {
            }
            float f722 = m7774constructorimpl8;
            if (!z4) {
            }
            Shape shape22 = rectangleShape;
            Modifier clip22 = ClipKt.clip(companion, shape22);
            if (z5) {
            }
            Modifier then22 = clip22.then(m1025backgroundbw27NRU$default);
            startRestartGroup.startReplaceGroup(-1633490746);
            int i1022 = i3 & 112;
            z7 = ((i3 & 7168) != 2048) | (i1022 != 32);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z7) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit BattleMatchDetItem$lambda$1$lambda$0;
                    BattleMatchDetItem$lambda$1$lambda$0 = BattleMatchDetItemKt.BattleMatchDetItem$lambda$1$lambda$0(Function1.this, item);
                    return BattleMatchDetItem$lambda$1$lambda$0;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier m1059clickableXHw0xAI$default22 = ClickableKt.m1059clickableXHw0xAI$default(then22, false, null, null, (Function0) rememberedValue, 7, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap52 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default22);
            Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
            Function1<? super Long, Unit> function1922 = function15;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash52);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            Modifier m1517paddingVpY3zN422 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), m7774constructorimpl2, m7774constructorimpl);
            Alignment.Vertical centerVertically42 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical spaceBetween22 = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy42 = RowKt.rowMeasurePolicy(spaceBetween22, centerVertically42, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN422);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance42 = RowScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
            Modifier weight22 = rowScopeInstance42.weight(Modifier.INSTANCE, 1.0f, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically222, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, weight22);
            Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
            String photoUrl22 = item.getCreatedBy().getPhotoUrl();
            float f822 = f2;
            float f922 = f3;
            int i1122 = i3;
            SingletonAsyncImageKt.m8175AsyncImagex1rPTaM(StringsKt.isBlank(photoUrl22) ? photoUrl22 : null, null, ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, m7774constructorimpl3), RoundedCornerShapeKt.getCircleShape()), PainterResources_androidKt.painterResource(R.drawable.default_push, startRestartGroup, 6), PainterResources_androidKt.painterResource(R.drawable.default_push, startRestartGroup, 6), null, null, null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, startRestartGroup, 48, 6, 31712);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, f), startRestartGroup, 0);
            TextKt.m2642Text4IGK_g(item.getCreatedBy().getName(), rowScopeInstance222.weight(Modifier.INSTANCE, 1.0f, false), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), j42, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 3120, 55292);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier.Companion companion222 = Modifier.INSTANCE;
            if (z6) {
            }
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(companion222, m7774constructorimpl9), startRestartGroup, 0);
            Alignment.Vertical centerVertically322 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier.Companion companion322 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy322 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically322, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, companion322);
            Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl4.getInserting()) {
            }
            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash422);
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance322 = RowScopeInstance.INSTANCE;
            int i1222 = i7;
            TextKt.m2642Text4IGK_g(String.valueOf(item.getMoneyAccept()), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), j222, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, i7), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7662getRighte0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 3 : 4)), startRestartGroup, 0);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_betcoin, startRestartGroup, i1222), StringResources_androidKt.stringResource(R.string.cd_betcoin, startRestartGroup, i1222), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f822), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 8 : 12)), startRestartGroup, 0);
            if (!item.isUserCreator()) {
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            function16 = function18;
            z8 = z5;
            function17 = function1922;
            z9 = z6;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function13 = function1;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function14 = function12;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z3 = z;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        if ((i3 & 74899) == 74898) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!z4) {
        }
        if (!z4) {
        }
        if (!z4) {
        }
        if (!z4) {
        }
        float f4222 = m7774constructorimpl4;
        if (!z4) {
        }
        long j422 = sp;
        if (!z4) {
        }
        long j2222 = sp2;
        if (!z4) {
        }
        long j3222 = sp3;
        if (!z4) {
        }
        if (!z4) {
        }
        float f5222 = m7774constructorimpl6;
        if (!z4) {
        }
        float f6222 = m7774constructorimpl7;
        if (!z4) {
        }
        float f7222 = m7774constructorimpl8;
        if (!z4) {
        }
        Shape shape222 = rectangleShape;
        Modifier clip222 = ClipKt.clip(companion, shape222);
        if (z5) {
        }
        Modifier then222 = clip222.then(m1025backgroundbw27NRU$default);
        startRestartGroup.startReplaceGroup(-1633490746);
        int i10222 = i3 & 112;
        z7 = ((i3 & 7168) != 2048) | (i10222 != 32);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z7) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit BattleMatchDetItem$lambda$1$lambda$0;
                BattleMatchDetItem$lambda$1$lambda$0 = BattleMatchDetItemKt.BattleMatchDetItem$lambda$1$lambda$0(Function1.this, item);
                return BattleMatchDetItem$lambda$1$lambda$0;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier m1059clickableXHw0xAI$default222 = ClickableKt.m1059clickableXHw0xAI$default(then222, false, null, null, (Function0) rememberedValue, 7, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap522 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier522 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default222);
        Function0<ComposeUiNode> constructor522 = ComposeUiNode.INSTANCE.getConstructor();
        Function1<? super Long, Unit> function19222 = function15;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash522);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier522, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        Modifier m1517paddingVpY3zN4222 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), m7774constructorimpl2, m7774constructorimpl);
        Alignment.Vertical centerVertically422 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical spaceBetween222 = Arrangement.INSTANCE.getSpaceBetween();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy422 = RowKt.rowMeasurePolicy(spaceBetween222, centerVertically422, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4222);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy422, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance422 = RowScopeInstance.INSTANCE;
        Alignment.Vertical centerVertically2222 = Alignment.INSTANCE.getCenterVertically();
        Modifier weight222 = rowScopeInstance422.weight(Modifier.INSTANCE, 1.0f, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight222);
        Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3222);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
        String photoUrl222 = item.getCreatedBy().getPhotoUrl();
        float f8222 = f2;
        float f9222 = f3;
        int i11222 = i3;
        SingletonAsyncImageKt.m8175AsyncImagex1rPTaM(StringsKt.isBlank(photoUrl222) ? photoUrl222 : null, null, ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, m7774constructorimpl3), RoundedCornerShapeKt.getCircleShape()), PainterResources_androidKt.painterResource(R.drawable.default_push, startRestartGroup, 6), PainterResources_androidKt.painterResource(R.drawable.default_push, startRestartGroup, 6), null, null, null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, startRestartGroup, 48, 6, 31712);
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, f), startRestartGroup, 0);
        TextKt.m2642Text4IGK_g(item.getCreatedBy().getName(), rowScopeInstance2222.weight(Modifier.INSTANCE, 1.0f, false), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), j422, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 3120, 55292);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier.Companion companion2222 = Modifier.INSTANCE;
        if (z6) {
        }
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(companion2222, m7774constructorimpl9), startRestartGroup, 0);
        Alignment.Vertical centerVertically3222 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier.Companion companion3222 = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy3222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion3222);
        Function0<ComposeUiNode> constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl4.getInserting()) {
        }
        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4222);
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance3222 = RowScopeInstance.INSTANCE;
        int i12222 = i7;
        TextKt.m2642Text4IGK_g(String.valueOf(item.getMoneyAccept()), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), j2222, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, i7), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7662getRighte0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 3 : 4)), startRestartGroup, 0);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_betcoin, startRestartGroup, i12222), StringResources_androidKt.stringResource(R.string.cd_betcoin, startRestartGroup, i12222), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f8222), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(!z6 ? 8 : 12)), startRestartGroup, 0);
        if (!item.isUserCreator()) {
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        function16 = function18;
        z8 = z5;
        function17 = function19222;
        z9 = z6;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleMatchDetItem$lambda$1$lambda$0(Function1 function1, BattleUiItem battleUiItem) {
        if (function1 != null) {
            function1.invoke(Long.valueOf(battleUiItem.getId()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleMatchDetItem$lambda$10$lambda$9$lambda$6$lambda$5(Function1 function1, BattleUiItem battleUiItem) {
        if (function1 != null) {
            function1.invoke(Long.valueOf(battleUiItem.getId()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleMatchDetItem$lambda$10$lambda$9$lambda$8$lambda$7(Function1 function1, BattleUiItem battleUiItem) {
        if (function1 != null) {
            function1.invoke(Long.valueOf(battleUiItem.getId()));
        }
        return Unit.INSTANCE;
    }

    public static final void BattleMatchDetItemPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-405656320);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-405656320, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemPreview (BattleMatchDetItem.kt:309)");
            }
            BattleUiItem battleUiItem = new BattleUiItem(288028L, 200000L, 0L, 200000L, ChallengeState.PENDING.INSTANCE, new BattleCreator(13213805L, "Sergiu Neculita", "sergiusuperdiadev@gmail.com", "https://lh3.googleusercontent.com/a/ACg8ocKejJ76iNcTCrqk77mApb-n1E7Yw5vQq7vjBOdmiRdoX6QPRxM=s96-c"), null, false, 0, 448, null);
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.ScreenBackground.INSTANCE.getColor(), null, 2, null), Dp.m7774constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BattleMatchDetItemPreview$lambda$16$lambda$13$lambda$12;
                        BattleMatchDetItemPreview$lambda$16$lambda$13$lambda$12 = BattleMatchDetItemKt.BattleMatchDetItemPreview$lambda$16$lambda$13$lambda$12(((Long) obj).longValue());
                        return BattleMatchDetItemPreview$lambda$16$lambda$13$lambda$12;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BattleMatchDetItemPreview$lambda$16$lambda$15$lambda$14;
                        BattleMatchDetItemPreview$lambda$16$lambda$15$lambda$14 = BattleMatchDetItemKt.BattleMatchDetItemPreview$lambda$16$lambda$15$lambda$14(((Long) obj).longValue());
                        return BattleMatchDetItemPreview$lambda$16$lambda$15$lambda$14;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            BattleMatchDetItem(fillMaxWidth$default, battleUiItem, function1, (Function1) rememberedValue2, false, false, startRestartGroup, 3462, 48);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BattleMatchDetItemPreview$lambda$17;
                    BattleMatchDetItemPreview$lambda$17 = BattleMatchDetItemKt.BattleMatchDetItemPreview$lambda$17(i, (Composer) obj, ((Integer) obj2).intValue());
                    return BattleMatchDetItemPreview$lambda$17;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleMatchDetItemPreview$lambda$16$lambda$13$lambda$12(long j) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleMatchDetItemPreview$lambda$16$lambda$15$lambda$14(long j) {
        return Unit.INSTANCE;
    }

    public static final void BattleMatchDetItemWithFeePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1986817326);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1986817326, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemWithFeePreview (BattleMatchDetItem.kt:345)");
            }
            BattleUiItem battleUiItem = new BattleUiItem(288030L, 3000L, 500L, 3000L, ChallengeState.ACCEPTED.INSTANCE, new BattleCreator(13213896L, "sergiuTest", "sergiutest@gmail.com", "https://betup.org/uploads_api/user/incognito.jpg"), null, false, 0, 448, null);
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.ScreenBackground.INSTANCE.getColor(), null, 2, null), Dp.m7774constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BattleMatchDetItemWithFeePreview$lambda$22$lambda$19$lambda$18;
                        BattleMatchDetItemWithFeePreview$lambda$22$lambda$19$lambda$18 = BattleMatchDetItemKt.BattleMatchDetItemWithFeePreview$lambda$22$lambda$19$lambda$18(((Long) obj).longValue());
                        return BattleMatchDetItemWithFeePreview$lambda$22$lambda$19$lambda$18;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BattleMatchDetItemWithFeePreview$lambda$22$lambda$21$lambda$20;
                        BattleMatchDetItemWithFeePreview$lambda$22$lambda$21$lambda$20 = BattleMatchDetItemKt.BattleMatchDetItemWithFeePreview$lambda$22$lambda$21$lambda$20(((Long) obj).longValue());
                        return BattleMatchDetItemWithFeePreview$lambda$22$lambda$21$lambda$20;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            BattleMatchDetItem(fillMaxWidth$default, battleUiItem, function1, (Function1) rememberedValue2, false, false, startRestartGroup, 3462, 48);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BattleMatchDetItemWithFeePreview$lambda$23;
                    BattleMatchDetItemWithFeePreview$lambda$23 = BattleMatchDetItemKt.BattleMatchDetItemWithFeePreview$lambda$23(i, (Composer) obj, ((Integer) obj2).intValue());
                    return BattleMatchDetItemWithFeePreview$lambda$23;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleMatchDetItemWithFeePreview$lambda$22$lambda$19$lambda$18(long j) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleMatchDetItemWithFeePreview$lambda$22$lambda$21$lambda$20(long j) {
        return Unit.INSTANCE;
    }

    public static final void BattleMatchDetItemLongNamePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1389623687);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1389623687, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemLongNamePreview (BattleMatchDetItem.kt:381)");
            }
            BattleUiItem battleUiItem = new BattleUiItem(288031L, 1000L, 0L, 1000L, ChallengeState.PENDING.INSTANCE, new BattleCreator(13213896L, "Very Long User Name That Might Overflow", "verylongusername@example.com", "https://betup.org/uploads_api/user/incognito.jpg"), null, false, 0, 448, null);
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.ScreenBackground.INSTANCE.getColor(), null, 2, null), Dp.m7774constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BattleMatchDetItemLongNamePreview$lambda$28$lambda$25$lambda$24;
                        BattleMatchDetItemLongNamePreview$lambda$28$lambda$25$lambda$24 = BattleMatchDetItemKt.BattleMatchDetItemLongNamePreview$lambda$28$lambda$25$lambda$24(((Long) obj).longValue());
                        return BattleMatchDetItemLongNamePreview$lambda$28$lambda$25$lambda$24;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BattleMatchDetItemLongNamePreview$lambda$28$lambda$27$lambda$26;
                        BattleMatchDetItemLongNamePreview$lambda$28$lambda$27$lambda$26 = BattleMatchDetItemKt.BattleMatchDetItemLongNamePreview$lambda$28$lambda$27$lambda$26(((Long) obj).longValue());
                        return BattleMatchDetItemLongNamePreview$lambda$28$lambda$27$lambda$26;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            BattleMatchDetItem(fillMaxWidth$default, battleUiItem, function1, (Function1) rememberedValue2, false, false, startRestartGroup, 3462, 48);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BattleMatchDetItemLongNamePreview$lambda$29;
                    BattleMatchDetItemLongNamePreview$lambda$29 = BattleMatchDetItemKt.BattleMatchDetItemLongNamePreview$lambda$29(i, (Composer) obj, ((Integer) obj2).intValue());
                    return BattleMatchDetItemLongNamePreview$lambda$29;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleMatchDetItemLongNamePreview$lambda$28$lambda$25$lambda$24(long j) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleMatchDetItemLongNamePreview$lambda$28$lambda$27$lambda$26(long j) {
        return Unit.INSTANCE;
    }

    public static final void BattleMatchDetItemOwnBattlePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(217872400);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(217872400, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemOwnBattlePreview (BattleMatchDetItem.kt:417)");
            }
            BattleUiItem battleUiItem = new BattleUiItem(288028L, 200000L, 0L, 200000L, ChallengeState.PENDING.INSTANCE, new BattleCreator(13213805L, "Sergiu Neculita", "sergiusuperdiadev@gmail.com", "https://lh3.googleusercontent.com/a/ACg8ocKejJ76iNcTCrqk77mApb-n1E7Yw5vQq7vjBOdmiRdoX6QPRxM=s96-c"), null, false, 0, 448, null);
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.ScreenBackground.INSTANCE.getColor(), null, 2, null), Dp.m7774constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BattleMatchDetItemOwnBattlePreview$lambda$34$lambda$31$lambda$30;
                        BattleMatchDetItemOwnBattlePreview$lambda$34$lambda$31$lambda$30 = BattleMatchDetItemKt.BattleMatchDetItemOwnBattlePreview$lambda$34$lambda$31$lambda$30(((Long) obj).longValue());
                        return BattleMatchDetItemOwnBattlePreview$lambda$34$lambda$31$lambda$30;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BattleMatchDetItemOwnBattlePreview$lambda$34$lambda$33$lambda$32;
                        BattleMatchDetItemOwnBattlePreview$lambda$34$lambda$33$lambda$32 = BattleMatchDetItemKt.BattleMatchDetItemOwnBattlePreview$lambda$34$lambda$33$lambda$32(((Long) obj).longValue());
                        return BattleMatchDetItemOwnBattlePreview$lambda$34$lambda$33$lambda$32;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            BattleMatchDetItem(fillMaxWidth$default, battleUiItem, function1, (Function1) rememberedValue2, false, false, startRestartGroup, 3462, 48);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BattleMatchDetItemOwnBattlePreview$lambda$35;
                    BattleMatchDetItemOwnBattlePreview$lambda$35 = BattleMatchDetItemKt.BattleMatchDetItemOwnBattlePreview$lambda$35(i, (Composer) obj, ((Integer) obj2).intValue());
                    return BattleMatchDetItemOwnBattlePreview$lambda$35;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleMatchDetItemOwnBattlePreview$lambda$34$lambda$31$lambda$30(long j) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleMatchDetItemOwnBattlePreview$lambda$34$lambda$33$lambda$32(long j) {
        return Unit.INSTANCE;
    }
}
