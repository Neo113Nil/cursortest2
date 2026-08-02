package Zl0;

import Sc.r;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.push.SendPushesResult;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.InterfaceC7913b;
import qb.C9017a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.incoming.MessagesIPCInteractorImpl$onMessagesReceived$1", f = "MessagesIPCInteractorImpl.kt", l = {51, 52}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class o extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public int f36085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f36086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C9017a f36087f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC7913b f36088g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ArrayList f36089h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, C9017a c9017a, InterfaceC7913b interfaceC7913b, ArrayList arrayList, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f36086e = mVar;
        this.f36087f = c9017a;
        this.f36088g = interfaceC7913b;
        this.f36089h = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        InterfaceC7913b interfaceC7913b = this.f36088g;
        ArrayList arrayList = this.f36089h;
        return new o(this.f36086e, this.f36087f, interfaceC7913b, arrayList, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((o) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(1:(1:(8:5|6|7|(1:9)(1:18)|10|11|12|13)(2:19|20))(1:21))(1:27)|22|(1:24)|7|(0)(0)|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        ((Za.d) r4.f36076i.getValue()).error("Messages received result by ipc has failed", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r6 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0031, code lost:
    
        if (r6 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        AidlResult<?> b11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f36085d;
        m mVar = this.f36086e;
        if (i11 == 0) {
            Sc.s.b(obj);
            u uVar = mVar.f36069b;
            this.f36085d = 1;
            a11 = uVar.a(this.f36087f, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                a11 = (SendPushesResult) obj;
                r.Companion companion = Sc.r.INSTANCE;
                b11 = Eb.j.b(a11);
                if (b11.c()) {
                    ((Za.d) mVar.f36076i.getValue()).error("Messages receiving has failed", b11.a());
                } else {
                    ((Za.d) mVar.f36076i.getValue()).info("Messages receiving is successful");
                }
                this.f36088g.g(b11);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
            a11 = ((Sc.r) obj).getF26106a();
        }
        r.Companion companion2 = Sc.r.INSTANCE;
        if (!(a11 instanceof r.b)) {
            this.f36085d = 2;
            obj = m.e(mVar, this.f36089h, this);
        }
        b11 = Eb.j.b(a11);
        if (b11.c()) {
        }
        this.f36088g.g(b11);
        return Unit.f71690a;
    }
}
