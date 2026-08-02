package g0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC0741o;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0745t;

/* loaded from: classes.dex */
public final class k implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0741o f13031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer f13032b;

    public k(EmojiCompatInitializer emojiCompatInitializer, AbstractC0741o abstractC0741o) {
        this.f13032b = emojiCompatInitializer;
        this.f13031a = abstractC0741o;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC0745t interfaceC0745t) {
        this.f13032b.getClass();
        (Build.VERSION.SDK_INT >= 28 ? AbstractC1120b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new m(0), 500L);
        this.f13031a.b(this);
    }
}
