package p000;

import java.nio.charset.Charset;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oe0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f5707a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b */
    public static final C0353jb f5708b = np0.f5486e;

    /* JADX INFO: renamed from: a */
    public static lp0 m3684a(String str, ne0 ne0Var) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        BitSet bitSet = kp0.f4493d;
        return new lp0(str, z, ne0Var);
    }
}
