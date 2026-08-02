package Yl0;

import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import fm0.InterfaceC6586g;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Zl0.f f35187a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC6586g f35188b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Ll0.a f35189c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final Za.d f35190d;

    public n(@NotNull Zl0.f clientDispatcher, @NotNull InterfaceC6586g pushStorage, @NotNull Ll0.a onNewPushTokenListener) {
        Za.d logger = Pl0.q.f22702a;
        Intrinsics.checkNotNullParameter(clientDispatcher, "clientDispatcher");
        Intrinsics.checkNotNullParameter(pushStorage, "pushStorage");
        Intrinsics.checkNotNullParameter(onNewPushTokenListener, "onNewPushTokenListener");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f35187a = clientDispatcher;
        this.f35188b = pushStorage;
        this.f35189c = onNewPushTokenListener;
        this.f35190d = logger.c("SendPushTokenToClientIfNeedUseCase");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        if (r9.d(r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r9.f35187a.b(r10, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        m mVar;
        int i11;
        Object obj;
        String str2;
        n nVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i12 = mVar.f35186h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                mVar.f35186h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = mVar.f35184f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = mVar.f35186h;
                if (i11 != 0) {
                    s.b(obj2);
                    mVar.f35182d = this;
                    mVar.f35183e = str;
                    mVar.f35186h = 1;
                    Object c11 = this.f35188b.c(mVar);
                    if (c11 != aVar) {
                        obj = c11;
                        str2 = str;
                        nVar = this;
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    String str3 = mVar.f35183e;
                    n nVar2 = mVar.f35182d;
                    s.b(obj2);
                    str2 = str3;
                    nVar = nVar2;
                    obj = obj2;
                } else {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj2);
                        return Unit.f71690a;
                    }
                    nVar = mVar.f35182d;
                    s.b(obj2);
                    InterfaceC6586g interfaceC6586g = nVar.f35188b;
                    mVar.f35182d = null;
                    mVar.f35186h = 3;
                }
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.f71690a;
                }
                nVar.f35190d.info("Sending new push token to the client app");
                nVar.f35189c.a(str2);
                mVar.f35182d = nVar;
                mVar.f35183e = null;
                mVar.f35186h = 2;
            }
        }
        mVar = new m(this, cVar);
        Object obj22 = mVar.f35184f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = mVar.f35186h;
        if (i11 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}
