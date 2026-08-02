package com.paypal.oslo.feature.businessinventory.ui.taxedit;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner;", "Landroid/os/Parcelable;", "<init>", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Show", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$None;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ErrorBanner implements android.os.Parcelable {
    public static final int $stable = 0;

    private ErrorBanner() {
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$None;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class None extends com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.None INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.None();
        public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.None> CREATOR = new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.None.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private None() {
            super(null);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.None> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.None[] newArray(int i) {
                return new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.None[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.None createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.None.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction;", "failedAction", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction;)V", "component1", "()Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction;", "copy", "(Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction;)Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction;", "getFailedAction", "FailedAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Show extends com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show> CREATOR = new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.Creator();
        private final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction failedAction;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Show(com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction failedAction) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedAction, "");
            this.failedAction = failedAction;
        }

        public final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction getFailedAction() {
            return this.failedAction;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction;", "Landroid/os/Parcelable;", "<init>", "()V", "SaveValidation", "Save", "Delete", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction$Delete;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction$Save;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction$SaveValidation;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class FailedAction implements android.os.Parcelable {
            public static final int $stable = 0;

            private FailedAction() {
            }

            @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction$SaveValidation;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction;", "<init>", "()V", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class SaveValidation extends com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction {
                public static final int $stable = 0;
                public static final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.SaveValidation INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.SaveValidation();
                public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.SaveValidation> CREATOR = new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.SaveValidation.Creator();

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final int hashCode() {
                    return 2018946890;
                }

                private SaveValidation() {
                    super(null);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(android.os.Parcel dest, int flags) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
                    dest.writeInt(1);
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.SaveValidation> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.SaveValidation[] newArray(int i) {
                        return new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.SaveValidation[i];
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.SaveValidation createFromParcel(android.os.Parcel parcel) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                        parcel.readInt();
                        return com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.SaveValidation.INSTANCE;
                    }
                }

                public final java.lang.String toString() {
                    return "SaveValidation";
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.SaveValidation)) {
                        return false;
                    }
                    return true;
                }
            }

            @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction$Save;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction$Save$SaveError;", "saveError", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction$Save$SaveError;)V", "component1", "()Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction$Save$SaveError;", "copy", "(Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction$Save$SaveError;)Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction$Save;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction$Save$SaveError;", "getSaveError", "SaveError"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Save extends com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction {
                public static final int $stable = 0;
                public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save> CREATOR = new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.Creator();
                private final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError saveError;

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Save(com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError saveError) {
                    super(null);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saveError, "");
                    this.saveError = saveError;
                }

                public final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError getSaveError() {
                    return this.saveError;
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction$Save$SaveError;", "", "<init>", "(Ljava/lang/String;I)V", "General", "TooManyTaxes"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class SaveError {
                    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
                    public static final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError General;
                    public static final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError TooManyTaxes;
                    private static final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError[] getHighSpeedVideoSizes;

                    private SaveError(java.lang.String str, int i) {
                    }

                    static {
                        com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError saveError = new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError("General", 0);
                        General = saveError;
                        com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError saveError2 = new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError("TooManyTaxes", 1);
                        TooManyTaxes = saveError2;
                        com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError[] saveErrorArr = {saveError, saveError2};
                        getHighSpeedVideoSizes = saveErrorArr;
                        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(saveErrorArr);
                    }

                    public static com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError[] values() {
                        return (com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError[]) getHighSpeedVideoSizes.clone();
                    }

                    public static com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError valueOf(java.lang.String str) {
                        return (com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError) java.lang.Enum.valueOf(com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError.class, str);
                    }

                    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError> getEntries() {
                        return Camera2StreamConfigurationMap;
                    }
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(android.os.Parcel dest, int flags) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
                    dest.writeString(this.saveError.name());
                }

                public final java.lang.String toString() {
                    com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError saveError = this.saveError;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Save(saveError=");
                    sb.append(saveError);
                    sb.append(")");
                    return sb.toString();
                }

                public final int hashCode() {
                    return this.saveError.hashCode();
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save) && this.saveError == ((com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save) other).saveError;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save[] newArray(int i) {
                        return new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save[i];
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save createFromParcel(android.os.Parcel parcel) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                        return new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save(com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError.valueOf(parcel.readString()));
                    }
                }

                public final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save copy(com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError saveError) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saveError, "");
                    return new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save(saveError);
                }

                /* renamed from: component1, reason: from getter */
                public final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError getSaveError() {
                    return this.saveError;
                }

                public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save copy$default(com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save save, com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError saveError, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        saveError = save.saveError;
                    }
                    return save.copy(saveError);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction$Delete;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/ErrorBanner$Show$FailedAction;", "<init>", "()V", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Delete extends com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction {
                public static final int $stable = 0;
                public static final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Delete INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Delete();
                public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Delete> CREATOR = new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Delete.Creator();

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final int hashCode() {
                    return -631047393;
                }

                private Delete() {
                    super(null);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(android.os.Parcel dest, int flags) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
                    dest.writeInt(1);
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Delete> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Delete[] newArray(int i) {
                        return new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Delete[i];
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Delete createFromParcel(android.os.Parcel parcel) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                        parcel.readInt();
                        return com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Delete.INSTANCE;
                    }
                }

                public final java.lang.String toString() {
                    return "Delete";
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Delete)) {
                        return false;
                    }
                    return true;
                }
            }

            public /* synthetic */ FailedAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            dest.writeParcelable(this.failedAction, flags);
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction failedAction = this.failedAction;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Show(failedAction=");
            sb.append(failedAction);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.failedAction.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show) && kotlin.jvm.internal.Intrinsics.areEqual(this.failedAction, ((com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show) other).failedAction);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show[] newArray(int i) {
                return new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show((com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction) parcel.readParcelable(com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.class.getClassLoader()));
            }
        }

        public final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show copy(com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction failedAction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedAction, "");
            return new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show(failedAction);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction getFailedAction() {
            return this.failedAction;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show copy$default(com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show show, com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction failedAction, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                failedAction = show.failedAction;
            }
            return show.copy(failedAction);
        }
    }

    public /* synthetic */ ErrorBanner(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
