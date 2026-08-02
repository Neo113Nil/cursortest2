package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f41682a;

    /* renamed from: b, reason: collision with root package name */
    int f41683b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f41684c = -1;

    /* renamed from: d, reason: collision with root package name */
    private SparseArray<a> f41685d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    private SparseArray<d> f41686e = new SparseArray<>();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f41687a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<b> f41688b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        int f41689c;

        /* renamed from: d, reason: collision with root package name */
        d f41690d;

        public a(Context context, XmlResourceParser xmlResourceParser) {
            this.f41689c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), i.f41862s);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 0) {
                    this.f41687a = obtainStyledAttributes.getResourceId(index, this.f41687a);
                } else if (index == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f41689c);
                    this.f41689c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f41690d = dVar;
                        dVar.p((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        float f41691a;

        /* renamed from: b, reason: collision with root package name */
        float f41692b;

        /* renamed from: c, reason: collision with root package name */
        float f41693c;

        /* renamed from: d, reason: collision with root package name */
        float f41694d;

        /* renamed from: e, reason: collision with root package name */
        int f41695e;

        /* renamed from: f, reason: collision with root package name */
        d f41696f;

        public b(Context context, XmlResourceParser xmlResourceParser) {
            this.f41691a = Float.NaN;
            this.f41692b = Float.NaN;
            this.f41693c = Float.NaN;
            this.f41694d = Float.NaN;
            this.f41695e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), i.f41866w);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f41695e);
                    this.f41695e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f41696f = dVar;
                        dVar.p((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f41694d = obtainStyledAttributes.getDimension(index, this.f41694d);
                } else if (index == 2) {
                    this.f41692b = obtainStyledAttributes.getDimension(index, this.f41692b);
                } else if (index == 3) {
                    this.f41693c = obtainStyledAttributes.getDimension(index, this.f41693c);
                } else if (index == 4) {
                    this.f41691a = obtainStyledAttributes.getDimension(index, this.f41691a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        final boolean a(float f7, float f11) {
            float f12 = this.f41691a;
            if (!Float.isNaN(f12) && f7 < f12) {
                return false;
            }
            float f13 = this.f41692b;
            if (!Float.isNaN(f13) && f11 < f13) {
                return false;
            }
            float f14 = this.f41693c;
            if (!Float.isNaN(f14) && f7 > f14) {
                return false;
            }
            float f15 = this.f41694d;
            return Float.isNaN(f15) || f11 <= f15;
        }
    }

    c(Context context, ConstraintLayout constraintLayout, int i11) {
        this.f41682a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            int eventType = xml.getEventType();
            a aVar = null;
            while (true) {
                char c11 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c11 = 4;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c11 = 2;
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
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c11 = 0;
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
                        aVar = new a(context, xml);
                        this.f41685d.put(aVar.f41687a, aVar);
                    } else if (c11 == 3) {
                        b bVar = new b(context, xml);
                        if (aVar != null) {
                            aVar.f41688b.add(bVar);
                        }
                    } else if (c11 == 4) {
                        a(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }

    private void a(Context context, XmlResourceParser xmlResourceParser) {
        d dVar = new d();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i11 = 0; i11 < attributeCount; i11++) {
            String attributeName = xmlResourceParser.getAttributeName(i11);
            String attributeValue = xmlResourceParser.getAttributeValue(i11);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.Q(context, xmlResourceParser);
                this.f41686e.put(identifier, dVar);
                return;
            }
        }
    }

    public final void b(float f7, int i11, float f11) {
        int i12 = this.f41683b;
        SparseArray<a> sparseArray = this.f41685d;
        int i13 = 0;
        ConstraintLayout constraintLayout = this.f41682a;
        if (i12 == i11) {
            a valueAt = i11 == -1 ? sparseArray.valueAt(0) : sparseArray.get(i12);
            int i14 = this.f41684c;
            if (i14 == -1 || !valueAt.f41688b.get(i14).a(f7, f11)) {
                while (true) {
                    ArrayList<b> arrayList = valueAt.f41688b;
                    if (i13 >= arrayList.size()) {
                        i13 = -1;
                        break;
                    } else if (arrayList.get(i13).a(f7, f11)) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (this.f41684c == i13) {
                    return;
                }
                ArrayList<b> arrayList2 = valueAt.f41688b;
                d dVar = i13 == -1 ? null : arrayList2.get(i13).f41696f;
                if (i13 != -1) {
                    int i15 = arrayList2.get(i13).f41695e;
                }
                if (dVar == null) {
                    return;
                }
                this.f41684c = i13;
                dVar.f(constraintLayout);
                return;
            }
            return;
        }
        this.f41683b = i11;
        a aVar = sparseArray.get(i11);
        while (true) {
            ArrayList<b> arrayList3 = aVar.f41688b;
            if (i13 >= arrayList3.size()) {
                i13 = -1;
                break;
            } else if (arrayList3.get(i13).a(f7, f11)) {
                break;
            } else {
                i13++;
            }
        }
        ArrayList<b> arrayList4 = aVar.f41688b;
        d dVar2 = i13 == -1 ? aVar.f41690d : arrayList4.get(i13).f41696f;
        if (i13 != -1) {
            int i16 = arrayList4.get(i13).f41695e;
        }
        if (dVar2 != null) {
            this.f41684c = i13;
            dVar2.f(constraintLayout);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i11 + ", dim =" + f7 + ", " + f11);
    }
}
