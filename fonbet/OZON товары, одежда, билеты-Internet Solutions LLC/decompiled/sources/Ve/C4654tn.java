package Ve;

import Ae.C2399j;
import Sc.r;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.api.ErrorCode;
import spay.sdk.domain.model.FraudMonInfo;
import spay.sdk.domain.model.HelperScenario;
import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.OrderScreenDataResponse;
import spay.sdk.domain.model.response.PartsPaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.PartsPaymentPlanBnplResponseBodyKt;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.SessionIdResponseBody;
import spay.sdk.domain.model.response.bnpl.BnplPayment;
import spay.sdk.domain.model.response.bnpl.GraphBnpl;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import spay.sdk.domain.model.response.spasibo.SpasiboBonusesResponseBody;

/* renamed from: Ve.tn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4654tn implements Vm {

    /* renamed from: A, reason: collision with root package name */
    public final Ae.x0 f32124A;

    /* renamed from: B, reason: collision with root package name */
    public final Ae.M0 f32125B;

    /* renamed from: C, reason: collision with root package name */
    public final Ae.x0 f32126C;

    /* renamed from: D, reason: collision with root package name */
    public final Ae.M0 f32127D;

    /* renamed from: E, reason: collision with root package name */
    public final Ae.x0 f32128E;

    /* renamed from: F, reason: collision with root package name */
    public final Ae.M0 f32129F;

    /* renamed from: G, reason: collision with root package name */
    public MerchantData f32130G;

    /* renamed from: H, reason: collision with root package name */
    public String f32131H;

    /* renamed from: a, reason: collision with root package name */
    public Boolean f32132a;

    /* renamed from: b, reason: collision with root package name */
    public L1 f32133b;

    /* renamed from: c, reason: collision with root package name */
    public ContentResponse.Success f32134c;

    /* renamed from: d, reason: collision with root package name */
    public ContentResponse.Success f32135d;

    /* renamed from: e, reason: collision with root package name */
    public ContentResponse.Success f32136e;

    /* renamed from: f, reason: collision with root package name */
    public final Ae.x0 f32137f;

    /* renamed from: g, reason: collision with root package name */
    public final Ae.x0 f32138g;

    /* renamed from: h, reason: collision with root package name */
    public final Ae.M0 f32139h;

    /* renamed from: i, reason: collision with root package name */
    public final Ae.x0 f32140i;

    /* renamed from: j, reason: collision with root package name */
    public final Ae.M0 f32141j;

    /* renamed from: k, reason: collision with root package name */
    public final Ae.x0 f32142k;

    /* renamed from: l, reason: collision with root package name */
    public String f32143l;

    /* renamed from: m, reason: collision with root package name */
    public String f32144m;

    /* renamed from: n, reason: collision with root package name */
    public final Ae.x0 f32145n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f32146o;

    /* renamed from: p, reason: collision with root package name */
    public FraudMonInfo f32147p;

    /* renamed from: q, reason: collision with root package name */
    public final Ae.x0 f32148q;

    /* renamed from: r, reason: collision with root package name */
    public final Ae.x0 f32149r;

    /* renamed from: s, reason: collision with root package name */
    public final Ae.x0 f32150s;

    /* renamed from: t, reason: collision with root package name */
    public final Ae.x0 f32151t;

    /* renamed from: u, reason: collision with root package name */
    public final Ae.M0 f32152u;

    /* renamed from: v, reason: collision with root package name */
    public final String f32153v;

    /* renamed from: w, reason: collision with root package name */
    public int f32154w;

    /* renamed from: x, reason: collision with root package name */
    public HelperScenario f32155x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f32156y;

    /* renamed from: z, reason: collision with root package name */
    public final Ae.x0 f32157z;

    public C4654tn(xe.M contractScope) {
        Intrinsics.checkNotNullParameter(contractScope, "contractScope");
        this.f32133b = new L1();
        this.f32137f = Ae.O0.a(null);
        Ae.x0 a11 = Ae.O0.a(Boolean.TRUE);
        this.f32138g = a11;
        this.f32139h = C2399j.b(a11);
        Ae.x0 a12 = Ae.O0.a(null);
        this.f32140i = a12;
        this.f32141j = C2399j.b(a12);
        this.f32142k = Ae.O0.a(null);
        this.f32145n = Ae.O0.a(null);
        ContentResponse.Success success = this.f32136e;
        success = success == null ? null : success;
        this.f32148q = Ae.O0.a(success != null ? (PaymentPlanBnplResponseBody) success.getData() : null);
        ContentResponse.Success success2 = this.f32135d;
        success2 = success2 == null ? null : success2;
        this.f32149r = Ae.O0.a(success2 != null ? (ListOfCardsResponseBody) success2.getData() : null);
        this.f32150s = Ae.O0.a(null);
        Ae.x0 a13 = Ae.O0.a(null);
        this.f32151t = a13;
        this.f32152u = C2399j.b(a13);
        this.f32153v = "";
        this.f32156y = new LinkedHashSet();
        this.f32157z = Ae.O0.a(ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE);
        Ae.x0 a14 = Ae.O0.a(0);
        this.f32124A = a14;
        this.f32125B = C2399j.b(a14);
        Ae.x0 a15 = Ae.O0.a(new C4487o0());
        this.f32126C = a15;
        this.f32127D = C2399j.b(a15);
        Ae.x0 a16 = Ae.O0.a(PayStrategy.BasePay.INSTANCE);
        this.f32128E = a16;
        this.f32129F = C2399j.b(a16);
        this.f32131H = "";
    }

    public final long a() {
        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody;
        GraphBnpl graphBnpl;
        List<BnplPayment> payments;
        BnplPayment bnplPayment;
        OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) this.f32141j.getValue();
        Long valueOf = (orderScreenDataResponse == null || (paymentPlanBnplResponseBody = orderScreenDataResponse.getPaymentPlanBnplResponseBody()) == null || (graphBnpl = paymentPlanBnplResponseBody.getGraphBnpl()) == null || (payments = graphBnpl.getPayments()) == null || (bnplPayment = (BnplPayment) C7714v.M(payments)) == null) ? null : Long.valueOf(bnplPayment.getAmount());
        if (valueOf != null) {
            return valueOf.longValue();
        }
        return 0L;
    }

    public final ContentResponse.Success b(Boolean bool) {
        ContentResponse.Success success;
        if (!Intrinsics.d(this.f32132a, bool) || (success = this.f32135d) == null) {
            return null;
        }
        return success;
    }

    public final void c(EnumC4711vm type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int ordinal = type.ordinal();
        Ae.x0 x0Var = this.f32137f;
        if (ordinal == 0) {
            this.f32134c = null;
            x0Var.setValue(null);
            return;
        }
        Ae.x0 x0Var2 = this.f32145n;
        if (ordinal == 1) {
            this.f32135d = null;
            x0Var.setValue(null);
            x0Var2.setValue(null);
            return;
        }
        if (ordinal == 2) {
            this.f32136e = null;
            x0Var.setValue(null);
            return;
        }
        if (ordinal == 3) {
            this.f32134c = null;
            this.f32135d = null;
            this.f32136e = null;
            x0Var.setValue(null);
            f(null);
            this.f32143l = null;
            x0Var2.setValue(null);
            return;
        }
        if (ordinal != 4) {
            if (ordinal != 5) {
                return;
            }
            this.f32130G = null;
            return;
        }
        this.f32148q.tryEmit(null);
        this.f32149r.tryEmit(null);
        this.f32134c = null;
        this.f32135d = null;
        this.f32136e = null;
        x0Var.setValue(null);
        f(null);
        this.f32143l = null;
        x0Var2.setValue(null);
        this.f32146o = false;
        this.f32147p = null;
        this.f32124A.setValue(0);
        C4487o0 bonuses = new C4487o0();
        Intrinsics.checkNotNullParameter(bonuses, "bonuses");
        this.f32126C.setValue(bonuses);
        this.f32130G = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [spay.sdk.domain.model.response.OrderScreenDataResponse] */
    public final void d(ContentResponse.Success paymentPlanBnplResponseBodyContentResponse) {
        ListOfCardsResponseBody listOfCardsResponseBody;
        Intrinsics.checkNotNullParameter(paymentPlanBnplResponseBodyContentResponse, "paymentPlanBnplResponseBodyContentResponse");
        this.f32136e = paymentPlanBnplResponseBodyContentResponse;
        this.f32148q.tryEmit((PaymentPlanBnplResponseBody) paymentPlanBnplResponseBodyContentResponse.getData());
        Ae.x0 x0Var = this.f32140i;
        ContentResponse.Success b11 = b(Boolean.FALSE);
        if (b11 != null && (listOfCardsResponseBody = (ListOfCardsResponseBody) b11.getData()) != null) {
            ContentResponse.Success success = this.f32136e;
            if (success == null) {
                success = null;
            }
            r1 = new OrderScreenDataResponse(listOfCardsResponseBody, success != null ? (PaymentPlanBnplResponseBody) success.getData() : null, null, false, 8, null);
        }
        x0Var.setValue(r1);
    }

    public final void e(ContentResponse.Success response, Boolean bool) {
        ListOfCardsResponseBody listOfCardsResponseBody;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        ListOfCardsResponseBody.PromoInfo promoInfo;
        Intrinsics.checkNotNullParameter(response, "response");
        this.f32135d = response;
        this.f32132a = bool;
        Ae.x0 x0Var = this.f32150s;
        ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) response.getData();
        OrderScreenDataResponse orderScreenDataResponse = null;
        x0Var.setValue((listOfCardsResponseBody2 == null || (promoInfo = listOfCardsResponseBody2.getPromoInfo()) == null) ? null : promoInfo.getBannerList());
        Ae.x0 x0Var2 = this.f32151t;
        ListOfCardsResponseBody listOfCardsResponseBody3 = (ListOfCardsResponseBody) response.getData();
        x0Var2.setValue(listOfCardsResponseBody3 != null ? listOfCardsResponseBody3.getMerchantInfo() : null);
        Ae.x0 x0Var3 = this.f32149r;
        ContentResponse.Success success = this.f32135d;
        Intrinsics.g(success, "null cannot be cast to non-null type spay.sdk.domain.model.response.ContentResponse.Success<spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody>");
        x0Var3.tryEmit(success.getData());
        Ae.x0 x0Var4 = this.f32140i;
        ContentResponse.Success b11 = b(bool);
        if (b11 != null && (listOfCardsResponseBody = (ListOfCardsResponseBody) b11.getData()) != null) {
            ContentResponse.Success success2 = this.f32136e;
            if (success2 == null) {
                success2 = null;
            }
            PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = success2 != null ? (PaymentPlanBnplResponseBody) success2.getData() : null;
            OrderScreenDataResponse orderScreenDataResponse2 = (OrderScreenDataResponse) this.f32141j.getValue();
            boolean z11 = true;
            if (orderScreenDataResponse2 == null || !orderScreenDataResponse2.getMoreThanOneCard()) {
                if (Intrinsics.d(listOfCardsResponseBody.getPaymentToolInfo().getAdditionalCards(), Boolean.TRUE) || ((toolList = listOfCardsResponseBody.getPaymentToolInfo().getToolList()) != null && toolList.size() > 1)) {
                    Boolean additionalCards = listOfCardsResponseBody.getPaymentToolInfo().getAdditionalCards();
                    if (additionalCards != null) {
                        z11 = additionalCards.booleanValue();
                    }
                } else {
                    z11 = false;
                }
            }
            orderScreenDataResponse = new OrderScreenDataResponse(listOfCardsResponseBody, paymentPlanBnplResponseBody, null, z11);
        }
        x0Var4.setValue(orderScreenDataResponse);
    }

    public final void f(OrderScreenDataResponse orderScreenDataResponse) {
        Unit unit;
        OrderScreenDataResponse orderScreenDataResponse2;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        Ae.x0 x0Var = this.f32140i;
        if (orderScreenDataResponse != null) {
            OrderScreenDataResponse orderScreenDataResponse3 = (OrderScreenDataResponse) this.f32141j.getValue();
            if (orderScreenDataResponse3 != null) {
                ListOfCardsResponseBody listOfCardsResponseBody = orderScreenDataResponse.getListOfCardsResponseBody();
                PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = orderScreenDataResponse.getPaymentPlanBnplResponseBody();
                SpasiboBonusesResponseBody spasiboBonusesResponseBody = orderScreenDataResponse.getSpasiboBonusesResponseBody();
                boolean z11 = true;
                if (!Intrinsics.d(orderScreenDataResponse.getListOfCardsResponseBody().getPaymentToolInfo().getAdditionalCards(), Boolean.TRUE) && ((toolList = orderScreenDataResponse.getListOfCardsResponseBody().getPaymentToolInfo().getToolList()) == null || toolList.size() <= 1)) {
                    z11 = false;
                }
                orderScreenDataResponse2 = orderScreenDataResponse3.copy(listOfCardsResponseBody, paymentPlanBnplResponseBody, spasiboBonusesResponseBody, z11);
            } else {
                orderScreenDataResponse2 = null;
            }
            x0Var.setValue(orderScreenDataResponse2);
            unit = Unit.f71690a;
        } else {
            unit = null;
        }
        if (unit == null) {
            x0Var.setValue(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [spay.sdk.domain.model.response.OrderScreenDataResponse] */
    public final void g(PartsPaymentPlanBnplResponseBody data) {
        ListOfCardsResponseBody listOfCardsResponseBody;
        Intrinsics.checkNotNullParameter(data, "data");
        ContentResponse.Success success = new ContentResponse.Success(PartsPaymentPlanBnplResponseBodyKt.mapToPaymentPlanBnplResponseBody(data));
        this.f32136e = success;
        this.f32148q.tryEmit((PaymentPlanBnplResponseBody) success.getData());
        Ae.x0 x0Var = this.f32140i;
        ContentResponse.Success b11 = b(Boolean.FALSE);
        if (b11 != null && (listOfCardsResponseBody = (ListOfCardsResponseBody) b11.getData()) != null) {
            ContentResponse.Success success2 = this.f32136e;
            if (success2 == null) {
                success2 = null;
            }
            r1 = new OrderScreenDataResponse(listOfCardsResponseBody, success2 != null ? (PaymentPlanBnplResponseBody) success2.getData() : null, null, false, 8, null);
        }
        x0Var.setValue(r1);
    }

    public final List h() {
        ListOfCardsResponseBody listOfCardsResponseBody;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        ContentResponse.Success success = this.f32135d;
        if (success == null) {
            success = null;
        }
        if (success == null || (listOfCardsResponseBody = (ListOfCardsResponseBody) success.getData()) == null || (paymentToolInfo = listOfCardsResponseBody.getPaymentToolInfo()) == null) {
            return null;
        }
        return paymentToolInfo.getToolList();
    }

    public final MerchantData i() {
        Object a11;
        try {
            r.Companion companion = Sc.r.INSTANCE;
            a11 = this.f32130G;
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        if (a11 == null) {
            throw L3.f29386a;
        }
        if (a11 instanceof r.b) {
            a11 = null;
        }
        return (MerchantData) a11;
    }

    public final PayStrategy j() {
        return (PayStrategy) this.f32129F.getValue();
    }

    public final String k() {
        SessionIdResponseBody sessionIdResponseBody;
        String sessionId;
        ContentResponse.Success success = this.f32134c;
        if (success == null) {
            success = null;
        }
        return (success == null || (sessionIdResponseBody = (SessionIdResponseBody) success.getData()) == null || (sessionId = sessionIdResponseBody.getSessionId()) == null) ? ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE : sessionId;
    }

    public final SessionIdResponseBody l() {
        ContentResponse.Success success = this.f32134c;
        if (success == null) {
            success = null;
        }
        if (success != null) {
            return (SessionIdResponseBody) success.getData();
        }
        return null;
    }
}
