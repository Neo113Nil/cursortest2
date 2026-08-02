package Jc0;

import Jc0.a;
import Kc0.p;
import Sc.r;
import Sc.s;
import Vb0.b;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.instantAuth.data.CredentialDTO;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.instantAuth.InstantLoginImpl$enable$2", f = "InstantLoginImpl.kt", l = {68, 71, 74}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super a>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f14601d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c f14602e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f14603f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Map<String, String> f14604g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(c cVar, String str, Map map, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f14602e = cVar;
        this.f14603f = str;
        this.f14604g = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f14602e, this.f14603f, this.f14604g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super a> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:7:0x0013, B:12:0x0026, B:13:0x0054, B:15:0x005c, B:17:0x005f, B:21:0x002a, B:22:0x0042, B:25:0x0047, B:29:0x0031), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f A[Catch: Exception -> 0x001c, TRY_LEAVE, TryCatch #0 {Exception -> 0x001c, blocks: (B:7:0x0013, B:12:0x0026, B:13:0x0054, B:15:0x005c, B:17:0x005f, B:21:0x002a, B:22:0x0042, B:25:0x0047, B:29:0x0031), top: B:2:0x000b }] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a.C0271a c0271a = a.C0271a.f14578a;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f14601d;
        c cVar = this.f14602e;
        try {
        } catch (Exception e11) {
            b.a.c(Vb0.b.f28514a, e11);
        }
        if (i11 == 0) {
            s.b(obj);
            p d11 = c.d(cVar);
            String str = this.f14603f;
            Map<String, String> map = this.f14604g;
            this.f14601d = 1;
            obj = d11.c(str, map, this);
            if (obj == aVar) {
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    ((r) obj).getClass();
                    return c0271a;
                }
                s.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return a.b.f14579a;
                }
                p d12 = c.d(cVar);
                this.f14601d = 3;
                return d12.b(false, U.c(), this) == aVar ? aVar : c0271a;
            }
            s.b(obj);
        }
        CredentialDTO credentialDTO = (CredentialDTO) obj;
        if (credentialDTO != null) {
            Kc0.d c11 = c.c(cVar);
            this.f14601d = 2;
            obj = c11.c(credentialDTO, this);
            if (obj == aVar) {
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        }
    }
}
