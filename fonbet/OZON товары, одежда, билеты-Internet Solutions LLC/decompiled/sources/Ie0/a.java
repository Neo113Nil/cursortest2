package Ie0;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import De.C2862e;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;

/* loaded from: classes3.dex */
public abstract class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2862e f12316a = N.a(CoroutineContext.Element.a.d(C10720e0.a().w(1), (H0) X0.b()));

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C0 f12317b = E0.b(0, 0, null, 7);

    /* renamed from: c, reason: collision with root package name */
    private long f12318c = 10000;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C0 f12319d = E0.b(0, 0, null, 7);

    /* renamed from: e, reason: collision with root package name */
    private B0 f12320e;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Ie0.a$a, reason: collision with other inner class name */
    public static final class EnumC0243a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC0243a[] $VALUES;
        public static final EnumC0243a LOADED;
        public static final EnumC0243a LOADING;

        static {
            EnumC0243a enumC0243a = new EnumC0243a("LOADING", 0);
            LOADING = enumC0243a;
            EnumC0243a enumC0243a2 = new EnumC0243a("LOADED", 1);
            LOADED = enumC0243a2;
            EnumC0243a[] enumC0243aArr = {enumC0243a, enumC0243a2};
            $VALUES = enumC0243aArr;
            $ENTRIES = Xc.b.a(enumC0243aArr);
        }

        private EnumC0243a() {
            throw null;
        }

        public static EnumC0243a valueOf(String str) {
            return (EnumC0243a) Enum.valueOf(EnumC0243a.class, str);
        }

        public static EnumC0243a[] values() {
            return (EnumC0243a[]) $VALUES.clone();
        }
    }

    @e(c = "ru.ozon.mapsdk.common.tilescontroller.BaseTilesController$updateLoadState$1", f = "BaseTilesController.kt", l = {67}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f12321d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC0243a f12323f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EnumC0243a enumC0243a, d<? super b> dVar) {
            super(2, dVar);
            this.f12323f = enumC0243a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return a.this.new b(this.f12323f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f12321d;
            if (i11 == 0) {
                s.b(obj);
                C0 f7 = a.this.f();
                this.f12321d = 1;
                if (f7.emit(this.f12323f, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @NotNull
    public final C2862e d() {
        return this.f12316a;
    }

    public final long e() {
        return this.f12318c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final C0 f() {
        return this.f12319d;
    }

    public void g() {
        B0 b02 = this.f12320e;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f12320e = null;
    }

    @Override // Ie0.c
    @NotNull
    public final InterfaceC2395h<Boolean> getTilesLoadingFlow() {
        if (this.f12320e == null) {
            this.f12320e = C10727i.c(this.f12316a, C10720e0.a(), null, new Ie0.b(this, null), 2);
        }
        return C2399j.a(this.f12317b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(@NotNull EnumC0243a tilesLoadState) {
        Intrinsics.checkNotNullParameter(tilesLoadState, "tilesLoadState");
        C10727i.c(this.f12316a, null, null, new b(tilesLoadState, null), 3);
    }
}
