package com.door.brass.knob.ui.tips;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.outlined.LightbulbKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.OutlinedCardTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelStoreOwnerDefaults;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.door.brass.knob.data.db.entity.TipEntity;
import defpackage.EYWI9RMqk13H5;
import defpackage.b;
import defpackage.u3;
import defpackage.wN5ohFcBOzLLfqV;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lcom/door/brass/knob/ui/tips/TipsUiState;", "uiState", "app"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TipsScreenKt {
    public static final void hRNgd2zGCE5kj(TipsViewModel tipsViewModel, Composer composer, int i) {
        final TipsViewModel tipsViewModel2;
        Object obj;
        Composer BD2CRjLJ8EtOqGQ = composer.BD2CRjLJ8EtOqGQ(-1513949568);
        int i2 = i | 2;
        if (BD2CRjLJ8EtOqGQ.ZvpnNpCMEWSR3(i2 & 1, (i2 & 3) != 2)) {
            BD2CRjLJ8EtOqGQ.uY26rxeEAFnDq();
            if ((i & 1) == 0 || BD2CRjLJ8EtOqGQ.exVmIuryuB8HeQ()) {
                ViewModelStoreOwner yzPsTade5rL7D3 = LocalViewModelStoreOwner.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ);
                if (yzPsTade5rL7D3 == null) {
                    defpackage.yzPsTade5rL7D3.kSPEzfraxudm4i("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                tipsViewModel2 = (TipsViewModel) ViewModelKt.yzPsTade5rL7D3(Reflection.yzPsTade5rL7D3(TipsViewModel.class), yzPsTade5rL7D3, HiltViewModelKt.yzPsTade5rL7D3(ViewModelStoreOwnerDefaults.hRNgd2zGCE5kj(yzPsTade5rL7D3), BD2CRjLJ8EtOqGQ), ViewModelStoreOwnerDefaults.yzPsTade5rL7D3(yzPsTade5rL7D3), BD2CRjLJ8EtOqGQ);
            } else {
                BD2CRjLJ8EtOqGQ.gmXBnHsR2YSm();
                tipsViewModel2 = tipsViewModel;
            }
            BD2CRjLJ8EtOqGQ.K6HLhdE38aTVLa();
            final MutableState hRNgd2zGCE5kj = SnapshotStateKt.hRNgd2zGCE5kj(tipsViewModel2.oyjLVtGms9eZwJ0, BD2CRjLJ8EtOqGQ);
            SheetState gmXBnHsR2YSm = ModalBottomSheetKt.gmXBnHsR2YSm(6, 2, BD2CRjLJ8EtOqGQ);
            Iterator it = ((TipsUiState) hRNgd2zGCE5kj.getOyjLVtGms9eZwJ0()).yzPsTade5rL7D3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                long j = ((TipEntity) obj).yzPsTade5rL7D3;
                Long l = ((TipsUiState) hRNgd2zGCE5kj.getOyjLVtGms9eZwJ0()).ra306ClFT3HT;
                if (l != null && j == l.longValue()) {
                    break;
                }
            }
            TipEntity tipEntity = (TipEntity) obj;
            ScaffoldKt.yzPsTade5rL7D3(null, ComposableSingletons$TipsScreenKt.hRNgd2zGCE5kj, null, null, null, 0, 0L, 0L, WindowInsetsKt.yzPsTade5rL7D3(0, 14), ComposableLambdaKt.hRNgd2zGCE5kj(586328721, new Function3() { // from class: com.door.brass.knob.ui.tips.yzPsTade5rL7D3
                @Override // kotlin.jvm.functions.Function3
                public final Object MRfxZSx8l5UG62U(Object obj2, Object obj3, Object obj4) {
                    Object obj5;
                    Modifier ra306ClFT3HT;
                    Composer composer2;
                    Modifier ra306ClFT3HT2;
                    Function0 function0;
                    float f;
                    PaddingValues paddingValues = (PaddingValues) obj2;
                    Composer composer3 = (Composer) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    paddingValues.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= composer3.zgejW39NNp2D(paddingValues) ? 4 : 2;
                    }
                    if (composer3.ZvpnNpCMEWSR3(intValue & 1, (intValue & 19) != 18)) {
                        Modifier.Companion companion = Modifier.Companion.oyjLVtGms9eZwJ0;
                        Modifier yzUZju8lbdmWa = PaddingKt.b41X89IqSbKt(companion, paddingValues).yzUZju8lbdmWa(SizeKt.ra306ClFT3HT);
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.uypNJrpDByoB;
                        Arrangement$Top$1 arrangement$Top$1 = Arrangement.ra306ClFT3HT;
                        ColumnMeasurePolicy yzPsTade5rL7D32 = ColumnKt.yzPsTade5rL7D3(arrangement$Top$1, horizontal, composer3, 0);
                        int hashCode = Long.hashCode(composer3.getOyjLVtGms9eZwJ0());
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
                        Function2 function2 = ComposeUiNode.Companion.gmXBnHsR2YSm;
                        Updater.hRNgd2zGCE5kj(composer3, yzPsTade5rL7D32, function2);
                        Function2 function22 = ComposeUiNode.Companion.b41X89IqSbKt;
                        Updater.hRNgd2zGCE5kj(composer3, FTJ2XS7ULgY8, function22);
                        Integer valueOf = Integer.valueOf(hashCode);
                        Function2 function23 = ComposeUiNode.Companion.i7xAcZoXXiIt;
                        Updater.hRNgd2zGCE5kj(composer3, valueOf, function23);
                        Function1 function1 = ComposeUiNode.Companion.Uo5pffGf8LUU;
                        Updater.yzPsTade5rL7D3(composer3, function1);
                        Function2 function24 = ComposeUiNode.Companion.oyjLVtGms9eZwJ0;
                        Updater.hRNgd2zGCE5kj(composer3, oyjLVtGms9eZwJ0, function24);
                        MutableState mutableState = hRNgd2zGCE5kj;
                        String str = ((TipsUiState) mutableState.getOyjLVtGms9eZwJ0()).hRNgd2zGCE5kj;
                        Object obj6 = TipsViewModel.this;
                        boolean NIabVTHf6LMJyXq = composer3.NIabVTHf6LMJyXq(obj6);
                        Object UEutaskTsxaI = composer3.UEutaskTsxaI();
                        Object obj7 = Composer.Companion.yzPsTade5rL7D3;
                        if (NIabVTHf6LMJyXq || UEutaskTsxaI == obj7) {
                            obj5 = obj7;
                            UEutaskTsxaI = new TipsScreenKt$TipsScreen$1$1$1$1(1, obj6, TipsViewModel.class, "updateSearch", "updateSearch(Ljava/lang/String;)V", 0);
                            composer3.Yey4RyhSyBRHub(UEutaskTsxaI);
                        } else {
                            obj5 = obj7;
                        }
                        FillElement fillElement = SizeKt.yzPsTade5rL7D3;
                        Object obj8 = obj5;
                        OutlinedTextFieldKt.yzPsTade5rL7D3(str, (Function1) ((KFunction) UEutaskTsxaI), PaddingKt.i7xAcZoXXiIt(fillElement, 16.0f, 8.0f), false, false, null, ComposableSingletons$TipsScreenKt.ra306ClFT3HT, ComposableSingletons$TipsScreenKt.oyjLVtGms9eZwJ0, null, null, null, null, true, 0, 0, null, null, composer3, 102236544, 8257208);
                        if (((TipsUiState) mutableState.getOyjLVtGms9eZwJ0()).yzPsTade5rL7D3.isEmpty()) {
                            composer3.mFNFvFv0Eiyk(1610728191);
                            ra306ClFT3HT2 = ColumnScopeInstance.yzPsTade5rL7D3.ra306ClFT3HT(true);
                            Modifier yzUZju8lbdmWa2 = ra306ClFT3HT2.yzUZju8lbdmWa(fillElement);
                            MeasurePolicy oyjLVtGms9eZwJ02 = BoxKt.oyjLVtGms9eZwJ0(Alignment.Companion.b41X89IqSbKt, false);
                            int hashCode2 = Long.hashCode(composer3.getOyjLVtGms9eZwJ0());
                            PersistentCompositionLocalMap FTJ2XS7ULgY82 = composer3.FTJ2XS7ULgY8();
                            Modifier oyjLVtGms9eZwJ03 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer3, yzUZju8lbdmWa2);
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
                            Updater.hRNgd2zGCE5kj(composer3, oyjLVtGms9eZwJ02, function2);
                            Updater.hRNgd2zGCE5kj(composer3, FTJ2XS7ULgY82, function22);
                            Updater.hRNgd2zGCE5kj(composer3, Integer.valueOf(hashCode2), function23);
                            Updater.yzPsTade5rL7D3(composer3, function1);
                            Updater.hRNgd2zGCE5kj(composer3, oyjLVtGms9eZwJ03, function24);
                            ColumnMeasurePolicy yzPsTade5rL7D33 = ColumnKt.yzPsTade5rL7D3(arrangement$Top$1, Alignment.Companion.yRx9jbDCTnXb3, composer3, 48);
                            int hashCode3 = Long.hashCode(composer3.getOyjLVtGms9eZwJ0());
                            PersistentCompositionLocalMap FTJ2XS7ULgY83 = composer3.FTJ2XS7ULgY8();
                            Modifier oyjLVtGms9eZwJ04 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer3, companion);
                            if (composer3.PyXrjLswZZoWpho() == null) {
                                ComposablesKt.yzPsTade5rL7D3();
                                throw null;
                            }
                            composer3.tp5sG1Fy0ZCmW();
                            if (composer3.getEYWI9RMqk13H5()) {
                                composer3.EYWI9RMqk13H5(function0);
                            } else {
                                composer3.AGl7HBCQ8xrHABq();
                            }
                            Updater.hRNgd2zGCE5kj(composer3, yzPsTade5rL7D33, function2);
                            Updater.hRNgd2zGCE5kj(composer3, FTJ2XS7ULgY83, function22);
                            Updater.hRNgd2zGCE5kj(composer3, Integer.valueOf(hashCode3), function23);
                            Updater.yzPsTade5rL7D3(composer3, function1);
                            Updater.hRNgd2zGCE5kj(composer3, oyjLVtGms9eZwJ04, function24);
                            ImageVector imageVector = LightbulbKt.yzPsTade5rL7D3;
                            if (imageVector != null) {
                                f = 8.0f;
                            } else {
                                ImageVector.Builder builder = new ImageVector.Builder("Outlined.Lightbulb", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                int i3 = VectorKt.yzPsTade5rL7D3;
                                SolidColor solidColor = new SolidColor(Color.hRNgd2zGCE5kj);
                                PathBuilder pathBuilder = new PathBuilder();
                                pathBuilder.Uo5pffGf8LUU(9.0f, 21.0f);
                                pathBuilder.ra306ClFT3HT(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                                pathBuilder.b41X89IqSbKt(4.0f);
                                pathBuilder.ra306ClFT3HT(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                                pathBuilder.MRfxZSx8l5UG62U(-1.0f);
                                pathBuilder.gmXBnHsR2YSm(9.0f, 20.0f);
                                pathBuilder.MRfxZSx8l5UG62U(1.0f);
                                pathBuilder.yzPsTade5rL7D3();
                                pathBuilder.Uo5pffGf8LUU(12.0f, 2.0f);
                                pathBuilder.hRNgd2zGCE5kj(8.14f, 2.0f, 5.0f, 5.14f, 5.0f, 9.0f);
                                pathBuilder.ra306ClFT3HT(0.0f, 2.38f, 1.19f, 4.47f, 3.0f, 5.74f);
                                f = 8.0f;
                                pathBuilder.gmXBnHsR2YSm(8.0f, 17.0f);
                                pathBuilder.ra306ClFT3HT(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                                pathBuilder.b41X89IqSbKt(6.0f);
                                pathBuilder.ra306ClFT3HT(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                                pathBuilder.MRfxZSx8l5UG62U(-2.26f);
                                pathBuilder.ra306ClFT3HT(1.81f, -1.27f, 3.0f, -3.36f, 3.0f, -5.74f);
                                pathBuilder.ra306ClFT3HT(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f);
                                pathBuilder.yzPsTade5rL7D3();
                                pathBuilder.Uo5pffGf8LUU(14.85f, 13.1f);
                                pathBuilder.i7xAcZoXXiIt(-0.85f, 0.6f);
                                pathBuilder.gmXBnHsR2YSm(14.0f, 16.0f);
                                pathBuilder.b41X89IqSbKt(-4.0f);
                                pathBuilder.MRfxZSx8l5UG62U(-2.3f);
                                pathBuilder.i7xAcZoXXiIt(-0.85f, -0.6f);
                                pathBuilder.hRNgd2zGCE5kj(7.8f, 12.16f, 7.0f, 10.63f, 7.0f, 9.0f);
                                pathBuilder.ra306ClFT3HT(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
                                PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = new PathNode.RelativeReflectiveCurveTo(5.0f, 2.24f, 5.0f, 5.0f);
                                ArrayList arrayList = pathBuilder.yzPsTade5rL7D3;
                                arrayList.add(relativeReflectiveCurveTo);
                                pathBuilder.ra306ClFT3HT(0.0f, 1.63f, -0.8f, 3.16f, -2.15f, 4.1f);
                                pathBuilder.yzPsTade5rL7D3();
                                builder.hRNgd2zGCE5kj(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, solidColor, null, "", arrayList);
                                imageVector = builder.oyjLVtGms9eZwJ0();
                                LightbulbKt.yzPsTade5rL7D3 = imageVector;
                            }
                            IconKt.hRNgd2zGCE5kj(imageVector, null, SizeKt.ra306ClFT3HT(companion, 48.0f), MaterialTheme.yzPsTade5rL7D3(composer3).FTJ2XS7ULgY8, composer3, 432, 0);
                            SpacerKt.yzPsTade5rL7D3(composer3, SizeKt.ra306ClFT3HT(companion, f));
                            TextKt.hRNgd2zGCE5kj("No tips found", null, MaterialTheme.yzPsTade5rL7D3(composer3).FTJ2XS7ULgY8, 0L, 0L, new TextAlign(3), 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(composer3).UEutaskTsxaI, composer3, 6, 0, 130042);
                            composer3.GDGFDp2lxiHY();
                            composer3.GDGFDp2lxiHY();
                            composer3.o4ticBN7g1K8jE();
                            composer2 = composer3;
                        } else {
                            composer3.mFNFvFv0Eiyk(1611761855);
                            ra306ClFT3HT = ColumnScopeInstance.yzPsTade5rL7D3.ra306ClFT3HT(true);
                            Modifier yzUZju8lbdmWa3 = ra306ClFT3HT.yzUZju8lbdmWa(fillElement);
                            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(16.0f, 16.0f, 16.0f, 16.0f);
                            Arrangement.SpacedAligned i7xAcZoXXiIt = Arrangement.i7xAcZoXXiIt(12.0f);
                            boolean zgejW39NNp2D = composer3.zgejW39NNp2D(mutableState) | composer3.NIabVTHf6LMJyXq(obj6);
                            Object UEutaskTsxaI2 = composer3.UEutaskTsxaI();
                            if (zgejW39NNp2D || UEutaskTsxaI2 == obj8) {
                                UEutaskTsxaI2 = new u3(16, mutableState, obj6);
                                composer3.Yey4RyhSyBRHub(UEutaskTsxaI2);
                            }
                            composer2 = composer3;
                            LazyDslKt.yzPsTade5rL7D3(yzUZju8lbdmWa3, null, paddingValuesImpl, i7xAcZoXXiIt, null, null, false, null, (Function1) UEutaskTsxaI2, composer2, 24960, 490);
                            composer2.o4ticBN7g1K8jE();
                        }
                        composer2.GDGFDp2lxiHY();
                    } else {
                        composer3.gmXBnHsR2YSm();
                    }
                    return Unit.yzPsTade5rL7D3;
                }
            }, BD2CRjLJ8EtOqGQ), BD2CRjLJ8EtOqGQ, 805306416, 253);
            if (tipEntity != null) {
                BD2CRjLJ8EtOqGQ.mFNFvFv0Eiyk(-617139133);
                boolean NIabVTHf6LMJyXq = BD2CRjLJ8EtOqGQ.NIabVTHf6LMJyXq(tipsViewModel2);
                Object UEutaskTsxaI = BD2CRjLJ8EtOqGQ.UEutaskTsxaI();
                if (NIabVTHf6LMJyXq || UEutaskTsxaI == Composer.Companion.yzPsTade5rL7D3) {
                    TipsScreenKt$TipsScreen$2$1 tipsScreenKt$TipsScreen$2$1 = new TipsScreenKt$TipsScreen$2$1(0, tipsViewModel2, TipsViewModel.class, "hideTipDetail", "hideTipDetail()V", 0);
                    BD2CRjLJ8EtOqGQ.Yey4RyhSyBRHub(tipsScreenKt$TipsScreen$2$1);
                    UEutaskTsxaI = tipsScreenKt$TipsScreen$2$1;
                }
                ModalBottomSheetKt.yzPsTade5rL7D3((Function0) ((KFunction) UEutaskTsxaI), null, gmXBnHsR2YSm, 0.0f, false, null, 0L, 0L, 0L, null, null, null, ComposableLambdaKt.hRNgd2zGCE5kj(1418617639, new b(7, tipEntity, tipsViewModel2), BD2CRjLJ8EtOqGQ), BD2CRjLJ8EtOqGQ, 0);
                BD2CRjLJ8EtOqGQ = BD2CRjLJ8EtOqGQ;
                BD2CRjLJ8EtOqGQ.o4ticBN7g1K8jE();
            } else {
                BD2CRjLJ8EtOqGQ.mFNFvFv0Eiyk(-614772190);
                BD2CRjLJ8EtOqGQ.o4ticBN7g1K8jE();
            }
        } else {
            BD2CRjLJ8EtOqGQ.gmXBnHsR2YSm();
            tipsViewModel2 = tipsViewModel;
        }
        ScopeUpdateScope AwgywP6bDNsW = BD2CRjLJ8EtOqGQ.AwgywP6bDNsW();
        if (AwgywP6bDNsW != null) {
            AwgywP6bDNsW.yzPsTade5rL7D3(new EYWI9RMqk13H5(i, 21, tipsViewModel2));
        }
    }

    public static final void yzPsTade5rL7D3(TipEntity tipEntity, Function0 function0, Composer composer, int i) {
        Composer BD2CRjLJ8EtOqGQ = composer.BD2CRjLJ8EtOqGQ(9844137);
        int i2 = (BD2CRjLJ8EtOqGQ.zgejW39NNp2D(tipEntity) ? 4 : 2) | i | (BD2CRjLJ8EtOqGQ.NIabVTHf6LMJyXq(function0) ? 32 : 16);
        if (BD2CRjLJ8EtOqGQ.ZvpnNpCMEWSR3(i2 & 1, (i2 & 19) != 18)) {
            RoundedCornerShape yzPsTade5rL7D3 = RoundedCornerShapeKt.yzPsTade5rL7D3(8.0f);
            long j = MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ).GiTAvmtrM6Bh8SJ;
            long hRNgd2zGCE5kj = ColorSchemeKt.hRNgd2zGCE5kj(j, BD2CRjLJ8EtOqGQ);
            long j2 = Color.i7xAcZoXXiIt;
            long hRNgd2zGCE5kj2 = Color.hRNgd2zGCE5kj(0.38f, ColorSchemeKt.hRNgd2zGCE5kj(j, BD2CRjLJ8EtOqGQ));
            ColorScheme yzPsTade5rL7D32 = MaterialTheme.yzPsTade5rL7D3(BD2CRjLJ8EtOqGQ);
            CardColors cardColors = yzPsTade5rL7D32.m2cVaMgRYGrW47M;
            if (cardColors == null) {
                ColorSchemeKeyTokens colorSchemeKeyTokens = OutlinedCardTokens.yzPsTade5rL7D3;
                cardColors = new CardColors(ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D32, colorSchemeKeyTokens), ColorSchemeKt.yzPsTade5rL7D3(yzPsTade5rL7D32, ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D32, colorSchemeKeyTokens)), ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D32, colorSchemeKeyTokens), Color.hRNgd2zGCE5kj(0.38f, ColorSchemeKt.yzPsTade5rL7D3(yzPsTade5rL7D32, ColorSchemeKt.ra306ClFT3HT(yzPsTade5rL7D32, colorSchemeKeyTokens))));
                yzPsTade5rL7D32.m2cVaMgRYGrW47M = cardColors;
            }
            CardKt.ra306ClFT3HT(function0, SizeKt.yzPsTade5rL7D3, false, yzPsTade5rL7D3, cardColors.yzPsTade5rL7D3(j, hRNgd2zGCE5kj, j2, hRNgd2zGCE5kj2), null, null, ComposableLambdaKt.hRNgd2zGCE5kj(-1449562528, new b(6, function0, tipEntity), BD2CRjLJ8EtOqGQ), BD2CRjLJ8EtOqGQ, ((i2 >> 3) & 14) | 100663344);
        } else {
            BD2CRjLJ8EtOqGQ.gmXBnHsR2YSm();
        }
        ScopeUpdateScope AwgywP6bDNsW = BD2CRjLJ8EtOqGQ.AwgywP6bDNsW();
        if (AwgywP6bDNsW != null) {
            AwgywP6bDNsW.yzPsTade5rL7D3(new wN5ohFcBOzLLfqV(tipEntity, function0, i, 22));
        }
    }
}
