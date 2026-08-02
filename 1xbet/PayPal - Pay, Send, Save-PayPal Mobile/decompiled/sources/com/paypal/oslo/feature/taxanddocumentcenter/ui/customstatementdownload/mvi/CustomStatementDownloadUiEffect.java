package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "OpenFile", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadUiEffect$OpenFile;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class CustomStatementDownloadUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CustomStatementDownloadUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiEffect.NavigateBack();

        public final int hashCode() {
            return -404116310;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadUiEffect$OpenFile;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadUiEffect;", "Landroid/net/Uri;", "fileUri", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "component1", "()Landroid/net/Uri;", "component2", "()Ljava/lang/String;", "copy", "(Landroid/net/Uri;Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadUiEffect$OpenFile;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Landroid/net/Uri;", "getFileUri", "Ljava/lang/String;", "getMimeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenFile extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiEffect {
        public static final int $stable = 8;
        private final android.net.Uri fileUri;
        private final java.lang.String mimeType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenFile(android.net.Uri uri, java.lang.String str) {
            super("OpenFile", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
            this.fileUri = uri;
            this.mimeType = str;
        }

        public final android.net.Uri getFileUri() {
            return this.fileUri;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final java.lang.String toString() {
            android.net.Uri uri = this.fileUri;
            java.lang.String str = this.mimeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenFile(fileUri=");
            sb.append(uri);
            sb.append(", mimeType=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.fileUri.hashCode();
            java.lang.String str = this.mimeType;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiEffect.OpenFile)) {
                return false;
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiEffect.OpenFile openFile = (com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiEffect.OpenFile) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fileUri, openFile.fileUri) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, openFile.mimeType);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiEffect.OpenFile copy(android.net.Uri fileUri, java.lang.String mimeType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileUri, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiEffect.OpenFile(fileUri, mimeType);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component1, reason: from getter */
        public final android.net.Uri getFileUri() {
            return this.fileUri;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiEffect.OpenFile copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiEffect.OpenFile openFile, android.net.Uri uri, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uri = openFile.fileUri;
            }
            if ((i & 2) != 0) {
                str = openFile.mimeType;
            }
            return openFile.copy(uri, str);
        }
    }

    public /* synthetic */ CustomStatementDownloadUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
