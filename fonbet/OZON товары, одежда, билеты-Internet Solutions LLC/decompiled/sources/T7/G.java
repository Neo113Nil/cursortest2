package T7;

import T7.H;
import j8.C7306a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class G extends AbstractC4020b {

    /* renamed from: a, reason: collision with root package name */
    private final H f26719a;

    /* renamed from: b, reason: collision with root package name */
    private final C7306a f26720b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f26721c;

    private G(H h11, C7306a c7306a, Integer num) {
        this.f26719a = h11;
        this.f26720b = c7306a;
        this.f26721c = num;
    }

    public static G g(H h11, Integer num) throws GeneralSecurityException {
        C7306a b11;
        if (h11.d() == H.a.f26724b) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            b11 = C7306a.b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (h11.d() != H.a.f26725c) {
                throw new GeneralSecurityException("Unknown Variant: " + h11.d());
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            b11 = C7306a.b(new byte[0]);
        }
        return new G(h11, b11, num);
    }

    @Override // He.g
    public final Integer c() {
        return this.f26721c;
    }

    @Override // T7.AbstractC4020b, He.g
    public final S7.q d() {
        return this.f26719a;
    }

    @Override // T7.AbstractC4020b
    public final C7306a e() {
        return this.f26720b;
    }

    @Override // T7.AbstractC4020b
    /* renamed from: f */
    public final AbstractC4021c d() {
        return this.f26719a;
    }

    public final H h() {
        return this.f26719a;
    }
}
