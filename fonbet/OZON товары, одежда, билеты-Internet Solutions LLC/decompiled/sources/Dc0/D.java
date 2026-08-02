package Dc0;

import Ae.x0;
import Fc0.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.fintech.presentation.camera.FintechRecoveryCameraViewModel$updateSelfieDisclaimer$1", f = "FintechRecoveryCameraViewModel.kt", l = {469}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class D extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f6460d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C f6461e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D(C c11, kotlin.coroutines.d<? super D> dVar) {
        super(2, dVar);
        this.f6461e = c11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new D(this.f6461e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((D) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x003d -> B:5:0x0040). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        c.d dVar;
        x0 x0Var2;
        Object value;
        int[] iArr;
        int i11;
        c.d dVar2;
        x0 x0Var3;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i12 = this.f6460d;
        C c11 = this.f6461e;
        if (i12 == 0) {
            Sc.s.b(obj);
            x0Var = c11.f6440s;
            dVar = (c.d) x0Var.getValue();
            dVar.getClass();
            if (c.d.a.f9353a[dVar.ordinal()] == 3) {
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            x0Var2 = c11.f6440s;
            do {
                value = x0Var2.getValue();
                c.d dVar3 = (c.d) value;
                dVar3.getClass();
                iArr = c.d.a.f9353a;
                i11 = iArr[dVar3.ordinal()];
                if (i11 == 1) {
                    dVar2 = c.d.FRAME;
                } else if (i11 == 2) {
                    dVar2 = c.d.CHECK;
                } else {
                    if (i11 != 3) {
                        throw new Sc.o();
                    }
                    dVar2 = c.d.CHECK;
                }
            } while (!x0Var2.b(value, dVar2));
            c11.handleState();
            x0Var3 = c11.f6440s;
            c.d dVar4 = (c.d) x0Var3.getValue();
            dVar4.getClass();
            if (iArr[dVar4.ordinal()] == 3) {
                C.d0(c11);
            }
            x0Var = c11.f6440s;
            dVar = (c.d) x0Var.getValue();
            dVar.getClass();
            if (c.d.a.f9353a[dVar.ordinal()] == 3) {
                return Unit.f71690a;
            }
            this.f6460d = 1;
            if (Y.b(5000L, this) == aVar) {
                return aVar;
            }
            x0Var2 = c11.f6440s;
            do {
                value = x0Var2.getValue();
                c.d dVar32 = (c.d) value;
                dVar32.getClass();
                iArr = c.d.a.f9353a;
                i11 = iArr[dVar32.ordinal()];
                if (i11 == 1) {
                }
            } while (!x0Var2.b(value, dVar2));
            c11.handleState();
            x0Var3 = c11.f6440s;
            c.d dVar42 = (c.d) x0Var3.getValue();
            dVar42.getClass();
            if (iArr[dVar42.ordinal()] == 3) {
            }
            x0Var = c11.f6440s;
            dVar = (c.d) x0Var.getValue();
            dVar.getClass();
            if (c.d.a.f9353a[dVar.ordinal()] == 3) {
            }
        }
    }
}
