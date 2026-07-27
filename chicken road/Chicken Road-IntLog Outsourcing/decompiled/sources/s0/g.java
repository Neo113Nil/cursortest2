package s0;

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

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final String f11776b = s.f("Data");

    /* renamed from: c, reason: collision with root package name */
    public static final g f11777c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11778a;

    static {
        g gVar = new g(new HashMap());
        c(gVar);
        f11777c = gVar;
    }

    public g(g gVar) {
        this.f11778a = new HashMap(gVar.f11778a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0040 -> B:16:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g a(byte[] bArr) {
        ObjectInputStream objectInputStream;
        Throwable e3;
        String str = f11776b;
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
            } catch (IOException e6) {
                Log.e(str, "Error in Data#fromByteArray: ", e6);
            }
            try {
                for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                    hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                }
                try {
                    objectInputStream.close();
                } catch (IOException e7) {
                    Log.e(str, "Error in Data#fromByteArray: ", e7);
                }
                byteArrayInputStream.close();
            } catch (IOException e8) {
                e3 = e8;
                Log.e(str, "Error in Data#fromByteArray: ", e3);
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e9) {
                        Log.e(str, "Error in Data#fromByteArray: ", e9);
                    }
                }
                byteArrayInputStream.close();
                return new g(hashMap);
            } catch (ClassNotFoundException e10) {
                e3 = e10;
                Log.e(str, "Error in Data#fromByteArray: ", e3);
                if (objectInputStream != null) {
                }
                byteArrayInputStream.close();
                return new g(hashMap);
            }
        } catch (IOException e11) {
            e = e11;
            Throwable th2 = e;
            objectInputStream = null;
            e3 = th2;
            Log.e(str, "Error in Data#fromByteArray: ", e3);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new g(hashMap);
        } catch (ClassNotFoundException e12) {
            e = e12;
            Throwable th22 = e;
            objectInputStream = null;
            e3 = th22;
            Log.e(str, "Error in Data#fromByteArray: ", e3);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new g(hashMap);
        } catch (Throwable th3) {
            th = th3;
            if (0 != 0) {
                try {
                    objectInputStream2.close();
                } catch (IOException e13) {
                    Log.e(str, "Error in Data#fromByteArray: ", e13);
                }
            }
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (IOException e14) {
                Log.e(str, "Error in Data#fromByteArray: ", e14);
                throw th;
            }
        }
        return new g(hashMap);
    }

    public static byte[] c(g gVar) {
        ObjectOutputStream objectOutputStream;
        String str = f11776b;
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
            objectOutputStream.writeInt(gVar.f11778a.size());
            for (Map.Entry entry : gVar.f11778a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e6) {
                Log.e(str, "Error in Data#toByteArray: ", e6);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e7) {
                Log.e(str, "Error in Data#toByteArray: ", e7);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e8) {
            e = e8;
            objectOutputStream2 = objectOutputStream;
            Log.e(str, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e9) {
                    Log.e(str, "Error in Data#toByteArray: ", e9);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e10) {
                Log.e(str, "Error in Data#toByteArray: ", e10);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e11) {
                    Log.e(str, "Error in Data#toByteArray: ", e11);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e12) {
                Log.e(str, "Error in Data#toByteArray: ", e12);
                throw th;
            }
        }
    }

    public final String b(String str) {
        Object obj = this.f11778a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        HashMap hashMap = this.f11778a;
        Set<String> keySet = hashMap.keySet();
        HashMap hashMap2 = ((g) obj).f11778a;
        if (!keySet.equals(hashMap2.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = hashMap.get(str);
            Object obj3 = hashMap2.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f11778a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap hashMap = this.f11778a;
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

    public g(HashMap hashMap) {
        this.f11778a = new HashMap(hashMap);
    }
}
