package v;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import u.AbstractC1453A;
import u.C1458F;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f12054a = null;

    public static int a(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : AbstractC1453A.a(new C1458F(context).f11989b) ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }
}
