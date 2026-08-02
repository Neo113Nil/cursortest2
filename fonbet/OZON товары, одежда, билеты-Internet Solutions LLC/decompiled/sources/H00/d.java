package H00;

import T7.Z;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f10452a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final HashMap f10453b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10454c = 0;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f10455a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList f10456b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ArrayList f10457c;

        public a(@NotNull String uuid) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            this.f10455a = uuid;
            this.f10456b = new ArrayList();
            this.f10457c = new ArrayList();
        }

        @NotNull
        public final void a(@NotNull Object value, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f10456b.add(name + "=" + value);
        }

        @NotNull
        public final void b(@NotNull String name, @NotNull Number value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f10457c.add(name + "=" + value);
        }

        public final void c(@NotNull String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Log.i(tag, toString());
            d.a().remove(this.f10455a);
        }

        @NotNull
        public final String toString() {
            return Z.a(C7714v.V(this.f10456b, null, null, null, null, 63), ", metrics=[", C7714v.V(this.f10457c, null, null, null, null, 63), "]");
        }
    }

    @NotNull
    public static HashMap a() {
        return f10453b;
    }

    public static boolean b() {
        return f10452a;
    }

    public static void c(boolean z11) {
        f10452a = z11;
    }
}
