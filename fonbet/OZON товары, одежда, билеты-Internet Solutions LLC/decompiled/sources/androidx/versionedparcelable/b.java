package androidx.versionedparcelable;

import C.o0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.C5132a;
import java.lang.reflect.Method;

/* loaded from: classes8.dex */
final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f45139d;

    /* renamed from: e, reason: collision with root package name */
    private final Parcel f45140e;

    /* renamed from: f, reason: collision with root package name */
    private final int f45141f;

    /* renamed from: g, reason: collision with root package name */
    private final int f45142g;

    /* renamed from: h, reason: collision with root package name */
    private final String f45143h;

    /* renamed from: i, reason: collision with root package name */
    private int f45144i;

    /* renamed from: j, reason: collision with root package name */
    private int f45145j;

    /* renamed from: k, reason: collision with root package name */
    private int f45146k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C5132a(), new C5132a(), new C5132a());
    }

    @Override // androidx.versionedparcelable.a
    protected final void A(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f45140e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public final void B(int i11) {
        this.f45140e.writeInt(i11);
    }

    @Override // androidx.versionedparcelable.a
    public final void D(Parcelable parcelable) {
        this.f45140e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public final void G(String str) {
        this.f45140e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public final void a() {
        int i11 = this.f45144i;
        if (i11 >= 0) {
            int i12 = this.f45139d.get(i11);
            Parcel parcel = this.f45140e;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected final a b() {
        Parcel parcel = this.f45140e;
        int dataPosition = parcel.dataPosition();
        int i11 = this.f45145j;
        if (i11 == this.f45141f) {
            i11 = this.f45142g;
        }
        return new b(parcel, dataPosition, i11, o0.c(new StringBuilder(), this.f45143h, "  "), this.f45136a, this.f45137b, this.f45138c);
    }

    @Override // androidx.versionedparcelable.a
    public final boolean f() {
        return this.f45140e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public final byte[] h() {
        Parcel parcel = this.f45140e;
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected final CharSequence j() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f45140e);
    }

    @Override // androidx.versionedparcelable.a
    public final boolean l(int i11) {
        while (this.f45145j < this.f45142g) {
            int i12 = this.f45146k;
            if (i12 == i11) {
                return true;
            }
            if (String.valueOf(i12).compareTo(String.valueOf(i11)) > 0) {
                return false;
            }
            int i13 = this.f45145j;
            Parcel parcel = this.f45140e;
            parcel.setDataPosition(i13);
            int readInt = parcel.readInt();
            this.f45146k = parcel.readInt();
            this.f45145j += readInt;
        }
        return this.f45146k == i11;
    }

    @Override // androidx.versionedparcelable.a
    public final int m() {
        return this.f45140e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public final <T extends Parcelable> T o() {
        return (T) this.f45140e.readParcelable(b.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public final String q() {
        return this.f45140e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public final void u(int i11) {
        a();
        this.f45144i = i11;
        this.f45139d.put(i11, this.f45140e.dataPosition());
        B(0);
        B(i11);
    }

    @Override // androidx.versionedparcelable.a
    public final void w(boolean z11) {
        this.f45140e.writeInt(z11 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.a
    public final void x(byte[] bArr) {
        Parcel parcel = this.f45140e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    private b(Parcel parcel, int i11, int i12, String str, C5132a<String, Method> c5132a, C5132a<String, Method> c5132a2, C5132a<String, Class> c5132a3) {
        super(c5132a, c5132a2, c5132a3);
        this.f45139d = new SparseIntArray();
        this.f45144i = -1;
        this.f45146k = -1;
        this.f45140e = parcel;
        this.f45141f = i11;
        this.f45142g = i12;
        this.f45145j = i11;
        this.f45143h = str;
    }
}
