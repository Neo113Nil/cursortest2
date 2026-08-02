package com.paypal.oslo.feature.businesscustomers.ui.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R+\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028G@CX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u0005R+\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u001c8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/model/NameInputState;", "Landroid/os/Parcelable;", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/NameFields;", "initialValue", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/ui/model/NameFields;)V", "Lkotlin/Function1;", "transform", "", "update", "(Lkotlin/jvm/functions/Function1;)V", "splitName", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "<set-?>", "name$delegate", "Landroidx/compose/runtime/MutableState;", "getName", "()Lcom/paypal/oslo/feature/businesscustomers/ui/model/NameFields;", "setName", "name", "", "isModified$delegate", "isModified", "()Z", "setModified", "(Z)V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NameInputState implements android.os.Parcelable {
    public static final int $stable = 0;

    /* renamed from: isModified$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isModified;

    /* renamed from: name$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState name;
    public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState> CREATOR = new android.os.Parcelable.Creator<com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState>() { // from class: com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            com.paypal.oslo.feature.businesscustomers.ui.model.NameFields nameFields = (com.paypal.oslo.feature.businesscustomers.ui.model.NameFields) androidx.core.os.ParcelCompat.readParcelable(source, com.paypal.oslo.feature.businesscustomers.ui.model.NameFields.class.getClassLoader(), com.paypal.oslo.feature.businesscustomers.ui.model.NameFields.class);
            if (nameFields == null) {
                nameFields = new com.paypal.oslo.feature.businesscustomers.ui.model.NameFields(null, null, null, 7, null);
            }
            boolean z = source.readInt() == 1;
            com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState nameInputState = new com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState(nameFields);
            nameInputState.setModified(z);
            return nameInputState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState[] newArray(int size) {
            return new com.paypal.oslo.feature.businesscustomers.ui.model.NameInputState[size];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public NameInputState(com.paypal.oslo.feature.businesscustomers.ui.model.NameFields nameFields) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameFields, "");
        this.name = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(nameFields, null, 2, null);
        this.isModified = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
    }

    public /* synthetic */ NameInputState(com.paypal.oslo.feature.businesscustomers.ui.model.NameFields nameFields, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.paypal.oslo.feature.businesscustomers.ui.model.NameFields(null, null, null, 7, null) : nameFields);
    }

    private final void setName(com.paypal.oslo.feature.businesscustomers.ui.model.NameFields nameFields) {
        this.name.setValue(nameFields);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.feature.businesscustomers.ui.model.NameFields getName() {
        return (com.paypal.oslo.feature.businesscustomers.ui.model.NameFields) this.name.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setModified(boolean z) {
        this.isModified.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isModified() {
        return ((java.lang.Boolean) this.isModified.getValue()).booleanValue();
    }

    public final void update(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.ui.model.NameFields, com.paypal.oslo.feature.businesscustomers.ui.model.NameFields> transform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transform, "");
        setName(transform.invoke(getName()));
        setModified(true);
    }

    public final void splitName() {
        kotlin.Pair pair;
        java.lang.String firstName = getName().getFirstName();
        if (firstName == null) {
            return;
        }
        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) firstName, new java.lang.String[]{" "}, false, 0, 6, (java.lang.Object) null);
        if (kotlin.text.StringsKt.endsWith$default(firstName, " ", false, 2, (java.lang.Object) null)) {
            pair = kotlin.TuplesKt.to(firstName, null);
        } else {
            pair = split$default.size() == 1 ? kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.first(split$default), null) : kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.dropLast(split$default, 1), " ", null, null, 0, null, null, 62, null), kotlin.collections.CollectionsKt.last(split$default));
        }
        setName(com.paypal.oslo.feature.businesscustomers.ui.model.NameFields.copy$default(getName(), (java.lang.String) pair.component1(), (java.lang.String) pair.component2(), null, 4, null));
        setModified(true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeParcelable(getName(), flags);
        dest.writeInt(isModified() ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NameInputState() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
