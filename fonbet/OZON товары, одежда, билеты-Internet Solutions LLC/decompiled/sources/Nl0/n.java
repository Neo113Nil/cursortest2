package Nl0;

import Ol0.w;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final w f19646a;

    public n(@NotNull w registerPushTokenDataSource) {
        Intrinsics.checkNotNullParameter(registerPushTokenDataSource, "registerPushTokenDataSource");
        this.f19646a = registerPushTokenDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        m mVar;
        int i11;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i12 = mVar.f19645f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                mVar.f19645f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = mVar.f19643d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = mVar.f19645f;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return ((Sc.r) obj).getF26106a();
                }
                s.b(obj);
                mVar.f19645f = 1;
                Object a11 = this.f19646a.a(str, mVar);
                return a11 == aVar ? aVar : a11;
            }
        }
        mVar = new m(this, cVar);
        Object obj2 = mVar.f19643d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = mVar.f19645f;
        if (i11 == 0) {
        }
    }
}
