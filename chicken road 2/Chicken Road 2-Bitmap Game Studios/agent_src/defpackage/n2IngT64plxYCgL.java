package defpackage;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.CakeKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BottomAppBarState;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.carousel.CarouselPagerState;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.door.brass.knob.ComposableSingletons$MainActivityKt;
import com.door.brass.knob.ui.challenge.ComposableSingletons$ChallengeScreenKt;
import com.door.brass.knob.ui.components.AppBackgroundKt;
import com.door.brass.knob.ui.menu.ComposableSingletons$MenuScreenKt;
import com.door.brass.knob.ui.navigation.AppNavigationKt;
import com.door.brass.knob.ui.theme.ThemeKt;
import com.door.brass.knob.ui.tips.ComposableSingletons$TipsScreenKt;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CopyableThreadContextElement;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class n2IngT64plxYCgL implements Function2 {
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ n2IngT64plxYCgL(int i) {
        this.oyjLVtGms9eZwJ0 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        CombinedContext combinedContext;
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (composer.ZvpnNpCMEWSR3(intValue & 1, (intValue & 3) != 2)) {
                    ComposableSingletons$MainActivityKt.yzPsTade5rL7D3.kSPEzfraxudm4i(composer, 0);
                } else {
                    composer.gmXBnHsR2YSm();
                }
                return unit;
            case 1:
                ((Integer) obj2).getClass();
                AppBackgroundKt.yzPsTade5rL7D3(RecomposeScopeImplKt.yzPsTade5rL7D3(7), (Composer) obj);
                return unit;
            case 2:
                ((Integer) obj2).getClass();
                AppNavigationKt.yzPsTade5rL7D3(RecomposeScopeImplKt.yzPsTade5rL7D3(1), (Composer) obj);
                return unit;
            case 3:
                BottomAppBarState bottomAppBarState = (BottomAppBarState) obj2;
                int i2 = BottomAppBarState.Companion.yzPsTade5rL7D3;
                return CollectionsKt.Yey4RyhSyBRHub(Float.valueOf(bottomAppBarState.ra306ClFT3HT()), Float.valueOf(bottomAppBarState.oyjLVtGms9eZwJ0()), Float.valueOf(bottomAppBarState.b41X89IqSbKt()));
            case 4:
                CarouselPagerState carouselPagerState = (CarouselPagerState) obj2;
                int i3 = CarouselPagerState.elPM8kURv8Fp;
                return CollectionsKt.Yey4RyhSyBRHub(Integer.valueOf(carouselPagerState.Uo5pffGf8LUU()), Float.valueOf(RangesKt.hRNgd2zGCE5kj(carouselPagerState.FsuUJlzzWhYnMlD(), -0.5f, 0.5f)), ((SnapshotMutableStateImpl) carouselPagerState.tp5sG1Fy0ZCmW).getOyjLVtGms9eZwJ0());
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                CarouselState carouselState = (CarouselState) obj2;
                Integer valueOf = Integer.valueOf(carouselState.yzPsTade5rL7D3.Uo5pffGf8LUU());
                CarouselPagerState carouselPagerState2 = carouselState.yzPsTade5rL7D3;
                return CollectionsKt.Yey4RyhSyBRHub(valueOf, Float.valueOf(carouselPagerState2.FsuUJlzzWhYnMlD()), Integer.valueOf(carouselPagerState2.MRfxZSx8l5UG62U()));
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                String str = (String) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                str.getClass();
                element.getClass();
                if (str.length() == 0) {
                    return element.toString();
                }
                return str + ", " + element;
            case 7:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (composer2.ZvpnNpCMEWSR3(intValue2 & 1, (intValue2 & 3) != 2)) {
                    TextKt.hRNgd2zGCE5kj("Challenges", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, composer2, 6, 0, 262142);
                } else {
                    composer2.gmXBnHsR2YSm();
                }
                return unit;
            case 8:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (composer3.ZvpnNpCMEWSR3(intValue3 & 1, (intValue3 & 3) != 2)) {
                    AppBarKt.hRNgd2zGCE5kj(ComposableSingletons$ChallengeScreenKt.yzPsTade5rL7D3, null, null, null, 0.0f, WindowInsetsKt.yzPsTade5rL7D3(0, 14), null, composer3, 6, 222);
                } else {
                    composer3.gmXBnHsR2YSm();
                }
                return unit;
            case 9:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (composer4.ZvpnNpCMEWSR3(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ImageVector imageVector = CloseKt.yzPsTade5rL7D3;
                    if (imageVector == null) {
                        ImageVector.Builder builder = new ImageVector.Builder("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i4 = VectorKt.yzPsTade5rL7D3;
                        SolidColor solidColor = new SolidColor(Color.hRNgd2zGCE5kj);
                        PathBuilder pathBuilder = new PathBuilder();
                        pathBuilder.Uo5pffGf8LUU(19.0f, 6.41f);
                        pathBuilder.gmXBnHsR2YSm(17.59f, 5.0f);
                        pathBuilder.gmXBnHsR2YSm(12.0f, 10.59f);
                        pathBuilder.gmXBnHsR2YSm(6.41f, 5.0f);
                        pathBuilder.gmXBnHsR2YSm(5.0f, 6.41f);
                        pathBuilder.gmXBnHsR2YSm(10.59f, 12.0f);
                        pathBuilder.gmXBnHsR2YSm(5.0f, 17.59f);
                        pathBuilder.gmXBnHsR2YSm(6.41f, 19.0f);
                        pathBuilder.gmXBnHsR2YSm(12.0f, 13.41f);
                        pathBuilder.gmXBnHsR2YSm(17.59f, 19.0f);
                        pathBuilder.gmXBnHsR2YSm(19.0f, 17.59f);
                        pathBuilder.gmXBnHsR2YSm(13.41f, 12.0f);
                        pathBuilder.yzPsTade5rL7D3();
                        builder.hRNgd2zGCE5kj(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, solidColor, null, "", pathBuilder.yzPsTade5rL7D3);
                        imageVector = builder.oyjLVtGms9eZwJ0();
                        CloseKt.yzPsTade5rL7D3 = imageVector;
                    }
                    IconKt.hRNgd2zGCE5kj(imageVector, "Close", null, 0L, composer4, 48, 12);
                } else {
                    composer4.gmXBnHsR2YSm();
                }
                return unit;
            case 10:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (!composer5.ZvpnNpCMEWSR3(intValue5 & 1, (intValue5 & 3) != 2)) {
                    composer5.gmXBnHsR2YSm();
                }
                return unit;
            case 11:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (!composer6.ZvpnNpCMEWSR3(intValue6 & 1, (intValue6 & 3) != 2)) {
                    composer6.gmXBnHsR2YSm();
                }
                return unit;
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (composer7.ZvpnNpCMEWSR3(intValue7 & 1, (intValue7 & 3) != 2)) {
                    AppNavigationKt.yzPsTade5rL7D3(0, composer7);
                } else {
                    composer7.gmXBnHsR2YSm();
                }
                return unit;
            case 13:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (composer8.ZvpnNpCMEWSR3(intValue8 & 1, (intValue8 & 3) != 2)) {
                    AppBackgroundKt.yzPsTade5rL7D3(6, composer8);
                } else {
                    composer8.gmXBnHsR2YSm();
                }
                return unit;
            case 14:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if (composer9.ZvpnNpCMEWSR3(intValue9 & 1, (intValue9 & 3) != 2)) {
                    ThemeKt.yzPsTade5rL7D3(6, composer9);
                } else {
                    composer9.gmXBnHsR2YSm();
                }
                return unit;
            case WindowInsetsSides.b41X89IqSbKt /* 15 */:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if (composer10.ZvpnNpCMEWSR3(intValue10 & 1, (intValue10 & 3) != 2)) {
                    ImageVector imageVector2 = ArrowBackKt.yzPsTade5rL7D3;
                    if (imageVector2 == null) {
                        ImageVector.Builder builder2 = new ImageVector.Builder("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i5 = VectorKt.yzPsTade5rL7D3;
                        SolidColor solidColor2 = new SolidColor(Color.hRNgd2zGCE5kj);
                        PathBuilder pathBuilder2 = new PathBuilder();
                        pathBuilder2.Uo5pffGf8LUU(20.0f, 11.0f);
                        pathBuilder2.oyjLVtGms9eZwJ0(7.83f);
                        pathBuilder2.i7xAcZoXXiIt(5.59f, -5.59f);
                        pathBuilder2.gmXBnHsR2YSm(12.0f, 4.0f);
                        pathBuilder2.i7xAcZoXXiIt(-8.0f, 8.0f);
                        pathBuilder2.i7xAcZoXXiIt(8.0f, 8.0f);
                        pathBuilder2.i7xAcZoXXiIt(1.41f, -1.41f);
                        pathBuilder2.gmXBnHsR2YSm(7.83f, 13.0f);
                        pathBuilder2.oyjLVtGms9eZwJ0(20.0f);
                        pathBuilder2.MRfxZSx8l5UG62U(-2.0f);
                        pathBuilder2.yzPsTade5rL7D3();
                        builder2.hRNgd2zGCE5kj(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, solidColor2, null, "", pathBuilder2.yzPsTade5rL7D3);
                        imageVector2 = builder2.oyjLVtGms9eZwJ0();
                        ArrowBackKt.yzPsTade5rL7D3 = imageVector2;
                    }
                    IconKt.hRNgd2zGCE5kj(imageVector2, "Back", null, 0L, composer10, 48, 12);
                } else {
                    composer10.gmXBnHsR2YSm();
                }
                return unit;
            case 16:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if (composer11.ZvpnNpCMEWSR3(intValue11 & 1, (intValue11 & 3) != 2)) {
                    MeasurePolicy oyjLVtGms9eZwJ0 = BoxKt.oyjLVtGms9eZwJ0(Alignment.Companion.b41X89IqSbKt, false);
                    int hashCode = Long.hashCode(composer11.getH5JgSr7BP0b5Z());
                    PersistentCompositionLocalMap FTJ2XS7ULgY8 = composer11.FTJ2XS7ULgY8();
                    Modifier.Companion companion = Modifier.Companion.oyjLVtGms9eZwJ0;
                    Modifier oyjLVtGms9eZwJ02 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer11, companion);
                    ComposeUiNode.hRNgd2zGCE5kj.getClass();
                    Function0 function0 = ComposeUiNode.Companion.hRNgd2zGCE5kj;
                    if (composer11.PyXrjLswZZoWpho() == null) {
                        ComposablesKt.yzPsTade5rL7D3();
                        throw null;
                    }
                    composer11.tp5sG1Fy0ZCmW();
                    if (composer11.getEYWI9RMqk13H5()) {
                        composer11.EYWI9RMqk13H5(function0);
                    } else {
                        composer11.AGl7HBCQ8xrHABq();
                    }
                    Updater.hRNgd2zGCE5kj(composer11, oyjLVtGms9eZwJ0, ComposeUiNode.Companion.gmXBnHsR2YSm);
                    Updater.hRNgd2zGCE5kj(composer11, FTJ2XS7ULgY8, ComposeUiNode.Companion.b41X89IqSbKt);
                    Updater.hRNgd2zGCE5kj(composer11, Integer.valueOf(hashCode), ComposeUiNode.Companion.i7xAcZoXXiIt);
                    Updater.yzPsTade5rL7D3(composer11, ComposeUiNode.Companion.Uo5pffGf8LUU);
                    Updater.hRNgd2zGCE5kj(composer11, oyjLVtGms9eZwJ02, ComposeUiNode.Companion.oyjLVtGms9eZwJ0);
                    ImageVector imageVector3 = CakeKt.yzPsTade5rL7D3;
                    if (imageVector3 == null) {
                        ImageVector.Builder builder3 = new ImageVector.Builder("Filled.Cake", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i6 = VectorKt.yzPsTade5rL7D3;
                        SolidColor solidColor3 = new SolidColor(Color.hRNgd2zGCE5kj);
                        PathBuilder pathBuilder3 = new PathBuilder();
                        pathBuilder3.Uo5pffGf8LUU(12.0f, 6.0f);
                        pathBuilder3.ra306ClFT3HT(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        pathBuilder3.ra306ClFT3HT(0.0f, -0.38f, -0.1f, -0.73f, -0.29f, -1.03f);
                        pathBuilder3.gmXBnHsR2YSm(12.0f, 0.0f);
                        pathBuilder3.i7xAcZoXXiIt(-1.71f, 2.97f);
                        pathBuilder3.ra306ClFT3HT(-0.19f, 0.3f, -0.29f, 0.65f, -0.29f, 1.03f);
                        pathBuilder3.ra306ClFT3HT(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        pathBuilder3.yzPsTade5rL7D3();
                        pathBuilder3.Uo5pffGf8LUU(16.6f, 15.99f);
                        pathBuilder3.i7xAcZoXXiIt(-1.07f, -1.07f);
                        pathBuilder3.i7xAcZoXXiIt(-1.08f, 1.07f);
                        pathBuilder3.ra306ClFT3HT(-1.3f, 1.3f, -3.58f, 1.31f, -4.89f, 0.0f);
                        pathBuilder3.i7xAcZoXXiIt(-1.07f, -1.07f);
                        pathBuilder3.i7xAcZoXXiIt(-1.09f, 1.07f);
                        pathBuilder3.hRNgd2zGCE5kj(6.75f, 16.64f, 5.88f, 17.0f, 4.96f, 17.0f);
                        pathBuilder3.ra306ClFT3HT(-0.73f, 0.0f, -1.4f, -0.23f, -1.96f, -0.61f);
                        pathBuilder3.gmXBnHsR2YSm(3.0f, 21.0f);
                        pathBuilder3.ra306ClFT3HT(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                        pathBuilder3.b41X89IqSbKt(16.0f);
                        pathBuilder3.ra306ClFT3HT(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                        pathBuilder3.MRfxZSx8l5UG62U(-4.61f);
                        pathBuilder3.ra306ClFT3HT(-0.56f, 0.38f, -1.23f, 0.61f, -1.96f, 0.61f);
                        pathBuilder3.ra306ClFT3HT(-0.92f, 0.0f, -1.79f, -0.36f, -2.44f, -1.01f);
                        pathBuilder3.yzPsTade5rL7D3();
                        pathBuilder3.Uo5pffGf8LUU(18.0f, 9.0f);
                        pathBuilder3.b41X89IqSbKt(-5.0f);
                        pathBuilder3.gmXBnHsR2YSm(13.0f, 7.0f);
                        pathBuilder3.b41X89IqSbKt(-2.0f);
                        pathBuilder3.MRfxZSx8l5UG62U(2.0f);
                        pathBuilder3.gmXBnHsR2YSm(6.0f, 9.0f);
                        pathBuilder3.ra306ClFT3HT(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                        pathBuilder3.MRfxZSx8l5UG62U(1.54f);
                        pathBuilder3.ra306ClFT3HT(0.0f, 1.08f, 0.88f, 1.96f, 1.96f, 1.96f);
                        pathBuilder3.ra306ClFT3HT(0.52f, 0.0f, 1.02f, -0.2f, 1.38f, -0.57f);
                        pathBuilder3.i7xAcZoXXiIt(2.14f, -2.13f);
                        pathBuilder3.i7xAcZoXXiIt(2.13f, 2.13f);
                        pathBuilder3.ra306ClFT3HT(0.74f, 0.74f, 2.03f, 0.74f, 2.77f, 0.0f);
                        pathBuilder3.i7xAcZoXXiIt(2.14f, -2.13f);
                        pathBuilder3.i7xAcZoXXiIt(2.13f, 2.13f);
                        pathBuilder3.ra306ClFT3HT(0.37f, 0.37f, 0.86f, 0.57f, 1.38f, 0.57f);
                        pathBuilder3.ra306ClFT3HT(1.08f, 0.0f, 1.96f, -0.88f, 1.96f, -1.96f);
                        pathBuilder3.gmXBnHsR2YSm(20.99f, 12.0f);
                        pathBuilder3.hRNgd2zGCE5kj(21.0f, 10.34f, 19.66f, 9.0f, 18.0f, 9.0f);
                        pathBuilder3.yzPsTade5rL7D3();
                        builder3.hRNgd2zGCE5kj(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, solidColor3, null, "", pathBuilder3.yzPsTade5rL7D3);
                        imageVector3 = builder3.oyjLVtGms9eZwJ0();
                        CakeKt.yzPsTade5rL7D3 = imageVector3;
                    }
                    IconKt.hRNgd2zGCE5kj(imageVector3, null, SizeKt.UEutaskTsxaI(companion, 64.0f), MaterialTheme.yzPsTade5rL7D3(composer11).oyjLVtGms9eZwJ0, composer11, 432, 0);
                    composer11.GDGFDp2lxiHY();
                } else {
                    composer11.gmXBnHsR2YSm();
                }
                return unit;
            case 17:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if (composer12.ZvpnNpCMEWSR3(intValue12 & 1, (intValue12 & 3) != 2)) {
                    TextKt.hRNgd2zGCE5kj("Menu", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, composer12, 6, 0, 262142);
                } else {
                    composer12.gmXBnHsR2YSm();
                }
                return unit;
            case 18:
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if (composer13.ZvpnNpCMEWSR3(intValue13 & 1, (intValue13 & 3) != 2)) {
                    AppBarKt.hRNgd2zGCE5kj(ComposableSingletons$MenuScreenKt.yzPsTade5rL7D3, null, null, null, 0.0f, WindowInsetsKt.yzPsTade5rL7D3(0, 14), null, composer13, 6, 222);
                } else {
                    composer13.gmXBnHsR2YSm();
                }
                return unit;
            case 19:
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if (composer14.ZvpnNpCMEWSR3(intValue14 & 1, (intValue14 & 3) != 2)) {
                    TextKt.hRNgd2zGCE5kj("Search", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, composer14, 6, 0, 262142);
                } else {
                    composer14.gmXBnHsR2YSm();
                }
                return unit;
            case 20:
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if (composer15.ZvpnNpCMEWSR3(intValue15 & 1, (intValue15 & 3) != 2)) {
                    IconKt.hRNgd2zGCE5kj(SearchKt.yzPsTade5rL7D3(), null, null, 0L, composer15, 48, 12);
                } else {
                    composer15.gmXBnHsR2YSm();
                }
                return unit;
            case 21:
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                if (composer16.ZvpnNpCMEWSR3(intValue16 & 1, (intValue16 & 3) != 2)) {
                    TextKt.hRNgd2zGCE5kj("Category", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, composer16, 6, 0, 262142);
                } else {
                    composer16.gmXBnHsR2YSm();
                }
                return unit;
            case 22:
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                if (composer17.ZvpnNpCMEWSR3(intValue17 & 1, (intValue17 & 3) != 2)) {
                    TextKt.hRNgd2zGCE5kj("Tips", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, composer17, 6, 0, 262142);
                } else {
                    composer17.gmXBnHsR2YSm();
                }
                return unit;
            case 23:
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                if (composer18.ZvpnNpCMEWSR3(intValue18 & 1, (intValue18 & 3) != 2)) {
                    AppBarKt.hRNgd2zGCE5kj(ComposableSingletons$TipsScreenKt.yzPsTade5rL7D3, null, null, null, 0.0f, WindowInsetsKt.yzPsTade5rL7D3(0, 14), null, composer18, 6, 222);
                } else {
                    composer18.gmXBnHsR2YSm();
                }
                return unit;
            case 24:
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                if (composer19.ZvpnNpCMEWSR3(intValue19 & 1, (intValue19 & 3) != 2)) {
                    TextKt.hRNgd2zGCE5kj("Search by title or content", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, composer19, 6, 0, 262142);
                } else {
                    composer19.gmXBnHsR2YSm();
                }
                return unit;
            case 25:
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                if (composer20.ZvpnNpCMEWSR3(intValue20 & 1, (intValue20 & 3) != 2)) {
                    IconKt.hRNgd2zGCE5kj(SearchKt.yzPsTade5rL7D3(), null, null, 0L, composer20, 48, 12);
                } else {
                    composer20.gmXBnHsR2YSm();
                }
                return unit;
            case 26:
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ConcurrentWeakMap.b41X89IqSbKt;
                return obj;
            case 27:
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                coroutineContext.getClass();
                element2.getClass();
                CoroutineContext VaOWcPY5RiGR = coroutineContext.VaOWcPY5RiGR(element2.getOyjLVtGms9eZwJ0());
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.oyjLVtGms9eZwJ0;
                if (VaOWcPY5RiGR == emptyCoroutineContext) {
                    return element2;
                }
                ContinuationInterceptor.Key key = ContinuationInterceptor.Key.oyjLVtGms9eZwJ0;
                ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) VaOWcPY5RiGR.pu0JZhzR2Or6(key);
                if (continuationInterceptor == null) {
                    combinedContext = new CombinedContext(element2, VaOWcPY5RiGR);
                } else {
                    CoroutineContext VaOWcPY5RiGR2 = VaOWcPY5RiGR.VaOWcPY5RiGR(key);
                    if (VaOWcPY5RiGR2 == emptyCoroutineContext) {
                        return new CombinedContext(continuationInterceptor, element2);
                    }
                    combinedContext = new CombinedContext(continuationInterceptor, new CombinedContext(element2, VaOWcPY5RiGR2));
                }
                return combinedContext;
            case 28:
                return Boolean.valueOf(((Boolean) obj).booleanValue() || (((CoroutineContext.Element) obj2) instanceof CopyableThreadContextElement));
            default:
                CoroutineContext coroutineContext2 = (CoroutineContext) obj;
                CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                return element3 instanceof CopyableThreadContextElement ? coroutineContext2.o4ticBN7g1K8jE(((CopyableThreadContextElement) element3).tp5sG1Fy0ZCmW()) : coroutineContext2.o4ticBN7g1K8jE(element3);
        }
    }
}
