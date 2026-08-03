package com.vungle.ads.internal.util;

/* compiled from: SafeObjectInputStream.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\nH\u0014R\u001a\u0010\u0004\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/util/SafeObjectInputStream;", "Ljava/io/ObjectInputStream;", com.unity3d.services.ads.gmascar.utils.ScarConstants.IN_SIGNAL_KEY, "Ljava/io/InputStream;", "allowed", "", "Ljava/lang/Class;", "(Ljava/io/InputStream;Ljava/util/List;)V", "resolveClass", "desc", "Ljava/io/ObjectStreamClass;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class SafeObjectInputStream extends java.io.ObjectInputStream {
    private final java.util.List<java.lang.Class<?>> allowed;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeObjectInputStream(java.io.InputStream inputStream, java.util.List<? extends java.lang.Class<?>> list) {
        super(inputStream);
        this.allowed = list;
    }

    @Override // java.io.ObjectInputStream
    protected java.lang.Class<?> resolveClass(java.io.ObjectStreamClass desc) throws java.lang.ClassNotFoundException, java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(desc, "desc");
        java.lang.Class<?> c = super.resolveClass(desc);
        if (this.allowed == null || java.lang.Number.class.isAssignableFrom(c) || kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, c) || kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Boolean.class, c) || c.isArray() || this.allowed.contains(c)) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c, "c");
            return c;
        }
        throw new java.io.IOException("Deserialization is not allowed for " + desc.getName());
    }
}
