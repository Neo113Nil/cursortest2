package com.plaid.link.result;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \n2\u00020\u0001:\n\u000b\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005\u0082\u0001\t\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus;", "Landroid/os/Parcelable;", "", "jsonValue", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getJsonValue", "()Ljava/lang/String;", "setJsonValue", "Companion", "CHOOSE_DEVICE", "INSTITUTION_NOT_FOUND", "REQUIRES_ACCOUNT_SELECTION", "REQUIRES_CODE", "REQUIRES_CREDENTIALS", "REQUIRES_OAUTH", "REQUIRES_QUESTIONS", "REQUIRES_SELECTIONS", "UNKNOWN", "Lcom/plaid/link/result/LinkExitMetadataStatus$CHOOSE_DEVICE;", "Lcom/plaid/link/result/LinkExitMetadataStatus$INSTITUTION_NOT_FOUND;", "Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_ACCOUNT_SELECTION;", "Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_CODE;", "Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_CREDENTIALS;", "Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_OAUTH;", "Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_QUESTIONS;", "Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_SELECTIONS;", "Lcom/plaid/link/result/LinkExitMetadataStatus$UNKNOWN;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class LinkExitMetadataStatus implements android.os.Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.plaid.link.result.LinkExitMetadataStatus.Companion INSTANCE = new com.plaid.link.result.LinkExitMetadataStatus.Companion(null);
    private static final java.util.Map<java.lang.String, com.plaid.link.result.LinkExitMetadataStatus> map = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("choose_device", com.plaid.link.result.LinkExitMetadataStatus.CHOOSE_DEVICE.INSTANCE), kotlin.TuplesKt.to("institution_not_found", com.plaid.link.result.LinkExitMetadataStatus.INSTITUTION_NOT_FOUND.INSTANCE), kotlin.TuplesKt.to("requires_account_selection", com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_ACCOUNT_SELECTION.INSTANCE), kotlin.TuplesKt.to("requires_code", com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_CODE.INSTANCE), kotlin.TuplesKt.to("requires_credentials", com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_CREDENTIALS.INSTANCE), kotlin.TuplesKt.to("requires_oauth", com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_OAUTH.INSTANCE), kotlin.TuplesKt.to("requires_questions", com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_QUESTIONS.INSTANCE), kotlin.TuplesKt.to("requires_selections", com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_SELECTIONS.INSTANCE));
    private java.lang.String jsonValue;

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus$Companion;", "", "<init>", "()V", "", "eventName", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "fromString", "(Ljava/lang/String;)Lcom/plaid/link/result/LinkExitMetadataStatus;", "", "map", "Ljava/util/Map;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.plaid.link.result.LinkExitMetadataStatus fromString(java.lang.String eventName) {
            if (eventName == null || eventName.length() == 0) {
                return null;
            }
            com.plaid.link.result.LinkExitMetadataStatus linkExitMetadataStatus = (com.plaid.link.result.LinkExitMetadataStatus) com.plaid.link.result.LinkExitMetadataStatus.map.get(eventName);
            return linkExitMetadataStatus == null ? new com.plaid.link.result.LinkExitMetadataStatus.UNKNOWN(eventName) : linkExitMetadataStatus;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LinkExitMetadataStatus(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final java.lang.String getJsonValue() {
        return this.jsonValue;
    }

    public final void setJsonValue(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.jsonValue = str;
    }

    private LinkExitMetadataStatus(java.lang.String str) {
        this.jsonValue = str;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus$CHOOSE_DEVICE;", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CHOOSE_DEVICE extends com.plaid.link.result.LinkExitMetadataStatus {
        public static final com.plaid.link.result.LinkExitMetadataStatus.CHOOSE_DEVICE INSTANCE = new com.plaid.link.result.LinkExitMetadataStatus.CHOOSE_DEVICE();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkExitMetadataStatus.CHOOSE_DEVICE> CREATOR = new com.plaid.link.result.LinkExitMetadataStatus.CHOOSE_DEVICE.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkExitMetadataStatus.CHOOSE_DEVICE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkExitMetadataStatus.CHOOSE_DEVICE createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkExitMetadataStatus.CHOOSE_DEVICE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkExitMetadataStatus.CHOOSE_DEVICE[] newArray(int i) {
                return new com.plaid.link.result.LinkExitMetadataStatus.CHOOSE_DEVICE[i];
            }
        }

        private CHOOSE_DEVICE() {
            super("choose_device", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus$INSTITUTION_NOT_FOUND;", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class INSTITUTION_NOT_FOUND extends com.plaid.link.result.LinkExitMetadataStatus {
        public static final com.plaid.link.result.LinkExitMetadataStatus.INSTITUTION_NOT_FOUND INSTANCE = new com.plaid.link.result.LinkExitMetadataStatus.INSTITUTION_NOT_FOUND();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkExitMetadataStatus.INSTITUTION_NOT_FOUND> CREATOR = new com.plaid.link.result.LinkExitMetadataStatus.INSTITUTION_NOT_FOUND.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkExitMetadataStatus.INSTITUTION_NOT_FOUND> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkExitMetadataStatus.INSTITUTION_NOT_FOUND createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkExitMetadataStatus.INSTITUTION_NOT_FOUND.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkExitMetadataStatus.INSTITUTION_NOT_FOUND[] newArray(int i) {
                return new com.plaid.link.result.LinkExitMetadataStatus.INSTITUTION_NOT_FOUND[i];
            }
        }

        private INSTITUTION_NOT_FOUND() {
            super("institution_not_found", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_ACCOUNT_SELECTION;", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class REQUIRES_ACCOUNT_SELECTION extends com.plaid.link.result.LinkExitMetadataStatus {
        public static final com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_ACCOUNT_SELECTION INSTANCE = new com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_ACCOUNT_SELECTION();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_ACCOUNT_SELECTION> CREATOR = new com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_ACCOUNT_SELECTION.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_ACCOUNT_SELECTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_ACCOUNT_SELECTION createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_ACCOUNT_SELECTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_ACCOUNT_SELECTION[] newArray(int i) {
                return new com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_ACCOUNT_SELECTION[i];
            }
        }

        private REQUIRES_ACCOUNT_SELECTION() {
            super("requires_account_selection", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_CODE;", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class REQUIRES_CODE extends com.plaid.link.result.LinkExitMetadataStatus {
        public static final com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_CODE INSTANCE = new com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_CODE();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_CODE> CREATOR = new com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_CODE.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_CODE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_CODE createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_CODE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_CODE[] newArray(int i) {
                return new com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_CODE[i];
            }
        }

        private REQUIRES_CODE() {
            super("requires_code", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_CREDENTIALS;", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class REQUIRES_CREDENTIALS extends com.plaid.link.result.LinkExitMetadataStatus {
        public static final com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_CREDENTIALS INSTANCE = new com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_CREDENTIALS();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_CREDENTIALS> CREATOR = new com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_CREDENTIALS.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_CREDENTIALS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_CREDENTIALS createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_CREDENTIALS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_CREDENTIALS[] newArray(int i) {
                return new com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_CREDENTIALS[i];
            }
        }

        private REQUIRES_CREDENTIALS() {
            super("requires_credentials", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_OAUTH;", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class REQUIRES_OAUTH extends com.plaid.link.result.LinkExitMetadataStatus {
        public static final com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_OAUTH INSTANCE = new com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_OAUTH();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_OAUTH> CREATOR = new com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_OAUTH.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_OAUTH> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_OAUTH createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_OAUTH.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_OAUTH[] newArray(int i) {
                return new com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_OAUTH[i];
            }
        }

        private REQUIRES_OAUTH() {
            super("requires_oauth", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_QUESTIONS;", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class REQUIRES_QUESTIONS extends com.plaid.link.result.LinkExitMetadataStatus {
        public static final com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_QUESTIONS INSTANCE = new com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_QUESTIONS();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_QUESTIONS> CREATOR = new com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_QUESTIONS.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_QUESTIONS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_QUESTIONS createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_QUESTIONS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_QUESTIONS[] newArray(int i) {
                return new com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_QUESTIONS[i];
            }
        }

        private REQUIRES_QUESTIONS() {
            super("requires_questions", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus$REQUIRES_SELECTIONS;", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class REQUIRES_SELECTIONS extends com.plaid.link.result.LinkExitMetadataStatus {
        public static final com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_SELECTIONS INSTANCE = new com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_SELECTIONS();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_SELECTIONS> CREATOR = new com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_SELECTIONS.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_SELECTIONS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_SELECTIONS createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_SELECTIONS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_SELECTIONS[] newArray(int i) {
                return new com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_SELECTIONS[i];
            }
        }

        private REQUIRES_SELECTIONS() {
            super("requires_selections", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f"}, d2 = {"Lcom/plaid/link/result/LinkExitMetadataStatus$UNKNOWN;", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "", "rawJson", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UNKNOWN extends com.plaid.link.result.LinkExitMetadataStatus {
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkExitMetadataStatus.UNKNOWN> CREATOR = new com.plaid.link.result.LinkExitMetadataStatus.UNKNOWN.Creator();
        private final java.lang.String rawJson;

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkExitMetadataStatus.UNKNOWN> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkExitMetadataStatus.UNKNOWN createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.plaid.link.result.LinkExitMetadataStatus.UNKNOWN(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkExitMetadataStatus.UNKNOWN[] newArray(int i) {
                return new com.plaid.link.result.LinkExitMetadataStatus.UNKNOWN[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UNKNOWN(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.rawJson = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.rawJson);
        }
    }
}
