package com.google.android.gms.common.api.internal;

/* loaded from: classes8.dex */
public final class zabj {
    private static final java.util.concurrent.ExecutorService zaa = com.google.android.gms.internal.base.zat.zaa().zac(2, new com.google.android.gms.common.util.concurrent.NumberedThreadFactory("GAC_Executor"), 2);

    public static java.util.concurrent.ExecutorService zaa() {
        return zaa;
    }
}
