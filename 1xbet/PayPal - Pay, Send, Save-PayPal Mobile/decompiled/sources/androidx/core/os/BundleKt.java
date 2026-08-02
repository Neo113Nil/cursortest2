package androidx.core.os;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\b"}, d2 = {"", "Lkotlin/Pair;", "", "", "pairs", "Landroid/os/Bundle;", "bundleOf", "([Lkotlin/Pair;)Landroid/os/Bundle;", "()Landroid/os/Bundle;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BundleKt {
    @kotlin.Deprecated(message = "This method does not provide type safety at compile time. Use the platform `Bundle` class directly instead.")
    public static final android.os.Bundle bundleOf(kotlin.Pair<java.lang.String, ? extends java.lang.Object>... pairArr) {
        android.os.Bundle bundle = new android.os.Bundle(pairArr.length);
        for (kotlin.Pair<java.lang.String, ? extends java.lang.Object> pair : pairArr) {
            java.lang.String component1 = pair.component1();
            java.lang.Object component2 = pair.component2();
            if (component2 == null) {
                bundle.putString(component1, null);
            } else if (component2 instanceof java.lang.Boolean) {
                bundle.putBoolean(component1, ((java.lang.Boolean) component2).booleanValue());
            } else if (component2 instanceof java.lang.Byte) {
                bundle.putByte(component1, ((java.lang.Number) component2).byteValue());
            } else if (component2 instanceof java.lang.Character) {
                bundle.putChar(component1, ((java.lang.Character) component2).charValue());
            } else if (component2 instanceof java.lang.Double) {
                bundle.putDouble(component1, ((java.lang.Number) component2).doubleValue());
            } else if (component2 instanceof java.lang.Float) {
                bundle.putFloat(component1, ((java.lang.Number) component2).floatValue());
            } else if (component2 instanceof java.lang.Integer) {
                bundle.putInt(component1, ((java.lang.Number) component2).intValue());
            } else if (component2 instanceof java.lang.Long) {
                bundle.putLong(component1, ((java.lang.Number) component2).longValue());
            } else if (component2 instanceof java.lang.Short) {
                bundle.putShort(component1, ((java.lang.Number) component2).shortValue());
            } else if (component2 instanceof android.os.Bundle) {
                bundle.putBundle(component1, (android.os.Bundle) component2);
            } else if (component2 instanceof java.lang.CharSequence) {
                bundle.putCharSequence(component1, (java.lang.CharSequence) component2);
            } else if (component2 instanceof android.os.Parcelable) {
                bundle.putParcelable(component1, (android.os.Parcelable) component2);
            } else if (component2 instanceof boolean[]) {
                bundle.putBooleanArray(component1, (boolean[]) component2);
            } else if (component2 instanceof byte[]) {
                bundle.putByteArray(component1, (byte[]) component2);
            } else if (component2 instanceof char[]) {
                bundle.putCharArray(component1, (char[]) component2);
            } else if (component2 instanceof double[]) {
                bundle.putDoubleArray(component1, (double[]) component2);
            } else if (component2 instanceof float[]) {
                bundle.putFloatArray(component1, (float[]) component2);
            } else if (component2 instanceof int[]) {
                bundle.putIntArray(component1, (int[]) component2);
            } else if (component2 instanceof long[]) {
                bundle.putLongArray(component1, (long[]) component2);
            } else if (component2 instanceof short[]) {
                bundle.putShortArray(component1, (short[]) component2);
            } else if (component2 instanceof java.lang.Object[]) {
                java.lang.Class<?> componentType = component2.getClass().getComponentType();
                kotlin.jvm.internal.Intrinsics.checkNotNull(componentType);
                if (android.os.Parcelable.class.isAssignableFrom(componentType)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(component2, "");
                    bundle.putParcelableArray(component1, (android.os.Parcelable[]) component2);
                } else if (java.lang.String.class.isAssignableFrom(componentType)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(component2, "");
                    bundle.putStringArray(component1, (java.lang.String[]) component2);
                } else if (java.lang.CharSequence.class.isAssignableFrom(componentType)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(component2, "");
                    bundle.putCharSequenceArray(component1, (java.lang.CharSequence[]) component2);
                } else if (java.io.Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(component1, (java.io.Serializable) component2);
                } else {
                    java.lang.String canonicalName = componentType.getCanonicalName();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Illegal value array type ");
                    sb.append(canonicalName);
                    sb.append(" for key \"");
                    sb.append(component1);
                    sb.append('\"');
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
            } else if (component2 instanceof java.io.Serializable) {
                bundle.putSerializable(component1, (java.io.Serializable) component2);
            } else if (component2 instanceof android.os.IBinder) {
                bundle.putBinder(component1, (android.os.IBinder) component2);
            } else if (component2 instanceof android.util.Size) {
                bundle.putSize(component1, (android.util.Size) component2);
            } else if (component2 instanceof android.util.SizeF) {
                bundle.putSizeF(component1, (android.util.SizeF) component2);
            } else {
                java.lang.String canonicalName2 = component2.getClass().getCanonicalName();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Illegal value type ");
                sb2.append(canonicalName2);
                sb2.append(" for key \"");
                sb2.append(component1);
                sb2.append('\"');
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
        }
        return bundle;
    }

    public static final android.os.Bundle bundleOf() {
        return new android.os.Bundle(0);
    }
}
