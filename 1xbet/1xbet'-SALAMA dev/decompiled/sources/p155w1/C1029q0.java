package p155w1;

import B4.V;
import java.util.UUID;
import p028d6.k;

/* JADX INFO: renamed from: w1.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1029q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f17838b;

    public C1029q0(byte[] bArr) {
        this.f17837a = null;
        this.f17838b = null;
        this.f17837a = UUID.randomUUID().toString();
        this.f17838b = bArr;
    }

    public static k a(String str) {
        return new k(AbstractC0998i1.f17749c.getFileStreamPath(".yflurrydatasenderblock.".concat(String.valueOf(str))), ".yflurrydatasenderblock.", 2, new V(27));
    }
}
