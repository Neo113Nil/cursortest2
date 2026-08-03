package io.ktor.utils.io;

/* compiled from: ByteChannel.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class ByteChannel$readBuffer$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Throwable, io.ktor.utils.io.ClosedReadChannelException> {
    public static final io.ktor.utils.io.ByteChannel$readBuffer$1 INSTANCE = new io.ktor.utils.io.ByteChannel$readBuffer$1();

    ByteChannel$readBuffer$1() {
        super(1, io.ktor.utils.io.ClosedReadChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final io.ktor.utils.io.ClosedReadChannelException invoke(java.lang.Throwable th) {
        return new io.ktor.utils.io.ClosedReadChannelException(th);
    }
}
