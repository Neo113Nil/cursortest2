package k1;

import android.net.Uri;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f17572a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17573b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17574c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17575d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17576e;
    public final int f;

    public i(Uri uri, int i, int i5, boolean z3, String str, int i6) {
        uri.getClass();
        this.f17572a = uri;
        this.f17573b = i;
        this.f17574c = i5;
        this.f17575d = z3;
        this.f17576e = str;
        this.f = i6;
    }

    public i(String str, String str2) {
        this.f17572a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f17573b = 0;
        this.f17574c = 400;
        this.f17575d = false;
        this.f17576e = str2;
        this.f = 0;
    }
}
