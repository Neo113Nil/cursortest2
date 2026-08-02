package Ve;

import Ae.C2399j;
import We.G;
import android.os.Build;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import java.util.UUID;
import kg.C7676a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import retrofit2.Invocation;
import spay.sdk.R;
import spay.sdk.data.dto.response.binding.BindingV3SessionResponseBodyDtoKt;
import spay.sdk.domain.model.MerchantData;

/* renamed from: Ve.zi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4819zi implements InterfaceC4589rg {

    /* renamed from: a, reason: collision with root package name */
    public final C4806z5 f32665a;

    /* renamed from: b, reason: collision with root package name */
    public final Y4 f32666b;

    /* renamed from: c, reason: collision with root package name */
    public final Vm f32667c;

    /* renamed from: d, reason: collision with root package name */
    public final V0 f32668d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4436m7 f32669e;

    public C4819zi(C4806z5 resourceManager, Y4 setCookieHandler, Vm sPayDataContract, V0 xPodStickyHandler, InterfaceC4436m7 userIdManager) {
        Intrinsics.checkNotNullParameter(resourceManager, "resourceManager");
        Intrinsics.checkNotNullParameter(setCookieHandler, "setCookieHandler");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(xPodStickyHandler, "xPodStickyHandler");
        Intrinsics.checkNotNullParameter(userIdManager, "userIdManager");
        this.f32665a = resourceManager;
        this.f32666b = setCookieHandler;
        this.f32667c = sPayDataContract;
        this.f32668d = xPodStickyHandler;
        this.f32669e = userIdManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(G.a aVar, boolean z11, kotlin.coroutines.jvm.internal.c cVar) {
        Tg tg2;
        int i11;
        if (cVar instanceof Tg) {
            tg2 = (Tg) cVar;
            int i12 = tg2.f30051g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                tg2.f30051g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = tg2.f30049e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = tg2.f30051g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    tg2.f30048d = aVar;
                    tg2.f30051g = 1;
                    obj = this.f32666b.b(z11, tg2);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = tg2.f30048d;
                    Sc.s.b(obj);
                }
                aVar.a("Cookie", (String) obj);
                return aVar;
            }
        }
        tg2 = new Tg(this, cVar);
        Object obj2 = tg2.f30049e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = tg2.f30051g;
        if (i11 != 0) {
        }
        aVar.a("Cookie", (String) obj2);
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(We.G g10, kotlin.coroutines.jvm.internal.c cVar) {
        C4818zh c4818zh;
        Wc.a aVar;
        int i11;
        Vm vm;
        C4819zi c4819zi;
        C4819zi c4819zi2;
        C4819zi c4819zi3;
        C4819zi c4819zi4;
        C4819zi c4819zi5;
        We.G g11;
        C4819zi c4819zi6;
        String str;
        MerchantData i12;
        String str2;
        String source;
        String orderNumber;
        String str3;
        String merchantLogin;
        String str4;
        String str5;
        boolean z11;
        boolean z12;
        Object b11;
        G.a aVar2;
        String str6;
        String authorization;
        if (cVar instanceof C4818zh) {
            c4818zh = (C4818zh) cVar;
            int i13 = c4818zh.f32664n;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4818zh.f32664n = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4818zh.f32662l;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4818zh.f32664n;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    g10.getClass();
                    G.a aVar3 = new G.a(g10);
                    boolean z13 = Intrinsics.d(M1.b.l(g10), "sessionId") || Intrinsics.d(M1.b.l(g10), "sdkAuth") || Intrinsics.d(M1.b.l(g10), "revokeTokenSdk");
                    c4818zh.f32654d = this;
                    c4818zh.f32655e = g10;
                    vm = this.f32667c;
                    c4818zh.f32656f = vm;
                    c4818zh.f32657g = this;
                    c4818zh.f32658h = this;
                    c4818zh.f32659i = this;
                    c4818zh.f32660j = this;
                    c4818zh.f32661k = this;
                    c4818zh.f32664n = 1;
                    obj = a(aVar3, z13, c4818zh);
                    if (obj != aVar) {
                        c4819zi = this;
                        c4819zi2 = c4819zi;
                        c4819zi3 = c4819zi2;
                        c4819zi4 = c4819zi3;
                        c4819zi5 = c4819zi4;
                        g11 = g10;
                        c4819zi6 = c4819zi5;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (G.a) c4818zh.f32655e;
                    str6 = (String) c4818zh.f32654d;
                    Sc.s.b(obj);
                    aVar2.a(str6, (String) obj);
                    return aVar2.b();
                }
                c4819zi6 = c4818zh.f32661k;
                c4819zi = c4818zh.f32660j;
                c4819zi3 = c4818zh.f32659i;
                c4819zi4 = c4818zh.f32658h;
                c4819zi5 = c4818zh.f32657g;
                vm = c4818zh.f32656f;
                g11 = (We.G) c4818zh.f32655e;
                c4819zi2 = (C4819zi) c4818zh.f32654d;
                Sc.s.b(obj);
                G.a aVar4 = (G.a) obj;
                C4654tn c4654tn = (C4654tn) vm;
                str = c4654tn.f32153v;
                c4819zi5.getClass();
                if (str == null) {
                    str = "";
                }
                aVar4.d("appName", str);
                i12 = c4654tn.i();
                if (i12 != null && (authorization = i12.getAuthorization()) != null) {
                    c4819zi2.getClass();
                    str2 = kotlin.text.h.X(kotlin.text.h.X(kotlin.text.h.X(kotlin.text.h.X(kotlin.text.h.z0(authorization).toString(), "\u200b", "", false), "\ufeff", "", false), "\n", "", false), "\r", "", false);
                    if (str2.length() > 0) {
                        int i14 = 0;
                        while (i14 < str2.length()) {
                            char charAt = str2.charAt(i14);
                            int i15 = i14;
                            if (' ' <= charAt && charAt < 127) {
                                i14 = i15 + 1;
                            }
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        aVar4.a("Authorization", str2);
                        String uuid = UUID.randomUUID().toString();
                        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                        aVar4.a("RqUID", kotlin.text.h.X(uuid, "-", "", false));
                        c4819zi2.getClass();
                        source = ig.s.q1().E1(ig.p.e("UTC")).n1(C7676a.e("yyyy-MM-dd'T'HH:mm:ssXXX"));
                        Intrinsics.checkNotNullExpressionValue(source, "source");
                        if (kotlin.text.h.u(source, 'Z')) {
                            source = U7.d.e(kotlin.text.h.q0(source.length() - 1, source), "+00:00");
                        }
                        aVar4.a("UserTm", source);
                        aVar4.a("Accept-Language", "RU");
                        MerchantData i16 = c4654tn.i();
                        orderNumber = i16 != null ? i16.getOrderNumber() : null;
                        if (orderNumber == null) {
                            orderNumber = "";
                        }
                        aVar4.a("orderNumber", orderNumber);
                        int i17 = R.string.spay_OsType;
                        String RELEASE = Build.VERSION.RELEASE;
                        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                        aVar4.a("OS", c4819zi2.f32665a.a(i17, RELEASE));
                        aVar4.a("deviceName", Build.MANUFACTURER + " " + Build.MODEL);
                        aVar4.a("x-b3-spanid", c4654tn.f32133b.f29383b);
                        aVar4.a("x-b3-traceid", c4654tn.f32133b.f29382a);
                        aVar4.a("sdkVersion", "3.1.3");
                        str3 = c4654tn.f32144m;
                        if (str3 == null) {
                            str3 = "";
                        }
                        aVar4.a("X-Net-Add-Source", str3);
                        MerchantData i18 = c4654tn.i();
                        merchantLogin = i18 != null ? i18.getMerchantLogin() : null;
                        if (merchantLogin == null) {
                            merchantLogin = "";
                        }
                        aVar4.a("merchantLogin", merchantLogin);
                        str4 = (String) C2399j.b(c4654tn.f32157z).getValue();
                        c4819zi4.getClass();
                        if (str4 != null && str4.length() != 0) {
                            aVar4.a("localSessionId", str4);
                        }
                        String str7 = c4819zi2.f32668d.f30169a;
                        str5 = str7 != null ? str7 : "";
                        c4819zi3.getClass();
                        if (str5.length() != 0) {
                            aVar4.a("x-pod-sticky", str5);
                        }
                        z11 = !Intrinsics.d(M1.b.l(g11), "payOnline") || Intrinsics.d(M1.b.l(g11), "listCards") || Intrinsics.d(M1.b.l(g11), "revokeTokenSdk") || Intrinsics.d(M1.b.l(g11), "sessionId") || Intrinsics.d(M1.b.l(g11), "paymentToken") || Intrinsics.d(M1.b.l(g11), "token-exchange") || Intrinsics.d(M1.b.l(g11), "listPaymentAccounts") || Intrinsics.d(M1.b.l(g11), "bindingSession") || Intrinsics.d(M1.b.l(g11), "createBindingOtp") || Intrinsics.d(M1.b.l(g11), "confirmBindingOtp") || Intrinsics.d(M1.b.l(g11), BindingV3SessionResponseBodyDtoKt.CHECK_RESULT_BALANCE_CHECK_FIELD);
                        c4819zi.getClass();
                        if (z11) {
                            aVar4.a("X-System-Id", M1.b.m("U0JFUlBBWV9TREs="));
                        }
                        z12 = !Intrinsics.d(M1.b.l(g11), "bindingSession") || Intrinsics.d(M1.b.l(g11), "createBindingOtp") || Intrinsics.d(M1.b.l(g11), "confirmBindingOtp") || Intrinsics.d(M1.b.l(g11), "checkBinding") || Intrinsics.d(M1.b.l(g11), BindingV3SessionResponseBodyDtoKt.CHECK_RESULT_BALANCE_CHECK_FIELD);
                        c4819zi6.getClass();
                        if (z12) {
                            aVar4.a("X-channel", "app");
                        }
                        c4818zh.f32654d = "userId";
                        c4818zh.f32655e = aVar4;
                        c4818zh.f32656f = null;
                        c4818zh.f32657g = null;
                        c4818zh.f32658h = null;
                        c4818zh.f32659i = null;
                        c4818zh.f32660j = null;
                        c4818zh.f32661k = null;
                        c4818zh.f32664n = 2;
                        b11 = ((C4180da) c4819zi2.f32669e).b(c4818zh);
                        if (b11 != aVar) {
                            obj = b11;
                            aVar2 = aVar4;
                            str6 = "userId";
                            aVar2.a(str6, (String) obj);
                            return aVar2.b();
                        }
                        return aVar;
                    }
                }
                str2 = null;
                if (str2 == null) {
                }
                aVar4.a("Authorization", str2);
                String uuid2 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid2, "randomUUID().toString()");
                aVar4.a("RqUID", kotlin.text.h.X(uuid2, "-", "", false));
                c4819zi2.getClass();
                source = ig.s.q1().E1(ig.p.e("UTC")).n1(C7676a.e("yyyy-MM-dd'T'HH:mm:ssXXX"));
                Intrinsics.checkNotNullExpressionValue(source, "source");
                if (kotlin.text.h.u(source, 'Z')) {
                }
                aVar4.a("UserTm", source);
                aVar4.a("Accept-Language", "RU");
                MerchantData i162 = c4654tn.i();
                if (i162 != null) {
                }
                if (orderNumber == null) {
                }
                aVar4.a("orderNumber", orderNumber);
                int i172 = R.string.spay_OsType;
                String RELEASE2 = Build.VERSION.RELEASE;
                Intrinsics.checkNotNullExpressionValue(RELEASE2, "RELEASE");
                aVar4.a("OS", c4819zi2.f32665a.a(i172, RELEASE2));
                aVar4.a("deviceName", Build.MANUFACTURER + " " + Build.MODEL);
                aVar4.a("x-b3-spanid", c4654tn.f32133b.f29383b);
                aVar4.a("x-b3-traceid", c4654tn.f32133b.f29382a);
                aVar4.a("sdkVersion", "3.1.3");
                str3 = c4654tn.f32144m;
                if (str3 == null) {
                }
                aVar4.a("X-Net-Add-Source", str3);
                MerchantData i182 = c4654tn.i();
                if (i182 != null) {
                }
                if (merchantLogin == null) {
                }
                aVar4.a("merchantLogin", merchantLogin);
                str4 = (String) C2399j.b(c4654tn.f32157z).getValue();
                c4819zi4.getClass();
                if (str4 != null) {
                    aVar4.a("localSessionId", str4);
                }
                String str72 = c4819zi2.f32668d.f30169a;
                if (str72 != null) {
                }
                c4819zi3.getClass();
                if (str5.length() != 0) {
                }
                if (Intrinsics.d(M1.b.l(g11), "payOnline")) {
                }
                c4819zi.getClass();
                if (z11) {
                }
                if (Intrinsics.d(M1.b.l(g11), "bindingSession")) {
                }
                c4819zi6.getClass();
                if (z12) {
                }
                c4818zh.f32654d = "userId";
                c4818zh.f32655e = aVar4;
                c4818zh.f32656f = null;
                c4818zh.f32657g = null;
                c4818zh.f32658h = null;
                c4818zh.f32659i = null;
                c4818zh.f32660j = null;
                c4818zh.f32661k = null;
                c4818zh.f32664n = 2;
                b11 = ((C4180da) c4819zi2.f32669e).b(c4818zh);
                if (b11 != aVar) {
                }
                return aVar;
            }
        }
        c4818zh = new C4818zh(this, cVar);
        Object obj2 = c4818zh.f32662l;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4818zh.f32664n;
        if (i11 != 0) {
        }
        G.a aVar42 = (G.a) obj2;
        C4654tn c4654tn2 = (C4654tn) vm;
        str = c4654tn2.f32153v;
        c4819zi5.getClass();
        if (str == null) {
        }
        aVar42.d("appName", str);
        i12 = c4654tn2.i();
        if (i12 != null) {
            c4819zi2.getClass();
            str2 = kotlin.text.h.X(kotlin.text.h.X(kotlin.text.h.X(kotlin.text.h.X(kotlin.text.h.z0(authorization).toString(), "\u200b", "", false), "\ufeff", "", false), "\n", "", false), "\r", "", false);
            if (str2.length() > 0) {
            }
        }
        str2 = null;
        if (str2 == null) {
        }
        aVar42.a("Authorization", str2);
        String uuid22 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid22, "randomUUID().toString()");
        aVar42.a("RqUID", kotlin.text.h.X(uuid22, "-", "", false));
        c4819zi2.getClass();
        source = ig.s.q1().E1(ig.p.e("UTC")).n1(C7676a.e("yyyy-MM-dd'T'HH:mm:ssXXX"));
        Intrinsics.checkNotNullExpressionValue(source, "source");
        if (kotlin.text.h.u(source, 'Z')) {
        }
        aVar42.a("UserTm", source);
        aVar42.a("Accept-Language", "RU");
        MerchantData i1622 = c4654tn2.i();
        if (i1622 != null) {
        }
        if (orderNumber == null) {
        }
        aVar42.a("orderNumber", orderNumber);
        int i1722 = R.string.spay_OsType;
        String RELEASE22 = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE22, "RELEASE");
        aVar42.a("OS", c4819zi2.f32665a.a(i1722, RELEASE22));
        aVar42.a("deviceName", Build.MANUFACTURER + " " + Build.MODEL);
        aVar42.a("x-b3-spanid", c4654tn2.f32133b.f29383b);
        aVar42.a("x-b3-traceid", c4654tn2.f32133b.f29382a);
        aVar42.a("sdkVersion", "3.1.3");
        str3 = c4654tn2.f32144m;
        if (str3 == null) {
        }
        aVar42.a("X-Net-Add-Source", str3);
        MerchantData i1822 = c4654tn2.i();
        if (i1822 != null) {
        }
        if (merchantLogin == null) {
        }
        aVar42.a("merchantLogin", merchantLogin);
        str4 = (String) C2399j.b(c4654tn2.f32157z).getValue();
        c4819zi4.getClass();
        if (str4 != null) {
        }
        String str722 = c4819zi2.f32668d.f30169a;
        if (str722 != null) {
        }
        c4819zi3.getClass();
        if (str5.length() != 0) {
        }
        if (Intrinsics.d(M1.b.l(g11), "payOnline")) {
        }
        c4819zi.getClass();
        if (z11) {
        }
        if (Intrinsics.d(M1.b.l(g11), "bindingSession")) {
        }
        c4819zi6.getClass();
        if (z12) {
        }
        c4818zh.f32654d = "userId";
        c4818zh.f32655e = aVar42;
        c4818zh.f32656f = null;
        c4818zh.f32657g = null;
        c4818zh.f32658h = null;
        c4818zh.f32659i = null;
        c4818zh.f32660j = null;
        c4818zh.f32661k = null;
        c4818zh.f32664n = 2;
        b11 = ((C4180da) c4819zi2.f32669e).b(c4818zh);
        if (b11 != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(We.L response, kotlin.coroutines.jvm.internal.c cVar) {
        Zh zh2;
        int i11;
        C4819zi c4819zi;
        String c11;
        if (cVar instanceof Zh) {
            zh2 = (Zh) cVar;
            int i12 = zh2.f30601h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                zh2.f30601h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = zh2.f30599f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = zh2.f30601h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    zh2.f30597d = this;
                    zh2.f30598e = response;
                    zh2.f30601h = 1;
                    Y4 y42 = this.f32666b;
                    y42.getClass();
                    String valueOf = String.valueOf((List) response.r().i().get("set-cookie"));
                    Intrinsics.checkNotNullParameter(valueOf, "<this>");
                    Regex regexPattern = y42.f30434c;
                    Intrinsics.checkNotNullParameter(regexPattern, "regexPattern");
                    List C11 = kotlin.sequences.l.C(Regex.d(regexPattern, valueOf));
                    Invocation invocation = (Invocation) response.L().i(Invocation.class);
                    Object a11 = y42.a(C11, invocation != null ? invocation.method() : null, zh2);
                    if (a11 != aVar) {
                        a11 = Unit.f71690a;
                    }
                    if (a11 == aVar) {
                        return aVar;
                    }
                    c4819zi = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    response = zh2.f30598e;
                    c4819zi = zh2.f30597d;
                    Sc.s.b(obj);
                }
                V0 v02 = c4819zi.f32668d;
                v02.getClass();
                Intrinsics.checkNotNullParameter(response, "response");
                c11 = response.r().c("x-pod-sticky");
                if (c11 != null) {
                    v02.f30169a = c11;
                }
                return Unit.f71690a;
            }
        }
        zh2 = new Zh(this, cVar);
        Object obj2 = zh2.f30599f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = zh2.f30601h;
        if (i11 != 0) {
        }
        V0 v022 = c4819zi.f32668d;
        v022.getClass();
        Intrinsics.checkNotNullParameter(response, "response");
        c11 = response.r().c("x-pod-sticky");
        if (c11 != null) {
        }
        return Unit.f71690a;
    }
}
