package M1;

import Lm0.a;
import Sc.o;
import Sc.r;
import Sc.s;
import Ve.C4265g9;
import Ve.C4304hj;
import Ve.C4439ma;
import Ve.C4632t1;
import Ve.C8;
import Ve.I9;
import Ve.Ip;
import Ve.Jj;
import Ve.Ki;
import Ve.O0;
import Ve.Oa;
import Ve.Sm;
import Ve.Vi;
import We.G;
import We.L;
import We.M;
import android.util.Base64;
import android.util.Patterns;
import com.google.gson.Gson;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import retrofit2.Response;
import spay.sdk.api.ErrorCode;
import spay.sdk.data.dto.response.SPayErrorDto;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;
import xe.I;

/* loaded from: classes8.dex */
public abstract class b implements f {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Ki e(FraudMonCheckResult fraudMonCheckResult, Vi fraudMonResultHandler) {
        Lf.a aVar;
        Intrinsics.checkNotNullParameter(fraudMonResultHandler, "fraudMonResultHandler");
        I9 i92 = I9.f29222b;
        if (fraudMonCheckResult != null) {
            if (Intrinsics.d(fraudMonCheckResult.getActionCode(), "REVIEW") && Intrinsics.d(fraudMonCheckResult.getConfirmMethodFactor(), "SMSP") && !fraudMonCheckResult.isClientBlock()) {
                aVar = new C4439ma(fraudMonCheckResult);
            } else if (Intrinsics.d(fraudMonCheckResult.getActionCode(), "REVIEW") && Intrinsics.d(fraudMonCheckResult.getConfirmMethodFactor(), "HINT") && !fraudMonCheckResult.isClientBlock()) {
                aVar = new Oa(fraudMonCheckResult);
            } else if (Intrinsics.d(fraudMonCheckResult.getActionCode(), "DENY") && !fraudMonCheckResult.isClientBlock()) {
                aVar = new C8(fraudMonCheckResult);
            } else if (Intrinsics.d(fraudMonCheckResult.getActionCode(), "DENY") && fraudMonCheckResult.isClientBlock()) {
                aVar = new C4265g9(fraudMonCheckResult);
            }
            if (!(!(!(aVar instanceof C8) ? true : aVar instanceof C4265g9) ? true : aVar instanceof C4439ma ? true : aVar instanceof Oa)) {
                return new C4632t1(aVar);
            }
            if (aVar.equals(i92)) {
                return new O0(new Sm("Системная или внутренняя ошибка"));
            }
            throw new o();
        }
        aVar = i92;
        if (!(!(!(aVar instanceof C8) ? true : aVar instanceof C4265g9) ? true : aVar instanceof C4439ma ? true : aVar instanceof Oa)) {
        }
    }

    public static final SPayErrorDto g(M m11) {
        return (SPayErrorDto) new Gson().c(m11 != null ? m11.charStream() : null, com.google.gson.reflect.a.get(SPayErrorDto.class));
    }

    public static final void h(G g10) {
        Object a11;
        Intrinsics.checkNotNullParameter(g10, "<this>");
        try {
            r.Companion companion = r.INSTANCE;
            a11 = Unit.f71690a;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            a.b bVar = Lm0.a.f17149a;
            bVar.b("READ BODY EXCEPTION");
            bVar.e(b11);
        }
    }

    public static final void i(L l11) {
        Object a11;
        Intrinsics.checkNotNullParameter(l11, "<this>");
        try {
            r.Companion companion = r.INSTANCE;
            a11 = Unit.f71690a;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            a.b bVar = Lm0.a.f17149a;
            bVar.b("READ BODY EXCEPTION");
            bVar.e(b11);
        }
    }

    public static final boolean j(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        return response.isSuccessful() && response.body() != null && response.errorBody() == null;
    }

    public static final String l(G g10) {
        Intrinsics.checkNotNullParameter(g10, "<this>");
        return (String) ((ArrayList) g10.j().l()).get(g10.j().m() - 1);
    }

    public static final String m(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] decoded = Base64.decode(str, 0);
        Intrinsics.checkNotNullExpressionValue(decoded, "decoded");
        return new String(decoded, Charsets.UTF_8);
    }

    public static final String n(String str) {
        if (Intrinsics.d(str, ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE)) {
            return null;
        }
        return str;
    }

    public static int o(String str) {
        String X9;
        Integer w02;
        if (str == null || (X9 = kotlin.text.h.X(str, " ", "", false)) == null || (w02 = kotlin.text.h.w0(X9)) == null) {
            return 0;
        }
        return w02.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, Ve.Jj] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, Ve.Jj] */
    /* JADX WARN: Type inference failed for: r9v3, types: [T, Ve.Jj] */
    public static final Jj p(String str) {
        IntRange d11;
        IntRange d12;
        Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
        K k11 = K.f71697a;
        m11.f71787a = new Jj("", k11, k11);
        String pattern = Patterns.WEB_URL.toString();
        Intrinsics.checkNotNullExpressionValue(pattern, "WEB_URL.toString()");
        String g10 = new Regex(pattern).g(str, new Ip(m11, 0));
        while (kotlin.text.h.t(g10, "<url=>", false) && kotlin.text.h.t(g10, "</url>", false)) {
            MatchResult b11 = new Regex("<url=>").b(0, g10);
            Integer valueOf = (b11 == null || (d12 = b11.d()) == null) ? null : Integer.valueOf(d12.getF71842a());
            Intrinsics.f(valueOf);
            int intValue = valueOf.intValue();
            MatchResult b12 = new Regex("</url>").b(0, g10);
            Integer valueOf2 = (b12 == null || (d11 = b12.d()) == null) ? null : Integer.valueOf(d11.getF71842a() - 6);
            Intrinsics.f(valueOf2);
            int intValue2 = valueOf2.intValue();
            g10 = kotlin.text.h.Z(kotlin.text.h.Z(g10, "<url=>", ""), "</url>", "");
            Jj jj2 = (Jj) m11.f71787a;
            ArrayList W02 = C7714v.W0(jj2.f29300c);
            W02.add(new C4304hj(intValue, intValue2));
            Unit unit = Unit.f71690a;
            m11.f71787a = Jj.a(jj2, null, null, W02, 3);
        }
        ?? a11 = Jj.a((Jj) m11.f71787a, g10, null, null, 6);
        m11.f71787a = a11;
        return a11;
    }

    public static final String q(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return "https://".concat(str);
    }

    @Override // M1.f
    public int a(int i11) {
        int s11 = s(i11);
        if (s11 == -1 || s(s11) == -1) {
            return -1;
        }
        return s11;
    }

    @Override // M1.f
    public int b(int i11) {
        int r11 = r(i11);
        if (r11 == -1 || r(r11) == -1) {
            return -1;
        }
        return r11;
    }

    @Override // M1.f
    public int c(int i11) {
        return s(i11);
    }

    @Override // M1.f
    public int d(int i11) {
        return r(i11);
    }

    public abstract Object f(Object obj, I i11, kotlin.coroutines.d dVar);

    public Object k(Object obj, I i11, kotlin.coroutines.d dVar) {
        Object f7 = f(obj, i11, dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    public abstract int r(int i11);

    public abstract int s(int i11);
}
