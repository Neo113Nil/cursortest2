package com.google.android.libraries.identity.googleid;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eBI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;", "Landroidx/credentials/CustomCredential;", "id", "", "idToken", "displayName", com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer.VerificationConstants.FamilyName, com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "profilePictureUri", "Landroid/net/Uri;", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getIdToken", "getDisplayName", "getFamilyName", "getGivenName", "getProfilePictureUri", "()Landroid/net/Uri;", "getPhoneNumber$annotations", "getPhoneNumber", "email", "getEmail", "uniqueId", "getUniqueId", "Companion", "Builder", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GoogleIdTokenCredential extends androidx.view.CustomCredential {
    public static final java.lang.String BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.Companion INSTANCE = new com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.Companion(null);
    public static final java.lang.String TYPE_GOOGLE_ID_TOKEN_CREDENTIAL = "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL";
    public static final java.lang.String TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL = "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL";
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final android.net.Uri zzf;
    private final java.lang.String zzg;
    private final java.lang.String zzh;
    private final java.lang.String zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GoogleIdTokenCredential(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, android.net.Uri uri, java.lang.String str6) {
        super(TYPE_GOOGLE_ID_TOKEN_CREDENTIAL, r0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = uri;
        this.zzg = str6;
        if (str.length() <= 0) {
            throw new java.lang.IllegalArgumentException("id should not be empty");
        }
        if (str2.length() <= 0) {
            throw new java.lang.IllegalArgumentException("idToken should not be empty");
        }
        kotlin.Pair zza = com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.Companion.zza(INSTANCE, str2);
        java.lang.String str7 = (java.lang.String) zza.component1();
        java.lang.String str8 = (java.lang.String) zza.component2();
        this.zzh = str7;
        this.zzi = str8;
    }

    /* renamed from: getUniqueId, reason: from getter */
    public final java.lang.String getZzi() {
        return this.zzi;
    }

    /* renamed from: getProfilePictureUri, reason: from getter */
    public final android.net.Uri getZzf() {
        return this.zzf;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential$Builder;", "", "<init>", "()V", "id", "", "idToken", "displayName", com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer.VerificationConstants.FamilyName, com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "profilePictureUri", "Landroid/net/Uri;", "phoneNumber", "setId", "setIdToken", "setDisplayName", "setFamilyName", "setGivenName", "setProfilePictureUri", "setPhoneNumber", "build", "Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        private java.lang.String zza = "";
        private java.lang.String zzb = "";
        private java.lang.String zzc;
        private java.lang.String zzd;
        private java.lang.String zze;
        private android.net.Uri zzf;
        private java.lang.String zzg;

        public final com.google.android.libraries.identity.googleid.GoogleIdTokenCredential build() {
            return new com.google.android.libraries.identity.googleid.GoogleIdTokenCredential(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
        }

        public final com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.Builder setProfilePictureUri(android.net.Uri profilePictureUri) {
            this.zzf = profilePictureUri;
            return this;
        }

        public final com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.Builder setPhoneNumber(java.lang.String phoneNumber) {
            this.zzg = phoneNumber;
            return this;
        }

        public final com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.Builder setIdToken(java.lang.String idToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idToken, "");
            this.zzb = idToken;
            return this;
        }

        public final com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.Builder setId(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            this.zza = id;
            return this;
        }

        public final com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.Builder setGivenName(java.lang.String givenName) {
            this.zze = givenName;
            return this;
        }

        public final com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.Builder setFamilyName(java.lang.String familyName) {
            this.zzd = familyName;
            return this;
        }

        public final com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.Builder setDisplayName(java.lang.String displayName) {
            this.zzc = displayName;
            return this;
        }
    }

    /* renamed from: getPhoneNumber, reason: from getter */
    public final java.lang.String getZzg() {
        return this.zzg;
    }

    /* renamed from: getIdToken, reason: from getter */
    public final java.lang.String getZzb() {
        return this.zzb;
    }

    /* renamed from: getId, reason: from getter */
    public final java.lang.String getZza() {
        return this.zza;
    }

    /* renamed from: getGivenName, reason: from getter */
    public final java.lang.String getZze() {
        return this.zze;
    }

    /* renamed from: getFamilyName, reason: from getter */
    public final java.lang.String getZzd() {
        return this.zzd;
    }

    /* renamed from: getEmail, reason: from getter */
    public final java.lang.String getZzh() {
        return this.zzh;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00050\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0002JO\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0002\b\"J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003R\u0016\u0010\n\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003R\u0016\u0010\f\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0003R\u0016\u0010\u000e\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0003R\u0016\u0010\u0010\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0003R\u0016\u0010\u0012\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0003R\u0016\u0010\u0014\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0003¨\u0006&"}, d2 = {"Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential$Companion;", "", "<init>", "()V", "TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", "", "TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL", "BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "BUNDLE_KEY_ID", "getBUNDLE_KEY_ID$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_ID_TOKEN", "getBUNDLE_KEY_ID_TOKEN$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_DISPLAY_NAME", "getBUNDLE_KEY_DISPLAY_NAME$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_FAMILY_NAME", "getBUNDLE_KEY_FAMILY_NAME$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_GIVEN_NAME", "getBUNDLE_KEY_GIVEN_NAME$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_PROFILE_PICTURE_URI", "getBUNDLE_KEY_PROFILE_PICTURE_URI$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_PHONE_NUMBER", "getBUNDLE_KEY_PHONE_NUMBER$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "parseIdToken", "Lkotlin/Pair;", "idToken", "toBundle", "Landroid/os/Bundle;", "id", "displayName", com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer.VerificationConstants.FamilyName, com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "profilePictureUri", "Landroid/net/Uri;", "phoneNumber", "toBundle$java_com_google_android_libraries_identity_googleid_granule_granule", "createFrom", "Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static final /* synthetic */ kotlin.Pair zza(com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.Companion companion, java.lang.String str) {
            return zzb(str);
        }

        private static final kotlin.Pair zzb(java.lang.String str) {
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null);
            if (split$default.size() != 3) {
                throw new java.lang.IllegalArgumentException("Invalid token format");
            }
            try {
                byte[] decode = android.util.Base64.decode((java.lang.String) split$default.get(1), 8);
                kotlin.jvm.internal.Intrinsics.checkNotNull(decode);
                java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charset, "");
                org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(decode, charset));
                java.lang.String optString = jSONObject.optString("email");
                java.lang.String str2 = null;
                if (optString.length() == 0) {
                    optString = null;
                }
                java.lang.String str3 = optString;
                java.lang.String optString2 = jSONObject.optString("sub");
                if (optString2.length() != 0) {
                    str2 = optString2;
                }
                java.lang.String str4 = str2;
                if (str4 != null) {
                    return new kotlin.Pair(str3, str4);
                }
                throw new java.lang.IllegalArgumentException("ID token missing required field: sub");
            } catch (org.json.JSONException e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        }

        @kotlin.jvm.JvmStatic
        public final com.google.android.libraries.identity.googleid.GoogleIdTokenCredential createFrom(android.os.Bundle data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            try {
                java.lang.String string = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
                java.lang.String string2 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
                java.lang.String string3 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
                java.lang.String string4 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
                java.lang.String string5 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
                android.net.Uri uri = android.os.Build.VERSION.SDK_INT >= 33 ? (android.net.Uri) data.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", android.net.Uri.class) : (android.net.Uri) data.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
                java.lang.String string6 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
                return new com.google.android.libraries.identity.googleid.GoogleIdTokenCredential(string, string2, string3, string4, string5, uri, string6);
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

    /* renamed from: getDisplayName, reason: from getter */
    public final java.lang.String getZzc() {
        return this.zzc;
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.android.libraries.identity.googleid.GoogleIdTokenCredential createFrom(android.os.Bundle bundle) {
        return INSTANCE.createFrom(bundle);
    }
}
