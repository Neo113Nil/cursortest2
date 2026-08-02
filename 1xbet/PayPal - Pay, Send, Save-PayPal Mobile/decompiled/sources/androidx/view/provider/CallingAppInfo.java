package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 *2\u00020\u0001:\u0002*+B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB%\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u000eB+\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u0012J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b\"\u0010!R\u001a\u0010#\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R$\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00078G@BX\u0087.¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)"}, d2 = {"Landroidx/credentials/provider/CallingAppInfo;", "", "", "p0", "p1", "Landroidx/credentials/provider/SigningInfoCompat;", "p2", "Landroid/content/pm/SigningInfo;", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/credentials/provider/SigningInfoCompat;Landroid/content/pm/SigningInfo;)V", com.visa.cbp.ConsumerInfo.setSignature, "signingInfo", "origin", "(Ljava/lang/String;Landroid/content/pm/SigningInfo;Ljava/lang/String;)V", "", "Landroid/content/pm/Signature;", "signatures", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "privilegedAllowlist", "getOrigin", "(Ljava/lang/String;)Ljava/lang/String;", "", "isOriginPopulated", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "getOrigin$credentials_release", "signingInfoCompat", "Landroidx/credentials/provider/SigningInfoCompat;", "getSigningInfoCompat", "()Landroidx/credentials/provider/SigningInfoCompat;", "Landroid/content/pm/SigningInfo;", "getSigningInfo", "()Landroid/content/pm/SigningInfo;", "Companion", "SignatureVerifier"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CallingAppInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.CallingAppInfo.Companion INSTANCE = new androidx.view.provider.CallingAppInfo.Companion(null);
    public static final java.lang.String EXTRA_CREDENTIAL_REQUEST_ORIGIN = "androidx.credentials.provider.extra.CREDENTIAL_REQUEST_ORIGIN";
    private final java.lang.String origin;
    private final java.lang.String packageName;
    private android.content.pm.SigningInfo signingInfo;
    private final androidx.view.provider.SigningInfoCompat signingInfoCompat;

    private CallingAppInfo(java.lang.String str, java.lang.String str2, androidx.view.provider.SigningInfoCompat signingInfoCompat, android.content.pm.SigningInfo signingInfo) {
        this.packageName = str;
        this.origin = str2;
        this.signingInfoCompat = signingInfoCompat;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(signingInfo);
            this.signingInfo = signingInfo;
        }
        if (str.length() <= 0) {
            throw new java.lang.IllegalArgumentException("packageName must not be empty".toString());
        }
    }

    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    /* renamed from: getOrigin$credentials_release, reason: from getter */
    public final java.lang.String getOrigin() {
        return this.origin;
    }

    public final androidx.view.provider.SigningInfoCompat getSigningInfoCompat() {
        return this.signingInfoCompat;
    }

    public final android.content.pm.SigningInfo getSigningInfo() {
        android.content.pm.SigningInfo signingInfo = this.signingInfo;
        if (signingInfo != null) {
            return signingInfo;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public /* synthetic */ CallingAppInfo(java.lang.String str, android.content.pm.SigningInfo signingInfo, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, signingInfo, (i & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallingAppInfo(java.lang.String str, android.content.pm.SigningInfo signingInfo, java.lang.String str2) {
        this(str, str2, androidx.view.provider.SigningInfoCompat.INSTANCE.fromSigningInfo(signingInfo), signingInfo);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signingInfo, "");
    }

    public /* synthetic */ CallingAppInfo(java.lang.String str, java.util.List list, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (java.util.List<? extends android.content.pm.Signature>) list, (i & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallingAppInfo(java.lang.String str, java.util.List<? extends android.content.pm.Signature> list, java.lang.String str2) {
        this(str, str2, androidx.view.provider.SigningInfoCompat.INSTANCE.fromSignatures(list), null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/credentials/provider/CallingAppInfo$Companion;", "", "<init>", "()V", "", com.visa.cbp.ConsumerInfo.setSignature, "Landroid/content/pm/SigningInfo;", "signingInfo", "origin", "Landroidx/credentials/provider/CallingAppInfo;", "create", "(Ljava/lang/String;Landroid/content/pm/SigningInfo;Ljava/lang/String;)Landroidx/credentials/provider/CallingAppInfo;", "", "Landroid/content/pm/Signature;", "signatures", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Landroidx/credentials/provider/CallingAppInfo;", "Landroid/os/Bundle;", "info", "", "setCallingAppInfo$credentials_release", "(Landroid/os/Bundle;Landroidx/credentials/provider/CallingAppInfo;)V", "bundle", "extractCallingAppInfo", "(Landroid/os/Bundle;)Landroidx/credentials/provider/CallingAppInfo;", "EXTRA_CREDENTIAL_REQUEST_ORIGIN", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ androidx.view.provider.CallingAppInfo create$default(androidx.view.provider.CallingAppInfo.Companion companion, java.lang.String str, android.content.pm.SigningInfo signingInfo, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.create(str, signingInfo, str2);
        }

        public final androidx.view.provider.CallingAppInfo create(java.lang.String packageName, android.content.pm.SigningInfo signingInfo, java.lang.String origin) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signingInfo, "");
            return new androidx.view.provider.CallingAppInfo(packageName, signingInfo, origin);
        }

        public static /* synthetic */ androidx.view.provider.CallingAppInfo create$default(androidx.view.provider.CallingAppInfo.Companion companion, java.lang.String str, java.util.List list, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.create(str, (java.util.List<? extends android.content.pm.Signature>) list, str2);
        }

        public final androidx.view.provider.CallingAppInfo create(java.lang.String packageName, java.util.List<? extends android.content.pm.Signature> signatures, java.lang.String origin) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signatures, "");
            return new androidx.view.provider.CallingAppInfo(packageName, signatures, origin);
        }

        public final void setCallingAppInfo$credentials_release(android.os.Bundle bundle, androidx.view.provider.CallingAppInfo callingAppInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callingAppInfo, "");
            bundle.putString(androidx.view.provider.CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_ORIGIN, callingAppInfo.getOrigin());
            bundle.putString("androidx.credentials.provider.extra.CREDENTIAL_REQUEST_PACKAGE_NAME", callingAppInfo.getPackageName());
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                bundle.putParcelable("androidx.credentials.provider.extra.CREDENTIAL_REQUEST_SIGNING_INFO", callingAppInfo.getSigningInfo());
            } else {
                bundle.putParcelableArray("androidx.credentials.provider.extra.CREDENTIAL_REQUEST_SIGNATURES", (android.os.Parcelable[]) callingAppInfo.getSigningInfoCompat().getSigningCertificateHistory().toArray(new android.content.pm.Signature[0]));
            }
        }

        public final androidx.view.provider.CallingAppInfo extractCallingAppInfo(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            java.lang.String string = bundle.getString(androidx.view.provider.CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_ORIGIN);
            java.lang.String string2 = bundle.getString("androidx.credentials.provider.extra.CREDENTIAL_REQUEST_PACKAGE_NAME");
            if (string2 == null) {
                return null;
            }
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                android.content.pm.SigningInfo signingInfo = (android.content.pm.SigningInfo) bundle.getParcelable("androidx.credentials.provider.extra.CREDENTIAL_REQUEST_SIGNING_INFO");
                if (signingInfo == null) {
                    return null;
                }
                return create(string2, signingInfo, string);
            }
            android.os.Parcelable[] parcelableArray = bundle.getParcelableArray("androidx.credentials.provider.extra.CREDENTIAL_REQUEST_SIGNATURES");
            if (parcelableArray == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArray.length);
            for (android.os.Parcelable parcelable : parcelableArray) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(parcelable, "");
                arrayList.add((android.content.pm.Signature) parcelable);
            }
            return create(string2, arrayList, string);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r5 = r1.getFingerprints();
        r1 = new androidx.credentials.provider.CallingAppInfo.SignatureVerifier(r4.signingInfoCompat);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "");
        r0 = new java.util.LinkedHashSet();
        r2 = r1.getHighSpeedVideoFpsRangesFor.getApkContentsSigners();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r1.getHighSpeedVideoFpsRangesFor.hasMultipleSigners() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r2.isEmpty() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        r0.addAll(androidx.credentials.provider.CallingAppInfo.SignatureVerifier.getHighSpeedVideoFpsRangesFor(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
    
        if (r1.getHighSpeedVideoFpsRangesFor.hasMultipleSigners() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
    
        if (r5.containsAll(r0) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        return r4.origin;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
    
        if (kotlin.collections.CollectionsKt.intersect(r5, r0).isEmpty() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if (r1.getHighSpeedVideoFpsRangesFor.getSigningCertificateHistory().isEmpty() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        r0.addAll(androidx.credentials.provider.CallingAppInfo.SignatureVerifier.getHighSpeedVideoFpsRangesFor(kotlin.collections.CollectionsKt.listOf(r1.getHighSpeedVideoFpsRangesFor.getSigningCertificateHistory().get(0))));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String getOrigin(java.lang.String privilegedAllowlist) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privilegedAllowlist, "");
        if (!androidx.view.provider.utils.RequestValidationUtil.INSTANCE.isValidJSON(privilegedAllowlist)) {
            throw new java.lang.IllegalArgumentException("privilegedAllowlist must not be empty, and must be a valid JSON");
        }
        java.lang.String str = this.origin;
        if (str == null) {
            return str;
        }
        try {
            java.util.Iterator<androidx.view.provider.utils.PrivilegedApp> it = androidx.view.provider.utils.PrivilegedApp.INSTANCE.extractPrivilegedApps$credentials_release(new org.json.JSONObject(privilegedAllowlist)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                androidx.view.provider.utils.PrivilegedApp next = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(next.getPackageName(), this.packageName)) {
                    break;
                }
            }
            throw new java.lang.IllegalStateException("Origin is not being returned as the calling app did notmatch the privileged allowlist");
        } catch (org.json.JSONException unused) {
            throw new java.lang.IllegalArgumentException("privilegedAllowlist must be formatted properly");
        }
    }

    public final boolean isOriginPopulated() {
        return this.origin != null;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f"}, d2 = {"Landroidx/credentials/provider/CallingAppInfo$SignatureVerifier;", "", "Landroidx/credentials/provider/SigningInfoCompat;", "p0", "<init>", "(Landroidx/credentials/provider/SigningInfoCompat;)V", "", "Landroid/content/pm/Signature;", "", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/List;)Ljava/util/Set;", "Landroidx/credentials/provider/SigningInfoCompat;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class SignatureVerifier {
        final androidx.view.provider.SigningInfoCompat getHighSpeedVideoFpsRangesFor;

        public SignatureVerifier(androidx.view.provider.SigningInfoCompat signingInfoCompat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signingInfoCompat, "");
            this.getHighSpeedVideoFpsRangesFor = signingInfoCompat;
        }

        static java.util.Set<java.lang.String> getHighSpeedVideoFpsRangesFor(java.util.List<? extends android.content.pm.Signature> p0) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.Iterator<? extends android.content.pm.Signature> it = p0.iterator();
            while (it.hasNext()) {
                byte[] digest = java.security.MessageDigest.getInstance("SHA-256").digest(it.next().toByteArray());
                kotlin.jvm.internal.Intrinsics.checkNotNull(digest);
                linkedHashSet.add(kotlin.collections.ArraysKt.joinToString$default(digest, (java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.COLON, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.provider.CallingAppInfo$SignatureVerifier$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.credentials.provider.CallingAppInfo.SignatureVerifier.getHighResolutionOutputSizeshNQ4ISI(((java.lang.Byte) obj).byteValue());
                    }
                }, 30, (java.lang.Object) null));
            }
            return linkedHashSet;
        }

        public static /* synthetic */ java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI(byte b) {
            java.lang.String format = java.lang.String.format("%02X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            return format;
        }
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.view.provider.CallingAppInfo)) {
            return false;
        }
        androidx.view.provider.CallingAppInfo callingAppInfo = (androidx.view.provider.CallingAppInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.packageName, callingAppInfo.packageName) && kotlin.jvm.internal.Intrinsics.areEqual(this.origin, callingAppInfo.origin) && kotlin.jvm.internal.Intrinsics.areEqual(this.signingInfoCompat, callingAppInfo.signingInfoCompat);
    }

    public final int hashCode() {
        int hashCode = this.packageName.hashCode();
        java.lang.String str = this.origin;
        return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.signingInfoCompat.hashCode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallingAppInfo(java.lang.String str, java.util.List<? extends android.content.pm.Signature> list) {
        this(str, list, (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallingAppInfo(java.lang.String str, android.content.pm.SigningInfo signingInfo) {
        this(str, signingInfo, (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signingInfo, "");
    }
}
