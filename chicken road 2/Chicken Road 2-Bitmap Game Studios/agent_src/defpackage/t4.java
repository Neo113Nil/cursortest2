package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshDefaults;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.NonNullValueClassSaver;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.SaversKt$NonNullValueClassSaver$1;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.os.serialization.SavedStateConfigurationKt;
import androidx.os.serialization.serializers.MutableStateFlowSerializer;
import androidx.os.serialization.serializers.SparseArraySerializer;
import androidx.room.DatabaseConfiguration;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.SerialModuleImpl;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class t4 implements Function1 {
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ t4(RoomDatabase roomDatabase) {
        this.oyjLVtGms9eZwJ0 = 9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        SpanStyle spanStyle = null;
        r1 = null;
        TextLinkStyles textLinkStyles = null;
        spanStyle = null;
        int i2 = 0;
        switch (i) {
            case 0:
                ((InspectorInfo) obj).getClass();
                throw null;
            case 1:
                ((InspectorInfo) obj).getClass();
                throw null;
            case 2:
                ((InspectorInfo) obj).getClass();
                throw null;
            case 3:
                ((InspectorInfo) obj).getClass();
                return unit;
            case 4:
                Context context = (Context) obj;
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(queryIntentActivities.size());
                int size = queryIntentActivities.size();
                while (i2 < size) {
                    ResolveInfo resolveInfo = queryIntentActivities.get(i2);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (str != null && context.checkSelfPermission(str) != 0) {
                            }
                        }
                        i2++;
                    }
                    arrayList.add(resolveInfo);
                    i2++;
                }
                return arrayList;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpec.KeyframesSpecConfig) obj;
                CubicBezierEasing cubicBezierEasing = ProgressIndicatorKt.yzPsTade5rL7D3;
                keyframesSpecConfig.yzPsTade5rL7D3 = 6000;
                Float valueOf = Float.valueOf(90.0f);
                keyframesSpecConfig.yzPsTade5rL7D3(valueOf, 300).hRNgd2zGCE5kj = MotionTokens.hRNgd2zGCE5kj;
                keyframesSpecConfig.yzPsTade5rL7D3(valueOf, 1500);
                Float valueOf2 = Float.valueOf(180.0f);
                keyframesSpecConfig.yzPsTade5rL7D3(valueOf2, 1800);
                keyframesSpecConfig.yzPsTade5rL7D3(valueOf2, 3000);
                Float valueOf3 = Float.valueOf(270.0f);
                keyframesSpecConfig.yzPsTade5rL7D3(valueOf3, 3300);
                keyframesSpecConfig.yzPsTade5rL7D3(valueOf3, 4500);
                Float valueOf4 = Float.valueOf(360.0f);
                keyframesSpecConfig.yzPsTade5rL7D3(valueOf4, 4800);
                keyframesSpecConfig.yzPsTade5rL7D3(valueOf4, 6000);
                return unit;
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                ProgressBarRangeInfo progressBarRangeInfo = ProgressBarRangeInfo.ra306ClFT3HT;
                KProperty[] kPropertyArr = SemanticsPropertiesKt.yzPsTade5rL7D3;
                SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ra306ClFT3HT;
                KProperty kProperty = SemanticsPropertiesKt.yzPsTade5rL7D3[1];
                ((SemanticsPropertyReceiver) obj).hRNgd2zGCE5kj(semanticsPropertyKey, progressBarRangeInfo);
                return unit;
            case 7:
                ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
                PullToRefreshDefaults pullToRefreshDefaults = PullToRefreshDefaults.yzPsTade5rL7D3;
                CanvasDrawScope$drawContext$1 b41X89IqSbKt = contentDrawScope.getB41X89IqSbKt();
                long oyjLVtGms9eZwJ0 = b41X89IqSbKt.oyjLVtGms9eZwJ0();
                b41X89IqSbKt.yzPsTade5rL7D3().yRx9jbDCTnXb3();
                try {
                    b41X89IqSbKt.yzPsTade5rL7D3.hRNgd2zGCE5kj(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    contentDrawScope.N();
                    return unit;
                } finally {
                    OcGJUxcOVecQiKb.pu0JZhzR2Or6(b41X89IqSbKt, oyjLVtGms9eZwJ0);
                }
            case 8:
                return Boolean.TRUE;
            case 9:
                ((DatabaseConfiguration) obj).getClass();
                throw new NotImplementedError(0);
            case 10:
                List list = (List) obj;
                SerialModuleImpl serialModuleImpl = SavedStateConfigurationKt.yzPsTade5rL7D3;
                list.getClass();
                return new MutableStateFlowSerializer((KSerializer) CollectionsKt.exVmIuryuB8HeQ(list));
            case 11:
                List list2 = (List) obj;
                list2.getClass();
                return new SparseArraySerializer((KSerializer) CollectionsKt.exVmIuryuB8HeQ(list2));
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                return obj;
            case 13:
                SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                List list3 = (List) obj;
                Object obj2 = list3.get(0);
                SaverKt$Saver$1 saverKt$Saver$12 = SaversKt.FsuUJlzzWhYnMlD;
                Function1 function1 = saverKt$Saver$12.hRNgd2zGCE5kj;
                Boolean bool = Boolean.FALSE;
                SpanStyle spanStyle2 = ((!Intrinsics.yzPsTade5rL7D3(obj2, bool) || (saverKt$Saver$12 instanceof NonNullValueClassSaver)) && obj2 != null) ? (SpanStyle) function1.uypNJrpDByoB(obj2) : null;
                Object obj3 = list3.get(1);
                SpanStyle spanStyle3 = ((!Intrinsics.yzPsTade5rL7D3(obj3, bool) || (saverKt$Saver$12 instanceof NonNullValueClassSaver)) && obj3 != null) ? (SpanStyle) function1.uypNJrpDByoB(obj3) : null;
                Object obj4 = list3.get(2);
                SpanStyle spanStyle4 = ((!Intrinsics.yzPsTade5rL7D3(obj4, bool) || (saverKt$Saver$12 instanceof NonNullValueClassSaver)) && obj4 != null) ? (SpanStyle) function1.uypNJrpDByoB(obj4) : null;
                Object obj5 = list3.get(3);
                if ((!Intrinsics.yzPsTade5rL7D3(obj5, bool) || (saverKt$Saver$12 instanceof NonNullValueClassSaver)) && obj5 != null) {
                    spanStyle = (SpanStyle) function1.uypNJrpDByoB(obj5);
                }
                return new TextLinkStyles(spanStyle2, spanStyle3, spanStyle4, spanStyle);
            case 14:
                SaverKt$Saver$1 saverKt$Saver$13 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                List list4 = (List) obj;
                Object obj6 = list4.get(1);
                SaverKt$Saver$1 saverKt$Saver$14 = SaversKt.hRNgd2zGCE5kj;
                List list5 = ((!Intrinsics.yzPsTade5rL7D3(obj6, Boolean.FALSE) || (saverKt$Saver$14 instanceof NonNullValueClassSaver)) && obj6 != null) ? (List) saverKt$Saver$14.hRNgd2zGCE5kj.uypNJrpDByoB(obj6) : null;
                Object obj7 = list4.get(0);
                String str2 = obj7 != null ? (String) obj7 : null;
                str2.getClass();
                return new AnnotatedString(list5, str2);
            case WindowInsetsSides.b41X89IqSbKt /* 15 */:
                SaverKt$Saver$1 saverKt$Saver$15 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                return new TextDecoration(((Integer) obj).intValue());
            case 16:
                SaverKt$Saver$1 saverKt$Saver$16 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                List list6 = (List) obj;
                return new TextGeometricTransform(((Number) list6.get(0)).floatValue(), ((Number) list6.get(1)).floatValue());
            case 17:
                SaverKt$Saver$1 saverKt$Saver$17 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                List list7 = (List) obj;
                Object obj8 = list7.get(0);
                TextUnitType[] textUnitTypeArr = TextUnit.hRNgd2zGCE5kj;
                Function1 function12 = SaversKt.XrorSzThrtvJ4A.hRNgd2zGCE5kj;
                Boolean bool2 = Boolean.FALSE;
                Intrinsics.yzPsTade5rL7D3(obj8, bool2);
                TextUnit textUnit = obj8 != null ? (TextUnit) function12.uypNJrpDByoB(obj8) : null;
                textUnit.getClass();
                long j = textUnit.yzPsTade5rL7D3;
                Object obj9 = list7.get(1);
                Intrinsics.yzPsTade5rL7D3(obj9, bool2);
                TextUnit textUnit2 = obj9 != null ? (TextUnit) function12.uypNJrpDByoB(obj9) : null;
                textUnit2.getClass();
                return new TextIndent(j, textUnit2.yzPsTade5rL7D3);
            case 18:
                SaverKt$Saver$1 saverKt$Saver$18 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                return new FontWeight(((Integer) obj).intValue());
            case 19:
                SaverKt$Saver$1 saverKt$Saver$19 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                return new BaselineShift(((Float) obj).floatValue());
            case 20:
                SaverKt$Saver$1 saverKt$Saver$110 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                List list8 = (List) obj;
                Object obj10 = list8.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int intValue = num.intValue();
                Object obj11 = list8.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new TextRange(TextRangeKt.yzPsTade5rL7D3(intValue, num2.intValue()));
            case 21:
                SaverKt$Saver$1 saverKt$Saver$111 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                return new TextAlign(((Integer) obj).intValue());
            case 22:
                SaverKt$Saver$1 saverKt$Saver$112 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                List list9 = (List) obj;
                Object obj12 = list9.get(0);
                String str3 = obj12 != null ? (String) obj12 : null;
                str3.getClass();
                Object obj13 = list9.get(1);
                SaverKt$Saver$1 saverKt$Saver$113 = SaversKt.UEutaskTsxaI;
                if ((!Intrinsics.yzPsTade5rL7D3(obj13, Boolean.FALSE) || (saverKt$Saver$113 instanceof NonNullValueClassSaver)) && obj13 != null) {
                    textLinkStyles = (TextLinkStyles) saverKt$Saver$113.hRNgd2zGCE5kj.uypNJrpDByoB(obj13);
                }
                return new LinkAnnotation.Url(str3, textLinkStyles);
            case 23:
                SaverKt$Saver$1 saverKt$Saver$114 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                return new TextDirection(((Integer) obj).intValue());
            case 24:
                SaverKt$Saver$1 saverKt$Saver$115 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                return new Hyphens(((Integer) obj).intValue());
            case 25:
                SaverKt$Saver$1 saverKt$Saver$116 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                List list10 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list10.size());
                int size2 = list10.size();
                while (i2 < size2) {
                    Object obj14 = list10.get(i2);
                    SaverKt$Saver$1 saverKt$Saver$117 = SaversKt.ra306ClFT3HT;
                    AnnotatedString.Range range = ((!Intrinsics.yzPsTade5rL7D3(obj14, Boolean.FALSE) || (saverKt$Saver$117 instanceof NonNullValueClassSaver)) && obj14 != null) ? (AnnotatedString.Range) saverKt$Saver$117.hRNgd2zGCE5kj.uypNJrpDByoB(obj14) : null;
                    range.getClass();
                    arrayList2.add(range);
                    i2++;
                }
                return arrayList2;
            case 26:
                SaverKt$Saver$1 saverKt$Saver$118 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                return new FontStyle(((Integer) obj).intValue());
            case 27:
                SaverKt$Saver$1 saverKt$Saver$119 = SaversKt.yzPsTade5rL7D3;
                obj.getClass();
                return new FontSynthesis(((Integer) obj).intValue());
            case 28:
                SaverKt$Saver$1 saverKt$Saver$120 = SaversKt.yzPsTade5rL7D3;
                Boolean bool3 = Boolean.FALSE;
                if (Intrinsics.yzPsTade5rL7D3(obj, bool3)) {
                    return new TextUnit(TextUnit.ra306ClFT3HT);
                }
                obj.getClass();
                List list11 = (List) obj;
                Object obj15 = list11.get(0);
                Float f = obj15 != null ? (Float) obj15 : null;
                f.getClass();
                float floatValue = f.floatValue();
                Object obj16 = list11.get(1);
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$1 = SaversKt.ZvpnNpCMEWSR3;
                Intrinsics.yzPsTade5rL7D3(obj16, bool3);
                TextUnitType textUnitType = obj16 != null ? (TextUnitType) saversKt$NonNullValueClassSaver$1.hRNgd2zGCE5kj.uypNJrpDByoB(obj16) : null;
                textUnitType.getClass();
                return new TextUnit(TextUnitKt.oyjLVtGms9eZwJ0(floatValue, textUnitType.yzPsTade5rL7D3));
            default:
                SaverKt$Saver$1 saverKt$Saver$121 = SaversKt.yzPsTade5rL7D3;
                return Intrinsics.yzPsTade5rL7D3(obj, 0) ? new TextUnitType(8589934592L) : Intrinsics.yzPsTade5rL7D3(obj, 1) ? new TextUnitType(4294967296L) : new TextUnitType(0L);
        }
    }

    public /* synthetic */ t4(int i) {
        this.oyjLVtGms9eZwJ0 = i;
    }
}
