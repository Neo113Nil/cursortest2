package R5;

import android.webkit.DownloadListener;

/* renamed from: R5.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0420p implements DownloadListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0421q f6202a;

    public C0420p(C0421q c0421q) {
        this.f6202a = c0421q;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        C0421q c0421q = this.f6202a;
        c0421q.f6203a.l(new RunnableC0419o(this, str, str2, str3, str4, j));
    }
}
