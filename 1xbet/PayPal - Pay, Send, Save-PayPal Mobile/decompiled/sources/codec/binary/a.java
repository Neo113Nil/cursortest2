package codec.binary;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f2768a;
    public long b;
    public byte[] c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public int h;

    public final java.lang.String toString() {
        java.lang.String arrays = java.util.Arrays.toString(this.c);
        int i = this.g;
        boolean z = this.f;
        int i2 = this.f2768a;
        long j = this.b;
        int i3 = this.h;
        int i4 = this.d;
        int i5 = this.e;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("a[buffer=");
        sb.append(arrays);
        sb.append(", currentLinePos=");
        sb.append(i);
        sb.append(", eof=");
        sb.append(z);
        sb.append(", ibitWorkArea=");
        sb.append(i2);
        sb.append(", lbitWorkArea=");
        sb.append(j);
        sb.append(", modulus=");
        sb.append(i3);
        sb.append(", pos=");
        sb.append(i4);
        sb.append(", readPos=");
        sb.append(i5);
        sb.append("]");
        return sb.toString();
    }
}
