package io.ktor.utils.io;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* synthetic */ class CloseToken$wrapCause$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Throwable, io.ktor.utils.io.ClosedByteChannelException> {
    public static final io.ktor.utils.io.CloseToken$wrapCause$1 Camera2StreamConfigurationMap = new io.ktor.utils.io.CloseToken$wrapCause$1();

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public final io.ktor.utils.io.ClosedByteChannelException invoke(java.lang.Throwable th) {
        return new io.ktor.utils.io.ClosedByteChannelException(th);
    }

    CloseToken$wrapCause$1() {
        super(1, io.ktor.utils.io.ClosedByteChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
    }
}
