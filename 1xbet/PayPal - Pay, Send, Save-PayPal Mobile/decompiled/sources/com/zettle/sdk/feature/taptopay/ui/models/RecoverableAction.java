package com.zettle.sdk.feature.taptopay.ui.models;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\n"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/RecoverableAction;", "Landroid/os/Parcelable;", "", "intent", "", "includePackage", "message", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "copy", "(Ljava/lang/String;ZLjava/lang/String;)Lcom/zettle/sdk/feature/taptopay/ui/models/RecoverableAction;", "", "describeContents", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getIncludePackage", "Ljava/lang/String;", "getIntent", "getMessage"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RecoverableAction implements android.os.Parcelable {
    public static final int $stable = 0;
    public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction.Creator();
    private final boolean includePackage;
    private final java.lang.String intent;
    private final java.lang.String message;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public RecoverableAction(java.lang.String str, boolean z, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.intent = str;
        this.includePackage = z;
        this.message = str2;
    }

    public final java.lang.String getIntent() {
        return this.intent;
    }

    public final boolean getIncludePackage() {
        return this.includePackage;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.intent);
        parcel.writeInt(this.includePackage ? 1 : 0);
        parcel.writeString(this.message);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.intent;
        boolean z = this.includePackage;
        java.lang.String str2 = this.message;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RecoverableAction(intent=");
        sb.append(str);
        sb.append(", includePackage=");
        sb.append(z);
        sb.append(", message=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        java.lang.String str = this.intent;
        int hashCode = str == null ? 0 : str.hashCode();
        boolean z = this.includePackage;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (((hashCode * 31) + i) * 31) + this.message.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction)) {
            return false;
        }
        com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction recoverableAction = (com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.intent, recoverableAction.intent) && this.includePackage == recoverableAction.includePackage && kotlin.jvm.internal.Intrinsics.areEqual(this.message, recoverableAction.message);
    }

    public final com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction copy(java.lang.String intent, boolean includePackage, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        return new com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction(intent, includePackage, message);
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction[] newArray(int i) {
            return new com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIncludePackage() {
        return this.includePackage;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getIntent() {
        return this.intent;
    }

    public static /* synthetic */ com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction copy$default(com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction recoverableAction, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = recoverableAction.intent;
        }
        if ((i & 2) != 0) {
            z = recoverableAction.includePackage;
        }
        if ((i & 4) != 0) {
            str2 = recoverableAction.message;
        }
        return recoverableAction.copy(str, z, str2);
    }
}
