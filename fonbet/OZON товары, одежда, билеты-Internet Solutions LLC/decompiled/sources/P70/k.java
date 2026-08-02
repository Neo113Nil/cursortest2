package P70;

import A30.m;
import B30.f;
import Sc.o;
import Sc.s;
import android.os.Handler;
import androidx.fragment.app.ComponentCallbacksC5392m;
import g30.InterfaceC6618a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.auth.network.dto.AuthCreateBiometricTokenResponseDto;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadViewModel$savePinTokenBiometric$1", f = "PinPadViewModel.kt", l = {764}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    String f21989d;

    /* renamed from: e, reason: collision with root package name */
    int f21990e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f21991f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f21992g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(h hVar, String str, kotlin.coroutines.d<? super k> dVar) {
        super(2, dVar);
        this.f21991f = hVar;
        this.f21992g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new k(this.f21991f, this.f21992g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r3v1, types: [P70.i] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        m mVar;
        String str;
        m mVar2;
        AuthCreateBiometricTokenResponseDto authCreateBiometricTokenResponseDto;
        B30.f fVar;
        m mVar3;
        B30.f fVar2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f21990e;
        String str2 = this.f21992g;
        final h hVar = this.f21991f;
        if (i11 == 0) {
            s.b(obj);
            mVar = hVar.f21954b;
            String p11 = mVar.p();
            try {
                mVar2 = hVar.f21954b;
                this.f21989d = p11;
                this.f21990e = 1;
                Object d11 = mVar2.d(str2, this);
                if (d11 == aVar) {
                    return aVar;
                }
                str = p11;
                obj = d11;
            } catch (Exception unused) {
                str = p11;
                authCreateBiometricTokenResponseDto = null;
                if (str2 != null) {
                }
                return Unit.f71690a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.f21989d;
            try {
                s.b(obj);
            } catch (Exception unused2) {
                authCreateBiometricTokenResponseDto = null;
                if (str2 != null) {
                    fVar = hVar.f21958f;
                    final String i12 = fVar.i(str);
                    mVar3 = hVar.f21954b;
                    final String h11 = mVar3.h(authCreateBiometricTokenResponseDto);
                    fVar2 = hVar.f21958f;
                    ComponentCallbacksC5392m U10 = hVar.f21956d.U();
                    Intrinsics.f(U10);
                    fVar2.e(U10, i12, h11, new Function1() { // from class: P70.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Handler handler;
                            final f.AbstractC0060f abstractC0060f = (f.AbstractC0060f) obj2;
                            final h hVar2 = h.this;
                            handler = hVar2.f21975w;
                            final String str3 = i12;
                            final String str4 = h11;
                            handler.post(new Runnable() { // from class: P70.j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    InterfaceC6618a interfaceC6618a;
                                    InterfaceC6618a interfaceC6618a2;
                                    InterfaceC6618a interfaceC6618a3;
                                    InterfaceC6618a interfaceC6618a4;
                                    boolean z11;
                                    f.AbstractC0060f abstractC0060f2 = f.AbstractC0060f.this;
                                    boolean z12 = abstractC0060f2 instanceof f.AbstractC0060f.c.a;
                                    h hVar3 = hVar2;
                                    String str5 = str3;
                                    String str6 = str4;
                                    if (z12) {
                                        interfaceC6618a4 = hVar3.f21966n;
                                        InterfaceC6618a.C1033a.d(interfaceC6618a4, false, true, null, null, str5, Integer.valueOf(str6.length()), ((f.AbstractC0060f.c.a) abstractC0060f2).a(), 12);
                                        z11 = hVar3.f21971s;
                                        if (z11) {
                                            h.x0(hVar3);
                                            return;
                                        } else {
                                            hVar3.B0();
                                            return;
                                        }
                                    }
                                    if (abstractC0060f2 instanceof f.AbstractC0060f.a) {
                                        interfaceC6618a3 = hVar3.f21966n;
                                        f.AbstractC0060f.a aVar2 = (f.AbstractC0060f.a) abstractC0060f2;
                                        InterfaceC6618a.C1033a.d(interfaceC6618a3, false, false, G.g.c(aVar2.a(), ": ", aVar2.b()), aVar2.c(), str5, Integer.valueOf(str6.length()), null, 64);
                                        hVar3.y0();
                                        hVar3.B0();
                                        return;
                                    }
                                    if (abstractC0060f2 instanceof f.AbstractC0060f.d) {
                                        interfaceC6618a2 = hVar3.f21966n;
                                        InterfaceC6618a.C1033a.d(interfaceC6618a2, true, false, null, null, str5, Integer.valueOf(str6.length()), null, 76);
                                        hVar3.B0();
                                    } else {
                                        if (!(abstractC0060f2 instanceof f.AbstractC0060f.b)) {
                                            throw new o();
                                        }
                                        interfaceC6618a = hVar3.f21966n;
                                        f.AbstractC0060f.b bVar = (f.AbstractC0060f.b) abstractC0060f2;
                                        InterfaceC6618a.C1033a.d(interfaceC6618a, false, false, Nk.a.b("InvalidatedKey: ", bVar.a()), bVar.b(), str5, Integer.valueOf(str6.length()), null, 64);
                                        hVar3.y0();
                                        hVar3.B0();
                                    }
                                }
                            });
                            return Unit.f71690a;
                        }
                    });
                }
                return Unit.f71690a;
            }
        }
        authCreateBiometricTokenResponseDto = (AuthCreateBiometricTokenResponseDto) obj;
        if (str2 != null && str != null && authCreateBiometricTokenResponseDto != null) {
            fVar = hVar.f21958f;
            final String i122 = fVar.i(str);
            mVar3 = hVar.f21954b;
            final String h112 = mVar3.h(authCreateBiometricTokenResponseDto);
            fVar2 = hVar.f21958f;
            ComponentCallbacksC5392m U102 = hVar.f21956d.U();
            Intrinsics.f(U102);
            fVar2.e(U102, i122, h112, new Function1() { // from class: P70.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Handler handler;
                    final f.AbstractC0060f abstractC0060f = (f.AbstractC0060f) obj2;
                    final h hVar2 = h.this;
                    handler = hVar2.f21975w;
                    final String str3 = i122;
                    final String str4 = h112;
                    handler.post(new Runnable() { // from class: P70.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC6618a interfaceC6618a;
                            InterfaceC6618a interfaceC6618a2;
                            InterfaceC6618a interfaceC6618a3;
                            InterfaceC6618a interfaceC6618a4;
                            boolean z11;
                            f.AbstractC0060f abstractC0060f2 = f.AbstractC0060f.this;
                            boolean z12 = abstractC0060f2 instanceof f.AbstractC0060f.c.a;
                            h hVar3 = hVar2;
                            String str5 = str3;
                            String str6 = str4;
                            if (z12) {
                                interfaceC6618a4 = hVar3.f21966n;
                                InterfaceC6618a.C1033a.d(interfaceC6618a4, false, true, null, null, str5, Integer.valueOf(str6.length()), ((f.AbstractC0060f.c.a) abstractC0060f2).a(), 12);
                                z11 = hVar3.f21971s;
                                if (z11) {
                                    h.x0(hVar3);
                                    return;
                                } else {
                                    hVar3.B0();
                                    return;
                                }
                            }
                            if (abstractC0060f2 instanceof f.AbstractC0060f.a) {
                                interfaceC6618a3 = hVar3.f21966n;
                                f.AbstractC0060f.a aVar2 = (f.AbstractC0060f.a) abstractC0060f2;
                                InterfaceC6618a.C1033a.d(interfaceC6618a3, false, false, G.g.c(aVar2.a(), ": ", aVar2.b()), aVar2.c(), str5, Integer.valueOf(str6.length()), null, 64);
                                hVar3.y0();
                                hVar3.B0();
                                return;
                            }
                            if (abstractC0060f2 instanceof f.AbstractC0060f.d) {
                                interfaceC6618a2 = hVar3.f21966n;
                                InterfaceC6618a.C1033a.d(interfaceC6618a2, true, false, null, null, str5, Integer.valueOf(str6.length()), null, 76);
                                hVar3.B0();
                            } else {
                                if (!(abstractC0060f2 instanceof f.AbstractC0060f.b)) {
                                    throw new o();
                                }
                                interfaceC6618a = hVar3.f21966n;
                                f.AbstractC0060f.b bVar = (f.AbstractC0060f.b) abstractC0060f2;
                                InterfaceC6618a.C1033a.d(interfaceC6618a, false, false, Nk.a.b("InvalidatedKey: ", bVar.a()), bVar.b(), str5, Integer.valueOf(str6.length()), null, 64);
                                hVar3.y0();
                                hVar3.B0();
                            }
                        }
                    });
                    return Unit.f71690a;
                }
            });
        }
        return Unit.f71690a;
    }
}
