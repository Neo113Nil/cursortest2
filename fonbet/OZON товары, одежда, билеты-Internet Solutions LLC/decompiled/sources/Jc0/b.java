package Jc0;

import java.util.Map;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface b {

    public static final class a {
        public static /* synthetic */ Object a(b bVar, String str, Map map, kotlin.coroutines.jvm.internal.j jVar, int i11) {
            if ((i11 & 1) != 0) {
                str = "instantLoginEnable";
            }
            if ((i11 & 4) != 0) {
                map = U.c();
            }
            return bVar.b(str, map, (i11 & 8) != 0, jVar);
        }
    }

    Object a(Map map, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    boolean available();

    Object b(@NotNull String str, Map map, boolean z11, @NotNull kotlin.coroutines.jvm.internal.c cVar);
}
