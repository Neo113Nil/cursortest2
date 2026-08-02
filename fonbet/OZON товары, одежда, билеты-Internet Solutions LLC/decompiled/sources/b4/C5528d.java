package b4;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: b4.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5528d extends AbstractC5532h {

    /* renamed from: b, reason: collision with root package name */
    public final String f55495b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f55496c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f55497d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f55498e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC5532h[] f55499f;

    public C5528d(String str, boolean z11, boolean z12, String[] strArr, AbstractC5532h[] abstractC5532hArr) {
        super("CTOC");
        this.f55495b = str;
        this.f55496c = z11;
        this.f55497d = z12;
        this.f55498e = strArr;
        this.f55499f = abstractC5532hArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5528d.class == obj.getClass()) {
            C5528d c5528d = (C5528d) obj;
            if (this.f55496c == c5528d.f55496c && this.f55497d == c5528d.f55497d && Objects.equals(this.f55495b, c5528d.f55495b) && Arrays.equals(this.f55498e, c5528d.f55498e) && Arrays.equals(this.f55499f, c5528d.f55499f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = (((527 + (this.f55496c ? 1 : 0)) * 31) + (this.f55497d ? 1 : 0)) * 31;
        String str = this.f55495b;
        return i11 + (str != null ? str.hashCode() : 0);
    }
}
