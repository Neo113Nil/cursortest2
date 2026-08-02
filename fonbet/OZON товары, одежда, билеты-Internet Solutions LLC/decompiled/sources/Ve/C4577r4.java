package Ve;

import Ae.C2399j;
import Ae.I0;
import Lm0.a;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import h3.C6788a;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.api.MerchantError;
import spay.sdk.api.PaymentResult;
import spay.sdk.api.SPaySdkInitConfig;
import spay.sdk.domain.model.BiometricSuggestionModel;
import spay.sdk.domain.model.BnplMethod;
import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.request.ListOfCardsRequestBody;
import spay.sdk.domain.model.request.SdkAuthRequestBody;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.OrderScreenDataResponse;
import spay.sdk.domain.model.response.SPaySdkConfig;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import xe.C10720e0;
import xe.C10727i;

/* renamed from: Ve.r4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4577r4 extends AbstractC4642tb {

    /* renamed from: e, reason: collision with root package name */
    public final Ib f31931e;

    /* renamed from: f, reason: collision with root package name */
    public final Y9 f31932f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4686uq f31933g;

    /* renamed from: h, reason: collision with root package name */
    public final Hn f31934h;

    /* renamed from: i, reason: collision with root package name */
    public final C4463n5 f31935i;

    /* renamed from: j, reason: collision with root package name */
    public final C4164cn f31936j;

    /* renamed from: k, reason: collision with root package name */
    public final C4089a6 f31937k;

    /* renamed from: l, reason: collision with root package name */
    public final C4473nf f31938l;

    /* renamed from: m, reason: collision with root package name */
    public final C4806z5 f31939m;

    /* renamed from: n, reason: collision with root package name */
    public final Xi f31940n;

    /* renamed from: o, reason: collision with root package name */
    public final Dk f31941o;

    /* renamed from: p, reason: collision with root package name */
    public final C4248fl f31942p;

    /* renamed from: q, reason: collision with root package name */
    public final Vl f31943q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC4436m7 f31944r;

    /* renamed from: s, reason: collision with root package name */
    public final Ae.x0 f31945s;

    /* renamed from: t, reason: collision with root package name */
    public final Ae.M0 f31946t;

    /* renamed from: u, reason: collision with root package name */
    public final Ae.M0 f31947u;

    /* renamed from: v, reason: collision with root package name */
    public final Ae.M0 f31948v;

    /* renamed from: w, reason: collision with root package name */
    public Da f31949w;

    /* renamed from: x, reason: collision with root package name */
    public PaymentResult f31950x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f31951y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4577r4(Ib sPayStorage, Vm sPayDataContract, Y9 sPaySdkReducer, Te metricFacade, Yc clearUtil, InterfaceC4686uq authHandler, Hn fullEmissionUseCase, C4463n5 bankAuthenticator, C4164cn biometricAuthenticator, C4089a6 phoneNumberAuthenticator, C4473nf createSdkOtpCodeUseCase, C4806z5 resourceManager, Xi appNameUtil, Dk getDeviceInfoUseCase, C4248fl featuresHandler, T8 spaySdkMerchantOptionsRepository, Vl sPaySdkConfigRepository, InterfaceC4436m7 userIdManager) {
        super(metricFacade, sPayDataContract, clearUtil, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(clearUtil, "clearUtil");
        Intrinsics.checkNotNullParameter(authHandler, "authHandler");
        Intrinsics.checkNotNullParameter(fullEmissionUseCase, "fullEmissionUseCase");
        Intrinsics.checkNotNullParameter(bankAuthenticator, "bankAuthenticator");
        Intrinsics.checkNotNullParameter(biometricAuthenticator, "biometricAuthenticator");
        Intrinsics.checkNotNullParameter(phoneNumberAuthenticator, "phoneNumberAuthenticator");
        Intrinsics.checkNotNullParameter(createSdkOtpCodeUseCase, "createSdkOtpCodeUseCase");
        Intrinsics.checkNotNullParameter(resourceManager, "resourceManager");
        Intrinsics.checkNotNullParameter(appNameUtil, "appNameUtil");
        Intrinsics.checkNotNullParameter(getDeviceInfoUseCase, "getDeviceInfoUseCase");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(spaySdkMerchantOptionsRepository, "spaySdkMerchantOptionsRepository");
        Intrinsics.checkNotNullParameter(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        Intrinsics.checkNotNullParameter(userIdManager, "userIdManager");
        this.f31931e = sPayStorage;
        this.f31932f = sPaySdkReducer;
        this.f31933g = authHandler;
        this.f31934h = fullEmissionUseCase;
        this.f31935i = bankAuthenticator;
        this.f31936j = biometricAuthenticator;
        this.f31937k = phoneNumberAuthenticator;
        this.f31938l = createSdkOtpCodeUseCase;
        this.f31939m = resourceManager;
        this.f31940n = appNameUtil;
        this.f31941o = getDeviceInfoUseCase;
        this.f31942p = featuresHandler;
        this.f31943q = sPaySdkConfigRepository;
        this.f31944r = userIdManager;
        Ae.x0 a11 = Ae.O0.a(new L5(new C4349j7(C4121b9.f30720a)));
        this.f31945s = a11;
        this.f31946t = C2399j.b(a11);
        C4673ud c4673ud = (C4673ud) sPayStorage;
        Be.m D11 = C2399j.D(c4673ud.f32205b, new C4345j3());
        C6788a a12 = androidx.lifecycle.x0.a(this);
        int i11 = Ae.I0.f818a;
        this.f31947u = C2399j.M(D11, a12, I0.a.b(3), Boolean.TRUE);
        this.f31948v = C2399j.M(C2399j.D(c4673ud.f32205b, new B(this, sPayDataContract, null)), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        SPaySdkInitConfig sPaySdkInitConfig = ((C4726w9) spaySdkMerchantOptionsRepository).f32350a;
        if (sPaySdkInitConfig == null) {
            throw C4549q4.f31841a;
        }
        this.f31951y = sPaySdkInitConfig.getEnableOutsideTouchCancelling();
        C10727i.c(androidx.lifecycle.x0.a(this), C10720e0.a(), null, new Pr(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0104  */
    /* JADX WARN: Type inference failed for: r2v80, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e0(C4577r4 c4577r4, Fh fh2, kotlin.coroutines.d dVar) {
        C4143c2 c4143c2;
        String str;
        C4577r4 c4577r42;
        C4577r4 c4577r43;
        C4577r4 c4577r44;
        String f7;
        String f11;
        ListOfCardsResponseBody listOfCardsResponseBody;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        C4577r4 c4577r45;
        C4577r4 c4577r46;
        Object obj;
        Fh fh3;
        C4577r4 c4577r47;
        Object obj2;
        Fh fh4;
        C4577r4 c4577r48;
        C4577r4 c4577r49;
        C4577r4 c4577r410;
        C4577r4 c4577r411;
        Object obj3;
        Fh fh5;
        C4577r4 c4577r412;
        C4577r4 c4577r413;
        Object obj4;
        Fh fh6;
        C4577r4 c4577r414;
        Object obj5;
        Fh fh7;
        C4577r4 c4577r415;
        AbstractC4245fi abstractC4245fi;
        ErrorEntity.BindingPaymentFailed bindingPaymentFailed;
        String description;
        SPaySdkConfig sPaySdkConfig;
        String reason;
        C4577r4 c4577r416 = c4577r4;
        Fh fh8 = fh2;
        c4577r416.getClass();
        if (dVar instanceof C4143c2) {
            c4143c2 = (C4143c2) dVar;
            int i11 = c4143c2.f30772i;
            if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4143c2.f30772i = i11 - LinearLayoutManager.INVALID_OFFSET;
                Object obj6 = c4143c2.f30770g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                r10 = null;
                r10 = null;
                List<ListOfCardsResponseBody.PaymentToolInfo.Tool> list = null;
                str = "";
                switch (c4143c2.f30772i) {
                    case 0:
                        Sc.s.b(obj6);
                        AbstractC4245fi abstractC4245fi2 = fh8.f29004a;
                        if (!(abstractC4245fi2 instanceof C4770xp)) {
                            boolean z11 = abstractC4245fi2 instanceof Lk;
                            Ae.x0 x0Var = c4577r416.f31945s;
                            if (z11) {
                                x0Var.setValue(new L5(new C4349j7(new Rh(new W6()))));
                            } else if (abstractC4245fi2 instanceof F7) {
                                c4577r416.f31950x = null;
                            } else {
                                if (!(abstractC4245fi2 instanceof Bq)) {
                                    boolean z12 = abstractC4245fi2 instanceof S9;
                                    InterfaceC4436m7 interfaceC4436m7 = c4577r416.f31944r;
                                    if (z12) {
                                        a.b bVar = Lm0.a.f17149a;
                                        bVar.b("UNEXPECTED EXCEPTION");
                                        bVar.e(((S9) abstractC4245fi2).f29950a.toString(), new Object[0]);
                                        c4143c2.f30767d = c4577r416;
                                        c4143c2.f30768e = fh8;
                                        c4143c2.f30769f = c4577r416;
                                        c4143c2.f30772i = 1;
                                        Object b11 = ((C4180da) interfaceC4436m7).b(c4143c2);
                                        if (b11 != aVar) {
                                            obj5 = b11;
                                            fh7 = fh8;
                                            c4577r415 = c4577r416;
                                            c4577r415.f31950x = new PaymentResult.Error((String) obj5, (String) C2399j.b(((C4654tn) c4577r416.f30498b).f32157z).getValue(), new MerchantError.UnexpectedError(((S9) fh7.f29004a).f29950a.toString()));
                                            if (Intrinsics.d(c4577r416.i0(), Boolean.FALSE)) {
                                                c4577r416.f31945s.setValue(new L5(new C4349j7(new Xc(new Sd(ErrorEntity.Unknown.INSTANCE)))));
                                            } else {
                                                ((C4238fb) c4577r416.f31932f).b(C4825zo.f32678a);
                                            }
                                        }
                                    } else {
                                        boolean z13 = abstractC4245fi2 instanceof Cb;
                                        Y9 y92 = c4577r416.f31932f;
                                        if (z13) {
                                            a.b bVar2 = Lm0.a.f17149a;
                                            bVar2.b("UNEXPECTED EXCEPTION");
                                            bVar2.e(((Cb) abstractC4245fi2).f28753a.toString(), new Object[0]);
                                            if (Intrinsics.d(c4577r416.i0(), Boolean.FALSE)) {
                                                ((C4238fb) y92).b(C4825zo.f32678a);
                                            } else {
                                                x0Var.setValue(new L5(new C4349j7(new Xc(new Sd(ErrorEntity.Unknown.INSTANCE)))));
                                            }
                                            c4143c2.f30767d = c4577r416;
                                            c4143c2.f30768e = fh8;
                                            c4143c2.f30769f = c4577r416;
                                            c4143c2.f30772i = 2;
                                            Object b12 = ((C4180da) interfaceC4436m7).b(c4143c2);
                                            if (b12 != aVar) {
                                                obj4 = b12;
                                                fh6 = fh8;
                                                c4577r414 = c4577r416;
                                                String str2 = (String) obj4;
                                                String str3 = (String) C2399j.b(((C4654tn) c4577r416.f30498b).f32157z).getValue();
                                                ErrorEntity errorEntity = ((Cb) fh6.f29004a).f28753a;
                                                ErrorEntity.ApiError apiError = !(errorEntity instanceof ErrorEntity.ApiError) ? (ErrorEntity.ApiError) errorEntity : null;
                                                String description2 = apiError != null ? apiError.getDescription() : null;
                                                c4577r414.f31950x = new PaymentResult.Error(str2, str3, new MerchantError.SPayApiError(description2 != null ? description2 : ""));
                                            }
                                        } else if (abstractC4245fi2 instanceof C4761xg) {
                                            a.b bVar3 = Lm0.a.f17149a;
                                            bVar3.b("TIMEOUT EXCEPTION");
                                            ((C4761xg) abstractC4245fi2).getClass();
                                            bVar3.e("Время ожидания ответа от сервера истекло", new Object[0]);
                                            if (Intrinsics.d(c4577r416.i0(), Boolean.FALSE)) {
                                                ((C4238fb) y92).b(C4825zo.f32678a);
                                            } else {
                                                x0Var.setValue(new L5(new C4349j7(new Xc(new Sd(ErrorEntity.TimeOut.INSTANCE)))));
                                            }
                                            c4143c2.f30767d = c4577r416;
                                            c4143c2.f30768e = fh8;
                                            c4143c2.f30769f = c4577r416;
                                            c4143c2.f30772i = 3;
                                            obj6 = ((C4180da) interfaceC4436m7).b(c4143c2);
                                            if (obj6 != aVar) {
                                                c4577r413 = c4577r416;
                                                String str4 = (String) C2399j.b(((C4654tn) c4577r413.f30498b).f32157z).getValue();
                                                ((C4761xg) fh8.f29004a).getClass();
                                                c4577r416.f31950x = new PaymentResult.Error((String) obj6, str4, new MerchantError.TimeoutException("Время ожидания ответа от сервера истекло"));
                                            }
                                        } else if (abstractC4245fi2 instanceof Sm) {
                                            a.b bVar4 = Lm0.a.f17149a;
                                            bVar4.b("UNEXPECTED EXCEPTION");
                                            bVar4.e(((Sm) abstractC4245fi2).f29991a, new Object[0]);
                                            c4143c2.f30767d = c4577r416;
                                            c4143c2.f30768e = fh8;
                                            c4143c2.f30769f = c4577r416;
                                            c4143c2.f30772i = 4;
                                            Object b13 = ((C4180da) interfaceC4436m7).b(c4143c2);
                                            if (b13 != aVar) {
                                                obj3 = b13;
                                                fh5 = fh8;
                                                c4577r412 = c4577r416;
                                                c4577r412.f31950x = new PaymentResult.Error((String) obj3, (String) C2399j.b(((C4654tn) c4577r416.f30498b).f32157z).getValue(), new MerchantError.UnexpectedError(((Sm) fh5.f29004a).f29991a));
                                                if (Intrinsics.d(c4577r416.i0(), Boolean.FALSE)) {
                                                    c4577r416.f31945s.setValue(new L5(new C4349j7(new Xc(new Sd(ErrorEntity.Unknown.INSTANCE)))));
                                                } else {
                                                    ((C4238fb) c4577r416.f31932f).b(C4825zo.f32678a);
                                                }
                                            }
                                        } else if (abstractC4245fi2 instanceof C4254fr) {
                                            a.b bVar5 = Lm0.a.f17149a;
                                            bVar5.b("NO BNPL RESPONSE EXCEPTION");
                                            bVar5.e(null, "NO MESSAGE", new Object[0]);
                                            x0Var.setValue(new L5(new C4349j7(new Xc(new Sd(new ErrorEntity.NoBnplResponse(null, null, 3, null))))));
                                            c4143c2.f30767d = c4577r416;
                                            c4143c2.f30768e = c4577r416;
                                            c4143c2.f30772i = 5;
                                            obj6 = ((C4180da) interfaceC4436m7).b(c4143c2);
                                            if (obj6 != aVar) {
                                                c4577r411 = c4577r416;
                                                c4577r416.f31950x = new PaymentResult.Error((String) obj6, (String) C2399j.b(((C4654tn) c4577r411.f30498b).f32157z).getValue(), new MerchantError.UnexpectedError("CANT_GET_BNPL_RESPONSE"));
                                            }
                                        } else if (abstractC4245fi2 instanceof C4346j4) {
                                            a.b bVar6 = Lm0.a.f17149a;
                                            bVar6.b("NO BNPL RESPONSE EXCEPTION");
                                            bVar6.e(null, "NO MESSAGE", new Object[0]);
                                            x0Var.setValue(new L5(new C4349j7(new Xc(new Sd(ErrorEntity.PayBnplPartsFail.INSTANCE)))));
                                            c4143c2.f30767d = c4577r416;
                                            c4143c2.f30768e = c4577r416;
                                            c4143c2.f30772i = 6;
                                            obj6 = ((C4180da) interfaceC4436m7).b(c4143c2);
                                            if (obj6 != aVar) {
                                                c4577r410 = c4577r416;
                                                c4577r416.f31950x = new PaymentResult.Error((String) obj6, (String) C2399j.b(((C4654tn) c4577r410.f30498b).f32157z).getValue(), new MerchantError.UnexpectedError("CANT_PAY_BY_BNPL"));
                                            }
                                        } else {
                                            boolean z14 = abstractC4245fi2 instanceof C4694v5;
                                            Vm vm = c4577r416.f30498b;
                                            if (z14) {
                                                M1.b bVar7 = ((C4694v5) abstractC4245fi2).f32258a;
                                                if (bVar7 instanceof C4594rl) {
                                                    ((C4654tn) vm).f32143l = ((C4594rl) bVar7).f31983a.getInitiateBankInvoiceId();
                                                } else if (bVar7 instanceof C4420lk) {
                                                    if (Intrinsics.d(c4577r416.i0(), Boolean.FALSE)) {
                                                        ((C4238fb) y92).b(C4825zo.f32678a);
                                                    } else {
                                                        x0Var.setValue(new L5(new C4349j7(new Xc(new Sd(((C4420lk) bVar7).f31534a)))));
                                                    }
                                                } else if (bVar7 instanceof Nk) {
                                                    x0Var.setValue(new L5(new C4349j7(C4591ri.f31979a)));
                                                }
                                            } else if (abstractC4245fi2 instanceof Jr) {
                                                a.b bVar8 = Lm0.a.f17149a;
                                                bVar8.b("NO INTERNET CONNECTION");
                                                Jr jr = (Jr) abstractC4245fi2;
                                                bVar8.e(String.valueOf(jr.f29320a), new Object[0]);
                                                x0Var.setValue(new L5(new C4349j7(new D9(jr.f29320a))));
                                                c4143c2.f30767d = c4577r416;
                                                c4143c2.f30768e = c4577r416;
                                                c4143c2.f30772i = 7;
                                                obj6 = ((C4180da) interfaceC4436m7).b(c4143c2);
                                                if (obj6 != aVar) {
                                                    c4577r49 = c4577r416;
                                                    c4577r416.f31950x = new PaymentResult.Error((String) obj6, (String) C2399j.b(((C4654tn) c4577r49.f30498b).f32157z).getValue(), new MerchantError.NoInternetConnection(null, 1, null));
                                                }
                                            } else if (abstractC4245fi2 instanceof C4755xa) {
                                                a.b bVar9 = Lm0.a.f17149a;
                                                bVar9.b("PAY BINDING ERROR");
                                                bVar9.e(((C4755xa) abstractC4245fi2).f32475a.toString(), new Object[0]);
                                                c4143c2.f30767d = c4577r416;
                                                c4143c2.f30768e = fh8;
                                                c4143c2.f30769f = c4577r416;
                                                c4143c2.f30772i = 8;
                                                Object b14 = ((C4180da) interfaceC4436m7).b(c4143c2);
                                                if (b14 != aVar) {
                                                    obj2 = b14;
                                                    fh4 = fh8;
                                                    c4577r48 = c4577r416;
                                                    String str5 = (String) obj2;
                                                    String str6 = (String) C2399j.b(((C4654tn) c4577r416.f30498b).f32157z).getValue();
                                                    abstractC4245fi = fh4.f29004a;
                                                    ErrorEntity errorEntity2 = ((C4755xa) abstractC4245fi).f32475a;
                                                    bindingPaymentFailed = !(errorEntity2 instanceof ErrorEntity.BindingPaymentFailed) ? (ErrorEntity.BindingPaymentFailed) errorEntity2 : null;
                                                    if (bindingPaymentFailed != null || (reason = bindingPaymentFailed.getReason()) == null) {
                                                        ErrorEntity errorEntity3 = ((C4755xa) abstractC4245fi).f32475a;
                                                        ErrorEntity.ApiError apiError2 = !(errorEntity3 instanceof ErrorEntity.ApiError) ? (ErrorEntity.ApiError) errorEntity3 : null;
                                                        description = apiError2 != null ? apiError2.getDescription() : null;
                                                        if (description != null) {
                                                            str = description;
                                                        }
                                                    } else {
                                                        str = reason;
                                                    }
                                                    c4577r48.f31950x = new PaymentResult.Error(str5, str6, new MerchantError.PayWithBindingError(str));
                                                    Ae.x0 x0Var2 = c4577r416.f31945s;
                                                    sPaySdkConfig = ((C4712vn) c4577r416.f31943q).f32313c;
                                                    if (sPaySdkConfig != null) {
                                                        throw C4317i3.f31235a;
                                                    }
                                                    x0Var2.setValue(new L5(new C4349j7(new Ad(sPaySdkConfig.getLocalization().getPayBindingErrorDescription(), ((C4755xa) abstractC4245fi).f32475a))));
                                                }
                                            } else if (abstractC4245fi2 instanceof Ya) {
                                                a.b bVar10 = Lm0.a.f17149a;
                                                bVar10.b("PAY BONUSES ERROR");
                                                bVar10.e(((Ya) abstractC4245fi2).f30447a.toString(), new Object[0]);
                                                c4143c2.f30767d = c4577r416;
                                                c4143c2.f30768e = fh8;
                                                c4143c2.f30769f = c4577r416;
                                                c4143c2.f30772i = 9;
                                                Object b15 = ((C4180da) interfaceC4436m7).b(c4143c2);
                                                if (b15 != aVar) {
                                                    obj = b15;
                                                    fh3 = fh8;
                                                    c4577r47 = c4577r416;
                                                    String str7 = (String) obj;
                                                    String str8 = (String) C2399j.b(((C4654tn) c4577r416.f30498b).f32157z).getValue();
                                                    ErrorEntity errorEntity4 = ((Ya) fh3.f29004a).f30447a;
                                                    ErrorEntity.ApiError apiError3 = !(errorEntity4 instanceof ErrorEntity.ApiError) ? (ErrorEntity.ApiError) errorEntity4 : null;
                                                    String description3 = apiError3 != null ? apiError3.getDescription() : null;
                                                    c4577r47.f31950x = new PaymentResult.Error(str7, str8, new MerchantError.PayWithBonusesError(description3 != null ? description3 : ""));
                                                    if (Intrinsics.d(c4577r416.i0(), Boolean.FALSE)) {
                                                        c4577r416.f31945s.setValue(new L5(new C4349j7(new C4270ge(((Ya) fh3.f29004a).f30448b))));
                                                    } else {
                                                        ((C4238fb) c4577r416.f31932f).b(C4825zo.f32678a);
                                                    }
                                                }
                                            } else if (abstractC4245fi2 instanceof Ql) {
                                                a.b bVar11 = Lm0.a.f17149a;
                                                bVar11.b("PAY PAYMENT ACCOUNT EMPTY ERROR");
                                                bVar11.e(abstractC4245fi2.toString(), new Object[0]);
                                                c4143c2.f30767d = c4577r416;
                                                c4143c2.f30768e = c4577r416;
                                                c4143c2.f30772i = 10;
                                                obj6 = ((C4180da) interfaceC4436m7).b(c4143c2);
                                                if (obj6 != aVar) {
                                                    c4577r46 = c4577r416;
                                                    c4577r46.f31950x = new PaymentResult.Error((String) obj6, (String) C2399j.b(((C4654tn) c4577r416.f30498b).f32157z).getValue(), new MerchantError.SPayApiError("Empty payment accounts result"));
                                                    if (Intrinsics.d(c4577r416.i0(), Boolean.FALSE)) {
                                                        Ae.x0 x0Var3 = c4577r416.f31945s;
                                                        SPaySdkConfig sPaySdkConfig2 = ((C4712vn) c4577r416.f31943q).f32313c;
                                                        if (sPaySdkConfig2 == null) {
                                                            throw C4317i3.f31235a;
                                                        }
                                                        x0Var3.setValue(new L5(new C4349j7(new N6(sPaySdkConfig2.getLocalization().getNoPaymentsAccount()))));
                                                    } else {
                                                        ((C4238fb) c4577r416.f31932f).b(C4825zo.f32678a);
                                                    }
                                                }
                                            } else if (abstractC4245fi2 instanceof C4537pl) {
                                                a.b bVar12 = Lm0.a.f17149a;
                                                bVar12.b("BIZONE CHECK");
                                                bVar12.e(((C4537pl) abstractC4245fi2).f31808a.toString(), new Object[0]);
                                                c4143c2.f30767d = c4577r416;
                                                c4143c2.f30768e = c4577r416;
                                                c4143c2.f30772i = 11;
                                                obj6 = ((C4180da) interfaceC4436m7).b(c4143c2);
                                                if (obj6 != aVar) {
                                                    c4577r45 = c4577r416;
                                                    c4577r45.f31950x = new PaymentResult.Error((String) obj6, (String) C2399j.b(((C4654tn) c4577r416.f30498b).f32157z).getValue(), new MerchantError.UnexpectedError("Системная или внутренняя ошибка"));
                                                    if (Intrinsics.d(c4577r416.i0(), Boolean.FALSE)) {
                                                        c4577r416.f31945s.setValue(new L5(new C4349j7(new Xc(new Sd(ErrorEntity.AccessDenied.INSTANCE)))));
                                                    } else {
                                                        ((C4238fb) c4577r416.f31932f).b(C4825zo.f32678a);
                                                    }
                                                }
                                            } else if (abstractC4245fi2 instanceof C4144c3) {
                                                InterfaceC4733wg interfaceC4733wg = ((C4144c3) abstractC4245fi2).f30773a;
                                                OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) ((C4654tn) vm).f32141j.getValue();
                                                if (orderScreenDataResponse != null && (listOfCardsResponseBody = orderScreenDataResponse.getListOfCardsResponseBody()) != null && (paymentToolInfo = listOfCardsResponseBody.getPaymentToolInfo()) != null) {
                                                    list = paymentToolInfo.getToolList();
                                                }
                                                x0Var.setValue(new L5(new C4349j7(new Qb(interfaceC4733wg, list == null || list.isEmpty()))));
                                            } else if (abstractC4245fi2 instanceof C4775y2) {
                                                EnumC4290h5 tag = EnumC4290h5.BNPL;
                                                C4248fl c4248fl = c4577r416.f31942p;
                                                c4248fl.getClass();
                                                Intrinsics.checkNotNullParameter(tag, "tag");
                                                InterfaceC4678ui interfaceC4678ui = (InterfaceC4678ui) c4248fl.f31050d.get(tag);
                                                if (interfaceC4678ui != null) {
                                                    interfaceC4678ui.a(new Ja(true));
                                                    Unit unit = Unit.f71690a;
                                                }
                                                x0Var.setValue(new L5(new C4349j7(C4469nb.f31652a)));
                                            } else if (abstractC4245fi2 instanceof F3) {
                                                x0Var.setValue(new L5(new C4349j7(C4672uc.f32203a)));
                                            } else {
                                                boolean z15 = abstractC4245fi2 instanceof C4216ei;
                                                InterfaceC4686uq interfaceC4686uq = c4577r416.f31933g;
                                                if (z15) {
                                                    Yq yq2 = (Yq) interfaceC4686uq;
                                                    if (!yq2.f30521b) {
                                                        String string = yq2.f30520a.getSharedPreferences("USER_TOGGLE", 0).getString("UserBiometricToggleKey", null);
                                                        if ((Intrinsics.d(string, "true") ? Boolean.TRUE : Intrinsics.d(string, "false") ? Boolean.FALSE : null) == null) {
                                                            MerchantData merchantData = ((C4654tn) vm).f32130G;
                                                            if (merchantData == null) {
                                                                throw L3.f29386a;
                                                            }
                                                            String a11 = c4577r416.f31940n.a(merchantData.getAppPackage());
                                                            C4806z5 c4806z5 = c4577r416.f31939m;
                                                            if (a11 != null) {
                                                                f7 = c4806z5.a(R.string.spay_biometric_alert_suggestion_title_with_app_name, a11);
                                                            } else {
                                                                int i12 = R.string.spay_biometric_alert_suggestion_title;
                                                                c4806z5.getClass();
                                                                f7 = E.f(E.d(i12), c4806z5.f32624a);
                                                            }
                                                            if (a11 != null) {
                                                                f11 = c4806z5.a(R.string.spay_biometric_alert_suggestion_message_with_app_name, a11);
                                                            } else {
                                                                int i13 = R.string.spay_biometric_alert_suggestion_message;
                                                                c4806z5.getClass();
                                                                f11 = E.f(E.d(i13), c4806z5.f32624a);
                                                            }
                                                            int i14 = R.string.spay_biometric_alert_suggestion_positive_button;
                                                            c4806z5.getClass();
                                                            Pq d11 = E.d(i14);
                                                            Context context = c4806z5.f32624a;
                                                            x0Var.setValue(new L5(new C4349j7(new Lg(new BiometricSuggestionModel(f7, f11, E.f(d11, context), E.f(E.d(R.string.spay_biometric_alert_suggestion_negative_button), context))))));
                                                        }
                                                    }
                                                    if (yq2.f30521b || yq2.f30523d) {
                                                        C4216ei c4216ei = (C4216ei) abstractC4245fi2;
                                                        Io io2 = new Io(c4216ei.f30933a);
                                                        InterfaceC4370k interfaceC4370k = c4216ei.f30934b;
                                                        C10727i.c(androidx.lifecycle.x0.a(c4577r416), null, null, new Q0(c4577r416, io2, interfaceC4370k instanceof U2 ? (U2) interfaceC4370k : null, null), 3);
                                                    } else {
                                                        ((C4238fb) y92).b(C4128bg.f30735a);
                                                    }
                                                } else if (abstractC4245fi2 instanceof C4362jk) {
                                                    K9 k92 = c4577r416.f32098d;
                                                    if (k92 != null) {
                                                        k92.invoke();
                                                    }
                                                } else if (abstractC4245fi2 instanceof C4539pn) {
                                                    x0Var.setValue(new L5(new C4349j7(C4552q7.f31846a)));
                                                } else if (abstractC4245fi2 instanceof C4268gc) {
                                                    c4143c2.f30767d = c4577r416;
                                                    c4143c2.f30768e = c4577r416;
                                                    c4143c2.f30772i = 12;
                                                    obj6 = ((C4180da) interfaceC4436m7).b(c4143c2);
                                                    if (obj6 != aVar) {
                                                        c4577r44 = c4577r416;
                                                        c4577r44.f31950x = new PaymentResult.Processing((String) obj6, (String) C2399j.b(((C4654tn) c4577r416.f30498b).f32157z).getValue());
                                                        if (Intrinsics.d(c4577r416.i0(), Boolean.FALSE)) {
                                                            c4577r416.f31945s.setValue(new L5(new C4349j7(new Xc(C4731we.f32365a))));
                                                        } else {
                                                            ((C4238fb) c4577r416.f31932f).b(C4825zo.f32678a);
                                                        }
                                                    }
                                                } else if (abstractC4245fi2 instanceof Ic) {
                                                    c4143c2.f30767d = c4577r416;
                                                    c4143c2.f30768e = c4577r416;
                                                    c4143c2.f30772i = 13;
                                                    obj6 = ((C4180da) interfaceC4436m7).b(c4143c2);
                                                    if (obj6 != aVar) {
                                                        c4577r43 = c4577r416;
                                                        c4577r43.f31950x = new PaymentResult.Success((String) obj6, (String) C2399j.b(((C4654tn) c4577r416.f30498b).f32157z).getValue());
                                                        if (Intrinsics.d(c4577r416.i0(), Boolean.FALSE)) {
                                                            c4577r416.f31945s.setValue(new L5(new C4349j7(new Xc(Ze.f30586a))));
                                                        } else {
                                                            ((C4238fb) c4577r416.f31932f).b(C4825zo.f32678a);
                                                        }
                                                    }
                                                } else if (abstractC4245fi2 instanceof C4816zf) {
                                                    String string2 = ((Yq) interfaceC4686uq).f30520a.getSharedPreferences("USER_TOGGLE", 0).getString("UserBiometricToggleKey", null);
                                                    InterfaceC4228f1[] elements = {Intrinsics.d(Intrinsics.d(string2, "true") ? Boolean.TRUE : Intrinsics.d(string2, "false") ? Boolean.FALSE : null, Boolean.TRUE) ? c4577r416.f31936j : null, c4577r416.f31935i, c4577r416.f31937k};
                                                    Intrinsics.checkNotNullParameter(elements, "elements");
                                                    x0Var.setValue(new L5(new C4349j7(new C4562qh(C7705l.B(elements)))));
                                                } else if (abstractC4245fi2 instanceof U1) {
                                                    AbstractC4182dc abstractC4182dc = ((U1) abstractC4245fi2).f30089a;
                                                    if (abstractC4182dc instanceof M4) {
                                                        x0Var.setValue(new L5(new C4349j7(new C4295ha(((M4) abstractC4182dc).f29459c))));
                                                    } else if (abstractC4182dc instanceof C4578r5) {
                                                        PayStrategy j11 = ((C4654tn) vm).j();
                                                        if (j11 instanceof PayStrategy.PayWithBinding) {
                                                            PayStrategy.PayWithBinding payWithBinding = (PayStrategy.PayWithBinding) j11;
                                                            if (payWithBinding.getVersion() == PayStrategy.PayWithBinding.FeatureVersion.MVP0 && payWithBinding.getWasFraudMonReview()) {
                                                                ((C4238fb) y92).b(C4683un.f32233a);
                                                            } else {
                                                                ((C4238fb) y92).b(V4.f30176a);
                                                            }
                                                        } else {
                                                            Da da2 = c4577r416.f31949w;
                                                            if (da2 != null) {
                                                                da2.invoke();
                                                            }
                                                        }
                                                    } else if (abstractC4182dc instanceof Z6) {
                                                        x0Var.setValue(new L5(new C4349j7(new C4295ha(((Z6) abstractC4182dc).f30571c))));
                                                    } else if (abstractC4182dc instanceof C4467n9) {
                                                        x0Var.setValue(new L5(new C4349j7(new C4295ha(((C4467n9) abstractC4182dc).f31648b))));
                                                    } else if (abstractC4182dc instanceof C4289h4) {
                                                        x0Var.setValue(new L5(new C4349j7(Ka.f29342a)));
                                                    } else if (abstractC4182dc instanceof C7) {
                                                        x0Var.setValue(new L5(new C4349j7(Ka.f29342a)));
                                                    }
                                                } else if (abstractC4245fi2 instanceof Y5) {
                                                    Y5 y52 = (Y5) abstractC4245fi2;
                                                    c4577r416.f31949w = y52.f30438b;
                                                    C10727i.c(androidx.lifecycle.x0.a(c4577r416), null, null, new C4342j0(c4577r416, y52, (kotlin.coroutines.d) null), 3);
                                                } else if (abstractC4245fi2 instanceof Gh) {
                                                    x0Var.setValue(new L5(new C4349j7(C4736wj.f32377a)));
                                                } else if (abstractC4245fi2 instanceof C4471nd) {
                                                    x0Var.setValue(new L5(new C4349j7(Lf.f29423a)));
                                                } else if (abstractC4245fi2 instanceof Pn) {
                                                    if (!Intrinsics.d(((Pn) abstractC4245fi2).f29733a, Ck.f28773b)) {
                                                        x0Var.setValue(new L5(new C4349j7(U7.f30106a)));
                                                    }
                                                } else if (abstractC4245fi2 instanceof To) {
                                                    x0Var.setValue(new L5(new C4349j7(new C4753x8(((To) abstractC4245fi2).f30074a))));
                                                } else if (abstractC4245fi2 instanceof C4148c7) {
                                                    x0Var.setValue(new L5(new C4349j7(new Ie(((C4148c7) abstractC4245fi2).f30784a))));
                                                } else if (abstractC4245fi2 instanceof Ij) {
                                                    x0Var.setValue(new L5(new C4349j7(Ri.f29857a)));
                                                } else if (abstractC4245fi2 instanceof C4655to) {
                                                    x0Var.setValue(new L5(new C4349j7(C4415lf.f31528a)));
                                                } else if (abstractC4245fi2 instanceof C4630t) {
                                                    x0Var.setValue(new L5(new C4349j7(new Xc(new Sd(ErrorEntity.NotEnoughMoneyForBnplFirstPayment.INSTANCE)))));
                                                    c4143c2.f30767d = c4577r416;
                                                    c4143c2.f30768e = c4577r416;
                                                    c4143c2.f30772i = 14;
                                                    obj6 = ((C4180da) interfaceC4436m7).b(c4143c2);
                                                    if (obj6 != aVar) {
                                                        c4577r42 = c4577r416;
                                                        c4577r416.f31950x = new PaymentResult.Error((String) obj6, (String) C2399j.b(((C4654tn) c4577r42.f30498b).f32157z).getValue(), new MerchantError.UnexpectedError("NOT_ENOUGH_MONEY_FOR_BNPL"));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return aVar;
                                }
                                x0Var.setValue(new L5(new C4349j7(new Rh(((Bq) abstractC4245fi2).f28729a))));
                            }
                        }
                        return Unit.f71690a;
                    case 1:
                        C4577r4 c4577r417 = c4143c2.f30769f;
                        Fh fh9 = (Fh) c4143c2.f30768e;
                        C4577r4 c4577r418 = c4143c2.f30767d;
                        Sc.s.b(obj6);
                        c4577r415 = c4577r417;
                        c4577r416 = c4577r418;
                        obj5 = obj6;
                        fh7 = fh9;
                        c4577r415.f31950x = new PaymentResult.Error((String) obj5, (String) C2399j.b(((C4654tn) c4577r416.f30498b).f32157z).getValue(), new MerchantError.UnexpectedError(((S9) fh7.f29004a).f29950a.toString()));
                        if (Intrinsics.d(c4577r416.i0(), Boolean.FALSE)) {
                        }
                        return Unit.f71690a;
                    case 2:
                        C4577r4 c4577r419 = c4143c2.f30769f;
                        Fh fh10 = (Fh) c4143c2.f30768e;
                        C4577r4 c4577r420 = c4143c2.f30767d;
                        Sc.s.b(obj6);
                        c4577r414 = c4577r419;
                        c4577r416 = c4577r420;
                        obj4 = obj6;
                        fh6 = fh10;
                        String str22 = (String) obj4;
                        String str32 = (String) C2399j.b(((C4654tn) c4577r416.f30498b).f32157z).getValue();
                        ErrorEntity errorEntity5 = ((Cb) fh6.f29004a).f28753a;
                        if (!(errorEntity5 instanceof ErrorEntity.ApiError)) {
                        }
                        if (apiError != null) {
                        }
                        c4577r414.f31950x = new PaymentResult.Error(str22, str32, new MerchantError.SPayApiError(description2 != null ? description2 : ""));
                        return Unit.f71690a;
                    case 3:
                        c4577r416 = c4143c2.f30769f;
                        fh8 = (Fh) c4143c2.f30768e;
                        c4577r413 = c4143c2.f30767d;
                        Sc.s.b(obj6);
                        String str42 = (String) C2399j.b(((C4654tn) c4577r413.f30498b).f32157z).getValue();
                        ((C4761xg) fh8.f29004a).getClass();
                        c4577r416.f31950x = new PaymentResult.Error((String) obj6, str42, new MerchantError.TimeoutException("Время ожидания ответа от сервера истекло"));
                        return Unit.f71690a;
                    case 4:
                        C4577r4 c4577r421 = c4143c2.f30769f;
                        Fh fh11 = (Fh) c4143c2.f30768e;
                        C4577r4 c4577r422 = c4143c2.f30767d;
                        Sc.s.b(obj6);
                        c4577r412 = c4577r421;
                        c4577r416 = c4577r422;
                        obj3 = obj6;
                        fh5 = fh11;
                        c4577r412.f31950x = new PaymentResult.Error((String) obj3, (String) C2399j.b(((C4654tn) c4577r416.f30498b).f32157z).getValue(), new MerchantError.UnexpectedError(((Sm) fh5.f29004a).f29991a));
                        if (Intrinsics.d(c4577r416.i0(), Boolean.FALSE)) {
                        }
                        return Unit.f71690a;
                    case 5:
                        c4577r416 = (C4577r4) c4143c2.f30768e;
                        c4577r411 = c4143c2.f30767d;
                        Sc.s.b(obj6);
                        c4577r416.f31950x = new PaymentResult.Error((String) obj6, (String) C2399j.b(((C4654tn) c4577r411.f30498b).f32157z).getValue(), new MerchantError.UnexpectedError("CANT_GET_BNPL_RESPONSE"));
                        return Unit.f71690a;
                    case 6:
                        c4577r416 = (C4577r4) c4143c2.f30768e;
                        c4577r410 = c4143c2.f30767d;
                        Sc.s.b(obj6);
                        c4577r416.f31950x = new PaymentResult.Error((String) obj6, (String) C2399j.b(((C4654tn) c4577r410.f30498b).f32157z).getValue(), new MerchantError.UnexpectedError("CANT_PAY_BY_BNPL"));
                        return Unit.f71690a;
                    case 7:
                        c4577r416 = (C4577r4) c4143c2.f30768e;
                        c4577r49 = c4143c2.f30767d;
                        Sc.s.b(obj6);
                        c4577r416.f31950x = new PaymentResult.Error((String) obj6, (String) C2399j.b(((C4654tn) c4577r49.f30498b).f32157z).getValue(), new MerchantError.NoInternetConnection(null, 1, null));
                        return Unit.f71690a;
                    case 8:
                        C4577r4 c4577r423 = c4143c2.f30769f;
                        Fh fh12 = (Fh) c4143c2.f30768e;
                        C4577r4 c4577r424 = c4143c2.f30767d;
                        Sc.s.b(obj6);
                        c4577r48 = c4577r423;
                        c4577r416 = c4577r424;
                        obj2 = obj6;
                        fh4 = fh12;
                        String str52 = (String) obj2;
                        String str62 = (String) C2399j.b(((C4654tn) c4577r416.f30498b).f32157z).getValue();
                        abstractC4245fi = fh4.f29004a;
                        ErrorEntity errorEntity22 = ((C4755xa) abstractC4245fi).f32475a;
                        if (!(errorEntity22 instanceof ErrorEntity.BindingPaymentFailed)) {
                        }
                        if (bindingPaymentFailed != null) {
                            break;
                        }
                        ErrorEntity errorEntity32 = ((C4755xa) abstractC4245fi).f32475a;
                        if (!(errorEntity32 instanceof ErrorEntity.ApiError)) {
                        }
                        if (apiError2 != null) {
                        }
                        if (description != null) {
                        }
                        c4577r48.f31950x = new PaymentResult.Error(str52, str62, new MerchantError.PayWithBindingError(str));
                        Ae.x0 x0Var22 = c4577r416.f31945s;
                        sPaySdkConfig = ((C4712vn) c4577r416.f31943q).f32313c;
                        if (sPaySdkConfig != null) {
                        }
                        break;
                    case 9:
                        C4577r4 c4577r425 = c4143c2.f30769f;
                        Fh fh13 = (Fh) c4143c2.f30768e;
                        C4577r4 c4577r426 = c4143c2.f30767d;
                        Sc.s.b(obj6);
                        c4577r47 = c4577r425;
                        c4577r416 = c4577r426;
                        obj = obj6;
                        fh3 = fh13;
                        String str72 = (String) obj;
                        String str82 = (String) C2399j.b(((C4654tn) c4577r416.f30498b).f32157z).getValue();
                        ErrorEntity errorEntity42 = ((Ya) fh3.f29004a).f30447a;
                        if (!(errorEntity42 instanceof ErrorEntity.ApiError)) {
                        }
                        if (apiError3 != null) {
                        }
                        c4577r47.f31950x = new PaymentResult.Error(str72, str82, new MerchantError.PayWithBonusesError(description3 != null ? description3 : ""));
                        if (Intrinsics.d(c4577r416.i0(), Boolean.FALSE)) {
                        }
                        return Unit.f71690a;
                    case 10:
                        C4577r4 c4577r427 = (C4577r4) c4143c2.f30768e;
                        C4577r4 c4577r428 = c4143c2.f30767d;
                        Sc.s.b(obj6);
                        c4577r46 = c4577r427;
                        c4577r416 = c4577r428;
                        c4577r46.f31950x = new PaymentResult.Error((String) obj6, (String) C2399j.b(((C4654tn) c4577r416.f30498b).f32157z).getValue(), new MerchantError.SPayApiError("Empty payment accounts result"));
                        if (Intrinsics.d(c4577r416.i0(), Boolean.FALSE)) {
                        }
                        return Unit.f71690a;
                    case 11:
                        C4577r4 c4577r429 = (C4577r4) c4143c2.f30768e;
                        C4577r4 c4577r430 = c4143c2.f30767d;
                        Sc.s.b(obj6);
                        c4577r45 = c4577r429;
                        c4577r416 = c4577r430;
                        c4577r45.f31950x = new PaymentResult.Error((String) obj6, (String) C2399j.b(((C4654tn) c4577r416.f30498b).f32157z).getValue(), new MerchantError.UnexpectedError("Системная или внутренняя ошибка"));
                        if (Intrinsics.d(c4577r416.i0(), Boolean.FALSE)) {
                        }
                        return Unit.f71690a;
                    case 12:
                        C4577r4 c4577r431 = (C4577r4) c4143c2.f30768e;
                        C4577r4 c4577r432 = c4143c2.f30767d;
                        Sc.s.b(obj6);
                        c4577r44 = c4577r431;
                        c4577r416 = c4577r432;
                        c4577r44.f31950x = new PaymentResult.Processing((String) obj6, (String) C2399j.b(((C4654tn) c4577r416.f30498b).f32157z).getValue());
                        if (Intrinsics.d(c4577r416.i0(), Boolean.FALSE)) {
                        }
                        return Unit.f71690a;
                    case 13:
                        C4577r4 c4577r433 = (C4577r4) c4143c2.f30768e;
                        C4577r4 c4577r434 = c4143c2.f30767d;
                        Sc.s.b(obj6);
                        c4577r43 = c4577r433;
                        c4577r416 = c4577r434;
                        c4577r43.f31950x = new PaymentResult.Success((String) obj6, (String) C2399j.b(((C4654tn) c4577r416.f30498b).f32157z).getValue());
                        if (Intrinsics.d(c4577r416.i0(), Boolean.FALSE)) {
                        }
                        return Unit.f71690a;
                    case 14:
                        c4577r416 = (C4577r4) c4143c2.f30768e;
                        c4577r42 = c4143c2.f30767d;
                        Sc.s.b(obj6);
                        c4577r416.f31950x = new PaymentResult.Error((String) obj6, (String) C2399j.b(((C4654tn) c4577r42.f30498b).f32157z).getValue(), new MerchantError.UnexpectedError("NOT_ENOUGH_MONEY_FOR_BNPL"));
                        return Unit.f71690a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        c4143c2 = new C4143c2(c4577r416, dVar);
        Object obj62 = c4143c2.f30770g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        list = null;
        list = null;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> list2 = null;
        str = "";
        switch (c4143c2.f30772i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f0(C4577r4 c4577r4, Io io2, U2 u22, kotlin.coroutines.jvm.internal.c cVar) {
        C4690v1 c4690v1;
        int i11;
        SdkAuthRequestBody sdkAuthRequestBody;
        String authorization;
        ListOfCardsRequestBody listOfCardsRequestBody;
        Io io3;
        String str;
        MerchantData merchantData;
        String str2;
        String str3;
        String str4;
        ListOfCardsRequestBody listOfCardsRequestBody2;
        c4577r4.getClass();
        if (cVar instanceof C4690v1) {
            c4690v1 = (C4690v1) cVar;
            int i12 = c4690v1.f32253m;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4690v1.f32253m = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4690v1.f32251k;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4690v1.f32253m;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    C4654tn c4654tn = (C4654tn) c4577r4.f30498b;
                    sdkAuthRequestBody = null;
                    if (c4654tn.j() instanceof PayStrategy.PayWithBinding) {
                        return null;
                    }
                    MerchantData merchantData2 = c4654tn.f32130G;
                    if (merchantData2 == null) {
                        throw L3.f29386a;
                    }
                    authorization = merchantData2.getAuthorization();
                    listOfCardsRequestBody = new ListOfCardsRequestBody(c4654tn.k(), merchantData2.getMerchantLogin(), Boolean.FALSE, merchantData2.getOrderId());
                    if (u22 == null) {
                        io3 = io2;
                        return new C4395ko(authorization, io3, listOfCardsRequestBody, sdkAuthRequestBody);
                    }
                    String k11 = c4654tn.k();
                    V8 v82 = u22.f30091a;
                    String str5 = v82 != null ? v82.f30184b : null;
                    c4690v1.f32244d = merchantData2;
                    c4690v1.f32245e = listOfCardsRequestBody;
                    c4690v1.f32246f = io2;
                    c4690v1.f32247g = authorization;
                    c4690v1.f32248h = str5;
                    c4690v1.f32249i = k11;
                    c4690v1.f32250j = "spaysdk://payment";
                    c4690v1.f32253m = 1;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    Object i13 = c4577r4.f31941o.i(He.b.f10879b, c4690v1);
                    if (i13 == aVar) {
                        return aVar;
                    }
                    str = str5;
                    merchantData = merchantData2;
                    str2 = authorization;
                    io3 = io2;
                    str3 = k11;
                    str4 = "spaysdk://payment";
                    obj = i13;
                    listOfCardsRequestBody2 = listOfCardsRequestBody;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str6 = c4690v1.f32250j;
                    String str7 = c4690v1.f32249i;
                    String str8 = c4690v1.f32248h;
                    str2 = c4690v1.f32247g;
                    io3 = c4690v1.f32246f;
                    ListOfCardsRequestBody listOfCardsRequestBody3 = c4690v1.f32245e;
                    merchantData = c4690v1.f32244d;
                    Sc.s.b(obj);
                    str4 = str6;
                    str3 = str7;
                    str = str8;
                    listOfCardsRequestBody2 = listOfCardsRequestBody3;
                }
                sdkAuthRequestBody = new SdkAuthRequestBody(str4, null, str3, str, (String) obj, merchantData.getOrderId(), merchantData.getMerchantLogin(), merchantData.getAppPackage(), SdkAuthRequestBody.AuthMethod.SBAPP.getValue(), 2, null);
                listOfCardsRequestBody = listOfCardsRequestBody2;
                authorization = str2;
                return new C4395ko(authorization, io3, listOfCardsRequestBody, sdkAuthRequestBody);
            }
        }
        c4690v1 = new C4690v1(c4577r4, cVar);
        Object obj2 = c4690v1.f32251k;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4690v1.f32253m;
        if (i11 != 0) {
        }
        sdkAuthRequestBody = new SdkAuthRequestBody(str4, null, str3, str, (String) obj2, merchantData.getOrderId(), merchantData.getMerchantLogin(), merchantData.getAppPackage(), SdkAuthRequestBody.AuthMethod.SBAPP.getValue(), 2, null);
        listOfCardsRequestBody = listOfCardsRequestBody2;
        authorization = str2;
        return new C4395ko(authorization, io3, listOfCardsRequestBody, sdkAuthRequestBody);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g0(C4577r4 c4577r4, kotlin.coroutines.jvm.internal.c cVar) {
        M3 m32;
        int i11;
        c4577r4.getClass();
        if (cVar instanceof M3) {
            m32 = (M3) cVar;
            int i12 = m32.f29457g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                m32.f29457g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = m32.f29455e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = m32.f29457g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    boolean z11 = ((C4654tn) c4577r4.f30498b).f32129F.getValue() instanceof BnplMethod;
                    m32.f29454d = c4577r4;
                    m32.f29457g = 1;
                    obj = ((C4180da) c4577r4.f31944r).b(m32);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4577r4 = m32.f29454d;
                    Sc.s.b(obj);
                }
                return new PaymentResult.Cancel((String) obj, (String) C2399j.b(((C4654tn) c4577r4.f30498b).f32157z).getValue());
            }
        }
        m32 = new M3(c4577r4, cVar);
        Object obj2 = m32.f29455e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = m32.f29457g;
        if (i11 != 0) {
        }
        return new PaymentResult.Cancel((String) obj2, (String) C2399j.b(((C4654tn) c4577r4.f30498b).f32157z).getValue());
    }

    @Override // Ve.AbstractC4642tb, Ve.Yk
    public final void d0(M1.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.d0(event);
        if (event.equals(Qa.f29764a)) {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new F2(this, null), 3);
        }
    }

    public final void h0(InterfaceC4370k authResult) {
        Intrinsics.checkNotNullParameter(authResult, "authResult");
        boolean a11 = authResult.a();
        Y9 y92 = this.f31932f;
        if (!a11) {
            ((C4238fb) y92).b(C4698v9.f32266a);
            return;
        }
        a.b bVar = Lm0.a.f17149a;
        bVar.b("FullEmissionAuthResult");
        bVar.d("authResult: " + authResult, new Object[0]);
        boolean z11 = authResult instanceof U2;
        Vf vf2 = Vf.f30201a;
        ((C4238fb) y92).b(z11 ? new Wm(vf2, authResult, true) : authResult instanceof C4105am ? new Wm(vf2, null, false) : C4360ji.f31372a);
    }

    public final Boolean i0() {
        C4640t9 c4640t9 = this.f31942p.f31048b;
        if (c4640t9 != null) {
            return Boolean.valueOf(c4640t9.f32094a);
        }
        return null;
    }
}
