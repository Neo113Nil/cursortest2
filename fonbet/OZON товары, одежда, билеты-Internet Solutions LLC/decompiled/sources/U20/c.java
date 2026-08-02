package U20;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f27322a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f27323b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull String title, @NotNull Function1<? super Context, Unit> onClick) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f27322a = title;
        this.f27323b = (AbstractC7737t) onClick;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1<android.content.Context, kotlin.Unit>, kotlin.jvm.internal.t] */
    @NotNull
    public final Function1<Context, Unit> a() {
        return this.f27323b;
    }

    @NotNull
    public final String b() {
        return this.f27322a;
    }
}
