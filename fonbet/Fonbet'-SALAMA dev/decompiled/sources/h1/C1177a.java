package h1;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import d1.n;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1177a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f13348b = n.g("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f13349a;

    public C1177a(Context context) {
        this.f13349a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
