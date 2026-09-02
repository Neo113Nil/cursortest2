package h;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import k.AbstractC0779c;

/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063a {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f1189a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f1190b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1191c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1192d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1193e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f1194f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f1195g;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0063a(String str, PendingIntent pendingIntent) {
        IconCompat b2 = IconCompat.b(2131099648);
        Bundle bundle = new Bundle();
        this.f1192d = true;
        this.f1190b = b2;
        int i2 = b2.f559a;
        if (i2 == -1) {
            int i3 = Build.VERSION.SDK_INT;
            Object obj = b2.f560b;
            if (i3 >= 28) {
                i2 = AbstractC0779c.c(obj);
            } else {
                try {
                    i2 = ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                } catch (IllegalAccessException e2) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                    i2 = -1;
                    if (i2 == 2) {
                    }
                    this.f1194f = C0064b.a(str);
                    this.f1195g = pendingIntent;
                    this.f1189a = bundle;
                    this.f1191c = true;
                    this.f1192d = true;
                } catch (NoSuchMethodException e3) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                    i2 = -1;
                    if (i2 == 2) {
                    }
                    this.f1194f = C0064b.a(str);
                    this.f1195g = pendingIntent;
                    this.f1189a = bundle;
                    this.f1191c = true;
                    this.f1192d = true;
                } catch (InvocationTargetException e4) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e4);
                    i2 = -1;
                    if (i2 == 2) {
                    }
                    this.f1194f = C0064b.a(str);
                    this.f1195g = pendingIntent;
                    this.f1189a = bundle;
                    this.f1191c = true;
                    this.f1192d = true;
                }
            }
        }
        if (i2 == 2) {
            this.f1193e = b2.c();
        }
        this.f1194f = C0064b.a(str);
        this.f1195g = pendingIntent;
        this.f1189a = bundle;
        this.f1191c = true;
        this.f1192d = true;
    }
}
