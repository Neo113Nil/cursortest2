package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import r0.C9113N;
import w1.InterfaceC10406a;

/* loaded from: classes.dex */
final class M implements InterfaceC10406a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C9113N f39054a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39055b;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", l = {865}, m = "onPostFling-RZ2iAVY")
    /* loaded from: classes8.dex */
    static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        long f39056d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f39057e;

        /* renamed from: g, reason: collision with root package name */
        int f39059g;

        a(kotlin.coroutines.jvm.internal.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f39057e = obj;
            this.f39059g |= LinearLayoutManager.INVALID_OFFSET;
            return M.this.O(0L, 0L, this);
        }
    }

    public M(@NotNull C9113N c9113n, boolean z11) {
        this.f39054a = c9113n;
        this.f39055b = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // w1.InterfaceC10406a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(long j11, long j12, @NotNull kotlin.coroutines.d<? super Z1.w> dVar) {
        a aVar;
        int i11;
        long j13;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f39059g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f39059g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f39057e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f39059g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (!this.f39055b) {
                        j13 = 0;
                        return Z1.w.a(j13);
                    }
                    aVar.f39056d = j12;
                    aVar.f39059g = 1;
                    obj = this.f39054a.n(j12, aVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j12 = aVar.f39056d;
                    Sc.s.b(obj);
                }
                j13 = Z1.w.e(j12, ((Z1.w) obj).i());
                return Z1.w.a(j13);
            }
        }
        aVar = new a((kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = aVar.f39057e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f39059g;
        if (i11 != 0) {
        }
        j13 = Z1.w.e(j12, ((Z1.w) obj2).i());
        return Z1.w.a(j13);
    }

    public final void a(boolean z11) {
        this.f39055b = z11;
    }

    @Override // w1.InterfaceC10406a
    public final long f0(int i11, long j11, long j12) {
        if (this.f39055b) {
            return this.f39054a.q(j12);
        }
        return 0L;
    }
}
