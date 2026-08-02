package org.betup.ui.fragment.shop.compose;

import android.util.Log;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.mediarouter.media.MediaRouterJellybean;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.betup.model.remote.entity.shop.ShopDisplaySection;
import org.betup.model.remote.entity.shop.ShopPresentationMode;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: ShopSectionItemsLayout.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0007H\u0000\u001aH\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u0011\u001aU\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0015\u001aQ\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u00112\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0018\u001a\"\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0000\u001aU\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\u001b"}, d2 = {"TAG", "", "ShopItemOuterPaddingHorizontal", "Landroidx/compose/ui/unit/Dp;", "F", "ShopItemOuterPaddingVertical", "shopItemOuterPadding", "Landroidx/compose/ui/Modifier;", "shopSectionLazyItems", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "section", "Lorg/betup/model/remote/entity/shop/ShopDisplaySection;", "items", "", "Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", "onItemClick", "Lkotlin/Function1;", "onClaimClick", "ShopSectionItemsLayout", "modifier", "(Lorg/betup/model/remote/entity/shop/ShopDisplaySection;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", ShopSectionItemsLayoutKt.TAG, "item", "(Lorg/betup/model/remote/entity/shop/ShopDisplaySection;Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "groupShopItemsIntoRows", "ShopItemsGrid", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopSectionItemsLayoutKt {
    private static final float ShopItemOuterPaddingHorizontal = Dp.m7774constructorimpl(12);
    private static final float ShopItemOuterPaddingVertical = Dp.m7774constructorimpl(6);
    private static final String TAG = "ShopSectionItem";

    /* compiled from: ShopSectionItemsLayout.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShopDisplaySection.values().length];
            try {
                iArr[ShopDisplaySection.FIRST_PURCHASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShopDisplaySection.DAILY_DEALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShopDisplaySection.BUNDLES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShopDisplaySection.COIN_PACKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShopDisplaySection.FREE_REWARDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopItemsGrid$lambda$23(ShopDisplaySection shopDisplaySection, List list, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ShopItemsGrid(shopDisplaySection, list, function1, function12, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopSectionItem$lambda$15(ShopDisplaySection shopDisplaySection, ShopItemDataModel shopItemDataModel, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ShopSectionItem(shopDisplaySection, shopItemDataModel, function1, function12, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopSectionItem$lambda$17(ShopDisplaySection shopDisplaySection, ShopItemDataModel shopItemDataModel, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ShopSectionItem(shopDisplaySection, shopItemDataModel, function1, function12, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopSectionItemsLayout$lambda$10(ShopDisplaySection shopDisplaySection, List list, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ShopSectionItemsLayout(shopDisplaySection, list, function1, function12, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Modifier shopItemOuterPadding(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return PaddingKt.m1517paddingVpY3zN4(modifier, ShopItemOuterPaddingHorizontal, ShopItemOuterPaddingVertical);
    }

    public static final void shopSectionLazyItems(LazyListScope lazyListScope, final ShopDisplaySection section, final List<ShopItemDataModel> items, final Function1<? super ShopItemDataModel, Unit> onItemClick, final Function1<? super ShopItemDataModel, Unit> onClaimClick) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onClaimClick, "onClaimClick");
        int i = WhenMappings.$EnumSwitchMapping$0[section.ordinal()];
        if (i == 1) {
            final Function1 function1 = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionItemsLayoutKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object shopSectionLazyItems$lambda$0;
                    shopSectionLazyItems$lambda$0 = ShopSectionItemsLayoutKt.shopSectionLazyItems$lambda$0(ShopDisplaySection.this, (ShopItemDataModel) obj);
                    return shopSectionLazyItems$lambda$0;
                }
            };
            final ShopSectionItemsLayoutKt$shopSectionLazyItems$$inlined$items$default$1 shopSectionItemsLayoutKt$shopSectionLazyItems$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionItemsLayoutKt$shopSectionLazyItems$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(ShopItemDataModel shopItemDataModel) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((ShopItemDataModel) obj);
                }
            };
            lazyListScope.items(items.size(), new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionItemsLayoutKt$shopSectionLazyItems$$inlined$items$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i2) {
                    return Function1.this.invoke(items.get(i2));
                }
            }, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionItemsLayoutKt$shopSectionLazyItems$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i2) {
                    return Function1.this.invoke(items.get(i2));
                }
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionItemsLayoutKt$shopSectionLazyItems$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                    int i4;
                    ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
                    if ((i3 & 6) == 0) {
                        i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
                    } else {
                        i4 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i4 |= composer.changed(i2) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i4 & Opcodes.I2S) != 146, i4 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    ShopItemDataModel shopItemDataModel = (ShopItemDataModel) items.get(i2);
                    composer.startReplaceGroup(55938588);
                    ShopSectionItemsLayoutKt.ShopSectionItem(section, shopItemDataModel, onItemClick, onClaimClick, ShopSectionItemsLayoutKt.shopItemOuterPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null)), composer, 0, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return;
        }
        if (i == 2) {
            final Function1 function12 = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionItemsLayoutKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object shopSectionLazyItems$lambda$2;
                    shopSectionLazyItems$lambda$2 = ShopSectionItemsLayoutKt.shopSectionLazyItems$lambda$2(ShopDisplaySection.this, (ShopItemDataModel) obj);
                    return shopSectionLazyItems$lambda$2;
                }
            };
            final ShopSectionItemsLayoutKt$shopSectionLazyItems$$inlined$items$default$5 shopSectionItemsLayoutKt$shopSectionLazyItems$$inlined$items$default$5 = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionItemsLayoutKt$shopSectionLazyItems$$inlined$items$default$5
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(ShopItemDataModel shopItemDataModel) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((ShopItemDataModel) obj);
                }
            };
            lazyListScope.items(items.size(), new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionItemsLayoutKt$shopSectionLazyItems$$inlined$items$default$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i2) {
                    return Function1.this.invoke(items.get(i2));
                }
            }, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionItemsLayoutKt$shopSectionLazyItems$$inlined$items$default$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i2) {
                    return Function1.this.invoke(items.get(i2));
                }
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionItemsLayoutKt$shopSectionLazyItems$$inlined$items$default$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                    int i4;
                    ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
                    if ((i3 & 6) == 0) {
                        i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
                    } else {
                        i4 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i4 |= composer.changed(i2) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i4 & Opcodes.I2S) != 146, i4 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    ShopItemDataModel shopItemDataModel = (ShopItemDataModel) items.get(i2);
                    composer.startReplaceGroup(1908122579);
                    ShopSectionItemsLayoutKt.ShopSectionItem(section, shopItemDataModel, onItemClick, onClaimClick, ShopSectionItemsLayoutKt.shopItemOuterPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null)), composer, 0, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        } else {
            if (i != 3 && i != 4) {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            Iterator<T> it = groupShopItemsIntoRows(items).iterator();
            while (it.hasNext()) {
                final List list = (List) it.next();
                LazyListScope.item$default(lazyListScope, "row-" + section.name() + "-" + CollectionsKt.joinToString$default(list, "-", null, null, 0, null, new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionItemsLayoutKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        CharSequence shopSectionLazyItems$lambda$5$lambda$4;
                        shopSectionLazyItems$lambda$5$lambda$4 = ShopSectionItemsLayoutKt.shopSectionLazyItems$lambda$5$lambda$4((ShopItemDataModel) obj);
                        return shopSectionLazyItems$lambda$5$lambda$4;
                    }
                }, 30, null), null, ComposableLambdaKt.composableLambdaInstance(1635000623, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionItemsLayoutKt$shopSectionLazyItems$5$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i2) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i2 & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1635000623, i2, -1, "org.betup.ui.fragment.shop.compose.shopSectionLazyItems.<anonymous>.<anonymous> (ShopSectionItemsLayout.kt:73)");
                        }
                        if (list.size() == 1 && RangesKt.coerceIn(((ShopItemDataModel) CollectionsKt.first((List) list)).getColumnsInRow(), 1, 2) == 1) {
                            composer.startReplaceGroup(-920431828);
                            ShopSectionItemsLayoutKt.ShopSectionItem(section, (ShopItemDataModel) CollectionsKt.first((List) list), onItemClick, onClaimClick, ShopSectionItemsLayoutKt.shopItemOuterPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null)), composer, 0, 0);
                            composer.endReplaceGroup();
                        } else {
                            composer.startReplaceGroup(-919958303);
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                            List<ShopItemDataModel> list2 = list;
                            ShopDisplaySection shopDisplaySection = section;
                            Function1<ShopItemDataModel, Unit> function13 = onItemClick;
                            Function1<ShopItemDataModel, Unit> function14 = onClaimClick;
                            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer, 6);
                            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor);
                            } else {
                                composer.useNode();
                            }
                            Composer m4610constructorimpl = Updater.m4610constructorimpl(composer);
                            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer.startReplaceGroup(1666676318);
                            Iterator<T> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                ShopSectionItemsLayoutKt.ShopSectionItem(shopDisplaySection, (ShopItemDataModel) it2.next(), function13, function14, ShopSectionItemsLayoutKt.shopItemOuterPadding(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null)), composer, 0, 0);
                            }
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(1666693957);
                            if (list2.size() == 1) {
                                SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer, 0);
                            }
                            composer.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object shopSectionLazyItems$lambda$0(ShopDisplaySection shopDisplaySection, ShopItemDataModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "item-" + shopDisplaySection.name() + "-" + it.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object shopSectionLazyItems$lambda$2(ShopDisplaySection shopDisplaySection, ShopItemDataModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "item-" + shopDisplaySection.name() + "-" + it.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence shopSectionLazyItems$lambda$5$lambda$4(ShopItemDataModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return String.valueOf(it.getId());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShopSectionItemsLayout(final ShopDisplaySection section, final List<ShopItemDataModel> items, final Function1<? super ShopItemDataModel, Unit> onItemClick, final Function1<? super ShopItemDataModel, Unit> onClaimClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        int i5;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onClaimClick, "onClaimClick");
        Composer startRestartGroup = composer.startRestartGroup(-2111448842);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(section.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(items) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onItemClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(onClaimClick) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i3;
            if ((i4 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2111448842, i4, -1, "org.betup.ui.fragment.shop.compose.ShopSectionItemsLayout (ShopSectionItemsLayout.kt:118)");
                }
                i5 = WhenMappings.$EnumSwitchMapping$0[section.ordinal()];
                if (i5 != 1) {
                    startRestartGroup.startReplaceGroup(1918885519);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
                    startRestartGroup.startReplaceGroup(1331006827);
                    Iterator<T> it = items.iterator();
                    while (it.hasNext()) {
                        ShopSectionItem(section, (ShopItemDataModel) it.next(), onItemClick, onClaimClick, shopItemOuterPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null)), startRestartGroup, i4 & 8078, 0);
                    }
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceGroup();
                } else if (i5 == 2) {
                    startRestartGroup.startReplaceGroup(1919433103);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
                    Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(-283112478);
                    Iterator<T> it2 = items.iterator();
                    while (it2.hasNext()) {
                        ShopSectionItem(section, (ShopItemDataModel) it2.next(), onItemClick, onClaimClick, shopItemOuterPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null)), startRestartGroup, i4 & 8078, 0);
                    }
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceGroup();
                } else if (i5 == 3 || i5 == 4) {
                    startRestartGroup.startReplaceGroup(1919999225);
                    ShopItemsGrid(section, items, onItemClick, onClaimClick, modifier3, startRestartGroup, i4 & WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (i5 != 5) {
                        startRestartGroup.startReplaceGroup(-1877764120);
                        startRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-1877718246);
                    startRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionItemsLayoutKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ShopSectionItemsLayout$lambda$10;
                        ShopSectionItemsLayout$lambda$10 = ShopSectionItemsLayoutKt.ShopSectionItemsLayout$lambda$10(ShopDisplaySection.this, items, onItemClick, onClaimClick, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return ShopSectionItemsLayout$lambda$10;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 9363) == 9362) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        i5 = WhenMappings.$EnumSwitchMapping$0[section.ordinal()];
        if (i5 != 1) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopSectionItem$lambda$12$lambda$11(ShopItemDataModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShopSectionItem(final ShopDisplaySection shopDisplaySection, final ShopItemDataModel shopItemDataModel, final Function1<? super ShopItemDataModel, Unit> function1, Function1<? super ShopItemDataModel, Unit> function12, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Function1<? super ShopItemDataModel, Unit> function13;
        int i4;
        Modifier modifier2;
        int i5;
        Function1<? super ShopItemDataModel, Unit> function14;
        boolean z;
        Object rememberedValue;
        Modifier modifier3;
        int i6;
        boolean z2;
        final Modifier modifier4;
        Composer startRestartGroup = composer.startRestartGroup(-697057893);
        if ((i2 & 2) != 0) {
            i3 = i | 48;
        } else if ((i & 48) == 0) {
            i3 = (startRestartGroup.changed(shopItemDataModel) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function13 = function12;
            i3 |= startRestartGroup.changedInstance(function13) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
                i5 = i3;
                if ((i5 & 9361) == 9360 || !startRestartGroup.getSkipping()) {
                    if (i7 != 0) {
                        startRestartGroup.startReplaceGroup(1849434622);
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionItemsLayoutKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit ShopSectionItem$lambda$12$lambda$11;
                                    ShopSectionItem$lambda$12$lambda$11 = ShopSectionItemsLayoutKt.ShopSectionItem$lambda$12$lambda$11((ShopItemDataModel) obj);
                                    return ShopSectionItem$lambda$12$lambda$11;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceGroup();
                        function14 = (Function1) rememberedValue2;
                    } else {
                        function14 = function13;
                    }
                    Modifier modifier5 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-697057893, i5, -1, "org.betup.ui.fragment.shop.compose.ShopSectionItem (ShopSectionItemsLayout.kt:170)");
                    }
                    startRestartGroup.startReplaceGroup(5004770);
                    int i8 = i5 & 112;
                    z = i8 == 32;
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionItemsLayoutKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit ShopSectionItem$lambda$14$lambda$13;
                                ShopSectionItem$lambda$14$lambda$13 = ShopSectionItemsLayoutKt.ShopSectionItem$lambda$14$lambda$13(ShopItemDataModel.this);
                                return ShopSectionItem$lambda$14$lambda$13;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                    startRestartGroup.startReplaceGroup(142284900);
                    if (shopItemDataModel.getUsesHtmlPresentation()) {
                        modifier3 = fillMaxWidth$default;
                        i6 = 1;
                        if (ShopHtmlItemCardKt.ShopHtmlItemCard(shopItemDataModel, function1, function14, fillMaxWidth$default, 0.0f, startRestartGroup, (i5 >> 3) & 1022, 16)) {
                            z2 = true;
                            startRestartGroup.endReplaceGroup();
                            if (!z2) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                    final Function1<? super ShopItemDataModel, Unit> function15 = function14;
                                    final Modifier modifier6 = modifier5;
                                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionItemsLayoutKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit ShopSectionItem$lambda$15;
                                            ShopSectionItem$lambda$15 = ShopSectionItemsLayoutKt.ShopSectionItem$lambda$15(ShopDisplaySection.this, shopItemDataModel, function1, function15, modifier6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                            return ShopSectionItem$lambda$15;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
                            ShopScreenKt.ShopCard(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i6, null), shopItemDataModel, function1, startRestartGroup, i8 | 6 | (i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 0);
                            startRestartGroup.startReplaceGroup(-913161745);
                            if (ShopEntitlementUi.INSTANCE.hasActiveEntitlement(shopItemDataModel.getEntitlement())) {
                                EntitlementProgressChipKt.EntitlementProgressChip(shopItemDataModel, function14, PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(4), 0.0f, 2, null), startRestartGroup, ((i5 >> 3) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | ((i5 >> 6) & 112), 0);
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
                            function13 = function14;
                            modifier4 = modifier5;
                        }
                    } else {
                        modifier3 = fillMaxWidth$default;
                        i6 = 1;
                    }
                    z2 = false;
                    startRestartGroup.endReplaceGroup();
                    if (!z2) {
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                }
                ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionItemsLayoutKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ShopSectionItem$lambda$17;
                            ShopSectionItem$lambda$17 = ShopSectionItemsLayoutKt.ShopSectionItem$lambda$17(ShopDisplaySection.this, shopItemDataModel, function1, function13, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return ShopSectionItem$lambda$17;
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            i5 = i3;
            if ((i5 & 9361) == 9360) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(5004770);
            int i82 = i5 & 112;
            if (i82 == 32) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionItemsLayoutKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit ShopSectionItem$lambda$14$lambda$13;
                    ShopSectionItem$lambda$14$lambda$13 = ShopSectionItemsLayoutKt.ShopSectionItem$lambda$14$lambda$13(ShopItemDataModel.this);
                    return ShopSectionItem$lambda$14$lambda$13;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(142284900);
            if (shopItemDataModel.getUsesHtmlPresentation()) {
            }
            z2 = false;
            startRestartGroup.endReplaceGroup();
            if (!z2) {
            }
        }
        function13 = function12;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i3;
        if ((i5 & 9361) == 9360) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(5004770);
        int i822 = i5 & 112;
        if (i822 == 32) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionItemsLayoutKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit ShopSectionItem$lambda$14$lambda$13;
                ShopSectionItem$lambda$14$lambda$13 = ShopSectionItemsLayoutKt.ShopSectionItem$lambda$14$lambda$13(ShopItemDataModel.this);
                return ShopSectionItem$lambda$14$lambda$13;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
        Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(142284900);
        if (shopItemDataModel.getUsesHtmlPresentation()) {
        }
        z2 = false;
        startRestartGroup.endReplaceGroup();
        if (!z2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopSectionItem$lambda$14$lambda$13(ShopItemDataModel shopItemDataModel) {
        String storeCode = shopItemDataModel.getStoreCode();
        ShopPresentationMode presentationMode = shopItemDataModel.getPresentationMode();
        boolean usesHtmlPresentation = shopItemDataModel.getUsesHtmlPresentation();
        String htmlContent = shopItemDataModel.getHtmlContent();
        int length = htmlContent != null ? htmlContent.length() : 0;
        String htmlTemplateUrl = shopItemDataModel.getHtmlTemplateUrl();
        Log.d(TAG, "storeCode=" + storeCode + ", presentationMode=" + presentationMode + ", usesHtmlPresentation=" + usesHtmlPresentation + ", htmlContentLength=" + length + ", hasHtmlTemplateUrl=" + (!(htmlTemplateUrl == null || StringsKt.isBlank(htmlTemplateUrl))));
        return Unit.INSTANCE;
    }

    public static final List<List<ShopItemDataModel>> groupShopItemsIntoRows(List<ShopItemDataModel> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = new ArrayList();
        for (ShopItemDataModel shopItemDataModel : items) {
            int coerceIn = RangesKt.coerceIn(shopItemDataModel.getColumnsInRow(), 1, 2);
            if (coerceIn == 1) {
                arrayList.add(CollectionsKt.mutableListOf(shopItemDataModel));
            } else if (coerceIn == 2) {
                List list = (List) CollectionsKt.lastOrNull((List) arrayList);
                if (list == null || list.size() >= 2 || RangesKt.coerceIn(((ShopItemDataModel) CollectionsKt.first(list)).getColumnsInRow(), 1, 2) != 2) {
                    arrayList.add(CollectionsKt.mutableListOf(shopItemDataModel));
                } else {
                    list.add(shopItemDataModel);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ShopItemsGrid(final ShopDisplaySection shopDisplaySection, final List<ShopItemDataModel> list, final Function1<? super ShopItemDataModel, Unit> function1, final Function1<? super ShopItemDataModel, Unit> function12, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        boolean changed;
        Object rememberedValue;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Iterator it;
        Iterator it2;
        String str;
        float f;
        int i5;
        String str2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-469827281);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(shopDisplaySection.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
                if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-469827281, i3, -1, "org.betup.ui.fragment.shop.compose.ShopItemsGrid (ShopSectionItemsLayout.kt:234)");
                    }
                    startRestartGroup.startReplaceGroup(5004770);
                    changed = startRestartGroup.changed(list);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = groupShopItemsIntoRows(list);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    List list2 = (List) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    float f2 = 8;
                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f2));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                    String str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Modifier modifier4 = modifier3;
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
                    startRestartGroup.startReplaceGroup(860889709);
                    it = list2.iterator();
                    while (it.hasNext()) {
                        List list3 = (List) it.next();
                        int i6 = 1;
                        if (list3.size() != 1) {
                            it2 = it;
                            str = str3;
                            f = f2;
                            i5 = 6;
                        } else if (RangesKt.coerceIn(((ShopItemDataModel) CollectionsKt.first(list3)).getColumnsInRow(), 1, 2) == 1) {
                            startRestartGroup.startReplaceGroup(-47249975);
                            it2 = it;
                            f = f2;
                            ShopSectionItem(shopDisplaySection, (ShopItemDataModel) CollectionsKt.first(list3), function1, function12, shopItemOuterPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null)), startRestartGroup, i3 & 8078, 0);
                            startRestartGroup.endReplaceGroup();
                            str2 = str3;
                            it = it2;
                            str3 = str2;
                            f2 = f;
                        } else {
                            it2 = it;
                            str = str3;
                            f = f2;
                            i5 = 6;
                        }
                        startRestartGroup.startReplaceGroup(-46858290);
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42, Alignment.INSTANCE.getTop(), startRestartGroup, i5);
                        char c = 17958;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(1458176161);
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            ShopSectionItem(shopDisplaySection, (ShopItemDataModel) it3.next(), function1, function12, shopItemOuterPadding(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null)), startRestartGroup, i3 & 8078, 0);
                            i6 = i6;
                            c = c;
                            str = str;
                        }
                        str2 = str;
                        int i7 = i6;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1458191048);
                        if (list3.size() == i7) {
                            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
                        }
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceGroup();
                        it = it2;
                        str3 = str2;
                        f2 = f;
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
                    modifier2 = modifier4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier5 = modifier2;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionItemsLayoutKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ShopItemsGrid$lambda$23;
                            ShopItemsGrid$lambda$23 = ShopSectionItemsLayoutKt.ShopItemsGrid$lambda$23(ShopDisplaySection.this, list, function1, function12, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return ShopItemsGrid$lambda$23;
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            if ((i3 & 9363) == 9362) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(5004770);
            changed = startRestartGroup.changed(list);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = groupShopItemsIntoRows(list);
            startRestartGroup.updateRememberedValue(rememberedValue);
            List list22 = (List) rememberedValue;
            startRestartGroup.endReplaceGroup();
            float f22 = 8;
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_43 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f22));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_43, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            String str32 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            Modifier modifier42 = modifier3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
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
            startRestartGroup.startReplaceGroup(860889709);
            it = list22.iterator();
            while (it.hasNext()) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier42;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(5004770);
        changed = startRestartGroup.changed(list);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = groupShopItemsIntoRows(list);
        startRestartGroup.updateRememberedValue(rememberedValue);
        List list222 = (List) rememberedValue;
        startRestartGroup.endReplaceGroup();
        float f222 = 8;
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_432 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f222));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_432, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
        String str322 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        Modifier modifier422 = modifier3;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
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
        startRestartGroup.startReplaceGroup(860889709);
        it = list222.iterator();
        while (it.hasNext()) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier422;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
