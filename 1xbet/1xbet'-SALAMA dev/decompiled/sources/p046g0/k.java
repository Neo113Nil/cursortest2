package p046g0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC0720o;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0724t;

/* JADX INFO: loaded from: classes.dex */
public final class k implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0720o f13037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer f13038b;

    public k(EmojiCompatInitializer emojiCompatInitializer, AbstractC0720o abstractC0720o) {
        this.f13038b = emojiCompatInitializer;
        this.f13037a = abstractC0720o;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC0724t interfaceC0724t) {
        this.f13038b.getClass();
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new m(0), 500L);
        this.f13037a.b(this);
    }
}
