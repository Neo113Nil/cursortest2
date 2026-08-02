package w1;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class O2 {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f17483d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f17484e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f17485f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f17486g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f17487h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f17488i;

    /* renamed from: a, reason: collision with root package name */
    public short f17489a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17490b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f17491c;

    static {
        char[] cArr = {'F', 'C', 'B', 'M'};
        f17483d = cArr;
        f17484e = new String(cArr);
        f17485f = (cArr.length * 2) + 105987;
        int length = cArr.length * 2;
        f17486g = length;
        f17487h = length + 2;
        f17488i = length + 3;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        if (this.f17491c == null) {
            return arrayList;
        }
        if (this.f17490b) {
            for (int i7 = this.f17489a; i7 < 207; i7++) {
                arrayList.add(b(i7));
            }
        }
        for (int i8 = 0; i8 < this.f17489a; i8++) {
            arrayList.add(b(i8));
        }
        return arrayList;
    }

    public final N2 b(int i7) {
        int i8 = (i7 * 512) + f17488i;
        ByteBuffer byteBuffer = this.f17491c;
        byteBuffer.position(i8);
        long j = byteBuffer.getLong();
        String obj = byteBuffer.asCharBuffer().limit(byteBuffer.getInt()).toString();
        N2 n2 = new N2();
        n2.f17477a = obj;
        n2.f17478b = j;
        return n2;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        try {
            short s7 = this.f17491c == null ? (short) 0 : this.f17490b ? (short) 207 : this.f17489a;
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
