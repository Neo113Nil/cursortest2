package P;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: P.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301k0 extends Z.v implements Parcelable, InterfaceC0289e0, d1, Z.m {
    public static final Parcelable.Creator<C0301k0> CREATOR = new C0295h0(2);

    /* renamed from: l, reason: collision with root package name */
    public S0 f4479l;

    public C0301k0(long j5) {
        Z.f k5 = Z.l.k();
        S0 s02 = new S0(k5.g(), j5);
        if (!(k5 instanceof Z.a)) {
            s02.f6243b = new S0(1, j5);
        }
        this.f4479l = s02;
    }

    @Override // Z.m
    public final U0 a() {
        return Z.f4434p;
    }

    @Override // Z.u
    public final Z.w c() {
        return this.f4479l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // Z.u
    public final void e(Z.w wVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord", wVar);
        this.f4479l = (S0) wVar;
    }

    @Override // Z.v, Z.u
    public final Z.w f(Z.w wVar, Z.w wVar2, Z.w wVar3) {
        if (((S0) wVar2).f4395c == ((S0) wVar3).f4395c) {
            return wVar2;
        }
        return null;
    }

    @Override // P.d1
    public final Object getValue() {
        return Long.valueOf(((S0) Z.l.u(this.f4479l, this)).f4395c);
    }

    public final void h(long j5) {
        Z.f k5;
        S0 s02 = (S0) Z.l.i(this.f4479l);
        if (s02.f4395c != j5) {
            S0 s03 = this.f4479l;
            synchronized (Z.l.f6208c) {
                k5 = Z.l.k();
                ((S0) Z.l.p(s03, this, k5, s02)).f4395c = j5;
            }
            Z.l.o(k5, this);
        }
    }

    @Override // P.InterfaceC0289e0
    public final void setValue(Object obj) {
        h(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((S0) Z.l.i(this.f4479l)).f4395c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(((S0) Z.l.u(this.f4479l, this)).f4395c);
    }
}
