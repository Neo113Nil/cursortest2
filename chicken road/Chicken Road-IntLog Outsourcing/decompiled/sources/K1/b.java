package K1;

import B0.o;
import B4.r;
import D4.AbstractC0001a;
import G0.C0058h;
import G0.C0060j;
import G0.F;
import G0.O;
import H2.l;
import M.C0077f;
import M.C0079h;
import M.C0083l;
import P4.L;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import b2.AbstractC0279e;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import com.onesignal.core.internal.permissions.PermissionsViewModel;
import f4.v;
import g4.AbstractC0460e;
import g4.AbstractC0464i;
import h4.C0485c;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import l1.j;
import l4.EnumC1260a;
import m4.AbstractC1293a;
import m4.AbstractC1295c;
import o4.AbstractC1376a;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;
import p4.AbstractC1384a;
import s.C1411c;
import t.AbstractC1421a;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;
import w.AbstractC1499a;
import w.C1501c;
import w.C1502d;
import w.C1503e;
import w.InterfaceC1500b;
import x2.AbstractC1541d;
import y4.C1572a;
import y4.C1574c;

/* loaded from: classes.dex */
public abstract class b implements O4.b, O4.a {
    public static final boolean A(Object[] objArr, int i2, int i3, List list) {
        if (i3 != list.size()) {
            return false;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            if (!kotlin.jvm.internal.i.a(objArr[i2 + i6], list.get(i6))) {
                return false;
            }
        }
        return true;
    }

