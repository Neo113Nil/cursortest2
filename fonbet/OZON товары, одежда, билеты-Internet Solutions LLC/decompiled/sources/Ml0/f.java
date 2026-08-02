package Ml0;

import B0.A0;
import Sc.r;
import Sc.s;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tb.InterfaceC9792a;
import ub.AbstractC9996c;

/* loaded from: classes4.dex */
public final class f extends AbstractC9996c<InterfaceC9792a> {

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public final String f18167m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context, @NotNull List<Za.a> preferredHosts, @NotNull Za.d logger) {
        super(logger, context, preferredHosts, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preferredHosts, "preferredHosts");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f18167m = "ArbiterIPCClient";
    }

    public static final ComponentName x(f fVar, String str) {
        fVar.getClass();
        Intent intent = new Intent("com.vk.push.MASTER_SERVICE");
        intent.setPackage(str);
        ResolveInfo resolveService = fVar.q().getPackageManager().resolveService(intent, UserVerificationMethods.USER_VERIFY_PATTERN);
        if (resolveService != null) {
            return new ComponentName(str, resolveService.serviceInfo.name);
        }
        fVar.s().error(A0.b("Unable to resolve service in ", str, " by action com.vk.push.MASTER_SERVICE"), null);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        a aVar;
        int i11;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i12 = aVar.f18161f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f18161f = i12 - LinearLayoutManager.INVALID_OFFSET;
                a aVar2 = aVar;
                Object obj = aVar2.f18159d;
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar2.f18161f;
                if (i11 != 0) {
                    s.b(obj);
                    b bVar = b.f18162b;
                    c cVar2 = c.f18163b;
                    d dVar = d.f18164b;
                    e eVar = new e(this, 0);
                    aVar2.f18161f = 1;
                    obj = t(bVar, "getMaster", cVar2, dVar, eVar, TimeUnit.MINUTES.toMillis(3L), aVar2);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return ((r) obj).getF26106a();
            }
        }
        aVar = new a(this, cVar);
        a aVar22 = aVar;
        Object obj2 = aVar22.f18159d;
        Wc.a aVar32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar22.f18161f;
        if (i11 != 0) {
        }
        return ((r) obj2).getF26106a();
    }

    @Override // ub.AbstractC9996c
    public final InterfaceC9792a o(IBinder service) {
        Intrinsics.checkNotNullParameter(service, "service");
        InterfaceC9792a H11 = InterfaceC9792a.AbstractBinderC2183a.H(service);
        Intrinsics.checkNotNullExpressionValue(H11, "asInterface(service)");
        return H11;
    }

    @Override // ub.AbstractC9996c
    @NotNull
    public final String r() {
        return this.f18167m;
    }
}
