package sg.bigo.ads.C;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class x {
    public static int a(int i, String str) {
        if (i <= 0) {
            return 0;
        }
        return Math.abs((str + new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis() / 86400000))).hashCode()) % i;
    }
}
