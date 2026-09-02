package i1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p.AbstractC0819i;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1365a;

    public l(int i2) {
        switch (i2) {
            case 1:
                this.f1365a = new ArrayList();
                new HashMap();
                new HashMap();
                break;
            default:
                this.f1365a = new ArrayList(20);
                break;
        }
    }

    public void a(String str, String str2) {
        ArrayList arrayList = this.f1365a;
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    public List b() {
        ArrayList arrayList;
        if (this.f1365a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1365a) {
            arrayList = new ArrayList(this.f1365a);
        }
        return arrayList;
    }

    public void c(String str) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1365a;
            if (i2 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i2))) {
                arrayList.remove(i2);
                arrayList.remove(i2);
                i2 -= 2;
            }
            i2 += 2;
        }
    }

    public void d(String str, String str2) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= ' ' || charAt >= 127) {
                Object[] objArr = {Integer.valueOf(charAt), Integer.valueOf(i2), str};
                byte[] bArr = j1.d.f6053a;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", objArr));
            }
        }
        if (str2 == null) {
            throw new NullPointerException(AbstractC0819i.a("value for name ", str, " == null"));
        }
        int length2 = str2.length();
        for (int i3 = 0; i3 < length2; i3++) {
            char charAt2 = str2.charAt(i3);
            if ((charAt2 <= 31 && charAt2 != '\t') || charAt2 >= 127) {
                Object[] objArr2 = {Integer.valueOf(charAt2), Integer.valueOf(i3), str, str2};
                byte[] bArr2 = j1.d.f6053a;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in %s value: %s", objArr2));
            }
        }
        c(str);
        a(str, str2);
    }
}
