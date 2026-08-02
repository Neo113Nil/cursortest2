package org.betup.ui.fragment.bets.betlist.details;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import com.ironsource.InterfaceC3497ge;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.shop.CancelBetInfoModel;
import org.betup.model.remote.entity.shop.SellBetInfoModel;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.TicketDarkKt;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.UiExtensionsKt;

/* compiled from: BetListDetailPagerItem.kt */
@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0007\u001a½\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u001a\b\u0002\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u00132 \b\u0002\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00040\u001c2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\b\b\u0002\u0010\u001f\u001a\u00020\u000e2:\b\u0002\u0010 \u001a4\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00132\b\b\u0002\u0010%\u001a\u00020\u000e2\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0004\u0018\u00010'H\u0007¢\u0006\u0002\u0010)\u001ag\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u001d2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0003¢\u0006\u0002\u00104\u001a5\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u00102\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u00109\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006:²\u0006\n\u0010;\u001a\u00020<X\u008a\u0084\u0002"}, d2 = {"TicketContentBottomSpacerHeight", "Landroidx/compose/ui/unit/Dp;", "F", "BetListDetailPagerItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "item", "Lorg/betup/model/remote/api/rest/user/bets/models/BetsListModel;", "oddTye", "Lorg/betup/model/local/entity/OddType;", "onClickAddReward", "Lkotlin/Function0;", "isRewardEnabled", "", "videoRewardAmount", "", "isViewingOtherUserBets", "onMatchClick", "Lkotlin/Function2;", "", "Lorg/betup/model/remote/entity/matches/MatchState;", "cancelBetInfo", "Lorg/betup/model/remote/entity/shop/CancelBetInfoModel;", "sellBetInfo", "Lorg/betup/model/remote/entity/shop/SellBetInfoModel;", "onCancelBetClick", "onSellBetClick", "Lkotlin/Function3;", "", "onSellUnavailableClick", "isCurrentBet", "onLeagueClick", "Lkotlin/ParameterName;", "name", "leagueId", "isLive", "forShareCapture", "onTicketDarkPositioned", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "(Landroidx/compose/ui/Modifier;Lorg/betup/model/remote/api/rest/user/bets/models/BetsListModel;Lorg/betup/model/local/entity/OddType;Lkotlin/jvm/functions/Function0;ZJZLkotlin/jvm/functions/Function2;Lorg/betup/model/remote/entity/shop/CancelBetInfoModel;Lorg/betup/model/remote/entity/shop/SellBetInfoModel;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "CancelSellButtonsRow", "cancelAvailable", "sellInteractive", "sellKnownButBlocked", "cancelMoneyReturn", "sellMoneyReturn", "sellCoefficient", "onCancelClick", "onSellClick", "onSellBlockedClick", "(ZZZJJDLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "VideoRewardButton", "isEnabled", "amount", "onClick", "(ZJLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release", "scale", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetListDetailPagerItemKt {
    private static final float TicketContentBottomSpacerHeight = Dp.m7774constructorimpl(26);

    /* compiled from: BetListDetailPagerItem.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BetState.values().length];
            try {
                iArr[BetState.WON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BetState.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BetState.LOST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailPagerItem$lambda$13(Modifier modifier, BetsListModel betsListModel, OddType oddType, Function0 function0, boolean z, long j, boolean z2, Function2 function2, CancelBetInfoModel cancelBetInfoModel, SellBetInfoModel sellBetInfoModel, Function2 function22, Function3 function3, Function0 function02, boolean z3, Function2 function23, boolean z4, Function1 function1, int i, int i2, int i3, Composer composer, int i4) {
        BetListDetailPagerItem(modifier, betsListModel, oddType, function0, z, j, z2, function2, cancelBetInfoModel, sellBetInfoModel, function22, function3, function02, z3, function23, z4, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CancelSellButtonsRow$lambda$21(boolean z, boolean z2, boolean z3, long j, long j2, double d, Function0 function0, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        CancelSellButtonsRow(z, z2, z3, j, j2, d, function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoRewardButton$lambda$27(boolean z, long j, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        VideoRewardButton(z, j, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailPagerItem$lambda$1$lambda$0(int i, MatchState matchState) {
        Intrinsics.checkNotNullParameter(matchState, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailPagerItem$lambda$3$lambda$2(long j, long j2) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailPagerItem$lambda$5$lambda$4(long j, long j2, double d) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x067d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BetListDetailPagerItem(Modifier modifier, final BetsListModel item, final OddType oddTye, final Function0<Unit> onClickAddReward, boolean z, long j, boolean z2, Function2<? super Integer, ? super MatchState, Unit> function2, CancelBetInfoModel cancelBetInfoModel, SellBetInfoModel sellBetInfoModel, Function2<? super Long, ? super Long, Unit> function22, Function3<? super Long, ? super Long, ? super Double, Unit> function3, Function0<Unit> function0, boolean z3, Function2<? super Integer, ? super Boolean, Unit> function23, boolean z4, Function1<? super LayoutCoordinates, Unit> function1, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Function2<? super Integer, ? super MatchState, Unit> function24;
        SellBetInfoModel sellBetInfoModel2;
        Function2<? super Long, ? super Long, Unit> function25;
        Function3<? super Long, ? super Long, ? super Double, Unit> function32;
        Function0<Unit> function02;
        final boolean z5;
        boolean z6;
        boolean z7;
        Function2<? super Long, ? super Long, Unit> function26;
        Function3<? super Long, ? super Long, ? super Double, Unit> function33;
        int i18;
        long j2;
        int i19;
        Function0<Unit> function03;
        int i20;
        Object valueOf;
        SellBetInfoModel sellBetInfoModel3;
        boolean z8;
        Modifier.Companion verticalScroll$default;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        boolean z9;
        Object rememberedValue;
        final Function1<? super LayoutCoordinates, Unit> function12;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        final Function2<? super Integer, ? super MatchState, Unit> function27;
        final boolean z10;
        final long j3;
        final Modifier modifier2;
        final Function3<? super Long, ? super Long, ? super Double, Unit> function34;
        final Function0<Unit> function04;
        final SellBetInfoModel sellBetInfoModel4;
        final CancelBetInfoModel cancelBetInfoModel2;
        Function1<? super LayoutCoordinates, Unit> function13;
        boolean z11;
        final Function2<? super Integer, ? super Boolean, Unit> function28;
        final boolean z12;
        final Function2<? super Long, ? super Long, Unit> function29;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(oddTye, "oddTye");
        Intrinsics.checkNotNullParameter(onClickAddReward, "onClickAddReward");
        Composer startRestartGroup = composer.startRestartGroup(-1408627860);
        int i21 = i3 & 1;
        if (i21 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(item) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(oddTye.ordinal()) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(onClickAddReward) ? 2048 : 1024;
        }
        int i22 = i3 & 16;
        if (i22 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(z) ? 16384 : 8192;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= startRestartGroup.changed(j) ? 131072 : 65536;
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
            }
            i8 = i3 & 256;
            if (i8 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= startRestartGroup.changedInstance(cancelBetInfoModel) ? 67108864 : 33554432;
            }
            i9 = i3 & 512;
            if (i9 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i4 |= startRestartGroup.changedInstance(sellBetInfoModel) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
                i11 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i11 = i2 | (startRestartGroup.changedInstance(function22) ? 4 : 2);
            } else {
                i11 = i2;
            }
            i12 = i3 & 2048;
            if (i12 == 0) {
                i11 |= 48;
            } else if ((i2 & 48) == 0) {
                i11 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
            }
            int i23 = i11;
            i13 = i3 & 4096;
            if (i13 == 0) {
                i23 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i23 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
                i14 = i3 & 8192;
                if (i14 != 0) {
                    i23 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i23 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                    i15 = i3 & 16384;
                    if (i15 == 0) {
                        i23 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i23 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
                        i16 = i3 & 32768;
                        if (i16 != 0) {
                            i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i23 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                        }
                        i17 = i3 & 65536;
                        if (i17 != 0) {
                            i23 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i23 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                        }
                        if ((i4 & 306783379) == 306783378 || (599187 & i23) != 599186 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i21 != 0 ? Modifier.INSTANCE : modifier;
                            boolean z13 = i22 != 0 ? false : z;
                            long j4 = i5 != 0 ? 0L : j;
                            boolean z14 = i6 != 0 ? false : z2;
                            if (i7 != 0) {
                                startRestartGroup.startReplaceGroup(1849434622);
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new Function2() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit BetListDetailPagerItem$lambda$1$lambda$0;
                                            BetListDetailPagerItem$lambda$1$lambda$0 = BetListDetailPagerItemKt.BetListDetailPagerItem$lambda$1$lambda$0(((Integer) obj).intValue(), (MatchState) obj2);
                                            return BetListDetailPagerItem$lambda$1$lambda$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function24 = (Function2) rememberedValue2;
                                startRestartGroup.endReplaceGroup();
                            } else {
                                function24 = function2;
                            }
                            CancelBetInfoModel cancelBetInfoModel3 = i8 != 0 ? null : cancelBetInfoModel;
                            sellBetInfoModel2 = i9 != 0 ? null : sellBetInfoModel;
                            if (i10 != 0) {
                                startRestartGroup.startReplaceGroup(1849434622);
                                Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new Function2() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit BetListDetailPagerItem$lambda$3$lambda$2;
                                            BetListDetailPagerItem$lambda$3$lambda$2 = BetListDetailPagerItemKt.BetListDetailPagerItem$lambda$3$lambda$2(((Long) obj).longValue(), ((Long) obj2).longValue());
                                            return BetListDetailPagerItem$lambda$3$lambda$2;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                function25 = (Function2) rememberedValue3;
                                startRestartGroup.endReplaceGroup();
                            } else {
                                function25 = function22;
                            }
                            if (i12 != 0) {
                                startRestartGroup.startReplaceGroup(1849434622);
                                Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new Function3() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                                            Unit BetListDetailPagerItem$lambda$5$lambda$4;
                                            BetListDetailPagerItem$lambda$5$lambda$4 = BetListDetailPagerItemKt.BetListDetailPagerItem$lambda$5$lambda$4(((Long) obj).longValue(), ((Long) obj2).longValue(), ((Double) obj3).doubleValue());
                                            return BetListDetailPagerItem$lambda$5$lambda$4;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                function32 = (Function3) rememberedValue4;
                                startRestartGroup.endReplaceGroup();
                            } else {
                                function32 = function3;
                            }
                            if (i13 != 0) {
                                startRestartGroup.startReplaceGroup(1849434622);
                                Object rememberedValue5 = startRestartGroup.rememberedValue();
                                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit unit;
                                            unit = Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue5);
                                }
                                function02 = (Function0) rememberedValue5;
                                startRestartGroup.endReplaceGroup();
                            } else {
                                function02 = function0;
                            }
                            z5 = i14 != 0 ? true : z3;
                            Function2<? super Integer, ? super Boolean, Unit> function210 = i15 != 0 ? null : function23;
                            z6 = i16 != 0 ? false : z4;
                            Function1<? super LayoutCoordinates, Unit> function14 = i17 != 0 ? null : function1;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1408627860, i4, i23, "org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItem (BetListDetailPagerItem.kt:95)");
                            }
                            BetState state = item.getState();
                            Intrinsics.checkNotNullExpressionValue(state, "getState(...)");
                            final String stringResource = StringResources_androidKt.stringResource(UiExtensionsKt.getShortTitle(state), startRestartGroup, 0);
                            z7 = z13;
                            ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                            if (sellBetInfoModel2 != null) {
                                i18 = i4;
                                function26 = function25;
                                function33 = function32;
                                j2 = RangesKt.coerceAtLeast(sellBetInfoModel2.getMoneyReturn() - sellBetInfoModel2.getBetcoinPrice(), 0L);
                            } else {
                                function26 = function25;
                                function33 = function32;
                                i18 = i4;
                                j2 = 0;
                            }
                            BetState state2 = item.getState();
                            i19 = state2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state2.ordinal()];
                            if (i19 == 1) {
                                function03 = function02;
                                i20 = i18;
                                valueOf = Long.valueOf(item.getMoneyReturned());
                            } else if (i19 == 2) {
                                function03 = function02;
                                i20 = i18;
                                double moneyPlaced = item.getMoneyPlaced();
                                Double finalCoeficient = item.getFinalCoeficient();
                                Intrinsics.checkNotNullExpressionValue(finalCoeficient, "getFinalCoeficient(...)");
                                valueOf = Double.valueOf(moneyPlaced * finalCoeficient.doubleValue());
                            } else if (i19 == 3) {
                                double moneyPlaced2 = item.getMoneyPlaced();
                                i20 = i18;
                                Double finalCoeficient2 = item.getFinalCoeficient();
                                function03 = function02;
                                Intrinsics.checkNotNullExpressionValue(finalCoeficient2, "getFinalCoeficient(...)");
                                valueOf = Double.valueOf(moneyPlaced2 * finalCoeficient2.doubleValue());
                            } else {
                                valueOf = Long.valueOf(item.getMoneyPlaced());
                                function03 = function02;
                                i20 = i18;
                            }
                            boolean z15 = sellBetInfoModel2 != null;
                            boolean z16 = sellBetInfoModel2 == null && sellBetInfoModel2.isSellAvailable();
                            item.getPlacedBets().size();
                            if (z5) {
                                sellBetInfoModel3 = sellBetInfoModel2;
                                if (item.getState() == BetState.PENDING && !z14 && ((cancelBetInfoModel3 != null && cancelBetInfoModel3.isCancelAvailable()) || z15)) {
                                    z8 = true;
                                    long j5 = j2;
                                    Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(companion, null, false, 3, null);
                                    if (!z6) {
                                        verticalScroll$default = Modifier.INSTANCE;
                                    } else {
                                        verticalScroll$default = ScrollKt.verticalScroll$default(Modifier.INSTANCE, rememberScrollState, false, null, false, 14, null);
                                    }
                                    Modifier modifier3 = companion;
                                    boolean z17 = z15;
                                    Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(wrapContentSize$default.then(verticalScroll$default), Dp.m7774constructorimpl(32), 0.0f, 2, null);
                                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    boolean z18 = z16;
                                    CancelBetInfoModel cancelBetInfoModel4 = cancelBetInfoModel3;
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
                                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    startRestartGroup.startReplaceGroup(-1633490746);
                                    z9 = ((i23 & 7168) != 2048) | ((3670016 & i23) != 1048576);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!z9 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        function12 = function14;
                                        rememberedValue = new Function1() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit BetListDetailPagerItem$lambda$12$lambda$10$lambda$9;
                                                BetListDetailPagerItem$lambda$12$lambda$10$lambda$9 = BetListDetailPagerItemKt.BetListDetailPagerItem$lambda$12$lambda$10$lambda$9(z5, function12, (LayoutCoordinates) obj);
                                                return BetListDetailPagerItem$lambda$12$lambda$10$lambda$9;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    } else {
                                        function12 = function14;
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, (Function1) rememberedValue);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned);
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
                                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    boolean z19 = z6;
                                    TicketDarkKt.TicketDark(null, ComposableLambdaKt.rememberComposableLambda(1528136472, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i24) {
                                            if ((i24 & 3) == 2 && composer2.getSkipping()) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1528136472, i24, -1, "org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItem.<anonymous>.<anonymous>.<anonymous> (BetListDetailPagerItem.kt:140)");
                                            }
                                            QuickBetHeaderKt.QuickBetHeader(null, stringResource, Long.valueOf(BetsListModel.this.getId().intValue()), BetsListModel.this.getCreatedAt(), false, false, false, false, composer2, 0, 241);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1887550809, true, new BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$2(item, z19, function24, oddTye, valueOf, z14, function210), startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-2048002150, true, new BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$3(z8, z19, cancelBetInfoModel4, z18, z17, j5, sellBetInfoModel3, function26, item, function33, function03), startRestartGroup, 54), false, true, null, false, startRestartGroup, 14380464, 1);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.startReplaceGroup(212886116);
                                    if (!z6 && !z14 && (item.getState() == BetState.PENDING || item.getState() == BetState.LOST || item.getState() == BetState.WON)) {
                                        int i24 = i20 >> 12;
                                        VideoRewardButton(z7, j4, onClickAddReward, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(12), 0.0f, Dp.m7774constructorimpl(16), 5, null), startRestartGroup, (i24 & 112) | (i24 & 14) | 3072 | ((i20 >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 0);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    function27 = function24;
                                    z10 = z14;
                                    j3 = j4;
                                    modifier2 = modifier3;
                                    function34 = function33;
                                    function04 = function03;
                                    sellBetInfoModel4 = sellBetInfoModel3;
                                    cancelBetInfoModel2 = cancelBetInfoModel4;
                                    function13 = function12;
                                    z11 = z6;
                                    function28 = function210;
                                    z12 = z5;
                                    function29 = function26;
                                }
                            } else {
                                sellBetInfoModel3 = sellBetInfoModel2;
                            }
                            z8 = false;
                            long j52 = j2;
                            Modifier wrapContentSize$default2 = SizeKt.wrapContentSize$default(companion, null, false, 3, null);
                            if (!z6) {
                            }
                            Modifier modifier32 = companion;
                            boolean z172 = z15;
                            Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(wrapContentSize$default2.then(verticalScroll$default), Dp.m7774constructorimpl(32), 0.0f, 2, null);
                            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default2);
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            boolean z182 = z16;
                            CancelBetInfoModel cancelBetInfoModel42 = cancelBetInfoModel3;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl.getInserting()) {
                            }
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            startRestartGroup.startReplaceGroup(-1633490746);
                            z9 = ((i23 & 7168) != 2048) | ((3670016 & i23) != 1048576);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (z9) {
                            }
                            function12 = function14;
                            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit BetListDetailPagerItem$lambda$12$lambda$10$lambda$9;
                                    BetListDetailPagerItem$lambda$12$lambda$10$lambda$9 = BetListDetailPagerItemKt.BetListDetailPagerItem$lambda$12$lambda$10$lambda$9(z5, function12, (LayoutCoordinates) obj);
                                    return BetListDetailPagerItem$lambda$12$lambda$10$lambda$9;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            startRestartGroup.endReplaceGroup();
                            Modifier onGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion22, (Function1) rememberedValue);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned2);
                            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl2.getInserting()) {
                            }
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            boolean z192 = z6;
                            TicketDarkKt.TicketDark(null, ComposableLambdaKt.rememberComposableLambda(1528136472, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i242) {
                                    if ((i242 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1528136472, i242, -1, "org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItem.<anonymous>.<anonymous>.<anonymous> (BetListDetailPagerItem.kt:140)");
                                    }
                                    QuickBetHeaderKt.QuickBetHeader(null, stringResource, Long.valueOf(BetsListModel.this.getId().intValue()), BetsListModel.this.getCreatedAt(), false, false, false, false, composer2, 0, 241);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1887550809, true, new BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$2(item, z192, function24, oddTye, valueOf, z14, function210), startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-2048002150, true, new BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$3(z8, z192, cancelBetInfoModel42, z182, z172, j52, sellBetInfoModel3, function26, item, function33, function03), startRestartGroup, 54), false, true, null, false, startRestartGroup, 14380464, 1);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.startReplaceGroup(212886116);
                            if (!z6) {
                                int i242 = i20 >> 12;
                                VideoRewardButton(z7, j4, onClickAddReward, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(12), 0.0f, Dp.m7774constructorimpl(16), 5, null), startRestartGroup, (i242 & 112) | (i242 & 14) | 3072 | ((i20 >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 0);
                            }
                            startRestartGroup.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function27 = function24;
                            z10 = z14;
                            j3 = j4;
                            modifier2 = modifier32;
                            function34 = function33;
                            function04 = function03;
                            sellBetInfoModel4 = sellBetInfoModel3;
                            cancelBetInfoModel2 = cancelBetInfoModel42;
                            function13 = function12;
                            z11 = z6;
                            function28 = function210;
                            z12 = z5;
                            function29 = function26;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z7 = z;
                            j3 = j;
                            z10 = z2;
                            function27 = function2;
                            cancelBetInfoModel2 = cancelBetInfoModel;
                            sellBetInfoModel4 = sellBetInfoModel;
                            function29 = function22;
                            function34 = function3;
                            function04 = function0;
                            z12 = z3;
                            function28 = function23;
                            z11 = z4;
                            function13 = function1;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final boolean z20 = z7;
                            final boolean z21 = z11;
                            final Function1<? super LayoutCoordinates, Unit> function15 = function13;
                            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit BetListDetailPagerItem$lambda$13;
                                    BetListDetailPagerItem$lambda$13 = BetListDetailPagerItemKt.BetListDetailPagerItem$lambda$13(Modifier.this, item, oddTye, onClickAddReward, z20, j3, z10, function27, cancelBetInfoModel2, sellBetInfoModel4, function29, function34, function04, z12, function28, z21, function15, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return BetListDetailPagerItem$lambda$13;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i16 = i3 & 32768;
                    if (i16 != 0) {
                    }
                    i17 = i3 & 65536;
                    if (i17 != 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    if (i21 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    BetState state3 = item.getState();
                    Intrinsics.checkNotNullExpressionValue(state3, "getState(...)");
                    final String stringResource2 = StringResources_androidKt.stringResource(UiExtensionsKt.getShortTitle(state3), startRestartGroup, 0);
                    z7 = z13;
                    ScrollState rememberScrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                    if (sellBetInfoModel2 != null) {
                    }
                    BetState state22 = item.getState();
                    if (state22 == null) {
                    }
                    if (i19 == 1) {
                    }
                    if (sellBetInfoModel2 != null) {
                    }
                    if (sellBetInfoModel2 == null) {
                    }
                    item.getPlacedBets().size();
                    if (z5) {
                    }
                    z8 = false;
                    long j522 = j2;
                    Modifier wrapContentSize$default22 = SizeKt.wrapContentSize$default(companion, null, false, 3, null);
                    if (!z6) {
                    }
                    Modifier modifier322 = companion;
                    boolean z1722 = z15;
                    Modifier m1518paddingVpY3zN4$default22 = PaddingKt.m1518paddingVpY3zN4$default(wrapContentSize$default22.then(verticalScroll$default), Dp.m7774constructorimpl(32), 0.0f, 2, null);
                    Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default22);
                    Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                    boolean z1822 = z16;
                    CancelBetInfoModel cancelBetInfoModel422 = cancelBetInfoModel3;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                    Modifier.Companion companion222 = Modifier.INSTANCE;
                    startRestartGroup.startReplaceGroup(-1633490746);
                    z9 = ((i23 & 7168) != 2048) | ((3670016 & i23) != 1048576);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (z9) {
                    }
                    function12 = function14;
                    rememberedValue = new Function1() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit BetListDetailPagerItem$lambda$12$lambda$10$lambda$9;
                            BetListDetailPagerItem$lambda$12$lambda$10$lambda$9 = BetListDetailPagerItemKt.BetListDetailPagerItem$lambda$12$lambda$10$lambda$9(z5, function12, (LayoutCoordinates) obj);
                            return BetListDetailPagerItem$lambda$12$lambda$10$lambda$9;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    Modifier onGloballyPositioned22 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion222, (Function1) rememberedValue);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned22);
                    Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting()) {
                    }
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                    boolean z1922 = z6;
                    TicketDarkKt.TicketDark(null, ComposableLambdaKt.rememberComposableLambda(1528136472, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2422) {
                            if ((i2422 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1528136472, i2422, -1, "org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItem.<anonymous>.<anonymous>.<anonymous> (BetListDetailPagerItem.kt:140)");
                            }
                            QuickBetHeaderKt.QuickBetHeader(null, stringResource2, Long.valueOf(BetsListModel.this.getId().intValue()), BetsListModel.this.getCreatedAt(), false, false, false, false, composer2, 0, 241);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1887550809, true, new BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$2(item, z1922, function24, oddTye, valueOf, z14, function210), startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-2048002150, true, new BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$3(z8, z1922, cancelBetInfoModel422, z1822, z1722, j522, sellBetInfoModel3, function26, item, function33, function03), startRestartGroup, 54), false, true, null, false, startRestartGroup, 14380464, 1);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.startReplaceGroup(212886116);
                    if (!z6) {
                    }
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function27 = function24;
                    z10 = z14;
                    j3 = j4;
                    modifier2 = modifier322;
                    function34 = function33;
                    function04 = function03;
                    sellBetInfoModel4 = sellBetInfoModel3;
                    cancelBetInfoModel2 = cancelBetInfoModel422;
                    function13 = function12;
                    z11 = z6;
                    function28 = function210;
                    z12 = z5;
                    function29 = function26;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i15 = i3 & 16384;
                if (i15 == 0) {
                }
                i16 = i3 & 32768;
                if (i16 != 0) {
                }
                i17 = i3 & 65536;
                if (i17 != 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                if (i21 != 0) {
                }
                if (i22 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BetState state32 = item.getState();
                Intrinsics.checkNotNullExpressionValue(state32, "getState(...)");
                final String stringResource22 = StringResources_androidKt.stringResource(UiExtensionsKt.getShortTitle(state32), startRestartGroup, 0);
                z7 = z13;
                ScrollState rememberScrollState22 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                if (sellBetInfoModel2 != null) {
                }
                BetState state222 = item.getState();
                if (state222 == null) {
                }
                if (i19 == 1) {
                }
                if (sellBetInfoModel2 != null) {
                }
                if (sellBetInfoModel2 == null) {
                }
                item.getPlacedBets().size();
                if (z5) {
                }
                z8 = false;
                long j5222 = j2;
                Modifier wrapContentSize$default222 = SizeKt.wrapContentSize$default(companion, null, false, 3, null);
                if (!z6) {
                }
                Modifier modifier3222 = companion;
                boolean z17222 = z15;
                Modifier m1518paddingVpY3zN4$default222 = PaddingKt.m1518paddingVpY3zN4$default(wrapContentSize$default222.then(verticalScroll$default), Dp.m7774constructorimpl(32), 0.0f, 2, null);
                Alignment.Horizontal centerHorizontally222 = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally222, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default222);
                Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                boolean z18222 = z16;
                CancelBetInfoModel cancelBetInfoModel4222 = cancelBetInfoModel3;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                Modifier.Companion companion2222 = Modifier.INSTANCE;
                startRestartGroup.startReplaceGroup(-1633490746);
                z9 = ((i23 & 7168) != 2048) | ((3670016 & i23) != 1048576);
                rememberedValue = startRestartGroup.rememberedValue();
                if (z9) {
                }
                function12 = function14;
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BetListDetailPagerItem$lambda$12$lambda$10$lambda$9;
                        BetListDetailPagerItem$lambda$12$lambda$10$lambda$9 = BetListDetailPagerItemKt.BetListDetailPagerItem$lambda$12$lambda$10$lambda$9(z5, function12, (LayoutCoordinates) obj);
                        return BetListDetailPagerItem$lambda$12$lambda$10$lambda$9;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                Modifier onGloballyPositioned222 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2222, (Function1) rememberedValue);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned222);
                Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                boolean z19222 = z6;
                TicketDarkKt.TicketDark(null, ComposableLambdaKt.rememberComposableLambda(1528136472, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2422) {
                        if ((i2422 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1528136472, i2422, -1, "org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItem.<anonymous>.<anonymous>.<anonymous> (BetListDetailPagerItem.kt:140)");
                        }
                        QuickBetHeaderKt.QuickBetHeader(null, stringResource22, Long.valueOf(BetsListModel.this.getId().intValue()), BetsListModel.this.getCreatedAt(), false, false, false, false, composer2, 0, 241);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1887550809, true, new BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$2(item, z19222, function24, oddTye, valueOf, z14, function210), startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-2048002150, true, new BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$3(z8, z19222, cancelBetInfoModel4222, z18222, z17222, j5222, sellBetInfoModel3, function26, item, function33, function03), startRestartGroup, 54), false, true, null, false, startRestartGroup, 14380464, 1);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.startReplaceGroup(212886116);
                if (!z6) {
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                function27 = function24;
                z10 = z14;
                j3 = j4;
                modifier2 = modifier3222;
                function34 = function33;
                function04 = function03;
                sellBetInfoModel4 = sellBetInfoModel3;
                cancelBetInfoModel2 = cancelBetInfoModel4222;
                function13 = function12;
                z11 = z6;
                function28 = function210;
                z12 = z5;
                function29 = function26;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i14 = i3 & 8192;
            if (i14 != 0) {
            }
            i15 = i3 & 16384;
            if (i15 == 0) {
            }
            i16 = i3 & 32768;
            if (i16 != 0) {
            }
            i17 = i3 & 65536;
            if (i17 != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            if (i21 != 0) {
            }
            if (i22 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BetState state322 = item.getState();
            Intrinsics.checkNotNullExpressionValue(state322, "getState(...)");
            final String stringResource222 = StringResources_androidKt.stringResource(UiExtensionsKt.getShortTitle(state322), startRestartGroup, 0);
            z7 = z13;
            ScrollState rememberScrollState222 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
            if (sellBetInfoModel2 != null) {
            }
            BetState state2222 = item.getState();
            if (state2222 == null) {
            }
            if (i19 == 1) {
            }
            if (sellBetInfoModel2 != null) {
            }
            if (sellBetInfoModel2 == null) {
            }
            item.getPlacedBets().size();
            if (z5) {
            }
            z8 = false;
            long j52222 = j2;
            Modifier wrapContentSize$default2222 = SizeKt.wrapContentSize$default(companion, null, false, 3, null);
            if (!z6) {
            }
            Modifier modifier32222 = companion;
            boolean z172222 = z15;
            Modifier m1518paddingVpY3zN4$default2222 = PaddingKt.m1518paddingVpY3zN4$default(wrapContentSize$default2222.then(verticalScroll$default), Dp.m7774constructorimpl(32), 0.0f, 2, null);
            Alignment.Horizontal centerHorizontally2222 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2222, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default2222);
            Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
            boolean z182222 = z16;
            CancelBetInfoModel cancelBetInfoModel42222 = cancelBetInfoModel3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion22222 = Modifier.INSTANCE;
            startRestartGroup.startReplaceGroup(-1633490746);
            z9 = ((i23 & 7168) != 2048) | ((3670016 & i23) != 1048576);
            rememberedValue = startRestartGroup.rememberedValue();
            if (z9) {
            }
            function12 = function14;
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit BetListDetailPagerItem$lambda$12$lambda$10$lambda$9;
                    BetListDetailPagerItem$lambda$12$lambda$10$lambda$9 = BetListDetailPagerItemKt.BetListDetailPagerItem$lambda$12$lambda$10$lambda$9(z5, function12, (LayoutCoordinates) obj);
                    return BetListDetailPagerItem$lambda$12$lambda$10$lambda$9;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier onGloballyPositioned2222 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion22222, (Function1) rememberedValue);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned2222);
            Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
            boolean z192222 = z6;
            TicketDarkKt.TicketDark(null, ComposableLambdaKt.rememberComposableLambda(1528136472, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2422) {
                    if ((i2422 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1528136472, i2422, -1, "org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItem.<anonymous>.<anonymous>.<anonymous> (BetListDetailPagerItem.kt:140)");
                    }
                    QuickBetHeaderKt.QuickBetHeader(null, stringResource222, Long.valueOf(BetsListModel.this.getId().intValue()), BetsListModel.this.getCreatedAt(), false, false, false, false, composer2, 0, 241);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1887550809, true, new BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$2(item, z192222, function24, oddTye, valueOf, z14, function210), startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-2048002150, true, new BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$3(z8, z192222, cancelBetInfoModel42222, z182222, z172222, j52222, sellBetInfoModel3, function26, item, function33, function03), startRestartGroup, 54), false, true, null, false, startRestartGroup, 14380464, 1);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(212886116);
            if (!z6) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            function27 = function24;
            z10 = z14;
            j3 = j4;
            modifier2 = modifier32222;
            function34 = function33;
            function04 = function03;
            sellBetInfoModel4 = sellBetInfoModel3;
            cancelBetInfoModel2 = cancelBetInfoModel42222;
            function13 = function12;
            z11 = z6;
            function28 = function210;
            z12 = z5;
            function29 = function26;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        i12 = i3 & 2048;
        if (i12 == 0) {
        }
        int i232 = i11;
        i13 = i3 & 4096;
        if (i13 == 0) {
        }
        i14 = i3 & 8192;
        if (i14 != 0) {
        }
        i15 = i3 & 16384;
        if (i15 == 0) {
        }
        i16 = i3 & 32768;
        if (i16 != 0) {
        }
        i17 = i3 & 65536;
        if (i17 != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        if (i21 != 0) {
        }
        if (i22 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        BetState state3222 = item.getState();
        Intrinsics.checkNotNullExpressionValue(state3222, "getState(...)");
        final String stringResource2222 = StringResources_androidKt.stringResource(UiExtensionsKt.getShortTitle(state3222), startRestartGroup, 0);
        z7 = z13;
        ScrollState rememberScrollState2222 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
        if (sellBetInfoModel2 != null) {
        }
        BetState state22222 = item.getState();
        if (state22222 == null) {
        }
        if (i19 == 1) {
        }
        if (sellBetInfoModel2 != null) {
        }
        if (sellBetInfoModel2 == null) {
        }
        item.getPlacedBets().size();
        if (z5) {
        }
        z8 = false;
        long j522222 = j2;
        Modifier wrapContentSize$default22222 = SizeKt.wrapContentSize$default(companion, null, false, 3, null);
        if (!z6) {
        }
        Modifier modifier322222 = companion;
        boolean z1722222 = z15;
        Modifier m1518paddingVpY3zN4$default22222 = PaddingKt.m1518paddingVpY3zN4$default(wrapContentSize$default22222.then(verticalScroll$default), Dp.m7774constructorimpl(32), 0.0f, 2, null);
        Alignment.Horizontal centerHorizontally22222 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default22222);
        Function0<ComposeUiNode> constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
        boolean z1822222 = z16;
        CancelBetInfoModel cancelBetInfoModel422222 = cancelBetInfoModel3;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier32222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
        Modifier.Companion companion222222 = Modifier.INSTANCE;
        startRestartGroup.startReplaceGroup(-1633490746);
        z9 = ((i232 & 7168) != 2048) | ((3670016 & i232) != 1048576);
        rememberedValue = startRestartGroup.rememberedValue();
        if (z9) {
        }
        function12 = function14;
        rememberedValue = new Function1() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit BetListDetailPagerItem$lambda$12$lambda$10$lambda$9;
                BetListDetailPagerItem$lambda$12$lambda$10$lambda$9 = BetListDetailPagerItemKt.BetListDetailPagerItem$lambda$12$lambda$10$lambda$9(z5, function12, (LayoutCoordinates) obj);
                return BetListDetailPagerItem$lambda$12$lambda$10$lambda$9;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier onGloballyPositioned22222 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion222222, (Function1) rememberedValue);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned22222);
        Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
        boolean z1922222 = z6;
        TicketDarkKt.TicketDark(null, ComposableLambdaKt.rememberComposableLambda(1528136472, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2422) {
                if ((i2422 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1528136472, i2422, -1, "org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItem.<anonymous>.<anonymous>.<anonymous> (BetListDetailPagerItem.kt:140)");
                }
                QuickBetHeaderKt.QuickBetHeader(null, stringResource2222, Long.valueOf(BetsListModel.this.getId().intValue()), BetsListModel.this.getCreatedAt(), false, false, false, false, composer2, 0, 241);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1887550809, true, new BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$2(item, z1922222, function24, oddTye, valueOf, z14, function210), startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-2048002150, true, new BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$3(z8, z1922222, cancelBetInfoModel422222, z1822222, z1722222, j522222, sellBetInfoModel3, function26, item, function33, function03), startRestartGroup, 54), false, true, null, false, startRestartGroup, 14380464, 1);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(212886116);
        if (!z6) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        function27 = function24;
        z10 = z14;
        j3 = j4;
        modifier2 = modifier322222;
        function34 = function33;
        function04 = function03;
        sellBetInfoModel4 = sellBetInfoModel3;
        cancelBetInfoModel2 = cancelBetInfoModel422222;
        function13 = function12;
        z11 = z6;
        function28 = function210;
        z12 = z5;
        function29 = function26;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailPagerItem$lambda$12$lambda$10$lambda$9(boolean z, Function1 function1, LayoutCoordinates coords) {
        Intrinsics.checkNotNullParameter(coords, "coords");
        if (z && function1 != null) {
            function1.invoke(coords);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CancelSellButtonsRow(final boolean z, final boolean z2, final boolean z3, final long j, final long j2, final double d, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, Composer composer, final int i) {
        int i2;
        String str;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1040106177);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changed(z3) ? 256 : 128;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 67108864 : 33554432;
        }
        if ((38273171 & i2) != 38273170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1040106177, i2, -1, "org.betup.ui.fragment.bets.betlist.details.CancelSellButtonsRow (BetListDetailPagerItem.kt:442)");
            }
            float f = 12;
            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), 0.0f, 2, null), 0.0f, Dp.m7774constructorimpl(2), 0.0f, Dp.m7774constructorimpl(6), 5, null);
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default);
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
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-1365775945);
            if (z) {
                str = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                i3 = -1323940314;
                CommonButtonKt.m12915CommonButtonUPEs2M4(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), false, StringResources_androidKt.stringResource(R.string.cancel_bet, startRestartGroup, 6), false, false, false, function0, false, false, false, false, false, null, null, false, false, null, null, null, null, null, startRestartGroup, i2 & 3670016, 0, 0, 2097082);
            } else {
                str = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                i3 = -1323940314;
            }
            startRestartGroup.endReplaceGroup();
            if (z2 && !z) {
                startRestartGroup.startReplaceGroup(610877796);
                CommonButtonKt.m12915CommonButtonUPEs2M4(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), false, StringResources_androidKt.stringResource(R.string.sell_bet, startRestartGroup, 6), false, false, false, function02, false, false, false, false, false, null, null, false, false, null, null, null, null, null, startRestartGroup, (i2 >> 3) & 3670016, 0, 0, 2097082);
                startRestartGroup.endReplaceGroup();
            } else if (z3 && !z) {
                startRestartGroup.startReplaceGroup(611129516);
                Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, i3, str);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                String stringResource = StringResources_androidKt.stringResource(R.string.sell_bet, startRestartGroup, 6);
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit unit;
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                CommonButtonKt.m12915CommonButtonUPEs2M4(fillMaxWidth$default, false, stringResource, false, false, false, (Function0) rememberedValue, false, false, false, false, false, null, null, false, false, null, null, null, null, null, startRestartGroup, 1769526, 0, 0, 2097048);
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(5004770);
                boolean z4 = (234881024 & i2) == 67108864;
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit CancelSellButtonsRow$lambda$20$lambda$19$lambda$18$lambda$17;
                            CancelSellButtonsRow$lambda$20$lambda$19$lambda$18$lambda$17 = BetListDetailPagerItemKt.CancelSellButtonsRow$lambda$20$lambda$19$lambda$18$lambda$17(Function0.this);
                            return CancelSellButtonsRow$lambda$20$lambda$19$lambda$18$lambda$17;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceGroup();
                BoxKt.Box(ClickableKt.m1057clickableO2vRcR0$default(fillMaxSize$default, mutableInteractionSource, null, false, null, null, (Function0) rememberedValue3, 28, null), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(611801255);
                startRestartGroup.endReplaceGroup();
            }
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CancelSellButtonsRow$lambda$21;
                    CancelSellButtonsRow$lambda$21 = BetListDetailPagerItemKt.CancelSellButtonsRow$lambda$21(z, z2, z3, j, j2, d, function0, function02, function03, i, (Composer) obj, ((Integer) obj2).intValue());
                    return CancelSellButtonsRow$lambda$21;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CancelSellButtonsRow$lambda$20$lambda$19$lambda$18$lambda$17(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void VideoRewardButton(final boolean z, final long j, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        String str;
        String str2;
        final Modifier modifier3;
        Modifier.Companion companion;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        int currentCompositeKeyHash4;
        Composer m4610constructorimpl4;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1562471928);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1562471928, i3, -1, "org.betup.ui.fragment.bets.betlist.details.VideoRewardButton (BetListDetailPagerItem.kt:497)");
                }
                Modifier modifier5 = modifier4;
                State<Float> animateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("pulse_animation", startRestartGroup, 6, 0), 1.0f, !z ? 1.05f : 1.0f, AnimationSpecKt.m925infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(InterfaceC3497ge.c.d, 0, null, 4, null), RepeatMode.Reverse, 0L, 4, null), "scale_animation", startRestartGroup, InfiniteTransition.$stable | 24624 | (InfiniteRepeatableSpec.$stable << 9), 0);
                Brush brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGrayBackground.INSTANCE.getBrush();
                if (!z) {
                    j2 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                } else {
                    j2 = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                }
                long j3 = j2;
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier5);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                float f = 100;
                Modifier m1038borderziNgDLE = BorderKt.m1038borderziNgDLE(BackgroundKt.background$default(AlphaKt.alpha(ScaleKt.scale(Modifier.INSTANCE, !z ? VideoRewardButton$lambda$22(animateFloat) : 1.0f), !z ? 1.0f : 0.5f), brush, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)), 0.0f, 4, null), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)));
                startRestartGroup.startReplaceGroup(-2013847527);
                if (!z) {
                    int i5 = ((i3 >> 3) & 112) | 199686;
                    str = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                    str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                    modifier3 = modifier5;
                    companion = ClickAnimationModifierKt.subtleClickAnimation(Modifier.INSTANCE, function0, null, true, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, i5, 0, 1002);
                } else {
                    str = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                    str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                    modifier3 = modifier5;
                    companion = Modifier.INSTANCE;
                }
                startRestartGroup.endReplaceGroup();
                Modifier then = m1038borderziNgDLE.then(companion);
                float f2 = 12;
                float f3 = 6;
                Modifier m1519paddingqDBjuR0 = PaddingKt.m1519paddingqDBjuR0(then, Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f3));
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f2));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, centerVertically, startRestartGroup, 54);
                String str3 = str;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str3);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR0);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                String str4 = str2;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str4);
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
                Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center2, centerHorizontally, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str3);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str4);
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
                Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.ad_reward, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j3, TextUnitKt.getSp(16), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42, centerVertically2, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str3);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str4);
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
                Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                TextKt.m2642Text4IGK_g(j <= 0 ? "+" + j : "+0", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j3, TextUnitKt.getSp(16), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_betcoin, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(18)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
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
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ad_video_rew, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_video_reward, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(55)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
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
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit VideoRewardButton$lambda$27;
                        VideoRewardButton$lambda$27 = BetListDetailPagerItemKt.VideoRewardButton$lambda$27(z, j, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return VideoRewardButton$lambda$27;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier modifier52 = modifier4;
        State<Float> animateFloat2 = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("pulse_animation", startRestartGroup, 6, 0), 1.0f, !z ? 1.05f : 1.0f, AnimationSpecKt.m925infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(InterfaceC3497ge.c.d, 0, null, 4, null), RepeatMode.Reverse, 0L, 4, null), "scale_animation", startRestartGroup, InfiniteTransition.$stable | 24624 | (InfiniteRepeatableSpec.$stable << 9), 0);
        Brush brush2 = ComposeUtils.AppBrushPalette.ButtonBackgroundGrayBackground.INSTANCE.getBrush();
        if (!z) {
        }
        long j32 = j2;
        Alignment center3 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier52);
        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
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
        float f4 = 100;
        Modifier m1038borderziNgDLE2 = BorderKt.m1038borderziNgDLE(BackgroundKt.background$default(AlphaKt.alpha(ScaleKt.scale(Modifier.INSTANCE, !z ? VideoRewardButton$lambda$22(animateFloat2) : 1.0f), !z ? 1.0f : 0.5f), brush2, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f4)), 0.0f, 4, null), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f4)));
        startRestartGroup.startReplaceGroup(-2013847527);
        if (!z) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier then2 = m1038borderziNgDLE2.then(companion);
        float f22 = 12;
        float f32 = 6;
        Modifier m1519paddingqDBjuR02 = PaddingKt.m1519paddingqDBjuR0(then2, Dp.m7774constructorimpl(f22), Dp.m7774constructorimpl(f32), Dp.m7774constructorimpl(f32), Dp.m7774constructorimpl(f32));
        Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_43 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f22));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_43, centerVertically3, startRestartGroup, 54);
        String str32 = str;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str32);
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR02);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        String str42 = str2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str42);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
        Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null);
        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
        Arrangement.HorizontalOrVertical center22 = Arrangement.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center22, centerHorizontally2, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str32);
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default2);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str42);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.ad_reward, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j32, TextUnitKt.getSp(16), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_422 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier.Companion companion22 = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_422, centerVertically22, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str32);
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
        Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str42);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl4.getInserting()) {
        }
        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42);
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
        TextKt.m2642Text4IGK_g(j <= 0 ? "+" + j : "+0", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j32, TextUnitKt.getSp(16), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_betcoin, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(18)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
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
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ad_video_rew, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_video_reward, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(55)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
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
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final float VideoRewardButton$lambda$22(State<Float> state) {
        return state.getValue().floatValue();
    }
}
