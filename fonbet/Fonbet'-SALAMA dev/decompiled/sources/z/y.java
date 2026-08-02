package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f18392a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18393b;

    /* renamed from: c, reason: collision with root package name */
    public int f18394c;

    /* renamed from: d, reason: collision with root package name */
    public int f18395d;

    /* renamed from: e, reason: collision with root package name */
    public int f18396e;

    /* renamed from: f, reason: collision with root package name */
    public String f18397f;

    /* renamed from: g, reason: collision with root package name */
    public int f18398g;

    /* renamed from: h, reason: collision with root package name */
    public int f18399h;

    /* renamed from: i, reason: collision with root package name */
    public final float f18400i;
    public final z j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f18401k;

    /* renamed from: l, reason: collision with root package name */
    public B f18402l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f18403m;

    /* renamed from: n, reason: collision with root package name */
    public final int f18404n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f18405o;

    /* renamed from: p, reason: collision with root package name */
    public int f18406p;

    /* renamed from: q, reason: collision with root package name */
    public final int f18407q;

    /* renamed from: r, reason: collision with root package name */
    public final int f18408r;

    public y(z zVar, y yVar) {
        this.f18392a = -1;
        this.f18393b = false;
        this.f18394c = -1;
        this.f18395d = -1;
        this.f18396e = 0;
        this.f18397f = null;
        this.f18398g = -1;
        this.f18399h = 400;
        this.f18400i = 0.0f;
        this.f18401k = new ArrayList();
        this.f18402l = null;
        this.f18403m = new ArrayList();
        this.f18404n = 0;
        this.f18405o = false;
        this.f18406p = -1;
        this.f18407q = 0;
        this.f18408r = 0;
        this.j = zVar;
        this.f18399h = zVar.j;
        if (yVar != null) {
            this.f18406p = yVar.f18406p;
            this.f18396e = yVar.f18396e;
            this.f18397f = yVar.f18397f;
            this.f18398g = yVar.f18398g;
            this.f18399h = yVar.f18399h;
            this.f18401k = yVar.f18401k;
            this.f18400i = yVar.f18400i;
            this.f18407q = yVar.f18407q;
        }
    }

    public y(z zVar, int i7) {
        this.f18392a = -1;
        this.f18393b = false;
        this.f18394c = -1;
        this.f18395d = -1;
        this.f18396e = 0;
        this.f18397f = null;
        this.f18398g = -1;
        this.f18399h = 400;
        this.f18400i = 0.0f;
        this.f18401k = new ArrayList();
        this.f18402l = null;
        this.f18403m = new ArrayList();
        this.f18404n = 0;
        this.f18405o = false;
        this.f18406p = -1;
        this.f18407q = 0;
        this.f18408r = 0;
        this.f18392a = -1;
        this.j = zVar;
        this.f18395d = R.id.view_transition;
        this.f18394c = i7;
        this.f18399h = zVar.j;
        this.f18407q = zVar.f18418k;
    }

    public y(z zVar, Context context, XmlResourceParser xmlResourceParser) {
        this.f18392a = -1;
        this.f18393b = false;
        this.f18394c = -1;
        this.f18395d = -1;
        this.f18396e = 0;
        this.f18397f = null;
        this.f18398g = -1;
        this.f18399h = 400;
        this.f18400i = 0.0f;
        this.f18401k = new ArrayList();
        this.f18402l = null;
        this.f18403m = new ArrayList();
        this.f18404n = 0;
        this.f18405o = false;
        this.f18406p = -1;
        this.f18407q = 0;
        this.f18408r = 0;
        this.f18399h = zVar.j;
        this.f18407q = zVar.f18418k;
        this.j = zVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), B.q.f926A);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            SparseArray sparseArray = zVar.f18415g;
            if (index == 2) {
                this.f18394c = obtainStyledAttributes.getResourceId(index, -1);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f18394c);
                if ("layout".equals(resourceTypeName)) {
                    B.m mVar = new B.m();
                    mVar.j(this.f18394c, context);
                    sparseArray.append(this.f18394c, mVar);
                } else if ("xml".equals(resourceTypeName)) {
                    this.f18394c = zVar.j(this.f18394c, context);
                }
            } else if (index == 3) {
                this.f18395d = obtainStyledAttributes.getResourceId(index, this.f18395d);
                String resourceTypeName2 = context.getResources().getResourceTypeName(this.f18395d);
                if ("layout".equals(resourceTypeName2)) {
                    B.m mVar2 = new B.m();
                    mVar2.j(this.f18395d, context);
                    sparseArray.append(this.f18395d, mVar2);
                } else if ("xml".equals(resourceTypeName2)) {
                    this.f18395d = zVar.j(this.f18395d, context);
                }
            } else if (index == 6) {
                int i8 = obtainStyledAttributes.peekValue(index).type;
                if (i8 == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    this.f18398g = resourceId;
                    if (resourceId != -1) {
                        this.f18396e = -2;
                    }
                } else if (i8 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f18397f = string;
                    if (string != null) {
                        if (string.indexOf("/") > 0) {
                            this.f18398g = obtainStyledAttributes.getResourceId(index, -1);
                            this.f18396e = -2;
                        } else {
                            this.f18396e = -1;
                        }
                    }
                } else {
                    this.f18396e = obtainStyledAttributes.getInteger(index, this.f18396e);
                }
            } else if (index == 4) {
                int i9 = obtainStyledAttributes.getInt(index, this.f18399h);
                this.f18399h = i9;
                if (i9 < 8) {
                    this.f18399h = 8;
                }
            } else if (index == 8) {
                this.f18400i = obtainStyledAttributes.getFloat(index, this.f18400i);
            } else if (index == 1) {
                this.f18404n = obtainStyledAttributes.getInteger(index, this.f18404n);
            } else if (index == 0) {
                this.f18392a = obtainStyledAttributes.getResourceId(index, this.f18392a);
            } else if (index == 9) {
                this.f18405o = obtainStyledAttributes.getBoolean(index, this.f18405o);
            } else if (index == 7) {
                this.f18406p = obtainStyledAttributes.getInteger(index, -1);
            } else if (index == 5) {
                this.f18407q = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == 10) {
                this.f18408r = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        if (this.f18395d == -1) {
            this.f18393b = true;
        }
        obtainStyledAttributes.recycle();
    }
}
