package B4;

import B0.A0;
import B4.b0;
import android.annotation.SuppressLint;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"TypeParameterUnusedInFormals"})
/* loaded from: classes8.dex */
public final class d0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f2611b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2612c = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f2613a = new LinkedHashMap();

    public static final class a {
        @NotNull
        public static String a(@NotNull Class navigatorClass) {
            Intrinsics.checkNotNullParameter(navigatorClass, "navigatorClass");
            String str = (String) d0.f2611b.get(navigatorClass);
            if (str == null) {
                b0.a aVar = (b0.a) navigatorClass.getAnnotation(b0.a.class);
                str = aVar != null ? aVar.value() : null;
                if (str == null || str.length() <= 0) {
                    throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(navigatorClass.getSimpleName()).toString());
                }
                d0.f2611b.put(navigatorClass, str);
            }
            Intrinsics.f(str);
            return str;
        }
    }

    public final void b(@NotNull b0 navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        String name = a.a(navigator.getClass());
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f2613a;
        b0 b0Var = (b0) linkedHashMap.get(name);
        if (Intrinsics.d(b0Var, navigator)) {
            return;
        }
        boolean z11 = false;
        if (b0Var != null && b0Var.c()) {
            z11 = true;
        }
        if (z11) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + b0Var).toString());
        }
        if (!navigator.c()) {
            return;
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    @NotNull
    public final <T extends b0<?>> T c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name == null || name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        T t2 = (T) this.f2613a.get(name);
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException(A0.b("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
    }

    @NotNull
    public final Map<String, b0<? extends H>> d() {
        return kotlin.collections.U.t(this.f2613a);
    }
}
