package com.google.android.libraries.identity.googleid;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B;\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/google/android/libraries/identity/googleid/GetSignInWithGoogleOption;", "Landroidx/credentials/GetCustomCredentialOption;", "serverClientId", "", "hostedDomainFilter", "nonce", "claims", "", "Lcom/google/android/libraries/identity/googleid/Claim;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getServerClientId", "()Ljava/lang/String;", "getHostedDomainFilter", "getNonce", "getClaims", "()Ljava/util/List;", "Companion", "Builder", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetSignInWithGoogleOption extends androidx.view.GetCustomCredentialOption {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption.Companion INSTANCE = new com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption.Companion(null);
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.util.List zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSignInWithGoogleOption(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<com.google.android.libraries.identity.googleid.Claim> list) {
        super(com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL, com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption.Companion.zza(str, str2, str3, true, list), com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption.Companion.zza(str, str2, str3, true, list), true, true, null, 32, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = list;
        if (str.length() <= 0) {
            throw new java.lang.IllegalArgumentException("serverClientId should not be empty");
        }
    }

    public /* synthetic */ GetSignInWithGoogleOption(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, null);
    }

    /* renamed from: getServerClientId, reason: from getter */
    public final java.lang.String getZza() {
        return this.zza;
    }

    /* renamed from: getNonce, reason: from getter */
    public final java.lang.String getZzc() {
        return this.zzc;
    }

    /* renamed from: getHostedDomainFilter, reason: from getter */
    public final java.lang.String getZzb() {
        return this.zzb;
    }

    public final java.util.List<com.google.android.libraries.identity.googleid.Claim> getClaims() {
        return this.zzd;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003J\u0014\u0010\f\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/google/android/libraries/identity/googleid/GetSignInWithGoogleOption$Builder;", "", "serverClientId", "", "<init>", "(Ljava/lang/String;)V", "hostedDomainFilter", "nonce", "claims", "", "Lcom/google/android/libraries/identity/googleid/Claim;", "setHostedDomainFilter", "setClaims", "setNonce", "build", "Lcom/google/android/libraries/identity/googleid/GetSignInWithGoogleOption;", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        private final java.lang.String zza;
        private java.lang.String zzb;
        private java.lang.String zzc;
        private java.util.List zzd;

        public final com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption build() {
            return new com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption(this.zza, this.zzb, this.zzc, this.zzd);
        }

        public final com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption.Builder setNonce(java.lang.String nonce) {
            this.zzc = nonce;
            return this;
        }

        public final com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption.Builder setHostedDomainFilter(java.lang.String hostedDomainFilter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostedDomainFilter, "");
            this.zzb = hostedDomainFilter;
            return this;
        }

        public final com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption.Builder setClaims(java.util.List<com.google.android.libraries.identity.googleid.Claim> claims) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(claims, "");
            this.zzd = claims;
            return this;
        }

        public Builder(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.zza = str;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption createFrom(android.os.Bundle bundle) {
        return INSTANCE.createFrom(bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetSignInWithGoogleOption(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this(str, str2, str3, null, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0001¢\u0006\u0002\b\u001dJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014H\u0007J\u001f\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0014H\u0001¢\u0006\u0002\b#R\u0016\u0010\u0004\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u0016\u0010\t\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003R\u0016\u0010\u000b\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003R\u0016\u0010\r\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003R\u0016\u0010\u000f\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0003R\u0016\u0010\u0011\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0003¨\u0006$"}, d2 = {"Lcom/google/android/libraries/identity/googleid/GetSignInWithGoogleOption$Companion;", "", "<init>", "()V", "BUNDLE_KEY_SERVER_CLIENT_ID", "", "getBUNDLE_KEY_SERVER_CLIENT_ID$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_NONCE", "getBUNDLE_KEY_NONCE$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_HOSTED_DOMAIN_FILTER", "getBUNDLE_KEY_HOSTED_DOMAIN_FILTER$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_AUTO_SELECT_ENABLED", "getBUNDLE_KEY_AUTO_SELECT_ENABLED$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_CLAIMS", "getBUNDLE_KEY_CLAIMS$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_CLAIM_PREFIX", "getBUNDLE_KEY_CLAIM_PREFIX$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_CLAIMS_SIZE", "getBUNDLE_KEY_CLAIMS_SIZE$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "toBundle", "Landroid/os/Bundle;", "serverClientId", "hostedDomainFilter", "nonce", "autoSelectEnabled", "", "claims", "", "Lcom/google/android/libraries/identity/googleid/Claim;", "toBundle$java_com_google_android_libraries_identity_googleid_granule_granule", "createFrom", "Lcom/google/android/libraries/identity/googleid/GetSignInWithGoogleOption;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "parseClaims", "claimsBundle", "parseClaims$java_com_google_android_libraries_identity_googleid_granule_granule", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @kotlin.jvm.JvmStatic
        public static final android.os.Bundle zza(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.util.List list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", str);
            bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", str3);
            bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", str2);
            bundle.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
            bundle.putString(com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE, com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL);
            if (list != null) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_CLAIMS_SIZE", list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_CLAIM_PREFIX");
                    sb.append(i);
                    bundle2.putBundle(sb.toString(), com.google.android.libraries.identity.googleid.Claim.Companion.zza((com.google.android.libraries.identity.googleid.Claim) list.get(i)));
                }
                bundle.putBundle("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_CLAIMS", bundle2);
            }
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption createFrom(android.os.Bundle data) {
            com.google.android.gms.internal.identity_googleid.zzj zzb;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            try {
                java.lang.String string = data.getString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID");
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                java.lang.String string2 = data.getString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE");
                java.lang.String string3 = data.getString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER");
                android.os.Bundle bundle = data.getBundle("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_CLAIMS");
                if (bundle == null) {
                    zzb = null;
                } else {
                    int i = bundle.getInt("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_CLAIMS_SIZE");
                    int i2 = com.google.android.gms.internal.identity_googleid.zzj.zzd;
                    com.google.android.gms.internal.identity_googleid.zzg zzgVar = new com.google.android.gms.internal.identity_googleid.zzg();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzgVar, "");
                    for (int i3 = 0; i3 < i; i3++) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_CLAIM_PREFIX");
                        sb.append(i3);
                        android.os.Bundle bundle2 = bundle.getBundle(sb.toString());
                        if (bundle2 != null) {
                            zzgVar.zza(com.google.android.libraries.identity.googleid.Claim.INSTANCE.createFrom(bundle2));
                        }
                    }
                    zzb = zzgVar.zzb();
                }
                return new com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption(string, string3, string2, zzb);
            } catch (java.lang.Exception e) {
                throw new com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException(e);
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        }

        private Companion() {
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetSignInWithGoogleOption(java.lang.String str, java.lang.String str2) {
        this(str, str2, null, null, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetSignInWithGoogleOption(java.lang.String str) {
        this(str, null, null, null, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }
}
