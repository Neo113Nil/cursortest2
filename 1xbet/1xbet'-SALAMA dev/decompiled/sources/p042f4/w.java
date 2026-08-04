package p042f4;

import com.google.android.gms.common.internal.D;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f12989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FirebaseAuth f12990g;

    public w(String str, String str2, int i7, int i8, long j, String str3, FirebaseAuth firebaseAuth) {
        D.f(str3, "sessionInfo cannot be empty.");
        D.f(str, "sharedSecretKey cannot be empty. This is required to generate QR code URL.");
        this.f12984a = str;
        D.f(str2, "hashAlgorithm cannot be empty.");
        this.f12985b = str2;
        this.f12986c = i7;
        this.f12987d = i8;
        this.f12988e = j;
        this.f12989f = str3;
        this.f12990g = firebaseAuth;
    }

    public final String a(String str, String str2) {
        D.f(str, "accountName cannot be empty.");
        D.f(str2, "issuer cannot be empty.");
        return "otpauth://totp/" + str2 + ":" + str + "?secret=" + this.f12984a + "&issuer=" + str2 + "&algorithm=" + this.f12985b + "&digits=" + this.f12986c;
    }
}
