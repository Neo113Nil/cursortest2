package Bi0;

import ei0.InterfaceC6369b;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.model.TrinityEventEntityKt;

/* loaded from: classes3.dex */
public final class a implements Ai0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6369b f3873a;

    /* renamed from: Bi0.a$a, reason: collision with other inner class name */
    private static final class C0104a {
    }

    public a(@NotNull InterfaceC6369b tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f3873a = tracker;
    }

    @Override // Ai0.a
    public final void a(@NotNull String type, int i11) {
        Intrinsics.checkNotNullParameter(type, "field");
        for (int i12 = 0; i12 < i11; i12++) {
            String e11 = Ej0.a.e();
            Pair pair = new Pair(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "test_custom_event");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f3873a.sendCustomEvent(e11, U.j(pair, new Pair("object", new C0104a())));
        }
    }
}
