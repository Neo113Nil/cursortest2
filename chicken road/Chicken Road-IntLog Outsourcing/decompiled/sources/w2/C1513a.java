package w2;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.yandex.varioqub.config.model.ConfigValue;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.PriorityQueue;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1513a {

    /* renamed from: f, reason: collision with root package name */
    public static final Matrix f12119f = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.i f12120a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.e f12121b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12122c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f12123d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f12124e;

    public C1513a(io.flutter.embedding.engine.renderer.i iVar, boolean z) {
        this.f12120a = iVar;
        if (B0.e.f144d == null) {
            B0.e.f144d = new B0.e();
        }
        this.f12121b = B0.e.f144d;
        this.f12122c = z;
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

    public final void a(MotionEvent motionEvent, int i2, int i3, int i6, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        int i7;
        long j2;
        int i8;
        int i9;
        long j6;
        double d6;
        double d7;
        MotionEvent motionEvent2;
        int i10;
        double d8;
        double d9;
        double d10;
        C1513a c1513a;
        float c2;
        float scaledHorizontalScrollFactor;
        InputDevice.MotionRange motionRange;
        if (i3 == -1) {
            return;
        }
        int i11 = 3;
        int pointerId = (motionEvent.getPointerId(i2) << 3) | (motionEvent.getToolType(i2) & 7);
        int toolType = motionEvent.getToolType(i2);
        if (toolType == 1) {
            i11 = 0;
        } else if (toolType == 2) {
            i11 = 2;
        } else if (toolType == 3) {
            i11 = 1;
        } else if (toolType != 4) {
            i11 = 5;
        }
        float[] fArr = {motionEvent.getX(i2), motionEvent.getY(i2)};
        matrix.mapPoints(fArr);
        HashMap hashMap = this.f12123d;
        if (i11 == 1) {
            j2 = motionEvent.getButtonState() & 31;
            if (j2 == 0 && motionEvent.getSource() == 8194) {
                i7 = 4;
                if (i3 == 4) {
                    hashMap.put(Integer.valueOf(pointerId), fArr);
                }
            } else {
                i7 = 4;
            }
        } else {
            i7 = 4;
            j2 = i11 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean containsKey = hashMap.containsKey(Integer.valueOf(pointerId));
        if (containsKey) {
            i8 = i3 == i7 ? 7 : i3 == 5 ? 8 : (i3 == 6 || i3 == 0) ? 9 : -1;
            if (i8 == -1) {
                return;
            }
        } else {
            i8 = -1;
        }
        if (this.f12122c) {
            B0.e eVar = this.f12121b;
            eVar.getClass();
            i9 = pointerId;
            j6 = w.f12218b.incrementAndGet();
            ((LongSparseArray) eVar.f146b).put(j6, MotionEvent.obtain(motionEvent));
            ((PriorityQueue) eVar.f147c).add(Long.valueOf(j6));
        } else {
            i9 = pointerId;
            j6 = 0;
        }
        int i12 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(j6);
        byteBuffer.putLong(eventTime);
        if (containsKey) {
            byteBuffer.putLong(i8);
            byteBuffer.putLong(4L);
        } else {
            byteBuffer.putLong(i3);
            byteBuffer.putLong(i11);
        }
        byteBuffer.putLong(i12);
        int i13 = i9;
        byteBuffer.putLong(i13);
        byteBuffer.putLong(0L);
        if (containsKey) {
            float[] fArr2 = (float[]) hashMap.get(Integer.valueOf(i13));
            byteBuffer.putDouble(fArr2[0]);
            byteBuffer.putDouble(fArr2[1]);
        } else {
            byteBuffer.putDouble(fArr[0]);
            byteBuffer.putDouble(fArr[1]);
        }
        byteBuffer.putDouble(ConfigValue.DOUBLE_DEFAULT_VALUE);
        byteBuffer.putDouble(ConfigValue.DOUBLE_DEFAULT_VALUE);
        byteBuffer.putLong(j2);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i2));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            d6 = 0.0d;
            d7 = 1.0d;
        } else {
            d6 = motionRange.getMin();
            d7 = motionRange.getMax();
        }
        byteBuffer.putDouble(d6);
        byteBuffer.putDouble(d7);
        if (i11 == 2) {
            motionEvent2 = motionEvent;
            i10 = i2;
            byteBuffer.putDouble(motionEvent2.getAxisValue(24, i10));
            byteBuffer.putDouble(ConfigValue.DOUBLE_DEFAULT_VALUE);
        } else {
            motionEvent2 = motionEvent;
            i10 = i2;
            byteBuffer.putDouble(ConfigValue.DOUBLE_DEFAULT_VALUE);
            byteBuffer.putDouble(ConfigValue.DOUBLE_DEFAULT_VALUE);
        }
        byteBuffer.putDouble(motionEvent.getSize(i2));
        byteBuffer.putDouble(motionEvent.getToolMajor(i2));
        byteBuffer.putDouble(motionEvent.getToolMinor(i2));
        byteBuffer.putDouble(ConfigValue.DOUBLE_DEFAULT_VALUE);
        byteBuffer.putDouble(ConfigValue.DOUBLE_DEFAULT_VALUE);
        byteBuffer.putDouble(motionEvent2.getAxisValue(8, i10));
        if (i11 == 2) {
            byteBuffer.putDouble(motionEvent2.getAxisValue(25, i10));
        } else {
            byteBuffer.putDouble(ConfigValue.DOUBLE_DEFAULT_VALUE);
        }
        byteBuffer.putLong(i6);
        if (i12 == 1) {
            if (context != null) {
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 26) {
                    scaledHorizontalScrollFactor = ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
                    c2 = scaledHorizontalScrollFactor;
                    c1513a = this;
                } else {
                    c1513a = this;
                    c2 = c1513a.c(context);
                }
                d9 = c2;
                d10 = i14 >= 26 ? ViewConfiguration.get(context).getScaledVerticalScrollFactor() : c1513a.c(context);
            } else {
                d9 = 48.0d;
                d10 = 48.0d;
            }
            byteBuffer.putDouble(d9 * (-motionEvent2.getAxisValue(10, i10)));
            byteBuffer.putDouble(d10 * (-motionEvent2.getAxisValue(9, i10)));
        } else {
            byteBuffer.putDouble(ConfigValue.DOUBLE_DEFAULT_VALUE);
            byteBuffer.putDouble(ConfigValue.DOUBLE_DEFAULT_VALUE);
        }
        if (containsKey) {
            float[] fArr3 = (float[]) hashMap.get(Integer.valueOf(i13));
            byteBuffer.putDouble(fArr[0] - fArr3[0]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d8 = ConfigValue.DOUBLE_DEFAULT_VALUE;
        } else {
            d8 = ConfigValue.DOUBLE_DEFAULT_VALUE;
            byteBuffer.putDouble(ConfigValue.DOUBLE_DEFAULT_VALUE);
            byteBuffer.putDouble(ConfigValue.DOUBLE_DEFAULT_VALUE);
        }
        byteBuffer.putDouble(d8);
        byteBuffer.putDouble(d8);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d8);
        byteBuffer.putLong(0L);
        if (containsKey && i8 == 9) {
            hashMap.remove(Integer.valueOf(i13));
        }
    }

    public final int c(Context context) {
        if (this.f12124e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f12124e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f12124e;
    }
}
