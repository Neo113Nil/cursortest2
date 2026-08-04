package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new C0682b(0);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f9306A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final CharSequence f9307B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ArrayList f9308C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ArrayList f9309D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f9310E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f9311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f9313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f9314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f9316f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f9317x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f9318y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CharSequence f9319z;

    public BackStackRecordState(C0681a c0681a) {
        int size = c0681a.f9431a.size();
        this.f9311a = new int[size * 6];
        if (!c0681a.f9437g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f9312b = new ArrayList(size);
        this.f9313c = new int[size];
        this.f9314d = new int[size];
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            W w7 = (W) c0681a.f9431a.get(i8);
            int i9 = i7 + 1;
            this.f9311a[i7] = w7.f9419a;
            ArrayList arrayList = this.f9312b;
            AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = w7.f9420b;
            arrayList.add(abstractComponentCallbacksC0701v != null ? abstractComponentCallbacksC0701v.f9537e : null);
            int[] iArr = this.f9311a;
            iArr[i9] = w7.f9421c ? 1 : 0;
            iArr[i7 + 2] = w7.f9422d;
            iArr[i7 + 3] = w7.f9423e;
            int i10 = i7 + 5;
            iArr[i7 + 4] = w7.f9424f;
            i7 += 6;
            iArr[i10] = w7.f9425g;
            this.f9313c[i8] = w7.f9426h.ordinal();
            this.f9314d[i8] = w7.f9427i.ordinal();
        }
        this.f9315e = c0681a.f9436f;
        this.f9316f = c0681a.f9438h;
        this.f9317x = c0681a.f9447r;
        this.f9318y = c0681a.f9439i;
        this.f9319z = c0681a.j;
        this.f9306A = c0681a.f9440k;
        this.f9307B = c0681a.f9441l;
        this.f9308C = c0681a.f9442m;
        this.f9309D = c0681a.f9443n;
        this.f9310E = c0681a.f9444o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeIntArray(this.f9311a);
        parcel.writeStringList(this.f9312b);
        parcel.writeIntArray(this.f9313c);
        parcel.writeIntArray(this.f9314d);
        parcel.writeInt(this.f9315e);
        parcel.writeString(this.f9316f);
        parcel.writeInt(this.f9317x);
        parcel.writeInt(this.f9318y);
        TextUtils.writeToParcel(this.f9319z, parcel, 0);
        parcel.writeInt(this.f9306A);
        TextUtils.writeToParcel(this.f9307B, parcel, 0);
        parcel.writeStringList(this.f9308C);
        parcel.writeStringList(this.f9309D);
        parcel.writeInt(this.f9310E ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f9311a = parcel.createIntArray();
        this.f9312b = parcel.createStringArrayList();
        this.f9313c = parcel.createIntArray();
        this.f9314d = parcel.createIntArray();
        this.f9315e = parcel.readInt();
        this.f9316f = parcel.readString();
        this.f9317x = parcel.readInt();
        this.f9318y = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f9319z = (CharSequence) creator.createFromParcel(parcel);
        this.f9306A = parcel.readInt();
        this.f9307B = (CharSequence) creator.createFromParcel(parcel);
        this.f9308C = parcel.createStringArrayList();
        this.f9309D = parcel.createStringArrayList();
        this.f9310E = parcel.readInt() != 0;
    }
}
