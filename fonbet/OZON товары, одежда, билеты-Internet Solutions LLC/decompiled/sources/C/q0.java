package C;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class q0 extends androidx.camera.core.impl.W {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ s0 f4218o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q0(s0 s0Var, Size size) {
        super(size, 34);
        this.f4218o = s0Var;
    }

    @Override // androidx.camera.core.impl.W
    @NonNull
    protected final com.google.common.util.concurrent.m<Surface> o() {
        return this.f4218o.f4229g;
    }
}
