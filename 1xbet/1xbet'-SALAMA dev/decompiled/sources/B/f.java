package B;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f785f;

    public f(Context context, XmlResourceParser xmlResourceParser) {
        this.f780a = Float.NaN;
        this.f781b = Float.NaN;
        this.f782c = Float.NaN;
        this.f783d = Float.NaN;
        this.f784e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f927B);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f784e);
                this.f784e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    m mVar = new m();
                    this.f785f = mVar;
                    mVar.e(resourceId, context);
                }
            } else if (index == 1) {
                this.f783d = typedArrayObtainStyledAttributes.getDimension(index, this.f783d);
            } else if (index == 2) {
                this.f781b = typedArrayObtainStyledAttributes.getDimension(index, this.f781b);
            } else if (index == 3) {
                this.f782c = typedArrayObtainStyledAttributes.getDimension(index, this.f782c);
            } else if (index == 4) {
                this.f780a = typedArrayObtainStyledAttributes.getDimension(index, this.f780a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean a(float f7, float f8) {
        float f9 = this.f780a;
        if (!Float.isNaN(f9) && f7 < f9) {
            return false;
        }
        float f10 = this.f781b;
        if (!Float.isNaN(f10) && f8 < f10) {
            return false;
        }
        float f11 = this.f782c;
        if (!Float.isNaN(f11) && f7 > f11) {
            return false;
        }
        float f12 = this.f783d;
        return Float.isNaN(f12) || f8 <= f12;
    }
}
