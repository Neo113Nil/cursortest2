package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.FilterChipDefaults;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.SelectableChipColors;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.navigation.NavHostController;
import com.door.brass.knob.data.db.entity.MenuItemEntity;
import com.door.brass.knob.ui.menudetail.MenuDetailUiState;
import com.door.brass.knob.ui.menudetail.MenuDetailViewModel;
import com.door.brass.knob.ui.navigation.BottomNavItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class z6n0KAn5YNjXskD implements Function3 {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ z6n0KAn5YNjXskD(Object obj, Object obj2, Object obj3, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
        this.gmXBnHsR2YSm = obj2;
        this.i7xAcZoXXiIt = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object MRfxZSx8l5UG62U(Object obj, Object obj2, Object obj3) {
        Iterator it;
        Unit unit;
        long j;
        int i = this.oyjLVtGms9eZwJ0;
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.yzPsTade5rL7D3;
        int i2 = 2;
        Unit unit2 = Unit.yzPsTade5rL7D3;
        int i3 = 16;
        Object obj4 = this.i7xAcZoXXiIt;
        Object obj5 = this.gmXBnHsR2YSm;
        Object obj6 = this.b41X89IqSbKt;
        Object[] objArr = 0;
        final int i4 = 1;
        switch (i) {
            case 0:
                List<BottomNavItem> list = (List) obj6;
                String str = (String) obj5;
                NavHostController navHostController = (NavHostController) obj4;
                RowScope rowScope = (RowScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                rowScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= composer.zgejW39NNp2D(rowScope) ? 4 : 2;
                }
                if (composer.ZvpnNpCMEWSR3(intValue & 1, (intValue & 19) != 18)) {
                    for (final BottomNavItem bottomNavItem : list) {
                        boolean yzPsTade5rL7D3 = Intrinsics.yzPsTade5rL7D3(str, bottomNavItem.oyjLVtGms9eZwJ0);
                        boolean NIabVTHf6LMJyXq = composer.NIabVTHf6LMJyXq(navHostController) | composer.kSPEzfraxudm4i(bottomNavItem.ordinal());
                        Object UEutaskTsxaI = composer.UEutaskTsxaI();
                        if (NIabVTHf6LMJyXq || UEutaskTsxaI == composer$Companion$Empty$1) {
                            UEutaskTsxaI = new VoAHKqpbZzH9eE(2, navHostController, bottomNavItem);
                            composer.Yey4RyhSyBRHub(UEutaskTsxaI);
                        }
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        NavigationBarKt.hRNgd2zGCE5kj(rowScope, yzPsTade5rL7D3, (Function0) UEutaskTsxaI, ComposableLambdaKt.hRNgd2zGCE5kj(-578696378, new Function2() { // from class: V70b3kP4CChXaFM
                            @Override // kotlin.jvm.functions.Function2
                            public final Object kSPEzfraxudm4i(Object obj7, Object obj8) {
                                int i5 = objArr2;
                                Unit unit3 = Unit.yzPsTade5rL7D3;
                                BottomNavItem bottomNavItem2 = bottomNavItem;
                                switch (i5) {
                                    case 0:
                                        Composer composer2 = (Composer) obj7;
                                        int intValue2 = ((Integer) obj8).intValue();
                                        if (!composer2.ZvpnNpCMEWSR3(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            composer2.gmXBnHsR2YSm();
                                            break;
                                        } else {
                                            IconKt.hRNgd2zGCE5kj(bottomNavItem2.b41X89IqSbKt, bottomNavItem2.gmXBnHsR2YSm, null, 0L, composer2, 0, 12);
                                            break;
                                        }
                                    default:
                                        Composer composer3 = (Composer) obj7;
                                        int intValue3 = ((Integer) obj8).intValue();
                                        if (!composer3.ZvpnNpCMEWSR3(intValue3 & 1, (intValue3 & 3) != 2)) {
                                            composer3.gmXBnHsR2YSm();
                                            break;
                                        } else {
                                            TextKt.hRNgd2zGCE5kj(bottomNavItem2.gmXBnHsR2YSm, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, composer3, 0, 0, 262142);
                                            break;
                                        }
                                }
                                return unit3;
                            }
                        }, composer), null, false, ComposableLambdaKt.hRNgd2zGCE5kj(1413842979, new Function2() { // from class: V70b3kP4CChXaFM
                            @Override // kotlin.jvm.functions.Function2
                            public final Object kSPEzfraxudm4i(Object obj7, Object obj8) {
                                int i5 = i4;
                                Unit unit3 = Unit.yzPsTade5rL7D3;
                                BottomNavItem bottomNavItem2 = bottomNavItem;
                                switch (i5) {
                                    case 0:
                                        Composer composer2 = (Composer) obj7;
                                        int intValue2 = ((Integer) obj8).intValue();
                                        if (!composer2.ZvpnNpCMEWSR3(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            composer2.gmXBnHsR2YSm();
                                            break;
                                        } else {
                                            IconKt.hRNgd2zGCE5kj(bottomNavItem2.b41X89IqSbKt, bottomNavItem2.gmXBnHsR2YSm, null, 0L, composer2, 0, 12);
                                            break;
                                        }
                                    default:
                                        Composer composer3 = (Composer) obj7;
                                        int intValue3 = ((Integer) obj8).intValue();
                                        if (!composer3.ZvpnNpCMEWSR3(intValue3 & 1, (intValue3 & 3) != 2)) {
                                            composer3.gmXBnHsR2YSm();
                                            break;
                                        } else {
                                            TextKt.hRNgd2zGCE5kj(bottomNavItem2.gmXBnHsR2YSm, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, composer3, 0, 0, 262142);
                                            break;
                                        }
                                }
                                return unit3;
                            }
                        }, composer), false, null, composer, (intValue & 14) | 1575936);
                    }
                } else {
                    composer.gmXBnHsR2YSm();
                }
                return unit2;
            case 1:
                List list2 = (List) obj6;
                MenuDetailViewModel menuDetailViewModel = (MenuDetailViewModel) obj5;
                MutableState mutableState = (MutableState) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((FlowRowScope) obj).getClass();
                if (!composer2.ZvpnNpCMEWSR3(intValue2 & 1, (intValue2 & 17) != 16)) {
                    composer2.gmXBnHsR2YSm();
                    return unit2;
                }
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    String str2 = (String) pair.oyjLVtGms9eZwJ0;
                    String str3 = (String) pair.b41X89IqSbKt;
                    boolean yzPsTade5rL7D32 = Intrinsics.yzPsTade5rL7D3(((MenuDetailUiState) mutableState.getOyjLVtGms9eZwJ0()).ra306ClFT3HT, str2);
                    boolean NIabVTHf6LMJyXq2 = composer2.NIabVTHf6LMJyXq(menuDetailViewModel) | composer2.zgejW39NNp2D(str2);
                    Object UEutaskTsxaI2 = composer2.UEutaskTsxaI();
                    if (NIabVTHf6LMJyXq2 || UEutaskTsxaI2 == composer$Companion$Empty$1) {
                        UEutaskTsxaI2 = new VoAHKqpbZzH9eE(i3, menuDetailViewModel, str2);
                        composer2.Yey4RyhSyBRHub(UEutaskTsxaI2);
                    }
                    Function0 function0 = (Function0) UEutaskTsxaI2;
                    ComposableLambdaImpl hRNgd2zGCE5kj = ComposableLambdaKt.hRNgd2zGCE5kj(29381047, new f(str3, i2), composer2);
                    float f = FilterChipDefaults.yzPsTade5rL7D3;
                    long j2 = MaterialTheme.yzPsTade5rL7D3(composer2).Uo5pffGf8LUU;
                    MutableState mutableState2 = mutableState;
                    long j3 = MaterialTheme.yzPsTade5rL7D3(composer2).FsuUJlzzWhYnMlD;
                    long j4 = Color.i7xAcZoXXiIt;
                    ColorScheme yzPsTade5rL7D33 = MaterialTheme.yzPsTade5rL7D3(composer2);
                    SelectableChipColors selectableChipColors = yzPsTade5rL7D33.zP42naeF6vBe;
                    if (selectableChipColors == null) {
                        long ra306ClFT3HT = ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D33, FilterChipTokens.kSPEzfraxudm4i);
                        long ra306ClFT3HT2 = ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D33, FilterChipTokens.OcGJUxcOVecQiKb);
                        long ra306ClFT3HT3 = ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D33, FilterChipTokens.BD2CRjLJ8EtOqGQ);
                        long ra306ClFT3HT4 = ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D33, FilterChipTokens.tp5sG1Fy0ZCmW);
                        ColorSchemeKeyTokens colorSchemeKeyTokens = FilterChipTokens.gmXBnHsR2YSm;
                        unit = unit2;
                        long ra306ClFT3HT5 = ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D33, colorSchemeKeyTokens);
                        it = it2;
                        float f2 = FilterChipTokens.i7xAcZoXXiIt;
                        long hRNgd2zGCE5kj2 = Color.hRNgd2zGCE5kj(f2, ra306ClFT3HT5);
                        j = j3;
                        long hRNgd2zGCE5kj3 = Color.hRNgd2zGCE5kj(FilterChipTokens.ra306ClFT3HT, ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D33, FilterChipTokens.hRNgd2zGCE5kj));
                        long ra306ClFT3HT6 = ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D33, FilterChipTokens.XrorSzThrtvJ4A);
                        float f3 = FilterChipTokens.ZvpnNpCMEWSR3;
                        selectableChipColors = new SelectableChipColors(ra306ClFT3HT, ra306ClFT3HT2, ra306ClFT3HT3, ra306ClFT3HT4, hRNgd2zGCE5kj2, hRNgd2zGCE5kj3, Color.hRNgd2zGCE5kj(f3, ra306ClFT3HT6), Color.hRNgd2zGCE5kj(f3, ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D33, FilterChipTokens.jJwKDtysO3vm5E)), ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D33, FilterChipTokens.MRfxZSx8l5UG62U), Color.hRNgd2zGCE5kj(f2, ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D33, colorSchemeKeyTokens)), ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D33, FilterChipTokens.pu0JZhzR2Or6), ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D33, FilterChipTokens.uY26rxeEAFnDq), ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D33, FilterChipTokens.Yey4RyhSyBRHub));
                        yzPsTade5rL7D33.zP42naeF6vBe = selectableChipColors;
                    } else {
                        it = it2;
                        unit = unit2;
                        j = j3;
                    }
                    long j5 = j4 != 16 ? j4 : selectableChipColors.yzPsTade5rL7D3;
                    long j6 = j4 != 16 ? j4 : selectableChipColors.hRNgd2zGCE5kj;
                    long j7 = j4 != 16 ? j4 : selectableChipColors.ra306ClFT3HT;
                    long j8 = j4 != 16 ? j4 : selectableChipColors.oyjLVtGms9eZwJ0;
                    long j9 = j4 != 16 ? j4 : selectableChipColors.b41X89IqSbKt;
                    long j10 = j4 != 16 ? j4 : selectableChipColors.gmXBnHsR2YSm;
                    long j11 = j4 != 16 ? j4 : selectableChipColors.i7xAcZoXXiIt;
                    long j12 = j4 != 16 ? j4 : selectableChipColors.Uo5pffGf8LUU;
                    if (j2 == 16) {
                        j2 = selectableChipColors.FsuUJlzzWhYnMlD;
                    }
                    Composer composer3 = composer2;
                    ChipKt.b41X89IqSbKt(yzPsTade5rL7D32, function0, hRNgd2zGCE5kj, null, false, null, new SelectableChipColors(j5, j6, j7, j8, j9, j10, j11, j12, j2, j4 != 16 ? j4 : selectableChipColors.UEutaskTsxaI, j != 16 ? j : selectableChipColors.MRfxZSx8l5UG62U, j4 != 16 ? j4 : selectableChipColors.kSPEzfraxudm4i, j4 != 16 ? j4 : selectableChipColors.uypNJrpDByoB), null, composer3, 384);
                    mutableState = mutableState2;
                    it2 = it;
                    composer2 = composer3;
                    unit2 = unit;
                    i2 = 2;
                    i3 = 16;
                }
                return unit2;
            default:
                MenuItemEntity menuItemEntity = (MenuItemEntity) obj6;
                ArrayList arrayList = (ArrayList) obj5;
                Function0 function02 = (Function0) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer4.ZvpnNpCMEWSR3(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Modifier.Companion companion = Modifier.Companion.oyjLVtGms9eZwJ0;
                    Modifier gmXBnHsR2YSm = PaddingKt.gmXBnHsR2YSm(companion, 16.0f);
                    ColumnMeasurePolicy yzPsTade5rL7D34 = ColumnKt.yzPsTade5rL7D3(Arrangement.ra306ClFT3HT, Alignment.Companion.uypNJrpDByoB, composer4, 0);
                    int hashCode = Long.hashCode(composer4.getH5JgSr7BP0b5Z());
                    PersistentCompositionLocalMap FTJ2XS7ULgY8 = composer4.FTJ2XS7ULgY8();
                    Modifier oyjLVtGms9eZwJ0 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer4, gmXBnHsR2YSm);
                    ComposeUiNode.hRNgd2zGCE5kj.getClass();
                    Function0 function03 = ComposeUiNode.Companion.hRNgd2zGCE5kj;
                    if (composer4.PyXrjLswZZoWpho() == null) {
                        ComposablesKt.yzPsTade5rL7D3();
                        throw null;
                    }
                    composer4.tp5sG1Fy0ZCmW();
                    if (composer4.getEYWI9RMqk13H5()) {
                        composer4.EYWI9RMqk13H5(function03);
                    } else {
                        composer4.AGl7HBCQ8xrHABq();
                    }
                    Updater.hRNgd2zGCE5kj(composer4, yzPsTade5rL7D34, ComposeUiNode.Companion.gmXBnHsR2YSm);
                    Updater.hRNgd2zGCE5kj(composer4, FTJ2XS7ULgY8, ComposeUiNode.Companion.b41X89IqSbKt);
                    Updater.hRNgd2zGCE5kj(composer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.i7xAcZoXXiIt);
                    Updater.yzPsTade5rL7D3(composer4, ComposeUiNode.Companion.Uo5pffGf8LUU);
                    Updater.hRNgd2zGCE5kj(composer4, oyjLVtGms9eZwJ0, ComposeUiNode.Companion.oyjLVtGms9eZwJ0);
                    TextKt.hRNgd2zGCE5kj(menuItemEntity.hRNgd2zGCE5kj, null, MaterialTheme.yzPsTade5rL7D3(composer4).FTJ2XS7ULgY8, 0L, 0L, null, 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(composer4).Uo5pffGf8LUU, composer4, 0, 0, 131066);
                    SpacerKt.yzPsTade5rL7D3(composer4, SizeKt.ra306ClFT3HT(companion, 6.0f));
                    Arrangement.SpacedAligned i7xAcZoXXiIt = Arrangement.i7xAcZoXXiIt(8.0f);
                    Arrangement.SpacedAligned i7xAcZoXXiIt2 = Arrangement.i7xAcZoXXiIt(8.0f);
                    FillElement fillElement = SizeKt.yzPsTade5rL7D3;
                    FlowLayoutKt.hRNgd2zGCE5kj(fillElement, i7xAcZoXXiIt, i7xAcZoXXiIt2, null, 0, 0, ComposableLambdaKt.hRNgd2zGCE5kj(1154250149, new b(3, function02, menuItemEntity), composer4), composer4, 1573302, 56);
                    Composer composer5 = composer4;
                    if (arrayList.isEmpty()) {
                        composer5.mFNFvFv0Eiyk(46121442);
                        composer5.o4ticBN7g1K8jE();
                    } else {
                        composer5.mFNFvFv0Eiyk(45323812);
                        SpacerKt.yzPsTade5rL7D3(composer5, SizeKt.ra306ClFT3HT(companion, 8.0f));
                        FlowLayoutKt.hRNgd2zGCE5kj(fillElement, Arrangement.i7xAcZoXXiIt(6.0f), Arrangement.i7xAcZoXXiIt(6.0f), null, 0, 0, ComposableLambdaKt.hRNgd2zGCE5kj(-2091642112, new b(arrayList, function02), composer5), composer5, 1573302, 56);
                        composer5 = composer5;
                        composer5.o4ticBN7g1K8jE();
                    }
                    String str4 = menuItemEntity.b41X89IqSbKt;
                    String obj7 = str4 != null ? StringsKt.vAthhQhzH5WQr3(str4).toString() : null;
                    if (obj7 == null) {
                        obj7 = "";
                    }
                    String str5 = obj7;
                    if (str5.length() > 0) {
                        composer5.mFNFvFv0Eiyk(46248263);
                        SpacerKt.yzPsTade5rL7D3(composer5, SizeKt.ra306ClFT3HT(companion, 8.0f));
                        Composer composer6 = composer5;
                        TextKt.hRNgd2zGCE5kj(str5, null, MaterialTheme.yzPsTade5rL7D3(composer5).FTJ2XS7ULgY8, 0L, 0L, null, 0L, 2, false, 1, 0, MaterialTheme.hRNgd2zGCE5kj(composer5).kSPEzfraxudm4i, composer6, 0, 24960, 110586);
                        composer5 = composer6;
                        composer5.o4ticBN7g1K8jE();
                    } else {
                        composer5.mFNFvFv0Eiyk(46612482);
                        composer5.o4ticBN7g1K8jE();
                    }
                    SpacerKt.yzPsTade5rL7D3(composer5, SizeKt.ra306ClFT3HT(companion, 8.0f));
                    DividerKt.yzPsTade5rL7D3(null, 0.0f, Color.hRNgd2zGCE5kj(0.3f, MaterialTheme.yzPsTade5rL7D3(composer5).BD2CRjLJ8EtOqGQ), composer5, 0, 3);
                    SpacerKt.yzPsTade5rL7D3(composer5, SizeKt.ra306ClFT3HT(companion, 8.0f));
                    Composer composer7 = composer5;
                    TextKt.hRNgd2zGCE5kj(menuItemEntity.oyjLVtGms9eZwJ0, null, MaterialTheme.yzPsTade5rL7D3(composer5).FTJ2XS7ULgY8, 0L, 0L, null, 0L, 2, false, 4, 0, MaterialTheme.hRNgd2zGCE5kj(composer5).MRfxZSx8l5UG62U, composer7, 0, 24960, 110586);
                    composer7.GDGFDp2lxiHY();
                } else {
                    composer4.gmXBnHsR2YSm();
                }
                return unit2;
        }
    }
}
