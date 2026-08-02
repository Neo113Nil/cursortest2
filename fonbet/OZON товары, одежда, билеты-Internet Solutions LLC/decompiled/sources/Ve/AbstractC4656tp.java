package Ve;

import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;

/* renamed from: Ve.tp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4656tp {
    public static int a(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final Pq b(long j11, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        int i11 = R.string.spay_currency_pattern;
        Object[] args = {c(j11), currency};
        Intrinsics.checkNotNullParameter(args, "args");
        return new Pq(i11, C7705l.f0(args));
    }

    public static final String c(long j11) {
        String concat;
        int length;
        int b11;
        if (j11 == 0) {
            return "0";
        }
        boolean z11 = j11 < 0;
        String S11 = kotlin.text.h.S(String.valueOf(j11), "-");
        if (S11.length() == 2) {
            concat = "0,".concat(S11);
        } else if (S11.length() > 2) {
            StringBuilder sb2 = new StringBuilder(S11);
            sb2.insert(S11.length() - 2, ",");
            if (sb2.length() > 6 && (b11 = S8.b.b((length = sb2.length() - 6), 0, -3)) <= length) {
                while (true) {
                    sb2.insert(length, ' ');
                    if (length == b11) {
                        break;
                    }
                    length -= 3;
                }
            }
            String formatToStringAmount$lambda$2 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(formatToStringAmount$lambda$2, "formatToStringAmount$lambda$2");
            concat = kotlin.text.h.U(formatToStringAmount$lambda$2, ",00");
            Intrinsics.checkNotNullExpressionValue(concat, "takeUnless { removeZeroP…\"${DECIMAL_SEPARATOR}00\")");
        } else {
            concat = "0,0".concat(S11);
        }
        Intrinsics.checkNotNullParameter(concat, "<this>");
        return z11 ? Nk.a.b("-", concat) : concat;
    }
}
