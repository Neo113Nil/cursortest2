package p000;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class q40 {

    /* JADX INFO: renamed from: a */
    public final Uri f6367a;

    /* JADX INFO: renamed from: b */
    public final int f6368b;

    /* JADX INFO: renamed from: c */
    public final int f6369c;

    /* JADX INFO: renamed from: d */
    public final boolean f6370d;

    /* JADX INFO: renamed from: e */
    public final String f6371e;

    /* JADX INFO: renamed from: f */
    public final int f6372f;

    public q40(String str, String str2) {
        this.f6367a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f6368b = 0;
        this.f6369c = 400;
        this.f6370d = false;
        this.f6371e = str2;
        this.f6372f = 0;
    }

    public q40(Uri uri, int i, int i2, boolean z, String str, int i3) {
        uri.getClass();
        this.f6367a = uri;
        this.f6368b = i;
        this.f6369c = i2;
        this.f6370d = z;
        this.f6371e = str;
        this.f6372f = i3;
    }
}
