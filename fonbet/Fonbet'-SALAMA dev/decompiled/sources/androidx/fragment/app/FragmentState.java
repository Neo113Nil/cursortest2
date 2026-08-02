package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C0703b(4);

    /* renamed from: A, reason: collision with root package name */
    public final boolean f9340A;

    /* renamed from: B, reason: collision with root package name */
    public final int f9341B;

    /* renamed from: C, reason: collision with root package name */
    public final String f9342C;

    /* renamed from: D, reason: collision with root package name */
    public final int f9343D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f9344E;

    /* renamed from: a, reason: collision with root package name */
    public final String f9345a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9346b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9347c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9348d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9349e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9350f;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f9351x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f9352y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f9353z;

    public FragmentState(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        this.f9345a = abstractComponentCallbacksC0722v.getClass().getName();
        this.f9346b = abstractComponentCallbacksC0722v.f9537e;
        this.f9347c = abstractComponentCallbacksC0722v.f9508E;
        this.f9348d = abstractComponentCallbacksC0722v.f9517N;
        this.f9349e = abstractComponentCallbacksC0722v.f9518O;
        this.f9350f = abstractComponentCallbacksC0722v.f9519P;
        this.f9351x = abstractComponentCallbacksC0722v.f9522S;
        this.f9352y = abstractComponentCallbacksC0722v.f9506C;
        this.f9353z = abstractComponentCallbacksC0722v.f9521R;
        this.f9340A = abstractComponentCallbacksC0722v.f9520Q;
        this.f9341B = abstractComponentCallbacksC0722v.c0.ordinal();
        this.f9342C = abstractComponentCallbacksC0722v.f9544y;
        this.f9343D = abstractComponentCallbacksC0722v.f9545z;
        this.f9344E = abstractComponentCallbacksC0722v.f9527X;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f9345a);
        sb.append(" (");
        sb.append(this.f9346b);
        sb.append(")}:");
        if (this.f9347c) {
            sb.append(" fromLayout");
        }
        int i7 = this.f9349e;
        if (i7 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i7));
        }
        String str = this.f9350f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f9351x) {
            sb.append(" retainInstance");
        }
        if (this.f9352y) {
            sb.append(" removing");
        }
        if (this.f9353z) {
            sb.append(" detached");
        }
        if (this.f9340A) {
            sb.append(" hidden");
        }
        String str2 = this.f9342C;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f9343D);
        }
        if (this.f9344E) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f9345a);
        parcel.writeString(this.f9346b);
        parcel.writeInt(this.f9347c ? 1 : 0);
        parcel.writeInt(this.f9348d);
        parcel.writeInt(this.f9349e);
        parcel.writeString(this.f9350f);
        parcel.writeInt(this.f9351x ? 1 : 0);
        parcel.writeInt(this.f9352y ? 1 : 0);
        parcel.writeInt(this.f9353z ? 1 : 0);
        parcel.writeInt(this.f9340A ? 1 : 0);
        parcel.writeInt(this.f9341B);
        parcel.writeString(this.f9342C);
        parcel.writeInt(this.f9343D);
        parcel.writeInt(this.f9344E ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.f9345a = parcel.readString();
        this.f9346b = parcel.readString();
        this.f9347c = parcel.readInt() != 0;
        this.f9348d = parcel.readInt();
        this.f9349e = parcel.readInt();
        this.f9350f = parcel.readString();
        this.f9351x = parcel.readInt() != 0;
        this.f9352y = parcel.readInt() != 0;
        this.f9353z = parcel.readInt() != 0;
        this.f9340A = parcel.readInt() != 0;
        this.f9341B = parcel.readInt();
        this.f9342C = parcel.readString();
        this.f9343D = parcel.readInt();
        this.f9344E = parcel.readInt() != 0;
    }
}
