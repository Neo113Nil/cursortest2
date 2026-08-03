package androidx.core.os;

/* compiled from: PersistableBundle.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\r"}, d2 = {"Landroidx/core/os/PersistableBundleApi21ImplKt;", "", "()V", "createPersistableBundle", "Landroid/os/PersistableBundle;", "capacity", "", "putValue", "", "persistableBundle", com.ironsource.X3.i.W, "", "value", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PersistableBundleApi21ImplKt {
    public static final androidx.core.os.PersistableBundleApi21ImplKt INSTANCE = new androidx.core.os.PersistableBundleApi21ImplKt();

    private PersistableBundleApi21ImplKt() {
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.PersistableBundle createPersistableBundle(int capacity) {
        return new android.os.PersistableBundle(capacity);
    }

    @kotlin.jvm.JvmStatic
    public static final void putValue(android.os.PersistableBundle persistableBundle, java.lang.String key, java.lang.Object value) {
        if (value == null) {
            persistableBundle.putString(key, null);
            return;
        }
        if (value instanceof java.lang.Boolean) {
            if (android.os.Build.VERSION.SDK_INT >= 22) {
                androidx.core.os.PersistableBundleApi22ImplKt.putBoolean(persistableBundle, key, ((java.lang.Boolean) value).booleanValue());
                return;
            }
            throw new java.lang.IllegalArgumentException("Illegal value type boolean for key \"" + key + '\"');
        }
        if (value instanceof java.lang.Double) {
            persistableBundle.putDouble(key, ((java.lang.Number) value).doubleValue());
            return;
        }
        if (value instanceof java.lang.Integer) {
            persistableBundle.putInt(key, ((java.lang.Number) value).intValue());
            return;
        }
        if (value instanceof java.lang.Long) {
            persistableBundle.putLong(key, ((java.lang.Number) value).longValue());
            return;
        }
        if (value instanceof java.lang.String) {
            persistableBundle.putString(key, (java.lang.String) value);
            return;
        }
        if (value instanceof boolean[]) {
            if (android.os.Build.VERSION.SDK_INT >= 22) {
                androidx.core.os.PersistableBundleApi22ImplKt.putBooleanArray(persistableBundle, key, (boolean[]) value);
                return;
            }
            throw new java.lang.IllegalArgumentException("Illegal value type boolean[] for key \"" + key + '\"');
        }
        if (value instanceof double[]) {
            persistableBundle.putDoubleArray(key, (double[]) value);
            return;
        }
        if (value instanceof int[]) {
            persistableBundle.putIntArray(key, (int[]) value);
            return;
        }
        if (value instanceof long[]) {
            persistableBundle.putLongArray(key, (long[]) value);
            return;
        }
        if (value instanceof java.lang.Object[]) {
            java.lang.Class<?> componentType = value.getClass().getComponentType();
            kotlin.jvm.internal.Intrinsics.checkNotNull(componentType);
            if (java.lang.String.class.isAssignableFrom(componentType)) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                persistableBundle.putStringArray(key, (java.lang.String[]) value);
                return;
            }
            throw new java.lang.IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + key + '\"');
        }
        throw new java.lang.IllegalArgumentException("Illegal value type " + value.getClass().getCanonicalName() + " for key \"" + key + '\"');
    }
}
