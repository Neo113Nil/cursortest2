package R;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.EnumC5118t;
import androidx.camera.core.impl.EnumC5122v;
import androidx.camera.core.impl.EnumC5126x;
import androidx.camera.core.impl.EnumC5128y;
import androidx.camera.core.impl.InterfaceC5130z;
import androidx.camera.core.impl.X0;

/* loaded from: classes8.dex */
public final class i implements InterfaceC5130z {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5130z f23885a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final X0 f23886b;

    /* renamed from: c, reason: collision with root package name */
    private final long f23887c;

    public i(@NonNull X0 x02, InterfaceC5130z interfaceC5130z) {
        this(interfaceC5130z, x02, -1L);
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    @NonNull
    public final X0 a() {
        return this.f23886b;
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    @NonNull
    public final EnumC5122v c() {
        InterfaceC5130z interfaceC5130z = this.f23885a;
        return interfaceC5130z != null ? interfaceC5130z.c() : EnumC5122v.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    @NonNull
    public final EnumC5126x d() {
        InterfaceC5130z interfaceC5130z = this.f23885a;
        return interfaceC5130z != null ? interfaceC5130z.d() : EnumC5126x.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    @NonNull
    public final EnumC5118t e() {
        InterfaceC5130z interfaceC5130z = this.f23885a;
        return interfaceC5130z != null ? interfaceC5130z.e() : EnumC5118t.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    @NonNull
    public final EnumC5128y f() {
        InterfaceC5130z interfaceC5130z = this.f23885a;
        return interfaceC5130z != null ? interfaceC5130z.f() : EnumC5128y.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    public final long getTimestamp() {
        InterfaceC5130z interfaceC5130z = this.f23885a;
        if (interfaceC5130z != null) {
            return interfaceC5130z.getTimestamp();
        }
        long j11 = this.f23887c;
        if (j11 != -1) {
            return j11;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    public i(@NonNull X0 x02, long j11) {
        this(null, x02, j11);
    }

    private i(InterfaceC5130z interfaceC5130z, @NonNull X0 x02, long j11) {
        this.f23885a = interfaceC5130z;
        this.f23886b = x02;
        this.f23887c = j11;
    }
}
