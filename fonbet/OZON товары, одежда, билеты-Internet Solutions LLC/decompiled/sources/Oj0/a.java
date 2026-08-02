package Oj0;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.util.LinkedHashSet;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import mi0.InterfaceC8333c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.network.NameSpaceAdapter;
import ru.ozon.tracker.network.serializing.BigDecimalMoshiAdapter;
import ru.ozon.tracker.network.serializing.JsonObjectAdapter;
import ru.ozon.tracker.network.serializing.NumberMoshiAdapter;
import ru.ozon.tracker.sendEvent.serializing.CellAdapterFactory;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final NameSpaceAdapter f20454a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Moshi f20455b;

    static {
        NameSpaceAdapter nameSpaceAdapter = new NameSpaceAdapter();
        f20454a = nameSpaceAdapter;
        Moshi.a aVar = new Moshi.a();
        LinkedHashSet e11 = e0.e(new JsonObjectAdapter(), new BigDecimalMoshiAdapter(), new NumberMoshiAdapter(), nameSpaceAdapter, new ru.ozon.tracker.network.serializing.date.a(), new CellAdapterFactory());
        e11.add(new Z9.a());
        for (Object obj : e11) {
            if (obj instanceof JsonAdapter.a) {
                aVar.a((JsonAdapter.a) obj);
            } else {
                aVar.b(obj);
            }
        }
        Moshi moshi = new Moshi(aVar);
        Intrinsics.checkNotNullExpressionValue(moshi, "build(...)");
        f20455b = moshi;
    }

    @NotNull
    public static Moshi a() {
        return f20455b;
    }

    public static void b(@NotNull InterfaceC8333c debuggableStorage) {
        Intrinsics.checkNotNullParameter(debuggableStorage, "debuggableStorage");
        f20454a.a(debuggableStorage);
    }
}
