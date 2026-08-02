package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import r2.C9163a;
import ru.ozon.fintech.ui.input.CounterView;
import v2.C10190e;

/* loaded from: classes8.dex */
public final class e {

    static class a {
        static int a(TypedArray typedArray, int i11) {
            return typedArray.getType(i11);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final d[] f42084a;

        public c(@NonNull d[] dVarArr) {
            this.f42084a = dVarArr;
        }

        @NonNull
        public final d[] a() {
            return this.f42084a;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final String f42085a;

        /* renamed from: b, reason: collision with root package name */
        private final int f42086b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f42087c;

        /* renamed from: d, reason: collision with root package name */
        private final String f42088d;

        /* renamed from: e, reason: collision with root package name */
        private final int f42089e;

        /* renamed from: f, reason: collision with root package name */
        private final int f42090f;

        public d(int i11, int i12, int i13, @NonNull String str, String str2, boolean z11) {
            this.f42085a = str;
            this.f42086b = i11;
            this.f42087c = z11;
            this.f42088d = str2;
            this.f42089e = i12;
            this.f42090f = i13;
        }

        @NonNull
        public final String a() {
            return this.f42085a;
        }

        public final int b() {
            return this.f42090f;
        }

        public final int c() {
            return this.f42089e;
        }

        public final String d() {
            return this.f42088d;
        }

        public final int e() {
            return this.f42086b;
        }

        public final boolean f() {
            return this.f42087c;
        }
    }

    /* renamed from: androidx.core.content.res.e$e, reason: collision with other inner class name */
    public static final class C0767e implements b {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final C10190e f42091a;

        /* renamed from: b, reason: collision with root package name */
        private final int f42092b;

        /* renamed from: c, reason: collision with root package name */
        private final int f42093c;

        /* renamed from: d, reason: collision with root package name */
        private final String f42094d;

        public C0767e(@NonNull C10190e c10190e, int i11, int i12, String str) {
            this.f42091a = c10190e;
            this.f42093c = i11;
            this.f42092b = i12;
            this.f42094d = str;
        }

        public final int a() {
            return this.f42093c;
        }

        @NonNull
        public final C10190e b() {
            return this.f42091a;
        }

        public final String c() {
            return this.f42094d;
        }

        public final int d() {
            return this.f42092b;
        }
    }

    public static b a(@NonNull XmlResourceParser xmlResourceParser, @NonNull Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            c(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C9163a.f82854b);
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(4);
        String string3 = obtainAttributes.getString(5);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int integer = obtainAttributes.getInteger(2, 1);
        int integer2 = obtainAttributes.getInteger(3, CounterView.COUNTER_MAX_DEFAULT);
        String string4 = obtainAttributes.getString(6);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                c(xmlResourceParser);
            }
            return new C0767e(new C10190e(string, string2, string3, b(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C9163a.f82855c);
                    int i11 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z11 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i12 = obtainAttributes2.hasValue(9) ? 9 : 3;
                    String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                    int i13 = obtainAttributes2.getInt(i12, 0);
                    int i14 = obtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = obtainAttributes2.getResourceId(i14, 0);
                    String string6 = obtainAttributes2.getString(i14);
                    obtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        c(xmlResourceParser);
                    }
                    arrayList.add(new d(i11, i13, resourceId2, string6, string5, z11));
                } else {
                    c(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    @NonNull
    public static List<List<byte[]>> b(@NonNull Resources resources, int i11) {
        if (i11 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i11);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a.a(obtainTypedArray, 0) == 1) {
                for (int i12 = 0; i12 < obtainTypedArray.length(); i12++) {
                    int resourceId = obtainTypedArray.getResourceId(i12, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i11);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static void c(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i11 = 1;
        while (i11 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i11++;
            } else if (next == 3) {
                i11--;
            }
        }
    }
}
