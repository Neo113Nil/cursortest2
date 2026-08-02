package com.bumptech.glide.manager;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class g implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ h b;

    public class a implements Runnable {
        public final /* synthetic */ g a;

        public a(g gVar) {
            this.a = gVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.bumptech.glide.load.resource.bitmap.p a = com.bumptech.glide.load.resource.bitmap.p.a();
            a.getClass();
            com.bumptech.glide.util.m.a();
            a.d.set(true);
            g.this.b.b = true;
            View view = g.this.a;
            view.getViewTreeObserver().removeOnDrawListener(this.a);
            g.this.b.a.clear();
        }
    }

    public g(h hVar, View view) {
        this.b = hVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        com.bumptech.glide.util.m.f().post(new a(this));
    }
}
