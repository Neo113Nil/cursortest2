package B1;

import ed.InterfaceC6346b;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: B1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2544m {

    /* renamed from: B1.m$a */
    public interface a {
        boolean a();
    }

    @InterfaceC6346b
    /* renamed from: B1.m$b */
    /* loaded from: classes8.dex */
    public static final class b {
        public static final boolean a(int i11, int i12) {
            return i11 == i12;
        }
    }

    <T> T a(int i11, @NotNull Function1<? super a, ? extends T> function1);
}
