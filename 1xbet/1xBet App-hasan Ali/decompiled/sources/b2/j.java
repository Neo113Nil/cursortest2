package b2;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import r.C2327e;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f7243a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7244b;

    /* renamed from: c, reason: collision with root package name */
    public float f7245c;

    /* renamed from: d, reason: collision with root package name */
    public float f7246d;

    /* renamed from: e, reason: collision with root package name */
    public float f7247e;
    public float f;

    /* renamed from: g, reason: collision with root package name */
    public float f7248g;

    /* renamed from: h, reason: collision with root package name */
    public float f7249h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f7250j;

    /* renamed from: k, reason: collision with root package name */
    public String f7251k;

    public j() {
        this.f7243a = new Matrix();
        this.f7244b = new ArrayList();
        this.f7245c = 0.0f;
        this.f7246d = 0.0f;
        this.f7247e = 0.0f;
        this.f = 1.0f;
        this.f7248g = 1.0f;
        this.f7249h = 0.0f;
        this.i = 0.0f;
        this.f7250j = new Matrix();
        this.f7251k = null;
    }

    @Override // b2.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f7244b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // b2.k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f7244b;
            if (i >= arrayList.size()) {
                return z3;
            }
            z3 |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f7250j;
        matrix.reset();
        matrix.postTranslate(-this.f7246d, -this.f7247e);
        matrix.postScale(this.f, this.f7248g);
        matrix.postRotate(this.f7245c, 0.0f, 0.0f);
        matrix.postTranslate(this.f7249h + this.f7246d, this.i + this.f7247e);
    }

    public String getGroupName() {
        return this.f7251k;
    }

    public Matrix getLocalMatrix() {
        return this.f7250j;
    }

    public float getPivotX() {
        return this.f7246d;
    }

    public float getPivotY() {
        return this.f7247e;
    }

    public float getRotation() {
        return this.f7245c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.f7248g;
    }

    public float getTranslateX() {
        return this.f7249h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.f7246d) {
            this.f7246d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f7247e) {
            this.f7247e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.f7245c) {
            this.f7245c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f7248g) {
            this.f7248g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f7249h) {
            this.f7249h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(j jVar, C2327e c2327e) {
        h hVar;
        this.f7243a = new Matrix();
        this.f7244b = new ArrayList();
        this.f7245c = 0.0f;
        this.f7246d = 0.0f;
        this.f7247e = 0.0f;
        this.f = 1.0f;
        this.f7248g = 1.0f;
        this.f7249h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f7250j = matrix;
        this.f7251k = null;
        this.f7245c = jVar.f7245c;
        this.f7246d = jVar.f7246d;
        this.f7247e = jVar.f7247e;
        this.f = jVar.f;
        this.f7248g = jVar.f7248g;
        this.f7249h = jVar.f7249h;
        this.i = jVar.i;
        String str = jVar.f7251k;
        this.f7251k = str;
        if (str != null) {
            c2327e.put(str, this);
        }
        matrix.set(jVar.f7250j);
        ArrayList arrayList = jVar.f7244b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f7244b.add(new j((j) obj, c2327e));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f7235e = 0.0f;
                    iVar2.f7236g = 1.0f;
                    iVar2.f7237h = 1.0f;
                    iVar2.i = 0.0f;
                    iVar2.f7238j = 1.0f;
                    iVar2.f7239k = 0.0f;
                    iVar2.f7240l = Paint.Cap.BUTT;
                    iVar2.f7241m = Paint.Join.MITER;
                    iVar2.f7242n = 4.0f;
                    iVar2.f7234d = iVar.f7234d;
                    iVar2.f7235e = iVar.f7235e;
                    iVar2.f7236g = iVar.f7236g;
                    iVar2.f = iVar.f;
                    iVar2.f7254c = iVar.f7254c;
                    iVar2.f7237h = iVar.f7237h;
                    iVar2.i = iVar.i;
                    iVar2.f7238j = iVar.f7238j;
                    iVar2.f7239k = iVar.f7239k;
                    iVar2.f7240l = iVar.f7240l;
                    iVar2.f7241m = iVar.f7241m;
                    iVar2.f7242n = iVar.f7242n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f7244b.add(hVar);
                Object obj2 = hVar.f7253b;
                if (obj2 != null) {
                    c2327e.put(obj2, hVar);
                }
            }
        }
    }
}
