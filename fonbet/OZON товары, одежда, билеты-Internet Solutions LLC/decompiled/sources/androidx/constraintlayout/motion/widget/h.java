package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import p2.C8834a;

/* loaded from: classes8.dex */
public final class h extends androidx.constraintlayout.motion.widget.a {

    /* renamed from: q, reason: collision with root package name */
    private float f41397q;

    /* renamed from: e, reason: collision with root package name */
    private String f41385e = null;

    /* renamed from: f, reason: collision with root package name */
    private int f41386f = -1;

    /* renamed from: g, reason: collision with root package name */
    private String f41387g = null;

    /* renamed from: h, reason: collision with root package name */
    private String f41388h = null;

    /* renamed from: i, reason: collision with root package name */
    private int f41389i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f41390j = -1;

    /* renamed from: k, reason: collision with root package name */
    private View f41391k = null;

    /* renamed from: l, reason: collision with root package name */
    float f41392l = 0.1f;

    /* renamed from: m, reason: collision with root package name */
    private boolean f41393m = true;

    /* renamed from: n, reason: collision with root package name */
    private boolean f41394n = true;

    /* renamed from: o, reason: collision with root package name */
    private boolean f41395o = true;

    /* renamed from: p, reason: collision with root package name */
    private float f41396p = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    private boolean f41398r = false;

    /* renamed from: s, reason: collision with root package name */
    int f41399s = -1;

    /* renamed from: t, reason: collision with root package name */
    int f41400t = -1;

    /* renamed from: u, reason: collision with root package name */
    int f41401u = -1;

    /* renamed from: v, reason: collision with root package name */
    RectF f41402v = new RectF();

    /* renamed from: w, reason: collision with root package name */
    RectF f41403w = new RectF();

