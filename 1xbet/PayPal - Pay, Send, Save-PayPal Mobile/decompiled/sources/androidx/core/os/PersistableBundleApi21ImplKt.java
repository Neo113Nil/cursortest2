package androidx.core.os;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/core/os/PersistableBundleApi21ImplKt;", "", "<init>", "()V", "Landroid/os/PersistableBundle;", "p0", "", "p1", "p2", "", "getHighSpeedVideoSizes", "(Landroid/os/PersistableBundle;Ljava/lang/String;Ljava/lang/Object;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class PersistableBundleApi21ImplKt {
    public static final androidx.core.os.PersistableBundleApi21ImplKt INSTANCE = new androidx.core.os.PersistableBundleApi21ImplKt();

    private PersistableBundleApi21ImplKt() {
    }

    @kotlin.jvm.JvmStatic
    public static final void getHighSpeedVideoSizes(android.os.PersistableBundle p0, java.lang.String p1, java.lang.Object p2) {
        if (p2 == null) {
            p0.putString(p1, null);
            return;
        }
        if (p2 instanceof java.lang.Boolean) {
            p0.putBoolean(p1, ((java.lang.Boolean) p2).booleanValue());
            return;
        }
        if (p2 instanceof java.lang.Double) {
            p0.putDouble(p1, ((java.lang.Number) p2).doubleValue());
            return;
        }
        if (p2 instanceof java.lang.Integer) {
            p0.putInt(p1, ((java.lang.Number) p2).intValue());
            return;
        }
        if (p2 instanceof java.lang.Long) {
            p0.putLong(p1, ((java.lang.Number) p2).longValue());
            return;
        }
        if (p2 instanceof java.lang.String) {
            p0.putString(p1, (java.lang.String) p2);
            return;
        }
        if (p2 instanceof android.os.PersistableBundle) {
            p0.putPersistableBundle(p1, (android.os.PersistableBundle) p2);
            return;
        }
        if (p2 instanceof boolean[]) {
            p0.putBooleanArray(p1, (boolean[]) p2);
            return;
        }
        if (p2 instanceof double[]) {
            p0.putDoubleArray(p1, (double[]) p2);
            return;
        }
        if (p2 instanceof int[]) {
            p0.putIntArray(p1, (int[]) p2);
            return;
        }
        if (p2 instanceof long[]) {
            p0.putLongArray(p1, (long[]) p2);
            return;
        }
        if (p2 instanceof java.lang.Object[]) {
            java.lang.Class<?> componentType = p2.getClass().getComponentType();
            kotlin.jvm.internal.Intrinsics.checkNotNull(componentType);
            if (java.lang.String.class.isAssignableFrom(componentType)) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(p2, "");
                p0.putStringArray(p1, (java.lang.String[]) p2);
                return;
            }
            java.lang.String canonicalName = componentType.getCanonicalName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported value array type ");
            sb.append(canonicalName);
            sb.append(" for key \"");
            sb.append(p1);
            sb.append('\"');
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.lang.String canonicalName2 = p2.getClass().getCanonicalName();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unsupported value type ");
        sb2.append(canonicalName2);
        sb2.append(" for key \"");
        sb2.append(p1);
        sb2.append('\"');
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }
}
