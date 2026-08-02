package p000;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class js0 {

    /* JADX INFO: renamed from: a */
    public final Bundle f4079a;

    /* JADX INFO: renamed from: b */
    public IconCompat f4080b;

    /* JADX INFO: renamed from: c */
    public final boolean f4081c;

    /* JADX INFO: renamed from: d */
    public final boolean f4082d;

    /* JADX INFO: renamed from: e */
    public final int f4083e;

    /* JADX INFO: renamed from: f */
    public final CharSequence f4084f;

    /* JADX INFO: renamed from: g */
    public final PendingIntent f4085g;

    public js0(String str, PendingIntent pendingIntent) {
        IconCompat iconCompatM390a = IconCompat.m390a(2131165275);
        Bundle bundle = new Bundle();
        this.f4082d = true;
        this.f4080b = iconCompatM390a;
        int i = iconCompatM390a.f488a;
        if ((i == -1 ? ((Icon) iconCompatM390a.f489b).getType() : i) == 2) {
            this.f4083e = iconCompatM390a.m391b();
        }
        this.f4084f = ns0.m3584b(str);
        this.f4085g = pendingIntent;
        this.f4079a = bundle;
        this.f4081c = true;
        this.f4082d = true;
    }
}
