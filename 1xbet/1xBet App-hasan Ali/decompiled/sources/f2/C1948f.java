package f2;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: f2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1948f {

    /* renamed from: b, reason: collision with root package name */
    public static final String f16992b = m.f("Data");

    /* renamed from: c, reason: collision with root package name */
    public static final C1948f f16993c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f16994a;

    static {
        C1948f c1948f = new C1948f(new HashMap());
        c(c1948f);
        f16993c = c1948f;
    }

    public C1948f(C1948f c1948f) {
        this.f16994a = new HashMap(c1948f.f16994a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0040 -> B:16:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1948f a(byte[] bArr) {
        ObjectInputStream objectInputStream;
        Throwable e3;
        String str = f16992b;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap hashMap = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e5) {
                Log.e(str, "Error in Data#fromByteArray: ", e5);
            }
            try {
                for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                    hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                }
                try {
                    objectInputStream.close();
                } catch (IOException e6) {
                    Log.e(str, "Error in Data#fromByteArray: ", e6);
                }
                byteArrayInputStream.close();
            } catch (IOException e7) {
                e3 = e7;
                Log.e(str, "Error in Data#fromByteArray: ", e3);
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e8) {
                        Log.e(str, "Error in Data#fromByteArray: ", e8);
                    }
                }
                byteArrayInputStream.close();
                return new C1948f(hashMap);
            } catch (ClassNotFoundException e9) {
                e3 = e9;
                Log.e(str, "Error in Data#fromByteArray: ", e3);
                if (objectInputStream != null) {
                }
                byteArrayInputStream.close();
                return new C1948f(hashMap);
            }
        } catch (IOException e10) {
            e = e10;
            Throwable th2 = e;
            objectInputStream = null;
            e3 = th2;
            Log.e(str, "Error in Data#fromByteArray: ", e3);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new C1948f(hashMap);
        } catch (ClassNotFoundException e11) {
            e = e11;
            Throwable th22 = e;
            objectInputStream = null;
            e3 = th22;
            Log.e(str, "Error in Data#fromByteArray: ", e3);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new C1948f(hashMap);
        } catch (Throwable th3) {
            th = th3;
            if (0 != 0) {
                try {
                    objectInputStream2.close();
                } catch (IOException e12) {
                    Log.e(str, "Error in Data#fromByteArray: ", e12);
                }
            }
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (IOException e13) {
                Log.e(str, "Error in Data#fromByteArray: ", e13);
                throw th;
            }
        }
        return new C1948f(hashMap);
    }

    public static byte[] c(C1948f c1948f) {
        ObjectOutputStream objectOutputStream;
        String str = f16992b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e3) {
            e = e3;
        }
        try {
            objectOutputStream.writeInt(c1948f.f16994a.size());
            for (Map.Entry entry : c1948f.f16994a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e5) {
                Log.e(str, "Error in Data#toByteArray: ", e5);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e6) {
                Log.e(str, "Error in Data#toByteArray: ", e6);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e7) {
            e = e7;
            objectOutputStream2 = objectOutputStream;
            Log.e(str, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e8) {
                    Log.e(str, "Error in Data#toByteArray: ", e8);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e9) {
                Log.e(str, "Error in Data#toByteArray: ", e9);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e10) {
                    Log.e(str, "Error in Data#toByteArray: ", e10);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e11) {
                Log.e(str, "Error in Data#toByteArray: ", e11);
                throw th;
            }
        }
    }

    public final String b(String str) {
        Object obj = this.f16994a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C1948f.class == obj.getClass()) {
                HashMap hashMap = this.f16994a;
                Set<String> keySet = hashMap.keySet();
                HashMap hashMap2 = ((C1948f) obj).f16994a;
                if (keySet.equals(hashMap2.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap.get(str);
                        Object obj3 = hashMap2.get(str);
                        if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16994a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap hashMap = this.f16994a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = hashMap.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public C1948f(HashMap hashMap) {
        this.f16994a = new HashMap(hashMap);
    }
}
