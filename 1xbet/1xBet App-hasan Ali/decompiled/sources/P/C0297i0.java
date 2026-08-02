package P;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: P.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297i0 extends Z.v implements Parcelable, Z.m, InterfaceC0289e0, d1 {
    public static final Parcelable.Creator<C0297i0> CREATOR = new C0295h0(0);

    /* renamed from: l, reason: collision with root package name */
    public Q0 f4476l;

    public C0297i0(float f) {
        Z.f k5 = Z.l.k();
        Q0 q02 = new Q0(f, k5.g());
        if (!(k5 instanceof Z.a)) {
            q02.f6243b = new Q0(f, 1);
        }
        this.f4476l = q02;
    }

    @Override // Z.m
    public final U0 a() {
        return Z.f4434p;
    }

    @Override // Z.u
    public final Z.w c() {
        return this.f4476l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // Z.u
    public final void e(Z.w wVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord", wVar);
        this.f4476l = (Q0) wVar;
    }

    @Override // Z.v, Z.u
    public final Z.w f(Z.w wVar, Z.w wVar2, Z.w wVar3) {
        if (((Q0) wVar2).f4390c == ((Q0) wVar3).f4390c) {
            return wVar2;
        }
        return null;
    }

    @Override // P.d1
    public final Object getValue() {
        return Float.valueOf(h());
    }

    public final float h() {
        return ((Q0) Z.l.u(this.f4476l, this)).f4390c;
    }

    public final void i(float f) {
        Z.f k5;
        Q0 q02 = (Q0) Z.l.i(this.f4476l);
        if (q02.f4390c == f) {
            return;
        }
        Q0 q03 = this.f4476l;
        synchronized (Z.l.f6208c) {
            k5 = Z.l.k();
            ((Q0) Z.l.p(q03, this, k5, q02)).f4390c = f;
        }
        Z.l.o(k5, this);
    }

    @Override // P.InterfaceC0289e0
    public final void setValue(Object obj) {
        i(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((Q0) Z.l.i(this.f4476l)).f4390c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(h());
    }
}
