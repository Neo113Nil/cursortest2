package S1;

import S0.A1;
import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final A1<Object> f25668a;

    /* renamed from: b, reason: collision with root package name */
    private final q f25669b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f25670c;

    public q(@NotNull A1<? extends Object> a12, q qVar) {
        this.f25668a = a12;
        this.f25669b = qVar;
        this.f25670c = a12.getValue();
    }

    @NotNull
    public final Typeface a() {
        Object obj = this.f25670c;
        Intrinsics.g(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean b() {
        if (this.f25668a.getValue() != this.f25670c) {
            return true;
        }
        q qVar = this.f25669b;
        return qVar != null && qVar.b();
    }
}
