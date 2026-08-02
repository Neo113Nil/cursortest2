package B;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final float f959a;

    /* renamed from: b, reason: collision with root package name */
    public final float f960b;

    /* renamed from: c, reason: collision with root package name */
    public final float f961c;

    /* renamed from: d, reason: collision with root package name */
    public final float f962d;

    /* renamed from: e, reason: collision with root package name */
    public final int f963e;

    public u(Context context, XmlResourceParser xmlResourceParser) {
        this.f959a = Float.NaN;
        this.f960b = Float.NaN;
        this.f961c = Float.NaN;
        this.f962d = Float.NaN;
        this.f963e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f927B);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f963e);
                this.f963e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            } else if (index == 1) {
                this.f962d = obtainStyledAttributes.getDimension(index, this.f962d);
            } else if (index == 2) {
                this.f960b = obtainStyledAttributes.getDimension(index, this.f960b);
            } else if (index == 3) {
                this.f961c = obtainStyledAttributes.getDimension(index, this.f961c);
            } else if (index == 4) {
                this.f959a = obtainStyledAttributes.getDimension(index, this.f959a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final boolean a(float f7, float f8) {
        float f9 = this.f959a;
        if (!Float.isNaN(f9) && f7 < f9) {
            return false;
        }
        float f10 = this.f960b;
        if (!Float.isNaN(f10) && f8 < f10) {
            return false;
        }
        float f11 = this.f961c;
        if (!Float.isNaN(f11) && f7 > f11) {
            return false;
        }
        float f12 = this.f962d;
        return Float.isNaN(f12) || f8 <= f12;
    }
}
