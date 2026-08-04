package W5;

import io.sentry.ProfilingTraceData;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class U0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final J0.a f7061g = new J0.a("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f7062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f7063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f7064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f7065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final O1 f7066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0500f0 f7067f;

    public U0(Map map, boolean z4, int i7, int i8) {
        O1 o7;
        C0500f0 c0500f0;
        this.f7062a = AbstractC0547v0.i(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, map);
        this.f7063b = AbstractC0547v0.b("waitForReady", map);
        Integer numF = AbstractC0547v0.f("maxResponseMessageBytes", map);
        this.f7064c = numF;
        if (numF != null) {
            p113p3.f.h(numF.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numF);
        }
        Integer numF2 = AbstractC0547v0.f("maxRequestMessageBytes", map);
        this.f7065d = numF2;
        if (numF2 != null) {
            p113p3.f.h(numF2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numF2);
        }
        Map mapG = z4 ? AbstractC0547v0.g("retryPolicy", map) : null;
        if (mapG == null) {
            o7 = null;
        } else {
            Integer numF3 = AbstractC0547v0.f("maxAttempts", mapG);
            p113p3.f.k(numF3, "maxAttempts cannot be empty");
            int iIntValue = numF3.intValue();
            p113p3.f.c(iIntValue, "maxAttempts must be greater than 1: %s", iIntValue >= 2);
            int iMin = Math.min(iIntValue, i7);
            Long lI = AbstractC0547v0.i("initialBackoff", mapG);
            p113p3.f.k(lI, "initialBackoff cannot be empty");
            long jLongValue = lI.longValue();
            p113p3.f.g(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            Long lI2 = AbstractC0547v0.i("maxBackoff", mapG);
            p113p3.f.k(lI2, "maxBackoff cannot be empty");
            long jLongValue2 = lI2.longValue();
            p113p3.f.g(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            Double dE = AbstractC0547v0.e("backoffMultiplier", mapG);
            p113p3.f.k(dE, "backoffMultiplier cannot be empty");
            double dDoubleValue = dE.doubleValue();
            p113p3.f.h(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", dE);
            Long lI3 = AbstractC0547v0.i("perAttemptRecvTimeout", mapG);
            p113p3.f.h(lI3 == null || lI3.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lI3);
            Set setO = Z1.o("retryableStatusCodes", mapG);
            Q0.a.b0(setO != null, "%s is required in retry policy", "retryableStatusCodes");
            Q0.a.b0(!setO.contains(U5.k0.OK), "%s must not contain OK", "retryableStatusCodes");
            p113p3.f.d("retryableStatusCodes cannot be empty without perAttemptRecvTimeout", (lI3 == null && setO.isEmpty()) ? false : true);
            o7 = new O1(iMin, jLongValue, jLongValue2, dDoubleValue, lI3, setO);
        }
        this.f7066e = o7;
        Map mapG2 = z4 ? AbstractC0547v0.g("hedgingPolicy", map) : null;
        if (mapG2 == null) {
            c0500f0 = null;
        } else {
            Integer numF4 = AbstractC0547v0.f("maxAttempts", mapG2);
            p113p3.f.k(numF4, "maxAttempts cannot be empty");
            int iIntValue2 = numF4.intValue();
            p113p3.f.c(iIntValue2, "maxAttempts must be greater than 1: %s", iIntValue2 >= 2);
            int iMin2 = Math.min(iIntValue2, i8);
            Long lI4 = AbstractC0547v0.i("hedgingDelay", mapG2);
            p113p3.f.k(lI4, "hedgingDelay cannot be empty");
            long jLongValue3 = lI4.longValue();
            p113p3.f.g(jLongValue3 >= 0, "hedgingDelay must not be negative: %s", jLongValue3);
            Set setO2 = Z1.o("nonFatalStatusCodes", mapG2);
            if (setO2 == null) {
                setO2 = Collections.unmodifiableSet(EnumSet.noneOf(U5.k0.class));
            } else {
                Q0.a.b0(!setO2.contains(U5.k0.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            c0500f0 = new C0500f0(iMin2, jLongValue3, setO2);
        }
        this.f7067f = c0500f0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof U0)) {
            return false;
        }
        U0 u4 = (U0) obj;
        return p097n3.a.t(this.f7062a, u4.f7062a) && p097n3.a.t(this.f7063b, u4.f7063b) && p097n3.a.t(this.f7064c, u4.f7064c) && p097n3.a.t(this.f7065d, u4.f7065d) && p097n3.a.t(this.f7066e, u4.f7066e) && p097n3.a.t(this.f7067f, u4.f7067f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7062a, this.f7063b, this.f7064c, this.f7065d, this.f7066e, this.f7067f});
    }

    public final String toString() {
        D3.j jVarU0 = p003a.a.u0(this);
        jVarU0.a(this.f7062a, "timeoutNanos");
        jVarU0.a(this.f7063b, "waitForReady");
        jVarU0.a(this.f7064c, "maxInboundMessageSize");
        jVarU0.a(this.f7065d, "maxOutboundMessageSize");
        jVarU0.a(this.f7066e, "retryPolicy");
        jVarU0.a(this.f7067f, "hedgingPolicy");
        return jVarU0.toString();
    }
}
