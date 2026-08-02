package El0;

import Sc.s;
import ab.InterfaceC4990a;
import bb.InterfaceC5614a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.VkpnsClientSdk$onInitialize$1", f = "VkpnsClientSdk.kt", l = {126, 127, UserVerificationMethods.USER_VERIFY_PATTERN}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public int f8106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f8107e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.VkpnsClientSdk$onInitialize$1$1", f = "VkpnsClientSdk.kt", l = {132}, m = "invokeSuspend")
    public static final class a extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        public int f8108d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i f8109e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
            this.f8109e = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new a(this.f8109e, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return new a(this.f8109e, dVar).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f8108d;
            if (i11 == 0) {
                s.b(obj);
                i iVar = this.f8109e;
                ((InterfaceC5614a) iVar.f8077c.getValue()).a(new Gl0.a(Boolean.valueOf(androidx.core.app.n.e(iVar.f8075a).a())));
                El0.a aVar2 = (El0.a) iVar.f8084j.getValue();
                this.f8108d = 1;
                if (aVar2.e(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, kotlin.coroutines.d<? super k> dVar) {
        super(2, dVar);
        this.f8107e = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new k(this.f8107e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return new k(this.f8107e, dVar).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (r8.a(r2.f8075a, r1, r7) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r8 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (r8.a(r7) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f8106d;
        i iVar = this.f8107e;
        if (i11 == 0) {
            s.b(obj);
            ((InterfaceC5614a) iVar.f8077c.getValue()).a(new Gl0.c("sdkInfo"));
            Wl0.b bVar = (Wl0.b) iVar.f8081g.getValue();
            if (Pl0.e.f22651b == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            this.f8106d = 1;
        } else if (i11 == 1) {
            s.b(obj);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                ((InterfaceC4990a) iVar.f8078d.getValue()).a(iVar);
                return Unit.f71690a;
            }
            s.b(obj);
            h hVar = (h) iVar.f8085k.getValue();
            a aVar2 = new a(iVar, null);
            this.f8106d = 3;
        }
        this.f8106d = 2;
        Object d11 = ((Zl0.f) iVar.f8079e.getValue()).d(this);
        if (d11 != aVar) {
            d11 = Unit.f71690a;
        }
    }
}
