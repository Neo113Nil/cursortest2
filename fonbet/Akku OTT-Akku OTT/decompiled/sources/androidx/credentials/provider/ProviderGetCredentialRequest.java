package androidx.credentials.provider;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.credentials.CredentialOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B)\b\u0017\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB1\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/credentials/provider/ProviderGetCredentialRequest;", "", "credentialOptions", "", "Landroidx/credentials/CredentialOption;", "callingAppInfo", "Landroidx/credentials/provider/CallingAppInfo;", "biometricPromptResult", "Landroidx/credentials/provider/BiometricPromptResult;", "(Ljava/util/List;Landroidx/credentials/provider/CallingAppInfo;Landroidx/credentials/provider/BiometricPromptResult;)V", "sourceBundle", "Landroid/os/Bundle;", "(Ljava/util/List;Landroidx/credentials/provider/CallingAppInfo;Landroidx/credentials/provider/BiometricPromptResult;Landroid/os/Bundle;)V", "getBiometricPromptResult", "()Landroidx/credentials/provider/BiometricPromptResult;", "getCallingAppInfo", "()Landroidx/credentials/provider/CallingAppInfo;", "getCredentialOptions", "()Ljava/util/List;", "getSourceBundle", "()Landroid/os/Bundle;", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProviderGetCredentialRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_CREDENTIAL_OPTION_ALLOWED_PROVIDERS_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_ALLOWED_PROVIDERS_";
    private static final String EXTRA_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_";
    private static final String EXTRA_CREDENTIAL_OPTION_CREDENTIAL_RETRIEVAL_DATA_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_CREDENTIAL_RETRIEVAL_DATA_";
    private static final String EXTRA_CREDENTIAL_OPTION_IS_SYSTEM_PROVIDER_REQUIRED_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_IS_SYSTEM_PROVIDER_REQUIRED_";
    private static final String EXTRA_CREDENTIAL_OPTION_SIZE = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_SIZE";
    private static final String EXTRA_CREDENTIAL_OPTION_TYPE_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_TYPE_";
    private final BiometricPromptResult biometricPromptResult;
    private final CallingAppInfo callingAppInfo;
    private final List<CredentialOption> credentialOptions;
    private final Bundle sourceBundle;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J9\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0002\b\u0017J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/credentials/provider/ProviderGetCredentialRequest$Companion;", "", "()V", "EXTRA_CREDENTIAL_OPTION_ALLOWED_PROVIDERS_PREFIX", "", "EXTRA_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX", "EXTRA_CREDENTIAL_OPTION_CREDENTIAL_RETRIEVAL_DATA_PREFIX", "EXTRA_CREDENTIAL_OPTION_IS_SYSTEM_PROVIDER_REQUIRED_PREFIX", "EXTRA_CREDENTIAL_OPTION_SIZE", "EXTRA_CREDENTIAL_OPTION_TYPE_PREFIX", "asBundle", "Landroid/os/Bundle;", "request", "Landroidx/credentials/provider/ProviderGetCredentialRequest;", "createFrom", "options", "", "Landroidx/credentials/CredentialOption;", "callingAppInfo", "Landroidx/credentials/provider/CallingAppInfo;", "biometricPromptResult", "Landroidx/credentials/provider/BiometricPromptResult;", "sourceBundle", "createFrom$credentials_release", "fromBundle", "bundle", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nProviderGetCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProviderGetCredentialRequest.kt\nandroidx/credentials/provider/ProviderGetCredentialRequest$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n37#2,2:208\n11653#3,9:210\n13579#3:219\n13580#3:221\n11662#3:222\n1#4:220\n*S KotlinDebug\n*F\n+ 1 ProviderGetCredentialRequest.kt\nandroidx/credentials/provider/ProviderGetCredentialRequest$Companion\n*L\n133#1:208,2\n187#1:210,9\n187#1:219\n187#1:221\n187#1:222\n187#1:220\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ProviderGetCredentialRequest createFrom$credentials_release$default(Companion companion, List list, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult, Bundle bundle, int i, Object obj) {
            if ((i & 4) != 0) {
                biometricPromptResult = null;
            }
            return companion.createFrom$credentials_release(list, callingAppInfo, biometricPromptResult, bundle);
        }

        @JvmStatic
        public final Bundle asBundle(ProviderGetCredentialRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Bundle bundle = new Bundle();
            int size = request.getCredentialOptions().size();
            bundle.putInt(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_SIZE, size);
            for (int i = 0; i < size; i++) {
                CredentialOption credentialOption = request.getCredentialOptions().get(i);
                bundle.putString(android.support.v4.media.a.a(i, "androidx.credentials.provider.extra.CREDENTIAL_OPTION_TYPE_"), credentialOption.getType());
                bundle.putBundle(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX + i, credentialOption.getCandidateQueryData());
                bundle.putBundle(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_CREDENTIAL_RETRIEVAL_DATA_PREFIX + i, credentialOption.getRequestData());
                bundle.putBoolean(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_IS_SYSTEM_PROVIDER_REQUIRED_PREFIX + i, credentialOption.getIsSystemProviderRequired());
                bundle.putParcelableArray(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_ALLOWED_PROVIDERS_PREFIX + i, (Parcelable[]) credentialOption.getAllowedProviders().toArray(new ComponentName[0]));
            }
            CallingAppInfo.INSTANCE.setCallingAppInfo$credentials_release(bundle, request.getCallingAppInfo());
            return bundle;
        }

        @JvmStatic
        public final ProviderGetCredentialRequest createFrom$credentials_release(List<? extends CredentialOption> options, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult, Bundle sourceBundle) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(callingAppInfo, "callingAppInfo");
            return new ProviderGetCredentialRequest(options, callingAppInfo, biometricPromptResult, sourceBundle);
        }

        @JvmStatic
        public final ProviderGetCredentialRequest fromBundle(Bundle bundle) {
            Set<ComponentName> emptySet;
            Parcelable[] parcelableArray;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            CallingAppInfo extractCallingAppInfo$credentials_release = CallingAppInfo.INSTANCE.extractCallingAppInfo$credentials_release(bundle);
            if (extractCallingAppInfo$credentials_release == null) {
                throw new IllegalArgumentException("Bundle was missing CallingAppInfo.");
            }
            int i = bundle.getInt(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_SIZE, -1);
            if (i < 0) {
                throw new IllegalArgumentException(androidx.compose.runtime.q.a("Bundle had invalid option size as ", i, '.'));
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                String string = bundle.getString("androidx.credentials.provider.extra.CREDENTIAL_OPTION_TYPE_" + i2);
                if (string == null) {
                    throw new IllegalArgumentException(androidx.compose.runtime.q.a("Bundle was missing option type at index ", i, '.'));
                }
                Bundle bundle2 = bundle.getBundle(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX + i2);
                if (bundle2 == null) {
                    throw new IllegalArgumentException(androidx.compose.runtime.q.a("Bundle was missing candidate query data at index ", i, '.'));
                }
                Bundle bundle3 = bundle.getBundle(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_CREDENTIAL_RETRIEVAL_DATA_PREFIX + i2);
                if (bundle3 == null) {
                    throw new IllegalArgumentException(androidx.compose.runtime.q.a("Bundle was missing request data at index ", i, '.'));
                }
                boolean z = bundle.getBoolean(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_IS_SYSTEM_PROVIDER_REQUIRED_PREFIX + i2, false);
                try {
                    parcelableArray = bundle.getParcelableArray(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_ALLOWED_PROVIDERS_PREFIX + i2);
                } catch (Exception unused) {
                    emptySet = SetsKt.emptySet();
                }
                if (parcelableArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Parcelable parcelable : parcelableArray) {
                        ComponentName componentName = (ComponentName) parcelable;
                        if (componentName != null) {
                            arrayList2.add(componentName);
                        }
                    }
                    emptySet = CollectionsKt.toSet(arrayList2);
                    if (emptySet != null) {
                        arrayList.add(CredentialOption.INSTANCE.createFrom(string, bundle3, bundle2, z, emptySet));
                    }
                }
                emptySet = SetsKt.emptySet();
                arrayList.add(CredentialOption.INSTANCE.createFrom(string, bundle3, bundle2, z, emptySet));
            }
            return createFrom$credentials_release(arrayList, extractCallingAppInfo$credentials_release, null, bundle);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProviderGetCredentialRequest(List<? extends CredentialOption> credentialOptions, CallingAppInfo callingAppInfo) {
        this(credentialOptions, callingAppInfo, null, 4, null);
        Intrinsics.checkNotNullParameter(credentialOptions, "credentialOptions");
        Intrinsics.checkNotNullParameter(callingAppInfo, "callingAppInfo");
    }

    @JvmStatic
    public static final Bundle asBundle(ProviderGetCredentialRequest providerGetCredentialRequest) {
        return INSTANCE.asBundle(providerGetCredentialRequest);
    }

    @JvmStatic
    public static final ProviderGetCredentialRequest fromBundle(Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    public final BiometricPromptResult getBiometricPromptResult() {
        return this.biometricPromptResult;
    }

    public final CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }

    public final List<CredentialOption> getCredentialOptions() {
        return this.credentialOptions;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final Bundle getSourceBundle() {
        return this.sourceBundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ProviderGetCredentialRequest(List<? extends CredentialOption> credentialOptions, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult, Bundle bundle) {
        Intrinsics.checkNotNullParameter(credentialOptions, "credentialOptions");
        Intrinsics.checkNotNullParameter(callingAppInfo, "callingAppInfo");
        this.credentialOptions = credentialOptions;
        this.callingAppInfo = callingAppInfo;
        this.biometricPromptResult = biometricPromptResult;
        this.sourceBundle = bundle;
    }

    public /* synthetic */ ProviderGetCredentialRequest(List list, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, callingAppInfo, (i & 4) != 0 ? null : biometricPromptResult);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProviderGetCredentialRequest(List<? extends CredentialOption> credentialOptions, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult) {
        this(credentialOptions, callingAppInfo, biometricPromptResult, null);
        Intrinsics.checkNotNullParameter(credentialOptions, "credentialOptions");
        Intrinsics.checkNotNullParameter(callingAppInfo, "callingAppInfo");
    }
}
