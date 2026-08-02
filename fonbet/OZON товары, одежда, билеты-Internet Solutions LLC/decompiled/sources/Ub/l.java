package Ub;

import Hf.B;
import ac.C4993b;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface l extends B {

    /* loaded from: classes.dex */
    public interface a {
        @NonNull
        <N extends Hf.u> a a(@NonNull Class<N> cls, b<? super N> bVar);
    }

    /* loaded from: classes.dex */
    public interface b<N extends Hf.u> {
        void a(@NonNull Hf.u uVar, @NonNull l lVar);
    }

    boolean A(@NonNull Hf.u uVar);

    <N extends Hf.u> void E(@NonNull N n11, int i11);

    void a(int i11, Object obj);

    void b(@NonNull Hf.u uVar);

    @NonNull
    u d();

    void g(@NonNull C4993b c4993b, int i11);

    @NonNull
    r i();

    void k();

    int length();

    void q(@NonNull Hf.u uVar);

    @NonNull
    f t();

    void w();
}
