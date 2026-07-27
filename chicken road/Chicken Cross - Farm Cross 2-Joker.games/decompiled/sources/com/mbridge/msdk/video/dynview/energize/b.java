package com.mbridge.msdk.video.dynview.energize;

import android.view.View;
import com.mbridge.msdk.video.dynview.c;
import java.util.Map;

/* compiled from: UIEnergize.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f10095a;

    private b() {
    }

    public static b a() {
        b bVar;
        if (f10095a != null) {
            return f10095a;
        }
        synchronized (b.class) {
            if (f10095a == null) {
                f10095a = new b();
            }
            bVar = f10095a;
        }
        return bVar;
    }

    private void b(View view, c cVar) {
        new com.mbridge.msdk.video.dynview.wrapper.b().b(view, cVar);
    }

    private void c(View view, c cVar, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.wrapper.b().a(view, cVar, map);
    }

    private void b(View view, c cVar, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.wrapper.b().b(view, cVar, map);
    }

    public void a(View view, c cVar, Map<String, Object> map) {
        if (cVar == null) {
            return;
        }
        int g = cVar.g();
        if (g == 1) {
            a(view, map);
            return;
        }
        if (g == 2) {
            c(view, cVar, map);
            return;
        }
        if (g == 3) {
            b(view, cVar);
        } else if (g == 4) {
            b(view, cVar, map);
        } else {
            if (g != 5) {
                return;
            }
            a(view, cVar);
        }
    }

    private void a(View view, c cVar) {
        new com.mbridge.msdk.video.dynview.wrapper.b().a(view, cVar);
    }

    private void a(View view, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.wrapper.b().a(view, map);
    }
}
