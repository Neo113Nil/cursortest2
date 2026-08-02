package N3;

import j3.C7272n;
import j3.InterfaceC7268j;
import java.io.IOException;
import java.util.Arrays;
import m3.C8050C;

/* loaded from: classes.dex */
public interface M {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f18516a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f18517b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18518c;

        /* renamed from: d, reason: collision with root package name */
        public final int f18519d;

        public a(int i11, byte[] bArr, int i12, int i13) {
            this.f18516a = i11;
            this.f18517b = bArr;
            this.f18518c = i12;
            this.f18519d = i13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f18516a == aVar.f18516a && this.f18518c == aVar.f18518c && this.f18519d == aVar.f18519d && Arrays.equals(this.f18517b, aVar.f18517b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f18517b) + (this.f18516a * 31)) * 31) + this.f18518c) * 31) + this.f18519d;
        }
    }

    void a(C7272n c7272n);

    void b(long j11, int i11, int i12, int i13, a aVar);

    int c(InterfaceC7268j interfaceC7268j, int i11, boolean z11) throws IOException;

    default int d(InterfaceC7268j interfaceC7268j, int i11, boolean z11) throws IOException {
        return c(interfaceC7268j, i11, z11);
    }

    default void e(int i11, C8050C c8050c) {
        f(c8050c, i11, 0);
    }

    void f(C8050C c8050c, int i11, int i12);
}
