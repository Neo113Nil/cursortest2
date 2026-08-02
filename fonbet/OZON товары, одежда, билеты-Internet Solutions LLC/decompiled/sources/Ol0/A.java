package Ol0;

import We.E;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;

/* loaded from: classes4.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final E f20459a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Za.c f20460b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final He.b f20461c;

    public A(E okHttpClient, Za.c hostInfoProvider) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b dispatcher = He.b.f10879b;
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(hostInfoProvider, "hostInfoProvider");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f20459a = okHttpClient;
        this.f20460b = hostInfoProvider;
        this.f20461c = dispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, @NotNull String str2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        y yVar;
        int i11;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i12 = yVar.f20535f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                yVar.f20535f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = yVar.f20533d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = yVar.f20535f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    z zVar = new z(str, str2, this, null);
                    yVar.f20535f = 1;
                    obj = C10727i.f(this.f20461c, zVar, yVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return ((Sc.r) obj).getF26106a();
            }
        }
        yVar = new y(this, cVar);
        Object obj2 = yVar.f20533d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = yVar.f20535f;
        if (i11 != 0) {
        }
        return ((Sc.r) obj2).getF26106a();
    }
}
