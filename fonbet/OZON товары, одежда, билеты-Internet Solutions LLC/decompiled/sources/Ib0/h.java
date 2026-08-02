package Ib0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Gb0.c f12153a;

    public static final class a extends h {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Gb0.c logoutType) {
            super(logoutType);
            Intrinsics.checkNotNullParameter(logoutType, "logoutType");
        }
    }

    public static final class b extends h {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull Gb0.c logoutType) {
            super(logoutType);
            Intrinsics.checkNotNullParameter(logoutType, "logoutType");
        }
    }

    public static final class c extends h {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull Gb0.c logoutType) {
            super(logoutType);
            Intrinsics.checkNotNullParameter(logoutType, "logoutType");
        }
    }

    public h(Gb0.c cVar) {
        this.f12153a = cVar;
    }

    @NotNull
    public final Gb0.c a() {
        return this.f12153a;
    }
}
