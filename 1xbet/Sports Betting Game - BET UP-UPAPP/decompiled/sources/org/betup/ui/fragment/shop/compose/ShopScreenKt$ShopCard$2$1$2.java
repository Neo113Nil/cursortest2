package org.betup.ui.fragment.shop.compose;

import android.util.Log;
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
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import coil3.compose.SingletonAsyncImageKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.ui.common.video.VideoOfferAvailabilityPhase;
import org.betup.ui.common.video.VideoOfferMotion;
import org.betup.ui.common.video.VideoOfferMotionKt;
import org.betup.ui.fragment.shop.ShopItemType;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.FormatHelper;

/* compiled from: ShopScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ShopScreenKt$ShopCard$2$1$2 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ boolean $isVideoRewardDisabled;
    final /* synthetic */ boolean $isVideoRewardItem;
    final /* synthetic */ VideoOfferMotion $offerMotion;
    final /* synthetic */ Function1<ShopItemDataModel, Unit> $onClick;
    final /* synthetic */ String $priceDisplayText;
    final /* synthetic */ ShopItemDataModel $shopItem;
    final /* synthetic */ boolean $showPriceButton;

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
                iArr[VideoOfferAvailabilityPhase.UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    ShopScreenKt$ShopCard$2$1$2(ShopItemDataModel shopItemDataModel, boolean z, boolean z2, boolean z3, Function1<? super ShopItemDataModel, Unit> function1, VideoOfferMotion videoOfferMotion, String str) {
        this.$shopItem = shopItemDataModel;
        this.$isVideoRewardDisabled = z;
        this.$isVideoRewardItem = z2;
        this.$showPriceButton = z3;
        this.$onClick = function1;
        this.$offerMotion = videoOfferMotion;
        this.$priceDisplayText = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11$lambda$9$lambda$8(Function1 function1, ShopItemDataModel shopItemDataModel) {
        function1.invoke(shopItemDataModel);
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope Card, Composer composer, int i) {
        boolean z;
        String str;
        String str2;
        Function1<ShopItemDataModel, Unit> function1;
        boolean z2;
        ShopItemDataModel shopItemDataModel;
        String str3;
        BoxScopeInstance boxScopeInstance;
        Composer composer2;
        int i2;
        String description;
        float f;
        float f2;
        String str4;
        String str5;
        int i3;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        int i4;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        int i5;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1591843126, i, -1, "org.betup.ui.fragment.shop.compose.ShopCard.<anonymous>.<anonymous>.<anonymous> (ShopScreen.kt:216)");
        }
        Modifier background$default = BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush(), null, 0.0f, 6, null);
        ShopItemDataModel shopItemDataModel2 = this.$shopItem;
        boolean z3 = this.$isVideoRewardDisabled;
        boolean z4 = this.$isVideoRewardItem;
        boolean z5 = this.$showPriceButton;
        Function1<ShopItemDataModel, Unit> function12 = this.$onClick;
        VideoOfferMotion videoOfferMotion = this.$offerMotion;
        String str18 = this.$priceDisplayText;
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, background$default);
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
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        composer.startReplaceGroup(2041612798);
        if (shopItemDataModel2.getImgUrl().length() <= 0) {
            z = false;
            str = str18;
            str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
            function1 = function12;
            z2 = z5;
            shopItemDataModel = shopItemDataModel2;
            str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
        } else if (StringsKt.startsWith$default(shopItemDataModel2.getImgUrl(), "drawable://", false, 2, (Object) null)) {
            composer.startReplaceGroup(-1134397690);
            String removePrefix = StringsKt.removePrefix(shopItemDataModel2.getImgUrl(), (CharSequence) "drawable://");
            if (Intrinsics.areEqual(removePrefix, "video_reward_shop_img")) {
                i5 = R.drawable.video_reward_shop_img;
            } else {
                Intrinsics.areEqual(removePrefix, "shop_video_reward");
                i5 = R.drawable.shop_video_reward;
            }
            z = false;
            str = str18;
            function1 = function12;
            z2 = z5;
            str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
            str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
            shopItemDataModel = shopItemDataModel2;
            ImageKt.Image(PainterResources_androidKt.painterResource(i5, composer, 0), (String) null, boxScopeInstance2.align(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(15), 0.0f, 0.0f, 13, null), Alignment.INSTANCE.getBottomCenter()), (Alignment) null, ContentScale.INSTANCE.getInside(), 0.0f, z3 ? ColorFilter.Companion.m5209tintxETnrds$default(ColorFilter.INSTANCE, ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), 0, 2, null) : null, composer, 24624, 40);
            composer.endReplaceGroup();
        } else {
            z = false;
            str = str18;
            str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
            function1 = function12;
            z2 = z5;
            shopItemDataModel = shopItemDataModel2;
            str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
            if (z4 && StringsKt.startsWith$default(shopItemDataModel.getImgUrl(), "http", false, 2, (Object) null)) {
                composer.startReplaceGroup(-1133053468);
                ShopCardChromeKt.ShopProductImage(shopItemDataModel.getImgUrl(), boxScopeInstance2.align(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(15), 0.0f, 0.0f, 13, null), Alignment.INSTANCE.getBottomCenter()), ContentScale.INSTANCE.getInside(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1132552942);
                composer.endReplaceGroup();
            }
        }
        composer.endReplaceGroup();
        composer.startReplaceGroup(2041678105);
        if (shopItemDataModel.getType() == ShopItemType.Bonus || shopItemDataModel.getImgUrl().length() <= 0 || StringsKt.startsWith$default(shopItemDataModel.getImgUrl(), "drawable://", z, 2, (Object) null)) {
            boxScopeInstance = boxScopeInstance2;
            composer2 = composer;
            i2 = 16;
        } else {
            boxScopeInstance = boxScopeInstance2;
            i2 = 16;
            composer2 = composer;
            SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(shopItemDataModel.getImgUrl(), null, OffsetKt.m1475offsetVpY3zN4(boxScopeInstance2.align(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getTopEnd()), Dp.m7774constructorimpl(6), Dp.m7774constructorimpl(-16)), null, null, null, null, 0.0f, null, 0, false, composer, 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
        }
        composer.endReplaceGroup();
        composer2.startReplaceGroup(2041699548);
        if (z4 && (shopItemDataModel.getVideoOfferPhase() == VideoOfferAvailabilityPhase.CHECKING || shopItemDataModel.getVideoOfferPhase() == VideoOfferAvailabilityPhase.ACTION_IN_PROGRESS)) {
            ProgressIndicatorKt.m3295CircularProgressIndicatorLxG7B9w(SizeKt.m1563size3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), Dp.m7774constructorimpl(32)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), Dp.m7774constructorimpl(3), 0L, 0, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 24);
        }
        composer.endReplaceGroup();
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, Alignment.INSTANCE.getStart(), composer2, 6);
        String str19 = str3;
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str19);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        String str20 = str2;
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str20);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer2.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        float f3 = 0;
        float f4 = 8;
        float f5 = 12;
        Modifier m1519paddingqDBjuR0 = PaddingKt.m1519paddingqDBjuR0(Modifier.INSTANCE, Dp.m7774constructorimpl(f4), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f4), Dp.m7774constructorimpl(f5));
        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str19);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m1519paddingqDBjuR0);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str20);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer2.createNode(constructor3);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        boolean areEqual = Intrinsics.areEqual(shopItemDataModel.getStoreCode(), "new_shop_no_ads");
        if (shopItemDataModel.getId() == -1) {
            composer2.startReplaceGroup(-1308823314);
            int i6 = WhenMappings.$EnumSwitchMapping$0[shopItemDataModel.getVideoOfferPhase().ordinal()];
            if (i6 == 1) {
                composer2.startReplaceGroup(-1150594184);
                description = StringResources_androidKt.stringResource(R.string.video_ads_checking_partners, composer2, 6);
                composer.endReplaceGroup();
            } else if (i6 != 2) {
                composer2.startReplaceGroup(-1150585286);
                description = StringResources_androidKt.stringResource(R.string.shop_video_reward_description, composer2, 6);
                composer.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1150588427);
                description = StringResources_androidKt.stringResource(R.string.video_ads_none_right_now, composer2, 6);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        } else if (shopItemDataModel.getEffectCoef() == null || shopItemDataModel.getEffectDuration() == null) {
            composer2.startReplaceGroup(-1150572849);
            composer.endReplaceGroup();
            description = shopItemDataModel.getDescription();
        } else {
            composer2.startReplaceGroup(-1150577963);
            Double effectCoef = shopItemDataModel.getEffectCoef();
            Intrinsics.checkNotNull(effectCoef);
            Integer valueOf = Integer.valueOf((int) effectCoef.doubleValue());
            Integer effectDuration = shopItemDataModel.getEffectDuration();
            Intrinsics.checkNotNull(effectDuration);
            description = StringResources_androidKt.stringResource(R.string.shop_effect_daily_bonus_format, new Object[]{valueOf, effectDuration}, composer2, 6);
            composer.endReplaceGroup();
        }
        if (shopItemDataModel.getVideoOfferPhase() == VideoOfferAvailabilityPhase.CHECKING) {
            description = VideoOfferMotionKt.withAnimatedEllipsis(description, videoOfferMotion.getAnimatedEllipsis());
        }
        String str21 = description;
        TextStyle textStyle = new TextStyle(0L, TextUnitKt.getSp(12), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777177, (DefaultConstructorMarker) null);
        Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(f5), 0.0f, 0.0f, 13, null);
        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str19);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, m1520paddingqDBjuR0$default);
        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str20);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer2.createNode(constructor4);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl4 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
        if (areEqual) {
            composer2.startReplaceGroup(1544711104);
            composer2.startReplaceGroup(-365814917);
            if (str21.length() > 0) {
                Alignment.Vertical top = Alignment.INSTANCE.getTop();
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
                Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, shopItemDataModel.getPopular() ? Dp.m7774constructorimpl(36) : Dp.m7774constructorimpl(f3), 0.0f, 11, null);
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, top, composer2, 54);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str19);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer2, m1520paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str20);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer2.createNode(constructor5);
                } else {
                    composer.useNode();
                }
                Composer m4610constructorimpl5 = Updater.m4610constructorimpl(composer);
                Updater.m4617setimpl(m4610constructorimpl5, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                f2 = f4;
                f = f3;
                str12 = "C89@4556L9:Column.kt#2w3rfo";
                str13 = str20;
                str14 = "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo";
                str15 = str19;
                str16 = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                str17 = "C101@5232L9:Row.kt#2w3rfo";
                TextKt.m3621Text4IGK_g("•", (Modifier) null, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer, 6, 0, 65530);
                TextKt.m3621Text4IGK_g(str21, (Modifier) null, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer, 0, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
            } else {
                f = f3;
                f2 = f4;
                str12 = "C89@4556L9:Column.kt#2w3rfo";
                str13 = str20;
                str14 = "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo";
                str15 = str19;
                str16 = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                str17 = "C101@5232L9:Row.kt#2w3rfo";
            }
            composer.endReplaceGroup();
            Alignment.Vertical top2 = Alignment.INSTANCE.getTop();
            float f6 = 4;
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f6));
            Modifier m1520paddingqDBjuR0$default3 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(f6), shopItemDataModel.getPopular() ? Dp.m7774constructorimpl(36) : Dp.m7774constructorimpl(f), 0.0f, 9, null);
            String str22 = str14;
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, str22);
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42, top2, composer2, 54);
            String str23 = str15;
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str23);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer2, m1520paddingqDBjuR0$default3);
            Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
            String str24 = str13;
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str24);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer2.createNode(constructor6);
            } else {
                composer.useNode();
            }
            Composer m4610constructorimpl6 = Updater.m4610constructorimpl(composer);
            Updater.m4617setimpl(m4610constructorimpl6, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
            String str25 = str17;
            ComposerKt.sourceInformationMarkerStart(composer2, -407735110, str25);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            TextKt.m3621Text4IGK_g("•", (Modifier) null, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer, 6, 0, 65530);
            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.shop_no_ads_removes_forced_ads, composer2, 6), (Modifier) null, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, str16);
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str23);
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer2, companion);
            Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str24);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer2.createNode(constructor7);
            } else {
                composer.useNode();
            }
            Composer m4610constructorimpl7 = Updater.m4610constructorimpl(composer);
            Updater.m4617setimpl(m4610constructorimpl7, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
            }
            Updater.m4617setimpl(m4610constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -384672921, str12);
            ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
            float f7 = 2;
            TextKt.m3621Text4IGK_g("+", PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(f7), 0.0f, 0.0f, 13, null), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, TextUnitKt.getSp(32), new FontWeight(600), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777177, (DefaultConstructorMarker) null), composer, 54, 0, 65528);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_43 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f6));
            Modifier m1520paddingqDBjuR0$default4 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(f7), 0.0f, 0.0f, 13, null);
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, str22);
            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_43, centerVertically, composer2, 54);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str23);
            int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer2, m1520paddingqDBjuR0$default4);
            Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str24);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer2.createNode(constructor8);
            } else {
                composer.useNode();
            }
            Composer m4610constructorimpl8 = Updater.m4610constructorimpl(composer);
            Updater.m4617setimpl(m4610constructorimpl8, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl8.getInserting() || !Intrinsics.areEqual(m4610constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
            }
            Updater.m4617setimpl(m4610constructorimpl8, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -407735110, str25);
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            String shopBetcoinsFormated = FormatHelper.getShopBetcoinsFormated(shopItemDataModel.getAmount());
            Intrinsics.checkNotNullExpressionValue(shopBetcoinsFormated, "getShopBetcoinsFormated(...)");
            TextKt.m3621Text4IGK_g(shopBetcoinsFormated, (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, TextUnitKt.getSp(i2), new FontWeight(600), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777177, (DefaultConstructorMarker) null), composer, 0, 0, 65530);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_betcoin, composer2, 6), StringResources_androidKt.stringResource(R.string.cd_betcoin, composer2, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(i2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
            i4 = 6;
            str8 = str25;
            str9 = str24;
            str10 = str23;
            str11 = str22;
        } else {
            f = f3;
            f2 = f4;
            int i7 = i2;
            composer2.startReplaceGroup(1549415292);
            if (shopItemDataModel.getId() == -1) {
                composer2.startReplaceGroup(1549453360);
                i3 = i7;
                str4 = "C89@4556L9:Column.kt#2w3rfo";
                str5 = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.shop_video_reward_title, composer2, 6), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, shopItemDataModel.getPopular() ? Dp.m7774constructorimpl(36) : Dp.m7774constructorimpl(f), 0.0f, 11, null), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, TextUnitKt.getSp(12), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777177, (DefaultConstructorMarker) null), composer, 0, 0, 65528);
                composer2.startReplaceGroup(-365636166);
                if (shopItemDataModel.getVideoMaxPerInterval() > 0) {
                    TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.shop_video_reward_remaining, new Object[]{Integer.valueOf(RangesKt.coerceAtLeast(shopItemDataModel.getVideoRemainingInInterval(), 0)), Integer.valueOf(shopItemDataModel.getVideoMaxPerInterval())}, composer2, 6), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(4), 0.0f, 0.0f, 13, null), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, TextUnitKt.getSp(11), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777177, (DefaultConstructorMarker) null), composer, 48, 0, 65528);
                }
                composer.endReplaceGroup();
                if (str21.length() > 0) {
                    TextKt.m3621Text4IGK_g(str21, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(4), shopItemDataModel.getPopular() ? Dp.m7774constructorimpl(36) : Dp.m7774constructorimpl(f), 0.0f, 9, null), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, TextUnitKt.getSp(12), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777177, (DefaultConstructorMarker) null), composer, 0, 0, 65528);
                }
                composer.endReplaceGroup();
            } else {
                str4 = "C89@4556L9:Column.kt#2w3rfo";
                str5 = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                i3 = i7;
                if (str21.length() > 0) {
                    composer2.startReplaceGroup(1552263045);
                    TextKt.m3621Text4IGK_g(str21, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, shopItemDataModel.getPopular() ? Dp.m7774constructorimpl(36) : Dp.m7774constructorimpl(f), 0.0f, 11, null), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, TextUnitKt.getSp(12), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777177, (DefaultConstructorMarker) null), composer, 0, 0, 65528);
                    composer.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(1552984756);
                    composer.endReplaceGroup();
                }
            }
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, str5);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composer2, 48);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str19);
            int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap9 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier9 = ComposedModifierKt.materializeModifier(composer2, companion2);
            Function0<ComposeUiNode> constructor9 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str20);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer2.createNode(constructor9);
            } else {
                composer.useNode();
            }
            Composer m4610constructorimpl9 = Updater.m4610constructorimpl(composer);
            Updater.m4617setimpl(m4610constructorimpl9, columnMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl9, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl9.getInserting() || !Intrinsics.areEqual(m4610constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                m4610constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                m4610constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
            }
            Updater.m4617setimpl(m4610constructorimpl9, materializeModifier9, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -384672921, str4);
            ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
            composer2.startReplaceGroup(-62224171);
            if (Intrinsics.areEqual(shopItemDataModel.getStoreCode(), "new_shop_small_banner")) {
                str6 = str20;
                str7 = str19;
                TextKt.m3621Text4IGK_g("+", PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(f2), 0.0f, 0.0f, 13, null), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, TextUnitKt.getSp(32), new FontWeight(600), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777177, (DefaultConstructorMarker) null), composer, 54, 0, 65528);
            } else {
                str6 = str20;
                str7 = str19;
            }
            composer.endReplaceGroup();
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_44 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
            Modifier m1520paddingqDBjuR0$default5 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(f2), 0.0f, 0.0f, 13, null);
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_44, centerVertically2, composer2, 54);
            String str26 = str7;
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str26);
            int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap10 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier10 = ComposedModifierKt.materializeModifier(composer2, m1520paddingqDBjuR0$default5);
            Function0<ComposeUiNode> constructor10 = ComposeUiNode.INSTANCE.getConstructor();
            String str27 = str6;
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str27);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer2.createNode(constructor10);
            } else {
                composer.useNode();
            }
            Composer m4610constructorimpl10 = Updater.m4610constructorimpl(composer);
            Updater.m4617setimpl(m4610constructorimpl10, rowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl10, currentCompositionLocalMap10, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl10.getInserting() || !Intrinsics.areEqual(m4610constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                m4610constructorimpl10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
                m4610constructorimpl10.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
            }
            Updater.m4617setimpl(m4610constructorimpl10, materializeModifier10, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
            String shopBetcoinsFormated2 = FormatHelper.getShopBetcoinsFormated(shopItemDataModel.getAmount());
            Intrinsics.checkNotNullExpressionValue(shopBetcoinsFormated2, "getShopBetcoinsFormated(...)");
            str8 = "C101@5232L9:Row.kt#2w3rfo";
            str9 = str27;
            str10 = str26;
            str11 = "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo";
            TextKt.m3621Text4IGK_g(shopBetcoinsFormated2, (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, TextUnitKt.getSp(i3), new FontWeight(600), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777177, (DefaultConstructorMarker) null), composer, 0, 0, 65530);
            i4 = 6;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_betcoin, composer2, 6), "Betcoin", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(i3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, 120);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer2.startReplaceGroup(118704777);
        if (z2) {
            Log.d("ShopCard", "Showing price button for item " + shopItemDataModel.getId() + " with price: " + shopItemDataModel.getPrice());
            Modifier background$default2 = BackgroundKt.background$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)), 0.0f, 4, null);
            composer2.startReplaceGroup(-1633490746);
            final Function1<ShopItemDataModel, Unit> function13 = function1;
            final ShopItemDataModel shopItemDataModel3 = shopItemDataModel;
            boolean changed = composer2.changed(function13) | composer2.changed(shopItemDataModel3);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.shop.compose.ShopScreenKt$ShopCard$2$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$12$lambda$11$lambda$9$lambda$8;
                        invoke$lambda$12$lambda$11$lambda$9$lambda$8 = ShopScreenKt$ShopCard$2$1$2.invoke$lambda$12$lambda$11$lambda$9$lambda$8(Function1.this, shopItemDataModel3);
                        return invoke$lambda$12$lambda$11$lambda$9$lambda$8;
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(background$default2, false, null, null, (Function0) rememberedValue, 7, null);
            Arrangement.Horizontal spaceEvenly = Arrangement.Absolute.INSTANCE.getSpaceEvenly();
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, str11);
            MeasurePolicy rowMeasurePolicy5 = RowKt.rowMeasurePolicy(spaceEvenly, Alignment.INSTANCE.getTop(), composer2, i4);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str10);
            int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap11 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier11 = ComposedModifierKt.materializeModifier(composer2, m1059clickableXHw0xAI$default);
            Function0<ComposeUiNode> constructor11 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str9);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer2.createNode(constructor11);
            } else {
                composer.useNode();
            }
            Composer m4610constructorimpl11 = Updater.m4610constructorimpl(composer);
            Updater.m4617setimpl(m4610constructorimpl11, rowMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl11, currentCompositionLocalMap11, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash11 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl11.getInserting() || !Intrinsics.areEqual(m4610constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                m4610constructorimpl11.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash11));
                m4610constructorimpl11.apply(Integer.valueOf(currentCompositeKeyHash11), setCompositeKeyHash11);
            }
            Updater.m4617setimpl(m4610constructorimpl11, materializeModifier11, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -407735110, str8);
            RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
            composer2.startReplaceGroup(546375031);
            if (shopItemDataModel3.getOldPrice().length() > 0) {
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), composer2, i4);
                TextKt.m3621Text4IGK_g(shopItemDataModel3.getOldPrice(), PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, i4), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getLineThrough(), (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16740312, (DefaultConstructorMarker) null), composer, 48, 3072, 57340);
            }
            composer.endReplaceGroup();
            TextKt.m3621Text4IGK_g(str, PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer, 48, 3072, 57340);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Unit unit = Unit.INSTANCE;
        } else {
            ShopItemDataModel shopItemDataModel4 = shopItemDataModel;
            Integer.valueOf(Log.d("ShopCard", "NOT showing price button for item " + shopItemDataModel4.getId() + " - price: '" + shopItemDataModel4.getPrice() + "', id: " + shopItemDataModel4.getId()));
        }
        composer.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
