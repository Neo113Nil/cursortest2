package androidx.compose.material;

import androidx.recyclerview.widget.LinearLayoutManager;
import k1.C7459e;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import w1.InterfaceC10406a;

/* renamed from: androidx.compose.material.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5224w implements InterfaceC10406a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5210h<?> f40142a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ EnumC9142v f40143b;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "ModalBottomSheet.kt", l = {590}, m = "onPostFling-RZ2iAVY")
    /* renamed from: androidx.compose.material.w$a */
    static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        long f40144d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f40145e;

        /* renamed from: g, reason: collision with root package name */
        int f40147g;

        a(kotlin.coroutines.jvm.internal.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40145e = obj;
            this.f40147g |= LinearLayoutManager.INVALID_OFFSET;
            return C5224w.this.O(0L, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "ModalBottomSheet.kt", l = {581}, m = "onPreFling-QWom1Mo")
    /* renamed from: androidx.compose.material.w$b */
    static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        long f40148d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f40149e;

        /* renamed from: g, reason: collision with root package name */
        int f40151g;

        b(kotlin.coroutines.jvm.internal.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40149e = obj;
            this.f40151g |= LinearLayoutManager.INVALID_OFFSET;
            return C5224w.this.mo11onPreFlingQWom1Mo(0L, this);
        }
    }

    C5224w(C5210h<?> c5210h, EnumC9142v enumC9142v) {
        this.f40142a = c5210h;
        this.f40143b = enumC9142v;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // w1.InterfaceC10406a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(long j11, long j12, @NotNull kotlin.coroutines.d<? super Z1.w> dVar) {
        a aVar;
        int i11;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f40147g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f40147g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f40145e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f40147g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    float c11 = this.f40143b == EnumC9142v.Horizontal ? Z1.w.c(j12) : Z1.w.d(j12);
                    aVar.f40144d = j12;
                    aVar.f40147g = 1;
                    if (this.f40142a.y(c11, aVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j12 = aVar.f40144d;
                    Sc.s.b(obj);
                }
                return Z1.w.a(j12);
            }
        }
        aVar = new a((kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = aVar.f40145e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f40147g;
        if (i11 != 0) {
        }
        return Z1.w.a(j12);
    }

    @Override // w1.InterfaceC10406a
    public final long f0(int i11, long j11, long j12) {
        if (i11 != 1) {
            return 0L;
        }
        EnumC9142v enumC9142v = EnumC9142v.Horizontal;
        EnumC9142v enumC9142v2 = this.f40143b;
        float k11 = this.f40142a.k(enumC9142v2 == enumC9142v ? C7459e.g(j12) : C7459e.h(j12));
        float f7 = enumC9142v2 == enumC9142v ? k11 : 0.0f;
        if (enumC9142v2 != EnumC9142v.Vertical) {
            k11 = 0.0f;
        }
        return P9.a.a(f7, k11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // w1.InterfaceC10406a
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo11onPreFlingQWom1Mo(long j11, @NotNull kotlin.coroutines.d<? super Z1.w> dVar) {
        b bVar;
        int i11;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i12 = bVar.f40151g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f40151g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f40149e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f40151g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    float c11 = this.f40143b == EnumC9142v.Horizontal ? Z1.w.c(j11) : Z1.w.d(j11);
                    C5210h<?> c5210h = this.f40142a;
                    float w11 = c5210h.w();
                    if (c11 >= 0.0f || w11 <= c5210h.l().d()) {
                        j11 = 0;
                    } else {
                        bVar.f40148d = j11;
                        bVar.f40151g = 1;
                        if (c5210h.y(c11, bVar) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j11 = bVar.f40148d;
                    Sc.s.b(obj);
                }
                return Z1.w.a(j11);
            }
        }
        bVar = new b((kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = bVar.f40149e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f40151g;
        if (i11 != 0) {
        }
        return Z1.w.a(j11);
    }

    @Override // w1.InterfaceC10406a
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo12onPreScrollOzD1aCk(long j11, int i11) {
        EnumC9142v enumC9142v = EnumC9142v.Horizontal;
        EnumC9142v enumC9142v2 = this.f40143b;
        float g10 = enumC9142v2 == enumC9142v ? C7459e.g(j11) : C7459e.h(j11);
        if (g10 >= 0.0f || i11 != 1) {
            return 0L;
        }
        float k11 = this.f40142a.k(g10);
        return P9.a.a(enumC9142v2 == enumC9142v ? k11 : 0.0f, enumC9142v2 == EnumC9142v.Vertical ? k11 : 0.0f);
    }
}
