package Ee0;

import O4.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C0176a f7860a = new C0176a(2, 3);

    /* renamed from: Ee0.a$a, reason: collision with other inner class name */
    public static final class C0176a extends K4.a {
        @Override // K4.a
        public final void migrate(b db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            db2.O0("DELETE FROM cached_style_file");
        }
    }

    @NotNull
    public static final C0176a a() {
        return f7860a;
    }
}
