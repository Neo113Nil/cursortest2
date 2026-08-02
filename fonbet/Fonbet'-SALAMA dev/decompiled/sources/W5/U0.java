package W5;

import a.AbstractC0603a;
import io.sentry.ProfilingTraceData;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import n3.AbstractC1464a;

/* loaded from: classes2.dex */
public final class U0 {

    /* renamed from: g, reason: collision with root package name */
    public static final J0.a f7061g = new J0.a("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", 1);

    /* renamed from: a, reason: collision with root package name */
    public final Long f7062a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f7063b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f7064c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f7065d;

    /* renamed from: e, reason: collision with root package name */
    public final O1 f7066e;

    /* renamed from: f, reason: collision with root package name */
    public final C0500f0 f7067f;

    public U0(Map map, boolean z4, int i7, int i8) {
        O1 o12;
        C0500f0 c0500f0;
        this.f7062a = AbstractC0547v0.i(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, map);
        this.f7063b = AbstractC0547v0.b("waitForReady", map);
        Integer f7 = AbstractC0547v0.f("maxResponseMessageBytes", map);
        this.f7064c = f7;
        if (f7 != null) {
            p3.f.h(f7.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", f7);
        }
        Integer f8 = AbstractC0547v0.f("maxRequestMessageBytes", map);
        this.f7065d = f8;
        if (f8 != null) {
            p3.f.h(f8.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", f8);
        }
        Map g3 = z4 ? AbstractC0547v0.g("retryPolicy", map) : null;
        if (g3 == null) {
            o12 = null;
        } else {
            Integer f9 = AbstractC0547v0.f("maxAttempts", g3);
            p3.f.k(f9, "maxAttempts cannot be empty");
            int intValue = f9.intValue();
            p3.f.c(intValue, "maxAttempts must be greater than 1: %s", intValue >= 2);
            int min = Math.min(intValue, i7);
            Long i9 = AbstractC0547v0.i("initialBackoff", g3);
            p3.f.k(i9, "initialBackoff cannot be empty");
            long longValue = i9.longValue();
            p3.f.g(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
            Long i10 = AbstractC0547v0.i("maxBackoff", g3);
            p3.f.k(i10, "maxBackoff cannot be empty");
            long longValue2 = i10.longValue();
            p3.f.g(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
            Double e7 = AbstractC0547v0.e("backoffMultiplier", g3);
            p3.f.k(e7, "backoffMultiplier cannot be empty");
            double doubleValue = e7.doubleValue();
            p3.f.h(doubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", e7);
            Long i11 = AbstractC0547v0.i("perAttemptRecvTimeout", g3);
            p3.f.h(i11 == null || i11.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", i11);
            Set o7 = Z1.o("retryableStatusCodes", g3);
            Q0.a.b0(o7 != null, "%s is required in retry policy", "retryableStatusCodes");
            Q0.a.b0(!o7.contains(U5.k0.OK), "%s must not contain OK", "retryableStatusCodes");
            p3.f.d("retryableStatusCodes cannot be empty without perAttemptRecvTimeout", (i11 == null && o7.isEmpty()) ? false : true);
            o12 = new O1(min, longValue, longValue2, doubleValue, i11, o7);
        }
        this.f7066e = o12;
        Map g7 = z4 ? AbstractC0547v0.g("hedgingPolicy", map) : null;
        if (g7 == null) {
            c0500f0 = null;
        } else {
            Integer f10 = AbstractC0547v0.f("maxAttempts", g7);
            p3.f.k(f10, "maxAttempts cannot be empty");
            int intValue2 = f10.intValue();
            p3.f.c(intValue2, "maxAttempts must be greater than 1: %s", intValue2 >= 2);
            int min2 = Math.min(intValue2, i8);
            Long i12 = AbstractC0547v0.i("hedgingDelay", g7);
            p3.f.k(i12, "hedgingDelay cannot be empty");
            long longValue3 = i12.longValue();
            p3.f.g(longValue3 >= 0, "hedgingDelay must not be negative: %s", longValue3);
            Set o8 = Z1.o("nonFatalStatusCodes", g7);
            if (o8 == null) {
                o8 = Collections.unmodifiableSet(EnumSet.noneOf(U5.k0.class));
            } else {
                Q0.a.b0(!o8.contains(U5.k0.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            c0500f0 = new C0500f0(min2, longValue3, o8);
        }
        this.f7067f = c0500f0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof U0)) {
            return false;
        }
        U0 u02 = (U0) obj;
        return AbstractC1464a.t(this.f7062a, u02.f7062a) && AbstractC1464a.t(this.f7063b, u02.f7063b) && AbstractC1464a.t(this.f7064c, u02.f7064c) && AbstractC1464a.t(this.f7065d, u02.f7065d) && AbstractC1464a.t(this.f7066e, u02.f7066e) && AbstractC1464a.t(this.f7067f, u02.f7067f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7062a, this.f7063b, this.f7064c, this.f7065d, this.f7066e, this.f7067f});
    }

    public final String toString() {
        D3.j u02 = AbstractC0603a.u0(this);
        u02.a(this.f7062a, "timeoutNanos");
        u02.a(this.f7063b, "waitForReady");
        u02.a(this.f7064c, "maxInboundMessageSize");
        u02.a(this.f7065d, "maxOutboundMessageSize");
        u02.a(this.f7066e, "retryPolicy");
        u02.a(this.f7067f, "hedgingPolicy");
        return u02.toString();
    }
}
