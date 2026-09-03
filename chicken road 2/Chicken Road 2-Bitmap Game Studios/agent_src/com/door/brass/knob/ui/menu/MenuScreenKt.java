package com.door.brass.knob.ui.menu;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.FilledCardTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelStoreOwnerDefaults;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.door.brass.knob.data.db.entity.MenuItemEntity;
import defpackage.P3UQsRX4QVEGd28;
import defpackage.l0;
import defpackage.ra306ClFT3HT;
import defpackage.t1;
import defpackage.t3;
import defpackage.wN5ohFcBOzLLfqV;
import defpackage.z6n0KAn5YNjXskD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/door/brass/knob/ui/menu/MenuUiState;", "uiState", "", "dropdownExpanded", "app"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MenuScreenKt {
    public static final void hRNgd2zGCE5kj(final Function1 function1, MenuViewModel menuViewModel, Composer composer, int i) {
        final MenuViewModel menuViewModel2;
        MenuViewModel menuViewModel3;
        function1.getClass();
        Composer BD2CRjLJ8EtOqGQ = composer.BD2CRjLJ8EtOqGQ(895224735);
        int i2 = (BD2CRjLJ8EtOqGQ.NIabVTHf6LMJyXq(function1) ? 4 : 2) | i | 16;
        int i3 = 1;
        if (BD2CRjLJ8EtOqGQ.ZvpnNpCMEWSR3(i2 & 1, (i2 & 19) != 18)) {
            BD2CRjLJ8EtOqGQ.uY26rxeEAFnDq();
            if ((i & 1) == 0 || BD2CRjLJ8EtOqGQ.exVmIuryuB8HeQ()) {
                ViewModelStoreOwner yzPsTade5rL7D3 = LocalViewModelStoreOwner.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ);
                if (yzPsTade5rL7D3 == null) {
                    defpackage.yzPsTade5rL7D3.kSPEzfraxudm4i("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                menuViewModel3 = (MenuViewModel) ViewModelKt.yzPsTade5rL7D3(Reflection.yzPsTade5rL7D3(MenuViewModel.class), yzPsTade5rL7D3, HiltViewModelKt.yzPsTade5rL7D3(ViewModelStoreOwnerDefaults.hRNgd2zGCE5kj(yzPsTade5rL7D3), BD2CRjLJ8EtOqGQ), ViewModelStoreOwnerDefaults.yzPsTade5rL7D3(yzPsTade5rL7D3), BD2CRjLJ8EtOqGQ);
            } else {
                BD2CRjLJ8EtOqGQ.gmXBnHsR2YSm();
                menuViewModel3 = menuViewModel;
            }
            BD2CRjLJ8EtOqGQ.K6HLhdE38aTVLa();
            final MutableState hRNgd2zGCE5kj = SnapshotStateKt.hRNgd2zGCE5kj(menuViewModel3.oyjLVtGms9eZwJ0, BD2CRjLJ8EtOqGQ);
            SheetState gmXBnHsR2YSm = ModalBottomSheetKt.gmXBnHsR2YSm(6, 2, BD2CRjLJ8EtOqGQ);
            Object UEutaskTsxaI = BD2CRjLJ8EtOqGQ.UEutaskTsxaI();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.yzPsTade5rL7D3;
            if (UEutaskTsxaI == composer$Companion$Empty$1) {
                UEutaskTsxaI = SnapshotStateKt.i7xAcZoXXiIt(Boolean.FALSE);
                BD2CRjLJ8EtOqGQ.Yey4RyhSyBRHub(UEutaskTsxaI);
            }
            final MutableState mutableState = (MutableState) UEutaskTsxaI;
            final List Yey4RyhSyBRHub = CollectionsKt.Yey4RyhSyBRHub("All", "Tarts", "Cakes", "Pastries", "Cookies", "Beverages");
            List Yey4RyhSyBRHub2 = CollectionsKt.Yey4RyhSyBRHub("Alphabetical", "By Sweetness", "By Texture");
            menuViewModel2 = menuViewModel3;
            ScaffoldKt.yzPsTade5rL7D3(null, ComposableSingletons$MenuScreenKt.hRNgd2zGCE5kj, null, null, null, 0, 0L, 0L, WindowInsetsKt.yzPsTade5rL7D3(0, 14), ComposableLambdaKt.hRNgd2zGCE5kj(-190144912, new Function3() { // from class: com.door.brass.knob.ui.menu.yzPsTade5rL7D3
                @Override // kotlin.jvm.functions.Function3
                public final Object MRfxZSx8l5UG62U(Object obj, Object obj2, Object obj3) {
                    MenuViewModel menuViewModel4;
                    Function0 function0;
                    Function2 function2;
                    Function1 function12;
                    Modifier ra306ClFT3HT;
                    Composer composer2;
                    Modifier ra306ClFT3HT2;
                    PaddingValues paddingValues = (PaddingValues) obj;
                    Composer composer3 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    paddingValues.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= composer3.zgejW39NNp2D(paddingValues) ? 4 : 2;
                    }
                    if (composer3.ZvpnNpCMEWSR3(intValue & 1, (intValue & 19) != 18)) {
                        Modifier.Companion companion = Modifier.Companion.oyjLVtGms9eZwJ0;
                        Modifier yzUZju8lbdmWa = PaddingKt.b41X89IqSbKt(companion, paddingValues).yzUZju8lbdmWa(SizeKt.ra306ClFT3HT);
                        ColumnMeasurePolicy yzPsTade5rL7D32 = ColumnKt.yzPsTade5rL7D3(Arrangement.ra306ClFT3HT, Alignment.Companion.uypNJrpDByoB, composer3, 0);
                        int hashCode = Long.hashCode(composer3.getH5JgSr7BP0b5Z());
                        PersistentCompositionLocalMap FTJ2XS7ULgY8 = composer3.FTJ2XS7ULgY8();
                        Modifier oyjLVtGms9eZwJ0 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer3, yzUZju8lbdmWa);
                        ComposeUiNode.hRNgd2zGCE5kj.getClass();
                        Function0 function02 = ComposeUiNode.Companion.hRNgd2zGCE5kj;
                        if (composer3.PyXrjLswZZoWpho() == null) {
                            ComposablesKt.yzPsTade5rL7D3();
                            throw null;
                        }
                        composer3.tp5sG1Fy0ZCmW();
                        if (composer3.getEYWI9RMqk13H5()) {
                            composer3.EYWI9RMqk13H5(function02);
                        } else {
                            composer3.AGl7HBCQ8xrHABq();
                        }
                        Function2 function22 = ComposeUiNode.Companion.gmXBnHsR2YSm;
                        Updater.hRNgd2zGCE5kj(composer3, yzPsTade5rL7D32, function22);
                        Function2 function23 = ComposeUiNode.Companion.b41X89IqSbKt;
                        Updater.hRNgd2zGCE5kj(composer3, FTJ2XS7ULgY8, function23);
                        Integer valueOf = Integer.valueOf(hashCode);
                        Function2 function24 = ComposeUiNode.Companion.i7xAcZoXXiIt;
                        Updater.hRNgd2zGCE5kj(composer3, valueOf, function24);
                        Function1 function13 = ComposeUiNode.Companion.Uo5pffGf8LUU;
                        Updater.yzPsTade5rL7D3(composer3, function13);
                        Function2 function25 = ComposeUiNode.Companion.oyjLVtGms9eZwJ0;
                        Updater.hRNgd2zGCE5kj(composer3, oyjLVtGms9eZwJ0, function25);
                        State state = hRNgd2zGCE5kj;
                        String str = ((MenuUiState) state.getOyjLVtGms9eZwJ0()).ra306ClFT3HT;
                        MenuViewModel menuViewModel5 = MenuViewModel.this;
                        boolean NIabVTHf6LMJyXq = composer3.NIabVTHf6LMJyXq(menuViewModel5);
                        Object UEutaskTsxaI2 = composer3.UEutaskTsxaI();
                        Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.yzPsTade5rL7D3;
                        if (NIabVTHf6LMJyXq || UEutaskTsxaI2 == composer$Companion$Empty$12) {
                            menuViewModel4 = menuViewModel5;
                            MenuScreenKt$MenuScreen$1$1$1$1 menuScreenKt$MenuScreen$1$1$1$1 = new MenuScreenKt$MenuScreen$1$1$1$1(1, menuViewModel4, MenuViewModel.class, "updateSearch", "updateSearch(Ljava/lang/String;)V", 0);
                            composer3.Yey4RyhSyBRHub(menuScreenKt$MenuScreen$1$1$1$1);
                            UEutaskTsxaI2 = menuScreenKt$MenuScreen$1$1$1$1;
                        } else {
                            menuViewModel4 = menuViewModel5;
                        }
                        FillElement fillElement = SizeKt.yzPsTade5rL7D3;
                        MenuViewModel menuViewModel6 = menuViewModel4;
                        OutlinedTextFieldKt.yzPsTade5rL7D3(str, (Function1) ((KFunction) UEutaskTsxaI2), PaddingKt.i7xAcZoXXiIt(fillElement, 16.0f, 8.0f), false, false, null, ComposableSingletons$MenuScreenKt.ra306ClFT3HT, ComposableSingletons$MenuScreenKt.oyjLVtGms9eZwJ0, null, null, null, null, true, 0, 0, null, null, composer3, 102236544, 8257208);
                        Modifier Uo5pffGf8LUU = PaddingKt.Uo5pffGf8LUU(fillElement, 16.0f, 0.0f, 2);
                        RowMeasurePolicy yzPsTade5rL7D33 = RowKt.yzPsTade5rL7D3(Arrangement.i7xAcZoXXiIt(12.0f), Alignment.Companion.MRfxZSx8l5UG62U, composer3, 54);
                        int hashCode2 = Long.hashCode(composer3.getH5JgSr7BP0b5Z());
                        PersistentCompositionLocalMap FTJ2XS7ULgY82 = composer3.FTJ2XS7ULgY8();
                        Modifier oyjLVtGms9eZwJ02 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer3, Uo5pffGf8LUU);
                        if (composer3.PyXrjLswZZoWpho() == null) {
                            ComposablesKt.yzPsTade5rL7D3();
                            throw null;
                        }
                        composer3.tp5sG1Fy0ZCmW();
                        if (composer3.getEYWI9RMqk13H5()) {
                            function0 = function02;
                            composer3.EYWI9RMqk13H5(function0);
                        } else {
                            function0 = function02;
                            composer3.AGl7HBCQ8xrHABq();
                        }
                        Updater.hRNgd2zGCE5kj(composer3, yzPsTade5rL7D33, function22);
                        Updater.hRNgd2zGCE5kj(composer3, FTJ2XS7ULgY82, function23);
                        Updater.hRNgd2zGCE5kj(composer3, Integer.valueOf(hashCode2), function24);
                        Updater.yzPsTade5rL7D3(composer3, function13);
                        Updater.hRNgd2zGCE5kj(composer3, oyjLVtGms9eZwJ02, function25);
                        MutableState mutableState2 = mutableState;
                        boolean booleanValue = ((Boolean) mutableState2.getOyjLVtGms9eZwJ0()).booleanValue();
                        Object UEutaskTsxaI3 = composer3.UEutaskTsxaI();
                        if (UEutaskTsxaI3 == composer$Companion$Empty$12) {
                            UEutaskTsxaI3 = new P3UQsRX4QVEGd28(mutableState2, 2);
                            composer3.Yey4RyhSyBRHub(UEutaskTsxaI3);
                        }
                        ExposedDropdownMenuKt.yzPsTade5rL7D3(booleanValue, (Function1) UEutaskTsxaI3, RowScopeInstance.yzPsTade5rL7D3.yzPsTade5rL7D3(companion, 1.0f), ComposableLambdaKt.hRNgd2zGCE5kj(2083527648, new l0(state, mutableState2, Yey4RyhSyBRHub, menuViewModel6), composer3), composer3, 3120);
                        boolean NIabVTHf6LMJyXq2 = composer3.NIabVTHf6LMJyXq(menuViewModel6);
                        Object UEutaskTsxaI4 = composer3.UEutaskTsxaI();
                        if (NIabVTHf6LMJyXq2 || UEutaskTsxaI4 == composer$Companion$Empty$12) {
                            function2 = function25;
                            function12 = function13;
                            MenuScreenKt$MenuScreen$1$1$2$3$1 menuScreenKt$MenuScreen$1$1$2$3$1 = new MenuScreenKt$MenuScreen$1$1$2$3$1(0, menuViewModel6, MenuViewModel.class, "showSortSheet", "showSortSheet()V", 0);
                            composer3.Yey4RyhSyBRHub(menuScreenKt$MenuScreen$1$1$2$3$1);
                            UEutaskTsxaI4 = menuScreenKt$MenuScreen$1$1$2$3$1;
                        } else {
                            function12 = function13;
                            function2 = function25;
                        }
                        Function0 function03 = function0;
                        Function2 function26 = function2;
                        ButtonKt.ra306ClFT3HT((Function0) ((KFunction) UEutaskTsxaI4), null, false, null, null, null, ComposableLambdaKt.hRNgd2zGCE5kj(1925128519, new t1(state, 1), composer3), composer3, 805306368, 510);
                        composer3.GDGFDp2lxiHY();
                        if (((MenuUiState) state.getOyjLVtGms9eZwJ0()).hRNgd2zGCE5kj.isEmpty()) {
                            composer3.mFNFvFv0Eiyk(-696069967);
                            ra306ClFT3HT2 = ColumnScopeInstance.yzPsTade5rL7D3.ra306ClFT3HT(true);
                            Modifier yzUZju8lbdmWa2 = ra306ClFT3HT2.yzUZju8lbdmWa(fillElement);
                            MeasurePolicy oyjLVtGms9eZwJ03 = BoxKt.oyjLVtGms9eZwJ0(Alignment.Companion.b41X89IqSbKt, false);
                            int hashCode3 = Long.hashCode(composer3.getH5JgSr7BP0b5Z());
                            PersistentCompositionLocalMap FTJ2XS7ULgY83 = composer3.FTJ2XS7ULgY8();
                            Modifier oyjLVtGms9eZwJ04 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer3, yzUZju8lbdmWa2);
                            if (composer3.PyXrjLswZZoWpho() == null) {
                                ComposablesKt.yzPsTade5rL7D3();
                                throw null;
                            }
                            composer3.tp5sG1Fy0ZCmW();
                            if (composer3.getEYWI9RMqk13H5()) {
                                composer3.EYWI9RMqk13H5(function03);
                            } else {
                                composer3.AGl7HBCQ8xrHABq();
                            }
                            Updater.hRNgd2zGCE5kj(composer3, oyjLVtGms9eZwJ03, function22);
                            Updater.hRNgd2zGCE5kj(composer3, FTJ2XS7ULgY83, function23);
                            Updater.hRNgd2zGCE5kj(composer3, Integer.valueOf(hashCode3), function24);
                            Updater.yzPsTade5rL7D3(composer3, function12);
                            Updater.hRNgd2zGCE5kj(composer3, oyjLVtGms9eZwJ04, function26);
                            composer2 = composer3;
                            TextKt.hRNgd2zGCE5kj("No menu items found", PaddingKt.Uo5pffGf8LUU(companion, 32.0f, 0.0f, 2), MaterialTheme.yzPsTade5rL7D3(composer3).FTJ2XS7ULgY8, 0L, 0L, new TextAlign(3), 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(composer3).UEutaskTsxaI, composer2, 54, 0, 130040);
                            composer2.GDGFDp2lxiHY();
                            composer2.o4ticBN7g1K8jE();
                        } else {
                            composer3.mFNFvFv0Eiyk(-695452013);
                            ra306ClFT3HT = ColumnScopeInstance.yzPsTade5rL7D3.ra306ClFT3HT(true);
                            Modifier yzUZju8lbdmWa3 = ra306ClFT3HT.yzUZju8lbdmWa(fillElement);
                            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(16.0f, 16.0f, 16.0f, 16.0f);
                            Arrangement.SpacedAligned i7xAcZoXXiIt = Arrangement.i7xAcZoXXiIt(12.0f);
                            boolean zgejW39NNp2D = composer3.zgejW39NNp2D(state);
                            Function1 function14 = function1;
                            boolean zgejW39NNp2D2 = zgejW39NNp2D | composer3.zgejW39NNp2D(function14);
                            Object UEutaskTsxaI5 = composer3.UEutaskTsxaI();
                            if (zgejW39NNp2D2 || UEutaskTsxaI5 == composer$Companion$Empty$12) {
                                UEutaskTsxaI5 = new ra306ClFT3HT(29, state, function14);
                                composer3.Yey4RyhSyBRHub(UEutaskTsxaI5);
                            }
                            composer2 = composer3;
                            LazyDslKt.yzPsTade5rL7D3(yzUZju8lbdmWa3, null, paddingValuesImpl, i7xAcZoXXiIt, null, null, false, null, (Function1) UEutaskTsxaI5, composer2, 24960, 490);
                            composer2.o4ticBN7g1K8jE();
                        }
                        composer2.GDGFDp2lxiHY();
                    } else {
                        composer3.gmXBnHsR2YSm();
                    }
                    return Unit.yzPsTade5rL7D3;
                }
            }, BD2CRjLJ8EtOqGQ), BD2CRjLJ8EtOqGQ, 805306416, 253);
            BD2CRjLJ8EtOqGQ = BD2CRjLJ8EtOqGQ;
            if (((MenuUiState) hRNgd2zGCE5kj.getOyjLVtGms9eZwJ0()).gmXBnHsR2YSm) {
                BD2CRjLJ8EtOqGQ.mFNFvFv0Eiyk(-2101970321);
                boolean NIabVTHf6LMJyXq = BD2CRjLJ8EtOqGQ.NIabVTHf6LMJyXq(menuViewModel2);
                Object UEutaskTsxaI2 = BD2CRjLJ8EtOqGQ.UEutaskTsxaI();
                if (NIabVTHf6LMJyXq || UEutaskTsxaI2 == composer$Companion$Empty$1) {
                    UEutaskTsxaI2 = new MenuScreenKt$MenuScreen$2$1(0, menuViewModel2, MenuViewModel.class, "hideSortSheet", "hideSortSheet()V", 0);
                    BD2CRjLJ8EtOqGQ.Yey4RyhSyBRHub(UEutaskTsxaI2);
                }
                ModalBottomSheetKt.yzPsTade5rL7D3((Function0) ((KFunction) UEutaskTsxaI2), null, gmXBnHsR2YSm, 0.0f, false, null, 0L, 0L, 0L, null, null, null, ComposableLambdaKt.hRNgd2zGCE5kj(-1090448506, new t3(Yey4RyhSyBRHub2, menuViewModel2, hRNgd2zGCE5kj, i3), BD2CRjLJ8EtOqGQ), BD2CRjLJ8EtOqGQ, 0);
                BD2CRjLJ8EtOqGQ = BD2CRjLJ8EtOqGQ;
                BD2CRjLJ8EtOqGQ.o4ticBN7g1K8jE();
            } else {
                BD2CRjLJ8EtOqGQ.mFNFvFv0Eiyk(-2100321245);
                BD2CRjLJ8EtOqGQ.o4ticBN7g1K8jE();
            }
        } else {
            BD2CRjLJ8EtOqGQ.gmXBnHsR2YSm();
            menuViewModel2 = menuViewModel;
        }
        ScopeUpdateScope AwgywP6bDNsW = BD2CRjLJ8EtOqGQ.AwgywP6bDNsW();
        if (AwgywP6bDNsW != null) {
            AwgywP6bDNsW.yzPsTade5rL7D3(new wN5ohFcBOzLLfqV(function1, menuViewModel2, i));
        }
    }

    public static final void yzPsTade5rL7D3(MenuItemEntity menuItemEntity, Function0 function0, Composer composer, int i) {
        ArrayList arrayList;
        float f;
        Composer BD2CRjLJ8EtOqGQ = composer.BD2CRjLJ8EtOqGQ(-38123115);
        int i2 = (BD2CRjLJ8EtOqGQ.zgejW39NNp2D(menuItemEntity) ? 4 : 2) | i | (BD2CRjLJ8EtOqGQ.NIabVTHf6LMJyXq(function0) ? 32 : 16);
        int i3 = 0;
        if (BD2CRjLJ8EtOqGQ.ZvpnNpCMEWSR3(i2 & 1, (i2 & 19) != 18)) {
            List uY26rxeEAFnDq = StringsKt.uY26rxeEAFnDq(menuItemEntity.Uo5pffGf8LUU, new String[]{","});
            ArrayList arrayList2 = new ArrayList(CollectionsKt.NIabVTHf6LMJyXq(uY26rxeEAFnDq, 10));
            Iterator it = uY26rxeEAFnDq.iterator();
            while (it.hasNext()) {
                arrayList2.add(StringsKt.vAthhQhzH5WQr3((String) it.next()).toString());
            }
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                if (((String) obj).length() > 0) {
                    arrayList3.add(obj);
                }
            }
            RoundedCornerShape yzPsTade5rL7D3 = RoundedCornerShapeKt.yzPsTade5rL7D3(20.0f);
            long j = MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ).MCcLy95b8Awzmw;
            long hRNgd2zGCE5kj = ColorSchemeKt.hRNgd2zGCE5kj(j, BD2CRjLJ8EtOqGQ);
            long j2 = Color.i7xAcZoXXiIt;
            long hRNgd2zGCE5kj2 = Color.hRNgd2zGCE5kj(0.38f, hRNgd2zGCE5kj);
            ColorScheme yzPsTade5rL7D32 = MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ);
            CardColors cardColors = yzPsTade5rL7D32.NIQ0uGqrgooN;
            if (cardColors == null) {
                ColorSchemeKeyTokens colorSchemeKeyTokens = FilledCardTokens.yzPsTade5rL7D3;
                arrayList = arrayList3;
                cardColors = new CardColors(ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D32, colorSchemeKeyTokens), ColorSchemeKt.yzPsTade5rL7D3(yzPsTade5rL7D32, ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D32, colorSchemeKeyTokens)), ColorKt.i7xAcZoXXiIt(Color.hRNgd2zGCE5kj(FilledCardTokens.ra306ClFT3HT, ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D32, FilledCardTokens.hRNgd2zGCE5kj)), ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D32, colorSchemeKeyTokens)), Color.hRNgd2zGCE5kj(0.38f, ColorSchemeKt.yzPsTade5rL7D3(yzPsTade5rL7D32, ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D32, colorSchemeKeyTokens))));
                yzPsTade5rL7D32.NIQ0uGqrgooN = cardColors;
            } else {
                arrayList = arrayList3;
            }
            CardColors yzPsTade5rL7D33 = cardColors.yzPsTade5rL7D3(j, hRNgd2zGCE5kj, j2, hRNgd2zGCE5kj2);
            if ((62 & 1) != 0) {
                ColorSchemeKeyTokens colorSchemeKeyTokens2 = FilledCardTokens.yzPsTade5rL7D3;
                f = 0.0f;
            } else {
                f = 2.0f;
            }
            CardKt.yzPsTade5rL7D3(function0, SizeKt.yzPsTade5rL7D3, false, yzPsTade5rL7D3, yzPsTade5rL7D33, new CardElevation(f, 0.0f, 0.0f, FilledCardTokens.b41X89IqSbKt, FilledCardTokens.oyjLVtGms9eZwJ0, 0.0f), null, ComposableLambdaKt.hRNgd2zGCE5kj(273267338, new z6n0KAn5YNjXskD(menuItemEntity, arrayList, function0, 2), BD2CRjLJ8EtOqGQ), BD2CRjLJ8EtOqGQ, ((i2 >> 3) & 14) | 100663344, 196);
        } else {
            BD2CRjLJ8EtOqGQ.gmXBnHsR2YSm();
        }
        ScopeUpdateScope AwgywP6bDNsW = BD2CRjLJ8EtOqGQ.AwgywP6bDNsW();
        if (AwgywP6bDNsW != null) {
            AwgywP6bDNsW.yzPsTade5rL7D3(new wN5ohFcBOzLLfqV(menuItemEntity, function0, i, 11));
        }
    }
}
