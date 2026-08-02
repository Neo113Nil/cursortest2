package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.G;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes8.dex */
final class I implements Parcelable {
    public static final Parcelable.Creator<I> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    ArrayList<String> f42922a;

    /* renamed from: b, reason: collision with root package name */
    ArrayList<String> f42923b;

    /* renamed from: c, reason: collision with root package name */
    C5381b[] f42924c;

    /* renamed from: d, reason: collision with root package name */
    int f42925d;

    /* renamed from: e, reason: collision with root package name */
    String f42926e = null;

    /* renamed from: f, reason: collision with root package name */
    ArrayList<String> f42927f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    ArrayList<C5382c> f42928g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    ArrayList<G.n> f42929h;

    final class a implements Parcelable.Creator<I> {
        @Override // android.os.Parcelable.Creator
        public final I createFromParcel(Parcel parcel) {
            I i11 = new I();
            i11.f42926e = null;
            i11.f42927f = new ArrayList<>();
            i11.f42928g = new ArrayList<>();
            i11.f42922a = parcel.createStringArrayList();
            i11.f42923b = parcel.createStringArrayList();
            i11.f42924c = (C5381b[]) parcel.createTypedArray(C5381b.CREATOR);
            i11.f42925d = parcel.readInt();
            i11.f42926e = parcel.readString();
            i11.f42927f = parcel.createStringArrayList();
            i11.f42928g = parcel.createTypedArrayList(C5382c.CREATOR);
            i11.f42929h = parcel.createTypedArrayList(G.n.CREATOR);
            return i11;
        }

        @Override // android.os.Parcelable.Creator
        public final I[] newArray(int i11) {
            return new I[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeStringList(this.f42922a);
        parcel.writeStringList(this.f42923b);
        parcel.writeTypedArray(this.f42924c, i11);
        parcel.writeInt(this.f42925d);
        parcel.writeString(this.f42926e);
        parcel.writeStringList(this.f42927f);
        parcel.writeTypedList(this.f42928g);
        parcel.writeTypedList(this.f42929h);
    }
}
