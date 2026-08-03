package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class w implements com.moloco.sdk.internal.services.bidtoken.providers.j<java.lang.Boolean> {
    public static final int d = 8;
    public final java.lang.String b = "SDKInitStateSignalProvider";
    public boolean c = com.moloco.sdk.publisher.Moloco.isInitialized();

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.c = com.moloco.sdk.publisher.Moloco.isInitialized();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        java.lang.StringBuilder sb;
        boolean z = this.c;
        boolean isInitialized = com.moloco.sdk.publisher.Moloco.isInitialized();
        boolean z2 = z != isInitialized;
        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        java.lang.String str = this.b;
        if (z2) {
            sb = new java.lang.StringBuilder("[CBT] sdkInitialized updated from ");
            sb.append(z);
            sb.append(" to ");
            sb.append(isInitialized);
        } else {
            sb = new java.lang.StringBuilder("[CBT] sdkInitialized didn't change (before: ");
            sb.append(z);
            sb.append(", after: ");
            sb.append(isInitialized);
            sb.append(')');
        }
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(molocoLogger, str, sb.toString(), false, 4, null);
        return z2;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public java.lang.String c() {
        return this.b;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean d() {
        return java.lang.Boolean.valueOf(this.c);
    }
}
