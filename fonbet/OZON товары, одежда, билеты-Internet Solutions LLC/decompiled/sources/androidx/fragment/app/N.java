package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes8.dex */
final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final String f42937a;

    /* renamed from: b, reason: collision with root package name */
    final String f42938b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f42939c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f42940d;

    /* renamed from: e, reason: collision with root package name */
    final int f42941e;

    /* renamed from: f, reason: collision with root package name */
    final int f42942f;

    /* renamed from: g, reason: collision with root package name */
    final String f42943g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f42944h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f42945i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f42946j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f42947k;

    /* renamed from: l, reason: collision with root package name */
    final int f42948l;

    /* renamed from: m, reason: collision with root package name */
    final String f42949m;

    /* renamed from: n, reason: collision with root package name */
    final int f42950n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f42951o;

    final class a implements Parcelable.Creator<N> {
        @Override // android.os.Parcelable.Creator
        public final N createFromParcel(Parcel parcel) {
            return new N(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final N[] newArray(int i11) {
            return new N[i11];
        }
    }

    N(ComponentCallbacksC5392m componentCallbacksC5392m) {
        this.f42937a = componentCallbacksC5392m.getClass().getName();
        this.f42938b = componentCallbacksC5392m.mWho;
        this.f42939c = componentCallbacksC5392m.mFromLayout;
        this.f42940d = componentCallbacksC5392m.mInDynamicContainer;
        this.f42941e = componentCallbacksC5392m.mFragmentId;
        this.f42942f = componentCallbacksC5392m.mContainerId;
        this.f42943g = componentCallbacksC5392m.mTag;
        this.f42944h = componentCallbacksC5392m.mRetainInstance;
        this.f42945i = componentCallbacksC5392m.mRemoving;
        this.f42946j = componentCallbacksC5392m.mDetached;
        this.f42947k = componentCallbacksC5392m.mHidden;
        this.f42948l = componentCallbacksC5392m.mMaxState.ordinal();
        this.f42949m = componentCallbacksC5392m.mTargetWho;
        this.f42950n = componentCallbacksC5392m.mTargetRequestCode;
        this.f42951o = componentCallbacksC5392m.mUserVisibleHint;
    }

    @NonNull
    final ComponentCallbacksC5392m a(@NonNull C5400v c5400v, @NonNull ClassLoader classLoader) {
        ComponentCallbacksC5392m a11 = c5400v.a(classLoader, this.f42937a);
        a11.mWho = this.f42938b;
        a11.mFromLayout = this.f42939c;
        a11.mInDynamicContainer = this.f42940d;
        a11.mRestored = true;
        a11.mFragmentId = this.f42941e;
        a11.mContainerId = this.f42942f;
        a11.mTag = this.f42943g;
        a11.mRetainInstance = this.f42944h;
        a11.mRemoving = this.f42945i;
        a11.mDetached = this.f42946j;
        a11.mHidden = this.f42947k;
        a11.mMaxState = AbstractC5434v.b.values()[this.f42948l];
        a11.mTargetWho = this.f42949m;
        a11.mTargetRequestCode = this.f42950n;
        a11.mUserVisibleHint = this.f42951o;
        return a11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
        sb2.append("FragmentState{");
        sb2.append(this.f42937a);
        sb2.append(" (");
        sb2.append(this.f42938b);
        sb2.append(")}:");
        if (this.f42939c) {
            sb2.append(" fromLayout");
        }
        if (this.f42940d) {
            sb2.append(" dynamicContainer");
        }
        int i11 = this.f42942f;
        if (i11 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i11));
        }
        String str = this.f42943g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f42944h) {
            sb2.append(" retainInstance");
        }
        if (this.f42945i) {
            sb2.append(" removing");
        }
        if (this.f42946j) {
            sb2.append(" detached");
        }
        if (this.f42947k) {
            sb2.append(" hidden");
        }
        String str2 = this.f42949m;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f42950n);
        }
        if (this.f42951o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f42937a);
        parcel.writeString(this.f42938b);
        parcel.writeInt(this.f42939c ? 1 : 0);
        parcel.writeInt(this.f42940d ? 1 : 0);
        parcel.writeInt(this.f42941e);
        parcel.writeInt(this.f42942f);
        parcel.writeString(this.f42943g);
        parcel.writeInt(this.f42944h ? 1 : 0);
        parcel.writeInt(this.f42945i ? 1 : 0);
        parcel.writeInt(this.f42946j ? 1 : 0);
        parcel.writeInt(this.f42947k ? 1 : 0);
        parcel.writeInt(this.f42948l);
        parcel.writeString(this.f42949m);
        parcel.writeInt(this.f42950n);
        parcel.writeInt(this.f42951o ? 1 : 0);
    }

    N(Parcel parcel) {
        this.f42937a = parcel.readString();
        this.f42938b = parcel.readString();
        this.f42939c = parcel.readInt() != 0;
        this.f42940d = parcel.readInt() != 0;
        this.f42941e = parcel.readInt();
        this.f42942f = parcel.readInt();
        this.f42943g = parcel.readString();
        this.f42944h = parcel.readInt() != 0;
        this.f42945i = parcel.readInt() != 0;
        this.f42946j = parcel.readInt() != 0;
        this.f42947k = parcel.readInt() != 0;
        this.f42948l = parcel.readInt();
        this.f42949m = parcel.readString();
        this.f42950n = parcel.readInt();
        this.f42951o = parcel.readInt() != 0;
    }
}
