package Mf0;

import Ae.x0;
import Mf0.N;
import We.C4869k;
import We.G;
import We.InterfaceC4865g;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.network.internal.debugMenu.data.RetrofitTestApi;
import uf0.InterfaceC10056a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.main.ONDebugMenuViewModel$executeRequest$1", f = "ONDebugMenuViewModel.kt", l = {101, 107, 139, 153}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Q extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f17994d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ O f17995e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f17996f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f17997g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f17998h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ String f17999i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f18000j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q(O o11, boolean z11, boolean z12, boolean z13, String str, int i11, kotlin.coroutines.d<? super Q> dVar) {
        super(2, dVar);
        this.f17995e = o11;
        this.f17996f = z11;
        this.f17997g = z12;
        this.f17998h = z13;
        this.f17999i = str;
        this.f18000j = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new Q(this.f17995e, this.f17996f, this.f17997g, this.f17998h, this.f17999i, this.f18000j, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((Q) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0124, code lost:
    
        if (r3.emit(r0, r18) == r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0059, code lost:
    
        if (r9.emit(r0, r18) == r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0155, code lost:
    
        if (r3.emit(r0, r18) != r2) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00df A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:14:0x0024, B:15:0x002c, B:17:0x007d, B:18:0x00b6, B:20:0x00df, B:21:0x00e6, B:23:0x00ec, B:25:0x00f2, B:26:0x00f6, B:31:0x005d, B:34:0x0067, B:37:0x0084, B:39:0x00b3), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ec A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:14:0x0024, B:15:0x002c, B:17:0x007d, B:18:0x00b6, B:20:0x00df, B:21:0x00e6, B:23:0x00ec, B:25:0x00f2, B:26:0x00f6, B:31:0x005d, B:34:0x0067, B:37:0x0084, B:39:0x00b3), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        We.L execute;
        Object executeGetHttpRequest;
        We.y p11;
        C4869k a11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f17994d;
        String str = null;
        O o11 = this.f17995e;
        try {
        } catch (Exception e11) {
            N a12 = N.a((N) o11.f17984e.getValue(), new N.a.C0349a(e11.getMessage(), false, null, null, null, null, null), null, null, null, 14);
            x0 x0Var = o11.f17984e;
            this.f17994d = 4;
        }
        if (i11 == 0) {
            Sc.s.b(obj);
            N a13 = N.a((N) o11.f17984e.getValue(), N.a.c.f17979a, null, null, null, 14);
            x0 x0Var2 = o11.f17984e;
            this.f17994d = 1;
        } else if (i11 == 1) {
            Sc.s.b(obj);
        } else {
            if (i11 != 2) {
                if (i11 == 3) {
                    Sc.s.b(obj);
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            }
            Sc.s.b(obj);
            executeGetHttpRequest = obj;
            execute = ((InterfaceC10056a) executeGetHttpRequest).a();
            N n11 = (N) o11.f17984e.getValue();
            String valueOf = String.valueOf(execute.m());
            String name = execute.B().name();
            uf0.b bVar = (uf0.b) execute.L().i(uf0.b.class);
            String bVar2 = bVar != null ? bVar.toString() : null;
            p11 = execute.p();
            if (p11 != null && (a11 = p11.a()) != null) {
                str = a11.toString();
            }
            N a14 = N.a(n11, new N.a.C0349a(valueOf, true, name, str, bVar2, execute.L().e().toString(), execute.r().toString()), null, null, null, 14);
            x0 x0Var3 = o11.f17984e;
            this.f17994d = 3;
        }
        boolean z11 = this.f17996f;
        String str2 = this.f17999i;
        boolean z12 = this.f17998h;
        boolean z13 = this.f17997g;
        if (z11) {
            RetrofitTestApi retrofitTestApi = (RetrofitTestApi) O.g0(o11, z13, z12).create(RetrofitTestApi.class);
            this.f17994d = 2;
            executeGetHttpRequest = retrofitTestApi.executeGetHttpRequest(str2, this);
            if (executeGetHttpRequest == aVar) {
                return aVar;
            }
            execute = ((InterfaceC10056a) executeGetHttpRequest).a();
            N n112 = (N) o11.f17984e.getValue();
            String valueOf2 = String.valueOf(execute.m());
            String name2 = execute.B().name();
            uf0.b bVar3 = (uf0.b) execute.L().i(uf0.b.class);
            if (bVar3 != null) {
            }
            p11 = execute.p();
            if (p11 != null) {
                str = a11.toString();
            }
            N a142 = N.a(n112, new N.a.C0349a(valueOf2, true, name2, str, bVar2, execute.L().e().toString(), execute.r().toString()), null, null, null, 14);
            x0 x0Var32 = o11.f17984e;
            this.f17994d = 3;
        } else {
            We.E d02 = O.d0(o11, z13, z12);
            G.a aVar2 = new G.a();
            aVar2.k(str2);
            aVar2.f(null, "GET");
            InterfaceC4865g a15 = d02.a(aVar2.b());
            a15.timeout().g(this.f18000j, TimeUnit.SECONDS);
            execute = a15.execute();
            We.M c11 = execute.c();
            if (c11 != null) {
                c11.bytes();
            }
            N n1122 = (N) o11.f17984e.getValue();
            String valueOf22 = String.valueOf(execute.m());
            String name22 = execute.B().name();
            uf0.b bVar32 = (uf0.b) execute.L().i(uf0.b.class);
            if (bVar32 != null) {
            }
            p11 = execute.p();
            if (p11 != null) {
            }
            N a1422 = N.a(n1122, new N.a.C0349a(valueOf22, true, name22, str, bVar2, execute.L().e().toString(), execute.r().toString()), null, null, null, 14);
            x0 x0Var322 = o11.f17984e;
            this.f17994d = 3;
        }
    }
}
