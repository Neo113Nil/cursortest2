package p155w1;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class O2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f17489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f17490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f17491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f17492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f17493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f17494i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short f17495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer f17497c;

    static {
        char[] cArr = {'F', 'C', 'B', 'M'};
        f17489d = cArr;
        f17490e = new String(cArr);
        f17491f = (cArr.length * 2) + 105987;
        int length = cArr.length * 2;
        f17492g = length;
        f17493h = length + 2;
        f17494i = length + 3;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        if (this.f17497c == null) {
            return arrayList;
        }
        if (this.f17496b) {
            for (int i7 = this.f17495a; i7 < 207; i7++) {
                arrayList.add(b(i7));
            }
        }
        for (int i8 = 0; i8 < this.f17495a; i8++) {
            arrayList.add(b(i8));
        }
        return arrayList;
    }

    public final N2 b(int i7) {
        int i8 = (i7 * 512) + f17494i;
        ByteBuffer byteBuffer = this.f17497c;
        byteBuffer.position(i8);
        long j = byteBuffer.getLong();
        String string = byteBuffer.asCharBuffer().limit(byteBuffer.getInt()).toString();
        N2 n2 = new N2();
        n2.f17483a = string;
        n2.f17484b = j;
        return n2;
    }

    public final synchronized String toString() {
        short s7;
        StringBuilder sb;
        try {
            if (this.f17497c == null) {
                s7 = 0;
            } else {
                s7 = this.f17496b ? (short) 207 : this.f17495a;
            }
            sb = new StringBuilder();
            sb.append("Total number of breadcrumbs: " + ((int) s7) + "\n");
            Iterator it = a().iterator();
            while (it.hasNext()) {
                sb.append(((N2) it.next()).toString());
            }
        } catch (Throwable th) {
            throw th;
        }
        return sb.toString();
    }
}
