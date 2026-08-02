package X8;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Y8.a f34187a;

    @KeepForSdk
    public a(@NonNull Y8.a aVar) {
        this.f34187a = (Y8.a) Preconditions.checkNotNull(aVar);
        aVar.c();
        aVar.e();
    }

    public final int a() {
        int g10 = this.f34187a.g();
        if (g10 > 4096 || g10 == 0) {
            return -1;
        }
        return g10;
    }

    public final byte[] b() {
        byte[] b11 = this.f34187a.b();
        if (b11 != null) {
            return Arrays.copyOf(b11, b11.length);
        }
        return null;
    }

    public final String c() {
        return this.f34187a.d();
    }

    public final int d() {
        return this.f34187a.a();
    }
}
