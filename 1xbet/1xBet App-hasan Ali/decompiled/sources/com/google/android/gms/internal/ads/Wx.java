package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class Wx extends AbstractC1628tx {

    /* renamed from: l, reason: collision with root package name */
    public final Xx f12130l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f12131m;

    public Wx(Xx xx, C1419pB c1419pB, Integer num) {
        this.f12130l = xx;
        this.f12131m = num;
    }

    public static Wx o0(Xx xx, Integer num) {
        C1419pB a5;
        Ix ix = xx.f12260b;
        if (ix == Ix.f9647p) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            a5 = C1419pB.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (ix != Ix.f9648q) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(ix.f9653l));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            a5 = C1419pB.a(new byte[0]);
        }
        return new Wx(xx, a5, num);
    }
}
