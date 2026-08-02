package Ub;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface j {

    public interface a {
        @NonNull
        t a();

        @NonNull
        <N extends Hf.u> a b(@NonNull Class<N> cls, t tVar);

        @NonNull
        a c(@NonNull HH.b bVar);
    }

    <N extends Hf.u> t a(@NonNull Class<N> cls);
}
