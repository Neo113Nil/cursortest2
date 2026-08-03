package io.ktor.util;

/* compiled from: CryptoJvm.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006#"}, d2 = {"Lio/ktor/util/DigestImpl;", "Lio/ktor/util/Digest;", "Ljava/security/MessageDigest;", "delegate", "constructor-impl", "(Ljava/security/MessageDigest;)Ljava/security/MessageDigest;", "", "bytes", "", "plusAssign-impl", "(Ljava/security/MessageDigest;[B)V", "plusAssign", "reset-impl", "(Ljava/security/MessageDigest;)V", "reset", "build-impl", "(Ljava/security/MessageDigest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "build", "", "other", "", "equals-impl", "(Ljava/security/MessageDigest;Ljava/lang/Object;)Z", "equals", "", "hashCode-impl", "(Ljava/security/MessageDigest;)I", "hashCode", "", "toString-impl", "(Ljava/security/MessageDigest;)Ljava/lang/String;", "toString", "Ljava/security/MessageDigest;", "getDelegate", "()Ljava/security/MessageDigest;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
final class DigestImpl implements io.ktor.util.Digest {
    private final java.security.MessageDigest delegate;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ io.ktor.util.DigestImpl m10743boximpl(java.security.MessageDigest messageDigest) {
        return new io.ktor.util.DigestImpl(messageDigest);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static java.security.MessageDigest m10745constructorimpl(java.security.MessageDigest delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
        return delegate;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10746equalsimpl(java.security.MessageDigest messageDigest, java.lang.Object obj) {
        return (obj instanceof io.ktor.util.DigestImpl) && kotlin.jvm.internal.Intrinsics.areEqual(messageDigest, ((io.ktor.util.DigestImpl) obj).m10752unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10747equalsimpl0(java.security.MessageDigest messageDigest, java.security.MessageDigest messageDigest2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(messageDigest, messageDigest2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10748hashCodeimpl(java.security.MessageDigest messageDigest) {
        return messageDigest.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m10751toStringimpl(java.security.MessageDigest messageDigest) {
        return "DigestImpl(delegate=" + messageDigest + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return m10746equalsimpl(this.delegate, obj);
    }

    public int hashCode() {
        return m10748hashCodeimpl(this.delegate);
    }

    public java.lang.String toString() {
        return m10751toStringimpl(this.delegate);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.security.MessageDigest m10752unboximpl() {
        return this.delegate;
    }

    private /* synthetic */ DigestImpl(java.security.MessageDigest messageDigest) {
        this.delegate = messageDigest;
    }

    public final java.security.MessageDigest getDelegate() {
        return this.delegate;
    }

    @Override // io.ktor.util.Digest
    public void plusAssign(byte[] bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        m10749plusAssignimpl(this.delegate, bytes);
    }

    /* renamed from: plusAssign-impl, reason: not valid java name */
    public static void m10749plusAssignimpl(java.security.MessageDigest messageDigest, byte[] bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        messageDigest.update(bytes);
    }

    @Override // io.ktor.util.Digest
    public void reset() {
        m10750resetimpl(this.delegate);
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static void m10750resetimpl(java.security.MessageDigest messageDigest) {
        messageDigest.reset();
    }

    /* renamed from: build-impl, reason: not valid java name */
    public static java.lang.Object m10744buildimpl(java.security.MessageDigest messageDigest, kotlin.coroutines.Continuation<? super byte[]> continuation) {
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        return digest;
    }

    @Override // io.ktor.util.Digest
    public java.lang.Object build(kotlin.coroutines.Continuation<? super byte[]> continuation) {
        return m10744buildimpl(this.delegate, continuation);
    }
}
