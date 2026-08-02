package androidx.constraintlayout.helper.widget;

import B.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p6.c;
import z.C1807e;
import z.D;
import z.i;
import z.n;
import z.w;
import z.z;

/* loaded from: classes.dex */
public class MotionEffect extends MotionHelper {

    /* renamed from: D, reason: collision with root package name */
    public final float f8812D;

    /* renamed from: E, reason: collision with root package name */
    public final int f8813E;

    /* renamed from: F, reason: collision with root package name */
    public final int f8814F;

    /* renamed from: G, reason: collision with root package name */
    public final int f8815G;

    /* renamed from: H, reason: collision with root package name */
    public final int f8816H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f8817I;

    /* renamed from: J, reason: collision with root package name */
    public final int f8818J;

    /* renamed from: K, reason: collision with root package name */
    public final int f8819K;

    public MotionEffect(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8812D = 0.1f;
        this.f8813E = 49;
        this.f8814F = 50;
        this.f8815G = 0;
        this.f8816H = 0;
        this.f8817I = true;
        this.f8818J = -1;
        this.f8819K = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f943o);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 3) {
                    int i9 = obtainStyledAttributes.getInt(index, this.f8813E);
                    this.f8813E = i9;
                    this.f8813E = Math.max(Math.min(i9, 99), 0);
                } else if (index == 1) {
                    int i10 = obtainStyledAttributes.getInt(index, this.f8814F);
                    this.f8814F = i10;
                    this.f8814F = Math.max(Math.min(i10, 99), 0);
                } else if (index == 5) {
                    this.f8815G = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8815G);
                } else if (index == 6) {
                    this.f8816H = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8816H);
                } else if (index == 0) {
                    this.f8812D = obtainStyledAttributes.getFloat(index, this.f8812D);
                } else if (index == 2) {
                    this.f8819K = obtainStyledAttributes.getInt(index, this.f8819K);
                } else if (index == 4) {
                    this.f8817I = obtainStyledAttributes.getBoolean(index, this.f8817I);
                } else if (index == 7) {
                    this.f8818J = obtainStyledAttributes.getResourceId(index, this.f8818J);
                }
            }
            int i11 = this.f8813E;
            int i12 = this.f8814F;
            if (i11 == i12) {
                if (i11 > 0) {
                    this.f8813E = i11 - 1;
                } else {
                    this.f8814F = i12 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01bb, code lost:
    
        if (r1 == 0.0f) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0181, code lost:
    
        if (r14 == 0.0f) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0197, code lost:
    
        if (r14 == 0.0f) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ee  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(MotionLayout motionLayout, HashMap hashMap) {
        C1807e c1807e;
        C1807e c1807e2;
        C1807e c1807e3;
        C1807e c1807e4;
        int i7;
        C1807e c1807e5;
        View[] viewArr;
        C1807e c1807e6;
        int i8;
        MotionEffect motionEffect = this;
        HashMap hashMap2 = hashMap;
        View[] j = motionEffect.j((ConstraintLayout) getParent());
        if (j == null) {
            Log.v("FadeMove", c.c() + " views = null");
            return;
        }
        C1807e c1807e7 = new C1807e();
        C1807e c1807e8 = new C1807e();
        c1807e7.f(Float.valueOf(motionEffect.f8812D), ViewHierarchyNode.JsonKeys.ALPHA);
        c1807e8.f(Float.valueOf(motionEffect.f8812D), ViewHierarchyNode.JsonKeys.ALPHA);
        int i9 = motionEffect.f8813E;
        c1807e7.f18259a = i9;
        c1807e8.f18259a = motionEffect.f8814F;
        i iVar = new i();
        iVar.f18259a = i9;
        int i10 = 0;
        iVar.f18288m = 0;
        iVar.f(0, "percentX");
        iVar.f(0, "percentY");
        i iVar2 = new i();
        iVar2.f18259a = motionEffect.f8814F;
        iVar2.f18288m = 0;
        iVar2.f(1, "percentX");
        iVar2.f(1, "percentY");
        C1807e c1807e9 = null;
        if (motionEffect.f8815G > 0) {
            c1807e = new C1807e();
            c1807e2 = new C1807e();
            c1807e.f(Integer.valueOf(motionEffect.f8815G), "translationX");
            c1807e.f18259a = motionEffect.f8814F;
            c1807e2.f(0, "translationX");
            c1807e2.f18259a = motionEffect.f8814F - 1;
        } else {
            c1807e = null;
            c1807e2 = null;
        }
        if (motionEffect.f8816H > 0) {
            c1807e9 = new C1807e();
            c1807e3 = new C1807e();
            c1807e9.f(Integer.valueOf(motionEffect.f8816H), "translationY");
            c1807e9.f18259a = motionEffect.f8814F;
            c1807e3.f(0, "translationY");
            c1807e3.f18259a = motionEffect.f8814F - 1;
        } else {
            c1807e3 = null;
        }
        int i11 = motionEffect.f8819K;
        if (i11 == -1) {
            int[] iArr = new int[4];
            int i12 = 0;
            while (i12 < j.length) {
                n nVar = (n) hashMap2.get(j[i12]);
                if (nVar == null) {
                    c1807e6 = c1807e3;
                } else {
                    w wVar = nVar.f18321g;
                    float f7 = wVar.f18384e;
                    w wVar2 = nVar.f18320f;
                    c1807e6 = c1807e3;
                    float f8 = f7 - wVar2.f18384e;
                    float f9 = wVar.f18385f - wVar2.f18385f;
                    if (f9 < 0.0f) {
                        i8 = 1;
                        iArr[1] = iArr[1] + 1;
                    } else {
                        i8 = 1;
                    }
                    if (f9 > 0.0f) {
                        iArr[0] = iArr[0] + i8;
                    }
                    if (f8 > 0.0f) {
                        iArr[3] = iArr[3] + i8;
                    }
                    if (f8 < 0.0f) {
                        iArr[2] = iArr[2] + i8;
                    }
                }
                i12++;
                c1807e3 = c1807e6;
                i10 = 0;
            }
            c1807e4 = c1807e3;
            int i13 = iArr[i10];
            i11 = i10;
            for (int i14 = 1; i14 < 4; i14++) {
                int i15 = iArr[i14];
                if (i13 < i15) {
                    i13 = i15;
                    i11 = i14;
                }
            }
        } else {
            c1807e4 = c1807e3;
        }
        int i16 = 0;
        while (i16 < j.length) {
            n nVar2 = (n) hashMap2.get(j[i16]);
            if (nVar2 != null) {
                w wVar3 = nVar2.f18321g;
                float f10 = wVar3.f18384e;
                w wVar4 = nVar2.f18320f;
                float f11 = f10 - wVar4.f18384e;
                float f12 = wVar3.f18385f - wVar4.f18385f;
                if (i11 == 0) {
                    if (f12 > 0.0f) {
                        if (motionEffect.f8817I) {
                        }
                    }
                    i7 = motionEffect.f8818J;
                    if (i7 != -1) {
                        nVar2.a(c1807e7);
                        nVar2.a(c1807e8);
                        nVar2.a(iVar);
                        nVar2.a(iVar2);
                        if (motionEffect.f8815G > 0) {
                            nVar2.a(c1807e);
                            nVar2.a(c1807e2);
                        }
                        if (motionEffect.f8816H > 0) {
                            nVar2.a(c1807e9);
                            c1807e5 = c1807e4;
                            nVar2.a(c1807e5);
                        } else {
                            c1807e5 = c1807e4;
                        }
                    } else {
                        c1807e5 = c1807e4;
                        z zVar = motionLayout.f8834J;
                        if (zVar != null) {
                            Iterator it = ((ArrayList) zVar.f18424q.f3680d).iterator();
                            while (it.hasNext()) {
                                D d7 = (D) it.next();
                                viewArr = j;
                                if (d7.f18239a == i7) {
                                    ArrayList arrayList = (ArrayList) d7.f18244f.f18279a.get(-1);
                                    if (arrayList != null) {
                                        nVar2.f18336w.addAll(arrayList);
                                    }
                                    i16++;
                                    motionEffect = this;
                                    hashMap2 = hashMap;
                                    c1807e4 = c1807e5;
                                    j = viewArr;
                                } else {
                                    j = viewArr;
                                }
                            }
                        }
                    }
                    viewArr = j;
                    i16++;
                    motionEffect = this;
                    hashMap2 = hashMap;
                    c1807e4 = c1807e5;
                    j = viewArr;
                } else if (i11 == 1) {
                    if (f12 < 0.0f) {
                        if (motionEffect.f8817I) {
                        }
                    }
                    i7 = motionEffect.f8818J;
                    if (i7 != -1) {
                    }
                    viewArr = j;
                    i16++;
                    motionEffect = this;
                    hashMap2 = hashMap;
                    c1807e4 = c1807e5;
                    j = viewArr;
                } else if (i11 != 2) {
                    if (i11 == 3) {
                        if (f11 > 0.0f) {
                            if (motionEffect.f8817I) {
                            }
                        }
                    }
                    i7 = motionEffect.f8818J;
                    if (i7 != -1) {
                    }
                    viewArr = j;
                    i16++;
                    motionEffect = this;
                    hashMap2 = hashMap;
                    c1807e4 = c1807e5;
                    j = viewArr;
                } else if (f11 >= 0.0f || (motionEffect.f8817I && f12 != 0.0f)) {
                    i7 = motionEffect.f8818J;
                    if (i7 != -1) {
                    }
                    viewArr = j;
                    i16++;
                    motionEffect = this;
                    hashMap2 = hashMap;
                    c1807e4 = c1807e5;
                    j = viewArr;
                }
            }
            viewArr = j;
            c1807e5 = c1807e4;
            i16++;
            motionEffect = this;
            hashMap2 = hashMap;
            c1807e4 = c1807e5;
            j = viewArr;
        }
    }
}
