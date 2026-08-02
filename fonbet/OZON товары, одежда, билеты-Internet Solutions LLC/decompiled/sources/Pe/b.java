package Pe;

import Le.InterfaceC3583a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class b {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f22280c = new a(new f(), Re.d.a());

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f22281a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Re.b f22282b;

    public static final class a extends b {
    }

    public b(f fVar, Re.b bVar) {
        this.f22281a = fVar;
        this.f22282b = bVar;
        new ConcurrentHashMap(16);
    }

    @NotNull
    public final String a(@NotNull InterfaceC3583a serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Qe.j jVar = new Qe.j();
        try {
            Qe.i.a(this, jVar, serializer, obj);
            return jVar.toString();
        } finally {
            jVar.b();
        }
    }

    @NotNull
    public final f b() {
        return this.f22281a;
    }

    @NotNull
    public final Re.c c() {
        return this.f22282b;
    }
}
