package Em0;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.Locale;

/* loaded from: classes4.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private int f8127a;

    /* renamed from: b, reason: collision with root package name */
    private int f8128b;

    /* renamed from: c, reason: collision with root package name */
    private int f8129c;

    /* renamed from: d, reason: collision with root package name */
    private int f8130d;

    /* renamed from: e, reason: collision with root package name */
    private int f8131e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8132f;

    public final void a(int i11, int i12, int i13) {
        int i14;
        this.f8127a = i11;
        boolean z11 = false;
        this.f8129c = 0;
        this.f8130d = 0;
        this.f8128b = 0;
        this.f8131e = -1;
        if (i13 > 0) {
            this.f8130d = 1;
            this.f8128b = i13;
        }
        if (i12 > 0) {
            this.f8130d |= 2;
            this.f8129c = i12;
        }
        int i15 = this.f8128b;
        if (i15 > 0 && (i14 = this.f8129c) > 0 && i15 < i14) {
            z11 = true;
        }
        this.f8132f = z11;
    }

    public final int b() {
        return this.f8131e;
    }

    public final int c() {
        return this.f8127a + this.f8128b;
    }

    public final int d() {
        return (this.f8127a + this.f8129c) - 1;
    }

    public final int e() {
        return this.f8129c;
    }

    public final int f() {
        return this.f8127a;
    }

    public final boolean g() {
        return (this.f8130d & 1) == 1;
    }

    public final boolean h() {
        return (this.f8130d & 2) == 2;
    }

    public final boolean i() {
        return this.f8132f;
    }

    public final void j(int i11) {
        this.f8129c -= this.f8128b;
        this.f8127a += i11;
        this.f8130d &= -2;
    }

    public final void k(int i11) {
        this.f8131e = i11;
    }

    public final String toString() {
        int i11 = this.f8130d;
        String str = (i11 & 3) == 3 ? "both" : (i11 & 1) == 1 ? "insert" : (i11 & 2) == 2 ? ProductAction.ACTION_REMOVE : i11 == 0 ? DevicePublicKeyStringDef.NONE : null;
        if (str != null) {
            return String.format(Locale.getDefault(), "[ DiffMeasures type=%s, diffStartPosition=%d, diffInsertLength=%d, diffRemoveLength=%d, cursor: %d ]", str, Integer.valueOf(this.f8127a), Integer.valueOf(this.f8128b), Integer.valueOf(this.f8129c), Integer.valueOf(this.f8131e));
        }
        throw new IllegalStateException("unknown behaviour for diffType " + this.f8130d);
    }
}
