package com.paypal.oslo.feature.businesscustomers.ui.model;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020\"8G¢\u0006\u0006\u001a\u0004\b&\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerFormInputState;", "Landroid/os/Parcelable;", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/NameInputState;", "nameState", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/ContactMeansInputState;", "contactState", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressContainerState;", "addressContainerState", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/NotesInputState;", "notesState", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/ui/model/NameInputState;Lcom/paypal/oslo/feature/businesscustomers/ui/model/ContactMeansInputState;Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressContainerState;Lcom/paypal/oslo/feature/businesscustomers/ui/model/NotesInputState;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/NameInputState;", "getNameState", "()Lcom/paypal/oslo/feature/businesscustomers/ui/model/NameInputState;", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/ContactMeansInputState;", "getContactState", "()Lcom/paypal/oslo/feature/businesscustomers/ui/model/ContactMeansInputState;", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressContainerState;", "getAddressContainerState", "()Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressContainerState;", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/NotesInputState;", "getNotesState", "()Lcom/paypal/oslo/feature/businesscustomers/ui/model/NotesInputState;", "Landroidx/compose/runtime/State;", "", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/State;", "getHighSpeedVideoFpsRangesFor", "isModified", "()Z", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomerFormInputState implements android.os.Parcelable {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.State<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.businesscustomers.ui.model.AddressContainerState addressContainerState;
    private final com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState contactState;
    private final com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState nameState;
    private final com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState notesState;
    public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState> CREATOR = new android.os.Parcelable.Creator<com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState>() { // from class: com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState nameInputState = (com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState) androidx.core.os.ParcelCompat.readParcelable(source, com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState.class.getClassLoader(), com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState.class);
            int i = 1;
            com.paypal.oslo.feature.businesscustomers.ui.model.NameFields nameFields = null;
            java.lang.Object[] objArr = 0;
            java.lang.Object[] objArr2 = 0;
            java.lang.Object[] objArr3 = 0;
            java.lang.Object[] objArr4 = 0;
            java.lang.Object[] objArr5 = 0;
            java.lang.Object[] objArr6 = 0;
            if (nameInputState == null) {
                nameInputState = new com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState(nameFields, i, objArr6 == true ? 1 : 0);
            }
            com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState contactMeansInputState = (com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState) androidx.core.os.ParcelCompat.readParcelable(source, com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState.class.getClassLoader(), com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState.class);
            if (contactMeansInputState == null) {
                contactMeansInputState = new com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState(objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, 3, objArr3 == true ? 1 : 0);
            }
            com.paypal.oslo.feature.businesscustomers.ui.model.AddressContainerState addressContainerState = (com.paypal.oslo.feature.businesscustomers.ui.model.AddressContainerState) androidx.core.os.ParcelCompat.readParcelable(source, com.paypal.oslo.feature.businesscustomers.ui.model.AddressContainerState.class.getClassLoader(), com.paypal.oslo.feature.businesscustomers.ui.model.AddressContainerState.class);
            if (addressContainerState == null) {
                addressContainerState = new com.paypal.oslo.feature.businesscustomers.ui.model.AddressContainerState(null, null, false, 7, null);
            }
            com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState notesInputState = (com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState) androidx.core.os.ParcelCompat.readParcelable(source, com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState.class.getClassLoader(), com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState.class);
            if (notesInputState == null) {
                notesInputState = new com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
            }
            return new com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState(nameInputState, contactMeansInputState, addressContainerState, notesInputState);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState[] newArray(int size) {
            return new com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState[size];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CustomerFormInputState(com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState nameInputState, com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState contactMeansInputState, com.paypal.oslo.feature.businesscustomers.ui.model.AddressContainerState addressContainerState, com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState notesInputState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameInputState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactMeansInputState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressContainerState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notesInputState, "");
        this.nameState = nameInputState;
        this.contactState = contactMeansInputState;
        this.addressContainerState = addressContainerState;
        this.notesState = notesInputState;
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState.$r8$lambda$1PjHRcBsFLtgf0CroBFH5Od95Fg(com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState.this));
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CustomerFormInputState(com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState nameInputState, com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState contactMeansInputState, com.paypal.oslo.feature.businesscustomers.ui.model.AddressContainerState addressContainerState, com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState notesInputState, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState(null, r1, 0 == true ? 1 : 0) : nameInputState, (i & 2) != 0 ? new com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : contactMeansInputState, (i & 4) != 0 ? new com.paypal.oslo.feature.businesscustomers.ui.model.AddressContainerState(null, null, false, 7, null) : addressContainerState, (i & 8) != 0 ? new com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState(0 == true ? 1 : 0, r1, 0 == true ? 1 : 0) : notesInputState);
        int i2 = 1;
    }

    public final com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState getNameState() {
        return this.nameState;
    }

    public final com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState getContactState() {
        return this.contactState;
    }

    public final com.paypal.oslo.feature.businesscustomers.ui.model.AddressContainerState getAddressContainerState() {
        return this.addressContainerState;
    }

    public final com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState getNotesState() {
        return this.notesState;
    }

    public final boolean isModified() {
        return this.getHighSpeedVideoFpsRangesFor.getValue().booleanValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeParcelable(this.nameState, flags);
        dest.writeParcelable(this.contactState, flags);
        dest.writeParcelable(this.addressContainerState, flags);
        dest.writeParcelable(this.notesState, flags);
    }

    public static /* synthetic */ boolean $r8$lambda$1PjHRcBsFLtgf0CroBFH5Od95Fg(com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState customerFormInputState) {
        return customerFormInputState.nameState.isModified() || customerFormInputState.contactState.isModified() || customerFormInputState.addressContainerState.isModified() || customerFormInputState.notesState.isModified();
    }

    public CustomerFormInputState() {
        this(null, null, null, null, 15, null);
    }
}
