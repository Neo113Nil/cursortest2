package b0;

import android.os.Build;
import java.util.HashSet;

/* renamed from: b0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0157c implements InterfaceC0158d {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f2451c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f2452a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2453b;

    public AbstractC0157c(String str, String str2) {
        this.f2452a = str;
        this.f2453b = str2;
        f2451c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = AbstractC0155a.f2449a;
        String str = this.f2453b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return hashSet.contains(sb.toString());
    }
}
