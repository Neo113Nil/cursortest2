package org.betup.ui.fragment.shop.compose;

import android.util.Log;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridSpanKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.betup.R;
import org.betup.ui.common.compose.SwipeRefreshContainerKt;
import org.betup.ui.common.video.VideoOfferAvailabilityPhase;
import org.betup.ui.common.video.VideoOfferMotion;
import org.betup.ui.common.video.VideoOfferMotionKt;
import org.betup.ui.fragment.shop.ShopItemType;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: ShopScreen.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0014\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010\u0010\u001a;\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010\u0017\u001a3\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u000e2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001e\u001a\r\u0010 \u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001e\u001a\r\u0010!\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001e\u001a\r\u0010\"\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001e\u001a\r\u0010#\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001e\u001a\r\u0010$\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001e\"\u0018\u0010\u0018\u001a\u00020\u0006*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006%²\u0006\f\u0010&\u001a\u0004\u0018\u00010\u0004X\u008a\u0084\u0002²\u0006\n\u0010'\u001a\u00020\u0006X\u008a\u0084\u0002²\u0006\n\u0010(\u001a\u00020\u0006X\u008a\u0084\u0002²\u0006\f\u0010)\u001a\u0004\u0018\u00010\tX\u008a\u0084\u0002"}, d2 = {"ShopScreenWithState", "", "shopContent", "Lkotlinx/coroutines/flow/StateFlow;", "Lorg/betup/ui/fragment/shop/compose/ShopContentUiModel;", "isLoading", "", "isRefreshing", "error", "", "onRefresh", "Lkotlin/Function0;", "onItemClick", "Lkotlin/Function1;", "Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", "onClaimClick", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ShopScreen", "modifier", "Landroidx/compose/ui/Modifier;", "shopItems", "", "onClick", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "isDailyBonusBanner", "(Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;)Z", "ShopCard", "shopItem", "(Landroidx/compose/ui/Modifier;Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PreviewShopScreen", "(Landroidx/compose/runtime/Composer;I)V", "PreviewEmptyShop", "PreviewSingleItem", "PreviewOnlyBanners", "PreviewOnlyBonuses", "PreviewMixedTypes", "PreviewEdgeCases", "app_release", "content", "loading", "refreshing", "errorMessage"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopScreenKt {

    /* compiled from: ShopScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoOfferAvailabilityPhase.values().length];
            try {
                iArr[VideoOfferAvailabilityPhase.CHECKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoOfferAvailabilityPhase.ACTION_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoOfferAvailabilityPhase.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoOfferAvailabilityPhase.UNAVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoOfferAvailabilityPhase.COOLDOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoOfferAvailabilityPhase.LIMIT_REACHED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewEdgeCases$lambda$36(int i, Composer composer, int i2) {
        PreviewEdgeCases(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewEmptyShop$lambda$26(int i, Composer composer, int i2) {
        PreviewEmptyShop(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewMixedTypes$lambda$34(int i, Composer composer, int i2) {
        PreviewMixedTypes(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewOnlyBanners$lambda$30(int i, Composer composer, int i2) {
        PreviewOnlyBanners(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewOnlyBonuses$lambda$32(int i, Composer composer, int i2) {
        PreviewOnlyBonuses(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewShopScreen$lambda$24(int i, Composer composer, int i2) {
        PreviewShopScreen(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSingleItem$lambda$28(int i, Composer composer, int i2) {
        PreviewSingleItem(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopCard$lambda$22(Modifier modifier, ShopItemDataModel shopItemDataModel, Function1 function1, int i, int i2, Composer composer, int i3) {
        ShopCard(modifier, shopItemDataModel, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopScreen$lambda$15(Modifier modifier, List list, Function1 function1, int i, int i2, Composer composer, int i3) {
        ShopScreen(modifier, list, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopScreenWithState$lambda$6(StateFlow stateFlow, StateFlow stateFlow2, StateFlow stateFlow3, StateFlow stateFlow4, Function0 function0, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        ShopScreenWithState(stateFlow, stateFlow2, stateFlow3, stateFlow4, function0, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopScreenWithState$lambda$1$lambda$0(ShopItemDataModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShopScreenWithState(final StateFlow<ShopContentUiModel> shopContent, final StateFlow<Boolean> isLoading, final StateFlow<Boolean> isRefreshing, final StateFlow<String> error, final Function0<Unit> onRefresh, final Function1<? super ShopItemDataModel, Unit> onItemClick, Function1<? super ShopItemDataModel, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        final Function1<? super ShopItemDataModel, Unit> function12;
        final Function1<? super ShopItemDataModel, Unit> function13;
        final State collectAsState;
        State collectAsState2;
        Function1<? super ShopItemDataModel, Unit> function14;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(shopContent, "shopContent");
        Intrinsics.checkNotNullParameter(isLoading, "isLoading");
        Intrinsics.checkNotNullParameter(isRefreshing, "isRefreshing");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Composer startRestartGroup = composer.startRestartGroup(-1409384843);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(shopContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(isLoading) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(isRefreshing) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(error) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(onRefresh) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= startRestartGroup.changedInstance(onItemClick) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 1048576 : 524288;
            if ((599187 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                if (i4 == 0) {
                    startRestartGroup.startReplaceGroup(1849434622);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit ShopScreenWithState$lambda$1$lambda$0;
                                ShopScreenWithState$lambda$1$lambda$0 = ShopScreenKt.ShopScreenWithState$lambda$1$lambda$0((ShopItemDataModel) obj);
                                return ShopScreenWithState$lambda$1$lambda$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    function13 = (Function1) rememberedValue;
                } else {
                    function13 = function12;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1409384843, i3, -1, "org.betup.ui.fragment.shop.compose.ShopScreenWithState (ShopScreen.kt:67)");
                }
                collectAsState = SnapshotStateKt.collectAsState(shopContent, null, startRestartGroup, i3 & 14, 1);
                collectAsState2 = SnapshotStateKt.collectAsState(isLoading, null, startRestartGroup, (i3 >> 3) & 14, 1);
                int i5 = i3 >> 6;
                State collectAsState3 = SnapshotStateKt.collectAsState(isRefreshing, null, startRestartGroup, i5 & 14, 1);
                State collectAsState4 = SnapshotStateKt.collectAsState(error, null, startRestartGroup, (i3 >> 9) & 14, 1);
                if (!ShopScreenWithState$lambda$3(collectAsState2) && ShopScreenWithState$lambda$2(collectAsState) == null) {
                    startRestartGroup.startReplaceGroup(-1504117880);
                    ShopLoadingScreenKt.ShopLoadingScreen(startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                    function14 = function13;
                    composer2 = startRestartGroup;
                } else if (ShopScreenWithState$lambda$2(collectAsState) == null) {
                    startRestartGroup.startReplaceGroup(617042863);
                    function14 = function13;
                    composer2 = startRestartGroup;
                    SwipeRefreshContainerKt.SwipeRefreshContainer(null, ShopScreenWithState$lambda$4(collectAsState3), onRefresh, false, ComposableLambdaKt.rememberComposableLambda(1102890435, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$ShopScreenWithState$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            ShopContentUiModel ShopScreenWithState$lambda$2;
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1102890435, i6, -1, "org.betup.ui.fragment.shop.compose.ShopScreenWithState.<anonymous> (ShopScreen.kt:80)");
                            }
                            ShopScreenWithState$lambda$2 = ShopScreenKt.ShopScreenWithState$lambda$2(collectAsState);
                            Intrinsics.checkNotNull(ShopScreenWithState$lambda$2);
                            ShopSectionedScreenKt.ShopSectionedScreen(ShopScreenWithState$lambda$2, onItemClick, function13, composer3, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), startRestartGroup, (i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 24576, 9);
                    composer2.endReplaceGroup();
                } else {
                    function14 = function13;
                    composer2 = startRestartGroup;
                    if (ShopScreenWithState$lambda$5(collectAsState4) != null) {
                        composer2.startReplaceGroup(-1504104135);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1504103448);
                        ShopLoadingScreenKt.ShopLoadingScreen(composer2, 0);
                        composer2.endReplaceGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function12 = function14;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ShopScreenWithState$lambda$6;
                        ShopScreenWithState$lambda$6 = ShopScreenKt.ShopScreenWithState$lambda$6(StateFlow.this, isLoading, isRefreshing, error, onRefresh, onItemClick, function12, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return ShopScreenWithState$lambda$6;
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        if ((599187 & i3) == 599186) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        collectAsState = SnapshotStateKt.collectAsState(shopContent, null, startRestartGroup, i3 & 14, 1);
        collectAsState2 = SnapshotStateKt.collectAsState(isLoading, null, startRestartGroup, (i3 >> 3) & 14, 1);
        int i52 = i3 >> 6;
        State collectAsState32 = SnapshotStateKt.collectAsState(isRefreshing, null, startRestartGroup, i52 & 14, 1);
        State collectAsState42 = SnapshotStateKt.collectAsState(error, null, startRestartGroup, (i3 >> 9) & 14, 1);
        if (!ShopScreenWithState$lambda$3(collectAsState2)) {
        }
        if (ShopScreenWithState$lambda$2(collectAsState) == null) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        function12 = function14;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopScreen$lambda$8$lambda$7(ShopItemDataModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShopScreen(Modifier modifier, final List<ShopItemDataModel> shopItems, Function1<? super ShopItemDataModel, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function1<? super ShopItemDataModel, Unit> function12;
        Modifier.Companion companion;
        final Function1<? super ShopItemDataModel, Unit> function13;
        List<ShopItemDataModel> list;
        Iterator<T> it;
        final boolean z;
        boolean changedInstance;
        Object rememberedValue;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(shopItems, "shopItems");
        Composer startRestartGroup = composer.startRestartGroup(4199934);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= startRestartGroup.changedInstance(shopItems) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
            if ((i3 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (i5 == 0) {
                    startRestartGroup.startReplaceGroup(1849434622);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit ShopScreen$lambda$8$lambda$7;
                                ShopScreen$lambda$8$lambda$7 = ShopScreenKt.ShopScreen$lambda$8$lambda$7((ShopItemDataModel) obj);
                                return ShopScreen$lambda$8$lambda$7;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    function13 = (Function1) rememberedValue2;
                } else {
                    function13 = function12;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(4199934, i3, -1, "org.betup.ui.fragment.shop.compose.ShopScreen (ShopScreen.kt:97)");
                }
                list = shopItems;
                int i6 = 0;
                for (Object obj : list) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    ShopItemDataModel shopItemDataModel = (ShopItemDataModel) obj;
                    Log.d("ShopScreen", "Item " + i6 + ": id=" + shopItemDataModel.getId() + ", type=" + shopItemDataModel.getType() + ", title='" + shopItemDataModel.getTitle() + "', price='" + shopItemDataModel.getPrice() + "'");
                    i6 = i7;
                }
                if ((list instanceof Collection) || !list.isEmpty()) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        if (((ShopItemDataModel) it.next()).getPopular()) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                GridCells.Fixed fixed = new GridCells.Fixed(2);
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                float f = 6;
                PaddingValues m1512PaddingValuesa9UjIt4 = PaddingKt.m1512PaddingValuesa9UjIt4(Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(34));
                startRestartGroup.startReplaceGroup(-1746271574);
                changedInstance = ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | startRestartGroup.changedInstance(shopItems) | startRestartGroup.changed(z);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit ShopScreen$lambda$14$lambda$13;
                            ShopScreen$lambda$14$lambda$13 = ShopScreenKt.ShopScreen$lambda$14$lambda$13(shopItems, z, function13, (LazyGridScope) obj2);
                            return ShopScreen$lambda$14$lambda$13;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                Function1<? super ShopItemDataModel, Unit> function14 = function13;
                LazyGridDslKt.LazyVerticalGrid(fixed, fillMaxSize$default, null, m1512PaddingValuesa9UjIt4, false, null, null, null, false, null, (Function1) rememberedValue, startRestartGroup, 0, 0, 1012);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function12 = function14;
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier3 = companion;
                final Function1<? super ShopItemDataModel, Unit> function15 = function12;
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit ShopScreen$lambda$15;
                        ShopScreen$lambda$15 = ShopScreenKt.ShopScreen$lambda$15(Modifier.this, shopItems, function15, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        return ShopScreen$lambda$15;
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        if ((i3 & Opcodes.I2S) == 146) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        list = shopItems;
        int i62 = 0;
        while (r6.hasNext()) {
        }
        if (list instanceof Collection) {
        }
        it = list.iterator();
        while (it.hasNext()) {
        }
        z = false;
        GridCells.Fixed fixed2 = new GridCells.Fixed(2);
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        float f2 = 6;
        PaddingValues m1512PaddingValuesa9UjIt42 = PaddingKt.m1512PaddingValuesa9UjIt4(Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(34));
        startRestartGroup.startReplaceGroup(-1746271574);
        changedInstance = ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | startRestartGroup.changedInstance(shopItems) | startRestartGroup.changed(z);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit ShopScreen$lambda$14$lambda$13;
                ShopScreen$lambda$14$lambda$13 = ShopScreenKt.ShopScreen$lambda$14$lambda$13(shopItems, z, function13, (LazyGridScope) obj2);
                return ShopScreen$lambda$14$lambda$13;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Function1<? super ShopItemDataModel, Unit> function142 = function13;
        LazyGridDslKt.LazyVerticalGrid(fixed2, fillMaxSize$default2, null, m1512PaddingValuesa9UjIt42, false, null, null, null, false, null, (Function1) rememberedValue, startRestartGroup, 0, 0, 1012);
        if (ComposerKt.isTraceInProgress()) {
        }
        function12 = function142;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopScreen$lambda$14$lambda$13(final List list, final boolean z, final Function1 function1, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        final Function2 function2 = new Function2() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                GridItemSpan ShopScreen$lambda$14$lambda$13$lambda$11;
                ShopScreen$lambda$14$lambda$13$lambda$11 = ShopScreenKt.ShopScreen$lambda$14$lambda$13$lambda$11((LazyGridItemSpanScope) obj, (ShopItemDataModel) obj2);
                return ShopScreen$lambda$14$lambda$13$lambda$11;
            }
        };
        final ShopScreenKt$ShopScreen$lambda$14$lambda$13$$inlined$items$default$1 shopScreenKt$ShopScreen$lambda$14$lambda$13$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$ShopScreen$lambda$14$lambda$13$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(ShopItemDataModel shopItemDataModel) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ShopItemDataModel) obj);
            }
        };
        LazyVerticalGrid.items(list.size(), null, new Function2<LazyGridItemSpanScope, Integer, GridItemSpan>() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$ShopScreen$lambda$14$lambda$13$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
                return GridItemSpan.m1637boximpl(m14133invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
            }

            /* renamed from: invoke-_-orMbw, reason: not valid java name */
            public final long m14133invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
                return ((GridItemSpan) Function2.this.invoke(lazyGridItemSpanScope, list.get(i))).getPackedValue();
            }
        }, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$ShopScreen$lambda$14$lambda$13$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(699646206, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$ShopScreen$lambda$14$lambda$13$$inlined$items$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyGridItemScope lazyGridItemScope, int i, Composer composer, int i2) {
                int i3;
                float m7774constructorimpl;
                ComposerKt.sourceInformation(composer, "C542@23993L22:LazyGridDsl.kt#7791vq");
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & Opcodes.I2S) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(699646206, i3, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
                }
                ShopItemDataModel shopItemDataModel = (ShopItemDataModel) list.get(i);
                composer.startReplaceGroup(384495264);
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                if (z) {
                    if (shopItemDataModel.getPopular()) {
                        m7774constructorimpl = Dp.m7774constructorimpl(6);
                    } else {
                        m7774constructorimpl = Dp.m7774constructorimpl(3);
                    }
                } else {
                    m7774constructorimpl = Dp.m7774constructorimpl(6);
                }
                ShopScreenKt.ShopCard(PaddingKt.m1516padding3ABfNKs(fillMaxWidth$default, m7774constructorimpl), shopItemDataModel, function1, composer, 0, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GridItemSpan ShopScreen$lambda$14$lambda$13$lambda$11(LazyGridItemSpanScope items, ShopItemDataModel shopItem) {
        long GridItemSpan;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        Intrinsics.checkNotNullParameter(shopItem, "shopItem");
        if (Intrinsics.areEqual(shopItem.getStoreCode(), "new_shop_no_ads") || Intrinsics.areEqual(shopItem.getStoreCode(), "new_shop_small_banner")) {
            GridItemSpan = LazyGridSpanKt.GridItemSpan(2);
        } else {
            GridItemSpan = LazyGridSpanKt.GridItemSpan(1);
        }
        return GridItemSpan.m1637boximpl(GridItemSpan);
    }

    private static final boolean isDailyBonusBanner(ShopItemDataModel shopItemDataModel) {
        return shopItemDataModel.getType() == ShopItemType.Banner && shopItemDataModel.getEffectCoef() != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0343  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShopCard(Modifier modifier, final ShopItemDataModel shopItem, final Function1<? super ShopItemDataModel, Unit> onClick, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final VideoOfferMotion videoOfferMotion;
        float f;
        String str;
        String stringResource;
        boolean z;
        Object rememberedValue;
        Composer composer2;
        Intrinsics.checkNotNullParameter(shopItem, "shopItem");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1894568932);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= startRestartGroup.changed(shopItem) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1894568932, i3, -1, "org.betup.ui.fragment.shop.compose.ShopCard (ShopScreen.kt:159)");
            }
            boolean z2 = shopItem.getId() == -1;
            boolean z3 = z2 && !shopItem.isVideoRewardAvailable();
            startRestartGroup.startReplaceGroup(-385380278);
            if (z2) {
                videoOfferMotion = VideoOfferMotionKt.rememberVideoOfferMotion(shopItem.getVideoOfferPhase(), startRestartGroup, 0);
            } else {
                videoOfferMotion = new VideoOfferMotion(1.0f, "");
            }
            startRestartGroup.endReplaceGroup();
            switch (WhenMappings.$EnumSwitchMapping$0[shopItem.getVideoOfferPhase().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f = 1.0f;
                    break;
                case 4:
                    f = 0.72f;
                    break;
                case 5:
                case 6:
                    f = 0.5f;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            Log.d("ShopCard", "Rendering card for item " + shopItem.getId() + ": type=" + shopItem.getType() + ", title='" + shopItem.getTitle() + "', price='" + shopItem.getPrice() + "', isVideoRewardDisabled=" + z3);
            Modifier.Companion companion = Modifier.INSTANCE;
            startRestartGroup.startReplaceGroup(5004770);
            boolean changed = startRestartGroup.changed(videoOfferMotion);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit ShopCard$lambda$17$lambda$16;
                        ShopCard$lambda$17$lambda$16 = ShopScreenKt.ShopCard$lambda$17$lambda$16(VideoOfferMotion.this, (GraphicsLayerScope) obj);
                        return ShopCard$lambda$17$lambda$16;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            Modifier alpha = AlphaKt.alpha(GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) rememberedValue2), z2 ? f : 1.0f);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, alpha);
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
            Modifier m1549height3ABfNKs = SizeKt.m1549height3ABfNKs(modifier3, Dp.m7774constructorimpl(200));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1549height3ABfNKs);
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
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            boolean z4 = shopItem.getPrice().length() > 0 || (shopItem.getType() == ShopItemType.Bonus && shopItem.getPrice().length() == 0);
            startRestartGroup.startReplaceGroup(2059751670);
            if (shopItem.getPrice().length() > 0) {
                stringResource = shopItem.getPrice();
            } else if (shopItem.getType() != ShopItemType.Bonus) {
                str = "";
                startRestartGroup.endReplaceGroup();
                RoundedCornerShape m1810RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(16));
                Modifier m1038borderziNgDLE = BorderKt.m1038borderziNgDLE(modifier3, Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(12)));
                startRestartGroup.startReplaceGroup(-1633490746);
                z = ((i3 & 112) != 32) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit ShopCard$lambda$21$lambda$20$lambda$19$lambda$18;
                            ShopCard$lambda$21$lambda$20$lambda$19$lambda$18 = ShopScreenKt.ShopCard$lambda$21$lambda$20$lambda$19$lambda$18(Function1.this, shopItem);
                            return ShopCard$lambda$21$lambda$20$lambda$19$lambda$18;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(m1038borderziNgDLE, false, null, null, (Function0) rememberedValue, 7, null);
                RoundedCornerShape roundedCornerShape = m1810RoundedCornerShape0680j_4;
                ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1591843126, true, new ShopScreenKt$ShopCard$2$1$2(shopItem, z3, z2, z4, onClick, videoOfferMotion, str), startRestartGroup, 54);
                Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                CardKt.Card(m1059clickableXHw0xAI$default, roundedCornerShape, null, null, null, rememberComposableLambda, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.startReplaceGroup(86112075);
                if (shopItem.getPopular()) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.popular_icon, composer2, 6), (String) null, boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                stringResource = StringResources_androidKt.stringResource(R.string.shop_price_free, startRestartGroup, 6);
            }
            str = stringResource;
            startRestartGroup.endReplaceGroup();
            RoundedCornerShape m1810RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(16));
            Modifier m1038borderziNgDLE2 = BorderKt.m1038borderziNgDLE(modifier3, Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(12)));
            startRestartGroup.startReplaceGroup(-1633490746);
            if ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) {
            }
            z = ((i3 & 112) != 32) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit ShopCard$lambda$21$lambda$20$lambda$19$lambda$18;
                    ShopCard$lambda$21$lambda$20$lambda$19$lambda$18 = ShopScreenKt.ShopCard$lambda$21$lambda$20$lambda$19$lambda$18(Function1.this, shopItem);
                    return ShopCard$lambda$21$lambda$20$lambda$19$lambda$18;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier m1059clickableXHw0xAI$default2 = ClickableKt.m1059clickableXHw0xAI$default(m1038borderziNgDLE2, false, null, null, (Function0) rememberedValue, 7, null);
            RoundedCornerShape roundedCornerShape2 = m1810RoundedCornerShape0680j_42;
            ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1591843126, true, new ShopScreenKt$ShopCard$2$1$2(shopItem, z3, z2, z4, onClick, videoOfferMotion, str), startRestartGroup, 54);
            Modifier modifier42 = modifier3;
            composer2 = startRestartGroup;
            CardKt.Card(m1059clickableXHw0xAI$default2, roundedCornerShape2, null, null, null, rememberComposableLambda2, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.startReplaceGroup(86112075);
            if (shopItem.getPopular()) {
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier42;
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier5 = modifier2;
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ShopCard$lambda$22;
                    ShopCard$lambda$22 = ShopScreenKt.ShopCard$lambda$22(Modifier.this, shopItem, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ShopCard$lambda$22;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopCard$lambda$17$lambda$16(VideoOfferMotion videoOfferMotion, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setScaleX(videoOfferMotion.getCardScale());
        graphicsLayer.setScaleY(videoOfferMotion.getCardScale());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopCard$lambda$21$lambda$20$lambda$19$lambda$18(Function1 function1, ShopItemDataModel shopItemDataModel) {
        function1.invoke(shopItemDataModel);
        return Unit.INSTANCE;
    }

    public static final void PreviewShopScreen(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1009560582);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1009560582, i, -1, "org.betup.ui.fragment.shop.compose.PreviewShopScreen (ShopScreen.kt:562)");
            }
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(10));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ShopScreen(null, ShopItemDataModel.INSTANCE.getMock(), null, startRestartGroup, 0, 5);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewShopScreen$lambda$24;
                    PreviewShopScreen$lambda$24 = ShopScreenKt.PreviewShopScreen$lambda$24(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewShopScreen$lambda$24;
                }
            });
        }
    }

    public static final void PreviewEmptyShop(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1632767577);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1632767577, i, -1, "org.betup.ui.fragment.shop.compose.PreviewEmptyShop (ShopScreen.kt:572)");
            }
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(10));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ShopScreen(null, CollectionsKt.emptyList(), null, startRestartGroup, 48, 5);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewEmptyShop$lambda$26;
                    PreviewEmptyShop$lambda$26 = ShopScreenKt.PreviewEmptyShop$lambda$26(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewEmptyShop$lambda$26;
                }
            });
        }
    }

    public static final void PreviewSingleItem(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(26289267);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(26289267, i, -1, "org.betup.ui.fragment.shop.compose.PreviewSingleItem (ShopScreen.kt:580)");
            }
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(10));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ShopScreen(null, CollectionsKt.listOf(new ShopItemDataModel(1L, ShopItemType.Regular, "Single Item", "Only one item in shop", SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, "$0.99", "", "", null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, 0, 1073741056, null)), null, startRestartGroup, 0, 5);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewSingleItem$lambda$28;
                    PreviewSingleItem$lambda$28 = ShopScreenKt.PreviewSingleItem$lambda$28(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewSingleItem$lambda$28;
                }
            });
        }
    }

    public static final void PreviewOnlyBanners(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1732634689);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1732634689, i, -1, "org.betup.ui.fragment.shop.compose.PreviewOnlyBanners (ShopScreen.kt:602)");
            }
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(10));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ShopScreen(null, CollectionsKt.listOf((Object[]) new ShopItemDataModel[]{new ShopItemDataModel(1L, ShopItemType.Banner, "Banner 1", "First banner", SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, "$1.99", "", "", null, true, false, null, 0, 0, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, 0, 1073741056, null), new ShopItemDataModel(2L, ShopItemType.Banner, "Banner 2", "Second banner", 200000L, "$2.99", "", "", null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, 0, 1073741056, null), new ShopItemDataModel(3L, ShopItemType.Banner, "Banner 3", "Third banner", 300000L, "$3.99", "", "", null, true, false, null, 0, 0, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, 0, 1073741056, null)}), null, startRestartGroup, 0, 5);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewOnlyBanners$lambda$30;
                    PreviewOnlyBanners$lambda$30 = ShopScreenKt.PreviewOnlyBanners$lambda$30(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewOnlyBanners$lambda$30;
                }
            });
        }
    }

    public static final void PreviewOnlyBonuses(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1674829307);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1674829307, i, -1, "org.betup.ui.fragment.shop.compose.PreviewOnlyBonuses (ShopScreen.kt:646)");
            }
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(10));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ShopScreen(null, CollectionsKt.listOf((Object[]) new ShopItemDataModel[]{new ShopItemDataModel(1L, ShopItemType.Bonus, "Bonus 1", "First bonus", 1000L, "", "", "", null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, 0, 1073741056, null), new ShopItemDataModel(2L, ShopItemType.Bonus, "Bonus 2", "Second bonus", ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, "", "", "", null, true, false, null, 0, 0, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, 0, 1073741056, null), new ShopItemDataModel(3L, ShopItemType.Bonus, "Bonus 3", "Third bonus", 3000L, "", "", "", null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, 0, 1073741056, null)}), null, startRestartGroup, 0, 5);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewOnlyBonuses$lambda$32;
                    PreviewOnlyBonuses$lambda$32 = ShopScreenKt.PreviewOnlyBonuses$lambda$32(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewOnlyBonuses$lambda$32;
                }
            });
        }
    }

    public static final void PreviewMixedTypes(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1641570762);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1641570762, i, -1, "org.betup.ui.fragment.shop.compose.PreviewMixedTypes (ShopScreen.kt:690)");
            }
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(10));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ShopScreen(null, CollectionsKt.listOf((Object[]) new ShopItemDataModel[]{new ShopItemDataModel(1L, ShopItemType.Banner, "Special Offer", "Limited time", 500000L, "$4.99", "", "", null, true, false, null, 0, 0, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, 0, 1073741056, null), new ShopItemDataModel(2L, ShopItemType.Bonus, "Free Reward", "Watch ad", 1000L, "", "", "", null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, 0, 1073741056, null), new ShopItemDataModel(3L, ShopItemType.Regular, "Regular Pack", "Good value", SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, "$1.99", "$2.99", "", null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, 0, 1073741056, null), new ShopItemDataModel(4L, ShopItemType.Regular, "Premium Pack", "Best value", 250000L, "$2.99", "", "", null, true, false, null, 0, 0, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, 0, 1073741056, null)}), null, startRestartGroup, 0, 5);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewMixedTypes$lambda$34;
                    PreviewMixedTypes$lambda$34 = ShopScreenKt.PreviewMixedTypes$lambda$34(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewMixedTypes$lambda$34;
                }
            });
        }
    }

    public static final void PreviewEdgeCases(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1813934262);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1813934262, i, -1, "org.betup.ui.fragment.shop.compose.PreviewEdgeCases (ShopScreen.kt:745)");
            }
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(10));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ShopScreen(null, CollectionsKt.listOf((Object[]) new ShopItemDataModel[]{new ShopItemDataModel(1L, ShopItemType.Regular, "This is an extremely long title that might cause layout issues and should be handled properly by the UI system", "Short desc", SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, "$1.99", "", "", null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, 0, 1073741056, null), new ShopItemDataModel(2L, ShopItemType.Regular, "Short Title", "This is a very long description that contains multiple sentences and should test how the layout handles text wrapping and overflow situations in the shop interface", 200000L, "$2.99", "", "", null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, 0, 1073741056, null), new ShopItemDataModel(3L, ShopItemType.Regular, "Mega Pack", "Ultimate value", 999999999999L, "$99.99", "", "", null, true, false, null, 0, 0, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, 0, 1073741056, null), new ShopItemDataModel(4L, ShopItemType.Bonus, "Tiny Reward", "Minimal bonus", 1L, "", "", "", null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, 0, 1073741056, null), new ShopItemDataModel(5L, ShopItemType.Regular, "", "", 50000L, "$0.99", "", "", null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, 0, 1073741056, null), new ShopItemDataModel(6L, ShopItemType.Regular, "Special Price", "Test price", 150000L, "€1.50", "", "", null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, 0, 1073741056, null)}), null, startRestartGroup, 0, 5);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewEdgeCases$lambda$36;
                    PreviewEdgeCases$lambda$36 = ShopScreenKt.PreviewEdgeCases$lambda$36(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewEdgeCases$lambda$36;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShopContentUiModel ShopScreenWithState$lambda$2(State<ShopContentUiModel> state) {
        return state.getValue();
    }

    private static final boolean ShopScreenWithState$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean ShopScreenWithState$lambda$4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final String ShopScreenWithState$lambda$5(State<String> state) {
        return state.getValue();
    }
}
