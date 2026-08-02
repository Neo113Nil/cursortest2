package Yl0;

import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Nl0.n f35178a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Ml0.h f35179b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Nl0.j f35180c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final Za.d f35181d;

    public l(@NotNull Nl0.n registerPushTokenRepository, @NotNull Ml0.h ipcClientRetryComponent, @NotNull Nl0.j ipcClientsRepository) {
        Za.d logger = Pl0.q.f22702a;
        Intrinsics.checkNotNullParameter(registerPushTokenRepository, "registerPushTokenRepository");
        Intrinsics.checkNotNullParameter(ipcClientRetryComponent, "ipcClientRetryComponent");
        Intrinsics.checkNotNullParameter(ipcClientsRepository, "ipcClientsRepository");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f35178a = registerPushTokenRepository;
        this.f35179b = ipcClientRetryComponent;
        this.f35180c = ipcClientsRepository;
        this.f35181d = logger.c("RegisterPushTokenUseCase");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        j jVar;
        int i11;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i12 = jVar.f35173f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                jVar.f35173f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = jVar.f35171d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = jVar.f35173f;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return ((Sc.r) obj).getF26106a();
                }
                s.b(obj);
                k kVar = new k(this, str, null);
                jVar.f35173f = 1;
                Object d11 = this.f35179b.d(kVar, jVar);
                return d11 == aVar ? aVar : d11;
            }
        }
        jVar = new j(this, cVar);
        Object obj2 = jVar.f35171d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = jVar.f35173f;
        if (i11 == 0) {
        }
    }
}
