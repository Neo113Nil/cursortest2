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
import p115p6.c;
import p169z.C1064e;
import p169z.D;
import p169z.i;
import p169z.n;
import p169z.w;
import p169z.z;

/* JADX INFO: loaded from: classes.dex */
public class MotionEffect extends MotionHelper {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final float f8812D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f8813E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f8814F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f8815G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f8816H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f8817I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f8818J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
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
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f943o);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == 3) {
                    int i9 = typedArrayObtainStyledAttributes.getInt(index, this.f8813E);
                    this.f8813E = i9;
                    this.f8813E = Math.max(Math.min(i9, 99), 0);
                } else if (index == 1) {
                    int i10 = typedArrayObtainStyledAttributes.getInt(index, this.f8814F);
                    this.f8814F = i10;
                    this.f8814F = Math.max(Math.min(i10, 99), 0);
                } else if (index == 5) {
                    this.f8815G = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8815G);
                } else if (index == 6) {
                    this.f8816H = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8816H);
                } else if (index == 0) {
                    this.f8812D = typedArrayObtainStyledAttributes.getFloat(index, this.f8812D);
                } else if (index == 2) {
                    this.f8819K = typedArrayObtainStyledAttributes.getInt(index, this.f8819K);
                } else if (index == 4) {
                    this.f8817I = typedArrayObtainStyledAttributes.getBoolean(index, this.f8817I);
                } else if (index == 7) {
                    this.f8818J = typedArrayObtainStyledAttributes.getResourceId(index, this.f8818J);
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
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:101:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:106:0x0206  */
    /* JADX WARN: Code duplicated, block: B:110:0x0225  */
    /* JADX WARN: Code duplicated, block: B:111:0x022b A[LOOP:3: B:104:0x0200->B:111:0x022b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:123:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x015e  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01dd  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0181, code lost:
    
        if (r14 == 0.0f) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0197, code lost:
    
        if (r14 == 0.0f) goto L60;
     */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(MotionLayout motionLayout, HashMap map) {
        C1064e c1064e;
        C1064e c1064e2;
        C1064e c1064e3;
        C1064e c1064e4;
        int i7;
        C1064e c1064e5;
        z zVar;
        Iterator it;
        D d7;
        View[] viewArr;
        ArrayList arrayList;
        C1064e c1064e6;
        int i8;
        MotionEffect motionEffect = this;
        HashMap map2 = map;
        View[] viewArrJ = motionEffect.j((ConstraintLayout) getParent());
        if (viewArrJ == null) {
            Log.v("FadeMove", c.c() + " views = null");
            return;
        }
        C1064e c1064e7 = new C1064e();
        C1064e c1064e8 = new C1064e();
        c1064e7.f(Float.valueOf(motionEffect.f8812D), ViewHierarchyNode.JsonKeys.ALPHA);
        c1064e8.f(Float.valueOf(motionEffect.f8812D), ViewHierarchyNode.JsonKeys.ALPHA);
        int i9 = motionEffect.f8813E;
        c1064e7.f18265a = i9;
        c1064e8.f18265a = motionEffect.f8814F;
        i iVar = new i();
        iVar.f18265a = i9;
        int i10 = 0;
        iVar.f18294m = 0;
        iVar.f(0, "percentX");
        iVar.f(0, "percentY");
        i iVar2 = new i();
        iVar2.f18265a = motionEffect.f8814F;
        iVar2.f18294m = 0;
        iVar2.f(1, "percentX");
        iVar2.f(1, "percentY");
        C1064e c1064e9 = null;
        if (motionEffect.f8815G > 0) {
            c1064e = new C1064e();
            c1064e2 = new C1064e();
            c1064e.f(Integer.valueOf(motionEffect.f8815G), "translationX");
            c1064e.f18265a = motionEffect.f8814F;
            c1064e2.f(0, "translationX");
            c1064e2.f18265a = motionEffect.f8814F - 1;
        } else {
            c1064e = null;
            c1064e2 = null;
        }
        if (motionEffect.f8816H > 0) {
            c1064e9 = new C1064e();
            c1064e3 = new C1064e();
            c1064e9.f(Integer.valueOf(motionEffect.f8816H), "translationY");
            c1064e9.f18265a = motionEffect.f8814F;
            c1064e3.f(0, "translationY");
            c1064e3.f18265a = motionEffect.f8814F - 1;
        } else {
            c1064e3 = null;
        }
        int i11 = motionEffect.f8819K;
        if (i11 == -1) {
            int[] iArr = new int[4];
            int i12 = 0;
            while (i12 < viewArrJ.length) {
                n nVar = (n) map2.get(viewArrJ[i12]);
                if (nVar == null) {
                    c1064e6 = c1064e3;
                } else {
                    w wVar = nVar.f18327g;
                    float f7 = wVar.f18390e;
                    w wVar2 = nVar.f18326f;
                    c1064e6 = c1064e3;
                    float f8 = f7 - wVar2.f18390e;
                    float f9 = wVar.f18391f - wVar2.f18391f;
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
                c1064e3 = c1064e6;
                i10 = 0;
            }
            c1064e4 = c1064e3;
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
            c1064e4 = c1064e3;
        }
        int i16 = 0;
        while (i16 < viewArrJ.length) {
            n nVar2 = (n) map2.get(viewArrJ[i16]);
            if (nVar2 == null) {
                viewArr = viewArrJ;
                c1064e5 = c1064e4;
            } else {
                w wVar3 = nVar2.f18327g;
                float f10 = wVar3.f18390e;
                w wVar4 = nVar2.f18326f;
                float f11 = f10 - wVar4.f18390e;
                float f12 = wVar3.f18391f - wVar4.f18391f;
                if (i11 == 0) {
                    if (f12 > 0.0f) {
                        if (motionEffect.f8817I) {
                        }
                        viewArr = viewArrJ;
                        c1064e5 = c1064e4;
                    }
                    i7 = motionEffect.f8818J;
                    if (i7 == -1) {
                        nVar2.a(c1064e7);
                        nVar2.a(c1064e8);
                        nVar2.a(iVar);
                        nVar2.a(iVar2);
                        if (motionEffect.f8815G > 0) {
                            nVar2.a(c1064e);
                            nVar2.a(c1064e2);
                        }
                        if (motionEffect.f8816H > 0) {
                            nVar2.a(c1064e9);
                            c1064e5 = c1064e4;
                            nVar2.a(c1064e5);
                        } else {
                            c1064e5 = c1064e4;
                        }
                    } else {
                        c1064e5 = c1064e4;
                        zVar = motionLayout.f8834J;
                        if (zVar != null) {
                            it = ((ArrayList) zVar.f18430q.f3680d).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    d7 = (D) it.next();
                                    viewArr = viewArrJ;
                                    if (d7.f18245a == i7) {
                                        arrayList = (ArrayList) d7.f18250f.f18285a.get(-1);
                                        if (arrayList != null) {
                                            nVar2.f18342w.addAll(arrayList);
                                        }
                                    } else {
                                        viewArrJ = viewArr;
                                    }
                                }
                            }
                        }
                    }
                    viewArr = viewArrJ;
                } else if (i11 == 1) {
                    if (f12 < 0.0f) {
                        if (motionEffect.f8817I) {
                        }
                        viewArr = viewArrJ;
                        c1064e5 = c1064e4;
                    }
                    i7 = motionEffect.f8818J;
                    if (i7 == -1) {
                        nVar2.a(c1064e7);
                        nVar2.a(c1064e8);
                        nVar2.a(iVar);
                        nVar2.a(iVar2);
                        if (motionEffect.f8815G > 0) {
                            nVar2.a(c1064e);
                            nVar2.a(c1064e2);
                        }
                        if (motionEffect.f8816H > 0) {
                            nVar2.a(c1064e9);
                            c1064e5 = c1064e4;
                            nVar2.a(c1064e5);
                        } else {
                            c1064e5 = c1064e4;
                        }
                    } else {
                        c1064e5 = c1064e4;
                        zVar = motionLayout.f8834J;
                        if (zVar != null) {
                            it = ((ArrayList) zVar.f18430q.f3680d).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    d7 = (D) it.next();
                                    viewArr = viewArrJ;
                                    if (d7.f18245a == i7) {
                                        arrayList = (ArrayList) d7.f18250f.f18285a.get(-1);
                                        if (arrayList != null) {
                                            nVar2.f18342w.addAll(arrayList);
                                        }
                                    } else {
                                        viewArrJ = viewArr;
                                    }
                                }
                            }
                        }
                    }
                    viewArr = viewArrJ;
                } else if (i11 == 2) {
                    if (f11 >= 0.0f || (motionEffect.f8817I && f12 != 0.0f)) {
                        i7 = motionEffect.f8818J;
                        if (i7 == -1) {
                            nVar2.a(c1064e7);
                            nVar2.a(c1064e8);
                            nVar2.a(iVar);
                            nVar2.a(iVar2);
                            if (motionEffect.f8815G > 0) {
                                nVar2.a(c1064e);
                                nVar2.a(c1064e2);
                            }
                            if (motionEffect.f8816H > 0) {
                                nVar2.a(c1064e9);
                                c1064e5 = c1064e4;
                                nVar2.a(c1064e5);
                            } else {
                                c1064e5 = c1064e4;
                            }
                        } else {
                            c1064e5 = c1064e4;
                            zVar = motionLayout.f8834J;
                            if (zVar != null) {
                                it = ((ArrayList) zVar.f18430q.f3680d).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        d7 = (D) it.next();
                                        viewArr = viewArrJ;
                                        if (d7.f18245a == i7) {
                                            arrayList = (ArrayList) d7.f18250f.f18285a.get(-1);
                                            if (arrayList != null) {
                                                nVar2.f18342w.addAll(arrayList);
                                            }
                                        } else {
                                            viewArrJ = viewArr;
                                        }
                                    }
                                }
                            }
                        }
                        viewArr = viewArrJ;
                    } else {
                        viewArr = viewArrJ;
                        c1064e5 = c1064e4;
                    }
                } else if (i11 != 3 || f11 <= 0.0f || (motionEffect.f8817I && f12 != 0.0f)) {
                    i7 = motionEffect.f8818J;
                    if (i7 == -1) {
                        nVar2.a(c1064e7);
                        nVar2.a(c1064e8);
                        nVar2.a(iVar);
                        nVar2.a(iVar2);
                        if (motionEffect.f8815G > 0) {
                            nVar2.a(c1064e);
                            nVar2.a(c1064e2);
                        }
                        if (motionEffect.f8816H > 0) {
                            nVar2.a(c1064e9);
                            c1064e5 = c1064e4;
                            nVar2.a(c1064e5);
                        } else {
                            c1064e5 = c1064e4;
                        }
                    } else {
                        c1064e5 = c1064e4;
                        zVar = motionLayout.f8834J;
                        if (zVar != null) {
                            it = ((ArrayList) zVar.f18430q.f3680d).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    d7 = (D) it.next();
                                    viewArr = viewArrJ;
                                    if (d7.f18245a == i7) {
                                        arrayList = (ArrayList) d7.f18250f.f18285a.get(-1);
                                        if (arrayList != null) {
                                            nVar2.f18342w.addAll(arrayList);
                                        }
                                    } else {
                                        viewArrJ = viewArr;
                                    }
                                }
                            }
                        }
                    }
                    viewArr = viewArrJ;
                } else {
                    viewArr = viewArrJ;
                    c1064e5 = c1064e4;
                }
            }
            i16++;
            motionEffect = this;
            map2 = map;
            c1064e4 = c1064e5;
            viewArrJ = viewArr;
        }
    }
}
