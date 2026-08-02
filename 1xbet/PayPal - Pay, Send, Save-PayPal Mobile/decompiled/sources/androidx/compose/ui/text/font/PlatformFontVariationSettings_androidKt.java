package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0006\u0010\u0010"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$Settings;", "Landroidx/compose/ui/unit/Density;", "density", "", "weightAdjustment", "", "toAndroidString", "(Landroidx/compose/ui/text/font/FontVariation$Settings;Landroidx/compose/ui/unit/Density;I)Ljava/lang/String;", "", "Landroid/graphics/fonts/FontVariationAxis;", "toAndroidArray", "(Landroidx/compose/ui/text/font/FontVariation$Settings;Landroidx/compose/ui/unit/Density;I)[Landroid/graphics/fonts/FontVariationAxis;", "Landroid/content/Context;", "context", "getFontWeightAdjustment", "(Landroid/content/Context;)I", "(Landroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlatformFontVariationSettings_androidKt {
    public static final java.lang.String toAndroidString(androidx.compose.ui.text.font.FontVariation.Settings settings, final androidx.compose.ui.unit.Density density, int i) {
        boolean z;
        float variationValue;
        if (i == 0) {
            return androidx.compose.ui.util.ListUtilsKt.fastJoinToString$default(settings.getSettings(), null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.text.font.PlatformFontVariationSettings_androidKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.ui.text.font.PlatformFontVariationSettings_androidKt.m8177$r8$lambda$SjIZ8h4wjTz3VBZ28q5ghJxDiE(androidx.compose.ui.unit.Density.this, (androidx.compose.ui.text.font.FontVariation.Setting) obj);
                }
            }, 31, null);
        }
        java.util.List<androidx.compose.ui.text.font.FontVariation.Setting> settings2 = settings.getSettings();
        int size = settings2.size();
        int i2 = 0;
        java.lang.String str = "";
        boolean z2 = false;
        while (i2 < size) {
            androidx.compose.ui.text.font.FontVariation.Setting setting = settings2.get(i2);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(setting.getCamera2StreamConfigurationMap(), "wght")) {
                z = z2;
                variationValue = setting.toVariationValue(density);
            } else {
                variationValue = kotlin.ranges.RangesKt.coerceIn(setting.toVariationValue(density) + i, 1.0f, 1000.0f);
                z = true;
            }
            if (i2 != 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                str = sb.toString();
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append('\'');
            sb2.append(setting.getCamera2StreamConfigurationMap());
            sb2.append("' ");
            sb2.append(variationValue);
            str = sb2.toString();
            i2++;
            z2 = z;
        }
        if (z2) {
            return str;
        }
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(i + 400.0f, 1.0f, 1000.0f);
        if (!settings.getSettings().isEmpty()) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            str = sb3.toString();
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(str);
        sb4.append("'wght' ");
        sb4.append(coerceIn);
        return sb4.toString();
    }

    public static final android.graphics.fonts.FontVariationAxis[] toAndroidArray(androidx.compose.ui.text.font.FontVariation.Settings settings, androidx.compose.ui.unit.Density density, int i) {
        int size;
        android.graphics.fonts.FontVariationAxis fontVariationAxis;
        int i2 = 0;
        if (i == 0) {
            int size2 = settings.getSettings().size();
            android.graphics.fonts.FontVariationAxis[] fontVariationAxisArr = new android.graphics.fonts.FontVariationAxis[size2];
            while (i2 < size2) {
                fontVariationAxisArr[i2] = new android.graphics.fonts.FontVariationAxis(settings.getSettings().get(i2).getCamera2StreamConfigurationMap(), settings.getSettings().get(i2).toVariationValue(density));
                i2++;
            }
            return fontVariationAxisArr;
        }
        int size3 = settings.getSettings().size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                size = settings.getSettings().size() + 1;
                break;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(settings.getSettings().get(i3).getCamera2StreamConfigurationMap(), "wght")) {
                size = settings.getSettings().size();
                break;
            }
            i3++;
        }
        android.graphics.fonts.FontVariationAxis[] fontVariationAxisArr2 = new android.graphics.fonts.FontVariationAxis[size];
        while (i2 < size) {
            if (i2 == settings.getSettings().size()) {
                fontVariationAxis = new android.graphics.fonts.FontVariationAxis("wght", kotlin.ranges.RangesKt.coerceIn(i + 400.0f, 1.0f, 1000.0f));
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(settings.getSettings().get(i2).getCamera2StreamConfigurationMap(), "wght")) {
                fontVariationAxis = new android.graphics.fonts.FontVariationAxis("wght", kotlin.ranges.RangesKt.coerceIn(settings.getSettings().get(i2).toVariationValue(density) + i, 1.0f, 1000.0f));
            } else {
                fontVariationAxis = new android.graphics.fonts.FontVariationAxis(settings.getSettings().get(i2).getCamera2StreamConfigurationMap(), settings.getSettings().get(i2).toVariationValue(density));
            }
            fontVariationAxisArr2[i2] = fontVariationAxis;
            i2++;
        }
        return fontVariationAxisArr2;
    }

    public static final int getFontWeightAdjustment(android.content.Context context) {
        if (context == null || android.os.Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) {
            return 0;
        }
        return context.getResources().getConfiguration().fontWeightAdjustment;
    }

    public static final java.lang.String toAndroidString(androidx.compose.ui.text.font.FontVariation.Settings settings, android.content.Context context) {
        return toAndroidString(settings, androidx.compose.ui.unit.AndroidDensity_androidKt.Density(context), getFontWeightAdjustment(context));
    }

    /* renamed from: $r8$lambda$SjIZ8h-4wjTz3VBZ28q5ghJxDiE, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m8177$r8$lambda$SjIZ8h4wjTz3VBZ28q5ghJxDiE(androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontVariation.Setting setting) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("'");
        sb.append(setting.getCamera2StreamConfigurationMap());
        sb.append("' ");
        sb.append(setting.toVariationValue(density));
        return sb.toString();
    }
}
