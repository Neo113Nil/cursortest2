package R0;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o[] f5862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f5864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5865d;

    public n(String str, o[] oVarArr) {
        this.f5863b = str;
        this.f5864c = null;
        this.f5862a = oVarArr;
        this.f5865d = 0;
    }

    public final void a(int i7) {
        String str;
        int i8 = this.f5865d;
        if (i7 == i8) {
            return;
        }
        StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        String str2 = "String";
        if (i8 != 0) {
            str = i8 != 1 ? "Unknown" : "ArrayBuffer";
        } else {
            str = "String";
        }
        sb.append(str);
        sb.append(" expected, but got ");
        if (i7 != 0) {
            str2 = i7 != 1 ? "Unknown" : "ArrayBuffer";
        }
        sb.append(str2);
        throw new IllegalStateException(sb.toString());
    }

    public n(byte[] bArr, o[] oVarArr) {
        Objects.requireNonNull(bArr);
        this.f5864c = bArr;
        this.f5863b = null;
        this.f5862a = oVarArr;
        this.f5865d = 1;
    }
}
