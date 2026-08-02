package Bi;

import Bi.k;
import Sc.InterfaceC4008j;
import Sc.s;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.C10721f;
import xe.C10727i;
import xe.I;
import xe.M;
import xe.N;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.contract.GalleryLauncher$Companion$register$systemMultipleLauncher$1$1", f = "GalleryLauncher.kt", l = {329}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class q extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f3846d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<Ci.k> f3847e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f3848f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ List<Uri> f3849g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Object f3850h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ I f3851i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<k.a.EnumC0102a> f3852j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<Function1<List<? extends Hi.l>, Unit>> f3853k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<Function1<Hi.g, Unit>> f3854l;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.contract.GalleryLauncher$Companion$register$systemMultipleLauncher$1$1$medias$1", f = "GalleryLauncher.kt", l = {330}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super List<? extends Hi.l>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f3855d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f3856e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<Uri> f3857f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ I f3858g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f3859h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.contract.GalleryLauncher$Companion$register$systemMultipleLauncher$1$1$medias$1$1$1", f = "GalleryLauncher.kt", l = {330}, m = "invokeSuspend")
        /* renamed from: Bi.q$a$a, reason: collision with other inner class name */
        static final class C0103a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Hi.l>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f3860d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Uri f3861e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ I f3862f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Object f3863g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0103a(Uri uri, I i11, InterfaceC4008j<? extends Context> interfaceC4008j, kotlin.coroutines.d<? super C0103a> dVar) {
                super(2, dVar);
                this.f3861e = uri;
                this.f3862f = i11;
                this.f3863g = interfaceC4008j;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0103a(this.f3861e, this.f3862f, this.f3863g, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Hi.l> dVar) {
                return ((C0103a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Type inference failed for: r5v1, types: [Sc.j, java.lang.Object] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f3860d;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return obj;
                }
                s.b(obj);
                Context context = (Context) this.f3863g.getValue();
                this.f3860d = 1;
                Object f7 = C10727i.f(this.f3862f, new l(context, this.f3861e, null), this);
                return f7 == aVar ? aVar : f7;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<Uri> list, I i11, InterfaceC4008j<? extends Context> interfaceC4008j, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f3857f = list;
            this.f3858g = i11;
            this.f3859h = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f3857f, this.f3858g, this.f3859h, dVar);
            aVar.f3856e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super List<? extends Hi.l>> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Type inference failed for: r6v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f3855d;
            if (i11 == 0) {
                s.b(obj);
                M m11 = (M) this.f3856e;
                List<Uri> list = this.f3857f;
                ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C10727i.a(m11, null, null, new C0103a((Uri) it.next(), this.f3858g, this.f3859h, null), 3));
                }
                this.f3855d = 1;
                obj = C10721f.a(arrayList, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return C7714v.I((Iterable) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(kotlin.jvm.internal.M m11, int i11, List list, InterfaceC4008j interfaceC4008j, I i12, kotlin.jvm.internal.M m12, kotlin.jvm.internal.M m13, kotlin.jvm.internal.M m14, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f3847e = m11;
        this.f3848f = i11;
        this.f3849g = list;
        this.f3850h = interfaceC4008j;
        this.f3851i = i12;
        this.f3852j = m12;
        this.f3853k = m13;
        this.f3854l = m14;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        kotlin.jvm.internal.M<Function1<List<? extends Hi.l>, Unit>> m11 = this.f3853k;
        kotlin.jvm.internal.M<Function1<Hi.g, Unit>> m12 = this.f3854l;
        return new q(this.f3847e, this.f3848f, this.f3849g, this.f3850h, this.f3851i, this.f3852j, m11, m12, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((q) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Ci.b d11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f3846d;
        if (i11 == 0) {
            s.b(obj);
            Ci.k kVar = this.f3847e.f71787a;
            int h11 = (kVar == null || (d11 = kVar.d()) == null) ? this.f3848f : d11.h();
            List<Uri> list = this.f3849g;
            Intrinsics.f(list);
            List K02 = C7714v.K0(list, h11);
            ?? r12 = this.f3850h;
            Iterator it = K02.iterator();
            while (it.hasNext()) {
                try {
                    ((Context) r12.getValue()).getContentResolver().takePersistableUriPermission((Uri) it.next(), 1);
                } catch (Exception unused) {
                }
            }
            a aVar2 = new a(K02, this.f3851i, r12, null);
            this.f3846d = 1;
            obj = N.d(aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        k.a.h(this.f3852j, this.f3853k, this.f3854l, new Hi.g((List<? extends Hi.l>) obj, (Hi.i) null));
        return Unit.f71690a;
    }
}
