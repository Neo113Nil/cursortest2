package Y3;

import j3.C7272n;
import j3.t;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class a implements t.a {

    /* renamed from: g, reason: collision with root package name */
    private static final C7272n f34558g;

    /* renamed from: h, reason: collision with root package name */
    private static final C7272n f34559h;

    /* renamed from: a, reason: collision with root package name */
    public final String f34560a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34561b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34562c;

    /* renamed from: d, reason: collision with root package name */
    public final long f34563d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f34564e;

    /* renamed from: f, reason: collision with root package name */
    private int f34565f;

    static {
        C7272n.a aVar = new C7272n.a();
        aVar.y0("application/id3");
        f34558g = aVar.P();
        C7272n.a aVar2 = new C7272n.a();
        aVar2.y0("application/x-scte35");
        f34559h = aVar2.P();
    }

    public a(String str, String str2, long j11, long j12, byte[] bArr) {
        this.f34560a = str;
        this.f34561b = str2;
        this.f34562c = j11;
        this.f34563d = j12;
        this.f34564e = bArr;
    }

    @Override // j3.t.a
    public final byte[] b() {
        if (c() != null) {
            return this.f34564e;
        }
        return null;
    }

    @Override // j3.t.a
    public final C7272n c() {
        String str = this.f34560a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f34559h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f34558g;
            default:
                return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f34562c == aVar.f34562c && this.f34563d == aVar.f34563d && Objects.equals(this.f34560a, aVar.f34560a) && Objects.equals(this.f34561b, aVar.f34561b) && Arrays.equals(this.f34564e, aVar.f34564e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f34565f == 0) {
            String str = this.f34560a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f34561b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j11 = this.f34562c;
            int i11 = (hashCode2 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f34563d;
            this.f34565f = Arrays.hashCode(this.f34564e) + ((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31);
        }
        return this.f34565f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f34560a + ", id=" + this.f34563d + ", durationMs=" + this.f34562c + ", value=" + this.f34561b;
    }
}
