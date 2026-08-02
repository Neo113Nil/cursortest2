package com.google.android.libraries.identity.googleid;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eBw\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/google/android/libraries/identity/googleid/GetGoogleIdOption;", "Landroidx/credentials/GetCustomCredentialOption;", "serverClientId", "", "nonce", "filterByAuthorizedAccounts", "", "linkedServiceId", "idTokenDepositionScopes", "", "requestVerifiedPhoneNumber", "autoSelectEnabled", "claims", "Lcom/google/android/libraries/identity/googleid/Claim;", "hostedDomainFilter", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;ZZLjava/util/List;Ljava/lang/String;)V", "getServerClientId", "()Ljava/lang/String;", "getNonce", "getFilterByAuthorizedAccounts", "()Z", "getLinkedServiceId", "getIdTokenDepositionScopes", "()Ljava/util/List;", "getRequestVerifiedPhoneNumber", "getAutoSelectEnabled", "getClaims", "getHostedDomainFilter", "Companion", "Builder", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetGoogleIdOption extends androidx.view.GetCustomCredentialOption {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.android.libraries.identity.googleid.GetGoogleIdOption.Companion INSTANCE = new com.google.android.libraries.identity.googleid.GetGoogleIdOption.Companion(null);
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final boolean zzc;
    private final java.lang.String zzd;
    private final java.util.List zze;
    private final boolean zzf;
    private final boolean zzg;
    private final java.util.List zzh;
    private final java.lang.String zzi;

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jk\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u00052\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010#2\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020 2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010#2\b\u0010(\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0002\b)J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u001cH\u0007J\u001f\u0010-\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010#2\b\u0010.\u001a\u0004\u0018\u00010\u001cH\u0001¢\u0006\u0002\b/R\u0016\u0010\u0004\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u0016\u0010\t\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003R\u0016\u0010\u000b\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003R\u0016\u0010\r\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003R\u0016\u0010\u000f\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0003R\u0016\u0010\u0011\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0003R\u0016\u0010\u0013\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0003R\u0016\u0010\u0015\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0003R\u0016\u0010\u0017\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0003R\u0016\u0010\u0019\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u0003¨\u00060"}, d2 = {"Lcom/google/android/libraries/identity/googleid/GetGoogleIdOption$Companion;", "", "<init>", "()V", "BUNDLE_KEY_SERVER_CLIENT_ID", "", "getBUNDLE_KEY_SERVER_CLIENT_ID$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_NONCE", "getBUNDLE_KEY_NONCE$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", "getBUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_LINKED_SERVICE_ID", "getBUNDLE_KEY_LINKED_SERVICE_ID$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES", "getBUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", "getBUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_AUTO_SELECT_ENABLED", "getBUNDLE_KEY_AUTO_SELECT_ENABLED$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_CLAIMS", "getBUNDLE_KEY_CLAIMS$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_CLAIM_PREFIX", "getBUNDLE_KEY_CLAIM_PREFIX$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_CLAIMS_SIZE", "getBUNDLE_KEY_CLAIMS_SIZE$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_HOSTED_DOMAIN_FILTER", "getBUNDLE_KEY_HOSTED_DOMAIN_FILTER$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "toBundle", "Landroid/os/Bundle;", "serverClientId", "nonce", "filterByAuthorizedAccounts", "", "linkedServiceId", "idTokenDepositionScopes", "", "requestVerifiedPhoneNumber", "autoSelectEnabled", "claims", "Lcom/google/android/libraries/identity/googleid/Claim;", "hostedDomainFilter", "toBundle$java_com_google_android_libraries_identity_googleid_granule_granule", "createFrom", "Lcom/google/android/libraries/identity/googleid/GetGoogleIdOption;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "parseClaims", "claimsBundle", "parseClaims$java_com_google_android_libraries_identity_googleid_granule_granule", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @kotlin.jvm.JvmStatic
        public static final android.os.Bundle zza(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.util.List list, boolean z2, boolean z3, java.util.List list2, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_SERVER_CLIENT_ID", str);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_NONCE", str2);
            bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", z);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_LINKED_SERVICE_ID", str3);
            bundle.putStringArrayList("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES", list == null ? null : new java.util.ArrayList<>(list));
            bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", z2);
            bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_AUTO_SELECT_ENABLED", z3);
            if (list2 != null) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("com.google.android.libraries.identity.googleid.BUNDLE_KEY_CLAIMS_SIZE", list2.size());
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("com.google.android.libraries.identity.googleid.BUNDLE_KEY_CLAIM_PREFIX");
                    sb.append(i);
                    bundle2.putBundle(sb.toString(), com.google.android.libraries.identity.googleid.Claim.Companion.zza((com.google.android.libraries.identity.googleid.Claim) list2.get(i)));
                }
                bundle.putBundle("com.google.android.libraries.identity.googleid.BUNDLE_KEY_CLAIMS", bundle2);
            }
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", str4);
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final com.google.android.libraries.identity.googleid.GetGoogleIdOption createFrom(android.os.Bundle data) {
            com.google.android.gms.internal.identity_googleid.zzj zzb;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            try {
                java.lang.String string = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_SERVER_CLIENT_ID");
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                java.lang.String string2 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_NONCE");
                boolean z = data.getBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", true);
                java.lang.String string3 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_LINKED_SERVICE_ID");
                java.util.ArrayList<java.lang.String> stringArrayList = data.getStringArrayList("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES");
                boolean z2 = data.getBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", false);
                boolean z3 = data.getBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_AUTO_SELECT_ENABLED", false);
                android.os.Bundle bundle = data.getBundle("com.google.android.libraries.identity.googleid.BUNDLE_KEY_CLAIMS");
                if (bundle == null) {
                    zzb = null;
                } else {
                    int i = bundle.getInt("com.google.android.libraries.identity.googleid.BUNDLE_KEY_CLAIMS_SIZE");
                    int i2 = com.google.android.gms.internal.identity_googleid.zzj.zzd;
                    com.google.android.gms.internal.identity_googleid.zzg zzgVar = new com.google.android.gms.internal.identity_googleid.zzg();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzgVar, "");
                    for (int i3 = 0; i3 < i; i3++) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("com.google.android.libraries.identity.googleid.BUNDLE_KEY_CLAIM_PREFIX");
                        sb.append(i3);
                        android.os.Bundle bundle2 = bundle.getBundle(sb.toString());
                        if (bundle2 != null) {
                            zzgVar.zza(com.google.android.libraries.identity.googleid.Claim.INSTANCE.createFrom(bundle2));
                        }
                    }
                    zzb = zzgVar.zzb();
                }
                return new com.google.android.libraries.identity.googleid.GetGoogleIdOption(string, string2, z, string3, stringArrayList, z2, z3, zzb, data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_HOSTED_DOMAIN_FILTER"));
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetGoogleIdOption(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.util.List<java.lang.String> list, boolean z2, boolean z3, java.util.List<com.google.android.libraries.identity.googleid.Claim> list2, java.lang.String str4) {
        super(com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL, com.google.android.libraries.identity.googleid.GetGoogleIdOption.Companion.zza(str, str2, z, str3, list, z2, z3, list2, str4), com.google.android.libraries.identity.googleid.GetGoogleIdOption.Companion.zza(str, str2, z, str3, list, z2, z3, list2, str4), true, z3, (java.util.Set) null, 500, 32, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.zza = str;
        this.zzb = str2;
        this.zzc = z;
        this.zzd = str3;
        this.zze = list;
        this.zzf = z2;
        this.zzg = z3;
        this.zzh = list2;
        this.zzi = str4;
        if (str.length() <= 0) {
            throw new java.lang.IllegalArgumentException("serverClientId should not be empty");
        }
        if (z && z2) {
            throw new java.lang.IllegalArgumentException("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true;  the Verified Phone Number feature only works in sign-ups.");
        }
    }

    public /* synthetic */ GetGoogleIdOption(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.util.List list, boolean z2, boolean z3, java.util.List list2, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (!((i & 4) == 0)) | z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list, ((i & 32) == 0) & z2, ((i & 64) == 0) & z3, (i & 128) == 0 ? list2 : null, null);
    }

    /* renamed from: getServerClientId, reason: from getter */
    public final java.lang.String getZza() {
        return this.zza;
    }

    /* renamed from: getRequestVerifiedPhoneNumber, reason: from getter */
    public final boolean getZzf() {
        return this.zzf;
    }

    /* renamed from: getNonce, reason: from getter */
    public final java.lang.String getZzb() {
        return this.zzb;
    }

    /* renamed from: getLinkedServiceId, reason: from getter */
    public final java.lang.String getZzd() {
        return this.zzd;
    }

    public final java.util.List<java.lang.String> getIdTokenDepositionScopes() {
        return this.zze;
    }

    /* renamed from: getHostedDomainFilter, reason: from getter */
    public final java.lang.String getZzi() {
        return this.zzi;
    }

    /* renamed from: getFilterByAuthorizedAccounts, reason: from getter */
    public final boolean getZzc() {
        return this.zzc;
    }

    public final java.util.List<com.google.android.libraries.identity.googleid.Claim> getClaims() {
        return this.zzh;
    }

    /* renamed from: getAutoSelectEnabled, reason: from getter */
    public final boolean getZzg() {
        return this.zzg;
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.android.libraries.identity.googleid.GetGoogleIdOption createFrom(android.os.Bundle bundle) {
        return INSTANCE.createFrom(bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetGoogleIdOption(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.util.List<java.lang.String> list, boolean z2, boolean z3, java.util.List<com.google.android.libraries.identity.googleid.Claim> list2) {
        this(str, str2, z, str3, list, z2, z3, list2, null, 256, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\tJ\u001e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rJ\u0014\u0010\u0017\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\rJ\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/google/android/libraries/identity/googleid/GetGoogleIdOption$Builder;", "", "<init>", "()V", "serverClientId", "", "linkedServiceId", "nonce", "filterByAuthorizedAccounts", "", "requestVerifiedPhoneNumber", "autoSelectEnabled", "idTokenDepositionScopes", "", "claims", "Lcom/google/android/libraries/identity/googleid/Claim;", "hostedDomainFilter", "setServerClientId", "setNonce", "setFilterByAuthorizedAccounts", "setRequestVerifiedPhoneNumber", "setAutoSelectEnabled", "associateLinkedAccounts", "setClaims", "setHostedDomainFilter", "build", "Lcom/google/android/libraries/identity/googleid/GetGoogleIdOption;", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        private java.lang.String zzb;
        private java.lang.String zzc;
        private boolean zze;
        private boolean zzf;
        private java.util.List zzg;
        private java.util.List zzh;
        private java.lang.String zzi;
        private java.lang.String zza = "";
        private boolean zzd = true;

        public final com.google.android.libraries.identity.googleid.GetGoogleIdOption.Builder associateLinkedAccounts(java.lang.String linkedServiceId, java.util.List<java.lang.String> idTokenDepositionScopes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedServiceId, "");
            if (linkedServiceId.length() <= 0) {
                throw new java.lang.IllegalArgumentException("linkedServiceId must be provided if you want to associate linked accounts.");
            }
            this.zzb = linkedServiceId;
            this.zzg = idTokenDepositionScopes != null ? kotlin.collections.CollectionsKt.toList(idTokenDepositionScopes) : null;
            return this;
        }

        public final com.google.android.libraries.identity.googleid.GetGoogleIdOption build() {
            return new com.google.android.libraries.identity.googleid.GetGoogleIdOption(this.zza, this.zzc, this.zzd, this.zzb, this.zzg, this.zze, this.zzf, this.zzh, this.zzi);
        }

        public final com.google.android.libraries.identity.googleid.GetGoogleIdOption.Builder setServerClientId(java.lang.String serverClientId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverClientId, "");
            if (serverClientId.length() <= 0) {
                throw new java.lang.IllegalArgumentException("serverClientId should not be empty");
            }
            this.zza = serverClientId;
            return this;
        }

        public final com.google.android.libraries.identity.googleid.GetGoogleIdOption.Builder setRequestVerifiedPhoneNumber(boolean requestVerifiedPhoneNumber) {
            this.zze = requestVerifiedPhoneNumber;
            return this;
        }

        public final com.google.android.libraries.identity.googleid.GetGoogleIdOption.Builder setNonce(java.lang.String nonce) {
            this.zzc = nonce;
            return this;
        }

        public final com.google.android.libraries.identity.googleid.GetGoogleIdOption.Builder setHostedDomainFilter(java.lang.String hostedDomainFilter) {
            this.zzi = hostedDomainFilter;
            return this;
        }

        public final com.google.android.libraries.identity.googleid.GetGoogleIdOption.Builder setFilterByAuthorizedAccounts(boolean filterByAuthorizedAccounts) {
            this.zzd = filterByAuthorizedAccounts;
            return this;
        }

        public final com.google.android.libraries.identity.googleid.GetGoogleIdOption.Builder setClaims(java.util.List<com.google.android.libraries.identity.googleid.Claim> claims) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(claims, "");
            this.zzh = claims;
            return this;
        }

        public final com.google.android.libraries.identity.googleid.GetGoogleIdOption.Builder setAutoSelectEnabled(boolean autoSelectEnabled) {
            this.zzf = autoSelectEnabled;
            return this;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetGoogleIdOption(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.util.List<java.lang.String> list, boolean z2, boolean z3) {
        this(str, str2, z, str3, list, z2, z3, null, null, 384, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetGoogleIdOption(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.util.List<java.lang.String> list, boolean z2) {
        this(str, str2, z, str3, list, z2, false, null, null, 448, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetGoogleIdOption(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.util.List<java.lang.String> list) {
        this(str, str2, z, str3, list, false, false, null, null, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetGoogleIdOption(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3) {
        this(str, str2, z, str3, null, false, false, null, null, 496, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetGoogleIdOption(java.lang.String str, java.lang.String str2, boolean z) {
        this(str, str2, z, null, null, false, false, null, null, 504, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetGoogleIdOption(java.lang.String str, java.lang.String str2) {
        this(str, str2, false, null, null, false, false, null, null, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetGoogleIdOption(java.lang.String str) {
        this(str, null, false, null, null, false, false, null, null, 510, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }
}
