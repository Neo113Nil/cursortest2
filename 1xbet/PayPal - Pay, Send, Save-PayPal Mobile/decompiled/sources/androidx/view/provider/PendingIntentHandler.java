package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/credentials/provider/PendingIntentHandler;", "", "<init>", "()V", "Companion", "Api23Impl", "Api34Impl"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PendingIntentHandler {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.PendingIntentHandler.Companion INSTANCE = new androidx.view.provider.PendingIntentHandler.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u0004\u0018\u00010 2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020&H\u0007¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b)\u0010*"}, d2 = {"Landroidx/credentials/provider/PendingIntentHandler$Companion;", "", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroidx/credentials/provider/ProviderCreateCredentialRequest;", "retrieveProviderCreateCredentialRequest", "(Landroid/content/Intent;)Landroidx/credentials/provider/ProviderCreateCredentialRequest;", "Landroidx/credentials/provider/BeginGetCredentialRequest;", "retrieveBeginGetCredentialRequest", "(Landroid/content/Intent;)Landroidx/credentials/provider/BeginGetCredentialRequest;", "Landroidx/credentials/CreateCredentialResponse;", "response", "", "setCreateCredentialResponse", "(Landroid/content/Intent;Landroidx/credentials/CreateCredentialResponse;)V", "", "type", "retrieveCreateCredentialResponse", "(Ljava/lang/String;Landroid/content/Intent;)Landroidx/credentials/CreateCredentialResponse;", "Landroidx/credentials/provider/ProviderGetCredentialRequest;", "retrieveProviderGetCredentialRequest", "(Landroid/content/Intent;)Landroidx/credentials/provider/ProviderGetCredentialRequest;", "Landroidx/credentials/GetCredentialResponse;", "setGetCredentialResponse", "(Landroid/content/Intent;Landroidx/credentials/GetCredentialResponse;)V", "retrieveGetCredentialResponse", "(Landroid/content/Intent;)Landroidx/credentials/GetCredentialResponse;", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "setBeginGetCredentialResponse", "(Landroid/content/Intent;Landroidx/credentials/provider/BeginGetCredentialResponse;)V", "Landroidx/credentials/exceptions/GetCredentialException;", "exception", "setGetCredentialException", "(Landroid/content/Intent;Landroidx/credentials/exceptions/GetCredentialException;)V", "retrieveGetCredentialException", "(Landroid/content/Intent;)Landroidx/credentials/exceptions/GetCredentialException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "setCreateCredentialException", "(Landroid/content/Intent;Landroidx/credentials/exceptions/CreateCredentialException;)V", "retrieveCreateCredentialException", "(Landroid/content/Intent;)Landroidx/credentials/exceptions/CreateCredentialException;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(android.content.Intent intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                return androidx.credentials.provider.PendingIntentHandler.Api34Impl.INSTANCE.retrieveProviderCreateCredentialRequest(intent);
            }
            return androidx.credentials.provider.PendingIntentHandler.Api23Impl.INSTANCE.retrieveProviderCreateCredentialRequest(intent);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.BeginGetCredentialRequest retrieveBeginGetCredentialRequest(android.content.Intent intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                return androidx.credentials.provider.PendingIntentHandler.Api34Impl.INSTANCE.retrieveBeginGetCredentialRequest(intent);
            }
            return androidx.credentials.provider.PendingIntentHandler.Api23Impl.INSTANCE.retrieveBeginGetCredentialRequest(intent);
        }

        @kotlin.jvm.JvmStatic
        public final void setCreateCredentialResponse(android.content.Intent intent, androidx.view.CreateCredentialResponse response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                androidx.credentials.provider.PendingIntentHandler.Api34Impl.INSTANCE.setCreateCredentialResponse(intent, response);
            } else {
                androidx.credentials.provider.PendingIntentHandler.Api23Impl.INSTANCE.setCreateCredentialResponse(intent, response);
            }
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.CreateCredentialResponse retrieveCreateCredentialResponse(java.lang.String type, android.content.Intent intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                return androidx.credentials.provider.PendingIntentHandler.Api34Impl.INSTANCE.extractCreateCredentialResponse(type, intent);
            }
            return androidx.credentials.provider.PendingIntentHandler.Api23Impl.INSTANCE.extractCreateCredentialResponse(intent);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(android.content.Intent intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                return androidx.credentials.provider.PendingIntentHandler.Api34Impl.INSTANCE.retrieveProviderGetCredentialRequest(intent);
            }
            return androidx.credentials.provider.PendingIntentHandler.Api23Impl.INSTANCE.retrieveProviderGetCredentialRequest(intent);
        }

        @kotlin.jvm.JvmStatic
        public final void setGetCredentialResponse(android.content.Intent intent, androidx.view.GetCredentialResponse response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                androidx.credentials.provider.PendingIntentHandler.Api34Impl.INSTANCE.setGetCredentialResponse(intent, response);
            } else {
                androidx.credentials.provider.PendingIntentHandler.Api23Impl.INSTANCE.setGetCredentialResponse(intent, response);
            }
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.GetCredentialResponse retrieveGetCredentialResponse(android.content.Intent intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                return androidx.credentials.provider.PendingIntentHandler.Api34Impl.INSTANCE.extractGetCredentialResponse(intent);
            }
            return androidx.credentials.provider.PendingIntentHandler.Api23Impl.INSTANCE.extractGetCredentialResponse(intent);
        }

        @kotlin.jvm.JvmStatic
        public final void setBeginGetCredentialResponse(android.content.Intent intent, androidx.view.provider.BeginGetCredentialResponse response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                androidx.credentials.provider.PendingIntentHandler.Api34Impl.INSTANCE.setBeginGetCredentialResponse(intent, response);
            } else {
                androidx.credentials.provider.PendingIntentHandler.Api23Impl.INSTANCE.setBeginGetCredentialResponse(intent, response);
            }
        }

        @kotlin.jvm.JvmStatic
        public final void setGetCredentialException(android.content.Intent intent, androidx.view.exceptions.GetCredentialException exception) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                androidx.credentials.provider.PendingIntentHandler.Api34Impl.INSTANCE.setGetCredentialException(intent, exception);
            } else {
                androidx.credentials.provider.PendingIntentHandler.Api23Impl.INSTANCE.setGetCredentialException(intent, exception);
            }
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.exceptions.GetCredentialException retrieveGetCredentialException(android.content.Intent intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                return androidx.credentials.provider.PendingIntentHandler.Api34Impl.INSTANCE.extractGetCredentialException(intent);
            }
            return androidx.credentials.provider.PendingIntentHandler.Api23Impl.INSTANCE.extractGetCredentialException(intent);
        }

        @kotlin.jvm.JvmStatic
        public final void setCreateCredentialException(android.content.Intent intent, androidx.view.exceptions.CreateCredentialException exception) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                androidx.credentials.provider.PendingIntentHandler.Api34Impl.INSTANCE.setCreateCredentialException(intent, exception);
            } else {
                androidx.credentials.provider.PendingIntentHandler.Api23Impl.INSTANCE.setCreateCredentialException(intent, exception);
            }
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.exceptions.CreateCredentialException retrieveCreateCredentialException(android.content.Intent intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                return androidx.credentials.provider.PendingIntentHandler.Api34Impl.INSTANCE.extractCreateCredentialException(intent);
            }
            return androidx.credentials.provider.PendingIntentHandler.Api23Impl.INSTANCE.extractCreateCredentialException(intent);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/credentials/provider/PendingIntentHandler$Api23Impl;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Api23Impl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.credentials.provider.PendingIntentHandler.Api23Impl.Companion INSTANCE = new androidx.credentials.provider.PendingIntentHandler.Api23Impl.Companion(null);

        @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u001dH\u0007¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020'H\u0007¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020-H\u0007¢\u0006\u0004\b0\u00101"}, d2 = {"Landroidx/credentials/provider/PendingIntentHandler$Api23Impl$Companion;", "", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroidx/credentials/provider/ProviderCreateCredentialRequest;", "request", "", "setProviderCreateCredentialRequest", "(Landroid/content/Intent;Landroidx/credentials/provider/ProviderCreateCredentialRequest;)V", "retrieveProviderCreateCredentialRequest", "(Landroid/content/Intent;)Landroidx/credentials/provider/ProviderCreateCredentialRequest;", "Landroidx/credentials/provider/BeginGetCredentialRequest;", "setBeginGetCredentialRequest", "(Landroid/content/Intent;Landroidx/credentials/provider/BeginGetCredentialRequest;)V", "retrieveBeginGetCredentialRequest", "(Landroid/content/Intent;)Landroidx/credentials/provider/BeginGetCredentialRequest;", "Landroidx/credentials/CreateCredentialResponse;", "extractCreateCredentialResponse", "(Landroid/content/Intent;)Landroidx/credentials/CreateCredentialResponse;", "response", "setCreateCredentialResponse", "(Landroid/content/Intent;Landroidx/credentials/CreateCredentialResponse;)V", "Landroidx/credentials/provider/ProviderGetCredentialRequest;", "setProviderGetCredentialRequest", "(Landroid/content/Intent;Landroidx/credentials/provider/ProviderGetCredentialRequest;)V", "retrieveProviderGetCredentialRequest", "(Landroid/content/Intent;)Landroidx/credentials/provider/ProviderGetCredentialRequest;", "Landroidx/credentials/GetCredentialResponse;", "extractGetCredentialResponse", "(Landroid/content/Intent;)Landroidx/credentials/GetCredentialResponse;", "setGetCredentialResponse", "(Landroid/content/Intent;Landroidx/credentials/GetCredentialResponse;)V", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "extractBeginGetCredentialResponse", "(Landroid/content/Intent;)Landroidx/credentials/provider/BeginGetCredentialResponse;", "setBeginGetCredentialResponse", "(Landroid/content/Intent;Landroidx/credentials/provider/BeginGetCredentialResponse;)V", "Landroidx/credentials/exceptions/GetCredentialException;", "extractGetCredentialException", "(Landroid/content/Intent;)Landroidx/credentials/exceptions/GetCredentialException;", "exception", "setGetCredentialException", "(Landroid/content/Intent;Landroidx/credentials/exceptions/GetCredentialException;)V", "Landroidx/credentials/exceptions/CreateCredentialException;", "extractCreateCredentialException", "(Landroid/content/Intent;)Landroidx/credentials/exceptions/CreateCredentialException;", "setCreateCredentialException", "(Landroid/content/Intent;Landroidx/credentials/exceptions/CreateCredentialException;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final void setProviderCreateCredentialRequest(android.content.Intent intent, androidx.view.provider.ProviderCreateCredentialRequest request) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
                intent.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_REQUEST", androidx.view.provider.ProviderCreateCredentialRequest.INSTANCE.asBundle(request));
            }

            @kotlin.jvm.JvmStatic
            public final androidx.view.provider.ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                try {
                    androidx.view.provider.ProviderCreateCredentialRequest.Companion companion = androidx.view.provider.ProviderCreateCredentialRequest.INSTANCE;
                    android.os.Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_REQUEST");
                    if (bundleExtra == null) {
                        return null;
                    }
                    return companion.fromBundle(bundleExtra);
                } catch (java.lang.Exception unused) {
                    return null;
                }
            }

            @kotlin.jvm.JvmStatic
            public final void setBeginGetCredentialRequest(android.content.Intent intent, androidx.view.provider.BeginGetCredentialRequest request) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
                intent.putExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_REQUEST", androidx.view.provider.BeginGetCredentialRequest.INSTANCE.asBundle(request));
            }

            @kotlin.jvm.JvmStatic
            public final androidx.view.provider.BeginGetCredentialRequest retrieveBeginGetCredentialRequest(android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                androidx.view.provider.BeginGetCredentialRequest.Companion companion = androidx.view.provider.BeginGetCredentialRequest.INSTANCE;
                android.os.Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_REQUEST");
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            @kotlin.jvm.JvmStatic
            public final androidx.view.CreateCredentialResponse extractCreateCredentialResponse(android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                androidx.view.CreateCredentialResponse.Companion companion = androidx.view.CreateCredentialResponse.INSTANCE;
                android.os.Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            @kotlin.jvm.JvmStatic
            public final void setCreateCredentialResponse(android.content.Intent intent, androidx.view.CreateCredentialResponse response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                intent.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", androidx.view.CreateCredentialResponse.INSTANCE.asBundle(response));
            }

            @kotlin.jvm.JvmStatic
            public final void setProviderGetCredentialRequest(android.content.Intent intent, androidx.view.provider.ProviderGetCredentialRequest request) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
                intent.putExtra("android.service.credentials.extra.GET_CREDENTIAL_REQUEST", androidx.view.provider.ProviderGetCredentialRequest.INSTANCE.asBundle(request));
            }

            @kotlin.jvm.JvmStatic
            public final androidx.view.provider.ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                try {
                    androidx.view.provider.ProviderGetCredentialRequest.Companion companion = androidx.view.provider.ProviderGetCredentialRequest.INSTANCE;
                    android.os.Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_REQUEST");
                    if (bundleExtra == null) {
                        return null;
                    }
                    return companion.fromBundle(bundleExtra);
                } catch (java.lang.Exception unused) {
                    return null;
                }
            }

            @kotlin.jvm.JvmStatic
            public final androidx.view.GetCredentialResponse extractGetCredentialResponse(android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                androidx.view.GetCredentialResponse.Companion companion = androidx.view.GetCredentialResponse.INSTANCE;
                android.os.Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            @kotlin.jvm.JvmStatic
            public final void setGetCredentialResponse(android.content.Intent intent, androidx.view.GetCredentialResponse response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                intent.putExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", androidx.view.GetCredentialResponse.INSTANCE.asBundle(response));
            }

            @kotlin.jvm.JvmStatic
            public final androidx.view.provider.BeginGetCredentialResponse extractBeginGetCredentialResponse(android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                androidx.view.provider.BeginGetCredentialResponse.Companion companion = androidx.view.provider.BeginGetCredentialResponse.INSTANCE;
                android.os.Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE");
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            @kotlin.jvm.JvmStatic
            public final void setBeginGetCredentialResponse(android.content.Intent intent, androidx.view.provider.BeginGetCredentialResponse response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                intent.putExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE", androidx.view.provider.BeginGetCredentialResponse.INSTANCE.asBundle(response));
            }

            @kotlin.jvm.JvmStatic
            public final androidx.view.exceptions.GetCredentialException extractGetCredentialException(android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                androidx.view.exceptions.GetCredentialException.Companion companion = androidx.view.exceptions.GetCredentialException.INSTANCE;
                android.os.Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            @kotlin.jvm.JvmStatic
            public final void setGetCredentialException(android.content.Intent intent, androidx.view.exceptions.GetCredentialException exception) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
                intent.putExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", androidx.view.exceptions.GetCredentialException.INSTANCE.asBundle(exception));
            }

            @kotlin.jvm.JvmStatic
            public final androidx.view.exceptions.CreateCredentialException extractCreateCredentialException(android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                androidx.view.exceptions.CreateCredentialException.Companion companion = androidx.view.exceptions.CreateCredentialException.INSTANCE;
                android.os.Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            @kotlin.jvm.JvmStatic
            public final void setCreateCredentialException(android.content.Intent intent, androidx.view.exceptions.CreateCredentialException exception) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
                intent.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", androidx.view.exceptions.CreateCredentialException.INSTANCE.asBundle(exception));
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final void setProviderGetCredentialRequest(android.content.Intent intent, androidx.view.provider.ProviderGetCredentialRequest providerGetCredentialRequest) {
            INSTANCE.setProviderGetCredentialRequest(intent, providerGetCredentialRequest);
        }

        @kotlin.jvm.JvmStatic
        public static final void setProviderCreateCredentialRequest(android.content.Intent intent, androidx.view.provider.ProviderCreateCredentialRequest providerCreateCredentialRequest) {
            INSTANCE.setProviderCreateCredentialRequest(intent, providerCreateCredentialRequest);
        }

        @kotlin.jvm.JvmStatic
        public static final void setGetCredentialResponse(android.content.Intent intent, androidx.view.GetCredentialResponse getCredentialResponse) {
            INSTANCE.setGetCredentialResponse(intent, getCredentialResponse);
        }

        @kotlin.jvm.JvmStatic
        public static final void setGetCredentialException(android.content.Intent intent, androidx.view.exceptions.GetCredentialException getCredentialException) {
            INSTANCE.setGetCredentialException(intent, getCredentialException);
        }

        @kotlin.jvm.JvmStatic
        public static final void setCreateCredentialResponse(android.content.Intent intent, androidx.view.CreateCredentialResponse createCredentialResponse) {
            INSTANCE.setCreateCredentialResponse(intent, createCredentialResponse);
        }

        @kotlin.jvm.JvmStatic
        public static final void setCreateCredentialException(android.content.Intent intent, androidx.view.exceptions.CreateCredentialException createCredentialException) {
            INSTANCE.setCreateCredentialException(intent, createCredentialException);
        }

        @kotlin.jvm.JvmStatic
        public static final void setBeginGetCredentialResponse(android.content.Intent intent, androidx.view.provider.BeginGetCredentialResponse beginGetCredentialResponse) {
            INSTANCE.setBeginGetCredentialResponse(intent, beginGetCredentialResponse);
        }

        @kotlin.jvm.JvmStatic
        public static final void setBeginGetCredentialRequest(android.content.Intent intent, androidx.view.provider.BeginGetCredentialRequest beginGetCredentialRequest) {
            INSTANCE.setBeginGetCredentialRequest(intent, beginGetCredentialRequest);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(android.content.Intent intent) {
            return INSTANCE.retrieveProviderGetCredentialRequest(intent);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(android.content.Intent intent) {
            return INSTANCE.retrieveProviderCreateCredentialRequest(intent);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.BeginGetCredentialRequest retrieveBeginGetCredentialRequest(android.content.Intent intent) {
            return INSTANCE.retrieveBeginGetCredentialRequest(intent);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.GetCredentialResponse extractGetCredentialResponse(android.content.Intent intent) {
            return INSTANCE.extractGetCredentialResponse(intent);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.exceptions.GetCredentialException extractGetCredentialException(android.content.Intent intent) {
            return INSTANCE.extractGetCredentialException(intent);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.CreateCredentialResponse extractCreateCredentialResponse(android.content.Intent intent) {
            return INSTANCE.extractCreateCredentialResponse(intent);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.exceptions.CreateCredentialException extractCreateCredentialException(android.content.Intent intent) {
            return INSTANCE.extractCreateCredentialException(intent);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.BeginGetCredentialResponse extractBeginGetCredentialResponse(android.content.Intent intent) {
            return INSTANCE.extractBeginGetCredentialResponse(intent);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/credentials/provider/PendingIntentHandler$Api34Impl;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Api34Impl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.credentials.provider.PendingIntentHandler.Api34Impl.Companion INSTANCE = new androidx.credentials.provider.PendingIntentHandler.Api34Impl.Companion(null);

        @kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020!H\u0007¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020&H\u0007¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020,H\u0007¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020)H\u0007¢\u0006\u0004\b2\u00103"}, d2 = {"Landroidx/credentials/provider/PendingIntentHandler$Api34Impl$Companion;", "", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroidx/credentials/provider/ProviderCreateCredentialRequest;", "retrieveProviderCreateCredentialRequest", "(Landroid/content/Intent;)Landroidx/credentials/provider/ProviderCreateCredentialRequest;", "p0", "", "p1", "p2", "p3", "Landroidx/credentials/provider/BiometricPromptResult;", "getHighSpeedVideoFpsRanges", "(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/provider/BiometricPromptResult;", "getHighSpeedVideoFpsRangesFor", "(Landroid/content/Intent;)Landroidx/credentials/provider/BiometricPromptResult;", "Landroidx/credentials/provider/BeginGetCredentialRequest;", "retrieveBeginGetCredentialRequest", "(Landroid/content/Intent;)Landroidx/credentials/provider/BeginGetCredentialRequest;", "Landroidx/credentials/CreateCredentialResponse;", "response", "", "setCreateCredentialResponse", "(Landroid/content/Intent;Landroidx/credentials/CreateCredentialResponse;)V", "Landroidx/credentials/provider/ProviderGetCredentialRequest;", "retrieveProviderGetCredentialRequest", "(Landroid/content/Intent;)Landroidx/credentials/provider/ProviderGetCredentialRequest;", "type", "extractCreateCredentialResponse", "(Ljava/lang/String;Landroid/content/Intent;)Landroidx/credentials/CreateCredentialResponse;", "Landroidx/credentials/GetCredentialResponse;", "extractGetCredentialResponse", "(Landroid/content/Intent;)Landroidx/credentials/GetCredentialResponse;", "setGetCredentialResponse", "(Landroid/content/Intent;Landroidx/credentials/GetCredentialResponse;)V", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "setBeginGetCredentialResponse", "(Landroid/content/Intent;Landroidx/credentials/provider/BeginGetCredentialResponse;)V", "Landroidx/credentials/exceptions/CreateCredentialException;", "extractCreateCredentialException", "(Landroid/content/Intent;)Landroidx/credentials/exceptions/CreateCredentialException;", "Landroidx/credentials/exceptions/GetCredentialException;", "extractGetCredentialException", "(Landroid/content/Intent;)Landroidx/credentials/exceptions/GetCredentialException;", "exception", "setGetCredentialException", "(Landroid/content/Intent;Landroidx/credentials/exceptions/GetCredentialException;)V", "setCreateCredentialException", "(Landroid/content/Intent;Landroidx/credentials/exceptions/CreateCredentialException;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @kotlin.jvm.JvmStatic
            public final androidx.view.provider.ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                android.service.credentials.CreateCredentialRequest createCredentialRequest = (android.service.credentials.CreateCredentialRequest) intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_REQUEST", android.service.credentials.CreateCredentialRequest.class);
                if (createCredentialRequest == 0) {
                    return (androidx.view.provider.ProviderCreateCredentialRequest) createCredentialRequest;
                }
                androidx.view.provider.BiometricPromptResult highSpeedVideoFpsRanges$default = getHighSpeedVideoFpsRanges$default(this, intent, null, null, null, 14, null);
                if (highSpeedVideoFpsRanges$default == null) {
                    highSpeedVideoFpsRanges$default = getHighSpeedVideoFpsRangesFor(intent);
                }
                try {
                    androidx.view.CreateCredentialRequest.Companion companion = androidx.view.CreateCredentialRequest.INSTANCE;
                    java.lang.String type = createCredentialRequest.getType();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
                    android.os.Bundle data = createCredentialRequest.getData();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "");
                    android.os.Bundle data2 = createCredentialRequest.getData();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data2, "");
                    androidx.view.CreateCredentialRequest createFrom = companion.createFrom(type, data, data2, false, createCredentialRequest.getCallingAppInfo().getOrigin());
                    androidx.view.provider.CallingAppInfo.Companion companion2 = androidx.view.provider.CallingAppInfo.INSTANCE;
                    java.lang.String packageName = createCredentialRequest.getCallingAppInfo().getPackageName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "");
                    android.content.pm.SigningInfo signingInfo = createCredentialRequest.getCallingAppInfo().getSigningInfo();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(signingInfo, "");
                    return new androidx.view.provider.ProviderCreateCredentialRequest(createFrom, companion2.create(packageName, signingInfo, createCredentialRequest.getCallingAppInfo().getOrigin()), highSpeedVideoFpsRanges$default);
                } catch (java.lang.IllegalArgumentException unused) {
                    return null;
                }
            }

            static /* synthetic */ androidx.view.provider.BiometricPromptResult getHighSpeedVideoFpsRanges$default(androidx.credentials.provider.PendingIntentHandler.Api34Impl.Companion companion, android.content.Intent intent, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
                if ((i & 2) != 0) {
                    str = androidx.view.provider.AuthenticationResult.EXTRA_BIOMETRIC_AUTH_RESULT_TYPE;
                }
                if ((i & 4) != 0) {
                    str2 = androidx.view.provider.AuthenticationError.EXTRA_BIOMETRIC_AUTH_ERROR;
                }
                if ((i & 8) != 0) {
                    str3 = androidx.view.provider.AuthenticationError.EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE;
                }
                return companion.getHighSpeedVideoFpsRanges(intent, str, str2, str3);
            }

            private final androidx.view.provider.BiometricPromptResult getHighSpeedVideoFpsRanges(android.content.Intent p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {
                if (p0.getExtras() == null) {
                    return null;
                }
                android.os.Bundle extras = p0.getExtras();
                kotlin.jvm.internal.Intrinsics.checkNotNull(extras);
                if (extras.containsKey(p1)) {
                    android.os.Bundle extras2 = p0.getExtras();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(extras2);
                    return new androidx.view.provider.BiometricPromptResult(new androidx.view.provider.AuthenticationResult(extras2.getInt(p1)));
                }
                android.os.Bundle extras3 = p0.getExtras();
                kotlin.jvm.internal.Intrinsics.checkNotNull(extras3);
                if (!extras3.containsKey(p2)) {
                    return null;
                }
                android.os.Bundle extras4 = p0.getExtras();
                kotlin.jvm.internal.Intrinsics.checkNotNull(extras4);
                int i = extras4.getInt(p2);
                android.os.Bundle extras5 = p0.getExtras();
                return new androidx.view.provider.BiometricPromptResult(new androidx.view.provider.AuthenticationError(i, extras5 != null ? extras5.getCharSequence(p3) : null));
            }

            private final androidx.view.provider.BiometricPromptResult getHighSpeedVideoFpsRangesFor(android.content.Intent p0) {
                if (p0.getExtras() == null) {
                    return null;
                }
                android.os.Bundle extras = p0.getExtras();
                kotlin.jvm.internal.Intrinsics.checkNotNull(extras);
                if (!extras.containsKey(androidx.view.provider.AuthenticationResult.EXTRA_BIOMETRIC_AUTH_RESULT_TYPE_FALLBACK)) {
                    android.os.Bundle extras2 = p0.getExtras();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(extras2);
                    if (!extras2.containsKey(androidx.view.provider.AuthenticationError.EXTRA_BIOMETRIC_AUTH_ERROR_FALLBACK)) {
                        return null;
                    }
                }
                return getHighSpeedVideoFpsRanges(p0, androidx.view.provider.AuthenticationResult.EXTRA_BIOMETRIC_AUTH_RESULT_TYPE_FALLBACK, androidx.view.provider.AuthenticationError.EXTRA_BIOMETRIC_AUTH_ERROR_FALLBACK, androidx.view.provider.AuthenticationError.EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE_FALLBACK);
            }

            @kotlin.jvm.JvmStatic
            public final androidx.view.provider.BeginGetCredentialRequest retrieveBeginGetCredentialRequest(android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                android.service.credentials.BeginGetCredentialRequest beginGetCredentialRequest = (android.service.credentials.BeginGetCredentialRequest) intent.getParcelableExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_REQUEST", android.service.credentials.BeginGetCredentialRequest.class);
                if (beginGetCredentialRequest != null) {
                    return androidx.view.provider.utils.BeginGetCredentialUtil.INSTANCE.convertToJetpackRequest$credentials_release(beginGetCredentialRequest);
                }
                return null;
            }

            @kotlin.jvm.JvmStatic
            public final void setCreateCredentialResponse(android.content.Intent intent, androidx.view.CreateCredentialResponse response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                intent.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", new android.credentials.CreateCredentialResponse(response.getData()));
            }

            @kotlin.jvm.JvmStatic
            public final androidx.view.provider.ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                android.service.credentials.GetCredentialRequest getCredentialRequest = (android.service.credentials.GetCredentialRequest) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_REQUEST", android.service.credentials.GetCredentialRequest.class);
                if (getCredentialRequest == null) {
                    return null;
                }
                androidx.view.provider.BiometricPromptResult highSpeedVideoFpsRanges$default = getHighSpeedVideoFpsRanges$default(this, intent, null, null, null, 14, null);
                if (highSpeedVideoFpsRanges$default == null) {
                    highSpeedVideoFpsRanges$default = getHighSpeedVideoFpsRangesFor(intent);
                }
                androidx.view.provider.ProviderGetCredentialRequest.Companion companion = androidx.view.provider.ProviderGetCredentialRequest.INSTANCE;
                java.util.stream.Stream<android.credentials.CredentialOption> stream = getCredentialRequest.getCredentialOptions().stream();
                final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.provider.PendingIntentHandler$Api34Impl$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        androidx.view.CredentialOption dq_;
                        dq_ = androidx.credentials.provider.PendingIntentHandler.Api34Impl.Companion.dq_((android.credentials.CredentialOption) obj);
                        return dq_;
                    }
                };
                java.lang.Object collect = stream.map(new java.util.function.Function() { // from class: androidx.credentials.provider.PendingIntentHandler$Api34Impl$Companion$$ExternalSyntheticLambda1
                    @Override // java.util.function.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        androidx.view.CredentialOption highSpeedVideoFpsRangesFor;
                        highSpeedVideoFpsRangesFor = androidx.credentials.provider.PendingIntentHandler.Api34Impl.Companion.getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1.this, obj);
                        return highSpeedVideoFpsRangesFor;
                    }
                }).collect(java.util.stream.Collectors.toList());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(collect, "");
                androidx.view.provider.CallingAppInfo.Companion companion2 = androidx.view.provider.CallingAppInfo.INSTANCE;
                java.lang.String packageName = getCredentialRequest.getCallingAppInfo().getPackageName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "");
                android.content.pm.SigningInfo signingInfo = getCredentialRequest.getCallingAppInfo().getSigningInfo();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(signingInfo, "");
                return companion.createFrom$credentials_release((java.util.List) collect, companion2.create(packageName, signingInfo, getCredentialRequest.getCallingAppInfo().getOrigin()), highSpeedVideoFpsRanges$default, intent.getExtras());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final androidx.view.CredentialOption getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
                return (androidx.view.CredentialOption) function1.invoke(obj);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final androidx.view.CredentialOption dq_(android.credentials.CredentialOption credentialOption) {
                androidx.view.CredentialOption.Companion companion = androidx.view.CredentialOption.INSTANCE;
                java.lang.String type = credentialOption.getType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
                android.os.Bundle credentialRetrievalData = credentialOption.getCredentialRetrievalData();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(credentialRetrievalData, "");
                android.os.Bundle candidateQueryData = credentialOption.getCandidateQueryData();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(candidateQueryData, "");
                boolean isSystemProviderRequired = credentialOption.isSystemProviderRequired();
                java.util.Set<android.content.ComponentName> allowedProviders = credentialOption.getAllowedProviders();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allowedProviders, "");
                return companion.createFrom(type, credentialRetrievalData, candidateQueryData, isSystemProviderRequired, allowedProviders);
            }

            @kotlin.jvm.JvmStatic
            public final androidx.view.CreateCredentialResponse extractCreateCredentialResponse(java.lang.String type, android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                android.credentials.CreateCredentialResponse createCredentialResponse = (android.credentials.CreateCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", android.credentials.CreateCredentialResponse.class);
                if (createCredentialResponse == null) {
                    return null;
                }
                androidx.view.CreateCredentialResponse.Companion companion = androidx.view.CreateCredentialResponse.INSTANCE;
                android.os.Bundle data = createCredentialResponse.getData();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "");
                return companion.createFrom(type, data);
            }

            @kotlin.jvm.JvmStatic
            public final androidx.view.GetCredentialResponse extractGetCredentialResponse(android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                android.credentials.GetCredentialResponse getCredentialResponse = (android.credentials.GetCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", android.credentials.GetCredentialResponse.class);
                if (getCredentialResponse == null) {
                    return null;
                }
                androidx.view.Credential.Companion companion = androidx.view.Credential.INSTANCE;
                android.credentials.Credential credential = getCredentialResponse.getCredential();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(credential, "");
                return new androidx.view.GetCredentialResponse(companion.createFrom(credential));
            }

            @kotlin.jvm.JvmStatic
            public final void setGetCredentialResponse(android.content.Intent intent, androidx.view.GetCredentialResponse response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                intent.putExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", new android.credentials.GetCredentialResponse(new android.credentials.Credential(response.getCredential().getType(), response.getCredential().getData())));
            }

            @kotlin.jvm.JvmStatic
            public final void setBeginGetCredentialResponse(android.content.Intent intent, androidx.view.provider.BeginGetCredentialResponse response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                intent.putExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE", androidx.view.provider.utils.BeginGetCredentialUtil.INSTANCE.convertToFrameworkResponse(response));
            }

            @kotlin.jvm.JvmStatic
            public final androidx.view.exceptions.CreateCredentialException extractCreateCredentialException(android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                android.credentials.CreateCredentialException createCredentialException = (android.credentials.CreateCredentialException) intent.getSerializableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", android.credentials.CreateCredentialException.class);
                if (createCredentialException == null) {
                    return null;
                }
                java.lang.String type = createCredentialException.getType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
                return androidx.view.internal.ConversionUtilsKt.toJetpackCreateException(type, createCredentialException.getMessage());
            }

            @kotlin.jvm.JvmStatic
            public final androidx.view.exceptions.GetCredentialException extractGetCredentialException(android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                android.credentials.GetCredentialException getCredentialException = (android.credentials.GetCredentialException) intent.getSerializableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", android.credentials.GetCredentialException.class);
                if (getCredentialException == null) {
                    return null;
                }
                java.lang.String type = getCredentialException.getType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
                return androidx.view.internal.ConversionUtilsKt.toJetpackGetException(type, getCredentialException.getMessage());
            }

            @kotlin.jvm.JvmStatic
            public final void setGetCredentialException(android.content.Intent intent, androidx.view.exceptions.GetCredentialException exception) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
                intent.putExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", new android.credentials.GetCredentialException(exception.getType(), exception.getMessage()));
            }

            @kotlin.jvm.JvmStatic
            public final void setCreateCredentialException(android.content.Intent intent, androidx.view.exceptions.CreateCredentialException exception) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
                intent.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", new android.credentials.CreateCredentialException(exception.getType(), exception.getMessage()));
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final void setGetCredentialResponse(android.content.Intent intent, androidx.view.GetCredentialResponse getCredentialResponse) {
            INSTANCE.setGetCredentialResponse(intent, getCredentialResponse);
        }

        @kotlin.jvm.JvmStatic
        public static final void setGetCredentialException(android.content.Intent intent, androidx.view.exceptions.GetCredentialException getCredentialException) {
            INSTANCE.setGetCredentialException(intent, getCredentialException);
        }

        @kotlin.jvm.JvmStatic
        public static final void setCreateCredentialResponse(android.content.Intent intent, androidx.view.CreateCredentialResponse createCredentialResponse) {
            INSTANCE.setCreateCredentialResponse(intent, createCredentialResponse);
        }

        @kotlin.jvm.JvmStatic
        public static final void setCreateCredentialException(android.content.Intent intent, androidx.view.exceptions.CreateCredentialException createCredentialException) {
            INSTANCE.setCreateCredentialException(intent, createCredentialException);
        }

        @kotlin.jvm.JvmStatic
        public static final void setBeginGetCredentialResponse(android.content.Intent intent, androidx.view.provider.BeginGetCredentialResponse beginGetCredentialResponse) {
            INSTANCE.setBeginGetCredentialResponse(intent, beginGetCredentialResponse);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(android.content.Intent intent) {
            return INSTANCE.retrieveProviderGetCredentialRequest(intent);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(android.content.Intent intent) {
            return INSTANCE.retrieveProviderCreateCredentialRequest(intent);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.BeginGetCredentialRequest retrieveBeginGetCredentialRequest(android.content.Intent intent) {
            return INSTANCE.retrieveBeginGetCredentialRequest(intent);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.GetCredentialResponse extractGetCredentialResponse(android.content.Intent intent) {
            return INSTANCE.extractGetCredentialResponse(intent);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.exceptions.GetCredentialException extractGetCredentialException(android.content.Intent intent) {
            return INSTANCE.extractGetCredentialException(intent);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.CreateCredentialResponse extractCreateCredentialResponse(java.lang.String str, android.content.Intent intent) {
            return INSTANCE.extractCreateCredentialResponse(str, intent);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.exceptions.CreateCredentialException extractCreateCredentialException(android.content.Intent intent) {
            return INSTANCE.extractCreateCredentialException(intent);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void setGetCredentialResponse(android.content.Intent intent, androidx.view.GetCredentialResponse getCredentialResponse) {
        INSTANCE.setGetCredentialResponse(intent, getCredentialResponse);
    }

    @kotlin.jvm.JvmStatic
    public static final void setGetCredentialException(android.content.Intent intent, androidx.view.exceptions.GetCredentialException getCredentialException) {
        INSTANCE.setGetCredentialException(intent, getCredentialException);
    }

    @kotlin.jvm.JvmStatic
    public static final void setCreateCredentialResponse(android.content.Intent intent, androidx.view.CreateCredentialResponse createCredentialResponse) {
        INSTANCE.setCreateCredentialResponse(intent, createCredentialResponse);
    }

    @kotlin.jvm.JvmStatic
    public static final void setCreateCredentialException(android.content.Intent intent, androidx.view.exceptions.CreateCredentialException createCredentialException) {
        INSTANCE.setCreateCredentialException(intent, createCredentialException);
    }

    @kotlin.jvm.JvmStatic
    public static final void setBeginGetCredentialResponse(android.content.Intent intent, androidx.view.provider.BeginGetCredentialResponse beginGetCredentialResponse) {
        INSTANCE.setBeginGetCredentialResponse(intent, beginGetCredentialResponse);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(android.content.Intent intent) {
        return INSTANCE.retrieveProviderGetCredentialRequest(intent);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(android.content.Intent intent) {
        return INSTANCE.retrieveProviderCreateCredentialRequest(intent);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.GetCredentialResponse retrieveGetCredentialResponse(android.content.Intent intent) {
        return INSTANCE.retrieveGetCredentialResponse(intent);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.exceptions.GetCredentialException retrieveGetCredentialException(android.content.Intent intent) {
        return INSTANCE.retrieveGetCredentialException(intent);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.CreateCredentialResponse retrieveCreateCredentialResponse(java.lang.String str, android.content.Intent intent) {
        return INSTANCE.retrieveCreateCredentialResponse(str, intent);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.exceptions.CreateCredentialException retrieveCreateCredentialException(android.content.Intent intent) {
        return INSTANCE.retrieveCreateCredentialException(intent);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.BeginGetCredentialRequest retrieveBeginGetCredentialRequest(android.content.Intent intent) {
        return INSTANCE.retrieveBeginGetCredentialRequest(intent);
    }
}
