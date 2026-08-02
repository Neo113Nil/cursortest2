package C1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: C1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0106l {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f1502a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    C0104j b(C0104j c0104j);

    void c(ByteBuffer byteBuffer);

    void d();

    boolean e();

    void flush();

    boolean isActive();

    void reset();
}
