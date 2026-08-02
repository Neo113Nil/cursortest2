package U00;

import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import sf.InterfaceC9683i;

/* loaded from: classes7.dex */
public interface a {
    <T> T fromBuffer(@NotNull InterfaceC9683i interfaceC9683i, @NotNull Class<T> cls);

    <T> T fromBuffer(@NotNull InterfaceC9683i interfaceC9683i, @NotNull Type type);
}
