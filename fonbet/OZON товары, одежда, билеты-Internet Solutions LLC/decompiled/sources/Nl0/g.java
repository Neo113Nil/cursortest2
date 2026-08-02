package Nl0;

import Ol0.x;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import cb.C5796a;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final x f19636a;

    public g(@NotNull x sdkInfoDataSource, @NotNull Ol0.k clientIdDataSource) {
        Intrinsics.checkNotNullParameter(sdkInfoDataSource, "sdkInfoDataSource");
        Intrinsics.checkNotNullParameter(clientIdDataSource, "clientIdDataSource");
        this.f19636a = sdkInfoDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        f fVar;
        int i11;
        g gVar;
        C5796a c5796a;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i12 = fVar.f19635g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                fVar.f19635g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = fVar.f19633e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = fVar.f19635g;
                if (i11 != 0) {
                    s.b(obj);
                    fVar.f19632d = this;
                    fVar.f19635g = 1;
                    if (aVar == null) {
                        return aVar;
                    }
                    gVar = this;
                    obj = null;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = fVar.f19632d;
                    s.b(obj);
                }
                c5796a = (C5796a) obj;
                LinkedHashMap l11 = U.l(new Pair("sdkVersion", "6.1.0"), new Pair("sdkName", "ru.rustore.sdk:pushclient"), new Pair("sdkType", gVar.f19636a.f20532a));
                if (c5796a != null) {
                    return l11;
                }
                throw null;
            }
        }
        fVar = new f(this, cVar);
        Object obj2 = fVar.f19633e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = fVar.f19635g;
        if (i11 != 0) {
        }
        c5796a = (C5796a) obj2;
        LinkedHashMap l112 = U.l(new Pair("sdkVersion", "6.1.0"), new Pair("sdkName", "ru.rustore.sdk:pushclient"), new Pair("sdkType", gVar.f19636a.f20532a));
        if (c5796a != null) {
        }
    }
}
