package f4;

import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f12978a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12979b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12980c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12981d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12982e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12983f;

    /* renamed from: g, reason: collision with root package name */
    public final FirebaseAuth f12984g;

    public w(String str, String str2, int i7, int i8, long j, String str3, FirebaseAuth firebaseAuth) {
        com.google.android.gms.common.internal.D.f(str3, "sessionInfo cannot be empty.");
        com.google.android.gms.common.internal.D.f(str, "sharedSecretKey cannot be empty. This is required to generate QR code URL.");
        this.f12978a = str;
        com.google.android.gms.common.internal.D.f(str2, "hashAlgorithm cannot be empty.");
        this.f12979b = str2;
        this.f12980c = i7;
        this.f12981d = i8;
        this.f12982e = j;
        this.f12983f = str3;
        this.f12984g = firebaseAuth;
    }

    public final String a(String str, String str2) {
        com.google.android.gms.common.internal.D.f(str, "accountName cannot be empty.");
        com.google.android.gms.common.internal.D.f(str2, "issuer cannot be empty.");
        return "otpauth://totp/" + str2 + ":" + str + "?secret=" + this.f12978a + "&issuer=" + str2 + "&algorithm=" + this.f12979b + "&digits=" + this.f12980c;
    }
}
