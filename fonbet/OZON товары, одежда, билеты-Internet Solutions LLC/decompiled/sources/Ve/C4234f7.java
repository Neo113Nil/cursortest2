package Ve;

import Lm0.a;
import Sc.C4001c;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import retrofit2.Response;
import spay.sdk.data.dto.response.PartsPaymentPlanBnplResponseBodyDto;
import spay.sdk.data.dto.response.PaymentOrderResponseBodyDto;
import spay.sdk.data.dto.response.PaymentPlanBnplResponseBodyDto;
import spay.sdk.data.dto.response.PaymentTokenResponseBodyDto;
import spay.sdk.data.dto.response.SdkAuthResponseBodyDto;
import spay.sdk.data.dto.response.SessionIdResponseBodyDto;
import spay.sdk.data.dto.response.binding.BindingSessionResponseBodyDto;
import spay.sdk.data.dto.response.binding.BindingV3SessionResponseBodyDto;
import spay.sdk.data.dto.response.binding.BindingV3SessionResponseBodyDtoKt;
import spay.sdk.data.dto.response.binding.CreateBindingOtpResponseBodyDto;
import spay.sdk.data.dto.response.binding.PayBindingResponseBodyDto;
import spay.sdk.data.dto.response.listOfCards.ListOfCardsResponseBodyDto;
import spay.sdk.data.dto.response.otp.ConfirmOtpResponseBodyDto;
import spay.sdk.data.dto.response.otp.CreateOtpSdkResponseBodyDto;
import spay.sdk.data.dto.response.spasibo.SpasiboBonusesResponseBodyDto;
import spay.sdk.domain.model.request.BindingSessionIdRequestBody;
import spay.sdk.domain.model.request.BindingV3SessionIdRequestBody;
import spay.sdk.domain.model.request.ConfirmBindingOtpRequestBody;
import spay.sdk.domain.model.request.ConfirmOtpRequestBody;
import spay.sdk.domain.model.request.CreateBindingOtpRequestBody;
import spay.sdk.domain.model.request.CreateOtpSdkRequestBody;
import spay.sdk.domain.model.request.ListOfCardsRequestBody;
import spay.sdk.domain.model.request.PayBindingRequestBody;
import spay.sdk.domain.model.request.PayOnlineRequestBody;
import spay.sdk.domain.model.request.PaymentBnplPlanRequestBody;
import spay.sdk.domain.model.request.PaymentOrderRequestBody;
import spay.sdk.domain.model.request.PaymentTokenRequestBody;
import spay.sdk.domain.model.request.SdkAuthRequestBody;
import spay.sdk.domain.model.request.SessionIdRequestBody;
import spay.sdk.domain.model.request.SpasiboBonusesRequestBody;

