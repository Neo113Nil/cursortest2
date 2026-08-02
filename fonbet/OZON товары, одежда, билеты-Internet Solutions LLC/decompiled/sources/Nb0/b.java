package Nb0;

import Sc.s;
import Vb0.b;
import com.google.protobuf.DescriptorProtos$FileOptions;
import dc0.C6154S;
import dc0.C6178x;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.id.nativeauth.data.models.AuthActionDTO;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import wc0.InterfaceC10500a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.forceSignIn.ForceSignInUseCase$execute$1", f = "ForceSignInUseCase.kt", l = {43, DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 51, 59, 63, 76}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    String f18894d;

    /* renamed from: e, reason: collision with root package name */
    Tc.d f18895e;

    /* renamed from: f, reason: collision with root package name */
    int f18896f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ i f18897g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f18898h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(i iVar, String str, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f18897g = iVar;
        this.f18898h = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new b(this.f18897g, this.f18898h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0149, code lost:
    
        if (Nb0.i.o(r3, r14, r13) == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0066, code lost:
    
        if (Nb0.i.b(r3, r14, r13) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x004d, code lost:
    
        if (r14 == r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1 A[Catch: Exception -> 0x0023, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0023, blocks: (B:10:0x001d, B:15:0x0028, B:16:0x00fa, B:19:0x0031, B:23:0x00b1, B:26:0x00c2, B:28:0x00d0, B:31:0x00db, B:33:0x00e3, B:39:0x0103), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc A[Catch: Exception -> 0x012c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x012c, blocks: (B:21:0x00a9, B:24:0x00bc, B:29:0x00d5, B:37:0x00fd, B:41:0x010b, B:64:0x006c), top: B:63:0x006c }] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Exception exc;
        b bVar;
        a a11;
        C6178x c6178x;
        String str;
        Tc.d u11;
        Tc.d dVar;
        String str2;
        FastEntryActionDTO fastEntryActionDTO;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f18896f;
        i iVar = this.f18897g;
        try {
            try {
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            exc = e12;
            bVar = this;
            b.a.c(Vb0.b.f28514a, exc);
            a11 = i.a(iVar);
            bVar.f18894d = null;
            bVar.f18895e = null;
            bVar.f18896f = 6;
        }
        switch (i11) {
            case 0:
                s.b(obj);
                c6178x = iVar.f18932c;
                this.f18896f = 1;
                obj = c6178x.a(this);
                break;
            case 1:
                s.b(obj);
                if (((C6154S) obj).j()) {
                    a aVar2 = new a(true, null);
                    this.f18896f = 2;
                    break;
                } else {
                    try {
                        String str3 = this.f18898h;
                        iVar.getClass();
                        str = "fastEntryMobile?phone=" + str3 + "&otpId=-1&forcePhoneRegistration=false&isSdk=true";
                        Tc.d builder = new Tc.d();
                        builder.put("otp", "111111");
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        u11 = builder.u();
                        InterfaceC10500a c11 = i.c(iVar);
                        this.f18894d = str;
                        this.f18895e = u11;
                        this.f18896f = 3;
                        obj = InterfaceC10500a.C2252a.a(c11, str, u11, this, 12);
                        if (obj == aVar) {
                        }
                        dVar = u11;
                        str2 = str;
                        fastEntryActionDTO = (FastEntryActionDTO) obj;
                    } catch (Exception e13) {
                        e = e13;
                        bVar = this;
                        exc = e;
                        b.a.c(Vb0.b.f28514a, exc);
                        a11 = i.a(iVar);
                        bVar.f18894d = null;
                        bVar.f18895e = null;
                        bVar.f18896f = 6;
                        break;
                    }
                    if (fastEntryActionDTO.getError() == null) {
                        a11 = i.h(iVar, fastEntryActionDTO.getError());
                    } else {
                        AuthActionDTO.StatusDTO status = fastEntryActionDTO.getStatus();
                        if (status != null ? Intrinsics.d(status.isCompleted(), Boolean.TRUE) : false) {
                            a11 = i.k(iVar, fastEntryActionDTO);
                        } else {
                            AuthActionDTO.StatusDTO status2 = fastEntryActionDTO.getStatus();
                            if ((status2 != null ? status2.getDeeplink() : null) != null) {
                                String deeplink = fastEntryActionDTO.getStatus().getDeeplink();
                                this.f18894d = null;
                                this.f18895e = null;
                                this.f18896f = 4;
                                obj = i.g(iVar, deeplink, "111111", this);
                                if (obj == aVar) {
                                }
                                a11 = (a) obj;
                            } else {
                                AuthActionDTO.StatusDTO status3 = fastEntryActionDTO.getStatus();
                                if ((status3 != null ? status3.getOtpToken() : null) != null) {
                                    i iVar2 = this.f18897g;
                                    String otpToken = fastEntryActionDTO.getStatus().getOtpToken();
                                    this.f18894d = null;
                                    this.f18895e = null;
                                    this.f18896f = 5;
                                    bVar = this;
                                    obj = iVar2.t(otpToken, "111111", str2, dVar, bVar);
                                    if (obj == aVar) {
                                        return aVar;
                                    }
                                    a11 = (a) obj;
                                    bVar.f18894d = null;
                                    bVar.f18895e = null;
                                    bVar.f18896f = 6;
                                } else {
                                    bVar = this;
                                    a11 = i.a(iVar);
                                    bVar.f18894d = null;
                                    bVar.f18895e = null;
                                    bVar.f18896f = 6;
                                }
                            }
                        }
                    }
                    bVar = this;
                    bVar.f18894d = null;
                    bVar.f18895e = null;
                    bVar.f18896f = 6;
                }
                return aVar;
            case 2:
                s.b(obj);
                return Unit.f71690a;
            case 3:
                u11 = this.f18895e;
                str = this.f18894d;
                s.b(obj);
                dVar = u11;
                str2 = str;
                fastEntryActionDTO = (FastEntryActionDTO) obj;
                if (fastEntryActionDTO.getError() == null) {
                }
                bVar = this;
                bVar.f18894d = null;
                bVar.f18895e = null;
                bVar.f18896f = 6;
                break;
            case 4:
                s.b(obj);
                a11 = (a) obj;
                bVar = this;
                bVar.f18894d = null;
                bVar.f18895e = null;
                bVar.f18896f = 6;
                break;
            case 5:
                s.b(obj);
                bVar = this;
                a11 = (a) obj;
                bVar.f18894d = null;
                bVar.f18895e = null;
                bVar.f18896f = 6;
                break;
            case 6:
                s.b(obj);
                return Unit.f71690a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
