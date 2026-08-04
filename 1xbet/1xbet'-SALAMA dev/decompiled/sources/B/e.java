package B;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f777b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f779d;

    public e(Context context, XmlResourceParser xmlResourceParser) {
        this.f778c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f952x);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == 0) {
                this.f776a = typedArrayObtainStyledAttributes.getResourceId(index, this.f776a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f778c);
                this.f778c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    m mVar = new m();
                    this.f779d = mVar;
                    mVar.e(resourceId, context);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
