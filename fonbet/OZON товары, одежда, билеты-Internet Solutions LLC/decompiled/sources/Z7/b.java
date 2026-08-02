package Z7;

import S7.d;
import S7.e;
import com.google.crypto.tink.internal.C5885d;
import com.google.crypto.tink.internal.C5891j;
import com.google.crypto.tink.internal.F;
import com.google.crypto.tink.internal.M;
import com.google.crypto.tink.internal.v;
import f8.O;
import i8.h;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private final d f35685a;

    /* renamed from: b, reason: collision with root package name */
    private final O f35686b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f35687c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35688a;

        static {
            int[] iArr = new int[O.values().length];
            f35688a = iArr;
            try {
                iArr[O.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35688a[O.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35688a[O.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35688a[O.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private b(d dVar, O o11, byte[] bArr) {
        this.f35685a = dVar;
        this.f35686b = o11;
        this.f35687c = bArr;
    }

    public static b c(C5891j c5891j) throws GeneralSecurityException {
        byte[] d11;
        F f7 = c5891j.f(e.a());
        d dVar = (d) C5885d.d().a(d.class, f7.f()).c(f7.g());
        O e11 = f7.e();
        int i11 = a.f35688a[e11.ordinal()];
        if (i11 == 1) {
            d11 = v.f59296a.d();
        } else if (i11 == 2 || i11 == 3) {
            d11 = v.a(c5891j.c().intValue()).d();
        } else {
            if (i11 != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + e11.getNumber());
            }
            d11 = v.b(c5891j.c().intValue()).d();
        }
        return new b(dVar, e11, d11);
    }

    @Override // S7.d
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        O o11 = this.f35686b;
        O o12 = O.RAW;
        d dVar = this.f35685a;
        if (o11 == o12) {
            return dVar.a(bArr, bArr2);
        }
        if (M.b(this.f35687c, bArr)) {
            return dVar.a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }

    @Override // S7.d
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        O o11 = this.f35686b;
        O o12 = O.RAW;
        d dVar = this.f35685a;
        return o11 == o12 ? dVar.b(bArr, bArr2) : h.a(this.f35687c, dVar.b(bArr, bArr2));
    }
}
