package androidx.credentials.provider;

import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import androidx.annotation.DeprecatedSinceApi;
import androidx.annotation.RequiresApi;
import java.security.PublicKey;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aBI\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\nH\u0016R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\r\u001a\u00020\fX\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0011R\u0014\u0010\u000b\u001a\u00020\fX\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u001b"}, d2 = {"Landroidx/credentials/provider/SigningInfoCompat;", "", "signingCertificateHistory", "", "Landroid/content/pm/Signature;", "apkContentsSigners", "publicKeys", "", "Ljava/security/PublicKey;", "schemeVersion", "", "hasPastSigningCertificates", "", "hasMultipleSigners", "(Ljava/util/List;Ljava/util/List;Ljava/util/Collection;IZZ)V", "getApkContentsSigners", "()Ljava/util/List;", "()Z", "getPublicKeys", "()Ljava/util/Collection;", "getSchemeVersion", "()I", "getSigningCertificateHistory", "equals", "other", "hashCode", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SigningInfoCompat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @RequiresApi(28)
    private final List<Signature> apkContentsSigners;

    @RequiresApi(28)
    private final boolean hasMultipleSigners;

    @RequiresApi(28)
    private final boolean hasPastSigningCertificates;

    @RequiresApi(35)
    private final Collection<PublicKey> publicKeys;

    @RequiresApi(35)
    private final int schemeVersion;
    private final List<Signature> signingCertificateHistory;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Landroidx/credentials/provider/SigningInfoCompat$Companion;", "", "()V", "fromSignatures", "Landroidx/credentials/provider/SigningInfoCompat;", "signatures", "", "Landroid/content/pm/Signature;", "fromSigningInfo", "signingInfo", "Landroid/content/pm/SigningInfo;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @DeprecatedSinceApi(api = 28, message = "Use SigningInfoCompat.fromSigningInfo(SigningInfo) instead")
        public final SigningInfoCompat fromSignatures(List<? extends Signature> signatures) {
            Intrinsics.checkNotNullParameter(signatures, "signatures");
            if (Build.VERSION.SDK_INT < 28) {
                return new SigningInfoCompat(signatures, CollectionsKt.emptyList(), SetsKt.emptySet(), 0, false, false);
            }
            throw new IllegalArgumentException("Use SigningInfoCompat.fromSigningInfo(SigningInfo) instead");
        }

        @JvmStatic
        @RequiresApi(28)
        public final SigningInfoCompat fromSigningInfo(SigningInfo signingInfo) {
            Signature[] apkContentsSigners;
            List emptyList;
            Set emptySet;
            Signature[] signingCertificateHistory;
            List emptyList2;
            boolean hasPastSigningCertificates;
            boolean hasMultipleSigners;
            Intrinsics.checkNotNullParameter(signingInfo, "signingInfo");
            apkContentsSigners = signingInfo.getApkContentsSigners();
            if (apkContentsSigners == null || (emptyList = ArraysKt.filterNotNull(apkContentsSigners)) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            List list = emptyList;
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                emptySet = signingInfo.getPublicKeys();
                if (emptySet == null) {
                    emptySet = SetsKt.emptySet();
                }
            } else {
                emptySet = SetsKt.emptySet();
            }
            Collection collection = emptySet;
            int schemeVersion = i >= 35 ? signingInfo.getSchemeVersion() : 0;
            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            if (signingCertificateHistory == null || (emptyList2 = ArraysKt.filterNotNull(signingCertificateHistory)) == null) {
                emptyList2 = CollectionsKt.emptyList();
            }
            List list2 = emptyList2;
            hasPastSigningCertificates = signingInfo.hasPastSigningCertificates();
            hasMultipleSigners = signingInfo.hasMultipleSigners();
            return new SigningInfoCompat(list2, list, collection, schemeVersion, hasPastSigningCertificates, hasMultipleSigners);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SigningInfoCompat(List<? extends Signature> signingCertificateHistory, List<? extends Signature> apkContentsSigners, Collection<? extends PublicKey> publicKeys, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(signingCertificateHistory, "signingCertificateHistory");
        Intrinsics.checkNotNullParameter(apkContentsSigners, "apkContentsSigners");
        Intrinsics.checkNotNullParameter(publicKeys, "publicKeys");
        this.signingCertificateHistory = signingCertificateHistory;
        this.apkContentsSigners = apkContentsSigners;
        this.publicKeys = publicKeys;
        this.schemeVersion = i;
        this.hasPastSigningCertificates = z;
        this.hasMultipleSigners = z2;
    }

    @JvmStatic
    @DeprecatedSinceApi(api = 28, message = "Use SigningInfoCompat.fromSigningInfo(SigningInfo) instead")
    public static final SigningInfoCompat fromSignatures(List<? extends Signature> list) {
        return INSTANCE.fromSignatures(list);
    }

    @JvmStatic
    @RequiresApi(28)
    public static final SigningInfoCompat fromSigningInfo(SigningInfo signingInfo) {
        return INSTANCE.fromSigningInfo(signingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SigningInfoCompat)) {
            return false;
        }
        SigningInfoCompat signingInfoCompat = (SigningInfoCompat) other;
        return Intrinsics.areEqual(this.signingCertificateHistory, signingInfoCompat.signingCertificateHistory) && Intrinsics.areEqual(this.apkContentsSigners, signingInfoCompat.apkContentsSigners) && Intrinsics.areEqual(this.publicKeys, signingInfoCompat.publicKeys) && this.schemeVersion == signingInfoCompat.schemeVersion && this.hasPastSigningCertificates == signingInfoCompat.hasPastSigningCertificates && this.hasMultipleSigners == signingInfoCompat.hasMultipleSigners;
    }

    public final List<Signature> getApkContentsSigners() {
        return this.apkContentsSigners;
    }

    public final Collection<PublicKey> getPublicKeys() {
        return this.publicKeys;
    }

    public final int getSchemeVersion() {
        return this.schemeVersion;
    }

    public final List<Signature> getSigningCertificateHistory() {
        return this.signingCertificateHistory;
    }

    @JvmName(name = "hasMultipleSigners")
    /* renamed from: hasMultipleSigners, reason: from getter */
    public final boolean getHasMultipleSigners() {
        return this.hasMultipleSigners;
    }

    @JvmName(name = "hasPastSigningCertificates")
    /* renamed from: hasPastSigningCertificates, reason: from getter */
    public final boolean getHasPastSigningCertificates() {
        return this.hasPastSigningCertificates;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasMultipleSigners) + ((Boolean.hashCode(this.hasPastSigningCertificates) + ((((this.publicKeys.hashCode() + ((this.apkContentsSigners.hashCode() + (this.signingCertificateHistory.hashCode() * 31)) * 31)) * 31) + this.schemeVersion) * 31)) * 31);
    }
}
