package Zc0;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.C2406m0;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Bc0.a;
import De.C2862e;
import I1.w;
import Sc.InterfaceC4008j;
import Zc0.a;
import androidx.lifecycle.C5418g0;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import h3.C6788a;
import java.util.List;
import java.util.Map;
import jc0.C7340c;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import ru.ozon.id.nativeauth.data.models.OtpDTO;
import ru.ozon.id.nativeauth.pageAgreementWithConditions.data.PageAgreementWithConditionsDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import wc0.InterfaceC10500a;
import xc0.C10702a;
import xe.C10720e0;
import xe.C10727i;
import xe.J;
import xe.M;
import xe.N;

/* loaded from: classes3.dex */
public final class q extends w0 {

    /* renamed from: t, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f35855t = {w.c(q.class, "agreementsViewState", "getAgreementsViewState()Lru/ozon/id/nativeauth/otp/agreements/AgreementsViewState;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f35856a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10702a> f35857b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C5418g0 f35858c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Sc0.a> f35859d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<M, C7340c> f35860e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f35861f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f35862g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C2862e f35863h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final x0<PageAgreementWithConditionsDTO> f35864i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C2406m0 f35865j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final s f35866k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f35867l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final M0<Rc0.t> f35868m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final Be.n f35869n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final td0.m f35870o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final C2406m0 f35871p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final C0 f35872q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final B0<Zc0.a> f35873r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f35874s;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageAgreementWithConditions.presentation.PageAgreementWithConditionsViewModel$load$1", f = "PageAgreementWithConditionsViewModel.kt", l = {155}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f35875d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f35877f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f35877f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return q.this.new a(this.f35877f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f35875d;
            q qVar = q.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                C10702a c10702a = (C10702a) qVar.f35857b.getValue();
                this.f35875d = 1;
                obj = c10702a.r(this.f35877f, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            q.m0(qVar, (PageAgreementWithConditionsDTO) obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageAgreementWithConditions.presentation.PageAgreementWithConditionsViewModel$onCompleteButtonClicked$1", f = "PageAgreementWithConditionsViewModel.kt", l = {121}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f35878d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return q.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            PageAgreementWithConditionsDTO.Notification notification;
            String title;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f35878d;
            if (i11 == 0) {
                Sc.s.b(obj);
                q qVar = q.this;
                PageAgreementWithConditionsDTO i02 = q.i0(qVar);
                if (i02 == null || (notification = i02.getNotification()) == null || (title = notification.getTitle()) == null) {
                    return Unit.f71690a;
                }
                C0 c02 = qVar.f35872q;
                a.C0677a c0677a = new a.C0677a(new NotificationDTO(title, null, null, null, null, null, null, null, null, NotificationDTO.Preset.WARNING, 478, null));
                this.f35878d = 1;
                if (c02.emit(c0677a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageAgreementWithConditions.presentation.PageAgreementWithConditionsViewModel$onCompleteButtonClicked$2", f = "PageAgreementWithConditionsViewModel.kt", l = {UserVerificationMethods.USER_VERIFY_PATTERN}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f35880d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return q.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f35880d;
            if (i11 == 0) {
                Sc.s.b(obj);
                q qVar = q.this;
                qVar.t0().p();
                this.f35880d = 1;
                if (q.n0(qVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public q(@NotNull String screenId, @NotNull InterfaceC4008j authRepository, @NotNull InterfaceC4008j mainScreenContainer, @NotNull InterfaceC4008j authRouter, @NotNull C5418g0 savedStateHandle, @NotNull InterfaceC4008j otpDataRequestDataSource, @NotNull Function1 provideFastEntryActionHandler, @NotNull a.n fullScreenExceptionHandler) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(authRepository, "authRepository");
        Intrinsics.checkNotNullParameter(mainScreenContainer, "mainScreenContainer");
        Intrinsics.checkNotNullParameter(authRouter, "authRouter");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(otpDataRequestDataSource, "otpDataRequestDataSource");
        Intrinsics.checkNotNullParameter(provideFastEntryActionHandler, "provideFastEntryActionHandler");
        Intrinsics.checkNotNullParameter(fullScreenExceptionHandler, "fullScreenExceptionHandler");
        this.f35856a = screenId;
        this.f35857b = authRepository;
        this.f35858c = savedStateHandle;
        this.f35859d = otpDataRequestDataSource;
        this.f35860e = provideFastEntryActionHandler;
        this.f35861f = mainScreenContainer;
        this.f35862g = authRouter;
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f35863h = N.g(N.g(a11, He.b.f10879b), fullScreenExceptionHandler);
        x0<PageAgreementWithConditionsDTO> a12 = O0.a(null);
        this.f35864i = a12;
        this.f35865j = new C2406m0(a12);
        this.f35866k = new s(J.f105405n0, this);
        InterfaceC4008j b11 = Sc.k.b(new p(this));
        this.f35867l = b11;
        M0<Rc0.t> d11 = savedStateHandle.d("agreements_view_state");
        this.f35868m = d11;
        this.f35869n = C2399j.F(E0.b(0, 0, null, 7), new t(((C7340c) b11.getValue()).g(), Yc0.a.f34893a));
        this.f35870o = td0.n.a(savedStateHandle, "agreements_view_state");
        this.f35871p = new C2406m0(d11);
        C0 b12 = E0.b(0, 0, null, 7);
        this.f35872q = b12;
        this.f35873r = C2399j.a(b12);
        r rVar = new r(this);
        this.f35874s = rVar;
        ((Nc0.f) mainScreenContainer.getValue()).b(rVar);
        v0();
    }

    public static final Pc0.c e0(q qVar) {
        return (Pc0.c) qVar.f35862g.getValue();
    }

    public static final PageAgreementWithConditionsDTO i0(q qVar) {
        return qVar.f35864i.getValue();
    }

    public static final void k0(q qVar) {
        qVar.t0().y(null);
    }

    public static final void m0(q qVar, PageAgreementWithConditionsDTO pageAgreementWithConditionsDTO) {
        qVar.getClass();
        OtpDTO.AgreementSheet agreementBlock = pageAgreementWithConditionsDTO.getAgreementBlock();
        OtpDTO.Agreement termsOfUse = agreementBlock.getTermsOfUse();
        Boolean valueOf = termsOfUse != null ? Boolean.valueOf(termsOfUse.isCheckboxConfirmed()) : null;
        OtpDTO.Agreement isAdsAllowed = agreementBlock.isAdsAllowed();
        Rc0.t p02 = p0(agreementBlock, valueOf, isAdsAllowed != null ? Boolean.valueOf(isAdsAllowed.isCheckboxConfirmed()) : null);
        qVar.f35858c.g(pageAgreementWithConditionsDTO, "view_state_saved_state_key");
        td0.f.b(qVar.f35863h, null, new o(qVar, null));
        qVar.f35864i.tryEmit(pageAgreementWithConditionsDTO);
        qVar.t0().j();
        qVar.f35870o.setValue(qVar, f35855t[0], p02);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n0(q qVar, kotlin.coroutines.jvm.internal.c cVar) {
        u uVar;
        int i11;
        FastEntryActionDTO.ErrorDTO error;
        FastEntryActionDTO.ErrorDTO.FieldDTO fieldDTO;
        qVar.getClass();
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i12 = uVar.f35893g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                uVar.f35893g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = uVar.f35891e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = uVar.f35893g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    PageAgreementWithConditionsDTO value = qVar.f35864i.getValue();
                    if (value == null) {
                        return Unit.f71690a;
                    }
                    Map<String, Object> b11 = qVar.f35859d.getValue().b();
                    C10702a value2 = qVar.f35857b.getValue();
                    String action = value.getAction();
                    uVar.f35890d = qVar;
                    uVar.f35893g = 1;
                    obj = InterfaceC10500a.C2252a.a(value2, action, b11, uVar, 4);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = uVar.f35890d;
                    Sc.s.b(obj);
                }
                FastEntryActionDTO fastEntryActionDTO = (FastEntryActionDTO) obj;
                qVar.getClass();
                error = fastEntryActionDTO.getError();
                if (error == null) {
                    String message = error.getMessage();
                    if (message == null) {
                        List<FastEntryActionDTO.ErrorDTO.FieldDTO> fields = error.getFields();
                        message = (fields == null || (fieldDTO = (FastEntryActionDTO.ErrorDTO.FieldDTO) C7714v.M(fields)) == null) ? null : fieldDTO.getMessage();
                    }
                    qVar.t0().y(message);
                    qVar.t0().hideLoader();
                } else {
                    qVar.f35859d.getValue().a();
                    ((C7340c) qVar.f35867l.getValue()).h(fastEntryActionDTO);
                }
                return Unit.f71690a;
            }
        }
        uVar = new u(qVar, cVar);
        Object obj2 = uVar.f35891e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = uVar.f35893g;
        if (i11 != 0) {
        }
        FastEntryActionDTO fastEntryActionDTO2 = (FastEntryActionDTO) obj2;
        qVar.getClass();
        error = fastEntryActionDTO2.getError();
        if (error == null) {
        }
        return Unit.f71690a;
    }

    private static Rc0.t p0(OtpDTO.AgreementSheet agreementSheet, Boolean bool, Boolean bool2) {
        OtpDTO.Agreement termsOfUse = agreementSheet.getTermsOfUse();
        Boolean bool3 = Boolean.FALSE;
        boolean z11 = Intrinsics.d(bool, bool3) && termsOfUse != null && termsOfUse.isConfirmationRequired();
        OtpDTO.Agreement isAdsAllowed = agreementSheet.isAdsAllowed();
        return new Rc0.t(!(z11 || (Intrinsics.d(bool2, bool3) && isAdsAllowed != null && isAdsAllowed.isConfirmationRequired())), bool, bool2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Nc0.f t0() {
        return (Nc0.f) this.f35861f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0() {
        InterfaceC4008j interfaceC4008j = this.f35862g;
        String b11 = ((Pc0.c) interfaceC4008j.getValue()).o(this.f35856a).b();
        if (b11.length() == 0) {
            ((Pc0.c) interfaceC4008j.getValue()).q();
            throw new Exception("Link is empty");
        }
        C10727i.c(this.f35863h, null, null, new a(b11, null), 3);
    }

    public final void A0(boolean z11) {
        PageAgreementWithConditionsDTO value;
        OtpDTO.AgreementSheet agreementBlock;
        kotlin.reflect.m<?>[] mVarArr = f35855t;
        kotlin.reflect.m<?> mVar = mVarArr[0];
        td0.m mVar2 = this.f35870o;
        Rc0.t tVar = (Rc0.t) mVar2.getValue(this, mVar);
        if (tVar == null || (value = this.f35864i.getValue()) == null || (agreementBlock = value.getAgreementBlock()) == null) {
            return;
        }
        mVar2.setValue(this, mVarArr[0], p0(agreementBlock, Boolean.valueOf(z11), tVar.a()));
    }

    public final void B0(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ((Pc0.c) this.f35862g.getValue()).v(url);
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        t0().d(this.f35874s);
    }

    @NotNull
    public final B0<Zc0.a> q0() {
        return this.f35873r;
    }

    @NotNull
    public final C2406m0 r0() {
        return this.f35871p;
    }

    @NotNull
    public final Be.n s0() {
        return this.f35869n;
    }

    @NotNull
    public final C2406m0 u0() {
        return this.f35865j;
    }

    public final void w0(boolean z11) {
        PageAgreementWithConditionsDTO value;
        OtpDTO.AgreementSheet agreementBlock;
        kotlin.reflect.m<?>[] mVarArr = f35855t;
        kotlin.reflect.m<?> mVar = mVarArr[0];
        td0.m mVar2 = this.f35870o;
        Rc0.t tVar = (Rc0.t) mVar2.getValue(this, mVar);
        if (tVar == null || (value = this.f35864i.getValue()) == null || (agreementBlock = value.getAgreementBlock()) == null) {
            return;
        }
        mVar2.setValue(this, mVarArr[0], p0(agreementBlock, tVar.c(), Boolean.valueOf(z11)));
    }

    public final void x0() {
        Rc0.t tVar = (Rc0.t) this.f35870o.getValue(this, f35855t[0]);
        if (tVar == null) {
            return;
        }
        boolean b11 = tVar.b();
        C2862e c2862e = this.f35863h;
        if (b11) {
            td0.f.b(N.g(c2862e, this.f35866k), null, new c(null));
        } else {
            td0.f.b(c2862e, null, new b(null));
        }
    }

    public final void y0(@NotNull FastEntryActionDTO.FastEntryDataDTO data, @NotNull FastEntryActionDTO action) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(action, "action");
        ((C7340c) this.f35867l.getValue()).m(data, action);
    }

    public final void z0(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ((Pc0.c) this.f35862g.getValue()).v(deeplink);
    }
}
