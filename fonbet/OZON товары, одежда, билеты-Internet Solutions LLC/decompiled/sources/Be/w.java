package Be;

import Ae.InterfaceC2395h;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import ze.EnumC11113a;

/* loaded from: classes.dex */
public interface w<T> extends InterfaceC2395h<T> {

    public static final class a {
        public static /* synthetic */ InterfaceC2395h a(w wVar, CoroutineContext coroutineContext, int i11, EnumC11113a enumC11113a, int i12) {
            if ((i12 & 1) != 0) {
                coroutineContext = kotlin.coroutines.g.f71771a;
            }
            if ((i12 & 2) != 0) {
                i11 = -3;
            }
            if ((i12 & 4) != 0) {
                enumC11113a = EnumC11113a.SUSPEND;
            }
            return wVar.a(coroutineContext, i11, enumC11113a);
        }
    }

    @NotNull
    InterfaceC2395h<T> a(@NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a);
}
