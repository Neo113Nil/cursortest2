package sg.bigo.ads.s0;

import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.webkit.ProxyConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.q0.C5447k;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f13297a;
    public boolean b;
    public final ArrayList c;

    public p(ImageView imageView) {
        this.b = false;
        this.c = new ArrayList();
        this.f13297a = imageView;
        imageView.setAdjustViewBounds(true);
    }

    public final void a(z zVar) {
        if (zVar == null) {
            return;
        }
        this.c.add(new WeakReference(zVar));
    }

    public p(ImageView imageView, int i) {
        this.b = false;
        this.c = new ArrayList();
        this.f13297a = imageView;
        imageView.setAdjustViewBounds(true);
        this.b = true;
    }

    public final void a(C5447k c5447k, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if ("res".equalsIgnoreCase(scheme)) {
            try {
                int parseInt = Integer.parseInt(parse.getHost());
                ImageView imageView = this.f13297a;
                imageView.setImageDrawable(AbstractC4944a.c(imageView.getContext(), parseInt));
                return;
            } catch (NumberFormatException unused) {
                return;
            }
        }
        if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
            AbstractC5446j.a(3, null, new l(this, c5447k, str, z, new WeakReference(this.f13297a)), 0L);
        } else if ("file".equalsIgnoreCase(scheme)) {
            AbstractC5446j.a(3, null, new o(this, parse.getPath(), this.f13297a.getContext().getApplicationContext(), new WeakReference(this.f13297a)), 0L);
        }
    }
}
