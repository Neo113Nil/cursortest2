package S0;

import W5.AbstractC0486a1;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* loaded from: classes.dex */
public final class q implements WebMessagePayloadBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    public final int f6258a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6259b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f6260c;

    public q(String str) {
        this.f6258a = 0;
        this.f6259b = str;
        this.f6260c = null;
    }

    public final void a(int i7) {
        int i8 = this.f6258a;
        if (i8 != i7) {
            throw new IllegalStateException(AbstractC0486a1.e(i7, i8, "Expected ", ", but type is "));
        }
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final byte[] getAsArrayBuffer() {
        a(1);
        byte[] bArr = this.f6260c;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final String getAsString() {
        a(0);
        return this.f6259b;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final int getType() {
        return this.f6258a;
    }

    public q(byte[] bArr) {
        this.f6258a = 1;
        this.f6259b = null;
        this.f6260c = bArr;
    }
}
