package p000;

import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: renamed from: ra */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0648ra {

    /* JADX INFO: renamed from: a */
    public final String f6760a;

    /* JADX INFO: renamed from: b */
    public final byte[] f6761b;

    /* JADX INFO: renamed from: c */
    public final dx0 f6762c;

    public C0648ra(String str, byte[] bArr, dx0 dx0Var) {
        this.f6760a = str;
        this.f6761b = bArr;
        this.f6762c = dx0Var;
    }

    /* JADX INFO: renamed from: a */
    public static qd0 m4283a() {
        qd0 qd0Var = new qd0(4);
        qd0Var.f6473m = dx0.f1868j;
        return qd0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0648ra) {
            C0648ra c0648ra = (C0648ra) obj;
            if (this.f6760a.equals(c0648ra.f6760a) && Arrays.equals(this.f6761b, c0648ra.f6761b) && this.f6762c.equals(c0648ra.f6762c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6762c.hashCode() ^ ((((this.f6760a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f6761b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.f6761b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.f6760a);
        sb.append(", ");
        sb.append(this.f6762c);
        sb.append(", ");
        return AbstractC0024an.m285h(sb, strEncodeToString, ")");
    }
}
