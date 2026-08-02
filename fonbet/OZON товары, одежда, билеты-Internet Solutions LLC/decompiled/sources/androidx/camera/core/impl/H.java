package androidx.camera.core.impl;

import C.InterfaceC2694n;
import android.util.Size;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public interface H extends InterfaceC2694n {
    @NonNull
    Set<C.A> a();

    @NonNull
    String b();

    void d(@NonNull Executor executor, @NonNull AbstractC5111p abstractC5111p);

    void f(@NonNull AbstractC5111p abstractC5111p);

    @NonNull
    InterfaceC5084b0 h();

    @NonNull
    List<Size> j(int i11);

    @NonNull
    I0 l();

    @NonNull
    List<Size> m(int i11);

    boolean n();

    @NonNull
    default H o() {
        return this;
    }

    @NonNull
    Y0 p();
}
