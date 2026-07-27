package e;

import H.j;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0285f implements Parcelable {
    public static final Parcelable.Creator<C0285f> CREATOR = new j(20);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f4862a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f4863b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4864c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4865d;

    public C0285f(IntentSender intentSender, Intent intent, int i3, int i4) {
        kotlin.jvm.internal.j.e(intentSender, "intentSender");
        this.f4862a = intentSender;
        this.f4863b = intent;
        this.f4864c = i3;
        this.f4865d = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i3) {
        kotlin.jvm.internal.j.e(dest, "dest");
        dest.writeParcelable(this.f4862a, i3);
        dest.writeParcelable(this.f4863b, i3);
        dest.writeInt(this.f4864c);
        dest.writeInt(this.f4865d);
    }
}
