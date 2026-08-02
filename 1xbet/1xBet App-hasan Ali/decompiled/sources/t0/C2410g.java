package t0;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import h0.C1988b;
import java.util.ArrayList;

/* renamed from: t0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2410g {

    /* renamed from: a, reason: collision with root package name */
    public long f19472a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseLongArray f19473b = new SparseLongArray();

    /* renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f19474c = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f19475d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f19476e = -1;
    public int f = -1;

    /* JADX WARN: Removed duplicated region for block: B:50:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final G.v a(MotionEvent motionEvent, A0.F f) {
        long j5;
        int i;
        int i5;
        boolean z3;
        boolean z5;
        long j6;
        float f5;
        long j7;
        long w5;
        float rawX;
        float rawY;
        long J;
        int toolType;
        int i6;
        int historySize;
        int i7;
        long j8;
        long j9;
        int i8;
        A0.F f6 = f;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f19473b;
        SparseBooleanArray sparseBooleanArray = this.f19474c;
        int i9 = 3;
        if (actionMasked != 3) {
            int i10 = 4;
            if (actionMasked != 4) {
                if (motionEvent.getPointerCount() == 1) {
                    int toolType2 = motionEvent.getToolType(0);
                    int source = motionEvent.getSource();
                    if (toolType2 != this.f19476e || source != this.f) {
                        this.f19476e = toolType2;
                        this.f = source;
                        sparseBooleanArray.clear();
                        sparseLongArray.clear();
                    }
                }
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0 || actionMasked2 == 5) {
                    j5 = 1;
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    if (sparseLongArray.indexOfKey(pointerId) < 0) {
                        long j10 = this.f19472a;
                        this.f19472a = j10 + 1;
                        sparseLongArray.put(pointerId, j10);
                        if (motionEvent.getToolType(actionIndex) == 3) {
                            sparseBooleanArray.put(pointerId, true);
                        }
                    }
                } else {
                    if (actionMasked2 == 9) {
                        int pointerId2 = motionEvent.getPointerId(0);
                        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                            long j11 = this.f19472a;
                            j5 = 1;
                            this.f19472a = j11 + 1;
                            sparseLongArray.put(pointerId2, j11);
                        }
                    }
                    j5 = 1;
                }
                boolean z6 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
                boolean z7 = actionMasked == 8;
                if (z6) {
                    i = 1;
                    sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
                } else {
                    i = 1;
                }
                int actionIndex2 = actionMasked != i ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
                ArrayList arrayList = this.f19475d;
                arrayList.clear();
                int pointerCount = motionEvent.getPointerCount();
                int i11 = 0;
                while (i11 < pointerCount) {
                    boolean z8 = (z6 || i11 == actionIndex2 || (z7 && motionEvent.getButtonState() == 0)) ? false : true;
                    int pointerId3 = motionEvent.getPointerId(i11);
                    int indexOfKey = sparseLongArray.indexOfKey(pointerId3);
                    if (indexOfKey >= 0) {
                        z5 = z6;
                        z3 = z7;
                        j6 = sparseLongArray.valueAt(indexOfKey);
                    } else {
                        z3 = z7;
                        long j12 = this.f19472a;
                        z5 = z6;
                        this.f19472a = j12 + j5;
                        sparseLongArray.put(pointerId3, j12);
                        j6 = j12;
                    }
                    float pressure = motionEvent.getPressure(i11);
                    char c5 = ' ';
                    long floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getY(i11)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(i11)) << 32);
                    long a5 = C1988b.a(floatToRawIntBits, 0.0f, i9);
                    if (i11 == 0) {
                        f5 = 0.0f;
                        w5 = (Float.floatToRawIntBits(motionEvent.getRawY()) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getRawX()) << 32);
                        J = f6.J(w5);
                    } else {
                        f5 = 0.0f;
                        if (Build.VERSION.SDK_INT >= 29) {
                            rawX = motionEvent.getRawX(i11);
                            rawY = motionEvent.getRawY(i11);
                            w5 = (Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
                            J = f6.J(w5);
                        } else {
                            j7 = floatToRawIntBits;
                            w5 = f6.w(floatToRawIntBits);
                            toolType = motionEvent.getToolType(i11);
                            if (toolType != 0) {
                                if (toolType == 1) {
                                    i6 = 1;
                                } else if (toolType == 2) {
                                    i6 = i9;
                                } else if (toolType == i9) {
                                    i6 = 2;
                                } else if (toolType == i10) {
                                    i6 = i10;
                                }
                                ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                                historySize = motionEvent.getHistorySize();
                                i7 = 0;
                                while (i7 < historySize) {
                                    float historicalX = motionEvent.getHistoricalX(i11, i7);
                                    float historicalY = motionEvent.getHistoricalY(i11, i7);
                                    char c6 = c5;
                                    if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                                        i8 = actionIndex2;
                                    } else {
                                        i8 = actionIndex2;
                                        long floatToRawIntBits2 = (Float.floatToRawIntBits(historicalX) << c6) | (Float.floatToRawIntBits(historicalY) & 4294967295L);
                                        arrayList2.add(new C2406c(motionEvent.getHistoricalEventTime(i7), floatToRawIntBits2, floatToRawIntBits2));
                                    }
                                    i7++;
                                    actionIndex2 = i8;
                                    c5 = c6;
                                }
                                char c7 = c5;
                                int i12 = actionIndex2;
                                if (motionEvent.getActionMasked() == 8) {
                                    float axisValue = motionEvent.getAxisValue(10);
                                    float f7 = (-motionEvent.getAxisValue(9)) + f5;
                                    j8 = w5;
                                    j9 = (Float.floatToRawIntBits(axisValue) << c7) | (Float.floatToRawIntBits(f7) & 4294967295L);
                                } else {
                                    j8 = w5;
                                    j9 = 0;
                                }
                                arrayList.add(new u(j6, motionEvent.getEventTime(), j8, j7, z8, pressure, i6, sparseBooleanArray.get(motionEvent.getPointerId(i11), false), arrayList2, j9, a5));
                                i11++;
                                f6 = f;
                                actionIndex2 = i12;
                                z7 = z3;
                                z6 = z5;
                                i9 = 3;
                                i10 = 4;
                            }
                            i6 = 0;
                            ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
                            historySize = motionEvent.getHistorySize();
                            i7 = 0;
                            while (i7 < historySize) {
                            }
                            char c72 = c5;
                            int i122 = actionIndex2;
                            if (motionEvent.getActionMasked() == 8) {
                            }
                            arrayList.add(new u(j6, motionEvent.getEventTime(), j8, j7, z8, pressure, i6, sparseBooleanArray.get(motionEvent.getPointerId(i11), false), arrayList22, j9, a5));
                            i11++;
                            f6 = f;
                            actionIndex2 = i122;
                            z7 = z3;
                            z6 = z5;
                            i9 = 3;
                            i10 = 4;
                        }
                    }
                    j7 = J;
                    toolType = motionEvent.getToolType(i11);
                    if (toolType != 0) {
                    }
                    i6 = 0;
                    ArrayList arrayList222 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    i7 = 0;
                    while (i7 < historySize) {
                    }
                    char c722 = c5;
                    int i1222 = actionIndex2;
                    if (motionEvent.getActionMasked() == 8) {
                    }
                    arrayList.add(new u(j6, motionEvent.getEventTime(), j8, j7, z8, pressure, i6, sparseBooleanArray.get(motionEvent.getPointerId(i11), false), arrayList222, j9, a5));
                    i11++;
                    f6 = f;
                    actionIndex2 = i1222;
                    z7 = z3;
                    z6 = z5;
                    i9 = 3;
                    i10 = 4;
                }
                int actionMasked3 = motionEvent.getActionMasked();
                if (actionMasked3 == 1 || actionMasked3 == 6) {
                    int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    i5 = 0;
                    if (!sparseBooleanArray.get(pointerId4, false)) {
                        sparseLongArray.delete(pointerId4);
                        sparseBooleanArray.delete(pointerId4);
                    }
                } else {
                    i5 = 0;
                }
                if (sparseLongArray.size() > motionEvent.getPointerCount()) {
                    for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                        int keyAt = sparseLongArray.keyAt(size);
                        int pointerCount2 = motionEvent.getPointerCount();
                        int i13 = i5;
                        while (true) {
                            if (i13 >= pointerCount2) {
                                sparseLongArray.removeAt(size);
                                sparseBooleanArray.delete(keyAt);
                                break;
                            }
                            if (motionEvent.getPointerId(i13) == keyAt) {
                                break;
                            }
                            i13++;
                        }
                    }
                }
                motionEvent.getEventTime();
                return new G.v(22, arrayList, motionEvent);
            }
        }
        sparseLongArray.clear();
        sparseBooleanArray.clear();
        return null;
    }
}
