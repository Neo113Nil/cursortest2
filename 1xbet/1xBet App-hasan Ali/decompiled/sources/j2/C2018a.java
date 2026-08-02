package j2;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import f2.m;

/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2018a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f17491b = m.f("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f17492a;

    public C2018a(Context context) {
        this.f17492a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
