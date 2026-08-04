package p053h1;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import p023d1.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f13354b = n.g("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f13355a;

    public a(Context context) {
        this.f13355a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
