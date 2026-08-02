package androidx.core.content.res;

import android.graphics.Typeface;
import androidx.core.content.res.g;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g.e f42108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Typeface f42109b;

    public /* synthetic */ h(g.e eVar, Typeface typeface) {
        this.f42108a = eVar;
        this.f42109b = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42108a.c(this.f42109b);
    }
}
