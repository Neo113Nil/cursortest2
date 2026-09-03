package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material.icons.filled.ShuffleKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.door.brass.knob.R;
import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class o2t7oodqU1bUMaS implements Function3 {
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ o2t7oodqU1bUMaS(int i) {
        this.oyjLVtGms9eZwJ0 = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object MRfxZSx8l5UG62U(Object obj, Object obj2, Object obj3) {
        Map map;
        Map map2;
        Map map3;
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        switch (i) {
            case 0:
                MeasureScope measureScope = (MeasureScope) obj;
                Modifier modifier = AccessibilityUtilKt.yzPsTade5rL7D3;
                final int uMAEPvJoKWq8X = measureScope.uMAEPvJoKWq8X(10.0f);
                int i2 = uMAEPvJoKWq8X * 2;
                final Placeable kSPEzfraxudm4i = ((Measurable) obj2).kSPEzfraxudm4i(ConstraintsKt.FsuUJlzzWhYnMlD(i2, 0, ((Constraints) obj3).yzPsTade5rL7D3));
                int i3 = kSPEzfraxudm4i.b41X89IqSbKt;
                int i4 = kSPEzfraxudm4i.oyjLVtGms9eZwJ0 - i2;
                final int i5 = r7 ? 1 : 0;
                Function1 function1 = new Function1() { // from class: FTJ2XS7ULgY8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object uypNJrpDByoB(Object obj4) {
                        int i6 = i5;
                        Unit unit2 = Unit.yzPsTade5rL7D3;
                        int i7 = uMAEPvJoKWq8X;
                        Placeable placeable = kSPEzfraxudm4i;
                        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj4;
                        switch (i6) {
                            case 0:
                                Modifier modifier2 = AccessibilityUtilKt.yzPsTade5rL7D3;
                                placementScope.UEutaskTsxaI(placeable, 0, -i7, 0.0f);
                                break;
                            default:
                                Modifier modifier3 = AccessibilityUtilKt.yzPsTade5rL7D3;
                                placementScope.UEutaskTsxaI(placeable, -i7, 0, 0.0f);
                                break;
                        }
                        return unit2;
                    }
                };
                map = EmptyMap.oyjLVtGms9eZwJ0;
                return measureScope.Ae8HxJ6tiidOhX(i4, i3, map, function1);
            case 1:
                MeasureScope measureScope2 = (MeasureScope) obj;
                Modifier modifier2 = AccessibilityUtilKt.yzPsTade5rL7D3;
                final int uMAEPvJoKWq8X2 = measureScope2.uMAEPvJoKWq8X(10.0f);
                int i6 = uMAEPvJoKWq8X2 * 2;
                final Placeable kSPEzfraxudm4i2 = ((Measurable) obj2).kSPEzfraxudm4i(ConstraintsKt.FsuUJlzzWhYnMlD(0, i6, ((Constraints) obj3).yzPsTade5rL7D3));
                int i7 = kSPEzfraxudm4i2.b41X89IqSbKt - i6;
                int i8 = kSPEzfraxudm4i2.oyjLVtGms9eZwJ0;
                final int i9 = r8 ? 1 : 0;
                Function1 function12 = new Function1() { // from class: FTJ2XS7ULgY8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object uypNJrpDByoB(Object obj4) {
                        int i62 = i9;
                        Unit unit2 = Unit.yzPsTade5rL7D3;
                        int i72 = uMAEPvJoKWq8X2;
                        Placeable placeable = kSPEzfraxudm4i2;
                        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj4;
                        switch (i62) {
                            case 0:
                                Modifier modifier22 = AccessibilityUtilKt.yzPsTade5rL7D3;
                                placementScope.UEutaskTsxaI(placeable, 0, -i72, 0.0f);
                                break;
                            default:
                                Modifier modifier3 = AccessibilityUtilKt.yzPsTade5rL7D3;
                                placementScope.UEutaskTsxaI(placeable, -i72, 0, 0.0f);
                                break;
                        }
                        return unit2;
                    }
                };
                map2 = EmptyMap.oyjLVtGms9eZwJ0;
                return measureScope2.Ae8HxJ6tiidOhX(i8, i7, map2, function12);
            case 2:
                Placeable kSPEzfraxudm4i3 = ((Measurable) obj2).kSPEzfraxudm4i(((Constraints) obj3).yzPsTade5rL7D3);
                int i10 = kSPEzfraxudm4i3.oyjLVtGms9eZwJ0;
                int i11 = kSPEzfraxudm4i3.b41X89IqSbKt;
                MCcLy95b8Awzmw mCcLy95b8Awzmw = new MCcLy95b8Awzmw(9);
                tY4RqfA4k7DmtD ty4rqfa4k7dmtd = new tY4RqfA4k7DmtD(kSPEzfraxudm4i3, r7 ? 1 : 0);
                map3 = EmptyMap.oyjLVtGms9eZwJ0;
                return ((MeasureScope) obj).jftn8v8uboxbvf(i10, i11, map3, mCcLy95b8Awzmw, ty4rqfa4k7dmtd);
            case 3:
                Function2 function2 = (Function2) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= composer.NIabVTHf6LMJyXq(function2) ? 4 : 2;
                }
                if (composer.ZvpnNpCMEWSR3(intValue & 1, (intValue & 19) != 18)) {
                    function2.kSPEzfraxudm4i(composer, Integer.valueOf(intValue & 14));
                } else {
                    composer.gmXBnHsR2YSm();
                }
                return unit;
            case 4:
                Function2 function22 = (Function2) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= composer2.NIabVTHf6LMJyXq(function22) ? 4 : 2;
                }
                if (composer2.ZvpnNpCMEWSR3(intValue2 & 1, (intValue2 & 19) != 18)) {
                    function22.kSPEzfraxudm4i(composer2, Integer.valueOf(intValue2 & 14));
                } else {
                    composer2.gmXBnHsR2YSm();
                }
                return unit;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer3.ZvpnNpCMEWSR3(intValue3 & 1, (intValue3 & 17) != 16)) {
                    TextKt.hRNgd2zGCE5kj("Mark Complete", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, composer3, 6, 0, 262142);
                } else {
                    composer3.gmXBnHsR2YSm();
                }
                return unit;
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                ContextMenuColors contextMenuColors = (ContextMenuColors) obj;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= composer4.zgejW39NNp2D(contextMenuColors) ? 4 : 2;
                }
                if (composer4.ZvpnNpCMEWSR3(intValue4 & 1, (intValue4 & 19) != 18)) {
                    BoxKt.yzPsTade5rL7D3(BackgroundKt.hRNgd2zGCE5kj(SizeKt.ra306ClFT3HT(PaddingKt.Uo5pffGf8LUU(Modifier.Companion.oyjLVtGms9eZwJ0, 0.0f, ContextMenuSpec.i7xAcZoXXiIt, 1).yzUZju8lbdmWa(SizeKt.yzPsTade5rL7D3), ContextMenuSpec.gmXBnHsR2YSm), contextMenuColors.ra306ClFT3HT, RectangleShapeKt.yzPsTade5rL7D3), composer4, 0);
                } else {
                    composer4.gmXBnHsR2YSm();
                }
                return unit;
            case 7:
                Function2 function23 = (Function2) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= composer5.NIabVTHf6LMJyXq(function23) ? 4 : 2;
                }
                if (composer5.ZvpnNpCMEWSR3(intValue5 & 1, (intValue5 & 19) != 18)) {
                    function23.kSPEzfraxudm4i(composer5, Integer.valueOf(intValue5 & 14));
                } else {
                    composer5.gmXBnHsR2YSm();
                }
                return unit;
            case 8:
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer6.ZvpnNpCMEWSR3(intValue6 & 1, (intValue6 & 17) != 16)) {
                    ImageVector imageVector = ShuffleKt.yzPsTade5rL7D3;
                    if (imageVector == null) {
                        ImageVector.Builder builder = new ImageVector.Builder("Filled.Shuffle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i12 = VectorKt.yzPsTade5rL7D3;
                        SolidColor solidColor = new SolidColor(Color.hRNgd2zGCE5kj);
                        PathBuilder pathBuilder = new PathBuilder();
                        pathBuilder.Uo5pffGf8LUU(10.59f, 9.17f);
                        pathBuilder.gmXBnHsR2YSm(5.41f, 4.0f);
                        pathBuilder.gmXBnHsR2YSm(4.0f, 5.41f);
                        pathBuilder.i7xAcZoXXiIt(5.17f, 5.17f);
                        pathBuilder.i7xAcZoXXiIt(1.42f, -1.41f);
                        pathBuilder.yzPsTade5rL7D3();
                        pathBuilder.Uo5pffGf8LUU(14.5f, 4.0f);
                        pathBuilder.i7xAcZoXXiIt(2.04f, 2.04f);
                        pathBuilder.gmXBnHsR2YSm(4.0f, 18.59f);
                        pathBuilder.gmXBnHsR2YSm(5.41f, 20.0f);
                        pathBuilder.gmXBnHsR2YSm(17.96f, 7.46f);
                        pathBuilder.gmXBnHsR2YSm(20.0f, 9.5f);
                        pathBuilder.gmXBnHsR2YSm(20.0f, 4.0f);
                        pathBuilder.b41X89IqSbKt(-5.5f);
                        pathBuilder.yzPsTade5rL7D3();
                        pathBuilder.Uo5pffGf8LUU(14.83f, 13.41f);
                        pathBuilder.i7xAcZoXXiIt(-1.41f, 1.41f);
                        pathBuilder.i7xAcZoXXiIt(3.13f, 3.13f);
                        pathBuilder.gmXBnHsR2YSm(14.5f, 20.0f);
                        pathBuilder.gmXBnHsR2YSm(20.0f, 20.0f);
                        pathBuilder.MRfxZSx8l5UG62U(-5.5f);
                        pathBuilder.i7xAcZoXXiIt(-2.04f, 2.04f);
                        pathBuilder.i7xAcZoXXiIt(-3.13f, -3.13f);
                        pathBuilder.yzPsTade5rL7D3();
                        builder.hRNgd2zGCE5kj(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, solidColor, null, "", pathBuilder.yzPsTade5rL7D3);
                        imageVector = builder.oyjLVtGms9eZwJ0();
                        ShuffleKt.yzPsTade5rL7D3 = imageVector;
                    }
                    IconKt.hRNgd2zGCE5kj(imageVector, null, null, 0L, composer6, 48, 12);
                    TextKt.hRNgd2zGCE5kj("Shuffle Pick", PaddingKt.UEutaskTsxaI(Modifier.Companion.oyjLVtGms9eZwJ0, 8.0f, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, composer6, 54, 0, 262140);
                } else {
                    composer6.gmXBnHsR2YSm();
                }
                return unit;
            case 9:
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer7.ZvpnNpCMEWSR3(intValue7 & 1, (intValue7 & 17) != 16)) {
                    TextKt.hRNgd2zGCE5kj(StringResources_androidKt.yzPsTade5rL7D3(R.string.splash_retry, composer7), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, composer7, 0, 0, 262142);
                } else {
                    composer7.gmXBnHsR2YSm();
                }
                return unit;
            default:
                SliderDefaults sliderDefaults = SliderDefaults.yzPsTade5rL7D3;
                Placeable kSPEzfraxudm4i4 = ((Measurable) obj2).kSPEzfraxudm4i(((Constraints) obj3).yzPsTade5rL7D3);
                int i13 = kSPEzfraxudm4i4.b41X89IqSbKt;
                int i14 = kSPEzfraxudm4i4.oyjLVtGms9eZwJ0;
                Map singletonMap = Collections.singletonMap(SliderKt.gmXBnHsR2YSm, Integer.valueOf(i13 / 2));
                singletonMap.getClass();
                return ((MeasureScope) obj).Ae8HxJ6tiidOhX(i14, i13, singletonMap, new tY4RqfA4k7DmtD(kSPEzfraxudm4i4, 13));
        }
    }
}
