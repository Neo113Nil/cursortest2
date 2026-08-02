package androidx.browser.trusted;

import android.net.Uri;
import androidx.media3.common.util.Consumer;
import androidx.media3.session.MediaBrowser;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((TrustedWebActivityServiceConnectionPool) this.b).lambda$connect$0((Uri) this.c);
                break;
            default:
                ((Consumer) this.b).accept((MediaBrowser.Listener) this.c);
                break;
        }
    }
}
