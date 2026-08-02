package e2;

import android.os.Build;
import java.util.HashSet;

/* renamed from: e2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1922c implements InterfaceC1926g {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f16903c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f16904a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16905b;

    public AbstractC1922c(String str, String str2) {
        this.f16904a = str;
        this.f16905b = str2;
        f16903c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = AbstractC1920a.f16901a;
        String str = this.f16905b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
    }
}
