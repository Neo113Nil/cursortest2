package Bm0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class f implements Iterable<Dm0.b>, Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f4019a;

    /* renamed from: b, reason: collision with root package name */
    private Dm0.b f4020b;

    /* renamed from: c, reason: collision with root package name */
    private Dm0.b f4021c;

    static class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i11) {
            return new f[i11];
        }
    }

    private static class b implements Iterator<Dm0.b> {

        /* renamed from: a, reason: collision with root package name */
        Dm0.b f4022a;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f4022a != null;
        }

        @Override // java.util.Iterator
        public final Dm0.b next() {
            Dm0.b bVar = this.f4022a;
            this.f4022a = bVar.e();
            return bVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Mask cannot be modified from outside!");
        }
    }

    public f() {
        this.f4019a = 0;
    }

    private static void g(@NonNull Dm0.b[] bVarArr, f fVar) {
        Dm0.b bVar = new Dm0.b(bVarArr[0]);
        fVar.f4020b = bVar;
        if (fVar.f4019a == 1) {
            fVar.f4021c = bVar;
        }
        int i11 = 1;
        while (i11 < bVarArr.length) {
            Dm0.b bVar2 = new Dm0.b(bVarArr[i11]);
            bVar.p(bVar2);
            bVar2.u(bVar);
            if (i11 == bVarArr.length - 1) {
                fVar.f4021c = bVar2;
            }
            i11++;
            bVar = bVar2;
        }
    }

    public static f h(@NonNull Dm0.b[] bVarArr) {
        f fVar = new f();
        int length = bVarArr.length;
        fVar.f4019a = length;
        if (length == 0) {
            return fVar;
        }
        g(bVarArr, fVar);
        return fVar;
    }

    public final boolean a(int i11) {
        return i11 >= 0 && i11 < this.f4019a;
    }

    public final Dm0.b b() {
        return this.f4020b;
    }

    public final Dm0.b c() {
        return this.f4021c;
    }

    public final void clear() {
        if (isEmpty()) {
            return;
        }
        for (Dm0.b bVar = this.f4021c; bVar != null; bVar = bVar.f()) {
            bVar.y();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Dm0.b e(int i11) {
        Dm0.b bVar;
        if (!a(i11)) {
            return null;
        }
        int i12 = this.f4019a;
        if (i11 < (i12 >> 1)) {
            bVar = this.f4020b;
            for (int i13 = 0; i13 < i11; i13++) {
                bVar = bVar.e();
            }
        } else {
            Dm0.b bVar2 = this.f4021c;
            for (int i14 = i12 - 1; i14 > i11; i14--) {
                bVar2 = bVar2.f();
            }
            bVar = bVar2;
        }
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("Slot inside the mask should not be null. But it is.");
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (fVar.f4019a != this.f4019a) {
            return false;
        }
        Iterator<Dm0.b> it = iterator();
        Iterator<Dm0.b> it2 = fVar.iterator();
        do {
            bVar = (b) it2;
            if (!bVar.hasNext()) {
                return true;
            }
        } while (((Dm0.b) ((b) it).next()).equals((Dm0.b) bVar.next()));
        return false;
    }

    public final Dm0.b f(int i11, @NonNull Dm0.b bVar) {
        Dm0.b f7;
        if (i11 < 0 || this.f4019a < i11) {
            throw new IndexOutOfBoundsException("New slot position should be inside the slots list. Or on the tail (position = size)");
        }
        Dm0.b bVar2 = new Dm0.b(bVar);
        Dm0.b e11 = e(i11);
        if (e11 == null) {
            f7 = this.f4021c;
            e11 = null;
        } else {
            f7 = e11.f();
        }
        bVar2.p(e11);
        bVar2.u(f7);
        if (e11 != null) {
            e11.u(bVar2);
        }
        if (f7 != null) {
            f7.p(bVar2);
        }
        if (i11 == 0) {
            this.f4020b = bVar2;
        } else if (i11 == this.f4019a) {
            this.f4021c = bVar2;
        }
        this.f4019a++;
        return bVar2;
    }

    public final void i(int i11) {
        b bVar;
        if (!a(i11)) {
            throw new IndexOutOfBoundsException("Slot position should be inside the slots list");
        }
        Dm0.b e11 = e(i11);
        if (e11 != null) {
            Iterator<Dm0.b> it = iterator();
            do {
                bVar = (b) it;
                if (!bVar.hasNext()) {
                    return;
                }
            } while (((Dm0.b) bVar.next()) != e11);
            Dm0.b f7 = e11.f();
            Dm0.b e12 = e11.e();
            if (f7 != null) {
                f7.p(e12);
            } else {
                this.f4020b = e12;
            }
            if (e12 != null) {
                e12.u(f7);
            } else {
                this.f4021c = f7;
            }
            this.f4019a--;
        }
    }

    public final boolean isEmpty() {
        return this.f4019a == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<Dm0.b> iterator() {
        Dm0.b bVar = this.f4020b;
        b bVar2 = new b();
        if (bVar == null) {
            throw new IllegalArgumentException("Initial slot for iterator cannot be null");
        }
        bVar2.f4022a = bVar;
        return bVar2;
    }

    public final int size() {
        return this.f4019a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Dm0.b[] bVarArr;
        parcel.writeInt(this.f4019a);
        if (this.f4019a > 0) {
            int i12 = 0;
            if (!isEmpty()) {
                bVarArr = new Dm0.b[this.f4019a];
                Iterator<Dm0.b> it = iterator();
                while (true) {
                    b bVar = (b) it;
                    if (!bVar.hasNext()) {
                        break;
                    }
                    bVarArr[i12] = (Dm0.b) bVar.next();
                    i12++;
                }
            } else {
                bVarArr = new Dm0.b[0];
            }
            parcel.writeTypedArray(bVarArr, i11);
        }
    }

    public f(@NonNull f fVar) {
        this.f4019a = 0;
        if (fVar.isEmpty()) {
            return;
        }
        Iterator<Dm0.b> it = fVar.iterator();
        Dm0.b bVar = null;
        while (true) {
            b bVar2 = (b) it;
            if (bVar2.hasNext()) {
                Dm0.b bVar3 = new Dm0.b((Dm0.b) bVar2.next());
                if (this.f4019a == 0) {
                    this.f4020b = bVar3;
                } else {
                    bVar.p(bVar3);
                    bVar3.u(bVar);
                }
                this.f4019a++;
                bVar = bVar3;
            } else {
                this.f4021c = bVar;
                return;
            }
        }
    }

    protected f(Parcel parcel) {
        this.f4019a = 0;
        int readInt = parcel.readInt();
        this.f4019a = readInt;
        if (readInt > 0) {
            Dm0.b[] bVarArr = new Dm0.b[readInt];
            parcel.readTypedArray(bVarArr, Dm0.b.CREATOR);
            g(bVarArr, this);
        }
    }
}
