package GZ;

import androidx.fragment.app.r;
import java.util.Map;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface g {

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean a(g gVar, String str, Map map, c cVar, int i11) {
            if ((i11 & 2) != 0) {
                map = U.c();
            }
            if ((i11 & 4) != 0) {
                cVar = c.INTERNAL;
            }
            return gVar.a(str, map, cVar);
        }
    }

    boolean a(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull c cVar);

    boolean b(@NotNull String str, int i11, @NotNull Map<String, ? extends Object> map);

    boolean c(@NotNull LZ.c cVar, Integer num);

    pZ.f d(@NotNull r rVar, @NotNull String str);
}
