package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.SaversKt$NonNullValueClassSaver$1;
import androidx.compose.ui.text.Savers_androidKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.VerbatimTtsAnnotation;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import com.door.brass.knob.ui.splash.SplashScreenKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersCacheKt;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.SerializerCache;
import kotlinx.serialization.modules.SerializersModuleKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class y5 implements Function2 {
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ y5(int i) {
        this.oyjLVtGms9eZwJ0 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        switch (i) {
            case 0:
                SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.yzPsTade5rL7D3;
                return Integer.valueOf(((FontSynthesis) obj2).yzPsTade5rL7D3);
            case 1:
                SaverScope saverScope = (SaverScope) obj;
                TextUnit textUnit = (TextUnit) obj2;
                SaverKt$Saver$1 saverKt$Saver$12 = SaversKt.yzPsTade5rL7D3;
                return textUnit != null ? TextUnit.yzPsTade5rL7D3(textUnit.yzPsTade5rL7D3, TextUnit.ra306ClFT3HT) : false ? Boolean.FALSE : CollectionsKt.UEutaskTsxaI(Float.valueOf(TextUnit.ra306ClFT3HT(textUnit.yzPsTade5rL7D3)), SaversKt.yzPsTade5rL7D3(new TextUnitType(TextUnit.hRNgd2zGCE5kj(textUnit.yzPsTade5rL7D3)), SaversKt.ZvpnNpCMEWSR3, saverScope));
            case 2:
                LinkAnnotation.Clickable clickable = (LinkAnnotation.Clickable) obj2;
                SaverKt$Saver$1 saverKt$Saver$13 = SaversKt.yzPsTade5rL7D3;
                return CollectionsKt.UEutaskTsxaI(clickable.yzPsTade5rL7D3, SaversKt.yzPsTade5rL7D3(clickable.hRNgd2zGCE5kj, SaversKt.UEutaskTsxaI, (SaverScope) obj));
            case 3:
                SaverKt$Saver$1 saverKt$Saver$14 = SaversKt.yzPsTade5rL7D3;
                long j = ((TextUnitType) obj2).yzPsTade5rL7D3;
                if (TextUnitType.yzPsTade5rL7D3(j, 8589934592L)) {
                    return 0;
                }
                if (TextUnitType.yzPsTade5rL7D3(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 4:
                Offset offset = (Offset) obj2;
                SaverKt$Saver$1 saverKt$Saver$15 = SaversKt.yzPsTade5rL7D3;
                return offset != null ? Offset.ra306ClFT3HT(offset.yzPsTade5rL7D3, 9205357640488583168L) : false ? Boolean.FALSE : CollectionsKt.UEutaskTsxaI(Float.valueOf(Float.intBitsToFloat((int) (offset.yzPsTade5rL7D3 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (offset.yzPsTade5rL7D3 & 4294967295L))));
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                SaverScope saverScope2 = (SaverScope) obj;
                SaverKt$Saver$1 saverKt$Saver$16 = SaversKt.yzPsTade5rL7D3;
                List list = ((LocaleList) obj2).oyjLVtGms9eZwJ0;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(SaversKt.yzPsTade5rL7D3((Locale) list.get(i2), SaversKt.jJwKDtysO3vm5E, saverScope2));
                }
                return arrayList;
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                SaverKt$Saver$1 saverKt$Saver$17 = SaversKt.yzPsTade5rL7D3;
                return ((Locale) obj2).yzPsTade5rL7D3.toLanguageTag();
            case 7:
                SaverScope saverScope3 = (SaverScope) obj;
                LineHeightStyle lineHeightStyle = (LineHeightStyle) obj2;
                SaverKt$Saver$1 saverKt$Saver$18 = SaversKt.yzPsTade5rL7D3;
                return CollectionsKt.UEutaskTsxaI(SaversKt.yzPsTade5rL7D3(new LineHeightStyle.Alignment(lineHeightStyle.yzPsTade5rL7D3), SaversKt.Yey4RyhSyBRHub, saverScope3), SaversKt.yzPsTade5rL7D3(new LineHeightStyle.Trim(lineHeightStyle.hRNgd2zGCE5kj), SaversKt.tp5sG1Fy0ZCmW, saverScope3), SaversKt.yzPsTade5rL7D3(new LineHeightStyle.Mode(lineHeightStyle.ra306ClFT3HT), SaversKt.elPM8kURv8Fp, saverScope3));
            case 8:
                SaverKt$Saver$1 saverKt$Saver$19 = SaversKt.yzPsTade5rL7D3;
                return Float.valueOf(((LineHeightStyle.Alignment) obj2).yzPsTade5rL7D3);
            case 9:
                SaverKt$Saver$1 saverKt$Saver$110 = SaversKt.yzPsTade5rL7D3;
                return Integer.valueOf(((LineHeightStyle.Trim) obj2).yzPsTade5rL7D3);
            case 10:
                SaverKt$Saver$1 saverKt$Saver$111 = SaversKt.yzPsTade5rL7D3;
                return Integer.valueOf(((LineHeightStyle.Mode) obj2).yzPsTade5rL7D3);
            case 11:
                SaverKt$Saver$1 saverKt$Saver$112 = SaversKt.yzPsTade5rL7D3;
                return ((VerbatimTtsAnnotation) obj2).yzPsTade5rL7D3;
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                SaverScope saverScope4 = (SaverScope) obj;
                ParagraphStyle paragraphStyle = (ParagraphStyle) obj2;
                SaverKt$Saver$1 saverKt$Saver$113 = SaversKt.yzPsTade5rL7D3;
                Object yzPsTade5rL7D3 = SaversKt.yzPsTade5rL7D3(new TextAlign(paragraphStyle.yzPsTade5rL7D3), SaversKt.FTJ2XS7ULgY8, saverScope4);
                Object yzPsTade5rL7D32 = SaversKt.yzPsTade5rL7D3(new TextDirection(paragraphStyle.hRNgd2zGCE5kj), SaversKt.exVmIuryuB8HeQ, saverScope4);
                Object yzPsTade5rL7D33 = SaversKt.yzPsTade5rL7D3(new TextUnit(paragraphStyle.ra306ClFT3HT), SaversKt.XrorSzThrtvJ4A, saverScope4);
                TextIndent textIndent = paragraphStyle.oyjLVtGms9eZwJ0;
                TextIndent textIndent2 = TextIndent.ra306ClFT3HT;
                Object yzPsTade5rL7D34 = SaversKt.yzPsTade5rL7D3(textIndent, SaversKt.uypNJrpDByoB, saverScope4);
                Object yzPsTade5rL7D35 = SaversKt.yzPsTade5rL7D3(paragraphStyle.b41X89IqSbKt, Savers_androidKt.yzPsTade5rL7D3, saverScope4);
                LineHeightStyle lineHeightStyle2 = paragraphStyle.gmXBnHsR2YSm;
                LineHeightStyle lineHeightStyle3 = LineHeightStyle.oyjLVtGms9eZwJ0;
                return CollectionsKt.UEutaskTsxaI(yzPsTade5rL7D3, yzPsTade5rL7D32, yzPsTade5rL7D33, yzPsTade5rL7D34, yzPsTade5rL7D35, SaversKt.yzPsTade5rL7D3(lineHeightStyle2, SaversKt.o4ticBN7g1K8jE, saverScope4), SaversKt.yzPsTade5rL7D3(new LineBreak(paragraphStyle.i7xAcZoXXiIt), Savers_androidKt.ra306ClFT3HT, saverScope4), SaversKt.yzPsTade5rL7D3(new Hyphens(paragraphStyle.Uo5pffGf8LUU), SaversKt.AGl7HBCQ8xrHABq, saverScope4), SaversKt.yzPsTade5rL7D3(paragraphStyle.FsuUJlzzWhYnMlD, Savers_androidKt.oyjLVtGms9eZwJ0, saverScope4));
            case 13:
                SaverKt$Saver$1 saverKt$Saver$114 = SaversKt.yzPsTade5rL7D3;
                return ((UrlAnnotation) obj2).yzPsTade5rL7D3;
            case 14:
                SaverScope saverScope5 = (SaverScope) obj;
                SpanStyle spanStyle = (SpanStyle) obj2;
                SaverKt$Saver$1 saverKt$Saver$115 = SaversKt.yzPsTade5rL7D3;
                Color color = new Color(spanStyle.yzPsTade5rL7D3.getYzPsTade5rL7D3());
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$1 = SaversKt.MCcLy95b8Awzmw;
                Object yzPsTade5rL7D36 = SaversKt.yzPsTade5rL7D3(color, saversKt$NonNullValueClassSaver$1, saverScope5);
                TextUnit textUnit2 = new TextUnit(spanStyle.fontSize);
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$12 = SaversKt.XrorSzThrtvJ4A;
                Object yzPsTade5rL7D37 = SaversKt.yzPsTade5rL7D3(textUnit2, saversKt$NonNullValueClassSaver$12, saverScope5);
                FontWeight fontWeight = spanStyle.fontWeight;
                FontWeight fontWeight2 = FontWeight.b41X89IqSbKt;
                Object yzPsTade5rL7D38 = SaversKt.yzPsTade5rL7D3(fontWeight, SaversKt.yRx9jbDCTnXb3, saverScope5);
                Object yzPsTade5rL7D39 = SaversKt.yzPsTade5rL7D3(spanStyle.fontStyle, SaversKt.pu0JZhzR2Or6, saverScope5);
                Object yzPsTade5rL7D310 = SaversKt.yzPsTade5rL7D3(spanStyle.fontSynthesis, SaversKt.OcGJUxcOVecQiKb, saverScope5);
                String str = spanStyle.fontFeatureSettings;
                Object yzPsTade5rL7D311 = SaversKt.yzPsTade5rL7D3(new TextUnit(spanStyle.letterSpacing), saversKt$NonNullValueClassSaver$12, saverScope5);
                Object yzPsTade5rL7D312 = SaversKt.yzPsTade5rL7D3(spanStyle.baselineShift, SaversKt.NIabVTHf6LMJyXq, saverScope5);
                Object yzPsTade5rL7D313 = SaversKt.yzPsTade5rL7D3(spanStyle.textGeometricTransform, SaversKt.kSPEzfraxudm4i, saverScope5);
                LocaleList localeList = spanStyle.localeList;
                LocaleList localeList2 = LocaleList.gmXBnHsR2YSm;
                Object yzPsTade5rL7D314 = SaversKt.yzPsTade5rL7D3(localeList, SaversKt.BD2CRjLJ8EtOqGQ, saverScope5);
                Object yzPsTade5rL7D315 = SaversKt.yzPsTade5rL7D3(new Color(spanStyle.kSPEzfraxudm4i), saversKt$NonNullValueClassSaver$1, saverScope5);
                Object yzPsTade5rL7D316 = SaversKt.yzPsTade5rL7D3(spanStyle.background, SaversKt.MRfxZSx8l5UG62U, saverScope5);
                Shadow shadow = spanStyle.shadow;
                Shadow shadow2 = Shadow.oyjLVtGms9eZwJ0;
                return CollectionsKt.UEutaskTsxaI(yzPsTade5rL7D36, yzPsTade5rL7D37, yzPsTade5rL7D38, yzPsTade5rL7D39, yzPsTade5rL7D310, -1, str, yzPsTade5rL7D311, yzPsTade5rL7D312, yzPsTade5rL7D313, yzPsTade5rL7D314, yzPsTade5rL7D315, yzPsTade5rL7D316, SaversKt.yzPsTade5rL7D3(shadow, SaversKt.o2t7oodqU1bUMaS, saverScope5));
            case WindowInsetsSides.b41X89IqSbKt /* 15 */:
                SaverScope saverScope6 = (SaverScope) obj;
                TextLinkStyles textLinkStyles = (TextLinkStyles) obj2;
                SaverKt$Saver$1 saverKt$Saver$116 = SaversKt.yzPsTade5rL7D3;
                SpanStyle spanStyle2 = textLinkStyles.yzPsTade5rL7D3;
                SaverKt$Saver$1 saverKt$Saver$117 = SaversKt.FsuUJlzzWhYnMlD;
                return CollectionsKt.UEutaskTsxaI(SaversKt.yzPsTade5rL7D3(spanStyle2, saverKt$Saver$117, saverScope6), SaversKt.yzPsTade5rL7D3(textLinkStyles.hRNgd2zGCE5kj, saverKt$Saver$117, saverScope6), SaversKt.yzPsTade5rL7D3(textLinkStyles.ra306ClFT3HT, saverKt$Saver$117, saverScope6), SaversKt.yzPsTade5rL7D3(textLinkStyles.oyjLVtGms9eZwJ0, saverKt$Saver$117, saverScope6));
            case 16:
                PlatformParagraphStyle platformParagraphStyle = (PlatformParagraphStyle) obj2;
                Boolean valueOf = Boolean.valueOf(platformParagraphStyle.yzPsTade5rL7D3);
                SaverKt$Saver$1 saverKt$Saver$118 = SaversKt.yzPsTade5rL7D3;
                return CollectionsKt.UEutaskTsxaI(valueOf, SaversKt.yzPsTade5rL7D3(new EmojiSupportMatch(platformParagraphStyle.hRNgd2zGCE5kj), Savers_androidKt.hRNgd2zGCE5kj, (SaverScope) obj));
            case 17:
                return Integer.valueOf(((EmojiSupportMatch) obj2).yzPsTade5rL7D3);
            case 18:
                return Integer.valueOf(((LineBreak) obj2).yzPsTade5rL7D3);
            case 19:
                TextMotion textMotion = (TextMotion) obj2;
                return CollectionsKt.UEutaskTsxaI(SaversKt.yzPsTade5rL7D3(new TextMotion.Linearity(textMotion.yzPsTade5rL7D3), Savers_androidKt.b41X89IqSbKt, (SaverScope) obj), Boolean.valueOf(textMotion.hRNgd2zGCE5kj));
            case 20:
                return Integer.valueOf(((TextMotion.Linearity) obj2).yzPsTade5rL7D3);
            case 21:
                return Integer.valueOf(((SnapshotMutableIntStateImpl) ((ScrollState) obj2).yzPsTade5rL7D3).hRNgd2zGCE5kj());
            case 22:
                ((Integer) obj2).getClass();
                SegmentedButtonKt.yzPsTade5rL7D3(RecomposeScopeImplKt.yzPsTade5rL7D3(1), (Composer) obj);
                return unit;
            case 23:
                KClass kClass = (KClass) obj;
                List list2 = (List) obj2;
                SerializerCache serializerCache = SerializersCacheKt.yzPsTade5rL7D3;
                kClass.getClass();
                list2.getClass();
                ArrayList ra306ClFT3HT = SerializersKt.ra306ClFT3HT(SerializersModuleKt.yzPsTade5rL7D3, list2, true);
                ra306ClFT3HT.getClass();
                return SerializersKt.yzPsTade5rL7D3(kClass, ra306ClFT3HT, new c(3, list2));
            case 24:
                KClass kClass2 = (KClass) obj;
                List list3 = (List) obj2;
                SerializerCache serializerCache2 = SerializersCacheKt.yzPsTade5rL7D3;
                kClass2.getClass();
                list3.getClass();
                ArrayList ra306ClFT3HT2 = SerializersKt.ra306ClFT3HT(SerializersModuleKt.yzPsTade5rL7D3, list3, true);
                ra306ClFT3HT2.getClass();
                KSerializer yzPsTade5rL7D317 = SerializersKt.yzPsTade5rL7D3(kClass2, ra306ClFT3HT2, new c(4, list3));
                if (yzPsTade5rL7D317 != null) {
                    return BuiltinSerializersKt.yzPsTade5rL7D3(yzPsTade5rL7D317);
                }
                return null;
            case 25:
                return ((SheetState) obj2).ra306ClFT3HT();
            case 26:
                ((Integer) obj2).getClass();
                SplashScreenKt.hRNgd2zGCE5kj(RecomposeScopeImplKt.yzPsTade5rL7D3(1), (Composer) obj);
                return unit;
            case 27:
                return Integer.valueOf(((IntrinsicMeasurable) obj).sb2TpovOJ8wNlST(((Integer) obj2).intValue()));
            case 28:
                return Integer.valueOf(((IntrinsicMeasurable) obj).zBlwxQG5AB2UBQ(((Integer) obj2).intValue()));
            default:
                return Integer.valueOf(((IntrinsicMeasurable) obj).qWMdVyDND2HO1(((Integer) obj2).intValue()));
        }
    }

    public /* synthetic */ y5(int i, int i2) {
        this.oyjLVtGms9eZwJ0 = i2;
    }
}
