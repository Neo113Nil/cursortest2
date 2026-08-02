package o2;

import android.graphics.PointF;
import android.util.Log;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v2.t;

/* renamed from: o2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1504c {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f15588a = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f15589b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f15590c;

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f15591d;

    static {
        int i7 = t.f17153a;
        Locale locale = Locale.US;
        f15589b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f15590c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f15591d = Pattern.compile("\\\\an(\\d+)");
    }

    public static PointF a(String str) {
        String group;
        String group2;
        Matcher matcher = f15589b.matcher(str);
        Matcher matcher2 = f15590c.matcher(str);
        boolean find = matcher.find();
        boolean find2 = matcher2.find();
        if (find) {
            if (find2) {
                Log.i("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            group = matcher.group(1);
            group2 = matcher.group(2);
        } else {
            if (!find2) {
                return null;
            }
            group = matcher2.group(1);
            group2 = matcher2.group(2);
        }
        group.getClass();
        float parseFloat = Float.parseFloat(group.trim());
        group2.getClass();
        return new PointF(parseFloat, Float.parseFloat(group2.trim()));
    }
}
