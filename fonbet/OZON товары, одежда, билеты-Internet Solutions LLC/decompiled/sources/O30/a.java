package O30;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static Function1<? super b, Unit> f19932a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final HashMap<b, Y30.b> f19933b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f19934c = 0;

    @NotNull
    public static Y30.b a(@NotNull b type) {
        Function1<? super b, Unit> function1;
        Intrinsics.checkNotNullParameter(type, "type");
        HashMap<b, Y30.b> hashMap = f19933b;
        Y30.b bVar = hashMap.get(type);
        if (bVar == null && (function1 = f19932a) != null) {
            function1.invoke(type);
            Unit unit = Unit.f71690a;
            bVar = hashMap.get(type);
        }
        Y30.b bVar2 = bVar;
        if (bVar2 != null) {
            return bVar2;
        }
        throw new IllegalStateException("ComponentStorage doesn't exis for type " + type);
    }

    public static void b(Function1 function1) {
        f19932a = function1;
    }

    public static void c(@NotNull b type, @NotNull Y30.b storage) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(storage, "storage");
        f19933b.put(type, storage);
    }
}
