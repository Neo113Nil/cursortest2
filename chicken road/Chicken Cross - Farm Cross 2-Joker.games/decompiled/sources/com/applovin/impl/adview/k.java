package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.applovin.impl.g2;

/* loaded from: classes5.dex */
public class k extends View {

    /* renamed from: a, reason: collision with root package name */
    private final g2 f4139a;
    private boolean b;

    interface a {
        void a();

        void b();
    }

    public k(g2 g2Var, Context context) {
        super(context);
        this.f4139a = g2Var;
        setClickable(false);
        setFocusable(false);
    }

    public boolean a() {
        return this.b;
    }

    public void b() {
        a(null);
    }

    public String getIdentifier() {
        return this.f4139a.b();
    }

    public void a(a aVar) {
        if (this.b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable a2 = this.f4139a.a();
        if (a2 == null) {
            if (aVar != null) {
                aVar.b();
            }
        } else {
            setBackground(a2);
            this.b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
