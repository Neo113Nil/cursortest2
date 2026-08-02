package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ql0 {

    /* JADX INFO: renamed from: g */
    public static final C0059be f6529g = new C0059be("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", 0);

    /* JADX INFO: renamed from: a */
    public final Long f6530a;

    /* JADX INFO: renamed from: b */
    public final Boolean f6531b;

    /* JADX INFO: renamed from: c */
    public final Integer f6532c;

    /* JADX INFO: renamed from: d */
    public final Integer f6533d;

    /* JADX INFO: renamed from: e */
    public final k31 f6534e;

    /* JADX INFO: renamed from: f */
    public final eb0 f6535f;

    public ql0(Map map, boolean z, int i, int i2) {
        long j;
        boolean z2;
        k31 k31Var;
        eb0 eb0Var;
        this.f6530a = wo1.m5389n("timeout", map);
        this.f6531b = wo1.m5382g("waitForReady", map);
        Integer numM5386k = wo1.m5386k("maxResponseMessageBytes", map);
        this.f6532c = numM5386k;
        if (numM5386k != null) {
            a90.m121e(numM5386k, "maxInboundMessageSize %s exceeds bounds", numM5386k.intValue() >= 0);
        }
        Integer numM5386k2 = wo1.m5386k("maxRequestMessageBytes", map);
        this.f6533d = numM5386k2;
        if (numM5386k2 != null) {
            a90.m121e(numM5386k2, "maxOutboundMessageSize %s exceeds bounds", numM5386k2.intValue() >= 0);
        }
        Map mapM5387l = z ? wo1.m5387l("retryPolicy", map) : null;
        if (mapM5387l == null) {
            j = 0;
            k31Var = null;
            z2 = true;
        } else {
            Integer numM5386k3 = wo1.m5386k("maxAttempts", mapM5387l);
            a90.m127k(numM5386k3, "maxAttempts cannot be empty");
            int iIntValue = numM5386k3.intValue();
            a90.m119c(iIntValue, "maxAttempts must be greater than 1: %s", iIntValue >= 2);
            int iMin = Math.min(iIntValue, i);
            Long lM5389n = wo1.m5389n("initialBackoff", mapM5387l);
            a90.m127k(lM5389n, "initialBackoff cannot be empty");
            long jLongValue = lM5389n.longValue();
            a90.m120d(jLongValue, "initialBackoffNanos must be greater than 0: %s", jLongValue > 0);
            Long lM5389n2 = wo1.m5389n("maxBackoff", mapM5387l);
            a90.m127k(lM5389n2, "maxBackoff cannot be empty");
            long jLongValue2 = lM5389n2.longValue();
            j = 0;
            z2 = true;
            a90.m120d(jLongValue2, "maxBackoff must be greater than 0: %s", jLongValue2 > 0);
            Double dM5385j = wo1.m5385j("backoffMultiplier", mapM5387l);
            a90.m127k(dM5385j, "backoffMultiplier cannot be empty");
            double dDoubleValue = dM5385j.doubleValue();
            a90.m121e(dM5385j, "backoffMultiplier must be greater than 0: %s", dDoubleValue > 0.0d);
            Long lM5389n3 = wo1.m5389n("perAttemptRecvTimeout", mapM5387l);
            a90.m121e(lM5389n3, "perAttemptRecvTimeout cannot be negative: %s", lM5389n3 == null || lM5389n3.longValue() >= 0);
            Set setM1109d = d71.m1109d("retryableStatusCodes", mapM5387l);
            AbstractC0959zp.m5972A("retryableStatusCodes", "%s is required in retry policy", setM1109d != null);
            AbstractC0959zp.m5972A("retryableStatusCodes", "%s must not contain OK", !setM1109d.contains(ia1.f3506l));
            a90.m122f("retryableStatusCodes cannot be empty without perAttemptRecvTimeout", (lM5389n3 == null && setM1109d.isEmpty()) ? false : true);
            k31Var = new k31(iMin, jLongValue, jLongValue2, dDoubleValue, lM5389n3, setM1109d);
        }
        this.f6534e = k31Var;
        Map mapM5387l2 = z ? wo1.m5387l("hedgingPolicy", map) : null;
        if (mapM5387l2 == null) {
            eb0Var = null;
        } else {
            Integer numM5386k4 = wo1.m5386k("maxAttempts", mapM5387l2);
            a90.m127k(numM5386k4, "maxAttempts cannot be empty");
            int iIntValue2 = numM5386k4.intValue();
            a90.m119c(iIntValue2, "maxAttempts must be greater than 1: %s", iIntValue2 >= 2 ? z2 : false);
            int iMin2 = Math.min(iIntValue2, i2);
            Long lM5389n4 = wo1.m5389n("hedgingDelay", mapM5387l2);
            a90.m127k(lM5389n4, "hedgingDelay cannot be empty");
            long jLongValue3 = lM5389n4.longValue();
            a90.m120d(jLongValue3, "hedgingDelay must not be negative: %s", jLongValue3 >= j ? z2 : false);
            Set setM1109d2 = d71.m1109d("nonFatalStatusCodes", mapM5387l2);
            if (setM1109d2 == null) {
                setM1109d2 = Collections.unmodifiableSet(EnumSet.noneOf(ia1.class));
            } else {
                AbstractC0959zp.m5972A("nonFatalStatusCodes", "%s must not contain OK", !setM1109d2.contains(ia1.f3506l));
            }
            eb0Var = new eb0(iMin2, jLongValue3, setM1109d2);
        }
        this.f6535f = eb0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ql0)) {
            return false;
        }
        ql0 ql0Var = (ql0) obj;
        return AbstractC0875xf.m5649f(this.f6530a, ql0Var.f6530a) && AbstractC0875xf.m5649f(this.f6531b, ql0Var.f6531b) && AbstractC0875xf.m5649f(this.f6532c, ql0Var.f6532c) && AbstractC0875xf.m5649f(this.f6533d, ql0Var.f6533d) && AbstractC0875xf.m5649f(this.f6534e, ql0Var.f6534e) && AbstractC0875xf.m5649f(this.f6535f, ql0Var.f6535f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6530a, this.f6531b, this.f6532c, this.f6533d, this.f6534e, this.f6535f});
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(this.f6530a, "timeoutNanos");
        c0809vnM5362k.m5172c(this.f6531b, "waitForReady");
        c0809vnM5362k.m5172c(this.f6532c, "maxInboundMessageSize");
        c0809vnM5362k.m5172c(this.f6533d, "maxOutboundMessageSize");
        c0809vnM5362k.m5172c(this.f6534e, "retryPolicy");
        c0809vnM5362k.m5172c(this.f6535f, "hedgingPolicy");
        return c0809vnM5362k.toString();
    }
}
