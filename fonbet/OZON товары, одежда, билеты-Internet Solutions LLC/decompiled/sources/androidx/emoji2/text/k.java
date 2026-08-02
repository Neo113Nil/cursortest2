package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;

/* loaded from: classes.dex */
final class k implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC5434v f42709a;

    k(EmojiCompatInitializer emojiCompatInitializer, AbstractC5434v abstractC5434v) {
        this.f42709a = abstractC5434v;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(@NonNull J j11) {
        (Build.VERSION.SDK_INT >= 28 ? c.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new EmojiCompatInitializer.c(), 500L);
        this.f42709a.e(this);
    }
}
