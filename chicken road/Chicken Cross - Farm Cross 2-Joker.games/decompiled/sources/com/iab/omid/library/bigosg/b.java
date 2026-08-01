package com.iab.omid.library.bigosg;

import android.content.Context;
import com.iab.omid.library.bigosg.b.d;
import com.iab.omid.library.bigosg.b.f;
import com.iab.omid.library.bigosg.d.e;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6093a;

    private void b(Context context) {
        e.a(context, "Application Context cannot be null");
    }

    public String a() {
        return "1.3.0-Bigosg";
    }

    public boolean a(String str) {
        return true;
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        f.a().a(context);
        com.iab.omid.library.bigosg.b.b.a().a(context);
        com.iab.omid.library.bigosg.d.b.a(context);
        d.a().a(context);
    }

    public boolean b() {
        return this.f6093a;
    }

    public void a(boolean z) {
        this.f6093a = z;
    }
}
