package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: p.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1525l {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f15650a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f15651b;

    public C1525l(Intent intent, Bundle bundle) {
        this.f15650a = intent;
        this.f15651b = bundle;
    }

    public final void a(Context context, Uri uri) {
        Intent intent = this.f15650a;
        intent.setData(uri);
        G.h.startActivity(context, intent, this.f15651b);
    }
}
