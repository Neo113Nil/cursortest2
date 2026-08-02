package Bm0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class e implements Bm0.a {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private boolean f4012a;

    /* renamed from: b, reason: collision with root package name */
    private Character f4013b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4014c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4015d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4016e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4017f;

    /* renamed from: g, reason: collision with root package name */
    private f f4018g;

    static class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i11) {
            return new e[i11];
        }
    }

    public e(@NonNull Dm0.b[] bVarArr, boolean z11) {
        this.f4017f = true;
        this.f4012a = z11;
        f h11 = f.h(bVarArr);
        this.f4018g = h11;
        if (h11.size() != 1 || z11) {
            return;
        }
        a();
    }

    private void a() {
        if (this.f4012a) {
            return;
        }
        int i11 = 1;
        while (true) {
            i11--;
            if (i11 < 0) {
                return;
            }
            f fVar = this.f4018g;
            Dm0.b f7 = fVar.f(fVar.size(), fVar.c());
            f7.y();
            f7.D(-149635);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0044, code lost:
    
        if (r6.f4016e != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int c(int i11, int i12, boolean z11) {
        f fVar;
        int i13;
        Dm0.b e11;
        int i14 = i11;
        int i15 = 0;
        while (true) {
            fVar = this.f4018g;
            if (i15 >= i12) {
                break;
            }
            if (fVar.a(i14) && (e11 = fVar.e(i14)) != null && (!e11.h() || (z11 && i12 == 1))) {
                i14 += e11.y();
            }
            i14--;
            i15++;
        }
        int i16 = i14 + 1;
        h();
        int i17 = i16;
        while (true) {
            i13 = i17 - 1;
            Dm0.b e12 = fVar.e(i13);
            if (e12 == null || !e12.h() || i13 <= 0) {
                break;
            }
            i17 = i13;
        }
        boolean z12 = false;
        this.f4017f = z12;
        if (i13 > 0) {
            i16 = (fVar.a(i11) && fVar.e(i11).h() && i12 == 1) ? i13 : i17;
        }
        if (i16 < 0 || i16 > fVar.size()) {
            return 0;
        }
        return i16;
    }

    @NonNull
    private String g(boolean z11) {
        f fVar = this.f4018g;
        if (fVar.isEmpty()) {
            return "";
        }
        Dm0.b b11 = fVar.b();
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (b11 != null) {
            Character g10 = b11.g();
            if (z11 || !b11.j(14779)) {
                boolean a11 = b11.a();
                boolean z12 = this.f4014c;
                if (!a11 && !z12 && (!this.f4017f || !fVar.a((b11.i(0) - 1) + i11))) {
                    break;
                }
                if (g10 != null || (!z12 && !a11)) {
                    if (g10 == null) {
                        break;
                    }
                } else {
                    Character ch2 = this.f4013b;
                    g10 = Character.valueOf(ch2 != null ? ch2.charValue() : '_');
                }
                sb2.append(g10);
            }
            b11 = b11.e();
            i11++;
        }
        return sb2.toString();
    }

    private void h() {
        if (this.f4012a) {
            return;
        }
        f fVar = this.f4018g;
        if (fVar.isEmpty()) {
            return;
        }
        Dm0.b c11 = fVar.c();
        Dm0.b f7 = c11.f();
        while (c11.j(-149635) && f7.j(-149635) && c11.g() == null && f7.g() == null) {
            fVar.i(fVar.size() - 1);
            Dm0.b bVar = f7;
            f7 = f7.f();
            c11 = bVar;
        }
    }

    @Override // Bm0.a
    public final int W() {
        int i11 = 0;
        for (Dm0.b e11 = this.f4018g.e(0); e11 != null && e11.g() != null; e11 = e11.e()) {
            i11++;
        }
        return i11;
    }

    @Override // Bm0.a
    public final int Z(int i11, int i12) {
        return c(i11, i12, false);
    }

    public final int b(int i11, CharSequence charSequence) {
        f fVar = this.f4018g;
        if (!fVar.isEmpty() && fVar.a(i11) && charSequence != null && charSequence.length() != 0) {
            boolean z11 = true;
            this.f4017f = true;
            Dm0.b e11 = fVar.e(i11);
            if (this.f4015d) {
                if (e11 == null) {
                    throw new IllegalArgumentException("first slot is null");
                }
                Dm0.b bVar = e11;
                do {
                    if (bVar.j(-149635) || bVar.h() || bVar.g() != null) {
                        bVar = bVar.e();
                    }
                } while (bVar != null);
            }
            ArrayDeque arrayDeque = new ArrayDeque(charSequence.length());
            for (int length = charSequence.length() - 1; length >= 0; length--) {
                arrayDeque.push(Character.valueOf(charSequence.charAt(length)));
            }
            while (true) {
                int i12 = 0;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                Character ch2 = (Character) arrayDeque.pop();
                char charValue = ch2.charValue();
                Dm0.b bVar2 = e11;
                boolean z12 = false;
                int i13 = 0;
                while (bVar2 != null && !bVar2.b(charValue)) {
                    if (!z12 && !bVar2.h()) {
                        z12 = true;
                    }
                    bVar2 = bVar2.e();
                    i13++;
                }
                if (this.f4014c || !z12) {
                    i11 += i13;
                    Dm0.b e12 = fVar.e(i11);
                    if (e12 != null) {
                        int A11 = e12.A(ch2, i13 > 0) + i11;
                        Dm0.b e13 = fVar.e(A11);
                        if (!this.f4012a) {
                            for (Dm0.b c11 = fVar.c(); c11 != null && c11.g() == null; c11 = c11.f()) {
                                i12++;
                            }
                            if (i12 < 1) {
                                a();
                            }
                        }
                        e11 = e13;
                        i11 = A11;
                    }
                }
            }
            int i14 = e11 != null ? e11.i(0) : 0;
            if (i14 > 0) {
                i11 += i14;
            }
            Dm0.b e14 = fVar.e(i11);
            if (e14 != null && e14.a()) {
                z11 = false;
            }
            this.f4017f = z11;
        }
        return i11;
    }

    @Override // Bm0.a
    @NonNull
    public final String c1() {
        return g(false);
    }

    public final void clear() {
        this.f4018g.clear();
        h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(boolean z11) {
        this.f4015d = z11;
    }

    public final void f(boolean z11) {
        this.f4016e = z11;
        f fVar = this.f4018g;
        if (fVar.isEmpty() ? false : fVar.b().a()) {
            return;
        }
        this.f4017f = !this.f4016e;
    }

    @Override // Bm0.a
    public final int getSize() {
        return this.f4018g.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<Dm0.b> iterator() {
        return this.f4018g.iterator();
    }

    @NonNull
    public final String toString() {
        return g(true);
    }

    @Override // Bm0.a
    public final int u1(int i11, CharSequence charSequence) {
        return b(i11, charSequence);
    }

    @Override // Bm0.a
    public final int v1(int i11, int i12) {
        return c(i11, i12, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeByte(this.f4012a ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.f4013b);
        parcel.writeByte(this.f4014c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4015d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4016e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4017f ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f4018g, i11);
    }

    public e(@NonNull e eVar) {
        boolean z11 = eVar.f4012a;
        this.f4017f = true;
        this.f4012a = z11;
        this.f4013b = eVar.f4013b;
        this.f4014c = eVar.f4014c;
        this.f4015d = eVar.f4015d;
        this.f4016e = eVar.f4016e;
        this.f4017f = eVar.f4017f;
        this.f4018g = new f(eVar.f4018g);
    }

    protected e(Parcel parcel) {
        this.f4012a = true;
        this.f4017f = true;
        this.f4012a = parcel.readByte() != 0;
        this.f4013b = (Character) parcel.readSerializable();
        this.f4014c = parcel.readByte() != 0;
        this.f4015d = parcel.readByte() != 0;
        this.f4016e = parcel.readByte() != 0;
        this.f4017f = parcel.readByte() != 0;
        this.f4018g = (f) parcel.readParcelable(f.class.getClassLoader());
    }
}
