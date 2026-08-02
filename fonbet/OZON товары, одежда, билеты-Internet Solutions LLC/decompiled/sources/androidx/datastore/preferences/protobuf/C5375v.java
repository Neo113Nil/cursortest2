package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC5376w;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5375v implements P {

    /* renamed from: a, reason: collision with root package name */
    private static final C5375v f42623a = new C5375v();

    public static C5375v a() {
        return f42623a;
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final boolean isSupported(Class<?> cls) {
        return AbstractC5376w.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final O messageInfoFor(Class<?> cls) {
        if (!AbstractC5376w.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (O) AbstractC5376w.k(cls.asSubclass(AbstractC5376w.class)).i(AbstractC5376w.f.BUILD_MESSAGE_INFO);
        } catch (Exception e11) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e11);
        }
    }
}
