package androidx.paging.compose;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/paging/compose/PagingPlaceholderKey;", "Landroid/os/Parcelable;", "", "index", "<init>", "(I)V", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(I)Landroidx/paging/compose/PagingPlaceholderKey;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PagingPlaceholderKey implements android.os.Parcelable {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.paging.compose.PagingPlaceholderKey.Companion INSTANCE = new androidx.paging.compose.PagingPlaceholderKey.Companion(null);
    public static final android.os.Parcelable.Creator<androidx.paging.compose.PagingPlaceholderKey> CREATOR = new android.os.Parcelable.Creator<androidx.paging.compose.PagingPlaceholderKey>() { // from class: androidx.paging.compose.PagingPlaceholderKey$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final androidx.paging.compose.PagingPlaceholderKey createFromParcel(android.os.Parcel parcel) {
            return new androidx.paging.compose.PagingPlaceholderKey(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final androidx.paging.compose.PagingPlaceholderKey[] newArray(int size) {
            return new androidx.paging.compose.PagingPlaceholderKey[size];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public PagingPlaceholderKey(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int flags) {
        parcel.writeInt(this.getHighSpeedVideoFpsRanges);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\u0003"}, d2 = {"Landroidx/paging/compose/PagingPlaceholderKey$Companion;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Landroidx/paging/compose/PagingPlaceholderKey;", "CREATOR", "Landroid/os/Parcelable$Creator;", "getCREATOR$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getCREATOR$annotations() {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PagingPlaceholderKey(getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.paging.compose.PagingPlaceholderKey) && this.getHighSpeedVideoFpsRanges == ((androidx.paging.compose.PagingPlaceholderKey) other).getHighSpeedVideoFpsRanges;
    }

    public final androidx.paging.compose.PagingPlaceholderKey copy(int index) {
        return new androidx.paging.compose.PagingPlaceholderKey(index);
    }

    public static /* synthetic */ androidx.paging.compose.PagingPlaceholderKey copy$default(androidx.paging.compose.PagingPlaceholderKey pagingPlaceholderKey, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = pagingPlaceholderKey.getHighSpeedVideoFpsRanges;
        }
        return pagingPlaceholderKey.copy(i);
    }
}
