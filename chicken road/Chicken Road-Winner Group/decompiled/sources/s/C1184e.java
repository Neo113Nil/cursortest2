package s;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: s.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1184e {

    /* renamed from: a, reason: collision with root package name */
    public Context f10297a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f10298b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f10299c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f10300d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f10301e;
    public CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f10302g;

    /* renamed from: h, reason: collision with root package name */
    public int f10303h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10304i;

    /* renamed from: j, reason: collision with root package name */
    public V1.b f10305j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10306k;

    /* renamed from: l, reason: collision with root package name */
    public Bundle f10307l;

    /* renamed from: m, reason: collision with root package name */
    public String f10308m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10309n;

    /* renamed from: o, reason: collision with root package name */
    public Notification f10310o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f10311p;

    public static CharSequence a(String str) {
        return str == null ? str : str.length() > 5120 ? str.subSequence(0, 5120) : str;
    }

    public final void b(V1.b bVar) {
        if (this.f10305j != bVar) {
            this.f10305j = bVar;
            if (((C1184e) bVar.f1614b) != this) {
                bVar.f1614b = this;
                b(bVar);
            }
        }
    }
}
