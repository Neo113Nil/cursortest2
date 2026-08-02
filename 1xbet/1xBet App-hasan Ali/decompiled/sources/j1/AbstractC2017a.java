package j1;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.l;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2017a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f17483a = 0;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            D0.d.b(30);
        }
        if (i >= 30) {
            D0.d.b(31);
        }
        if (i >= 30) {
            D0.d.b(33);
        }
        if (i >= 30) {
            D0.d.b(1000000);
        }
    }

    public static final boolean a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return true;
        }
        if (i >= 30) {
            String str = Build.VERSION.CODENAME;
            l.e("CODENAME", str);
            if (!"REL".equals(str)) {
                Locale locale = Locale.ROOT;
                String upperCase = str.toUpperCase(locale);
                l.e("toUpperCase(...)", upperCase);
                Integer num = upperCase.equals("BAKLAVA") ? 0 : null;
                String upperCase2 = "S".toUpperCase(locale);
                l.e("toUpperCase(...)", upperCase2);
                Integer num2 = upperCase2.equals("BAKLAVA") ? 0 : null;
                if (num == null || num2 == null) {
                    if (num == null && num2 == null) {
                        String upperCase3 = str.toUpperCase(locale);
                        l.e("toUpperCase(...)", upperCase3);
                        String upperCase4 = "S".toUpperCase(locale);
                        l.e("toUpperCase(...)", upperCase4);
                        if (upperCase3.compareTo(upperCase4) >= 0) {
                            return true;
                        }
                    } else if (num != null) {
                        return true;
                    }
                } else if (num.intValue() >= num2.intValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}
