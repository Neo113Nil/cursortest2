package androidx.camera.core.impl;

import C.a0;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.O;

/* loaded from: classes8.dex */
public final class K implements N0 {

    /* renamed from: b, reason: collision with root package name */
    private final Z0 f38129b;

    final class a implements C.a0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f38130b;

        a(long j11) {
            this.f38130b = j11;
        }

        @Override // C.a0
        public final long a() {
            return this.f38130b;
        }

        @Override // C.a0
        @NonNull
        public final a0.b c(@NonNull J j11) {
            return j11.c() == 1 ? a0.b.f4156d : a0.b.f4157e;
        }
    }

    public static final class b implements N0 {

        /* renamed from: b, reason: collision with root package name */
        private final K f38131b;

        public b(long j11) {
            this.f38131b = new K(j11);
        }

        @Override // C.a0
        public final long a() {
            return this.f38131b.a();
        }

        @Override // androidx.camera.core.impl.N0
        @NonNull
        public final C.a0 b(long j11) {
            return new b(j11);
        }

        @Override // C.a0
        @NonNull
        public final a0.b c(@NonNull J j11) {
            if (this.f38131b.c(j11).c()) {
                return a0.b.f4157e;
            }
            Throwable a11 = j11.a();
            if (a11 instanceof O.b) {
                C.S.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((O.b) a11).a() > 0) {
                    return a0.b.f4158f;
                }
            }
            return a0.b.f4156d;
        }
    }

    public K(long j11) {
        this.f38129b = new Z0(j11, new a(j11));
    }

    @Override // C.a0
    public final long a() {
        return this.f38129b.a();
    }

    @Override // androidx.camera.core.impl.N0
    @NonNull
    public final C.a0 b(long j11) {
        return new K(j11);
    }

    @Override // C.a0
    @NonNull
    public final a0.b c(@NonNull J j11) {
        return this.f38129b.c(j11);
    }
}
