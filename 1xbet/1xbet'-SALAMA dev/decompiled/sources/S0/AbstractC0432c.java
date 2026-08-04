package S0;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: renamed from: S0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0432c implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f6236c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6238b;

    public AbstractC0432c(String str, String str2) {
        this.f6237a = str;
        this.f6238b = str2;
        f6236c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = AbstractC0430a.f6234a;
        String str = this.f6238b;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if ("eng".equals(str2) || "userdebug".equals(str2)) {
                if (hashSet.contains(str + ":dev")) {
                }
            }
            return false;
        }
        return true;
    }
}
