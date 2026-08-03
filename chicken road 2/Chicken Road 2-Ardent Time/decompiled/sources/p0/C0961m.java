package p0;

/* renamed from: p0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0961m extends q0.AbstractC0980a {
    public static final android.os.Parcelable.Creator<p0.C0961m> CREATOR = new C.l(16);

    /* renamed from: a, reason: collision with root package name */
    public final int f8269a;

    /* renamed from: b, reason: collision with root package name */
    public final android.accounts.Account f8270b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8271c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount f8272d;

    public C0961m(int i2, android.accounts.Account account, int i3, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        this.f8269a = i2;
        this.f8270b = account;
        this.f8271c = i3;
        this.f8272d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int G = a.AbstractC0059a.G(parcel, 20293);
        a.AbstractC0059a.I(parcel, 1, 4);
        parcel.writeInt(this.f8269a);
        a.AbstractC0059a.C(parcel, 2, this.f8270b, i2);
        a.AbstractC0059a.I(parcel, 3, 4);
        parcel.writeInt(this.f8271c);
        a.AbstractC0059a.C(parcel, 4, this.f8272d, i2);
        a.AbstractC0059a.H(parcel, G);
    }
}
