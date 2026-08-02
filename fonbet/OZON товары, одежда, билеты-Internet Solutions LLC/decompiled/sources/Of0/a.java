package Of0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f20366a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f20367b;

    /* renamed from: Of0.a$a, reason: collision with other inner class name */
    public static final class C0413a {
        @NotNull
        public static a a() {
            a aVar;
            a aVar2 = a.f20367b;
            if (aVar2 != null) {
                return aVar2;
            }
            synchronized (a.f20366a) {
                aVar = a.f20367b;
                if (aVar == null) {
                    aVar = new a();
                    a.f20367b = aVar;
                }
            }
            return aVar;
        }
    }
}
