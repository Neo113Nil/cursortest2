package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceBetween$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material.icons.filled.BookmarkKt;
import androidx.compose.material.icons.filled.CheckCircleKt;
import androidx.compose.material3.AssistChipDefaults;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.carousel.CarouselItemDrawInfoImpl;
import androidx.compose.material3.carousel.Strategy;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.platform.yzPsTade5rL7D3;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import com.door.brass.knob.data.db.entity.ChallengeEntity;
import com.door.brass.knob.data.db.entity.MenuItemEntity;
import com.door.brass.knob.data.db.entity.TipEntity;
import com.door.brass.knob.ui.tips.TipsViewModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function3 {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ b(ArrayList arrayList, Function0 function0) {
        this.oyjLVtGms9eZwJ0 = 4;
        this.gmXBnHsR2YSm = arrayList;
        this.b41X89IqSbKt = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object MRfxZSx8l5UG62U(Object obj, Object obj2, Object obj3) {
        ButtonColors hRNgd2zGCE5kj;
        int i = this.oyjLVtGms9eZwJ0;
        RowScopeInstance rowScopeInstance = RowScopeInstance.yzPsTade5rL7D3;
        Arrangement$SpaceBetween$1 arrangement$SpaceBetween$1 = Arrangement.b41X89IqSbKt;
        BiasAlignment.Vertical vertical = Alignment.Companion.MRfxZSx8l5UG62U;
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.yzPsTade5rL7D3;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.uypNJrpDByoB;
        Arrangement$Top$1 arrangement$Top$1 = Arrangement.ra306ClFT3HT;
        Modifier.Companion companion = Modifier.Companion.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj4 = this.gmXBnHsR2YSm;
        Object obj5 = this.b41X89IqSbKt;
        int i2 = 0;
        final int i3 = 1;
        switch (i) {
            case 0:
                MeasureScope measureScope = (MeasureScope) obj;
                if (((Strategy) ((Function0) obj5).hRNgd2zGCE5kj()).Uo5pffGf8LUU) {
                    throw null;
                }
                return MeasureScope.OL5dzh3MEyfV(measureScope, 0, 0, new e(19));
            case 1:
                Function0 function0 = (Function0) obj5;
                ChallengeEntity challengeEntity = (ChallengeEntity) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer.ZvpnNpCMEWSR3(intValue & 1, (intValue & 17) != 16)) {
                    Modifier gmXBnHsR2YSm = PaddingKt.gmXBnHsR2YSm(companion, 16.0f);
                    ColumnMeasurePolicy yzPsTade5rL7D3 = ColumnKt.yzPsTade5rL7D3(arrangement$Top$1, horizontal, composer, 0);
                    int hashCode = Long.hashCode(composer.getH5JgSr7BP0b5Z());
                    PersistentCompositionLocalMap FTJ2XS7ULgY8 = composer.FTJ2XS7ULgY8();
                    Modifier oyjLVtGms9eZwJ0 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer, gmXBnHsR2YSm);
                    ComposeUiNode.hRNgd2zGCE5kj.getClass();
                    Function0 function02 = ComposeUiNode.Companion.hRNgd2zGCE5kj;
                    if (composer.PyXrjLswZZoWpho() == null) {
                        ComposablesKt.yzPsTade5rL7D3();
                        throw null;
                    }
                    composer.tp5sG1Fy0ZCmW();
                    if (composer.getEYWI9RMqk13H5()) {
                        composer.EYWI9RMqk13H5(function02);
                    } else {
                        composer.AGl7HBCQ8xrHABq();
                    }
                    Function2 function2 = ComposeUiNode.Companion.gmXBnHsR2YSm;
                    Updater.hRNgd2zGCE5kj(composer, yzPsTade5rL7D3, function2);
                    Function2 function22 = ComposeUiNode.Companion.b41X89IqSbKt;
                    Updater.hRNgd2zGCE5kj(composer, FTJ2XS7ULgY8, function22);
                    Integer valueOf = Integer.valueOf(hashCode);
                    Function2 function23 = ComposeUiNode.Companion.i7xAcZoXXiIt;
                    Updater.hRNgd2zGCE5kj(composer, valueOf, function23);
                    Function1 function1 = ComposeUiNode.Companion.Uo5pffGf8LUU;
                    Updater.yzPsTade5rL7D3(composer, function1);
                    Function2 function24 = ComposeUiNode.Companion.oyjLVtGms9eZwJ0;
                    Updater.hRNgd2zGCE5kj(composer, oyjLVtGms9eZwJ0, function24);
                    FillElement fillElement = SizeKt.yzPsTade5rL7D3;
                    RowMeasurePolicy yzPsTade5rL7D32 = RowKt.yzPsTade5rL7D3(arrangement$SpaceBetween$1, vertical, composer, 54);
                    int hashCode2 = Long.hashCode(composer.getH5JgSr7BP0b5Z());
                    PersistentCompositionLocalMap FTJ2XS7ULgY82 = composer.FTJ2XS7ULgY8();
                    Modifier oyjLVtGms9eZwJ02 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer, fillElement);
                    if (composer.PyXrjLswZZoWpho() == null) {
                        ComposablesKt.yzPsTade5rL7D3();
                        throw null;
                    }
                    composer.tp5sG1Fy0ZCmW();
                    if (composer.getEYWI9RMqk13H5()) {
                        composer.EYWI9RMqk13H5(function02);
                    } else {
                        composer.AGl7HBCQ8xrHABq();
                    }
                    Updater.hRNgd2zGCE5kj(composer, yzPsTade5rL7D32, function2);
                    Updater.hRNgd2zGCE5kj(composer, FTJ2XS7ULgY82, function22);
                    Updater.hRNgd2zGCE5kj(composer, Integer.valueOf(hashCode2), function23);
                    Updater.yzPsTade5rL7D3(composer, function1);
                    Updater.hRNgd2zGCE5kj(composer, oyjLVtGms9eZwJ02, function24);
                    String str = challengeEntity.hRNgd2zGCE5kj;
                    int i4 = challengeEntity.gmXBnHsR2YSm;
                    int i5 = challengeEntity.b41X89IqSbKt;
                    TextKt.hRNgd2zGCE5kj(str, rowScopeInstance.yzPsTade5rL7D3(companion, 1.0f), MaterialTheme.yzPsTade5rL7D3(composer).o2t7oodqU1bUMaS, 0L, 0L, null, 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(composer).Uo5pffGf8LUU, composer, 0, 0, 131064);
                    if (challengeEntity.i7xAcZoXXiIt) {
                        composer.mFNFvFv0Eiyk(1473288894);
                        ImageVector imageVector = CheckCircleKt.yzPsTade5rL7D3;
                        if (imageVector == null) {
                            ImageVector.Builder builder = new ImageVector.Builder("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i6 = VectorKt.yzPsTade5rL7D3;
                            SolidColor solidColor = new SolidColor(Color.hRNgd2zGCE5kj);
                            PathBuilder pathBuilder = new PathBuilder();
                            pathBuilder.Uo5pffGf8LUU(12.0f, 2.0f);
                            pathBuilder.hRNgd2zGCE5kj(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                            PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = new PathNode.RelativeReflectiveCurveTo(4.48f, 10.0f, 10.0f, 10.0f);
                            ArrayList arrayList = pathBuilder.yzPsTade5rL7D3;
                            arrayList.add(relativeReflectiveCurveTo);
                            arrayList.add(new PathNode.RelativeReflectiveCurveTo(10.0f, -4.48f, 10.0f, -10.0f));
                            pathBuilder.FsuUJlzzWhYnMlD(17.52f, 2.0f, 12.0f, 2.0f);
                            pathBuilder.yzPsTade5rL7D3();
                            pathBuilder.Uo5pffGf8LUU(10.0f, 17.0f);
                            pathBuilder.i7xAcZoXXiIt(-5.0f, -5.0f);
                            pathBuilder.i7xAcZoXXiIt(1.41f, -1.41f);
                            pathBuilder.gmXBnHsR2YSm(10.0f, 14.17f);
                            pathBuilder.i7xAcZoXXiIt(7.59f, -7.59f);
                            pathBuilder.gmXBnHsR2YSm(19.0f, 8.0f);
                            pathBuilder.i7xAcZoXXiIt(-9.0f, 9.0f);
                            pathBuilder.yzPsTade5rL7D3();
                            builder.hRNgd2zGCE5kj(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, solidColor, null, "", arrayList);
                            imageVector = builder.oyjLVtGms9eZwJ0();
                            CheckCircleKt.yzPsTade5rL7D3 = imageVector;
                        }
                        IconKt.hRNgd2zGCE5kj(imageVector, "Completed", null, MaterialTheme.yzPsTade5rL7D3(composer).yzPsTade5rL7D3, composer, 48, 4);
                        composer.o4ticBN7g1K8jE();
                    } else {
                        composer.mFNFvFv0Eiyk(1473533949);
                        composer.o4ticBN7g1K8jE();
                    }
                    composer.GDGFDp2lxiHY();
                    SpacerKt.yzPsTade5rL7D3(composer, SizeKt.ra306ClFT3HT(companion, 6.0f));
                    ComposableLambdaImpl hRNgd2zGCE5kj2 = ComposableLambdaKt.hRNgd2zGCE5kj(1711133220, new g(challengeEntity, 1), composer);
                    float f = AssistChipDefaults.yzPsTade5rL7D3;
                    ChipKt.hRNgd2zGCE5kj(function0, hRNgd2zGCE5kj2, null, false, null, AssistChipDefaults.yzPsTade5rL7D3(MaterialTheme.yzPsTade5rL7D3(composer).kSPEzfraxudm4i, MaterialTheme.yzPsTade5rL7D3(composer).uypNJrpDByoB, composer), null, null, composer, 48);
                    SpacerKt.yzPsTade5rL7D3(composer, SizeKt.ra306ClFT3HT(companion, 8.0f));
                    TextKt.hRNgd2zGCE5kj(challengeEntity.ra306ClFT3HT, null, MaterialTheme.yzPsTade5rL7D3(composer).FTJ2XS7ULgY8, 0L, 0L, null, 0L, 2, false, 3, 0, MaterialTheme.hRNgd2zGCE5kj(composer).MRfxZSx8l5UG62U, composer, 0, 24960, 110586);
                    SpacerKt.yzPsTade5rL7D3(composer, SizeKt.ra306ClFT3HT(companion, 12.0f));
                    float f2 = i5 > 0 ? i4 / i5 : 0.0f;
                    boolean MRfxZSx8l5UG62U = composer.MRfxZSx8l5UG62U(f2);
                    Object UEutaskTsxaI = composer.UEutaskTsxaI();
                    if (MRfxZSx8l5UG62U || UEutaskTsxaI == composer$Companion$Empty$1) {
                        UEutaskTsxaI = new h(f2, 1);
                        composer.Yey4RyhSyBRHub(UEutaskTsxaI);
                    }
                    ProgressIndicatorKt.hRNgd2zGCE5kj((Function0) UEutaskTsxaI, fillElement, MaterialTheme.yzPsTade5rL7D3(composer).yzPsTade5rL7D3, MaterialTheme.yzPsTade5rL7D3(composer).jJwKDtysO3vm5E, 0, 0.0f, null, composer, 48);
                    SpacerKt.yzPsTade5rL7D3(composer, SizeKt.ra306ClFT3HT(companion, 4.0f));
                    TextKt.hRNgd2zGCE5kj(i4 + " / " + i5, null, MaterialTheme.yzPsTade5rL7D3(composer).FTJ2XS7ULgY8, 0L, 0L, null, 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(composer).yRx9jbDCTnXb3, composer, 0, 0, 131066);
                    composer.GDGFDp2lxiHY();
                } else {
                    composer.gmXBnHsR2YSm();
                }
                return unit;
            case 2:
                Function1 function12 = (Function1) obj5;
                ContextMenuColors contextMenuColors = (ContextMenuColors) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ContextMenuColors contextMenuColors2 = ContextMenuUiKt.yzPsTade5rL7D3;
                if (composer2.ZvpnNpCMEWSR3(1 & intValue2, (intValue2 & 17) != 16)) {
                    Object UEutaskTsxaI2 = composer2.UEutaskTsxaI();
                    if (UEutaskTsxaI2 == composer$Companion$Empty$1) {
                        UEutaskTsxaI2 = new ContextMenuScope();
                        composer2.Yey4RyhSyBRHub(UEutaskTsxaI2);
                    }
                    ContextMenuScope contextMenuScope = (ContextMenuScope) UEutaskTsxaI2;
                    contextMenuScope.yzPsTade5rL7D3.clear();
                    function12.uypNJrpDByoB(contextMenuScope);
                    contextMenuScope.yzPsTade5rL7D3(contextMenuColors, composer2, 0);
                } else {
                    composer2.gmXBnHsR2YSm();
                }
                return unit;
            case 3:
                Function0 function03 = (Function0) obj5;
                MenuItemEntity menuItemEntity = (MenuItemEntity) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((FlowRowScope) obj).getClass();
                if (composer3.ZvpnNpCMEWSR3(intValue3 & 1, (intValue3 & 17) != 16)) {
                    ComposableLambdaImpl hRNgd2zGCE5kj3 = ComposableLambdaKt.hRNgd2zGCE5kj(-1064238264, new q3(menuItemEntity, 3), composer3);
                    float f3 = AssistChipDefaults.yzPsTade5rL7D3;
                    ChipKt.hRNgd2zGCE5kj(function03, hRNgd2zGCE5kj3, null, false, null, AssistChipDefaults.yzPsTade5rL7D3(MaterialTheme.yzPsTade5rL7D3(composer3).ra306ClFT3HT, MaterialTheme.yzPsTade5rL7D3(composer3).oyjLVtGms9eZwJ0, composer3), null, null, composer3, 48);
                    ChipKt.hRNgd2zGCE5kj(function03, ComposableLambdaKt.hRNgd2zGCE5kj(1854830527, new q3(menuItemEntity, 4), composer3), null, false, null, AssistChipDefaults.yzPsTade5rL7D3(MaterialTheme.yzPsTade5rL7D3(composer3).Uo5pffGf8LUU, MaterialTheme.yzPsTade5rL7D3(composer3).FsuUJlzzWhYnMlD, composer3), null, null, composer3, 48);
                    ChipKt.hRNgd2zGCE5kj(function03, ComposableLambdaKt.hRNgd2zGCE5kj(-380214272, new q3(menuItemEntity, 5), composer3), null, false, null, AssistChipDefaults.yzPsTade5rL7D3(MaterialTheme.yzPsTade5rL7D3(composer3).kSPEzfraxudm4i, MaterialTheme.yzPsTade5rL7D3(composer3).uypNJrpDByoB, composer3), null, null, composer3, 48);
                } else {
                    composer3.gmXBnHsR2YSm();
                }
                return unit;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj4;
                Function0 function04 = (Function0) obj5;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((FlowRowScope) obj).getClass();
                if (composer4.ZvpnNpCMEWSR3(intValue4 & 1, (intValue4 & 17) != 16)) {
                    int size = arrayList2.size();
                    while (i2 < size) {
                        Object obj6 = arrayList2.get(i2);
                        i2++;
                        ComposableLambdaImpl hRNgd2zGCE5kj4 = ComposableLambdaKt.hRNgd2zGCE5kj(1999098637, new f((String) obj6, 5), composer4);
                        float f4 = AssistChipDefaults.yzPsTade5rL7D3;
                        ChipKt.hRNgd2zGCE5kj(function04, hRNgd2zGCE5kj4, null, false, null, AssistChipDefaults.yzPsTade5rL7D3(MaterialTheme.yzPsTade5rL7D3(composer4).GiTAvmtrM6Bh8SJ, MaterialTheme.yzPsTade5rL7D3(composer4).o2t7oodqU1bUMaS, composer4), null, null, composer4, 48);
                    }
                } else {
                    composer4.gmXBnHsR2YSm();
                }
                return unit;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                Spannable spannable = (Spannable) obj5;
                yzPsTade5rL7D3 yzpstade5rl7d3 = (yzPsTade5rL7D3) obj4;
                SpanStyle spanStyle = (SpanStyle) obj;
                int intValue5 = ((Integer) obj2).intValue();
                int intValue6 = ((Integer) obj3).intValue();
                FontFamily fontFamily = spanStyle.fontFamily;
                FontWeight fontWeight = spanStyle.fontWeight;
                if (fontWeight == null) {
                    fontWeight = FontWeight.Uo5pffGf8LUU;
                }
                FontStyle fontStyle = spanStyle.fontStyle;
                FontStyle fontStyle2 = new FontStyle(fontStyle != null ? fontStyle.yzPsTade5rL7D3 : 0);
                FontSynthesis fontSynthesis = spanStyle.fontSynthesis;
                spannable.setSpan(new TypefaceSpan((Typeface) yzpstade5rl7d3.o2t7oodqU1bUMaS(fontFamily, fontWeight, fontStyle2, new FontSynthesis(fontSynthesis != null ? fontSynthesis.yzPsTade5rL7D3 : 65535))), intValue5, intValue6, 33);
                return unit;
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                Function0 function05 = (Function0) obj5;
                final TipEntity tipEntity = (TipEntity) obj4;
                Composer composer5 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer5.ZvpnNpCMEWSR3(1 & intValue7, (intValue7 & 17) != 16)) {
                    Modifier gmXBnHsR2YSm2 = PaddingKt.gmXBnHsR2YSm(companion, 16.0f);
                    ColumnMeasurePolicy yzPsTade5rL7D33 = ColumnKt.yzPsTade5rL7D3(arrangement$Top$1, horizontal, composer5, 0);
                    int hashCode3 = Long.hashCode(composer5.getH5JgSr7BP0b5Z());
                    PersistentCompositionLocalMap FTJ2XS7ULgY83 = composer5.FTJ2XS7ULgY8();
                    Modifier oyjLVtGms9eZwJ03 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer5, gmXBnHsR2YSm2);
                    ComposeUiNode.hRNgd2zGCE5kj.getClass();
                    Function0 function06 = ComposeUiNode.Companion.hRNgd2zGCE5kj;
                    if (composer5.PyXrjLswZZoWpho() == null) {
                        ComposablesKt.yzPsTade5rL7D3();
                        throw null;
                    }
                    composer5.tp5sG1Fy0ZCmW();
                    if (composer5.getEYWI9RMqk13H5()) {
                        composer5.EYWI9RMqk13H5(function06);
                    } else {
                        composer5.AGl7HBCQ8xrHABq();
                    }
                    Function2 function25 = ComposeUiNode.Companion.gmXBnHsR2YSm;
                    Updater.hRNgd2zGCE5kj(composer5, yzPsTade5rL7D33, function25);
                    Function2 function26 = ComposeUiNode.Companion.b41X89IqSbKt;
                    Updater.hRNgd2zGCE5kj(composer5, FTJ2XS7ULgY83, function26);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    Function2 function27 = ComposeUiNode.Companion.i7xAcZoXXiIt;
                    Updater.hRNgd2zGCE5kj(composer5, valueOf2, function27);
                    Function1 function13 = ComposeUiNode.Companion.Uo5pffGf8LUU;
                    Updater.yzPsTade5rL7D3(composer5, function13);
                    Function2 function28 = ComposeUiNode.Companion.oyjLVtGms9eZwJ0;
                    Updater.hRNgd2zGCE5kj(composer5, oyjLVtGms9eZwJ03, function28);
                    FillElement fillElement2 = SizeKt.yzPsTade5rL7D3;
                    RowMeasurePolicy yzPsTade5rL7D34 = RowKt.yzPsTade5rL7D3(arrangement$SpaceBetween$1, vertical, composer5, 54);
                    int hashCode4 = Long.hashCode(composer5.getH5JgSr7BP0b5Z());
                    PersistentCompositionLocalMap FTJ2XS7ULgY84 = composer5.FTJ2XS7ULgY8();
                    Modifier oyjLVtGms9eZwJ04 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer5, fillElement2);
                    if (composer5.PyXrjLswZZoWpho() == null) {
                        ComposablesKt.yzPsTade5rL7D3();
                        throw null;
                    }
                    composer5.tp5sG1Fy0ZCmW();
                    if (composer5.getEYWI9RMqk13H5()) {
                        composer5.EYWI9RMqk13H5(function06);
                    } else {
                        composer5.AGl7HBCQ8xrHABq();
                    }
                    Updater.hRNgd2zGCE5kj(composer5, yzPsTade5rL7D34, function25);
                    Updater.hRNgd2zGCE5kj(composer5, FTJ2XS7ULgY84, function26);
                    Updater.hRNgd2zGCE5kj(composer5, Integer.valueOf(hashCode4), function27);
                    Updater.yzPsTade5rL7D3(composer5, function13);
                    Updater.hRNgd2zGCE5kj(composer5, oyjLVtGms9eZwJ04, function28);
                    TextKt.hRNgd2zGCE5kj(tipEntity.hRNgd2zGCE5kj, rowScopeInstance.yzPsTade5rL7D3(companion, 1.0f), MaterialTheme.yzPsTade5rL7D3(composer5).o2t7oodqU1bUMaS, 0L, 0L, null, 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(composer5).Uo5pffGf8LUU, composer5, 0, 0, 131064);
                    if (tipEntity.b41X89IqSbKt) {
                        composer5.mFNFvFv0Eiyk(-1141506263);
                        IconKt.hRNgd2zGCE5kj(BookmarkKt.yzPsTade5rL7D3(), "Bookmarked", null, MaterialTheme.yzPsTade5rL7D3(composer5).gmXBnHsR2YSm, composer5, 48, 4);
                        composer5.o4ticBN7g1K8jE();
                    } else {
                        composer5.mFNFvFv0Eiyk(-1141261208);
                        composer5.o4ticBN7g1K8jE();
                    }
                    composer5.GDGFDp2lxiHY();
                    SpacerKt.yzPsTade5rL7D3(composer5, SizeKt.ra306ClFT3HT(companion, 6.0f));
                    final int i7 = r3 ? 1 : 0;
                    ComposableLambdaImpl hRNgd2zGCE5kj5 = ComposableLambdaKt.hRNgd2zGCE5kj(-810225543, new Function2() { // from class: q8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object kSPEzfraxudm4i(Object obj7, Object obj8) {
                            int i8 = i7;
                            Unit unit2 = Unit.yzPsTade5rL7D3;
                            TipEntity tipEntity2 = tipEntity;
                            switch (i8) {
                                case 0:
                                    Composer composer6 = (Composer) obj7;
                                    int intValue8 = ((Integer) obj8).intValue();
                                    if (!composer6.ZvpnNpCMEWSR3(intValue8 & 1, (intValue8 & 3) != 2)) {
                                        composer6.gmXBnHsR2YSm();
                                        break;
                                    } else {
                                        TextKt.hRNgd2zGCE5kj(tipEntity2.oyjLVtGms9eZwJ0, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, composer6, 0, 0, 262142);
                                        break;
                                    }
                                default:
                                    Composer composer7 = (Composer) obj7;
                                    int intValue9 = ((Integer) obj8).intValue();
                                    if (!composer7.ZvpnNpCMEWSR3(intValue9 & 1, (intValue9 & 3) != 2)) {
                                        composer7.gmXBnHsR2YSm();
                                        break;
                                    } else {
                                        TextKt.hRNgd2zGCE5kj(tipEntity2.oyjLVtGms9eZwJ0, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, composer7, 0, 0, 262142);
                                        break;
                                    }
                            }
                            return unit2;
                        }
                    }, composer5);
                    float f5 = AssistChipDefaults.yzPsTade5rL7D3;
                    ChipKt.hRNgd2zGCE5kj(function05, hRNgd2zGCE5kj5, null, false, null, AssistChipDefaults.yzPsTade5rL7D3(MaterialTheme.yzPsTade5rL7D3(composer5).Uo5pffGf8LUU, MaterialTheme.yzPsTade5rL7D3(composer5).FsuUJlzzWhYnMlD, composer5), null, null, composer5, 48);
                    SpacerKt.yzPsTade5rL7D3(composer5, SizeKt.ra306ClFT3HT(companion, 8.0f));
                    TextKt.hRNgd2zGCE5kj(tipEntity.ra306ClFT3HT, null, MaterialTheme.yzPsTade5rL7D3(composer5).FTJ2XS7ULgY8, 0L, 0L, null, 0L, 2, false, 4, 0, MaterialTheme.hRNgd2zGCE5kj(composer5).MRfxZSx8l5UG62U, composer5, 0, 24960, 110586);
                    composer5.GDGFDp2lxiHY();
                } else {
                    composer5.gmXBnHsR2YSm();
                }
                return unit;
            default:
                final TipEntity tipEntity2 = (TipEntity) obj5;
                final TipsViewModel tipsViewModel = (TipsViewModel) obj4;
                Composer composer6 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer6.ZvpnNpCMEWSR3(intValue8 & 1, (intValue8 & 17) != 16)) {
                    FillElement fillElement3 = SizeKt.yzPsTade5rL7D3;
                    Modifier FsuUJlzzWhYnMlD = PaddingKt.FsuUJlzzWhYnMlD(ScrollKt.hRNgd2zGCE5kj(fillElement3, ScrollKt.yzPsTade5rL7D3(composer6), true), 16.0f, 8.0f, 16.0f, 32.0f);
                    ColumnMeasurePolicy yzPsTade5rL7D35 = ColumnKt.yzPsTade5rL7D3(arrangement$Top$1, horizontal, composer6, 0);
                    int hashCode5 = Long.hashCode(composer6.getH5JgSr7BP0b5Z());
                    PersistentCompositionLocalMap FTJ2XS7ULgY85 = composer6.FTJ2XS7ULgY8();
                    Modifier oyjLVtGms9eZwJ05 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer6, FsuUJlzzWhYnMlD);
                    ComposeUiNode.hRNgd2zGCE5kj.getClass();
                    Function0 function07 = ComposeUiNode.Companion.hRNgd2zGCE5kj;
                    if (composer6.PyXrjLswZZoWpho() == null) {
                        ComposablesKt.yzPsTade5rL7D3();
                        throw null;
                    }
                    composer6.tp5sG1Fy0ZCmW();
                    if (composer6.getEYWI9RMqk13H5()) {
                        composer6.EYWI9RMqk13H5(function07);
                    } else {
                        composer6.AGl7HBCQ8xrHABq();
                    }
                    Updater.hRNgd2zGCE5kj(composer6, yzPsTade5rL7D35, ComposeUiNode.Companion.gmXBnHsR2YSm);
                    Updater.hRNgd2zGCE5kj(composer6, FTJ2XS7ULgY85, ComposeUiNode.Companion.b41X89IqSbKt);
                    Updater.hRNgd2zGCE5kj(composer6, Integer.valueOf(hashCode5), ComposeUiNode.Companion.i7xAcZoXXiIt);
                    Updater.yzPsTade5rL7D3(composer6, ComposeUiNode.Companion.Uo5pffGf8LUU);
                    Updater.hRNgd2zGCE5kj(composer6, oyjLVtGms9eZwJ05, ComposeUiNode.Companion.oyjLVtGms9eZwJ0);
                    TextKt.hRNgd2zGCE5kj(tipEntity2.hRNgd2zGCE5kj, null, MaterialTheme.yzPsTade5rL7D3(composer6).o2t7oodqU1bUMaS, 0L, 0L, null, 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(composer6).i7xAcZoXXiIt, composer6, 0, 0, 131066);
                    SpacerKt.yzPsTade5rL7D3(composer6, SizeKt.ra306ClFT3HT(companion, 8.0f));
                    Object UEutaskTsxaI3 = composer6.UEutaskTsxaI();
                    if (UEutaskTsxaI3 == composer$Companion$Empty$1) {
                        UEutaskTsxaI3 = new pu0JZhzR2Or6(11);
                        composer6.Yey4RyhSyBRHub(UEutaskTsxaI3);
                    }
                    ComposableLambdaImpl hRNgd2zGCE5kj6 = ComposableLambdaKt.hRNgd2zGCE5kj(-29194304, new Function2() { // from class: q8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object kSPEzfraxudm4i(Object obj7, Object obj8) {
                            int i8 = i3;
                            Unit unit2 = Unit.yzPsTade5rL7D3;
                            TipEntity tipEntity22 = tipEntity2;
                            switch (i8) {
                                case 0:
                                    Composer composer62 = (Composer) obj7;
                                    int intValue82 = ((Integer) obj8).intValue();
                                    if (!composer62.ZvpnNpCMEWSR3(intValue82 & 1, (intValue82 & 3) != 2)) {
                                        composer62.gmXBnHsR2YSm();
                                        break;
                                    } else {
                                        TextKt.hRNgd2zGCE5kj(tipEntity22.oyjLVtGms9eZwJ0, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, composer62, 0, 0, 262142);
                                        break;
                                    }
                                default:
                                    Composer composer7 = (Composer) obj7;
                                    int intValue9 = ((Integer) obj8).intValue();
                                    if (!composer7.ZvpnNpCMEWSR3(intValue9 & 1, (intValue9 & 3) != 2)) {
                                        composer7.gmXBnHsR2YSm();
                                        break;
                                    } else {
                                        TextKt.hRNgd2zGCE5kj(tipEntity22.oyjLVtGms9eZwJ0, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, composer7, 0, 0, 262142);
                                        break;
                                    }
                            }
                            return unit2;
                        }
                    }, composer6);
                    float f6 = AssistChipDefaults.yzPsTade5rL7D3;
                    ChipKt.hRNgd2zGCE5kj((Function0) UEutaskTsxaI3, hRNgd2zGCE5kj6, null, false, null, AssistChipDefaults.yzPsTade5rL7D3(MaterialTheme.yzPsTade5rL7D3(composer6).Uo5pffGf8LUU, MaterialTheme.yzPsTade5rL7D3(composer6).FsuUJlzzWhYnMlD, composer6), null, null, composer6, 54);
                    SpacerKt.yzPsTade5rL7D3(composer6, SizeKt.ra306ClFT3HT(companion, 16.0f));
                    TextKt.hRNgd2zGCE5kj(tipEntity2.ra306ClFT3HT, null, MaterialTheme.yzPsTade5rL7D3(composer6).o2t7oodqU1bUMaS, 0L, 0L, null, 0L, 0, false, 0, 0, MaterialTheme.hRNgd2zGCE5kj(composer6).UEutaskTsxaI, composer6, 0, 0, 131066);
                    SpacerKt.yzPsTade5rL7D3(composer6, SizeKt.ra306ClFT3HT(companion, 24.0f));
                    if (tipEntity2.b41X89IqSbKt) {
                        composer6.mFNFvFv0Eiyk(1535367292);
                        PaddingValuesImpl paddingValuesImpl = ButtonDefaults.yzPsTade5rL7D3;
                        hRNgd2zGCE5kj = ButtonDefaults.yzPsTade5rL7D3(MaterialTheme.yzPsTade5rL7D3(composer6).gmXBnHsR2YSm, MaterialTheme.yzPsTade5rL7D3(composer6).i7xAcZoXXiIt, composer6);
                        composer6.o4ticBN7g1K8jE();
                    } else {
                        composer6.mFNFvFv0Eiyk(1535630296);
                        PaddingValuesImpl paddingValuesImpl2 = ButtonDefaults.yzPsTade5rL7D3;
                        hRNgd2zGCE5kj = ButtonDefaults.hRNgd2zGCE5kj(MaterialTheme.yzPsTade5rL7D3(composer6));
                        composer6.o4ticBN7g1K8jE();
                    }
                    ButtonColors buttonColors = hRNgd2zGCE5kj;
                    boolean NIabVTHf6LMJyXq = composer6.NIabVTHf6LMJyXq(tipsViewModel) | composer6.zgejW39NNp2D(tipEntity2);
                    Object UEutaskTsxaI4 = composer6.UEutaskTsxaI();
                    if (NIabVTHf6LMJyXq || UEutaskTsxaI4 == composer$Companion$Empty$1) {
                        UEutaskTsxaI4 = new Function0() { // from class: com.door.brass.knob.ui.tips.hRNgd2zGCE5kj
                            @Override // kotlin.jvm.functions.Function0
                            public final Object hRNgd2zGCE5kj() {
                                long j = tipEntity2.yzPsTade5rL7D3;
                                TipsViewModel tipsViewModel2 = TipsViewModel.this;
                                CloseableCoroutineScope yzPsTade5rL7D36 = ViewModelKt.yzPsTade5rL7D3(tipsViewModel2);
                                DefaultScheduler defaultScheduler = Dispatchers.yzPsTade5rL7D3;
                                BuildersKt.ra306ClFT3HT(yzPsTade5rL7D36, DefaultIoScheduler.gmXBnHsR2YSm, null, new TipsViewModel$bookmarkTip$1(tipsViewModel2, j, null), 2);
                                return Unit.yzPsTade5rL7D3;
                            }
                        };
                        composer6.Yey4RyhSyBRHub(UEutaskTsxaI4);
                    }
                    ButtonKt.yzPsTade5rL7D3((Function0) UEutaskTsxaI4, fillElement3, false, null, buttonColors, null, null, null, ComposableLambdaKt.hRNgd2zGCE5kj(-411301491, new WX2SCXtutbTy(10, tipEntity2), composer6), composer6, 805306416, 492);
                    composer6.GDGFDp2lxiHY();
                } else {
                    composer6.gmXBnHsR2YSm();
                }
                return unit;
        }
    }

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
        this.gmXBnHsR2YSm = obj2;
    }

    public /* synthetic */ b(Function0 function0, int i, CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, Shape shape) {
        this.oyjLVtGms9eZwJ0 = 0;
        this.b41X89IqSbKt = function0;
        this.gmXBnHsR2YSm = shape;
    }
}
