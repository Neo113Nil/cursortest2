package Oe0;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.maps.Style;
import xe.C10727i;
import xe.M;
import xe.Y;

/* loaded from: classes3.dex */
public final class b extends d {

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.placemark.cahce.LibreClusterResourceCache$clearCachedResources$1", f = "LibreClusterResourceCache.kt", l = {28}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f20324d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f20325e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b f20326f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j11, b bVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f20325e = j11;
            this.f20326f = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f20325e, this.f20326f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f20324d;
            if (i11 == 0) {
                s.b(obj);
                this.f20324d = 1;
                if (Y.b(this.f20325e, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            b bVar = this.f20326f;
            b.super.d(0L);
            for (String str : bVar.f().keySet()) {
                Style u11 = bVar.e().u();
                if (u11 != null) {
                    u11.p(str);
                }
            }
            bVar.f().clear();
            return Unit.f71690a;
        }
    }

    @Override // Oe0.d
    public final void d(long j11) {
        C10727i.c(g(), null, null, new a(j11, this, null), 3);
    }

    @Override // Oe0.d
    public final void l(@NotNull String resourceName) {
        Intrinsics.checkNotNullParameter(resourceName, "resourceName");
        super.l(resourceName);
    }
}
