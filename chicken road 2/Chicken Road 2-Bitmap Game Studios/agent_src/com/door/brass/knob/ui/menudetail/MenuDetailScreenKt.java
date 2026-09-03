package com.door.brass.knob.ui.menudetail;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelStoreOwnerDefaults;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.door.brass.knob.data.db.entity.MenuItemEntity;
import defpackage.NIabVTHf6LMJyXq;
import defpackage.WX2SCXtutbTy;
import defpackage.wN5ohFcBOzLLfqV;
import defpackage.z6n0KAn5YNjXskD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
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
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lcom/door/brass/knob/ui/menudetail/MenuDetailUiState;", "uiState", "app"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MenuDetailScreenKt {
    public static final void yzPsTade5rL7D3(Function0 function0, Function1 function1, MenuDetailViewModel menuDetailViewModel, Composer composer, int i) {
        Composer composer2;
        MenuDetailViewModel menuDetailViewModel2;
        int i2;
        final MenuDetailViewModel menuDetailViewModel3;
        function0.getClass();
        function1.getClass();
        Composer BD2CRjLJ8EtOqGQ = composer.BD2CRjLJ8EtOqGQ(1335397897);
        int i3 = (BD2CRjLJ8EtOqGQ.NIabVTHf6LMJyXq(function0) ? 4 : 2) | i | (BD2CRjLJ8EtOqGQ.NIabVTHf6LMJyXq(function1) ? 32 : 16) | 128;
        if (BD2CRjLJ8EtOqGQ.ZvpnNpCMEWSR3(i3 & 1, (i3 & 147) != 146)) {
            BD2CRjLJ8EtOqGQ.uY26rxeEAFnDq();
            if ((i & 1) == 0 || BD2CRjLJ8EtOqGQ.exVmIuryuB8HeQ()) {
                ViewModelStoreOwner yzPsTade5rL7D3 = LocalViewModelStoreOwner.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ);
                if (yzPsTade5rL7D3 == null) {
                    defpackage.yzPsTade5rL7D3.kSPEzfraxudm4i("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    MenuDetailViewModel menuDetailViewModel4 = (MenuDetailViewModel) ViewModelKt.yzPsTade5rL7D3(Reflection.yzPsTade5rL7D3(MenuDetailViewModel.class), yzPsTade5rL7D3, HiltViewModelKt.yzPsTade5rL7D3(ViewModelStoreOwnerDefaults.hRNgd2zGCE5kj(yzPsTade5rL7D3), BD2CRjLJ8EtOqGQ), ViewModelStoreOwnerDefaults.yzPsTade5rL7D3(yzPsTade5rL7D3), BD2CRjLJ8EtOqGQ);
                    i2 = i3 & (-897);
                    menuDetailViewModel3 = menuDetailViewModel4;
                }
            } else {
                BD2CRjLJ8EtOqGQ.gmXBnHsR2YSm();
                i2 = i3 & (-897);
                menuDetailViewModel3 = menuDetailViewModel;
            }
            BD2CRjLJ8EtOqGQ.K6HLhdE38aTVLa();
            final MutableState hRNgd2zGCE5kj = SnapshotStateKt.hRNgd2zGCE5kj(menuDetailViewModel3.i7xAcZoXXiIt, BD2CRjLJ8EtOqGQ);
            Boolean valueOf = Boolean.valueOf(((MenuDetailUiState) hRNgd2zGCE5kj.getOyjLVtGms9eZwJ0()).oyjLVtGms9eZwJ0);
            boolean zgejW39NNp2D = ((i2 & 14) == 4) | BD2CRjLJ8EtOqGQ.zgejW39NNp2D(hRNgd2zGCE5kj) | BD2CRjLJ8EtOqGQ.NIabVTHf6LMJyXq(menuDetailViewModel3);
            Object UEutaskTsxaI = BD2CRjLJ8EtOqGQ.UEutaskTsxaI();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.yzPsTade5rL7D3;
            if (zgejW39NNp2D || UEutaskTsxaI == composer$Companion$Empty$1) {
                UEutaskTsxaI = new MenuDetailScreenKt$MenuDetailScreen$1$1(menuDetailViewModel3, function0, hRNgd2zGCE5kj, null);
                BD2CRjLJ8EtOqGQ.Yey4RyhSyBRHub(UEutaskTsxaI);
            }
            EffectsKt.oyjLVtGms9eZwJ0(BD2CRjLJ8EtOqGQ, valueOf, (Function2) UEutaskTsxaI);
            Long l = ((MenuDetailUiState) hRNgd2zGCE5kj.getOyjLVtGms9eZwJ0()).b41X89IqSbKt;
            boolean zgejW39NNp2D2 = BD2CRjLJ8EtOqGQ.zgejW39NNp2D(hRNgd2zGCE5kj) | ((i2 & 112) == 32) | BD2CRjLJ8EtOqGQ.NIabVTHf6LMJyXq(menuDetailViewModel3);
            Object UEutaskTsxaI2 = BD2CRjLJ8EtOqGQ.UEutaskTsxaI();
            if (zgejW39NNp2D2 || UEutaskTsxaI2 == composer$Companion$Empty$1) {
                UEutaskTsxaI2 = new MenuDetailScreenKt$MenuDetailScreen$2$1(hRNgd2zGCE5kj, function1, menuDetailViewModel3, null);
                BD2CRjLJ8EtOqGQ.Yey4RyhSyBRHub(UEutaskTsxaI2);
            }
            EffectsKt.oyjLVtGms9eZwJ0(BD2CRjLJ8EtOqGQ, l, (Function2) UEutaskTsxaI2);
            final List Yey4RyhSyBRHub = CollectionsKt.Yey4RyhSyBRHub(new Pair("tangy", "Tangy"), new Pair("buttery", "Buttery"), new Pair("zesty", "Zesty"), new Pair("velvety", "Velvety"), new Pair("caramelized", "Caramelized"));
            WindowInsets yzPsTade5rL7D32 = WindowInsetsKt.yzPsTade5rL7D3(0, 14);
            ComposableLambdaImpl hRNgd2zGCE5kj2 = ComposableLambdaKt.hRNgd2zGCE5kj(-1020358459, new wN5ohFcBOzLLfqV(9, hRNgd2zGCE5kj, function0), BD2CRjLJ8EtOqGQ);
            ComposableLambdaImpl hRNgd2zGCE5kj3 = ComposableLambdaKt.hRNgd2zGCE5kj(1337404570, new Function3() { // from class: com.door.brass.knob.ui.menudetail.yzPsTade5rL7D3
                @Override // kotlin.jvm.functions.Function3
                public final Object MRfxZSx8l5UG62U(Object obj, Object obj2, Object obj3) {
                    MutableState mutableState;
                    Modifier.Companion companion;
                    float f;
                    MenuItemEntity menuItemEntity;
                    MenuDetailViewModel menuDetailViewModel5;
                    PaddingValues paddingValues = (PaddingValues) obj;
                    Composer composer3 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    paddingValues.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= composer3.zgejW39NNp2D(paddingValues) ? 4 : 2;
                    }
                    if (composer3.ZvpnNpCMEWSR3(intValue & 1, (intValue & 19) != 18)) {
                        Modifier.Companion companion2 = Modifier.Companion.oyjLVtGms9eZwJ0;
                        Modifier b41X89IqSbKt = PaddingKt.b41X89IqSbKt(companion2, paddingValues);
                        MeasurePolicy oyjLVtGms9eZwJ0 = BoxKt.oyjLVtGms9eZwJ0(Alignment.Companion.yzPsTade5rL7D3, false);
                        int hashCode = Long.hashCode(composer3.getH5JgSr7BP0b5Z());
                        PersistentCompositionLocalMap FTJ2XS7ULgY8 = composer3.FTJ2XS7ULgY8();
                        Modifier oyjLVtGms9eZwJ02 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer3, b41X89IqSbKt);
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
                        Function2 function2 = ComposeUiNode.Companion.gmXBnHsR2YSm;
                        Updater.hRNgd2zGCE5kj(composer3, oyjLVtGms9eZwJ0, function2);
                        Function2 function22 = ComposeUiNode.Companion.b41X89IqSbKt;
                        Updater.hRNgd2zGCE5kj(composer3, FTJ2XS7ULgY8, function22);
                        Integer valueOf2 = Integer.valueOf(hashCode);
                        Function2 function23 = ComposeUiNode.Companion.i7xAcZoXXiIt;
                        Updater.hRNgd2zGCE5kj(composer3, valueOf2, function23);
                        Function1 function12 = ComposeUiNode.Companion.Uo5pffGf8LUU;
                        Updater.yzPsTade5rL7D3(composer3, function12);
                        Function2 function24 = ComposeUiNode.Companion.oyjLVtGms9eZwJ0;
                        Updater.hRNgd2zGCE5kj(composer3, oyjLVtGms9eZwJ02, function24);
                        FillElement fillElement = SizeKt.yzPsTade5rL7D3;
                        Modifier gmXBnHsR2YSm = PaddingKt.gmXBnHsR2YSm(ScrollKt.hRNgd2zGCE5kj(fillElement, ScrollKt.yzPsTade5rL7D3(composer3), true), 16.0f);
                        ColumnMeasurePolicy yzPsTade5rL7D33 = ColumnKt.yzPsTade5rL7D3(Arrangement.ra306ClFT3HT, Alignment.Companion.uypNJrpDByoB, composer3, 0);
                        int hashCode2 = Long.hashCode(composer3.getH5JgSr7BP0b5Z());
                        PersistentCompositionLocalMap FTJ2XS7ULgY82 = composer3.FTJ2XS7ULgY8();
                        Modifier oyjLVtGms9eZwJ03 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer3, gmXBnHsR2YSm);
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
                        Updater.hRNgd2zGCE5kj(composer3, yzPsTade5rL7D33, function2);
                        Updater.hRNgd2zGCE5kj(composer3, FTJ2XS7ULgY82, function22);
                        Updater.hRNgd2zGCE5kj(composer3, Integer.valueOf(hashCode2), function23);
                        Updater.yzPsTade5rL7D3(composer3, function12);
                        Updater.hRNgd2zGCE5kj(composer3, oyjLVtGms9eZwJ03, function24);
                        float f2 = 16.0f;
                        SurfaceKt.yzPsTade5rL7D3(SizeKt.ra306ClFT3HT(fillElement, 180.0f), RoundedCornerShapeKt.yzPsTade5rL7D3(24.0f), MaterialTheme.yzPsTade5rL7D3(composer3).ra306ClFT3HT, 0L, 0.0f, 0.0f, null, ComposableSingletons$MenuDetailScreenKt.hRNgd2zGCE5kj, composer3, 12582918, 120);
                        Composer composer4 = composer3;
                        SpacerKt.yzPsTade5rL7D3(composer4, SizeKt.ra306ClFT3HT(companion2, 16.0f));
                        MutableState mutableState2 = hRNgd2zGCE5kj;
                        MenuItemEntity menuItemEntity2 = ((MenuDetailUiState) mutableState2.getOyjLVtGms9eZwJ0()).yzPsTade5rL7D3;
                        if (menuItemEntity2 == null) {
                            composer4.mFNFvFv0Eiyk(-1001625780);
                            composer4.o4ticBN7g1K8jE();
                            mutableState = mutableState2;
                            f = 8.0f;
                            companion = companion2;
                        } else {
                            composer4.mFNFvFv0Eiyk(-1001625779);
                            mutableState = mutableState2;
                            companion = companion2;
                            TextKt.hRNgd2zGCE5kj(menuItemEntity2.hRNgd2zGCE5kj, null, MaterialTheme.yzPsTade5rL7D3(composer4).o2t7oodqU1bUMaS, 0L, 0L, null, 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(composer4).gmXBnHsR2YSm, composer4, 0, 0, 131066);
                            Composer composer5 = composer4;
                            SpacerKt.yzPsTade5rL7D3(composer5, SizeKt.ra306ClFT3HT(companion, 8.0f));
                            FlowLayoutKt.hRNgd2zGCE5kj(fillElement, Arrangement.i7xAcZoXXiIt(8.0f), Arrangement.i7xAcZoXXiIt(8.0f), null, 0, 0, ComposableLambdaKt.hRNgd2zGCE5kj(-943832233, new WX2SCXtutbTy(5, menuItemEntity2), composer5), composer5, 1573302, 56);
                            List uY26rxeEAFnDq = StringsKt.uY26rxeEAFnDq(menuItemEntity2.Uo5pffGf8LUU, new String[]{","});
                            ArrayList arrayList = new ArrayList(CollectionsKt.NIabVTHf6LMJyXq(uY26rxeEAFnDq, 10));
                            Iterator it = uY26rxeEAFnDq.iterator();
                            while (it.hasNext()) {
                                arrayList.add(StringsKt.vAthhQhzH5WQr3((String) it.next()).toString());
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int size = arrayList.size();
                            int i4 = 0;
                            while (i4 < size) {
                                Object obj4 = arrayList.get(i4);
                                i4++;
                                if (((String) obj4).length() > 0) {
                                    arrayList2.add(obj4);
                                }
                            }
                            if (arrayList2.isEmpty()) {
                                f = 8.0f;
                                menuItemEntity = menuItemEntity2;
                                composer5.mFNFvFv0Eiyk(1384198854);
                                composer5.o4ticBN7g1K8jE();
                            } else {
                                composer5.mFNFvFv0Eiyk(1382949554);
                                SpacerKt.yzPsTade5rL7D3(composer5, SizeKt.ra306ClFT3HT(companion, 12.0f));
                                menuItemEntity = menuItemEntity2;
                                f = 8.0f;
                                TextKt.hRNgd2zGCE5kj("Tags", null, MaterialTheme.yzPsTade5rL7D3(composer5).FTJ2XS7ULgY8, 0L, 0L, null, 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(composer5).uypNJrpDByoB, composer5, 6, 0, 131066);
                                composer5 = composer5;
                                SpacerKt.yzPsTade5rL7D3(composer5, SizeKt.ra306ClFT3HT(companion, 6.0f));
                                FlowLayoutKt.hRNgd2zGCE5kj(SizeKt.yzPsTade5rL7D3, Arrangement.i7xAcZoXXiIt(8.0f), Arrangement.i7xAcZoXXiIt(8.0f), null, 0, 0, ComposableLambdaKt.hRNgd2zGCE5kj(-1515613028, new WX2SCXtutbTy(6, arrayList2), composer5), composer5, 1573302, 56);
                                composer5.o4ticBN7g1K8jE();
                            }
                            SpacerKt.yzPsTade5rL7D3(composer5, SizeKt.ra306ClFT3HT(companion, 16.0f));
                            Composer composer6 = composer5;
                            TextKt.hRNgd2zGCE5kj(menuItemEntity.oyjLVtGms9eZwJ0, null, MaterialTheme.yzPsTade5rL7D3(composer5).o2t7oodqU1bUMaS, 0L, 0L, null, 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(composer5).UEutaskTsxaI, composer6, 0, 0, 131066);
                            composer4 = composer6;
                            String str = menuItemEntity.b41X89IqSbKt;
                            String obj5 = str != null ? StringsKt.vAthhQhzH5WQr3(str).toString() : null;
                            if (obj5 == null) {
                                obj5 = "";
                            }
                            if (obj5.length() > 0) {
                                composer4.mFNFvFv0Eiyk(1384643053);
                                SpacerKt.yzPsTade5rL7D3(composer4, SizeKt.ra306ClFT3HT(companion, 16.0f));
                                TextKt.hRNgd2zGCE5kj("Ingredients", null, MaterialTheme.yzPsTade5rL7D3(composer4).FTJ2XS7ULgY8, 0L, 0L, null, 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(composer4).uypNJrpDByoB, composer4, 6, 0, 131066);
                                SpacerKt.yzPsTade5rL7D3(composer4, SizeKt.ra306ClFT3HT(companion, 6.0f));
                                TextKt.hRNgd2zGCE5kj(obj5, null, MaterialTheme.yzPsTade5rL7D3(composer4).o2t7oodqU1bUMaS, 0L, 0L, null, 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(composer4).MRfxZSx8l5UG62U, composer4, 0, 0, 131066);
                                composer4 = composer4;
                                composer4.o4ticBN7g1K8jE();
                            } else {
                                composer4.mFNFvFv0Eiyk(1385282118);
                                composer4.o4ticBN7g1K8jE();
                            }
                            composer4.o4ticBN7g1K8jE();
                            f2 = 16.0f;
                        }
                        SpacerKt.yzPsTade5rL7D3(composer4, SizeKt.ra306ClFT3HT(companion, f2));
                        MenuDetailViewModel menuDetailViewModel6 = MenuDetailViewModel.this;
                        boolean NIabVTHf6LMJyXq = composer4.NIabVTHf6LMJyXq(menuDetailViewModel6);
                        Object UEutaskTsxaI3 = composer4.UEutaskTsxaI();
                        if (NIabVTHf6LMJyXq || UEutaskTsxaI3 == Composer.Companion.yzPsTade5rL7D3) {
                            MenuDetailScreenKt$MenuDetailScreen$4$1$1$2$1 menuDetailScreenKt$MenuDetailScreen$4$1$1$2$1 = new MenuDetailScreenKt$MenuDetailScreen$4$1$1$2$1(0, menuDetailViewModel6, MenuDetailViewModel.class, "shufflePick", "shufflePick()V", 0);
                            menuDetailViewModel5 = menuDetailViewModel6;
                            composer4.Yey4RyhSyBRHub(menuDetailScreenKt$MenuDetailScreen$4$1$1$2$1);
                            UEutaskTsxaI3 = menuDetailScreenKt$MenuDetailScreen$4$1$1$2$1;
                        } else {
                            menuDetailViewModel5 = menuDetailViewModel6;
                        }
                        Function0 function03 = (Function0) ((KFunction) UEutaskTsxaI3);
                        FillElement fillElement2 = SizeKt.yzPsTade5rL7D3;
                        Composer composer7 = composer4;
                        ButtonKt.yzPsTade5rL7D3(function03, fillElement2, false, null, null, null, null, null, ComposableSingletons$MenuDetailScreenKt.ra306ClFT3HT, composer7, 805306416, 508);
                        SpacerKt.yzPsTade5rL7D3(composer7, SizeKt.ra306ClFT3HT(companion, 24.0f));
                        TextKt.hRNgd2zGCE5kj("Taste Mark", null, MaterialTheme.yzPsTade5rL7D3(composer7).o2t7oodqU1bUMaS, 0L, 0L, null, 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(composer7).Uo5pffGf8LUU, composer7, 6, 0, 131066);
                        float f3 = f;
                        SpacerKt.yzPsTade5rL7D3(composer7, SizeKt.ra306ClFT3HT(companion, f3));
                        FlowLayoutKt.hRNgd2zGCE5kj(fillElement2, Arrangement.i7xAcZoXXiIt(f3), null, null, 0, 0, ComposableLambdaKt.hRNgd2zGCE5kj(1656511867, new z6n0KAn5YNjXskD(Yey4RyhSyBRHub, menuDetailViewModel5, mutableState, 1), composer7), composer7, 1572918, 60);
                        composer7.GDGFDp2lxiHY();
                        composer7.GDGFDp2lxiHY();
                    } else {
                        composer3.gmXBnHsR2YSm();
                    }
                    return Unit.yzPsTade5rL7D3;
                }
            }, BD2CRjLJ8EtOqGQ);
            composer2 = BD2CRjLJ8EtOqGQ;
            menuDetailViewModel2 = menuDetailViewModel3;
            ScaffoldKt.yzPsTade5rL7D3(null, hRNgd2zGCE5kj2, null, null, null, 0, 0L, 0L, yzPsTade5rL7D32, hRNgd2zGCE5kj3, composer2, 805306416, 253);
        } else {
            composer2 = BD2CRjLJ8EtOqGQ;
            composer2.gmXBnHsR2YSm();
            menuDetailViewModel2 = menuDetailViewModel;
        }
        ScopeUpdateScope AwgywP6bDNsW = composer2.AwgywP6bDNsW();
        if (AwgywP6bDNsW != null) {
            AwgywP6bDNsW.yzPsTade5rL7D3(new NIabVTHf6LMJyXq(function0, function1, menuDetailViewModel2, i));
        }
    }
}
