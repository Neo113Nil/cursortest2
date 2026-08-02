package A1;

import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f277a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f278b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (V.class) {
            if (f277a.add(str)) {
                f278b += ", " + str;
            }
        }
    }
}
