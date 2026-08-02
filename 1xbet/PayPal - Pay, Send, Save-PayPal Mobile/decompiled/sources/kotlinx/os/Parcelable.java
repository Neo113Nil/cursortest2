package kotlinx.os;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Parcelable;", "T", "Landroid/os/Parcelable$Creator;", "parcelableCreator", "()Landroid/os/Parcelable$Creator;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* renamed from: kotlinx.parcelize.ParcelableCreatorKt, reason: from Kotlin metadata */
/* loaded from: classes17.dex */
public final class Parcelable {
    public static final /* synthetic */ <T extends android.os.Parcelable> android.os.Parcelable.Creator<T> parcelableCreator() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        java.lang.Object obj = android.os.Parcelable.class.getDeclaredField("CREATOR").get(null);
        android.os.Parcelable.Creator<T> creator = obj instanceof android.os.Parcelable.Creator ? (android.os.Parcelable.Creator) obj : null;
        if (creator != null) {
            return creator;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not access CREATOR field in class ");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.os.Parcelable.class).getSimpleName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
