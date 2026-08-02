package org.jctools.util;

/* loaded from: classes18.dex */
public interface PortableJvmInfo {
    public static final int CACHE_LINE_SIZE = java.lang.Integer.getInteger("jctools.cacheLineSize", 64).intValue();
    public static final int CPUs;
    public static final int RECOMENDED_OFFER_BATCH;
    public static final int RECOMENDED_POLL_BATCH;

    static {
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        CPUs = availableProcessors;
        int i = availableProcessors * 4;
        RECOMENDED_OFFER_BATCH = i;
        RECOMENDED_POLL_BATCH = i;
    }
}
