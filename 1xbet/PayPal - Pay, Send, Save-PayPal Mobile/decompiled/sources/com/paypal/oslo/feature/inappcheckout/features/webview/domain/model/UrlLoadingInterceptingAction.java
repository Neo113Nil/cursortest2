package com.paypal.oslo.feature.inappcheckout.features.webview.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction;", "", "NoOp", "RunIntent", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$NoOp;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface UrlLoadingInterceptingAction {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$NoOp;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NoOp implements com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.NoOp INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.NoOp();

        private NoOp() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u0011\u0012"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction;", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/features/switchback/model/SwitchBackToMerchantType;", "getType", "()Lcom/paypal/oslo/feature/inappcheckout/features/switchback/model/SwitchBackToMerchantType;", "", "isUriValid", "()Z", "isCancelFlow", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "Resume", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL, "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent$Cancel;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent$Resume;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class RunIntent implements com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction {
        public static final int $stable = 0;

        public abstract com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType getType();

        public abstract android.net.Uri getUri();

        private RunIntent() {
        }

        public final boolean isUriValid() {
            return (getUri() == null || kotlin.jvm.internal.Intrinsics.areEqual(getUri(), android.net.Uri.EMPTY)) ? false : true;
        }

        public final boolean isCancelFlow() {
            return this instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Cancel;
        }

        @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent$Resume;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/switchback/model/SwitchBackToMerchantType;", "getType", "()Lcom/paypal/oslo/feature/inappcheckout/features/switchback/model/SwitchBackToMerchantType;", "component1", "()Landroid/net/Uri;", "copy", "(Landroid/net/Uri;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent$Resume;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/net/Uri;", "getUri"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Resume extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent {
            public static final int $stable = 8;
            private final android.net.Uri uri;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Resume(android.net.Uri uri) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
                this.uri = uri;
            }

            @Override // com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent
            public final android.net.Uri getUri() {
                return this.uri;
            }

            @Override // com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent
            public final com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType getType() {
                return com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType.Resume;
            }

            public final java.lang.String toString() {
                android.net.Uri uri = this.uri;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Resume(uri=");
                sb.append(uri);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.uri.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Resume) && kotlin.jvm.internal.Intrinsics.areEqual(this.uri, ((com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Resume) other).uri);
            }

            public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Resume copy(android.net.Uri uri) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
                return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Resume(uri);
            }

            /* renamed from: component1, reason: from getter */
            public final android.net.Uri getUri() {
                return this.uri;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Resume copy$default(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Resume resume, android.net.Uri uri, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    uri = resume.uri;
                }
                return resume.copy(uri);
            }
        }

        @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent$Cancel;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/switchback/model/SwitchBackToMerchantType;", "getType", "()Lcom/paypal/oslo/feature/inappcheckout/features/switchback/model/SwitchBackToMerchantType;", "component1", "()Landroid/net/Uri;", "copy", "(Landroid/net/Uri;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent$Cancel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/net/Uri;", "getUri"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Cancel extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent {
            public static final int $stable = 8;
            private final android.net.Uri uri;

            public Cancel(android.net.Uri uri) {
                super(null);
                this.uri = uri;
            }

            @Override // com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent
            public final android.net.Uri getUri() {
                return this.uri;
            }

            @Override // com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent
            public final com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType getType() {
                return com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType.Cancel;
            }

            public final java.lang.String toString() {
                android.net.Uri uri = this.uri;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cancel(uri=");
                sb.append(uri);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                android.net.Uri uri = this.uri;
                if (uri == null) {
                    return 0;
                }
                return uri.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Cancel) && kotlin.jvm.internal.Intrinsics.areEqual(this.uri, ((com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Cancel) other).uri);
            }

            public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Cancel copy(android.net.Uri uri) {
                return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Cancel(uri);
            }

            /* renamed from: component1, reason: from getter */
            public final android.net.Uri getUri() {
                return this.uri;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Cancel copy$default(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Cancel cancel, android.net.Uri uri, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    uri = cancel.uri;
                }
                return cancel.copy(uri);
            }
        }

        public /* synthetic */ RunIntent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
