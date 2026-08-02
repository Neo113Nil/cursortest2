package androidx.compose.runtime.snapshots;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J)\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\nJ'\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList$Companion$CREATOR$1;", "Landroid/os/Parcelable$ClassLoaderCreator;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "Landroid/os/Parcel;", "parcel", "Ljava/lang/ClassLoader;", "loader", "createFromParcel", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "(Landroid/os/Parcel;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "newArray", "(I)[Landroidx/compose/runtime/snapshots/SnapshotStateList;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotStateList$Companion$CREATOR$1 implements android.os.Parcelable.ClassLoaderCreator<androidx.compose.runtime.snapshots.SnapshotStateList<java.lang.Object>> {
    SnapshotStateList$Companion$CREATOR$1() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final androidx.compose.runtime.snapshots.SnapshotStateList<java.lang.Object> createFromParcel(final android.os.Parcel parcel, final java.lang.ClassLoader loader) {
        if (loader == null) {
            loader = getClass().getClassLoader();
        }
        return androidx.compose.runtime.snapshots.SnapshotStateListKt.SnapshotStateList(parcel.readInt(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList$Companion$CREATOR$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object highSpeedVideoSizes;
                android.os.Parcel parcel2 = parcel;
                java.lang.ClassLoader classLoader = loader;
                ((java.lang.Integer) obj).intValue();
                highSpeedVideoSizes = androidx.compose.runtime.snapshots.SnapshotStateList$Companion$CREATOR$1.getHighSpeedVideoSizes(parcel2, classLoader);
                return highSpeedVideoSizes;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getHighSpeedVideoSizes(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        return parcel.readValue(classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final androidx.compose.runtime.snapshots.SnapshotStateList<java.lang.Object> createFromParcel(android.os.Parcel parcel) {
        return createFromParcel(parcel, (java.lang.ClassLoader) null);
    }

    @Override // android.os.Parcelable.Creator
    public final androidx.compose.runtime.snapshots.SnapshotStateList<java.lang.Object>[] newArray(int size) {
        return new androidx.compose.runtime.snapshots.SnapshotStateList[size];
    }
}
