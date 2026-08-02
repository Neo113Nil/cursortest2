package com.google.android.exoplayer2.util;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import androidx.media3.common.util.f;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
/* loaded from: classes4.dex */
public final class ColorParser {
    private static final Map<String, Integer> COLOR_MAP;
    private static final String RGB = "rgb";
    private static final String RGBA = "rgba";
    private static final Pattern RGB_PATTERN = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern RGBA_PATTERN_INT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern RGBA_PATTERN_FLOAT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    static {
        HashMap hashMap = new HashMap();
        COLOR_MAP = hashMap;
        androidx.media3.common.util.e.b(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        f.b(hashMap, "aqua", -16711681, -8388652, "aquamarine");
        androidx.media3.common.util.e.b(-983041, hashMap, "azure", -657956, "beige");
        androidx.media3.common.util.e.b(-6972, hashMap, "bisque", ViewCompat.MEASURED_STATE_MASK, "black");
        androidx.media3.common.util.e.b(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        androidx.media3.common.util.e.b(-7722014, hashMap, "blueviolet", -5952982, "brown");
        androidx.media3.common.util.e.b(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        androidx.media3.common.util.e.b(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        androidx.media3.common.util.e.b(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        androidx.media3.common.util.e.b(-1828, hashMap, "cornsilk", -2354116, "crimson");
        f.b(hashMap, "cyan", -16711681, -16777077, "darkblue");
        androidx.media3.common.util.e.b(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        f.b(hashMap, "darkgray", -5658199, -16751616, "darkgreen");
        f.b(hashMap, "darkgrey", -5658199, -4343957, "darkkhaki");
        androidx.media3.common.util.e.b(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        androidx.media3.common.util.e.b(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        androidx.media3.common.util.e.b(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        androidx.media3.common.util.e.b(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        hashMap.put("darkslategray", -13676721);
        hashMap.put("darkslategrey", -13676721);
        f.b(hashMap, "darkturquoise", -16724271, -7077677, "darkviolet");
        androidx.media3.common.util.e.b(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        hashMap.put("dimgray", -9868951);
        hashMap.put("dimgrey", -9868951);
        f.b(hashMap, "dodgerblue", -14774017, -5103070, "firebrick");
        androidx.media3.common.util.e.b(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        f.b(hashMap, "fuchsia", -65281, -2302756, "gainsboro");
        androidx.media3.common.util.e.b(-460545, hashMap, "ghostwhite", -10496, "gold");
        hashMap.put("goldenrod", -2448096);
        hashMap.put("gray", -8355712);
        androidx.media3.common.util.e.b(-16744448, hashMap, "green", -5374161, "greenyellow");
        f.b(hashMap, "grey", -8355712, -983056, "honeydew");
        androidx.media3.common.util.e.b(-38476, hashMap, "hotpink", -3318692, "indianred");
        androidx.media3.common.util.e.b(-11861886, hashMap, "indigo", -16, "ivory");
        androidx.media3.common.util.e.b(-989556, hashMap, "khaki", -1644806, "lavender");
        androidx.media3.common.util.e.b(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        androidx.media3.common.util.e.b(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        androidx.media3.common.util.e.b(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        hashMap.put("lightgoldenrodyellow", -329006);
        hashMap.put("lightgray", -2894893);
        hashMap.put("lightgreen", -7278960);
        hashMap.put("lightgrey", -2894893);
        androidx.media3.common.util.e.b(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        androidx.media3.common.util.e.b(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        hashMap.put("lightslategray", -8943463);
        hashMap.put("lightslategrey", -8943463);
        f.b(hashMap, "lightsteelblue", -5192482, -32, "lightyellow");
        androidx.media3.common.util.e.b(-16711936, hashMap, "lime", -13447886, "limegreen");
        hashMap.put("linen", -331546);
        hashMap.put("magenta", -65281);
        androidx.media3.common.util.e.b(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        androidx.media3.common.util.e.b(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        androidx.media3.common.util.e.b(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        androidx.media3.common.util.e.b(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        androidx.media3.common.util.e.b(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        androidx.media3.common.util.e.b(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        androidx.media3.common.util.e.b(-6943, hashMap, "mistyrose", -6987, "moccasin");
        androidx.media3.common.util.e.b(-8531, hashMap, "navajowhite", -16777088, "navy");
        androidx.media3.common.util.e.b(-133658, hashMap, "oldlace", -8355840, "olive");
        androidx.media3.common.util.e.b(-9728477, hashMap, "olivedrab", -23296, "orange");
        androidx.media3.common.util.e.b(-47872, hashMap, "orangered", -2461482, "orchid");
        androidx.media3.common.util.e.b(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        androidx.media3.common.util.e.b(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        androidx.media3.common.util.e.b(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        androidx.media3.common.util.e.b(-3308225, hashMap, "peru", -16181, "pink");
        androidx.media3.common.util.e.b(-2252579, hashMap, "plum", -5185306, "powderblue");
        androidx.media3.common.util.e.b(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        androidx.media3.common.util.e.b(SupportMenu.CATEGORY_MASK, hashMap, "red", -4419697, "rosybrown");
        androidx.media3.common.util.e.b(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        androidx.media3.common.util.e.b(-360334, hashMap, "salmon", -744352, "sandybrown");
        androidx.media3.common.util.e.b(-13726889, hashMap, "seagreen", -2578, "seashell");
        androidx.media3.common.util.e.b(-6270419, hashMap, "sienna", -4144960, "silver");
        androidx.media3.common.util.e.b(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        hashMap.put("slategray", -9404272);
        hashMap.put("slategrey", -9404272);
        f.b(hashMap, "snow", -1286, -16711809, "springgreen");
        androidx.media3.common.util.e.b(-12156236, hashMap, "steelblue", -2968436, "tan");
        androidx.media3.common.util.e.b(-16744320, hashMap, "teal", -2572328, "thistle");
        androidx.media3.common.util.e.b(-40121, hashMap, "tomato", 0, "transparent");
        androidx.media3.common.util.e.b(-12525360, hashMap, "turquoise", -1146130, "violet");
        androidx.media3.common.util.e.b(-663885, hashMap, "wheat", -1, "white");
        androidx.media3.common.util.e.b(-657931, hashMap, "whitesmoke", -256, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    private ColorParser() {
    }

    @ColorInt
    private static int parseColorInternal(String str, boolean z) {
        Assertions.checkArgument(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & 255) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith(RGBA)) {
            Matcher matcher = (z ? RGBA_PATTERN_FLOAT_ALPHA : RGBA_PATTERN_INT_ALPHA).matcher(replace);
            if (matcher.matches()) {
                return Color.argb(z ? (int) (Float.parseFloat((String) Assertions.checkNotNull(matcher.group(4))) * 255.0f) : Integer.parseInt((String) Assertions.checkNotNull(matcher.group(4)), 10), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)), 10), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2)), 10), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(3)), 10));
            }
        } else if (replace.startsWith(RGB)) {
            Matcher matcher2 = RGB_PATTERN.matcher(replace);
            if (matcher2.matches()) {
                return Color.rgb(Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(1)), 10), Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(2)), 10), Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(3)), 10));
            }
        } else {
            Integer num = COLOR_MAP.get(com.google.common.base.c.b(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    @ColorInt
    public static int parseCssColor(String str) {
        return parseColorInternal(str, true);
    }

    @ColorInt
    public static int parseTtmlColor(String str) {
        return parseColorInternal(str, false);
    }
}
