package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.logging.Level;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocket;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class oq0 implements iu0, y01, y22, ny1 {

    /* JADX INFO: renamed from: n */
    public static oq0 f5836n;

    /* JADX INFO: renamed from: o */
    public static oq0 f5837o;

    /* JADX INFO: renamed from: p */
    public static Boolean f5838p;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5839j;

    /* JADX INFO: renamed from: k */
    public Object f5840k;

    /* JADX INFO: renamed from: l */
    public Object f5841l;

    /* JADX INFO: renamed from: m */
    public Object f5842m;

    public oq0(int i) {
        this.f5839j = i;
        switch (i) {
            case 7:
                this.f5840k = new pm1("", 0L, null);
                this.f5841l = new pm1("", 0L, null);
                this.f5842m = new ArrayList();
                break;
            case 15:
                this.f5840k = new AtomicBoolean(false);
                new ConcurrentHashMap();
                this.f5841l = new ConcurrentHashMap();
                new ConcurrentHashMap();
                this.f5842m = new ConcurrentHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: i */
    public static Method m3730i(Class cls, String str, Class[] clsArr) {
        if (cls != null) {
            try {
                if ((cls.getModifiers() & 1) == 0) {
                    return m3730i(cls.getSuperclass(), str, clsArr);
                }
                Method method = cls.getMethod(str, clsArr);
                try {
                    if ((method.getModifiers() & 1) != 0) {
                        return method;
                    }
                } catch (NoSuchMethodException unused) {
                    return method;
                }
            } catch (NoSuchMethodException unused2) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static oq0 m3731n(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new oq0(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032 A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:6:0x0024, B:19:0x006b, B:22:0x008f, B:13:0x0032, B:15:0x0058, B:17:0x0063, B:18:0x0067), top: B:54:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0058 A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:6:0x0024, B:19:0x006b, B:22:0x008f, B:13:0x0032, B:15:0x0058, B:17:0x0063, B:18:0x0067), top: B:54:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0063 A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:6:0x0024, B:19:0x006b, B:22:0x008f, B:13:0x0032, B:15:0x0058, B:17:0x0063, B:18:0x0067), top: B:54:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0067 A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:6:0x0024, B:19:0x006b, B:22:0x008f, B:13:0x0032, B:15:0x0058, B:17:0x0063, B:18:0x0067), top: B:54:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x006b A[Catch: all -> 0x0027, PHI: r10
      0x006b: PHI (r10v12 int) = (r10v6 int), (r10v0 int) binds: [B:12:0x0030, B:10:0x002d] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0027, blocks: (B:6:0x0024, B:19:0x006b, B:22:0x008f, B:13:0x0032, B:15:0x0058, B:17:0x0063, B:18:0x0067), top: B:54:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0130  */
    /* JADX WARN: Code duplicated, block: B:42:0x0133  */
    /* JADX WARN: Code duplicated, block: B:52:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.y22
    /* JADX INFO: renamed from: a */
    public void mo1075a(String str, int i, Throwable th, byte[] bArr, Map map) {
        int i2;
        d32 d32Var;
        AtomicReference atomicReference;
        ry1 ry1Var;
        qt1 qt1Var;
        String strSubstring;
        Object obj;
        switch (this.f5839j) {
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                v22 v22Var = (v22) this.f5840k;
                v22Var.mo11z();
                e62 e62Var = (e62) this.f5842m;
                if (i != 200 && i != 204) {
                    i2 = 304;
                    if (i != 304) {
                        i2 = i;
                    }
                    ky1 ky1Var = ((f02) v22Var.f7192j).f2247o;
                    f02.m1560m(ky1Var);
                    ky1Var.f4603r.m5315d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(e62Var.f1973j), Integer.valueOf(i2), th);
                    if (Arrays.asList(((String) jx1.f4214u.m2715a(null)).split(",")).contains(String.valueOf(i2))) {
                        d32Var = d32.f1544n;
                    } else {
                        d32Var = d32.f1543m;
                    }
                    atomicReference = (AtomicReference) this.f5841l;
                    v42 v42VarM1573p = ((f02) v22Var.f7192j).m1573p();
                    long j = e62Var.f1973j;
                    vp1 vp1Var = new vp1(d32Var.f1546j, j, e62Var.f1978o);
                    v42VarM1573p.mo11z();
                    v42VarM1573p.m3446B();
                    v42VarM1573p.m5067O(new RunnableC0702sr(v42VarM1573p, v42VarM1573p.m5069Q(true), vp1Var, 16, false));
                    ky1 ky1Var2 = ((f02) v22Var.f7192j).f2247o;
                    f02.m1560m(ky1Var2);
                    ky1Var2.f4608w.m5314c(Long.valueOf(j), d32Var, "[sgtm] Updated status for row_id");
                    synchronized (atomicReference) {
                        atomicReference.set(d32Var);
                        atomicReference.notifyAll();
                        break;
                    }
                    return;
                }
                i2 = i;
                if (th == null) {
                    ky1 ky1Var3 = ((f02) v22Var.f7192j).f2247o;
                    f02.m1560m(ky1Var3);
                    ky1Var3.f4608w.m5313b(Long.valueOf(e62Var.f1973j), "[sgtm] Upload succeeded for row_id");
                    d32Var = d32.f1542l;
                } else {
                    ky1 ky1Var4 = ((f02) v22Var.f7192j).f2247o;
                    f02.m1560m(ky1Var4);
                    ky1Var4.f4603r.m5315d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(e62Var.f1973j), Integer.valueOf(i2), th);
                    if (Arrays.asList(((String) jx1.f4214u.m2715a(null)).split(",")).contains(String.valueOf(i2))) {
                        d32Var = d32.f1544n;
                    } else {
                        d32Var = d32.f1543m;
                    }
                }
                atomicReference = (AtomicReference) this.f5841l;
                v42 v42VarM1573p2 = ((f02) v22Var.f7192j).m1573p();
                long j2 = e62Var.f1973j;
                vp1 vp1Var2 = new vp1(d32Var.f1546j, j2, e62Var.f1978o);
                v42VarM1573p2.mo11z();
                v42VarM1573p2.m3446B();
                v42VarM1573p2.m5067O(new RunnableC0702sr(v42VarM1573p2, v42VarM1573p2.m5069Q(true), vp1Var2, 16, false));
                ky1 ky1Var5 = ((f02) v22Var.f7192j).f2247o;
                f02.m1560m(ky1Var5);
                ky1Var5.f4608w.m5314c(Long.valueOf(j2), d32Var, "[sgtm] Updated status for row_id");
                synchronized (atomicReference) {
                    atomicReference.set(d32Var);
                    atomicReference.notifyAll();
                    return;
                }
            case 16:
                ((x62) this.f5842m).m5592z(true, i, th, bArr, (String) this.f5840k, (ArrayList) this.f5841l, map);
                return;
            default:
                long j3 = ((z62) this.f5841l).f9614a;
                x62 x62Var = (x62) this.f5842m;
                String str2 = (String) this.f5840k;
                x62Var.mo1564c().mo11z();
                x62Var.m5574m0();
                if (bArr == null) {
                    try {
                        bArr = new byte[0];
                    } finally {
                        x62Var.f8805D = false;
                        x62Var.m5546O();
                    }
                }
                if (i == 200) {
                    if (th == null) {
                        qt1 qt1Var2 = x62Var.f8823l;
                        x62.m5533U(qt1Var2);
                        qt1Var2.m4154H(Long.valueOf(j3));
                        x62Var.mo1563b().f4608w.m5314c(str2, Integer.valueOf(i), "Successfully uploaded batch from upload queue. appId, status");
                        ry1Var = x62Var.f8822k;
                        x62.m5533U(ry1Var);
                        if (ry1Var.m4429E()) {
                            qt1Var = x62Var.f8823l;
                            x62.m5533U(qt1Var);
                            if (qt1Var.m4152G(str2)) {
                                x62Var.m5586t(str2);
                            } else {
                                x62Var.m5545N();
                            }
                        } else {
                            x62Var.m5545N();
                        }
                    } else {
                        String str3 = new String(bArr, StandardCharsets.UTF_8);
                        strSubstring = str3.substring(0, Math.min(32, str3.length()));
                        wc1 wc1Var = x62Var.mo1563b().f4605t;
                        Integer numValueOf = Integer.valueOf(i);
                        obj = th;
                        if (th == null) {
                            obj = strSubstring;
                        }
                        wc1Var.m5315d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf, obj);
                        qt1 qt1Var3 = x62Var.f8823l;
                        x62.m5533U(qt1Var3);
                        qt1Var3.m4162M(Long.valueOf(j3));
                        x62Var.m5545N();
                    }
                } else if (i == 204) {
                    i = 204;
                    if (th == null) {
                        qt1 qt1Var4 = x62Var.f8823l;
                        x62.m5533U(qt1Var4);
                        qt1Var4.m4154H(Long.valueOf(j3));
                        x62Var.mo1563b().f4608w.m5314c(str2, Integer.valueOf(i), "Successfully uploaded batch from upload queue. appId, status");
                        ry1Var = x62Var.f8822k;
                        x62.m5533U(ry1Var);
                        if (ry1Var.m4429E()) {
                            qt1Var = x62Var.f8823l;
                            x62.m5533U(qt1Var);
                            if (qt1Var.m4152G(str2)) {
                                x62Var.m5586t(str2);
                            } else {
                                x62Var.m5545N();
                            }
                        } else {
                            x62Var.m5545N();
                        }
                    } else {
                        String str4 = new String(bArr, StandardCharsets.UTF_8);
                        strSubstring = str4.substring(0, Math.min(32, str4.length()));
                        wc1 wc1Var2 = x62Var.mo1563b().f4605t;
                        Integer numValueOf2 = Integer.valueOf(i);
                        obj = th;
                        if (th == null) {
                            obj = strSubstring;
                        }
                        wc1Var2.m5315d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf2, obj);
                        qt1 qt1Var5 = x62Var.f8823l;
                        x62.m5533U(qt1Var5);
                        qt1Var5.m4162M(Long.valueOf(j3));
                        x62Var.m5545N();
                    }
                } else {
                    String str5 = new String(bArr, StandardCharsets.UTF_8);
                    strSubstring = str5.substring(0, Math.min(32, str5.length()));
                    wc1 wc1Var3 = x62Var.mo1563b().f4605t;
                    Integer numValueOf3 = Integer.valueOf(i);
                    obj = th;
                    if (th == null) {
                        obj = strSubstring;
                    }
                    wc1Var3.m5315d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf3, obj);
                    qt1 qt1Var6 = x62Var.f8823l;
                    x62.m5533U(qt1Var6);
                    qt1Var6.m4162M(Long.valueOf(j3));
                    x62Var.m5545N();
                }
                return;
        }
    }

    @Override // p000.y01
    public void accept(Object obj, Object obj2) {
        f22 f22Var = (f22) ((h22) obj).m3890l();
        w12 w12Var = new w12((e22) this.f5841l, (p90) this.f5842m);
        String str = (String) this.f5840k;
        Parcel parcelM5810d = f22Var.m5810d();
        parcelM5810d.writeString(str);
        iu1.m2703c(parcelM5810d, w12Var);
        f22Var.m5806F(parcelM5810d, 28);
    }

    /* JADX INFO: renamed from: b */
    public void m3732b(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f5840k;
        iy0 iy0Var = new iy0(byteArrayOutputStream, map, (HashMap) this.f5841l, (ss0) this.f5842m);
        if (obj == null) {
            return;
        }
        ss0 ss0Var = (ss0) map.get(obj.getClass());
        if (ss0Var != null) {
            ss0Var.mo103a(obj, iy0Var);
            return;
        }
        throw new C0855ww("No encoder for " + obj.getClass());
    }

    /* JADX INFO: renamed from: c */
    public di1 m3733c(Class cls, String str) {
        di1 di1VarMo1870f;
        fi1 fi1Var = (fi1) this.f5841l;
        gi1 gi1Var = (gi1) this.f5840k;
        gi1Var.getClass();
        LinkedHashMap linkedHashMap = gi1Var.f2759a;
        di1 di1Var = (di1) linkedHashMap.get(str);
        if (cls.isInstance(di1Var)) {
            di1Var.getClass();
            return di1Var;
        }
        yq0 yq0Var = new yq0((sq1) this.f5842m);
        ((LinkedHashMap) yq0Var.f7192j).put(nc1.f5378q, str);
        try {
            di1VarMo1870f = fi1Var.mo1871p(cls, yq0Var);
        } catch (AbstractMethodError unused) {
            di1VarMo1870f = fi1Var.mo1870f(cls);
        }
        di1VarMo1870f.getClass();
        di1 di1Var2 = (di1) linkedHashMap.put(str, di1VarMo1870f);
        if (di1Var2 != null) {
            di1Var2.mo1228b();
        }
        return di1VarMo1870f;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.f5839j) {
            case 7:
                oq0 oq0Var = new oq0(((pm1) this.f5840k).clone());
                ArrayList arrayList = (ArrayList) this.f5842m;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ArrayList) oq0Var.f5842m).add(((pm1) obj).clone());
                }
                return oq0Var;
            default:
                return super.clone();
        }
    }

    /* JADX INFO: renamed from: d */
    public ColorStateList m3734d(int i) {
        int resourceId;
        ColorStateList colorStateListM2806o;
        TypedArray typedArray = (TypedArray) this.f5841l;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM2806o = j22.m2806o((Context) this.f5840k, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM2806o;
    }

    /* JADX INFO: renamed from: e */
    public Drawable m3735e(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f5841l;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : j22.m2807p((Context) this.f5840k, resourceId);
    }

    /* JADX INFO: renamed from: f */
    public Drawable m3736f(int i) {
        int resourceId;
        Drawable drawableM1580d;
        if (!((TypedArray) this.f5841l).hasValue(i) || (resourceId = ((TypedArray) this.f5841l).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0939z5 c0939z5M5859a = C0939z5.m5859a();
        Context context = (Context) this.f5840k;
        synchronized (c0939z5M5859a) {
            drawableM1580d = c0939z5M5859a.f9607a.m1580d(context, resourceId, true);
        }
        return drawableM1580d;
    }

    /* JADX INFO: renamed from: g */
    public Typeface m3737g(int i, int i2, C0940z6 c0940z6) {
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f5841l).getResourceId(i, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.f5842m) == null) {
                this.f5842m = new TypedValue();
            }
            Context context = (Context) this.f5840k;
            TypedValue typedValue = (TypedValue) this.f5842m;
            ThreadLocal threadLocal = k21.f4266a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String string = charSequence.toString();
                if (!string.startsWith("res/")) {
                    c0940z6.m5863a();
                    return null;
                }
                Typeface typeface = (Typeface) ye1.f9284b.m4362b(ye1.m5793d(resources, resourceId, string, typedValue.assetCookie, i2));
                int i3 = 12;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0195f1(i3, c0940z6, typeface));
                    return typeface;
                }
                try {
                    try {
                        if (!string.toLowerCase().endsWith(".xml")) {
                            Typeface typefaceM5792c = ye1.m5792c(resources, resourceId, string, typedValue.assetCookie, i2);
                            if (typefaceM5792c != null) {
                                new Handler(Looper.getMainLooper()).post(new RunnableC0195f1(i3, c0940z6, typefaceM5792c));
                            } else {
                                c0940z6.m5863a();
                            }
                            return typefaceM5792c;
                        }
                        m40 m40VarM5986o = AbstractC0959zp.m5986o(resources.getXml(resourceId), resources);
                        if (m40VarM5986o != null) {
                            return ye1.m5791b(context, m40VarM5986o, resources, resourceId, string, typedValue.assetCookie, i2, c0940z6);
                        }
                        try {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            c0940z6.m5863a();
                            return null;
                        } catch (IOException e) {
                            iOException = e;
                        } catch (XmlPullParserException e2) {
                            xmlPullParserException = e2;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                            c0940z6.m5863a();
                            return null;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        iOException = e;
                    } catch (XmlPullParserException e4) {
                        e = e4;
                        xmlPullParserException = e;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                        c0940z6.m5863a();
                        return null;
                    }
                } catch (IOException e5) {
                    e = e5;
                } catch (XmlPullParserException e6) {
                    e = e6;
                }
                iOException = e;
                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), iOException);
                c0940z6.m5863a();
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public Method m3738h(Class cls) {
        Class cls2;
        Method methodM3730i = m3730i(cls, (String) this.f5840k, (Class[]) this.f5842m);
        if (methodM3730i == null || (cls2 = (Class) this.f5841l) == null || cls2.isAssignableFrom(methodM3730i.getReturnType())) {
            return methodM3730i;
        }
        return null;
    }

    @Override // p000.iu0
    /* JADX INFO: renamed from: j */
    public void mo86j(v92 v92Var) {
        w31 w31Var = (w31) this.f5841l;
        String str = (String) this.f5840k;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f5842m;
        synchronized (w31Var.f8359a) {
            w31Var.f8359a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* JADX INFO: renamed from: k */
    public Object m3739k(SSLSocket sSLSocket, Object... objArr) {
        Method methodM3738h = m3738h(sSLSocket.getClass());
        if (methodM3738h == null) {
            throw new AssertionError("Method " + ((String) this.f5840k) + " not supported for object " + sSLSocket);
        }
        try {
            return methodM3738h.invoke(sSLSocket, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodM3738h);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m3740l(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method methodM3738h = m3738h(sSLSocket.getClass());
            if (methodM3738h == null) {
                return;
            }
            try {
                methodM3738h.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: m */
    public Object m3741m(SSLSocket sSLSocket, Object... objArr) {
        try {
            return m3739k(sSLSocket, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m3742o() {
        ((TypedArray) this.f5841l).recycle();
    }

    /* JADX INFO: renamed from: p */
    public C0415l m3743p() {
        String strSubstring;
        int i;
        j52 j52Var;
        j52 j52Var2;
        String str = (String) this.f5840k;
        x22 x22Var = (x22) this.f5841l;
        nb1 nb1Var = x22Var.f8768f;
        if (!j22.m2791J(x22Var.f8764b)) {
            return new C0415l(v72.m5112A(), new vr0(3, 17));
        }
        if (f5838p == null) {
            f5838p = Boolean.valueOf(Process.isIsolated());
        }
        if (f5838p.booleanValue()) {
            return new C0415l(v72.m5112A(), new vr0(3, 18));
        }
        t72 t72VarM604b = x22Var.f8769g.m604b();
        ko1 ko1Var = t72VarM604b.f7331c;
        zn1 zn1Var = zn1.f9869n;
        C0089c8 c0089c8 = u22.f7657a;
        int iIndexOf = str.indexOf("#");
        if (iIndexOf >= 0) {
            strSubstring = str.substring(0, iIndexOf);
        } else {
            if (str.contains("@")) {
                C0270h1.m2190f("Invalid package name: ".concat(str));
                return null;
            }
            strSubstring = str;
        }
        if (!t72VarM604b.f7336h) {
            i = 14;
        } else if (!t72VarM604b.f7329a || !t72VarM604b.f7330b.contains(zn1Var)) {
            i = 3;
        } else if (ko1Var.mo2330c() != 0) {
            List list = t72VarM604b.f7334f;
            if (list.isEmpty() || list.contains(strSubstring)) {
                i = t72VarM604b.f7335g.contains(strSubstring) ? 6 : 0;
            } else {
                i = 5;
            }
        } else {
            i = 4;
        }
        if (i != 0) {
            j52Var2 = new j52(null, new vr0(i));
        } else {
            try {
                String str2 = t72VarM604b.f7333e;
                if (str2.isEmpty()) {
                    su0 su0Var = (su0) x22Var.f8770h.get();
                    if (su0Var.mo1040b()) {
                        str2 = ((ApplicationInfo) su0Var.mo1039a()).dataDir;
                    } else {
                        AbstractC0477mo.m3412p(Level.WARNING, x22Var.m5498a(), null, "Unable to get GMS application info, using defaults.", new Object[0]);
                        j52Var = new j52(p42.f5986c, new vr0(3, 7));
                        j52Var2 = j52Var;
                    }
                }
                String str3 = File.separator;
                String str4 = t72VarM604b.f7332d;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
                sb.append(str2);
                sb.append(str3);
                sb.append(str4);
                String string = sb.toString();
                oq0 oq0Var = new oq0(ko1Var, str);
                Uri.Builder builderScheme = new Uri.Builder().scheme("file");
                String string2 = oq0Var.m3744q().toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + string.length() + String.valueOf(str3).length() + string2.length());
                sb2.append(str3);
                sb2.append(string);
                sb2.append(str3);
                sb2.append(string2);
                Uri uriBuild = builderScheme.appendEncodedPath(sb2.toString()).build();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                try {
                    try {
                        g82 g82Var = (g82) nb1Var.get();
                        boolean zM4244t = t72VarM604b.f7339k.m4244t();
                        n42 n42Var = new n42();
                        n42Var.f5297j = zM4244t;
                        j52 j52Var3 = new j52((p42) g82Var.m1999a(uriBuild, n42Var), new vr0(5, 2));
                        StrictMode.setThreadPolicy(threadPolicy);
                        j52Var2 = j52Var3;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th;
                    }
                } catch (FileNotFoundException unused) {
                    AbstractC0477mo.m3412p(Level.INFO, x22Var.m5498a(), null, "Shared storage file not found for %s", str);
                    j52Var2 = new j52(null, new vr0(8));
                    StrictMode.setThreadPolicy(threadPolicy);
                } catch (mp1 e) {
                    AbstractC0477mo.m3412p(Level.SEVERE, x22Var.m5498a(), e, "Failed to parse snapshot from shared storage for %s", str);
                    j52Var2 = new j52(null, new vr0(9));
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            } catch (Exception e2) {
                AbstractC0477mo.m3412p(Level.WARNING, x22Var.m5498a(), e2, "Failed to read shared file for %s", str);
                j52Var = new j52(p42.f5986c, new vr0(3, 10));
                j52Var2 = j52Var;
            }
        }
        vr0 vr0Var = j52Var2.f3825b;
        p42 p42Var = j52Var2.f3824a;
        if (p42Var != null) {
            return new C0415l(p42Var, vr0Var);
        }
        int i2 = vr0Var.f8255b;
        try {
            g82 g82Var2 = (g82) nb1Var.get();
            Uri uri = (Uri) this.f5842m;
            cq1 cq1Var = (cq1) v72.m5112A().mo14s(7);
            so1 so1Var = so1.f7176a;
            int i3 = fo1.f2465a;
            so1 so1Var2 = so1.f7177b;
            InputStream inputStreamM3875t = p80.m3875t(g82Var2.m2000b(uri));
            try {
                zo1 zo1VarM5821a = ((yo1) cq1Var).m5821a(inputStreamM3875t, so1Var2);
                if (inputStreamM3875t != null) {
                    inputStreamM3875t.close();
                }
                return new C0415l((v72) zo1VarM5821a, new vr0(4, i2));
            } catch (Throwable th2) {
                if (inputStreamM3875t != null) {
                    try {
                        inputStreamM3875t.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException | RuntimeException unused2) {
            AbstractC0477mo.m3412p(Level.INFO, x22Var.m5498a(), null, "Unable to retrieve flag snapshot for %s, using defaults.", str);
            return m3747t() ? new C0415l(p42.f5986c, new vr0(3, 16)) : new C0415l(v72.m5112A(), new vr0(3, 11));
        }
    }

    /* JADX INFO: renamed from: q */
    public File m3744q() {
        String str = (String) ((nb1) this.f5841l).get();
        String str2 = (String) ((nb1) this.f5842m).get();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3);
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append(".pb");
        return new File(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00db  */
    /* JADX WARN: Code duplicated, block: B:57:0x004e A[EDGE_INSN: B:57:0x004e->B:55:0x004e BREAK  A[LOOP:1: B:25:0x0070->B:60:?], SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    public void m3745r(ko1 ko1Var, Set set, String str) {
        b62[] b62VarArr;
        if (!set.isEmpty() && !((AtomicBoolean) this.f5840k).getAndSet(true)) {
            if (nu1.f5547l == null) {
                synchronized (nu1.class) {
                    try {
                        if (nu1.f5547l == null) {
                            nu1.f5547l = new nu1(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            ((CopyOnWriteArrayList) nu1.f5547l.f5551k).add(0, new bx1(6));
        }
        final byte[] bArrM3067p = ko1Var.m3067p();
        ((ConcurrentHashMap) this.f5841l).compute(str, new BiFunction() { // from class: z52
            @Override // java.util.function.BiFunction
            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                byte[] bArr = (byte[]) obj2;
                byte[] bArr2 = bArrM3067p;
                return Arrays.equals(bArr, bArr2) ? bArr : bArr2;
            }
        });
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AtomicReference atomicReference = (AtomicReference) ((ConcurrentHashMap) this.f5842m).putIfAbsent((String) it.next(), new AtomicReference(new b62(str, bArrM3067p)));
            if (atomicReference != null) {
                while (true) {
                    Object obj = atomicReference.get();
                    if (obj instanceof b62) {
                        b62 b62Var = (b62) obj;
                        if (str.equals(b62Var.f744j)) {
                            b62Var.m597a(bArrM3067p);
                            break;
                        }
                        b62 b62Var2 = new b62(str, bArrM3067p);
                        b62VarArr = str.compareTo(b62Var.f744j) < 0 ? new b62[]{b62Var2, b62Var} : new b62[]{b62Var, b62Var2};
                        do {
                            if (atomicReference.compareAndSet(obj, b62VarArr)) {
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    } else {
                        b62[] b62VarArr2 = (b62[]) obj;
                        int iBinarySearch = Arrays.binarySearch(b62VarArr2, str);
                        if (iBinarySearch >= 0) {
                            b62VarArr2[iBinarySearch].m597a(bArrM3067p);
                            break;
                        }
                        int i = ~iBinarySearch;
                        int length = b62VarArr2.length;
                        int i2 = length + 1;
                        int i3 = length - i;
                        if (i3 == 0) {
                            b62VarArr = (b62[]) Arrays.copyOf(b62VarArr2, i2);
                        } else {
                            b62[] b62VarArr3 = new b62[i2];
                            System.arraycopy(b62VarArr2, 0, b62VarArr3, 0, i);
                            System.arraycopy(b62VarArr2, i, b62VarArr3, i + 1, i3);
                            b62VarArr = b62VarArr3;
                        }
                        b62VarArr[i] = new b62(str, bArrM3067p);
                        do {
                            if (atomicReference.compareAndSet(obj, b62VarArr)) {
                                break;
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public synchronized void m3746s(int i, int i2, long j, long j2) {
        ((f02) this.f5840k).f2252t.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.f5842m;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        v92 v92VarM1272c = ((dm1) this.f5841l).m1272c(new uc1(0, Arrays.asList(new xp0(36301, i, 0, j, j2, null, null, 0, i2))));
        C0683s8 c0683s8 = new C0683s8(this, jElapsedRealtime);
        v92VarM1272c.getClass();
        v92VarM1272c.m5126b(rc1.f6820a, c0683s8);
    }

    /* JADX INFO: renamed from: t */
    public boolean m3747t() {
        t42 t42VarM605c = ((x22) this.f5841l).f8769g.m605c();
        return t42VarM605c.m4682v() && ((AbstractCollection) t42VarM605c.m4673A()).contains(zn1.f9869n);
    }

    public /* synthetic */ oq0(Object obj, String str, Object obj2, int i) {
        this.f5839j = i;
        this.f5841l = obj;
        this.f5840k = str;
        this.f5842m = obj2;
    }

    public oq0(wq1 wq1Var, wq1 wq1Var2, Object obj) {
        this.f5839j = 9;
        this.f5840k = wq1Var;
        this.f5842m = wq1Var2;
        this.f5841l = obj;
    }

    public /* synthetic */ oq0(x62 x62Var, String str, Object obj, int i) {
        this.f5839j = i;
        this.f5840k = str;
        this.f5841l = obj;
        this.f5842m = x62Var;
    }

    public /* synthetic */ oq0(Object obj, Serializable serializable, Object obj2, int i) {
        this.f5839j = i;
        this.f5840k = obj;
        this.f5841l = serializable;
        this.f5842m = obj2;
    }

    public oq0(Context context, f02 f02Var) {
        this.f5839j = 11;
        this.f5842m = new AtomicLong(-1L);
        this.f5841l = new dm1(context, dm1.f1751l, new vc1("measurement:api"), f90.f2350c);
        this.f5840k = f02Var;
    }

    public oq0(ko1 ko1Var, String str) {
        this.f5839j = 14;
        this.f5840k = C0427lb.f4749e;
        boolean z = false;
        this.f5841l = a90.m137u(new a81(this, ko1Var, 17, z));
        this.f5842m = a90.m137u(new a81(this, str, 16, z));
    }

    public oq0(x22 x22Var, String str) {
        this.f5839j = 18;
        this.f5841l = x22Var;
        this.f5840k = str;
        Context context = x22Var.f8764b;
        Pattern pattern = l82.f4712a;
        C0902y5 c0902y5 = new C0902y5(context);
        c0902y5.m5737t("phenotype");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append("/");
        sb.append(str);
        sb.append(".pb");
        c0902y5.m5738u(sb.toString());
        this.f5842m = c0902y5.m5739v();
    }

    public oq0(pm1 pm1Var) {
        this.f5839j = 7;
        this.f5840k = pm1Var;
        this.f5841l = pm1Var.clone();
        this.f5842m = new ArrayList();
    }

    public oq0(gi1 gi1Var, fi1 fi1Var, sq1 sq1Var) {
        this.f5839j = 6;
        gi1Var.getClass();
        sq1Var.getClass();
        this.f5840k = gi1Var;
        this.f5841l = fi1Var;
        this.f5842m = sq1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oq0(gi1 gi1Var, fi1 fi1Var) {
        this(gi1Var, fi1Var, C0772un.f7861k);
        this.f5839j = 6;
        gi1Var.getClass();
    }

    public oq0(Context context, TypedArray typedArray) {
        this.f5839j = 4;
        this.f5840k = context;
        this.f5841l = typedArray;
    }

    public oq0(Context context, LocationManager locationManager) {
        this.f5839j = 5;
        this.f5842m = new c31();
        this.f5840k = context;
        this.f5841l = locationManager;
    }
}
