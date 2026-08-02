package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import t6.h;

/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new E(24);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f8121a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f8122b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8123c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8124d;

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i7, int i8) {
        h.e(intentSender, "intentSender");
        this.f8121a = intentSender;
        this.f8122b = intent;
        this.f8123c = i7;
        this.f8124d = i8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        h.e(parcel, "dest");
        parcel.writeParcelable(this.f8121a, i7);
        parcel.writeParcelable(this.f8122b, i7);
        parcel.writeInt(this.f8123c);
        parcel.writeInt(this.f8124d);
    }
}
