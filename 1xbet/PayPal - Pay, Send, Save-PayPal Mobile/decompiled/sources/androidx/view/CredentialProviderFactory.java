package androidx.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\r\u001a\u0004\u0018\u00010\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00078G@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR.\u0010\u001e\u001a\u0004\u0018\u00010\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\t8G@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\"R.\u0010#\u001a\u0004\u0018\u00010\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\t8G@GX\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\""}, d2 = {"Landroidx/credentials/CredentialProviderFactory;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "", "shouldFallbackToPreU", "Landroidx/credentials/CredentialProvider;", "getBestAvailableProvider", "(Ljava/lang/Object;Z)Landroidx/credentials/CredentialProvider;", "(Z)Landroidx/credentials/CredentialProvider;", "Camera2StreamConfigurationMap", "()Landroidx/credentials/CredentialProvider;", "", "", "p0", "p1", "(Ljava/util/List;Landroid/content/Context;)Landroidx/credentials/CredentialProvider;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "testMode", "Z", "getTestMode", "()Z", "setTestMode", "(Z)V", "testPostUProvider", "Landroidx/credentials/CredentialProvider;", "getTestPostUProvider", "setTestPostUProvider", "(Landroidx/credentials/CredentialProvider;)V", "testPreUProvider", "getTestPreUProvider", "setTestPreUProvider", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CredentialProviderFactory {
    private final android.content.Context context;
    private boolean testMode;
    private androidx.view.CredentialProvider testPostUProvider;
    private androidx.view.CredentialProvider testPreUProvider;

    public CredentialProviderFactory(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.context = context;
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final boolean getTestMode() {
        return this.testMode;
    }

    public final void setTestMode(boolean z) {
        this.testMode = z;
    }

    public final androidx.view.CredentialProvider getTestPostUProvider() {
        return this.testPostUProvider;
    }

    public final void setTestPostUProvider(androidx.view.CredentialProvider credentialProvider) {
        this.testPostUProvider = credentialProvider;
    }

    public final androidx.view.CredentialProvider getTestPreUProvider() {
        return this.testPreUProvider;
    }

    public final void setTestPreUProvider(androidx.view.CredentialProvider credentialProvider) {
        this.testPreUProvider = credentialProvider;
    }

    public static /* synthetic */ androidx.view.CredentialProvider getBestAvailableProvider$default(androidx.view.CredentialProviderFactory credentialProviderFactory, java.lang.Object obj, boolean z, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        return credentialProviderFactory.getBestAvailableProvider(obj, z);
    }

    public final androidx.view.CredentialProvider getBestAvailableProvider(java.lang.Object request, boolean shouldFallbackToPreU) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        if ((request instanceof androidx.view.CreateRestoreCredentialRequest) || kotlin.jvm.internal.Intrinsics.areEqual(request, androidx.view.ClearCredentialStateRequest.TYPE_CLEAR_RESTORE_CREDENTIAL)) {
            return Camera2StreamConfigurationMap();
        }
        if (request instanceof androidx.view.GetCredentialRequest) {
            for (androidx.view.CredentialOption credentialOption : ((androidx.view.GetCredentialRequest) request).getCredentialOptions()) {
                if ((credentialOption instanceof androidx.view.GetRestoreCredentialOption) || (credentialOption instanceof androidx.view.GetDigitalCredentialOption)) {
                    return Camera2StreamConfigurationMap();
                }
            }
        } else {
            if ((request instanceof androidx.view.SignalCredentialStateRequest) || ((request instanceof androidx.view.CreatePublicKeyCredentialRequest) && ((androidx.view.CreatePublicKeyCredentialRequest) request).getIsConditional())) {
                return Camera2StreamConfigurationMap();
            }
            if (request instanceof androidx.view.CreateDigitalCredentialRequest) {
                return Camera2StreamConfigurationMap();
            }
        }
        return getBestAvailableProvider(shouldFallbackToPreU);
    }

    public static /* synthetic */ androidx.view.CredentialProvider getBestAvailableProvider$default(androidx.view.CredentialProviderFactory credentialProviderFactory, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return credentialProviderFactory.getBestAvailableProvider(z);
    }

    public final androidx.view.CredentialProvider getBestAvailableProvider(boolean shouldFallbackToPreU) {
        if (androidx.view.internal.FormFactorHelper.isTV(this.context) || androidx.view.internal.FormFactorHelper.isAuto(this.context)) {
            return Camera2StreamConfigurationMap();
        }
        androidx.view.CredentialProviderFrameworkImpl credentialProviderFrameworkImpl = null;
        if (android.os.Build.VERSION.SDK_INT < 34) {
            if (android.os.Build.VERSION.SDK_INT <= 33) {
                return Camera2StreamConfigurationMap();
            }
            return null;
        }
        if (this.testMode) {
            androidx.view.CredentialProvider credentialProvider = this.testPostUProvider;
            if (credentialProvider != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(credentialProvider);
                if (credentialProvider.isAvailableOnDevice()) {
                    credentialProviderFrameworkImpl = this.testPostUProvider;
                }
            }
        } else {
            androidx.view.CredentialProviderFrameworkImpl credentialProviderFrameworkImpl2 = new androidx.view.CredentialProviderFrameworkImpl(this.context);
            if (credentialProviderFrameworkImpl2.isAvailableOnDevice()) {
                credentialProviderFrameworkImpl = credentialProviderFrameworkImpl2;
            }
        }
        return (credentialProviderFrameworkImpl == null && shouldFallbackToPreU) ? Camera2StreamConfigurationMap() : credentialProviderFrameworkImpl;
    }

    private final androidx.view.CredentialProvider Camera2StreamConfigurationMap() {
        java.lang.String string;
        if (this.testMode) {
            androidx.view.CredentialProvider credentialProvider = this.testPreUProvider;
            if (credentialProvider == null) {
                return null;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(credentialProvider);
            if (credentialProvider.isAvailableOnDevice()) {
                return this.testPreUProvider;
            }
            return null;
        }
        android.content.Context context = this.context;
        android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (packageInfo.services != null) {
            android.content.pm.ServiceInfo[] serviceInfoArr = packageInfo.services;
            kotlin.jvm.internal.Intrinsics.checkNotNull(serviceInfoArr);
            for (android.content.pm.ServiceInfo serviceInfo : serviceInfoArr) {
                if (serviceInfo.metaData != null && (string = serviceInfo.metaData.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        java.util.List list = kotlin.collections.CollectionsKt.toList(arrayList);
        if (list.isEmpty()) {
            return null;
        }
        return Camera2StreamConfigurationMap(list, this.context);
    }

    private static androidx.view.CredentialProvider Camera2StreamConfigurationMap(java.util.List<java.lang.String> p0, android.content.Context p1) {
        java.util.Iterator<java.lang.String> it = p0.iterator();
        androidx.view.CredentialProvider credentialProvider = null;
        while (it.hasNext()) {
            try {
                java.lang.Object newInstance = java.lang.Class.forName(it.next()).getConstructor(android.content.Context.class).newInstance(p1);
                kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance, "");
                androidx.view.CredentialProvider credentialProvider2 = (androidx.view.CredentialProvider) newInstance;
                if (!credentialProvider2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (credentialProvider != null) {
                        return null;
                    }
                    credentialProvider = credentialProvider2;
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return credentialProvider;
    }
}
