package U7;

import com.google.crypto.tink.internal.C5885d;
import com.google.crypto.tink.internal.C5891j;
import com.google.crypto.tink.internal.F;
import com.google.crypto.tink.internal.M;
import f8.O;
import j8.C7306a;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class w implements S7.a {

    /* renamed from: a, reason: collision with root package name */
    private final S7.a f27422a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f27423b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27424a;

        static {
            int[] iArr = new int[O.values().length];
            f27424a = iArr;
            try {
                iArr[O.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27424a[O.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27424a[O.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27424a[O.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private w(S7.a aVar, byte[] bArr) {
        this.f27422a = aVar;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f27423b = bArr;
    }

    public static w c(S7.a aVar, C7306a c7306a) {
        return new w(aVar, c7306a.d());
    }

    public static w d(C5891j c5891j) throws GeneralSecurityException {
        byte[] d11;
        F f7 = c5891j.f(S7.e.a());
        S7.a aVar = (S7.a) C5885d.d().a(S7.a.class, f7.f()).c(f7.g());
        O e11 = f7.e();
        int i11 = a.f27424a[e11.ordinal()];
        if (i11 == 1) {
            d11 = com.google.crypto.tink.internal.v.f59296a.d();
        } else if (i11 == 2 || i11 == 3) {
            d11 = com.google.crypto.tink.internal.v.a(c5891j.c().intValue()).d();
        } else {
            if (i11 != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + e11);
            }
            d11 = com.google.crypto.tink.internal.v.b(c5891j.c().intValue()).d();
        }
        return new w(aVar, d11);
    }

    @Override // S7.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f27423b;
        int length = bArr3.length;
        S7.a aVar = this.f27422a;
        return length == 0 ? aVar.a(bArr, bArr2) : i8.h.a(bArr3, aVar.a(bArr, bArr2));
    }

    @Override // S7.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f27423b;
        int length = bArr3.length;
        S7.a aVar = this.f27422a;
        if (length == 0) {
            return aVar.b(bArr, bArr2);
        }
        if (M.b(bArr3, bArr)) {
            return aVar.b(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
