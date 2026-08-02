package androidx.camera.core.impl;

import G.j;
import android.hardware.camera2.CaptureResult;
import androidx.annotation.NonNull;

/* renamed from: androidx.camera.core.impl.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC5130z {

    /* renamed from: androidx.camera.core.impl.z$a */
    public static final class a implements InterfaceC5130z {
        @Override // androidx.camera.core.impl.InterfaceC5130z
        @NonNull
        public final X0 a() {
            return X0.b();
        }

        @Override // androidx.camera.core.impl.InterfaceC5130z
        @NonNull
        public final EnumC5122v c() {
            return EnumC5122v.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.InterfaceC5130z
        @NonNull
        public final EnumC5126x d() {
            return EnumC5126x.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.InterfaceC5130z
        @NonNull
        public final EnumC5118t e() {
            return EnumC5118t.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.InterfaceC5130z
        @NonNull
        public final EnumC5128y f() {
            return EnumC5128y.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.InterfaceC5130z
        public final CaptureResult g() {
            return null;
        }

        @Override // androidx.camera.core.impl.InterfaceC5130z
        public final long getTimestamp() {
            return -1L;
        }
    }

    @NonNull
    X0 a();

    default void b(@NonNull j.b bVar) {
        bVar.g(f());
    }

    @NonNull
    EnumC5122v c();

    @NonNull
    EnumC5126x d();

    @NonNull
    EnumC5118t e();

    @NonNull
    EnumC5128y f();

    default CaptureResult g() {
        return null;
    }

    long getTimestamp();
}
