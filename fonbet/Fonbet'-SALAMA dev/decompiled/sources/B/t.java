package B;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f956a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f957b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final int f958c;

    public t(Context context, XmlResourceParser xmlResourceParser) {
        this.f958c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f952x);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            if (index == 0) {
                this.f956a = obtainStyledAttributes.getResourceId(index, this.f956a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f958c);
                this.f958c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
