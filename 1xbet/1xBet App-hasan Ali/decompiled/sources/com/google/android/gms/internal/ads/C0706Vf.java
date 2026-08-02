package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Vf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0706Vf implements InterfaceC0699Uf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11904a;

    /* renamed from: b, reason: collision with root package name */
    public final T2.I f11905b;

    public /* synthetic */ C0706Vf(T2.I i, int i5) {
        this.f11904a = i5;
        this.f11905b = i;
    }

    private final void b(HashMap hashMap) {
        boolean parseBoolean = Boolean.parseBoolean((String) hashMap.get("content_url_opted_out"));
        T2.I i = this.f11905b;
        i.o();
        synchronized (i.f5644a) {
            try {
                if (i.f5662u == parseBoolean) {
                    return;
                }
                i.f5662u = parseBoolean;
                SharedPreferences.Editor editor = i.f5649g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", parseBoolean);
                    i.f5649g.apply();
                }
                i.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0699Uf
    public final void a(HashMap hashMap) {
        switch (this.f11904a) {
            case 0:
                b(hashMap);
                return;
            default:
                boolean parseBoolean = Boolean.parseBoolean((String) hashMap.get("content_vertical_opted_out"));
                T2.I i = this.f11905b;
                i.o();
                synchronized (i.f5644a) {
                    try {
                        if (i.f5663v == parseBoolean) {
                            return;
                        }
                        i.f5663v = parseBoolean;
                        SharedPreferences.Editor editor = i.f5649g;
                        if (editor != null) {
                            editor.putBoolean("content_vertical_opted_out", parseBoolean);
                            i.f5649g.apply();
                        }
                        i.p();
                        return;
                    } finally {
                    }
                }
        }
    }
}
