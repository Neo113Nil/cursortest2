package Re0;

import Sc.o;
import android.content.Context;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.InterfaceC10545a;
import xe0.AbstractC10762a;

/* loaded from: classes3.dex */
public final class b extends AbstractC10762a<M6.c> {

    private final class a extends M6.b {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f25045a;

        public a(byte[] bArr) {
            this.f25045a = bArr;
        }

        @Override // M6.b
        public final ByteBuffer b() {
            byte[] bArr = this.f25045a;
            if (bArr != null) {
                return ByteBuffer.wrap(bArr);
            }
            return null;
        }
    }

    @NotNull
    public final M6.c c(@NotNull InterfaceC10545a animationSource) {
        Intrinsics.checkNotNullParameter(animationSource, "animationSource");
        if (animationSource instanceof InterfaceC10545a.C2257a) {
            Context b11 = b();
            ((InterfaceC10545a.C2257a) animationSource).getClass();
            return new M6.a(b11);
        }
        if (animationSource instanceof InterfaceC10545a.c) {
            ((InterfaceC10545a.c) animationSource).getClass();
            a();
            throw null;
        }
        if (animationSource instanceof InterfaceC10545a.d) {
            return new M6.d(b(), ((InterfaceC10545a.d) animationSource).f());
        }
        if (animationSource instanceof InterfaceC10545a.b) {
            return new a(((InterfaceC10545a.b) animationSource).d());
        }
        throw new o();
    }
}
