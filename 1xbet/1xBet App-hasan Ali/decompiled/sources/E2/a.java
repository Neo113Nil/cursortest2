package E2;

import a3.AbstractC0467k;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.InterfaceC0477f;
import androidx.lifecycle.InterfaceC0491u;
import androidx.lifecycle.L;
import k1.RunnableC2029a;
import p4.U;

/* loaded from: classes.dex */
public final class a implements InterfaceC0477f {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1397k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final L f1398l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f1399m;

    public a(L l5, U u5) {
        this.f1398l = l5;
        this.f1399m = u5;
    }

    private final /* synthetic */ void a(InterfaceC0491u interfaceC0491u) {
    }

    private final /* synthetic */ void c(InterfaceC0491u interfaceC0491u) {
    }

    private final /* synthetic */ void e(InterfaceC0491u interfaceC0491u) {
    }

    private final /* synthetic */ void g(InterfaceC0491u interfaceC0491u) {
    }

    private final /* synthetic */ void j(InterfaceC0491u interfaceC0491u) {
    }

    @Override // androidx.lifecycle.InterfaceC0477f
    public final void b(InterfaceC0491u interfaceC0491u) {
        switch (this.f1397k) {
            case 0:
                kotlin.jvm.internal.l.f("owner", interfaceC0491u);
                break;
            default:
                ((EmojiCompatInitializer) this.f1399m).getClass();
                (Build.VERSION.SDK_INT >= 28 ? v1.b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC2029a(), 500L);
                this.f1398l.k(this);
                break;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0477f
    public final void d(InterfaceC0491u interfaceC0491u) {
        switch (this.f1397k) {
            case 0:
                ((U) this.f1399m).d(null);
                break;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0477f
    public final /* synthetic */ void f(InterfaceC0491u interfaceC0491u) {
        int i = this.f1397k;
        AbstractC0467k.c(interfaceC0491u);
    }

    @Override // androidx.lifecycle.InterfaceC0477f
    public final /* synthetic */ void i(InterfaceC0491u interfaceC0491u) {
        int i = this.f1397k;
    }

    @Override // androidx.lifecycle.InterfaceC0477f
    public final void k(InterfaceC0491u interfaceC0491u) {
        switch (this.f1397k) {
            case 0:
                kotlin.jvm.internal.l.f("owner", interfaceC0491u);
                break;
            default:
                kotlin.jvm.internal.l.f("owner", interfaceC0491u);
                break;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0477f
    public final /* synthetic */ void l(InterfaceC0491u interfaceC0491u) {
        int i = this.f1397k;
    }

    public a(EmojiCompatInitializer emojiCompatInitializer, L l5) {
        this.f1399m = emojiCompatInitializer;
        this.f1398l = l5;
    }
}
