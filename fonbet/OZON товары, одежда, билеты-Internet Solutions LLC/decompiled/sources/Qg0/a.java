package Qg0;

import C.o0;
import ed.InterfaceC6346b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23440a;

    private /* synthetic */ a(String str) {
        this.f23440a = str;
    }

    public static final /* synthetic */ a a(String str) {
        return new a(str);
    }

    public final /* synthetic */ String b() {
        return this.f23440a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Intrinsics.d(this.f23440a, ((a) obj).f23440a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23440a.hashCode();
    }

    public final String toString() {
        return o0.c(new StringBuilder("ApplicationId(id="), this.f23440a, ")");
    }
}
