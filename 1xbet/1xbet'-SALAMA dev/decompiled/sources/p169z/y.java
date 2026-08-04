package p169z;

import B.m;
import B.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f18403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f18406i;
    public final z j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f18407k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public B f18408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f18409m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f18410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f18411o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f18412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f18413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f18414r;

    public y(z zVar, y yVar) {
        this.f18398a = -1;
        this.f18399b = false;
        this.f18400c = -1;
        this.f18401d = -1;
        this.f18402e = 0;
        this.f18403f = null;
        this.f18404g = -1;
        this.f18405h = 400;
        this.f18406i = 0.0f;
        this.f18407k = new ArrayList();
        this.f18408l = null;
        this.f18409m = new ArrayList();
        this.f18410n = 0;
        this.f18411o = false;
        this.f18412p = -1;
        this.f18413q = 0;
        this.f18414r = 0;
        this.j = zVar;
        this.f18405h = zVar.j;
        if (yVar != null) {
            this.f18412p = yVar.f18412p;
            this.f18402e = yVar.f18402e;
            this.f18403f = yVar.f18403f;
            this.f18404g = yVar.f18404g;
            this.f18405h = yVar.f18405h;
            this.f18407k = yVar.f18407k;
            this.f18406i = yVar.f18406i;
            this.f18413q = yVar.f18413q;
        }
    }

    public y(z zVar, int i7) {
        this.f18398a = -1;
        this.f18399b = false;
        this.f18400c = -1;
        this.f18401d = -1;
        this.f18402e = 0;
        this.f18403f = null;
        this.f18404g = -1;
        this.f18405h = 400;
        this.f18406i = 0.0f;
        this.f18407k = new ArrayList();
        this.f18408l = null;
        this.f18409m = new ArrayList();
        this.f18410n = 0;
        this.f18411o = false;
        this.f18412p = -1;
        this.f18413q = 0;
        this.f18414r = 0;
        this.f18398a = -1;
        this.j = zVar;
        this.f18401d = R.id.view_transition;
        this.f18400c = i7;
        this.f18405h = zVar.j;
        this.f18413q = zVar.f18424k;
    }

    public y(z zVar, Context context, XmlResourceParser xmlResourceParser) {
        this.f18398a = -1;
        this.f18399b = false;
        this.f18400c = -1;
        this.f18401d = -1;
        this.f18402e = 0;
        this.f18403f = null;
        this.f18404g = -1;
        this.f18405h = 400;
        this.f18406i = 0.0f;
        this.f18407k = new ArrayList();
        this.f18408l = null;
        this.f18409m = new ArrayList();
        this.f18410n = 0;
        this.f18411o = false;
        this.f18412p = -1;
        this.f18413q = 0;
        this.f18414r = 0;
        this.f18405h = zVar.j;
        this.f18413q = zVar.f18424k;
        this.j = zVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f926A);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            SparseArray sparseArray = zVar.f18421g;
            if (index == 2) {
                this.f18400c = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f18400c);
                if ("layout".equals(resourceTypeName)) {
                    m mVar = new m();
                    mVar.j(this.f18400c, context);
                    sparseArray.append(this.f18400c, mVar);
                } else if ("xml".equals(resourceTypeName)) {
                    this.f18400c = zVar.j(this.f18400c, context);
                }
            } else if (index == 3) {
                this.f18401d = typedArrayObtainStyledAttributes.getResourceId(index, this.f18401d);
                String resourceTypeName2 = context.getResources().getResourceTypeName(this.f18401d);
                if ("layout".equals(resourceTypeName2)) {
                    m mVar2 = new m();
                    mVar2.j(this.f18401d, context);
                    sparseArray.append(this.f18401d, mVar2);
                } else if ("xml".equals(resourceTypeName2)) {
                    this.f18401d = zVar.j(this.f18401d, context);
                }
            } else if (index == 6) {
                int i8 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i8 == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f18404g = resourceId;
                    if (resourceId != -1) {
                        this.f18402e = -2;
                    }
                } else if (i8 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f18403f = string;
                    if (string != null) {
                        if (string.indexOf("/") > 0) {
                            this.f18404g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f18402e = -2;
                        } else {
                            this.f18402e = -1;
                        }
                    }
                } else {
                    this.f18402e = typedArrayObtainStyledAttributes.getInteger(index, this.f18402e);
                }
            } else if (index == 4) {
                int i9 = typedArrayObtainStyledAttributes.getInt(index, this.f18405h);
                this.f18405h = i9;
                if (i9 < 8) {
                    this.f18405h = 8;
                }
            } else if (index == 8) {
                this.f18406i = typedArrayObtainStyledAttributes.getFloat(index, this.f18406i);
            } else if (index == 1) {
                this.f18410n = typedArrayObtainStyledAttributes.getInteger(index, this.f18410n);
            } else if (index == 0) {
                this.f18398a = typedArrayObtainStyledAttributes.getResourceId(index, this.f18398a);
            } else if (index == 9) {
                this.f18411o = typedArrayObtainStyledAttributes.getBoolean(index, this.f18411o);
            } else if (index == 7) {
                this.f18412p = typedArrayObtainStyledAttributes.getInteger(index, -1);
            } else if (index == 5) {
                this.f18413q = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 10) {
                this.f18414r = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        if (this.f18401d == -1) {
            this.f18399b = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
