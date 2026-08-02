package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;

/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new E(23);

    /* renamed from: a, reason: collision with root package name */
    public final int f8119a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f8120b;

    public ActivityResult(Intent intent, int i7) {
        this.f8119a = i7;
        this.f8120b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i7 = this.f8119a;
        sb.append(i7 != -1 ? i7 != 0 ? String.valueOf(i7) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f8120b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f8119a);
        Intent intent = this.f8120b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i7);
        }
    }

    public ActivityResult(Parcel parcel) {
        this.f8119a = parcel.readInt();
        this.f8120b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
