package Lf;

import C.o0;
import Fm.C3051a;
import Ve.C4248fl;
import Ve.EnumC4290h5;
import Ve.InterfaceC4678ui;
import Ve.Qk;
import Ve.Z8;
import We.C4867i;
import android.content.Context;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mg.EnumC8145a;
import org.joda.time.Duration;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;
import spay.sdk.api.SPayMethod;
import spay.sdk.api.model.SPaymentRequest;

/* loaded from: classes10.dex */
public abstract class a implements c, mg.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17042a;

    public /* synthetic */ a(int i11) {
        this.f17042a = i11;
    }

    public static final boolean D0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 36) {
            List l11 = kotlin.text.h.l(str, new char[]{'-'}, 0, 6);
            if (l11.size() == 5) {
                ArrayList b12 = C7714v.b1(l11, C7714v.b0(8, 4, 4, 4, 12));
                if (!b12.isEmpty()) {
                    Iterator it = b12.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        String str2 = (String) pair.a();
                        int intValue = ((Number) pair.b()).intValue();
                        int i11 = 0;
                        for (int i12 = 0; i12 < str2.length(); i12++) {
                            if (Character.isLetterOrDigit(str2.charAt(i12))) {
                                i11++;
                            }
                        }
                        if (i11 == intValue) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static int b0(int i11, String str) {
        return G.g.a(i11, 31, str);
    }

    public static final String d0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!D0(str)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt != '-') {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static String l0(X509Certificate receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        C4867i.f33739d.getClass();
        return Nk.a.b("sha256/", C4867i.b.b(receiver).a());
    }

    public static void o0(spay.sdk.d dVar, Context context, String apiKey, String merchantLogin, String bankInvoiceId, String orderNumber, String appPackage, Function1 callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(merchantLogin, "merchantLogin");
        Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter("", "phoneNumber");
        Intrinsics.checkNotNullParameter(callback, "callback");
        dVar.a(SPayMethod.WithBonuses.INSTANCE, new SPaymentRequest(context, apiKey, bankInvoiceId, orderNumber, merchantLogin, appPackage, "", callback));
    }

    public static final boolean r0(C4248fl c4248fl, EnumC4290h5 tag, Z8 z82) {
        Intrinsics.checkNotNullParameter(c4248fl, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        c4248fl.getClass();
        Intrinsics.checkNotNullParameter(tag, "tag");
        InterfaceC4678ui interfaceC4678ui = (InterfaceC4678ui) c4248fl.f31050d.get(tag);
        return interfaceC4678ui != null && ((Boolean) interfaceC4678ui.b(z82)).booleanValue();
    }

    public static final boolean u0(C4248fl c4248fl, Qk option) {
        Intrinsics.checkNotNullParameter(c4248fl, "<this>");
        Intrinsics.checkNotNullParameter(option, "option");
        EnumC4290h5 tag = EnumC4290h5.S_BONUSES_PAYMENT;
        c4248fl.getClass();
        Intrinsics.checkNotNullParameter(tag, "tag");
        LinkedHashMap linkedHashMap = c4248fl.f31050d;
        InterfaceC4678ui interfaceC4678ui = (InterfaceC4678ui) linkedHashMap.get(tag);
        if (interfaceC4678ui == null) {
            EnumC4290h5 tag2 = EnumC4290h5.S_BONUSES_PAYMENT_V2;
            Intrinsics.checkNotNullParameter(tag2, "tag");
            interfaceC4678ui = (InterfaceC4678ui) linkedHashMap.get(tag2);
        }
        return interfaceC4678ui != null && ((Boolean) interfaceC4678ui.b(option)).booleanValue();
    }

    public PeriodType B(Duration duration) {
        return PeriodType.j();
    }

    @Override // mg.e
    public int Q(mg.h hVar) {
        return p(hVar).a(m(hVar), hVar);
    }

    public org.joda.time.a W(String str) {
        int i11 = org.joda.time.c.f79052b;
        return ISOChronology.g0();
    }

    public long X(Object obj, ISOChronology iSOChronology) {
        int i11 = org.joda.time.c.f79052b;
        return System.currentTimeMillis();
    }

    @Override // mg.e
    public Object d(mg.j jVar) {
        if (jVar == mg.i.g() || jVar == mg.i.a() || jVar == mg.i.e()) {
            return null;
        }
        return jVar.a(this);
    }

    @Override // mg.e
    public mg.m p(mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return hVar.g(this);
        }
        if (L(hVar)) {
            return ((EnumC8145a) hVar).d();
        }
        throw new mg.l(C3051a.c("Unsupported field: ", hVar));
    }

    public String toString() {
        switch (this.f17042a) {
            case 0:
                return o0.c(new StringBuilder("Converter["), v() == null ? "null" : v().getName(), "]");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(boolean z11) {
        this.f17042a = 17;
    }
}
