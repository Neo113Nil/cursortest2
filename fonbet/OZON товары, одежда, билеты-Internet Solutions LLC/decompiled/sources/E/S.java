package E;

import androidx.annotation.NonNull;
import androidx.camera.core.p;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
final class S implements p.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f6843a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ByteBuffer f6844b;

    S(int i11, ByteBuffer byteBuffer) {
        this.f6843a = i11;
        this.f6844b = byteBuffer;
    }

    @Override // androidx.camera.core.p.a
    @NonNull
    public final ByteBuffer f() {
        return this.f6844b;
    }

    @Override // androidx.camera.core.p.a
    public final int g() {
        return this.f6843a;
    }

    @Override // androidx.camera.core.p.a
    public final int h() {
        return 4;
    }
}
