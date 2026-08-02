package Xc0;

import Ae.C2406m0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.OtpDTO;
import ru.ozon.id.nativeauth.data.models.OtpVO;

/* loaded from: classes3.dex */
public final class l implements InterfaceC2395h<String> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2406m0 f34370a;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f34371a;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.viewModel.OtpViewModel$special$$inlined$mapNotNull$1$2", f = "OtpViewModel.kt", l = {225}, m = "emit")
        /* renamed from: Xc0.l$a$a, reason: collision with other inner class name */
        public static final class C0618a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f34372d;

            /* renamed from: e, reason: collision with root package name */
            int f34373e;

            public C0618a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f34372d = obj;
                this.f34373e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i) {
            this.f34371a = interfaceC2397i;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C0618a c0618a;
            int i11;
            if (dVar instanceof C0618a) {
                c0618a = (C0618a) dVar;
                int i12 = c0618a.f34373e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0618a.f34373e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c0618a.f34372d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0618a.f34373e;
                    if (i11 != 0) {
                        s.b(obj2);
                        OtpDTO.Input input = ((OtpVO) obj).getInput();
                        String focusTrackAction = input != null ? input.getFocusTrackAction() : null;
                        if (focusTrackAction != null) {
                            c0618a.f34373e = 1;
                            if (this.f34371a.emit(focusTrackAction, c0618a) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj2);
                    }
                    return Unit.f71690a;
                }
            }
            c0618a = new C0618a(dVar);
            Object obj22 = c0618a.f34372d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c0618a.f34373e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public l(C2406m0 c2406m0) {
        this.f34370a = c2406m0;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super String> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f34370a.collect(new a(interfaceC2397i), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
