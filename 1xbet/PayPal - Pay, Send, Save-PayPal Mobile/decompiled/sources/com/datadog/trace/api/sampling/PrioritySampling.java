package com.datadog.trace.api.sampling;

/* loaded from: classes8.dex */
public class PrioritySampling {
    public static final byte SAMPLER_DROP = 0;
    public static final byte SAMPLER_KEEP = 1;
    public static final byte UNSET = Byte.MIN_VALUE;
    public static final byte USER_DROP = -1;
    public static final byte USER_KEEP = 2;

    private PrioritySampling() {
    }
}
