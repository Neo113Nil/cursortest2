package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u0000  2\u00020\u0001:\u0001 BK\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u001a\u0010\f\u001a\u00020\u000b8GX\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\f\u0010\u001fR\u001a\u0010\r\u001a\u00020\u000b8GX\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\r\u0010\u001f"}, d2 = {"Landroidx/credentials/provider/SigningInfoCompat;", "", "", "Landroid/content/pm/Signature;", "signingCertificateHistory", "apkContentsSigners", "", "Ljava/security/PublicKey;", "publicKeys", "", "schemeVersion", "", "hasPastSigningCertificates", "hasMultipleSigners", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/Collection;IZZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/util/List;", "getSigningCertificateHistory", "()Ljava/util/List;", "getApkContentsSigners", "Ljava/util/Collection;", "getPublicKeys", "()Ljava/util/Collection;", com.visa.cbp.getEncExpo.warmup, "getSchemeVersion", "Z", "()Z", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SigningInfoCompat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.SigningInfoCompat.Companion INSTANCE = new androidx.view.provider.SigningInfoCompat.Companion(null);
    private final java.util.List<android.content.pm.Signature> apkContentsSigners;
    private final boolean hasMultipleSigners;
    private final boolean hasPastSigningCertificates;
    private final java.util.Collection<java.security.PublicKey> publicKeys;
    private final int schemeVersion;
    private final java.util.List<android.content.pm.Signature> signingCertificateHistory;

    /* JADX WARN: Multi-variable type inference failed */
    public SigningInfoCompat(java.util.List<? extends android.content.pm.Signature> list, java.util.List<? extends android.content.pm.Signature> list2, java.util.Collection<? extends java.security.PublicKey> collection, int i, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        this.signingCertificateHistory = list;
        this.apkContentsSigners = list2;
        this.publicKeys = collection;
        this.schemeVersion = i;
        this.hasPastSigningCertificates = z;
        this.hasMultipleSigners = z2;
    }

    public final java.util.List<android.content.pm.Signature> getSigningCertificateHistory() {
        return this.signingCertificateHistory;
    }

    public final java.util.List<android.content.pm.Signature> getApkContentsSigners() {
        return this.apkContentsSigners;
    }

    public final java.util.Collection<java.security.PublicKey> getPublicKeys() {
        return this.publicKeys;
    }

    public final int getSchemeVersion() {
        return this.schemeVersion;
    }

    /* renamed from: hasPastSigningCertificates, reason: from getter */
    public final boolean getHasPastSigningCertificates() {
        return this.hasPastSigningCertificates;
    }

    /* renamed from: hasMultipleSigners, reason: from getter */
    public final boolean getHasMultipleSigners() {
        return this.hasMultipleSigners;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.view.provider.SigningInfoCompat)) {
            return false;
        }
        androidx.view.provider.SigningInfoCompat signingInfoCompat = (androidx.view.provider.SigningInfoCompat) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.signingCertificateHistory, signingInfoCompat.signingCertificateHistory) && kotlin.jvm.internal.Intrinsics.areEqual(this.apkContentsSigners, signingInfoCompat.apkContentsSigners) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicKeys, signingInfoCompat.publicKeys) && this.schemeVersion == signingInfoCompat.schemeVersion && this.hasPastSigningCertificates == signingInfoCompat.hasPastSigningCertificates && this.hasMultipleSigners == signingInfoCompat.hasMultipleSigners;
    }

    public final int hashCode() {
        int hashCode = this.signingCertificateHistory.hashCode();
        int hashCode2 = this.apkContentsSigners.hashCode();
        int hashCode3 = this.publicKeys.hashCode();
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + this.schemeVersion) * 31) + java.lang.Boolean.hashCode(this.hasPastSigningCertificates)) * 31) + java.lang.Boolean.hashCode(this.hasMultipleSigners);
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/credentials/provider/SigningInfoCompat$Companion;", "", "<init>", "()V", "Landroid/content/pm/SigningInfo;", "signingInfo", "Landroidx/credentials/provider/SigningInfoCompat;", "fromSigningInfo", "(Landroid/content/pm/SigningInfo;)Landroidx/credentials/provider/SigningInfoCompat;", "", "Landroid/content/pm/Signature;", "signatures", "fromSignatures", "(Ljava/util/List;)Landroidx/credentials/provider/SigningInfoCompat;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.SigningInfoCompat fromSigningInfo(android.content.pm.SigningInfo signingInfo) {
            java.util.List emptyList;
            java.util.Set emptySet;
            java.util.List emptyList2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signingInfo, "");
            android.content.pm.Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
            if (apkContentsSigners == null || (emptyList = kotlin.collections.ArraysKt.filterNotNull(apkContentsSigners)) == null) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.List list = emptyList;
            if (android.os.Build.VERSION.SDK_INT < 35 || (emptySet = signingInfo.getPublicKeys()) == null) {
                emptySet = kotlin.collections.SetsKt.emptySet();
            }
            java.util.Collection collection = emptySet;
            int schemeVersion = android.os.Build.VERSION.SDK_INT >= 35 ? signingInfo.getSchemeVersion() : 0;
            android.content.pm.Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            if (signingCertificateHistory == null || (emptyList2 = kotlin.collections.ArraysKt.filterNotNull(signingCertificateHistory)) == null) {
                emptyList2 = kotlin.collections.CollectionsKt.emptyList();
            }
            return new androidx.view.provider.SigningInfoCompat(emptyList2, list, collection, schemeVersion, signingInfo.hasPastSigningCertificates(), signingInfo.hasMultipleSigners());
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.SigningInfoCompat fromSignatures(java.util.List<? extends android.content.pm.Signature> signatures) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signatures, "");
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                throw new java.lang.IllegalArgumentException("Use SigningInfoCompat.fromSigningInfo(SigningInfo) instead");
            }
            return new androidx.view.provider.SigningInfoCompat(signatures, kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.SetsKt.emptySet(), 0, false, false);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.SigningInfoCompat fromSigningInfo(android.content.pm.SigningInfo signingInfo) {
        return INSTANCE.fromSigningInfo(signingInfo);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.SigningInfoCompat fromSignatures(java.util.List<? extends android.content.pm.Signature> list) {
        return INSTANCE.fromSignatures(list);
    }
}
