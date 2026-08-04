package p109p;

import G.h;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f15656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f15657b;

    public l(Intent intent, Bundle bundle) {
        this.f15656a = intent;
        this.f15657b = bundle;
    }

    public final void a(Context context, Uri uri) {
        Intent intent = this.f15656a;
        intent.setData(uri);
        h.startActivity(context, intent, this.f15657b);
    }
}
