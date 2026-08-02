package net.idrnd.misnap.iad;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lnet/idrnd/misnap/iad/Payload;", "", "", "content", "<init>", "([B)V", "a", "[B", "getContent", "()[B"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public final class Payload {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final byte[] content;

    public Payload(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.content = bArr;
    }

    public final byte[] getContent() {
        return this.content;
    }
}
