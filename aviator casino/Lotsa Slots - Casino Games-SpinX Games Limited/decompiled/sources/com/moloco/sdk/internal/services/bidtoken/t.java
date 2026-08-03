package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes5.dex */
public final class t implements com.moloco.sdk.internal.services.bidtoken.u {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.publisher.privacy.InternalMolocoPrivacySettings f7250a;

    public t(com.moloco.sdk.publisher.privacy.InternalMolocoPrivacySettings internalMolocoPrivacySettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalMolocoPrivacySettings, "internalMolocoPrivacySettings");
        this.f7250a = internalMolocoPrivacySettings;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.u
    public com.moloco.sdk.publisher.privacy.MolocoPrivacy.PrivacySettings getPrivacy() {
        return this.f7250a.getUpdatedPrivacySettings(com.moloco.sdk.publisher.privacy.MolocoPrivacy.INSTANCE.getPrivacySettings());
    }
}
