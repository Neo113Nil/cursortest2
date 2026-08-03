package io.ktor.utils.io;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CloseToken.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public /* synthetic */ class CloseToken$wrapCause$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Throwable, io.ktor.utils.io.ClosedByteChannelException> {
    public static final io.ktor.utils.io.CloseToken$wrapCause$1 INSTANCE = new io.ktor.utils.io.CloseToken$wrapCause$1();

    CloseToken$wrapCause$1() {
        super(1, io.ktor.utils.io.ClosedByteChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final io.ktor.utils.io.ClosedByteChannelException invoke(java.lang.Throwable th) {
        return new io.ktor.utils.io.ClosedByteChannelException(th);
    }
}
