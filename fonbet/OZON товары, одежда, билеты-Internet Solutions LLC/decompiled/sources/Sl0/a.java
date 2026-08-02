package Sl0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class a extends wl0.c {

    /* renamed from: Sl0.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0529a extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0529a() {
            super("Need to allow work in background");
            Intrinsics.checkNotNullParameter("Need to allow work in background", "message");
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f26346a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String message) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
            this.f26346a = true;
        }

        @Override // Sl0.a
        public final boolean a() {
            return this.f26346a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f26347a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull String message) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
            this.f26347a = true;
        }

        @Override // Sl0.a
        public final boolean a() {
            return this.f26347a;
        }
    }

    public boolean a() {
        return false;
    }
}
