package Y5;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f7818a = new String[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f7819b = Charset.forName("UTF-8");

    public static Object[] a(Object[] objArr, Object[] objArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            int length = objArr2.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    Object obj2 = objArr2[i7];
                    if (obj.equals(obj2)) {
                        arrayList.add(obj2);
                        break;
                    }
                    i7++;
                }
            }
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) String.class, arrayList.size()));
    }
}
