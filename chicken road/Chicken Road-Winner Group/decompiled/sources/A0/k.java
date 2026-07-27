package A0;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f69a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f70b;

    /* renamed from: c, reason: collision with root package name */
    public final x0.c f71c;

    public k(String str, byte[] bArr, x0.c cVar) {
        this.f69a = str;
        this.f70b = bArr;
        this.f71c = cVar;
    }

    public static j a() {
        j jVar = new j(0, false);
        jVar.f68d = x0.c.f10540a;
        return jVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f69a.equals(kVar.f69a) && Arrays.equals(this.f70b, kVar.f70b) && this.f71c.equals(kVar.f71c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f69a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f70b)) * 1000003) ^ this.f71c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f70b;
        return "TransportContext(" + this.f69a + ", " + this.f71c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
