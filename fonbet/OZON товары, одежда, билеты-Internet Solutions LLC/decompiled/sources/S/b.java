package S;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static b f25179b = new b();

    /* renamed from: a, reason: collision with root package name */
    private final e f25180a = e.f("1.4.0");

    @NonNull
    public static b a() {
        return f25179b;
    }

    public static boolean c(@NonNull e eVar) {
        e eVar2 = f25179b.f25180a;
        int c11 = eVar.c();
        return (eVar2.c() == c11 ? Integer.compare(eVar2.d(), eVar.d()) : Integer.compare(eVar2.c(), c11)) >= 0;
    }

    @NonNull
    public final e b() {
        return this.f25180a;
    }

    @NonNull
    public final String d() {
        return this.f25180a.toString();
    }
}
