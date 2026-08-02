package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB+\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8GX\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/credentials/provider/ProviderGetCredentialRequest;", "", "", "Landroidx/credentials/CredentialOption;", "credentialOptions", "Landroidx/credentials/provider/CallingAppInfo;", "callingAppInfo", "Landroidx/credentials/provider/BiometricPromptResult;", "biometricPromptResult", "Landroid/os/Bundle;", "sourceBundle", "<init>", "(Ljava/util/List;Landroidx/credentials/provider/CallingAppInfo;Landroidx/credentials/provider/BiometricPromptResult;Landroid/os/Bundle;)V", "(Ljava/util/List;Landroidx/credentials/provider/CallingAppInfo;Landroidx/credentials/provider/BiometricPromptResult;)V", "Ljava/util/List;", "getCredentialOptions", "()Ljava/util/List;", "Landroidx/credentials/provider/CallingAppInfo;", "getCallingAppInfo", "()Landroidx/credentials/provider/CallingAppInfo;", "Landroidx/credentials/provider/BiometricPromptResult;", "getBiometricPromptResult", "()Landroidx/credentials/provider/BiometricPromptResult;", "Landroid/os/Bundle;", "getSourceBundle", "()Landroid/os/Bundle;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProviderGetCredentialRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.ProviderGetCredentialRequest.Companion INSTANCE = new androidx.view.provider.ProviderGetCredentialRequest.Companion(null);
    private final androidx.view.provider.BiometricPromptResult biometricPromptResult;
    private final androidx.view.provider.CallingAppInfo callingAppInfo;
    private final java.util.List<androidx.view.CredentialOption> credentialOptions;
    private final android.os.Bundle sourceBundle;

    /* JADX WARN: Multi-variable type inference failed */
    public ProviderGetCredentialRequest(java.util.List<? extends androidx.view.CredentialOption> list, androidx.view.provider.CallingAppInfo callingAppInfo, androidx.view.provider.BiometricPromptResult biometricPromptResult, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callingAppInfo, "");
        this.credentialOptions = list;
        this.callingAppInfo = callingAppInfo;
        this.biometricPromptResult = biometricPromptResult;
        this.sourceBundle = bundle;
    }

    public final java.util.List<androidx.view.CredentialOption> getCredentialOptions() {
        return this.credentialOptions;
    }

    public final androidx.view.provider.CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }

    public final androidx.view.provider.BiometricPromptResult getBiometricPromptResult() {
        return this.biometricPromptResult;
    }

    public final android.os.Bundle getSourceBundle() {
        return this.sourceBundle;
    }

    public /* synthetic */ ProviderGetCredentialRequest(java.util.List list, androidx.view.provider.CallingAppInfo callingAppInfo, androidx.view.provider.BiometricPromptResult biometricPromptResult, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, callingAppInfo, (i & 4) != 0 ? null : biometricPromptResult);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProviderGetCredentialRequest(java.util.List<? extends androidx.view.CredentialOption> list, androidx.view.provider.CallingAppInfo callingAppInfo, androidx.view.provider.BiometricPromptResult biometricPromptResult) {
        this(list, callingAppInfo, biometricPromptResult, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callingAppInfo, "");
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/credentials/provider/ProviderGetCredentialRequest$Companion;", "", "<init>", "()V", "", "Landroidx/credentials/CredentialOption;", "options", "Landroidx/credentials/provider/CallingAppInfo;", "callingAppInfo", "Landroidx/credentials/provider/BiometricPromptResult;", "biometricPromptResult", "Landroid/os/Bundle;", "sourceBundle", "Landroidx/credentials/provider/ProviderGetCredentialRequest;", "createFrom$credentials_release", "(Ljava/util/List;Landroidx/credentials/provider/CallingAppInfo;Landroidx/credentials/provider/BiometricPromptResult;Landroid/os/Bundle;)Landroidx/credentials/provider/ProviderGetCredentialRequest;", "request", "asBundle", "(Landroidx/credentials/provider/ProviderGetCredentialRequest;)Landroid/os/Bundle;", "bundle", "fromBundle", "(Landroid/os/Bundle;)Landroidx/credentials/provider/ProviderGetCredentialRequest;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ androidx.view.provider.ProviderGetCredentialRequest createFrom$credentials_release$default(androidx.view.provider.ProviderGetCredentialRequest.Companion companion, java.util.List list, androidx.view.provider.CallingAppInfo callingAppInfo, androidx.view.provider.BiometricPromptResult biometricPromptResult, android.os.Bundle bundle, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                biometricPromptResult = null;
            }
            return companion.createFrom$credentials_release(list, callingAppInfo, biometricPromptResult, bundle);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.ProviderGetCredentialRequest createFrom$credentials_release(java.util.List<? extends androidx.view.CredentialOption> options, androidx.view.provider.CallingAppInfo callingAppInfo, androidx.view.provider.BiometricPromptResult biometricPromptResult, android.os.Bundle sourceBundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callingAppInfo, "");
            return new androidx.view.provider.ProviderGetCredentialRequest(options, callingAppInfo, biometricPromptResult, sourceBundle);
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle asBundle(androidx.view.provider.ProviderGetCredentialRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            android.os.Bundle bundle = new android.os.Bundle();
            int size = request.getCredentialOptions().size();
            bundle.putInt("androidx.credentials.provider.extra.CREDENTIAL_OPTION_SIZE", size);
            for (int i = 0; i < size; i++) {
                androidx.view.CredentialOption credentialOption = request.getCredentialOptions().get(i);
                bundle.putString(androidx.view.provider.CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_TYPE_PREFIX.concat(java.lang.String.valueOf(i)), credentialOption.getType());
                bundle.putBundle("androidx.credentials.provider.extra.CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_".concat(java.lang.String.valueOf(i)), credentialOption.getCandidateQueryData());
                bundle.putBundle("androidx.credentials.provider.extra.CREDENTIAL_OPTION_CREDENTIAL_RETRIEVAL_DATA_".concat(java.lang.String.valueOf(i)), credentialOption.getRequestData());
                bundle.putBoolean("androidx.credentials.provider.extra.CREDENTIAL_OPTION_IS_SYSTEM_PROVIDER_REQUIRED_".concat(java.lang.String.valueOf(i)), credentialOption.getIsSystemProviderRequired());
                bundle.putParcelableArray("androidx.credentials.provider.extra.CREDENTIAL_OPTION_ALLOWED_PROVIDERS_".concat(java.lang.String.valueOf(i)), (android.os.Parcelable[]) credentialOption.getAllowedProviders().toArray(new android.content.ComponentName[0]));
            }
            androidx.view.provider.CallingAppInfo.INSTANCE.setCallingAppInfo$credentials_release(bundle, request.getCallingAppInfo());
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.ProviderGetCredentialRequest fromBundle(android.os.Bundle bundle) {
            java.util.Set<android.content.ComponentName> emptySet;
            android.os.Parcelable[] parcelableArray;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            androidx.view.provider.CallingAppInfo extractCallingAppInfo = androidx.view.provider.CallingAppInfo.INSTANCE.extractCallingAppInfo(bundle);
            if (extractCallingAppInfo == null) {
                throw new java.lang.IllegalArgumentException("Bundle was missing CallingAppInfo.");
            }
            int i = bundle.getInt("androidx.credentials.provider.extra.CREDENTIAL_OPTION_SIZE", -1);
            if (i < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Bundle had invalid option size as ");
                sb.append(i);
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                java.lang.String string = bundle.getString(androidx.view.provider.CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_TYPE_PREFIX.concat(java.lang.String.valueOf(i2)));
                if (string == null) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Bundle was missing option type at index ");
                    sb2.append(i);
                    sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    throw new java.lang.IllegalArgumentException(sb2.toString());
                }
                android.os.Bundle bundle2 = bundle.getBundle("androidx.credentials.provider.extra.CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_".concat(java.lang.String.valueOf(i2)));
                if (bundle2 == null) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Bundle was missing candidate query data at index ");
                    sb3.append(i);
                    sb3.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    throw new java.lang.IllegalArgumentException(sb3.toString());
                }
                android.os.Bundle bundle3 = bundle.getBundle("androidx.credentials.provider.extra.CREDENTIAL_OPTION_CREDENTIAL_RETRIEVAL_DATA_".concat(java.lang.String.valueOf(i2)));
                if (bundle3 == null) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Bundle was missing request data at index ");
                    sb4.append(i);
                    sb4.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    throw new java.lang.IllegalArgumentException(sb4.toString());
                }
                boolean z = bundle.getBoolean("androidx.credentials.provider.extra.CREDENTIAL_OPTION_IS_SYSTEM_PROVIDER_REQUIRED_".concat(java.lang.String.valueOf(i2)), false);
                try {
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                    sb5.append("androidx.credentials.provider.extra.CREDENTIAL_OPTION_ALLOWED_PROVIDERS_");
                    sb5.append(i2);
                    parcelableArray = bundle.getParcelableArray(sb5.toString());
                } catch (java.lang.Exception unused) {
                    emptySet = kotlin.collections.SetsKt.emptySet();
                }
                if (parcelableArray != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (android.os.Parcelable parcelable : parcelableArray) {
                        android.content.ComponentName componentName = (android.content.ComponentName) parcelable;
                        if (componentName != null) {
                            arrayList2.add(componentName);
                        }
                    }
                    emptySet = kotlin.collections.CollectionsKt.toSet(arrayList2);
                    if (emptySet != null) {
                        arrayList.add(androidx.view.CredentialOption.INSTANCE.createFrom(string, bundle3, bundle2, z, emptySet));
                    }
                }
                emptySet = kotlin.collections.SetsKt.emptySet();
                arrayList.add(androidx.view.CredentialOption.INSTANCE.createFrom(string, bundle3, bundle2, z, emptySet));
            }
            return createFrom$credentials_release(arrayList, extractCallingAppInfo, null, bundle);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.ProviderGetCredentialRequest fromBundle(android.os.Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle asBundle(androidx.view.provider.ProviderGetCredentialRequest providerGetCredentialRequest) {
        return INSTANCE.asBundle(providerGetCredentialRequest);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProviderGetCredentialRequest(java.util.List<? extends androidx.view.CredentialOption> list, androidx.view.provider.CallingAppInfo callingAppInfo) {
        this(list, callingAppInfo, null, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callingAppInfo, "");
    }
}
