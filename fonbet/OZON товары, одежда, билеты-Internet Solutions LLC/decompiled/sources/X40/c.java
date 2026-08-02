package X40;

import android.content.Context;
import android.widget.ImageView;
import androidx.lifecycle.D;
import j3.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;
import xe.B0;
import xe.C10727i;
import xe.H0;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final D f34071a;

    /* renamed from: b, reason: collision with root package name */
    private long f34072b;

    /* renamed from: c, reason: collision with root package name */
    private long f34073c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f34074d;

    /* renamed from: e, reason: collision with root package name */
    private y.c f34075e;

    /* renamed from: f, reason: collision with root package name */
    private B0 f34076f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f34077g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f34078h;

    /* renamed from: i, reason: collision with root package name */
    private String f34079i;

    /* renamed from: j, reason: collision with root package name */
    private String f34080j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final a f34081k;

    public c(@NotNull D coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f34071a = coroutineScope;
        this.f34081k = new a(this);
    }

    public final void c(@NotNull y.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        U40.c.a("PicPlayer", "addListener framePos=" + this.f34074d + " listener=" + listener + " player=" + this);
        this.f34075e = listener;
    }

    public final String d() {
        return this.f34080j;
    }

    public final long e() {
        return this.f34073c;
    }

    public final long f() {
        return this.f34072b;
    }

    public final Integer g() {
        return this.f34074d;
    }

    public final String h() {
        return this.f34079i;
    }

    public final void i() {
        B0 b02 = this.f34076f;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
    }

    public final void j() {
        if (this.f34077g) {
            B0 b02 = this.f34076f;
            if (b02 != null) {
                ((H0) b02).j(null);
            }
            this.f34076f = C10727i.c(this.f34071a, null, null, new b(this, null), 3);
        }
    }

    public final void k() {
        U40.c.a("PicPlayer", "actuallyLoad framePos=" + this.f34074d + " listener=" + this.f34075e + " player=" + this);
        y.c cVar = this.f34075e;
        if (cVar != null) {
            cVar.onPlaybackStateChanged(2);
        }
        ImageView imageView = this.f34078h;
        if (imageView != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, this.f34080j);
            imageView.setBackgroundColor(parseColor != null ? parseColor.intValue() : 0);
        }
        if (this.f34079i != null) {
            ImageView imageView2 = this.f34078h;
            if (imageView2 != null) {
                com.bumptech.glide.c.o(imageView2).load(this.f34079i).listener(this.f34081k).into(imageView2);
                return;
            }
            return;
        }
        y.c cVar2 = this.f34075e;
        if (cVar2 != null) {
            cVar2.onPlaybackStateChanged(3);
        }
    }

    public final void l() {
        B0 b02 = this.f34076f;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f34073c = this.f34077g ? 0L : this.f34072b;
    }

    public final void m(@NotNull y.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        U40.c.a("PicPlayer", "removeListener framePos=" + this.f34074d + " listener=" + listener + " player=" + this);
        this.f34075e = null;
    }

    public final void n() {
        this.f34073c = this.f34077g ? 0L : this.f34072b;
    }

    public final void o(long j11) {
        this.f34073c = j11;
    }

    public final void p(Integer num) {
        this.f34074d = num;
    }

    public final void q(ImageView imageView) {
        this.f34078h = imageView;
    }

    public final void r(String str, String str2, Long l11, boolean z11) {
        this.f34079i = str;
        this.f34080j = str2;
        this.f34077g = z11;
        long longValue = l11 != null ? l11.longValue() : 7000L;
        this.f34072b = longValue;
        if (z11) {
            return;
        }
        this.f34073c = longValue;
    }

    public final void s() {
        B0 b02 = this.f34076f;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
    }
}
