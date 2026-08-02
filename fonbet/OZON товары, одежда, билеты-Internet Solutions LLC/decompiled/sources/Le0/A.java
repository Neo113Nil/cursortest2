package Le0;

import Ae.C0;
import Ie0.a;
import fd.InterfaceC6511n;
import kotlin.Unit;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreTilesController$1", f = "LibreTilesController.kt", l = {51, 53}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class A extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<Boolean, Boolean, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f16855d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ boolean f16856e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ boolean f16857f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ B f16858g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(B b11, kotlin.coroutines.d<? super A> dVar) {
        super(3, dVar);
        this.f16858g = b11;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(Boolean bool, Boolean bool2, kotlin.coroutines.d<? super Unit> dVar) {
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        A a11 = new A(this.f16858g, dVar);
        a11.f16856e = booleanValue;
        a11.f16857f = booleanValue2;
        return a11.invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r6.emit(r1, r5) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r6.emit(r1, r5) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C0 f7;
        C0 f11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f16855d;
        if (i11 == 0) {
            Sc.s.b(obj);
            boolean z11 = this.f16856e;
            boolean z12 = this.f16857f;
            B b11 = this.f16858g;
            if (z11 && z12) {
                f11 = b11.f();
                a.EnumC0243a enumC0243a = a.EnumC0243a.LOADED;
                this.f16855d = 1;
            } else {
                f7 = b11.f();
                a.EnumC0243a enumC0243a2 = a.EnumC0243a.LOADING;
                this.f16855d = 2;
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
