package Si;

import Ae.C0;
import Si.InterfaceC4011b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.media.presentation.GalleryViewModel$notifyLimitOfAttachments$1", f = "GalleryViewModel.kt", l = {360, 361}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class m extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f26329d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e f26330e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(e eVar, kotlin.coroutines.d<? super m> dVar) {
        super(2, dVar);
        this.f26330e = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new m(this.f26330e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((m) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (r1.emit(r3, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C0 c02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f26329d;
        e eVar = this.f26330e;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f26329d = 1;
            obj = e.h0(eVar, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        c02 = eVar.f26277k;
        InterfaceC4011b.a aVar2 = new InterfaceC4011b.a(eVar.z0(), (c) obj);
        this.f26329d = 2;
    }
}
