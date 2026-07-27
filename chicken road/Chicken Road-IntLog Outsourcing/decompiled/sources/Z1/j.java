package Z1;

import a2.C0180a;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final long f3771b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f3772c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static j f3773d;

    /* renamed from: a, reason: collision with root package name */
    public final W1.e f3774a;

    public j(W1.e eVar) {
        this.f3774a = eVar;
    }

    public final boolean a(C0180a c0180a) {
        if (TextUtils.isEmpty(c0180a.f3850c)) {
            return true;
        }
        long j2 = c0180a.f3853f + c0180a.f3852e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f3774a.getClass();
        return j2 < timeUnit.toSeconds(System.currentTimeMillis()) + f3771b;
    }
}
