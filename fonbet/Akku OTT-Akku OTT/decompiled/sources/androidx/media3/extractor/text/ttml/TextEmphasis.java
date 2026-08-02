package androidx.media3.extractor.text.ttml;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.base.c;
import com.google.common.collect.M;
import com.google.common.collect.N;
import com.google.common.collect.r0;
import com.google.common.collect.s0;
import com.google.common.collect.t0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class TextEmphasis {
    public static final int MARK_SHAPE_AUTO = -1;
    public static final int POSITION_OUTSIDE = -2;
    public final int markFill;
    public final int markShape;
    public final int position;
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
    private static final M<String> SINGLE_STYLE_VALUES = M.i(2, "auto", "none");
    private static final M<String> MARK_SHAPE_VALUES = M.i(3, "dot", "sesame", "circle");
    private static final M<String> MARK_FILL_VALUES = M.i(2, "filled", "open");
    private static final M<String> POSITION_VALUES = M.i(3, "after", "before", "outside");

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    private TextEmphasis(int i, int i2, int i3) {
        this.markShape = i;
        this.markFill = i2;
        this.position = i3;
    }

    @Nullable
    public static TextEmphasis parse(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String b = c.b(str.trim());
        if (b.isEmpty()) {
            return null;
        }
        return parseWords(M.k(TextUtils.split(b, WHITESPACE_PATTERN)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
    
        if (r9.equals("dot") != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TextEmphasis parseWords(M<String> m) {
        boolean z;
        int i;
        int hashCode;
        String str = (String) N.a("outside", t0.d(POSITION_VALUES, m));
        int hashCode2 = str.hashCode();
        boolean z2 = false;
        int i2 = -1;
        if (hashCode2 == -1392885889) {
            if (str.equals("before")) {
                z = 2;
            }
            z = -1;
        } else if (hashCode2 != -1106037339) {
            if (hashCode2 == 92734940 && str.equals("after")) {
                z = false;
            }
            z = -1;
        } else {
            if (str.equals("outside")) {
                z = true;
            }
            z = -1;
        }
        int i3 = z ? !z ? 1 : -2 : 2;
        s0 d = t0.d(SINGLE_STYLE_VALUES, m);
        if (!d.isEmpty()) {
            String str2 = (String) new r0(d).next();
            int hashCode3 = str2.hashCode();
            if (hashCode3 == 3005871) {
                str2.equals("auto");
            } else if (hashCode3 == 3387192 && str2.equals("none")) {
                i2 = 0;
            }
            return new TextEmphasis(i2, 0, i3);
        }
        s0 d2 = t0.d(MARK_FILL_VALUES, m);
        s0 d3 = t0.d(MARK_SHAPE_VALUES, m);
        if (d2.isEmpty() && d3.isEmpty()) {
            return new TextEmphasis(-1, 0, i3);
        }
        String str3 = (String) N.a("filled", d2);
        int hashCode4 = str3.hashCode();
        if (hashCode4 == -1274499742) {
            str3.equals("filled");
        } else if (hashCode4 == 3417674 && str3.equals("open")) {
            i = 2;
            String str4 = (String) N.a("circle", d3);
            hashCode = str4.hashCode();
            if (hashCode != -1360216880) {
                if (str4.equals("circle")) {
                    z2 = 2;
                }
                z2 = -1;
            } else if (hashCode != -905816648) {
                if (hashCode == 99657) {
                }
                z2 = -1;
            } else {
                if (str4.equals("sesame")) {
                    z2 = true;
                }
                z2 = -1;
            }
            return new TextEmphasis(z2 ? !z2 ? 1 : 3 : 2, i, i3);
        }
        i = 1;
        String str42 = (String) N.a("circle", d3);
        hashCode = str42.hashCode();
        if (hashCode != -1360216880) {
        }
        return new TextEmphasis(z2 ? !z2 ? 1 : 3 : 2, i, i3);
    }
}
