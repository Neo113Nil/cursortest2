package Ld;

import ae.EnumC5003e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final c f16813a = new c(EnumC5003e.BOOLEAN);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final c f16814b = new c(EnumC5003e.CHAR);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final c f16815c = new c(EnumC5003e.BYTE);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final c f16816d = new c(EnumC5003e.SHORT);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final c f16817e = new c(EnumC5003e.INT);

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final c f16818f = new c(EnumC5003e.FLOAT);

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final c f16819g = new c(EnumC5003e.LONG);

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final c f16820h = new c(EnumC5003e.DOUBLE);

    public static final class a extends u {

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private final u f16821i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull u elementType) {
            super(0);
            Intrinsics.checkNotNullParameter(elementType, "elementType");
            this.f16821i = elementType;
        }

        @NotNull
        public final u i() {
            return this.f16821i;
        }
    }

    public static final class b extends u {

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private final String f16822i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String internalName) {
            super(0);
            Intrinsics.checkNotNullParameter(internalName, "internalName");
            this.f16822i = internalName;
        }

        @NotNull
        public final String i() {
            return this.f16822i;
        }
    }

    public static final class c extends u {

        /* renamed from: i, reason: collision with root package name */
        private final EnumC5003e f16823i;

        public c(EnumC5003e enumC5003e) {
            super(0);
            this.f16823i = enumC5003e;
        }

        public final EnumC5003e i() {
            return this.f16823i;
        }
    }

    public /* synthetic */ u(int i11) {
        this();
    }

    @NotNull
    public final String toString() {
        return v.c(this);
    }

    private u() {
    }
}
