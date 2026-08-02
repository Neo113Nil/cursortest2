package androidx.constraintlayout.motion.utils;

/* loaded from: classes7.dex */
public class CustomSupport {
    public static void setInterpolatedValue(androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute, android.view.View view, float[] fArr) {
        java.lang.Class<?> cls = view.getClass();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("set");
        sb.append(constraintAttribute.getName());
        java.lang.String obj = sb.toString();
        try {
            switch (androidx.constraintlayout.motion.utils.CustomSupport.AnonymousClass1.getHighSpeedVideoFpsRangesFor[constraintAttribute.getType().ordinal()]) {
                case 1:
                    cls.getMethod(obj, java.lang.Integer.TYPE).invoke(view, java.lang.Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(obj, java.lang.Float.TYPE).invoke(view, java.lang.Float.valueOf(fArr[0]));
                    return;
                case 3:
                    java.lang.reflect.Method method = cls.getMethod(obj, android.graphics.drawable.Drawable.class);
                    int pow = (int) (((float) java.lang.Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f);
                    int i = (pow & (~(pow >> 31))) - 255;
                    int pow2 = (int) (((float) java.lang.Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f);
                    int i2 = (pow2 & (~(pow2 >> 31))) - 255;
                    int pow3 = (int) (((float) java.lang.Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f);
                    int i3 = (pow3 & (~(pow3 >> 31))) - 255;
                    int i4 = (int) (fArr[3] * 255.0f);
                    int i5 = (i4 & (~(i4 >> 31))) - 255;
                    android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable();
                    colorDrawable.setColor((((i5 & (i5 >> 31)) + 255) << 24) | (((i & (i >> 31)) + 255) << 16) | (((i2 & (i2 >> 31)) + 255) << 8) | ((i3 & (i3 >> 31)) + 255));
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    java.lang.reflect.Method method2 = cls.getMethod(obj, java.lang.Integer.TYPE);
                    int pow4 = (int) (((float) java.lang.Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f);
                    int i6 = (pow4 & (~(pow4 >> 31))) - 255;
                    int pow5 = (int) (((float) java.lang.Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f);
                    int i7 = (pow5 & (~(pow5 >> 31))) - 255;
                    int pow6 = (int) (((float) java.lang.Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f);
                    int i8 = (pow6 & (~(pow6 >> 31))) - 255;
                    int i9 = (int) (fArr[3] * 255.0f);
                    int i10 = (i9 & (~(i9 >> 31))) - 255;
                    method2.invoke(view, java.lang.Integer.valueOf((((i10 & (i10 >> 31)) + 255) << 24) | (((i6 & (i6 >> 31)) + 255) << 16) | (((i7 & (i7 >> 31)) + 255) << 8) | ((i8 & (i8 >> 31)) + 255)));
                    return;
                case 5:
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unable to interpolate strings ");
                    sb2.append(constraintAttribute.getName());
                    throw new java.lang.RuntimeException(sb2.toString());
                case 6:
                    cls.getMethod(obj, java.lang.Boolean.TYPE).invoke(view, java.lang.Boolean.valueOf(fArr[0] > 0.5f));
                    return;
                case 7:
                    cls.getMethod(obj, java.lang.Float.TYPE).invoke(view, java.lang.Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (java.lang.IllegalAccessException unused) {
            androidx.constraintlayout.motion.widget.Debug.getName(view);
        } catch (java.lang.NoSuchMethodException unused2) {
            androidx.constraintlayout.motion.widget.Debug.getName(view);
        } catch (java.lang.reflect.InvocationTargetException unused3) {
            androidx.constraintlayout.motion.widget.Debug.getName(view);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.CustomSupport$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }
}