/* renamed from: Ve.f7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4234f7 implements Un {

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f31007d = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f31008a;

    /* renamed from: b, reason: collision with root package name */
    public final C4512op f31009b;

    /* renamed from: c, reason: collision with root package name */
    public final C4248fl f31010c;

    public C4234f7(Context context, C4512op hashUtility, C4248fl featuresHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hashUtility, "hashUtility");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        this.f31008a = context;
        this.f31009b = hashUtility;
        this.f31010c = featuresHandler;
    }

    public static void c(String str) {
        LinkedHashMap linkedHashMap = f31007d;
        int i11 = 1;
        if (linkedHashMap.get(str) != null) {
            Object obj = linkedHashMap.get(str);
            Intrinsics.f(obj);
            i11 = 1 + ((Number) obj).intValue();
        }
        linkedHashMap.put(str, Integer.valueOf(i11));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Ve.Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, kotlin.coroutines.d dVar) {
        C4797yo c4797yo;
        int i11;
        C4234f7 c4234f7;
        if (dVar instanceof C4797yo) {
            c4797yo = (C4797yo) dVar;
            int i12 = c4797yo.f32612g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4797yo.f32612g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4797yo.f32610e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4797yo.f32612g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    c4797yo.f32609d = this;
                    c4797yo.f32612g = 1;
                    if (xe.Y.b(2000L, c4797yo) == aVar) {
                        return aVar;
                    }
                    c4234f7 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4234f7 = c4797yo.f32609d;
                    Sc.s.b(obj);
                }
                Boolean bool = Boolean.TRUE;
                Map j11 = kotlin.collections.U.j(new Pair(BindingV3SessionResponseBodyDtoKt.CHECK_RESULT_HAS_CARDS_FIELD, bool), new Pair(BindingV3SessionResponseBodyDtoKt.CHECK_RESULT_BALANCE_CHECK_FIELD, "available"), new Pair(M1.b.m(BindingV3SessionResponseBodyDtoKt.CHECK_RESULT_BINDING_SPAY_FIELD), bool));
                c4234f7.getClass();
                Response success = Response.success(j11);
                Intrinsics.checkNotNullExpressionValue(success, "success(successfulResponseBody)");
                return success;
            }
        }
        c4797yo = new C4797yo(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = c4797yo.f32610e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4797yo.f32612g;
        if (i11 != 0) {
        }
        Boolean bool2 = Boolean.TRUE;
        Map j112 = kotlin.collections.U.j(new Pair(BindingV3SessionResponseBodyDtoKt.CHECK_RESULT_HAS_CARDS_FIELD, bool2), new Pair(BindingV3SessionResponseBodyDtoKt.CHECK_RESULT_BALANCE_CHECK_FIELD, "available"), new Pair(M1.b.m(BindingV3SessionResponseBodyDtoKt.CHECK_RESULT_BINDING_SPAY_FIELD), bool2));
        c4234f7.getClass();
        Response success2 = Response.success(j112);
        Intrinsics.checkNotNullExpressionValue(success2, "success(successfulResponseBody)");
        return success2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Ve.Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ListOfCardsRequestBody listOfCardsRequestBody, kotlin.coroutines.d dVar) {
        Mr mr;
        int i11;
        C4234f7 c4234f7;
        Boolean bool;
        String str;
        if (dVar instanceof Mr) {
            mr = (Mr) dVar;
            int i12 = mr.f29508h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                mr.f29508h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = mr.f29506f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = mr.f29508h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    mr.f29504d = this;
                    mr.f29505e = listOfCardsRequestBody;
                    mr.f29508h = 1;
                    if (xe.Y.b(2000L, mr) == aVar) {
                        return aVar;
                    }
                    c4234f7 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    listOfCardsRequestBody = mr.f29505e;
                    c4234f7 = mr.f29504d;
                    Sc.s.b(obj);
                }
                Boolean priorityCardOnly = listOfCardsRequestBody.getPriorityCardOnly();
                bool = Boolean.TRUE;
                Intrinsics.d(priorityCardOnly, bool);
                if (Intrinsics.d(listOfCardsRequestBody.getPriorityCardOnly(), bool)) {
                    Intrinsics.d(listOfCardsRequestBody.getPriorityCardOnly(), bool);
                    str = "list_cards.json";
                } else {
                    str = "single_list_cards.json";
                }
                ListOfCardsResponseBodyDto listOfCardsResponseBodyDto = (ListOfCardsResponseBodyDto) new Gson().d(c4234f7.d(str), ListOfCardsResponseBodyDto.class);
                Intrinsics.checkNotNullExpressionValue(listOfCardsResponseBodyDto, "listOfCardsResponseBodyDto");
                Response success = Response.success(listOfCardsResponseBodyDto);
                Intrinsics.checkNotNullExpressionValue(success, "success(successfulResponseBody)");
                return success;
            }
        }
        mr = new Mr(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = mr.f29506f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = mr.f29508h;
        if (i11 != 0) {
        }
        Boolean priorityCardOnly2 = listOfCardsRequestBody.getPriorityCardOnly();
        bool = Boolean.TRUE;
        Intrinsics.d(priorityCardOnly2, bool);
        if (Intrinsics.d(listOfCardsRequestBody.getPriorityCardOnly(), bool)) {
        }
        ListOfCardsResponseBodyDto listOfCardsResponseBodyDto2 = (ListOfCardsResponseBodyDto) new Gson().d(c4234f7.d(str), ListOfCardsResponseBodyDto.class);
        Intrinsics.checkNotNullExpressionValue(listOfCardsResponseBodyDto2, "listOfCardsResponseBodyDto");
        Response success2 = Response.success(listOfCardsResponseBodyDto2);
        Intrinsics.checkNotNullExpressionValue(success2, "success(successfulResponseBody)");
        return success2;
    }

    public final String d(String str) {
        String str2;
        Throwable th2;
        try {
            InputStream open = this.f31008a.getAssets().open(str);
            Intrinsics.checkNotNullExpressionValue(open, "context.assets.open(filenamePath)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, Charsets.UTF_8), 8192);
            try {
                str2 = bd.q.d(bufferedReader);
                try {
                    bufferedReader.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    bufferedReader.close();
                } catch (Throwable th5) {
                    C4001c.a(th4, th5);
                }
                th2 = th4;
                str2 = null;
            }
        } catch (IOException e11) {
            a.b bVar = Lm0.a.f17149a;
            bVar.b("JSON READ EXCEPTION");
            bVar.e(e11);
            str2 = null;
        }
        if (th2 != null) {
            throw th2;
        }
        Intrinsics.f(str2);
        if (str2 != null) {
            return str2;
        }
        Intrinsics.n("jsonString");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Ve.Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, SdkAuthRequestBody sdkAuthRequestBody, kotlin.coroutines.d dVar) {
        C4259g3 c4259g3;
        int i11;
        C4234f7 c4234f7;
        if (dVar instanceof C4259g3) {
            c4259g3 = (C4259g3) dVar;
            int i12 = c4259g3.f31076g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4259g3.f31076g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4259g3.f31074e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4259g3.f31076g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    c4259g3.f31073d = this;
                    c4259g3.f31076g = 1;
                    if (xe.Y.b(2000L, c4259g3) == aVar) {
                        return aVar;
                    }
                    c4234f7 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4234f7 = c4259g3.f31073d;
                    Sc.s.b(obj);
                }
                SdkAuthResponseBodyDto sdkAuthResponseBodyDto = (SdkAuthResponseBodyDto) new Gson().d(c4234f7.d("sdk_auth_response.json"), SdkAuthResponseBodyDto.class);
                Intrinsics.checkNotNullExpressionValue(sdkAuthResponseBodyDto, "sdkAuthResponseBodyDto");
                Response success = Response.success(sdkAuthResponseBodyDto);
                Intrinsics.checkNotNullExpressionValue(success, "success(successfulResponseBody)");
                return success;
            }
        }
        c4259g3 = new C4259g3(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = c4259g3.f31074e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4259g3.f31076g;
        if (i11 != 0) {
        }
        SdkAuthResponseBodyDto sdkAuthResponseBodyDto2 = (SdkAuthResponseBodyDto) new Gson().d(c4234f7.d("sdk_auth_response.json"), SdkAuthResponseBodyDto.class);
        Intrinsics.checkNotNullExpressionValue(sdkAuthResponseBodyDto2, "sdkAuthResponseBodyDto");
        Response success2 = Response.success(sdkAuthResponseBodyDto2);
        Intrinsics.checkNotNullExpressionValue(success2, "success(successfulResponseBody)");
        return success2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Ve.Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PayBindingRequestBody payBindingRequestBody, kotlin.coroutines.d dVar) {
        C4147c6 c4147c6;
        int i11;
        C4234f7 c4234f7;
        if (dVar instanceof C4147c6) {
            c4147c6 = (C4147c6) dVar;
            int i12 = c4147c6.f30783g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4147c6.f30783g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4147c6.f30781e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4147c6.f30783g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    c4147c6.f30780d = this;
                    c4147c6.f30783g = 1;
                    if (xe.Y.b(2000L, c4147c6) == aVar) {
                        return aVar;
                    }
                    c4234f7 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4234f7 = c4147c6.f30780d;
                    Sc.s.b(obj);
                }
                PayBindingResponseBodyDto payBindingResponseBodyDto = (PayBindingResponseBodyDto) new Gson().d(c4234f7.d("pay_binding_3ds_response.json"), PayBindingResponseBodyDto.class);
                Intrinsics.checkNotNullExpressionValue(payBindingResponseBodyDto, "payBindingResponseBodyDto");
                Response success = Response.success(payBindingResponseBodyDto);
                Intrinsics.checkNotNullExpressionValue(success, "success(successfulResponseBody)");
                return success;
            }
        }
        c4147c6 = new C4147c6(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = c4147c6.f30781e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4147c6.f30783g;
        if (i11 != 0) {
        }
        PayBindingResponseBodyDto payBindingResponseBodyDto2 = (PayBindingResponseBodyDto) new Gson().d(c4234f7.d("pay_binding_3ds_response.json"), PayBindingResponseBodyDto.class);
        Intrinsics.checkNotNullExpressionValue(payBindingResponseBodyDto2, "payBindingResponseBodyDto");
        Response success2 = Response.success(payBindingResponseBodyDto2);
        Intrinsics.checkNotNullExpressionValue(success2, "success(successfulResponseBody)");
        return success2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Ve.Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kotlin.coroutines.d dVar) {
        D6 d62;
        int i11;
        C4234f7 c4234f7;
        if (dVar instanceof D6) {
            d62 = (D6) dVar;
            int i12 = d62.f28837g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                d62.f28837g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = d62.f28835e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = d62.f28837g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    d62.f28834d = this;
                    d62.f28837g = 1;
                    if (xe.Y.b(2000L, d62) == aVar) {
                        return aVar;
                    }
                    c4234f7 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4234f7 = d62.f28834d;
                    Sc.s.b(obj);
                }
                Unit unit = Unit.f71690a;
                c4234f7.getClass();
                Response success = Response.success(unit);
                Intrinsics.checkNotNullExpressionValue(success, "success(successfulResponseBody)");
                return success;
            }
        }
        d62 = new D6(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = d62.f28835e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = d62.f28837g;
        if (i11 != 0) {
        }
        Unit unit2 = Unit.f71690a;
        c4234f7.getClass();
        Response success2 = Response.success(unit2);
        Intrinsics.checkNotNullExpressionValue(success2, "success(successfulResponseBody)");
        return success2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Ve.Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, kotlin.coroutines.d dVar) {
        Z1 z12;
        int i11;
        C4234f7 c4234f7;
        if (dVar instanceof Z1) {
            z12 = (Z1) dVar;
            int i12 = z12.f30532g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                z12.f30532g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = z12.f30530e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = z12.f30532g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    z12.f30529d = this;
                    z12.f30532g = 1;
                    if (xe.Y.b(2000L, z12) == aVar) {
                        return aVar;
                    }
                    c4234f7 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4234f7 = z12.f30529d;
                    Sc.s.b(obj);
                }
                PaymentPlanBnplResponseBodyDto paymentPlanBnplResponseBodyDto = (PaymentPlanBnplResponseBodyDto) new Gson().d(c4234f7.d("payment_bnpl_plan.json"), PaymentPlanBnplResponseBodyDto.class);
                Intrinsics.checkNotNullExpressionValue(paymentPlanBnplResponseBodyDto, "paymentPlanBnplResponseBodyDto");
                Response success = Response.success(paymentPlanBnplResponseBodyDto);
                Intrinsics.checkNotNullExpressionValue(success, "success(successfulResponseBody)");
                return success;
            }
        }
        z12 = new Z1(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = z12.f30530e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = z12.f30532g;
        if (i11 != 0) {
        }
        PaymentPlanBnplResponseBodyDto paymentPlanBnplResponseBodyDto2 = (PaymentPlanBnplResponseBodyDto) new Gson().d(c4234f7.d("payment_bnpl_plan.json"), PaymentPlanBnplResponseBodyDto.class);
        Intrinsics.checkNotNullExpressionValue(paymentPlanBnplResponseBodyDto2, "paymentPlanBnplResponseBodyDto");
        Response success2 = Response.success(paymentPlanBnplResponseBodyDto2);
        Intrinsics.checkNotNullExpressionValue(success2, "success(successfulResponseBody)");
        return success2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Ve.Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(BindingSessionIdRequestBody bindingSessionIdRequestBody, kotlin.coroutines.d dVar) {
        C4491o4 c4491o4;
        int i11;
        C4234f7 c4234f7;
        if (dVar instanceof C4491o4) {
            c4491o4 = (C4491o4) dVar;
            int i12 = c4491o4.f31706g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4491o4.f31706g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4491o4.f31704e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4491o4.f31706g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    c4491o4.f31703d = this;
                    c4491o4.f31706g = 1;
                    if (xe.Y.b(2000L, c4491o4) == aVar) {
                        return aVar;
                    }
                    c4234f7 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4234f7 = c4491o4.f31703d;
                    Sc.s.b(obj);
                }
                BindingSessionResponseBodyDto bindingSessionIdResponseBodyDto = (BindingSessionResponseBodyDto) new Gson().d(c4234f7.d("binding_session_response.json"), BindingSessionResponseBodyDto.class);
                Intrinsics.checkNotNullExpressionValue(bindingSessionIdResponseBodyDto, "bindingSessionIdResponseBodyDto");
                Response success = Response.success(bindingSessionIdResponseBodyDto);
                Intrinsics.checkNotNullExpressionValue(success, "success(successfulResponseBody)");
                return success;
            }
        }
        c4491o4 = new C4491o4(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = c4491o4.f31704e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4491o4.f31706g;
        if (i11 != 0) {
        }
        BindingSessionResponseBodyDto bindingSessionIdResponseBodyDto2 = (BindingSessionResponseBodyDto) new Gson().d(c4234f7.d("binding_session_response.json"), BindingSessionResponseBodyDto.class);
        Intrinsics.checkNotNullExpressionValue(bindingSessionIdResponseBodyDto2, "bindingSessionIdResponseBodyDto");
        Response success2 = Response.success(bindingSessionIdResponseBodyDto2);
        Intrinsics.checkNotNullExpressionValue(success2, "success(successfulResponseBody)");
        return success2;
    }

    @Override // Ve.Un
    public final Object b(PaymentTokenRequestBody paymentTokenRequestBody, C4536pk c4536pk) {
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Ve.Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(BindingV3SessionIdRequestBody bindingV3SessionIdRequestBody, kotlin.coroutines.d dVar) {
        C4369jr c4369jr;
        int i11;
        C4234f7 c4234f7;
        if (dVar instanceof C4369jr) {
            c4369jr = (C4369jr) dVar;
            int i12 = c4369jr.f31404g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4369jr.f31404g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4369jr.f31402e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4369jr.f31404g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    c4369jr.f31401d = this;
                    c4369jr.f31404g = 1;
                    if (xe.Y.b(2000L, c4369jr) == aVar) {
                        return aVar;
                    }
                    c4234f7 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4234f7 = c4369jr.f31401d;
                    Sc.s.b(obj);
                }
                BindingV3SessionResponseBodyDto bindingSessionIdResponseBodyDto = (BindingV3SessionResponseBodyDto) new Gson().d(c4234f7.d("binding_v3_session_fraudMon_response.json"), BindingV3SessionResponseBodyDto.class);
                Intrinsics.checkNotNullExpressionValue(bindingSessionIdResponseBodyDto, "bindingSessionIdResponseBodyDto");
                Response success = Response.success(bindingSessionIdResponseBodyDto);
                Intrinsics.checkNotNullExpressionValue(success, "success(successfulResponseBody)");
                return success;
            }
        }
        c4369jr = new C4369jr(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = c4369jr.f31402e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4369jr.f31404g;
        if (i11 != 0) {
        }
        BindingV3SessionResponseBodyDto bindingSessionIdResponseBodyDto2 = (BindingV3SessionResponseBodyDto) new Gson().d(c4234f7.d("binding_v3_session_fraudMon_response.json"), BindingV3SessionResponseBodyDto.class);
        Intrinsics.checkNotNullExpressionValue(bindingSessionIdResponseBodyDto2, "bindingSessionIdResponseBodyDto");
        Response success2 = Response.success(bindingSessionIdResponseBodyDto2);
        Intrinsics.checkNotNullExpressionValue(success2, "success(successfulResponseBody)");
        return success2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Ve.Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ConfirmBindingOtpRequestBody confirmBindingOtpRequestBody, kotlin.coroutines.d dVar) {
        Wo wo;
        int i11;
        C4234f7 c4234f7;
        if (dVar instanceof Wo) {
            wo = (Wo) dVar;
            int i12 = wo.f30301g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                wo.f30301g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = wo.f30299e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = wo.f30301g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    wo.f30298d = this;
                    wo.f30301g = 1;
                    if (xe.Y.b(2000L, wo) == aVar) {
                        return aVar;
                    }
                    c4234f7 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4234f7 = wo.f30298d;
                    Sc.s.b(obj);
                }
                Unit unit = Unit.f71690a;
                c4234f7.getClass();
                Response success = Response.success(unit);
                Intrinsics.checkNotNullExpressionValue(success, "success(successfulResponseBody)");
                return success;
            }
        }
        wo = new Wo(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = wo.f30299e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = wo.f30301g;
        if (i11 != 0) {
        }
        Unit unit2 = Unit.f71690a;
        c4234f7.getClass();
        Response success2 = Response.success(unit2);
        Intrinsics.checkNotNullExpressionValue(success2, "success(successfulResponseBody)");
        return success2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // Ve.Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ConfirmOtpRequestBody confirmOtpRequestBody, kotlin.coroutines.d dVar) {
        Cp cp2;
        int i11;
        C4234f7 c4234f7;
        String otpHash;
        String str;
        if (dVar instanceof Cp) {
            cp2 = (Cp) dVar;
            int i12 = cp2.f28787h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cp2.f28787h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cp2.f28785f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cp2.f28787h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    c("confirmOtp");
                    cp2.f28783d = this;
                    cp2.f28784e = confirmOtpRequestBody;
                    cp2.f28787h = 1;
                    if (xe.Y.b(2000L, cp2) == aVar) {
                        return aVar;
                    }
                    c4234f7 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    confirmOtpRequestBody = cp2.f28784e;
                    c4234f7 = cp2.f28783d;
                    Sc.s.b(obj);
                }
                otpHash = confirmOtpRequestBody.getOtpHash();
                C4512op c4512op = c4234f7.f31009b;
                if (Intrinsics.d(otpHash, C4512op.a("119950526"))) {
                    Integer num = (Integer) f31007d.get("confirmOtp");
                    str = (num != null ? num.intValue() : 1) < 4 ? "confirm_otp_response_wrong_code.json" : "confirm_otp_response_attempts_exhausted.json";
                } else {
                    str = "confirm_otp_response.json";
                }
                ConfirmOtpResponseBodyDto confirmOtpResponseBodyDto = (ConfirmOtpResponseBodyDto) new Gson().d(c4234f7.d(str), ConfirmOtpResponseBodyDto.class);
                Intrinsics.checkNotNullExpressionValue(confirmOtpResponseBodyDto, "confirmOtpResponseBodyDto");
                Response success = Response.success(confirmOtpResponseBodyDto);
                Intrinsics.checkNotNullExpressionValue(success, "success(successfulResponseBody)");
                return success;
            }
        }
        cp2 = new Cp(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = cp2.f28785f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cp2.f28787h;
        if (i11 != 0) {
        }
        otpHash = confirmOtpRequestBody.getOtpHash();
        C4512op c4512op2 = c4234f7.f31009b;
        if (Intrinsics.d(otpHash, C4512op.a("119950526"))) {
        }
        ConfirmOtpResponseBodyDto confirmOtpResponseBodyDto2 = (ConfirmOtpResponseBodyDto) new Gson().d(c4234f7.d(str), ConfirmOtpResponseBodyDto.class);
        Intrinsics.checkNotNullExpressionValue(confirmOtpResponseBodyDto2, "confirmOtpResponseBodyDto");
        Response success2 = Response.success(confirmOtpResponseBodyDto2);
        Intrinsics.checkNotNullExpressionValue(success2, "success(successfulResponseBody)");
        return success2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Ve.Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(CreateBindingOtpRequestBody createBindingOtpRequestBody, kotlin.coroutines.d dVar) {
        C4253fq c4253fq;
        int i11;
        C4234f7 c4234f7;
        if (dVar instanceof C4253fq) {
            c4253fq = (C4253fq) dVar;
            int i12 = c4253fq.f31062g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4253fq.f31062g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4253fq.f31060e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4253fq.f31062g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    c4253fq.f31059d = this;
                    c4253fq.f31062g = 1;
                    if (xe.Y.b(2000L, c4253fq) == aVar) {
                        return aVar;
                    }
                    c4234f7 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4234f7 = c4253fq.f31059d;
                    Sc.s.b(obj);
                }
                CreateBindingOtpResponseBodyDto createBindingResponseBodyDto = (CreateBindingOtpResponseBodyDto) new Gson().d(c4234f7.d("create_binding_otp_response.json"), CreateBindingOtpResponseBodyDto.class);
                Intrinsics.checkNotNullExpressionValue(createBindingResponseBodyDto, "createBindingResponseBodyDto");
                Response success = Response.success(createBindingResponseBodyDto);
                Intrinsics.checkNotNullExpressionValue(success, "success(successfulResponseBody)");
                return success;
            }
        }
        c4253fq = new C4253fq(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = c4253fq.f31060e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4253fq.f31062g;
        if (i11 != 0) {
        }
        CreateBindingOtpResponseBodyDto createBindingResponseBodyDto2 = (CreateBindingOtpResponseBodyDto) new Gson().d(c4234f7.d("create_binding_otp_response.json"), CreateBindingOtpResponseBodyDto.class);
        Intrinsics.checkNotNullExpressionValue(createBindingResponseBodyDto2, "createBindingResponseBodyDto");
        Response success2 = Response.success(createBindingResponseBodyDto2);
        Intrinsics.checkNotNullExpressionValue(success2, "success(successfulResponseBody)");
        return success2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // Ve.Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(CreateOtpSdkRequestBody createOtpSdkRequestBody, kotlin.coroutines.d dVar) {
        Fq fq;
        int i11;
        int intValue;
        C4234f7 c4234f7;
        Integer num;
        String str;
        if (dVar instanceof Fq) {
            fq = (Fq) dVar;
            int i12 = fq.f29027g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                fq.f29027g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = fq.f29025e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = fq.f29027g;
                LinkedHashMap linkedHashMap = f31007d;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (linkedHashMap.get("createOtpSdk") == null) {
                        intValue = 1;
                    } else {
                        Object obj2 = linkedHashMap.get("createOtpSdk");
                        Intrinsics.f(obj2);
                        intValue = ((Number) obj2).intValue() + 1;
                    }
                    linkedHashMap.put("createOtpSdk", new Integer(intValue));
                    fq.f29024d = this;
                    fq.f29027g = 1;
                    if (xe.Y.b(1000L, fq) == aVar) {
                        return aVar;
                    }
                    c4234f7 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4234f7 = fq.f29024d;
                    Sc.s.b(obj);
                }
                Gson gson = new Gson();
                num = (Integer) linkedHashMap.get("createOtpSdk");
                if ((num != null ? num.intValue() : 1) >= 4) {
                    str = "create_otp_sdk_response.json";
                } else {
                    str = "create_otp_response_attempts_exhausted.json";
                }
                CreateOtpSdkResponseBodyDto createOtpSdkResponseBodyDto = (CreateOtpSdkResponseBodyDto) gson.d(c4234f7.d(str), CreateOtpSdkResponseBodyDto.class);
                Intrinsics.checkNotNullExpressionValue(createOtpSdkResponseBodyDto, "createOtpSdkResponseBodyDto");
                Response success = Response.success(createOtpSdkResponseBodyDto);
                Intrinsics.checkNotNullExpressionValue(success, "success(successfulResponseBody)");
                return success;
            }
        }
        fq = new Fq(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj3 = fq.f29025e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = fq.f29027g;
        LinkedHashMap linkedHashMap2 = f31007d;
        if (i11 != 0) {
        }
        Gson gson2 = new Gson();
        num = (Integer) linkedHashMap2.get("createOtpSdk");
        if ((num != null ? num.intValue() : 1) >= 4) {
        }
        CreateOtpSdkResponseBodyDto createOtpSdkResponseBodyDto2 = (CreateOtpSdkResponseBodyDto) gson2.d(c4234f7.d(str), CreateOtpSdkResponseBodyDto.class);
        Intrinsics.checkNotNullExpressionValue(createOtpSdkResponseBodyDto2, "createOtpSdkResponseBodyDto");
        Response success2 = Response.success(createOtpSdkResponseBodyDto2);
        Intrinsics.checkNotNullExpressionValue(success2, "success(successfulResponseBody)");
        return success2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Ve.Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ListOfCardsRequestBody listOfCardsRequestBody, kotlin.coroutines.d dVar) {
        N0 n02;
        int i11;
        C4234f7 c4234f7;
        if (dVar instanceof N0) {
            n02 = (N0) dVar;
            int i12 = n02.f29513g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                n02.f29513g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = n02.f29511e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = n02.f29513g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    n02.f29510d = this;
                    n02.f29513g = 1;
                    if (xe.Y.b(2000L, n02) == aVar) {
                        return aVar;
                    }
                    c4234f7 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4234f7 = n02.f29510d;
                    Sc.s.b(obj);
                }
                ListOfCardsResponseBodyDto listOfCardsResponseBodyDto = (ListOfCardsResponseBodyDto) new Gson().d(c4234f7.d("payment_accounts.json"), ListOfCardsResponseBodyDto.class);
                Intrinsics.checkNotNullExpressionValue(listOfCardsResponseBodyDto, "listOfCardsResponseBodyDto");
                Response success = Response.success(listOfCardsResponseBodyDto);
                Intrinsics.checkNotNullExpressionValue(success, "success(successfulResponseBody)");
                return success;
            }
        }
        n02 = new N0(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = n02.f29511e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = n02.f29513g;
        if (i11 != 0) {
        }
        ListOfCardsResponseBodyDto listOfCardsResponseBodyDto2 = (ListOfCardsResponseBodyDto) new Gson().d(c4234f7.d("payment_accounts.json"), ListOfCardsResponseBodyDto.class);
        Intrinsics.checkNotNullExpressionValue(listOfCardsResponseBodyDto2, "listOfCardsResponseBodyDto");
        Response success2 = Response.success(listOfCardsResponseBodyDto2);
        Intrinsics.checkNotNullExpressionValue(success2, "success(successfulResponseBody)");
        return success2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Ve.Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PayBindingRequestBody payBindingRequestBody, kotlin.coroutines.d dVar) {
        A5 a52;
        int i11;
        C4234f7 c4234f7;
        if (dVar instanceof A5) {
            a52 = (A5) dVar;
            int i12 = a52.f28580g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                a52.f28580g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = a52.f28578e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = a52.f28580g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    a52.f28577d = this;
                    a52.f28580g = 1;
                    if (xe.Y.b(2000L, a52) == aVar) {
                        return aVar;
                    }
                    c4234f7 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4234f7 = a52.f28577d;
                    Sc.s.b(obj);
                }
                Unit unit = Unit.f71690a;
                c4234f7.getClass();
                Response success = Response.success(unit);
                Intrinsics.checkNotNullExpressionValue(success, "success(successfulResponseBody)");
                return success;
            }
        }
        a52 = new A5(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = a52.f28578e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = a52.f28580g;
        if (i11 != 0) {
        }
        Unit unit2 = Unit.f71690a;
        c4234f7.getClass();
        Response success2 = Response.success(unit2);
        Intrinsics.checkNotNullExpressionValue(success2, "success(successfulResponseBody)");
        return success2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Ve.Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PayOnlineRequestBody payOnlineRequestBody, kotlin.coroutines.d dVar) {
        C4256g0 c4256g0;
        int i11;
        C4234f7 c4234f7;
        if (dVar instanceof C4256g0) {
            c4256g0 = (C4256g0) dVar;
            int i12 = c4256g0.f31070g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4256g0.f31070g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4256g0.f31068e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4256g0.f31070g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    c4256g0.f31067d = this;
                    c4256g0.f31070g = 1;
                    if (xe.Y.b(2000L, c4256g0) == aVar) {
                        return aVar;
                    }
                    c4234f7 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4234f7 = c4256g0.f31067d;
                    Sc.s.b(obj);
                }
                c4234f7.getClass();
                c("fraudMon");
                Response success = Response.success(Unit.f71690a);
                Intrinsics.checkNotNullExpressionValue(success, "success(successfulResponseBody)");
                return success;
            }
        }
        c4256g0 = new C4256g0(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = c4256g0.f31068e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4256g0.f31070g;
        if (i11 != 0) {
        }
        c4234f7.getClass();
        c("fraudMon");
        Response success2 = Response.success(Unit.f71690a);
        Intrinsics.checkNotNullExpressionValue(success2, "success(successfulResponseBody)");
        return success2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Ve.Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, kotlin.coroutines.d dVar) {
        C4772y c4772y;
        int i11;
        C4234f7 c4234f7;
        if (dVar instanceof C4772y) {
            c4772y = (C4772y) dVar;
            int i12 = c4772y.f32521g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4772y.f32521g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4772y.f32519e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4772y.f32521g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    c4772y.f32518d = this;
                    c4772y.f32521g = 1;
                    if (xe.Y.b(2000L, c4772y) == aVar) {
                        return aVar;
                    }
                    c4234f7 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4234f7 = c4772y.f32518d;
                    Sc.s.b(obj);
                }
                PartsPaymentPlanBnplResponseBodyDto paymentPlanBnplResponseBodyDto = (PartsPaymentPlanBnplResponseBodyDto) new Gson().d(c4234f7.d("parts_payment_bnpl_plan.json"), PartsPaymentPlanBnplResponseBodyDto.class);
                Intrinsics.checkNotNullExpressionValue(paymentPlanBnplResponseBodyDto, "paymentPlanBnplResponseBodyDto");
                Response success = Response.success(paymentPlanBnplResponseBodyDto);
                Intrinsics.checkNotNullExpressionValue(success, "success(successfulResponseBody)");
                return success;
            }
        }
        c4772y = new C4772y(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = c4772y.f32519e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4772y.f32521g;
        if (i11 != 0) {
        }
        PartsPaymentPlanBnplResponseBodyDto paymentPlanBnplResponseBodyDto2 = (PartsPaymentPlanBnplResponseBodyDto) new Gson().d(c4234f7.d("parts_payment_bnpl_plan.json"), PartsPaymentPlanBnplResponseBodyDto.class);
        Intrinsics.checkNotNullExpressionValue(paymentPlanBnplResponseBodyDto2, "paymentPlanBnplResponseBodyDto");
        Response success2 = Response.success(paymentPlanBnplResponseBodyDto2);
        Intrinsics.checkNotNullExpressionValue(success2, "success(successfulResponseBody)");
        return success2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Ve.Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PaymentOrderRequestBody paymentOrderRequestBody, kotlin.coroutines.d dVar) {
        C4603s1 c4603s1;
        int i11;
        C4234f7 c4234f7;
        if (dVar instanceof C4603s1) {
            c4603s1 = (C4603s1) dVar;
            int i12 = c4603s1.f31999g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4603s1.f31999g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4603s1.f31997e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4603s1.f31999g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    c4603s1.f31996d = this;
                    c4603s1.f31999g = 1;
                    if (xe.Y.b(2000L, c4603s1) == aVar) {
                        return aVar;
                    }
                    c4234f7 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4234f7 = c4603s1.f31996d;
                    Sc.s.b(obj);
                }
                PaymentOrderResponseBodyDto paymentOrderResponseDto = (PaymentOrderResponseBodyDto) new Gson().d(c4234f7.d("payment_order_sdk.json"), PaymentOrderResponseBodyDto.class);
                Intrinsics.checkNotNullExpressionValue(paymentOrderResponseDto, "paymentOrderResponseDto");
                Response success = Response.success(paymentOrderResponseDto);
                Intrinsics.checkNotNullExpressionValue(success, "success(successfulResponseBody)");
                return success;
            }
        }
        c4603s1 = new C4603s1(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = c4603s1.f31997e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4603s1.f31999g;
        if (i11 != 0) {
        }
        PaymentOrderResponseBodyDto paymentOrderResponseDto2 = (PaymentOrderResponseBodyDto) new Gson().d(c4234f7.d("payment_order_sdk.json"), PaymentOrderResponseBodyDto.class);
        Intrinsics.checkNotNullExpressionValue(paymentOrderResponseDto2, "paymentOrderResponseDto");
        Response success2 = Response.success(paymentOrderResponseDto2);
        Intrinsics.checkNotNullExpressionValue(success2, "success(successfulResponseBody)");
        return success2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Ve.Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PaymentTokenRequestBody paymentTokenRequestBody, kotlin.coroutines.d dVar) {
        D2 d22;
        int i11;
        C4234f7 c4234f7;
        if (dVar instanceof D2) {
            d22 = (D2) dVar;
            int i12 = d22.f28818g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                d22.f28818g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = d22.f28816e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = d22.f28818g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    d22.f28815d = this;
                    d22.f28818g = 1;
                    if (xe.Y.b(2000L, d22) == aVar) {
                        return aVar;
                    }
                    c4234f7 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4234f7 = d22.f28815d;
                    Sc.s.b(obj);
                }
                c4234f7.getClass();
                c("fraudMon");
                PaymentTokenResponseBodyDto paymentTokenDto = (PaymentTokenResponseBodyDto) new Gson().d(c4234f7.d("payment_token.json"), PaymentTokenResponseBodyDto.class);
                Intrinsics.checkNotNullExpressionValue(paymentTokenDto, "paymentTokenDto");
                Response success = Response.success(paymentTokenDto);
                Intrinsics.checkNotNullExpressionValue(success, "success(successfulResponseBody)");
                return success;
            }
        }
        d22 = new D2(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = d22.f28816e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = d22.f28818g;
        if (i11 != 0) {
        }
        c4234f7.getClass();
        c("fraudMon");
        PaymentTokenResponseBodyDto paymentTokenDto2 = (PaymentTokenResponseBodyDto) new Gson().d(c4234f7.d("payment_token.json"), PaymentTokenResponseBodyDto.class);
        Intrinsics.checkNotNullExpressionValue(paymentTokenDto2, "paymentTokenDto");
        Response success2 = Response.success(paymentTokenDto2);
        Intrinsics.checkNotNullExpressionValue(success2, "success(successfulResponseBody)");
        return success2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Ve.Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SessionIdRequestBody sessionIdRequestBody, kotlin.coroutines.d dVar) {
        J3 j32;
        int i11;
        C4234f7 c4234f7;
        if (dVar instanceof J3) {
            j32 = (J3) dVar;
            int i12 = j32.f29264g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                j32.f29264g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = j32.f29262e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = j32.f29264g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    f31007d.clear();
                    j32.f29261d = this;
                    j32.f29264g = 1;
                    if (xe.Y.b(2000L, j32) == aVar) {
                        return aVar;
                    }
                    c4234f7 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4234f7 = j32.f29261d;
                    Sc.s.b(obj);
                }
                SessionIdResponseBodyDto sessionIdResponseBodyDto = (SessionIdResponseBodyDto) new Gson().d(c4234f7.d("session_id_response.json"), SessionIdResponseBodyDto.class);
                Intrinsics.checkNotNullExpressionValue(sessionIdResponseBodyDto, "sessionIdResponseBodyDto");
                Response success = Response.success(sessionIdResponseBodyDto);
                Intrinsics.checkNotNullExpressionValue(success, "success(successfulResponseBody)");
                return success;
            }
        }
        j32 = new J3(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = j32.f29262e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = j32.f29264g;
        if (i11 != 0) {
        }
        SessionIdResponseBodyDto sessionIdResponseBodyDto2 = (SessionIdResponseBodyDto) new Gson().d(c4234f7.d("session_id_response.json"), SessionIdResponseBodyDto.class);
        Intrinsics.checkNotNullExpressionValue(sessionIdResponseBodyDto2, "sessionIdResponseBodyDto");
        Response success2 = Response.success(sessionIdResponseBodyDto2);
        Intrinsics.checkNotNullExpressionValue(success2, "success(successfulResponseBody)");
        return success2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Ve.Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SpasiboBonusesRequestBody spasiboBonusesRequestBody, kotlin.coroutines.d dVar) {
        U4 u42;
        int i11;
        C4234f7 c4234f7;
        if (dVar instanceof U4) {
            u42 = (U4) dVar;
            int i12 = u42.f30100g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                u42.f30100g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = u42.f30098e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = u42.f30100g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    u42.f30097d = this;
                    u42.f30100g = 1;
                    if (xe.Y.b(2000L, u42) == aVar) {
                        return aVar;
                    }
                    c4234f7 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4234f7 = u42.f30097d;
                    Sc.s.b(obj);
                }
                String str = "order_spasibo_bonuses_response_v2.json";
                if (!Lf.a.u0(c4234f7.f31010c, Qk.f29795c)) {
                    Qk qk2 = Qk.f29794b;
                    C4248fl c4248fl = c4234f7.f31010c;
                    if (!Lf.a.u0(c4248fl, qk2)) {
                        if (!Lf.a.u0(c4248fl, Qk.f29793a)) {
                            throw new IllegalArgumentException("SBonuses Feature disabled");
                        }
                        str = "order_spasibo_bonuses_response_v1.json";
                    }
                }
                SpasiboBonusesResponseBodyDto spasiboBonusesResponseBodyDto = (SpasiboBonusesResponseBodyDto) new Gson().d(c4234f7.d(str), SpasiboBonusesResponseBodyDto.class);
                Intrinsics.checkNotNullExpressionValue(spasiboBonusesResponseBodyDto, "spasiboBonusesResponseBodyDto");
                Response success = Response.success(spasiboBonusesResponseBodyDto);
                Intrinsics.checkNotNullExpressionValue(success, "success(successfulResponseBody)");
                return success;
            }
        }
        u42 = new U4(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = u42.f30098e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = u42.f30100g;
        if (i11 != 0) {
        }
        String str2 = "order_spasibo_bonuses_response_v2.json";
        if (!Lf.a.u0(c4234f7.f31010c, Qk.f29795c)) {
        }
        SpasiboBonusesResponseBodyDto spasiboBonusesResponseBodyDto2 = (SpasiboBonusesResponseBodyDto) new Gson().d(c4234f7.d(str2), SpasiboBonusesResponseBodyDto.class);
        Intrinsics.checkNotNullExpressionValue(spasiboBonusesResponseBodyDto2, "spasiboBonusesResponseBodyDto");
        Response success2 = Response.success(spasiboBonusesResponseBodyDto2);
        Intrinsics.checkNotNullExpressionValue(success2, "success(successfulResponseBody)");
        return success2;
    }
}
