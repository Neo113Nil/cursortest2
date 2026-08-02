package E;

import G.j;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.X0;

/* loaded from: classes8.dex */
final class T implements C.L {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f6845a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f6846b;

    T(long j11, int i11) {
        this.f6845a = j11;
        this.f6846b = i11;
    }

    @Override // C.L
    @NonNull
    public final X0 a() {
        throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
    }

    @Override // C.L
    public final void b(@NonNull j.b bVar) {
        throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
    }

    @Override // C.L
    public final int c() {
        return this.f6846b;
    }

    @Override // C.L
    public final long getTimestamp() {
        return this.f6845a;
    }
}
