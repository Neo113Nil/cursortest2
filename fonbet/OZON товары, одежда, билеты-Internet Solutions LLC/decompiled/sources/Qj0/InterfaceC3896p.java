package Qj0;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.ObjectTypes;

/* renamed from: Qj0.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC3896p {

    /* renamed from: Qj0.p$a */
    public static final class a {
    }

    @NotNull
    U beginTrace(@NotNull U u11);

    @NotNull
    U beginTrace(@NotNull String str);

    void endTrace(@NotNull String str, @NotNull Map<String, ? extends Object> map);

    boolean hasTrace(@NotNull String str);

    boolean isSupported(@NotNull String str, @NotNull ObjectTypes objectTypes, @NotNull Map<String, ? extends Object> map);

    U removeTrace(@NotNull String str);
}
