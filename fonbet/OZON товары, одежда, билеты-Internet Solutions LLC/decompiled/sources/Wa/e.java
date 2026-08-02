package Wa;

import com.vk.knet.cornet.b;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static volatile com.vk.knet.cornet.b f33419a;

    public static void a(@NotNull b.a type, @NotNull Object... obj) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(obj, "obj");
        com.vk.knet.cornet.b bVar = f33419a;
        if (bVar != null) {
            bVar.debug(type, Arrays.copyOf(obj, obj.length));
        }
    }

    public static void b(@NotNull Object... obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        com.vk.knet.cornet.b bVar = f33419a;
        if (bVar != null) {
            bVar.error(Arrays.copyOf(obj, obj.length));
        }
    }

    public static void c(@NotNull com.vk.knet.cornet.b logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        f33419a = logger;
    }

    public static void d(@NotNull Object... obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        com.vk.knet.cornet.b bVar = f33419a;
        if (bVar != null) {
            bVar.info(Arrays.copyOf(obj, obj.length));
        }
    }
}
