package p000;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class b62 implements Comparable {

    /* JADX INFO: renamed from: l */
    public static final AtomicReferenceFieldUpdater f742l = AtomicReferenceFieldUpdater.newUpdater(b62.class, Object.class, "k");

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ long f743m = c62.f1155a.objectFieldOffset(b62.class.getDeclaredField("k"));

    /* JADX INFO: renamed from: j */
    public final String f744j;

    /* JADX INFO: renamed from: k */
    public volatile Object f745k;

    public /* synthetic */ b62(String str, byte[] bArr) {
        this.f744j = str;
        this.f745k = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m597a(byte[] bArr) {
        byte[][] bArr2;
        b62 b62Var;
        int i = 0;
        while (true) {
            Object obj = this.f745k;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i >= length) {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (Arrays.equals(bArr, bArr3[i])) {
                        return;
                    } else {
                        i++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
            byte[][] bArr5 = bArr2;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f742l;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = c62.f1155a;
                long j = f743m;
                b62Var = this;
                if (unsafe.compareAndSwapObject(b62Var, j, obj, bArr5)) {
                    return;
                }
                if (unsafe.getObjectVolatile(b62Var, j) != obj) {
                    break;
                } else {
                    this = b62Var;
                }
            }
            this = b62Var;
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f744j.compareTo((String) obj);
    }
}
