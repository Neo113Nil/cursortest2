package Ca0;

import C.o0;
import ed.InterfaceC6346b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f4627a;

    private /* synthetic */ a(String str) {
        this.f4627a = str;
    }

    public static final /* synthetic */ a a(String str) {
        return new a(str);
    }

    public final /* synthetic */ String b() {
        return this.f4627a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Intrinsics.d(this.f4627a, ((a) obj).f4627a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4627a.hashCode();
    }

    public final String toString() {
        return o0.c(new StringBuilder("SetEnv(name="), this.f4627a, ")");
    }
}
