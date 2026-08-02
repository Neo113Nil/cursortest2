package q5;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import d6.C0977k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.PriorityQueue;

/* renamed from: q5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1557a {

    /* renamed from: f, reason: collision with root package name */
    public static final Matrix f15868f = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.k f15869a;

    /* renamed from: b, reason: collision with root package name */
    public final C0977k f15870b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15871c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f15872d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f15873e;

    public C1557a(io.flutter.embedding.engine.renderer.k kVar, boolean z4) {
        this.f15869a = kVar;
        if (C0977k.f12439d == null) {
            C0977k.f12439d = new C0977k(14);
        }
        this.f15870b = C0977k.f12439d;
        this.f15871c = z4;
    }

    public static int b(int i7) {
        if (i7 == 0) {
            return 4;
        }
        if (i7 == 1) {
            return 6;
        }
        if (i7 == 5) {
            return 4;
        }
        if (i7 == 6) {
            return 6;
        }
        if (i7 == 2) {
            return 5;
        }
        if (i7 == 7) {
            return 3;
        }
        if (i7 == 3) {
            return 0;
        }
        return i7 == 8 ? 3 : -1;
    }

    public final void a(MotionEvent motionEvent, int i7, int i8, int i9, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        int i10;
        int i11;
        long j;
        int i12;
        long j3;
        float[] fArr;
        double d7;
        double d8;
        MotionEvent motionEvent2;
        double d9;
        double d10;
        double d11;
        C1557a c1557a;
        float c3;
        float scaledHorizontalScrollFactor;
        InputDevice.MotionRange motionRange;
        if (i8 == -1) {
            return;
        }
        int pointerId = motionEvent.getPointerId(i7);
        int toolType = motionEvent.getToolType(i7);
        if (toolType == 1) {
            i10 = 0;
        } else if (toolType != 2) {
            i10 = 3;
            if (toolType == 3) {
                i10 = 1;
            } else if (toolType != 4) {
                i10 = 5;
            }
        } else {
            i10 = 2;
        }
        float[] fArr2 = {motionEvent.getX(i7), motionEvent.getY(i7)};
        matrix.mapPoints(fArr2);
        HashMap hashMap = this.f15872d;
        if (i10 == 1) {
            j = motionEvent.getButtonState() & 31;
            if (j == 0 && motionEvent.getSource() == 8194) {
                i11 = 4;
                if (i8 == 4) {
                    hashMap.put(Integer.valueOf(pointerId), fArr2);
                }
            } else {
                i11 = 4;
            }
        } else {
            i11 = 4;
            j = i10 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean containsKey = hashMap.containsKey(Integer.valueOf(pointerId));
        if (containsKey) {
            i12 = i8 == i11 ? 7 : i8 == 5 ? 8 : (i8 == 6 || i8 == 0) ? 9 : -1;
            if (i12 == -1) {
                return;
            }
        } else {
            i12 = -1;
        }
        if (this.f15871c) {
            C0977k c0977k = this.f15870b;
            c0977k.getClass();
            j3 = y.f15963b.incrementAndGet();
            ((LongSparseArray) c0977k.f12441b).put(j3, MotionEvent.obtain(motionEvent));
            ((PriorityQueue) c0977k.f12442c).add(Long.valueOf(j3));
        } else {
            j3 = 0;
        }
        int i13 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        long j7 = j;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(j3);
        byteBuffer.putLong(eventTime);
        if (containsKey) {
            byteBuffer.putLong(i12);
            byteBuffer.putLong(4L);
        } else {
            byteBuffer.putLong(i8);
            byteBuffer.putLong(i10);
        }
        byteBuffer.putLong(i13);
        byteBuffer.putLong(pointerId);
        byteBuffer.putLong(0L);
        if (containsKey) {
            float[] fArr3 = (float[]) hashMap.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr3[0]);
            byteBuffer.putDouble(fArr3[1]);
        } else {
            byteBuffer.putDouble(fArr2[0]);
            byteBuffer.putDouble(fArr2[1]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j7);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i7));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            fArr = fArr2;
            d7 = 0.0d;
            d8 = 1.0d;
        } else {
            d7 = motionRange.getMin();
            fArr = fArr2;
            d8 = motionRange.getMax();
        }
        byteBuffer.putDouble(d7);
        byteBuffer.putDouble(d8);
        if (i10 == 2) {
            motionEvent2 = motionEvent;
            byteBuffer.putDouble(motionEvent2.getAxisValue(24, i7));
            byteBuffer.putDouble(0.0d);
        } else {
            motionEvent2 = motionEvent;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i7));
        byteBuffer.putDouble(motionEvent.getToolMajor(i7));
        byteBuffer.putDouble(motionEvent.getToolMinor(i7));
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(motionEvent2.getAxisValue(8, i7));
        if (i10 == 2) {
            byteBuffer.putDouble(motionEvent2.getAxisValue(25, i7));
        } else {
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putLong(i9);
        if (i13 == 1) {
            if (context != null) {
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 26) {
                    scaledHorizontalScrollFactor = ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
                    c3 = scaledHorizontalScrollFactor;
                    c1557a = this;
                } else {
                    c1557a = this;
                    c3 = c1557a.c(context);
                }
                d10 = c3;
                d11 = i14 >= 26 ? ViewConfiguration.get(context).getScaledVerticalScrollFactor() : c1557a.c(context);
            } else {
                d10 = 48.0d;
                d11 = 48.0d;
            }
            byteBuffer.putDouble(d10 * (-motionEvent2.getAxisValue(10, i7)));
            byteBuffer.putDouble(d11 * (-motionEvent2.getAxisValue(9, i7)));
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (containsKey) {
            float[] fArr4 = (float[]) hashMap.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr[0] - fArr4[0]);
            byteBuffer.putDouble(fArr[1] - fArr4[1]);
            d9 = 0.0d;
        } else {
            d9 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d9);
        byteBuffer.putDouble(d9);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d9);
        byteBuffer.putLong(0L);
        if (containsKey && i12 == 9) {
            hashMap.remove(Integer.valueOf(pointerId));
        }
    }

    public final int c(Context context) {
        if (this.f15873e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f15873e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f15873e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r4 != 4) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(MotionEvent motionEvent, Matrix matrix) {
        int actionMasked = motionEvent.getActionMasked();
        int b7 = b(motionEvent.getActionMasked());
        char c3 = 5;
        boolean z4 = actionMasked == 0 || actionMasked == 5;
        boolean z7 = !z4 && (actionMasked == 1 || actionMasked == 6);
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        if (toolType != 1) {
            char c4 = 2;
            if (toolType != 2) {
                c4 = 3;
                if (toolType == 3) {
                    c3 = 1;
                }
            }
            c3 = c4;
        } else {
            c3 = 0;
        }
        int i7 = (z7 && c3 == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + i7) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z4) {
            a(motionEvent, motionEvent.getActionIndex(), b7, 0, matrix, allocateDirect, null);
        } else if (z7) {
            for (int i8 = 0; i8 < pointerCount; i8++) {
                if (i8 != motionEvent.getActionIndex() && motionEvent.getToolType(i8) == 1) {
                    a(motionEvent, i8, 5, 1, matrix, allocateDirect, null);
                }
            }
            a(motionEvent, motionEvent.getActionIndex(), b7, 0, matrix, allocateDirect, null);
            if (i7 != 0) {
                a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, allocateDirect, null);
            }
        } else {
            for (int i9 = 0; i9 < pointerCount; i9++) {
                a(motionEvent, i9, b7, 0, matrix, allocateDirect, null);
            }
        }
        if (allocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        this.f15869a.f14106a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
    }
}
