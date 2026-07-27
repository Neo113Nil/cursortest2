package w0;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import s0.s;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1505a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f12109b = s.f("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f12110a;

    public C1505a(Context context) {
        this.f12110a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
