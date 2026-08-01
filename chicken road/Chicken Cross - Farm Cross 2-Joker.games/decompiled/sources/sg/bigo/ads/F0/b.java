package sg.bigo.ads.F0;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Set;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Context f12300a;

    public static Object a(String str, String str2, Object obj, int i) {
        SharedPreferences sharedPreferences;
        Context context = f12300a;
        if (context == null) {
            AbstractC5496a.a("SharedPreferenceManager", "sContext is null");
            sharedPreferences = null;
        } else {
            sharedPreferences = context.getSharedPreferences(str, 0);
        }
        if (sharedPreferences == null) {
            return null;
        }
        if (i == 0) {
            if (!(obj instanceof Number)) {
                throw new NumberFormatException();
            }
            int intValue = ((Number) obj).intValue();
            Object obj2 = sharedPreferences.getAll().get(str2);
            if (obj2 instanceof Integer) {
                intValue = ((Integer) obj2).intValue();
            } else if (obj2 instanceof String) {
                try {
                    intValue = Integer.parseInt((String) obj2);
                } catch (Exception unused) {
                }
            }
            return Integer.valueOf(intValue);
        }
        if (i == 1) {
            if (!(obj instanceof Number)) {
                throw new NumberFormatException();
            }
            long longValue = ((Number) obj).longValue();
            Object obj3 = sharedPreferences.getAll().get(str2);
            if (obj3 instanceof Long) {
                longValue = ((Long) obj3).longValue();
            } else if (obj3 instanceof String) {
                try {
                    longValue = Long.parseLong((String) obj3);
                } catch (Exception unused2) {
                }
            }
            return Long.valueOf(longValue);
        }
        if (i == 2) {
            if (!(obj instanceof Number)) {
                throw new NumberFormatException();
            }
            float floatValue = ((Number) obj).floatValue();
            Object obj4 = sharedPreferences.getAll().get(str2);
            if (obj4 instanceof Float) {
                floatValue = ((Float) obj4).floatValue();
            } else if (obj4 instanceof String) {
                try {
                    floatValue = Float.parseFloat((String) obj4);
                } catch (Exception unused3) {
                }
            }
            return Float.valueOf(floatValue);
        }
        if (i == 3) {
            if (!(obj instanceof String)) {
                throw new ClassCastException();
            }
            try {
                return sharedPreferences.getString(str2, (String) obj);
            } catch (ClassCastException unused4) {
                return null;
            }
        }
        if (i != 4) {
            if (i != 5) {
                return null;
            }
            if (obj instanceof Set) {
                return sharedPreferences.getStringSet(str2, (Set) obj);
            }
            throw new ClassCastException();
        }
        if (!(obj instanceof Boolean)) {
            throw new ClassCastException();
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Object obj5 = sharedPreferences.getAll().get(str2);
        if (obj5 instanceof Boolean) {
            booleanValue = ((Boolean) obj5).booleanValue();
        } else if (obj5 instanceof String) {
            try {
                booleanValue = Boolean.parseBoolean((String) obj5);
            } catch (Exception unused5) {
            }
        }
        return Boolean.valueOf(booleanValue);
    }

    public static void b(String str, String str2, Object obj, int i) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editor = null;
        try {
            try {
                Context context = f12300a;
                if (context == null) {
                    AbstractC5496a.a("SharedPreferenceManager", "sContext is null");
                    sharedPreferences = null;
                } else {
                    sharedPreferences = context.getSharedPreferences(str, 0);
                }
                editor = sharedPreferences.edit();
            } catch (Exception e) {
                AbstractC5496a.a("SharedPreferenceManager", Log.getStackTraceString(e));
            }
            a(editor, str2, obj, i);
            if (d.b == null) {
                d.b = new d();
            }
            d.b.f12301a.getClass();
            c.a(editor);
        } catch (Exception e2) {
            AbstractC5496a.a("SharedPreferenceManager", Log.getStackTraceString(e2));
        }
    }

    public static boolean a() {
        return f12300a != null;
    }

    public static void a(SharedPreferences.Editor editor, String str, Object obj, int i) {
        if (editor != null) {
            if (i == 0) {
                if (!(obj instanceof Number)) {
                    throw new NumberFormatException();
                }
                editor.putInt(str, ((Number) obj).intValue());
                return;
            }
            if (i == 1) {
                if (!(obj instanceof Number)) {
                    throw new NumberFormatException();
                }
                editor.putLong(str, ((Number) obj).longValue());
                return;
            }
            if (i == 2) {
                if (!(obj instanceof Number)) {
                    throw new NumberFormatException();
                }
                editor.putFloat(str, ((Number) obj).floatValue());
                return;
            }
            if (i == 3) {
                if (obj != null && !(obj instanceof String)) {
                    throw new ClassCastException();
                }
                editor.putString(str, (String) obj);
                return;
            }
            if (i == 4) {
                if (!(obj instanceof Boolean)) {
                    throw new ClassCastException();
                }
                editor.putBoolean(str, ((Boolean) obj).booleanValue());
            } else {
                if (i != 5) {
                    return;
                }
                if (obj != null && !(obj instanceof Set)) {
                    throw new ClassCastException();
                }
                editor.putStringSet(str, (Set) obj);
            }
        }
    }
}
