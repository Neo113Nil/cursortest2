package T4;

import Y3.i;
import android.net.Uri;
import w1.C1726n0;

/* loaded from: classes2.dex */
public final class e extends d {

    /* renamed from: m, reason: collision with root package name */
    public final Uri f6362m;

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f6363n;

    /* renamed from: o, reason: collision with root package name */
    public final int f6364o;

    public e(C1726n0 c1726n0, i iVar, Uri uri, byte[] bArr, long j, int i7, boolean z4) {
        super(c1726n0, iVar);
        if (j < 0) {
            this.f6353a = new IllegalArgumentException("offset cannot be negative");
        }
        this.f6364o = i7;
        this.f6362m = uri;
        this.f6363n = i7 <= 0 ? null : bArr;
        q("X-Goog-Upload-Protocol", "resumable");
        if (z4 && i7 > 0) {
            q("X-Goog-Upload-Command", "upload, finalize");
        } else if (z4) {
            q("X-Goog-Upload-Command", "finalize");
        } else {
            q("X-Goog-Upload-Command", "upload");
        }
        q("X-Goog-Upload-Offset", Long.toString(j));
    }

    @Override // T4.c
    public final String d() {
        return "POST";
    }

    @Override // T4.c
    public final byte[] f() {
        return this.f6363n;
    }

    @Override // T4.c
    public final int g() {
        int i7 = this.f6364o;
        if (i7 > 0) {
            return i7;
        }
        return 0;
    }

    @Override // T4.c
    public final Uri k() {
        return this.f6362m;
    }
}
