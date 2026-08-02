package L5;

import W5.AbstractC0486a1;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import v0.AbstractC1663a;
import w1.C1718l0;

/* renamed from: L5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0322a extends A5.x {

    /* renamed from: d, reason: collision with root package name */
    public Context f4452d;

    /* renamed from: e, reason: collision with root package name */
    public final C1718l0 f4453e = new C1718l0(6);

    /* renamed from: f, reason: collision with root package name */
    public final L f4454f;

    public C0322a(Context context, L l7) {
        this.f4452d = context;
        this.f4454f = l7;
    }

    @Override // A5.x
    public final Object f(byte b7, ByteBuffer byteBuffer) {
        L l7 = this.f4454f;
        C1718l0 c1718l0 = this.f4453e;
        switch (b7) {
            case Byte.MIN_VALUE:
                return new C0343w(new y2.j(((Integer) f(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) f(byteBuffer.get(), byteBuffer)).intValue()));
            case -127:
                List list = (List) f(byteBuffer.get(), byteBuffer);
                String str = (String) f(byteBuffer.get(), byteBuffer);
                Object f7 = f(byteBuffer.get(), byteBuffer);
                return new r(list, str, f7 != null ? (Boolean) f7 : null, (List) f(byteBuffer.get(), byteBuffer), (Integer) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer), (Map) f(byteBuffer.get(), byteBuffer), l7.a(), (List) f(byteBuffer.get(), byteBuffer));
            case -126:
                return new C0340t(y2.j.f18161p);
            case -125:
            case -109:
            default:
                return super.f(b7, byteBuffer);
            case -124:
                return new N((String) f(byteBuffer.get(), byteBuffer), (Integer) f(byteBuffer.get(), byteBuffer));
            case -123:
                return new C0328g(((Integer) f(byteBuffer.get(), byteBuffer)).intValue(), (String) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer), (C0330i) f(byteBuffer.get(), byteBuffer));
            case -122:
                return new C0334m((List) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer), (Map) f(byteBuffer.get(), byteBuffer), (Map) f(byteBuffer.get(), byteBuffer), (Boolean) f(byteBuffer.get(), byteBuffer), (List) f(byteBuffer.get(), byteBuffer), (Integer) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer), (Map) f(byteBuffer.get(), byteBuffer), l7.a(), (List) f(byteBuffer.get(), byteBuffer));
            case -121:
                String str2 = (String) f(byteBuffer.get(), byteBuffer);
                str2.getClass();
                if (str2.equals("ready")) {
                    return EnumC0344x.f4512b;
                }
                if (str2.equals("notReady")) {
                    return EnumC0344x.f4511a;
                }
                throw new IllegalArgumentException("Unable to handle state: ".concat(str2));
            case -120:
                return new y((EnumC0344x) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer), (Number) f(byteBuffer.get(), byteBuffer));
            case -119:
                return new E((Map) f(byteBuffer.get(), byteBuffer));
            case -118:
                return new S((String) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer));
            case -117:
                return new C0326e(((Integer) f(byteBuffer.get(), byteBuffer)).intValue(), (String) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer));
            case -116:
                return new C0330i((String) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer), (List) f(byteBuffer.get(), byteBuffer), (C0327f) f(byteBuffer.get(), byteBuffer), (Map) f(byteBuffer.get(), byteBuffer));
            case -115:
                return new C0327f((String) f(byteBuffer.get(), byteBuffer), ((Long) f(byteBuffer.get(), byteBuffer)).longValue(), (String) f(byteBuffer.get(), byteBuffer), (Map) f(byteBuffer.get(), byteBuffer), (C0326e) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer), (String) f(byteBuffer.get(), byteBuffer));
            case -114:
                return new C0339s(this.f4452d, c1718l0, (String) f(byteBuffer.get(), byteBuffer), ((Integer) f(byteBuffer.get(), byteBuffer)).intValue());
            case -113:
                return new C0342v(y2.j.f18160o);
            case -112:
                return new J((Integer) f(byteBuffer.get(), byteBuffer), (Integer) f(byteBuffer.get(), byteBuffer), (T) f(byteBuffer.get(), byteBuffer), (Boolean) f(byteBuffer.get(), byteBuffer), (Boolean) f(byteBuffer.get(), byteBuffer), (Boolean) f(byteBuffer.get(), byteBuffer));
            case -111:
                return new T((Boolean) f(byteBuffer.get(), byteBuffer), (Boolean) f(byteBuffer.get(), byteBuffer), (Boolean) f(byteBuffer.get(), byteBuffer));
            case -110:
                return new C0341u(c1718l0, this.f4452d, ((Integer) f(byteBuffer.get(), byteBuffer)).intValue(), (Integer) f(byteBuffer.get(), byteBuffer), (Integer) f(byteBuffer.get(), byteBuffer));
            case -108:
                C0.J j = new C0.J();
                j.e((String) f(byteBuffer.get(), byteBuffer));
                j.f(((Integer) f(byteBuffer.get(), byteBuffer)).intValue());
                j.g(((Integer) f(byteBuffer.get(), byteBuffer)).intValue());
                List list2 = (List) f(byteBuffer.get(), byteBuffer);
                ArrayList arrayList = (ArrayList) j.f1237d;
                arrayList.clear();
                if (list2 != null) {
                    arrayList.addAll(list2);
                }
                return new y2.u(j.f1234a, j.f1235b, (String) j.f1238e, arrayList, j.f1236c);
            case -107:
                return new M5.b((M5.d) f(byteBuffer.get(), byteBuffer), (ColorDrawable) f(byteBuffer.get(), byteBuffer), (M5.c) f(byteBuffer.get(), byteBuffer), (M5.c) f(byteBuffer.get(), byteBuffer), (M5.c) f(byteBuffer.get(), byteBuffer), (M5.c) f(byteBuffer.get(), byteBuffer));
            case -106:
                return new M5.c((ColorDrawable) f(byteBuffer.get(), byteBuffer), (ColorDrawable) f(byteBuffer.get(), byteBuffer), (M5.a) f(byteBuffer.get(), byteBuffer), (Double) f(byteBuffer.get(), byteBuffer));
            case -105:
                int intValue = ((Integer) f(byteBuffer.get(), byteBuffer)).intValue();
                if (intValue >= 0 && intValue < M5.a.values().length) {
                    return M5.a.values()[intValue];
                }
                AbstractC1663a.j(intValue, "Invalid index for NativeTemplateFontStyle: ", "NativeTemplateFontStyle");
                return M5.a.f4592a;
            case -104:
                int intValue2 = ((Integer) f(byteBuffer.get(), byteBuffer)).intValue();
                if (intValue2 >= 0 && intValue2 < M5.d.values().length) {
                    return M5.d.values()[intValue2];
                }
                AbstractC1663a.j(intValue2, "Invalid template type index: ", "NativeTemplateType");
                return M5.d.MEDIUM;
            case -103:
                return new ColorDrawable(Color.argb(((Integer) f(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) f(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) f(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) f(byteBuffer.get(), byteBuffer)).intValue()));
            case -102:
                String str3 = (String) f(byteBuffer.get(), byteBuffer);
                try {
                    AbstractC0486a1.n(Class.forName(str3).getDeclaredConstructor(null).newInstance(null));
                    throw null;
                } catch (ClassNotFoundException unused) {
                    w1.L.n("Class not found: ", str3, "FlutterMediationExtras");
                    return null;
                } catch (IllegalAccessException unused2) {
                    w1.L.n("Illegal Access to ", str3, "FlutterMediationExtras");
                    return null;
                } catch (InstantiationException unused3) {
                    w1.L.n("Unable to instantiate class ", str3, "FlutterMediationExtras");
                    return null;
                } catch (NoSuchMethodException unused4) {
                    Log.e("FlutterMediationExtras", "No such method found: " + str3 + ".getDeclaredConstructor()");
                    return null;
                } catch (InvocationTargetException unused5) {
                    w1.L.n("Invocation Target Exception for: ", str3, "FlutterMediationExtras");
                    return null;
                }
        }
    }

    @Override // A5.x
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof C0343w) {
            C0343w c0343w = (C0343w) obj;
            if (c0343w instanceof C0341u) {
                C0341u c0341u = (C0341u) c0343w;
                byteArrayOutputStream.write(-110);
                k(byteArrayOutputStream, Integer.valueOf(c0341u.f4509b));
                k(byteArrayOutputStream, c0341u.f4507e);
                k(byteArrayOutputStream, c0341u.f4506d);
                return;
            }
            if (c0343w instanceof C0339s) {
                byteArrayOutputStream.write(-114);
                C0339s c0339s = (C0339s) c0343w;
                k(byteArrayOutputStream, c0339s.f4505d);
                k(byteArrayOutputStream, Integer.valueOf(c0339s.f4509b));
                return;
            }
            if (c0343w instanceof C0342v) {
                byteArrayOutputStream.write(-113);
                return;
            } else {
                if (c0343w instanceof C0340t) {
                    byteArrayOutputStream.write(-126);
                    return;
                }
                byteArrayOutputStream.write(-128);
                k(byteArrayOutputStream, Integer.valueOf(c0343w.f4509b));
                k(byteArrayOutputStream, Integer.valueOf(c0343w.f4510c));
                return;
            }
        }
        if (obj instanceof C0334m) {
            byteArrayOutputStream.write(-122);
            C0334m c0334m = (C0334m) obj;
            k(byteArrayOutputStream, c0334m.f4496a);
            k(byteArrayOutputStream, c0334m.f4497b);
            k(byteArrayOutputStream, c0334m.j);
            k(byteArrayOutputStream, c0334m.f4484k);
            k(byteArrayOutputStream, c0334m.f4498c);
            k(byteArrayOutputStream, c0334m.f4499d);
            k(byteArrayOutputStream, c0334m.f4500e);
            k(byteArrayOutputStream, c0334m.f4485l);
            k(byteArrayOutputStream, c0334m.f4501f);
            k(byteArrayOutputStream, c0334m.f4502g);
            k(byteArrayOutputStream, c0334m.f4504i);
            return;
        }
        if (obj instanceof r) {
            byteArrayOutputStream.write(-127);
            r rVar = (r) obj;
            k(byteArrayOutputStream, rVar.f4496a);
            k(byteArrayOutputStream, rVar.f4497b);
            k(byteArrayOutputStream, rVar.f4498c);
            k(byteArrayOutputStream, rVar.f4499d);
            k(byteArrayOutputStream, rVar.f4500e);
            k(byteArrayOutputStream, rVar.f4501f);
            k(byteArrayOutputStream, rVar.f4502g);
            k(byteArrayOutputStream, rVar.f4504i);
            return;
        }
        if (obj instanceof N) {
            byteArrayOutputStream.write(-124);
            N n2 = (N) obj;
            k(byteArrayOutputStream, n2.f4420a);
            k(byteArrayOutputStream, n2.f4421b);
            return;
        }
        if (obj instanceof C0327f) {
            byteArrayOutputStream.write(-115);
            C0327f c0327f = (C0327f) obj;
            k(byteArrayOutputStream, c0327f.f4463a);
            k(byteArrayOutputStream, Long.valueOf(c0327f.f4464b));
            k(byteArrayOutputStream, c0327f.f4465c);
            k(byteArrayOutputStream, c0327f.f4466d);
            k(byteArrayOutputStream, c0327f.f4467e);
            k(byteArrayOutputStream, c0327f.f4468f);
            k(byteArrayOutputStream, c0327f.f4469g);
            k(byteArrayOutputStream, c0327f.f4470h);
            k(byteArrayOutputStream, c0327f.f4471i);
            return;
        }
        if (obj instanceof C0330i) {
            byteArrayOutputStream.write(-116);
            C0330i c0330i = (C0330i) obj;
            k(byteArrayOutputStream, c0330i.f4476a);
            k(byteArrayOutputStream, c0330i.f4477b);
            k(byteArrayOutputStream, c0330i.f4478c);
            k(byteArrayOutputStream, c0330i.f4479d);
            k(byteArrayOutputStream, c0330i.f4480e);
            return;
        }
        if (obj instanceof C0328g) {
            byteArrayOutputStream.write(-123);
            C0328g c0328g = (C0328g) obj;
            k(byteArrayOutputStream, Integer.valueOf(c0328g.f4472a));
            k(byteArrayOutputStream, c0328g.f4473b);
            k(byteArrayOutputStream, c0328g.f4474c);
            k(byteArrayOutputStream, c0328g.f4475d);
            return;
        }
        if (obj instanceof C0326e) {
            byteArrayOutputStream.write(-117);
            C0326e c0326e = (C0326e) obj;
            k(byteArrayOutputStream, Integer.valueOf(c0326e.f4460a));
            k(byteArrayOutputStream, c0326e.f4461b);
            k(byteArrayOutputStream, c0326e.f4462c);
            return;
        }
        if (obj instanceof EnumC0344x) {
            byteArrayOutputStream.write(-121);
            EnumC0344x enumC0344x = (EnumC0344x) obj;
            int ordinal = enumC0344x.ordinal();
            if (ordinal == 0) {
                k(byteArrayOutputStream, "notReady");
                return;
            } else if (ordinal == 1) {
                k(byteArrayOutputStream, "ready");
                return;
            } else {
                throw new IllegalArgumentException("Unable to handle state: " + enumC0344x);
            }
        }
        if (obj instanceof y) {
            byteArrayOutputStream.write(-120);
            y yVar = (y) obj;
            k(byteArrayOutputStream, yVar.f4514a);
            k(byteArrayOutputStream, yVar.f4515b);
            k(byteArrayOutputStream, yVar.f4516c);
            return;
        }
        if (obj instanceof E) {
            byteArrayOutputStream.write(-119);
            k(byteArrayOutputStream, ((E) obj).f4397a);
            return;
        }
        if (obj instanceof S) {
            byteArrayOutputStream.write(-118);
            S s7 = (S) obj;
            k(byteArrayOutputStream, s7.f4435a);
            k(byteArrayOutputStream, s7.f4436b);
            return;
        }
        if (obj instanceof J) {
            byteArrayOutputStream.write(-112);
            J j = (J) obj;
            k(byteArrayOutputStream, j.f4409a);
            k(byteArrayOutputStream, j.f4410b);
            k(byteArrayOutputStream, j.f4411c);
            k(byteArrayOutputStream, j.f4412d);
            k(byteArrayOutputStream, j.f4413e);
            k(byteArrayOutputStream, j.f4414f);
            return;
        }
        if (obj instanceof y2.u) {
            byteArrayOutputStream.write(-108);
            y2.u uVar = (y2.u) obj;
            String str = uVar.f18180c;
            if (str == null) {
                str = "";
            }
            k(byteArrayOutputStream, str);
            k(byteArrayOutputStream, Integer.valueOf(uVar.f18178a));
            k(byteArrayOutputStream, Integer.valueOf(uVar.f18179b));
            k(byteArrayOutputStream, new ArrayList(uVar.f18181d));
            return;
        }
        if (obj instanceof T) {
            byteArrayOutputStream.write(-111);
            T t7 = (T) obj;
            k(byteArrayOutputStream, t7.f4437a);
            k(byteArrayOutputStream, t7.f4438b);
            k(byteArrayOutputStream, t7.f4439c);
            return;
        }
        if (obj instanceof M5.b) {
            byteArrayOutputStream.write(-107);
            M5.b bVar = (M5.b) obj;
            k(byteArrayOutputStream, bVar.f4594a);
            k(byteArrayOutputStream, bVar.f4595b);
            k(byteArrayOutputStream, bVar.f4596c);
            k(byteArrayOutputStream, bVar.f4597d);
            k(byteArrayOutputStream, bVar.f4598e);
            k(byteArrayOutputStream, bVar.f4599f);
            return;
        }
        if (obj instanceof M5.a) {
            byteArrayOutputStream.write(-105);
            k(byteArrayOutputStream, Integer.valueOf(((M5.a) obj).ordinal()));
            return;
        }
        if (obj instanceof M5.d) {
            byteArrayOutputStream.write(-104);
            k(byteArrayOutputStream, Integer.valueOf(((M5.d) obj).ordinal()));
            return;
        }
        if (obj instanceof M5.c) {
            byteArrayOutputStream.write(-106);
            M5.c cVar = (M5.c) obj;
            k(byteArrayOutputStream, cVar.f4600a);
            k(byteArrayOutputStream, cVar.f4601b);
            k(byteArrayOutputStream, cVar.f4602c);
            k(byteArrayOutputStream, cVar.a());
            return;
        }
        if (!(obj instanceof ColorDrawable)) {
            super.k(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(-103);
        int color = ((ColorDrawable) obj).getColor();
        k(byteArrayOutputStream, Integer.valueOf(Color.alpha(color)));
        k(byteArrayOutputStream, Integer.valueOf(Color.red(color)));
        k(byteArrayOutputStream, Integer.valueOf(Color.green(color)));
        k(byteArrayOutputStream, Integer.valueOf(Color.blue(color)));
    }
}
