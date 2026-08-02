package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5382c implements Parcelable {
    public static final Parcelable.Creator<C5382c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList f43032a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f43033b;

    /* renamed from: androidx.fragment.app.c$a */
    final class a implements Parcelable.Creator<C5382c> {
        @Override // android.os.Parcelable.Creator
        public final C5382c createFromParcel(Parcel parcel) {
            return new C5382c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C5382c[] newArray(int i11) {
            return new C5382c[i11];
        }
    }

    C5382c(ArrayList arrayList, ArrayList arrayList2) {
        this.f43032a = arrayList;
        this.f43033b = arrayList2;
    }

    @NonNull
    final ArrayList a(@NonNull G g10, HashMap hashMap) {
        ArrayList<String> arrayList = this.f43032a;
        HashMap hashMap2 = new HashMap(arrayList.size());
        for (String str : arrayList) {
            ComponentCallbacksC5392m componentCallbacksC5392m = (ComponentCallbacksC5392m) hashMap.get(str);
            if (componentCallbacksC5392m != null) {
                hashMap2.put(componentCallbacksC5392m.mWho, componentCallbacksC5392m);
            } else {
                Bundle B11 = g10.q0().B(null, str);
                if (B11 != null) {
                    ClassLoader classLoader = g10.s0().e().getClassLoader();
                    ComponentCallbacksC5392m a11 = ((N) B11.getParcelable("state")).a(g10.p0(), classLoader);
                    a11.mSavedFragmentState = B11;
                    if (B11.getBundle("savedInstanceState") == null) {
                        a11.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                    }
                    Bundle bundle = B11.getBundle("arguments");
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    a11.setArguments(bundle);
                    hashMap2.put(a11.mWho, a11);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f43033b.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C5381b) it.next()).c(g10, hashMap2));
        }
        return arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeStringList(this.f43032a);
        parcel.writeTypedList(this.f43033b);
    }

    C5382c(@NonNull Parcel parcel) {
        this.f43032a = parcel.createStringArrayList();
        this.f43033b = parcel.createTypedArrayList(C5381b.CREATOR);
    }
}