    public static final String B(Object[] objArr, int i2, int i3, AbstractC0460e abstractC0460e) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i6 = 0; i6 < i3; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i6];
            if (obj == abstractC0460e) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
        return sb2;
    }

    public static void C(Throwable th, Throwable exception) {
        kotlin.jvm.internal.i.e(th, "<this>");
        kotlin.jvm.internal.i.e(exception, "exception");
        if (th != exception) {
            Integer num = AbstractC1384a.f11643a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            Method method = AbstractC1376a.f11615a;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }

    public static C0485c D(C0485c c0485c) {
        c0485c.h();
        c0485c.f5797c = true;
        return c0485c.f5796b > 0 ? c0485c : C0485c.f5794d;
    }

    public static long K(long j2) {
        if (j2 < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j2 > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j2;
    }

    public static Bundle L(Parcel parcel, int i2) {
        int k02 = k0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (k02 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + k02);
        return readBundle;
    }

    public static Parcelable M(Parcel parcel, int i2, Parcelable.Creator creator) {
        int k02 = k0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (k02 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + k02);
        return parcelable;
    }

    public static String N(Parcel parcel, int i2) {
        int k02 = k0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (k02 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + k02);
        return readString;
    }

    public static Object[] O(Parcel parcel, int i2, Parcelable.Creator creator) {
        int k02 = k0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (k02 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + k02);
        return createTypedArray;
    }

    public static ArrayList P(Parcel parcel, int i2, Parcelable.Creator creator) {
        int k02 = k0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (k02 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + k02);
        return createTypedArrayList;
    }

    public static void S(Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            throw new C1.b(AbstractC0279e.d(i2, "Overread allowed size end="), parcel);
        }
    }

    public static final int T(Cursor c2, String str) {
        String str2;
        kotlin.jvm.internal.i.e(c2, "c");
        int columnIndex = c2.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = c2.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                int i2 = -1;
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = c2.getColumnNames();
                    kotlin.jvm.internal.i.d(columnNames, "columnNames");
                    String concat = ".".concat(str);
                    String j2 = o.j(".", str, '`');
                    int length = columnNames.length;
                    int i3 = 0;
                    int i6 = 0;
                    while (i3 < length) {
                        String str3 = columnNames[i3];
                        int i7 = i6 + 1;
                        if (str3.length() >= str.length() + 2 && (r.H(str3, concat) || (str3.charAt(0) == '`' && r.H(str3, j2)))) {
                            i2 = i6;
                            break;
                        }
                        i3++;
                        i6 = i7;
                    }
                }
                columnIndex = i2;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = c2.getColumnNames();
            kotlin.jvm.internal.i.d(columnNames2, "c.columnNames");
            str2 = AbstractC0464i.X(columnNames2, null, null, 63);
        } catch (Exception e3) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e3);
            str2 = CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static boolean U(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean V(byte b6) {
        return b6 > -65;
    }

    public static List W(Object obj) {
        List singletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.i.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static B2.a X(Context context) {
        String string;
        String string2;
        int i2;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            String str = AbstractC1541d.f12274a.f12272b;
            String str2 = AbstractC1541d.f12275b.f12272b;
            String str3 = null;
            if (bundle == null) {
                string = null;
            } else {
                string = bundle.getString(str, null);
                if (string == null) {
                    string = bundle.getString(str2);
                }
            }
            Bundle bundle2 = applicationInfo.metaData;
            String str4 = AbstractC1541d.f12279f.f12272b;
            if (bundle2 != null) {
                bundle2.getString(str4, null);
            }
            Bundle bundle3 = applicationInfo.metaData;
            String str5 = AbstractC1541d.f12280g.f12272b;
            if (bundle3 != null) {
                bundle3.getString(str5, null);
            }
            Bundle bundle4 = applicationInfo.metaData;
            String str6 = AbstractC1541d.f12276c.f12272b;
            String str7 = AbstractC1541d.f12277d.f12272b;
            if (bundle4 == null) {
                string2 = null;
            } else {
                string2 = bundle4.getString(str6, null);
                if (string2 == null) {
                    string2 = bundle4.getString(str7);
                }
            }
            Bundle bundle5 = applicationInfo.metaData;
            if (bundle5 != null && (i2 = bundle5.getInt("io.flutter.network-policy", 0)) > 0) {
                JSONArray jSONArray = new JSONArray();
                try {
                    XmlResourceParser xml = context.getResources().getXml(i2);
                    xml.next();
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2) {
                            if (xml.getName().equals("domain-config")) {
                                Z(xml, jSONArray, false);
                            }
                        }
                    }
                    str3 = jSONArray.toString();
                } catch (IOException | XmlPullParserException unused) {
                }
            }
            String str8 = applicationInfo.nativeLibraryDir;
            Bundle bundle6 = applicationInfo.metaData;
            return new B2.a(string, string2, str3, str8, bundle6 == null ? true : bundle6.getBoolean("io.flutter.automatically-register-plugins", true));
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static InterfaceC1500b Y(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1421a.f11837a);
            String string = obtainAttributes.getString(0);
            String string2 = obtainAttributes.getString(4);
            String string3 = obtainAttributes.getString(5);
            int resourceId = obtainAttributes.getResourceId(1, 0);
            int integer = obtainAttributes.getInteger(2, 1);
            int integer2 = obtainAttributes.getInteger(3, PermissionsViewModel.DELAY_TIME_CALLBACK_CALL);
            String string4 = obtainAttributes.getString(6);
            obtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    m0(xmlResourceParser);
                }
                return new C1503e(new B.d(string, string2, string3, g0(resources, resourceId)), integer, integer2, string4);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1421a.f11838b);
                        int i2 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i3 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i6 = obtainAttributes2.getInt(i3, 0);
                        int i7 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i7, 0);
                        String string6 = obtainAttributes2.getString(i7);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            m0(xmlResourceParser);
                        }
                        arrayList.add(new C1502d(i2, i6, resourceId2, string6, string5, z));
                    } else {
                        m0(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new C1501c((C1502d[]) arrayList.toArray(new C1502d[0]));
            }
        } else {
            m0(xmlResourceParser);
        }
        return null;
    }

    public static void Z(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    boolean attributeBooleanValue2 = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 4) {
                        throw new IllegalStateException("Expected text");
                    }
                    String trim = xmlResourceParser.getText().trim();
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(trim);
                    jSONArray2.put(attributeBooleanValue2);
                    jSONArray2.put(attributeBooleanValue);
                    jSONArray.put(jSONArray2);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 3) {
                        throw new IllegalStateException("Expected end of domain tag");
                    }
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    Z(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    String name = xmlResourceParser.getName();
                    int eventType = xmlResourceParser.getEventType();
                    while (true) {
                        if (eventType != 3 || xmlResourceParser.getName() != name) {
                            eventType = xmlResourceParser.next();
                        }
                    }
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    public static String a0(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        j5.i iVar = j5.i.f10496d;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        kotlin.jvm.internal.i.d(encoded, "getEncoded(...)");
        int i2 = 0;
        j5.i l2 = j.l(encoded, 0, -1234567890);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(l2.f10497a, 0, l2.a());
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.i.b(digest);
        new j5.i(digest);
        byte[] map = j5.a.f10479a;
        kotlin.jvm.internal.i.e(map, "map");
        byte[] bArr = new byte[((digest.length + 2) / 3) * 4];
        int length = digest.length - (digest.length % 3);
        int i3 = 0;
        while (i2 < length) {
            byte b6 = digest[i2];
            int i6 = i2 + 2;
            byte b7 = digest[i2 + 1];
            i2 += 3;
            byte b8 = digest[i6];
            bArr[i3] = map[(b6 & 255) >> 2];
            bArr[i3 + 1] = map[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            int i7 = i3 + 3;
            bArr[i3 + 2] = map[((b7 & 15) << 2) | ((b8 & 255) >> 6)];
            i3 += 4;
            bArr[i7] = map[b8 & 63];
        }
        int length2 = digest.length - length;
        if (length2 == 1) {
            byte b9 = digest[i2];
            bArr[i3] = map[(b9 & 255) >> 2];
            bArr[1 + i3] = map[(b9 & 3) << 4];
            bArr[2 + i3] = 61;
            bArr[i3 + 3] = 61;
        } else if (length2 == 2) {
            int i8 = i2 + 1;
            byte b10 = digest[i2];
            byte b11 = digest[i8];
            bArr[i3] = map[(b10 & 255) >> 2];
            bArr[1 + i3] = map[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            bArr[i3 + 2] = map[(b11 & 15) << 2];
            bArr[i3 + 3] = 61;
        }
        sb.append(new String(bArr, B4.a.f287a));
        return sb.toString();
    }

    public static boolean f0(Parcel parcel, int i2) {
        y0(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static List g0(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (AbstractC1499a.a(obtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static IBinder h0(Parcel parcel, int i2) {
        int k02 = k0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (k02 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + k02);
        return readStrongBinder;
    }

    public static int i0(Parcel parcel, int i2) {
        y0(parcel, i2, 4);
        return parcel.readInt();
    }

    public static long j0(Parcel parcel, int i2) {
        y0(parcel, i2, 8);
        return parcel.readLong();
    }

    public static int k0(Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static final void l0(int i2, int i3, Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    public static void m0(XmlResourceParser xmlResourceParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static void n0(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + k0(parcel, i2));
    }

    public static String o0(Throwable th) {
        kotlin.jvm.internal.i.e(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.i.d(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void p0(InterfaceC1445p interfaceC1445p, AbstractC0001a abstractC0001a, AbstractC0001a abstractC0001a2) {
        try {
            I4.a.i(B0.f.F(((AbstractC1293a) interfaceC1445p).create(abstractC0001a, abstractC0001a2)), v.f5689a, null);
        } catch (Throwable th) {
            abstractC0001a2.resumeWith(e5.g.l(th));
            throw th;
        }
    }

    public static C1572a q0(C1574c c1574c, int i2) {
        kotlin.jvm.internal.i.e(c1574c, "<this>");
        boolean z = i2 > 0;
        Integer valueOf = Integer.valueOf(i2);
        if (z) {
            if (c1574c.f12441c <= 0) {
                i2 = -i2;
            }
            return new C1572a(c1574c.f12439a, c1574c.f12440b, i2);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final String r0(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        Pattern compile = Pattern.compile("(.)(\\p{Upper})");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("$1_$2");
        kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
        Pattern compile2 = Pattern.compile("(.) (.)");
        kotlin.jvm.internal.i.d(compile2, "compile(...)");
        String replaceAll2 = compile2.matcher(replaceAll).replaceAll("$1_$2");
        kotlin.jvm.internal.i.d(replaceAll2, "replaceAll(...)");
        String upperCase = replaceAll2.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    public static C1574c s0(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new C1574c(i2, i3 - 1, 1);
        }
        C1574c c1574c = C1574c.f12446d;
        return C1574c.f12446d;
    }

    public static int t0(Parcel parcel) {
        int readInt = parcel.readInt();
        int k02 = k0(parcel, readInt);
        char c2 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new C1.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i2 = k02 + dataPosition;
        if (i2 < dataPosition || i2 > parcel.dataSize()) {
            throw new C1.b(o.h("Size read is invalid start=", dataPosition, i2, " end="), parcel);
        }
        return i2;
    }

    public static int u0(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int v0(long j2) {
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (((-16384) & j2) == 0) {
            return 2;
        }
        if (((-2097152) & j2) == 0) {
            return 3;
        }
        if (((-268435456) & j2) == 0) {
            return 4;
        }
        if (((-34359738368L) & j2) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j2) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j2) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static ArrayList w0(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static F x0(Bundle bundle, String str) {
        C0060j c0060j = O.f779i;
        if (bundle == null) {
            AbstractC0357o0.g("BillingClient", str.concat(" got null owned items list"));
            return new F(54, 3, c0060j);
        }
        int a6 = AbstractC0357o0.a(bundle, "BillingClient");
        String e3 = AbstractC0357o0.e(bundle, "BillingClient");
        C0058h b6 = C0060j.b();
        b6.f854a = a6;
        b6.f855b = e3;
        C0060j a7 = b6.a();
        if (a6 != 0) {
            AbstractC0357o0.g("BillingClient", str + " failed. Response code: " + a6);
            return new F(23, 3, a7);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            AbstractC0357o0.g("BillingClient", "Bundle returned from " + str + " doesn't contain required fields.");
            return new F(55, 3, c0060j);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            AbstractC0357o0.g("BillingClient", "Bundle returned from " + str + " contains null SKUs list.");
            return new F(56, 3, c0060j);
        }
        if (stringArrayList2 == null) {
            AbstractC0357o0.g("BillingClient", "Bundle returned from " + str + " contains null purchases list.");
            return new F(57, 3, c0060j);
        }
        if (stringArrayList3 != null) {
            return new F(1, 3, O.f780j);
        }
        AbstractC0357o0.g("BillingClient", "Bundle returned from " + str + " contains null signatures list.");
        return new F(58, 3, c0060j);
    }

    public static final l5.a y(l lVar) {
        Boolean bool = (Boolean) lVar.a("isSpeakerphoneOn");
        if (bool == null) {
            throw new IllegalStateException("isSpeakerphoneOn is required");
        }
        boolean booleanValue = bool.booleanValue();
        Boolean bool2 = (Boolean) lVar.a("stayAwake");
        if (bool2 == null) {
            throw new IllegalStateException("stayAwake is required");
        }
        boolean booleanValue2 = bool2.booleanValue();
        Integer num = (Integer) lVar.a("contentType");
        if (num == null) {
            throw new IllegalStateException("contentType is required");
        }
        int intValue = num.intValue();
        Integer num2 = (Integer) lVar.a("usageType");
        if (num2 == null) {
            throw new IllegalStateException("usageType is required");
        }
        int intValue2 = num2.intValue();
        Integer num3 = (Integer) lVar.a("audioFocus");
        if (num3 == null) {
            throw new IllegalStateException("audioFocus is required");
        }
        int intValue3 = num3.intValue();
        Integer num4 = (Integer) lVar.a("audioMode");
        if (num4 != null) {
            return new l5.a(booleanValue, booleanValue2, intValue, intValue2, intValue3, num4.intValue());
        }
        throw new IllegalStateException("audioMode is required");
    }

    public static void y0(Parcel parcel, int i2, int i3) {
        int k02 = k0(parcel, i2);
        if (k02 == i3) {
            return;
        }
        String hexString = Integer.toHexString(k02);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(k02);
        sb.append(" (0x");
        throw new C1.b(AbstractC0279e.h(sb, hexString, ")"), parcel);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object z(List list, C0083l c0083l, AbstractC1295c abstractC1295c) {
        C0077f c0077f;
        int i2;
        List list2;
        s sVar;
        Iterator it;
        Throwable th;
        if (abstractC1295c instanceof C0077f) {
            c0077f = (C0077f) abstractC1295c;
            int i3 = c0077f.f1681d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0077f.f1681d = i3 - Integer.MIN_VALUE;
                Object obj = c0077f.f1680c;
                Object obj2 = EnumC1260a.f11058a;
                i2 = c0077f.f1681d;
                if (i2 != 0) {
                    e5.g.y(obj);
                    ArrayList arrayList = new ArrayList();
                    C0079h c0079h = new C0079h(list, arrayList, null);
                    c0077f.f1678a = arrayList;
                    c0077f.f1681d = 1;
                    if (c0083l.a(c0079h, c0077f) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c0077f.f1679b;
                        sVar = (s) c0077f.f1678a;
                        try {
                            e5.g.y(obj);
                        } catch (Throwable th2) {
                            Object obj3 = sVar.f10741a;
                            if (obj3 == null) {
                                sVar.f10741a = th2;
                            } else {
                                C((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            InterfaceC1441l interfaceC1441l = (InterfaceC1441l) it.next();
                            c0077f.f1678a = sVar;
                            c0077f.f1679b = it;
                            c0077f.f1681d = 2;
                            if (interfaceC1441l.invoke(c0077f) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) sVar.f10741a;
                        if (th == null) {
                            return v.f5689a;
                        }
                        throw th;
                    }
                    list2 = (List) c0077f.f1678a;
                    e5.g.y(obj);
                }
                sVar = new s();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) sVar.f10741a;
                if (th == null) {
                }
            }
        }
        c0077f = new C0077f(abstractC1295c);
        Object obj4 = c0077f.f1680c;
        Object obj22 = EnumC1260a.f11058a;
        i2 = c0077f.f1681d;
        if (i2 != 0) {
        }
        sVar = new s();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) sVar.f10741a;
        if (th == null) {
        }
    }

    public abstract boolean E(D0.i iVar, D0.d dVar, D0.d dVar2);

    public abstract boolean F(s.g gVar, C1411c c1411c, C1411c c1411c2);

    public abstract boolean G(D0.i iVar, Object obj, Object obj2);

    public abstract boolean H(s.g gVar, Object obj, Object obj2);

    public abstract boolean I(D0.i iVar, D0.h hVar, D0.h hVar2);

    public abstract boolean J(s.g gVar, s.f fVar, s.f fVar2);

    public Object Q(M4.a deserializer) {
        kotlin.jvm.internal.i.e(deserializer, "deserializer");
        return deserializer.a(this);
    }

    public void R() {
        throw new M4.c(t.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // O4.a
    public O4.b a(L descriptor, int i2) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return n(descriptor.h(i2));
    }

    @Override // O4.a
    public Object b(N4.e descriptor, int i2, M4.a deserializer, Object obj) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        kotlin.jvm.internal.i.e(deserializer, "deserializer");
        return Q(deserializer);
    }

    public abstract void b0(D0.h hVar, D0.h hVar2);

    @Override // O4.b
    public abstract long c();

    public abstract void c0(s.f fVar, s.f fVar2);

    @Override // O4.b
    public boolean d() {
        R();
        throw null;
    }

    public abstract void d0(D0.h hVar, Thread thread);

    @Override // O4.b
    public boolean e() {
        return true;
    }

    public abstract void e0(s.f fVar, Thread thread);

    @Override // O4.a
    public double f(L descriptor, int i2) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return x();
    }

    @Override // O4.b
    public char h() {
        R();
        throw null;
    }

    @Override // O4.a
    public int i(L descriptor, int i2) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return q();
    }

    @Override // O4.a
    public byte j(L descriptor, int i2) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return s();
    }

    @Override // O4.a
    public boolean k(L descriptor, int i2) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return d();
    }

    @Override // O4.a
    public void l(N4.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
    }

    @Override // O4.a
    public char m(L descriptor, int i2) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return h();
    }

    @Override // O4.b
    public O4.b n(N4.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return this;
    }

    @Override // O4.b
    public O4.a o(N4.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return this;
    }

    @Override // O4.a
    public long p(L descriptor, int i2) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return c();
    }

    @Override // O4.b
    public abstract int q();

    @Override // O4.a
    public short r(L descriptor, int i2) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return t();
    }

    @Override // O4.b
    public abstract byte s();

    @Override // O4.b
    public abstract short t();

    @Override // O4.b
    public String u() {
        R();
        throw null;
    }

    @Override // O4.b
    public float v() {
        R();
        throw null;
    }

    @Override // O4.a
    public float w(L descriptor, int i2) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return v();
    }

    @Override // O4.b
    public double x() {
        R();
        throw null;
    }
}
