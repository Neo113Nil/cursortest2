package Bj;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class g {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final g IS_DEBUG;

    @NotNull
    private final String key = "isDebug";

    public static final class a {
        public static g a(@NotNull String srcKey) {
            Object obj;
            Intrinsics.checkNotNullParameter(srcKey, "srcKey");
            Iterator<E> it = g.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((g) obj).b(), srcKey)) {
                    break;
                }
            }
            return (g) obj;
        }
    }

    static {
        g gVar = new g();
        IS_DEBUG = gVar;
        g[] gVarArr = {gVar};
        $VALUES = gVarArr;
        $ENTRIES = Xc.b.a(gVarArr);
        Companion = new a();
    }

    private g() {
    }

    @NotNull
    public static Xc.a<g> a() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    @NotNull
    public final String b() {
        return this.key;
    }
}
