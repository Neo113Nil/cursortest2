package w1;

import d6.C0977k;
import java.util.UUID;

/* renamed from: w1.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1738q0 {

    /* renamed from: a, reason: collision with root package name */
    public String f17831a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f17832b;

    public C1738q0(byte[] bArr) {
        this.f17831a = null;
        this.f17832b = null;
        this.f17831a = UUID.randomUUID().toString();
        this.f17832b = bArr;
    }

    public static C0977k a(String str) {
        return new C0977k(AbstractC1707i1.f17743c.getFileStreamPath(".yflurrydatasenderblock.".concat(String.valueOf(str))), ".yflurrydatasenderblock.", 2, new B4.V(27));
    }
}
