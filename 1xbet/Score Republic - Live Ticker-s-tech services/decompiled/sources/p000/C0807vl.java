package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;

/* JADX INFO: renamed from: vl */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0807vl {

    /* JADX INFO: renamed from: a */
    public final float f8212a;

    /* JADX INFO: renamed from: b */
    public final float f8213b;

    /* JADX INFO: renamed from: c */
    public final float f8214c;

    /* JADX INFO: renamed from: d */
    public final float f8215d;

    /* JADX INFO: renamed from: e */
    public final int f8216e;

    public C0807vl(Context context, XmlResourceParser xmlResourceParser) {
        this.f8212a = Float.NaN;
        this.f8213b = Float.NaN;
        this.f8214c = Float.NaN;
        this.f8215d = Float.NaN;
        this.f8216e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), iz0.f3759j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f8216e);
                this.f8216e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C0103cm().m972a(context, resourceId);
                }
            } else if (index == 1) {
                this.f8215d = typedArrayObtainStyledAttributes.getDimension(index, this.f8215d);
            } else if (index == 2) {
                this.f8213b = typedArrayObtainStyledAttributes.getDimension(index, this.f8213b);
            } else if (index == 3) {
                this.f8214c = typedArrayObtainStyledAttributes.getDimension(index, this.f8214c);
            } else if (index == 4) {
                this.f8212a = typedArrayObtainStyledAttributes.getDimension(index, this.f8212a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
