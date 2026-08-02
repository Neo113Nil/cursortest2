package Dm0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class b implements Serializable, Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f6755a;

    /* renamed from: b, reason: collision with root package name */
    private Character f6756b;

    /* renamed from: c, reason: collision with root package name */
    private h f6757c;

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f6758d;

    /* renamed from: e, reason: collision with root package name */
    private c f6759e;

    /* renamed from: f, reason: collision with root package name */
    private transient b f6760f;

    /* renamed from: g, reason: collision with root package name */
    private transient b f6761g;

    static class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i11) {
            return new b[i11];
        }
    }

    /* renamed from: Dm0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0147b extends Serializable {
        boolean z1(char c11);
    }

    public b(int i11, Character ch2, c cVar) {
        this.f6755a = 0;
        this.f6758d = new HashSet();
        this.f6755a = i11;
        this.f6756b = ch2;
        this.f6759e = cVar == null ? new c() : cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int C(int i11, Character ch2, boolean z11) {
        int C11;
        Object[] objArr;
        b bVar;
        h hVar = this.f6757c;
        if (hVar != null) {
            ch2 = hVar.V0();
        }
        if (ch2 == null) {
            n();
            return d(4) ? 1 : 0;
        }
        Object[] objArr2 = z11 && d(2) && !d(1);
        if (!h() || objArr2 == true || !this.f6756b.equals(ch2)) {
            if (d(2) || objArr2 == true) {
                int i12 = i11 + 1;
                b bVar2 = this.f6760f;
                C11 = bVar2 == null ? 0 : bVar2.C(i12, ch2, true);
                objArr = false;
            } else {
                C11 = 0;
                objArr = true;
            }
            Character ch3 = this.f6756b;
            if (ch3 != null && (this.f6755a & 3) == 0 && (bVar = this.f6760f) != null) {
                bVar.C(0, ch3, true);
            }
            if (objArr != true) {
                return C11;
            }
            this.f6756b = ch2;
            if (!d(8)) {
                return i11 + 1;
            }
        } else if (!d(8)) {
            return i11 + 1;
        }
        return i11;
    }

    private boolean d(int i11) {
        return (this.f6755a & i11) == i11;
    }

    private Character l(b bVar) {
        if (bVar != null) {
            if (!bVar.h()) {
                Character ch2 = bVar.f6756b;
                if (ch2 != null) {
                    char charValue = ch2.charValue();
                    c cVar = this.f6759e;
                    if (cVar != null && !cVar.z1(charValue)) {
                        return null;
                    }
                }
                bVar.n();
                return ch2;
            }
            b bVar2 = bVar.f6760f;
            if (bVar2 != null) {
                return l(bVar2);
            }
        }
        return null;
    }

    private void n() {
        if (!h()) {
            this.f6756b = l(this.f6760f);
            return;
        }
        b bVar = this.f6761g;
        if (bVar != null) {
            bVar.n();
        }
    }

    public final int A(Character ch2, boolean z11) {
        return C(0, ch2, z11);
    }

    public final void D(Integer... numArr) {
        for (Integer num : numArr) {
            if (num != null) {
                this.f6758d.add(num);
            }
        }
    }

    public final boolean a() {
        if (this.f6756b != null && !h()) {
            return true;
        }
        b bVar = this.f6760f;
        if (bVar != null) {
            return bVar.a();
        }
        return false;
    }

    public final boolean b(char c11) {
        h hVar = this.f6757c;
        if (hVar != null) {
            c11 = hVar.V0().charValue();
        }
        if (h()) {
            return this.f6756b.equals(Character.valueOf(c11));
        }
        c cVar = this.f6759e;
        return cVar == null || cVar.z1(c11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final b e() {
        return this.f6760f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f6755a != bVar.f6755a) {
            return false;
        }
        Character ch2 = this.f6756b;
        if (ch2 != null) {
            if (!ch2.equals(bVar.f6756b)) {
                return false;
            }
        } else if (bVar.f6756b != null) {
            return false;
        }
        HashSet hashSet = bVar.f6758d;
        HashSet hashSet2 = this.f6758d;
        if (hashSet2 != null) {
            if (!hashSet2.equals(hashSet)) {
                return false;
            }
        } else if (hashSet != null) {
            return false;
        }
        c cVar = bVar.f6759e;
        c cVar2 = this.f6759e;
        return cVar2 != null ? cVar2.equals(cVar) : cVar == null;
    }

    public final b f() {
        return this.f6761g;
    }

    public final Character g() {
        return this.f6756b;
    }

    public final boolean h() {
        return this.f6756b != null && d(2);
    }

    public final int hashCode() {
        int i11 = this.f6755a * 31;
        Character ch2 = this.f6756b;
        int hashCode = (i11 + (ch2 != null ? ch2.hashCode() : 0)) * 31;
        HashSet hashSet = this.f6758d;
        int hashCode2 = (hashCode + (hashSet != null ? hashSet.hashCode() : 0)) * 31;
        c cVar = this.f6759e;
        return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final int i(int i11) {
        b bVar;
        if (h() && ((bVar = this.f6760f) == null || !bVar.h())) {
            return i11 + 1;
        }
        if (h() && this.f6760f.h()) {
            return this.f6760f.i(i11 + 1);
        }
        return -1;
    }

    public final boolean j(Integer num) {
        return this.f6758d.contains(num);
    }

    public final void p(b bVar) {
        this.f6760f = bVar;
    }

    public final String toString() {
        return "Slot{value=" + this.f6756b + '}';
    }

    public final void u(b bVar) {
        this.f6761g = bVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f6755a);
        parcel.writeSerializable(this.f6756b);
        parcel.writeSerializable(this.f6759e);
        parcel.writeSerializable(this.f6757c);
        HashSet hashSet = this.f6758d;
        parcel.writeInt(hashSet.size());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            parcel.writeInt(((Integer) it.next()).intValue());
        }
    }

    public final int y() {
        return C(0, null, false);
    }

    public b(InterfaceC0147b... interfaceC0147bArr) {
        this(0, null, c.a(interfaceC0147bArr));
    }

    public b() {
        this(0, null, null);
    }

    public b(@NonNull b bVar) {
        this(bVar.f6755a, bVar.f6756b, bVar.f6759e);
        this.f6757c = bVar.f6757c;
        this.f6758d.addAll(bVar.f6758d);
    }

    protected b(Parcel parcel) {
        this.f6755a = 0;
        this.f6758d = new HashSet();
        this.f6755a = parcel.readInt();
        this.f6756b = (Character) parcel.readSerializable();
        this.f6759e = (c) parcel.readSerializable();
        this.f6757c = (h) parcel.readSerializable();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f6758d.add(Integer.valueOf(parcel.readInt()));
        }
    }
}
