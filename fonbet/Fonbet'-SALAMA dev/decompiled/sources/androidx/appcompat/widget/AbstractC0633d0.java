package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import io.sentry.rrweb.RRWebVideoEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0633d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f8606a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f8607b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f8608c;

    /* renamed from: d, reason: collision with root package name */
    public static final Field f8609d;

    /* renamed from: e, reason: collision with root package name */
    public static final Field f8610e;

    /* renamed from: f, reason: collision with root package name */
    public static final Field f8611f;

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z4;
        Class<?> cls;
        try {
            cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", null);
        } catch (ClassNotFoundException unused) {
            method = null;
            field = null;
        } catch (NoSuchFieldException unused2) {
            method = null;
            field = null;
        } catch (NoSuchMethodException unused3) {
            method = null;
            field = null;
        }
        try {
            field = cls.getField(RRWebVideoEvent.JsonKeys.LEFT);
            try {
                field2 = cls.getField(RRWebVideoEvent.JsonKeys.TOP);
                try {
                    field3 = cls.getField("right");
                    try {
                        field4 = cls.getField("bottom");
                        z4 = true;
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                        field4 = null;
                        z4 = false;
                        if (z4) {
                        }
                    }
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                    field3 = null;
                }
            } catch (ClassNotFoundException unused6) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z4 = false;
                if (z4) {
                }
            } catch (NoSuchFieldException unused7) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z4 = false;
                if (z4) {
                }
            } catch (NoSuchMethodException unused8) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z4 = false;
                if (z4) {
                }
            }
        } catch (ClassNotFoundException unused9) {
            field = null;
            field2 = field;
            field3 = field2;
            field4 = null;
            z4 = false;
            if (z4) {
            }
        } catch (NoSuchFieldException unused10) {
            field = null;
            field2 = field;
            field3 = field2;
            field4 = null;
            z4 = false;
            if (z4) {
            }
        } catch (NoSuchMethodException unused11) {
            field = null;
            field2 = field;
            field3 = field2;
            field4 = null;
            z4 = false;
            if (z4) {
            }
        }
        if (z4) {
            f8607b = null;
            f8608c = null;
            f8609d = null;
            f8610e = null;
            f8611f = null;
            f8606a = false;
            return;
        }
        f8607b = method;
        f8608c = field;
        f8609d = field2;
        f8610e = field3;
        f8611f = field4;
        f8606a = true;
    }
}
