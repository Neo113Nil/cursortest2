package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0010B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Landroidx/compose/runtime/SnapshotMutableStateImpl;", "Landroid/os/Parcelable;", "p0", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "p1", "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)V", "Landroid/os/Parcel;", "", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ParcelableSnapshotMutableState<T> extends androidx.compose.runtime.SnapshotMutableStateImpl<T> implements android.os.Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.ParcelableSnapshotMutableState.Companion INSTANCE = new androidx.compose.runtime.ParcelableSnapshotMutableState.Companion(null);
    public static final android.os.Parcelable.Creator<androidx.compose.runtime.ParcelableSnapshotMutableState<java.lang.Object>> CREATOR = new android.os.Parcelable.ClassLoaderCreator<androidx.compose.runtime.ParcelableSnapshotMutableState<java.lang.Object>>() { // from class: androidx.compose.runtime.ParcelableSnapshotMutableState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public final androidx.compose.runtime.ParcelableSnapshotMutableState<java.lang.Object> createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader loader) {
            androidx.compose.runtime.SnapshotMutationPolicy neverEqualPolicy;
            if (loader == null) {
                loader = getClass().getClassLoader();
            }
            java.lang.Object readValue = parcel.readValue(loader);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                neverEqualPolicy = androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy();
            } else if (readInt == 1) {
                neverEqualPolicy = androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy();
            } else if (readInt == 2) {
                neverEqualPolicy = androidx.compose.runtime.SnapshotStateKt.referentialEqualityPolicy();
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported MutableState policy ");
                sb.append(readInt);
                sb.append(" was restored");
                throw new java.lang.IllegalStateException(sb.toString());
            }
            return new androidx.compose.runtime.ParcelableSnapshotMutableState<>(readValue, neverEqualPolicy);
        }

        @Override // android.os.Parcelable.Creator
        public final androidx.compose.runtime.ParcelableSnapshotMutableState<java.lang.Object> createFromParcel(android.os.Parcel parcel) {
            return createFromParcel(parcel, (java.lang.ClassLoader) null);
        }

        @Override // android.os.Parcelable.Creator
        public final androidx.compose.runtime.ParcelableSnapshotMutableState<java.lang.Object>[] newArray(int size) {
            return new androidx.compose.runtime.ParcelableSnapshotMutableState[size];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParcelableSnapshotMutableState(T t, androidx.compose.runtime.SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        super(t, snapshotMutationPolicy);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel p0, int p1) {
        int i;
        p0.writeValue(getValue());
        androidx.compose.runtime.SnapshotMutationPolicy<T> policy = getPolicy();
        if (kotlin.jvm.internal.Intrinsics.areEqual(policy, androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy())) {
            i = 0;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(policy, androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy())) {
            i = 1;
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(policy, androidx.compose.runtime.SnapshotStateKt.referentialEqualityPolicy())) {
                throw new java.lang.IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i = 2;
        }
        p0.writeInt(i);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState$Companion;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "getCREATOR$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
