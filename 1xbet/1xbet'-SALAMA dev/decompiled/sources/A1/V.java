package A1;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f277a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f278b = "goog.exo.core";

    public static synchronized void a(String str) {
        if (f277a.add(str)) {
            f278b += ", " + str;
        }
    }
}
