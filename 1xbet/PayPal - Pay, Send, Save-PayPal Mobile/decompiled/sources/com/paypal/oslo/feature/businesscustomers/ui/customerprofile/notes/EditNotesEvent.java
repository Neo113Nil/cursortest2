package com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesEvent;", "", "NotesChanged", "UpdateClicked", "ClearNotesClicked", "ClearError", "ExitForm", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesEvent$ClearError;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesEvent$ClearNotesClicked;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesEvent$ExitForm;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesEvent$NotesChanged;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesEvent$UpdateClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface EditNotesEvent {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesEvent$NotesChanged;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesEvent;", "", "notes", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesEvent$NotesChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNotes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotesChanged implements com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent {
        public static final int $stable = 0;
        private final java.lang.String notes;

        public NotesChanged(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.notes = str;
        }

        public final java.lang.String getNotes() {
            return this.notes;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.notes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotesChanged(notes=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.notes.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.NotesChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.notes, ((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.NotesChanged) other).notes);
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.NotesChanged copy(java.lang.String notes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notes, "");
            return new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.NotesChanged(notes);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNotes() {
            return this.notes;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.NotesChanged copy$default(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.NotesChanged notesChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = notesChanged.notes;
            }
            return notesChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesEvent$UpdateClicked;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateClicked implements com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.UpdateClicked INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.UpdateClicked();

        public final int hashCode() {
            return 638319859;
        }

        private UpdateClicked() {
        }

        public final java.lang.String toString() {
            return "UpdateClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.UpdateClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesEvent$ClearNotesClicked;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClearNotesClicked implements com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.ClearNotesClicked INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.ClearNotesClicked();

        public final int hashCode() {
            return -574763928;
        }

        private ClearNotesClicked() {
        }

        public final java.lang.String toString() {
            return "ClearNotesClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.ClearNotesClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesEvent$ClearError;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClearError implements com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.ClearError INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.ClearError();

        public final int hashCode() {
            return 805542406;
        }

        private ClearError() {
        }

        public final java.lang.String toString() {
            return "ClearError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.ClearError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesEvent$ExitForm;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExitForm implements com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.ExitForm INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.ExitForm();

        public final int hashCode() {
            return 1963399181;
        }

        private ExitForm() {
        }

        public final java.lang.String toString() {
            return "ExitForm";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.ExitForm)) {
                return false;
            }
            return true;
        }
    }
}
