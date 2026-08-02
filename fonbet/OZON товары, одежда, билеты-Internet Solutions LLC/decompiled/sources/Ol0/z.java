package Ol0;

import Sc.r;
import We.A;
import We.G;
import We.InterfaceC4865g;
import We.J;
import We.L;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import yb.C10878a;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.source.VkpnsTopicSourceApi$unsubscribeFromTopic$2", f = "VkpnsTopicSourceApi.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT, RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class z extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Sc.r<? extends Unit>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public L f20536d;

    /* renamed from: e, reason: collision with root package name */
    public int f20537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f20538f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f20539g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A f20540h;

    @kotlin.coroutines.jvm.internal.e(c = "com.vk.push.core.network.utils.CallHandlerKt$handleCall$result$responseData$1", f = "CallHandler.kt", l = {}, m = "invokeSuspend")
    public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super String>, Object> {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ L f20541d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L l11, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f20541d = l11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f20541d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super String> dVar) {
            return new a(this.f20541d, dVar).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String string;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            We.M c11 = this.f20541d.c();
            return (c11 == null || (string = c11.string()) == null) ? "" : string;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(String str, String str2, A a11, kotlin.coroutines.d<? super z> dVar) {
        super(2, dVar);
        this.f20538f = str;
        this.f20539g = str2;
        this.f20540h = a11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new z(this.f20538f, this.f20539g, this.f20540h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Sc.r<? extends Unit>> dVar) {
        return ((z) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a0 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:7:0x000e, B:8:0x0098, B:10:0x00a0, B:14:0x00b4, B:16:0x00ba, B:17:0x00bf, B:20:0x001e, B:21:0x007f, B:26:0x0076), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b4 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:7:0x000e, B:8:0x0098, B:10:0x00a0, B:14:0x00b4, B:16:0x00ba, B:17:0x00bf, B:20:0x001e, B:21:0x007f, B:26:0x0076), top: B:2:0x0006 }] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        L l11;
        String str;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f20537e;
        try {
        } catch (Exception e11) {
            r.Companion companion = Sc.r.INSTANCE;
            a11 = Sc.s.a(e11);
        }
        if (i11 == 0) {
            Sc.s.b(obj);
            String token = this.f20538f;
            Intrinsics.checkNotNullParameter(token, "token");
            String jSONObject = new JSONObject().put("push_token", token).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n           …)\n            .toString()");
            J a12 = Bb.h.a(jSONObject);
            String b11 = V.e.b(new Object[]{this.f20539g}, 1, "v1/topics/%s/unsubscribe", "format(format, *args)");
            A a13 = this.f20540h;
            A.a a14 = Bb.e.a(a13.f20460b);
            a14.c(b11);
            We.A e12 = a14.e();
            G.a aVar2 = new G.a();
            aVar2.j(e12);
            aVar2.g(a12);
            InterfaceC4865g a15 = a13.f20459a.a(aVar2.b());
            this.f20537e = 1;
            obj = Bb.c.a(a15, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l11 = this.f20536d;
                Sc.s.b(obj);
                str = (String) obj;
                if (!Bb.i.a(str)) {
                    yb.b bVar = new yb.b(Bb.i.b(str).toString());
                    r.Companion companion2 = Sc.r.INSTANCE;
                    a11 = Sc.s.a(bVar);
                } else if (l11.v()) {
                    a11 = Unit.f71690a;
                    r.Companion companion3 = Sc.r.INSTANCE;
                } else {
                    C10878a c10878a = new C10878a(l11.w(), l11.m());
                    r.Companion companion4 = Sc.r.INSTANCE;
                    a11 = Sc.s.a(c10878a);
                }
                return Sc.r.a(a11);
            }
            Sc.s.b(obj);
        }
        L l12 = (L) obj;
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b bVar2 = He.b.f10879b;
        a aVar3 = new a(l12, null);
        this.f20536d = l12;
        this.f20537e = 2;
        Object f7 = C10727i.f(bVar2, aVar3, this);
        if (f7 != aVar) {
            l11 = l12;
            obj = f7;
            str = (String) obj;
            if (!Bb.i.a(str)) {
            }
            return Sc.r.a(a11);
        }
        return aVar;
    }
}
