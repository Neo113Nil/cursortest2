package e;

import H.j;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280a implements Parcelable {
    public static final Parcelable.Creator<C0280a> CREATOR = new j(19);

    /* renamed from: a, reason: collision with root package name */
    public final int f4853a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f4854b;

    public C0280a(Intent intent, int i3) {
        this.f4853a = i3;
        this.f4854b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i3 = this.f4853a;
        sb.append(i3 != -1 ? i3 != 0 ? String.valueOf(i3) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f4854b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f4853a);
        Intent intent = this.f4854b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i3);
        }
    }

    public C0280a(Parcel parcel) {
        this.f4853a = parcel.readInt();
        this.f4854b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
