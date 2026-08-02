package Ui;

import Ae.C2399j;
import Ae.C2417s0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import Sc.C4005g;
import Ui.C4069c;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import fd.InterfaceC6511n;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.media.view.gallery.GalleryFragment$observeUiState$1", f = "GalleryFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class m extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f27796d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4069c f27797e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.media.view.gallery.GalleryFragment$observeUiState$1$1", f = "GalleryFragment.kt", l = {889}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f27798d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C4069c f27799e;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.media.view.gallery.GalleryFragment$observeUiState$1$1$1", f = "GalleryFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: Ui.m$a$a, reason: collision with other inner class name */
        static final class C0565a extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<Boolean, Boolean, kotlin.coroutines.d<? super Boolean>, Object> {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ boolean f27800d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ boolean f27801e;

            @Override // fd.InterfaceC6511n
            public final Object invoke(Boolean bool, Boolean bool2, kotlin.coroutines.d<? super Boolean> dVar) {
                boolean booleanValue = bool.booleanValue();
                boolean booleanValue2 = bool2.booleanValue();
                C0565a c0565a = new C0565a(3, dVar);
                c0565a.f27800d = booleanValue;
                c0565a.f27801e = booleanValue2;
                return c0565a.invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                return Boolean.valueOf((this.f27800d || this.f27801e) ? false : true);
            }
        }

        static final class b<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4069c f27802a;

            b(C4069c c4069c) {
                this.f27802a = c4069c;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ButtonV3View pickAlbumButton = this.f27802a.a0().f12569e;
                Intrinsics.checkNotNullExpressionValue(pickAlbumButton, "pickAlbumButton");
                pickAlbumButton.setVisibility(booleanValue ? 0 : 8);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C4069c c4069c, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f27799e = c4069c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f27799e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f27798d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C4069c c4069c = this.f27799e;
                InterfaceC2395h o11 = C2399j.o(new C2417s0(c4069c.d0().K0(), c4069c.d0().x0(), new C0565a(3, null)));
                b bVar = new b(c4069c);
                this.f27798d = 1;
                if (o11.collect(bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.media.view.gallery.GalleryFragment$observeUiState$1$2", f = "GalleryFragment.kt", l = {903}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f27803d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C4069c f27804e;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.media.view.gallery.GalleryFragment$observeUiState$1$2$1", f = "GalleryFragment.kt", l = {}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<Set<? extends String>, Hi.j, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Set f27805d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Hi.j f27806e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C4069c f27807f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C4069c c4069c, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f27807f = c4069c;
            }

            @Override // fd.InterfaceC6511n
            public final Object invoke(Set<? extends String> set, Hi.j jVar, kotlin.coroutines.d<? super Unit> dVar) {
                a aVar = new a(this.f27807f, dVar);
                aVar.f27805d = set;
                aVar.f27806e = jVar;
                return aVar.invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                this.f27807f.X(this.f27806e.getTitle(), this.f27805d);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C4069c c4069c, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f27804e = c4069c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f27804e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f27803d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C4069c c4069c = this.f27804e;
                C2417s0 c2417s0 = new C2417s0(c4069c.d0().y0(), c4069c.d0().F0(), new a(c4069c, null));
                this.f27803d = 1;
                if (C2399j.g(c2417s0, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.media.view.gallery.GalleryFragment$observeUiState$1$3", f = "GalleryFragment.kt", l = {907}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f27808d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C4069c f27809e;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4069c f27810a;

            a(C4069c c4069c) {
                this.f27810a = c4069c;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                C4069c.m mVar;
                C4069c.m mVar2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C4069c c4069c = this.f27810a;
                if (booleanValue) {
                    RecyclerView recyclerView = c4069c.a0().f12568d;
                    mVar2 = c4069c.f27747p;
                    recyclerView.removeOnScrollListener(mVar2);
                } else {
                    RecyclerView recyclerView2 = c4069c.a0().f12568d;
                    mVar = c4069c.f27747p;
                    recyclerView2.addOnScrollListener(mVar);
                }
                MaterialCardView selectionControls = c4069c.a0().f12570f;
                Intrinsics.checkNotNullExpressionValue(selectionControls, "selectionControls");
                selectionControls.setVisibility(booleanValue ? 0 : 8);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C4069c c4069c, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f27809e = c4069c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f27809e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f27808d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C4069c c4069c = this.f27809e;
                M0<Boolean> K02 = c4069c.d0().K0();
                a aVar2 = new a(c4069c);
                this.f27808d = 1;
                if (K02.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            throw new C4005g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(C4069c c4069c, kotlin.coroutines.d<? super m> dVar) {
        super(2, dVar);
        this.f27797e = c4069c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        m mVar = new m(this.f27797e, dVar);
        mVar.f27796d = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((m) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        M m11 = (M) this.f27796d;
        C4069c c4069c = this.f27797e;
        C10727i.c(m11, null, null, new a(c4069c, null), 3);
        C10727i.c(m11, null, null, new b(c4069c, null), 3);
        C10727i.c(m11, null, null, new c(c4069c, null), 3);
        return Unit.f71690a;
    }
}
