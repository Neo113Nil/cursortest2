package D50;

import android.content.Context;
import android.widget.ImageView;
import androidx.lifecycle.D;
import j3.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import xe.B0;
import xe.C10727i;
import xe.H0;
import z50.C10989c;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final D f6085a;

    /* renamed from: b, reason: collision with root package name */
    private long f6086b;

    /* renamed from: c, reason: collision with root package name */
    private long f6087c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f6088d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f6089e;

    /* renamed from: f, reason: collision with root package name */
    private String f6090f;

    /* renamed from: g, reason: collision with root package name */
    private y.c f6091g;

    /* renamed from: h, reason: collision with root package name */
    private B0 f6092h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6093i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f6094j;

    /* renamed from: k, reason: collision with root package name */
    private String f6095k;

    public c(@NotNull D coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f6085a = coroutineScope;
    }

    public final void d(@NotNull y.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        StringBuilder f7 = Kk.c.f("addListener storyPos=", " framePos=", this.f6088d, this.f6089e, " listener=");
        f7.append(listener);
        f7.append(" player=");
        f7.append(this);
        C10989c.a("PicPlayer", f7.toString());
        this.f6091g = listener;
    }

    public final String e() {
        return this.f6095k;
    }

    public final String f() {
        return this.f6090f;
    }

    public final long g() {
        return this.f6087c;
    }

    public final long h() {
        return this.f6086b;
    }

    public final Integer i() {
        return this.f6089e;
    }

    public final String j() {
        return this.f6090f;
    }

    public final Integer k() {
        return this.f6088d;
    }

    public final void l() {
        B0 b02 = this.f6092h;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
    }

    public final void m() {
        if (this.f6093i) {
            B0 b02 = this.f6092h;
            if (b02 != null) {
                ((H0) b02).j(null);
            }
            this.f6092h = C10727i.c(this.f6085a, null, null, new b(this, null), 3);
        }
    }

    public final void n() {
        Integer num = this.f6088d;
        Integer num2 = this.f6089e;
        y.c cVar = this.f6091g;
        StringBuilder f7 = Kk.c.f("actuallyLoad storyPos=", " framePos=", num, num2, " listener=");
        f7.append(cVar);
        f7.append(" player=");
        f7.append(this);
        C10989c.a("PicPlayer", f7.toString());
        y.c cVar2 = this.f6091g;
        if (cVar2 != null) {
            cVar2.onPlaybackStateChanged(2);
        }
        ImageView imageView = this.f6094j;
        if (imageView != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, this.f6095k);
            imageView.setBackgroundColor(parseColor != null ? parseColor.intValue() : 0);
        }
        String str = this.f6090f;
        if (str != null) {
            ImageView imageView2 = this.f6094j;
            if (imageView2 != null) {
                ImageViewExtKt.loadOriginal$default(imageView2, str, null, new a(this), null, false, null, 58, null);
                return;
            }
            return;
        }
        y.c cVar3 = this.f6091g;
        if (cVar3 != null) {
            cVar3.onPlaybackStateChanged(3);
        }
    }

    public final void o() {
        B0 b02 = this.f6092h;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f6087c = this.f6093i ? 0L : this.f6086b;
    }

    public final void p(@NotNull y.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        StringBuilder f7 = Kk.c.f("removeListener storyPos=", " framePos=", this.f6088d, this.f6089e, " listener=");
        f7.append(listener);
        f7.append(" player=");
        f7.append(this);
        C10989c.a("PicPlayer", f7.toString());
        this.f6091g = null;
    }

    public final void q() {
        this.f6087c = this.f6093i ? 0L : this.f6086b;
    }

    public final void r(long j11) {
        this.f6087c = j11;
    }

    public final void s(Integer num) {
        this.f6089e = num;
    }

    public final void t(ImageView imageView) {
        this.f6094j = imageView;
    }

    public final void u(String str, String str2, Long l11, boolean z11) {
        this.f6090f = str;
        this.f6095k = str2;
        this.f6093i = z11;
        long longValue = l11 != null ? l11.longValue() : 7000L;
        this.f6086b = longValue;
        if (z11) {
            return;
        }
        this.f6087c = longValue;
    }

    public final void v(Integer num) {
        this.f6088d = num;
    }

    public final void w() {
        B0 b02 = this.f6092h;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
    }
}
