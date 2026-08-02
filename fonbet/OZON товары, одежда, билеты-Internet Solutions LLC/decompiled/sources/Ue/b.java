package Ue;

import V.e;
import android.content.Context;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;

/* loaded from: classes.dex */
public final class b implements org.joda.time.tz.c {

    /* renamed from: a, reason: collision with root package name */
    private Context f27625a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f27626b;

    public b(Context context) throws IOException {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        }
        this.f27625a = context.getApplicationContext();
        InputStream d11 = d("ZoneInfoMap");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(d11);
        try {
            e(dataInputStream, concurrentHashMap);
            concurrentHashMap.put("UTC", new SoftReference(DateTimeZone.f78989a));
            this.f27626b = concurrentHashMap;
        } finally {
            try {
                dataInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x002a: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:28:0x002a */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private DateTimeZone c(String str) {
        InputStream inputStream;
        InputStream inputStream2;
        ConcurrentHashMap concurrentHashMap = this.f27626b;
        InputStream inputStream3 = null;
        try {
            try {
                inputStream = d(str);
                try {
                    DateTimeZone a11 = inputStream instanceof DataInput ? DateTimeZoneBuilder.a((DataInput) inputStream, str) : DateTimeZoneBuilder.a(new DataInputStream(inputStream), str);
                    concurrentHashMap.put(str, new SoftReference(a11));
                    if (inputStream != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    return a11;
                } catch (IOException e11) {
                    e = e11;
                    e.printStackTrace();
                    concurrentHashMap.remove(str);
                    if (inputStream != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream3 = inputStream2;
                if (inputStream3 != null) {
                    try {
                        inputStream3.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            inputStream = 0;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream3 != null) {
            }
            throw th;
        }
    }

    private InputStream d(String str) throws IOException {
        Context context = this.f27625a;
        if (context == null) {
            throw new RuntimeException("Need to call JodaTimeAndroid.init() before using joda-time-android");
        }
        int i11 = a.f27624b;
        StringBuilder sb2 = new StringBuilder("joda_");
        File file = new File(str);
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(file.getName());
            file = file.getParentFile();
        } while (file != null);
        StringBuffer stringBuffer = new StringBuffer();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append("_");
            }
            stringBuffer.append((String) arrayList.get(size));
        }
        sb2.append(stringBuffer.toString().replace('-', '_').replace("+", "plus").toLowerCase(Locale.US));
        String sb3 = sb2.toString();
        int a11 = a.a(sb3);
        if (a11 != 0) {
            return context.getResources().openRawResource(a11);
        }
        throw new IOException(e.a("Resource not found: \"", str, "\" (resName: \"", sb3, "\")"));
    }

    private static void e(DataInputStream dataInputStream, ConcurrentHashMap concurrentHashMap) throws IOException {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        String[] strArr = new String[readUnsignedShort];
        for (int i11 = 0; i11 < readUnsignedShort; i11++) {
            strArr[i11] = dataInputStream.readUTF().intern();
        }
        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
        for (int i12 = 0; i12 < readUnsignedShort2; i12++) {
            try {
                concurrentHashMap.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Corrupt zone info map");
            }
        }
    }

    @Override // org.joda.time.tz.c
    public final DateTimeZone a(String str) {
        Object obj = this.f27626b.get(str);
        if (obj == null) {
            return null;
        }
        if (str.equals(obj)) {
            return c(str);
        }
        if (!(obj instanceof SoftReference)) {
            return a((String) obj);
        }
        DateTimeZone dateTimeZone = (DateTimeZone) ((SoftReference) obj).get();
        return dateTimeZone != null ? dateTimeZone : c(str);
    }

    @Override // org.joda.time.tz.c
    public final Set<String> b() {
        return new TreeSet(this.f27626b.keySet());
    }
}
