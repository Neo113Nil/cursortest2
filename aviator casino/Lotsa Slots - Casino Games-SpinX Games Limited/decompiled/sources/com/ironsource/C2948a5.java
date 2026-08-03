package com.ironsource;

/* renamed from: com.ironsource.a5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2948a5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.C2948a5 f6134a = new com.ironsource.C2948a5();

    private C2948a5() {
    }

    public final boolean a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            return false;
        }
        int errorCode = ironSourceError.getErrorCode();
        return errorCode == 524 || errorCode == 530;
    }
}
