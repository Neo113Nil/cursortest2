package O0;

import D1.C2820u;
import androidx.collection.L;
import androidx.compose.material.ripple.RippleNode;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import l1.C7807Z;
import l1.InterfaceC7813c0;
import n1.InterfaceC8410c;
import org.jetbrains.annotations.NotNull;
import t0.s;
import xe.C10727i;
import xe.M;

/* loaded from: classes8.dex */
public final class d extends RippleNode {

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final L<s.b, m> f19744j;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.ripple.CommonRippleNode$addRipple$2", f = "CommonRipple.kt", l = {88}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f19745d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m f19746e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f19747f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ s.b f19748g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, d dVar, s.b bVar, kotlin.coroutines.d<? super a> dVar2) {
            super(2, dVar2);
            this.f19746e = mVar;
            this.f19747f = dVar;
            this.f19748g = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f19746e, this.f19747f, this.f19748g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f19745d;
            s.b bVar = this.f19748g;
            d dVar = this.f19747f;
            try {
                if (i11 == 0) {
                    Sc.s.b(obj);
                    m mVar = this.f19746e;
                    this.f19745d = 1;
                    if (mVar.d(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                dVar.f19744j.g(bVar);
                C2820u.a(dVar);
                return Unit.f71690a;
            } catch (Throwable th2) {
                dVar.f19744j.g(bVar);
                C2820u.a(dVar);
                throw th2;
            }
        }
    }

    public d(t0.o oVar, boolean z11, float f7, InterfaceC7813c0 interfaceC7813c0, Function0 function0) {
        super(oVar, z11, f7, interfaceC7813c0, function0);
        this.f19744j = new L<>((Object) null);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public final void N1(@NotNull s.b bVar, long j11, float f7) {
        L<s.b, m> l11 = this.f19744j;
        Object[] objArr = l11.f38657b;
        Object[] objArr2 = l11.f38658c;
        long[] jArr = l11.f38656a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j12 = jArr[i11];
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j12) < 128) {
                            int i14 = (i11 << 3) + i13;
                            ((m) objArr2[i14]).f();
                        }
                        j12 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        m mVar = new m(getF40094b() ? C7459e.a(bVar.a()) : null, f7, getF40094b());
        l11.i(bVar, mVar);
        C10727i.c(getCoroutineScope(), null, null, new a(mVar, this, bVar, null), 3);
        C2820u.a(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public final void O1(@NotNull InterfaceC8410c interfaceC8410c) {
        float d11 = Q1().invoke().d();
        if (d11 == 0.0f) {
            return;
        }
        L<s.b, m> l11 = this.f19744j;
        Object[] objArr = l11.f38657b;
        Object[] objArr2 = l11.f38658c;
        long[] jArr = l11.f38656a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        ((m) objArr2[i14]).e(interfaceC8410c, C7807Z.o(d11, R1()));
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public final void U1(@NotNull s.b bVar) {
        m b11 = this.f19744j.b(bVar);
        if (b11 != null) {
            b11.f();
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        this.f19744j.c();
    }
}
