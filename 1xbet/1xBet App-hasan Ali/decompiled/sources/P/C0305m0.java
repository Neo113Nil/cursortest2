package P;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: P.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305m0 extends Z.v implements Parcelable, Z.m {
    public static final Parcelable.Creator<C0305m0> CREATOR = new C0303l0();

    /* renamed from: l, reason: collision with root package name */
    public final U0 f4485l;

    /* renamed from: m, reason: collision with root package name */
    public T0 f4486m;

    public C0305m0(Object obj, U0 u02) {
        this.f4485l = u02;
        Z.f k5 = Z.l.k();
        T0 t02 = new T0(k5.g(), obj);
        if (!(k5 instanceof Z.a)) {
            t02.f6243b = new T0(1, obj);
        }
        this.f4486m = t02;
    }

    @Override // Z.m
    public final U0 a() {
        return this.f4485l;
    }

    @Override // Z.u
    public final Z.w c() {
        return this.f4486m;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // Z.u
    public final void e(Z.w wVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>", wVar);
        this.f4486m = (T0) wVar;
    }

    @Override // Z.v, Z.u
    public final Z.w f(Z.w wVar, Z.w wVar2, Z.w wVar3) {
        if (this.f4485l.a(((T0) wVar2).f4401c, ((T0) wVar3).f4401c)) {
            return wVar2;
        }
        return null;
    }

    @Override // P.d1
    public final Object getValue() {
        return ((T0) Z.l.u(this.f4486m, this)).f4401c;
    }

    @Override // P.InterfaceC0289e0
    public final void setValue(Object obj) {
        Z.f k5;
        T0 t02 = (T0) Z.l.i(this.f4486m);
        if (this.f4485l.a(t02.f4401c, obj)) {
            return;
        }
        T0 t03 = this.f4486m;
        synchronized (Z.l.f6208c) {
            k5 = Z.l.k();
            ((T0) Z.l.p(t03, this, k5, t02)).f4401c = obj;
        }
        Z.l.o(k5, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((T0) Z.l.i(this.f4486m)).f4401c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i5;
        parcel.writeValue(getValue());
        Z z3 = Z.f4431m;
        U0 u02 = this.f4485l;
        if (kotlin.jvm.internal.l.a(u02, z3)) {
            i5 = 0;
        } else if (kotlin.jvm.internal.l.a(u02, Z.f4434p)) {
            i5 = 1;
        } else {
            if (!kotlin.jvm.internal.l.a(u02, Z.f4432n)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i5 = 2;
        }
        parcel.writeInt(i5);
    }
}
