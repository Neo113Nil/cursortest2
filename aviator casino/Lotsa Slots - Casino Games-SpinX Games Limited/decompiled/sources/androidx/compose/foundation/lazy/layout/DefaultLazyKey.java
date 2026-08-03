package androidx.compose.foundation.lazy.layout;

/* compiled from: Lazy.android.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "Landroid/os/Parcelable;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "(I)V", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class DefaultLazyKey implements android.os.Parcelable {
    private final int index;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.lazy.layout.DefaultLazyKey.Companion INSTANCE = new androidx.compose.foundation.lazy.layout.DefaultLazyKey.Companion(null);
    public static final android.os.Parcelable.Creator<androidx.compose.foundation.lazy.layout.DefaultLazyKey> CREATOR = new android.os.Parcelable.Creator<androidx.compose.foundation.lazy.layout.DefaultLazyKey>() { // from class: androidx.compose.foundation.lazy.layout.DefaultLazyKey$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.compose.foundation.lazy.layout.DefaultLazyKey createFromParcel(android.os.Parcel parcel) {
            return new androidx.compose.foundation.lazy.layout.DefaultLazyKey(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.compose.foundation.lazy.layout.DefaultLazyKey[] newArray(int size) {
            return new androidx.compose.foundation.lazy.layout.DefaultLazyKey[size];
        }
    };

    /* renamed from: component1, reason: from getter */
    private final int getIndex() {
        return this.index;
    }

    public static /* synthetic */ androidx.compose.foundation.lazy.layout.DefaultLazyKey copy$default(androidx.compose.foundation.lazy.layout.DefaultLazyKey defaultLazyKey, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = defaultLazyKey.index;
        }
        return defaultLazyKey.copy(i);
    }

    public final androidx.compose.foundation.lazy.layout.DefaultLazyKey copy(int index) {
        return new androidx.compose.foundation.lazy.layout.DefaultLazyKey(index);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.foundation.lazy.layout.DefaultLazyKey) && this.index == ((androidx.compose.foundation.lazy.layout.DefaultLazyKey) other).index;
    }

    public int hashCode() {
        return this.index;
    }

    public java.lang.String toString() {
        return "DefaultLazyKey(index=" + this.index + ')';
    }

    public DefaultLazyKey(int i) {
        this.index = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        parcel.writeInt(this.index);
    }

    /* compiled from: Lazy.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "getCREATOR$annotations", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }

        private Companion() {
        }
    }
}
