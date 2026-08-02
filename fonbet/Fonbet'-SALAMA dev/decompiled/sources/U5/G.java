package U5;

import W5.f2;
import java.nio.charset.Charset;
import java.util.BitSet;

/* loaded from: classes2.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f6421a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    public static final F3.c f6422b = b0.f6458e;

    public static Z a(String str, f2 f2Var) {
        boolean z4 = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z4 = true;
        }
        BitSet bitSet = Y.f6448d;
        return new Z(str, z4, f2Var);
    }
}
