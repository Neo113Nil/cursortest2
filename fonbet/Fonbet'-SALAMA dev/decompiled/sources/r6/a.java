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
import s.h;
import s.j;
import s.k;
import t.e;
import t6.c;
import v0.AbstractC1663a;

/* loaded from: classes2.dex */
public abstract class a {
    public static j a(I i7) {
        h hVar = new h();
        hVar.f16086c = new k();
        j jVar = new j(hVar);
        hVar.f16085b = jVar;
        hVar.f16084a = AbstractC1663a.class;
        try {
            i7.invokeOnCompletion(new d(2, hVar, i7));
            hVar.f16084a = "Deferred.asListenableFuture";
        } catch (Exception e7) {
            jVar.f16090b.t(e7);
        }
        return jVar;
    }

    public static int b(int i7) {
        int i8 = (i7 & (~(i7 >> 31))) - 255;
        return (i8 & (i8 >> 31)) + 255;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class c(b bVar) {
        t6.h.e(bVar, "<this>");
        Class a2 = ((c) bVar).a();
        if (!a2.isPrimitive()) {
            return a2;
        }
        String name = a2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals(ProfileMeasurement.UNIT_BYTES)) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return a2;
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
                    int b7 = (b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (b((int) (fArr[3] * 255.0f)) << 24) | (b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(b7);
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
            StringBuilder k7 = e1.k.k("cannot access method ", str, " on View \"");
            k7.append(p6.c.g(view));
            k7.append("\"");
            Log.e("CustomSupport", k7.toString());
            e7.printStackTrace();
        } catch (NoSuchMethodException e8) {
            StringBuilder k8 = e1.k.k("no method ", str, " on View \"");
            k8.append(p6.c.g(view));
            k8.append("\"");
            Log.e("CustomSupport", k8.toString());
            e8.printStackTrace();
        } catch (InvocationTargetException e9) {
            e9.printStackTrace();
        }
    }
}
