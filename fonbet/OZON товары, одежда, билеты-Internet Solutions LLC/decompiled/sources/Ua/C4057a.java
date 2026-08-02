package Ua;

import Sc.InterfaceC4008j;
import Sc.k;
import Wa.e;
import com.vk.knet.cornet.b;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.C7704k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Ua.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4057a {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j<C4057a> f27475c = k.b(C0555a.f27478b);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f27476a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C7704k<ByteBuffer> f27477b = new C7704k<>(10);

    /* renamed from: Ua.a$a, reason: collision with other inner class name */
    static final class C0555a extends AbstractC7737t implements Function0<C4057a> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0555a f27478b = new C0555a(0);

        @Override // kotlin.jvm.functions.Function0
        public final C4057a invoke() {
            return new C4057a();
        }
    }

    @NotNull
    public final ByteBuffer b() {
        C7704k<ByteBuffer> c7704k = this.f27477b;
        ReentrantLock reentrantLock = this.f27476a;
        reentrantLock.lock();
        try {
            b.a aVar = b.a.NATIVE_BUFFER;
            e.a(aVar, "obtain " + c7704k.getF26995b());
            ByteBuffer A11 = c7704k.A();
            if (A11 == null) {
                e.a(aVar, "createBuffer " + c7704k.getF26995b());
                A11 = ByteBuffer.allocateDirect(8192);
                Intrinsics.checkNotNullExpressionValue(A11, "allocateDirect(...)");
            }
            return A11;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c(@NotNull ByteBuffer buffer) {
        C7704k<ByteBuffer> c7704k = this.f27477b;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ReentrantLock reentrantLock = this.f27476a;
        reentrantLock.lock();
        try {
            buffer.clear();
            if (c7704k.getF26995b() < 10) {
                c7704k.addLast(buffer);
                e.a(b.a.NATIVE_BUFFER, "recycle " + c7704k.getF26995b());
            } else {
                e.a(b.a.NATIVE_BUFFER, "recycle buffer has max elements " + c7704k.getF26995b());
            }
            Unit unit = Unit.f71690a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
