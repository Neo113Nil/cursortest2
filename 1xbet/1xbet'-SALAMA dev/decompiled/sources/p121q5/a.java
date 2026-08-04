package p121q5;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import io.flutter.embedding.engine.renderer.k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Matrix f15874f = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f15875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p028d6.k f15876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f15878d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15879e;

    public a(k kVar, boolean z4) {
        this.f15875a = kVar;
        if (p028d6.k.f12445d == null) {
            p028d6.k.f12445d = new p028d6.k(14);
        }
        this.f15876b = p028d6.k.f12445d;
        this.f15877c = z4;
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
        long buttonState;
        int i12;
        long jIncrementAndGet;
        double min;
        double max;
        MotionEvent motionEvent2;
        double d7;
        double d8;
        double scaledVerticalScrollFactor;
        a aVar;
        float fC;
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
        float[] fArr = {motionEvent.getX(i7), motionEvent.getY(i7)};
        matrix.mapPoints(fArr);
        HashMap map = this.f15878d;
        if (i10 == 1) {
            buttonState = motionEvent.getButtonState() & 31;
            if (buttonState == 0 && motionEvent.getSource() == 8194) {
                i11 = 4;
                if (i8 == 4) {
                    map.put(Integer.valueOf(pointerId), fArr);
                }
            } else {
                i11 = 4;
            }
        } else {
            i11 = 4;
            buttonState = i10 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean zContainsKey = map.containsKey(Integer.valueOf(pointerId));
        if (zContainsKey) {
            if (i8 == i11) {
                i12 = 7;
            } else if (i8 == 5) {
                i12 = 8;
            } else {
                i12 = (i8 == 6 || i8 == 0) ? 9 : -1;
            }
            if (i12 == -1) {
                return;
            }
        } else {
            i12 = -1;
        }
        if (this.f15877c) {
            p028d6.k kVar = this.f15876b;
            kVar.getClass();
            jIncrementAndGet = y.f15969b.incrementAndGet();
            ((LongSparseArray) kVar.f12447b).put(jIncrementAndGet, MotionEvent.obtain(motionEvent));
            ((PriorityQueue) kVar.f12448c).add(Long.valueOf(jIncrementAndGet));
        } else {
            jIncrementAndGet = 0;
        }
        int i13 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        long j = buttonState;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(jIncrementAndGet);
        byteBuffer.putLong(eventTime);
        if (zContainsKey) {
            byteBuffer.putLong(i12);
            byteBuffer.putLong(4L);
        } else {
            byteBuffer.putLong(i8);
            byteBuffer.putLong(i10);
        }
        byteBuffer.putLong(i13);
        byteBuffer.putLong(pointerId);
        byteBuffer.putLong(0L);
        if (zContainsKey) {
            float[] fArr2 = (float[]) map.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr2[0]);
            byteBuffer.putDouble(fArr2[1]);
        } else {
            byteBuffer.putDouble(fArr[0]);
            byteBuffer.putDouble(fArr[1]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i7));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            min = 0.0d;
            max = 1.0d;
        } else {
            min = motionRange.getMin();
            max = motionRange.getMax();
        }
        byteBuffer.putDouble(min);
        byteBuffer.putDouble(max);
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
                    fC = ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
                    aVar = this;
                } else {
                    aVar = this;
                    fC = aVar.c(context);
                }
                d8 = fC;
                scaledVerticalScrollFactor = i14 >= 26 ? ViewConfiguration.get(context).getScaledVerticalScrollFactor() : aVar.c(context);
            } else {
                d8 = 48.0d;
                scaledVerticalScrollFactor = 48.0d;
            }
            double d9 = d8 * ((double) (-motionEvent2.getAxisValue(10, i7)));
            double d10 = scaledVerticalScrollFactor * ((double) (-motionEvent2.getAxisValue(9, i7)));
            byteBuffer.putDouble(d9);
            byteBuffer.putDouble(d10);
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (zContainsKey) {
            float[] fArr3 = (float[]) map.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr[0] - fArr3[0]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d7 = 0.0d;
        } else {
            d7 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d7);
        byteBuffer.putDouble(d7);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d7);
        byteBuffer.putLong(0L);
        if (zContainsKey && i12 == 9) {
            map.remove(Integer.valueOf(pointerId));
        }
    }

    public final int c(Context context) {
        if (this.f15879e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f15879e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f15879e;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0037 A[PHI: r5
      0x0037: PHI (r5v6 char) = (r5v5 char), (r5v7 char) binds: [B:17:0x002e, B:21:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    public final void d(MotionEvent motionEvent, Matrix matrix) {
        int actionMasked = motionEvent.getActionMasked();
        int iB = b(motionEvent.getActionMasked());
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
                } else if (toolType == 4) {
                    c3 = c4;
                }
            } else {
                c3 = c4;
            }
        } else {
            c3 = 0;
        }
        int i7 = (z7 && c3 == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((pointerCount + i7) * 288);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z4) {
            a(motionEvent, motionEvent.getActionIndex(), iB, 0, matrix, byteBufferAllocateDirect, null);
        } else if (z7) {
            for (int i8 = 0; i8 < pointerCount; i8++) {
                if (i8 != motionEvent.getActionIndex() && motionEvent.getToolType(i8) == 1) {
                    a(motionEvent, i8, 5, 1, matrix, byteBufferAllocateDirect, null);
                }
            }
            a(motionEvent, motionEvent.getActionIndex(), iB, 0, matrix, byteBufferAllocateDirect, null);
            if (i7 != 0) {
                a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBufferAllocateDirect, null);
            }
        } else {
            for (int i9 = 0; i9 < pointerCount; i9++) {
                a(motionEvent, i9, iB, 0, matrix, byteBufferAllocateDirect, null);
            }
        }
        if (byteBufferAllocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        this.f15875a.f14112a.dispatchPointerDataPacket(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
    }
}