    /* renamed from: x, reason: collision with root package name */
    HashMap<String, Method> f41404x = new HashMap<>();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static SparseIntArray f41405a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f41405a = sparseIntArray;
            sparseIntArray.append(0, 8);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 1);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(9, 5);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(2, 10);
            sparseIntArray.append(8, 11);
            sparseIntArray.append(10, 12);
            sparseIntArray.append(11, 13);
            sparseIntArray.append(12, 14);
        }

        public static void a(h hVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                SparseIntArray sparseIntArray = f41405a;
                switch (sparseIntArray.get(index)) {
                    case 1:
                        hVar.f41387g = typedArray.getString(index);
                        break;
                    case 2:
                        hVar.f41388h = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 4:
                        hVar.f41385e = typedArray.getString(index);
                        break;
                    case 5:
                        hVar.f41392l = typedArray.getFloat(index, hVar.f41392l);
                        break;
                    case 6:
                        hVar.f41389i = typedArray.getResourceId(index, hVar.f41389i);
                        break;
                    case 7:
                        if (MotionLayout.f41220I0) {
                            int resourceId = typedArray.getResourceId(index, hVar.f41315b);
                            hVar.f41315b = resourceId;
                            if (resourceId == -1) {
                                hVar.f41316c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            hVar.f41316c = typedArray.getString(index);
                            break;
                        } else {
                            hVar.f41315b = typedArray.getResourceId(index, hVar.f41315b);
                            break;
                        }
                    case 8:
                        int integer = typedArray.getInteger(index, hVar.f41314a);
                        hVar.f41314a = integer;
                        hVar.f41396p = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        hVar.f41390j = typedArray.getResourceId(index, hVar.f41390j);
                        break;
                    case 10:
                        hVar.f41398r = typedArray.getBoolean(index, hVar.f41398r);
                        break;
                    case 11:
                        hVar.f41386f = typedArray.getResourceId(index, hVar.f41386f);
                        break;
                    case 12:
                        hVar.f41401u = typedArray.getResourceId(index, hVar.f41401u);
                        break;
                    case 13:
                        hVar.f41399s = typedArray.getResourceId(index, hVar.f41399s);
                        break;
                    case 14:
                        hVar.f41400t = typedArray.getResourceId(index, hVar.f41400t);
                        break;
                }
            }
        }
    }

    public h() {
        this.f41317d = new HashMap<>();
    }

    private void t(View view, String str) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            boolean z11 = str.length() == 1;
            if (!z11) {
                str = str.substring(1).toLowerCase(Locale.ROOT);
            }
            for (String str2 : this.f41317d.keySet()) {
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                if (z11 || lowerCase.matches(str)) {
                    androidx.constraintlayout.widget.a aVar = this.f41317d.get(str2);
                    if (aVar != null) {
                        aVar.a(view);
                    }
                }
            }
            return;
        }
        if (this.f41404x.containsKey(str)) {
            method = this.f41404x.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, new Class[0]);
                this.f41404x.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.f41404x.put(str, null);
                Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + C8834a.d(view));
                return;
            }
        }
        try {
            method.invoke(view, new Object[0]);
        } catch (Exception unused2) {
            Log.e("KeyTrigger", "Exception in call \"" + this.f41385e + "\"on class " + view.getClass().getSimpleName() + " " + C8834a.d(view));
        }
    }

    private static void u(RectF rectF, View view, boolean z11) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z11) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public final void a(HashMap<String, o2.d> hashMap) {
        throw null;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    /* renamed from: b */
    public final androidx.constraintlayout.motion.widget.a clone() {
        h hVar = new h();
        super.c(this);
        hVar.f41385e = this.f41385e;
        hVar.f41386f = this.f41386f;
        hVar.f41387g = this.f41387g;
        hVar.f41388h = this.f41388h;
        hVar.f41389i = this.f41389i;
        hVar.f41390j = this.f41390j;
        hVar.f41391k = this.f41391k;
        hVar.f41392l = this.f41392l;
        hVar.f41393m = this.f41393m;
        hVar.f41394n = this.f41394n;
        hVar.f41395o = this.f41395o;
        hVar.f41396p = this.f41396p;
        hVar.f41397q = this.f41397q;
        hVar.f41398r = this.f41398r;
        hVar.f41402v = this.f41402v;
        hVar.f41403w = this.f41403w;
        hVar.f41404x = this.f41404x;
        return hVar;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public final void d(HashSet<String> hashSet) {
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public final void e(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f41853j));
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(View view, float f7) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = true;
        boolean z16 = false;
        if (this.f41390j != -1) {
            if (this.f41391k == null) {
                this.f41391k = ((ViewGroup) view.getParent()).findViewById(this.f41390j);
            }
            u(this.f41402v, this.f41391k, this.f41398r);
            u(this.f41403w, view, this.f41398r);
            if (this.f41402v.intersect(this.f41403w)) {
                if (this.f41393m) {
                    this.f41393m = false;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f41395o) {
                    this.f41395o = false;
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f41394n = true;
            } else {
                if (this.f41393m) {
                    z11 = false;
                } else {
                    this.f41393m = true;
                    z11 = true;
                }
                if (this.f41394n) {
                    this.f41394n = false;
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f41395o = true;
                boolean z17 = z13;
                z14 = false;
                z16 = z17;
            }
            z15 = z14;
        } else {
            if (this.f41393m) {
                float f11 = this.f41396p;
                if ((this.f41397q - f11) * (f7 - f11) < 0.0f) {
                    this.f41393m = false;
                    z11 = true;
                    if (!this.f41394n) {
                        float f12 = this.f41396p;
                        float f13 = f7 - f12;
                        if ((this.f41397q - f12) * f13 < 0.0f && f13 < 0.0f) {
                            this.f41394n = false;
                            z12 = true;
                            if (this.f41395o) {
                                float f14 = this.f41396p;
                                float f15 = f7 - f14;
                                if ((this.f41397q - f14) * f15 < 0.0f && f15 > 0.0f) {
                                    this.f41395o = false;
                                    z16 = z12;
                                }
                            } else if (Math.abs(f7 - this.f41396p) > this.f41392l) {
                                this.f41395o = true;
                            }
                            z15 = false;
                            z16 = z12;
                        }
                    } else if (Math.abs(f7 - this.f41396p) > this.f41392l) {
                        this.f41394n = true;
                    }
                    z12 = false;
                    if (this.f41395o) {
                    }
                    z15 = false;
                    z16 = z12;
                }
            } else if (Math.abs(f7 - this.f41396p) > this.f41392l) {
                this.f41393m = true;
            }
            z11 = false;
            if (!this.f41394n) {
            }
            z12 = false;
            if (this.f41395o) {
            }
            z15 = false;
            z16 = z12;
        }
        this.f41397q = f7;
        if (z16 || z11 || z15) {
            ((MotionLayout) view.getParent()).w(this.f41389i, z15, f7);
        }
        View findViewById = this.f41386f == -1 ? view : ((MotionLayout) view.getParent()).findViewById(this.f41386f);
        if (z16) {
            String str = this.f41387g;
            if (str != null) {
                t(findViewById, str);
            }
            if (this.f41399s != -1) {
                ((MotionLayout) view.getParent()).R(this.f41399s, findViewById);
            }
        }
        if (z15) {
            String str2 = this.f41388h;
            if (str2 != null) {
                t(findViewById, str2);
            }
            if (this.f41400t != -1) {
                ((MotionLayout) view.getParent()).R(this.f41400t, findViewById);
            }
        }
        if (z11) {
            String str3 = this.f41385e;
            if (str3 != null) {
                t(findViewById, str3);
            }
            if (this.f41401u != -1) {
                ((MotionLayout) view.getParent()).R(this.f41401u, findViewById);
            }
        }
    }
}
