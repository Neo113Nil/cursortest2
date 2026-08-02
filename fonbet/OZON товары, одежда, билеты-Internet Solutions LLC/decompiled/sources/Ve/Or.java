package Ve;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import spay.sdk.api.ErrorCode;
import spay.sdk.api.MerchantError;
import spay.sdk.api.PaymentResult;
import spay.sdk.api.SPayMethod;
import spay.sdk.api.model.SPaymentRequest;
import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.utils.permissions.PermissionsActivity;

/* loaded from: classes10.dex */
public final class Or extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public Object f29650d;

    /* renamed from: e, reason: collision with root package name */
    public SPayMethod f29651e;

    /* renamed from: f, reason: collision with root package name */
    public SPaymentRequest f29652f;

    /* renamed from: g, reason: collision with root package name */
    public int f29653g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ SPaymentRequest f29654h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ spay.sdk.d f29655i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SPayMethod f29656j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Or(SPaymentRequest sPaymentRequest, spay.sdk.d dVar, SPayMethod sPayMethod, kotlin.coroutines.d dVar2) {
        super(2, dVar2);
        this.f29654h = sPaymentRequest;
        this.f29655i = dVar;
        this.f29656j = sPayMethod;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Or(this.f29654h, this.f29655i, this.f29656j, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Or) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x02ca, code lost:
    
        if (r1 == r3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02ff, code lost:
    
        if (r1 == r3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0230, code lost:
    
        if (r1 == r3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x009a, code lost:
    
        if (r5 == r3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        if (r1 == r3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fb, code lost:
    
        if (r1 == r3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014d, code lost:
    
        if (r1 == r3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0180, code lost:
    
        if (r1 == r3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b6, code lost:
    
        if (r1 == r3) goto L146;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SPaymentRequest sPaymentRequest;
        spay.sdk.d dVar;
        SPayMethod sPayMethod;
        Object a11;
        Object a12;
        PayStrategy status;
        PayStrategy.PayWithBinding payWithBinding;
        EnumC4464n6 enumC4464n6;
        P6 p62;
        Object b11;
        Object b12;
        Object a13;
        Object a14;
        Object a15;
        Object a16;
        Object a17;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        switch (this.f29653g) {
            case 0:
                Sc.s.b(obj);
                sPaymentRequest = this.f29654h;
                Function1<PaymentResult, Unit> callback = sPaymentRequest.getCallback();
                dVar = this.f29655i;
                this.f29650d = dVar;
                sPayMethod = this.f29656j;
                this.f29651e = sPayMethod;
                this.f29652f = sPaymentRequest;
                this.f29653g = 1;
                a11 = spay.sdk.d.a(dVar, callback, this);
                break;
            case 1:
                sPaymentRequest = this.f29652f;
                SPayMethod sPayMethod2 = this.f29651e;
                dVar = (spay.sdk.d) this.f29650d;
                Sc.s.b(obj);
                sPayMethod = sPayMethod2;
                a11 = obj;
                if (!((Boolean) a11).booleanValue()) {
                    return Unit.f71690a;
                }
                if (kotlin.text.h.K(sPaymentRequest.getApiKey())) {
                    this.f29650d = sPaymentRequest;
                    this.f29651e = null;
                    this.f29652f = null;
                    this.f29653g = 2;
                    a17 = spay.sdk.d.a(dVar, ErrorCode.API_KEY_VALIDATION_FAILED_ERROR_CODE, "Параметр ApiKey обязателен и не может содержать только пробелы", this);
                    break;
                } else {
                    String apiKey = sPaymentRequest.getApiKey();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= apiKey.length()) {
                            if (!Lf.a.D0(sPaymentRequest.getBankInvoiceId())) {
                                String bankInvoiceId = sPaymentRequest.getBankInvoiceId();
                                Intrinsics.checkNotNullParameter(bankInvoiceId, "<this>");
                                if (bankInvoiceId.length() == 32) {
                                    for (int i12 = 0; i12 < bankInvoiceId.length(); i12++) {
                                        if (Character.isLetterOrDigit(bankInvoiceId.charAt(i12))) {
                                        }
                                    }
                                }
                                this.f29650d = sPaymentRequest;
                                this.f29651e = null;
                                this.f29652f = null;
                                this.f29653g = 4;
                                a15 = spay.sdk.d.a(dVar, ErrorCode.BANK_INVOICE_ID_VALIDATION_FAILED_ERROR_CODE, "Длина bankInvoiceId должна быть 32 символа или 36 символов (с дефисами)", this);
                                break;
                            }
                            if (!Lf.a.D0(sPaymentRequest.getBankInvoiceId()) || Lf.a.d0(sPaymentRequest.getBankInvoiceId()) != null) {
                                String merchantLogin = sPaymentRequest.getMerchantLogin();
                                Intrinsics.checkNotNullParameter(merchantLogin, "<this>");
                                if (kotlin.text.h.X(merchantLogin, " ", "", false).length() < 3) {
                                    this.f29650d = sPaymentRequest;
                                    this.f29651e = null;
                                    this.f29652f = null;
                                    this.f29653g = 6;
                                    a13 = spay.sdk.d.a(dVar, ErrorCode.MERCHANT_LOGIN_VALIDATION_FAILED_ERROR_CODE, "Параметр merchantLogin обязателен и не может содержать только пробелы", this);
                                    break;
                                } else {
                                    String appPackage = sPaymentRequest.getAppPackage();
                                    Intrinsics.checkNotNullParameter(appPackage, "<this>");
                                    if (!kotlin.text.h.K(appPackage)) {
                                        List<String> l11 = kotlin.text.h.l(appPackage, new char[]{'.'}, 0, 6);
                                        if (!(l11 instanceof Collection) || !l11.isEmpty()) {
                                            for (String str : l11) {
                                                if (str.length() > 0 && Character.isJavaIdentifierStart(kotlin.text.h.E(str))) {
                                                    for (int i13 = 0; i13 < str.length(); i13++) {
                                                        if (Character.isJavaIdentifierPart(str.charAt(i13))) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        String apiKey2 = sPaymentRequest.getApiKey();
                                        String bankInvoiceId2 = sPaymentRequest.getBankInvoiceId();
                                        String orderNumber = sPaymentRequest.getOrderNumber();
                                        Vm vm = dVar.f98850a;
                                        if (vm == null) {
                                            Intrinsics.n("sPayDataContract");
                                            throw null;
                                        }
                                        MerchantData merchantData = ((C4654tn) vm).f32130G;
                                        if (merchantData != null) {
                                            if (merchantData == null) {
                                                throw L3.f29386a;
                                            }
                                            String authorization = merchantData.getAuthorization();
                                            String orderId = merchantData.getOrderId();
                                            String merchantLogin2 = merchantData.getMerchantLogin();
                                            if (!Intrinsics.d(apiKey2, authorization) || !Intrinsics.d(bankInvoiceId2, orderId) || !Intrinsics.d(orderNumber, merchantLogin2)) {
                                                Yc yc2 = dVar.f98851b;
                                                if (yc2 == null) {
                                                    Intrinsics.n("clearSdkUtil");
                                                    throw null;
                                                }
                                                yc2.a(false);
                                            }
                                            dVar.a();
                                        }
                                        boolean z11 = sPayMethod instanceof SPayMethod.WithPhoneNumber;
                                        if (z11) {
                                            String phoneNumber = sPaymentRequest.getPhoneNumber();
                                            if (phoneNumber != null && !kotlin.text.h.K(phoneNumber)) {
                                                if (phoneNumber.length() != 11 || !TextUtils.isDigitsOnly(phoneNumber) || !kotlin.text.h.e0(phoneNumber, "7", false)) {
                                                    InterfaceC4436m7 interfaceC4436m7 = dVar.f98852c;
                                                    if (interfaceC4436m7 == null) {
                                                        Intrinsics.n("userIdManager");
                                                        throw null;
                                                    }
                                                    this.f29650d = sPaymentRequest;
                                                    this.f29651e = null;
                                                    this.f29652f = null;
                                                    this.f29653g = 9;
                                                    b12 = ((C4180da) interfaceC4436m7).b(this);
                                                    break;
                                                }
                                            } else {
                                                InterfaceC4436m7 interfaceC4436m72 = dVar.f98852c;
                                                if (interfaceC4436m72 == null) {
                                                    Intrinsics.n("userIdManager");
                                                    throw null;
                                                }
                                                this.f29650d = sPaymentRequest;
                                                this.f29651e = null;
                                                this.f29652f = null;
                                                this.f29653g = 8;
                                                b11 = ((C4180da) interfaceC4436m72).b(this);
                                                break;
                                            }
                                        }
                                        String valueOf = Lf.a.D0(sPaymentRequest.getBankInvoiceId()) ? String.valueOf(Lf.a.d0(sPaymentRequest.getBankInvoiceId())) : sPaymentRequest.getBankInvoiceId();
                                        if (Intrinsics.d(sPayMethod, SPayMethod.Default.INSTANCE)) {
                                            status = new PayStrategy.PayOnline(null, 1, null);
                                        } else if (Intrinsics.d(sPayMethod, SPayMethod.WithBankInvoiceId.INSTANCE)) {
                                            status = new PayStrategy.PayOnline(null, 1, null);
                                        } else {
                                            if (sPayMethod instanceof SPayMethod.WithBinding) {
                                                payWithBinding = new PayStrategy.PayWithBinding(((SPayMethod.WithBinding) sPayMethod).getBindingId(), PayStrategy.PayWithBinding.FeatureVersion.DEPRECATED, false, 4, null);
                                            } else if (sPayMethod instanceof SPayMethod.BindingPayment) {
                                                payWithBinding = new PayStrategy.PayWithBinding(((SPayMethod.BindingPayment) sPayMethod).getBindingId(), PayStrategy.PayWithBinding.FeatureVersion.MVP0, false, 4, null);
                                            } else if (Intrinsics.d(sPayMethod, SPayMethod.WithBonuses.INSTANCE)) {
                                                status = PayStrategy.PayWithBonuses.INSTANCE;
                                            } else if (Intrinsics.d(sPayMethod, SPayMethod.WithPartPay.INSTANCE)) {
                                                status = PayStrategy.PayWithPartsOnly.INSTANCE;
                                            } else if (z11) {
                                                status = new PayStrategy.PayWithPhoneNumber(((SPayMethod.WithPhoneNumber) sPayMethod).getPaymentTool());
                                            } else {
                                                if (!Intrinsics.d(sPayMethod, SPayMethod.WithoutRefresh.INSTANCE)) {
                                                    throw new Sc.o();
                                                }
                                                status = PayStrategy.PartsStartPay.INSTANCE;
                                            }
                                            status = payWithBinding;
                                        }
                                        Vm vm2 = dVar.f98850a;
                                        if (vm2 == null) {
                                            Intrinsics.n("sPayDataContract");
                                            throw null;
                                        }
                                        String apiKey3 = sPaymentRequest.getApiKey();
                                        String merchantLogin3 = sPaymentRequest.getMerchantLogin();
                                        Intrinsics.checkNotNullParameter(merchantLogin3, "<this>");
                                        String X9 = kotlin.text.h.X(merchantLogin3, " ", "", false);
                                        boolean z12 = status instanceof PayStrategy.PayWithBinding;
                                        MerchantData merchantData2 = new MerchantData(apiKey3, X9, valueOf, z12 ? ((PayStrategy.PayWithBinding) status).getBindingId() : null, sPaymentRequest.getOrderNumber(), sPaymentRequest.getAppPackage(), sPaymentRequest.getPhoneNumber());
                                        Intrinsics.checkNotNullParameter(merchantData2, "merchantData");
                                        ((C4654tn) vm2).f32130G = merchantData2;
                                        Vm vm3 = dVar.f98850a;
                                        if (vm3 == null) {
                                            Intrinsics.n("sPayDataContract");
                                            throw null;
                                        }
                                        Intrinsics.checkNotNullParameter(status, "status");
                                        ((C4654tn) vm3).f32128E.setValue(status);
                                        if (status instanceof PayStrategy.PayOnline) {
                                            enumC4464n6 = EnumC4464n6.MA_PAY_DEFAULT;
                                        } else if (Intrinsics.d(status, PayStrategy.BasePay.INSTANCE)) {
                                            enumC4464n6 = EnumC4464n6.MA_PAY_WITH_BANK_INVOICE_ID;
                                        } else if (Intrinsics.d(status, PayStrategy.PartsStartPay.INSTANCE)) {
                                            enumC4464n6 = EnumC4464n6.MA_PAY_WITHOUT_REFRESH;
                                        } else if (Intrinsics.d(status, PayStrategy.PayWithBonuses.INSTANCE)) {
                                            enumC4464n6 = EnumC4464n6.MA_PAY_WITH_BONUSES;
                                        } else if (Intrinsics.d(status, PayStrategy.PayWithPartsOnly.INSTANCE)) {
                                            enumC4464n6 = EnumC4464n6.MA_PAY_WITH_PART_PAY;
                                        } else if (status instanceof PayStrategy.PayWithPhoneNumber) {
                                            enumC4464n6 = EnumC4464n6.MA_PAY_WITH_PHONE_NUMBER;
                                        } else {
                                            if (!z12) {
                                                throw new Sc.o();
                                            }
                                            int i14 = Ao.f28636a[((PayStrategy.PayWithBinding) status).getVersion().ordinal()];
                                            if (i14 == 1) {
                                                enumC4464n6 = EnumC4464n6.MA_PAY_WITH_BINDING;
                                            } else {
                                                if (i14 != 2) {
                                                    throw new Sc.o();
                                                }
                                                enumC4464n6 = EnumC4464n6.MA_PAY_BINDING;
                                            }
                                        }
                                        EnumC4464n6 enumC4464n62 = enumC4464n6;
                                        Te te2 = dVar.f98854e;
                                        if (te2 != null) {
                                            te2.b(new Bi(enumC4464n62, null, Pe.MA, null, null, null, null, 122));
                                        }
                                        int i15 = Ao.f28637b[status.getToolType().ordinal()];
                                        if (i15 == 1) {
                                            p62 = P6.TOOL_PAY_WITH_CARDS;
                                        } else {
                                            if (i15 != 2) {
                                                throw new Sc.o();
                                            }
                                            p62 = P6.TOOL_PAY_WITH_PAYMENT_ACCOUNT;
                                        }
                                        P6 p63 = p62;
                                        Te te3 = dVar.f98854e;
                                        if (te3 != null) {
                                            te3.b(new Bi(p63, null, Pe.TOOL, null, null, null, null, 122));
                                        }
                                        Context context = sPaymentRequest.getContext();
                                        Ul.f30137c = new C4427lr(sPaymentRequest, dVar);
                                        C4114b2 c4114b2 = new C4114b2(context);
                                        if (((Boolean) dVar.a(context).e()).booleanValue()) {
                                            c4114b2.invoke("action_permissions_granted");
                                        } else {
                                            Intent intent = new Intent(context, (Class<?>) PermissionsActivity.class);
                                            A block = new A(intent, 0);
                                            Intrinsics.checkNotNullParameter(block, "block");
                                            context.startActivity(intent);
                                            IntentFilter intentFilter = new IntentFilter();
                                            intentFilter.addAction("action_permissions_granted");
                                            intentFilter.addAction("action_permissions_denied");
                                            androidx.core.content.a.registerReceiver(context, new C4653tm(new C4314i0(c4114b2)), intentFilter, 4);
                                        }
                                        return Unit.f71690a;
                                    }
                                    this.f29650d = sPaymentRequest;
                                    this.f29651e = null;
                                    this.f29652f = null;
                                    this.f29653g = 7;
                                    a12 = spay.sdk.d.a(dVar, ErrorCode.APP_PACKAGE_VALIDATION_FAILED_ERROR_CODE, "Параметр appPackage обязателен и должен быть валидным пакетом", this);
                                    break;
                                }
                            } else {
                                this.f29650d = sPaymentRequest;
                                this.f29651e = null;
                                this.f29652f = null;
                                this.f29653g = 5;
                                a14 = spay.sdk.d.a(dVar, ErrorCode.BANK_INVOICE_ID_VALIDATION_FAILED_ERROR_CODE, "Передан некорректный BankInvoiceId", this);
                                break;
                            }
                        } else if (CharsKt.c(apiKey.charAt(i11))) {
                            this.f29650d = sPaymentRequest;
                            this.f29651e = null;
                            this.f29652f = null;
                            this.f29653g = 3;
                            a16 = spay.sdk.d.a(dVar, ErrorCode.API_KEY_VALIDATION_FAILED_ERROR_CODE, "Параметр ApiKey не должен содержать пробелы или другие пробельные символы", this);
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                return aVar;
            case 2:
                SPaymentRequest sPaymentRequest2 = (SPaymentRequest) this.f29650d;
                Sc.s.b(obj);
                sPaymentRequest = sPaymentRequest2;
                a17 = obj;
                sPaymentRequest.getCallback().invoke((PaymentResult) a17);
                return Unit.f71690a;
            case 3:
                SPaymentRequest sPaymentRequest3 = (SPaymentRequest) this.f29650d;
                Sc.s.b(obj);
                sPaymentRequest = sPaymentRequest3;
                a16 = obj;
                sPaymentRequest.getCallback().invoke((PaymentResult) a16);
                return Unit.f71690a;
            case 4:
                SPaymentRequest sPaymentRequest4 = (SPaymentRequest) this.f29650d;
                Sc.s.b(obj);
                sPaymentRequest = sPaymentRequest4;
                a15 = obj;
                sPaymentRequest.getCallback().invoke((PaymentResult) a15);
                return Unit.f71690a;
            case 5:
                SPaymentRequest sPaymentRequest5 = (SPaymentRequest) this.f29650d;
                Sc.s.b(obj);
                sPaymentRequest = sPaymentRequest5;
                a14 = obj;
                sPaymentRequest.getCallback().invoke((PaymentResult) a14);
                return Unit.f71690a;
            case 6:
                SPaymentRequest sPaymentRequest6 = (SPaymentRequest) this.f29650d;
                Sc.s.b(obj);
                sPaymentRequest = sPaymentRequest6;
                a13 = obj;
                sPaymentRequest.getCallback().invoke((PaymentResult) a13);
                return Unit.f71690a;
            case 7:
                SPaymentRequest sPaymentRequest7 = (SPaymentRequest) this.f29650d;
                Sc.s.b(obj);
                sPaymentRequest = sPaymentRequest7;
                a12 = obj;
                sPaymentRequest.getCallback().invoke((PaymentResult) a12);
                return Unit.f71690a;
            case 8:
                SPaymentRequest sPaymentRequest8 = (SPaymentRequest) this.f29650d;
                Sc.s.b(obj);
                sPaymentRequest = sPaymentRequest8;
                b11 = obj;
                sPaymentRequest.getCallback().invoke(new PaymentResult.Error((String) b11, ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE, new MerchantError.RequiredDataNotSent("В этом способе оплты номер телефона является обязательным параметром")));
                return Unit.f71690a;
            case 9:
                SPaymentRequest sPaymentRequest9 = (SPaymentRequest) this.f29650d;
                Sc.s.b(obj);
                sPaymentRequest = sPaymentRequest9;
                b12 = obj;
                sPaymentRequest.getCallback().invoke(new PaymentResult.Error((String) b12, ErrorCode.PHONE_NUMBER_VALIDATION_FAILED_ERROR_CODE, new MerchantError.RequiredDataNotSent("Передан некорректный формат номера телефона. Требуемый формат 7xxxxxxxxxx")));
                return Unit.f71690a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
