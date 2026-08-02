package com.paypal.oslo.feature.directdeposit.api.navigation;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/api/navigation/DirectDepositPdfViewerDestination;", "Landroidx/navigation3/runtime/NavKey;", "", "pdfPath", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/directdeposit/api/navigation/DirectDepositPdfViewerDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$directdeposit_api_prodRelease", "(Lcom/paypal/oslo/feature/directdeposit/api/navigation/DirectDepositPdfViewerDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getPdfPath", "getTitle", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class DirectDepositPdfViewerDestination implements androidx.navigation3.runtime.NavKey {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination.Companion INSTANCE = new com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination.Companion(null);
    private final java.lang.String pdfPath;
    private final java.lang.String title;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/api/navigation/DirectDepositPdfViewerDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/directdeposit/api/navigation/DirectDepositPdfViewerDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination> serializer() {
            return com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DirectDepositPdfViewerDestination(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.pdfPath = str;
        this.title = str2;
    }

    public DirectDepositPdfViewerDestination(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.pdfPath = str;
        this.title = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$directdeposit_api_prodRelease(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.pdfPath);
        output.encodeStringElement(serialDesc, 1, self.title);
    }

    public final java.lang.String getPdfPath() {
        return this.pdfPath;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.pdfPath;
        java.lang.String str2 = this.title;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DirectDepositPdfViewerDestination(pdfPath=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.pdfPath.hashCode() * 31) + this.title.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination)) {
            return false;
        }
        com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination directDepositPdfViewerDestination = (com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.pdfPath, directDepositPdfViewerDestination.pdfPath) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, directDepositPdfViewerDestination.title);
    }

    public final com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination copy(java.lang.String pdfPath, java.lang.String title) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdfPath, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        return new com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination(pdfPath, title);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPdfPath() {
        return this.pdfPath;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination copy$default(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination directDepositPdfViewerDestination, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = directDepositPdfViewerDestination.pdfPath;
        }
        if ((i & 2) != 0) {
            str2 = directDepositPdfViewerDestination.title;
        }
        return directDepositPdfViewerDestination.copy(str, str2);
    }
}
