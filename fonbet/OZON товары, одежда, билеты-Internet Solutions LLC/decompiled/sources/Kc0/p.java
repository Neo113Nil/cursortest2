package Kc0;

import C2.l0;
import Sc.InterfaceC4008j;
import Sc.r;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.EOFException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.instantAuth.data.CredentialDTO;
import ru.ozon.id.nativeauth.instantAuth.data.api.InstantLoginApi;
import ru.ozon.id.nativeauth.instantAuth.data.api.dto.InstantLoginDisableRequestBody;
import ru.ozon.id.nativeauth.instantAuth.data.api.dto.InstantLoginDisableResponse;
import ru.ozon.id.nativeauth.instantAuth.data.api.dto.InstantLoginEnableRequestBody;
import ru.ozon.id.nativeauth.instantAuth.data.api.dto.InstantLoginRequestBody;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<InstantLoginApi> f15840a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<vc0.c> f15841b;

    /* JADX WARN: Multi-variable type inference failed */
    public p(@NotNull InterfaceC4008j<? extends InstantLoginApi> instantLoginApi, @NotNull InterfaceC4008j<vc0.c> appInfoRepository) {
        Intrinsics.checkNotNullParameter(instantLoginApi, "instantLoginApi");
        Intrinsics.checkNotNullParameter(appInfoRepository, "appInfoRepository");
        this.f15840a = instantLoginApi;
        this.f15841b = appInfoRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull l0 l0Var, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        m mVar;
        int i11;
        String b11;
        String a11;
        p pVar;
        try {
            if (cVar instanceof m) {
                mVar = (m) cVar;
                int i12 = mVar.f15828i;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    mVar.f15828i = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = mVar.f15826g;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = mVar.f15828i;
                    if (i11 != 0) {
                        s.b(obj);
                        r.Companion companion = r.INSTANCE;
                        b11 = l0Var.b();
                        a11 = l0Var.a();
                        vc0.c value = this.f15841b.getValue();
                        mVar.f15823d = this;
                        mVar.f15824e = b11;
                        mVar.f15825f = a11;
                        mVar.f15828i = 1;
                        obj = value.b(mVar);
                        if (obj != aVar) {
                            pVar = this;
                        }
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj);
                            return obj;
                        }
                        a11 = mVar.f15825f;
                        b11 = mVar.f15824e;
                        pVar = mVar.f15823d;
                        s.b(obj);
                    }
                    InstantLoginRequestBody instantLoginRequestBody = new InstantLoginRequestBody(a11, b11, (String) obj, null, 8, null);
                    InstantLoginApi value2 = pVar.f15840a.getValue();
                    mVar.f15823d = null;
                    mVar.f15824e = null;
                    mVar.f15825f = null;
                    mVar.f15828i = 2;
                    Object auth = value2.auth(instantLoginRequestBody, mVar);
                    return auth != aVar ? aVar : auth;
                }
            }
            if (i11 != 0) {
            }
            InstantLoginRequestBody instantLoginRequestBody2 = new InstantLoginRequestBody(a11, b11, (String) obj, null, 8, null);
            InstantLoginApi value22 = pVar.f15840a.getValue();
            mVar.f15823d = null;
            mVar.f15824e = null;
            mVar.f15825f = null;
            mVar.f15828i = 2;
            Object auth2 = value22.auth(instantLoginRequestBody2, mVar);
            if (auth2 != aVar) {
            }
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            s.a(th2);
            return null;
        }
        mVar = new m(this, cVar);
        Object obj2 = mVar.f15826g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = mVar.f15828i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r10 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z11, @NotNull Map map, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        n nVar;
        int i11;
        LinkedHashMap m11;
        InstantLoginApi instantLoginApi;
        try {
            if (cVar instanceof n) {
                nVar = (n) cVar;
                int i12 = nVar.f15833h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    nVar.f15833h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = nVar.f15831f;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = nVar.f15833h;
                    if (i11 != 0) {
                        s.b(obj);
                        InstantLoginApi value = this.f15840a.getValue();
                        m11 = U.m(map, U.i(new Pair("triggeredByUser", String.valueOf(z11))));
                        vc0.c value2 = this.f15841b.getValue();
                        nVar.f15829d = value;
                        nVar.f15830e = m11;
                        nVar.f15833h = 1;
                        Object b11 = value2.b(nVar);
                        if (b11 == aVar) {
                            return aVar;
                        }
                        obj = b11;
                        instantLoginApi = value;
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj);
                            String message = ((InstantLoginDisableResponse) obj).getMessage();
                            if (message != null && !kotlin.text.h.K(message)) {
                                r.Companion companion = r.INSTANCE;
                                return s.a(new RuntimeException(message));
                            }
                            r.Companion companion2 = r.INSTANCE;
                            return Unit.f71690a;
                        }
                        m11 = nVar.f15830e;
                        instantLoginApi = nVar.f15829d;
                        s.b(obj);
                    }
                    InstantLoginDisableRequestBody instantLoginDisableRequestBody = new InstantLoginDisableRequestBody((String) obj);
                    nVar.f15829d = null;
                    nVar.f15830e = null;
                    nVar.f15833h = 2;
                    obj = instantLoginApi.disable(m11, instantLoginDisableRequestBody, nVar);
                }
            }
            if (i11 != 0) {
            }
            InstantLoginDisableRequestBody instantLoginDisableRequestBody2 = new InstantLoginDisableRequestBody((String) obj);
            nVar.f15829d = null;
            nVar.f15830e = null;
            nVar.f15833h = 2;
            obj = instantLoginApi.disable(m11, instantLoginDisableRequestBody2, nVar);
        } catch (EOFException unused) {
            r.Companion companion3 = r.INSTANCE;
            return Unit.f71690a;
        }
        nVar = new n(this, cVar);
        Object obj2 = nVar.f15831f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = nVar.f15833h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (r9 != r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[Catch: Exception -> 0x0085, TryCatch #0 {Exception -> 0x0085, blocks: (B:11:0x0027, B:12:0x0082, B:19:0x003c, B:20:0x005e, B:22:0x006f, B:23:0x0073, B:27:0x0043), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull String str, Map map, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        o oVar;
        int i11;
        p pVar;
        try {
            if (cVar instanceof o) {
                oVar = (o) cVar;
                int i12 = oVar.f15839i;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    oVar.f15839i = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = oVar.f15837g;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = oVar.f15839i;
                    if (i11 != 0) {
                        s.b(obj);
                        vc0.c value = this.f15841b.getValue();
                        oVar.f15834d = this;
                        oVar.f15835e = str;
                        oVar.f15836f = map;
                        oVar.f15839i = 1;
                        obj = value.b(oVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        pVar = this;
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj);
                            return (CredentialDTO) obj;
                        }
                        map = oVar.f15836f;
                        str = oVar.f15835e;
                        pVar = oVar.f15834d;
                        s.b(obj);
                    }
                    InstantLoginEnableRequestBody instantLoginEnableRequestBody = new InstantLoginEnableRequestBody((String) obj, null);
                    InstantLoginApi value2 = pVar.f15840a.getValue();
                    if (map == null) {
                        map = U.c();
                    }
                    oVar.f15834d = null;
                    oVar.f15835e = null;
                    oVar.f15836f = null;
                    oVar.f15839i = 2;
                    obj = value2.enable(str, map, instantLoginEnableRequestBody, oVar);
                }
            }
            if (i11 != 0) {
            }
            InstantLoginEnableRequestBody instantLoginEnableRequestBody2 = new InstantLoginEnableRequestBody((String) obj, null);
            InstantLoginApi value22 = pVar.f15840a.getValue();
            if (map == null) {
            }
            oVar.f15834d = null;
            oVar.f15835e = null;
            oVar.f15836f = null;
            oVar.f15839i = 2;
            obj = value22.enable(str, map, instantLoginEnableRequestBody2, oVar);
        } catch (Exception unused) {
            return null;
        }
        oVar = new o(this, cVar);
        Object obj2 = oVar.f15837g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = oVar.f15839i;
    }
}
