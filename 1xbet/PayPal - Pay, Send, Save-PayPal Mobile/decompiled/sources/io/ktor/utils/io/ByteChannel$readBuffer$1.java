package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ByteChannel$readBuffer$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Throwable, io.ktor.utils.io.ClosedReadChannelException> {
    public static final io.ktor.utils.io.ByteChannel$readBuffer$1 Camera2StreamConfigurationMap = new io.ktor.utils.io.ByteChannel$readBuffer$1();

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public final io.ktor.utils.io.ClosedReadChannelException invoke(java.lang.Throwable th) {
        return new io.ktor.utils.io.ClosedReadChannelException(th);
    }

    ByteChannel$readBuffer$1() {
        super(1, io.ktor.utils.io.ClosedReadChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
    }
}
