package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class v implements com.moloco.sdk.internal.services.bidtoken.providers.j<com.moloco.sdk.publisher.privacy.MolocoPrivacy.PrivacySettings> {
    public static final int e = 8;
    public final com.moloco.sdk.internal.services.bidtoken.u b;
    public final java.lang.String c;
    public com.moloco.sdk.publisher.privacy.MolocoPrivacy.PrivacySettings d;

    public v(com.moloco.sdk.internal.services.bidtoken.u privacyProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privacyProvider, "privacyProvider");
        this.b = privacyProvider;
        this.c = "PrivacyStateSignalProvider";
        this.d = privacyProvider.getPrivacy();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.d = this.b.getPrivacy();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        boolean z = !kotlin.jvm.internal.Intrinsics.areEqual(this.d, this.b.getPrivacy());
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.c, z ? "[CBT] privacy updated" : "[CBT] privacy didn't change", false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public java.lang.String c() {
        return this.c;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.publisher.privacy.MolocoPrivacy.PrivacySettings d() {
        return this.d;
    }
}
