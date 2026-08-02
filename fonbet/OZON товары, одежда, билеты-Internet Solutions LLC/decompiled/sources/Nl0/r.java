package Nl0;

import Ol0.A;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import fm0.InterfaceC6586g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final A f19654a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC6586g f19655b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final He.b f19656c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final Za.d f19657d;

    public r(A vkpnsTopicSourceApi, InterfaceC6586g pushStorage, Za.d rootLogger) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b dispatcher = He.b.f10879b;
        Intrinsics.checkNotNullParameter(vkpnsTopicSourceApi, "vkpnsTopicSourceApi");
        Intrinsics.checkNotNullParameter(pushStorage, "pushStorage");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(rootLogger, "rootLogger");
        this.f19654a = vkpnsTopicSourceApi;
        this.f19655b = pushStorage;
        this.f19656c = dispatcher;
        this.f19657d = rootLogger.c("TopicRepo");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        p pVar;
        int i11;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i12 = pVar.f19650f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                pVar.f19650f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = pVar.f19648d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = pVar.f19650f;
                if (i11 != 0) {
                    s.b(obj);
                    q qVar = new q(this, str, null);
                    pVar.f19650f = 1;
                    obj = C10727i.f(this.f19656c, qVar, pVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return ((Sc.r) obj).getF26106a();
            }
        }
        pVar = new p(this, cVar);
        Object obj2 = pVar.f19648d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = pVar.f19650f;
        if (i11 != 0) {
        }
        return ((Sc.r) obj2).getF26106a();
    }
}
