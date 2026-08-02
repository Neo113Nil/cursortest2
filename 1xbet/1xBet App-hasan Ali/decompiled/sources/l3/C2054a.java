package l3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Parcel;
import android.text.Editable;
import android.text.Selection;
import com.google.android.gms.internal.ads.C1586t;
import java.util.concurrent.CopyOnWriteArrayList;
import k4.AbstractC2036a;
import m.InterfaceC2075m;
import m.MenuC2070h;
import n1.InterfaceC2172m;
import t3.C2424c;
import t3.InterfaceC2423b;
import u.C2471s;
import v3.AbstractC2535a;
import v3.C2536b;
import v3.C2537c;
import x1.C2641b;

/* renamed from: l3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2054a implements InterfaceC2075m, InterfaceC2172m, InterfaceC2423b, i {

    /* renamed from: l, reason: collision with root package name */
    public static C2054a f17771l;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17772k;

    public /* synthetic */ C2054a(int i) {
        this.f17772k = i;
    }

    public static final float[] h() {
        float[] fArr = C2471s.f19914s;
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[91];
        C2471s.f19914s = fArr2;
        return fArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean j(C2641b c2641b, Editable editable, int i, int i5, boolean z3) {
        int min;
        if (editable != null && i >= 0 && i5 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z3) {
                    int max = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z5 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z5) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z5 = true;
                                    }
                                } else if (!z5) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i5, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z6 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z6) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z6 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    min = Math.min(selectionEnd + i5, editable.length());
                }
                v1.w[] wVarArr = (v1.w[]) editable.getSpans(selectionStart, min, v1.w.class);
                if (wVarArr != null && wVarArr.length > 0) {
                    for (v1.w wVar : wVarArr) {
                        int spanStart = editable.getSpanStart(wVar);
                        int spanEnd = editable.getSpanEnd(wVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    c2641b.beginBatchEdit();
                    editable.delete(max3, min2);
                    c2641b.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // t3.InterfaceC2423b
    public int c(Context context, String str) {
        return C2424c.a(context, str);
    }

    @Override // m.InterfaceC2075m
    public boolean d(MenuC2070h menuC2070h) {
        return false;
    }

    @Override // l3.i
    public void f(Object obj, Object obj2) {
        C2537c c2537c = (C2537c) ((C2536b) obj).t();
        R1.f fVar = new R1.f((D3.f) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i = AbstractC2535a.f20428a;
        obtain.writeInt(1);
        AbstractC2036a.m0(obtain, AbstractC2036a.k0(obtain, 20293));
        obtain.writeStrongBinder(fVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            c2537c.f20429k.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // t3.InterfaceC2423b
    public int g(Context context, String str, boolean z3) {
        return C2424c.d(context, str, z3);
    }

    public Signature[] i(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean k(CharSequence charSequence) {
        return charSequence instanceof l1.c;
    }

    public C1586t l(Context context, String str, InterfaceC2423b interfaceC2423b) {
        switch (this.f17772k) {
            case 7:
                C1586t c1586t = new C1586t();
                int g5 = interfaceC2423b.g(context, str, true);
                c1586t.f15622b = g5;
                if (g5 != 0) {
                    c1586t.f15623c = 1;
                } else {
                    int c5 = interfaceC2423b.c(context, str);
                    c1586t.f15621a = c5;
                    if (c5 != 0) {
                        c1586t.f15623c = -1;
                    }
                }
                return c1586t;
            default:
                C1586t c1586t2 = new C1586t();
                c1586t2.f15621a = interfaceC2423b.c(context, str);
                int i = 1;
                int g6 = interfaceC2423b.g(context, str, true);
                c1586t2.f15622b = g6;
                int i5 = c1586t2.f15621a;
                if (i5 == 0) {
                    i5 = 0;
                    if (g6 == 0) {
                        i = 0;
                        c1586t2.f15623c = i;
                        return c1586t2;
                    }
                }
                if (i5 >= g6) {
                    i = -1;
                }
                c1586t2.f15623c = i;
                return c1586t2;
        }
    }

    public C2054a(T2.r rVar) {
        this.f17772k = 18;
        new CopyOnWriteArrayList();
    }

    @Override // m.InterfaceC2075m
    public void a(MenuC2070h menuC2070h, boolean z3) {
    }

    @Override // n1.InterfaceC2172m
    public void b(int i, int i5, int i6, boolean z3) {
    }

    @Override // n1.InterfaceC2172m
    public void e(int i, int i5, int i6, int i7) {
    }
}
