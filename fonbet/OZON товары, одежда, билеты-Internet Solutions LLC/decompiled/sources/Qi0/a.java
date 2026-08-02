package Qi0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<c> f23478a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e f23479b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull List<? extends c> inputs, @NotNull e button) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f23478a = inputs;
        this.f23479b = button;
    }

    public static a a(a aVar, ArrayList inputs) {
        e button = aVar.f23479b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(button, "button");
        return new a(inputs, button);
    }

    @NotNull
    public final e b() {
        return this.f23479b;
    }

    @NotNull
    public final List<c> c() {
        return this.f23478a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f23478a, aVar.f23478a) && Intrinsics.d(this.f23479b, aVar.f23479b);
    }

    public final int hashCode() {
        return this.f23479b.hashCode() + (this.f23478a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "EventInputVO(inputs=" + this.f23478a + ", button=" + this.f23479b + ")";
    }
}
