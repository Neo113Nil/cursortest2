package P;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: P.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299j0 extends Z.v implements Parcelable, InterfaceC0289e0, d1, Z.m {
    public static final Parcelable.Creator<C0299j0> CREATOR = new C0295h0(1);

    /* renamed from: l, reason: collision with root package name */
    public R0 f4477l;

    public C0299j0(int i) {
        Z.f k5 = Z.l.k();
        R0 r02 = new R0(i, k5.g());
        if (!(k5 instanceof Z.a)) {
            r02.f6243b = new R0(i, 1);
        }
        this.f4477l = r02;
    }

    @Override // Z.m
    public final U0 a() {
        return Z.f4434p;
    }

    @Override // Z.u
    public final Z.w c() {
        return this.f4477l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // Z.u
    public final void e(Z.w wVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord", wVar);
        this.f4477l = (R0) wVar;
    }

    @Override // Z.v, Z.u
    public final Z.w f(Z.w wVar, Z.w wVar2, Z.w wVar3) {
        if (((R0) wVar2).f4391c == ((R0) wVar3).f4391c) {
            return wVar2;
        }
        return null;
    }

    @Override // P.d1
    public final Object getValue() {
        return Integer.valueOf(h());
    }

    public final int h() {
        return ((R0) Z.l.u(this.f4477l, this)).f4391c;
    }

    public final void i(int i) {
        Z.f k5;
        R0 r02 = (R0) Z.l.i(this.f4477l);
        if (r02.f4391c != i) {
            R0 r03 = this.f4477l;
            synchronized (Z.l.f6208c) {
                k5 = Z.l.k();
                ((R0) Z.l.p(r03, this, k5, r02)).f4391c = i;
            }
            Z.l.o(k5, this);
        }
    }

    @Override // P.InterfaceC0289e0
    public final void setValue(Object obj) {
        i(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((R0) Z.l.i(this.f4477l)).f4391c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(h());
    }
}
