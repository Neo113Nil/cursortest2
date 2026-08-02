package com.google.android.gms.common.api.internal;

/* loaded from: classes8.dex */
public final class zaco {
    private static final java.util.concurrent.ExecutorService zaa = com.google.android.gms.internal.base.zat.zaa().zaa(new com.google.android.gms.common.util.concurrent.NumberedThreadFactory("GAC_Transform"), 1);

    public static java.util.concurrent.ExecutorService zaa() {
        return zaa;
    }
}
