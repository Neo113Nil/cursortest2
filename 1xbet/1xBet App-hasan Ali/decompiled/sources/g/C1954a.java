package g;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.l;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1954a implements Parcelable {
    public static final Parcelable.Creator<C1954a> CREATOR = new C2.a(14);

    /* renamed from: k, reason: collision with root package name */
    public final int f17011k;

    /* renamed from: l, reason: collision with root package name */
    public final Intent f17012l;

    public C1954a(int i, Intent intent) {
        this.f17011k = i;
        this.f17012l = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f17011k;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f17012l);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        l.f("dest", parcel);
        parcel.writeInt(this.f17011k);
        Intent intent = this.f17012l;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
