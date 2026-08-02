package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.google.android.material.shape.n;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class m extends n.f {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public m(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // com.google.android.material.shape.n.f
    public final void a(Matrix matrix, com.google.android.material.shadow.a aVar, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((n.f) it.next()).a(this.d, aVar, i, canvas);
        }
    }
}
