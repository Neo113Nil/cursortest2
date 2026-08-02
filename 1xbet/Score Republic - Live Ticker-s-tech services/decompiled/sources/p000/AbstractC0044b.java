package p000;

import java.io.EOFException;

/* JADX INFO: renamed from: b */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0044b {

    /* JADX INFO: renamed from: a */
    public static final byte[] f660a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC0321ig.f3562a);
        bytes.getClass();
        f660a = bytes;
    }

    /* JADX INFO: renamed from: a */
    public static final String m545a(C0539oc c0539oc, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (c0539oc.m3669e(j2) == 13) {
                String strM3673m = c0539oc.m3673m(j2, AbstractC0321ig.f3562a);
                c0539oc.m3674o(2L);
                return strM3673m;
            }
        }
        String strM3673m2 = c0539oc.m3673m(j, AbstractC0321ig.f3562a);
        c0539oc.m3674o(1L);
        return strM3673m2;
    }
}
