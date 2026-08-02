package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    int f41870a;

    /* renamed from: b, reason: collision with root package name */
    private SparseArray<a> f41871b = new SparseArray<>();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f41872a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<b> f41873b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        int f41874c;

        public a(Context context, XmlResourceParser xmlResourceParser) {
            this.f41874c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), i.f41862s);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 0) {
                    this.f41872a = obtainStyledAttributes.getResourceId(index, this.f41872a);
                } else if (index == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f41874c);
                    this.f41874c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        float f41875a;

        /* renamed from: b, reason: collision with root package name */
        float f41876b;

        /* renamed from: c, reason: collision with root package name */
        float f41877c;

        /* renamed from: d, reason: collision with root package name */
        float f41878d;

        /* renamed from: e, reason: collision with root package name */
        int f41879e;

        public b(Context context, XmlResourceParser xmlResourceParser) {
            this.f41875a = Float.NaN;
            this.f41876b = Float.NaN;
            this.f41877c = Float.NaN;
            this.f41878d = Float.NaN;
            this.f41879e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), i.f41866w);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f41879e);
                    this.f41879e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                } else if (index == 1) {
                    this.f41878d = obtainStyledAttributes.getDimension(index, this.f41878d);
                } else if (index == 2) {
                    this.f41876b = obtainStyledAttributes.getDimension(index, this.f41876b);
                } else if (index == 3) {
                    this.f41877c = obtainStyledAttributes.getDimension(index, this.f41877c);
                } else if (index == 4) {
                    this.f41875a = obtainStyledAttributes.getDimension(index, this.f41875a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        final boolean a(float f7, float f11) {
            float f12 = this.f41875a;
            if (!Float.isNaN(f12) && f7 < f12) {
                return false;
            }
            float f13 = this.f41876b;
            if (!Float.isNaN(f13) && f11 < f13) {
                return false;
            }
            float f14 = this.f41877c;
            if (!Float.isNaN(f14) && f7 > f14) {
                return false;
            }
            float f15 = this.f41878d;
            return Float.isNaN(f15) || f11 <= f15;
        }
    }

    public k(Context context, XmlResourceParser xmlResourceParser) {
        this.f41870a = -1;
        new SparseArray();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), i.f41863t);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                this.f41870a = obtainStyledAttributes.getResourceId(index, this.f41870a);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            a aVar = null;
            while (true) {
                char c11 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    if (c11 == 2) {
                        aVar = new a(context, xmlResourceParser);
                        this.f41871b.put(aVar.f41872a, aVar);
                    } else if (c11 == 3) {
                        b bVar = new b(context, xmlResourceParser);
                        if (aVar != null) {
                            aVar.f41873b.add(bVar);
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }

    public final int a(int i11, float f7, float f11, int i12) {
        a aVar = this.f41871b.get(i12);
        if (aVar == null) {
            return i12;
        }
        ArrayList<b> arrayList = aVar.f41873b;
        int i13 = aVar.f41874c;
        if (f7 != -1.0f && f11 != -1.0f) {
            Iterator<b> it = arrayList.iterator();
            b bVar = null;
            while (it.hasNext()) {
                b next = it.next();
                if (next.a(f7, f11)) {
                    if (i11 != next.f41879e) {
                        bVar = next;
                    }
                }
            }
            return bVar != null ? bVar.f41879e : i13;
        }
        if (i13 != i11) {
            Iterator<b> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (i11 == it2.next().f41879e) {
                }
            }
            return i13;
        }
        return i11;
    }

    public final int b(int i11) {
        float f7 = -1;
        SparseArray<a> sparseArray = this.f41871b;
        int i12 = 0;
        if (-1 == i11) {
            a valueAt = i11 == -1 ? sparseArray.valueAt(0) : sparseArray.get(-1);
            if (valueAt != null) {
                while (true) {
                    ArrayList<b> arrayList = valueAt.f41873b;
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (arrayList.get(i12).a(f7, f7)) {
                        break;
                    }
                    i12++;
                }
                if (-1 != i12) {
                    return i12 == -1 ? valueAt.f41874c : valueAt.f41873b.get(i12).f41879e;
                }
            }
        } else {
            a aVar = sparseArray.get(i11);
            if (aVar != null) {
                while (true) {
                    ArrayList<b> arrayList2 = aVar.f41873b;
                    if (i12 >= arrayList2.size()) {
                        i12 = -1;
                        break;
                    }
                    if (arrayList2.get(i12).a(f7, f7)) {
                        break;
                    }
                    i12++;
                }
                return i12 == -1 ? aVar.f41874c : aVar.f41873b.get(i12).f41879e;
            }
        }
        return -1;
    }
}
