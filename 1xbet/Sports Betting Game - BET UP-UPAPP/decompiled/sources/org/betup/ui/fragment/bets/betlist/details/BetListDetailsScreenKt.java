package org.betup.ui.fragment.bets.betlist.details;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.Window;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.fragment.app.FragmentActivity;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.shop.CancelBetInfoModel;
import org.betup.model.remote.entity.shop.SellBetInfoModel;
import org.betup.model.remote.entity.user.details.UserDetailsDataModel;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.common.compose.HapticFeedbackEffectKt;
import org.betup.ui.common.compose.HapticFeedbackType;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.common.compose.PagerStateNoSaveKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.BetTicketShareBitmapRenderer;
import org.betup.utils.SnackbarHelper;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: BetListDetailsScreen.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a÷\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\t2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00142\u001a\b\u0002\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u00182\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00122\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\t2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\t2\u001a\b\u0002\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00182 \b\u0002\u0010 \u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00050!2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0012\b\u0002\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010\r2(\b\u0002\u0010&\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020\u00050\u0012\u0012\u0004\u0012\u00020\u00050\u0018H\u0007¢\u0006\u0002\u0010(\u001a\r\u0010)\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010*\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006+²\u0006\u0010\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u008a\u0084\u0002²\u0006\n\u0010-\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\f\u0010/\u001a\u0004\u0018\u000100X\u008a\u008e\u0002²\u0006\n\u00101\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u00102\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\n\u00103\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\f\u00104\u001a\u0004\u0018\u000105X\u008a\u0084\u0002²\u0006\f\u00106\u001a\u0004\u0018\u00010\u0001X\u008a\u0084\u0002²\u0006\f\u00107\u001a\u0004\u0018\u00010\u0001X\u008a\u0084\u0002²\u0006\f\u00108\u001a\u0004\u0018\u00010\u001cX\u008a\u0084\u0002²\u0006\f\u00109\u001a\u0004\u0018\u00010\u001eX\u008a\u0084\u0002"}, d2 = {"MAX_PLACED_BETS_FOR_TICKET_SHARE", "", "SHARE_SINGLE_LEG_LAYOUT_WAIT_MS", "", "BetListDetailsScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "itemsFlow", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lorg/betup/model/remote/api/rest/user/bets/models/BetsListModel;", "onDismiss", "Lkotlin/Function0;", "selectedItemId", "oddTyeFlow", "Lorg/betup/model/local/entity/OddType;", "onClickAddReward", "Lkotlin/Function1;", "isRewardAddButtonEnabledFlow", "", "videoRewardAmountFlow", "isViewingOtherUserBets", "onMatchClick", "Lkotlin/Function2;", "Lorg/betup/model/remote/entity/matches/MatchState;", "onPageChanged", "cancelBetInfoFlow", "Lorg/betup/model/remote/entity/shop/CancelBetInfoModel;", "sellBetInfoFlow", "Lorg/betup/model/remote/entity/shop/SellBetInfoModel;", "onCancelBetClick", "onSellBetClick", "Lkotlin/Function3;", "", "onSellUnavailableClick", "sharePixelCopyWindow", "Landroid/view/Window;", "requestBetShareInstallLink", "", "(Landroidx/compose/ui/Modifier;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;ILkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "BetListDetailsScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_release", "items", "forShareCapture", "isShareLoading", "shareChooserState", "Lorg/betup/ui/fragment/bets/betlist/details/BetShareChooserState;", "oddTye", "isRewardAddButtonEnabled", "videoRewardAmount", "composition", "Lcom/airbnb/lottie/LottieComposition;", "firstVisible", "lastVisible", "cancelBetInfo", "sellBetInfo"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetListDetailsScreenKt {
    private static final int MAX_PLACED_BETS_FOR_TICKET_SHARE = 3;
    private static final long SHARE_SINGLE_LEG_LAYOUT_WAIT_MS = 96;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailsScreen$lambda$32(Modifier modifier, StateFlow stateFlow, Function0 function0, int i, StateFlow stateFlow2, Function1 function1, StateFlow stateFlow3, StateFlow stateFlow4, boolean z, Function2 function2, Function1 function12, StateFlow stateFlow5, StateFlow stateFlow6, Function2 function22, Function3 function3, Function0 function02, Function0 function03, Function2 function23, int i2, int i3, int i4, Composer composer, int i5) {
        BetListDetailsScreen(modifier, stateFlow, function0, i, stateFlow2, function1, stateFlow3, stateFlow4, z, function2, function12, stateFlow5, stateFlow6, function22, function3, function02, function03, function23, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailsScreen$lambda$86(Modifier modifier, StateFlow stateFlow, Function0 function0, int i, StateFlow stateFlow2, Function1 function1, StateFlow stateFlow3, StateFlow stateFlow4, boolean z, Function2 function2, Function1 function12, StateFlow stateFlow5, StateFlow stateFlow6, Function2 function22, Function3 function3, Function0 function02, Function0 function03, Function2 function23, int i2, int i3, int i4, Composer composer, int i5) {
        BetListDetailsScreen(modifier, stateFlow, function0, i, stateFlow2, function1, stateFlow3, stateFlow4, z, function2, function12, stateFlow5, stateFlow6, function22, function3, function02, function03, function23, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailsScreenPreview$lambda$88(int i, Composer composer, int i2) {
        BetListDetailsScreenPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailsScreen$lambda$3$lambda$2(int i) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailsScreen$lambda$5$lambda$4(int i, MatchState matchState) {
        Intrinsics.checkNotNullParameter(matchState, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailsScreen$lambda$7$lambda$6(int i) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailsScreen$lambda$9$lambda$8(long j, long j2) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailsScreen$lambda$11$lambda$10(long j, long j2, double d) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailsScreen$lambda$15$lambda$14(long j, Function1 cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        cb.invoke(null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BetListDetailsScreen(Modifier modifier, final StateFlow<? extends List<? extends BetsListModel>> itemsFlow, Function0<Unit> function0, int i, StateFlow<? extends OddType> stateFlow, Function1<? super Integer, Unit> function1, StateFlow<Boolean> stateFlow2, StateFlow<Long> stateFlow3, boolean z, Function2<? super Integer, ? super MatchState, Unit> function2, Function1<? super Integer, Unit> function12, StateFlow<? extends CancelBetInfoModel> stateFlow4, StateFlow<? extends SellBetInfoModel> stateFlow5, Function2<? super Long, ? super Long, Unit> function22, Function3<? super Long, ? super Long, ? super Double, Unit> function3, Function0<Unit> function02, Function0<? extends Window> function03, Function2<? super Long, ? super Function1<? super String, Unit>, Unit> function23, Composer composer, final int i2, final int i3, final int i4) {
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
        Function0<Unit> function04;
        MutableStateFlow mutableStateFlow;
        Function1<? super Integer, Unit> function13;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        StateFlow<Long> stateFlow6;
        Function2<? super Integer, ? super MatchState, Unit> function24;
        Function1<? super Integer, Unit> function14;
        Object obj;
        MutableStateFlow mutableStateFlow4;
        MutableStateFlow mutableStateFlow5;
        Function2<? super Long, ? super Long, Unit> function25;
        Function3<? super Long, ? super Long, ? super Double, Unit> function32;
        StateFlow<? extends SellBetInfoModel> stateFlow7;
        Function0<Unit> function05;
        final Modifier modifier2;
        Function2<? super Integer, ? super MatchState, Unit> function26;
        Function0<Unit> function06;
        boolean z2;
        Function2<? super Long, ? super Function1<? super String, Unit>, Unit> function27;
        Function1<? super Integer, Unit> function15;
        Function2<? super Long, ? super Long, Unit> function28;
        Function3<? super Long, ? super Long, ? super Double, Unit> function33;
        Function0<? extends Window> function07;
        Function1<? super Integer, Unit> function16;
        StateFlow<Boolean> stateFlow8;
        StateFlow<? extends SellBetInfoModel> stateFlow9;
        final Function0<Unit> function08;
        int i17;
        int i18;
        StateFlow<? extends CancelBetInfoModel> stateFlow10;
        StateFlow<Long> stateFlow11;
        final State collectAsState;
        Object rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        StateFlow<? extends SellBetInfoModel> stateFlow12;
        Object rememberedValue4;
        int i19;
        SnapshotMutationPolicy snapshotMutationPolicy;
        Object rememberedValue5;
        StateFlow<Boolean> stateFlow13;
        Density density;
        LottieCompositionResult lottieCompositionResult;
        String str;
        String str2;
        String str3;
        Context context;
        Modifier modifier3;
        String str4;
        final MutableState mutableState;
        CoroutineScope coroutineScope;
        BetTicketShareLayoutAnchor betTicketShareLayoutAnchor;
        LazyListState lazyListState;
        int i20;
        Context context2;
        int i21;
        Function0<Unit> function09;
        State state;
        State state2;
        StateFlow<? extends CancelBetInfoModel> stateFlow14;
        String str5;
        int i22;
        int i23;
        int i24;
        int i25;
        String str6;
        String str7;
        Animatable animatable;
        State state3;
        PagerState pagerState;
        int i26;
        State state4;
        MutableState mutableState2;
        Animatable animatable2;
        StateFlow<? extends OddType> stateFlow15;
        StateFlow<Long> stateFlow16;
        float f;
        Modifier.Companion companion;
        BoxScopeInstance boxScopeInstance;
        String str8;
        float f2;
        String str9;
        String str10;
        final int i27;
        StateFlow<? extends CancelBetInfoModel> stateFlow17;
        ColumnScopeInstance columnScopeInstance;
        float f3;
        final State state5;
        final BetTicketShareLayoutAnchor betTicketShareLayoutAnchor2;
        final State state6;
        final Function0<Unit> function010;
        final StateFlow<? extends CancelBetInfoModel> stateFlow18;
        final StateFlow<? extends SellBetInfoModel> stateFlow19;
        final Function0<Unit> function011;
        final Function1<? super Integer, Unit> function17;
        final boolean z3;
        final Function2<? super Integer, ? super MatchState, Unit> function29;
        final Function1<? super Integer, Unit> function18;
        final Function2<? super Long, ? super Long, Unit> function210;
        final Function3<? super Long, ? super Long, ? super Double, Unit> function34;
        final Function0<Unit> function012;
        final Function0<? extends Window> function013;
        final Function2<? super Long, ? super Function1<? super String, Unit>, Unit> function211;
        final int i28;
        final StateFlow<Long> stateFlow20;
        final StateFlow<Boolean> stateFlow21;
        final Modifier modifier4;
        final StateFlow<? extends OddType> stateFlow22;
        boolean z4;
        int i29;
        int i30;
        int i31;
        int i32;
        Intrinsics.checkNotNullParameter(itemsFlow, "itemsFlow");
        Composer startRestartGroup = composer.startRestartGroup(1271772978);
        int i33 = i4 & 1;
        if (i33 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(itemsFlow) ? 32 : 16;
        }
        int i34 = i4 & 4;
        if (i34 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= startRestartGroup.changed(i) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    if ((i4 & 16) == 0 && startRestartGroup.changedInstance(stateFlow)) {
                        i32 = 16384;
                        i5 |= i32;
                    }
                    i32 = 8192;
                    i5 |= i32;
                }
                i7 = i4 & 32;
                if (i7 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i5 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
                }
                if ((i2 & 1572864) == 0) {
                    i5 |= ((i4 & 64) == 0 && startRestartGroup.changedInstance(stateFlow2)) ? 1048576 : 524288;
                }
                if ((i2 & 12582912) == 0) {
                    if ((i4 & 128) == 0 && startRestartGroup.changedInstance(stateFlow3)) {
                        i31 = 8388608;
                        i5 |= i31;
                    }
                    i31 = 4194304;
                    i5 |= i31;
                }
                i8 = i4 & 256;
                if (i8 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i5 |= startRestartGroup.changed(z) ? 67108864 : 33554432;
                }
                i9 = i4 & 512;
                if (i9 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i5 |= startRestartGroup.changedInstance(function2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                }
                i10 = i4 & 1024;
                if (i10 != 0) {
                    i11 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    i11 = i3 | (startRestartGroup.changedInstance(function12) ? 4 : 2);
                } else {
                    i11 = i3;
                }
                if ((i3 & 48) == 0) {
                    if ((i4 & 2048) == 0 && startRestartGroup.changedInstance(stateFlow4)) {
                        i30 = 32;
                        i11 |= i30;
                    }
                    i30 = 16;
                    i11 |= i30;
                }
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    if ((i4 & 4096) == 0 && startRestartGroup.changedInstance(stateFlow5)) {
                        i29 = 256;
                        i11 |= i29;
                    }
                    i29 = 128;
                    i11 |= i29;
                }
                int i35 = i11;
                i12 = i4 & 8192;
                if (i12 != 0) {
                    i35 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i35 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
                    i13 = i4 & 16384;
                    if (i13 == 0) {
                        i35 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i35 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
                        i14 = i4 & 32768;
                        if (i14 != 0) {
                            i35 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i35 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
                        }
                        i15 = i4 & 65536;
                        if (i15 != 0) {
                            i35 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i35 |= startRestartGroup.changedInstance(function03) ? 1048576 : 524288;
                        }
                        i16 = i4 & 131072;
                        if (i16 != 0) {
                            i35 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            i35 |= startRestartGroup.changedInstance(function23) ? 8388608 : 4194304;
                        }
                        if ((i5 & 306783379) == 306783378 || (4793491 & i35) != 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion2 = i33 != 0 ? Modifier.INSTANCE : modifier;
                                if (i34 != 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue6 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda11
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit unit;
                                                unit = Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                    }
                                    function04 = (Function0) rememberedValue6;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    function04 = function0;
                                }
                                int i36 = i6 != 0 ? 2 : i;
                                if ((i4 & 16) != 0) {
                                    mutableStateFlow = StateFlowKt.MutableStateFlow(OddType.DECIMAL);
                                    i5 &= -57345;
                                } else {
                                    mutableStateFlow = stateFlow;
                                }
                                if (i7 != 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                                    if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                Unit BetListDetailsScreen$lambda$3$lambda$2;
                                                BetListDetailsScreen$lambda$3$lambda$2 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$3$lambda$2(((Integer) obj2).intValue());
                                                return BetListDetailsScreen$lambda$3$lambda$2;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue7);
                                    }
                                    function13 = (Function1) rememberedValue7;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    function13 = function1;
                                }
                                if ((i4 & 64) != 0) {
                                    mutableStateFlow2 = StateFlowKt.MutableStateFlow(true);
                                    i5 &= -3670017;
                                } else {
                                    mutableStateFlow2 = stateFlow2;
                                }
                                Modifier modifier5 = companion2;
                                if ((i4 & 128) != 0) {
                                    mutableStateFlow3 = StateFlowKt.MutableStateFlow(0L);
                                    i5 &= -29360129;
                                } else {
                                    mutableStateFlow3 = stateFlow3;
                                }
                                boolean z5 = i8 != 0 ? false : z;
                                if (i9 != 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue8 = startRestartGroup.rememberedValue();
                                    stateFlow6 = mutableStateFlow3;
                                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue8 = new Function2() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj2, Object obj3) {
                                                Unit BetListDetailsScreen$lambda$5$lambda$4;
                                                BetListDetailsScreen$lambda$5$lambda$4 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$5$lambda$4(((Integer) obj2).intValue(), (MatchState) obj3);
                                                return BetListDetailsScreen$lambda$5$lambda$4;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue8);
                                    }
                                    function24 = (Function2) rememberedValue8;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    stateFlow6 = mutableStateFlow3;
                                    function24 = function2;
                                }
                                if (i10 != 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue9 = startRestartGroup.rememberedValue();
                                    if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                Unit BetListDetailsScreen$lambda$7$lambda$6;
                                                BetListDetailsScreen$lambda$7$lambda$6 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$7$lambda$6(((Integer) obj2).intValue());
                                                return BetListDetailsScreen$lambda$7$lambda$6;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue9);
                                    }
                                    function14 = (Function1) rememberedValue9;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    function14 = function12;
                                }
                                if ((i4 & 2048) != 0) {
                                    obj = null;
                                    mutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
                                    i35 &= -113;
                                } else {
                                    obj = null;
                                    mutableStateFlow4 = stateFlow4;
                                }
                                Function2<? super Integer, ? super MatchState, Unit> function212 = function24;
                                if ((i4 & 4096) != 0) {
                                    mutableStateFlow5 = StateFlowKt.MutableStateFlow(obj);
                                    i35 &= -897;
                                } else {
                                    mutableStateFlow5 = stateFlow5;
                                }
                                if (i12 != 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue10 = startRestartGroup.rememberedValue();
                                    if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue10 = new Function2() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj2, Object obj3) {
                                                Unit BetListDetailsScreen$lambda$9$lambda$8;
                                                BetListDetailsScreen$lambda$9$lambda$8 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$9$lambda$8(((Long) obj2).longValue(), ((Long) obj3).longValue());
                                                return BetListDetailsScreen$lambda$9$lambda$8;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue10);
                                    }
                                    function25 = (Function2) rememberedValue10;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    function25 = function22;
                                }
                                if (i13 != 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue11 = startRestartGroup.rememberedValue();
                                    if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue11 = new Function3() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda8
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                Unit BetListDetailsScreen$lambda$11$lambda$10;
                                                BetListDetailsScreen$lambda$11$lambda$10 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$11$lambda$10(((Long) obj2).longValue(), ((Long) obj3).longValue(), ((Double) obj4).doubleValue());
                                                return BetListDetailsScreen$lambda$11$lambda$10;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue11);
                                    }
                                    function32 = (Function3) rememberedValue11;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    function32 = function3;
                                }
                                if (i14 != 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue12 = startRestartGroup.rememberedValue();
                                    stateFlow7 = mutableStateFlow5;
                                    if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue12 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda9
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit unit;
                                                unit = Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue12);
                                    }
                                    function05 = (Function0) rememberedValue12;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    stateFlow7 = mutableStateFlow5;
                                    function05 = function02;
                                }
                                Function0<? extends Window> function014 = i15 != 0 ? null : function03;
                                Function0<Unit> function015 = function05;
                                if (i16 != 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue13 = startRestartGroup.rememberedValue();
                                    boolean z6 = z5;
                                    if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue13 = new Function2() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda10
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj2, Object obj3) {
                                                Unit BetListDetailsScreen$lambda$15$lambda$14;
                                                BetListDetailsScreen$lambda$15$lambda$14 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$15$lambda$14(((Long) obj2).longValue(), (Function1) obj3);
                                                return BetListDetailsScreen$lambda$15$lambda$14;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue13);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    function26 = function212;
                                    function06 = function015;
                                    z2 = z6;
                                    function27 = (Function2) rememberedValue13;
                                    function15 = function14;
                                    function28 = function25;
                                    function33 = function32;
                                    function07 = function014;
                                    function16 = function13;
                                    stateFlow8 = mutableStateFlow2;
                                    modifier2 = modifier5;
                                } else {
                                    modifier2 = modifier5;
                                    function26 = function212;
                                    function06 = function015;
                                    z2 = z5;
                                    function27 = function23;
                                    function15 = function14;
                                    function28 = function25;
                                    function33 = function32;
                                    function07 = function014;
                                    function16 = function13;
                                    stateFlow8 = mutableStateFlow2;
                                }
                                stateFlow9 = stateFlow7;
                                function08 = function04;
                                i17 = i35;
                                i18 = i36;
                                stateFlow10 = mutableStateFlow4;
                                stateFlow11 = stateFlow6;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i4 & 16) != 0) {
                                    i5 &= -57345;
                                }
                                if ((i4 & 64) != 0) {
                                    i5 &= -3670017;
                                }
                                if ((i4 & 128) != 0) {
                                    i5 &= -29360129;
                                }
                                if ((i4 & 2048) != 0) {
                                    i35 &= -113;
                                }
                                if ((i4 & 4096) != 0) {
                                    i35 &= -897;
                                }
                                modifier2 = modifier;
                                function08 = function0;
                                i18 = i;
                                mutableStateFlow = stateFlow;
                                function16 = function1;
                                stateFlow8 = stateFlow2;
                                stateFlow11 = stateFlow3;
                                z2 = z;
                                function26 = function2;
                                function15 = function12;
                                stateFlow9 = stateFlow5;
                                function28 = function22;
                                function33 = function3;
                                function06 = function02;
                                function07 = function03;
                                function27 = function23;
                                i17 = i35;
                                stateFlow10 = stateFlow4;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1271772978, i5, i17, "org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreen (BetListDetailsScreen.kt:121)");
                            }
                            collectAsState = SnapshotStateKt.collectAsState(itemsFlow, null, startRestartGroup, (i5 >> 3) & 14, 1);
                            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localContext);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Context context3 = (Context) consume;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new BetTicketShareLayoutAnchor();
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            BetTicketShareLayoutAnchor betTicketShareLayoutAnchor3 = (BetTicketShareLayoutAnchor) rememberedValue2;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                stateFlow12 = stateFlow9;
                                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            } else {
                                stateFlow12 = stateFlow9;
                            }
                            final MutableState mutableState3 = (MutableState) rememberedValue3;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                i19 = 2;
                                snapshotMutationPolicy = null;
                                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            } else {
                                i19 = 2;
                                snapshotMutationPolicy = null;
                            }
                            final MutableState mutableState4 = (MutableState) rememberedValue4;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            final StateFlow<? extends CancelBetInfoModel> stateFlow23 = stateFlow10;
                            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i19, snapshotMutationPolicy);
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            MutableState mutableState5 = (MutableState) rememberedValue5;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(-1891786836);
                            if (BetListDetailsScreen$lambda$16(collectAsState).isEmpty()) {
                                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                                startRestartGroup.startReplaceGroup(5004770);
                                int i37 = i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
                                boolean z7 = i37 == 256;
                                Object rememberedValue14 = startRestartGroup.rememberedValue();
                                if (z7 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue14 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda12
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit BetListDetailsScreen$lambda$28$lambda$27;
                                            BetListDetailsScreen$lambda$28$lambda$27 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$28$lambda$27(Function0.this);
                                            return BetListDetailsScreen$lambda$28$lambda$27;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue14);
                                }
                                startRestartGroup.endReplaceGroup();
                                Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(fillMaxSize$default, false, null, null, (Function0) rememberedValue14, 7, null);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default);
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
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.new_close_ic, startRestartGroup, 6);
                                String stringResource = StringResources_androidKt.stringResource(R.string.cd_close, startRestartGroup, 6);
                                Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(PaddingKt.m1516padding3ABfNKs(boxScopeInstance2.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), Dp.m7774constructorimpl(32)), Dp.m7774constructorimpl(36));
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean z8 = i37 == 256;
                                Object rememberedValue15 = startRestartGroup.rememberedValue();
                                if (z8 || rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue15 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda13
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit BetListDetailsScreen$lambda$31$lambda$30$lambda$29;
                                            BetListDetailsScreen$lambda$31$lambda$30$lambda$29 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$31$lambda$30$lambda$29(Function0.this);
                                            return BetListDetailsScreen$lambda$31$lambda$30$lambda$29;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue15);
                                }
                                startRestartGroup.endReplaceGroup();
                                ImageKt.Image(painterResource, stringResource, ClickAnimationModifierKt.clickAnimation(m1563size3ABfNKs, (Function0) rememberedValue15, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                    final Function0<Unit> function016 = function08;
                                    final int i38 = i18;
                                    final StateFlow<? extends OddType> stateFlow24 = mutableStateFlow;
                                    final Function1<? super Integer, Unit> function19 = function16;
                                    final StateFlow<? extends SellBetInfoModel> stateFlow25 = stateFlow12;
                                    final StateFlow<Boolean> stateFlow26 = stateFlow8;
                                    final StateFlow<Long> stateFlow27 = stateFlow11;
                                    final boolean z9 = z2;
                                    final Function2<? super Integer, ? super MatchState, Unit> function213 = function26;
                                    final Function1<? super Integer, Unit> function110 = function15;
                                    final Function2<? super Long, ? super Long, Unit> function214 = function28;
                                    final Function3<? super Long, ? super Long, ? super Double, Unit> function35 = function33;
                                    final Function0<Unit> function017 = function06;
                                    final Function0<? extends Window> function018 = function07;
                                    final Function2<? super Long, ? super Function1<? super String, Unit>, Unit> function215 = function27;
                                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda18
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj2, Object obj3) {
                                            Unit BetListDetailsScreen$lambda$32;
                                            BetListDetailsScreen$lambda$32 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$32(Modifier.this, itemsFlow, function016, i38, stateFlow24, function19, stateFlow26, stateFlow27, z9, function213, function110, stateFlow23, stateFlow25, function214, function35, function017, function018, function215, i2, i3, i4, (Composer) obj2, ((Integer) obj3).intValue());
                                            return BetListDetailsScreen$lambda$32;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            StateFlow<? extends SellBetInfoModel> stateFlow28 = stateFlow12;
                            startRestartGroup.endReplaceGroup();
                            State collectAsState2 = SnapshotStateKt.collectAsState(mutableStateFlow, null, startRestartGroup, (i5 >> 12) & 14, 1);
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Density density2 = (Density) consume2;
                            startRestartGroup.startReplaceGroup(5004770);
                            boolean changed = startRestartGroup.changed(density2);
                            Object rememberedValue16 = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue16 = Integer.valueOf(RangesKt.coerceAtLeast(MathKt.roundToInt(density2.getDensity() * 4.0f), 1));
                                startRestartGroup.updateRememberedValue(rememberedValue16);
                            }
                            int intValue = ((Number) rememberedValue16).intValue();
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(5004770);
                            boolean changed2 = startRestartGroup.changed(density2);
                            Object rememberedValue17 = startRestartGroup.rememberedValue();
                            if (changed2 || rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue17 = Integer.valueOf(RangesKt.coerceAtLeast(MathKt.roundToInt(density2.getDensity() * 4.0f), 1));
                                startRestartGroup.updateRememberedValue(rememberedValue17);
                            }
                            int intValue2 = ((Number) rememberedValue17).intValue();
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(5004770);
                            boolean changed3 = startRestartGroup.changed(density2);
                            Object rememberedValue18 = startRestartGroup.rememberedValue();
                            if (changed3 || rememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue18 = Integer.valueOf(RangesKt.coerceAtLeast(MathKt.roundToInt(density2.getDensity() * 4.0f), 1));
                                startRestartGroup.updateRememberedValue(rememberedValue18);
                            }
                            int intValue3 = ((Number) rememberedValue18).intValue();
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(5004770);
                            boolean changed4 = startRestartGroup.changed(density2);
                            Object rememberedValue19 = startRestartGroup.rememberedValue();
                            if (changed4 || rememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue19 = Integer.valueOf(RangesKt.coerceAtLeast(MathKt.roundToInt(density2.getDensity() * 4.0f), 1));
                                startRestartGroup.updateRememberedValue(rememberedValue19);
                            }
                            int intValue4 = ((Number) rememberedValue19).intValue();
                            startRestartGroup.endReplaceGroup();
                            Iterator<BetsListModel> it = BetListDetailsScreen$lambda$16(collectAsState).iterator();
                            int i39 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i39 = -1;
                                    break;
                                }
                                Integer id = it.next().getId();
                                Iterator<BetsListModel> it2 = it;
                                if (id != null && id.intValue() == i18) {
                                    break;
                                }
                                i39++;
                                it = it2;
                            }
                            StateFlow<? extends OddType> stateFlow29 = mutableStateFlow;
                            State collectAsState3 = SnapshotStateKt.collectAsState(stateFlow8, null, startRestartGroup, (i5 >> 18) & 14, 1);
                            State collectAsState4 = SnapshotStateKt.collectAsState(stateFlow11, null, startRestartGroup, (i5 >> 21) & 14, 1);
                            LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m8308boximpl(LottieCompositionSpec.RawRes.m8309constructorimpl(R.raw.confety)), null, null, null, null, null, startRestartGroup, 6, 62);
                            LottieComposition value = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m8308boximpl(LottieCompositionSpec.RawRes.m8309constructorimpl(R.raw.coin_animation)), null, null, null, null, null, startRestartGroup, 6, 62).getValue();
                            Function1<HapticFeedbackType, Unit> rememberHapticFeedback = HapticFeedbackEffectKt.rememberHapticFeedback(startRestartGroup, 0);
                            StateFlow<Long> stateFlow30 = stateFlow11;
                            boolean z10 = BetListDetailsScreen$lambda$16(collectAsState).size() == 1;
                            int size = BetListDetailsScreen$lambda$16(collectAsState).size();
                            startRestartGroup.startReplaceGroup(5004770);
                            boolean changed5 = startRestartGroup.changed(size);
                            Object rememberedValue20 = startRestartGroup.rememberedValue();
                            int i40 = i18;
                            if (changed5 || rememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                stateFlow13 = stateFlow8;
                                Object Animatable$default = AnimatableKt.Animatable$default(z10 ? 0.0f : 1.0f, 0.0f, 2, null);
                                startRestartGroup.updateRememberedValue(Animatable$default);
                                rememberedValue20 = Animatable$default;
                            } else {
                                stateFlow13 = stateFlow8;
                            }
                            Animatable animatable3 = (Animatable) rememberedValue20;
                            startRestartGroup.endReplaceGroup();
                            int size2 = BetListDetailsScreen$lambda$16(collectAsState).size();
                            startRestartGroup.startReplaceGroup(5004770);
                            boolean changed6 = startRestartGroup.changed(size2);
                            Object rememberedValue21 = startRestartGroup.rememberedValue();
                            if (changed6 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                density = density2;
                                lottieCompositionResult = rememberLottieComposition;
                                Object Animatable$default2 = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
                                startRestartGroup.updateRememberedValue(Animatable$default2);
                                rememberedValue21 = Animatable$default2;
                            } else {
                                density = density2;
                                lottieCompositionResult = rememberLottieComposition;
                            }
                            Animatable animatable4 = (Animatable) rememberedValue21;
                            startRestartGroup.endReplaceGroup();
                            int size3 = BetListDetailsScreen$lambda$16(collectAsState).size();
                            startRestartGroup.startReplaceGroup(5004770);
                            boolean changed7 = startRestartGroup.changed(size3);
                            Object rememberedValue22 = startRestartGroup.rememberedValue();
                            if (changed7 || rememberedValue22 == Composer.INSTANCE.getEmpty()) {
                                Object Animatable$default3 = AnimatableKt.Animatable$default(z10 ? 0.0f : 1.0f, 0.0f, 2, null);
                                startRestartGroup.updateRememberedValue(Animatable$default3);
                                rememberedValue22 = Animatable$default3;
                            }
                            Animatable animatable5 = (Animatable) rememberedValue22;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            Object rememberedValue23 = startRestartGroup.rememberedValue();
                            if (rememberedValue23 == Composer.INSTANCE.getEmpty()) {
                                str = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                                str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                                rememberedValue23 = new CubicBezierEasing(0.3f, 0.0f, 0.2f, 1.0f);
                                startRestartGroup.updateRememberedValue(rememberedValue23);
                            } else {
                                str = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                                str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                            }
                            CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) rememberedValue23;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            Object rememberedValue24 = startRestartGroup.rememberedValue();
                            if (rememberedValue24 == Composer.INSTANCE.getEmpty()) {
                                str3 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                                rememberedValue24 = new CubicBezierEasing(0.28f, 0.0f, 0.22f, 1.0f);
                                startRestartGroup.updateRememberedValue(rememberedValue24);
                            } else {
                                str3 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                            }
                            CubicBezierEasing cubicBezierEasing2 = (CubicBezierEasing) rememberedValue24;
                            startRestartGroup.endReplaceGroup();
                            Integer valueOf = Integer.valueOf(BetListDetailsScreen$lambda$16(collectAsState).size());
                            startRestartGroup.startReplaceGroup(-1224400529);
                            boolean changed8 = startRestartGroup.changed(collectAsState) | startRestartGroup.changedInstance(animatable3) | startRestartGroup.changedInstance(animatable4) | startRestartGroup.changedInstance(animatable5);
                            Object rememberedValue25 = startRestartGroup.rememberedValue();
                            if (changed8 || rememberedValue25 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue25 = (Function2) new BetListDetailsScreenKt$BetListDetailsScreen$12$1(animatable3, animatable4, animatable5, collectAsState, cubicBezierEasing, cubicBezierEasing, cubicBezierEasing2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue25);
                            }
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue25, startRestartGroup, 0);
                            if (i39 < 0) {
                                i39 = 0;
                            }
                            startRestartGroup.startReplaceGroup(5004770);
                            boolean changed9 = startRestartGroup.changed(collectAsState);
                            Object rememberedValue26 = startRestartGroup.rememberedValue();
                            if (changed9 || rememberedValue26 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue26 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda19
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int BetListDetailsScreen$lambda$49$lambda$48;
                                        BetListDetailsScreen$lambda$49$lambda$48 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$49$lambda$48(State.this);
                                        return Integer.valueOf(BetListDetailsScreen$lambda$49$lambda$48);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue26);
                            }
                            startRestartGroup.endReplaceGroup();
                            PagerState rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i39, 0.0f, (Function0) rememberedValue26, startRestartGroup, 0, 2);
                            int currentPage = rememberPagerStateWithoutSavedState.getCurrentPage();
                            final LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
                            startRestartGroup.startReplaceGroup(1849434622);
                            Object rememberedValue27 = startRestartGroup.rememberedValue();
                            if (rememberedValue27 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue27 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda20
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Integer BetListDetailsScreen$lambda$51$lambda$50;
                                        BetListDetailsScreen$lambda$51$lambda$50 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$51$lambda$50(LazyListState.this);
                                        return BetListDetailsScreen$lambda$51$lambda$50;
                                    }
                                });
                                startRestartGroup.updateRememberedValue(rememberedValue27);
                            }
                            State state7 = (State) rememberedValue27;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            Object rememberedValue28 = startRestartGroup.rememberedValue();
                            if (rememberedValue28 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue28 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda21
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Integer BetListDetailsScreen$lambda$54$lambda$53;
                                        BetListDetailsScreen$lambda$54$lambda$53 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$54$lambda$53(LazyListState.this);
                                        return BetListDetailsScreen$lambda$54$lambda$53;
                                    }
                                });
                                startRestartGroup.updateRememberedValue(rememberedValue28);
                            }
                            State state8 = (State) rememberedValue28;
                            startRestartGroup.endReplaceGroup();
                            Integer valueOf2 = Integer.valueOf(BetListDetailsScreen$lambda$16(collectAsState).size());
                            Integer valueOf3 = Integer.valueOf(currentPage);
                            startRestartGroup.startReplaceGroup(-1746271574);
                            boolean changed10 = startRestartGroup.changed(collectAsState) | startRestartGroup.changed(currentPage) | startRestartGroup.changed(rememberPagerStateWithoutSavedState);
                            Object rememberedValue29 = startRestartGroup.rememberedValue();
                            if (changed10 || rememberedValue29 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue29 = (Function2) new BetListDetailsScreenKt$BetListDetailsScreen$13$1(currentPage, rememberPagerStateWithoutSavedState, collectAsState, null);
                                startRestartGroup.updateRememberedValue(rememberedValue29);
                            }
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(valueOf2, valueOf3, (Function2) rememberedValue29, startRestartGroup, 0);
                            Integer valueOf4 = Integer.valueOf(currentPage);
                            BetsListModel betsListModel = (BetsListModel) CollectionsKt.getOrNull(BetListDetailsScreen$lambda$16(collectAsState), currentPage);
                            Integer id2 = betsListModel != null ? betsListModel.getId() : null;
                            BetsListModel betsListModel2 = (BetsListModel) CollectionsKt.getOrNull(BetListDetailsScreen$lambda$16(collectAsState), currentPage);
                            BetState state9 = betsListModel2 != null ? betsListModel2.getState() : null;
                            startRestartGroup.startReplaceGroup(-1224400529);
                            int i41 = i17;
                            boolean changed11 = ((i17 & 14) == 4) | startRestartGroup.changed(collectAsState) | startRestartGroup.changed(currentPage) | startRestartGroup.changed(rememberHapticFeedback) | startRestartGroup.changed(rememberLazyListStateWithoutSavedState);
                            Object rememberedValue30 = startRestartGroup.rememberedValue();
                            if (changed11 || rememberedValue30 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue30 = (Function2) new BetListDetailsScreenKt$BetListDetailsScreen$14$1(currentPage, function15, rememberHapticFeedback, rememberLazyListStateWithoutSavedState, collectAsState, null);
                                startRestartGroup.updateRememberedValue(rememberedValue30);
                            }
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(valueOf4, id2, state9, (Function2) rememberedValue30, startRestartGroup, 0);
                            startRestartGroup.startReplaceGroup(5004770);
                            int i42 = i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
                            boolean z11 = i42 == 256;
                            Object rememberedValue31 = startRestartGroup.rememberedValue();
                            if (z11 || rememberedValue31 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue31 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda22
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit BetListDetailsScreen$lambda$59$lambda$58;
                                        BetListDetailsScreen$lambda$59$lambda$58 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$59$lambda$58(Function0.this);
                                        return BetListDetailsScreen$lambda$59$lambda$58;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue31);
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier m1059clickableXHw0xAI$default2 = ClickableKt.m1059clickableXHw0xAI$default(modifier2, false, null, null, (Function0) rememberedValue31, 7, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, str3);
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str2);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default2);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            String str11 = str;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str11);
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
                            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            final BetShareChooserState BetListDetailsScreen$lambda$25 = BetListDetailsScreen$lambda$25(mutableState5);
                            startRestartGroup.startReplaceGroup(-1806671809);
                            if (BetListDetailsScreen$lambda$25 == null) {
                                modifier3 = modifier2;
                                mutableState = mutableState5;
                                context = context3;
                                str4 = str11;
                            } else {
                                context = context3;
                                FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                                startRestartGroup.startReplaceGroup(-1806669184);
                                if (fragmentActivity != null) {
                                    startRestartGroup.startReplaceGroup(-1633490746);
                                    boolean changedInstance = startRestartGroup.changedInstance(BetListDetailsScreen$lambda$25);
                                    Object rememberedValue32 = startRestartGroup.rememberedValue();
                                    if (changedInstance || rememberedValue32 == Composer.INSTANCE.getEmpty()) {
                                        mutableState = mutableState5;
                                        rememberedValue32 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda23
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit BetListDetailsScreen$lambda$85$lambda$63$lambda$62$lambda$61;
                                                BetListDetailsScreen$lambda$85$lambda$63$lambda$62$lambda$61 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$85$lambda$63$lambda$62$lambda$61(BetShareChooserState.this, mutableState);
                                                return BetListDetailsScreen$lambda$85$lambda$63$lambda$62$lambda$61;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue32);
                                    } else {
                                        mutableState = mutableState5;
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    modifier3 = modifier2;
                                    str4 = str11;
                                    AndroidDialog_androidKt.Dialog((Function0) rememberedValue32, new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(951056265, true, new BetListDetailsScreenKt$BetListDetailsScreen$16$1$2(BetListDetailsScreen$lambda$25, fragmentActivity, mutableState), startRestartGroup, 54), startRestartGroup, 432, 0);
                                } else {
                                    modifier3 = modifier2;
                                    str4 = str11;
                                    mutableState = mutableState5;
                                }
                                startRestartGroup.endReplaceGroup();
                                Unit unit = Unit.INSTANCE;
                                Unit unit2 = Unit.INSTANCE;
                            }
                            startRestartGroup.endReplaceGroup();
                            Boolean valueOf5 = Boolean.valueOf(currentPage < BetListDetailsScreen$lambda$16(collectAsState).size() && BetListDetailsScreen$lambda$16(collectAsState).get(currentPage).getState() == BetState.WON);
                            boolean z12 = !BetListDetailsScreen$lambda$16(collectAsState).isEmpty() && currentPage < BetListDetailsScreen$lambda$16(collectAsState).size() && BetListDetailsScreen$lambda$16(collectAsState).get(currentPage).getState() == BetState.LOST;
                            startRestartGroup.startReplaceGroup(-1806591687);
                            if (valueOf5.booleanValue()) {
                                startRestartGroup.startMovableGroup(-1806588287, Integer.valueOf(currentPage));
                                stateFlow14 = stateFlow23;
                                coroutineScope = coroutineScope2;
                                betTicketShareLayoutAnchor = betTicketShareLayoutAnchor3;
                                state2 = state7;
                                str6 = str3;
                                lazyListState = rememberLazyListStateWithoutSavedState;
                                str5 = str4;
                                i20 = currentPage;
                                mutableState2 = mutableState;
                                i22 = intValue;
                                i23 = intValue2;
                                i24 = intValue3;
                                i25 = intValue4;
                                stateFlow16 = stateFlow30;
                                String str12 = str2;
                                animatable = animatable5;
                                state4 = collectAsState;
                                i26 = i41;
                                state = collectAsState2;
                                pagerState = rememberPagerStateWithoutSavedState;
                                context2 = context;
                                stateFlow15 = stateFlow29;
                                i21 = i42;
                                str7 = str12;
                                state3 = state8;
                                animatable2 = animatable3;
                                f = 1.0f;
                                function09 = function08;
                                LottieAnimationKt.LottieAnimation(BetListDetailsScreen$lambda$41(lottieCompositionResult), boxScopeInstance3.align(OffsetKt.m1476offsetVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(-250), 1, null), Alignment.INSTANCE.getCenter()), false, false, null, 0.0f, 2, false, false, false, null, false, false, null, null, null, false, null, null, startRestartGroup, 1572864, 0, 524220);
                                startRestartGroup.endMovableGroup();
                            } else {
                                coroutineScope = coroutineScope2;
                                betTicketShareLayoutAnchor = betTicketShareLayoutAnchor3;
                                lazyListState = rememberLazyListStateWithoutSavedState;
                                i20 = currentPage;
                                context2 = context;
                                i21 = i42;
                                function09 = function08;
                                state = collectAsState2;
                                state2 = state7;
                                stateFlow14 = stateFlow23;
                                str5 = str4;
                                i22 = intValue;
                                i23 = intValue2;
                                i24 = intValue3;
                                i25 = intValue4;
                                str6 = str3;
                                str7 = str2;
                                animatable = animatable5;
                                state3 = state8;
                                pagerState = rememberPagerStateWithoutSavedState;
                                i26 = i41;
                                state4 = collectAsState;
                                mutableState2 = mutableState;
                                animatable2 = animatable3;
                                stateFlow15 = stateFlow29;
                                stateFlow16 = stateFlow30;
                                f = 1.0f;
                            }
                            startRestartGroup.endReplaceGroup();
                            final float mo1167toPx0680j_4 = density.mo1167toPx0680j_4(Dp.m7774constructorimpl(96));
                            final float floatValue = ((Number) animatable2.getValue()).floatValue();
                            float floatValue2 = ((Number) animatable4.getValue()).floatValue();
                            final float f4 = ((0.24f * floatValue) + 0.76f) * floatValue2;
                            float f5 = floatValue2 - f;
                            final float f6 = f - (0.28f * f5);
                            final float f7 = (f5 * 0.36f) + f;
                            final float floatValue3 = ((Number) animatable.getValue()).floatValue();
                            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            startRestartGroup.startReplaceGroup(-1806559878);
                            if (z10) {
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                startRestartGroup.startReplaceGroup(-1224400529);
                                boolean changed12 = startRestartGroup.changed(floatValue3) | startRestartGroup.changed(f4) | startRestartGroup.changed(f6) | startRestartGroup.changed(f7) | startRestartGroup.changed(floatValue) | startRestartGroup.changed(mo1167toPx0680j_4);
                                Object rememberedValue33 = startRestartGroup.rememberedValue();
                                if (changed12 || rememberedValue33 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue33 = new Function1() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda24
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            Unit BetListDetailsScreen$lambda$85$lambda$66$lambda$65;
                                            BetListDetailsScreen$lambda$85$lambda$66$lambda$65 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$85$lambda$66$lambda$65(floatValue3, f4, f6, f7, floatValue, mo1167toPx0680j_4, (GraphicsLayerScope) obj2);
                                            return BetListDetailsScreen$lambda$85$lambda$66$lambda$65;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue33);
                                }
                                startRestartGroup.endReplaceGroup();
                                companion = GraphicsLayerModifierKt.graphicsLayer(companion3, (Function1) rememberedValue33);
                            } else {
                                companion = Modifier.INSTANCE;
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier then = fillMaxSize$default2.then(companion);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            String str13 = str7;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str13);
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, then);
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            String str14 = str5;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str14);
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor3);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            float f8 = 32;
                            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f8), Dp.m7774constructorimpl(f8), Dp.m7774constructorimpl(f8), 0.0f, 8, null);
                            String str15 = str6;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, str15);
                            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str13);
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default);
                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str14);
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor4);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                            startRestartGroup.startReplaceGroup(-1676283120);
                            if (!z12 || value == null) {
                                boxScopeInstance = boxScopeInstance4;
                                str8 = str15;
                                f2 = f8;
                                str9 = str14;
                                str10 = str13;
                            } else {
                                startRestartGroup.startMovableGroup(-1676281247, Integer.valueOf(i20));
                                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, str15);
                                MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str13);
                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str14);
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor5);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                Composer m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                                Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                }
                                Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                str8 = str15;
                                f2 = f8;
                                str9 = str14;
                                str10 = str13;
                                boxScopeInstance = boxScopeInstance4;
                                LottieAnimationKt.LottieAnimation(value, BoxScopeInstance.INSTANCE.align(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(84)), Alignment.INSTANCE.getTopCenter()), false, false, null, 0.6f, 1, false, false, false, null, false, false, null, null, null, false, null, null, startRestartGroup, 1769472, 0, 524188);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endMovableGroup();
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier align = boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd());
                            float f9 = 8;
                            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f9));
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, centerVertically, startRestartGroup, 54);
                            String str16 = str10;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str16);
                            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, align);
                            Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                            String str17 = str9;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str17);
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor6);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl6, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                            }
                            Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            startRestartGroup.startReplaceGroup(-594446718);
                            if (z2) {
                                i27 = i20;
                                stateFlow17 = stateFlow14;
                                columnScopeInstance = columnScopeInstance2;
                                f3 = f9;
                                state5 = state4;
                                betTicketShareLayoutAnchor2 = betTicketShareLayoutAnchor;
                                state6 = state;
                                function010 = function09;
                            } else {
                                i27 = i20;
                                boolean z13 = i27 < BetListDetailsScreen$lambda$16(state4).size() && BetListDetailsScreen$lambda$16(state4).get(i27).getPlacedBets().size() <= 3;
                                startRestartGroup.startReplaceGroup(-594439945);
                                if (z13) {
                                    float f10 = 36;
                                    Modifier m1563size3ABfNKs2 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f10));
                                    boolean z14 = !BetListDetailsScreen$lambda$22(mutableState4);
                                    startRestartGroup.startReplaceGroup(-1224400529);
                                    final Context context4 = context2;
                                    state5 = state4;
                                    state6 = state;
                                    final CoroutineScope coroutineScope3 = coroutineScope;
                                    betTicketShareLayoutAnchor2 = betTicketShareLayoutAnchor;
                                    f3 = f9;
                                    columnScopeInstance = columnScopeInstance2;
                                    final int i43 = i22;
                                    final int i44 = i23;
                                    stateFlow17 = stateFlow14;
                                    final int i45 = i25;
                                    final int i46 = i24;
                                    boolean changedInstance2 = startRestartGroup.changedInstance(context4) | startRestartGroup.changed(i27) | startRestartGroup.changed(state5) | ((i26 & 29360128) == 8388608) | startRestartGroup.changed(state6) | startRestartGroup.changedInstance(coroutineScope3) | startRestartGroup.changedInstance(betTicketShareLayoutAnchor2) | ((i26 & 3670016) == 1048576) | startRestartGroup.changed(i43) | startRestartGroup.changed(i44) | startRestartGroup.changed(i45) | startRestartGroup.changed(i46);
                                    Object rememberedValue34 = startRestartGroup.rememberedValue();
                                    if (changedInstance2 || rememberedValue34 == Composer.INSTANCE.getEmpty()) {
                                        final Function0<? extends Window> function019 = function07;
                                        final Function2<? super Long, ? super Function1<? super String, Unit>, Unit> function216 = function27;
                                        final MutableState mutableState6 = mutableState2;
                                        rememberedValue34 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda25
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73;
                                                BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73(context4, i27, coroutineScope3, state5, mutableState4, betTicketShareLayoutAnchor2, function019, i43, i44, i45, mutableState3, function216, mutableState6, state6, i46);
                                                return BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue34);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    Modifier clickAnimation = ClickAnimationModifierKt.clickAnimation(m1563size3ABfNKs2, (Function0) rememberedValue34, null, z14, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 6, 0, 4090);
                                    Alignment center = Alignment.INSTANCE.getCenter();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, str8);
                                    z4 = false;
                                    MeasurePolicy maybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str16);
                                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation);
                                    Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str17);
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                        startRestartGroup.createNode(constructor7);
                                    } else {
                                        startRestartGroup.useNode();
                                    }
                                    Composer m4610constructorimpl7 = Updater.m4610constructorimpl(startRestartGroup);
                                    Updater.m4617setimpl(m4610constructorimpl7, maybeCachedBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                        m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                        m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                    }
                                    Updater.m4617setimpl(m4610constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                                    if (BetListDetailsScreen$lambda$22(mutableState4)) {
                                        startRestartGroup.startReplaceGroup(1616594693);
                                        ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), Dp.m7774constructorimpl(2), 0L, 0, startRestartGroup, 390, 24);
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        startRestartGroup.startReplaceGroup(1616931911);
                                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.share_ic_new, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_share_bet_ticket, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f10)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                                        startRestartGroup.endReplaceGroup();
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                } else {
                                    stateFlow17 = stateFlow14;
                                    columnScopeInstance = columnScopeInstance2;
                                    z4 = false;
                                    f3 = f9;
                                    state5 = state4;
                                    betTicketShareLayoutAnchor2 = betTicketShareLayoutAnchor;
                                    state6 = state;
                                }
                                startRestartGroup.endReplaceGroup();
                                Painter painterResource2 = PainterResources_androidKt.painterResource(R.drawable.new_close_ic, startRestartGroup, 6);
                                String stringResource2 = StringResources_androidKt.stringResource(R.string.cd_close, startRestartGroup, 6);
                                Modifier m1563size3ABfNKs3 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(36));
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean z15 = i21 == 256 ? true : z4;
                                Object rememberedValue35 = startRestartGroup.rememberedValue();
                                if (z15 || rememberedValue35 == Composer.INSTANCE.getEmpty()) {
                                    function010 = function09;
                                    rememberedValue35 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$77$lambda$76;
                                            BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$77$lambda$76 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$77$lambda$76(Function0.this);
                                            return BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$77$lambda$76;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue35);
                                } else {
                                    function010 = function09;
                                }
                                startRestartGroup.endReplaceGroup();
                                ImageKt.Image(painterResource2, stringResource2, ClickAnimationModifierKt.clickAnimation(m1563size3ABfNKs3, (Function0) rememberedValue35, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
                            }
                            startRestartGroup.endReplaceGroup();
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
                            StateFlow<? extends CancelBetInfoModel> stateFlow31 = stateFlow17;
                            State collectAsState5 = SnapshotStateKt.collectAsState(stateFlow31, null, startRestartGroup, (i26 >> 3) & 14, 1);
                            State collectAsState6 = SnapshotStateKt.collectAsState(stateFlow28, null, startRestartGroup, (i26 >> 6) & 14, 1);
                            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            if (z10) {
                                companion4 = PaddingKt.m1520paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f2), 7, null);
                            }
                            final State state10 = state5;
                            final int i47 = i27;
                            Function0<Unit> function020 = function010;
                            float f11 = f3;
                            PagerKt.m1761HorizontalPager8jOkeI(pagerState, fillMaxWidth$default2.then(companion4), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1825053995, true, new BetListDetailsScreenKt$BetListDetailsScreen$16$3$2(i27, function16, z2, function26, function28, function33, function06, function010, betTicketShareLayoutAnchor2, state5, state6, collectAsState3, collectAsState4, collectAsState5, collectAsState6, mutableState3), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
                            startRestartGroup.startReplaceGroup(-39547642);
                            if (BetListDetailsScreen$lambda$16(state10).size() > 1) {
                                Modifier m1568width3ABfNKs = SizeKt.m1568width3ABfNKs(PaddingKt.m1520paddingqDBjuR0$default(columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f2), 7, null), Dp.m7774constructorimpl(80));
                                Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f11));
                                startRestartGroup.startReplaceGroup(-1224400529);
                                boolean changed13 = startRestartGroup.changed(state10) | startRestartGroup.changed(i47);
                                Object rememberedValue36 = startRestartGroup.rememberedValue();
                                if (changed13 || rememberedValue36 == Composer.INSTANCE.getEmpty()) {
                                    final State state11 = state2;
                                    final State state12 = state3;
                                    rememberedValue36 = new Function1() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            Unit BetListDetailsScreen$lambda$85$lambda$84$lambda$83$lambda$82;
                                            BetListDetailsScreen$lambda$85$lambda$84$lambda$83$lambda$82 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$85$lambda$84$lambda$83$lambda$82(State.this, i47, state11, state12, (LazyListScope) obj2);
                                            return BetListDetailsScreen$lambda$85$lambda$84$lambda$83$lambda$82;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue36);
                                }
                                startRestartGroup.endReplaceGroup();
                                LazyDslKt.LazyRow(m1568width3ABfNKs, lazyListState, null, false, m1397spacedBy0680j_42, null, null, false, null, (Function1) rememberedValue36, startRestartGroup, 24576, 492);
                            }
                            startRestartGroup.endReplaceGroup();
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
                            stateFlow18 = stateFlow31;
                            stateFlow19 = stateFlow28;
                            function011 = function020;
                            function17 = function16;
                            z3 = z2;
                            function29 = function26;
                            function18 = function15;
                            function210 = function28;
                            function34 = function33;
                            function012 = function06;
                            function013 = function07;
                            function211 = function27;
                            i28 = i40;
                            stateFlow20 = stateFlow16;
                            stateFlow21 = stateFlow13;
                            modifier4 = modifier3;
                            stateFlow22 = stateFlow15;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier4 = modifier;
                            function011 = function0;
                            i28 = i;
                            stateFlow22 = stateFlow;
                            function17 = function1;
                            stateFlow21 = stateFlow2;
                            stateFlow20 = stateFlow3;
                            z3 = z;
                            function29 = function2;
                            function18 = function12;
                            stateFlow18 = stateFlow4;
                            stateFlow19 = stateFlow5;
                            function210 = function22;
                            function34 = function3;
                            function012 = function02;
                            function013 = function03;
                            function211 = function23;
                        }
                        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                        if (endRestartGroup2 != null) {
                            endRestartGroup2.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    Unit BetListDetailsScreen$lambda$86;
                                    BetListDetailsScreen$lambda$86 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$86(Modifier.this, itemsFlow, function011, i28, stateFlow22, function17, stateFlow21, stateFlow20, z3, function29, function18, stateFlow18, stateFlow19, function210, function34, function012, function013, function211, i2, i3, i4, (Composer) obj2, ((Integer) obj3).intValue());
                                    return BetListDetailsScreen$lambda$86;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i14 = i4 & 32768;
                    if (i14 != 0) {
                    }
                    i15 = i4 & 65536;
                    if (i15 != 0) {
                    }
                    i16 = i4 & 131072;
                    if (i16 != 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i33 != 0) {
                    }
                    if (i34 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i4 & 16) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i4 & 64) != 0) {
                    }
                    Modifier modifier52 = companion2;
                    if ((i4 & 128) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if ((i4 & 2048) != 0) {
                    }
                    Function2<? super Integer, ? super MatchState, Unit> function2122 = function24;
                    if ((i4 & 4096) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    Function0<Unit> function0152 = function05;
                    if (i16 != 0) {
                    }
                    stateFlow9 = stateFlow7;
                    function08 = function04;
                    i17 = i35;
                    i18 = i36;
                    stateFlow10 = mutableStateFlow4;
                    stateFlow11 = stateFlow6;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    collectAsState = SnapshotStateKt.collectAsState(itemsFlow, null, startRestartGroup, (i5 >> 3) & 14, 1);
                    ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume3 = startRestartGroup.consume(localContext2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Context context32 = (Context) consume3;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    CoroutineScope coroutineScope22 = (CoroutineScope) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    BetTicketShareLayoutAnchor betTicketShareLayoutAnchor32 = (BetTicketShareLayoutAnchor) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    }
                    final MutableState mutableState32 = (MutableState) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    }
                    final MutableState mutableState42 = (MutableState) rememberedValue4;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    final StateFlow stateFlow232 = stateFlow10;
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    }
                    MutableState mutableState52 = (MutableState) rememberedValue5;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-1891786836);
                    if (BetListDetailsScreen$lambda$16(collectAsState).isEmpty()) {
                    }
                }
                i13 = i4 & 16384;
                if (i13 == 0) {
                }
                i14 = i4 & 32768;
                if (i14 != 0) {
                }
                i15 = i4 & 65536;
                if (i15 != 0) {
                }
                i16 = i4 & 131072;
                if (i16 != 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i33 != 0) {
                }
                if (i34 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i4 & 16) != 0) {
                }
                if (i7 != 0) {
                }
                if ((i4 & 64) != 0) {
                }
                Modifier modifier522 = companion2;
                if ((i4 & 128) != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if ((i4 & 2048) != 0) {
                }
                Function2<? super Integer, ? super MatchState, Unit> function21222 = function24;
                if ((i4 & 4096) != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                Function0<Unit> function01522 = function05;
                if (i16 != 0) {
                }
                stateFlow9 = stateFlow7;
                function08 = function04;
                i17 = i35;
                i18 = i36;
                stateFlow10 = mutableStateFlow4;
                stateFlow11 = stateFlow6;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                collectAsState = SnapshotStateKt.collectAsState(itemsFlow, null, startRestartGroup, (i5 >> 3) & 14, 1);
                ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume32 = startRestartGroup.consume(localContext22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Context context322 = (Context) consume32;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                CoroutineScope coroutineScope222 = (CoroutineScope) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                BetTicketShareLayoutAnchor betTicketShareLayoutAnchor322 = (BetTicketShareLayoutAnchor) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                }
                final MutableState mutableState322 = (MutableState) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                }
                final MutableState mutableState422 = (MutableState) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue5 = startRestartGroup.rememberedValue();
                final StateFlow stateFlow2322 = stateFlow10;
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                }
                MutableState mutableState522 = (MutableState) rememberedValue5;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1891786836);
                if (BetListDetailsScreen$lambda$16(collectAsState).isEmpty()) {
                }
            }
            if ((i2 & 24576) == 0) {
            }
            i7 = i4 & 32;
            if (i7 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i8 = i4 & 256;
            if (i8 != 0) {
            }
            i9 = i4 & 512;
            if (i9 != 0) {
            }
            i10 = i4 & 1024;
            if (i10 != 0) {
            }
            if ((i3 & 48) == 0) {
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            }
            int i352 = i11;
            i12 = i4 & 8192;
            if (i12 != 0) {
            }
            i13 = i4 & 16384;
            if (i13 == 0) {
            }
            i14 = i4 & 32768;
            if (i14 != 0) {
            }
            i15 = i4 & 65536;
            if (i15 != 0) {
            }
            i16 = i4 & 131072;
            if (i16 != 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i33 != 0) {
            }
            if (i34 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i4 & 16) != 0) {
            }
            if (i7 != 0) {
            }
            if ((i4 & 64) != 0) {
            }
            Modifier modifier5222 = companion2;
            if ((i4 & 128) != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if ((i4 & 2048) != 0) {
            }
            Function2<? super Integer, ? super MatchState, Unit> function212222 = function24;
            if ((i4 & 4096) != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            Function0<Unit> function015222 = function05;
            if (i16 != 0) {
            }
            stateFlow9 = stateFlow7;
            function08 = function04;
            i17 = i352;
            i18 = i36;
            stateFlow10 = mutableStateFlow4;
            stateFlow11 = stateFlow6;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            collectAsState = SnapshotStateKt.collectAsState(itemsFlow, null, startRestartGroup, (i5 >> 3) & 14, 1);
            ProvidableCompositionLocal<Context> localContext222 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume322 = startRestartGroup.consume(localContext222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context3222 = (Context) consume322;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            CoroutineScope coroutineScope2222 = (CoroutineScope) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            BetTicketShareLayoutAnchor betTicketShareLayoutAnchor3222 = (BetTicketShareLayoutAnchor) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState mutableState3222 = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState mutableState4222 = (MutableState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue5 = startRestartGroup.rememberedValue();
            final StateFlow stateFlow23222 = stateFlow10;
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState5222 = (MutableState) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1891786836);
            if (BetListDetailsScreen$lambda$16(collectAsState).isEmpty()) {
            }
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i7 = i4 & 32;
        if (i7 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i8 = i4 & 256;
        if (i8 != 0) {
        }
        i9 = i4 & 512;
        if (i9 != 0) {
        }
        i10 = i4 & 1024;
        if (i10 != 0) {
        }
        if ((i3 & 48) == 0) {
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
        }
        int i3522 = i11;
        i12 = i4 & 8192;
        if (i12 != 0) {
        }
        i13 = i4 & 16384;
        if (i13 == 0) {
        }
        i14 = i4 & 32768;
        if (i14 != 0) {
        }
        i15 = i4 & 65536;
        if (i15 != 0) {
        }
        i16 = i4 & 131072;
        if (i16 != 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i33 != 0) {
        }
        if (i34 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i4 & 16) != 0) {
        }
        if (i7 != 0) {
        }
        if ((i4 & 64) != 0) {
        }
        Modifier modifier52222 = companion2;
        if ((i4 & 128) != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if ((i4 & 2048) != 0) {
        }
        Function2<? super Integer, ? super MatchState, Unit> function2122222 = function24;
        if ((i4 & 4096) != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        Function0<Unit> function0152222 = function05;
        if (i16 != 0) {
        }
        stateFlow9 = stateFlow7;
        function08 = function04;
        i17 = i3522;
        i18 = i36;
        stateFlow10 = mutableStateFlow4;
        stateFlow11 = stateFlow6;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        collectAsState = SnapshotStateKt.collectAsState(itemsFlow, null, startRestartGroup, (i5 >> 3) & 14, 1);
        ProvidableCompositionLocal<Context> localContext2222 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume3222 = startRestartGroup.consume(localContext2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context32222 = (Context) consume3222;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        CoroutineScope coroutineScope22222 = (CoroutineScope) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        BetTicketShareLayoutAnchor betTicketShareLayoutAnchor32222 = (BetTicketShareLayoutAnchor) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState32222 = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState42222 = (MutableState) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue5 = startRestartGroup.rememberedValue();
        final StateFlow stateFlow232222 = stateFlow10;
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState52222 = (MutableState) rememberedValue5;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1891786836);
        if (BetListDetailsScreen$lambda$16(collectAsState).isEmpty()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BetListDetailsScreen$lambda$19(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BetListDetailsScreen$lambda$20(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BetListDetailsScreen$lambda$22(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BetListDetailsScreen$lambda$23(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final BetShareChooserState BetListDetailsScreen$lambda$25(MutableState<BetShareChooserState> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailsScreen$lambda$28$lambda$27(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailsScreen$lambda$31$lambda$30$lambda$29(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final LottieComposition BetListDetailsScreen$lambda$41(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BetListDetailsScreen$lambda$49$lambda$48(State state) {
        return BetListDetailsScreen$lambda$16(state).size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer BetListDetailsScreen$lambda$51$lambda$50(LazyListState lazyListState) {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.firstOrNull((List) lazyListState.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo != null) {
            return Integer.valueOf(lazyListItemInfo.getIndex());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer BetListDetailsScreen$lambda$54$lambda$53(LazyListState lazyListState) {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.lastOrNull((List) lazyListState.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo != null) {
            return Integer.valueOf(lazyListItemInfo.getIndex());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailsScreen$lambda$59$lambda$58(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailsScreen$lambda$85$lambda$63$lambda$62$lambda$61(BetShareChooserState betShareChooserState, MutableState mutableState) {
        for (Bitmap bitmap : betShareChooserState.getBitmaps()) {
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailsScreen$lambda$85$lambda$66$lambda$65(float f, float f2, float f3, float f4, float f5, float f6, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(f);
        graphicsLayer.setScaleX(f3 * f2);
        graphicsLayer.setScaleY(f2 * f4);
        graphicsLayer.setTranslationY((1.0f - f5) * f6);
        graphicsLayer.mo5361setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.5f, 1.0f));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73(Context context, int i, CoroutineScope coroutineScope, State state, final MutableState mutableState, BetTicketShareLayoutAnchor betTicketShareLayoutAnchor, Function0 function0, int i2, int i3, int i4, MutableState mutableState2, Function2 function2, MutableState mutableState3, State state2, int i5) {
        final FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity != null && i < BetListDetailsScreen$lambda$16(state).size() && !BetListDetailsScreen$lambda$22(mutableState)) {
            BetListDetailsScreen$lambda$23(mutableState, true);
            Function0 function02 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$lambda$69;
                    BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$lambda$69 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$lambda$69(FragmentActivity.this, mutableState);
                    return BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$lambda$69;
                }
            };
            long intValue = BetListDetailsScreen$lambda$16(state).get(i).getId().intValue();
            BetsListModel betsListModel = BetListDetailsScreen$lambda$16(state).get(i);
            boolean z = betsListModel.getPlacedBets().size() == 1;
            int i6 = fragmentActivity.getResources().getDisplayMetrics().widthPixels;
            if (z) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BetListDetailsScreenKt$BetListDetailsScreen$16$3$1$2$1$1$1(betTicketShareLayoutAnchor, fragmentActivity, function0, i2, i3, i4, mutableState2, function02, function2, intValue, z, mutableState3, betsListModel, i6, state2, coroutineScope, i5, null), 3, null);
            } else {
                BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$shareTicketOffscreenAndFallback(fragmentActivity, betsListModel, i6, state2, coroutineScope, function02, function2, intValue, z, mutableState3, mutableState2, betTicketShareLayoutAnchor, function0, i2, i3, i4, i5);
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$lambda$69(FragmentActivity fragmentActivity, final MutableState mutableState) {
        View decorView;
        Window window = fragmentActivity.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.post(new Runnable() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    BetListDetailsScreenKt.BetListDetailsScreen$lambda$23(MutableState.this, false);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$finishLoadingAndOpenChooser(final Function0<Unit> function0, final FragmentActivity fragmentActivity, Function2<? super Long, ? super Function1<? super String, Unit>, Unit> function2, final long j, final boolean z, final MutableState<BetShareChooserState> mutableState, final List<Bitmap> list) {
        if (list.isEmpty()) {
            function0.invoke();
            SnackbarHelper.showShort(fragmentActivity, R.string.share_bet_capture_failed);
        } else {
            function2.invoke(Long.valueOf(j), new Function1() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$finishLoadingAndOpenChooser$lambda$71;
                    BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$finishLoadingAndOpenChooser$lambda$71 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$finishLoadingAndOpenChooser$lambda$71(Function0.this, list, fragmentActivity, j, z, mutableState, (String) obj);
                    return BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$finishLoadingAndOpenChooser$lambda$71;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$finishLoadingAndOpenChooser$lambda$71(Function0 function0, List list, FragmentActivity fragmentActivity, long j, boolean z, MutableState mutableState, String str) {
        function0.invoke();
        String str2 = str;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            mutableState.setValue(new BetShareChooserState(list, str, j, z));
            return Unit.INSTANCE;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bitmap bitmap = (Bitmap) it.next();
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        SnackbarHelper.showShort(fragmentActivity, R.string.share_bet_install_link_failed);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$shareTicketOffscreenAndFallback(final FragmentActivity fragmentActivity, BetsListModel betsListModel, int i, State<? extends OddType> state, final CoroutineScope coroutineScope, final Function0<Unit> function0, final Function2<? super Long, ? super Function1<? super String, Unit>, Unit> function2, final long j, final boolean z, final MutableState<BetShareChooserState> mutableState, final MutableState<Boolean> mutableState2, final BetTicketShareLayoutAnchor betTicketShareLayoutAnchor, final Function0<? extends Window> function02, final int i2, final int i3, final int i4, final int i5) {
        BetTicketShareBitmapRenderer.INSTANCE.renderOffscreen(fragmentActivity, betsListModel, BetListDetailsScreen$lambda$33(state), i, new Function1() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$shareTicketOffscreenAndFallback$lambda$72;
                BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$shareTicketOffscreenAndFallback$lambda$72 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$shareTicketOffscreenAndFallback$lambda$72(CoroutineScope.this, function0, fragmentActivity, function2, j, z, mutableState, mutableState2, betTicketShareLayoutAnchor, function02, i2, i3, i4, i5, (List) obj);
                return BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$shareTicketOffscreenAndFallback$lambda$72;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$shareTicketOffscreenAndFallback$lambda$72(CoroutineScope coroutineScope, Function0 function0, FragmentActivity fragmentActivity, Function2 function2, long j, boolean z, MutableState mutableState, MutableState mutableState2, BetTicketShareLayoutAnchor betTicketShareLayoutAnchor, Function0 function02, int i, int i2, int i3, int i4, List bitmaps) {
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        if (!bitmaps.isEmpty()) {
            BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$finishLoadingAndOpenChooser(function0, fragmentActivity, function2, j, z, mutableState, bitmaps);
        } else {
            BetListDetailsScreen$lambda$20(mutableState2, true);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BetListDetailsScreenKt$BetListDetailsScreen$16$3$1$2$1$1$shareTicketOffscreenAndFallback$1$1(betTicketShareLayoutAnchor, fragmentActivity, function02, i, i2, z, i3, i4, function0, mutableState2, function2, j, mutableState, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$77$lambda$76(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetListDetailsScreen$lambda$85$lambda$84$lambda$83$lambda$82(State state, final int i, final State state2, final State state3, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyListScope.items$default(LazyRow, BetListDetailsScreen$lambda$16(state).size(), null, null, ComposableLambdaKt.composableLambdaInstance(-921434777, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$BetListDetailsScreen$16$3$3$1$1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0045, code lost:
            
                r9 = org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt.BetListDetailsScreen$lambda$55(r3);
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(LazyItemScope items, int i2, Composer composer, int i3) {
                Integer BetListDetailsScreen$lambda$52;
                Integer BetListDetailsScreen$lambda$55;
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i3 & 48) == 0) {
                    i3 |= composer.changed(i2) ? 32 : 16;
                }
                if ((i3 & Opcodes.I2B) == 144 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-921434777, i3, -1, "org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BetListDetailsScreen.kt:607)");
                }
                BetListDetailsScreen$lambda$52 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$52(state2);
                float f = ((BetListDetailsScreen$lambda$52 != null && i2 == BetListDetailsScreen$lambda$52.intValue()) || (BetListDetailsScreen$lambda$55 != null && i2 == BetListDetailsScreen$lambda$55.intValue())) ? 0.3f : 1.0f;
                BoxKt.Box(BackgroundKt.m1024backgroundbw27NRU(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(12)), i2 == i ? ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor() : Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100))), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 6, null);
        return Unit.INSTANCE;
    }

    public static final void BetListDetailsScreenPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(206818911);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(206818911, i, -1, "org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenPreview (BetListDetailsScreen.kt:633)");
            }
            BetsListModel betsListModel = new BetsListModel();
            betsListModel.setId(12345);
            betsListModel.setFinalCoeficient(Double.valueOf(23.0d));
            betsListModel.setState(BetState.PENDING);
            betsListModel.setCreatedAt("2023.06.23");
            betsListModel.setPlacedBets(CollectionsKt.emptyList());
            betsListModel.setMoneyPlaced(456L);
            betsListModel.setMoneyReturned(392L);
            betsListModel.setTicketReturn(34);
            betsListModel.setUser(new UserDetailsDataModel());
            BetListDetailsScreen(null, StateFlowKt.MutableStateFlow(CollectionsKt.listOf(betsListModel)), null, 0, null, null, null, null, false, null, null, null, null, null, null, null, null, null, startRestartGroup, 0, 0, 262141);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BetListDetailsScreenPreview$lambda$88;
                    BetListDetailsScreenPreview$lambda$88 = BetListDetailsScreenKt.BetListDetailsScreenPreview$lambda$88(i, (Composer) obj, ((Integer) obj2).intValue());
                    return BetListDetailsScreenPreview$lambda$88;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<BetsListModel> BetListDetailsScreen$lambda$16(State<? extends List<? extends BetsListModel>> state) {
        return (List) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OddType BetListDetailsScreen$lambda$33(State<? extends OddType> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BetListDetailsScreen$lambda$39(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long BetListDetailsScreen$lambda$40(State<Long> state) {
        return state.getValue().longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer BetListDetailsScreen$lambda$52(State<Integer> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer BetListDetailsScreen$lambda$55(State<Integer> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CancelBetInfoModel BetListDetailsScreen$lambda$85$lambda$84$lambda$80(State<? extends CancelBetInfoModel> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SellBetInfoModel BetListDetailsScreen$lambda$85$lambda$84$lambda$81(State<? extends SellBetInfoModel> state) {
        return state.getValue();
    }
}
