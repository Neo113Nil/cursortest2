package com.goldenboot.saga.zone;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class PaddingGenerator {
    public static final Bundle evictLayout(AlarmFacilitator... alarmFacilitatorArr) {
        Bundle bundle = new Bundle(alarmFacilitatorArr.length);
        for (AlarmFacilitator alarmFacilitator : alarmFacilitatorArr) {
            String str = (String) alarmFacilitator.evictLayout();
            Object growPayload = alarmFacilitator.growPayload();
            if (growPayload == null) {
                bundle.putString(str, null);
            } else if (growPayload instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) growPayload).booleanValue());
            } else if (growPayload instanceof Byte) {
                bundle.putByte(str, ((Number) growPayload).byteValue());
            } else if (growPayload instanceof Character) {
                bundle.putChar(str, ((Character) growPayload).charValue());
            } else if (growPayload instanceof Double) {
                bundle.putDouble(str, ((Number) growPayload).doubleValue());
            } else if (growPayload instanceof Float) {
                bundle.putFloat(str, ((Number) growPayload).floatValue());
            } else if (growPayload instanceof Integer) {
                bundle.putInt(str, ((Number) growPayload).intValue());
            } else if (growPayload instanceof Long) {
                bundle.putLong(str, ((Number) growPayload).longValue());
            } else if (growPayload instanceof Short) {
                bundle.putShort(str, ((Number) growPayload).shortValue());
            } else if (growPayload instanceof Bundle) {
                bundle.putBundle(str, (Bundle) growPayload);
            } else if (growPayload instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) growPayload);
            } else if (growPayload instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) growPayload);
            } else if (growPayload instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) growPayload);
            } else if (growPayload instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) growPayload);
            } else if (growPayload instanceof char[]) {
                bundle.putCharArray(str, (char[]) growPayload);
            } else if (growPayload instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) growPayload);
            } else if (growPayload instanceof float[]) {
                bundle.putFloatArray(str, (float[]) growPayload);
            } else if (growPayload instanceof int[]) {
                bundle.putIntArray(str, (int[]) growPayload);
            } else if (growPayload instanceof long[]) {
                bundle.putLongArray(str, (long[]) growPayload);
            } else if (growPayload instanceof short[]) {
                bundle.putShortArray(str, (short[]) growPayload);
            } else if (growPayload instanceof Object[]) {
                Class<?> componentType = growPayload.getClass().getComponentType();
                Intrinsics.checkNotNull(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Intrinsics.checkNotNull(growPayload, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(str, (Parcelable[]) growPayload);
                } else if (String.class.isAssignableFrom(componentType)) {
                    Intrinsics.checkNotNull(growPayload, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(str, (String[]) growPayload);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    Intrinsics.checkNotNull(growPayload, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(str, (CharSequence[]) growPayload);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) growPayload);
                }
            } else if (growPayload instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) growPayload);
            } else if (growPayload instanceof IBinder) {
                bundle.putBinder(str, (IBinder) growPayload);
            } else if (growPayload instanceof Size) {
                bundle.putSize(str, (Size) growPayload);
            } else {
                if (!(growPayload instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + growPayload.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) growPayload);
            }
        }
        return bundle;
    }
}
