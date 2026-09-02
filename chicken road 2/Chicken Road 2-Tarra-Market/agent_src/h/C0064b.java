package h;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: h.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064b {

    /* renamed from: a, reason: collision with root package name */
    public Context f1196a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1197b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f1198c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f1199d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f1200e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f1201f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f1202g;

    /* renamed from: h, reason: collision with root package name */
    public int f1203h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1204i;

    /* renamed from: j, reason: collision with root package name */
    public Y.e f1205j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1206k;

    /* renamed from: l, reason: collision with root package name */
    public Bundle f1207l;

    /* renamed from: m, reason: collision with root package name */
    public String f1208m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1209n;

    /* renamed from: o, reason: collision with root package name */
    public Notification f1210o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f1211p;

    public static CharSequence a(String str) {
        return str == null ? str : str.length() > 5120 ? str.subSequence(0, 5120) : str;
    }

    public final void b(Y.e eVar) {
        if (this.f1205j != eVar) {
            this.f1205j = eVar;
            if (((C0064b) eVar.f523b) != this) {
                eVar.f523b = this;
                b(eVar);
            }
        }
    }
}
