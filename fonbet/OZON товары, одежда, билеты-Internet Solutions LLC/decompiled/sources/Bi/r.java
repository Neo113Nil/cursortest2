package Bi;

import Bi.k;
import Sc.InterfaceC4008j;
import Sc.s;
import android.content.Context;
import android.net.Uri;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.C10727i;
import xe.I;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.contract.GalleryLauncher$Companion$register$systemSingleLauncher$1$1", f = "GalleryLauncher.kt", l = {314}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class r extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Tc.b f3864d;

    /* renamed from: e, reason: collision with root package name */
    Tc.b f3865e;

    /* renamed from: f, reason: collision with root package name */
    int f3866f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Uri f3867g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ I f3868h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Object f3869i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<k.a.EnumC0102a> f3870j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<Function1<List<? extends Hi.l>, Unit>> f3871k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<Function1<Hi.g, Unit>> f3872l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(Uri uri, I i11, InterfaceC4008j interfaceC4008j, kotlin.jvm.internal.M m11, kotlin.jvm.internal.M m12, kotlin.jvm.internal.M m13, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f3867g = uri;
        this.f3868h = i11;
        this.f3869i = interfaceC4008j;
        this.f3870j = m11;
        this.f3871k = m12;
        this.f3872l = m13;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        kotlin.jvm.internal.M<Function1<List<? extends Hi.l>, Unit>> m11 = this.f3871k;
        kotlin.jvm.internal.M<Function1<Hi.g, Unit>> m12 = this.f3872l;
        return new r(this.f3867g, this.f3868h, this.f3869i, this.f3870j, m11, m12, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((r) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Tc.b B11;
        Tc.b bVar;
        Tc.b bVar2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f3866f;
        if (i11 == 0) {
            s.b(obj);
            B11 = C7714v.B();
            Uri uri = this.f3867g;
            if (uri != null) {
                ?? r42 = this.f3869i;
                try {
                    ((Context) r42.getValue()).getContentResolver().takePersistableUriPermission(uri, 1);
                } catch (Exception unused) {
                }
                Context context = (Context) r42.getValue();
                this.f3864d = B11;
                this.f3865e = B11;
                this.f3866f = 1;
                Object f7 = C10727i.f(this.f3868h, new l(context, uri, null), this);
                if (f7 == aVar) {
                    return aVar;
                }
                bVar = B11;
                obj = f7;
                bVar2 = bVar;
            }
            k.a.h(this.f3870j, this.f3871k, this.f3872l, new Hi.g(C7714v.x(B11), (Hi.i) null));
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bVar = this.f3865e;
        bVar2 = this.f3864d;
        s.b(obj);
        Hi.l lVar = (Hi.l) obj;
        if (lVar != null) {
            bVar.add(lVar);
        }
        B11 = bVar2;
        k.a.h(this.f3870j, this.f3871k, this.f3872l, new Hi.g(C7714v.x(B11), (Hi.i) null));
        return Unit.f71690a;
    }
}
