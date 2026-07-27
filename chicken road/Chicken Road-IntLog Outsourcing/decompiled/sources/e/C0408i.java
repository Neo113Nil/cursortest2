package e;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0408i implements Parcelable {
    public static final Parcelable.Creator<C0408i> CREATOR = new B1.c(14);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f5514a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f5515b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5516c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5517d;

    public C0408i(IntentSender intentSender, Intent intent, int i2, int i3) {
        kotlin.jvm.internal.i.e(intentSender, "intentSender");
        this.f5514a = intentSender;
        this.f5515b = intent;
        this.f5516c = i2;
        this.f5517d = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i2) {
        kotlin.jvm.internal.i.e(dest, "dest");
        dest.writeParcelable(this.f5514a, i2);
        dest.writeParcelable(this.f5515b, i2);
        dest.writeInt(this.f5516c);
        dest.writeInt(this.f5517d);
    }
}
