package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0076l extends java.io.IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0076l(java.io.File file, java.io.File file2, java.lang.String str) {
        super(r3);
        kotlin.jvm.internal.i.e(file, "file");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
    }

    public C0076l(java.lang.IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
