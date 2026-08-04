package r6;

import A6.b;
import D6.I;
import E6.d;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import io.sentry.profilemeasurements.ProfileMeasurement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p129s.h;
import p129s.j;
import p129s.k;
import p136t.e;
import t6.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static j a(I i7) {
        h hVar = new h();
        hVar.f16092c = new k();
        j jVar = new j(hVar);
        hVar.f16091b = jVar;
        hVar.f16090a = p150v0.a.class;
        try {
            i7.invokeOnCompletion(new d(2, hVar, i7));
            hVar.f16090a = "Deferred.asListenableFuture";
        } catch (Exception e7) {
            jVar.f16096b.t(e7);
        }
        return jVar;
    }

    public static int b(int i7) {
        int i8 = (i7 & (~(i7 >> 31))) - 255;
        return (i8 & (i8 >> 31)) + 255;
    }

    public static final Class c(b bVar) {
        t6.h.e(bVar, "<this>");
        Class clsA = ((c) bVar).a();
        if (!clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? clsA : Double.class;
            case 104431:
                return !name.equals("int") ? clsA : Integer.class;
            case 3039496:
                return !name.equals(ProfileMeasurement.UNIT_BYTES) ? clsA : Byte.class;
            case 3052374:
                return !name.equals("char") ? clsA : Character.class;
            case 3327612:
                return !name.equals("long") ? clsA : Long.class;
            case 3625364:
                return !name.equals("void") ? clsA : Void.class;
            case 64711720:
                return !name.equals("boolean") ? clsA : Boolean.class;
            case 97526364:
                return !name.equals("float") ? clsA : Float.class;
            case 109413500:
                return !name.equals("short") ? clsA : Short.class;
            default:
                return clsA;
        }
    }

    public static void d(B.a aVar, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + aVar.f693b;
        try {
            boolean z4 = true;
            switch (e.e(aVar.f694c)) {
                case 0:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 1:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (b((int) (fArr[3] * 255.0f)) << 24) | (b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iB = (b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (b((int) (fArr[3] * 255.0f)) << 24) | (b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iB);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    throw new RuntimeException("unable to interpolate strings " + aVar.f693b);
                case 5:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z4 = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z4));
                    return;
                case 6:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e7) {
            StringBuilder sbK = p031e1.k.k("cannot access method ", str, " on View \"");
            sbK.append(p115p6.c.g(view));
            sbK.append("\"");
            Log.e("CustomSupport", sbK.toString());
            e7.printStackTrace();
        } catch (NoSuchMethodException e8) {
            StringBuilder sbK2 = p031e1.k.k("no method ", str, " on View \"");
            sbK2.append(p115p6.c.g(view));
            sbK2.append("\"");
            Log.e("CustomSupport", sbK2.toString());
            e8.printStackTrace();
        } catch (InvocationTargetException e9) {
            e9.printStackTrace();
        }
    }
}
