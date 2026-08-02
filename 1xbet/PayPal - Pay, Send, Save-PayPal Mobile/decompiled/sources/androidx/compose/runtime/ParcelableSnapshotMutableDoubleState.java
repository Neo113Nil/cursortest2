package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u000fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState;", "Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl;", "Landroid/os/Parcelable;", "", "p0", "<init>", "(D)V", "Landroid/os/Parcel;", "", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ParcelableSnapshotMutableDoubleState extends androidx.compose.runtime.SnapshotMutableDoubleStateImpl implements android.os.Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.ParcelableSnapshotMutableDoubleState.Companion INSTANCE = new androidx.compose.runtime.ParcelableSnapshotMutableDoubleState.Companion(null);
    public static final android.os.Parcelable.Creator<androidx.compose.runtime.ParcelableSnapshotMutableDoubleState> CREATOR = new android.os.Parcelable.Creator<androidx.compose.runtime.ParcelableSnapshotMutableDoubleState>() { // from class: androidx.compose.runtime.ParcelableSnapshotMutableDoubleState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final androidx.compose.runtime.ParcelableSnapshotMutableDoubleState createFromParcel(android.os.Parcel parcel) {
            return new androidx.compose.runtime.ParcelableSnapshotMutableDoubleState(parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final androidx.compose.runtime.ParcelableSnapshotMutableDoubleState[] newArray(int size) {
            return new androidx.compose.runtime.ParcelableSnapshotMutableDoubleState[size];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParcelableSnapshotMutableDoubleState(double d) {
        super(d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel p0, int p1) {
        p0.writeDouble(getDoubleValue());
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState$Companion;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "getCREATOR$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getCREATOR$annotations() {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
