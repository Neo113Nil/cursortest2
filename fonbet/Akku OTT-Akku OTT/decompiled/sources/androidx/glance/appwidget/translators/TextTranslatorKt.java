package androidx.glance.appwidget.translators;

import android.os.Build;
import android.text.Layout;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.widget.RemoteViews;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.view.GravityCompat;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.appwidget.ApplyModifiersKt;
import androidx.glance.appwidget.InsertedViewInfo;
import androidx.glance.appwidget.LayoutSelectionKt;
import androidx.glance.appwidget.LayoutType;
import androidx.glance.appwidget.R;
import androidx.glance.appwidget.TranslationContext;
import androidx.glance.color.DayNightColorProvider;
import androidx.glance.text.EmittableText;
import androidx.glance.text.FontFamily;
import androidx.glance.text.FontStyle;
import androidx.glance.text.FontWeight;
import androidx.glance.text.TextAlign;
import androidx.glance.text.TextDecoration;
import androidx.glance.text.TextStyle;
import androidx.glance.unit.ColorProvider;
import androidx.glance.unit.FixedColorProvider;
import androidx.glance.unit.ResourceColorProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a@\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006H\u0000\u001a!\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0014\u001a\u00020\u0006*\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001c\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"setText", "", "Landroid/widget/RemoteViews;", "translationContext", "Landroidx/glance/appwidget/TranslationContext;", "resId", "", "text", "", "style", "Landroidx/glance/text/TextStyle;", "maxLines", "verticalTextGravity", "toAlignment", "Landroid/text/Layout$Alignment;", "Landroidx/glance/text/TextAlign;", "isRtl", "", "toAlignment-Gxb6ijs", "(IZ)Landroid/text/Layout$Alignment;", "toGravity", "toGravity-b1p-sNo", "(I)I", "translateEmittableText", "element", "Landroidx/glance/text/EmittableText;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextTranslator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextTranslator.kt\nandroidx/glance/appwidget/translators/TextTranslatorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1855#2,2:197\n*S KotlinDebug\n*F\n+ 1 TextTranslator.kt\nandroidx/glance/appwidget/translators/TextTranslatorKt\n*L\n133#1:197,2\n*E\n"})
/* loaded from: classes.dex */
public final class TextTranslatorKt {
    public static final void setText(RemoteViews remoteViews, TranslationContext translationContext, int i, String str, TextStyle textStyle, int i2, int i3) {
        if (i2 != Integer.MAX_VALUE) {
            RemoteViewsCompat.setTextViewMaxLines(remoteViews, i, i2);
        }
        if (textStyle == null) {
            remoteViews.setTextViewText(i, str);
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        int length = spannableString.length();
        TextUnit fontSize = textStyle.getFontSize();
        if (fontSize != null) {
            long packedValue = fontSize.getPackedValue();
            if (!TextUnit.m1205isSpimpl(packedValue)) {
                throw new IllegalArgumentException("Only Sp is currently supported for font sizes");
            }
            remoteViews.setTextViewTextSize(i, 2, TextUnit.m1202getValueimpl(packedValue));
        }
        ArrayList arrayList = new ArrayList();
        TextDecoration textDecoration = textStyle.getTextDecoration();
        if (textDecoration != null) {
            int mask = textDecoration.getMask();
            TextDecoration.Companion companion = TextDecoration.INSTANCE;
            if (TextDecoration.m1487containshcOHJN8(mask, companion.m1495getLineThroughObZ5V_A())) {
                arrayList.add(new StrikethroughSpan());
            }
            if (TextDecoration.m1487containshcOHJN8(mask, companion.m1497getUnderlineObZ5V_A())) {
                arrayList.add(new UnderlineSpan());
            }
        }
        FontStyle fontStyle = textStyle.getFontStyle();
        if (fontStyle != null) {
            arrayList.add(new StyleSpan(FontStyle.m1457equalsimpl0(fontStyle.getStyle(), FontStyle.INSTANCE.m1461getItaliczT8OX4g()) ? 2 : 0));
        }
        FontWeight fontWeight = textStyle.getFontWeight();
        if (fontWeight != null) {
            int m1469unboximpl = fontWeight.m1469unboximpl();
            FontWeight.Companion companion2 = FontWeight.INSTANCE;
            arrayList.add(new TextAppearanceSpan(translationContext.getContext(), FontWeight.m1466equalsimpl0(m1469unboximpl, companion2.m1470getBoldWjrlUT0()) ? R.style.Glance_AppWidget_TextAppearance_Bold : FontWeight.m1466equalsimpl0(m1469unboximpl, companion2.m1471getMediumWjrlUT0()) ? R.style.Glance_AppWidget_TextAppearance_Medium : R.style.Glance_AppWidget_TextAppearance_Normal));
        }
        FontFamily fontFamily = textStyle.getFontFamily();
        if (fontFamily != null) {
            arrayList.add(new TypefaceSpan(fontFamily.getFamily()));
        }
        TextAlign textAlign = textStyle.getTextAlign();
        if (textAlign != null) {
            int value = textAlign.getValue();
            if (Build.VERSION.SDK_INT >= 31) {
                TextTranslatorApi31Impl.INSTANCE.setTextViewGravity(remoteViews, i, i3 | m1349toGravityb1psNo(value));
            } else {
                arrayList.add(new AlignmentSpan.Standard(m1348toAlignmentGxb6ijs(value, translationContext.isRtl())));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            spannableString.setSpan((ParcelableSpan) it.next(), 0, length, 17);
        }
        remoteViews.setTextViewText(i, spannableString);
        ColorProvider color = textStyle.getColor();
        if (color instanceof FixedColorProvider) {
            remoteViews.setTextColor(i, ColorKt.m562toArgb8_81llA(((FixedColorProvider) color).m1510getColor0d7_KjU()));
            return;
        }
        if (color instanceof ResourceColorProvider) {
            if (Build.VERSION.SDK_INT >= 31) {
                RemoteViewsCompat.setTextViewTextColorResource(remoteViews, i, ((ResourceColorProvider) color).getResId());
                return;
            } else {
                remoteViews.setTextColor(i, ColorKt.m562toArgb8_81llA(color.mo1356getColorvNxB06k(translationContext.getContext())));
                return;
            }
        }
        if (!(color instanceof DayNightColorProvider)) {
            Objects.toString(color);
        } else if (Build.VERSION.SDK_INT < 31) {
            remoteViews.setTextColor(i, ColorKt.m562toArgb8_81llA(color.mo1356getColorvNxB06k(translationContext.getContext())));
        } else {
            DayNightColorProvider dayNightColorProvider = (DayNightColorProvider) color;
            RemoteViewsCompat.setTextViewTextColor(remoteViews, i, ColorKt.m562toArgb8_81llA(dayNightColorProvider.m1358getDay0d7_KjU()), ColorKt.m562toArgb8_81llA(dayNightColorProvider.m1359getNight0d7_KjU()));
        }
    }

    public static /* synthetic */ void setText$default(RemoteViews remoteViews, TranslationContext translationContext, int i, String str, TextStyle textStyle, int i2, int i3, int i4, Object obj) {
        if ((i4 & 32) != 0) {
            i3 = 48;
        }
        setText(remoteViews, translationContext, i, str, textStyle, i2, i3);
    }

    /* renamed from: toAlignment-Gxb6ijs, reason: not valid java name */
    private static final Layout.Alignment m1348toAlignmentGxb6ijs(int i, boolean z) {
        TextAlign.Companion companion = TextAlign.INSTANCE;
        if (TextAlign.m1476equalsimpl0(i, companion.m1480getCenterROrN78o())) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (TextAlign.m1476equalsimpl0(i, companion.m1482getLeftROrN78o())) {
            return z ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        if (TextAlign.m1476equalsimpl0(i, companion.m1483getRightROrN78o())) {
            return z ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (TextAlign.m1476equalsimpl0(i, companion.m1484getStartROrN78o())) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (TextAlign.m1476equalsimpl0(i, companion.m1481getEndROrN78o())) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        TextAlign.m1478toStringimpl(i);
        return Layout.Alignment.ALIGN_NORMAL;
    }

    /* renamed from: toGravity-b1p-sNo, reason: not valid java name */
    private static final int m1349toGravityb1psNo(int i) {
        TextAlign.Companion companion = TextAlign.INSTANCE;
        if (TextAlign.m1476equalsimpl0(i, companion.m1480getCenterROrN78o())) {
            return 1;
        }
        if (TextAlign.m1476equalsimpl0(i, companion.m1482getLeftROrN78o())) {
            return 3;
        }
        if (TextAlign.m1476equalsimpl0(i, companion.m1483getRightROrN78o())) {
            return 5;
        }
        if (TextAlign.m1476equalsimpl0(i, companion.m1484getStartROrN78o())) {
            return GravityCompat.START;
        }
        if (TextAlign.m1476equalsimpl0(i, companion.m1481getEndROrN78o())) {
            return GravityCompat.END;
        }
        TextAlign.m1478toStringimpl(i);
        return GravityCompat.START;
    }

    public static final void translateEmittableText(RemoteViews remoteViews, TranslationContext translationContext, EmittableText emittableText) {
        InsertedViewInfo insertView = LayoutSelectionKt.insertView(remoteViews, translationContext, LayoutType.Text, emittableText.getModifier());
        setText$default(remoteViews, translationContext, insertView.getMainViewId(), emittableText.getText(), emittableText.getStyle(), emittableText.getMaxLines(), 0, 32, null);
        ApplyModifiersKt.applyModifiers(translationContext, remoteViews, emittableText.getModifier(), insertView);
    }
}
