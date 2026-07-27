package s;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* renamed from: s.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1183d {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f10291a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f10292b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10293c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10294d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10295e;
    public final CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f10296g;

    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1183d(String str, PendingIntent pendingIntent) {
        IconCompat b3 = IconCompat.b(2131165278);
        Bundle bundle = new Bundle();
        this.f10294d = true;
        this.f10292b = b3;
        int i3 = b3.f2109a;
        if (i3 == -1) {
            int i4 = Build.VERSION.SDK_INT;
            Object obj = b3.f2110b;
            if (i4 >= 28) {
                i3 = x.d.c(obj);
            } else {
                try {
                    i3 = ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
                } catch (IllegalAccessException e3) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                    i3 = -1;
                    if (i3 == 2) {
                    }
                    this.f = C1184e.a(str);
                    this.f10296g = pendingIntent;
                    this.f10291a = bundle;
                    this.f10293c = true;
                    this.f10294d = true;
                } catch (NoSuchMethodException e4) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e4);
                    i3 = -1;
                    if (i3 == 2) {
                    }
                    this.f = C1184e.a(str);
                    this.f10296g = pendingIntent;
                    this.f10291a = bundle;
                    this.f10293c = true;
                    this.f10294d = true;
                } catch (InvocationTargetException e5) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e5);
                    i3 = -1;
                    if (i3 == 2) {
                    }
                    this.f = C1184e.a(str);
                    this.f10296g = pendingIntent;
                    this.f10291a = bundle;
                    this.f10293c = true;
                    this.f10294d = true;
                }
            }
        }
        if (i3 == 2) {
            this.f10295e = b3.c();
        }
        this.f = C1184e.a(str);
        this.f10296g = pendingIntent;
        this.f10291a = bundle;
        this.f10293c = true;
        this.f10294d = true;
    }
}
