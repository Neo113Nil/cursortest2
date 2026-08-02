package com.paypal.oslo.feature.businesscustomers.ui.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0005R+\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001c8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/model/NotesInputState;", "Landroid/os/Parcelable;", "", "initialNotes", "<init>", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "transform", "", "update", "(Lkotlin/jvm/functions/Function1;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getInitialNotes", "()Ljava/lang/String;", "<set-?>", "notes$delegate", "Landroidx/compose/runtime/MutableState;", "getNotes", "setNotes", "notes", "", "isModified$delegate", "isModified", "()Z", "setModified", "(Z)V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NotesInputState implements android.os.Parcelable {
    public static final int $stable = 0;
    private final java.lang.String initialNotes;

    /* renamed from: isModified$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isModified;

    /* renamed from: notes$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState notes;
    public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState> CREATOR = new android.os.Parcelable.Creator<com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState>() { // from class: com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            java.lang.String readString = source.readString();
            if (readString == null) {
                readString = "";
            }
            java.lang.String readString2 = source.readString();
            java.lang.String str = readString2 != null ? readString2 : "";
            boolean z = source.readInt() == 1;
            com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState notesInputState = new com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState(readString);
            notesInputState.setNotes(str);
            notesInputState.setModified(z);
            return notesInputState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState[] newArray(int size) {
            return new com.paypal.oslo.feature.businesscustomers.ui.model.NotesInputState[size];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public NotesInputState(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.initialNotes = str;
        this.notes = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
        this.isModified = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
    }

    public /* synthetic */ NotesInputState(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public final java.lang.String getInitialNotes() {
        return this.initialNotes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNotes(java.lang.String str) {
        this.notes.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String getNotes() {
        return (java.lang.String) this.notes.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setModified(boolean z) {
        this.isModified.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isModified() {
        return ((java.lang.Boolean) this.isModified.getValue()).booleanValue();
    }

    public final void update(kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> transform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transform, "");
        setNotes(transform.invoke(getNotes()));
        setModified(true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.initialNotes);
        dest.writeString(getNotes());
        dest.writeInt(isModified() ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotesInputState() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
