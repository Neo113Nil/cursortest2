package androidx.core.util;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\bH\u0086\b¢\u0006\u0004\b\u0002\u0010\t"}, d2 = {"", "Landroid/util/Half;", "toHalf", "(S)Landroid/util/Half;", "", "(F)Landroid/util/Half;", "", "(D)Landroid/util/Half;", "", "(Ljava/lang/String;)Landroid/util/Half;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HalfKt {
    public static final android.util.Half toHalf(short s) {
        return android.util.Half.valueOf(s);
    }

    public static final android.util.Half toHalf(float f) {
        return android.util.Half.valueOf(f);
    }

    public static final android.util.Half toHalf(java.lang.String str) {
        return android.util.Half.valueOf(str);
    }

    public static final android.util.Half toHalf(double d) {
        return android.util.Half.valueOf((float) d);
    }
}
