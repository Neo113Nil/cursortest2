package com.zettle.sdk.feature.taptopay.ui.retrieve;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0007\b\t\nR\u0014\u0010\u0006\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\u000b\f\r\u000e"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason;", "Landroid/os/Parcelable;", "Lcom/zettle/sdk/ui/FailureReason;", "", "getDescription", "()Ljava/lang/String;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "NetworkError", "NotAuthorized", "NotFound", "TechnicalError", "Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason$NetworkError;", "Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason$NotAuthorized;", "Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason$NotFound;", "Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason$TechnicalError;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface RetrieveTransactionFailureReason extends android.os.Parcelable, com.zettle.sdk.ui.FailureReason {
    java.lang.String getDescription();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static java.lang.String getId(com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason retrieveTransactionFailureReason) {
            return com.zettle.sdk.ui.FailureReason.DefaultImpls.getId(retrieveTransactionFailureReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason$NotAuthorized;", "Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason$NotAuthorized;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDescription"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class NotAuthorized implements com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotAuthorized> CREATOR = new com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotAuthorized.Creator();
        private final java.lang.String description;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public NotAuthorized(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.description = str;
        }

        @Override // com.zettle.sdk.ui.FailureReason
        public final java.lang.String getId() {
            return com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.DefaultImpls.getId(this);
        }

        @Override // com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.description);
        }

        public final java.lang.String toString() {
            java.lang.String description = getDescription();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotAuthorized(description=");
            sb.append(description);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return getDescription().hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotAuthorized) && kotlin.jvm.internal.Intrinsics.areEqual(getDescription(), ((com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotAuthorized) other).getDescription());
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotAuthorized> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotAuthorized[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotAuthorized[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotAuthorized createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotAuthorized(parcel.readString());
            }
        }

        public final com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotAuthorized copy(java.lang.String description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            return new com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotAuthorized(description);
        }

        public final java.lang.String component1() {
            return getDescription();
        }

        public static /* synthetic */ com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotAuthorized copy$default(com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotAuthorized notAuthorized, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = notAuthorized.getDescription();
            }
            return notAuthorized.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason$NotFound;", "Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason$NotFound;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDescription"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class NotFound implements com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotFound> CREATOR = new com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotFound.Creator();
        private final java.lang.String description;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public NotFound(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.description = str;
        }

        @Override // com.zettle.sdk.ui.FailureReason
        public final java.lang.String getId() {
            return com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.DefaultImpls.getId(this);
        }

        @Override // com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.description);
        }

        public final java.lang.String toString() {
            java.lang.String description = getDescription();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotFound(description=");
            sb.append(description);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return getDescription().hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotFound) && kotlin.jvm.internal.Intrinsics.areEqual(getDescription(), ((com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotFound) other).getDescription());
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotFound> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotFound[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotFound[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotFound createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotFound(parcel.readString());
            }
        }

        public final com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotFound copy(java.lang.String description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            return new com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotFound(description);
        }

        public final java.lang.String component1() {
            return getDescription();
        }

        public static /* synthetic */ com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotFound copy$default(com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NotFound notFound, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = notFound.getDescription();
            }
            return notFound.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason$TechnicalError;", "Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason$TechnicalError;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDescription"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TechnicalError implements com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.TechnicalError> CREATOR = new com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.TechnicalError.Creator();
        private final java.lang.String description;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public TechnicalError(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.description = str;
        }

        @Override // com.zettle.sdk.ui.FailureReason
        public final java.lang.String getId() {
            return com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.DefaultImpls.getId(this);
        }

        @Override // com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.description);
        }

        public final java.lang.String toString() {
            java.lang.String description = getDescription();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TechnicalError(description=");
            sb.append(description);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return getDescription().hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.TechnicalError) && kotlin.jvm.internal.Intrinsics.areEqual(getDescription(), ((com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.TechnicalError) other).getDescription());
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.TechnicalError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.TechnicalError[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.TechnicalError[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.TechnicalError createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.TechnicalError(parcel.readString());
            }
        }

        public final com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.TechnicalError copy(java.lang.String description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            return new com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.TechnicalError(description);
        }

        public final java.lang.String component1() {
            return getDescription();
        }

        public static /* synthetic */ com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.TechnicalError copy$default(com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.TechnicalError technicalError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = technicalError.getDescription();
            }
            return technicalError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason$NetworkError;", "Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason$NetworkError;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDescription"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class NetworkError implements com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NetworkError> CREATOR = new com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NetworkError.Creator();
        private final java.lang.String description;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public NetworkError(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.description = str;
        }

        @Override // com.zettle.sdk.ui.FailureReason
        public final java.lang.String getId() {
            return com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.DefaultImpls.getId(this);
        }

        @Override // com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.description);
        }

        public final java.lang.String toString() {
            java.lang.String description = getDescription();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkError(description=");
            sb.append(description);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return getDescription().hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NetworkError) && kotlin.jvm.internal.Intrinsics.areEqual(getDescription(), ((com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NetworkError) other).getDescription());
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NetworkError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NetworkError[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NetworkError[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NetworkError createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NetworkError(parcel.readString());
            }
        }

        public final com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NetworkError copy(java.lang.String description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            return new com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NetworkError(description);
        }

        public final java.lang.String component1() {
            return getDescription();
        }

        public static /* synthetic */ com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NetworkError copy$default(com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason.NetworkError networkError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = networkError.getDescription();
            }
            return networkError.copy(str);
        }
    }
}
