package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import io.sentry.rrweb.RRWebVideoEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.appcompat.widget.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0612d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f8606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f8607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f8608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Field f8609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Field f8610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Field f8611f;

    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z4;
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", null);
            try {
                field = cls.getField(RRWebVideoEvent.JsonKeys.LEFT);
                try {
                    field2 = cls.getField(RRWebVideoEvent.JsonKeys.TOP);
                    try {
                        field3 = cls.getField("right");
                        try {
                            field4 = cls.getField("bottom");
                            z4 = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                            field4 = null;
                            z4 = false;
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException unused3) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z4 = false;
                    if (z4) {
                        f8607b = method;
                        f8608c = field;
                        f8609d = field2;
                        f8610e = field3;
                        f8611f = field4;
                        f8606a = true;
                        return;
                    }
                    f8607b = null;
                    f8608c = null;
                    f8609d = null;
                    f8610e = null;
                    f8611f = null;
                    f8606a = false;
                } catch (NoSuchFieldException unused4) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z4 = false;
                    if (z4) {
                        f8607b = method;
                        f8608c = field;
                        f8609d = field2;
                        f8610e = field3;
                        f8611f = field4;
                        f8606a = true;
                        return;
                    }
                    f8607b = null;
                    f8608c = null;
                    f8609d = null;
                    f8610e = null;
                    f8611f = null;
                    f8606a = false;
                } catch (NoSuchMethodException unused5) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z4 = false;
                    if (z4) {
                        f8607b = method;
                        f8608c = field;
                        f8609d = field2;
                        f8610e = field3;
                        f8611f = field4;
                        f8606a = true;
                        return;
                    }
                    f8607b = null;
                    f8608c = null;
                    f8609d = null;
                    f8610e = null;
                    f8611f = null;
                    f8606a = false;
                }
            } catch (ClassNotFoundException unused6) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z4 = false;
                if (z4) {
                    f8607b = method;
                    f8608c = field;
                    f8609d = field2;
                    f8610e = field3;
                    f8611f = field4;
                    f8606a = true;
                    return;
                }
                f8607b = null;
                f8608c = null;
                f8609d = null;
                f8610e = null;
                f8611f = null;
                f8606a = false;
            } catch (NoSuchFieldException unused7) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z4 = false;
                if (z4) {
                    f8607b = method;
                    f8608c = field;
                    f8609d = field2;
                    f8610e = field3;
                    f8611f = field4;
                    f8606a = true;
                    return;
                }
                f8607b = null;
                f8608c = null;
                f8609d = null;
                f8610e = null;
                f8611f = null;
                f8606a = false;
            } catch (NoSuchMethodException unused8) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z4 = false;
                if (z4) {
                    f8607b = method;
                    f8608c = field;
                    f8609d = field2;
                    f8610e = field3;
                    f8611f = field4;
                    f8606a = true;
                    return;
                }
                f8607b = null;
                f8608c = null;
                f8609d = null;
                f8610e = null;
                f8611f = null;
                f8606a = false;
            }
        } catch (ClassNotFoundException unused9) {
            method = null;
            field = null;
        } catch (NoSuchFieldException unused10) {
            method = null;
            field = null;
        } catch (NoSuchMethodException unused11) {
            method = null;
            field = null;
        }
        if (z4) {
            f8607b = method;
            f8608c = field;
            f8609d = field2;
            f8610e = field3;
            f8611f = field4;
            f8606a = true;
            return;
        }
        f8607b = null;
        f8608c = null;
        f8609d = null;
        f8610e = null;
        f8611f = null;
        f8606a = false;
    }
}
