package b9;

import a9.C4962a;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

@KeepForSdk
/* renamed from: b9.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5586a {

    /* renamed from: c, reason: collision with root package name */
    private static final GmsLogger f55725c = new GmsLogger("StreamingFormatChecker", "");

    /* renamed from: a, reason: collision with root package name */
    private final LinkedList f55726a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private long f55727b = -1;

    @KeepForSdk
    public final void a(@NonNull C4962a c4962a) {
        if (c4962a.c() != -1) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        LinkedList linkedList = this.f55726a;
        linkedList.add(Long.valueOf(elapsedRealtime));
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (linkedList.size() != 5 || elapsedRealtime - ((Long) Preconditions.checkNotNull((Long) linkedList.peekFirst())).longValue() >= 5000) {
            return;
        }
        long j11 = this.f55727b;
        if (j11 == -1 || elapsedRealtime - j11 >= TimeUnit.SECONDS.toMillis(5L)) {
            this.f55727b = elapsedRealtime;
            f55725c.w("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
        }
    }
}
