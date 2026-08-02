package Ih0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public interface e {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f12531a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Ih0.a f12532b;

        public a(@NotNull String id2, @NotNull Ih0.a type) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f12531a = id2;
            this.f12532b = type;
        }

        @NotNull
        public final String a() {
            return this.f12531a;
        }

        @NotNull
        public final Ih0.a b() {
            return this.f12532b;
        }
    }
}
