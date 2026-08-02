package Tf;

import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    static final ArrayList f27152c;

    /* renamed from: a, reason: collision with root package name */
    private String f27153a;

    /* renamed from: b, reason: collision with root package name */
    private String f27154b;

    static {
        ArrayList arrayList = new ArrayList();
        f27152c = arrayList;
        arrayList.add("https://www.mapbox.com/feedback/");
        arrayList.add("https://www.mapbox.com/map-feedback/");
        arrayList.add("https://apps.mapbox.com/feedback/");
    }

    a(String str, String str2) {
        this.f27153a = str;
        this.f27154b = str2;
    }

    public final String a() {
        return this.f27153a;
    }

    public final String b() {
        return this.f27154b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            String str = aVar.f27153a;
            String str2 = this.f27153a;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = aVar.f27154b;
            String str4 = this.f27154b;
            if (str4 != null) {
                return str4.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f27153a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f27154b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
