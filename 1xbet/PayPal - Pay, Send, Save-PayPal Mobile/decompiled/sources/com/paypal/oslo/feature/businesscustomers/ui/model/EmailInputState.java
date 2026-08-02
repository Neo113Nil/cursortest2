package com.paypal.oslo.feature.businesscustomers.ui.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R/\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00028G@CX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/model/EmailInputState;", "Landroid/os/Parcelable;", "", "initialEmail", "<init>", "(Ljava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "updateEmail", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "<set-?>", "email$delegate", "Landroidx/compose/runtime/MutableState;", "getEmail", "()Ljava/lang/String;", "setEmail", "email", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EmailInputState implements android.os.Parcelable {
    public static final int $stable = 0;

    /* renamed from: email$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState email;
    public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState> CREATOR = new android.os.Parcelable.Creator<com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState>() { // from class: com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState(source.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState[] newArray(int size) {
            return new com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState[size];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public EmailInputState(java.lang.String str) {
        this.email = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
    }

    public /* synthetic */ EmailInputState(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    private final void setEmail(java.lang.String str) {
        this.email.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String getEmail() {
        return (java.lang.String) this.email.getValue();
    }

    public final void updateEmail(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        setEmail(value);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(getEmail());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmailInputState() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
