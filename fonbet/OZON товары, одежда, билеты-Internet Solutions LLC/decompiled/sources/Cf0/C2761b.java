package Cf0;

import Sc.InterfaceC4008j;
import We.E;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.AbstractC8922e;

/* renamed from: Cf0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2761b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ld0.c f4888a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f4889b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f4890c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f4891d;

    /* renamed from: Cf0.b$a */
    static final class a extends AbstractC7737t implements Function0<C2760a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f4892b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final C2760a invoke() {
            return new C2760a();
        }
    }

    /* renamed from: Cf0.b$b, reason: collision with other inner class name */
    static final class C0117b extends AbstractC7737t implements Function0<C2762c> {
        C0117b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C2762c invoke() {
            return new C2762c(C2761b.this);
        }
    }

    /* renamed from: Cf0.b$c */
    static final class c extends AbstractC7737t implements Function0<C2766g> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f4894b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final C2766g invoke() {
            return new C2766g();
        }
    }

    public C2761b(@NotNull Ld0.c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.f4888a = store;
        this.f4889b = Sc.k.b(a.f4892b);
        this.f4890c = Sc.k.b(new C0117b());
        this.f4891d = Sc.k.b(c.f4894b);
    }

    @NotNull
    public static C2763d c(@NotNull E.a okHttpBuilder, boolean z11) {
        Intrinsics.checkNotNullParameter(okHttpBuilder, "okHttpBuilder");
        return new C2763d(okHttpBuilder, z11);
    }

    @NotNull
    public final AbstractC8922e b() {
        return (AbstractC8922e) this.f4889b.getValue();
    }

    @NotNull
    public final AbstractC8922e d() {
        return (AbstractC8922e) this.f4890c.getValue();
    }

    @NotNull
    public final AbstractC8922e e() {
        return (AbstractC8922e) this.f4891d.getValue();
    }
}
