package com.paypal.oslo.feature.businesscustomers.ui.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R/\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00028G@CX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\nR/\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00028G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\nR+\u0010!\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u001f8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/model/ContactMeansInputState;", "Landroid/os/Parcelable;", "", "initialEmailAddress", "initialPhoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "updateEmail", "(Ljava/lang/String;)V", "updatePhoneNumber", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "<set-?>", "emailAddress$delegate", "Landroidx/compose/runtime/MutableState;", "getEmailAddress", "()Ljava/lang/String;", "setEmailAddress", androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "phoneNumber$delegate", "getPhoneNumber", "setPhoneNumber", "phoneNumber", "", "isModified$delegate", "isModified", "()Z", "setModified", "(Z)V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContactMeansInputState implements android.os.Parcelable {
    public static final int $stable = 0;

    /* renamed from: emailAddress$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState emailAddress;

    /* renamed from: isModified$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isModified;

    /* renamed from: phoneNumber$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState phoneNumber;
    public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState> CREATOR = new android.os.Parcelable.Creator<com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState>() { // from class: com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            java.lang.String readString = source.readString();
            java.lang.String readString2 = source.readString();
            boolean z = source.readInt() == 1;
            com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState contactMeansInputState = new com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState(readString, readString2);
            contactMeansInputState.setModified(z);
            return contactMeansInputState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState[] newArray(int size) {
            return new com.paypal.oslo.feature.businesscustomers.ui.model.ContactMeansInputState[size];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ContactMeansInputState(java.lang.String str, java.lang.String str2) {
        this.emailAddress = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
        this.phoneNumber = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str2, null, 2, null);
        this.isModified = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
    }

    public /* synthetic */ ContactMeansInputState(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    private final void setEmailAddress(java.lang.String str) {
        this.emailAddress.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String getEmailAddress() {
        return (java.lang.String) this.emailAddress.getValue();
    }

    private final void setPhoneNumber(java.lang.String str) {
        this.phoneNumber.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String getPhoneNumber() {
        return (java.lang.String) this.phoneNumber.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setModified(boolean z) {
        this.isModified.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isModified() {
        return ((java.lang.Boolean) this.isModified.getValue()).booleanValue();
    }

    public final void updateEmail(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        setEmailAddress(value);
        setModified(true);
    }

    public final void updatePhoneNumber(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        setPhoneNumber(value);
        setModified(true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(getEmailAddress());
        dest.writeString(getPhoneNumber());
        dest.writeInt(isModified() ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContactMeansInputState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
