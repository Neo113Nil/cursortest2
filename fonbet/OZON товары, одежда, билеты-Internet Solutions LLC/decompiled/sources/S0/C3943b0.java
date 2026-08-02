package S0;

import Sc.r;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* renamed from: S0.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3943b0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f25340a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private ArrayList f25341b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private ArrayList f25342c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f25343d = true;

    /* renamed from: S0.b0$a */
    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function1<Throwable, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C10737n f25345c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C10737n c10737n) {
            super(1);
            this.f25345c = c10737n;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            Object obj = C3943b0.this.f25340a;
            C3943b0 c3943b0 = C3943b0.this;
            C10737n c10737n = this.f25345c;
            synchronized (obj) {
                ((ArrayList) c3943b0.f25341b).remove(c10737n);
            }
            return Unit.f71690a;
        }
    }

    public final Object c(@NotNull kotlin.coroutines.d<? super Unit> frame) {
        boolean z11;
        synchronized (this.f25340a) {
            z11 = this.f25343d;
        }
        if (z11) {
            return Unit.f71690a;
        }
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        synchronized (this.f25340a) {
            this.f25341b.add(c10737n);
        }
        c10737n.q(new a(c10737n));
        Object n11 = c10737n.n();
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (n11 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11 == aVar ? n11 : Unit.f71690a;
    }

    public final void d() {
        synchronized (this.f25340a) {
            this.f25343d = false;
            Unit unit = Unit.f71690a;
        }
    }

    public final void e() {
        boolean z11;
        synchronized (this.f25340a) {
            try {
                synchronized (this.f25340a) {
                    z11 = this.f25343d;
                }
                if (z11) {
                    return;
                }
                ArrayList arrayList = this.f25341b;
                this.f25341b = this.f25342c;
                this.f25342c = arrayList;
                this.f25343d = true;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    kotlin.coroutines.d dVar = (kotlin.coroutines.d) arrayList.get(i11);
                    r.Companion companion = Sc.r.INSTANCE;
                    dVar.resumeWith(Unit.f71690a);
                }
                arrayList.clear();
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
