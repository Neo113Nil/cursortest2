package P0;

/* renamed from: P0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044b {

    /* renamed from: f, reason: collision with root package name */
    public static final android.graphics.Matrix f1330f = new android.graphics.Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.h f1331a;

    /* renamed from: b, reason: collision with root package name */
    public final x0.e f1332b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1333c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f1334d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f1335e;

    public C0044b(io.flutter.embedding.engine.renderer.h hVar, boolean z2) {
        this.f1331a = hVar;
        if (x0.e.f8406e == null) {
            x0.e.f8406e = new x0.e(8);
        }
        this.f1332b = x0.e.f8406e;
        this.f1333c = z2;
    }

    public static int b(int i2) {
        if (i2 == 0) {
            return 4;
        }
        if (i2 == 1) {
            return 6;
        }
        if (i2 == 5) {
            return 4;
        }
        if (i2 == 6) {
            return 6;
        }
        if (i2 == 2) {
            return 5;
        }
        if (i2 == 7) {
            return 3;
        }
        if (i2 == 3) {
            return 0;
        }
        return i2 == 8 ? 3 : -1;
    }

    public final void a(android.view.MotionEvent motionEvent, int i2, int i3, int i4, android.graphics.Matrix matrix, java.nio.ByteBuffer byteBuffer, android.content.Context context) {
        int i5;
        long j2;
        int i6;
        int i7;
        long j3;
        double d2;
        double d3;
        android.view.MotionEvent motionEvent2;
        int i8;
        double d4;
        double d5;
        double d6;
        P0.C0044b c0044b;
        float c2;
        float scaledHorizontalScrollFactor;
        android.view.InputDevice.MotionRange motionRange;
        if (i3 == -1) {
            return;
        }
        int i9 = 3;
        int pointerId = (motionEvent.getPointerId(i2) << 3) | (motionEvent.getToolType(i2) & 7);
        int toolType = motionEvent.getToolType(i2);
        if (toolType == 1) {
            i9 = 0;
        } else if (toolType == 2) {
            i9 = 2;
        } else if (toolType == 3) {
            i9 = 1;
        } else if (toolType != 4) {
            i9 = 5;
        }
        float[] fArr = {motionEvent.getX(i2), motionEvent.getY(i2)};
        matrix.mapPoints(fArr);
        java.util.HashMap hashMap = this.f1334d;
        if (i9 == 1) {
            j2 = motionEvent.getButtonState() & 31;
            if (j2 == 0 && motionEvent.getSource() == 8194) {
                i5 = 4;
                if (i3 == 4) {
                    hashMap.put(java.lang.Integer.valueOf(pointerId), fArr);
                }
            } else {
                i5 = 4;
            }
        } else {
            i5 = 4;
            j2 = i9 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean containsKey = hashMap.containsKey(java.lang.Integer.valueOf(pointerId));
        if (containsKey) {
            i6 = i3 == i5 ? 7 : i3 == 5 ? 8 : (i3 == 6 || i3 == 0) ? 9 : -1;
            if (i6 == -1) {
                return;
            }
        } else {
            i6 = -1;
        }
        if (this.f1333c) {
            x0.e eVar = this.f1332b;
            eVar.getClass();
            i7 = pointerId;
            j3 = P0.G.f1319b.incrementAndGet();
            ((android.util.LongSparseArray) eVar.f8409b).put(j3, android.view.MotionEvent.obtain(motionEvent));
            ((java.util.PriorityQueue) eVar.f8410c).add(java.lang.Long.valueOf(j3));
        } else {
            i7 = pointerId;
            j3 = 0;
        }
        int i10 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(j3);
        byteBuffer.putLong(eventTime);
        if (containsKey) {
            byteBuffer.putLong(i6);
            byteBuffer.putLong(4L);
        } else {
            byteBuffer.putLong(i3);
            byteBuffer.putLong(i9);
        }
        byteBuffer.putLong(i10);
        int i11 = i7;
        byteBuffer.putLong(i11);
        byteBuffer.putLong(0L);
        if (containsKey) {
            float[] fArr2 = (float[]) hashMap.get(java.lang.Integer.valueOf(i11));
            byteBuffer.putDouble(fArr2[0]);
            byteBuffer.putDouble(fArr2[1]);
        } else {
            byteBuffer.putDouble(fArr[0]);
            byteBuffer.putDouble(fArr[1]);
        }
        byteBuffer.putDouble(com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE);
        byteBuffer.putDouble(com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE);
        byteBuffer.putLong(j2);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i2));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            d2 = 0.0d;
            d3 = 1.0d;
        } else {
            d2 = motionRange.getMin();
            d3 = motionRange.getMax();
        }
        byteBuffer.putDouble(d2);
        byteBuffer.putDouble(d3);
        if (i9 == 2) {
            motionEvent2 = motionEvent;
            i8 = i2;
            byteBuffer.putDouble(motionEvent2.getAxisValue(24, i8));
            byteBuffer.putDouble(com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE);
        } else {
            motionEvent2 = motionEvent;
            i8 = i2;
            byteBuffer.putDouble(com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE);
            byteBuffer.putDouble(com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE);
        }
        byteBuffer.putDouble(motionEvent.getSize(i2));
        byteBuffer.putDouble(motionEvent.getToolMajor(i2));
        byteBuffer.putDouble(motionEvent.getToolMinor(i2));
        byteBuffer.putDouble(com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE);
        byteBuffer.putDouble(com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE);
        byteBuffer.putDouble(motionEvent2.getAxisValue(8, i8));
        if (i9 == 2) {
            byteBuffer.putDouble(motionEvent2.getAxisValue(25, i8));
        } else {
            byteBuffer.putDouble(com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE);
        }
        byteBuffer.putLong(i4);
        if (i10 == 1) {
            if (context != null) {
                int i12 = android.os.Build.VERSION.SDK_INT;
                if (i12 >= 26) {
                    scaledHorizontalScrollFactor = android.view.ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
                    c2 = scaledHorizontalScrollFactor;
                    c0044b = this;
                } else {
                    c0044b = this;
                    c2 = c0044b.c(context);
                }
                d5 = c2;
                d6 = i12 >= 26 ? android.view.ViewConfiguration.get(context).getScaledVerticalScrollFactor() : c0044b.c(context);
            } else {
                d5 = 48.0d;
                d6 = 48.0d;
            }
            byteBuffer.putDouble(d5 * (-motionEvent2.getAxisValue(10, i8)));
            byteBuffer.putDouble(d6 * (-motionEvent2.getAxisValue(9, i8)));
        } else {
            byteBuffer.putDouble(com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE);
            byteBuffer.putDouble(com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE);
        }
        if (containsKey) {
            float[] fArr3 = (float[]) hashMap.get(java.lang.Integer.valueOf(i11));
            byteBuffer.putDouble(fArr[0] - fArr3[0]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d4 = com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE;
        } else {
            d4 = com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE;
            byteBuffer.putDouble(com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE);
            byteBuffer.putDouble(com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE);
        }
        byteBuffer.putDouble(d4);
        byteBuffer.putDouble(d4);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d4);
        byteBuffer.putLong(0L);
        if (containsKey && i6 == 9) {
            hashMap.remove(java.lang.Integer.valueOf(i11));
        }
    }

    public final int c(android.content.Context context) {
        if (this.f1335e == 0) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            if (!context.getTheme().resolveAttribute(android.R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f1335e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1335e;
    }
}
