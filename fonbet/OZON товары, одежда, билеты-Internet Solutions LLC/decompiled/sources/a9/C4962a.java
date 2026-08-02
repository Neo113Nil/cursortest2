package a9;

import android.graphics.Bitmap;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;

/* renamed from: a9.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C4962a {

    /* renamed from: a, reason: collision with root package name */
    private volatile Bitmap f36439a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36440b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36441c;

    /* renamed from: d, reason: collision with root package name */
    private final int f36442d;

    private C4962a(@NonNull Bitmap bitmap) {
        this.f36439a = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.f36440b = bitmap.getWidth();
        this.f36441c = bitmap.getHeight();
        Preconditions.checkArgument(true, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        this.f36442d = -1;
    }

    @NonNull
    public static C4962a a(@NonNull Bitmap bitmap) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C4962a c4962a = new C4962a(bitmap);
        zzmu.zza(zzms.zzb("vision-common"), -1, 1, elapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), 0);
        return c4962a;
    }

    @KeepForSdk
    public final Bitmap b() {
        return this.f36439a;
    }

    @KeepForSdk
    public final int c() {
        return this.f36442d;
    }

    @KeepForSdk
    public final int d() {
        return this.f36441c;
    }

    @KeepForSdk
    public final int e() {
        return this.f36440b;
    }
}
