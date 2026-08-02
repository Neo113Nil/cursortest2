package V0;

import gd.InterfaceC6712a;
import gd.InterfaceC6715d;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface d<K, V> extends Map, InterfaceC6712a {

    public interface a<K, V> extends Map<K, V>, InterfaceC6715d {
        @NotNull
        d<K, V> build();
    }

    @NotNull
    a<K, V> d();
}
