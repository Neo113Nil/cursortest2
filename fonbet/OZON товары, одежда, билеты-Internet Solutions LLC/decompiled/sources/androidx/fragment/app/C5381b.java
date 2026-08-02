package androidx.fragment.app;

import I0.C3173b;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.Q;
import androidx.lifecycle.AbstractC5434v;
import java.util.ArrayList;
import java.util.HashMap;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5381b implements Parcelable {
    public static final Parcelable.Creator<C5381b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int[] f43018a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<String> f43019b;

    /* renamed from: c, reason: collision with root package name */
    final int[] f43020c;

    /* renamed from: d, reason: collision with root package name */
    final int[] f43021d;

    /* renamed from: e, reason: collision with root package name */
    final int f43022e;

    /* renamed from: f, reason: collision with root package name */
    final String f43023f;

    /* renamed from: g, reason: collision with root package name */
    final int f43024g;

    /* renamed from: h, reason: collision with root package name */
    final int f43025h;

    /* renamed from: i, reason: collision with root package name */
    final CharSequence f43026i;

    /* renamed from: j, reason: collision with root package name */
    final int f43027j;

    /* renamed from: k, reason: collision with root package name */
    final CharSequence f43028k;

    /* renamed from: l, reason: collision with root package name */
    final ArrayList<String> f43029l;

    /* renamed from: m, reason: collision with root package name */
    final ArrayList<String> f43030m;

    /* renamed from: n, reason: collision with root package name */
    final boolean f43031n;

    /* renamed from: androidx.fragment.app.b$a */
    final class a implements Parcelable.Creator<C5381b> {
        @Override // android.os.Parcelable.Creator
        public final C5381b createFromParcel(Parcel parcel) {
            return new C5381b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C5381b[] newArray(int i11) {
            return new C5381b[i11];
        }
    }

    C5381b(C5380a c5380a) {
        int size = c5380a.f42963a.size();
        this.f43018a = new int[size * 6];
        if (!c5380a.f42969g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f43019b = new ArrayList<>(size);
        this.f43020c = new int[size];
        this.f43021d = new int[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Q.a aVar = c5380a.f42963a.get(i12);
            int i13 = i11 + 1;
            this.f43018a[i11] = aVar.f42980a;
            ArrayList<String> arrayList = this.f43019b;
            ComponentCallbacksC5392m componentCallbacksC5392m = aVar.f42981b;
            arrayList.add(componentCallbacksC5392m != null ? componentCallbacksC5392m.mWho : null);
            int[] iArr = this.f43018a;
            iArr[i13] = aVar.f42982c ? 1 : 0;
            iArr[i11 + 2] = aVar.f42983d;
            iArr[i11 + 3] = aVar.f42984e;
            int i14 = i11 + 5;
            iArr[i11 + 4] = aVar.f42985f;
            i11 += 6;
            iArr[i14] = aVar.f42986g;
            this.f43020c[i12] = aVar.f42987h.ordinal();
            this.f43021d[i12] = aVar.f42988i.ordinal();
        }
        this.f43022e = c5380a.f42968f;
        this.f43023f = c5380a.f42971i;
        this.f43024g = c5380a.f43015t;
        this.f43025h = c5380a.f42972j;
        this.f43026i = c5380a.f42973k;
        this.f43027j = c5380a.f42974l;
        this.f43028k = c5380a.f42975m;
        this.f43029l = c5380a.f42976n;
        this.f43030m = c5380a.f42977o;
        this.f43031n = c5380a.f42978p;
    }

    private void a(@NonNull C5380a c5380a) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f43018a;
            boolean z11 = true;
            if (i11 >= iArr.length) {
                c5380a.f42968f = this.f43022e;
                c5380a.f42971i = this.f43023f;
                c5380a.f42969g = true;
                c5380a.f42972j = this.f43025h;
                c5380a.f42973k = this.f43026i;
                c5380a.f42974l = this.f43027j;
                c5380a.f42975m = this.f43028k;
                c5380a.f42976n = this.f43029l;
                c5380a.f42977o = this.f43030m;
                c5380a.f42978p = this.f43031n;
                return;
            }
            Q.a aVar = new Q.a();
            int i13 = i11 + 1;
            aVar.f42980a = iArr[i11];
            if (G.D0(2)) {
                Log.v("FragmentManager", "Instantiate " + c5380a + " op #" + i12 + " base fragment #" + iArr[i13]);
            }
            aVar.f42987h = AbstractC5434v.b.values()[this.f43020c[i12]];
            aVar.f42988i = AbstractC5434v.b.values()[this.f43021d[i12]];
            int i14 = i11 + 2;
            if (iArr[i13] == 0) {
                z11 = false;
            }
            aVar.f42982c = z11;
            int i15 = iArr[i14];
            aVar.f42983d = i15;
            int i16 = iArr[i11 + 3];
            aVar.f42984e = i16;
            int i17 = i11 + 5;
            int i18 = iArr[i11 + 4];
            aVar.f42985f = i18;
            i11 += 6;
            int i19 = iArr[i17];
            aVar.f42986g = i19;
            c5380a.f42964b = i15;
            c5380a.f42965c = i16;
            c5380a.f42966d = i18;
            c5380a.f42967e = i19;
            c5380a.e(aVar);
            i12++;
        }
    }

    @NonNull
    public final C5380a b(@NonNull G g10) {
        C5380a c5380a = new C5380a(g10);
        a(c5380a);
        c5380a.f43015t = this.f43024g;
        int i11 = 0;
        while (true) {
            ArrayList<String> arrayList = this.f43019b;
            if (i11 >= arrayList.size()) {
                c5380a.z(1);
                return c5380a;
            }
            String str = arrayList.get(i11);
            if (str != null) {
                c5380a.f42963a.get(i11).f42981b = g10.d0(str);
            }
            i11++;
        }
    }

    @NonNull
    public final C5380a c(@NonNull G g10, @NonNull HashMap hashMap) {
        C5380a c5380a = new C5380a(g10);
        a(c5380a);
        int i11 = 0;
        while (true) {
            ArrayList<String> arrayList = this.f43019b;
            if (i11 >= arrayList.size()) {
                return c5380a;
            }
            String str = arrayList.get(i11);
            if (str != null) {
                ComponentCallbacksC5392m componentCallbacksC5392m = (ComponentCallbacksC5392m) hashMap.get(str);
                if (componentCallbacksC5392m == null) {
                    throw new IllegalStateException(C3173b.c(new StringBuilder("Restoring FragmentTransaction "), this.f43023f, " failed due to missing saved state for Fragment (", str, ")"));
                }
                c5380a.f42963a.get(i11).f42981b = componentCallbacksC5392m;
            }
            i11++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeIntArray(this.f43018a);
        parcel.writeStringList(this.f43019b);
        parcel.writeIntArray(this.f43020c);
        parcel.writeIntArray(this.f43021d);
        parcel.writeInt(this.f43022e);
        parcel.writeString(this.f43023f);
        parcel.writeInt(this.f43024g);
        parcel.writeInt(this.f43025h);
        TextUtils.writeToParcel(this.f43026i, parcel, 0);
        parcel.writeInt(this.f43027j);
        TextUtils.writeToParcel(this.f43028k, parcel, 0);
        parcel.writeStringList(this.f43029l);
        parcel.writeStringList(this.f43030m);
        parcel.writeInt(this.f43031n ? 1 : 0);
    }

    C5381b(Parcel parcel) {
        this.f43018a = parcel.createIntArray();
        this.f43019b = parcel.createStringArrayList();
        this.f43020c = parcel.createIntArray();
        this.f43021d = parcel.createIntArray();
        this.f43022e = parcel.readInt();
        this.f43023f = parcel.readString();
        this.f43024g = parcel.readInt();
        this.f43025h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f43026i = (CharSequence) creator.createFromParcel(parcel);
        this.f43027j = parcel.readInt();
        this.f43028k = (CharSequence) creator.createFromParcel(parcel);
        this.f43029l = parcel.createStringArrayList();
        this.f43030m = parcel.createStringArrayList();
        this.f43031n = parcel.readInt() != 0;
    }
}
