package A0;

import I1.AbstractActivityC0027d;
import Y1.C0077a;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import androidx.lifecycle.z;
import com.chicken.jump.road.pump.R;
import d2.C0274d;
import e2.AbstractC0292g;
import e2.AbstractC0294i;
import g1.C0315a;
import h.AbstractC0323a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l.AbstractC1105y;
import l.C1096o;
import l.P;
import l.h0;
import r0.C1178e;
import r0.InterfaceC1176c;
import t0.C1207a;
import u0.ServiceConnectionC1210a;
import w.AbstractC1219a;
import z.AbstractC1255a;

/* loaded from: classes.dex */
public final class h implements Q1.b, InterfaceC1176c {

    /* renamed from: b, reason: collision with root package name */
    public Object f54b;

    /* renamed from: c, reason: collision with root package name */
    public Object f55c;

    /* renamed from: d, reason: collision with root package name */
    public Object f56d;

    /* renamed from: e, reason: collision with root package name */
    public Object f57e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public Object f58g;

    public h(String str, String str2, Set set) {
        C0315a c0315a = C0315a.f4975b;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f56d = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f54b = str;
        this.f = str2;
        this.f58g = c0315a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f57e = Collections.unmodifiableSet(hashSet);
    }

    public static boolean b(int[] iArr, int i3) {
        for (int i4 : iArr) {
            if (i4 == i3) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList e(Context context, int i3) {
        int b3 = h0.b(context, R.attr.colorControlHighlight);
        int a3 = h0.a(context, R.attr.colorButtonNormal);
        int[] iArr = h0.f9795b;
        int[] iArr2 = h0.f9797d;
        int a4 = AbstractC1219a.a(b3, i3);
        return new ColorStateList(new int[][]{iArr, iArr2, h0.f9796c, h0.f}, new int[]{a3, a4, AbstractC1219a.a(b3, i3), i3});
    }

    public static void k(Drawable drawable, int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter e3;
        if (AbstractC1105y.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = C1096o.f9842b;
        }
        PorterDuff.Mode mode2 = C1096o.f9842b;
        synchronized (C1096o.class) {
            e3 = P.e(i3, mode);
        }
        drawable.setColorFilter(e3);
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f58g;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public i c() {
        String str = ((String) this.f54b) == null ? " transportName" : "";
        if (((n) this.f56d) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f57e) == null) {
            str = B0.c.o(str, " eventMillis");
        }
        if (((Long) this.f) == null) {
            str = B0.c.o(str, " uptimeMillis");
        }
        if (((HashMap) this.f58g) == null) {
            str = B0.c.o(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new i((String) this.f54b, (Integer) this.f55c, (n) this.f56d, ((Long) this.f57e).longValue(), ((Long) this.f).longValue(), (HashMap) this.f58g);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void d() {
        ComponentName componentName;
        ComponentName componentName2;
        ComponentName componentName3;
        ResolveInfo resolveService;
        PackageManager.ResolveInfoFlags of;
        AbstractActivityC0027d abstractActivityC0027d = (AbstractActivityC0027d) this.f58g;
        if (abstractActivityC0027d == null) {
            return;
        }
        ActivityManager activityManager = (ActivityManager) t.b.b(abstractActivityC0027d, ActivityManager.class);
        ComponentName componentName4 = new ComponentName(abstractActivityC0027d, abstractActivityC0027d.getClass());
        if (activityManager == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Iterator<ActivityManager.AppTask> it = activityManager.getAppTasks().iterator();
        while (it.hasNext()) {
            ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
            componentName = taskInfo.baseActivity;
            if (componentName4.equals(componentName)) {
                componentName2 = taskInfo.topActivity;
                if (componentName2 == null) {
                    continue;
                } else {
                    Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                    componentName3 = taskInfo.topActivity;
                    Intent intent2 = intent.setPackage(componentName3 != null ? componentName3.getPackageName() : null);
                    kotlin.jvm.internal.j.d(intent2, "setPackage(...)");
                    PackageManager packageManager = abstractActivityC0027d.getPackageManager();
                    kotlin.jvm.internal.j.d(packageManager, "getPackageManager(...)");
                    if (Build.VERSION.SDK_INT >= 33) {
                        of = PackageManager.ResolveInfoFlags.of(0);
                        resolveService = packageManager.resolveService(intent2, of);
                    } else {
                        resolveService = packageManager.resolveService(intent2, 0);
                    }
                    if (resolveService != null) {
                        try {
                            Intent flags = new Intent(abstractActivityC0027d, abstractActivityC0027d.getClass()).setFlags(603979776);
                            kotlin.jvm.internal.j.d(flags, "setFlags(...)");
                            abstractActivityC0027d.startActivity(flags);
                            return;
                        } catch (ActivityNotFoundException unused) {
                            return;
                        }
                    }
                }
            }
        }
    }

    public ColorStateList f(Context context, int i3) {
        if (i3 == R.drawable.abc_edit_text_material) {
            Object obj = AbstractC0323a.f4982a;
            return context.getColorStateList(R.color.abc_tint_edittext);
        }
        if (i3 == 2131165254) {
            Object obj2 = AbstractC0323a.f4982a;
            return context.getColorStateList(R.color.abc_tint_switch_track);
        }
        if (i3 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList c3 = h0.c(context, R.attr.colorSwitchThumbNormal);
            if (c3 == null || !c3.isStateful()) {
                iArr[0] = h0.f9795b;
                iArr2[0] = h0.a(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = h0.f9798e;
                iArr2[1] = h0.b(context, R.attr.colorControlActivated);
                iArr[2] = h0.f;
                iArr2[2] = h0.b(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = h0.f9795b;
                iArr[0] = iArr3;
                iArr2[0] = c3.getColorForState(iArr3, 0);
                iArr[1] = h0.f9798e;
                iArr2[1] = h0.b(context, R.attr.colorControlActivated);
                iArr[2] = h0.f;
                iArr2[2] = c3.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i3 == R.drawable.abc_btn_default_mtrl_shape) {
            return e(context, h0.b(context, R.attr.colorButtonNormal));
        }
        if (i3 == R.drawable.abc_btn_borderless_material) {
            return e(context, 0);
        }
        if (i3 == R.drawable.abc_btn_colored_material) {
            return e(context, h0.b(context, R.attr.colorAccent));
        }
        if (i3 == 2131165251 || i3 == R.drawable.abc_spinner_textfield_background_material) {
            Object obj3 = AbstractC0323a.f4982a;
            return context.getColorStateList(R.color.abc_tint_spinner);
        }
        if (b((int[]) this.f55c, i3)) {
            return h0.c(context, R.attr.colorControlNormal);
        }
        if (b((int[]) this.f, i3)) {
            Object obj4 = AbstractC0323a.f4982a;
            return context.getColorStateList(R.color.abc_tint_default);
        }
        if (b((int[]) this.f58g, i3)) {
            Object obj5 = AbstractC0323a.f4982a;
            return context.getColorStateList(R.color.abc_tint_btn_checkable);
        }
        if (i3 != R.drawable.abc_seekbar_thumb_material) {
            return null;
        }
        Object obj6 = AbstractC0323a.f4982a;
        return context.getColorStateList(R.color.abc_tint_seek_thumb);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123 A[Catch: ActivityNotFoundException -> 0x0136, TryCatch #0 {ActivityNotFoundException -> 0x0136, blocks: (B:27:0x00d5, B:32:0x00ec, B:34:0x00ff, B:36:0x010c, B:43:0x0123, B:45:0x0117, B:46:0x012e, B:47:0x0135), top: B:26:0x00d5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(String str, boolean z3, Map map) {
        boolean z4;
        List<ResolveInfo> queryIntentActivities;
        List<ResolveInfo> queryIntentActivities2;
        PackageManager.ResolveInfoFlags of;
        PackageManager.ResolveInfoFlags of2;
        io.flutter.plugin.editing.k kVar = (io.flutter.plugin.editing.k) this.f54b;
        AbstractActivityC0027d abstractActivityC0027d = (AbstractActivityC0027d) this.f58g;
        if (abstractActivityC0027d == null) {
            throw new C1178e("Launching a Custom Tab requires a foreground activity.");
        }
        Uri uri = Uri.parse(str);
        if (z3) {
            ((C0077a) this.f56d).getClass();
            kotlin.jvm.internal.j.e(uri, "uri");
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                Intent addFlags = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE").addFlags(268436480);
                kotlin.jvm.internal.j.d(addFlags, "addFlags(...)");
                try {
                    abstractActivityC0027d.startActivity(addFlags);
                    return;
                } catch (ActivityNotFoundException unused) {
                }
            } else {
                PackageManager packageManager = abstractActivityC0027d.getPackageManager();
                Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts(uri.getScheme(), "", null));
                kotlin.jvm.internal.j.d(data, "setData(...)");
                kotlin.jvm.internal.j.b(packageManager);
                if (i3 >= 33) {
                    of2 = PackageManager.ResolveInfoFlags.of(131072);
                    queryIntentActivities = packageManager.queryIntentActivities(data, of2);
                    kotlin.jvm.internal.j.b(queryIntentActivities);
                } else {
                    queryIntentActivities = packageManager.queryIntentActivities(data, 131072);
                    kotlin.jvm.internal.j.b(queryIntentActivities);
                }
                f2.i h3 = C0077a.h(queryIntentActivities);
                Intent addCategory = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE");
                kotlin.jvm.internal.j.d(addCategory, "addCategory(...)");
                f2.i iVar = new f2.i(new f2.f(8));
                if (i3 >= 33) {
                    of = PackageManager.ResolveInfoFlags.of(131072);
                    queryIntentActivities2 = packageManager.queryIntentActivities(addCategory, of);
                    kotlin.jvm.internal.j.b(queryIntentActivities2);
                } else {
                    queryIntentActivities2 = packageManager.queryIntentActivities(addCategory, 131072);
                    kotlin.jvm.internal.j.b(queryIntentActivities2);
                }
                iVar.addAll(C0077a.h(queryIntentActivities2));
                iVar.removeAll(h3);
                if (!F2.b.e(iVar).f4925a.isEmpty()) {
                    addCategory.addFlags(268435456);
                    abstractActivityC0027d.startActivity(addCategory);
                    return;
                }
            }
        }
        try {
            kVar.getClass();
            C1207a g3 = io.flutter.plugin.editing.k.g(map);
            ((C0077a) this.f57e).getClass();
            if (C0077a.k(abstractActivityC0027d, uri, g3)) {
                return;
            }
            if (g3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            V1.b f = kVar.f(abstractActivityC0027d, g3, (z) this.f55c);
            ((C0077a) this.f).getClass();
            Intent intent = (Intent) f.f1614b;
            kotlin.jvm.internal.j.d(intent, "intent");
            if (!intent.hasExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX") && !intent.hasExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX")) {
                z4 = false;
                if (z4) {
                    intent.setData(uri);
                    abstractActivityC0027d.startActivity(intent, (Bundle) f.f1615c);
                    return;
                }
                return;
            }
            intent.setData(uri);
            abstractActivityC0027d.startActivityForResult(intent, 1001);
            z4 = true;
            if (z4) {
            }
        } catch (ActivityNotFoundException e3) {
            throw new C1178e(e3.getMessage());
        }
    }

    public void h(String str, List list) {
        z zVar = (z) this.f55c;
        zVar.getClass();
        ServiceConnectionC1210a serviceConnectionC1210a = (ServiceConnectionC1210a) zVar.f2346a.get(str);
        if (serviceConnectionC1210a == null) {
            return;
        }
        j jVar = serviceConnectionC1210a.f10375d;
        if (jVar == null) {
            Log.w("CustomTabsAndroid", "Custom Tab session is null. Cannot may launch URL(s).");
            return;
        }
        if (list.isEmpty()) {
            Log.w("CustomTabsAndroid", "URLs is empty. Cannot may launch URL(s).");
            return;
        }
        if (list.size() == 1) {
            jVar.H(Uri.parse((String) list.get(0)), null);
            return;
        }
        ArrayList arrayList = new ArrayList(AbstractC0294i.U(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0274d[] c0274dArr = {new C0274d("android.support.customtabs.otherurls.URL", Uri.parse((String) it.next()))};
            Bundle bundle = new Bundle(1);
            C0274d c0274d = c0274dArr[0];
            String str2 = (String) c0274d.f4845a;
            Object obj = c0274d.f4846b;
            if (obj == null) {
                bundle.putString(str2, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str2, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str2, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str2, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str2, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str2, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str2, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str2, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str2, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str2, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str2, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str2, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str2, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str2, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str2, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str2, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str2, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str2, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str2, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                kotlin.jvm.internal.j.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str2, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str2, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str2, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                    }
                    bundle.putSerializable(str2, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str2, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str2, (IBinder) obj);
            } else if (obj instanceof Size) {
                AbstractC1255a.a(bundle, str2, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                }
                AbstractC1255a.b(bundle, str2, (SizeF) obj);
            }
            arrayList.add(bundle);
        }
        jVar.H(null, arrayList);
    }

    public boolean i(int i3, int i4, Intent intent) {
        Iterator it = new HashSet((HashSet) this.f56d).iterator();
        while (true) {
            boolean z3 = false;
            while (it.hasNext()) {
                HashMap hashMap = ((W1.a) it.next()).f1624d;
                if (hashMap.containsKey(Integer.valueOf(i3))) {
                    ((T1.n) hashMap.remove(Integer.valueOf(i3))).success(i4 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
                } else if (z3) {
                }
                z3 = true;
            }
            return z3;
        }
    }

    public void j(AbstractActivityC0027d abstractActivityC0027d) {
        for (ServiceConnectionC1210a serviceConnectionC1210a : ((z) this.f55c).f2346a.values()) {
            if (abstractActivityC0027d == null) {
                Activity activity = serviceConnectionC1210a.f10374c;
                if (activity != null) {
                    activity.unbindService(serviceConnectionC1210a);
                }
                serviceConnectionC1210a.f10375d = null;
                serviceConnectionC1210a.f10376e = false;
            } else {
                serviceConnectionC1210a.a(abstractActivityC0027d);
            }
        }
        this.f58g = abstractActivityC0027d;
    }

    public String l(Map map) {
        Set h02;
        Boolean bool;
        ServiceConnectionC1210a serviceConnectionC1210a;
        AbstractActivityC0027d abstractActivityC0027d = (AbstractActivityC0027d) this.f58g;
        if (abstractActivityC0027d != null) {
            z zVar = (z) this.f55c;
            zVar.getClass();
            if (map == null) {
                bool = null;
                h02 = null;
            } else {
                Boolean bool2 = (Boolean) map.get("prefersDefaultBrowser");
                List list = (List) map.get("fallbackCustomTabs");
                h02 = list != null ? AbstractC0292g.h0(list) : null;
                bool = bool2;
            }
            String s3 = X0.a.s(abstractActivityC0027d, !kotlin.jvm.internal.j.a(bool, Boolean.TRUE), new A.e((Boolean) null, bool, h02, (Map) null, (String) null).a(abstractActivityC0027d));
            if (s3 == null) {
                serviceConnectionC1210a = null;
            } else {
                LinkedHashMap linkedHashMap = zVar.f2346a;
                serviceConnectionC1210a = (ServiceConnectionC1210a) linkedHashMap.get(s3);
                if (serviceConnectionC1210a == null) {
                    serviceConnectionC1210a = new ServiceConnectionC1210a(s3);
                    linkedHashMap.put(s3, serviceConnectionC1210a);
                }
            }
            if (serviceConnectionC1210a != null && serviceConnectionC1210a.a(abstractActivityC0027d)) {
                return serviceConnectionC1210a.f10373b;
            }
        }
        return null;
    }

    public h(int i3) {
        switch (i3) {
            case 4:
                io.flutter.plugin.editing.k kVar = new io.flutter.plugin.editing.k(8);
                z zVar = new z(1);
                C0077a c0077a = new C0077a(24);
                C0077a c0077a2 = new C0077a(23);
                C0077a c0077a3 = new C0077a(25);
                this.f54b = kVar;
                this.f55c = zVar;
                this.f56d = c0077a;
                this.f57e = c0077a2;
                this.f = c0077a3;
                break;
            default:
                this.f54b = new int[]{2131165267, 2131165265, 2131165184};
                this.f55c = new int[]{2131165208, R.drawable.abc_seekbar_tick_mark_material, 2131165215, 2131165210, 2131165211, 2131165214, 2131165213};
                this.f56d = new int[]{2131165264, 2131165266, 2131165201, R.drawable.abc_text_cursor_material, 2131165258, 2131165260, 2131165262, 2131165259, 2131165261, 2131165263};
                this.f57e = new int[]{2131165239, R.drawable.abc_cab_background_internal_bg, 2131165238};
                this.f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f58g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
        }
    }
}
