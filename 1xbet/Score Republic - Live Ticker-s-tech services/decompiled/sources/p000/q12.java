package p000;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class q12 {

    /* JADX INFO: renamed from: a */
    public final Context f6310a;

    /* JADX INFO: renamed from: b */
    public final Boolean f6311b;

    /* JADX INFO: renamed from: c */
    public final long f6312c;

    /* JADX INFO: renamed from: d */
    public final wv1 f6313d;

    /* JADX INFO: renamed from: e */
    public final boolean f6314e;

    /* JADX INFO: renamed from: f */
    public final Long f6315f;

    /* JADX INFO: renamed from: g */
    public final Long f6316g;

    /* JADX INFO: renamed from: h */
    public final String f6317h;

    public q12(Context context, wv1 wv1Var, Long l, Long l2) {
        this.f6314e = true;
        p80.m3863h(context);
        Context applicationContext = context.getApplicationContext();
        p80.m3863h(applicationContext);
        this.f6310a = applicationContext;
        this.f6315f = l;
        this.f6316g = l2;
        if (wv1Var != null) {
            this.f6313d = wv1Var;
            this.f6314e = wv1Var.f8712l;
            this.f6312c = wv1Var.f8711k;
            this.f6317h = wv1Var.f8714n;
            Bundle bundle = wv1Var.f8713m;
            if (bundle != null) {
                this.f6311b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
