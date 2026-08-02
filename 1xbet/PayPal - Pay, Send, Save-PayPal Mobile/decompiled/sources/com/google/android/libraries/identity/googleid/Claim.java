package com.google.android.libraries.identity.googleid;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/google/android/libraries/identity/googleid/Claim;", "", "name", "", "essential", "", "<init>", "(Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getEssential", "()Z", "equals", "other", "hashCode", "", "Companion", "Builder", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Claim {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.android.libraries.identity.googleid.Claim.Companion INSTANCE = new com.google.android.libraries.identity.googleid.Claim.Companion(null);
    private final java.lang.String zza;
    private final boolean zzb;

    public Claim(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.zza = str;
        this.zzb = z;
        if (str.length() <= 0) {
            throw new java.lang.IllegalArgumentException("Claim name should not be empty");
        }
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.google.android.libraries.identity.googleid.Claim)) {
            return false;
        }
        com.google.android.libraries.identity.googleid.Claim claim = (com.google.android.libraries.identity.googleid.Claim) other;
        return this.zzb == claim.zzb && kotlin.jvm.internal.Intrinsics.areEqual(this.zza, claim.zza);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.zza, java.lang.Boolean.valueOf(this.zzb));
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/google/android/libraries/identity/googleid/Claim$Builder;", "", "<init>", "()V", "name", "", "essential", "", "setName", "setEssential", "build", "Lcom/google/android/libraries/identity/googleid/Claim;", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        private java.lang.String zza = "";
        private boolean zzb;

        public final com.google.android.libraries.identity.googleid.Claim build() {
            return new com.google.android.libraries.identity.googleid.Claim(this.zza, this.zzb);
        }

        public final com.google.android.libraries.identity.googleid.Claim.Builder setName(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            this.zza = name2;
            return this;
        }

        public final com.google.android.libraries.identity.googleid.Claim.Builder setEssential(boolean essential) {
            this.zzb = essential;
            return this;
        }
    }

    /* renamed from: getName, reason: from getter */
    public final java.lang.String getZza() {
        return this.zza;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0007R\u0016\u0010\u0004\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u000f"}, d2 = {"Lcom/google/android/libraries/identity/googleid/Claim$Companion;", "", "<init>", "()V", "BUNDLE_KEY_CLAIM_NAME", "", "getBUNDLE_KEY_CLAIM_NAME$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_CLAIM_ESSENTIAL", "getBUNDLE_KEY_CLAIM_ESSENTIAL$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "toBundle", "Landroid/os/Bundle;", "claim", "Lcom/google/android/libraries/identity/googleid/Claim;", "createFrom", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @kotlin.jvm.JvmStatic
        public static final android.os.Bundle zza(com.google.android.libraries.identity.googleid.Claim claim) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(claim, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_CLAIM_NAME", claim.getZza());
            bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_CLAIM_ESSENTIAL", claim.getZzb());
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final com.google.android.libraries.identity.googleid.Claim createFrom(android.os.Bundle data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            try {
                java.lang.String string = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_CLAIM_NAME");
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                return new com.google.android.libraries.identity.googleid.Claim(string, data.getBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_CLAIM_ESSENTIAL"));
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

    /* renamed from: getEssential, reason: from getter */
    public final boolean getZzb() {
        return this.zzb;
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.android.libraries.identity.googleid.Claim createFrom(android.os.Bundle bundle) {
        return INSTANCE.createFrom(bundle);
    }
}
