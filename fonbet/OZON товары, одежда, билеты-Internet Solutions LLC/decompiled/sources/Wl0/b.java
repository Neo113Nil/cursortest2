package Wl0;

import Sc.s;
import Yl0.c;
import Za.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Yl0.a f33897a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final c f33898b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final d f33899c;

    public b(@NotNull Yl0.a checkIsClientSdkModeChangedUseCase, @NotNull c deletePushTokenIfExistsUseCase, @NotNull d logger) {
        Intrinsics.checkNotNullParameter(checkIsClientSdkModeChangedUseCase, "checkIsClientSdkModeChangedUseCase");
        Intrinsics.checkNotNullParameter(deletePushTokenIfExistsUseCase, "deletePushTokenIfExistsUseCase");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f33897a = checkIsClientSdkModeChangedUseCase;
        this.f33898b = deletePushTokenIfExistsUseCase;
        this.f33899c = logger;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r2.f33898b.a(false, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        a aVar;
        Object obj;
        int i11;
        b bVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i12 = aVar.f33896g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f33896g = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = aVar.f33894e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f33896g;
                if (i11 != 0) {
                    s.b(obj);
                    aVar.f33893d = this;
                    aVar.f33896g = 1;
                    obj = this.f33897a.f35145a.f19638a.a(aVar);
                    if (obj != aVar2) {
                        bVar = this;
                    }
                    return aVar2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                bVar = aVar.f33893d;
                s.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    return Unit.f71690a;
                }
                bVar.f33899c.info("client sdk mode changed");
                aVar.f33893d = null;
                aVar.f33896g = 2;
            }
        }
        aVar = new a(this, cVar);
        obj = aVar.f33894e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f33896g;
        if (i11 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
