package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import spay.seamlessAuth.core.data.network.dto.ExchangeTokenResponseDto;
import spay.seamlessAuth.core.data.network.request.ExchangeTokenRequest;

/* renamed from: Ve.jn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4365jn {

    /* renamed from: a, reason: collision with root package name */
    public final Cj f31388a;

    public C4365jn(Cj appTokenApi) {
        Intrinsics.checkNotNullParameter(appTokenApi, "appTokenApi");
        this.f31388a = appTokenApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C4393km c4393km, String str, String str2, kotlin.coroutines.jvm.internal.c cVar) {
        Jm jm2;
        int i11;
        AbstractC4486o abstractC4486o;
        if (cVar instanceof Jm) {
            jm2 = (Jm) cVar;
            int i12 = jm2.f29307f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                jm2.f29307f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = jm2.f29305d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = jm2.f29307f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    ExchangeTokenRequest exchangeTokenRequest = new ExchangeTokenRequest(c4393km.f31454a, str, str2, null, null, null, 56, null);
                    jm2.f29307f = 1;
                    obj = ((Il) this.f31388a).a(exchangeTokenRequest, jm2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                abstractC4486o = (AbstractC4486o) obj;
                if (!(abstractC4486o instanceof C4353jb)) {
                    return ((ExchangeTokenResponseDto) ((C4353jb) abstractC4486o).f31354a).toModel();
                }
                if (abstractC4486o instanceof C4347j5) {
                    return null;
                }
                throw new Sc.o();
            }
        }
        jm2 = new Jm(this, cVar);
        Object obj2 = jm2.f29305d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = jm2.f29307f;
        if (i11 != 0) {
        }
        abstractC4486o = (AbstractC4486o) obj2;
        if (!(abstractC4486o instanceof C4353jb)) {
        }
    }
}
