package defpackage;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.NonNullValueClassSaver;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.SaversKt$NonNullValueClassSaver$1;
import androidx.compose.ui.text.Savers_androidKt;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.VerbatimTtsAnnotation;
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
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.SerializersCacheKt;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.SerializerCache;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class z5 implements Function1 {
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ z5(int i) {
        this.oyjLVtGms9eZwJ0 = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        r10 = false;
        boolean z = false;
        r12 = null;
        EmojiSupportMatch emojiSupportMatch = null;
        r12 = null;
        TextMotion textMotion = null;
        r12 = null;
        TextLinkStyles textLinkStyles = null;
        switch (i) {
            case 0:
                SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.yzPsTade5rL7D3;
                if (Intrinsics.yzPsTade5rL7D3(obj, Boolean.FALSE)) {
                    return new Offset(9205357640488583168L);
                }
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                Float f = obj2 != null ? (Float) obj2 : null;
                f.getClass();
                float floatValue = f.floatValue();
                Object obj3 = list.get(1);
                (obj3 != null ? (Float) obj3 : null).getClass();
                return new Offset((Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(r12.floatValue()) & 4294967295L));
            case 1:
                SaverKt$Saver$1 saverKt$Saver$12 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(list2.size());
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj4 = list2.get(i2);
                    SaverKt$Saver$1 saverKt$Saver$13 = SaversKt.jJwKDtysO3vm5E;
                    Locale locale = ((!Intrinsics.yzPsTade5rL7D3(obj4, Boolean.FALSE) || (saverKt$Saver$13 instanceof NonNullValueClassSaver)) && obj4 != null) ? (Locale) saverKt$Saver$13.hRNgd2zGCE5kj.uypNJrpDByoB(obj4) : null;
                    locale.getClass();
                    arrayList.add(locale);
                }
                return new LocaleList(arrayList);
            case 2:
                SaverKt$Saver$1 saverKt$Saver$14 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                String str = (String) obj;
                java.util.Locale forLanguageTag = java.util.Locale.forLanguageTag(str);
                if (Intrinsics.yzPsTade5rL7D3(forLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new Locale(forLanguageTag);
            case 3:
                SaverKt$Saver$1 saverKt$Saver$15 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                List list3 = (List) obj;
                Object obj5 = list3.get(0);
                String str2 = obj5 != null ? (String) obj5 : null;
                str2.getClass();
                Object obj6 = list3.get(1);
                SaverKt$Saver$1 saverKt$Saver$16 = SaversKt.UEutaskTsxaI;
                if ((!Intrinsics.yzPsTade5rL7D3(obj6, Boolean.FALSE) || (saverKt$Saver$16 instanceof NonNullValueClassSaver)) && obj6 != null) {
                    textLinkStyles = (TextLinkStyles) saverKt$Saver$16.hRNgd2zGCE5kj.uypNJrpDByoB(obj6);
                }
                return new LinkAnnotation.Clickable(str2, textLinkStyles);
            case 4:
                SaverKt$Saver$1 saverKt$Saver$17 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                List list4 = (List) obj;
                Object obj7 = list4.get(0);
                float f2 = LineHeightStyle.Alignment.hRNgd2zGCE5kj;
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$1 = SaversKt.Yey4RyhSyBRHub;
                Boolean bool = Boolean.FALSE;
                Intrinsics.yzPsTade5rL7D3(obj7, bool);
                LineHeightStyle.Alignment alignment = obj7 != null ? (LineHeightStyle.Alignment) saversKt$NonNullValueClassSaver$1.hRNgd2zGCE5kj.uypNJrpDByoB(obj7) : null;
                alignment.getClass();
                float f3 = alignment.yzPsTade5rL7D3;
                Object obj8 = list4.get(1);
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$12 = SaversKt.tp5sG1Fy0ZCmW;
                Intrinsics.yzPsTade5rL7D3(obj8, bool);
                LineHeightStyle.Trim trim = obj8 != null ? (LineHeightStyle.Trim) saversKt$NonNullValueClassSaver$12.hRNgd2zGCE5kj.uypNJrpDByoB(obj8) : null;
                trim.getClass();
                int i3 = trim.yzPsTade5rL7D3;
                Object obj9 = list4.get(2);
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$13 = SaversKt.elPM8kURv8Fp;
                Intrinsics.yzPsTade5rL7D3(obj9, bool);
                LineHeightStyle.Mode mode = obj9 != null ? (LineHeightStyle.Mode) saversKt$NonNullValueClassSaver$13.hRNgd2zGCE5kj.uypNJrpDByoB(obj9) : null;
                mode.getClass();
                return new LineHeightStyle(f3, i3, mode.yzPsTade5rL7D3);
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                SaverKt$Saver$1 saverKt$Saver$18 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                float floatValue2 = ((Float) obj).floatValue();
                LineHeightStyle.Alignment.yzPsTade5rL7D3(floatValue2);
                return new LineHeightStyle.Alignment(floatValue2);
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                SaverKt$Saver$1 saverKt$Saver$19 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                return new LineHeightStyle.Trim(((Integer) obj).intValue());
            case 7:
                SaverKt$Saver$1 saverKt$Saver$110 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                return new LineHeightStyle.Mode(((Integer) obj).intValue());
            case 8:
                SaverKt$Saver$1 saverKt$Saver$111 = SaversKt.yzPsTade5rL7D3;
                String str3 = obj != null ? (String) obj : null;
                str3.getClass();
                return new VerbatimTtsAnnotation(str3);
            case 9:
                SaverKt$Saver$1 saverKt$Saver$112 = SaversKt.yzPsTade5rL7D3;
                String str4 = obj != null ? (String) obj : null;
                str4.getClass();
                return new UrlAnnotation(str4);
            case 10:
                SaverKt$Saver$1 saverKt$Saver$113 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                List list5 = (List) obj;
                Object obj10 = list5.get(0);
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$14 = SaversKt.FTJ2XS7ULgY8;
                Boolean bool2 = Boolean.FALSE;
                Intrinsics.yzPsTade5rL7D3(obj10, bool2);
                TextAlign textAlign = obj10 != null ? (TextAlign) saversKt$NonNullValueClassSaver$14.hRNgd2zGCE5kj.uypNJrpDByoB(obj10) : null;
                textAlign.getClass();
                int i4 = textAlign.yzPsTade5rL7D3;
                Object obj11 = list5.get(1);
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$15 = SaversKt.exVmIuryuB8HeQ;
                Intrinsics.yzPsTade5rL7D3(obj11, bool2);
                TextDirection textDirection = obj11 != null ? (TextDirection) saversKt$NonNullValueClassSaver$15.hRNgd2zGCE5kj.uypNJrpDByoB(obj11) : null;
                textDirection.getClass();
                int i5 = textDirection.yzPsTade5rL7D3;
                Object obj12 = list5.get(2);
                TextUnitType[] textUnitTypeArr = TextUnit.hRNgd2zGCE5kj;
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$16 = SaversKt.XrorSzThrtvJ4A;
                Intrinsics.yzPsTade5rL7D3(obj12, bool2);
                TextUnit textUnit = obj12 != null ? (TextUnit) saversKt$NonNullValueClassSaver$16.hRNgd2zGCE5kj.uypNJrpDByoB(obj12) : null;
                textUnit.getClass();
                long j = textUnit.yzPsTade5rL7D3;
                Object obj13 = list5.get(3);
                TextIndent textIndent = TextIndent.ra306ClFT3HT;
                SaverKt$Saver$1 saverKt$Saver$114 = SaversKt.uypNJrpDByoB;
                TextIndent textIndent2 = ((!Intrinsics.yzPsTade5rL7D3(obj13, bool2) || (saverKt$Saver$114 instanceof NonNullValueClassSaver)) && obj13 != null) ? (TextIndent) saverKt$Saver$114.hRNgd2zGCE5kj.uypNJrpDByoB(obj13) : null;
                Object obj14 = list5.get(4);
                boolean yzPsTade5rL7D3 = Intrinsics.yzPsTade5rL7D3(obj14, bool2);
                SaverKt$Saver$1 saverKt$Saver$115 = Savers_androidKt.yzPsTade5rL7D3;
                PlatformParagraphStyle platformParagraphStyle = ((!yzPsTade5rL7D3 || (saverKt$Saver$115 instanceof NonNullValueClassSaver)) && obj14 != null) ? (PlatformParagraphStyle) saverKt$Saver$115.hRNgd2zGCE5kj.uypNJrpDByoB(obj14) : null;
                Object obj15 = list5.get(5);
                LineHeightStyle lineHeightStyle = LineHeightStyle.oyjLVtGms9eZwJ0;
                SaverKt$Saver$1 saverKt$Saver$116 = SaversKt.o4ticBN7g1K8jE;
                LineHeightStyle lineHeightStyle2 = ((!Intrinsics.yzPsTade5rL7D3(obj15, bool2) || (saverKt$Saver$116 instanceof NonNullValueClassSaver)) && obj15 != null) ? (LineHeightStyle) saverKt$Saver$116.hRNgd2zGCE5kj.uypNJrpDByoB(obj15) : null;
                Object obj16 = list5.get(6);
                boolean yzPsTade5rL7D32 = Intrinsics.yzPsTade5rL7D3(obj16, bool2);
                SaverKt$Saver$1 saverKt$Saver$117 = Savers_androidKt.ra306ClFT3HT;
                LineBreak lineBreak = ((!yzPsTade5rL7D32 || (saverKt$Saver$117 instanceof NonNullValueClassSaver)) && obj16 != null) ? (LineBreak) saverKt$Saver$117.hRNgd2zGCE5kj.uypNJrpDByoB(obj16) : null;
                lineBreak.getClass();
                int i6 = lineBreak.yzPsTade5rL7D3;
                Object obj17 = list5.get(7);
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$17 = SaversKt.AGl7HBCQ8xrHABq;
                Intrinsics.yzPsTade5rL7D3(obj17, bool2);
                Hyphens hyphens = obj17 != null ? (Hyphens) saversKt$NonNullValueClassSaver$17.hRNgd2zGCE5kj.uypNJrpDByoB(obj17) : null;
                hyphens.getClass();
                int i7 = hyphens.yzPsTade5rL7D3;
                Object obj18 = list5.get(8);
                boolean yzPsTade5rL7D33 = Intrinsics.yzPsTade5rL7D3(obj18, bool2);
                SaverKt$Saver$1 saverKt$Saver$118 = Savers_androidKt.oyjLVtGms9eZwJ0;
                if ((!yzPsTade5rL7D33 || (saverKt$Saver$118 instanceof NonNullValueClassSaver)) && obj18 != null) {
                    textMotion = (TextMotion) saverKt$Saver$118.hRNgd2zGCE5kj.uypNJrpDByoB(obj18);
                }
                return new ParagraphStyle(i4, i5, j, textIndent2, platformParagraphStyle, lineHeightStyle2, i6, i7, textMotion);
            case 11:
                obj.getClass();
                List list6 = (List) obj;
                Object obj19 = list6.get(0);
                Boolean bool3 = obj19 != null ? (Boolean) obj19 : null;
                bool3.getClass();
                boolean booleanValue = bool3.booleanValue();
                Object obj20 = list6.get(1);
                boolean yzPsTade5rL7D34 = Intrinsics.yzPsTade5rL7D3(obj20, Boolean.FALSE);
                SaverKt$Saver$1 saverKt$Saver$119 = Savers_androidKt.hRNgd2zGCE5kj;
                if ((!yzPsTade5rL7D34 || (saverKt$Saver$119 instanceof NonNullValueClassSaver)) && obj20 != null) {
                    emojiSupportMatch = (EmojiSupportMatch) saverKt$Saver$119.hRNgd2zGCE5kj.uypNJrpDByoB(obj20);
                }
                emojiSupportMatch.getClass();
                return new PlatformParagraphStyle(emojiSupportMatch.yzPsTade5rL7D3, booleanValue);
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                obj.getClass();
                return new EmojiSupportMatch(((Integer) obj).intValue());
            case 13:
                obj.getClass();
                return new LineBreak(((Integer) obj).intValue());
            case 14:
                obj.getClass();
                List list7 = (List) obj;
                Object obj21 = list7.get(0);
                boolean yzPsTade5rL7D35 = Intrinsics.yzPsTade5rL7D3(obj21, Boolean.FALSE);
                SaverKt$Saver$1 saverKt$Saver$120 = Savers_androidKt.b41X89IqSbKt;
                TextMotion.Linearity linearity = ((!yzPsTade5rL7D35 || (saverKt$Saver$120 instanceof NonNullValueClassSaver)) && obj21 != null) ? (TextMotion.Linearity) saverKt$Saver$120.hRNgd2zGCE5kj.uypNJrpDByoB(obj21) : null;
                linearity.getClass();
                int i8 = linearity.yzPsTade5rL7D3;
                Object obj22 = list7.get(1);
                Boolean bool4 = obj22 != null ? (Boolean) obj22 : null;
                bool4.getClass();
                return new TextMotion(i8, bool4.booleanValue());
            case WindowInsetsSides.b41X89IqSbKt /* 15 */:
                obj.getClass();
                return new TextMotion.Linearity(((Integer) obj).intValue());
            case 16:
                return new ScrollState(((Integer) obj).intValue());
            case 17:
                PointerType pointerType = (PointerType) obj;
                z5 z5Var = ScrollableKt.yzPsTade5rL7D3;
                if (pointerType != null && pointerType.yzPsTade5rL7D3 == 2) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 18:
                throw null;
            case 19:
                KProperty[] kPropertyArr = SemanticsPropertiesKt.yzPsTade5rL7D3;
                ((SemanticsPropertyReceiver) obj).hRNgd2zGCE5kj(SemanticsProperties.b41X89IqSbKt, unit);
                return unit;
            case 20:
                Offset offset = (Offset) obj;
                AnimationVector2D animationVector2D = SelectionMagnifierKt.yzPsTade5rL7D3;
                long j2 = offset.yzPsTade5rL7D3;
                return (9223372034707292159L & j2) != 9205357640488583168L ? new AnimationVector2D(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (offset.yzPsTade5rL7D3 & 4294967295L))) : SelectionMagnifierKt.yzPsTade5rL7D3;
            case 21:
                AnimationVector2D animationVector2D2 = (AnimationVector2D) obj;
                AnimationVector2D animationVector2D3 = SelectionMagnifierKt.yzPsTade5rL7D3;
                return new Offset((Float.floatToRawIntBits(animationVector2D2.yzPsTade5rL7D3) << 32) | (Float.floatToRawIntBits(animationVector2D2.hRNgd2zGCE5kj) & 4294967295L));
            case 22:
                return Boolean.valueOf(obj == null);
            case 23:
                KClass kClass = (KClass) obj;
                SerializerCache serializerCache = SerializersCacheKt.yzPsTade5rL7D3;
                kClass.getClass();
                KSerializer hRNgd2zGCE5kj = SerializersKt.hRNgd2zGCE5kj(kClass);
                if (hRNgd2zGCE5kj != null) {
                    return hRNgd2zGCE5kj;
                }
                if (JvmClassMappingKt.yzPsTade5rL7D3(kClass).isInterface()) {
                    return new PolymorphicSerializer(kClass);
                }
                return null;
            case 24:
                KClass kClass2 = (KClass) obj;
                SerializerCache serializerCache2 = SerializersCacheKt.yzPsTade5rL7D3;
                kClass2.getClass();
                KSerializer hRNgd2zGCE5kj2 = SerializersKt.hRNgd2zGCE5kj(kClass2);
                if (hRNgd2zGCE5kj2 == null) {
                    hRNgd2zGCE5kj2 = JvmClassMappingKt.yzPsTade5rL7D3(kClass2).isInterface() ? new PolymorphicSerializer(kClass2) : null;
                }
                if (hRNgd2zGCE5kj2 != null) {
                    return BuiltinSerializersKt.yzPsTade5rL7D3(hRNgd2zGCE5kj2);
                }
                return null;
            case 25:
                throw null;
            case 26:
                z5 z5Var2 = SnapshotKt.yzPsTade5rL7D3;
                return unit;
            case 27:
                ((Float) obj).getClass();
                return Boolean.valueOf(!ArraysKt.oyjLVtGms9eZwJ0(new Float[]{Float.valueOf(0.0f), Float.valueOf(1.0f)}, Float.valueOf(0.5f)));
            case 28:
                KProperty[] kPropertyArr2 = SemanticsPropertiesKt.yzPsTade5rL7D3;
                SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.uypNJrpDByoB;
                KProperty kProperty = SemanticsPropertiesKt.yzPsTade5rL7D3[5];
                ((SemanticsPropertyReceiver) obj).hRNgd2zGCE5kj(semanticsPropertyKey, Boolean.TRUE);
                return unit;
            default:
                return unit;
        }
    }
}
