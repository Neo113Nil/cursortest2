package E10;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public interface c {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private static final C0161a f7343a = new C0161a();

        /* renamed from: E10.c$a$a, reason: collision with other inner class name */
        public static final class C0161a implements c {
            @Override // E10.c
            public final E10.a getPrefetchDepth(String str) {
                E10.a aVar;
                aVar = E10.a.f7340c;
                return aVar;
            }

            @Override // E10.c
            public final void init(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
            }
        }

        @NotNull
        public static C0161a a() {
            return f7343a;
        }
    }

    @NotNull
    E10.a getPrefetchDepth(String str);

    void init(@NotNull Context context);
}
