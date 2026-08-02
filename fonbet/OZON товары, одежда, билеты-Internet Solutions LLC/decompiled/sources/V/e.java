package V;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class e {
    public static String a(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String b(Object[] objArr, int i11, String str, String str2) {
        String format = String.format(str, Arrays.copyOf(objArr, i11));
        Intrinsics.checkNotNullExpressionValue(format, str2);
        return format;
    }
}
