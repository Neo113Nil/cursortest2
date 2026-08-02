package I00;

import A00.a;
import java.util.List;
import l20.c;
import m20.InterfaceC8046a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public interface d<S, I extends l20.c> extends InterfaceC8046a<S, I> {
    @NotNull
    List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates();

    I handleUpdate(@NotNull a.J.InterfaceC0007a interfaceC0007a, @NotNull I i11);
}
