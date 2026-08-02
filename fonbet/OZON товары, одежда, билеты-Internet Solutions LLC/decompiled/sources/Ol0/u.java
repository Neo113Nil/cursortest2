package Ol0;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f20525a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Hl0.a f20526b;

    /* loaded from: classes4.dex */
    public static final class a extends Xl0.a {
        public a(@NotNull Application context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    public u(@NotNull Application context, @NotNull Hl0.a logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f20525a = context;
        this.f20526b = logger;
    }
}
