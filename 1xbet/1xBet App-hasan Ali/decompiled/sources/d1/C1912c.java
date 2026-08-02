package d1;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: d1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1912c {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f16856a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f16857b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16858c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16859d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16860e;
    public final CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f16861g;

    public C1912c(String str, PendingIntent pendingIntent) {
        IconCompat b3 = IconCompat.b(2131165275);
        Bundle bundle = new Bundle();
        this.f16859d = true;
        this.f16857b = b3;
        if (b3.d() == 2) {
            this.f16860e = b3.c();
        }
        this.f = g.b(str);
        this.f16861g = pendingIntent;
        this.f16856a = bundle;
        this.f16858c = true;
        this.f16859d = true;
    }
}
