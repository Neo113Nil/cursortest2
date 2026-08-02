package Ib0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Gb0.d f12154a;

    public static final class a extends i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Gb0.d signInType) {
            super(signInType);
            Intrinsics.checkNotNullParameter(signInType, "signInType");
        }
    }

    public static final class b extends i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull Gb0.d signInType) {
            super(signInType);
            Intrinsics.checkNotNullParameter(signInType, "signInType");
        }
    }

    public static final class c extends i {

        /* renamed from: b, reason: collision with root package name */
        private final String f12155b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull Gb0.d signInType, String str) {
            super(signInType);
            Intrinsics.checkNotNullParameter(signInType, "signInType");
            this.f12155b = str;
        }

        public final String b() {
            return this.f12155b;
        }
    }

    public i(Gb0.d dVar) {
        this.f12154a = dVar;
    }

    @NotNull
    public final Gb0.d a() {
        return this.f12154a;
    }
}
