package L4;

import Fh0.j;
import androidx.collection.C5132a;
import androidx.collection.C5153w;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c {
    public static final <K, V> void a(@NotNull C5132a<K, V> map, boolean z11, @NotNull Function1<? super C5132a<K, V>, Unit> fetchBlock) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(fetchBlock, "fetchBlock");
        C5132a c5132a = new C5132a(999);
        int size = map.size();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            if (z11) {
                c5132a.put(map.j(i11), map.n(i11));
            } else {
                c5132a.put(map.j(i11), null);
            }
            i11++;
            i12++;
            if (i12 == 999) {
                fetchBlock.invoke(c5132a);
                if (!z11) {
                    map.putAll(c5132a);
                }
                c5132a.clear();
                i12 = 0;
            }
        }
        if (i12 > 0) {
            fetchBlock.invoke(c5132a);
            if (z11) {
                return;
            }
            map.putAll(c5132a);
        }
    }

    public static final void b(@NotNull C5153w map, @NotNull j fetchBlock) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(fetchBlock, "fetchBlock");
        C5153w other = new C5153w(999);
        int h11 = map.h();
        int i11 = 0;
        int i12 = 0;
        while (i11 < h11) {
            other.f(map.e(i11), null);
            i11++;
            i12++;
            if (i12 == 999) {
                fetchBlock.invoke(other);
                Intrinsics.checkNotNullParameter(other, "other");
                int h12 = other.h();
                for (int i13 = 0; i13 < h12; i13++) {
                    map.f(other.e(i13), other.i(i13));
                }
                other.a();
                i12 = 0;
            }
        }
        if (i12 > 0) {
            fetchBlock.invoke(other);
            Intrinsics.checkNotNullParameter(other, "other");
            int h13 = other.h();
            for (int i14 = 0; i14 < h13; i14++) {
                map.f(other.e(i14), other.i(i14));
            }
        }
    }
}
