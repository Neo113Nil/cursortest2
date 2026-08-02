package androidx.view.result;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001d\u0010\u000f"}, d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "Landroid/content/IntentSender;", "intentSender", "Landroid/content/Intent;", "fillInIntent", "", "flagsMask", "flagsValues", "<init>", "(Landroid/content/IntentSender;Landroid/content/Intent;II)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "describeContents", "()I", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/content/IntentSender;", "getIntentSender", "()Landroid/content/IntentSender;", "Landroid/content/Intent;", "getFillInIntent", "()Landroid/content/Intent;", com.visa.cbp.getEncExpo.warmup, "getFlagsMask", "getFlagsValues", "Companion", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntentSenderRequest implements android.os.Parcelable {
    private final android.content.Intent fillInIntent;
    private final int flagsMask;
    private final int flagsValues;
    private final android.content.IntentSender intentSender;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.result.IntentSenderRequest.Companion INSTANCE = new androidx.view.result.IntentSenderRequest.Companion(null);
    public static final android.os.Parcelable.Creator<androidx.view.result.IntentSenderRequest> CREATOR = new android.os.Parcelable.Creator<androidx.view.result.IntentSenderRequest>() { // from class: androidx.activity.result.IntentSenderRequest$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final androidx.view.result.IntentSenderRequest createFromParcel(android.os.Parcel inParcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inParcel, "");
            return new androidx.view.result.IntentSenderRequest(inParcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final androidx.view.result.IntentSenderRequest[] newArray(int size) {
            return new androidx.view.result.IntentSenderRequest[size];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public IntentSenderRequest(android.content.IntentSender intentSender, android.content.Intent intent, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentSender, "");
        this.intentSender = intentSender;
        this.fillInIntent = intent;
        this.flagsMask = i;
        this.flagsValues = i2;
    }

    public /* synthetic */ IntentSenderRequest(android.content.IntentSender intentSender, android.content.Intent intent, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(intentSender, (i3 & 2) != 0 ? null : intent, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public final android.content.IntentSender getIntentSender() {
        return this.intentSender;
    }

    public final android.content.Intent getFillInIntent() {
        return this.fillInIntent;
    }

    public final int getFlagsMask() {
        return this.flagsMask;
    }

    public final int getFlagsValues() {
        return this.flagsValues;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IntentSenderRequest(android.os.Parcel parcel) {
        this((android.content.IntentSender) r0, (android.content.Intent) parcel.readParcelable(android.content.Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        android.os.Parcelable readParcelable = parcel.readParcelable(android.content.IntentSender.class.getClassLoader());
        kotlin.jvm.internal.Intrinsics.checkNotNull(readParcelable);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeParcelable(this.intentSender, flags);
        dest.writeParcelable(this.fillInIntent, flags);
        dest.writeInt(this.flagsMask);
        dest.writeInt(this.flagsValues);
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fJ\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$Builder;", "", "intentSender", "Landroid/content/IntentSender;", "<init>", "(Landroid/content/IntentSender;)V", com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "(Landroid/app/PendingIntent;)V", "fillInIntent", "Landroid/content/Intent;", "flagsMask", "", "flagsValues", "setFillInIntent", "setFlags", "values", com.daon.sdk.face.license.License.FEATURE_MASK, "build", "Landroidx/activity/result/IntentSenderRequest;", "Flag", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        private android.content.Intent Camera2StreamConfigurationMap;
        private final android.content.IntentSender getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;

        public Builder(android.content.IntentSender intentSender) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentSender, "");
            this.getHighResolutionOutputSizeshNQ4ISI = intentSender;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder(android.app.PendingIntent pendingIntent) {
            this(r2);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingIntent, "");
            android.content.IntentSender intentSender = pendingIntent.getIntentSender();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intentSender, "");
        }

        public final androidx.activity.result.IntentSenderRequest.Builder setFillInIntent(android.content.Intent fillInIntent) {
            this.Camera2StreamConfigurationMap = fillInIntent;
            return this;
        }

        public final androidx.activity.result.IntentSenderRequest.Builder setFlags(int values, int mask) {
            this.getHighSpeedVideoSizes = values;
            this.getHighSpeedVideoFpsRangesFor = mask;
            return this;
        }

        public final androidx.view.result.IntentSenderRequest build() {
            return new androidx.view.result.IntentSenderRequest(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\u0003"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$Companion;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Landroidx/activity/result/IntentSenderRequest;", "CREATOR", "Landroid/os/Parcelable$Creator;", "getCREATOR$annotations"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
