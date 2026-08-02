package b4;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: b4.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5536l extends AbstractC5532h {

    /* renamed from: b, reason: collision with root package name */
    public final String f55522b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f55523c;

    public C5536l(String str, byte[] bArr) {
        super("PRIV");
        this.f55522b = str;
        this.f55523c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5536l.class == obj.getClass()) {
            C5536l c5536l = (C5536l) obj;
            if (Objects.equals(this.f55522b, c5536l.f55522b) && Arrays.equals(this.f55523c, c5536l.f55523c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f55522b;
        return Arrays.hashCode(this.f55523c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // b4.AbstractC5532h
    public final String toString() {
        return this.f55512a + ": owner=" + this.f55522b;
    }
}
