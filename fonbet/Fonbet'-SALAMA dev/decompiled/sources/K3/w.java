package K3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import w1.C1719l1;

/* loaded from: classes2.dex */
public final class w extends b {
    public static w b(j jVar, C1719l1 c1719l1, Integer num) {
        j jVar2 = j.f3924q;
        if (jVar != jVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + jVar + " the value of idRequirement must be non-null");
        }
        if (jVar == jVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        X3.a aVar = (X3.a) c1719l1.f17771a;
        if (aVar.f7473a.length != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + aVar.f7473a.length);
        }
        if (jVar == jVar2) {
            X3.a.a(new byte[0]);
        } else if (jVar == j.f3923p) {
            X3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (jVar != j.f3922o) {
                throw new IllegalStateException("Unknown Variant: " + jVar);
            }
            X3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new w();
    }
}
