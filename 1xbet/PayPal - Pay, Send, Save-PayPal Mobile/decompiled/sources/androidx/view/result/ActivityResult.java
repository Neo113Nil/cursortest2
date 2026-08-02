package androidx.view.result;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/activity/result/ActivityResult;", "Landroid/os/Parcelable;", "", "resultCode", "Landroid/content/Intent;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(ILandroid/content/Intent;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "toString", "()Ljava/lang/String;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", com.visa.cbp.getEncExpo.warmup, "getResultCode", "Landroid/content/Intent;", "getData", "()Landroid/content/Intent;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActivityResult implements android.os.Parcelable {
    private final android.content.Intent data;
    private final int resultCode;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.result.ActivityResult.Companion INSTANCE = new androidx.view.result.ActivityResult.Companion(null);
    public static final android.os.Parcelable.Creator<androidx.view.result.ActivityResult> CREATOR = new android.os.Parcelable.Creator<androidx.view.result.ActivityResult>() { // from class: androidx.activity.result.ActivityResult$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final androidx.view.result.ActivityResult createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new androidx.view.result.ActivityResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final androidx.view.result.ActivityResult[] newArray(int size) {
            return new androidx.view.result.ActivityResult[size];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ActivityResult(int i, android.content.Intent intent) {
        this.resultCode = i;
        this.data = intent;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public final android.content.Intent getData() {
        return this.data;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityResult(android.os.Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(parcel));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityResult{resultCode=");
        sb.append(INSTANCE.resultCodeToString(this.resultCode));
        sb.append(", data=");
        sb.append(this.data);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.resultCode);
        dest.writeInt(this.data == null ? 0 : 1);
        android.content.Intent intent = this.data;
        if (intent != null) {
            intent.writeToParcel(dest, flags);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u0003"}, d2 = {"Landroidx/activity/result/ActivityResult$Companion;", "", "<init>", "()V", "", "resultCode", "", "resultCodeToString", "(I)Ljava/lang/String;", "Landroid/os/Parcelable$Creator;", "Landroidx/activity/result/ActivityResult;", "CREATOR", "Landroid/os/Parcelable$Creator;", "getCREATOR$annotations"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getCREATOR$annotations() {
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String resultCodeToString(int resultCode) {
            if (resultCode == -1) {
                return "RESULT_OK";
            }
            if (resultCode == 0) {
                return "RESULT_CANCELED";
            }
            return java.lang.String.valueOf(resultCode);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String resultCodeToString(int i) {
        return INSTANCE.resultCodeToString(i);
    }
}
